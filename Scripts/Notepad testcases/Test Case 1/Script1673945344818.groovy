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


number = CustomKeywords.'com.test.customkeyword.CustomFunction.generateRandomNumber'(1000)
fileName = 'notepad' + number + '.txt'

Windows.startApplicationWithTitle('C:/windows/system32/notepad.exe', '')

Windows.sendKeys(findWindowsObject('Object Repository/Notepad App/Edit Text'), 'This is text from Katalon')

Windows.click(findWindowsObject('Object Repository/Notepad App/Menu-File'))

Windows.switchToWindow(findWindowsObject('Object Repository/Notepad App/Window Modification Notepad'))

Windows.click(findWindowsObject('Object Repository/Notepad App/File-Save As button by Name'))

Windows.setText(findWindowsObject('Object Repository/Notepad App/Edit Filename'), fileName)

Windows.click(findWindowsObject('Object Repository/Notepad App/Save Button in windows Save as'))

Windows.closeApplication()

