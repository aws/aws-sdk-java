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
 * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request
 */
public enum MetadataDirective {

    /**
     * The metadata, except for the version ID, remains unchanged. In addition, the server-side-encryption, storage-class, and
     * website-redirect-location metadata from the source is not copied. If you specify this metadata explicitly in the copy
     * request, Amazon S3 adds this metadata to the resulting object. If you specify headers in the request specifying any
     * user-defined metadata, Amazon S3 ignores these headers.
     */
    COPY("COPY"),

    /**
     * All original metadata is replaced by the metadata you specify.
     */
    REPLACE("REPLACE");

    private String value;

    MetadataDirective(String value) {
        this.value = value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TableStatus corresponding to the value
     */
    public static MetadataDirective fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MetadataDirective enumEntry : MetadataDirective.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
