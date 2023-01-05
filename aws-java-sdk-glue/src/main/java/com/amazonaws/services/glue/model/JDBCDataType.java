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
package com.amazonaws.services.glue.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum JDBCDataType {

    ARRAY("ARRAY"),
    BIGINT("BIGINT"),
    BINARY("BINARY"),
    BIT("BIT"),
    BLOB("BLOB"),
    BOOLEAN("BOOLEAN"),
    CHAR("CHAR"),
    CLOB("CLOB"),
    DATALINK("DATALINK"),
    DATE("DATE"),
    DECIMAL("DECIMAL"),
    DISTINCT("DISTINCT"),
    DOUBLE("DOUBLE"),
    FLOAT("FLOAT"),
    INTEGER("INTEGER"),
    JAVA_OBJECT("JAVA_OBJECT"),
    LONGNVARCHAR("LONGNVARCHAR"),
    LONGVARBINARY("LONGVARBINARY"),
    LONGVARCHAR("LONGVARCHAR"),
    NCHAR("NCHAR"),
    NCLOB("NCLOB"),
    NULL("NULL"),
    NUMERIC("NUMERIC"),
    NVARCHAR("NVARCHAR"),
    OTHER("OTHER"),
    REAL("REAL"),
    REF("REF"),
    REF_CURSOR("REF_CURSOR"),
    ROWID("ROWID"),
    SMALLINT("SMALLINT"),
    SQLXML("SQLXML"),
    STRUCT("STRUCT"),
    TIME("TIME"),
    TIME_WITH_TIMEZONE("TIME_WITH_TIMEZONE"),
    TIMESTAMP("TIMESTAMP"),
    TIMESTAMP_WITH_TIMEZONE("TIMESTAMP_WITH_TIMEZONE"),
    TINYINT("TINYINT"),
    VARBINARY("VARBINARY"),
    VARCHAR("VARCHAR");

    private String value;

    private JDBCDataType(String value) {
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
     * @return JDBCDataType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static JDBCDataType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (JDBCDataType enumEntry : JDBCDataType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
