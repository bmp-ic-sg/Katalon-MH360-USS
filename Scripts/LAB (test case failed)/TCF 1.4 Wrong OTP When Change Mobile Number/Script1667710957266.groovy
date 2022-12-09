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

'Story: Verify if the OTP Change mobile number entered by the user is incorrect.\n\nRequired:\n1. Email already register.\n2. Change mobile number.\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Page redirected to "Login" page\n3. Enter email and password\n4. Click "Login" button\n5. Page navigated to "OTP" page\n7. Enter OTP\n8. Click "Verify" button to navigate landing page\n9. Click "Update Information" button to navigate Update information page\n10. Change Phone number and clik button send OTP verification\n11. Page navigated to "OTP" page\n12. Enter wrong OTP code and Click button verify\n13. Error message OTP code invalid shown'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MH360/img_Update User Information_img-fluid mb-4'), 5)

'"Landing Page"'
WebUI.takeFullPageScreenshotAsCheckpoint('Landing Page')

'Focus find area "Update user information" button'
WebUI.focus(findTestObject('Object Repository/Page_MH360/button_Update User Information'))

'"Update user information" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MH360/button_Update User Information'))

'Click "Update user information" button to update user phone number'
WebUI.click(findTestObject('Object Repository/Page_MH360/button_Update User Information'))

'Page navigated to "Update user information" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Update User Info/div_Update Account Details'), 5)

'"Update user information" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Update Account Details Page')

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

'Enter "Mobile No"'
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
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_Update User Info/img'), 30)

WebUI.waitForPageLoad(10)

'Page "OTP" send to OTP code to mobile phone via SMS'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page-1st resend the OTP to my mobile phone')

'Scroll find "Countdown"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone in 51'), 
    1)

'"Countdown"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone in 51'))

'Waiting "Coundown" 60 secont'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone in 1'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page link- 1st resend the OTP to my mobile phone')

'Scroll find area "Resend the OTP to my mobile phone" link'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    1)

'"Resend the OTP to my mobile phone" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'Click "Resend the OTP to my mobile phone" link to resend OTP code via SMS'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'Page navigated to "OTP" page'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-loader'), 
    30)

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page-2st resend the OTP to my mobile phone')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-brand'), 
    5)

'Scroll find area "Countdown"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone in 51'), 
    1)

'"Countdown"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone in 51'))

'Waiting "Coundown" 60 secont'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Resend the OTP to my mobile phone in 1'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page link-2st resend the OTP to my mobile phone')

'Scroll find area "Resend the OTP to my mobile phone" link'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'), 
    1)

'"Resend the OTP to my mobile phone" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'Click "Resend the OTP to my mobile phone" link to resend OTP code via SMS'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Resend the OTP to my mobile phone'))

'Page navigated to "OTP" page'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-loader'), 
    30)

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page resend the OTP via voice')

'Scroll find area "OTP" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_A one-time PIN has been sent via SMS to_be2b53'), 
    1)

'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_A one-time PIN has been sent via SMS to_be2b53'))

'Enter wrong "OTP" code'
WebUI.setText(findTestObject('Object Repository/Page_OTP Update Phone Number/input_A one-time PIN has been sent via SMS _fd653b'), 
    '123455')

'Focus find area "Verify" button'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'"Verify" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Click "verify" button to verify OTP'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Scroll find area "OTP invalid" Error message'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_You may have entered an invalid pin, pl_5b384d'), 
    1)

'"OTP invalid" Error message'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_You may have entered an invalid pin, pl_5b384d'))

'"OTP invalid" Page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page-1st resend the OTP via voice')

'Scroll find area "Countdown"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me with an OTP in 55'), 1)

'"Countdown"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me with an OTP in 55'))

'Waiting "Coundown" 60 secont'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me with an OTP in 1'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me with an OTP'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page link-1st resend the OTP via voice')

'Scroll find area "Call me with an OTP"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me with an OTP'), 1)

'"Call me with an OTP"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me with an OTP'))

'Click "Call me with an OTP" to send OTP code via voice call'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me with an OTP'))

'Page navigated to "OTP" page'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-loader'), 
    30)

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page-2st resend the OTP via voice')

'Scroll find area "Countdown"'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  54'), 1)

'"Countdown"'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  54'))

'Waiting "Coundown" 60 secont'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/div_Call me again in  1'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me again'), 10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page link-2st resend the OTP via voice')

'Scroll find area "Call me again" link'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me again'), 1)

'"Call me again" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me again'))

'Click "Call me againP" to resend OTP code via voice call'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/a_Call me again'))

'Page navigated to "OTP" page'
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-loader'), 
    30)

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshotAsCheckpoint('OTP page via voice call')

'Scroll find area "OTP" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_A one-time PIN has been sent via SMS to_be2b53'), 
    1)

'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_A one-time PIN has been sent via SMS to_be2b53'))

'Enter wrong "OTP" code'
WebUI.setText(findTestObject('Object Repository/Page_OTP Update Phone Number/input_A one-time PIN has been sent via SMS _fd653b'), 
    '123455')

'Focus find area "Verify" button'
WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'"Verify" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Click "verify" button to verify OTP'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Scroll find area "OTP invalid" Error message'
WebUI.scrollToElement(findTestObject('Object Repository/Page_OTP Update Phone Number/div_You may have entered an invalid pin, pl_5b384d'), 
    1)

'"OTP invalid" Error message'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/div_You may have entered an invalid pin, pl_5b384d'))

'Enter wrong "OTP" code'
WebUI.setText(findTestObject('Object Repository/Page_OTP Update Phone Number/input_A one-time PIN has been sent via SMS _fd653b'), 
    '123455')

'"OTP invalid" Page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page invalid OTP code')

'Finish'
WebUI.closeBrowser()

