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

'Melakukan delay 1 detik'
WebUI.delay(1)

//-----------------Menu Collateral and Loan------------------------

'Menekan menu Colleretan and Loan'
WebUI.click(findTestObject('ME_AppPending/span_Collateral dan Loan'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-masuk-menu-collateral-dan-loan.png')

KeywordUtil.markPassed('scenario 4 - Masuk menu collateral dan loan')

'Melakukan delay 1 detik'
WebUI.delay(1)

//-------------------information----------------

'Menekan tombol information'
WebUI.click(findTestObject('ME_CollateralandLoan_information/li_Information'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input jenis pengajuan'
WebUI.click(findTestObject('ME_CollateralandLoan_information/input_jenispengajuan1'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input jenis pengajuan'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_jenispengajuan1'), information_jenisPengajuan , FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-jenis-pengajuan.png')

KeywordUtil.markPassed('scenario 4 - Input Jenis Pengajuan')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih jenus pengajuan'
WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Mobil Bekas'))

'Melakukan delay 1 detik'
WebUI.delay(1)

//WebUI.click(findTestObject('ME_CollateralandLoan_information/input_tujuankredit1'), FailureHandling.OPTIONAL)
//
//WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_tujuankredit1'), 'Lainnya')
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Lainnya'))
//
//WebUI.delay(1)
//
//WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Silahkan isi dengan tujuan kredit Anda_text-input'), 'contoh1')
//
//WebUI.delay(1)

'Melakukan click form input tujuan kredit'
WebUI.click(findTestObject('ME_CollateralandLoan_information/input_tujuankredit'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input tujuan kredit'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_tujuankredit'), information_tujuanKredit , FailureHandling.OPTIONAL )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-tujuan-pengajuan.png')

KeywordUtil.markPassed('scenario 4 - Input Tujuan Pengajuan')

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Pembelian Aset'))

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Payment'))

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('ME_CollateralandLoan_information/input_autodebet'))

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-payment.png')

KeywordUtil.markPassed('scenario 4 - Input Payment')

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Auto Debet'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input account no.'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_text-input-account-no'), information_accountNum )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan checklist autodebet no. rekening'
WebUI.click(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_inline-checkbox-autodebetNoRek'), 
    FailureHandling.OPTIONAL)

//if (isChecked == true) {
//    WebUI.verifyElementPresent(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_noRekening'), 
//        0)
//} else {
//    WebUI.click(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_inline-checkbox-autodebetNoRek'))
//
//    WebUI.delay(1)
//

'Menekan tombol capture rekening auto debet'
WebUI.click(findTestObject('ME_CollateralandLoan_information/Capture_rekeningautodebet'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan upload file rekening auto debet'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_npwp)

//
//    WebUI.delay(1)
//}

'Melakukan input account no.'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_noRekening'), information_accountNum2 )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input cabang BCA'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Cabang BCA_cabangBca'), information_cabang )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakuakan input nama pemilik rekening'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Nama Pemilik Rekening_form-control ng-untouched ng-pristine ng-invalid'), 
    information_namaPemilikRek )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input no. KTP'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_No KTP_form-control ng-untouched ng-pristine ng-invalid'), 
    information_noKTP)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-data-autodebit.png')

KeywordUtil.markPassed('scenario 4 - Input data autodebit')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol mutasi rekening'
WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Mutasi Rekening'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-masuk-submenu-input-mutasi-rekening.png')

KeywordUtil.markPassed('scenario 4 - Masuk submenu input mutasi rekening')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan add mutasi rekening'
WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Add Mutasi Rekening'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-sebelum-input-data-mutasi-rekening.png')

KeywordUtil.markPassed('scenario 4 - sebelum input data mutasi rekening')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol capture mutasi rekening'
WebUI.click(findTestObject('ME_CollateralandLoan_information/a_Capture File_mutasirek'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan upload file mutasi rekening'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_npwp)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input mutasi debit'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Mutasi Debit_form-control text-right ng-untouched ng-pristine ng-valid'), 
    information_mutasiDebit )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan inptu mutasi kredit'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Mutasi Kredit_form-control text-right ng-untouched ng-pristine ng-valid'), 
    information_mutasiKredit )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input mutasi saldo'
WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Mutasi Saldo_form-control text-right ng-untouched ng-pristine ng-valid'), 
    information_mutasiSaldo )

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-input-data-mutasi-rekening.png')

KeywordUtil.markPassed('scenario 4 - input data mutasi rekening')

'Melakukan delay 1 detik'
WebUI.delay(1)

'melakukan add data mutas rekening'
WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Add'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol edit'
WebUI.click(findTestObject('ME_CollateralandLoan_information/button_View Detail_btn btn-edit ng-star-inserted'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol save'
WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Save'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melihat detail mutasi rekening'
WebUI.click(findTestObject('ME_CollateralandLoan_information/a_View Detail_mutasirekening'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-4-berhasil-mengisi-data-information.png')

KeywordUtil.markPassed('scenario 4 - Berhasil mengisi data information')

'Melakukan delay 1 detik'
WebUI.delay(1)

