/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OrgFeature {

    S3_DATA_EVENTS("S3_DATA_EVENTS"),
    EKS_AUDIT_LOGS("EKS_AUDIT_LOGS"),
    EBS_MALWARE_PROTECTION("EBS_MALWARE_PROTECTION"),
    RDS_LOGIN_EVENTS("RDS_LOGIN_EVENTS"),
    EKS_RUNTIME_MONITORING("EKS_RUNTIME_MONITORING"),
    LAMBDA_NETWORK_LOGS("LAMBDA_NETWORK_LOGS"),
    RUNTIME_MONITORING("RUNTIME_MONITORING");

    private String value;

    private OrgFeature(String value) {
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
     * @return OrgFeature corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OrgFeature fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OrgFeature enumEntry : OrgFeature.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
