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

WebUI.callTestCase(findTestCase('Test Cases/login_odoo'), null)

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Discuss - Odoo/a_Discuss_full'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Discuss - Odoo/img_Discuss_o-app-icon'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Dashboard - Odoo/a_Configuration'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Dashboard - Odoo/a_Warehouse'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Warehouse - Odoo/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_New - Odoo/input_Nama_name'), 'Warehouse_1')

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_New - Odoo/input_PIC Warehouse_o_field_input_758'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_New - Odoo/a_Agusta'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_New - Odoo/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Warehouse_1 - Odoo/span_Action'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Warehouse_1 - Odoo/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Odoo/create_warehouse/Page_Warehouse_1 - Odoo/span_Ok'))

WebUI.closeBrowser()

