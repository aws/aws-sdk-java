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
package com.amazonaws.services.machinelearning.model;

import javax.annotation.Generated;

/**
 * <p>
 * A list of the variables to use in searching or filtering <code>DataSource</code>.
 * </p>
 * <ul>
 * <li> <code>CreatedAt</code> - Sets the search criteria to <code>DataSource</code> creation date.</li>
 * <li> <code>Status</code> - Sets the search criteria to <code>DataSource</code> status.</li>
 * <li> <code>Name</code> - Sets the search criteria to the contents of <code>DataSource</code> <b> </b>
 * <code>Name</code>.</li>
 * <li> <code>DataUri</code> - Sets the search criteria to the URI of data files used to create the
 * <code>DataSource</code>. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or
 * directory.</li>
 * <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>DataSource</code>
 * creation.</li>
 * </ul>
 * <note><title>Note</title>
 * <p>
 * The variable names should match the variable names in the <code>DataSource</code>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     *        real value
     * @return DataSourceFilterVariable corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DataSourceFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DataSourceFilterVariable enumEntry : DataSourceFilterVariable.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
