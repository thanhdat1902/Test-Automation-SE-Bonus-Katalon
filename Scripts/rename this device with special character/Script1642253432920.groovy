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

WebUI.setText(findTestObject('Object Repository/rename this device with special character/Page_Element/input_Sign in with_username'), 
    'tvminh19')

WebUI.setEncryptedText(findTestObject('Object Repository/rename this device with special character/Page_Element/input_Username_password'), 
    'ZMYEqBLXlqKBS+xCxiYvcQ==')

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/div_Verify with Security Key'))

WebUI.setEncryptedText(findTestObject('Object Repository/rename this device with special character/Page_Element/input_Security Key_mx_Field_4'), 
    'VS8rYQ977uuZTKUEW2qHoqEszM/c6AWesmLKV2MYNvqcWwurKMbzDimjKKZIAEKmZHKDZ9qV+hrvpiERJe3Tdg==')

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/button_Continue'))

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/div_Done'))

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/img_Review_mx_BaseAvatar_image'))

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/span_Security  privacy'))

WebUI.click(findTestObject('Object Repository/rename this device with special character/Page_Element/div_Rename'))

WebUI.setText(findTestObject('Object Repository/rename this device with special character/Page_Element/input_Last seen 2032 at 2001ee04db3fe106918_68d1f1'), 
    '我的淘宝购物车收藏夹跨境物流管理境外消费者帮助')

WebUI.verifyElementClickable(findTestObject('Object Repository/rename this device with special character/Page_Element/div_Display Name_mx_AccessibleButton mx_Acc_e7ea31'))

