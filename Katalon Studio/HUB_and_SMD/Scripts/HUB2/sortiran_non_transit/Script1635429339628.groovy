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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://festaging.sicepat.com/login')
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/input_Nama Pengguna_username'), '21090004')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/input_Kata Sandi_password'), 'zKlXwDj8em+P03289SfqqQ==')
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/button_Masuk'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/button_Masuk_1'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/div_Hub_mediumCreated with SketchHub'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/p_Hub'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/p_Sortiran Non Transit'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/a_Buat Gabungan SortirBuat Gabungan Sortir'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input__value'))
//
//WebUI.setText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input__value'), '1402008')
//
//WebUI.sendKeys(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input__value'), Keys.ENTER.toString())
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input__value_1'), no_resi)
//
//WebUI.delay(2)
//
//WebUI.sendKeys(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/input__value_1'), Keys.ENTER.toString())
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/span_Selesai'))
//
//WebUI.delay(2)
//
//WebUI.closeBrowser()
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://festaging.sicepat.com/login')
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/input_Nama Pengguna_username'), '21090004')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/input_Kata Sandi_password'), 'zKlXwDj8em+P03289SfqqQ==')
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/button_Masuk'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/button_Masuk_1'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gsk/Page_TMS/div_Hub_mediumCreated with SketchHub'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/scan_gabung_paket/Page_TMS/p_Hub'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/p_Sortiran Non Transit'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/p_Daftar'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/a_Daftar Gabung Sortir'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/span_Tampilkan'))
//
//WebUI.click(findTestObject('Object Repository/HUB2/sortiran_non_transit/Page_TMS/td_Gabung SortirSS73E13V5T'))
//
//WebUI.closeBrowser()



