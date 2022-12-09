import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Story: If the user forgets the password, user can click "Forgot Password" to navigate user to the\nForgot Password page\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Click "Forgot Password" hyperlink\n3. Page navigated to forgot password page\n4. Enter email already registered\n5. Click button "next" for send OTP to Mobile number\n6. Enter the OTP sent to the Mobile number\n7. Page navigate to reset password page\n8. Enter new password\n9. Confirm password\n10. Click button "reset password"'
WebUI.comment('')

'Open the browser and enter MH360-patients URL'
WebUI.openBrowser(GlobalVariable.BaseUrl)

'Page navigated to "Login" page'
WebUI.waitForPageLoad(10)

WebUI.waitForElementNotPresent(findTestObject('Page_Forgot Password/forgot_password_loading_bar'), 10)

//WebUI.waitForElementPresent(findTestObject('Page_MyHealth360 - Login/login-mh360-image'), 30)
'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Login Page')

WebUI.scrollToElement(findTestObject('Page_MyHealth360 - Login/loginForm'), 1)

'Hyperlink to navigate page to "Forgot Password" page'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MyHealth360 - Login/loginForm'))

'Click "Forgot Password" to navigate page to forgot password page'
WebUI.click(findTestObject('Object Repository/Page_MyHealth360 - Login/login-forgot-password-link'))

'Page navigated to "Forgot Password" page'
WebUI.waitForPageLoad(3)

WebUI.waitForElementNotPresent(findTestObject('Page_Forgot Password/forgot_password_loading_bar'), 10)

'"Forgot Password" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Forgot Password')

WebUI.scrollToElement(findTestObject('Page_Forgot Password/resetPassword'), 1)

'Field to enter email address'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/resetPassword'))

'Enter email for reset the password'
WebUI.setText(findTestObject('Object Repository/Page_Forgot Password/email'), GlobalVariable.email)

WebUI.focus(findTestObject('Page_Forgot Password/uss-password-reset-next-button'))

'Button to process generate and send SMS OTP code to registered mobile number'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/uss-password-reset-next-button'))

'Click "Next" button to process reset password'
WebUI.click(findTestObject('Object Repository/Page_Forgot Password/uss-password-reset-next-button'))

'MH360 USS is send SMS OTP code to registered mobile number'
WebUI.comment('')

'Page navigated to "Verify OTP" page'
WebUI.waitForPageLoad(5)

WebUI.waitForElementNotPresent(findTestObject('Page_Forgot Password/forgot_password_loading_bar'), 10)

'"Verify OTP" page'
WebUI.takeFullPageScreenshotAsCheckpoint('OTP Page')

WebUI.scrollToElement(findTestObject('Page_Forgot Password/form-otp'), 1)

'Field to enter OTP code'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/form-otp'))

'Enter the OTP code sent to the mobile number'
WebUI.setText(findTestObject('Object Repository/Page_Forgot Password/otp0'), GlobalVariable.StaticOtp)

WebUI.scrollToElement(findTestObject('Page_Forgot Password/submit-otp'), 1)

'Button to submit OTP code'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/submit-otp'))

'Click "Submit" button to verify OTP code'
WebUI.click(findTestObject('Object Repository/Page_Forgot Password/submit-otp'))

'Page navigated to "Reset Password" page'
WebUI.waitForPageLoad(5)

WebUI.waitForElementNotPresent(findTestObject('Page_Forgot Password/forgot_password_loading_bar'), 10)

'"Reset password" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Forgot Password Page')

WebUI.focus(findTestObject('Page_Forgot Password/change-password'))

'Field to enter new password'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/change-password'))

'Enter "New password"'
WebUI.setText(findTestObject('Object Repository/Page_Forgot Password/password'), GlobalVariable.password)

'Scroll find area "Password meter" information'
WebUI.scrollToElement(findTestObject('Page_Forgot Password/change-password-error'), 1)

'Password meter information'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/change-password-error'))

WebUI.focus(findTestObject('Page_Forgot Password/change-password-confirm'))

'Field to confirm new password'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/change-password-confirm'))

'Retype password to confirm new password"'
WebUI.setText(findTestObject('Object Repository/Page_Forgot Password/passwordConfirmation'), GlobalVariable.password)

WebUI.focus(findTestObject('Page_Forgot Password/uss-password-reset-change-submit-button'))

'Button to process reset password'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Forgot Password/uss-password-reset-change-submit-button'))

'Click "Reset password" button'
WebUI.click(findTestObject('Object Repository/Page_Forgot Password/uss-password-reset-change-submit-button'))

'Showing "success" pop up'
WebUI.waitForElementPresent(findTestObject('Page_Forgot Password/modal-success'), 10)

'"Success" pop up message'
WebUI.takeFullPageScreenshotAsCheckpoint('Modal Success Forgot Password Page')

'Finish'
WebUI.closeBrowser()

