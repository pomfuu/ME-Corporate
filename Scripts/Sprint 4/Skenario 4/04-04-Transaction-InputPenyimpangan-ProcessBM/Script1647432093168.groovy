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

'Melakukan scroll'
WebUI.scrollToPosition(0, 0)

'Memilih menu penyimpangan'
WebUI.click(findTestObject('Object Repository/Penyimpangan/span_Penyimpangan'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-masuk-menu-penyimpangan.png')

KeywordUtil.markPassed('scenario 4 - Masuk menu penyimpangan')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search keyword'
WebUI.setText(findTestObject('Object Repository/Penyimpangan/input_keyword'), processBM_keyword, FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-penyimpangan.png')

KeywordUtil.markPassed('scenario 4 - Input penyimpangan')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih keyword'
WebUI.click(findTestObject('Object Repository/Penyimpangan/span_BM 1'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('Object Repository/Penyimpangan/textarea_Catatan_note'), 0, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input catatan'
WebUI.setText(findTestObject('Object Repository/Penyimpangan/textarea_Catatan_note'), processBM_catatanNote, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-penyimpangan-selesai.png')

KeywordUtil.markPassed('scenario 4 - Input penyimpangan selesai')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click proses'
WebUI.click(findTestObject('Object Repository/Penyimpangan/span_Proceed'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-berhasil-proceed.png')

KeywordUtil.markPassed('scenario 4 - berhasil proceed')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Variable get value mobile id pengajuan 4'
String getSearch4 = WebUI.getText(findTestObject('Object Repository/Penyimpangan/SetSearch'))

'cetak value getsearch4 ( id pengajuan 4 )'
println(getSearch4)

'kirim ke global variable search4'
GlobalVariable.Search4 = getSearch4

