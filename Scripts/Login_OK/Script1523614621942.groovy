import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.reader.SheetPOI as SheetPOI

InternalData data = findTestData('TestData')

try {
    System.out.println('Hola-mundo-170418-1031')

    //int prueba = data.getRowNumbers()
    //System.out.println(prueba)
    //
    //0..println ('Holaaaa')
    //
    //
    //System.out.println(data.getRowNumbers())
    //for (def index : (0..data.getRowNumbers()-1)) {
    for (def index : data.getRowNumbers()) {
        Mobile.startApplication('C:\\Appium_Demo\\src\\apk\\AppiumDemo.apk', true)

        System.out.println('Appium Service Address')

        Mobile.setText(findTestObject('android.widget.EditText0 - N Documento'), usuario, 3)

        //        Mobile.setText(findTestObject('android.widget.EditText0 - N Documento'), data.internallyGetValue(usuario, index))
        //Mobile.setText(findTestObject('android.widget.EditText0 - N Documento'),'Holaaaa')
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('android.widget.EditText1'), password, 3)

        //Mobile.setText(findTestObject('android.widget.EditText1'), 'Holaaa')
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.hideKeyboard()

        Mobile.tap(findTestObject('android.widget.Button0 - Acceder'), 3)

        Mobile.waitForElementPresent(findTestObject('android.widget.TextView3 - Tarjetas'), 3)

        Mobile.pressBack()

        Mobile.closeApplication()
    }
}
catch (Exception e) {
    e.printStackTrace()
} 

