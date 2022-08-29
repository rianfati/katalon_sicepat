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

WebUI.callTestCase(findTestCase("Test Cases/login_odoo"), null)

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_Discuss - Odoo/i_Discuss_fa fa-th-large'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_Discuss - Odoo/img_Discuss_o-app-icon'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_Dashboard - Odoo/span_Tickets'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_Tickets - Odoo/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input__name'), 'ticket1')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Team_o_field_input_746'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_Store Ops'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Assigned user_o_field_input_747'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_Agusta'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_Priority_o_priority_star fa fa-star'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Channel_o_field_input_750'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_Web'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_No SKU_no_sku'), 'sku0101')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Warehouse_o_field_input_752'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_WH BANDUNG'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Tags_o_field_input_754'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_Kurang Kirim'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Marketplace_o_field_input_755'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_Agen Digital'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/input_Client_o_field_input_756'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/a_360ELECTRIC'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_ticket/Page_New - Odoo/div_description0101'), '<p style="">description0101</p>')

WebUI.closeBrowser()

