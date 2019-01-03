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
 * The status of a predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive inbox
 * placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of
 * creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the
 * <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeliverabilityTestStatus {

    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED");

    private String value;

    private DeliverabilityTestStatus(String value) {
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
     * @return DeliverabilityTestStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeliverabilityTestStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeliverabilityTestStatus enumEntry : DeliverabilityTestStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
