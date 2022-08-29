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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tms-staging.sicepat.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/input_Nama Pengguna_username'), '21090004')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/input_Kata Sandi_password'), 'zKlXwDj8em+P03289SfqqQ==')

WebUI.click(findTestObject('Object Repository/print_resi/print_resi/button_Masuk'))

WebUI.click(findTestObject('Object Repository/print_resi/print_resi/button_Masuk_1'))

WebUI.navigateToUrl('https://tms-staging.sicepat.com/dashboard')

WebUI.click(findTestObject('Object Repository/print_resi/Page_DASHBOARD/a_Print Pickup Resi'))

WebUI.setText(findTestObject('Object Repository/print_resi/Page_Print Pickup Resi/input_Print Pickup Resi_awb_scan'), '000097882881')

WebUI.click(findTestObject('Object Repository/print_resi/Page_Print Pickup Resi/button_Print'))

WebUI.delay(5)

