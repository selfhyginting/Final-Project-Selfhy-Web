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

CucumberKW.runFeatureFile('Include/features/WP-16 Selfhy - TC Search Website.feature')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Search/Page_Search Results for   Kotakoki/button_Search Suggestions_header_search_button'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Album  Kotakoki/input_Featured products_s'), 'album')

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_Album  Kotakoki/input_Featured products_s'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Search/Page_Search Results for   Kotakoki/input_Search suggestions_s'), 
    'test')

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_Search Results for   Kotakoki/input_Search suggestions_s'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

