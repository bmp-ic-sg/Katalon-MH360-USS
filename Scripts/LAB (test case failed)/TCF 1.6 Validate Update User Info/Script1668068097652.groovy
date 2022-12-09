import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import internal.GlobalVariable as GlobalVariable

'Story: Validation failed when update user profile\n\nRequired:\n1. Email already register\n\nStep :\n1. Open browser and enter MH360 Patients URL\n2. Enter Email\n3. Enter Password\n4. Click button login\n5. Navigate to "Landing page" select button update user info\n6. Page redirected to "Update user info" landing page\n7. Edit user info\n8. Click "Update information" button'
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

'Scroll find area "First Name" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_First Name'), 1)

'"First Name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_First Name'))

'Empty field first name to get error message required'
WebUI.executeJavaScript('document.getElementById(\'firstname\').value = \'\'', null)

'Focus Empty field first name to get error message required'
WebUI.executeJavaScript('document.getElementById("firstname").dispatchEvent(new Event("input"))', null)

'Scroll find area "Error message" required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/First Name_Error-message-required'), 1)

'"Error message" required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/First Name_Error-message-required'))

'Scroll find area "Error message" First Name required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_First Name_Error-message-required'), 1)

'"Error message" First Name required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_First Name_Error-message-required'))

'Enter "First Name" field'
WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_First Name_firstname'), 'Test user 1')

'Scroll find area "Error message" alphaOnly'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/First Name_Error-alphaOnly'), 1)

'"Error message" alphaOnly'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/First Name_Error-alphaOnly'))

'Scroll find area "Error message" First Name alphaOnly'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_First Name_Error-alphaOnly'), 1)

'"Error message" First Name alphaOnly'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_First Name_Error-alphaOnly'))

'Empty field first name to get error message required'
WebUI.executeJavaScript('document.getElementById(\'firstname\').value = \'\'', null)

'Focus empty field first name to get error message required'
WebUI.executeJavaScript('document.getElementById("firstname").dispatchEvent(new Event("input"))', null)

'Scroll find area "Last Name" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Last Name'), 1)

'"Last Name" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Last Name'))

'Empty field last name to get error message required'
WebUI.executeJavaScript('document.getElementById(\'lastname\').value = \'\'', null)

'Focus empty field last name to get error message required'
WebUI.executeJavaScript('document.getElementById("lastname").dispatchEvent(new Event("input"))', null)

'Scroll find area "Error message" required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/Last Name_Error-message-required'), 1)

'"Error message" required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/Last Name_Error-message-required'))

'Scroll find area "Error message" Last Name required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Last Name_Error-message-required'), 1)

'"Error message" Last Name required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Last Name_Error-message-required'))

'Enter "Last Name" field'
WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_Last Name_lastname'), 'Test user 2')

'Scroll find area "Error message" alphaOnly'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/Last Name_Error-message-alphaOnly'), 1)

'"Error message" alphaOnly'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/Last Name_Error-message-alphaOnly'))

'Scroll find area "Error message" Last Name alphaOnly'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Last Name_Error-message-required'), 1)

'"Error message" Last Name alphaOnly'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Last Name_Error-message-required'))

'Empty field last name to get error message required'
WebUI.executeJavaScript('document.getElementById(\'lastname\').value = \'\'', null)

'Focus empty field last name to get error message required'
WebUI.executeJavaScript('document.getElementById("lastname").dispatchEvent(new Event("input"))', null)

'Scroll find area ""Date of birth" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_Date of Birth'), 1)

'"Date of birth" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_Date of Birth'))

'Click date of birth to select date'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/input_Date of Birth_dateOfBirth'))

WebUI.click(findTestObject('Object Repository/Page_Update User Info/th_Success_next available'))

'Select date maximum today'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update User Info/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '10', true)

'Validate date of birth maximum today'
WebUI.takeFullPageScreenshot()

'Click select "Country of Residence" to choose Country of Residence'
WebUI.click(findTestObject('Object Repository/Page_Update User Info/div_Country of Residence                   _86a8b3'))

'Scroll find area "ID number" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_ID Number_Error-message-required'), 2)

'"ID number" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_ID Number_Error-message-required'))

'Empty field ID number passport to get error message required'
WebUI.executeJavaScript('document.getElementById(\'IdentificationNumber\').value = \'\'', null)

'Focus empty field ID number passport to get error message required'
WebUI.executeJavaScript('document.getElementById("IdentificationNumber").dispatchEvent(new Event("input"))', null)

'Scroll find area "Error message" required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/ID Number_Error-message-required'), 1)

'"Error message" required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/ID Number_Error-message-required'))

'Scroll find area "Error message" passport required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_ID Number_Error-message-required'), 1)

'"Error message" passport required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_ID Number_Error-message-required'))

'Enter "ID number" field'
WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_Wrong ID may result in missing result_4434a7'), 
    'IND')

'Focus find area "submit" button'
WebUI.focus(findTestObject('Page_Update User Info/uss-btn-submit-update-information-TC-UI'))

'"submit" button'
WebUI.takeElementScreenshot(findTestObject('Page_Update User Info/uss-btn-submit-update-information-TC-UI'))

'Click "submit" button to update information'
WebUI.click(findTestObject('Page_Update User Info/uss-btn-submit-update-information-TC-UI'))

WebUI.waitForElementPresent(findTestObject('Page_Update User Info/ID Number_Error-message-incoretNumber'), 30)

'Focus find area ID number'
WebUI.focus(findTestObject('Page_Update User Info/ID Number_Error-message-incoretNumber'), FailureHandling.STOP_ON_FAILURE)

'Scroll find area "Error message" passport incorrect number'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_ID Number                              _73ecf4'), 
    1)

'"Error message" passport incorrect number'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_ID Number                              _73ecf4'))

'Empty field ID number passport to get error message required'
WebUI.executeJavaScript('document.getElementById(\'IdentificationNumber\').value = \'\'', null)

'Focus empty field ID number passport to get error message required'
WebUI.executeJavaScript('document.getElementById("IdentificationNumber").dispatchEvent(new Event("input"))', null)

'Select "ID number"'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update User Info/select_NRICFIN Passport'), 'NRIC/FIN', 
    true)

'Enter "ID number" field'
WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_Wrong ID may result in missing result_4434a7'), 
    'S4750974B')

'Scroll find area "ID number" field'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_ID Number                              _b5eea4'), 
    1)

'"ID number" field'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/div_ID Number                              _b5eea4'))

'Empty field ID number NRIC to get error message required'
WebUI.executeJavaScript('document.getElementById(\'IdentificationNumber\').value = \'\'', null)

'Focus empty field ID number NRIC to get error message required'
WebUI.executeJavaScript('document.getElementById("IdentificationNumber").dispatchEvent(new Event("input"))', null)

'Scroll find area "Error message" required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/ID Number_Error-message-required'), 1)

'"Error message" required'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_Update User Info/ID Number_Error-message-required'))

'Scroll find area "Error message" NRIC required'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/div_ID Number_Error-message-required'), 1)

'"Error message" NRIC required'
WebUI.takeElementScreenshot(findTestObject('Page_Update User Info/div_ID Number_Error-message-required'))

'Enter "ID Number" field'
WebUI.setText(findTestObject('Object Repository/Page_Update User Info/input_Wrong ID may result in missing result_4434a7'), 
    'IND')

'Scroll find area "Error message" NRIC incorrect number'
WebUI.scrollToElement(findTestObject('Object Repository/Page_Update User Info/ID Number_Error-message-incoretNumber'), 1)

'"Error message" NRIC incorrect number'
WebUI.takeElementScreenshot(findTestObject('Page_Update User Info/div_ID Number                              _b5eea4'))

'Empty field ID number NRIC to get error message required'
WebUI.executeJavaScript('document.getElementById(\'IdentificationNumber\').value = \'\'', null)

'Focus empty field ID number NRIC to get error message required'
WebUI.executeJavaScript('document.getElementById("IdentificationNumber").dispatchEvent(new Event("input"))', null)

WebUI.click(findTestObject('Object Repository/Page_Update User Info/input_Date of Birth_dateOfBirth'))

WebUI.click(findTestObject('Object Repository/Page_Update User Info/th_Success_next available'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update User Info/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '10', true)

'"Update Information" validate page'
WebUI.takeFullPageScreenshotAsCheckpoint('Update Information Validate Page')

'Finish'
WebUI.closeBrowser()

