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

WebUI.callTestCase(findTestCase('Haistar/eos/login_eos'), null)

WebUI.click(findTestObject('Object Repository/eos/eos_wh'))

WebUI.click(findTestObject('Object Repository/eos/eos_wh_value'))

WebUI.click(findTestObject('Object Repository/eos/eos_client'))

WebUI.click(findTestObject('Object Repository/eos/eos_client_value'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_menu'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_drop_down_button'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_create'))

String a

a = WebUI.getAttribute(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_po_code'), 'value')

println a

GlobalVariable.pocode = a

println GlobalVariable.pocode

WebUI.setText(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_supplier_name'), 'TOKOPEDIA')

WebUI.setText(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_buying_price'), '1000')

WebUI.setText(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_item_name'), 'GREENWOOD')

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_item_name_selected'))

WebUI.setText(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_purchase_quantity'), '100')

WebUI.setText(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_purchase_stock_name'), 'TOKOP')

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_purchase_stock_name_selected'))

WebUI.setText(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_purchase_vehicle'), 'MOBIL')

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_inbound_date'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_inbound_date_today'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_button_save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_detail_button_finish'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_view_button'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_view_approve'))

WebUI.delay(3)
