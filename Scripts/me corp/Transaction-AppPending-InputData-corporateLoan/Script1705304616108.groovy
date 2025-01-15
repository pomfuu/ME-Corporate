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

String userDir = RunConfiguration.getProjectDir(),ssDir = userDir + GlobalVariable.sprint2WebScreenshotPath

//-----------------Menu Collateral and Loan------------------------
WebUI.click(findTestObject('ME_AppPending/span_Collateral dan Loan'))

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-masuk-menu-collateral-dan-loan.png')

//-------------------information----------------

WebUI.click(findTestObject('Object Repository/Input_Corporate/dynamic test object',['formcontrolname':'salesNameOffice']))

CustomKeywords.'popup.popup.writeString'(sales_office, true)

WebUI.click(findTestObject('Object Repository/Input_Corporate/dynamic test object',['formcontrolname':'salesAgentName']))

CustomKeywords.'popup.popup.writeString'(sales_agent, true)

String clusterType = cluster == 'A'?'0': cluster == 'B' ? '1' :cluster=='C'?'3':'2'

WebUI.click(findTestObject('Object Repository/Input_Corporate/dynamic test object by id',['id':'inline-radio-cluster-'+clusterType]))

WebUI.setText(findTestObject('Object Repository/Input_Corporate/dynamic test object',['formcontrolname':'sumberAplikasiDs']),sumber_aplikasi_ds)

WebUI.click(findTestObject('ME_CollateralandLoan_information/li_Information'))

WebUI.click(findTestObject('ME_CollateralandLoan_information/input_jenispengajuan1'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_jenispengajuan1'), information_jenisPengajuan , FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-input-jenis-pengajuan.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Mobil Bekas'))


WebUI.click(findTestObject('ME_CollateralandLoan_information/input_tujuankredit'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_tujuankredit'), information_tujuanKredit , FailureHandling.OPTIONAL )

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-input-tujuan-pengajuan.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Pembelian Aset'))

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Payment'))

WebUI.click(findTestObject('ME_CollateralandLoan_information/input_autodebet'))

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-input-payment.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/div_Auto Debet'))

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_text-input-account-no'), information_accountNum )

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

WebUI.click(findTestObject('ME_CollateralandLoan_information/Capture_rekeningautodebet'))

CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), (userDir + GlobalVariable.pathfinder_npwp).replace('/', '\\'))

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Account No. 10 Digit_noRekening'), information_accountNum2 )

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Cabang BCA_cabangBca'), information_cabang )

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Nama Pemilik Rekening_form-control ng-untouched ng-pristine ng-invalid'), 
    information_namaPemilikRek )

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_No KTP_form-control ng-untouched ng-pristine ng-invalid'), 
    information_noKTP)

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-input-data-autodebit.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Mutasi Rekening'))

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-masuk-submenu-input-mutasi-rekening.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Add Mutasi Rekening'))

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-sebelum-input-data-mutasi-rekening.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/a_Capture File_mutasirek'))

CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), (userDir + GlobalVariable.pathfinder_npwp).replace('/', '\\'))

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Mutasi Debit_form-control text-right ng-untouched ng-pristine ng-valid'), 
    information_mutasiDebit )

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Mutasi Kredit_form-control text-right ng-untouched ng-pristine ng-valid'), 
    information_mutasiKredit )

WebUI.setText(findTestObject('ME_CollateralandLoan_information/input_Mutasi Saldo_form-control text-right ng-untouched ng-pristine ng-valid'), 
    information_mutasiSaldo )

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-input-data-mutasi-rekening.png')

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Add'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_View Detail_btn btn-edit ng-star-inserted'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('ME_CollateralandLoan_information/button_Save'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('ME_CollateralandLoan_information/a_View Detail_mutasirekening'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-mengisi-data-information.png')