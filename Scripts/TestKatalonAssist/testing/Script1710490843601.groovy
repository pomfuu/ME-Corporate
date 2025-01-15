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



// can you make code below as a def function instead
//String[] dobComponents = penjamin_peroranganDOB.split("-")
//String day = dobComponents[0]
//String month = dobComponents[1]
//int year = Integer.parseInt(dobComponents[2])
//
//int currentYear = Calendar.getInstance().get(Calendar.YEAR);
//int difference = currentYear - year;
//double boxesToGoBack = (double) difference / 16;
//int decimalPart = (int) ((boxesToGoBack - (int) boxesToGoBack) * 10);
//
//if (decimalPart <= 4) {
//	boxesToGoBack = Math.floor(boxesToGoBack);
//} else {
//	boxesToGoBack = Math.ceil(boxesToGoBack);
//}
//
//for (int i = 0; i < boxesToGoBack; i++) {
//	clickPrevious();
//}


// i wanted to make the penjamin_perorangan to be passing parameter
public static void adjustBoxesToGoBack(String dob) {
	String[] dobComponents = dob.split("-")
	String day = dobComponents[0]
	String month = dobComponents[1]
	int year = Integer.parseInt(dobComponents[2])

	int currentYear = Calendar.getInstance().get(Calendar.YEAR)
	int difference = currentYear - year
	double boxesToGoBack = (double) difference / 16
	int decimalPart = (int) ((boxesToGoBack - (int) boxesToGoBack) * 10)

	if (decimalPart <= 4) {
		boxesToGoBack = Math.floor(boxesToGoBack)
	} else {
		boxesToGoBack = Math.ceil(boxesToGoBack)
	}

	for (int i = 0; i < boxesToGoBack; i++) {
		WebUI.click(findTestObject('Object Repository/xpath_dynamic', ['xpath' : "//*[text()='‹']"]))
	}
}

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
	clickPrevious();
}