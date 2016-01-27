/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.certificatemanager.model;

/**
 * 
 */
public enum CertificateStatus {

    PENDING_VALIDATION("PENDING_VALIDATION"),
    ISSUED("ISSUED"),
    INACTIVE("INACTIVE"),
    EXPIRED("EXPIRED"),
    VALIDATION_TIMED_OUT("VALIDATION_TIMED_OUT"),
    REVOKED("REVOKED"),
    FAILED("FAILED");

    private String value;

    private CertificateStatus(String value) {
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
     * @return CertificateStatus corresponding to the value
     */
    public static CertificateStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PENDING_VALIDATION".equals(value)) {
            return PENDING_VALIDATION;
        } else if ("ISSUED".equals(value)) {
            return ISSUED;
        } else if ("INACTIVE".equals(value)) {
            return INACTIVE;
        } else if ("EXPIRED".equals(value)) {
            return EXPIRED;
        } else if ("VALIDATION_TIMED_OUT".equals(value)) {
            return VALIDATION_TIMED_OUT;
        } else if ("REVOKED".equals(value)) {
            return REVOKED;
        } else if ("FAILED".equals(value)) {
            return FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}