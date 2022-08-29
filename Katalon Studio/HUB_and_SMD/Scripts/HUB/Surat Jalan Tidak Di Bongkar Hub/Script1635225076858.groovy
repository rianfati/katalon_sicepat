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

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_Nama Pengguna_username'),
	'20010251')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_Kata Sandi_password'),
	'lStry6Xr/r2oGqliF0dgpQ==')

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/button_Masuk'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/div_Hub_mediumCreated with SketchHub'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/a_cls-1fill231f20iconSurat Jalan Gabungan P_da4132'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/div_Pilih Gerai'))

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_Gerai Tujuan_react-select-2-input'),
	'bekasi s')

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/div_1209004 - Bekasi Selatan'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/div_Pilih Karyawan'))

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_Karyawan_react-select-5-input'),
	'ikba')

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/div_20010251 - Ikbal Ramdani'))

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_Mobil_vehicleNumber'), 'B')

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/textarea_B'), 'B')

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/span_Selanjutnya'))

WebUI.click(findTestObject('HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_concat(Scan atau Tekan tombol   Selan_6f1b63'))

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/input_concat(Scan atau Tekan tombol   Selan_6f1b63'),
	'8254331001')

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/span_Input Gabung Paket Manual'))

WebUI.setText(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/textarea_5145543001'), '9562680001')

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/span_Simpan'))

WebUI.click(findTestObject('Object Repository/HUB/Surat Jalan Tidak Di Bongkar/Page_TMS/span_Copy'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('HUB/Surat Jalan Tidak Di Bongkar/selesai tidak di bongkar'))

WebUI.closeBrowser()

