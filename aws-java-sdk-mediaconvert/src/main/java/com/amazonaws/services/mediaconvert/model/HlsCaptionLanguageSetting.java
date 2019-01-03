/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least
 * one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify.
 * Make sure to specify the languages in the order in which they appear in the original source (if the source is
 * embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages
 * in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the
 * manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HlsCaptionLanguageSetting {

    INSERT("INSERT"),
    OMIT("OMIT"),
    NONE("NONE");

    private String value;

    private HlsCaptionLanguageSetting(String value) {
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
     * @return HlsCaptionLanguageSetting corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HlsCaptionLanguageSetting fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HlsCaptionLanguageSetting enumEntry : HlsCaptionLanguageSetting.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
