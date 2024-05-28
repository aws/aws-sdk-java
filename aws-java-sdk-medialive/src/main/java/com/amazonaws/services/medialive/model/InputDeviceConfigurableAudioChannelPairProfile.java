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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Property of InputDeviceConfigurableAudioChannelPairConfig, which configures one audio channel that the device
 * produces.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InputDeviceConfigurableAudioChannelPairProfile {

    DISABLED("DISABLED"),
    VBRAAC_HHE16000("VBR-AAC_HHE-16000"),
    VBRAAC_HE64000("VBR-AAC_HE-64000"),
    VBRAAC_LC128000("VBR-AAC_LC-128000"),
    CBRAAC_HQ192000("CBR-AAC_HQ-192000"),
    CBRAAC_HQ256000("CBR-AAC_HQ-256000"),
    CBRAAC_HQ384000("CBR-AAC_HQ-384000"),
    CBRAAC_HQ512000("CBR-AAC_HQ-512000");

    private String value;

    private InputDeviceConfigurableAudioChannelPairProfile(String value) {
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
     * @return InputDeviceConfigurableAudioChannelPairProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InputDeviceConfigurableAudioChannelPairProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InputDeviceConfigurableAudioChannelPairProfile enumEntry : InputDeviceConfigurableAudioChannelPairProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
