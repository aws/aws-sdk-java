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
 * Partition Instance Type
 */
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
     *            real value
     * @return PartitionInstanceType corresponding to the value
     */
    public static PartitionInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("search.m1.small".equals(value)) {
            return PartitionInstanceType.SearchM1Small;
        } else if ("search.m1.large".equals(value)) {
            return PartitionInstanceType.SearchM1Large;
        } else if ("search.m2.xlarge".equals(value)) {
            return PartitionInstanceType.SearchM2Xlarge;
        } else if ("search.m2.2xlarge".equals(value)) {
            return PartitionInstanceType.SearchM22xlarge;
        } else if ("search.m3.medium".equals(value)) {
            return PartitionInstanceType.SearchM3Medium;
        } else if ("search.m3.large".equals(value)) {
            return PartitionInstanceType.SearchM3Large;
        } else if ("search.m3.xlarge".equals(value)) {
            return PartitionInstanceType.SearchM3Xlarge;
        } else if ("search.m3.2xlarge".equals(value)) {
            return PartitionInstanceType.SearchM32xlarge;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    