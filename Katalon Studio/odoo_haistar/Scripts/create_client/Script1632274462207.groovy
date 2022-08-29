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

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_Discuss - Odoo/i_Discuss_fa fa-th-large'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_Discuss - Odoo/img_Discuss_o-app-icon'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_Dashboard - Odoo/a_Configuration'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_Dashboard - Odoo/span_Client'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_Client - Odoo/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Company_o_field_input_854'), 
    'client_individual1')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Address_street'), 'jl sudirman')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Address_city'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Address_o_field_input_849'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/a_Aomori (JP)'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Job Position_function'), 'sales')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Phone_phone'), '08181818181')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Mobile_mobile'), '08282828282')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Email_email'), 'clientindividual1@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Website Link_website'), 'www.clientindividual1.com')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Title_o_field_input_832'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/a_Madam'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/input_Tags_o_field_input_834'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/a_Consulting Services'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_client_individual1 - Odoo/span_Action'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_client_individual1 - Odoo/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_client_individual1 - Odoo/span_Ok'))

WebUI.closeBrowser()

