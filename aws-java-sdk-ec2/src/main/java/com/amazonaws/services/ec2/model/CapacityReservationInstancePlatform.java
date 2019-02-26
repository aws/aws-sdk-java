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
package com.amazonaws.services.ec2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CapacityReservationInstancePlatform {

    LinuxUNIX("Linux/UNIX"),
    RedHatEnterpriseLinux("Red Hat Enterprise Linux"),
    SUSELinux("SUSE Linux"),
    Windows("Windows"),
    WindowsWithSQLServer("Windows with SQL Server"),
    WindowsWithSQLServerEnterprise("Windows with SQL Server Enterprise"),
    WindowsWithSQLServerStandard("Windows with SQL Server Standard"),
    WindowsWithSQLServerWeb("Windows with SQL Server Web"),
    LinuxWithSQLServerStandard("Linux with SQL Server Standard"),
    LinuxWithSQLServerWeb("Linux with SQL Server Web"),
    LinuxWithSQLServerEnterprise("Linux with SQL Server Enterprise");

    private String value;

    private CapacityReservationInstancePlatform(String value) {
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
     * @return CapacityReservationInstancePlatform corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CapacityReservationInstancePlatform fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CapacityReservationInstancePlatform enumEntry : CapacityReservationInstancePlatform.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
