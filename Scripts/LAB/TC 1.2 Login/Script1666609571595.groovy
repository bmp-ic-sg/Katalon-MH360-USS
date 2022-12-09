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

'Story: Verify if users can login successful.\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Page redirected to "Login" page\n3. Enter email and password \n4. Click "Login" button\n5. Enter "OTP" code'
WebUI.comment('')

'Open the browser and enter MH360-patients URL'
WebUI.openBrowser(GlobalVariable.BaseUrl)

'Page navigated to "Login" page'
WebUI.waitForPageLoad(10)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page')

WebUI.scrollToElement(findTestObject('Page_MyHealth360 - Login/loginForm-TC-Login'), 1)

'"Email address" field'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/loginForm-TC-Login'))

'Enter "Email Address"'
WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/username-TC-Login'), GlobalVariable.email)

WebUI.focus(findTestObject('Page_MyHealth360 - Login/loginForm-TC-Login-Email'))

'"Password" field'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/loginForm-TC-Login-Email'))

'Enter "Password"'
WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/password-TC-Login'), GlobalVariable.password)

WebUI.scrollToElement(findTestObject('Object Repository/Page_MyHealth360 - Login/loginButton-TC-Login'), 1)

'"Login" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MyHealth360 - Login/loginButton-TC-Login'))

'Click "Login" button to authenicated user'
WebUI.click(findTestObject('Object Repository/Page_MyHealth360 - Login/loginButton-TC-Login'))

'MH360 USS is send SMS OTP code to registered mobile number'
WebUI.comment('')

'Page navigated to "OTP" page'
WebUI.waitForElementPresent(findTestObject('Page_/img_Enter your OTP_login-otp-mh360-image'), 10)

'"OTP" page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP landing page')

WebUI.scrollToElement(findTestObject('Object Repository/Page_/MH360SmsloginForm-TC-Login'), 1)

'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/MH360SmsloginForm-TC-Login'))

'Enter the OTP code sent to the mobile number'
WebUI.setText(findTestObject('Object Repository/Page_/otp-field0-TC-Login'), '123456')

WebUI.scrollToElement(findTestObject('Object Repository/Page_/submitOTPButton-TC-Login'), 1)

'"Submit" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_/submitOTPButton-TC-Login'))

'Click "Submit" button to verify the OTP code'
WebUI.click(findTestObject('Object Repository/Page_/submitOTPButton-TC-Login'))

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MH360/landingPage-TC-Login'), 30)

'Landing page'
WebUI.takeFullPageScreenshotAsCheckpoint('Landing Page')

'Finish'
WebUI.closeBrowser()

