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

'Variable ID Mobile pengajuan 3'
String id3 = GlobalVariable.Search3

'cetak variable id1 (value id mobile pengajuan 1)'
println(id1)

'cetak variable id1 (value id mobile pengajuan 2)'
println(id2)

'cetak variable id1 (value id mobile pengajuan 3)'
println(id3)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click menu Inquiry status aplikasi'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Inquiry Status Aplikasi'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-inquiry-status.png')

KeywordUtil.markPassed('scenario 3 - menu inquiry status')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 1'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id1, FailureHandling.OPTIONAL)

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-input-search-inquiry-status-data-pengajuan-1.png')

KeywordUtil.markPassed('scenario 3 - input search inquiry status data pengajuan 1')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 2'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id2)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-input-search-inquiry-status-data-pengajuan-2.png')

KeywordUtil.markPassed('scenario 3 - input search inquiry status data pengajuan 2')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 3'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id3, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-input-search-inquiry-status-data-pengajuan-3.png')

KeywordUtil.markPassed('scenario 3 - input search inquiry status data pengajuan 3')

'Melakukan delay 5 detik'
WebUI.delay(5)

//Cek Dokumen Resume Pengajuan 1

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 1'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id1, FailureHandling.OPTIONAL)

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-input-search-inquiry-status-data-pengajuan-1.png')

KeywordUtil.markPassed('scenario 3 - input search inquiry status data pengajuan 1')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click ID Mobile Pengajuan 1'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_list'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click menu resume'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Resume'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu resume internal'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Resume Internal'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-resume-internal-pengajuan-1.png')

KeywordUtil.markPassed('scenario 3 - menu resume internal pengajuan-1')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu Anggaran dasar dan perubahan'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Anggaran Dasar Dan Perubahan'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-anggaran-dasar-dan-perubahan-pengajuan-1.png')

KeywordUtil.markPassed('scenario 3 - menu anggaran dasar dan perubahan pengajuan-1')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu pengurus'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Pengurus'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-pengurus-pengajuan-1.png')

KeywordUtil.markPassed('scenario 3 - menu pengurus pengajuan-1')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu data pendukung'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Data Pendukung'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-data-pendukung-pengajuan-1.png')

KeywordUtil.markPassed('scenario 3 - menu data pendukung pengajuan-1')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_Back'), 60, FailureHandling.OPTIONAL)

'Click back'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_Back'), FailureHandling.OPTIONAL)

//Cek Dokumen Resume Pengajuan 2

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 2'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id2, FailureHandling.OPTIONAL)

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-input-search-inquiry-status-data-pengajuan-2.png')

KeywordUtil.markPassed('scenario 3 - input search inquiry status data pengajuan 2')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click ID Mobile Pengajuan 2'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_list'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click menu resume'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Resume'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu resume internal'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Resume Internal'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-resume-internal-pengajuan-2.png')

KeywordUtil.markPassed('scenario 3 - menu resume internal pengajuan-2')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu anggaran dasar dan perubahan'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Anggaran Dasar Dan Perubahan'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-anggaran-dasar-dan-perubahan-pengajuan-2.png')

KeywordUtil.markPassed('scenario 3 - menu anggaran dasar dan perubahan pengajuan-2')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu pengurus'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Pengurus'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-pengurus-pengajuan-2.png')

KeywordUtil.markPassed('scenario 3 - menu pengurus pengajuan-2')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu data pendukung'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Data Pendukung'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-data-pendukung-pengajuan-2.png')

KeywordUtil.markPassed('scenario 3 - menu data pendukung pengajuan-2')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_Back'), 60, FailureHandling.OPTIONAL)

'Click Back'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_Back'), FailureHandling.OPTIONAL)

//Cek Dokumen Resume Pengajuan 3

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search mobile id pengajuan 3'
WebUI.setText(findTestObject('Object Repository/Inquiry_Status/input_Mobile ID  Application ID_form-control ng-untouched ng-pristine ng-valid'), id3, FailureHandling.OPTIONAL)

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click tombol search'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/span_Search'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-input-search-inquiry-status-data-pengajuan-3.png')

KeywordUtil.markPassed('scenario 3 - input search inquiry status data pengajuan 3')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Click ID Mobile Pengajuan 3'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_list'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click menu resume'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Resume'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu resume internal'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Resume Internal'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-resume-internal-pengajuan-3.png')

KeywordUtil.markPassed('scenario 3 - menu resume internal pengajuan-3')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu Anggaran dasar dan perubahan'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Anggaran Dasar Dan Perubahan'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-anggaran-dasar-dan-perubahan-pengajuan-3.png')

KeywordUtil.markPassed('scenario 3 - menu anggaran dasar dan perubahan pengajuan-3')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu pengurus'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Pengurus'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-pengurus-pengajuan-3.png')

KeywordUtil.markPassed('scenario 3 - menu pengurus pengajuan-3')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Click menu data pendukung'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/button_Data Pendukung'), FailureHandling.OPTIONAL)

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-3-menu-data-pendukung-pengajuan-3.png')

KeywordUtil.markPassed('scenario 3 - menu data pendukung pengajuan-3')

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_Back'), 60, FailureHandling.OPTIONAL)

'Click back'
WebUI.click(findTestObject('Object Repository/Inquiry_Status/Cek_DokumenResume/a_Back'), FailureHandling.OPTIONAL)
