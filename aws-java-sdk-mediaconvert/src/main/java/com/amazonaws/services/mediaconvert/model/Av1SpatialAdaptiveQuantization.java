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
 * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of
 * content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more
 * distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be
 * noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded
 * with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature
 * doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their
 * attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related
 * setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization
 * (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it
 * to Low. For content with a wider variety of textures, set it to High or Higher.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Av1SpatialAdaptiveQuantization {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private Av1SpatialAdaptiveQuantization(String value) {
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
     * @return Av1SpatialAdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Av1SpatialAdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Av1SpatialAdaptiveQuantization enumEntry : Av1SpatialAdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
