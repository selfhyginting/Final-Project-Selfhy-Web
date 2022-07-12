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

CucumberKW.runFeatureFile('Include/features/WP-12 Selfhy - TC Home Website 1.feature')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Home/Page_Kotakoki  Welcome to my Website/span_SHOP NOW_swiper-pagination-bullet'))

WebUI.verifyElementPresent(findTestObject('Home/Page_Kotakoki  Welcome to my Website/h3_Our Products'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home/Page_Kotakoki  Welcome to my Website/h3_Its All New, It All Arrived This Week'), 
    0)

WebUI.click(findTestObject('Object Repository/Home/Page_Kotakoki  Welcome to my Website/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.click(findTestObject('Object Repository/Home/Page_Album  Kotakoki/img_Search_wp-post-image'))

WebUI.click(findTestObject('Object Repository/Home/Page_Album  Kotakoki/button_Copyright  2022. Powered by WS Lab_p_37a027'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home/Page_Album  Kotakoki/nav_HomeUncategorizedAlbum'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home/Page_Album  Kotakoki/bdi_Rp15.000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home/Page_Album  Kotakoki/p_This is a simple, virtual product'), 
    0)

WebUI.click(findTestObject('Object Repository/Home/Page_Album  Kotakoki/a_Description'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home/Page_Album  Kotakoki/p_Lorem ipsum dolor sit amet, consectetur a_7bf0e2'), 
    0)

WebUI.click(findTestObject('Object Repository/Home/Page_Album  Kotakoki/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home/Page_Album  Kotakoki/p_View cart Album has been added to your cart'), 
    0)

WebUI.closeBrowser()

