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
 * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this
 * situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this
 * case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value,
 * Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any
 * frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your
 * output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to
 * basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE)
 * or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode
 * (interlaceMode) to a value other than Progressive (PROGRESSIVE).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Mpeg2ScanTypeConversionMode {

    INTERLACED("INTERLACED"),
    INTERLACED_OPTIMIZE("INTERLACED_OPTIMIZE");

    private String value;

    private Mpeg2ScanTypeConversionMode(String value) {
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
     * @return Mpeg2ScanTypeConversionMode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Mpeg2ScanTypeConversionMode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Mpeg2ScanTypeConversionMode enumEntry : Mpeg2ScanTypeConversionMode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
