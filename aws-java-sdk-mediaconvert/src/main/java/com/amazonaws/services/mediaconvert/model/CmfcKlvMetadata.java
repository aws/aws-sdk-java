/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert reads
 * KLV metadata present in your input and writes each instance to a separate event message box in the output, according
 * to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmfcKlvMetadata {

    PASSTHROUGH("PASSTHROUGH"),
    NONE("NONE");

    private String value;

    private CmfcKlvMetadata(String value) {
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
     * @return CmfcKlvMetadata corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmfcKlvMetadata fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmfcKlvMetadata enumEntry : CmfcKlvMetadata.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
