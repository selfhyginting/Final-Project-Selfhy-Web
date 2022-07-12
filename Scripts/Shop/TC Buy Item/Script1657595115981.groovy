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

WebUI.click(findTestObject('Object Repository/Shop/Page_Products  Kotakoki/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/h1_Album'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/bdi_Rp15.000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/p_This is a simple, virtual product'), 
    0)

WebUI.setText(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/input_Album quantity_quantity'), '3')

WebUI.click(findTestObject('Shop/Page_Album  Kotakoki/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/div_View cart 3  Album have been added to y_4d01ef'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/p_View cart 3  Album have been added to your cart'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Album  Kotakoki/a_View cart'))

