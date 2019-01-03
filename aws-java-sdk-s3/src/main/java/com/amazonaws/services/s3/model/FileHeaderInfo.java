/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

/**
 * Describes the first line of input.
 */
public enum FileHeaderInfo {
    USE("USE"),
    IGNORE("IGNORE"),
    NONE("NONE");

    private final String headerInfo;


    FileHeaderInfo(String headerInfo) {
        this.headerInfo = headerInfo;
    }


    @Override
    public String toString() {
        return headerInfo;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TableStatus corresponding to the value
     */
    public static FileHeaderInfo fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FileHeaderInfo enumEntry : FileHeaderInfo.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
