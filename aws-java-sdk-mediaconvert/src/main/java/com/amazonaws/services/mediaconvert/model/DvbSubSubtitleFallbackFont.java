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
 * Specify the font that you want the service to use for your burn in captions when your input captions specify a font
 * that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or leave
 * blank, MediaConvert uses a supported font that most closely matches the font that your input captions specify. When
 * there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the supported font
 * that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to replace all
 * unsupported fonts from your input.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbSubSubtitleFallbackFont {

    BEST_MATCH("BEST_MATCH"),
    MONOSPACED_SANSSERIF("MONOSPACED_SANSSERIF"),
    MONOSPACED_SERIF("MONOSPACED_SERIF"),
    PROPORTIONAL_SANSSERIF("PROPORTIONAL_SANSSERIF"),
    PROPORTIONAL_SERIF("PROPORTIONAL_SERIF");

    private String value;

    private DvbSubSubtitleFallbackFont(String value) {
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
     * @return DvbSubSubtitleFallbackFont corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbSubSubtitleFallbackFont fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbSubSubtitleFallbackFont enumEntry : DvbSubSubtitleFallbackFont.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
