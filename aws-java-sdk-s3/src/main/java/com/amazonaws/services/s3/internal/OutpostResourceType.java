/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.internal;


import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.StringUtils;

/**
 * An enum representing the types of resources supported by S3 outpost. Each resource type below will have a
 * concrete implementation of {@link S3OutpostResource1}.
 */
@SdkInternalApi
public enum OutpostResourceType {

    /**
     * A specific S3 outpost bucket.
     */
    OUTPOST_BUCKET("bucket"),

    /**
     * An outpost access point
     */
    OUTPOST_ACCESS_POINT("accesspoint");

    private final String value;

    OutpostResourceType(String value) {
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
    public static OutpostResourceType fromValue(String value) {
        if (StringUtils.isNullOrEmpty(value)) {
            throw new IllegalArgumentException("value cannot be null or empty!");
        }

        for (OutpostResourceType enumEntry : OutpostResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
