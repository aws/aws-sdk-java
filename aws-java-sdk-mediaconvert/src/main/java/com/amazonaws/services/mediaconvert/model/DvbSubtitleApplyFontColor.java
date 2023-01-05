/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set to
 * Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color controls.
 * When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies to white text
 * in your input captions. For example, if your font color setting is Yellow, and your input captions have red and white
 * text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font color setting applies
 * to all of your output captions text.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbSubtitleApplyFontColor {

    WHITE_TEXT_ONLY("WHITE_TEXT_ONLY"),
    ALL_TEXT("ALL_TEXT");

    private String value;

    private DvbSubtitleApplyFontColor(String value) {
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
     * @return DvbSubtitleApplyFontColor corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbSubtitleApplyFontColor fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbSubtitleApplyFontColor enumEntry : DvbSubtitleApplyFontColor.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
