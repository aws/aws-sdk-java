/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

/**
 * Summary Status
 */
public enum SummaryStatus {
    
    Ok("ok"),
    Impaired("impaired"),
    InsufficientData("insufficient-data"),
    NotApplicable("not-applicable");

    private String value;

    private SummaryStatus(String value) {
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
     *            real value
     * @return SummaryStatus corresponding to the value
     */
    public static SummaryStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("ok".equals(value)) {
            return SummaryStatus.Ok;
        } else if ("impaired".equals(value)) {
            return SummaryStatus.Impaired;
        } else if ("insufficient-data".equals(value)) {
            return SummaryStatus.InsufficientData;
        } else if ("not-applicable".equals(value)) {
            return SummaryStatus.NotApplicable;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    