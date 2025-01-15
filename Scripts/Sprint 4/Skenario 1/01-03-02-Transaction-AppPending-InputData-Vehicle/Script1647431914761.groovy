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

'Melakukan scroll'
WebUI.scrollToPosition(0, 130)

//-------------------vehicle------------------
'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-masuk-halaman-collateral-loan-vehicle.png')

KeywordUtil.markPassed('scenario 1 - Masuk halaman collateral loan vehicle')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol menu vehicle'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/li_Vehicle'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan element dealer name'
WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_dealername_ketiga'), 0)

'Melakukan click form input dealer'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_dealername_ketiga'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search dealer name'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_dealername_ketiga'), vehicle_dealerName, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih dealer name'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_Akita Prima Mobilindo, PT'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan element branch'
WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_branch_ketiga'), 0)

'Melakukan click form input branch'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_branch_ketiga'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search branch'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_branch_ketiga'), vehicle_branch)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan list branch yang terpilih'
WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/span_A1617 - Akita Prima Mobilindo - Pondok Cabe'), 
    0)

'Memilih branch'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_A1617 - Akita Prima Mobilindo - Pondok Cabe'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu memverifikasi elemen address jika telah tampil'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Address_address'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu memverifikasi elemen address jika telah tampil'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_City_city'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu memverifikasi element city jika telah tampil'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Telephone_phone'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu memverifikasi element telephone jika telah tampil'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Authorize Dealer_authorizedDealer'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu memverifikasi elemen authorizes dealer jika telah tampil'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Fax_fax'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu memverifikasi element nomor rekening jika telah tampil'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/td_1-nomorrekening'), 0)

'Melakukan screenschoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-masuk-halaman-collateral-loan-vehicle.png')

KeywordUtil.markPassed('scenario 1 - Masuk halaman collateral loan vehicle')

'Melakukan delay 1 detik'
WebUI.delay(1)

//-------------------------data vehicle-------------------------------
'Melakukan delay 1 detik'
WebUI.delay(1)

//'Melakukan scroll'
//WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/a_Calculate All Unit (1)'), 0)
'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click menu data vehicle'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Data Vehicle'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-halaman-input-data-vehicle.png')

KeywordUtil.markPassed('scenario 1 - halaman input data vehicle')

'Melakukan delay 2 detik'
WebUI.delay(2)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/button_Data Vehicle'), 0, FailureHandling.STOP_ON_FAILURE)

'memilih use for car condition'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_used_carCondition-radio'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input product code'
WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/div_Pilih Product Code'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search product code'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_productcode2'), vehicle_productCode)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih product code'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_Leasing'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input brand'
WebUI.click(findTestObject('vehiclekedua/input_brand_kedua'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search brand'
WebUI.setText(findTestObject('vehiclekedua/input_brand_kedua'), vehicle_brand)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih brand'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_TOYOTA_brand'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input model'
WebUI.click(findTestObject('vehiclekedua/input_model_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search model'
WebUI.setText(findTestObject('vehiclekedua/input_model_kedua'), vehicle_model, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih model'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_ALL NEW HILUX_model_datavehicle'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan element input tipe kendaraan'
WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_typekendaraan'), 0)

'Melakukan click form input tipe kendaraan'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_typekendaraan'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search tipe kendaraan'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_typekendaraan'), vehicle_tipeKendaraan, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan list tipe kendaraan yang terpilih'
WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/div_ALL NEW HI LUX DOUBLE CABIN 2.4 G (4X4) MT DIESEL 2017_type_datavehicle'), 
    0)

'Memilih tipe kendaraan'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_ALL NEW HI LUX DOUBLE CABIN 2.4 G (4X4) MT DIESEL 2017_type_datavehicle'), 
    FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input paket'
WebUI.click(findTestObject('vehiclekedua/input_packet_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search paket'
WebUI.setText(findTestObject('vehiclekedua/input_packet_kedua'), vehicle_packet, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan list paket terpilih'
WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/div_BCAI - IIMS - SUBS OTR ADDB'), 300)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih paket'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_BCAI - IIMS - SUBS OTR ADDB'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input tipe kendaraan'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Keterangan Type Kendaraan_keteranganType'), vehicle_ketTypeKendaraan)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input year'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Year_year (1)'), vehicle_year)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol capture BPKB'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Capture File_bpkb'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan upload file BPKP'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_npwp)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan capture STNK'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Capture Files_stnk_datavehicle'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan upload file STNK'
WebUI.uploadFile(findTestObject('MEApp_AppBaru_InisiasiKonsumen/Capture_'), userDir + GlobalVariable.pathfinder_npwp)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input color'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Color_text-input (1)'), vehicle_color)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input BPKB No.'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_BPKB No_text-input'), vehicle_bpkbNum)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input Engine no.'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Engine No_text-input'), vehicle_engineNum)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input Police no.'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Police No_text-input'), vehicle_policeNum)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input body no'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Body No_text-input'), vehicle_bodyNum)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input search purpose'
WebUI.click(findTestObject('vehiclekedua/input_purpose_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search purpose'
WebUI.setText(findTestObject('vehiclekedua/input_purpose_kedua'), vehicle_purpose, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih purpose'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_Operasional'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input BPKP owner'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_BPKB Owner_text-input'), vehicle_bpkbowner)

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('vehiclekedua/input_hubungan_bpkbownerdgdebitur_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'input hubungan owner dengan debitur'
WebUI.setText(findTestObject('vehiclekedua/input_hubungan_bpkbownerdgdebitur_kedua'), vehicle_hubunganBpkb, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih pasangan pada inputan hubungan owner dan debitur'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_pasangan'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Tujuan Penggunaan Kendaraan_nonproduktif'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input radio button pada tujuan penggunaan kendararaan'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Tujuan Penggunaan Kendaraan_produktif'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-input-data-vehicle.png')

KeywordUtil.markPassed('scenario 1 - berhasil input data vehicle')

'Melakukan delay 1 detik'
WebUI.delay(1)

//-------------------------loan data-------------------------------
'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih menu loan dat'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Loan Data'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-halaman-input-loan-data.png')

KeywordUtil.markPassed('scenario 1 - halaman input loan data')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/button_Loan Data'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input on the road price otr'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_On The Road Price_otr'), vehicle_onTheroadPrice)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Down Payment_dpNominal'), vehicle_downPayment)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input DP Percent'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_DP_dpPercent'), vehicle_dpPercent)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input tenor bulan'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Tenor (bulan)_tenor1'), vehicle_tenorBulan)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih loan type'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Loan Type_inadvance'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input flatrate 1'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Flat Rate_flatRate'), vehicle_flatRate1)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input flatrate 2'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Flat Rate 2_flatRate2'), vehicle_flatRate2)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click effective rate 1'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Effective Rate_effectiveRate'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click effective rate 2'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Effective Rate 2_effectiveRate2'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input provisional percent'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Provisional Percent_provisionPercent'), vehicle_provPercent)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih payment prepaid'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Provisional Payment_prepaid'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input adm fee'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Adm Fee_admFee'), vehicle_admFee)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih radio button adm fee onloan'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Adm Fee Payment_onloan'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih radio button adm fee prepaid'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Adm Fee Payment_prepaid'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Mmemilih radio button jenis unit gabung'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_gabung_jenisUnit20'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-input-data-loan.png')

KeywordUtil.markPassed('scenario 1 - berhasil input data loan')

'Melakukan delay 1 detik'
WebUI.delay(1)

//-------------------------carinsurance-------------------------------
'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan menu Insurance'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Insurance'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan checklist insurance'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Insurance_inline-checkbox1'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-halaman-input-insurance.png')

KeywordUtil.markPassed('scenario 1 - halaman input insurance')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search car insurance 1'
WebUI.setText(findTestObject('vehiclekedua/input_carinsurance_kedua'), vehicle_carInsurance)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih car insurance 1'
WebUI.click(findTestObject('vehiclekedua/div_NO INSURANCE_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('vehiclekedua/input_carinsurancebranch_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input branch dari car insurance'
WebUI.setText(findTestObject('vehiclekedua/input_carinsurancebranch_kedua'), vehicle_carInsuranceBranch, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click untuk branch dari car insurance'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_NO INSURANCE_branch'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input car insurance type'
WebUI.click(findTestObject('vehiclekedua/input_carinsurancetype_kedua'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input car insurance type'
WebUI.setText(findTestObject('vehiclekedua/input_carinsurancetype_kedua'), vehicle_carInsuransetype)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih car insurance type'
WebUI.click(findTestObject('vehiclekedua/div_All Risk_kedua'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan checklist RSCC'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_RSCC_carInsuranceRscc0'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan checklist RSMB'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_RSMB_carInsuranceRsmb0'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih payment prepaid'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Insurance Payment_prepaid'))

'Melakukan delay 1 detik'
WebUI.delay(1)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Machine Warranty_lifeInsurance'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-halaman-input-life-insurance.png')

KeywordUtil.markPassed('scenario 1 - halaman input life insurance')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan scroll'
WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/a_Calculate All Unit (1)'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input life insurance corp'
WebUI.click(findTestObject('vehiclekedua/input_lifeinsurancecorp_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search life insurance corp'
WebUI.setText(findTestObject('vehiclekedua/input_lifeinsurancecorp_kedua'), vehilcle_lifeInsurancecorp, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih life insurance corp'
WebUI.click(findTestObject('vehiclekedua/div_ASURANSI LAINNYA_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input life insurance branch'
WebUI.click(findTestObject('vehiclekedua/input_lifeinsurancebranch_kedua'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search life insurance branch'
WebUI.setText(findTestObject('vehiclekedua/input_lifeinsurancebranch_kedua'), vehicle_lifeInsurancebranch, FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih life insurance branch'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_AS. LAINNYA_lifeinsurance'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih Annual'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Annual_lifeInsurancePayment'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-input-data-insurance.png')

KeywordUtil.markPassed('scenario 1 - berhasil input data insurance')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol menu note'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Note'), FailureHandling.OPTIONAL)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-submenu-notes.png')

KeywordUtil.markPassed('scenario 1 - submenu notes')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input note'
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/textarea_Note CMO_noteCMO'), vehicle_noteCMO)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-submenu-notes.png')

KeywordUtil.markPassed('scenario 1 - berhasil input  notes CMO')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click add unit'
WebUI.click(findTestObject('vehiclekedua/a_Add Unit Kendaraan_kedua'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-pop-up-add-kendaraan.png')

KeywordUtil.markPassed('scenario 1 - Popup add unit kendaraan')

'Melakukan delay 1 detik'
WebUI.delay(1)

//WebUI.sendKeys(findTestObject('ME_CollateralAndLoan_Vehicle/input_Jumlah unit yang akan di input_form-control ng-untouched ng-pristine ng-valid'), Keys.chord('2'))
'Melakukan input jumlah unit kedua'
WebUI.setText(findTestObject('vehiclekedua/input_Jumlah unit_kedua'), vehicle_jumlahUnit)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih ya copy add unit'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_ya_copy_addunit'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan click form input pilih unit'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_Pilih Unit'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan input search pilih unit'
WebUI.setText(findTestObject('vehiclekedua/input_Add_select2-search__field-UNIT_yangakandicopy_kedua'), vehicle_searchUnit)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Memilih unit'
WebUI.sendKeys(findTestObject('vehiclekedua/input_Add_select2-search__field-UNIT_yangakandicopy_kedua'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/li_Unit 1 - ALL NEW HILUX 2.4 V DOUBLE CABIN 4X4 AT'))
'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-berhasil-add-kendaraan.png')

KeywordUtil.markPassed('scenario 1 - berhasil add unit kendaraan')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol add'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Add_unit'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menekan tombol calculate all unit'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Calculate All Unit'))

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menampilkan summary total dari pengajuan 1'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/label_Summary Total'), 0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sprint4WebScreenshootPath) + 'scenario-1-pop-up-summary-total.png')

KeywordUtil.markPassed('scenario 1 - Popup summary total')

'Melakukan delay 1 detik'
WebUI.delay(1)

'Menunggu menampilkan proses calculating summary'
WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/div_Calculating Summary_mx-0 proceed-state state-1_success'), 
    0)

'Melakukan delay 1 detik'
WebUI.delay(1)

'Click close calculate'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Close_calculate'))

