/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify which source for language code takes precedence for this audio track. When you choose Follow input
 * (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code
 * on the input track, the service uses the code that you specify in the setting Language code (languageCode or
 * customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you
 * specify.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AudioLanguageCodeControl {

    FOLLOW_INPUT("FOLLOW_INPUT"),
    USE_CONFIGURED("USE_CONFIGURED");

    private String value;

    private AudioLanguageCodeControl(String value) {
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
     * @return AudioLanguageCodeControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AudioLanguageCodeControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AudioLanguageCodeControl enumEntry : AudioLanguageCodeControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
