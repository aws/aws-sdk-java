/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.paymentcryptography.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum KeyUsage {

    TR31_B0_BASE_DERIVATION_KEY("TR31_B0_BASE_DERIVATION_KEY"),
    TR31_C0_CARD_VERIFICATION_KEY("TR31_C0_CARD_VERIFICATION_KEY"),
    TR31_D0_SYMMETRIC_DATA_ENCRYPTION_KEY("TR31_D0_SYMMETRIC_DATA_ENCRYPTION_KEY"),
    TR31_D1_ASYMMETRIC_KEY_FOR_DATA_ENCRYPTION("TR31_D1_ASYMMETRIC_KEY_FOR_DATA_ENCRYPTION"),
    TR31_E0_EMV_MKEY_APP_CRYPTOGRAMS("TR31_E0_EMV_MKEY_APP_CRYPTOGRAMS"),
    TR31_E1_EMV_MKEY_CONFIDENTIALITY("TR31_E1_EMV_MKEY_CONFIDENTIALITY"),
    TR31_E2_EMV_MKEY_INTEGRITY("TR31_E2_EMV_MKEY_INTEGRITY"),
    TR31_E4_EMV_MKEY_DYNAMIC_NUMBERS("TR31_E4_EMV_MKEY_DYNAMIC_NUMBERS"),
    TR31_E5_EMV_MKEY_CARD_PERSONALIZATION("TR31_E5_EMV_MKEY_CARD_PERSONALIZATION"),
    TR31_E6_EMV_MKEY_OTHER("TR31_E6_EMV_MKEY_OTHER"),
    TR31_K0_KEY_ENCRYPTION_KEY("TR31_K0_KEY_ENCRYPTION_KEY"),
    TR31_K1_KEY_BLOCK_PROTECTION_KEY("TR31_K1_KEY_BLOCK_PROTECTION_KEY"),
    TR31_K3_ASYMMETRIC_KEY_FOR_KEY_AGREEMENT("TR31_K3_ASYMMETRIC_KEY_FOR_KEY_AGREEMENT"),
    TR31_M3_ISO_9797_3_MAC_KEY("TR31_M3_ISO_9797_3_MAC_KEY"),
    TR31_M1_ISO_9797_1_MAC_KEY("TR31_M1_ISO_9797_1_MAC_KEY"),
    TR31_M6_ISO_9797_5_CMAC_KEY("TR31_M6_ISO_9797_5_CMAC_KEY"),
    TR31_M7_HMAC_KEY("TR31_M7_HMAC_KEY"),
    TR31_P0_PIN_ENCRYPTION_KEY("TR31_P0_PIN_ENCRYPTION_KEY"),
    TR31_P1_PIN_GENERATION_KEY("TR31_P1_PIN_GENERATION_KEY"),
    TR31_S0_ASYMMETRIC_KEY_FOR_DIGITAL_SIGNATURE("TR31_S0_ASYMMETRIC_KEY_FOR_DIGITAL_SIGNATURE"),
    TR31_V1_IBM3624_PIN_VERIFICATION_KEY("TR31_V1_IBM3624_PIN_VERIFICATION_KEY"),
    TR31_V2_VISA_PIN_VERIFICATION_KEY("TR31_V2_VISA_PIN_VERIFICATION_KEY"),
    TR31_K2_TR34_ASYMMETRIC_KEY("TR31_K2_TR34_ASYMMETRIC_KEY");

    private String value;

    private KeyUsage(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return KeyUsage corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static KeyUsage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (KeyUsage enumEntry : KeyUsage.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
