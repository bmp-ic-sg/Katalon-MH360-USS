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

'Story: Verify if the password entered by the user is not strong yet.\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Page redirected to "Login" page\n3. Enter email and password\n4. Click "Login" button\n5. Page navigated to "OTP" page\n7. Enter OTP code\n8. Click "Verify" button\n9. Page navigated to "Landing page"\n10. Click "Update Password" button\n11. Page navigated to "Change Passoword" page\n12. Enter "Short/simple Password"\n13. Password meter shown '
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Page_MH360/img_Update User Information_img-fluid mb-4'), 5)

'"Landing page"'
WebUI.takeFullPageScreenshotAsCheckpoint('Landing page')

'Focus find area "Update Password" button'
WebUI.focus(findTestObject('Page_MH360/button_Update Password'))

'"Update Password" button'
WebUI.takeElementScreenshot(findTestObject('Page_MH360/button_Update Password'))

'Click "Update Passwrod" button to navigate change password page'
WebUI.click(findTestObject('Page_MH360/button_Update Password'))

'Page navigated to "Change Password" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Change Password/h1_Change Password'), 5)

'"Change Password" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Change Password Page')

'Scroll find area "New Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'), 1)

'Focus find area "New Password" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'"New Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'Enter "New Password"'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'), '+ySD09iij20=')

'Scroll find area "New Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'), 1)

'Focus find area "New Password" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'"New Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'Focus find area "Password Meter" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_Password-meter'))

'"Password Meter" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_Password-meter'))

'Clear text'
WebUI.clearText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'))

'Enter "New Password" without number'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'), 'JlzvPViMXjkjOZYJWllViQ==')

'Scroll find area "New Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'), 1)

'Focus find area "New Password" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'"New Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'Focus find area "Password Meter" field one number'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/li_At least one number'))

'"Password Meter" field one number'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/li_At least one number'))

'Clear text'
WebUI.clearText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'))

'Enter "New Password" without on uppercase and lowecase letter'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'), 'mpyMK7svpVPL661SkotlPw==')

'Scroll find area "New Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'), 1)

'Focus find area "New Password" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'"New Password" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'Focus find area "Password Meter" field on uppercase and lowecase letter'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/li_At least one uppercase and one lowercase letter'))

'"Password Meterd" without on uppercase and lowecase letter'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/li_At least one uppercase and one lowercase letter'))

'Clear text'
WebUI.clearText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'))

'Enter "New Password" without one special character'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'), 'Cis9L3+y/HaU0CVbcwVwBA==')

'Scroll find area "New Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'), 1)

'Focus find area "New Password" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'"New Password" without one special character'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'Focus find area "Password Meter" field without one special character'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/li_At least one special character'))

'"Password Meter" field without one special character'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/li_At least one special character'))

'Clear text'
WebUI.clearText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'))

'Enter "New Password" less than 8 characters'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'), 'Va7TW7qTV+c=')

'Scroll find area "New Password" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'), 1)

'Focus find area "New Password" field'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'"New Password" field less than 8 characters'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/TCF_div_New-Password'))

'Focus find area "Password Meter" field less than 8 characters'
WebUI.focus(findTestObject('Object Repository/Page_Change Password/li_Minimum 8 characters'))

'"Password Meter" field less than 8 characters'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Change Password/li_Minimum 8 characters'))

'Clear text'
WebUI.clearText(findTestObject('Object Repository/Page_Change Password/TCF_input_New-Password'))

'Finish'
WebUI.closeBrowser()

