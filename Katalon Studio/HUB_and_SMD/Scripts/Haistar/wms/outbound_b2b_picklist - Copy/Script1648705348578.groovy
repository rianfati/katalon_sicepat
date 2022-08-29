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

WebUI.click(findTestObject('Object Repository/outbound/outboundv2_b2b_menu'))

WebUI.click(findTestObject('Object Repository/outbound/outboundv2_picklist_menu'))

WebUI.click(findTestObject('Object Repository/inbound/dropdown_action_arrival_button'))

WebUI.click(findTestObject('Object Repository/inbound/arrival_create_menu'))

WebUI.click(findTestObject('Object Repository/outbound/outboundv2_b2b_picklist_grouping'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/outbound/outboundv2_b2b_menu'))

WebUI.click(findTestObject('Object Repository/outbound/outboundv2_picklist_menu'))

