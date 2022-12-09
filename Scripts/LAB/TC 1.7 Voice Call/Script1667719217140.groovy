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

'Story: if the user fails to send the OTP code to the mobile number after the second try.\nit will trigger sending the OTP code via voice call\n\nRequired:\n1. Email already register\n2. Change phone number\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Enter Email\n3. Enter Password\n4. Click button login\n5. Navigate to "Landing page" selected button update user info\n6. Enter new phone number\n7. Click "send OTP verification" button \n8. Waiting 60 seconds countdown\n9. Click hyperlink send OTP to my mobile phone\n10. if the user fails to send the OTP code to the mobile number after the second try.\n12. Hyperlink Call me with an OTP shown'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MH360/img_Update User Information_img-fluid mb-4'), 5)

'"Landing page"'
WebUI.takeFullPageScreenshotAsCheckpoint('Landing Page')

'Focus find area "Update user information" button'
WebUI.focus(findTestObject('Object Repository/Page_MH360/button_Update User Information'))

'"Update user information" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MH360/button_Update User Information'))

'Click "Update user information" button to update user mobile number'
WebUI.click(findTestObject('Object Repository/Page_MH360/button_Update User Information'))

'Page navigated to "User information" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Update User Info/h1_Update Account Details'), 5)

'"User information" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Update Information Page')

'Scroll find area "Mobile No" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Mobile No.                             _5e1836'), 
    1)

'Focus find area "Mobile No" field'
WebUI.focus(findTestObject('Object Repository/Page_Update User Info/div_Mobile No.                             _5e1836'))

'"Mobile No" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Mobile No.                             _5e1836'))

String mobileNo = WebUI.getAttribute(findTestObject('Object Repository/Page_Update User Info/input_Zimbabwe_phoneNumber'), 
    'value').replaceAll('-', '')

WebUI.executeJavaScript('document.getElementById(\'phoneNumber\').value = \'\'', null)

'Enter "Phone number"'
switch (mobileNo) {
    case GlobalVariable.PhoneNumber1:
        WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_Zimbabwe_phoneNumber'), GlobalVariable.PhoneNumber2)

        break
    case GlobalVariable.PhoneNumber2:
        WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_Zimbabwe_phoneNumber'), GlobalVariable.PhoneNumber1)

        break
    default:
        break
}

'Focus find area "Send OTP verification" button'
WebUI.focus(findTestObject('Object Repository/Page_Update User Info/button_Send OTP verification'))

'"Send OTP verification" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/button_Send OTP verification'))

'Click "Send OTP verification" button to verify mobile number'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/button_Send OTP verification'))

'MH360 USS is send SMS OTP code to registered mobile number'
WebUI.comment('')

'Page navigated to "OTP" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-brand'), 
    5)

'"OTP" page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP Page')

'Scroll find area "Countdown"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID'), 1)

'Focus find area "Countdown"'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID'))

'60 seconds countdown to resend OTP code to mobile number'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    30)

'Scroll find area "Resend OTP code to my mobile number" link'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    1)

'Focus find area "Resend OTP code to my mobile number" link'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'"Resend OTP code to my mobile number" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'MH360 USS resends SMS OTP code to registered mobile number 2 times'
WebUI.comment('')

'Click "Resend OTP code to my mobile number" link to resend OTP code to mobile number'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'Scroll find area "Countdown"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone'), 
    1)

'Focus find area "Countdown"'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone'))

'60 seconds countdown to resend OTP code to mobile number'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID'))

WebUI.waitForElementPresent(findTestObject('Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 30)

'Scroll find area "Resend OTP code to my mobile number" link'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    1)

'Focus find area "Resend OTP code to my mobile number" link'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'"Resend OTP code to my mobile number" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'Click "Resend OTP code to my mobile number" link to resend OTP code to mobile number'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID_Call'), 5)

'Scroll find area "Countdow resend OTP by voice call"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID_Call'), 1)

'Focus find area "Countdow resend OTP by voice call"'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID_Call'))

'"Countdow resend OTP by voice call"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/countdownID_Call'))

WebUI.waitForElementNotVisible(findTestObject('Page_OTP Update Phone Number/countdownID_Call'), 30)

'Scroll find area "Call me with an OTP" link'
WebUI.scrollToElement(findTestObject('Page_OTP Update Phone Number/a_Call me with an OTP'), 1)

'Focus find area "Call me with an OTP" link'
WebUI.focus(findTestObject('Page_OTP Update Phone Number/a_Call me with an OTP'))

'"Call me with an OTP" link'
WebUI.takeElementScreenshot(findTestObject('Page_OTP Update Phone Number/a_Call me with an OTP'))

'Click "Call me with an OTP" link to resend OTP code to mobile phone by voice call'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me with an OTP'))

'Page navigated to "OTP" page by voice call'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-brand'), 
    5)

'"OTP" page by voice call'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP Page by Voice Call')

'Scroll find area "Countdow call me again in"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  58'), 1)

'Focus find area "Countdow call me again in"'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  58'))

'60 seconds countdown to resend OTP code to mobile phone by voice call'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  58'))

'Scroll find area "OTP" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  43_OTPInput'), 
    1)

'Focus find area "OTP" field'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  43_OTPInput'))

'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  43_OTPInput'))

'Enter "OTP" field'
WebUI.setText(findTestObject('Object Repository/Page_OTP Update Phone Number/input_A one-time PIN has been sent via SMS _fd653b'), 
    '123456')

'Focus find area "Verify" button'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'"Verify" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Click "verify" button to verify OTP'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Page navigated to "OTP" page success'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Verify_mx-auto'), 5)

'"OTP" page success'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page by voice call success')

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MyHealth360 - Login/img_Login_login-mh360-image'), 30)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page')

'Finish'
WebUI.closeBrowser()

