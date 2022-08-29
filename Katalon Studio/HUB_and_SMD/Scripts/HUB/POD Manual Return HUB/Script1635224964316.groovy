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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://festaging.sicepat.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/input_Nama Pengguna_username'), '20010251')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/input_Kata Sandi_password'), 'lStry6Xr/r2oGqliF0dgpQ==')

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/button_Masuk'))

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/div_Hub_mediumCreated with SketchHub'))

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/a_POD ManualPOD Manual'))

WebUI.check(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/input_Tidak_isProblem'))

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/div_Pilih Status'))

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/div_RTN - RETUR PUSAT'))

WebUI.setText(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/textarea_b'), 'b')

WebUI.doubleClick(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/input_concat(Scan atau Tekan tombol   Selan_1c7cf5'))

WebUI.setText(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/input_concat(Scan atau Tekan tombol   Selan_1c7cf5'),
	'000241035211')

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/button_Selanjutnya'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/HUB/POD MANUAL RETURN/Page_TMS/span_Simpan'))

WebUI.closeBrowser()

