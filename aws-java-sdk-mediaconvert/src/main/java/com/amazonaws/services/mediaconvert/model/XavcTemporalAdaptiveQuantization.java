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
 * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
 * quantization (adaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
 * quantization for your video content. Include this setting in your JSON job specification only when you choose to
 * change the default value for Adaptive quantization. For this setting, keep the default value, Enabled (ENABLED), to
 * adjust quantization within each frame based on temporal variation of content complexity. When you enable this
 * feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects
 * with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and
 * scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though,
 * that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be
 * focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports
 * athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal adaptive
 * quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum XavcTemporalAdaptiveQuantization {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private XavcTemporalAdaptiveQuantization(String value) {
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
     * @return XavcTemporalAdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static XavcTemporalAdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (XavcTemporalAdaptiveQuantization enumEntry : XavcTemporalAdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
