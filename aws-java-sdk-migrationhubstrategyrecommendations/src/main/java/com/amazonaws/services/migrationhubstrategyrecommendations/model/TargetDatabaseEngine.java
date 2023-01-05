/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TargetDatabaseEngine {

    NoneSpecified("None specified"),
    AmazonAurora("Amazon Aurora"),
    AWSPostgreSQL("AWS PostgreSQL"),
    MySQL("MySQL"),
    MicrosoftSQLServer("Microsoft SQL Server"),
    OracleDatabase("Oracle Database"),
    MariaDB("MariaDB"),
    SAP("SAP"),
    Db2LUW("Db2 LUW"),
    MongoDB("MongoDB");

    private String value;

    private TargetDatabaseEngine(String value) {
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
     * @return TargetDatabaseEngine corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TargetDatabaseEngine fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TargetDatabaseEngine enumEntry : TargetDatabaseEngine.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
