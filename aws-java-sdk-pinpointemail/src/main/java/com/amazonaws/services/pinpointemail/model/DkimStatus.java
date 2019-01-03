/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointemail.model;

import javax.annotation.Generated;

/**
 * <p>
 * The DKIM authentication status of the identity. The status can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PENDING</code> – The DKIM verification process was initiated, and Amazon Pinpoint is still waiting for the
 * required CNAME records to appear in the DNS configuration for the domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SUCCESS</code> – The DKIM authentication process completed successfully.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FAILED</code> – The DKIM authentication process failed. This can happen when Amazon Pinpoint fails to find the
 * required CNAME records in the DNS configuration of the domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon Pinpoint from determining the DKIM
 * authentication status of the domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DkimStatus {

    PENDING("PENDING"),
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    TEMPORARY_FAILURE("TEMPORARY_FAILURE"),
    NOT_STARTED("NOT_STARTED");

    private String value;

    private DkimStatus(String value) {
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
     * @return DkimStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DkimStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DkimStatus enumEntry : DkimStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
