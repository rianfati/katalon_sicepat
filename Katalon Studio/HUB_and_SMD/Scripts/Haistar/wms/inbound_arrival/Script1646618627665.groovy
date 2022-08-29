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

WebUI.callTestCase(findTestCase('Haistar/wms/login_wms'), null)

WebUI.click(findTestObject('Object Repository/inbound/inboundv2_menu'))

WebUI.click(findTestObject('Object Repository/inbound/arrivalv2_menu'))

WebUI.click(findTestObject('Object Repository/inbound/dropdown_action_arrival_button'))

WebUI.click(findTestObject('Object Repository/inbound/arrival_create_menu'))

WebUI.setText(findTestObject('Object Repository/inbound/arrival_courier_field'), 'sicepat')

WebUI.setText(findTestObject('Object Repository/inbound/arrival_driver_name_field'), 'sicepat')

WebUI.setText(findTestObject('Object Repository/inbound/arrival_driver_phone_field'), 'sicepat')

WebUI.setText(findTestObject('Object Repository/inbound/arrival_driver_vehicle_field'), 'sicepat')

WebUI.setText(findTestObject('Object Repository/inbound/arrival_license_plate_field'), 'sicepat')

WebUI.click(findTestObject('Object Repository/inbound/arrival_next_button'))

WebUI.setText(findTestObject('Object Repository/inbound/arrival_purchase_code'), 'sicepat')

WebUI.click(findTestObject('Object Repository/inbound/arrival_save_button'))

WebUI.click(findTestObject('Object Repository/inbound/arrival_finish_button'))

WebUI.delay(3)

