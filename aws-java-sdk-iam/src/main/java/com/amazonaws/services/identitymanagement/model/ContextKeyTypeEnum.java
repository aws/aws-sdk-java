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

package com.amazonaws.services.identitymanagement.model;

/**
 * 
 */
public enum ContextKeyTypeEnum {

    String("string"),
    StringList("stringList"),
    Numeric("numeric"),
    NumericList("numericList"),
    Boolean("boolean"),
    BooleanList("booleanList"),
    Ip("ip"),
    IpList("ipList"),
    Binary("binary"),
    BinaryList("binaryList"),
    Date("date"),
    DateList("dateList");

    private String value;

    private ContextKeyTypeEnum(String value) {
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
     * @return ContextKeyTypeEnum corresponding to the value
     */
    public static ContextKeyTypeEnum fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("string".equals(value)) {
            return String;
        } else if ("stringList".equals(value)) {
            return StringList;
        } else if ("numeric".equals(value)) {
            return Numeric;
        } else if ("numericList".equals(value)) {
            return NumericList;
        } else if ("boolean".equals(value)) {
            return Boolean;
        } else if ("booleanList".equals(value)) {
            return BooleanList;
        } else if ("ip".equals(value)) {
            return Ip;
        } else if ("ipList".equals(value)) {
            return IpList;
        } else if ("binary".equals(value)) {
            return Binary;
        } else if ("binaryList".equals(value)) {
            return BinaryList;
        } else if ("date".equals(value)) {
            return Date;
        } else if ("dateList".equals(value)) {
            return DateList;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}