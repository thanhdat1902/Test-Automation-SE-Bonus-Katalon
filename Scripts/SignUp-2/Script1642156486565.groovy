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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/#/login')

WebUI.click(findTestObject('Object Repository/Page_Element/div_Create account'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Or_mx_RegistrationForm_username'), 'tvminh19')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_mx_RegistrationForm_password'), 'm+xpl71WONL935SgUesKpg==')

WebUI.click(findTestObject('Object Repository/Page_Element/form_UsernamePasswordConfirm passwordEmailA_dc4320'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Password_mx_RegistrationForm_passwordConfirm'), 
    'm+xpl71WONL935SgUesKpg==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Confirm password_mx_Field_4'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_mx_RegistrationForm_password'), 'ZMYEqBLXlqKBS+xCxiYvcQ==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Confirm password_mx_Field_4'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Password_mx_RegistrationForm_passwordConfirm'), 
    'ZMYEqBLXlqKBS+xCxiYvcQ==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Confirm password_mx_Field_4'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Create accountHost account onmatrix.org_6b4dd0'))

WebUI.click(findTestObject('Object Repository/Page_Element/input_Email_mx_Login_submit'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Confirm password_mx_Field_4'), 'tvminh19@apcs.vn')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Email_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_Element/input'))

WebUI.click(findTestObject('Object Repository/Page_Element/button_Accept'))

