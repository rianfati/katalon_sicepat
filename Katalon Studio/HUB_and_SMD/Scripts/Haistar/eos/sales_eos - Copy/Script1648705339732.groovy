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

int i
for(i=0; i<=3; i++){
	


WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_menu'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_drop_down_button'))

WebUI.click(findTestObject('Object Repository/eos/purchase/eos_purchase_create'))

String a

a = WebUI.getAttribute(findTestObject('Object Repository/eos/sales/eos_sales_detail_so_code'), 'value')

println a

GlobalVariable.pocode = a

println GlobalVariable.pocode

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_channel'), 'MULTI')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_channel_selected'))

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_courier'), 'JNE')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_courier_selected'))

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_payment_type'))

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_payment_type_selected'))

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_shipping_price'), '1000')

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_recipient_name'), 'RIAN RECIPIENT')

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_recipient_phone'), '08999223453')

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_shipping_recipient_address'), 'MAWAR')

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_shipping_recipient_district'), 'TAJUR')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_shipping_recipient_district_selected'))

def random = ((Math.random() * 1000000000) as int)

String b
b = 'b2b_remark_rian_training_6'

println b

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_remark'), b)

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_next_button'))

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code'), 'SCMBG')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code_selected'))

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code_qty'), '23')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_save_button'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code'), 'MINUM')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code_selected2'))

WebUI.setText(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code_qty'), '33')

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_save_button'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_item_code'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_finish_button'))

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_detail_finish_confirm_button'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_menu'))

WebUI.click(findTestObject('Object Repository/eos/sales/eos_sales_menu_push_order_button'))
}

