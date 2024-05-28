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
public enum InstanceType {

    MlT2Medium("ml.t2.medium"),
    MlT2Large("ml.t2.large"),
    MlT2Xlarge("ml.t2.xlarge"),
    MlT22xlarge("ml.t2.2xlarge"),
    MlT3Medium("ml.t3.medium"),
    MlT3Large("ml.t3.large"),
    MlT3Xlarge("ml.t3.xlarge"),
    MlT32xlarge("ml.t3.2xlarge"),
    MlM4Xlarge("ml.m4.xlarge"),
    MlM42xlarge("ml.m4.2xlarge"),
    MlM44xlarge("ml.m4.4xlarge"),
    MlM410xlarge("ml.m4.10xlarge"),
    MlM416xlarge("ml.m4.16xlarge"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlM5dLarge("ml.m5d.large"),
    MlM5dXlarge("ml.m5d.xlarge"),
    MlM5d2xlarge("ml.m5d.2xlarge"),
    MlM5d4xlarge("ml.m5d.4xlarge"),
    MlM5d8xlarge("ml.m5d.8xlarge"),
    MlM5d12xlarge("ml.m5d.12xlarge"),
    MlM5d16xlarge("ml.m5d.16xlarge"),
    MlM5d24xlarge("ml.m5d.24xlarge"),
    MlC4Xlarge("ml.c4.xlarge"),
    MlC42xlarge("ml.c4.2xlarge"),
    MlC44xlarge("ml.c4.4xlarge"),
    MlC48xlarge("ml.c4.8xlarge"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlC5dXlarge("ml.c5d.xlarge"),
    MlC5d2xlarge("ml.c5d.2xlarge"),
    MlC5d4xlarge("ml.c5d.4xlarge"),
    MlC5d9xlarge("ml.c5d.9xlarge"),
    MlC5d18xlarge("ml.c5d.18xlarge"),
    MlP2Xlarge("ml.p2.xlarge"),
    MlP28xlarge("ml.p2.8xlarge"),
    MlP216xlarge("ml.p2.16xlarge"),
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
    MlG548xlarge("ml.g5.48xlarge"),
    MlInf1Xlarge("ml.inf1.xlarge"),
    MlInf12xlarge("ml.inf1.2xlarge"),
    MlInf16xlarge("ml.inf1.6xlarge"),
    MlInf124xlarge("ml.inf1.24xlarge"),
    MlP4d24xlarge("ml.p4d.24xlarge"),
    MlP4de24xlarge("ml.p4de.24xlarge"),
    MlP548xlarge("ml.p5.48xlarge"),
    MlM6iLarge("ml.m6i.large"),
    MlM6iXlarge("ml.m6i.xlarge"),
    MlM6i2xlarge("ml.m6i.2xlarge"),
    MlM6i4xlarge("ml.m6i.4xlarge"),
    MlM6i8xlarge("ml.m6i.8xlarge"),
    MlM6i12xlarge("ml.m6i.12xlarge"),
    MlM6i16xlarge("ml.m6i.16xlarge"),
    MlM6i24xlarge("ml.m6i.24xlarge"),
    MlM6i32xlarge("ml.m6i.32xlarge"),
    MlM7iLarge("ml.m7i.large"),
    MlM7iXlarge("ml.m7i.xlarge"),
    MlM7i2xlarge("ml.m7i.2xlarge"),
    MlM7i4xlarge("ml.m7i.4xlarge"),
    MlM7i8xlarge("ml.m7i.8xlarge"),
    MlM7i12xlarge("ml.m7i.12xlarge"),
    MlM7i16xlarge("ml.m7i.16xlarge"),
    MlM7i24xlarge("ml.m7i.24xlarge"),
    MlM7i48xlarge("ml.m7i.48xlarge"),
    MlC6iLarge("ml.c6i.large"),
    MlC6iXlarge("ml.c6i.xlarge"),
    MlC6i2xlarge("ml.c6i.2xlarge"),
    MlC6i4xlarge("ml.c6i.4xlarge"),
    MlC6i8xlarge("ml.c6i.8xlarge"),
    MlC6i12xlarge("ml.c6i.12xlarge"),
    MlC6i16xlarge("ml.c6i.16xlarge"),
    MlC6i24xlarge("ml.c6i.24xlarge"),
    MlC6i32xlarge("ml.c6i.32xlarge"),
    MlC7iLarge("ml.c7i.large"),
    MlC7iXlarge("ml.c7i.xlarge"),
    MlC7i2xlarge("ml.c7i.2xlarge"),
    MlC7i4xlarge("ml.c7i.4xlarge"),
    MlC7i8xlarge("ml.c7i.8xlarge"),
    MlC7i12xlarge("ml.c7i.12xlarge"),
    MlC7i16xlarge("ml.c7i.16xlarge"),
    MlC7i24xlarge("ml.c7i.24xlarge"),
    MlC7i48xlarge("ml.c7i.48xlarge"),
    MlR6iLarge("ml.r6i.large"),
    MlR6iXlarge("ml.r6i.xlarge"),
    MlR6i2xlarge("ml.r6i.2xlarge"),
    MlR6i4xlarge("ml.r6i.4xlarge"),
    MlR6i8xlarge("ml.r6i.8xlarge"),
    MlR6i12xlarge("ml.r6i.12xlarge"),
    MlR6i16xlarge("ml.r6i.16xlarge"),
    MlR6i24xlarge("ml.r6i.24xlarge"),
    MlR6i32xlarge("ml.r6i.32xlarge"),
    MlR7iLarge("ml.r7i.large"),
    MlR7iXlarge("ml.r7i.xlarge"),
    MlR7i2xlarge("ml.r7i.2xlarge"),
    MlR7i4xlarge("ml.r7i.4xlarge"),
    MlR7i8xlarge("ml.r7i.8xlarge"),
    MlR7i12xlarge("ml.r7i.12xlarge"),
    MlR7i16xlarge("ml.r7i.16xlarge"),
    MlR7i24xlarge("ml.r7i.24xlarge"),
    MlR7i48xlarge("ml.r7i.48xlarge"),
    MlM6idLarge("ml.m6id.large"),
    MlM6idXlarge("ml.m6id.xlarge"),
    MlM6id2xlarge("ml.m6id.2xlarge"),
    MlM6id4xlarge("ml.m6id.4xlarge"),
    MlM6id8xlarge("ml.m6id.8xlarge"),
    MlM6id12xlarge("ml.m6id.12xlarge"),
    MlM6id16xlarge("ml.m6id.16xlarge"),
    MlM6id24xlarge("ml.m6id.24xlarge"),
    MlM6id32xlarge("ml.m6id.32xlarge"),
    MlC6idLarge("ml.c6id.large"),
    MlC6idXlarge("ml.c6id.xlarge"),
    MlC6id2xlarge("ml.c6id.2xlarge"),
    MlC6id4xlarge("ml.c6id.4xlarge"),
    MlC6id8xlarge("ml.c6id.8xlarge"),
    MlC6id12xlarge("ml.c6id.12xlarge"),
    MlC6id16xlarge("ml.c6id.16xlarge"),
    MlC6id24xlarge("ml.c6id.24xlarge"),
    MlC6id32xlarge("ml.c6id.32xlarge"),
    MlR6idLarge("ml.r6id.large"),
    MlR6idXlarge("ml.r6id.xlarge"),
    MlR6id2xlarge("ml.r6id.2xlarge"),
    MlR6id4xlarge("ml.r6id.4xlarge"),
    MlR6id8xlarge("ml.r6id.8xlarge"),
    MlR6id12xlarge("ml.r6id.12xlarge"),
    MlR6id16xlarge("ml.r6id.16xlarge"),
    MlR6id24xlarge("ml.r6id.24xlarge"),
    MlR6id32xlarge("ml.r6id.32xlarge"),
    MlG6Xlarge("ml.g6.xlarge"),
    MlG62xlarge("ml.g6.2xlarge"),
    MlG64xlarge("ml.g6.4xlarge"),
    MlG68xlarge("ml.g6.8xlarge"),
    MlG612xlarge("ml.g6.12xlarge"),
    MlG616xlarge("ml.g6.16xlarge"),
    MlG624xlarge("ml.g6.24xlarge"),
    MlG648xlarge("ml.g6.48xlarge");

    private String value;

    private InstanceType(String value) {
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
     * @return InstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static InstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InstanceType enumEntry : InstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
