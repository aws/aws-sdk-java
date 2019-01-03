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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert
 * costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in
 * your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the
 * billing report unsorted.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BillingTagsSource {

    QUEUE("QUEUE"),
    PRESET("PRESET"),
    JOB_TEMPLATE("JOB_TEMPLATE");

    private String value;

    private BillingTagsSource(String value) {
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
     * @return BillingTagsSource corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BillingTagsSource fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BillingTagsSource enumEntry : BillingTagsSource.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
