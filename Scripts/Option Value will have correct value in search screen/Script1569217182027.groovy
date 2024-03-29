import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://mamikos.com/cari')

try {
	WebUI.click(findTestObject('buttonConfirm'))
} catch (Exception e) {
	e.printStackTrace()
}


WebUI.verifyElementPresent(findTestObject('buttonSet'), 30)

WebUI.verifyElementPresent(findTestObject('optionGender'), 30)

WebUI.verifyOptionsPresent(findTestObject('optionTIme'), ['Harian', 'Mingguan', 'Bulanan', 'Tahunan'])

WebUI.verifyOptionsPresent(findTestObject('optionGender'), ['Semua', 'Khusus Putri', 'Khusus Putra', 'Putri atau Putra', 'Putri dan Campur'
        , 'Putra dan Campur', 'Campur'])

WebUI.verifyOptionsPresent(findTestObject('optionSorting'), ['Acak', 'Harga Termurah', 'Harga Tertinggi', 'Kosong ke Penuh'
        , 'Update Terbaru'])

