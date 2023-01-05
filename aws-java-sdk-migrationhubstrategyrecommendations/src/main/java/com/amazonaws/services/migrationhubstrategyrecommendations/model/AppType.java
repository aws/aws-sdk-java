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
public enum AppType {

    DotNetFramework("DotNetFramework"),
    Java("Java"),
    SQLServer("SQLServer"),
    IIS("IIS"),
    Oracle("Oracle"),
    Other("Other"),
    Tomcat("Tomcat"),
    JBoss("JBoss"),
    Spring("Spring"),
    MongoDB("Mongo DB"),
    DB2("DB2"),
    MariaDB("Maria DB"),
    MySQL("MySQL"),
    Sybase("Sybase"),
    PostgreSQLServer("PostgreSQLServer"),
    Cassandra("Cassandra"),
    IBMWebSphere("IBM WebSphere"),
    OracleWebLogic("Oracle WebLogic"),
    VisualBasic("Visual Basic"),
    Unknown("Unknown"),
    DotnetCore("DotnetCore"),
    Dotnet("Dotnet");

    private String value;

    private AppType(String value) {
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
     * @return AppType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AppType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AppType enumEntry : AppType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
