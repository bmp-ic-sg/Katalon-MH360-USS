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

'Story: Verify if the user is not successful in logging in.\n\nRequired:\n1. Wrong email format\n2. Wrong email or passowrd\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Page redirected to "Login" page\n3. Enter wrong email format or Enter wrong email or password \n4. Click "Login" button\n5. Shown message error'
WebUI.comment('')

'Open the browser and enter MH360-patients URL'
WebUI.openBrowser(GlobalVariable.BaseUrl)

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_login-mh360-image'), 5)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login page')

'Scroll find area "Email" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-email-address'), 1)

'Focus find area "Email" field'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-email-address'))

'"Email" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-email-address'))

'Enter wrong "Email" format'
WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-address'), 'user.katalon')

'Scroll find area "Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-password'), 1)

'Focus find area "Password" field'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-password'))

'"Password" field'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/TCF_div-password'))

'Enter "password"'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_input-password'), 'iFGeFYmXIrUhQZHvW7P22w==')

'Focus find area "Login" button'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_button-login'))

'"Login" button'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/TCF_button-login'))

'Click "Login" button to verify email and password'
WebUI.click(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_button-login'))

'Scroll find area "Error message" invalid email address'
WebUI.scrollToElement(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_invalid-email-address'), 1)

'Focus find area "Error message" invalid email address'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_invalid-email-address'))

'"Error message" invalid email address'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_invalid-email-address'))

WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-address'), 'user.katalon')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_input-password'), 'iFGeFYmXIrWdtRK3J8KQyQ==')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_invalid-email-address'), 1)

'Error message "invalid email address" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Message error invalid email address')

'Refresh for reset email and password'
WebUI.refresh()

'Scroll find area "Email" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-email-address'), 1)

'Focus find area "Email" field'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-email-address'))

'"Email" field'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/TCF_div-email-address'))

'Start comment\nEnter unregistered email and password or Enter wrong password '
WebUI.comment('')

WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-address'), 'user.katalon@mail.com')

'Scroll find area "Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-password'), 1)

'Focus find area "Password" field'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_div-password'))

'Password "field"'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/TCF_div-password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_input-password'), 'wAWz0z1aj1kFojsV12T8Qg==')

'End comment'
WebUI.comment('')

'Focus find area "Login"button'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_button-login'))

'"Login" button'
WebUI.takeElementScreenshot(findTestObject('Page_MyHealth360 - Login/TCF_button-login'))

'Click "Login" button to verify email and password'
WebUI.click(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_button-login'))

'Scroll find area "Error message" Email and password do not match'
WebUI.scrollToElement(findTestObject('Page_MyHealth360 - Login/TCF_Email-and-password-do-not-match'), 1)

'Focus find area "Error message" Email and password do not match'
WebUI.focus(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-and-password-do-not-match'))

'"Error message" Email and password do not match'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-and-password-do-not-match'))

WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-address'), 'user.katalon@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_input-password'), 'wAWz0z1aj1kFojsV12T8Qg==')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MyHealth360 - Login/TCF_Email-and-password-do-not-match'), 
    5)

'Error message "Email and password do not match" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Message error email and password do not match')

'Finish'
WebUI.closeBrowser()

