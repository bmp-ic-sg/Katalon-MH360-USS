package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile lab : Profile name
Profile default : Profile name</p>
     */
    public static Object ProfileName
     
    /**
     * <p>Profile lab : Lab MH360 PRP url
Profile default : Local MH360 PRP url</p>
     */
    public static Object BaseUrl
     
    /**
     * <p>Profile lab : Lab MH360 PRP url</p>
     */
    public static Object ForgotPassword
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object StaticOtp
     
    /**
     * <p></p>
     */
    public static Object PhoneNumber1
     
    /**
     * <p></p>
     */
    public static Object PhoneNumber2
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            ProfileName = selectedVariables['ProfileName']
            BaseUrl = selectedVariables['BaseUrl']
            ForgotPassword = selectedVariables['ForgotPassword']
            email = selectedVariables['email']
            password = selectedVariables['password']
            StaticOtp = selectedVariables['StaticOtp']
            PhoneNumber1 = selectedVariables['PhoneNumber1']
            PhoneNumber2 = selectedVariables['PhoneNumber2']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
