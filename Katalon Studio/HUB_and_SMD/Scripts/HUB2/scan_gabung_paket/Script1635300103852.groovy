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
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testobject.RequestObject
import org.openqa.selenium.Keys as Keys


def request = (RequestObject) findTestObject('Object Repository/HUB2/get_bag_number')
def response = WS.sendRequest(request)
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())
def bag_number = (result.bag[0].bag_number)+ "001"
def no_resi = result.bag[0].bag_item[0].bag_item_awb[0].awb_number
println bag_number
println no_resi

//SCAN GABUNG PAKET

WebUI.openBrowser('')

WebUI.navigateToUrl('https://festaging.sicepat.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input_Nama Pengguna_username'), '21090004')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input_Kata Sandi_password'), 'zKlXwDj8em+P03289SfqqQ==')

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/button_Masuk'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/div_Hub_mediumCreated with SketchHub'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/p_Hub'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/a_Hub - Scan masuk gabung paketCreated with_e15f07'))

WebUI.setText(findTestObject('HUB2/scan_gabung_paket/Page_TMS/field_bag_number'),
	bag_number)

WebUI.sendKeys(findTestObject('HUB2/scan_gabung_paket/Page_TMS/field_bag_number'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HUB2/scan_gabung_paket/Page_TMS/span_Selesai'))

//CEK GABUNG PAKET

WebUI.setText(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/input_p-btn_p-inputtext p-component'), bag_number)

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/span_p-btn_pi pi-search p-c p-button-icon-left'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/td_DO_HUB'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/x_button'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/div_Daftar'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/a_Daftar Scan Masuk Hub'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/span_Tampilkan'))

WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/td_Resi050052113995'))

WebUI.closeBrowser()