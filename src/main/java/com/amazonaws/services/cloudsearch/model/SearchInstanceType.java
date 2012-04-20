/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

/**
 * Search Instance Type
 */
public enum SearchInstanceType {
    
    SearchInstanceT1Micro("SearchInstance:t1.micro"),
    SearchInstanceM1Small("SearchInstance:m1.small"),
    SearchInstanceM1Large("SearchInstance:m1.large"),
    SearchInstanceM2Xlarge("SearchInstance:m2.xlarge");

    private String value;

    private SearchInstanceType(String value) {
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
     * @return SearchInstanceType corresponding to the value
     */
    public static SearchInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("SearchInstance:t1.micro".equals(value)) {
            return SearchInstanceType.SearchInstanceT1Micro;
        } else if ("SearchInstance:m1.small".equals(value)) {
            return SearchInstanceType.SearchInstanceM1Small;
        } else if ("SearchInstance:m1.large".equals(value)) {
            return SearchInstanceType.SearchInstanceM1Large;
        } else if ("SearchInstance:m2.xlarge".equals(value)) {
            return SearchInstanceType.SearchInstanceM2Xlarge;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    