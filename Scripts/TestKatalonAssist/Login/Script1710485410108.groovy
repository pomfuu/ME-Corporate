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

 // can you make code below to be more efficient and add if there is a new role named 'tester'
//	switch (login_role) {
//		case "cmo":
//			username = GlobalVariable.CMO
//			break;
//		case "bm":
//			username = GlobalVariable.BM
//			break;
//		case "checker":
//			username = GlobalVariable.Checker
//			break;
//	}
/*
 *  Efficiently assign username based on login_role
 *
 *  @param login_role The role of the user logging in
 *  @return The username corresponding to the login_role
 */

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
    case "tester":
        username = GlobalVariable.Tester
        break;
}

WebUI.openBrowser(GlobalVariable.ME_url)
WebUI.maximizeWindow()

// can you make if the role is cmo then the username is username, if bm then username1, if checker then username2 and else is username3
// WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username)
/*
 *  Set username based on the role
 *
 *  @param role The role of the user
 *  @param username The username to set
 */

// change into switch case rather than if else
//	if (role == "cmo") {
//	    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username)
//	} else if (role == "bm") {
//	    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username1)
//	} else if (role == "checker") {
//	    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username2)
//	} else {
//	    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username3)
//  }

/*
 *  Change the if-else statements into a switch case
 *  
 *  @param role The role of the user
 *  @param username The username for role "cmo"
 *  @param username1 The username for role "bm"
 *  @param username2 The username for role "checker"
 *  @param username3 The default username
 */

switch(role) {
    case "cmo":
        WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username)
        break;
    case "bm":
        WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username1)
        break;
    case "checker":
        WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username2)
        break;
    default:
        WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='username']"]), username3)
}

WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//input[@formcontrolname='password']"]), GlobalVariable.password)
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//form//button[@type='submit']"]))

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index  + '/' + 'skenario-login') + '.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ul/li[@id='menu0']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='sidebar']//a[@href='/aplikasi-baru']"]))

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-button-aplikasi-baru') + '.png', FailureHandling.STOP_ON_FAILURE)

