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

//WebUI.callTestCase(findTestCase('Haistar/wms/login_wms'), null)

WebUI.click(findTestObject('Object Repository/inbound/qcv2_menu'))

WebUI.click(findTestObject('Object Repository/inbound/unloadingv2_menu'))

WebUI.click(findTestObject('Object Repository/inbound/unloadingv2_searchby'))

WebUI.click(findTestObject('Object Repository/inbound/unloadingv2_searchby_purchasecode'))

WebUI.setText(findTestObject('Object Repository/inbound/unloadingv2_searchby_purchasecode_field'), 'PO202202082')

WebUI.click(findTestObject('Object Repository/inbound/unloadingv2_searchbutton'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/inbound/qcv2_updatebutton'))

WebUI.click(findTestObject('Object Repository/inbound/qcv2_detail_type'))

WebUI.click(findTestObject('Object Repository/inbound/qcv2_updatebutton'))

WebUI.click(findTestObject('Object Repository/inbound/qcv2_detail_type'))

WebUI.click(findTestObject('Object Repository/inbound/qcv2_detail_type_value'))

WebUI.setText(findTestObject('Object Repository/inbound/qcv2_detail_lp'), 'PO202202082')

WebUI.click(findTestObject('Object Repository/inbound/qcv2_detail_method'))

WebUI.click(findTestObject('Object Repository/inbound/qcv2_detail_method_value'))

WebUI.setText(findTestObject('Object Repository/inbound/qcv2_detail_barcode'), 'PO202202082')

WebUI.setText(findTestObject('Object Repository/inbound/qcv2_detail_qc_quantity'), '100')

WebUI.click(findTestObject('Object Repository/inbound/unloadingv2_detail_savebutton'))

WebUI.click(findTestObject('Object Repository/inbound/qcv2_detail_finish_lp_button'))

WebUI.delay(3)


