/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Instance Type
 */
public enum InstanceType {
    
    T1Micro("t1.micro"),
    M1Small("m1.small"),
    M1Medium("m1.medium"),
    M1Large("m1.large"),
    M1Xlarge("m1.xlarge"),
    M2Xlarge("m2.xlarge"),
    M22xlarge("m2.2xlarge"),
    M24xlarge("m2.4xlarge"),
    C1Medium("c1.medium"),
    C1Xlarge("c1.xlarge"),
    Cc14xlarge("cc1.4xlarge"),
    Cc28xlarge("cc2.8xlarge"),
    Cg14xlarge("cg1.4xlarge");

    private String value;

    private InstanceType(String value) {
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
     * @return InstanceType corresponding to the value
     */
    public static InstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("t1.micro".equals(value)) {
            return InstanceType.T1Micro;
        } else if ("m1.small".equals(value)) {
            return InstanceType.M1Small;
        } else if ("m1.medium".equals(value)) {
            return InstanceType.M1Medium;
        } else if ("m1.large".equals(value)) {
            return InstanceType.M1Large;
        } else if ("m1.xlarge".equals(value)) {
            return InstanceType.M1Xlarge;
        } else if ("m2.xlarge".equals(value)) {
            return InstanceType.M2Xlarge;
        } else if ("m2.2xlarge".equals(value)) {
            return InstanceType.M22xlarge;
        } else if ("m2.4xlarge".equals(value)) {
            return InstanceType.M24xlarge;
        } else if ("c1.medium".equals(value)) {
            return InstanceType.C1Medium;
        } else if ("c1.xlarge".equals(value)) {
            return InstanceType.C1Xlarge;
        } else if ("cc1.4xlarge".equals(value)) {
            return InstanceType.Cc14xlarge;
        } else if ("cc2.8xlarge".equals(value)) {
            return InstanceType.Cc28xlarge;
        } else if ("cg1.4xlarge".equals(value)) {
            return InstanceType.Cg14xlarge;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    