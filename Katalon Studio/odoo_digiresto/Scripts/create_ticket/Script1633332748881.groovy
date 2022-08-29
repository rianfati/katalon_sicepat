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

WebUI.callTestCase(findTestCase('Test Cases/login'), null)

WebUI.navigateToUrl('http://43.230.7.171/web#action=100&active_id=mail.box_inbox&cids=1&menu_id=82')

WebUI.click(findTestObject('Object Repository/create_ticket/Page_Discuss - Odoo/i_Discuss_fa fa-th-large'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_Discuss - Odoo/img_Discuss_o-app-icon'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_Dashboard - Odoo/span_Tickets'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_Tickets - Odoo/span_Create'))

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Archived_name'), 'ticket_digiresto2')

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Tags_o_field_input_743'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/a_Functional'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_RC date_rc_create_date'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/td_4'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/span_Dec_fa fa-check primary'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Ticket Source_o_field_input_747'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/a_Web'))

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_No Tracking_no_resi'), 'tracking0002')

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_No Sociomile_no_ticket_sociomile'), 
    'sociomile002')

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Team_o_field_input_751'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/a_Helpdesk'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Tags_o_field_input_743'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/a_Hard'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_CC Tracer_o_field_input_753'))

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/a_Joel Willis'))

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Merchant_merchant_name'), 'tokopedia')

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Phone Merchant_merchant_phone'), '08111111111')

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Buyer_buyer_name'), 'shopee')

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/input_Phone Buyer_buyer_phone'), '082222222')

WebUI.setText(findTestObject('Object Repository/create_ticket/Page_New - Odoo/div_desciption01'), '<p style="">desciption01</p>')

WebUI.click(findTestObject('Object Repository/create_ticket/Page_New - Odoo/span_Save'))

