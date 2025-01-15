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

String userDir = RunConfiguration.getProjectDir()

'Membuka browser chrome'
WebUI.openBrowser('')

def driver = DriverFactory.getWebDriver()

'Melakukan navigasi ke alamat url / akses web aplikasi ME'
WebUI.navigateToUrl(GlobalVariable.ME_url)

'Memaksimalkan aplikasi ME ke ukuran full desktop'
WebUI.maximizeWindow()

'Melakukan delay 5 detik'
WebUI.delay(5)

'Melakukan input user login'
WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_User ID_login'), GlobalVariable.CMO)

'Melakukan input password'
WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_User Password_login'), GlobalVariable.password)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-aplikasi-baru-login.png')

KeywordUtil.markPassed('scenario 4 - Memastikan login berhasil')

'Menekan tombol login'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Login'))

'Melakukan delay 2 detik'
WebUI.delay(2)

'Melakukan verifikasi objek tombol menu transaksi muncul'
WebUI.verifyElementPresent(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Transaksi'), 0)

'Memilih menu transaksi'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Transaksi'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih menu aplikasi baru'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Aplikasi Baru'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-memilih-button-transaksi-dan-aplikasi-baru.png')

KeywordUtil.markPassed('scenario 4 - Memilih button transaksi dan aplikasi baru')

'Memilih radio type perorangan'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_perorangan_radios-apptype'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih radio type korporasi'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_korporasi_radios-apptype'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click input badan usaha'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input-badanusaha'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Input search Badan Usaha'
WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input-badanusaha'), 'Perseroan Terbatas ( PT. , NV. , LTD. )')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-badan-usaha.png')

KeywordUtil.markPassed('scenario 4 - Input badan usaha')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Memilih badan usaha'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/span_Perseroan Terbatas ( PT. , NV. , LTD. )'))

'Melakukan delay 2 detik'
WebUI.delay(2)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-page-sebelum-input-capture.png')

KeywordUtil.markPassed('scenario 4 - Sebelum input capture npwp + SIUP + TDP')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Menekan tombol capture NPWP'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Capture_npwp'))

'Melakukan delay 2 detik'
WebUI.delay(2)

'Melakukan upload file NPWP'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_npwp)

WebUI.waitForElementPresent(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_NPWP'), 0)

'Input data nomer NPWP tidak berlaku'
WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_NPWP No fix'), NPWP_Cancel)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Input data nama NPWP tidak berlaku'
WebUI.setText(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_Name fix'), CN_Cancel)

'Menekan tombol capture SIUP'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Capture_siupfix'))

'Melakukan delay 2 detik'
WebUI.delay(2)

'Melakukan upload file SIUP'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_siup)

'Melakukan delay 2 detik'
WebUI.delay(2)

'Menekan tombol capture TDP'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Capture_TDP'))

'Melakukan delay 2 detik'
WebUI.delay(2)

'Menekan tombol capture TDP'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_tdp)

'Melakukan delay 2 detik'
WebUI.delay(2)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-Capture-npwp-siup-tdp.png')

KeywordUtil.markPassed('scenario 4 - Capture NPWP + SIUP + TDP')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Memilih ada perubahan data ( Tidak )'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_Ada Perubahan Data Tidak'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih ada peruahan data ( Ya )'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/input_Ada Perubahan Data YA'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-Memilih-Radio-Button-Perubahan-Data.png')

KeywordUtil.markPassed('scenario 4 - Memilih Radio Button Perubahan Data')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Menekan tombol proses'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Prosesfix'))

'Melakukan delay 2 detik'
WebUI.delay(2)

'Menunggu menu Matching tampil'
WebUI.waitForElementPresent(findTestObject('MEApp_AppBaru_InisiasiKonsumen/AplikasiBaruMatching'), 300)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-Masuk-aplikasi-matching.png')

KeywordUtil.markPassed('scenario 4 - Masuk aplikasi matching')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Menekan tombol ok'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/a_Ok'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol ya'
WebUI.click(findTestObject('MEApp_AppBaru_InisiasiKonsumen/button_Ya'))

'Melakukan delay 3 detik'
WebUI.delay(3)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-Berhasil-dilakukan-inisiasi-konsumen-baru.png')

KeywordUtil.markPassed('scenario 4 - Berhasil dilakukan inisiasi konsumen baru')

'Melakukan delay 2 detik'
WebUI.delay(2)
