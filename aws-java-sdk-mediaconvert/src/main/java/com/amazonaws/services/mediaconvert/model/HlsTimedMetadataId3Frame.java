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
 * Specify the type of the ID3 frame (timedMetadataId3Frame) to use for ID3 timestamps (timedMetadataId3Period) in your
 * output. To include ID3 timestamps: Specify PRIV (PRIV) or TDRL (TDRL) and set ID3 metadata (timedMetadata) to
 * Passthrough (PASSTHROUGH). To exclude ID3 timestamps: Set ID3 timestamp frame type to None (NONE).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HlsTimedMetadataId3Frame {

    NONE("NONE"),
    PRIV("PRIV"),
    TDRL("TDRL");

    private String value;

    private HlsTimedMetadataId3Frame(String value) {
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
     * @return HlsTimedMetadataId3Frame corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HlsTimedMetadataId3Frame fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HlsTimedMetadataId3Frame enumEntry : HlsTimedMetadataId3Frame.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
