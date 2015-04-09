/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

/**
 * Workspace State
 */
public enum WorkspaceState {
    
    PENDING("PENDING"),
    AVAILABLE("AVAILABLE"),
    IMPAIRED("IMPAIRED"),
    UNHEALTHY("UNHEALTHY"),
    REBOOTING("REBOOTING"),
    REBUILDING("REBUILDING"),
    TERMINATING("TERMINATING"),
    TERMINATED("TERMINATED"),
    SUSPENDED("SUSPENDED"),
    ERROR("ERROR");

    private String value;

    private WorkspaceState(String value) {
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
     *            real value
     * @return WorkspaceState corresponding to the value
     */
    public static WorkspaceState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("PENDING".equals(value)) {
            return WorkspaceState.PENDING;
        } else if ("AVAILABLE".equals(value)) {
            return WorkspaceState.AVAILABLE;
        } else if ("IMPAIRED".equals(value)) {
            return WorkspaceState.IMPAIRED;
        } else if ("UNHEALTHY".equals(value)) {
            return WorkspaceState.UNHEALTHY;
        } else if ("REBOOTING".equals(value)) {
            return WorkspaceState.REBOOTING;
        } else if ("REBUILDING".equals(value)) {
            return WorkspaceState.REBUILDING;
        } else if ("TERMINATING".equals(value)) {
            return WorkspaceState.TERMINATING;
        } else if ("TERMINATED".equals(value)) {
            return WorkspaceState.TERMINATED;
        } else if ("SUSPENDED".equals(value)) {
            return WorkspaceState.SUSPENDED;
        } else if ("ERROR".equals(value)) {
            return WorkspaceState.ERROR;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    