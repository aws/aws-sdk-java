/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.machinelearning.model;

/**
 * 
 */
public enum MLModelFilterVariable {

    CreatedAt("CreatedAt"),
    LastUpdatedAt("LastUpdatedAt"),
    Status("Status"),
    Name("Name"),
    IAMUser("IAMUser"),
    TrainingDataSourceId("TrainingDataSourceId"),
    RealtimeEndpointStatus("RealtimeEndpointStatus"),
    MLModelType("MLModelType"),
    Algorithm("Algorithm"),
    TrainingDataURI("TrainingDataURI");

    private String value;

    private MLModelFilterVariable(String value) {
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
     * @return MLModelFilterVariable corresponding to the value
     */
    public static MLModelFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("CreatedAt".equals(value)) {
            return CreatedAt;
        } else if ("LastUpdatedAt".equals(value)) {
            return LastUpdatedAt;
        } else if ("Status".equals(value)) {
            return Status;
        } else if ("Name".equals(value)) {
            return Name;
        } else if ("IAMUser".equals(value)) {
            return IAMUser;
        } else if ("TrainingDataSourceId".equals(value)) {
            return TrainingDataSourceId;
        } else if ("RealtimeEndpointStatus".equals(value)) {
            return RealtimeEndpointStatus;
        } else if ("MLModelType".equals(value)) {
            return MLModelType;
        } else if ("Algorithm".equals(value)) {
            return Algorithm;
        } else if ("TrainingDataURI".equals(value)) {
            return TrainingDataURI;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}