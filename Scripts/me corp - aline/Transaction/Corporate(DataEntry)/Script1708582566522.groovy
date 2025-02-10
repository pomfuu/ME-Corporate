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
import java.util.Calendar

// Random path
String userDir = RunConfiguration.getProjectDir()
String filePath = "${userDir}${GlobalVariable.pathfinder_npwp}".replace("/", "\\")
String ktpPath = "${userDir}${GlobalVariable.cobaKTP}".replace("/", "\\")
String baseDir = System.getProperty('user.dir')

if(aplikasiBaru_isPerubahanData == 'ya') {
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//button[@data-target='#npwp-document'])[1]"]))
} else

// Halaman Konsumen
WebUI.setText(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formcontrolname='sidName']"]), konsumen_SID)
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Surat Keterangan Domisili ']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@role='tablist']//div[4]//*[text()=' Capture ' or text()=' Retake ']"]))
CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), ktpPath)

WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='FAP ']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()=' Add Capture']"]))
CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)

def fieldData = [
    ['Jenis Usaha', konsumen_jenisUsaha],
    ['Omzet Usaha per Tahun', konsumen_omzetUsaha],
    ['Alamat Perusahaan', konsumen_alamatPT],
    ['Berdiri Sejak Tahun', konsumen_tahunBerdiri],
    ['No. Rekening BCA', konsumen_noRekBCA]
]

for (data in fieldData) {
    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='${data[0]}']/following-sibling::div[1]/*"]), data[1])
}

def fieldSearchData = [
	['Kode Lokasi Proyek', konsumen_kodeLokasi],
	['Kab/Kota', konsumen_kabKota],
	['Kelurahan', konsumen_kelurahan],
	['Economy Code', konsumen_economyCode],
	['Provinsi', konsumen_provinsi],
	['Kecamatan', konsumen_kecamantan],
	['Kode Pos', konsumen_kodePos]
]

for(data in fieldSearchData) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='${data[0]}']/following-sibling::div[1]/bcaf-autocomplete//input"]), data[1])
	WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='${data[0]}']/following-sibling::div[1]//ul[1]"]), 2)
	WebUI.delay(1)
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='${data[0]}']/following-sibling::div[1]//ul[1]"]))
}

// ---- Alamat Pengiriman Surat
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//input[@name='isAlamatPengirimanSurat' and @value='tidak']"]))
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//input[@formcontrolname='alamatPengirimanSurat' and @value='$konsumen_alamatPengirimanSurat']"]))
WebUI.setText(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formgroupname='alamatPengirimanSuratLainnya']//input[@formcontrolname='alamat']"]), konsumen_namaAlamatPengirimanSurat)

def alamatLainnyaValue = [
	['Provinsi', konsumen_provinsi],
	['Kab/Kota', konsumen_kabKota],
	['Kecamatan', konsumen_kecamantan],
	['Kelurahan', konsumen_kelurahan],
	['Kode Pos', konsumen_kodePos]
]

for (int i = 0; i <= 4; i++) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formgroupname='alamatPengirimanSuratLainnya']//div[@class='row']/div[${i + 2}]//input"]), alamatLainnyaValue[i][1])
	WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formgroupname='alamatPengirimanSuratLainnya']//*[text()='${alamatLainnyaValue[i][0]}']/following-sibling::div[1]//ul[1]"]), 2)
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formgroupname='alamatPengirimanSuratLainnya']//*[text()='${alamatLainnyaValue[i][0]}']/following-sibling::div[1]//ul[1]"]))
}

//---- Email dan Fax
def fieldData2 = [
	['email', konsumen_email],
	['phoneAreaCode2', konsumen_phoneAreaCode],
	['telepon2', konsumen_telepon1],
	['phoneAreaCode1', konsumen_phoneAreaCode],
	['telepon1', konsumen_telepon1],
	['faxAreaCode2', konsumen_faxAreaCode],
	['fax2', konsumen_fax],
	['faxAreaCode1', konsumen_faxAreaCode],
	['fax1', konsumen_fax]
]

for(data in fieldData2) {
	WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//input[@formcontrolname='${data[0]}']"]), data[1])
}
WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath)) + '/' + index  + '/' + 'skenario-tab-konsumen') + '.png', FailureHandling.STOP_ON_FAILURE)

// Halaman Resume AHU
switch(aplikasiBaru_badanUsaha) {
	case 'Perseroan Terbatas':
		WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Resume AHU' and @href='#tab-resumeahu']"]), 0)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Resume AHU' and @href='#tab-resumeahu']"]))
		break;
	case 'Comanditer Vernotschap (CV)':
		WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Resume Manual' and @href='#tab-resumemanual']"]), 0)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Resume Manual' and @href='#tab-resumemanual']"]))
		WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-tab-resume') + '.png', FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//bcaf-resume-manual//a[text()='Capture File']"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
		break;
}


WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Pengurus' and @href='#tab-pengurus']"]))


// buat DOB
def clickPrevious() {
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='‹']"]))
}
if(aplikasiBaru_badanUsaha=='Perseroan Terbatas') {
	WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Pemegang Saham' and @href='#tab-pemegangSaham']"]))
} else {
	// Halaman Pengurus
	switch(pengurus_isPengurus) {
		case "yes":
			WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@id='accordionPengurus']//*[text()=' Add']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@formarrayname='pengurus']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='Capture File']"]))
			CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), ktpPath)
	
			def fieldDataPengurus = [
				['Name', pengurus_nama],
				['Identity No', pengurus_nik],
				['Birth Place', pengurus_birthPlace],
				['SID Pengurus', pengurus_SID],
				['Alamat', pengurus_alamat]
			]
	
			for (data in fieldDataPengurus) {
				WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='row'][2]//*[text()='${data[0]}']/following-sibling::div[1]/*"]), 0, FailureHandling.STOP_ON_FAILURE)
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@class='row'][2]//*[text()='${data[0]}']/following-sibling::div[1]/*"]), data[1])
			}
	
			def fieldSearchDataPengurus = [
				['Provinsi', pengurus_provinsi],
				['Kecamatan', pengurus_kecamatan],
				['Kode Pos', pengurus_kodePos],
				['Kab/Kota', pengurus_kab],
				['Kelurahan', pengurus_kelurahan],
			]
	
			for(data in fieldSearchDataPengurus) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='${data[0]}']/following-sibling::div[1]//input"]), data[1])
				WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='${data[0]}']/following-sibling::div[1]//ul[1]"]), 2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='${data[0]}']/following-sibling::div[1]//ul[1]"]))
			}
	
			def fieldSearchDataRole = [
				['Role', pengurus_role],
				['Job Title', pengurus_jabatan],
			]
	
			for(data in fieldSearchDataRole) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='${data[0]}']/following-sibling::div[1]//input"]), data[1])
				WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='${data[0]}']/following-sibling::div[1]//div[@role='option']"]), 2)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@data-parent='#accordionPengurus']//*[text()='${data[0]}']/following-sibling::div[1]//div[@role='option']"]))
			}
	
			WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Birth Date']/following-sibling::div[1]//button"]), 0)
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='Birth Date']/following-sibling::div[1]//button"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='2025']"]))
	
			String[] dobComponents = pengurus_dob.split("-")
			String day = dobComponents[0]
			String month = dobComponents[1]
			int year = Integer.parseInt(dobComponents[2])
			
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			int difference = currentYear - year;
			double boxesToGoBack = (double) difference / 16;
			int decimalPart = (int) ((boxesToGoBack - (int) boxesToGoBack) * 10);
			
			if (decimalPart <= 4) {
				boxesToGoBack = Math.floor(boxesToGoBack);
			} else {
				boxesToGoBack = Math.ceil(boxesToGoBack);
			}
			
			for (int i = 0; i < boxesToGoBack; i++) {
				clickPrevious();
			}
			
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + year + "']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + month + "']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + day + "']"]))
	
		break;
	
		case "no":
		// continue to saham
		break;
	}
	WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index  + '/' + 'skenario-tab-pengurus') + '.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Pemegang Saham' and @href='#tab-pemegangSaham']"]), 0)
	WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Pemegang Saham' and @href='#tab-pemegangSaham']"]))
	
	// Halaman Pemegang Saham
	switch(saham_isPemegangSaham) {
		case "yes":
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='accordionPemegangSaham']//*[text()=' Add']"]))
		 String jenisSaham = saham_jenisPemegangSaham
			 switch(jenisSaham) {
				 case 'perorangan':
					 WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='form-check']//*[@value='perorangan']"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='modal-footer']//*[text()='OK']"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='pemegangSaham'][1]"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='pemegangSaham'][1]//*[text()='Capture File']"]))
					 CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
					 
					 def fieldDataPeroranganSaham = [
						 ['name', saham_nama],
						 ['identityNo', saham_nik],
						 ['birthPlace', saham_birthPlace],
						 ['alamat', saham_alamat]
					 ]
					 
					 for (data in fieldDataPeroranganSaham) {
						 WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//*[@formcontrolname='${data[0]}']"]), 0)
						 WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//*[@formcontrolname='${data[0]}']"]), data[1])
					 }
					 
					 def fieldSearchPeroranganSaham = [
						 ['Provinsi', saham_provinsi],
						 ['Kecamatan', saham_kecamatan],
						 ['Kode Pos', saham_kodepos],
						 ['Kab/Kota', saham_kab],
						 ['Kelurahan', saham_kelurahan],
					 ]
					 
					 for(data in fieldSearchPeroranganSaham) {
						 WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@data-parent='#accordionPemegangSaham']//*[text()='${data[0]}']/following-sibling::div[1]//input"]), data[1])
						 WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@data-parent='#accordionPemegangSaham']//*[text()='${data[0]}']/following-sibling::div[1]//ul/li[1]"]), 2)
						 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//div[@data-parent='#accordionPemegangSaham']//*[text()='${data[0]}']/following-sibling::div[1]//ul/li[1]"]))
					 }
					 
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//*[text()='Birth Date']/following-sibling::div[1]//button"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='2025']"]))
					 
					String[] dobComponents = saham_dob.split("-")
					String day = dobComponents[0]
					String month = dobComponents[1]
					int year = Integer.parseInt(dobComponents[2])
					
					int currentYear = Calendar.getInstance().get(Calendar.YEAR);
					int difference = currentYear - year;
					double boxesToGoBack = (double) difference / 16;
					int decimalPart = (int) ((boxesToGoBack - (int) boxesToGoBack) * 10);
					
					if (decimalPart <= 4) {
						boxesToGoBack = Math.floor(boxesToGoBack);
					} else {
						boxesToGoBack = Math.ceil(boxesToGoBack);
					}
					
					for (int i = 0; i < boxesToGoBack; i++) {
						clickPrevious();
					}
					 
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + year + "']"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + month + "']"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + day + "']"]))
					 
				 break;
				 
				 case 'korporasi':
					 WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='form-check']//*[@value='korporasi']"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='modal-footer']//*[text()='OK']"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='pemegangSaham'][1]"]))
					 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='pemegangSaham'][1]//*[text()='Capture File']"]))
					 CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
				  
					 WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//input[@formcontrolname='name']"]), 0)
					 WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//input[@formcontrolname='name']"]), saham_nama);
					 WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//input[@formcontrolname='noNpwp']"]), 0)
					 WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//input[@formcontrolname='noNpwp']"]), saham_npwp)
					 break;
				 }
		break;
		
		case "no":
		// lanjut ke halaman penjamin
		break;
	}
}

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index  + '/' + 'skenario-tab-saham') + '.png', FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Penjamin' and @href='#tab-penjamin']"]), 0)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Penjamin' and @href='#tab-penjamin']"]))

// Halaman Penjamin
switch(penjamin_isPenjamin) {
	case "yes":
		WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//input[@id='guarantor1']"]))
		switch(penjamin_jenisPenjamin) {
			case "korporasi":
			WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//input[@id='guarantorType2']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='penjamin-korporasi']//*[text()='Capture File']"]))
			CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
			
			def penjaminDataInsert = [
				['npwpNo', penjamin_npwp],
				['jenisUsaha', penjamin_jenisUsaha],
				['name', penjamin_nama ],
				['alamat', penjamin_alamat],
				['hubunganDebitur', penjamin_hubunganDebitur],
			]
			
			for(data in penjaminDataInsert) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='penjamin-korporasi']//*[@formcontrolname='${data[0]}']"]), data[1])
			}
			
			def penjaminDataSearch = [
				['Provinsi', penjamin_provinsi],
				['Kecamatan', penjamin_kecamatan],
				['Kode Pos', penjamin_kodepos],
				['Kab/Kota', penjamin_kab],
				['Kelurahan', penjamin_kelurahan],
			]
			
			for(data in penjaminDataSearch) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='penjamin-korporasi']//*[text()='${data[0]}']/following-sibling::div[1]//input"]), data[1])
				WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='penjamin-korporasi']//ul/li[text()='${data[1]}']"]), 1)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='penjamin-korporasi']//ul/li[text()='${data[1]}']"]))
			}
			break;
			
			case "perorangan":
			WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//input[@id='guarantorType1']"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='penjamin-korporasi']//*[text()='Capture File']"]))
			CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
			
			def penjaminDataInsert = [
				['name', penjamin_nama ],
				['alamat', penjamin_alamat],
				['hubunganDebitur', penjamin_hubunganDebitur],
				['identityNo', penjamin_peroranganNIK],
				['birthPlace', penjamin_peroranganTempatLahir],
				['alamat', penjamin_peroranganAlamat],
			]
			
			for(data in penjaminDataInsert) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='penjamin-korporasi']//*[@formcontrolname='${data[0]}']"]), data[1])
			}
			
			def penjaminDataSearch = [
			    ['Sex', penjamin_peroranganSex],
			    ['Marital Status', penjamin_peroranganMaritalStatus],
			    ['Religion', penjamin_peroranganReligion],
			    ['Identity Type', penjamin_peroranganIdentityType],
				['Provinsi', penjamin_provinsi],
				['Kecamatan', penjamin_kecamatan],
				['Kode Pos', penjamin_kodepos],
				['Kab/Kota', penjamin_kab],
				['Kelurahan', penjamin_kelurahan],
				['Occupation', penjamin_peroranganOccupation],
			]
			
			for(data in penjaminDataSearch) {
				WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='penjamin-korporasi']//*[text()='${data[0]}']/following-sibling::div[1]//input"]), data[1])
				WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='penjamin-korporasi']//ul/li[text()='${data[1]}']"]), 1)
				WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='penjamin-korporasi']//ul/li[text()='${data[1]}']"]))
			}
			
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@formarrayname='pemegangSaham'][1]//*[text()='Birth Date']/following-sibling::div[1]//button"]))
			WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='2025']"]))
			 
			String[] dobComponents = penjamin_peroranganDOB.split("-")
			String day = dobComponents[0]
			String month = dobComponents[1]
			int year = Integer.parseInt(dobComponents[2])
			
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			int difference = currentYear - year;
			double boxesToGoBack = (double) difference / 16;
			int decimalPart = (int) ((boxesToGoBack - (int) boxesToGoBack) * 10);
			
			if (decimalPart <= 4) {
				boxesToGoBack = Math.floor(boxesToGoBack);
			} else {
				boxesToGoBack = Math.ceil(boxesToGoBack);
			}
			
			for (int i = 0; i < boxesToGoBack; i++) {
				clickPrevious();
			}
			 
			 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + year + "']"]))
			 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + month + "']"]))
			 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + day + "']"]))
			 
			break;
		}
	break;
	
	case "no":
	WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//input[@id='guarantor2']"]))
	// ke halaman financial
	break;
}

WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Financial' and @href='#tab-financial']"]))

// Halaman Financial
def handleFileUpload(String filePurpose, String filePath) {E
	WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='accordion_financial']/div[contains(., '" + filePurpose + "')]//*[text()='Capture File']"]),FailureHandling.STOP_ON_FAILURE)
	CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
}

switch(financial_haveFinancialDocuments) {
	case "yes":
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "(//button[@data-target='#npwp-document'])[2]"]),FailureHandling.CONTINUE_ON_FAILURE)
		
		handleFileUpload('Laporan Keuangan', filePath)
		handleFileUpload('Bukti Kepemilikan Rekening', filePath)
		
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordion_financial']//*[@formcontrolname='bcaBranch']"]), financial_BCABranch)
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordion_financial']//*[@formcontrolname='accountNoBca']"]), financial_rekNum)
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordion_financial']//*[@formcontrolname='accountNoOtherBank']"]), financial_rekOtherNum)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordion_financial']//*[@formcontrolname='otherBank']"]))
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='$financial_otherBank']"]))
		break;
	
	case "no":
		break;
}

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-tab-penjamin') + '.png', FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Contact Person' and @href='#tab-contact-person']"]), 0)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Contact Person' and @href='#tab-contact-person']"]))

// Halaman Contact Person
switch(CP_hasOtherContactPerson) {
	case "yes":
		WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='tab-contact-person'][1]//input[@value='ya']"]))
		
		def fieldsCP = [
		    ['field': 'name', 'value': CP_contactName],
		    ['field': 'address', 'value': CP_contactAddress],
		    ['field': 'phoneAreaCode', 'value': CP_prefixTelephone],
		    ['field': 'telephone', 'value': CP_contactTelephone],
		    ['field': 'relationshipDebitor', 'value': CP_contactRelationship]
		]
		
		fieldsCP.each { field ->
		    WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath': "//*[@id='tab-contact-person'][1]//*[@formcontrolname='${field.field}']"]), field.value)
		}
		
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='tab-contact-person'][1]//div[@class='row']/div[3]//input"]), CP_contactKab)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='tab-contact-person'][1]//div[@class='row']/div[3]//input/following-sibling::ul/li[1]"]))
		
		WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='tab-contact-person'][1]//div[@class='row']/div[4]//input"]), CP_contactPostalCode)
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='tab-contact-person'][1]//div[@class='row']/div[4]//input/following-sibling::ul/li[1]"]))
		break;
	case "no":
		WebUI.check(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='tab-contact-person'][1]//input[@value='tidak']"]))
		break;
}

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index  + '/' + 'skenario-tab-contactPerson') + '.png', FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Other Document' and @href='#tab-other-document']"]), 0)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='Other Document' and @href='#tab-other-document']"]))

// Halaman Other Document
switch(OD_isOtherDocument) {
	case "yes":
	break;
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='document-type-accordion']//*[text()=' Add']"]))
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='otherDocument'][1]"]))
		WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='otherDocument'][1]//*[text()='Capture File']"]))
		CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), filePath)
	case "no":
	break;
}

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-tab-otherDocument') + '.png', FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='BO' and @href='#tab-bo']"]), 0)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[text()='BO' and @href='#tab-bo']"]))

// Halaman BO
def clickPrevious2() {
	WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "(//*[text()='‹'])[3]"]))
}
switch(BO_isBO) {
	case "yes":
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='accordionBO']//*[@id='isHaveBO1']"]))
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@formarrayname='bo']"]))
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='accordionBO']//*[@formcontrolname='nationality' and @value='WNI']"]))
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='accordionBO']//*[text()='Capture File']"]))
	 CustomKeywords.'popup.popup.uploadFile'(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//modal-container//button[2]"]), ktpPath)
	 
	 def fieldsBO = [
		 ['field': 'name', 'value': BO_nameBo],
		 ['field': 'identityNo', 'value': BO_identityNoBo],
		 ['field': 'birthPlace', 'value': BO_birthPlaceBo]
	 ]
	 
	 fieldsBO.each { field ->
		 WebUI.waitForElementClickable(findTestObject('Object Repository/xpath_dynamic', ['xpath': "//*[@id='accordionBO']//*[@formcontrolname='${field.field}']"]), 0)
		 WebUI.setText(findTestObject('Object Repository/xpath_dynamic', ['xpath': "//*[@id='accordionBO']//*[@formcontrolname='${field.field}']"]), field.value)
	 }
	 
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[@id='accordionBO']//*[text()='Birth Date']/following-sibling::div[1]//button"]))
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='2025']"]))
	 
	 	String[] dobComponents = BO_dob.split("-")
		String day = dobComponents[0]
		String month = dobComponents[1]
		int year = Integer.parseInt(dobComponents[2])
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int difference = currentYear - year;
		double boxesToGoBack = (double) difference / 16;
		int decimalPart = (int) ((boxesToGoBack - (int) boxesToGoBack) * 10);
		
		if (decimalPart <= 4) {
		    boxesToGoBack = Math.floor(boxesToGoBack);
		} else {
		    boxesToGoBack = Math.ceil(boxesToGoBack);
		}
		
		for (int i = 0; i < boxesToGoBack; i++) {
		    clickPrevious2();
		}

	 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + year + "']"]))
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='" + month + "']"]))
	 WebUI.waitForElementVisible(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//span[@class='ng-star-inserted' and text()='" + day + "']"]),0)
	 WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//span[@class='ng-star-inserted' and text()='" + day + "']"]))
	 
	break;
	
	case "no":
	WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//*[@id='accordionBO']//*[@id='isHaveBO2']"]))
	break;
}

WebUI.takeScreenshot((((baseDir + GlobalVariable.me1WebScreenshotPath))+ '/' + index + '/' + 'skenario-tab-BO') + '.png', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/xpath_dynamic',['xpath' : "//div[@class='button-save-draft']"]))
