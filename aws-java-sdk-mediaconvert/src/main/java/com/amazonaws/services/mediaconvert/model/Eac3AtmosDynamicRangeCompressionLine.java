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
 * Choose the Dolby dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby
 * stream for the line operating mode. Default value: Film light (ATMOS_STORAGE_DDP_COMPR_FILM_LIGHT) Related setting:
 * To have MediaConvert use the value you specify here, keep the default value, Custom (SPECIFIED) for the setting
 * Dynamic range control (DynamicRangeControl). Otherwise, MediaConvert ignores Dynamic range compression line
 * (DynamicRangeCompressionLine). For information about the Dolby DRC operating modes and profiles, see the Dynamic
 * Range Control chapter of the Dolby Metadata Guide at
 * https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Eac3AtmosDynamicRangeCompressionLine {

    NONE("NONE"),
    FILM_STANDARD("FILM_STANDARD"),
    FILM_LIGHT("FILM_LIGHT"),
    MUSIC_STANDARD("MUSIC_STANDARD"),
    MUSIC_LIGHT("MUSIC_LIGHT"),
    SPEECH("SPEECH");

    private String value;

    private Eac3AtmosDynamicRangeCompressionLine(String value) {
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
     * @return Eac3AtmosDynamicRangeCompressionLine corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Eac3AtmosDynamicRangeCompressionLine fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Eac3AtmosDynamicRangeCompressionLine enumEntry : Eac3AtmosDynamicRangeCompressionLine.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
