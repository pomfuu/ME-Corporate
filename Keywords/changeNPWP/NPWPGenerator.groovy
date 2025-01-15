package changeNPWP

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.util.Timer;
import java.util.TimerTask;

public class NPWPGenerator {
	private static String startingNPWP = "856745874747570";
	private static String currentNPWP = startingNPWP;
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new NPWPTask(), 0, 100);
	}

	static class NPWPTask extends TimerTask {
		@Override
		public void run() {
			currentNPWP = generateIncrementingNPWP();
			System.out.println(currentNPWP);
		}
	}

	static String generateIncrementingNPWP() {
		StringBuilder npwpBuilder = new StringBuilder();
		for (int i = 0; i < currentNPWP.length(); i++) {
			char currentDigit = currentNPWP.charAt(i);
			int incrementedDigit = Character.getNumericValue(currentDigit) + 1;
			if (incrementedDigit > 9) {
				incrementedDigit = 0;
			}
			npwpBuilder.append(incrementedDigit);
		}
		return npwpBuilder.toString();
	}
}

