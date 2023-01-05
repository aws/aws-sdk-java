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
package com.amazonaws.services.connectcampaign.model;

import javax.annotation.Generated;

/**
 * <p>
 * Enumeration of the possible failure codes for instance onboarding job
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InstanceOnboardingJobFailureCode {

    EVENT_BRIDGE_ACCESS_DENIED("EVENT_BRIDGE_ACCESS_DENIED"),
    EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED("EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED"),
    IAM_ACCESS_DENIED("IAM_ACCESS_DENIED"),
    KMS_ACCESS_DENIED("KMS_ACCESS_DENIED"),
    KMS_KEY_NOT_FOUND("KMS_KEY_NOT_FOUND"),
    INTERNAL_FAILURE("INTERNAL_FAILURE");

    private String value;

    private InstanceOnboardingJobFailureCode(String value) {
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
     * @return InstanceOnboardingJobFailureCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InstanceOnboardingJobFailureCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InstanceOnboardingJobFailureCode enumEntry : InstanceOnboardingJobFailureCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
