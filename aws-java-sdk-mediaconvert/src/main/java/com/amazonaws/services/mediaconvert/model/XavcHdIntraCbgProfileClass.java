/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specify the XAVC Intra HD (CBG) Class to set the bitrate of your output. Outputs of the same class have similar image
 * quality over the operating points that are valid for that class.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum XavcHdIntraCbgProfileClass {

    CLASS_50("CLASS_50"),
    CLASS_100("CLASS_100"),
    CLASS_200("CLASS_200");

    private String value;

    private XavcHdIntraCbgProfileClass(String value) {
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
     * @return XavcHdIntraCbgProfileClass corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static XavcHdIntraCbgProfileClass fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (XavcHdIntraCbgProfileClass enumEntry : XavcHdIntraCbgProfileClass.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
