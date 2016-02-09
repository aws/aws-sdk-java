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

package com.amazonaws.services.gamelift.model;

/**
 * 
 */
public enum EC2InstanceType {

    T2Micro("t2.micro"),
    T2Small("t2.small"),
    T2Medium("t2.medium"),
    T2Large("t2.large"),
    C3Large("c3.large"),
    C3Xlarge("c3.xlarge"),
    C32xlarge("c3.2xlarge"),
    C34xlarge("c3.4xlarge"),
    C38xlarge("c3.8xlarge"),
    C4Large("c4.large"),
    C4Xlarge("c4.xlarge"),
    C42xlarge("c4.2xlarge"),
    C44xlarge("c4.4xlarge"),
    C48xlarge("c4.8xlarge"),
    R3Large("r3.large"),
    R3Xlarge("r3.xlarge"),
    R32xlarge("r3.2xlarge"),
    R34xlarge("r3.4xlarge"),
    R38xlarge("r3.8xlarge"),
    M3Medium("m3.medium"),
    M3Large("m3.large"),
    M3Xlarge("m3.xlarge"),
    M32xlarge("m3.2xlarge"),
    M4Large("m4.large"),
    M4Xlarge("m4.xlarge"),
    M42xlarge("m4.2xlarge"),
    M44xlarge("m4.4xlarge"),
    M410xlarge("m4.10xlarge");

    private String value;

    private EC2InstanceType(String value) {
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
     * @return EC2InstanceType corresponding to the value
     */
    public static EC2InstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("t2.micro".equals(value)) {
            return T2Micro;
        } else if ("t2.small".equals(value)) {
            return T2Small;
        } else if ("t2.medium".equals(value)) {
            return T2Medium;
        } else if ("t2.large".equals(value)) {
            return T2Large;
        } else if ("c3.large".equals(value)) {
            return C3Large;
        } else if ("c3.xlarge".equals(value)) {
            return C3Xlarge;
        } else if ("c3.2xlarge".equals(value)) {
            return C32xlarge;
        } else if ("c3.4xlarge".equals(value)) {
            return C34xlarge;
        } else if ("c3.8xlarge".equals(value)) {
            return C38xlarge;
        } else if ("c4.large".equals(value)) {
            return C4Large;
        } else if ("c4.xlarge".equals(value)) {
            return C4Xlarge;
        } else if ("c4.2xlarge".equals(value)) {
            return C42xlarge;
        } else if ("c4.4xlarge".equals(value)) {
            return C44xlarge;
        } else if ("c4.8xlarge".equals(value)) {
            return C48xlarge;
        } else if ("r3.large".equals(value)) {
            return R3Large;
        } else if ("r3.xlarge".equals(value)) {
            return R3Xlarge;
        } else if ("r3.2xlarge".equals(value)) {
            return R32xlarge;
        } else if ("r3.4xlarge".equals(value)) {
            return R34xlarge;
        } else if ("r3.8xlarge".equals(value)) {
            return R38xlarge;
        } else if ("m3.medium".equals(value)) {
            return M3Medium;
        } else if ("m3.large".equals(value)) {
            return M3Large;
        } else if ("m3.xlarge".equals(value)) {
            return M3Xlarge;
        } else if ("m3.2xlarge".equals(value)) {
            return M32xlarge;
        } else if ("m4.large".equals(value)) {
            return M4Large;
        } else if ("m4.xlarge".equals(value)) {
            return M4Xlarge;
        } else if ("m4.2xlarge".equals(value)) {
            return M42xlarge;
        } else if ("m4.4xlarge".equals(value)) {
            return M44xlarge;
        } else if ("m4.10xlarge".equals(value)) {
            return M410xlarge;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}