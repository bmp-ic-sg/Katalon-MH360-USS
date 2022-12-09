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

'Story: User want to change password.\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Enter Email\n3. Enter Password\n4. Click button login\n5. Navigate to "Landing page" selected button update password\n7. Enter new password\n8. Enter confirm new password\n9. Click button update\n10. Navigate to "Login" landing page'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MH360/landingPage-TC-PR'), 10)

'"Landing page"'
WebUI.takeFullPageScreenshotAsCheckpoint('Landing Page')

WebUI.focus(findTestObject('Object Repository/Page_MH360/button_Update Password'))

'"Update passowrd" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MH360/button_Update Password'))

'Click "Update password" button to update password'
WebUI.click(findTestObject('Object Repository/Page_MH360/button_Update Password'))

'Page navigated to "Update password" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Change Password/manage-password-TC-PR'), 10)

'"Update password" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Change Password Page')

WebUI.focus(findTestObject('Object Repository/Page_Change Password/manage-password'))

'"How to make strong passwords" Link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/manage-password'))

'Click "How to make strong passwords" link to see rules to make strong password'
WebUI.click(findTestObject('Object Repository/Page_Change Password/uss-changepassword-note-text-TC-PR'))

WebUI.waitForElementPresent(findTestObject('Page_Change Password/strong_Ways to Improve Your Password'), 30)

'"Ways to Improve Your Password"'
WebUI.takeFullPageScreenshotAsCheckpoint('Ways to Improve Your Password')

WebUI.focus(findTestObject('Object Repository/Page_Change Password/strongPass-TC-PR'))

'"How to make strong passwords" Link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/strongPass-TC-PR'))

'Click "How to make strong passwords" link to see rule to make strong password'
WebUI.click(findTestObject('Object Repository/Page_Change Password/strongPass-TC-PR'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Change Password/makingstrongPassword-TC-PR'), 10)

'"How to make strong passwords" page to see rules to make strong password'
WebUI.takeFullPageScreenshotAsCheckpoint('Making Strong Passwords')

WebUI.focus(findTestObject('Object Repository/Page_Change Password/button-close-TC-PR'))

'"Close" Button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/button-close-TC-PR'))

'Click "Close" button to close page rules of make strong password'
WebUI.click(findTestObject('Object Repository/Page_Change Password/button-close-TC-PR'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/div-manage-password-TC-PR'), 1)

'"New Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/div-manage-password-TC-PR'))

'Enter "New Password"'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/password-new-TC-PR'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/manage-password-Error-TC-PR'), 1)

'Password meter field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/manage-password-Error-TC-PR'))

WebUI.focus(findTestObject('Object Repository/Page_Change Password/div_password-confirm-TC-PR'))

'"Confirm New Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/div_password-confirm-TC-PR'))

'Enter "Confirm New Password"'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/password-confirm-TC-PR'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.focus(findTestObject('Object Repository/Page_Change Password/uss-btn-submit-TC-PR'))

'"Update" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/uss-btn-submit-TC-PR'))

'Click "Update" button to update the password'
WebUI.click(findTestObject('Object Repository/Page_Change Password/uss-btn-submit-TC-PR'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Change Password/uss-img-modal-success-TC-PR'), 10)

'"Success update password" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Modal Success Change Password')

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MyHealth360 - Login/login-mh360-image-TC-PR'), 10)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('login page')

'Finish'
WebUI.closeBrowser()

