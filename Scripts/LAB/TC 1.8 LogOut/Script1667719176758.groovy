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

'Story: Verify if users can logout successful.\n\nRequired:\n1. Email already register\n\nStep :\n1. Click button "Logout" in landing page\n2. Navigate to "login" landing page'
WebUI.comment('')

'User must be logged in, To login refer to TC 1.2 Login.'
WebUI.callTestCase(findTestCase('Base Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Page Navigated to "Landing page"'
WebUI.waitForElementPresent(findTestObject('Page_MH360/landingPage-TC-LO'), 10)

'Landing page'
WebUI.takeFullPageScreenshotAsCheckpoint('landing page')

WebUI.focus(findTestObject('Page_MH360/button_Logout-TC-LO'))

'"Logout" button'
WebUI.takeElementScreenshot(findTestObject('Object Repository/Page_MH360/button_Logout-TC-LO'))

'Click "Logout" button to log out of the USS system'
WebUI.click(findTestObject('Object Repository/Page_MH360/button_Logout-TC-LO'))

'Page navigated to "Login" page'
WebUI.waitForElementPresent(findTestObject('Page_MyHealth360 - Login/login-mh360-image-TC-LO'), 10)

'"Login" page'
WebUI.takeFullPageScreenshotAsCheckpoint('login page')

'Finish'
WebUI.closeBrowser()

