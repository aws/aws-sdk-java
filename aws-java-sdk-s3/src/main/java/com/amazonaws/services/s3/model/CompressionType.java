/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public enum CompressionType {
    NONE("NONE"),
    GZIP("GZIP"),
    BZIP2("BZIP2");

    private final String compressionType;

    CompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    @Override
    public String toString() {
        return compressionType;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TableStatus corresponding to the value
     */
    public static CompressionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CompressionType enumEntry : CompressionType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
