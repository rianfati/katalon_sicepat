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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://demo.guru99.com/test/newtours/register.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('web/FirstName'), 'Budi')

WebUI.setText(findTestObject('web/LastName'), 'Anduk')

WebUI.setText(findTestObject('web/Phone'), '0872345667')

WebUI.setText(findTestObject('web/Email'), 'user.mail@mail.com')

WebUI.setText(findTestObject('web/Address'), 'jalan mawar')

WebUI.setText(findTestObject('web/City'), 'Bogor')

WebUI.setText(findTestObject('web/Province'), 'Jawa Barat')

WebUI.setText(findTestObject('web/Postal'), '83233')

WebUI.selectOptionByLabel(findTestObject('web/Country'), 'INDONESIA', false)

WebUI.setText(findTestObject('web/UserName'), 'testuser1')

WebUI.setText(findTestObject('web/Password'), 'Test123!')

WebUI.setText(findTestObject('web/ConfirmPassword'), 'Test123!')

WebUI.click(findTestObject('web/Submit'))