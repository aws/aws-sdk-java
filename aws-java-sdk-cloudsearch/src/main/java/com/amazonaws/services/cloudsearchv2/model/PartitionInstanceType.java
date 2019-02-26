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
package com.amazonaws.services.cloudsearchv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PartitionInstanceType {

    SearchM1Small("search.m1.small"),
    SearchM1Large("search.m1.large"),
    SearchM2Xlarge("search.m2.xlarge"),
    SearchM22xlarge("search.m2.2xlarge"),
    SearchM3Medium("search.m3.medium"),
    SearchM3Large("search.m3.large"),
    SearchM3Xlarge("search.m3.xlarge"),
    SearchM32xlarge("search.m3.2xlarge");

    private String value;

    private PartitionInstanceType(String value) {
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
     * @return PartitionInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PartitionInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PartitionInstanceType enumEntry : PartitionInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
