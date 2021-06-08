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
 * Specify the VC3 class to choose the quality characteristics for this output. VC3 class, together with the settings
 * Framerate (framerateNumerator and framerateDenominator) and Resolution (height and width), determine your output
 * bitrate. For example, say that your video resolution is 1920x1080 and your framerate is 29.97. Then Class 145
 * (CLASS_145) gives you an output with a bitrate of approximately 145 Mbps and Class 220 (CLASS_220) gives you and
 * output with a bitrate of approximately 220 Mbps. VC3 class also specifies the color bit depth of your output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Vc3Class {

    CLASS_145_8BIT("CLASS_145_8BIT"),
    CLASS_220_8BIT("CLASS_220_8BIT"),
    CLASS_220_10BIT("CLASS_220_10BIT");

    private String value;

    private Vc3Class(String value) {
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
     * @return Vc3Class corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Vc3Class fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Vc3Class enumEntry : Vc3Class.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
