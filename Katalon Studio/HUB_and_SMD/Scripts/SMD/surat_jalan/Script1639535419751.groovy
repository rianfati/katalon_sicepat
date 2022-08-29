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

WebUI.navigateToUrl('https://festaging.sicepat.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_Nama Pengguna_username'), '21090004')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_Kata Sandi_password'), 
    'zKlXwDj8em+P03289SfqqQ==')

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/button_Masuk'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/div_Hub_mediumCreated with SketchHub'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/p_Hub'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/p_Sortiran Non Transit'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/a_Buat Gabungan SortirBuat Gabungan Sortir'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/input__value'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/input__value'),'1402006')
WebUI.delay(15)

WebUI.sendKeys(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/input__value'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/input__value_1'), '000024335026')

WebUI.sendKeys(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/input__value_1'), Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/div_SS10XNO022'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/span_Selesai'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/p_Daftar'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/a_cls-1fill231f20iconSurat Jalan Gabungan Sortir'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/div_Pilih Gerai'))

WebUI.setText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_Gerai Tujuan_react-select-11-input'), 
    'solo')

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/div_1402008 - Line Haul Solo'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/svg_Pilih Karyawan_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/div_17050029 - Aan Edi Suprianto Update'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_Mobil_vehicleNumber'))

WebUI.setText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_Mobil_vehicleNumber'), 'DD120DK')

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/span_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_concat(Scan atau Tekan tombol   Selan_a5f0eb'), 
    'SS10XNO022')

WebUI.sendKeys(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input_concat(Scan atau Tekan tombol   Selan_a5f0eb'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/span_Selesai'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/a_Daftar Surat Jalan Gabungan Sortir'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/span_Tampilkan'))

WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/span_DOP211029NMCY4729'))

WebUI.closeBrowser()

