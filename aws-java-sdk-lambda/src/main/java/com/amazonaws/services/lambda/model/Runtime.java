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
package com.amazonaws.services.lambda.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Runtime {

    Nodejs("nodejs"),
    Nodejs43("nodejs4.3"),
    Nodejs610("nodejs6.10"),
    Nodejs810("nodejs8.10"),
    Java8("java8"),
    Python27("python2.7"),
    Python36("python3.6"),
    Python37("python3.7"),
    Dotnetcore10("dotnetcore1.0"),
    Dotnetcore20("dotnetcore2.0"),
    Dotnetcore21("dotnetcore2.1"),
    Nodejs43Edge("nodejs4.3-edge"),
    Go1X("go1.x"),
    Ruby25("ruby2.5"),
    Provided("provided");

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
     *        real value
     * @return Runtime corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Runtime fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Runtime enumEntry : Runtime.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
