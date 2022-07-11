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

WebUI.click(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/nav_HomeShop'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/a_New Products'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/h1_New Products'), 0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/a_On Sale'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/h1_On Sale'), 0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/a_Uncategorized'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Uncategorized  Kotakoki/h1_Uncategorized15 items'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Uncategorized  Kotakoki/a_Cocoqua'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cocoqua   Kotakoki/h1_Cocoqua 0 items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cocoqua   Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Cocoqua   Kotakoki/a_Du-reamy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Du-reamy  Kotakoki/h1_Du-reamy0 items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Du-reamy  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Du-reamy  Kotakoki/a_HOME PAGE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_HOME PAGE  Kotakoki/h1_HOME PAGE0 items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_HOME PAGE  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_HOME PAGE  Kotakoki/a_KOTAKOKI SET'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_KOTAKOKI SET  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_KOTAKOKI SET  Kotakoki/a_PIPILTIN COCOA'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_PIPILTIN COCOA  Kotakoki/h1_PIPILTIN COCOA0 items'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_PIPILTIN COCOA  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_PIPILTIN COCOA  Kotakoki/a_READY TO EAT'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_READY TO EAT  Kotakoki/h1_READY TO EAT0 items'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_READY TO EAT  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_READY TO EAT  Kotakoki/a_SEAFOOD'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_SEAFOOD  Kotakoki/h1_SEAFOOD0 items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_SEAFOOD  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_SEAFOOD  Kotakoki/a_SPICES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_SPICES  Kotakoki/h1_SPICES0 items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_SPICES  Kotakoki/p_No products were found matching your selection'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_SPICES  Kotakoki/a_STARTER SET'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_STARTER SET  Kotakoki/h1_STARTER SET0 items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_STARTER SET  Kotakoki/p_No products were found matching your selection'), 
    0)

