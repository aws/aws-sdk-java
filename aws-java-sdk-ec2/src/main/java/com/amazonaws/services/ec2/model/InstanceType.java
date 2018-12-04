/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public enum InstanceType {

    T1Micro("t1.micro"),
    T2Nano("t2.nano"),
    T2Micro("t2.micro"),
    T2Small("t2.small"),
    T2Medium("t2.medium"),
    T2Large("t2.large"),
    T2Xlarge("t2.xlarge"),
    T22xlarge("t2.2xlarge"),
    M1Small("m1.small"),
    M1Medium("m1.medium"),
    M1Large("m1.large"),
    M1Xlarge("m1.xlarge"),
    M3Medium("m3.medium"),
    M3Large("m3.large"),
    M3Xlarge("m3.xlarge"),
    M32xlarge("m3.2xlarge"),
    M4Large("m4.large"),
    M4Xlarge("m4.xlarge"),
    M42xlarge("m4.2xlarge"),
    M44xlarge("m4.4xlarge"),
    M410xlarge("m4.10xlarge"),
    M416xlarge("m4.16xlarge"),
    M2Xlarge("m2.xlarge"),
    M22xlarge("m2.2xlarge"),
    M24xlarge("m2.4xlarge"),
    Cr18xlarge("cr1.8xlarge"),
    R3Large("r3.large"),
    R3Xlarge("r3.xlarge"),
    R32xlarge("r3.2xlarge"),
    R34xlarge("r3.4xlarge"),
    R38xlarge("r3.8xlarge"),
    R4Large("r4.large"),
    R4Xlarge("r4.xlarge"),
    R42xlarge("r4.2xlarge"),
    R44xlarge("r4.4xlarge"),
    R48xlarge("r4.8xlarge"),
    R416xlarge("r4.16xlarge"),
    X116xlarge("x1.16xlarge"),
    X132xlarge("x1.32xlarge"),
    X1eXlarge("x1e.xlarge"),
    X1e2xlarge("x1e.2xlarge"),
    X1e4xlarge("x1e.4xlarge"),
    X1e8xlarge("x1e.8xlarge"),
    X1e16xlarge("x1e.16xlarge"),
    X1e32xlarge("x1e.32xlarge"),
    I2Xlarge("i2.xlarge"),
    I22xlarge("i2.2xlarge"),
    I24xlarge("i2.4xlarge"),
    I28xlarge("i2.8xlarge"),
    I3Large("i3.large"),
    I3Xlarge("i3.xlarge"),
    I32xlarge("i3.2xlarge"),
    I34xlarge("i3.4xlarge"),
    I38xlarge("i3.8xlarge"),
    I316xlarge("i3.16xlarge"),
    Hi14xlarge("hi1.4xlarge"),
    Hs18xlarge("hs1.8xlarge"),
    C1Medium("c1.medium"),
    C1Xlarge("c1.xlarge"),
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
    C5Large("c5.large"),
    C5Xlarge("c5.xlarge"),
    C52xlarge("c5.2xlarge"),
    C54xlarge("c5.4xlarge"),
    C59xlarge("c5.9xlarge"),
    C518xlarge("c5.18xlarge"),
    Cc14xlarge("cc1.4xlarge"),
    Cc28xlarge("cc2.8xlarge"),
    G22xlarge("g2.2xlarge"),
    G28xlarge("g2.8xlarge"),
    G34xlarge("g3.4xlarge"),
    G38xlarge("g3.8xlarge"),
    G316xlarge("g3.16xlarge"),
    Cg14xlarge("cg1.4xlarge"),
    P2Xlarge("p2.xlarge"),
    P28xlarge("p2.8xlarge"),
    P216xlarge("p2.16xlarge"),
    P32xlarge("p3.2xlarge"),
    P38xlarge("p3.8xlarge"),
    P316xlarge("p3.16xlarge"),
    D2Xlarge("d2.xlarge"),
    D22xlarge("d2.2xlarge"),
    D24xlarge("d2.4xlarge"),
    D28xlarge("d2.8xlarge"),
    F12xlarge("f1.2xlarge"),
    F116xlarge("f1.16xlarge"),
    M5Large("m5.large"),
    M5Xlarge("m5.xlarge"),
    M52xlarge("m5.2xlarge"),
    M54xlarge("m5.4xlarge"),
    M512xlarge("m5.12xlarge"),
    M524xlarge("m5.24xlarge"),
    H12xlarge("h1.2xlarge"),
    H14xlarge("h1.4xlarge"),
    H18xlarge("h1.8xlarge"),
    H116xlarge("h1.16xlarge");

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
     *        real value
     * @return InstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InstanceType enumEntry : InstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
