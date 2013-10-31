/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * Cluster State
 */
public enum ClusterState {
    
    STARTING("STARTING"),
    BOOTSTRAPPING("BOOTSTRAPPING"),
    RUNNING("RUNNING"),
    WAITING("WAITING"),
    TERMINATING("TERMINATING"),
    TERMINATED("TERMINATED"),
    TERMINATED_WITH_ERRORS("TERMINATED_WITH_ERRORS");

    private String value;

    private ClusterState(String value) {
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
     * @return ClusterState corresponding to the value
     */
    public static ClusterState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("STARTING".equals(value)) {
            return ClusterState.STARTING;
        } else if ("BOOTSTRAPPING".equals(value)) {
            return ClusterState.BOOTSTRAPPING;
        } else if ("RUNNING".equals(value)) {
            return ClusterState.RUNNING;
        } else if ("WAITING".equals(value)) {
            return ClusterState.WAITING;
        } else if ("TERMINATING".equals(value)) {
            return ClusterState.TERMINATING;
        } else if ("TERMINATED".equals(value)) {
            return ClusterState.TERMINATED;
        } else if ("TERMINATED_WITH_ERRORS".equals(value)) {
            return ClusterState.TERMINATED_WITH_ERRORS;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    