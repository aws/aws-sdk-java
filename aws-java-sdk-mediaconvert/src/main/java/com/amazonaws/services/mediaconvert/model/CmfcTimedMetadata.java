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
 * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify this
 * ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of ID3
 * metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE) or
 * leave blank.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmfcTimedMetadata {

    PASSTHROUGH("PASSTHROUGH"),
    NONE("NONE");

    private String value;

    private CmfcTimedMetadata(String value) {
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
     * @return CmfcTimedMetadata corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmfcTimedMetadata fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmfcTimedMetadata enumEntry : CmfcTimedMetadata.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
