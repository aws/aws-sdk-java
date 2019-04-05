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
package com.amazonaws.services.elasticsearch.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ESPartitionInstanceType {

    M3MediumElasticsearch("m3.medium.elasticsearch"),
    M3LargeElasticsearch("m3.large.elasticsearch"),
    M3XlargeElasticsearch("m3.xlarge.elasticsearch"),
    M32xlargeElasticsearch("m3.2xlarge.elasticsearch"),
    M4LargeElasticsearch("m4.large.elasticsearch"),
    M4XlargeElasticsearch("m4.xlarge.elasticsearch"),
    M42xlargeElasticsearch("m4.2xlarge.elasticsearch"),
    M44xlargeElasticsearch("m4.4xlarge.elasticsearch"),
    M410xlargeElasticsearch("m4.10xlarge.elasticsearch"),
    T2MicroElasticsearch("t2.micro.elasticsearch"),
    T2SmallElasticsearch("t2.small.elasticsearch"),
    T2MediumElasticsearch("t2.medium.elasticsearch"),
    R3LargeElasticsearch("r3.large.elasticsearch"),
    R3XlargeElasticsearch("r3.xlarge.elasticsearch"),
    R32xlargeElasticsearch("r3.2xlarge.elasticsearch"),
    R34xlargeElasticsearch("r3.4xlarge.elasticsearch"),
    R38xlargeElasticsearch("r3.8xlarge.elasticsearch"),
    I2XlargeElasticsearch("i2.xlarge.elasticsearch"),
    I22xlargeElasticsearch("i2.2xlarge.elasticsearch"),
    D2XlargeElasticsearch("d2.xlarge.elasticsearch"),
    D22xlargeElasticsearch("d2.2xlarge.elasticsearch"),
    D24xlargeElasticsearch("d2.4xlarge.elasticsearch"),
    D28xlargeElasticsearch("d2.8xlarge.elasticsearch"),
    C4LargeElasticsearch("c4.large.elasticsearch"),
    C4XlargeElasticsearch("c4.xlarge.elasticsearch"),
    C42xlargeElasticsearch("c4.2xlarge.elasticsearch"),
    C44xlargeElasticsearch("c4.4xlarge.elasticsearch"),
    C48xlargeElasticsearch("c4.8xlarge.elasticsearch"),
    R4LargeElasticsearch("r4.large.elasticsearch"),
    R4XlargeElasticsearch("r4.xlarge.elasticsearch"),
    R42xlargeElasticsearch("r4.2xlarge.elasticsearch"),
    R44xlargeElasticsearch("r4.4xlarge.elasticsearch"),
    R48xlargeElasticsearch("r4.8xlarge.elasticsearch"),
    R416xlargeElasticsearch("r4.16xlarge.elasticsearch"),
    I3LargeElasticsearch("i3.large.elasticsearch"),
    I3XlargeElasticsearch("i3.xlarge.elasticsearch"),
    I32xlargeElasticsearch("i3.2xlarge.elasticsearch"),
    I34xlargeElasticsearch("i3.4xlarge.elasticsearch"),
    I38xlargeElasticsearch("i3.8xlarge.elasticsearch"),
    I316xlargeElasticsearch("i3.16xlarge.elasticsearch");

    private String value;

    private ESPartitionInstanceType(String value) {
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
     * @return ESPartitionInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ESPartitionInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ESPartitionInstanceType enumEntry : ESPartitionInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
