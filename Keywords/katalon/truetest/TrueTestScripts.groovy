package katalon.truetest

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class TrueTestScripts {
    
    public static void login() {
        try {
            // Trigger a Login test case
            // import com.kms.katalon.core.model.FailureHandling
            // import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
            // import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
            // WebUI.callTestCase(findTestCase('Login'))
            
            // Trigger a custom Login method
            // import your.package
            // import authentication.Login
            // call your custom login method
            // Login.login()
            
            // Trigger a custom Login keyword
            // CustomKeywords.login()
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
}


