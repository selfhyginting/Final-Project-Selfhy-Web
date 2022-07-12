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

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/h1_Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/h2_Cart totals'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/th_Subtotal'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/td_Rp45.000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/th_Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/td_Rp45.000_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/input_Coupon_coupon_code'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/a_Continue shopping'), 0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Cart  Kotakoki/a_Proceed to checkout'))

