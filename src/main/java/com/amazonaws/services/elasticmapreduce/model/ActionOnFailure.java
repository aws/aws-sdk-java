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
 * Action On Failure
 */
public enum ActionOnFailure {
    
    TERMINATE_JOB_FLOW("TERMINATE_JOB_FLOW"),
    TERMINATE_CLUSTER("TERMINATE_CLUSTER"),
    CANCEL_AND_WAIT("CANCEL_AND_WAIT"),
    CONTINUE("CONTINUE");

    private String value;

    private ActionOnFailure(String value) {
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
     * @return ActionOnFailure corresponding to the value
     */
    public static ActionOnFailure fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("TERMINATE_JOB_FLOW".equals(value)) {
            return ActionOnFailure.TERMINATE_JOB_FLOW;
        } else if ("TERMINATE_CLUSTER".equals(value)) {
            return ActionOnFailure.TERMINATE_CLUSTER;
        } else if ("CANCEL_AND_WAIT".equals(value)) {
            return ActionOnFailure.CANCEL_AND_WAIT;
        } else if ("CONTINUE".equals(value)) {
            return ActionOnFailure.CONTINUE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    