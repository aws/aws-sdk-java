/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements for
 * embedded 608 captions. This markup isn't generally required, but some video players require it to discover and play
 * embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you enable this
 * setting, this is the markup that MediaConvert includes in your manifest: <Accessibility
 * schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MpdAccessibilityCaptionHints {

    INCLUDE("INCLUDE"),
    EXCLUDE("EXCLUDE");

    private String value;

    private MpdAccessibilityCaptionHints(String value) {
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
     * @return MpdAccessibilityCaptionHints corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MpdAccessibilityCaptionHints fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MpdAccessibilityCaptionHints enumEntry : MpdAccessibilityCaptionHints.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
