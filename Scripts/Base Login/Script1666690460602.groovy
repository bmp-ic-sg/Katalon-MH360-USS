import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


'Open the browser and enter MH360-patients URL'
WebUI.openBrowser(GlobalVariable.BaseUrl)

'Enter "Email Address"'
WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/username-TC-Login'), GlobalVariable.email)

'Enter "Password"'
WebUI.setText(findTestObject('Object Repository/Page_MyHealth360 - Login/password-TC-Login'), GlobalVariable.password)

'Click "Login" button'
WebUI.click(findTestObject('Object Repository/Page_MyHealth360 - Login/loginButton-TC-Login'))

'Enter "OTP" form email'
WebUI.setText(findTestObject('Object Repository/Page_/otp-field0-TC-Login'), '123456')

'Click "Submit" button'
WebUI.click(findTestObject('Object Repository/Page_/submitOTPButton-TC-Login'))

