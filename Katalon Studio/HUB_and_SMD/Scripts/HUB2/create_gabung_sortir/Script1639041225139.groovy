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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testobject.RequestObject


	
def request = (RequestObject) findTestObject('Object Repository/HUB2/get_bag_number')
def response = WS.sendRequest(request)
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())
def bag_number = (result.bag[0].bag_number)+ "001"
def no_resi = result.bag[0].bag_item[0].bag_item_awb[0].awb_number
println bag_number
println no_resi
String nomor_resi = no_resi
GlobalVariable.resi = nomor_resi
println GlobalVariable.resi
def request2 = (RequestObject) findTestObject('Object Repository/HUB2/create_gabung_sortir')
def response2 = WS.sendRequest(request2)
def slurper2 = new groovy.json.JsonSlurper()
def result2 = slurper2.parseText(response2.getResponseBodyContent())
println result2
