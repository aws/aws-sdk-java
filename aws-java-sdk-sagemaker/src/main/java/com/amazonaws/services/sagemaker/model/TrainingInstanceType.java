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
package com.amazonaws.services.sagemaker.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TrainingInstanceType {

    MlM4Xlarge("ml.m4.xlarge"),
    MlM42xlarge("ml.m4.2xlarge"),
    MlM44xlarge("ml.m4.4xlarge"),
    MlM410xlarge("ml.m4.10xlarge"),
    MlM416xlarge("ml.m4.16xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlC4Xlarge("ml.c4.xlarge"),
    MlC42xlarge("ml.c4.2xlarge"),
    MlC44xlarge("ml.c4.4xlarge"),
    MlC48xlarge("ml.c4.8xlarge"),
    MlP2Xlarge("ml.p2.xlarge"),
    MlP28xlarge("ml.p2.8xlarge"),
    MlP216xlarge("ml.p2.16xlarge"),
    MlP32xlarge("ml.p3.2xlarge"),
    MlP38xlarge("ml.p3.8xlarge"),
    MlP316xlarge("ml.p3.16xlarge"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC518xlarge("ml.c5.18xlarge");

    private String value;

    private TrainingInstanceType(String value) {
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
     * @return TrainingInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TrainingInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TrainingInstanceType enumEntry : TrainingInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
