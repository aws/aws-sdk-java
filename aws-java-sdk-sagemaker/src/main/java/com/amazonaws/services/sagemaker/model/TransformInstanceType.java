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
public enum TransformInstanceType {

    MlM4Xlarge("ml.m4.xlarge"),
    MlM42xlarge("ml.m4.2xlarge"),
    MlM44xlarge("ml.m4.4xlarge"),
    MlM410xlarge("ml.m4.10xlarge"),
    MlM416xlarge("ml.m4.16xlarge"),
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
    MlC518xlarge("ml.c5.18xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlM6iLarge("ml.m6i.large"),
    MlM6iXlarge("ml.m6i.xlarge"),
    MlM6i2xlarge("ml.m6i.2xlarge"),
    MlM6i4xlarge("ml.m6i.4xlarge"),
    MlM6i8xlarge("ml.m6i.8xlarge"),
    MlM6i12xlarge("ml.m6i.12xlarge"),
    MlM6i16xlarge("ml.m6i.16xlarge"),
    MlM6i24xlarge("ml.m6i.24xlarge"),
    MlM6i32xlarge("ml.m6i.32xlarge"),
    MlC6iLarge("ml.c6i.large"),
    MlC6iXlarge("ml.c6i.xlarge"),
    MlC6i2xlarge("ml.c6i.2xlarge"),
    MlC6i4xlarge("ml.c6i.4xlarge"),
    MlC6i8xlarge("ml.c6i.8xlarge"),
    MlC6i12xlarge("ml.c6i.12xlarge"),
    MlC6i16xlarge("ml.c6i.16xlarge"),
    MlC6i24xlarge("ml.c6i.24xlarge"),
    MlC6i32xlarge("ml.c6i.32xlarge"),
    MlR6iLarge("ml.r6i.large"),
    MlR6iXlarge("ml.r6i.xlarge"),
    MlR6i2xlarge("ml.r6i.2xlarge"),
    MlR6i4xlarge("ml.r6i.4xlarge"),
    MlR6i8xlarge("ml.r6i.8xlarge"),
    MlR6i12xlarge("ml.r6i.12xlarge"),
    MlR6i16xlarge("ml.r6i.16xlarge"),
    MlR6i24xlarge("ml.r6i.24xlarge"),
    MlR6i32xlarge("ml.r6i.32xlarge"),
    MlM7iLarge("ml.m7i.large"),
    MlM7iXlarge("ml.m7i.xlarge"),
    MlM7i2xlarge("ml.m7i.2xlarge"),
    MlM7i4xlarge("ml.m7i.4xlarge"),
    MlM7i8xlarge("ml.m7i.8xlarge"),
    MlM7i12xlarge("ml.m7i.12xlarge"),
    MlM7i16xlarge("ml.m7i.16xlarge"),
    MlM7i24xlarge("ml.m7i.24xlarge"),
    MlM7i48xlarge("ml.m7i.48xlarge"),
    MlC7iLarge("ml.c7i.large"),
    MlC7iXlarge("ml.c7i.xlarge"),
    MlC7i2xlarge("ml.c7i.2xlarge"),
    MlC7i4xlarge("ml.c7i.4xlarge"),
    MlC7i8xlarge("ml.c7i.8xlarge"),
    MlC7i12xlarge("ml.c7i.12xlarge"),
    MlC7i16xlarge("ml.c7i.16xlarge"),
    MlC7i24xlarge("ml.c7i.24xlarge"),
    MlC7i48xlarge("ml.c7i.48xlarge"),
    MlR7iLarge("ml.r7i.large"),
    MlR7iXlarge("ml.r7i.xlarge"),
    MlR7i2xlarge("ml.r7i.2xlarge"),
    MlR7i4xlarge("ml.r7i.4xlarge"),
    MlR7i8xlarge("ml.r7i.8xlarge"),
    MlR7i12xlarge("ml.r7i.12xlarge"),
    MlR7i16xlarge("ml.r7i.16xlarge"),
    MlR7i24xlarge("ml.r7i.24xlarge"),
    MlR7i48xlarge("ml.r7i.48xlarge"),
    MlG4dnXlarge("ml.g4dn.xlarge"),
    MlG4dn2xlarge("ml.g4dn.2xlarge"),
    MlG4dn4xlarge("ml.g4dn.4xlarge"),
    MlG4dn8xlarge("ml.g4dn.8xlarge"),
    MlG4dn12xlarge("ml.g4dn.12xlarge"),
    MlG4dn16xlarge("ml.g4dn.16xlarge"),
    MlG5Xlarge("ml.g5.xlarge"),
    MlG52xlarge("ml.g5.2xlarge"),
    MlG54xlarge("ml.g5.4xlarge"),
    MlG58xlarge("ml.g5.8xlarge"),
    MlG512xlarge("ml.g5.12xlarge"),
    MlG516xlarge("ml.g5.16xlarge"),
    MlG524xlarge("ml.g5.24xlarge"),
    MlG548xlarge("ml.g5.48xlarge");

    private String value;

    private TransformInstanceType(String value) {
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
     * @return TransformInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TransformInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TransformInstanceType enumEntry : TransformInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
