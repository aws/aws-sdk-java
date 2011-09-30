/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Cardinality
 */
public enum Cardinality {
    
    ONE("ONE"),
    ZERO_OR_ONE("ZERO_OR_ONE"),
    ZERO_OR_MORE("ZERO_OR_MORE"),
    ONE_OR_MORE("ONE_OR_MORE");

    private String value;

    private Cardinality(String value) {
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
     * @return Cardinality corresponding to the value
     */
    public static Cardinality fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("ONE".equals(value)) {
            return Cardinality.ONE;
        } else if ("ZERO_OR_ONE".equals(value)) {
            return Cardinality.ZERO_OR_ONE;
        } else if ("ZERO_OR_MORE".equals(value)) {
            return Cardinality.ZERO_OR_MORE;
        } else if ("ONE_OR_MORE".equals(value)) {
            return Cardinality.ONE_OR_MORE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    