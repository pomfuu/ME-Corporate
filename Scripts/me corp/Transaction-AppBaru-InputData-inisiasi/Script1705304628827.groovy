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

Robot robot = new Robot()
def driver = DriverFactory.getWebDriver()


String userDir = RunConfiguration.getProjectDir()

String ssDir = userDir + GlobalVariable.sprint2WebScreenshotPath

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Transaksi'))

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Aplikasi Baru'))

WebUI.takeFullPageScreenshotAsCheckpoint(ssDir + matrix + '-memilih-button-transaksi-dan-aplikasi-baru.png')

if(tipeKonsumen == "Perorangan") {
	WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_perorangan_radios-apptype'))
} else {
	WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_korporasi_radios-apptype'))		
}

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input-badanusaha'))

WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input-badanusaha'), badanUsaha)

WebUI.takeFullPageScreenshotAsCheckpoint(ssDir + matrix + '-input-badan-usaha.png')

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Perseroan Terbatas ( PT. , NV. , LTD. )'))

WebUI.takeFullPageScreenshotAsCheckpoint( ssDir + matrix +'-page-sebelum-input-capture.png')

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Capture_npwp'))
String npwpPath = userDir + pathNPWP, siupPath = userDir + pathSIUP, tdpPath = userDir + pathTDP;
npwpPath = npwpPath.replace("/", "\\");siupPath= siupPath.replace("/", "\\"); tdpPath = tdpPath.replace("/", "\\")
CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), npwpPath)


WebUI.waitForElementPresent(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_NPWP'), 0)

String npwpTemp = System.nanoTime().toString()
WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_NPWP No fix'), npwpTemp)

WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_Name fix'), nama)
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Capture_siupfix'))

CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), siupPath)

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Capture_TDP'))

CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), tdpPath)

WebUI.takeFullPageScreenshotAsCheckpoint(ssDir + matrix + '-Capture-npwp-siup-tdp.png')

if(isPerubahanData == "ya") {
	WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_Ada Perubahan Data YA'))
}else {
	WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_Ada Perubahan Data Tidak'))	
}
WebUI.takeFullPageScreenshotAsCheckpoint(ssDir + matrix + '-Memilih-Radio-Button-Perubahan-Data.png')

WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Prosesfix'))

WebUI.waitForElementPresent(findTestObject('MEApp_AppBaru_InisiasiKonsumen/AplikasiBaruMatching'), 300)

WebUI.takeFullPageScreenshotAsCheckpoint(ssDir + matrix + '-Masuk-aplikasi-matching.png')

WebUI.click(findTestObject("Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/a_In Process"))

WebUI.click(findTestObject("Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/a_Blacklist"))

WebUI.click(findTestObject("Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/a_Rejectlist"))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_OK'))



WebUI.click(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Ya'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Berhasil-dilakukan-inisiasi-konsumen-baru.png')

