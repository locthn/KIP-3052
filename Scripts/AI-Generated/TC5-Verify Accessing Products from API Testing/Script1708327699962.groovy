import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink api testing > navigate to Page api list'

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_api_testing'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_api_testing'))

'Step 3: At Page api list, click on hyperlink api 1 get all products list'

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_api_list/hyperlink_api_1_get_all_products_list'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/api_list?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_list/hyperlink_api_1_get_all_products_list'))

'Step 4: At Page api list, click on hyperlink products > navigate to Page products'

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_api_list/hyperlink_products'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/api_list?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_list/hyperlink_products'))

'Step 5: Add visual checkpoint at Page products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Accessing Products from API Testing_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
