/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    MlC42xlarge("ml.c4.2xlarge"),
    MlC48xlarge("ml.c4.8xlarge"),
    MlC4Xlarge("ml.c4.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlM4Xlarge("ml.m4.xlarge"),
    MlP2Xlarge("ml.p2.xlarge"),
    MlP32xlarge("ml.p3.2xlarge"),
    MlT2Medium("ml.t2.medium");

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
