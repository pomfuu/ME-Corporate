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

//String userDir = RunConfiguration.getProjectDir()
//String ktpDir = userDir + GlobalVariable.cobaKTP
//WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/input_Apakah memiliki Beneficial Owner_isHaveBO'))
//WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/button_Beneficial Owner 1'))
//WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/a_Capture File'))
//CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/MEApp_AppBaru_InisiasiKonsumen/Page_Mobile Entry - BCAF/button_Local File'), (ktpDir).replace('/', '\\'))
//WebUI.setText(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/BOretry/name'),"TEST")
//WebUI.setText(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/input_Birth Place_form-control ng-untouched ng-pristine ng-valid'),"TEST")
//WebUI.setText(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/input_Identity No_form-control ng-untouched ng-pristine ng-valid ng-star-inserted'),"213252543434223")
//	if(true) {
//		WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/input_Kewarganegaraan_nationality1'))		
//	}else {
//		WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/input_Warga Negara Indonesia_nationality2'))
//	}
////	Contoh format date : 10-Januari-2024
//	String dateStr = "10-Januari-2005"
//	String[] date = dateStr.split('-')
//	WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/input_Birth Date_dp-readonly form-control ng-pristine ng-valid ng-touched'))
//	WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/button_2024'))
//	while(true){
//		String yearRangeBo = WebUI.getText(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/button_year_range'))
//		String[] yearRange = yearRangeBo.split(' - ')
//		if(yearRange [0]>date[2]) {
//			WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/span_LEFT'))
//			continue;	
//		}
//		if(yearRange[1]<date[2]){
//			WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/span_RIGHT'))
//			continue;
//		}
//		WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/span_selection_month_year_day',['element':date[2]]))
//		WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/span_selection_month_year_day',['element':date[1]]))
//		WebUI.click(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/span_1',['date':date[0]]))	
//		break;
//	}

//WebUI.setText(findTestObject('Object Repository/Input_Corporate/Pemegang_saham/xpath-dinamis',['field':'identityNo']),
//	'1231321321321' , FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Input_Corporate/Beneficial Owner/xpath-dinamis',["field":"name"]),"JERRRY")