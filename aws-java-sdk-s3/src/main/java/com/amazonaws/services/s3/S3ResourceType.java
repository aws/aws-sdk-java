/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * An enum representing the types of resources supported by S3. Each resource type below will have a
 * concrete implementation of {@link S3Resource}.
 */
@SdkInternalApi
public enum S3ResourceType {
    /**
     * A specific S3 bucket. Implemented by {@link S3BucketResource}.
     */
    BUCKET("bucket_name"),
    /**
     * An access point that fronts a bucket. Implemented by {@link S3AccessPointResource}.
     */
    ACCESS_POINT("accesspoint"),
    /**
     * A specific S3 object (bucket and key). Implemented by {@link S3ObjectResource}.
     */
    OBJECT("object");

    private final String value;

    S3ResourceType(String value) {
        this.value = value;
    }

    /**
     * @return The canonical string value of this resource type.
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return S3ResourceType corresponding to the value
     * @throws IllegalArgumentException If the specified value does not map to one of the known values in this enum.
     */
    public static S3ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (S3ResourceType enumEntry : S3ResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
