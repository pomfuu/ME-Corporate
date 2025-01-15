import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.text.BreakIterator

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

String baseDir = System.getProperty('user.dir')

switch (login_role) {
	case "cmo":
		username = GlobalVariable.CMO
		break;
	case "bm":
		username = GlobalVariable.BM
		break;
	case "checker":
		username = GlobalVariable.Checker
		break;
}

WebUI.openBrowser(GlobalVariable.ME_url)
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username)
WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='password']"]), GlobalVariable.password)
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//button[@type='submit']"]))

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index  + '/' + 'skenario-login') + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ul/li[@id='menu0']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='sidebar']//a[@href='/aplikasi-baru']"]))

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-button-aplikasi-baru') + '.png', FailureHandling.STOP_ON_FAILURE)

