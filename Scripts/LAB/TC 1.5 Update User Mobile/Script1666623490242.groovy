import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Story: User want to update user mobile number.\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Enter Email\n3. Enter Password\n4. Click button login\n5. Navigate to "Landing page" selected button update user info\n6. Enter new phone number\n7. Click update phone number\n8. Enter "OTP"\n9. Click submit button\n10. navigate to "Login" landing page'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MH360/landingPage-TC-UM'), 10)

'Landing page'
WebUI.takeFullPageScreenshotAsCheckpoint('landing page')

WebUI.focus(findTestObject('Object Repository/Page_MH360/button-TC-UM'))

'"Update user information" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MH360/button-TC-UM'))

'Click "Update user information" button to update user mobile number'
WebUI.click(findTestObject('Object Repository/Page_MH360/button-TC-UM'))

'Page navigated to "User information" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Update User Info/uss-text-title-TC-UM'), 10)

'"Update user information" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Update User Page')

'Click "Flag" button to show list of mobile country code'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_62'))

'Select a "flag" to choose mobile country code'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/li_Indonesia62'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/updateUserInfo-TC-UM'), 1)

'"Phone number" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/updateUserInfo-TC-UM'))

String mobileNo = WebUI.getAttribute(findTestObject('Object Repository/Page_Update User Info/phoneNumberUM'), 'value').replaceAll(
    '-', '')

WebUI.executeJavaScript('document.getElementById(\'phoneNumber\').value = \'\'', null)

'Enter "Phone number"'
switch (mobileNo) {
    case GlobalVariable.PhoneNumber1:
        WebUI.setText(findTestObject('Object Repository/Page_Update User Info/phoneNumberUM'), GlobalVariable.PhoneNumber2)

        break
    case GlobalVariable.PhoneNumber2:
        WebUI.setText(findTestObject('Object Repository/Page_Update User Info/phoneNumberUM'), GlobalVariable.PhoneNumber1)

        break
    default:
        break
}

'"Send OTP verification" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/button_Send OTP verification'))

'Click "Send OTP verification" button to verify mobile number'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/button_Send OTP verification'))

'MH360 USS is send SMS OTP code to registered mobile number'
WebUI.comment('')

'Page navigated to "OTP" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/img_Enter your OTP_uss-img-brand'), 
    10)

'"OTP" page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP page change number')

WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/form-otp-phone-TC-UM'))

'"OTP" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/form-otp-phone-TC-UM'))

'Enter "OTP" field'
WebUI.setText(findTestObject('Object Repository/Page_OTP Update Phone Number/input_A one-time PIN has been sent via SMS _fd653b'), 
    '123456')

WebUI.focus(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'"verify" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Click "verify" button to verify OTP'
WebUI.click(findTestObject('Object Repository/Page_OTP Update Phone Number/button_Verify'))

'Page navigated to "Sucess update user mobile" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OTP Update Phone Number/modalSuccess-TC-UM'), 10)

'"Success update user mobile" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Modal Success Update User Mobile')

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MyHealth360 - Login/login-mh360-image-TC-UM'), 10)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page')

'"Finish"'
WebUI.closeBrowser()

