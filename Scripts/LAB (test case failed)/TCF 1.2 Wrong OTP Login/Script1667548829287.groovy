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

'Story: Verify if the OTP entered by the user is incorrect.\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Page redirected to "Login" page\n3. Enter email and password\n4. Click "Login" button\n5. Page navigated to "OTP" page\n7. Enter wrong OTP\n8. Click "Verify" button\n9. Shown error message OTP incorrect'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login (not with otp)'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "OTP" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_/Page_/TCF_W_OTP_login-otp-mh360-image'), 5)

'"OTP" page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page')

WebUI.scrollToElement(findTestObject('Object Repository/Page_/Page_/TCF_W_div_otp-field'), 1)

//'Focus find area "OTP" field'
//WebUI.focus(findTestObject('Page_/Page_/div_A one-time PIN has been sent via SMS to_6153b7'))
'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/Page_/TCF_W_div_otp-field'))

'Enter "OTP" field'
WebUI.setText(findTestObject('Object Repository/Page_/Page_/TCF_W_input_otp-field'), '123444')

'Scroll find area "Verify" button'
WebUI.focus(findTestObject('Object Repository/Page_/Page_/TCF_W_button-verify-otp'))

'"Verify" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/Page_/TCF_W_button-verify-otp'))

'Click "Verify" button to verify otp'
WebUI.click(findTestObject('Object Repository/Page_/Page_/TCF_W_button-verify-otp'))

WebUI.scrollToElement(findTestObject('Page_/li_Incorrect SMS OTP, please try again'), 1)

'"Incorrect OTP" error message'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/Page_/TCF_W_message-error-Incorrect-otp'))

WebUI.setText(findTestObject('Object Repository/Page_/Page_/TCF_W_input_otp-field'), '123444')

WebUI.waitForElementPresent(findTestObject('Page_/li_Incorrect SMS OTP, please try again'), 5)

'"OTP" page error message'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page Incorrect otp')

WebUI.closeBrowser()

