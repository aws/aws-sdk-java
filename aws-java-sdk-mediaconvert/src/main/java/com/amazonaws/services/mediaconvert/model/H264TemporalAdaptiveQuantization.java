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
 * Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you
 * keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job
 * specification, MediaConvert automatically applies the best types of quantization for your video content. When you set
 * H264AdaptiveQuantization to a value other than AUTO, the default value for H264TemporalAdaptiveQuantization is
 * Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on temporal variation of
 * content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't
 * moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the
 * readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always
 * improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is
 * likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving
 * objects with sharp edges, such as sports athletes' faces, you might choose to set H264TemporalAdaptiveQuantization to
 * Disabled (DISABLED). Related setting: When you enable temporal quantization, adjust the strength of the filter with
 * the setting Adaptive quantization (adaptiveQuantization). To manually enable or disable
 * H264TemporalAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than
 * AUTO.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264TemporalAdaptiveQuantization {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private H264TemporalAdaptiveQuantization(String value) {
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
     * @return H264TemporalAdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264TemporalAdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264TemporalAdaptiveQuantization enumEntry : H264TemporalAdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
