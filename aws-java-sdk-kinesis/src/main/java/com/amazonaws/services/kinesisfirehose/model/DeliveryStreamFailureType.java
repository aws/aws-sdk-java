/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeliveryStreamFailureType {

    RETIRE_KMS_GRANT_FAILED("RETIRE_KMS_GRANT_FAILED"),
    CREATE_KMS_GRANT_FAILED("CREATE_KMS_GRANT_FAILED"),
    KMS_ACCESS_DENIED("KMS_ACCESS_DENIED"),
    DISABLED_KMS_KEY("DISABLED_KMS_KEY"),
    INVALID_KMS_KEY("INVALID_KMS_KEY"),
    KMS_KEY_NOT_FOUND("KMS_KEY_NOT_FOUND"),
    KMS_OPT_IN_REQUIRED("KMS_OPT_IN_REQUIRED"),
    UNKNOWN_ERROR("UNKNOWN_ERROR");

    private String value;

    private DeliveryStreamFailureType(String value) {
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
     * @return DeliveryStreamFailureType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeliveryStreamFailureType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeliveryStreamFailureType enumEntry : DeliveryStreamFailureType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
