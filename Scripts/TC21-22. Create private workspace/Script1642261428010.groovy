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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/#/login')

WebUI.setText(findTestObject('Object Repository/Creating private workspace/Page_Element/input_Sign in with_username'), 'tvminh19')

WebUI.setEncryptedText(findTestObject('Object Repository/Creating private workspace/Page_Element/input_Username_password'), 
    'ZMYEqBLXlqKBS+xCxiYvcQ==')

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/div_Verify with Security Key'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/h2_Security Key'))

WebUI.setText(findTestObject('Object Repository/Creating private workspace/Page_Element/input_Security Key_mx_Field_4'), 
    'EsTz GjF9 i17E JLpz sfyb e7c5 tV5p wVxd Jh5S uSmg KYJr KDsR')

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/button_Continue'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/div_Done'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/div_Check your devices_mx_SpaceButton_icon'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/div_Check your devices_mx_SpaceButton_icon_1'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/div_Check your devices_mx_SpaceButton_icon'))

WebUI.click(findTestObject('Object Repository/Creating private workspace/Page_Element/div_PrivateInvite only, best for yourself or teams'))

WebUI.setText(findTestObject('Object Repository/Creating private workspace/Page_Element/input_Upload_spaceName'), ws_name)

WebUI.verifyElementClickable(findTestObject('Object Repository/Creating private workspace/Page_Element/div_Create'))

