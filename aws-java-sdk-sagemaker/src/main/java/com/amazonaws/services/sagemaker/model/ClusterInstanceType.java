/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public enum ClusterInstanceType {

    MlP4d24xlarge("ml.p4d.24xlarge"),
    MlP4de24xlarge("ml.p4de.24xlarge"),
    MlP548xlarge("ml.p5.48xlarge"),
    MlTrn132xlarge("ml.trn1.32xlarge"),
    MlTrn1n32xlarge("ml.trn1n.32xlarge"),
    MlG5Xlarge("ml.g5.xlarge"),
    MlG52xlarge("ml.g5.2xlarge"),
    MlG54xlarge("ml.g5.4xlarge"),
    MlG58xlarge("ml.g5.8xlarge"),
    MlG512xlarge("ml.g5.12xlarge"),
    MlG516xlarge("ml.g5.16xlarge"),
    MlG524xlarge("ml.g5.24xlarge"),
    MlG548xlarge("ml.g5.48xlarge"),
    MlC5Large("ml.c5.large"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC512xlarge("ml.c5.12xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlC524xlarge("ml.c5.24xlarge"),
    MlC5nLarge("ml.c5n.large"),
    MlC5n2xlarge("ml.c5n.2xlarge"),
    MlC5n4xlarge("ml.c5n.4xlarge"),
    MlC5n9xlarge("ml.c5n.9xlarge"),
    MlC5n18xlarge("ml.c5n.18xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM58xlarge("ml.m5.8xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM516xlarge("ml.m5.16xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlT3Medium("ml.t3.medium"),
    MlT3Large("ml.t3.large"),
    MlT3Xlarge("ml.t3.xlarge"),
    MlT32xlarge("ml.t3.2xlarge");

    private String value;

    private ClusterInstanceType(String value) {
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
     * @return ClusterInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ClusterInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ClusterInstanceType enumEntry : ClusterInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
