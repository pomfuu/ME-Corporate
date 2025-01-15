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
import java.util.Calendar

//WebUI.callTestCase(findTestCase('Test Cases/me corp - aline/Login'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/me corp - aline/Transaction/AplikasiBaru'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/me corp - aline/Transaction/Corporate(DataEntry)'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/me corp - aline/Transaction/MatchingPenyimpangan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/me corp - aline/Transaction/CollateralLoan-Information'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/me corp - aline/Transaction/CollateralLoan-Vehicle'), null, FailureHandling.STOP_ON_FAILURE)




