import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Story: User want to update user info\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Enter Email\n3. Enter Password\n4. Click button login\n5. Navigate to "Landing page" select button update user info\n6. Page redirected to "Update user info" landing page\n7. Edit user info\n8. Click "Update information" button'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MH360/landingPage-TC-UI'), 10)

'Landing page'
WebUI.takeFullPageScreenshotAsCheckpoint('landing page')

WebUI.scrollToElement(findTestObject('Object Repository/Page_MH360/button_Update User-TC-UI'), 1)

'"Update User Information" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MH360/button_Update User-TC-UI'))

'Click "Update User Information" button to update user information'
WebUI.click(findTestObject('Object Repository/Page_MH360/button_Update User-TC-UI'))

'Page navigated to "User information"'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Update User Info/h1_Update Account Details'), 10)

'"User information" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Update user info page')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_First Name-TC-UI'), 1)

'"First name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_First Name-TC-UI'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Last Name-TC-UI'), 1)

'"Last name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Last Name-TC-UI'))

WebUI.scrollToElement(findTestObject('Page_Update User Info/div_Gender  Male  Female'), 1)

WebUI.focus(findTestObject('Page_Update User Info/div_Gender  Male  Female'))

'"Gender" field'
WebUI.takeElementScreenshot(findTestObject('Page_Update User Info/div_Gender  Male  Female'))

'Click "Female" button to update gender to female'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_Female'))

'Click "Male" button to update gender to male'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_Male'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Date of Birth'), 1)

'"Date of birth" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Date of Birth'))

'Click "Flag Country of Residance" button to show Country of Residance list'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_Country of Residence_selected-flag_1'))

'Click "Flag and Country of Residance Name" to select Country of Residance'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/li_Indonesia'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Country of Residence                   _6b8a3c'), 
    1)

'"Country of Residence" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Country of Residence                   _6b8a3c'))

'Click "Flag Nationality" button to show nationality list'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_Nationality_selected-flag_1'))

'Click "Flag Nationality" to select nationality'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/li_Indonesian'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Nationality                            _d932da'), 
    1)

'"Nationality" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Nationality                            _d932da'))

'Click "ID number type" to choose id number type NRIC or Passport'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update User Info/select_NRICFIN Passport'), 'Passport', 
    true)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_ID Number                              _b5eea4'), 
    1)

'"ID number" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_ID Number                              _b5eea4'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/button_Show additional information'), 1)

'"Show Additional information" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/button_Show additional information'))

'Click "Show Additional information" link to show additional information field'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/button_Show additional information'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Address-TC-UI'), 1)

'"Address" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Address-TC-UI'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Postal Code-TC-UI'), 1)

'"Postal Code" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Postal Code-TC-UI'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Name-TC-UI'), 1)

'"Emergency name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Name-TC-UI'))

'Click "Flag" button to show list of mobile country code'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_62'))

'Select a "flag" to choose mobile country code'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/li_Indonesia62'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Phone number-TC-UI'), 1)

'Emergency "Phone number" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Phone number-TC-UI'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/uss-btn-accordion-hide-TC-UI'), 1)

'"Hide additional information" link'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/uss-btn-accordion-hide-TC-UI'))

'Click "Hide additional information" link to hide additional information'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/uss-btn-accordion-hide-TC-UI'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/uss-btn-submit-update-information-TC-UI'), 
    1)

'"Update information" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/uss-btn-submit-update-information-TC-UI'))

'Click "Update information" button to update information'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/uss-btn-submit-update-information-TC-UI'))

'Page navigated to "Success user information" page'
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Update User Info/modalSuccess-TC-UI'), 10)

'"Success update information" page'
WebUI.takeFullPageScreenshotAsCheckpoint('Success Page')

WebUI.waitForElementPresent(findTestObject('Page_MyHealth360 - Login/login-mh360-image-TC-UI'), 40)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('login-page')

'"Finish"'
WebUI.closeBrowser()

