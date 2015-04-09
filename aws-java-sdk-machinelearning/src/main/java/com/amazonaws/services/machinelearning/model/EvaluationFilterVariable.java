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
 * Evaluation Filter Variable
 */
public enum EvaluationFilterVariable {
    
    CreatedAt("CreatedAt"),
    LastUpdatedAt("LastUpdatedAt"),
    Status("Status"),
    Name("Name"),
    IAMUser("IAMUser"),
    MLModelId("MLModelId"),
    DataSourceId("DataSourceId"),
    DataURI("DataURI");

    private String value;

    private EvaluationFilterVariable(String value) {
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
     * @return EvaluationFilterVariable corresponding to the value
     */
    public static EvaluationFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CreatedAt".equals(value)) {
            return EvaluationFilterVariable.CreatedAt;
        } else if ("LastUpdatedAt".equals(value)) {
            return EvaluationFilterVariable.LastUpdatedAt;
        } else if ("Status".equals(value)) {
            return EvaluationFilterVariable.Status;
        } else if ("Name".equals(value)) {
            return EvaluationFilterVariable.Name;
        } else if ("IAMUser".equals(value)) {
            return EvaluationFilterVariable.IAMUser;
        } else if ("MLModelId".equals(value)) {
            return EvaluationFilterVariable.MLModelId;
        } else if ("DataSourceId".equals(value)) {
            return EvaluationFilterVariable.DataSourceId;
        } else if ("DataURI".equals(value)) {
            return EvaluationFilterVariable.DataURI;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    