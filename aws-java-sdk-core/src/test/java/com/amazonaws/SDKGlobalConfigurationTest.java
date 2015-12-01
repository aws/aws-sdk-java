package com.amazonaws;

import static com.amazonaws.SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

public class SDKGlobalConfigurationTest {

    @After
    public void tearDown() {
        System.clearProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY);
    }

    /**
     * Flag specified as -Dcom.amazonaws.sdk.disableCertChecking
     */
    @Test
    public void disableCertChecking_FlagEnabled_TurnsOffCertChecking() {
        System.setProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "");
        assertTrue(SDKGlobalConfiguration.isCertCheckingDisabled());
    }

    @Test
    public void disableCertChecking_PropertySetToTrue_TurnsOffCertChecking() {
        System.setProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "true");
        assertTrue(SDKGlobalConfiguration.isCertCheckingDisabled());
    }

    @Test
    public void disableCertChecking_PropertySet_TurnsOffCertChecking() {
        System.setProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "anything");
        assertTrue(SDKGlobalConfiguration.isCertCheckingDisabled());
    }

    @Test
    public void disableCertChecking_PropertySetToFalse_TurnsOffCertChecking() {
        System.setProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "false");
        assertFalse(SDKGlobalConfiguration.isCertCheckingDisabled());
    }

    @Test
    public void disableCertChecking_PropertySetToFalseMixedCase_TurnsOffCertChecking() {
        System.setProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "FaLsE");
        assertFalse(SDKGlobalConfiguration.isCertCheckingDisabled());
    }
}
