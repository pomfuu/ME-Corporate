import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Robot

import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import changeNPWP.NPWPGenerator
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Robot robot = new Robot()
String userDir = RunConfiguration.getProjectDir()
def driver = DriverFactory.getWebDriver()

/*
 *  Initializing a robot object, getting the project directory path, and getting the WebDriver instance.
 *
 *  1. Creating a new Robot object.
 *  2. Getting the project directory path using RunConfiguration.
 *  3. Getting the WebDriver instance using DriverFactory.
 */

// What is Robot used for ? 
/*
 *  Robot is used for simulating user interactions with the web application.
 */

String baseDir = System.getProperty('user.dir')

// change this into switch case, the else is case 'korporasi'
if(aplikasiBaru_tipeKonsumen == 'Perorangan') {
	WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@value='radio-perorangan']"]))
} else WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@value='radio-korporasi']"]))
	
/*
 *  Convert if-else statement into switch case
 *
 *  @param aplikasiBaru_tipeKonsumen The type of consumer for the new application
 */
switch (aplikasiBaru_tipeKonsumen) {
    case 'Perorangan':
        WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@value='radio-perorangan']"]))
        break;
    default:
        WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@value='radio-korporasi']"]))
}

	
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//ng-select[@formcontrolname='businessType']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//*[text()='${aplikasiBaru_badanUsaha}']"]))

String npwpPath = "${userDir}${GlobalVariable.pathfinder_npwp}".replace("/", "\\")
String siupPath = "${userDir}${GlobalVariable.pathfinder_siup}".replace("/", "\\")
String tdpPath = "${userDir}${GlobalVariable.pathfinder_tdp}".replace("/", "\\")

def uploadFile = [
	[path : npwpPath],
	[path : siupPath],
	[path : tdpPath]
]

uploadFile.each { key ->
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='button-capture-inner']//div[1]/button[text()='Capture']"]))
	CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), key.path)
}

WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='npwpNo']"]), 0)

WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='npwpNo']"]), aplikasiBaru_npwp);
WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='name']"]), aplikasiBaru_nama)

try {
	if (aplikasiBaru_isPerubahanData == 'ya') {
		WebUI.verifyElementPresent(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Ada Perubahan Data?']/following-sibling::div[1]"]), 5, FailureHandling.OPTIONAL)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Ada Perubahan Data?']/following-sibling::div[1]"]))
	} else {
		WebUI.verifyElementPresent(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Ada Perubahan Data?']/following-sibling::div[2]"]), 5, FailureHandling.OPTIONAL)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Ada Perubahan Data?']/following-sibling::div[2]"]))
	}
} catch (Exception e) {
	// Exception handling code
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()=' Proses ']"]))
WebUI.delay(1)

// make looping just until the available tab length rather than < 5
for(int i = 1; i < 5; i++) {
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ul[@role='tablist']/li[${i}]"]))
}

// Click on tabs until the available tab length
int tabCount = WebUI.findWebElement(findTestObject('Object Repository/xpath_dynamic'),1).size()

for(int i = 1; i <= tabCount; i++) {
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ul[@role='tablist']/li[${i}]"]))
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='tab-content']/div[4]//*[text()='OK']"]))

// if the element in the if is not present then it took so long to go to else step
// can you make it more faster to check by using other algorithm ?
if(WebUI.verifyElementPresent(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@type='checkbox']"]), 1, FailureHandling.OPTIONAL)) {
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@type='checkbox']"]), FailureHandling.OPTIONAL)
 } else {
	 
 }
/*
 *  Check if the element is present and click on it if found
 *
 *  @param xpathValue The xpath value of the element to be checked and clicked
 */
if(WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@type='checkbox']"]), 1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@type='checkbox']"]), FailureHandling.OPTIONAL)
} else {

}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Ya']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index + '/' +'skenario-bikin-aplikasi-baru') + '.png', FailureHandling.STOP_ON_FAILURE)