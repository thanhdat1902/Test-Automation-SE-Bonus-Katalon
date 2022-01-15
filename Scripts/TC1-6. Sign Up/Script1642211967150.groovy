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

WebUI.navigateToUrl('http://localhost:8080/#/register')

WebUI.setText(findTestObject('Sign Up/using Username/input_Or_mx_RegistrationForm_username'), username)

WebUI.setEncryptedText(findTestObject('Sign Up/using Username/input_Username_mx_RegistrationForm_password'), 
    password)

WebUI.setEncryptedText(findTestObject('Sign Up/using Username/input_Password_mx_RegistrationForm_passwordConfirm'), 
    confirmpassword)

WebUI.setText(findTestObject('Sign Up/using Username/input_Confirm password_mx_Field_1'), email)

WebUI.sendKeys(findTestObject('Sign Up/using Username/input_Confirm password_mx_Field_1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Sign Up/using Username/div_id(katalon-rec_elementInfoDiv)'))

