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

//-----------Input Konsumen-----------

WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_SID Name_form-control ng-untouched ng-pristine ng-invalid'), 
    konsumen_SID , FailureHandling.OPTIONAL)




// test
WebUI.scrollToElement(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/i_Fax 2_ri-arrow-right-line'), 60, 
    FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/button_Surat Keterangan Domisili'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-masuk-submenu-surat-keterangan-domisili.png')

KeywordUtil.markPassed('scenario 1 - Masuk submenu surat keterangan domisili')





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/button_Capture_Domisili'), FailureHandling.OPTIONAL)





WebUI.uploadFile(findTestObject('Input_Corporate/Capture_'), userDir + GlobalVariable.cobaKTP, FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-capture-surat-keterangan-domisili-berhasil.png')

KeywordUtil.markPassed('scenario 1 - Capture surat keterangan domisili berhasil')





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/button_FAP'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Masuk-submenu-FAP.png')

KeywordUtil.markPassed('scenario 1 - Masuk submenu FAP')





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/a_Add Capture_FAP'), FailureHandling.OPTIONAL)





WebUI.uploadFile(findTestObject('Input_Corporate/Capture_'), userDir + GlobalVariable.cobaKTP, FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Jenis Usaha_form-control ng-untouched ng-pristine ng-invalid'), 
   konsumen_jenisUsaha , FailureHandling.OPTIONAL)




WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Economy Code_form-control bcaf-autocomplete ng-untouched ng-pristine ng-invalid'),
	
, 
    konsumen_economyCode , FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_010103 Pertanian  Kehutanan-Pertanian  Pupuk-Importir'), 
    100, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_010103 Pertanian  Kehutanan-Pertanian  Pupuk-Importir'), 
    FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Kode Lokasi Proyek_form'), konsumen_kodeLokasi, 
    FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_1213 - MALANG,KAB'), 100, 
    FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_1213 - MALANG,KAB'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Berdiri Sejak Tahun_form-control ng-untouched ng-pristine ng-invalid'), 
   konsumen_tahunBerdiri , FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Omzet Usaha per Tahun_form-control text-right ng-untouched ng-pristine ng-invalid'), 
    konsumen_omzetUsaha , FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_No. Rekening BCA_form-control ng-untouched ng-pristine ng-valid'), 
    konsumen_noRekBCA , FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Alamat Perusahaan_form-control ng-untouched ng-pristine ng-invalid'), 
    konsumen_alamatPT , FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Provinsi_form-control bcaf-autocomplete ng-untouched ng-pristine ng-invalid'), 
   konsumen_provinsi , FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_JAWA TIMUR'), 100, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_JAWA TIMUR'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_KabKota_form-control bcaf-autocomplete ng-untouched ng-pristine ng-invalid'), 
    konsumen_kabKota , FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_MALANG'), 100, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_MALANG'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Kecamatan_form-control bcaf-autocomplete ng-untouched ng-pristine ng-invalid'), 
    konsumen_kecamantan , FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_LOWOKWARU'), 0, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_LOWOKWARU'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Kelurahan_form-control bcaf-autocomplete ng-untouched ng-pristine ng-invalid'), 
   konsumen_kelurahan , FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_KETAWANGGEDE'), 100, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_KETAWANGGEDE'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Kode Pos_form-control bcaf-autocomplete ng-untouched ng-pristine ng-invalid'), , 
   konsumen_kodePos , FailureHandling.OPTIONAL)





WebUI.waitForElementPresent(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_65145'), 100, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/li_65145'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Input-data-FAP.png')

KeywordUtil.markPassed('scenario 1 - Input data FAP')





WebUI.scrollToElement(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/i_Fax 2_ri-arrow-right-line'), 60, 
    FailureHandling.OPTIONAL)


WebUI.click(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Alamat Pengiriman Surat  Alamat Perusahaan_isAlamatPengirimanSurat'), 
    FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Email_form-control ng-untouched ng-pristine ng-valid'), 
   konsumen_email , FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Input_Konsumen/input_Telepon 1_form-control ng-untouched ng-pristine ng-valid'), 
    konsumen_telepon1 , FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Input-data-alamat-pengirim-surat.png')

KeywordUtil.markPassed('scenario 1 - Input data alamat pengirim surat')


WebUI.scrollToPosition(0, 0, FailureHandling.OPTIONAL)




//---------------input pengurus--------------




WebUI.click(findTestObject('Input_Corporate/Pengurus/1_a_Pengurus'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Input-data-pengurus.png')

KeywordUtil.markPassed('scenario 1 - Input data pengurus')





WebUI.click(findTestObject('Input_Corporate/Pengurus/2_i_Add_ri-file-add-line ( Add_Pengurus )'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pengurus/3_button_Pengurus 1'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Masuk-submenu-data-pengurus-1.png')

KeywordUtil.markPassed('scenario 1 - Masuk submenu data pengurus 1')





WebUI.click(findTestObject('Input_Corporate/Pengurus/4_a_Capture File'), FailureHandling.OPTIONAL)





WebUI.uploadFile(findTestObject('Input_Corporate/Capture_'), userDir + GlobalVariable.cobaKTP, FailureHandling.OPTIONAL)





WebUI.waitForElementClickable(findTestObject('Input_Corporate/Pengurus/5_input_Name_form-control ng-untouched ng-pristine ng-invalid'), 
    300)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Berhasil-input-otomatis-data-pengurus-berdasarkan-data-capture-ktp-pengurus-yang-di-capture.png')

KeywordUtil.markPassed('scenario 1 - Berhasil input otomatis data pengurus berdasarkan data capture ktp pengurus yang di capture ')





WebUI.setText(findTestObject('Input_Corporate/Pengurus/8_input_SID Pengurus_form-control ng-pristine ng-invalid is-invalid ng-touched'), 
    pengurus_SID , FailureHandling.OPTIONAL)





WebUI.scrollToElement(findTestObject('Input_Corporate/Pengurus/2_i_Add_ri-file-add-line ( Add_Pengurus )'), 30, FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Input_Corporate/Pengurus/15_input_Kode Pos_form-control bcaf-autocomplete ng-pristine ng-invalid ng-touched'), 
     pengurus_kodePos , FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pengurus/13_div_Pilih Role'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Input_Corporate/Pengurus/13_div_Pilih Role'), pengurus_role, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pengurus/14_div_Not Set'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pengurus/21_div_Pilih Jabatan'), FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Object Repository/Input_Corporate/Pengurus/21_div_Pilih Jabatan'), pengurus_jabatan, 
    FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pengurus/22_span_Komisaris Utama'), FailureHandling.OPTIONAL)


WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Berhasil-input-otomatis-data-pengurus-1.png')

KeywordUtil.markPassed('scenario 1 - Berhasil input data pengurus 1')




// ---------------Pemegang saham---------------




WebUI.scrollToPosition(0, 133, FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/1_a_Pemegang Saham'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Masuk-Submenu-pemegang-saham-1.png')

KeywordUtil.markPassed('scenario 1 - Berhasil masuk menu pemegang saham ')





WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/2_a_Add'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/input_Perorangan_radios'), FailureHandling.OPTIONAL)


WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/input_Jenis Pemegang Saham_radios'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Memilih-radio-button-pemegang-saham.png')

KeywordUtil.markPassed('scenario 1 - Memilih radio button pemegang saham')





WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/4_button_OK'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/5_button_Pemegang Saham 1'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Masuk-Submenu-pemegang-saham-1.png')

KeywordUtil.markPassed('scenario 1 - Masuk submenu pemegang saham 1')





WebUI.click(findTestObject('Input_Corporate/Pemegang_saham/6_a_Capture File'), FailureHandling.OPTIONAL)





WebUI.uploadFile(findTestObject('Input_Corporate/Capture_'), userDir + GlobalVariable.cobaKTP, FailureHandling.OPTIONAL)





WebUI.scrollToPosition(0, 200, FailureHandling.OPTIONAL)











WebUI.scrollToPosition(0, 133, FailureHandling.OPTIONAL)

// -------------- Penjamin --------------------

WebUI.click(findTestObject('Input_Corporate/Penjamin/1_a_Penjamin'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Penjamin/2_input_Ya_guarantor_Tidak'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Berhasil-pemegang-saham-1.png')

KeywordUtil.markPassed('scenario 1 - Berhasil input pemegang saham 1')




//----------Financial------------

WebUI.click(findTestObject('Input_Corporate/Financial/li_Financial'), FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Masuk-Submenu-financial.png')

KeywordUtil.markPassed('scenario 1 - Masuk submenu financial')





WebUI.click(findTestObject('Input_Corporate/Financial/button_Laporan Keuangan'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Financial/a_Capture File'), FailureHandling.OPTIONAL)





WebUI.uploadFile(findTestObject('Input_Corporate/Capture_'), userDir + GlobalVariable.cobaKTP, FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-input-capture-laporan-keuangan.png')

KeywordUtil.markPassed('scenario 1 - berhasil input capture laporan keuangan')





WebUI.click(findTestObject('Input_Corporate/Financial/button_Bukti Kepemilikan Rekening'), FailureHandling.OPTIONAL)





WebUI.click(findTestObject('Input_Corporate/Financial/a_Capture File'), FailureHandling.OPTIONAL)





WebUI.uploadFile(findTestObject('Input_Corporate/Capture_'), userDir + GlobalVariable.cobaKTP, FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-behasil-input-capture-laporan-bukti-kepemilikan.png')

KeywordUtil.markPassed('scenario 1 - berhasil input capture laporan bukti kepemilikan')





WebUI.setText(findTestObject('Input_Corporate/Financial/input_BCA Branch_form-control ng-untouched ng-pristine ng-valid'), 
    financial_BCABranch , FailureHandling.OPTIONAL)





WebUI.setText(findTestObject('Input_Corporate/Financial/input_Account No. 10 Digit_form-control ng-untouched ng-pristine ng-valid'), 
   financial_rekNum , FailureHandling.OPTIONAL)





WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-input-branch-dan-account-10digit-pada-submenu-financial.png')

KeywordUtil.markPassed('scenario 1 - berhasil input branch dan account 10 digit pada submenu financial')




//------------Contact Person-------------

WebUI.click(findTestObject('Input_Corporate/Contact_Person/a_Contact Person'), FailureHandling.OPTIONAL)




//TODO

if(contactName != "") {
	WebUI.click(findTestObject('Object Repository/Input_Corporate/contact/label_Yes'))
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/nama-Contact'), contactName)
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/address'), contactAddress)
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/postal_code'), contactPostalCode)
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/prefix-telephone'), prefix_telephone)
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/telephone'), contactTelephone)
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/relationship'), contactRelationship)
	WebUI.setText(findTestObject('Object Repository/Input_Corporate/contact/kabupaten-kodya'), contactKab)
	} else {
	WebUI.click(findTestObject('Input_Corporate/Contact_Person/input_Yes_inline-radios_No'), FailureHandling.OPTIONAL)
}

WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-input-contact-person.png')

KeywordUtil.markPassed('scenario 1 - berhasil input contact person')



//------------Other Document---------------

WebUI.click(findTestObject('Input_Corporate/Other_Document/a_Other Document'), FailureHandling.OPTIONAL)

if(pathOtherDocument == '') {
	WebUI.click(findTestObject('Input_Corporate/otherDocument/a_Add'), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject('Input_Corporate/otherDocument/button_Other Document 1'), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject('Input_Corporate/otherDocument/a_Capture File'), FailureHandling.OPTIONAL)
// add upload file	
	}

//TODO
        

WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-Masuk-menu-other-document.png')

KeywordUtil.markPassed('scenario 1 - Masuk menu other document')




