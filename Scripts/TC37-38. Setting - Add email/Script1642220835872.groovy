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

WebUI.setText(findTestObject('Object Repository/Setting - Change avatar/Page_Element/input_Sign in with_username'), 'nctai')

WebUI.setEncryptedText(findTestObject('Object Repository/Setting - Change avatar/Page_Element/input_Username_password'), 
    'EkCegUu2cCIeOttlbhr1Gg==')

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/div_Verify with Security Key or Phrase'))

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/div_Security Phrase'))

WebUI.setEncryptedText(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/input_use your Security Key_mx_passPhraseInput'), 
    'reV6H350bXVA0kTbjZFhCPXAh4FFL4It6typrKizvxSyJdUn2mpvZeL5nXz6yBWwF/LIkIubCxLuDiWR7yvugw==')

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/button_Continue'))

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/div_Done'))

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/img_Review_mx_BaseAvatar_image'))

WebUI.click(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/span_Security  privacy_mx_IconizedContextMe_38942c'))

WebUI.setText(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/input_Email addresses_mx_Field_9'), 
    email)

WebUI.verifyElementClickable(findTestObject('Object Repository/Setting - Change avatar/Page_Element 3/div_Add'))

WebUI.closeBrowser()

