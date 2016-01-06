/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

/**
 * Algorithmic Stemming
 */
public enum AlgorithmicStemming {
    
    None("none"),
    Minimal("minimal"),
    Light("light"),
    Full("full");

    private String value;

    private AlgorithmicStemming(String value) {
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
     * @return AlgorithmicStemming corresponding to the value
     */
    public static AlgorithmicStemming fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("none".equals(value)) {
            return AlgorithmicStemming.None;
        } else if ("minimal".equals(value)) {
            return AlgorithmicStemming.Minimal;
        } else if ("light".equals(value)) {
            return AlgorithmicStemming.Light;
        } else if ("full".equals(value)) {
            return AlgorithmicStemming.Full;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    