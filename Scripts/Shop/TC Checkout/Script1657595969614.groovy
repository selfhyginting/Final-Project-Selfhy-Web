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

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/h1_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/div_Have a coupon Click here to enter your code'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/h3_Billing details'), 0)

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_first_name'), 'selfhy')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_last_name'), 'ginting')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input_(optional)_billing_company'), 'bfi finance tbk')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_address_1'), 'Jalan Setiabudi')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_city'), 'Medan')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_phone'), '08123123123')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_email'), 'selfhy.ginting@bfi.co.id')

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/h3_Additional information'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Order notes(optional)'), 
    0)

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/textarea_(optional)_order_comments'), 'please be fast')

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/h3_Your order'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/th_Product'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/th_Subtotal'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/td_Album 3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/td_Rp45.000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/th_Subtotal'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/td_Rp45.000_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/th_Total'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/td_Rp45.000_1_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - BCA'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - BNI'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - BRI'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - BSI'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - BJB'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - Mandiri'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bank Transfer - Permata'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bayar di Alfamart Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Bayar di Indomaret'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_ShopeePay'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_OVO'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_DANA'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_LinkAja'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Direct Debit BRI'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_QRIS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Kredivo'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_UangMe'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/label_Credit Card (Xendit)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/p_Dengan menggunakan metode pembayaran ini,_ea213f'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/div_Billing Postcode  ZIP is a required field'), 
    0)

WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/input__billing_postcode'), '123')

WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/form_Billing Postcode  ZIP is a required fi_d4dc18'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout  Kotakoki/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/p_Anda berada dalam Mode Uji Coba, setiap t_fc5680'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/img_IDLC_w-16 h-16 rounded-md'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/div_IDR 45.000'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/button_Transfer Bank3'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/button_prefix__cls-1,.prefix__cls-3fillnone_685b4f'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/button_Transfer Bank3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/div_Virtual Account'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/div_IDLC'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/div_IDR 45.000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/p_ringkasan pesanan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/span_Transaksi woocommerce-xendit-426'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/div_DeskripsiTransaksi  woocommerce-xendit-_333527'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/div_Album3xIDR 15.000IDR 45.000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/td_Subtotal'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/td_IDR 45.000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/td_Jumlah Total'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Checkout woocommerce-xendit-426/td_IDR 45.000'), 
    0)

