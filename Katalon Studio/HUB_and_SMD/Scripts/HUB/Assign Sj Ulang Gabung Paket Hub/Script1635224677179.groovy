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

WebUI.setText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input_Nama Pengguna_username'), '20010251')

WebUI.setEncryptedText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input_Kata Sandi_password'), 'lStry6Xr/r2oGqliF0dgpQ==')

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/button_Masuk'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/div_Hub_mediumCreated with SketchHub'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/a_Assign Ulang Gabungan PaketAssign Ulang G_9c4fac'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_Tanggal Keluar_pi pi-calendar p-c p-bu_00291b'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_1'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_26'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_Tanggal Keluar_pi pi-calendar p-c p-bu_00291b'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/div_Pilih Gerai'))

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/div_A3401001 - Abepura'))

WebUI.setText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input_Mobil_doPodNumber'), 'B')

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/div_Pilih Karyawan'))

WebUI.click(findTestObject('HUB/Assign Ulang Gabung Paket/Page_TMS/div_19040235-Adam_Husen'))

//WebUI.setText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/textarea_B'), 'B')

WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/div_A3401001 - Abepura2'))



//WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input__scanValue'))
//
//WebUI.comment('gabung paket yang sudah ada SJ')
//
//WebUI.setText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input__scanValue'), '6172402001')
//
//WebUI.sendKeys(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/input__scanValue'), Keys.ENTER.toString())
//
//WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_Input Gabung Paket Manual'))
//
//WebUI.comment('gabung paket yang sudah ada SJ')
//
//WebUI.setText(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/textarea_9540422001'), '5145543001')
//
//WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_Simpan'))
////
////WebUI.takeScreenshot()
////
////WebUI.click(findTestObject('Object Repository/HUB/Assign Ulang Gabung Paket/Page_TMS/span_Copy'))
////
////WebUI.click(findTestObject('HUB/Assign Ulang Gabung Paket/Simpan finish'))
////
////WebUI.closeBrowser()



