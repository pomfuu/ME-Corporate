import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Random path
String userDir = RunConfiguration.getProjectDir()
String filePath = "${userDir}${GlobalVariable.pathfinder_npwp}".replace("/", "\\")
String ktpPath = "${userDir}${GlobalVariable.cobaKTP}".replace("/", "\\")
String baseDir = System.getProperty('user.dir')

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div//following-sibling::span[text()='Matching Result']"]))

// --- RO
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='Pengurus']"]))
WebUI.delay(1)
if (WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='pengurus-matching-0']"]), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='pengurus-matching-0']"]))
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='tab-Pengurus']//*[@id='app-0']"]))
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Detail Pengurus']//following-sibling::button[@class='close']"]))
} else {
    println("Tidak ada Matching Pengurus")
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='Pemegang Saham']"]))
WebUI.delay(1)
if (WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='pemegang-saham-matching-0']"]), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='pemegang-saham-matching-0']"]))
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='tab-Pemegang']//*[@id='app-0']"]))
    WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Detail Pemegang Saham']//following-sibling::button[@class='close']"]))
} else {
    println("Tidak ada Matching Pemegang Saham")
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='Watchlist']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='Watchlist Kendaraan']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='Plafond']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='Engine Scoring']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//bcaf-matching-result//*[text()='BO']"]))

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-halaman-matching') + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div//following-sibling::span[text()='Penyimpangan']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-halaman-penyimpangan') + '.png', FailureHandling.STOP_ON_FAILURE)

// Save to Draft
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='button-save-draft']"]))

//WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Proceed']"]))
