package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object ME_url
     
    /**
     * <p></p>
     */
    public static Object AHU_url
     
    /**
     * <p></p>
     */
    public static Object AHUUsername
     
    /**
     * <p></p>
     */
    public static Object CMO
     
    /**
     * <p></p>
     */
    public static Object BM
     
    /**
     * <p></p>
     */
    public static Object Checker
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object sprint4WebScreenshootPath
     
    /**
     * <p></p>
     */
    public static Object pathfinder_siup
     
    /**
     * <p></p>
     */
    public static Object pathfinder_npwp
     
    /**
     * <p></p>
     */
    public static Object pathfinder_tdp
     
    /**
     * <p></p>
     */
    public static Object pathfinder_ktp
     
    /**
     * <p></p>
     */
    public static Object coba
     
    /**
     * <p></p>
     */
    public static Object cobaKTP
     
    /**
     * <p></p>
     */
    public static Object npwp_inprogress
     
    /**
     * <p></p>
     */
    public static Object npwp_berlaku
     
    /**
     * <p></p>
     */
    public static Object npwp_tdkberlaku
     
    /**
     * <p></p>
     */
    public static Object npwp_cancel
     
    /**
     * <p></p>
     */
    public static Object Search1
     
    /**
     * <p></p>
     */
    public static Object Search2
     
    /**
     * <p></p>
     */
    public static Object Search3
     
    /**
     * <p></p>
     */
    public static Object Search4
     
    /**
     * <p></p>
     */
    public static Object corporate_economycode
     
    /**
     * <p></p>
     */
    public static Object corporate_lokasiproyek
     
    /**
     * <p></p>
     */
    public static Object corporate_provinsi
     
    /**
     * <p></p>
     */
    public static Object corporate_kab
     
    /**
     * <p></p>
     */
    public static Object corporate_kec
     
    /**
     * <p></p>
     */
    public static Object corporate_kel
     
    /**
     * <p></p>
     */
    public static Object corporate_kodepos
     
    /**
     * <p></p>
     */
    public static Object pengurus_role
     
    /**
     * <p></p>
     */
    public static Object pengurus_jobtitle
     
    /**
     * <p></p>
     */
    public static Object information_jenispengajuan
     
    /**
     * <p></p>
     */
    public static Object information_tujuankredit
     
    /**
     * <p></p>
     */
    public static Object sprint2WebScreenshotPath
     
    /**
     * <p></p>
     */
    public static Object me1WebScreenshotPath
     
    /**
     * <p></p>
     */
    public static Object pathfinder_rad
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            ME_url = selectedVariables['ME_url']
            AHU_url = selectedVariables['AHU_url']
            AHUUsername = selectedVariables['AHUUsername']
            CMO = selectedVariables['CMO']
            BM = selectedVariables['BM']
            Checker = selectedVariables['Checker']
            password = selectedVariables['password']
            sprint4WebScreenshootPath = selectedVariables['sprint4WebScreenshootPath']
            pathfinder_siup = selectedVariables['pathfinder_siup']
            pathfinder_npwp = selectedVariables['pathfinder_npwp']
            pathfinder_tdp = selectedVariables['pathfinder_tdp']
            pathfinder_ktp = selectedVariables['pathfinder_ktp']
            coba = selectedVariables['coba']
            cobaKTP = selectedVariables['cobaKTP']
            npwp_inprogress = selectedVariables['npwp_inprogress']
            npwp_berlaku = selectedVariables['npwp_berlaku']
            npwp_tdkberlaku = selectedVariables['npwp_tdkberlaku']
            npwp_cancel = selectedVariables['npwp_cancel']
            Search1 = selectedVariables['Search1']
            Search2 = selectedVariables['Search2']
            Search3 = selectedVariables['Search3']
            Search4 = selectedVariables['Search4']
            corporate_economycode = selectedVariables['corporate_economycode']
            corporate_lokasiproyek = selectedVariables['corporate_lokasiproyek']
            corporate_provinsi = selectedVariables['corporate_provinsi']
            corporate_kab = selectedVariables['corporate_kab']
            corporate_kec = selectedVariables['corporate_kec']
            corporate_kel = selectedVariables['corporate_kel']
            corporate_kodepos = selectedVariables['corporate_kodepos']
            pengurus_role = selectedVariables['pengurus_role']
            pengurus_jobtitle = selectedVariables['pengurus_jobtitle']
            information_jenispengajuan = selectedVariables['information_jenispengajuan']
            information_tujuankredit = selectedVariables['information_tujuankredit']
            sprint2WebScreenshotPath = selectedVariables['sprint2WebScreenshotPath']
            me1WebScreenshotPath = selectedVariables['me1WebScreenshotPath']
            pathfinder_rad = selectedVariables['pathfinder_rad']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
