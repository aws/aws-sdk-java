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
package com.amazonaws.services.lightsail.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum InstanceHealthReason {

    LbRegistrationInProgress("Lb.RegistrationInProgress"),
    LbInitialHealthChecking("Lb.InitialHealthChecking"),
    LbInternalError("Lb.InternalError"),
    InstanceResponseCodeMismatch("Instance.ResponseCodeMismatch"),
    InstanceTimeout("Instance.Timeout"),
    InstanceFailedHealthChecks("Instance.FailedHealthChecks"),
    InstanceNotRegistered("Instance.NotRegistered"),
    InstanceNotInUse("Instance.NotInUse"),
    InstanceDeregistrationInProgress("Instance.DeregistrationInProgress"),
    InstanceInvalidState("Instance.InvalidState"),
    InstanceIpUnusable("Instance.IpUnusable");

    private String value;

    private InstanceHealthReason(String value) {
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
     * @return InstanceHealthReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InstanceHealthReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InstanceHealthReason enumEntry : InstanceHealthReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
