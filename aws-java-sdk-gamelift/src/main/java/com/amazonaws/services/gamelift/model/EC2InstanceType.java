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
package com.amazonaws.services.gamelift.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
    R4Large("r4.large"),
    R4Xlarge("r4.xlarge"),
    R42xlarge("r4.2xlarge"),
    R44xlarge("r4.4xlarge"),
    R48xlarge("r4.8xlarge"),
    R416xlarge("r4.16xlarge"),
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
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EC2InstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EC2InstanceType enumEntry : EC2InstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
