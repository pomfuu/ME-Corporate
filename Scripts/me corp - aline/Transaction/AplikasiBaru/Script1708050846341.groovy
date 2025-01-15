
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

String baseDir = System.getProperty('user.dir')

if(aplikasiBaru_RO == 'ya') {
	WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@id='isRepeatOrder-yes']"]))
} else WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@id='isRepeatOrder-no']"]))

if(aplikasiBaru_tipeKonsumen == 'Perorangan') {
	WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@value='radio-perorangan']"]))
} else WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@value='radio-korporasi']"]))

	
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//ng-select[@formcontrolname='businessType']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//*[text()='${aplikasiBaru_badanUsaha}']"]))

String npwpPath = "${userDir}${GlobalVariable.pathfinder_npwp}".replace("/", "\\")
String siupPath = "${userDir}${GlobalVariable.pathfinder_siup}".replace("/", "\\")
String tdpPath = "${userDir}${GlobalVariable.pathfinder_tdp}".replace("/", "\\")
String radPath = "${userDir}${GlobalVariable.pathfinder_rad}".replace("/", "\\")

def uploadFile = [
	[path : npwpPath],	
	[path : siupPath],	
	[path : npwpPath]	
]

uploadFile.each { key -> 
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='button-capture-inner']//div[1]/button[text()='Capture']"]))
	CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), key.path)
	WebUI.delay(2)
}

WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='npwpNo']"]), 0)

WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='npwpNo']"]), aplikasiBaru_npwp);
WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='name']"]), aplikasiBaru_nama)

if(aplikasiBaru_RO=='ya') {
	try {
		if (aplikasiBaru_isPerubahanData == 'ya') {
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='adaPerubahan' and @value='0']"]))
			WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//textarea[@id='notePerubahan']"]), "Perubahan Resume RAD")
			if(aplikasiBaru_RAD=='ya') {
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='isRAD' and @value='1']"]))
				
				// RAD UPLOAD
				WebUI.delay(2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[2]"]))
				CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
				WebUI.delay(2)
				
				WebUI.delay(2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[4]"]))
				CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
				WebUI.delay(2)
				
				WebUI.delay(2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[7]"]))
				CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
				WebUI.delay(2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ng-select[@formcontrolname='pengurusRole']"]))
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div/span[text()='Identitas Direktur 1']"]))
				
				WebUI.delay(2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[10]"]))
				CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ng-select[@formcontrolname='pemegangSahamRole']"]))
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div/span[text()='Identitas Pemegang Saham 1']"]))
				
				WebUI.delay(2)
			} else WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='isRAD' and @value='0']"]))
		} else {
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='adaPerubahan' and @value='1']"]))
			if(aplikasiBaru_RAD=='ya') {
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='isRAD' and @value='1']"]))
			}
			else WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='isRAD' and @value='0']"]))
		}
	} catch (Exception e) {
		
	}
} else {
	if(aplikasiBaru_RAD=='ya') {
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@name='isRAD' and @value='1']"]))
		
		// RAD UPLOAD
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[2]"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
		WebUI.delay(2)
		
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[4]"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
		WebUI.delay(2)
		
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[7]"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ng-select[@formcontrolname='pengurusRole']"]))
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div/span[text()='Identitas Direktur 1']"]))
		
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//div[@id='accordionRAD']//button)[10]"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), radPath)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ng-select[@formcontrolname='pemegangSahamRole']"]))
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div/span[text()='Identitas Pemegang Saham 1']"]))
	}
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//button[@type='submit']"]))
WebUI.delay(1)

for(int i = 1; i < 5; i++) {
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ul[@role='tablist']/li[${i}]"]))	
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='tab-content']/div[4]//*[text()='OK']"]))

if(aplikasiBaru_RO=='tidak') {
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@type='checkbox']"]), 1, FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@type='checkbox']"]), FailureHandling.OPTIONAL)
	} else {
		
	}
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Ya']"]))
	
	WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index + '/' +'skenario-bikin-aplikasi-baru') + '.png', FailureHandling.STOP_ON_FAILURE)
} else {
	
}