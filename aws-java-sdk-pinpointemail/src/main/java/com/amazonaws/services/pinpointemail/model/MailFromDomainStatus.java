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
 * The status of the MAIL FROM domain. This status can have the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
 * status of the MAIL FROM domain.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MailFromDomainStatus {

    PENDING("PENDING"),
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    TEMPORARY_FAILURE("TEMPORARY_FAILURE");

    private String value;

    private MailFromDomainStatus(String value) {
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
     * @return MailFromDomainStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MailFromDomainStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MailFromDomainStatus enumEntry : MailFromDomainStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
