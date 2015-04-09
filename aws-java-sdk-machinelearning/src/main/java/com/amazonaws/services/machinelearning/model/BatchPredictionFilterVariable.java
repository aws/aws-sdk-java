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
package com.amazonaws.services.machinelearning.model;

/**
 * Batch Prediction Filter Variable
 */
public enum BatchPredictionFilterVariable {
    
    CreatedAt("CreatedAt"),
    LastUpdatedAt("LastUpdatedAt"),
    Status("Status"),
    Name("Name"),
    IAMUser("IAMUser"),
    MLModelId("MLModelId"),
    DataSourceId("DataSourceId"),
    DataURI("DataURI");

    private String value;

    private BatchPredictionFilterVariable(String value) {
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
     * @return BatchPredictionFilterVariable corresponding to the value
     */
    public static BatchPredictionFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CreatedAt".equals(value)) {
            return BatchPredictionFilterVariable.CreatedAt;
        } else if ("LastUpdatedAt".equals(value)) {
            return BatchPredictionFilterVariable.LastUpdatedAt;
        } else if ("Status".equals(value)) {
            return BatchPredictionFilterVariable.Status;
        } else if ("Name".equals(value)) {
            return BatchPredictionFilterVariable.Name;
        } else if ("IAMUser".equals(value)) {
            return BatchPredictionFilterVariable.IAMUser;
        } else if ("MLModelId".equals(value)) {
            return BatchPredictionFilterVariable.MLModelId;
        } else if ("DataSourceId".equals(value)) {
            return BatchPredictionFilterVariable.DataSourceId;
        } else if ("DataURI".equals(value)) {
            return BatchPredictionFilterVariable.DataURI;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    