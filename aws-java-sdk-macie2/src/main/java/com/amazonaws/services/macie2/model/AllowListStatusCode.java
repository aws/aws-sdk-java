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
package com.amazonaws.services.macie2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates the current status of an allow list. Depending on the type of criteria that the list specifies, possible
 * values are:
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AllowListStatusCode {

    OK("OK"),
    S3_OBJECT_NOT_FOUND("S3_OBJECT_NOT_FOUND"),
    S3_USER_ACCESS_DENIED("S3_USER_ACCESS_DENIED"),
    S3_OBJECT_ACCESS_DENIED("S3_OBJECT_ACCESS_DENIED"),
    S3_THROTTLED("S3_THROTTLED"),
    S3_OBJECT_OVERSIZE("S3_OBJECT_OVERSIZE"),
    S3_OBJECT_EMPTY("S3_OBJECT_EMPTY"),
    UNKNOWN_ERROR("UNKNOWN_ERROR");

    private String value;

    private AllowListStatusCode(String value) {
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
     * @return AllowListStatusCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AllowListStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AllowListStatusCode enumEntry : AllowListStatusCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
