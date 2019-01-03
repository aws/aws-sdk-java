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
package com.amazonaws.services.servicecatalog.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ProvisionedProductPlanStatus {

    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_SUCCESS("CREATE_SUCCESS"),
    CREATE_FAILED("CREATE_FAILED"),
    EXECUTE_IN_PROGRESS("EXECUTE_IN_PROGRESS"),
    EXECUTE_SUCCESS("EXECUTE_SUCCESS"),
    EXECUTE_FAILED("EXECUTE_FAILED");

    private String value;

    private ProvisionedProductPlanStatus(String value) {
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
     * @return ProvisionedProductPlanStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ProvisionedProductPlanStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ProvisionedProductPlanStatus enumEntry : ProvisionedProductPlanStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
