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
 * When you have a progressive segmented frame (PsF) input, use this setting to flag the input as PsF. MediaConvert
 * doesn't automatically detect PsF. Therefore, flagging your input as PsF results in better preservation of video
 * quality when you do deinterlacing and frame rate conversion. If you don't specify, the default value is Auto (AUTO).
 * Auto is the correct setting for all inputs that are not PsF. Don't set this value to PsF when your input is
 * interlaced. Doing so creates horizontal interlacing artifacts.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InputScanType {

    AUTO("AUTO"),
    PSF("PSF");

    private String value;

    private InputScanType(String value) {
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
     * @return InputScanType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InputScanType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InputScanType enumEntry : InputScanType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
