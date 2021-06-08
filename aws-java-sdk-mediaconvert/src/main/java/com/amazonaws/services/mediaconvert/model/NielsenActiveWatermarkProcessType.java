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
 * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW (NAES2_AND_NW),
 * you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must provide a value for
 * the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET), you must provide
 * values for both of these settings.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NielsenActiveWatermarkProcessType {

    NAES2_AND_NW("NAES2_AND_NW"),
    CBET("CBET"),
    NAES2_AND_NW_AND_CBET("NAES2_AND_NW_AND_CBET");

    private String value;

    private NielsenActiveWatermarkProcessType(String value) {
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
     * @return NielsenActiveWatermarkProcessType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NielsenActiveWatermarkProcessType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NielsenActiveWatermarkProcessType enumEntry : NielsenActiveWatermarkProcessType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
