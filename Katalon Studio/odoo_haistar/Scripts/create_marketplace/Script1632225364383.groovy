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

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Discuss - Odoo/i_Discuss_fa fa-th-large'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Discuss - Odoo/img_Discuss_o-app-icon'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Dashboard - Odoo/a_Configuration'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Dashboard - Odoo/span_Marketplace'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Marketplace - Odoo/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Company_o_field_input_818'), 
    'Marketplace Title 1')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Address_street'), 'Jl Sudirman')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Address_city'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Address_o_field_input_813'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/a_Aomori (JP)'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Address_zip'), '23122')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Tax ID_o_field_input_788'), 
    'taxid12345')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Job Position_function'), 
    'Sales')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Phone_phone'), '08181818181')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Mobile_mobile'), '08282828282')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Email_email'), 'marketplace1@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Website Link_website'), 
    'www.marketplace1.com')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Title_o_field_input_796'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/a_Madam'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_New - Odoo/input_Tags_o_field_input_798'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/a_Consulting Services'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_client/Page_New - Odoo/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Marketplace Title 1 - Odoo/span_Action'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Marketplace Title 1 - Odoo/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_marketplace/Page_Marketplace Title 1 - Odoo/span_Ok'))

WebUI.closeBrowser()

