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
package com.amazonaws.services.lambda.model;

/**
 * Runtime
 */
public enum Runtime {
    
    Nodejs("nodejs"),
    Nodejs43("nodejs4.3"),
    Java8("java8"),
    Python27("python2.7");

    private String value;

    private Runtime(String value) {
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
     * @return Runtime corresponding to the value
     */
    public static Runtime fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("nodejs".equals(value)) {
            return Runtime.Nodejs;
        } else if ("nodejs4.3".equals(value)) {
            return Runtime.Nodejs43;
        } else if ("java8".equals(value)) {
            return Runtime.Java8;
        } else if ("python2.7".equals(value)) {
            return Runtime.Python27;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    