/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OpenSearchPartitionInstanceType {

    M3MediumSearch("m3.medium.search"),
    M3LargeSearch("m3.large.search"),
    M3XlargeSearch("m3.xlarge.search"),
    M32xlargeSearch("m3.2xlarge.search"),
    M4LargeSearch("m4.large.search"),
    M4XlargeSearch("m4.xlarge.search"),
    M42xlargeSearch("m4.2xlarge.search"),
    M44xlargeSearch("m4.4xlarge.search"),
    M410xlargeSearch("m4.10xlarge.search"),
    M5LargeSearch("m5.large.search"),
    M5XlargeSearch("m5.xlarge.search"),
    M52xlargeSearch("m5.2xlarge.search"),
    M54xlargeSearch("m5.4xlarge.search"),
    M512xlargeSearch("m5.12xlarge.search"),
    M524xlargeSearch("m5.24xlarge.search"),
    R5LargeSearch("r5.large.search"),
    R5XlargeSearch("r5.xlarge.search"),
    R52xlargeSearch("r5.2xlarge.search"),
    R54xlargeSearch("r5.4xlarge.search"),
    R512xlargeSearch("r5.12xlarge.search"),
    R524xlargeSearch("r5.24xlarge.search"),
    C5LargeSearch("c5.large.search"),
    C5XlargeSearch("c5.xlarge.search"),
    C52xlargeSearch("c5.2xlarge.search"),
    C54xlargeSearch("c5.4xlarge.search"),
    C59xlargeSearch("c5.9xlarge.search"),
    C518xlargeSearch("c5.18xlarge.search"),
    T3NanoSearch("t3.nano.search"),
    T3MicroSearch("t3.micro.search"),
    T3SmallSearch("t3.small.search"),
    T3MediumSearch("t3.medium.search"),
    T3LargeSearch("t3.large.search"),
    T3XlargeSearch("t3.xlarge.search"),
    T32xlargeSearch("t3.2xlarge.search"),
    Ultrawarm1MediumSearch("ultrawarm1.medium.search"),
    Ultrawarm1LargeSearch("ultrawarm1.large.search"),
    Ultrawarm1XlargeSearch("ultrawarm1.xlarge.search"),
    T2MicroSearch("t2.micro.search"),
    T2SmallSearch("t2.small.search"),
    T2MediumSearch("t2.medium.search"),
    R3LargeSearch("r3.large.search"),
    R3XlargeSearch("r3.xlarge.search"),
    R32xlargeSearch("r3.2xlarge.search"),
    R34xlargeSearch("r3.4xlarge.search"),
    R38xlargeSearch("r3.8xlarge.search"),
    I2XlargeSearch("i2.xlarge.search"),
    I22xlargeSearch("i2.2xlarge.search"),
    D2XlargeSearch("d2.xlarge.search"),
    D22xlargeSearch("d2.2xlarge.search"),
    D24xlargeSearch("d2.4xlarge.search"),
    D28xlargeSearch("d2.8xlarge.search"),
    C4LargeSearch("c4.large.search"),
    C4XlargeSearch("c4.xlarge.search"),
    C42xlargeSearch("c4.2xlarge.search"),
    C44xlargeSearch("c4.4xlarge.search"),
    C48xlargeSearch("c4.8xlarge.search"),
    R4LargeSearch("r4.large.search"),
    R4XlargeSearch("r4.xlarge.search"),
    R42xlargeSearch("r4.2xlarge.search"),
    R44xlargeSearch("r4.4xlarge.search"),
    R48xlargeSearch("r4.8xlarge.search"),
    R416xlargeSearch("r4.16xlarge.search"),
    I3LargeSearch("i3.large.search"),
    I3XlargeSearch("i3.xlarge.search"),
    I32xlargeSearch("i3.2xlarge.search"),
    I34xlargeSearch("i3.4xlarge.search"),
    I38xlargeSearch("i3.8xlarge.search"),
    I316xlargeSearch("i3.16xlarge.search"),
    R6gLargeSearch("r6g.large.search"),
    R6gXlargeSearch("r6g.xlarge.search"),
    R6g2xlargeSearch("r6g.2xlarge.search"),
    R6g4xlargeSearch("r6g.4xlarge.search"),
    R6g8xlargeSearch("r6g.8xlarge.search"),
    R6g12xlargeSearch("r6g.12xlarge.search"),
    M6gLargeSearch("m6g.large.search"),
    M6gXlargeSearch("m6g.xlarge.search"),
    M6g2xlargeSearch("m6g.2xlarge.search"),
    M6g4xlargeSearch("m6g.4xlarge.search"),
    M6g8xlargeSearch("m6g.8xlarge.search"),
    M6g12xlargeSearch("m6g.12xlarge.search"),
    C6gLargeSearch("c6g.large.search"),
    C6gXlargeSearch("c6g.xlarge.search"),
    C6g2xlargeSearch("c6g.2xlarge.search"),
    C6g4xlargeSearch("c6g.4xlarge.search"),
    C6g8xlargeSearch("c6g.8xlarge.search"),
    C6g12xlargeSearch("c6g.12xlarge.search"),
    R6gdLargeSearch("r6gd.large.search"),
    R6gdXlargeSearch("r6gd.xlarge.search"),
    R6gd2xlargeSearch("r6gd.2xlarge.search"),
    R6gd4xlargeSearch("r6gd.4xlarge.search"),
    R6gd8xlargeSearch("r6gd.8xlarge.search"),
    R6gd12xlargeSearch("r6gd.12xlarge.search"),
    R6gd16xlargeSearch("r6gd.16xlarge.search"),
    T4gSmallSearch("t4g.small.search"),
    T4gMediumSearch("t4g.medium.search");

    private String value;

    private OpenSearchPartitionInstanceType(String value) {
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
     * @return OpenSearchPartitionInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OpenSearchPartitionInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OpenSearchPartitionInstanceType enumEntry : OpenSearchPartitionInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
