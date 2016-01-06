/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

/**
 * Index Field Type
 */
public enum IndexFieldType {
    
    Int("int"),
    Double("double"),
    Literal("literal"),
    Text("text"),
    Date("date"),
    Latlon("latlon"),
    IntArray("int-array"),
    DoubleArray("double-array"),
    LiteralArray("literal-array"),
    TextArray("text-array"),
    DateArray("date-array");

    private String value;

    private IndexFieldType(String value) {
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
     * @return IndexFieldType corresponding to the value
     */
    public static IndexFieldType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("int".equals(value)) {
            return IndexFieldType.Int;
        } else if ("double".equals(value)) {
            return IndexFieldType.Double;
        } else if ("literal".equals(value)) {
            return IndexFieldType.Literal;
        } else if ("text".equals(value)) {
            return IndexFieldType.Text;
        } else if ("date".equals(value)) {
            return IndexFieldType.Date;
        } else if ("latlon".equals(value)) {
            return IndexFieldType.Latlon;
        } else if ("int-array".equals(value)) {
            return IndexFieldType.IntArray;
        } else if ("double-array".equals(value)) {
            return IndexFieldType.DoubleArray;
        } else if ("literal-array".equals(value)) {
            return IndexFieldType.LiteralArray;
        } else if ("text-array".equals(value)) {
            return IndexFieldType.TextArray;
        } else if ("date-array".equals(value)) {
            return IndexFieldType.DateArray;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    