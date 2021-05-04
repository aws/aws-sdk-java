/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ErrorCategory {

    The_inputs_to_this_request_are_invalid("The_inputs_to_this_request_are_invalid"),
    Service_limits_have_been_exceeded("Service_limits_have_been_exceeded"),
    Missing_required_permission_to_perform_this_request("Missing_required_permission_to_perform_this_request"),
    One_or_more_inputs_to_this_request_were_not_found("One_or_more_inputs_to_this_request_were_not_found"),
    The_system_temporarily_lacks_sufficient_resources_to_process_the_request("The_system_temporarily_lacks_sufficient_resources_to_process_the_request"),
    An_internal_error_has_occurred("An_internal_error_has_occurred"),
    Cancelled("Cancelled"),
    A_user_recoverable_error_has_occurred("A_user_recoverable_error_has_occurred");

    private String value;

    private ErrorCategory(String value) {
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
     * @return ErrorCategory corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ErrorCategory fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ErrorCategory enumEntry : ErrorCategory.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
