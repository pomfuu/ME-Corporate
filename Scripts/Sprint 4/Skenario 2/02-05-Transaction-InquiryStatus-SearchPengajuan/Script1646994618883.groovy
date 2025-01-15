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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
String userDir = RunConfiguration.getProjectDir()

'close inquiry status'
WebUI.click(findTestObject('Inquiry_Status/a_Close'))

'Variable ID Mobile pengajuan 1'
String id1 = GlobalVariable.Search1

'Variable ID Mobile pengajuan 2'
String id2 = GlobalVariable.Search2

'cetak variable id1 (value id mobile pengajuan 1)'
println(id1)

'cetak variable id2 (value id mobile pengajuan 2)'
println(id2)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click menu Inquiry status aplikasi'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Inquiry Status Aplikasi'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-2-menu-inquiry-status.png')

KeywordUtil.markPassed('scenario 2 - menu inquiry status')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 1'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id1)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'))

'Melakukan delay 10 detik'
WebUI.delay(10)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-2-input-search-inquiry-status-data-pengajuan-1.png')

KeywordUtil.markPassed('scenario 2 - input search inquiry status data pengajuan 1')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 2'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id2)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-2-input-search-inquiry-status-data-pengajuan-2.png')

KeywordUtil.markPassed('scenario 2 - input search inquiry status data pengajuan 2')

'Melakukan delay 10 detik'
WebUI.delay(10)

