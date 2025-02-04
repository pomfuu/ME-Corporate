import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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

// Random path
String userDir = RunConfiguration.getProjectDir()
String filePath = "${userDir}${GlobalVariable.pathfinder_npwp}".replace("/", "\\")
String ktpPath = "${userDir}${GlobalVariable.cobaKTP}".replace("/", "\\")
String baseDir = System.getProperty('user.dir')

// Tab Collateral dan Loan (2)
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div//following-sibling::span[text()='Collateral dan Loan']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-ke-halaman-collateralLoan') + '.png', FailureHandling.STOP_ON_FAILURE)

// Halaman Information
def fieldDataInformation = [
	['salesOffice', information_salesOffice ],
	['salesAgent', information_salesAgent ],
	['jenisPengajuan', information_jenisPengajuan ],
	['tujuan', information_tujuanKredit ]
]

for(data in fieldDataInformation) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//input"]), data[1])
	WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]), 1)
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']//div[@role='option'][1]"]))
}

// NEW SEGMENTATION
// segmentasi
switch(information_Segmentasi) {
	case 'Q1':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='segmentasiCode'])[1]"]))
	break;
	case 'Q2':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='segmentasiCode'])[2]"]))
	break;
	case 'Q3':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='segmentasiCode'])[3]"]))
	break;
	case 'Q4':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='segmentasiCode'])[4]"]))
	break;
	case 'Q5':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='segmentasiCode'])[5]"]))
	break;
}

// jenis debitur
switch(information_JenisDebitur) {
	case 'Korporasi':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='jenisDebiturCode'])[1]"]))
	break;
	case 'Komersial':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='jenisDebiturCode'])[2]"]))
	break;
	case 'SME':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='jenisDebiturCode'])[3]"]))
	break;
	case 'KUK/KUR':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='jenisDebiturCode'])[4]"]))
	break;
	case 'Non Debitur':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='jenisDebiturCode'])[5]"]))
	break;
}

// membership
switch(information_Membership) {
	case 'Solitaire':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='membershipCode'])[1]"]))
	break;
	case 'Prioritas':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='membershipCode'])[2]"]))
	break;
	case 'Reguler':
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//input[@formcontrolname='membershipCode'])[3]"]))
	break;
}

// Lama Membership
def lamaMembershipXpath = "//input[@formcontrolname='lamaMembership']"
def elMember = WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath': lamaMembershipXpath]), 2)
if (elMember) {
    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath': lamaMembershipXpath]), information_LamaMembership, FailureHandling.CONTINUE_ON_FAILURE)
}

// Plafond
def plafondXpath = "//input[@formcontrolname='plafondDiBca']"
def elPlafond = WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath': plafondXpath]), 2)
if (elPlafond) {
    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath': plafondXpath]), information_Plafond, FailureHandling.CONTINUE_ON_FAILURE)
}

// Sumber Aplikasi DS
def sumberDSXpath = "//input[@formcontrolname='sumberAplikasiDs']"
def elDS = WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath': sumberDSXpath]), 2)
if (elDS) {
    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath': sumberDSXpath]), information_sumberDS, FailureHandling.CONTINUE_ON_FAILURE)
}


// bukti membership
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//a[text()='Capture']"]))
CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)

if (information_jenisPengajuan == 'Top Up' || information_jenisPengajuan == 'Multiguna' || information_jenisPengajuan == 'Restructure' || information_jenisPengajuan == 'Overkredit') {
    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='accountBank']"]), information_topUpAccNum)
    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='noPin']"]), information_topUpAccNum3Digit)
} else {
    
}

// WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div//input[@name='cluster']/following-sibling::label[text()='${information_cluster}']"]))

// --- Informasi yang merekomendasikan
// Note: ada error 403 Access Denied saat click tab vehicle lalu click tab Information lagi
def fieldDataReccomendation = [
	['recommenderName', information_namaPemilikRek ],
	['recommenderBranch', information_cabang ],
	['recommenderRole', information_recommenderRole ]
]

for(data in fieldDataReccomendation) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
}

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index  + '/' + 'skenario-bagian-informasi-merekomendasikan') + '.png', FailureHandling.STOP_ON_FAILURE)

// --- Section Payment (Information)
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div//*[text()='Payment']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//ng-select[@formcontrolname='paymentMethod']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@role='option']//*[text()='${information_paymentMethod}']"]))
WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='bcaAccountNo']"]), information_accountNum)
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index  + '/' + 'skenario-bagian-payment') + '.png', FailureHandling.STOP_ON_FAILURE)

/*
switch(information_isAutoDebetRekBeda) {
	case "yes":
		WebUI.check(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='autodebetNoRek']"]))
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordionInformation']//*[text()='Capture']"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordionInformation']//*[@formcontrolname='noRekening']"]), information_rekBedaNoRek)
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordionInformation']//*[@formcontrolname='namaPemilikRekening']"]), information_rekBedaNama)
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordionInformation']//*[@formcontrolname='cabangBca']"]), information_rekBedaCabangBCA)
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordionInformation']//*[@formcontrolname='noKtp']"]), information_rekBedaNoKTP)
	break;
	
	case "no":
	// lanjut
	break;
}
*/

// --- Section Mutasi Rekening (Information)
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Mutasi Rekening']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()=' Add Mutasi Rekening']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='modal-content']//*[text()='Capture File']"]))
CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)

def fieldDataMutasi = [
	['mutasiDebit', information_mutasiDebit ],
	['mutasiSaldo', information_mutasiSaldo ],
	['mutasiKredit', information_mutasiKredit ]
]

for(data in fieldDataMutasi) {
	WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), 0)
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formcontrolname='${data[0]}']"]), data[1])
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//button[text()=' Add']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='View Detail']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@class='close']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index  + '/' + 'skenario-bagian-mutasi') + '.png', FailureHandling.STOP_ON_FAILURE)


// Save to Draft
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='button-save-draft']"]))

// Halaman Vehicle
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Vehicle' and @href='#tab-vehicle']"]))
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index  + '/' + 'skenario-ke-tab-vehicle') + '.png', FailureHandling.STOP_ON_FAILURE)



