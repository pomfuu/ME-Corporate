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

String ssDir = userDir + GlobalVariable.sprint2WebScreenshotPath

WebUI.scrollToPosition(0, 130)

//-------------------vehicle------------------

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-masuk-halaman-collateral-loan-vehicle.png')

KeywordUtil.markPassed('scenario 1 - Masuk halaman collateral loan vehicle')

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/li_Vehicle'))

WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_dealername_ketiga'), 0)


WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_dealername_ketiga'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_dealername_ketiga'), vehicle_dealerName, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_Akita Prima Mobilindo, PT',["index": vehicle_dealerName]))

WebUI.waitForElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_branch_ketiga'), 0)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_branch_ketiga'))

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_branch_ketiga',['index': vehicle_branch]), vehicle_branch)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_A1617 - Akita Prima Mobilindo - Pondok Cabe',['index': vehicle_branch]))

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Address_address'), 0)

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_City_city'), 0)

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Telephone_phone'), 0)

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Authorize Dealer_authorizedDealer'), 0)

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/input_Fax_fax'), 0)

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/td_1-nomorrekening'), 0)

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-masuk-halaman-collateral-loan-vehicle.png')

KeywordUtil.markPassed('scenario 1 - Masuk halaman collateral loan vehicle')
//-------------------------data vehicle-------------------------------
//'Melakukan scroll'
//WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/a_Calculate All Unit (1)'), 0)
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Data Vehicle'))
//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-halaman-input-data-vehicle.png')
KeywordUtil.markPassed('scenario 1 - halaman input data vehicle')

WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/button_Data Vehicle'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_used_carCondition-radio'))

WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/div_Pilih Product Code'), FailureHandling.OPTIONAL)

CustomKeywords.'popup.popup.writeString'(vehicle_productCode, true)

WebUI.click(findTestObject('vehiclekedua/input_brand_kedua'))

CustomKeywords.'popup.popup.writeString'(vehicle_brand, true)

WebUI.click(findTestObject('vehiclekedua/input_model_kedua'), FailureHandling.OPTIONAL)

CustomKeywords.'popup.popup.writeString'(vehicle_model, true)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_typekendaraan'), FailureHandling.OPTIONAL)

CustomKeywords.'popup.popup.writeString'(vehicle_tipeKendaraan, true)

WebUI.click(findTestObject('vehiclekedua/input_packet_kedua'), FailureHandling.OPTIONAL)

CustomKeywords.'popup.popup.writeString'(vehicle_packet, true)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/div_BCAI - IIMS - SUBS OTR ADDB'))

CustomKeywords.'popup.popup.writeString'(vehicle_ketTypeKendaraan, false)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Year_year (1)'), vehicle_year)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Capture File_bpkb'))

CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), (userDir + GlobalVariable.pathfinder_npwp).replace('/','\\'))

try {
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Capture Files_stnk_datavehicle'))

CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), (userDir + GlobalVariable.pathfinder_npwp).replace('/','\\'))
}catch(e) {
	
}
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Color_text-input (1)'), vehicle_color)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_BPKB No_text-input'), vehicle_bpkbNum)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Engine No_text-input'), vehicle_engineNum)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Police No_text-input'), vehicle_policeNum)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Body No_text-input'), vehicle_bodyNum)

WebUI.click(findTestObject('vehiclekedua/input_purpose_kedua'), FailureHandling.OPTIONAL)

CustomKeywords.'popup.popup.writeString'(vehicle_purpose, true)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_BPKB Owner_text-input'), vehicle_bpkbowner)

WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'hubunganDebitur']), FailureHandling.OPTIONAL)

CustomKeywords.'popup.popup.writeString'(vehicle_hubunganBpkb, true)

if(vehicle_isProduktif == "1") {
	WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Tujuan Penggunaan Kendaraan_produktif'), FailureHandling.OPTIONAL)	
}

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Tujuan Penggunaan Kendaraan_nonproduktif'), FailureHandling.OPTIONAL)


//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-input-data-vehicle.png')

KeywordUtil.markPassed('scenario 1 - berhasil input data vehicle')
//-------------------------loan data-------------------------------
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Loan Data'), FailureHandling.OPTIONAL)

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-halaman-input-loan-data.png')

KeywordUtil.markPassed('scenario 1 - halaman input loan data')

WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/button_Loan Data'), 0)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_On The Road Price_otr'), vehicle_onTheroadPrice)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Down Payment_dpNominal'), vehicle_downPayment)
if(vehicle_downPayment == '') {
	WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_DP_dpPercent'), vehicle_dpPercent)
}
WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Tenor (bulan)_tenor1'), vehicle_tenorBulan)

String loan = loanType == 'InAdvance' ? 'loanType10':'loanType20'

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Loan Type_inadvance',['loan':loan]), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Flat Rate_flatRate'), vehicle_flatRate1)

//WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Flat Rate 2_flatRate2'), vehicle_flatRate2)

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Effective Rate_effectiveRate'), FailureHandling.OPTIONAL)

//WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Effective Rate 2_effectiveRate2'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Provisional Percent_provisionPercent'), vehicle_provPercent)

String prov = prov_payment == "prepaid" ? 'provisionPayment10' : 'provisionPayment20'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Provisional Payment_prepaid',['index':prov]), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/input_Adm Fee_admFee'), vehicle_admFee)

String admin = admin_payment == 'onloan' ? 'admFeePayment20' : 'admFeePayment10'
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Adm Fee Payment_onloan',['index':admin]), FailureHandling.OPTIONAL)

String jen_unit = jenis_unit == 'partial' ? "jenistUnit10" : "jenistUnit20"
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_gabung_jenisUnit20',['index': jen_unit]), FailureHandling.OPTIONAL)

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-input-data-loan.png')

//-------------------------carinsurance-------------------------------

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Insurance'), FailureHandling.OPTIONAL)

//insurance field carInsurance+tlcInsurance+machineWarranty+lifeInsurance
String[] insuranceTypes = asuransi.split('\\+')

for(insurance in insuranceTypes) {
	WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Insurance_inline-checkbox1',['index':insurance]), FailureHandling.OPTIONAL)
	switch(insurance) {
		case 'carInsurance':
//			WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-halaman-input-car-insurance.png')
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'carInsuranceCorpName']), FailureHandling.OPTIONAL)
			
			CustomKeywords.'popup.popup.writeString'(vehicle_carInsurance, true)
			
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'carInsuranceBranchName']), FailureHandling.OPTIONAL)
			
			CustomKeywords.'popup.popup.writeString'(vehicle_carInsuranceBranch, true)
			
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'carInsuranceType']))
			
			CustomKeywords.'popup.popup.writeString'(vehicle_carInsurancetype, true)
						
			String[] additional = carInsurance.split('\\+')
			for(addOns in additional) {
				switch(addOns) {
					case 'RSCC':
						WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_RSCC_carInsuranceRscc0'))
						break;
					case 'RSMB':
						WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_RSMB_carInsuranceRsmb0'))
						break;
//					tjh
				}
			}
			String payment = insurance_payment == "prepaid" ? "carInsurancePayment10":insurance_payment == "onloan" ? 'carInsurancePayment20': ' carInsurancePayment30'
			WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Insurance Payment_prepaid',['index':payment]))
			
//			WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-input-car-insurance.png')
			break;
		case 'machineWarranty':
//TODO machine warranty belum kelar
			break;
		case 'tlcInsurance':
//			WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-halaman-input-tlp-insurance.png')
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'tlcInsuranceCorpName']))
			CustomKeywords.'popup.popup.writeString'(tlpCorpInsuranceName, true)
			
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'tlcInsuranceType']))
			CustomKeywords.'popup.popup.writeString'(tlpInsuranceType, true)
			
			String payment = tlpPayment == "prepaid" ? "tlcInsurancePayment10":insurance_payment == "onloan" ? 'tlcInsurancePayment20': ' tlcInsurancePayment30'
			WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_Insurance Payment_prepaid',['index':payment]))
//			WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-input-tlp-insurance.png')
			break;
		case 'lifeInsurance':
//			WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-halaman-input-life-insurance.png')
			WebUI.scrollToElement(findTestObject('ME_CollateralAndLoan_Vehicle/a_Calculate All Unit (1)'), 0)
			
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'lifeInsuranceCorpName']))
			CustomKeywords.'popup.popup.writeString'(vehicle_lifeInsurancecorp, true)
			
			WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/tlcInsurance',['index':'lifeInsuranceType']))
			CustomKeywords.'popup.popup.writeString'(vehicle_lifeInsurancebranch, true)
			
//			WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-input-life-insurance.png')
			break;
	}
}
//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-input-data-insurance.png')

WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Note'), FailureHandling.OPTIONAL)

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-submenu-notes.png')

WebUI.setText(findTestObject('ME_CollateralAndLoan_Vehicle/textarea_Note CMO_noteCMO'), vehicle_noteCMO)

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-submenu-notes.png')

if(vehicle_jumlahUnit != "0") {
	WebUI.click(findTestObject('vehiclekedua/a_Add Unit Kendaraan_kedua'))
	
//	WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-pop-up-add-kendaraan.png')
	
	WebUI.setText(findTestObject('vehiclekedua/input_Jumlah unit_kedua'), vehicle_jumlahUnit)
	
	WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/input_ya_copy_addunit'))
	
	WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/span_Pilih Unit'))
	
	WebUI.setText(findTestObject('vehiclekedua/input_Add_select2-search__field-UNIT_yangakandicopy_kedua'), vehicle_searchUnit)
	
	WebUI.sendKeys(findTestObject('vehiclekedua/input_Add_select2-search__field-UNIT_yangakandicopy_kedua'), Keys.chord(Keys.ENTER))
	
	//WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/li_Unit 1 - ALL NEW HILUX 2.4 V DOUBLE CABIN 4X4 AT'))
	
//	WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-berhasil-add-kendaraan.png')
	
	WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/button_Add_unit'))
}
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Calculate All Unit'))

WebUI.click(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/closeDialog'))

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/label_Summary Total'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/ME_CollateralAndLoan_Vehicle/summary'))

//WebUI.takeFullPageScreenshotAsCheckpoint((ssDir) + 'scenario-1-pop-up-summary-total.png')

WebUI.verifyElementPresent(findTestObject('ME_CollateralAndLoan_Vehicle/div_Calculating Summary_mx-0 proceed-state state-1_success'),
	0)
WebUI.click(findTestObject('ME_CollateralAndLoan_Vehicle/a_Close_calculate'))