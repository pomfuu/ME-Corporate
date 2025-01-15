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


// Random path
String userDir = RunConfiguration.getProjectDir()
String filePath = "${userDir}${GlobalVariable.pathfinder_npwp}".replace("/", "\\")
String ktpPath = "${userDir}${GlobalVariable.cobaKTP}".replace("/", "\\")
String baseDir = System.getProperty('user.dir')

def fieldDataVehicle = [
	['dealerName', vehicle_dealerName ],
	['dealerBranchName', vehicle_branch ],
]

for(data in fieldDataVehicle) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//input"]), data[1])
	WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]), 1)
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]))
}

// --- Data Vehicle (Vehicle)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Data Vehicle']"]))

switch(vehicle_carCondition) {
	case 'used':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@formcontrolname='carCondition' and @value='2']"]))
		def fieldSelectVehicle = [
			['productCode', vehicle_productCode ],
			['packetName', vehicle_packet ],
			['brandName', vehicle_brand ],
			['modelName', vehicle_model ],
			['type', vehicle_tipeKendaraan ],
			['purpose', vehicle_purpose ],
			['hubunganDebitur', vehicle_hubunganBpkb ],
		]
		
		for(data in fieldSelectVehicle) {
			WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//input"]), data[1])
			WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]), 1)
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]))
		}
		
		def fieldInsertVehicle = [
			['keteranganType', vehicle_ketTypeKendaraan ],
			['year', vehicle_year ],
			['bpkbNo', vehicle_bpkbNum ],
			['color', vehicle_color ],
			['policeNo', vehicle_policeNum ],
			['engineNo', vehicle_engineNum ],
			['bodyNo', vehicle_bodyNum ],
			['bpkbOwner', vehicle_bpkbowner ],
		]
		
		for(data in fieldInsertVehicle) {
			WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
		}
		
		// Capture BPKP
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='row ng-star-inserted']//div[@class='col-md-12 form-group']/div[3]//*[text()=' Add Capture']"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
		
		// Capture STNK
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//label[text()='Capture STNK']//following-sibling::div[1]//*[text()='Capture File' or text()=' Retake STNK']"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@value='$vehicle_tujuanPenggunaan']"]), 0)
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@value='$vehicle_tujuanPenggunaan']"]))
	break;
	
	case 'new':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@formcontrolname='carCondition' and @value='1']"]))
		def fieldSelectVehicle = [
			['productCode', vehicle_productCode ],
			['packetName', vehicle_packet ],
			['brandName', vehicle_brand ],
			['modelName', vehicle_model ],
			['type', vehicle_tipeKendaraan ],
			['purpose', vehicle_purpose ],
			['hubunganDebitur', vehicle_hubunganBpkb ],
		]
		
		for(data in fieldSelectVehicle) {
			WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//input"]), data[1])
			WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]), 1)
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]))
		}
		
		def fieldInsertVehicle = [
			['keteranganType', vehicle_ketTypeKendaraan ],
			['year', vehicle_year ],
			['color', vehicle_color ],
			['bpkbOwner', vehicle_bpkbowner ],
		]
		
		for(data in fieldInsertVehicle) {
			WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
		}
		
		WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@value='$vehicle_tujuanPenggunaan']"]), 0)
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@value='$vehicle_tujuanPenggunaan']"]))
	break;
}
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-data-vehicle') + '.png', FailureHandling.STOP_ON_FAILURE)

// --- Loan Data (Vehicle)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Loan Data']"]))

def fieldInsertLoanVehicle = [
	['otr', vehicle_onTheroadPrice ],
	['dpNominal', vehicle_downPayment ],
	['tenor', vehicle_tenorBulan ],
	['flatRate', vehicle_flatRate1 ],
	['effectiveRate', '10,896383' ],
	['provisionPercent', vehicle_provPercent ],
	['admFee', vehicle_admFee ],
//	['dpPercent', vehicle_dpPercent ],
//	['residualValue', '100000' ],
//	['tenor2', '12' ],
//	['flatRate2', vehicle_flatRate2 ],
//	['effectiveRate2', '100000' ],
//	['jumlahSubsidi', '1' ],
//	['provisionFee', '2475000' ],
//	['hargaChasis', '100000' ],
]

for(data in fieldInsertLoanVehicle) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
}

def fieldRadioLoanVehicle = [
	['provisionPayment', vehicle_provisionPayment], 
	['admFeePayment', vehicle_admFeePayment], 
	['jenisUnit', vehicle_jenisUnit], 
]

for(data in fieldRadioLoanVehicle) {
	WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@value='${data[1]}' and @formcontrolname='${data[0]}']"]))
}
WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Loan Data']"]), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@value='R' and @formcontrolname='loanType']"]))

//WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()=' Calculate']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-ke-loanData') + '.png', FailureHandling.STOP_ON_FAILURE)


// --- Insurance (Vehicle)
String[] insuranceTypes = asuransi_asuransiType.split('\\+')
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@data-target='#insurance-accordion']"]))

for(insurance in insuranceTypes) {
	switch(insurance) {
		case 'carInsurance':
			WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='insurance-accordion']//input[@formcontrolname='carInsurance']"]))
			def carInsuranceSelectField = [
				['carInsuranceCorpName', vehicle_carInsurance],
				['carInsuranceBranchName', vehicle_carInsuranceBranch],
				['carInsuranceType', vehicle_carInsurancetype],
//				['carInsuranceTjhId', ],
			]
			
			for(data in carInsuranceSelectField) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//input"]), data[1])
				WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]), 1)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]))
			}
			
//			def fieldInsertCarInsurance = [
//				['carInsuranceDeductionPercent',  ],
//				['deductionNominal',  ],
//			]
//			
//			for(data in fieldInsertCarInsurance) {
//				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
//			}
			
			WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='carInsuranceRscc']"]))
			WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='carInsuranceRsmb']"]))
			WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='carInsurancePayment' and @value='0']"]))
			WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-car-insurance') + '.png', FailureHandling.STOP_ON_FAILURE)
			break;
			
		case 'isOtherInsurance':
			WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@formcontrolname='isOtherInsurance']"]))
			def otherInsuranceSelectField = [
				['otherInsuranceType', asuransi_otherInsuranceType], 
				['otherInsuranceCompany', asuransi_otherInsuranceCompany], 
				['otherInsuranceTenor', asuransi_otherInsuranceTenor], 
				['coverageType', asuransi_coverageType], 
			]
			
			for(data in otherInsuranceSelectField) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//input"]), data[1])
				WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]), 1)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]))
			}
			
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='otherInsuranceFeeType']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@role='option']//*[text()='Prepaid']"]))
			
			def fieldInsertInsurance = [
				['otherInsuranceFee', asuransi_otherInsuranceFee ],
				['deductionPercentage', asuransi_deductionPercentage ],
			]
			
			for(data in fieldInsertInsurance) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
			}
			
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@formcontrolname='paymentType' and @value='Prepaid']"]))
			
//			 Calculate Premi
//			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='btn-calculate']//*[text()=' Calculate Premi']"]))
			
			WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index  + '/' + 'skenario-other-insurance') + '.png', FailureHandling.STOP_ON_FAILURE)
			break;
			
		case 'biayaLain':
			WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formgroupname='biayaLain']//input"]))
			break;
	}
}



// --- Note (Vehicle)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Note']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()=' Add Unit Kendaraan ']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@class='close']"]))
//WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Calculate All Unit']"]))
WebUI.waitForElementPresent(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Close']"]), 0)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Close']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-ke-calculateAllUnit') + '.png', FailureHandling.STOP_ON_FAILURE)

// Save to Draft
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='button-save-draft']"]))