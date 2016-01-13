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

package com.amazonaws.services.route53.model;

/**
 * 
 */
public enum RRType {

    SOA("SOA"),
    A("A"),
    TXT("TXT"),
    NS("NS"),
    CNAME("CNAME"),
    MX("MX"),
    PTR("PTR"),
    SRV("SRV"),
    SPF("SPF"),
    AAAA("AAAA");

    private String value;

    private RRType(String value) {
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
     * @return RRType corresponding to the value
     */
    public static RRType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("SOA".equals(value)) {
            return SOA;
        } else if ("A".equals(value)) {
            return A;
        } else if ("TXT".equals(value)) {
            return TXT;
        } else if ("NS".equals(value)) {
            return NS;
        } else if ("CNAME".equals(value)) {
            return CNAME;
        } else if ("MX".equals(value)) {
            return MX;
        } else if ("PTR".equals(value)) {
            return PTR;
        } else if ("SRV".equals(value)) {
            return SRV;
        } else if ("SPF".equals(value)) {
            return SPF;
        } else if ("AAAA".equals(value)) {
            return AAAA;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}