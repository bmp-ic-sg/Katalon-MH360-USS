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

'Story: Send OTP to email is allowed after user enable the email otp\n\nRequired:\n1. Email already register\n2. Enable the email otp\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Enter Email\n3. Enter Password\n4. Click button login\n5. Navigate to "OTP page"\n7. Click hyperlink send OTP to my email\n8. Navigate to "OTP page by email"\n9. Enter "OTP" code\n10. Click "verify" button to verify OTP code'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login (not with otp)'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "OTP" page'
WebUI.waitForElementPresent(findTestObject('Page_/SendEmail_login-otp-mh360-image'), 5)

'"OTP" page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page')

'Scroll find area "Send OTP to my email" link'
WebUI.scrollToElement(findTestObject('Page_/SendEmail_div-OTP-to-my-email'), 1)

'Focus find area "Send OTP to my email" link'
WebUI.focus(findTestObject('Object Repository/Page_/SendEmail_div-OTP-to-my-email'))

'Hyperlink to navigate page to "OTP by email" page'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/SendEmail_div-OTP-to-my-email'))

'Click "Send OTP to my email" to navigate page to OTP by email page'
WebUI.click(findTestObject('Object Repository/Page_/SendEmail_OTP-to-my-email-link'))

'Page Navigated to "OTP by email" page'
WebUI.waitForElementPresent(findTestObject('Page_/Email_otp-mh360-image'), 5)

'"OTP" by email page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page by Email')

'Scroll find area "OTP" field'
WebUI.scrollToElement(findTestObject('Page_/Email_div-otp-field'), 1)

'Focus find area "OTP" field'
WebUI.focus(findTestObject('Object Repository/Page_/Email_div-otp-field'))

'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/Email_div-otp-field'))

'Enter "OTP" code'
WebUI.setText(findTestObject('Object Repository/Page_/Email_otp-field'), '123456')

'Scroll find area "OTP" button'
WebUI.focus(findTestObject('Object Repository/Page_/Email_button-verify-otp'))

'"Verify" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/Email_button-verify-otp'))

'Click "verify" button to verify OTP'
WebUI.click(findTestObject('Object Repository/Page_/Email_button-verify-otp'))

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Page_MH360/landingPage-TC-LO'), 5)

'"Landing page"'
WebUI.takeFullPageScreenshotAsCheckpoint('Landing Page')

'Finish'
WebUI.closeBrowser()

