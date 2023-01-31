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

Windows.startApplication('C:/Program Files/Microsoft Office/Office16/EXCEL.EXE')	
Windows.click(findWindowsObject('Object Repository/Excel/Blank workbook HyperLink'))

Windows.click(findWindowsObject('Object Repository/Excel/DropDown Font Size Menu button'))
Windows.sendKeys(findWindowsObject('Object Repository/Excel/Edit Font Size ComboBox'), '18' + Keys.ENTER)
Thread.sleep(3000)

Windows.click(findWindowsObject('Object Repository/Excel/Cell Address DropDown button'))
ArrayList<String> listWantedKeys = new ArrayList<String>()
listWantedKeys.add('A6' + Keys.ENTER)
listWantedKeys.add('A7' + Keys.ENTER)
listWantedKeys.add('A8' + Keys.ENTER)

for (String key:listWantedKeys) {
	Windows.sendKeys(findWindowsObject('Object Repository/Excel/Cell Address Location ComboBox'), key)
	Windows.sendKeys(findWindowsObject('Object Repository/Excel/DataGrid for Content Modification'), 'Hello World' + Keys.ENTER, FailureHandling.STOP_ON_FAILURE)
	Thread.sleep(1000)
}

//wantedKey = 'C6' + Keys.ENTER
//Windows.sendKeys(findWindowsObject('Object Repository/Excel/Cell Address Location ComboBox'), wantedKey)



