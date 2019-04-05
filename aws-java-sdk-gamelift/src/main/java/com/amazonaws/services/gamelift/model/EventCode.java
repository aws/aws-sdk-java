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
package com.amazonaws.services.gamelift.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EventCode {

    GENERIC_EVENT("GENERIC_EVENT"),
    FLEET_CREATED("FLEET_CREATED"),
    FLEET_DELETED("FLEET_DELETED"),
    FLEET_SCALING_EVENT("FLEET_SCALING_EVENT"),
    FLEET_STATE_DOWNLOADING("FLEET_STATE_DOWNLOADING"),
    FLEET_STATE_VALIDATING("FLEET_STATE_VALIDATING"),
    FLEET_STATE_BUILDING("FLEET_STATE_BUILDING"),
    FLEET_STATE_ACTIVATING("FLEET_STATE_ACTIVATING"),
    FLEET_STATE_ACTIVE("FLEET_STATE_ACTIVE"),
    FLEET_STATE_ERROR("FLEET_STATE_ERROR"),
    FLEET_INITIALIZATION_FAILED("FLEET_INITIALIZATION_FAILED"),
    FLEET_BINARY_DOWNLOAD_FAILED("FLEET_BINARY_DOWNLOAD_FAILED"),
    FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND("FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND"),
    FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE("FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE"),
    FLEET_VALIDATION_TIMED_OUT("FLEET_VALIDATION_TIMED_OUT"),
    FLEET_ACTIVATION_FAILED("FLEET_ACTIVATION_FAILED"),
    FLEET_ACTIVATION_FAILED_NO_INSTANCES("FLEET_ACTIVATION_FAILED_NO_INSTANCES"),
    FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED("FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED"),
    SERVER_PROCESS_INVALID_PATH("SERVER_PROCESS_INVALID_PATH"),
    SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT("SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT"),
    SERVER_PROCESS_PROCESS_READY_TIMEOUT("SERVER_PROCESS_PROCESS_READY_TIMEOUT"),
    SERVER_PROCESS_CRASHED("SERVER_PROCESS_CRASHED"),
    SERVER_PROCESS_TERMINATED_UNHEALTHY("SERVER_PROCESS_TERMINATED_UNHEALTHY"),
    SERVER_PROCESS_FORCE_TERMINATED("SERVER_PROCESS_FORCE_TERMINATED"),
    SERVER_PROCESS_PROCESS_EXIT_TIMEOUT("SERVER_PROCESS_PROCESS_EXIT_TIMEOUT"),
    GAME_SESSION_ACTIVATION_TIMEOUT("GAME_SESSION_ACTIVATION_TIMEOUT"),
    FLEET_CREATION_EXTRACTING_BUILD("FLEET_CREATION_EXTRACTING_BUILD"),
    FLEET_CREATION_RUNNING_INSTALLER("FLEET_CREATION_RUNNING_INSTALLER"),
    FLEET_CREATION_VALIDATING_RUNTIME_CONFIG("FLEET_CREATION_VALIDATING_RUNTIME_CONFIG"),
    FLEET_VPC_PEERING_SUCCEEDED("FLEET_VPC_PEERING_SUCCEEDED"),
    FLEET_VPC_PEERING_FAILED("FLEET_VPC_PEERING_FAILED"),
    FLEET_VPC_PEERING_DELETED("FLEET_VPC_PEERING_DELETED"),
    INSTANCE_INTERRUPTED("INSTANCE_INTERRUPTED");

    private String value;

    private EventCode(String value) {
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
     * @return EventCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EventCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EventCode enumEntry : EventCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
