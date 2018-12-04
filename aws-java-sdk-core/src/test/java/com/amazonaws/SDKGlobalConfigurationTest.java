/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws;

import static com.amazonaws.SDKGlobalConfiguration.AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY;
import static com.amazonaws.SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

public class SDKGlobalConfigurationTest {

    @After
    public void tearDown() {
        System.clearProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY);
        System.clearProperty(AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY);
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
    public void disableEc2Metadata_PropertySetToFalse_turnOnEc2Metadata() {
        System.setProperty(AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY, "false");
        assertFalse(SDKGlobalConfiguration.isEc2MetadataDisabled());
    }

    @Test
    public void disableEc2Metadata_PropertySetToAnything_turnOnEc2Metadata() {
        System.setProperty(AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY, "anything");
        assertFalse(SDKGlobalConfiguration.isEc2MetadataDisabled());
    }

    @Test
    public void disableEc2Metadata_PropertySetToTrueMixedCase_turnOffEc2Metadata() {
        System.setProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "tRuE");
        assertTrue(SDKGlobalConfiguration.isCertCheckingDisabled());
    }
}
