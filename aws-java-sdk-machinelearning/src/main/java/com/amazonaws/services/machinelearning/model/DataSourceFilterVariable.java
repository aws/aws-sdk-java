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
 * Data Source Filter Variable
 */
public enum DataSourceFilterVariable {
    
    CreatedAt("CreatedAt"),
    LastUpdatedAt("LastUpdatedAt"),
    Status("Status"),
    Name("Name"),
    DataLocationS3("DataLocationS3"),
    IAMUser("IAMUser");

    private String value;

    private DataSourceFilterVariable(String value) {
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
     * @return DataSourceFilterVariable corresponding to the value
     */
    public static DataSourceFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CreatedAt".equals(value)) {
            return DataSourceFilterVariable.CreatedAt;
        } else if ("LastUpdatedAt".equals(value)) {
            return DataSourceFilterVariable.LastUpdatedAt;
        } else if ("Status".equals(value)) {
            return DataSourceFilterVariable.Status;
        } else if ("Name".equals(value)) {
            return DataSourceFilterVariable.Name;
        } else if ("DataLocationS3".equals(value)) {
            return DataSourceFilterVariable.DataLocationS3;
        } else if ("IAMUser".equals(value)) {
            return DataSourceFilterVariable.IAMUser;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    