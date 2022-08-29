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

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input_Nama Pengguna_username'), '20010251')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input_Kata Sandi_password'),
	'lStry6Xr/r2oGqliF0dgpQ==')

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/button_Masuk'))

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/div_Hub_mediumCreated with SketchHub'))

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/div_Sortiran Non Transit'))

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/a_Assign Ulang Gabungan SortirAssign Ulang _b3c550'))

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/div_Pilih Gerai'))

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input_Gerai_react-select-2-input'),
	'bekasi')

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/div_1209016 - Bekasi Babelan'))

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input_Mobil_doPodNumber'), 'b')

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/div_Pilih Karyawan'))

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input_Karyawan_react-select-4-input'),
	'ikbal')

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/div_20010251 - Ikbal Ramdani'))

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/textarea_b'), 'b')

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input__scanValue'), 'S873680004')

WebUI.sendKeys(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/input__scanValue'), Keys.ENTER.toString())

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/span_Input Gabung Sortir Manual'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/textarea_S048951003'), 'MS65179001')

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/span_Simpan'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/HUB/Assign ulang SJ sortir/Page_TMS/span_Copy'))

WebUI.click(findTestObject('HUB/Assign ulang SJ sortir/selesai assign'))

WebUI.closeBrowser()

