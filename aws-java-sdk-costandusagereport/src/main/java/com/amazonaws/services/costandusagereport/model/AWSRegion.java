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
package com.amazonaws.services.costandusagereport.model;

import javax.annotation.Generated;

/**
 * <p>
 * The region of the S3 bucket that AWS delivers the report into.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AWSRegion {

    UsEast1("us-east-1"),
    UsWest1("us-west-1"),
    UsWest2("us-west-2"),
    EuCentral1("eu-central-1"),
    EuWest1("eu-west-1"),
    ApSoutheast1("ap-southeast-1"),
    ApSoutheast2("ap-southeast-2"),
    ApNortheast1("ap-northeast-1"),
    EuNorth1("eu-north-1"),
    ApNortheast3("ap-northeast-3");

    private String value;

    private AWSRegion(String value) {
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
     * @return AWSRegion corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AWSRegion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AWSRegion enumEntry : AWSRegion.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
