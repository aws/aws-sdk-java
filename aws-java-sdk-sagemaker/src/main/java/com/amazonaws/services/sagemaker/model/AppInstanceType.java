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
package com.amazonaws.services.sagemaker.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AppInstanceType {

    System("system"),
    MlT3Micro("ml.t3.micro"),
    MlT3Small("ml.t3.small"),
    MlT3Medium("ml.t3.medium"),
    MlT3Large("ml.t3.large"),
    MlT3Xlarge("ml.t3.xlarge"),
    MlT32xlarge("ml.t3.2xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM58xlarge("ml.m5.8xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM516xlarge("ml.m5.16xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlM5dLarge("ml.m5d.large"),
    MlM5dXlarge("ml.m5d.xlarge"),
    MlM5d2xlarge("ml.m5d.2xlarge"),
    MlM5d4xlarge("ml.m5d.4xlarge"),
    MlM5d8xlarge("ml.m5d.8xlarge"),
    MlM5d12xlarge("ml.m5d.12xlarge"),
    MlM5d16xlarge("ml.m5d.16xlarge"),
    MlM5d24xlarge("ml.m5d.24xlarge"),
    MlC5Large("ml.c5.large"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC512xlarge("ml.c5.12xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlC524xlarge("ml.c5.24xlarge"),
    MlP32xlarge("ml.p3.2xlarge"),
    MlP38xlarge("ml.p3.8xlarge"),
    MlP316xlarge("ml.p3.16xlarge"),
    MlP3dn24xlarge("ml.p3dn.24xlarge"),
    MlG4dnXlarge("ml.g4dn.xlarge"),
    MlG4dn2xlarge("ml.g4dn.2xlarge"),
    MlG4dn4xlarge("ml.g4dn.4xlarge"),
    MlG4dn8xlarge("ml.g4dn.8xlarge"),
    MlG4dn12xlarge("ml.g4dn.12xlarge"),
    MlG4dn16xlarge("ml.g4dn.16xlarge"),
    MlR5Large("ml.r5.large"),
    MlR5Xlarge("ml.r5.xlarge"),
    MlR52xlarge("ml.r5.2xlarge"),
    MlR54xlarge("ml.r5.4xlarge"),
    MlR58xlarge("ml.r5.8xlarge"),
    MlR512xlarge("ml.r5.12xlarge"),
    MlR516xlarge("ml.r5.16xlarge"),
    MlR524xlarge("ml.r5.24xlarge"),
    MlG5Xlarge("ml.g5.xlarge"),
    MlG52xlarge("ml.g5.2xlarge"),
    MlG54xlarge("ml.g5.4xlarge"),
    MlG58xlarge("ml.g5.8xlarge"),
    MlG516xlarge("ml.g5.16xlarge"),
    MlG512xlarge("ml.g5.12xlarge"),
    MlG524xlarge("ml.g5.24xlarge"),
    MlG548xlarge("ml.g5.48xlarge");

    private String value;

    private AppInstanceType(String value) {
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
     * @return AppInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AppInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AppInstanceType enumEntry : AppInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
