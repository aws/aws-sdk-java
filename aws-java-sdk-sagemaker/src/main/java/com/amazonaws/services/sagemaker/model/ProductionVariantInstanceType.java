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
public enum ProductionVariantInstanceType {

    MlT2Medium("ml.t2.medium"),
    MlT2Large("ml.t2.large"),
    MlT2Xlarge("ml.t2.xlarge"),
    MlT22xlarge("ml.t2.2xlarge"),
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
    MlM5dLarge("ml.m5d.large"),
    MlM5dXlarge("ml.m5d.xlarge"),
    MlM5d2xlarge("ml.m5d.2xlarge"),
    MlM5d4xlarge("ml.m5d.4xlarge"),
    MlM5d12xlarge("ml.m5d.12xlarge"),
    MlM5d24xlarge("ml.m5d.24xlarge"),
    MlC4Large("ml.c4.large"),
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
    MlC5Large("ml.c5.large"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlC5dLarge("ml.c5d.large"),
    MlC5dXlarge("ml.c5d.xlarge"),
    MlC5d2xlarge("ml.c5d.2xlarge"),
    MlC5d4xlarge("ml.c5d.4xlarge"),
    MlC5d9xlarge("ml.c5d.9xlarge"),
    MlC5d18xlarge("ml.c5d.18xlarge"),
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
    MlR512xlarge("ml.r5.12xlarge"),
    MlR524xlarge("ml.r5.24xlarge"),
    MlR5dLarge("ml.r5d.large"),
    MlR5dXlarge("ml.r5d.xlarge"),
    MlR5d2xlarge("ml.r5d.2xlarge"),
    MlR5d4xlarge("ml.r5d.4xlarge"),
    MlR5d12xlarge("ml.r5d.12xlarge"),
    MlR5d24xlarge("ml.r5d.24xlarge"),
    MlInf1Xlarge("ml.inf1.xlarge"),
    MlInf12xlarge("ml.inf1.2xlarge"),
    MlInf16xlarge("ml.inf1.6xlarge"),
    MlInf124xlarge("ml.inf1.24xlarge"),
    MlDl124xlarge("ml.dl1.24xlarge"),
    MlC6iLarge("ml.c6i.large"),
    MlC6iXlarge("ml.c6i.xlarge"),
    MlC6i2xlarge("ml.c6i.2xlarge"),
    MlC6i4xlarge("ml.c6i.4xlarge"),
    MlC6i8xlarge("ml.c6i.8xlarge"),
    MlC6i12xlarge("ml.c6i.12xlarge"),
    MlC6i16xlarge("ml.c6i.16xlarge"),
    MlC6i24xlarge("ml.c6i.24xlarge"),
    MlC6i32xlarge("ml.c6i.32xlarge"),
    MlG5Xlarge("ml.g5.xlarge"),
    MlG52xlarge("ml.g5.2xlarge"),
    MlG54xlarge("ml.g5.4xlarge"),
    MlG58xlarge("ml.g5.8xlarge"),
    MlG512xlarge("ml.g5.12xlarge"),
    MlG516xlarge("ml.g5.16xlarge"),
    MlG524xlarge("ml.g5.24xlarge"),
    MlG548xlarge("ml.g5.48xlarge"),
    MlG6Xlarge("ml.g6.xlarge"),
    MlG62xlarge("ml.g6.2xlarge"),
    MlG64xlarge("ml.g6.4xlarge"),
    MlG68xlarge("ml.g6.8xlarge"),
    MlG612xlarge("ml.g6.12xlarge"),
    MlG616xlarge("ml.g6.16xlarge"),
    MlG624xlarge("ml.g6.24xlarge"),
    MlG648xlarge("ml.g6.48xlarge"),
    MlP4d24xlarge("ml.p4d.24xlarge"),
    MlC7gLarge("ml.c7g.large"),
    MlC7gXlarge("ml.c7g.xlarge"),
    MlC7g2xlarge("ml.c7g.2xlarge"),
    MlC7g4xlarge("ml.c7g.4xlarge"),
    MlC7g8xlarge("ml.c7g.8xlarge"),
    MlC7g12xlarge("ml.c7g.12xlarge"),
    MlC7g16xlarge("ml.c7g.16xlarge"),
    MlM6gLarge("ml.m6g.large"),
    MlM6gXlarge("ml.m6g.xlarge"),
    MlM6g2xlarge("ml.m6g.2xlarge"),
    MlM6g4xlarge("ml.m6g.4xlarge"),
    MlM6g8xlarge("ml.m6g.8xlarge"),
    MlM6g12xlarge("ml.m6g.12xlarge"),
    MlM6g16xlarge("ml.m6g.16xlarge"),
    MlM6gdLarge("ml.m6gd.large"),
    MlM6gdXlarge("ml.m6gd.xlarge"),
    MlM6gd2xlarge("ml.m6gd.2xlarge"),
    MlM6gd4xlarge("ml.m6gd.4xlarge"),
    MlM6gd8xlarge("ml.m6gd.8xlarge"),
    MlM6gd12xlarge("ml.m6gd.12xlarge"),
    MlM6gd16xlarge("ml.m6gd.16xlarge"),
    MlC6gLarge("ml.c6g.large"),
    MlC6gXlarge("ml.c6g.xlarge"),
    MlC6g2xlarge("ml.c6g.2xlarge"),
    MlC6g4xlarge("ml.c6g.4xlarge"),
    MlC6g8xlarge("ml.c6g.8xlarge"),
    MlC6g12xlarge("ml.c6g.12xlarge"),
    MlC6g16xlarge("ml.c6g.16xlarge"),
    MlC6gdLarge("ml.c6gd.large"),
    MlC6gdXlarge("ml.c6gd.xlarge"),
    MlC6gd2xlarge("ml.c6gd.2xlarge"),
    MlC6gd4xlarge("ml.c6gd.4xlarge"),
    MlC6gd8xlarge("ml.c6gd.8xlarge"),
    MlC6gd12xlarge("ml.c6gd.12xlarge"),
    MlC6gd16xlarge("ml.c6gd.16xlarge"),
    MlC6gnLarge("ml.c6gn.large"),
    MlC6gnXlarge("ml.c6gn.xlarge"),
    MlC6gn2xlarge("ml.c6gn.2xlarge"),
    MlC6gn4xlarge("ml.c6gn.4xlarge"),
    MlC6gn8xlarge("ml.c6gn.8xlarge"),
    MlC6gn12xlarge("ml.c6gn.12xlarge"),
    MlC6gn16xlarge("ml.c6gn.16xlarge"),
    MlR6gLarge("ml.r6g.large"),
    MlR6gXlarge("ml.r6g.xlarge"),
    MlR6g2xlarge("ml.r6g.2xlarge"),
    MlR6g4xlarge("ml.r6g.4xlarge"),
    MlR6g8xlarge("ml.r6g.8xlarge"),
    MlR6g12xlarge("ml.r6g.12xlarge"),
    MlR6g16xlarge("ml.r6g.16xlarge"),
    MlR6gdLarge("ml.r6gd.large"),
    MlR6gdXlarge("ml.r6gd.xlarge"),
    MlR6gd2xlarge("ml.r6gd.2xlarge"),
    MlR6gd4xlarge("ml.r6gd.4xlarge"),
    MlR6gd8xlarge("ml.r6gd.8xlarge"),
    MlR6gd12xlarge("ml.r6gd.12xlarge"),
    MlR6gd16xlarge("ml.r6gd.16xlarge"),
    MlP4de24xlarge("ml.p4de.24xlarge"),
    MlTrn12xlarge("ml.trn1.2xlarge"),
    MlTrn132xlarge("ml.trn1.32xlarge"),
    MlTrn1n32xlarge("ml.trn1n.32xlarge"),
    MlInf2Xlarge("ml.inf2.xlarge"),
    MlInf28xlarge("ml.inf2.8xlarge"),
    MlInf224xlarge("ml.inf2.24xlarge"),
    MlInf248xlarge("ml.inf2.48xlarge"),
    MlP548xlarge("ml.p5.48xlarge"),
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
    MlR7i48xlarge("ml.r7i.48xlarge");

    private String value;

    private ProductionVariantInstanceType(String value) {
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
     * @return ProductionVariantInstanceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ProductionVariantInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ProductionVariantInstanceType enumEntry : ProductionVariantInstanceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
