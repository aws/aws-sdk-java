/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

/**
 * 
 */
public enum StreamViewType {

    NEW_IMAGE("NEW_IMAGE"),
    OLD_IMAGE("OLD_IMAGE"),
    NEW_AND_OLD_IMAGES("NEW_AND_OLD_IMAGES"),
    KEYS_ONLY("KEYS_ONLY");

    private String value;

    private StreamViewType(String value) {
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
     * @return StreamViewType corresponding to the value
     */
    public static StreamViewType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("NEW_IMAGE".equals(value)) {
            return NEW_IMAGE;
        } else if ("OLD_IMAGE".equals(value)) {
            return OLD_IMAGE;
        } else if ("NEW_AND_OLD_IMAGES".equals(value)) {
            return NEW_AND_OLD_IMAGES;
        } else if ("KEYS_ONLY".equals(value)) {
            return KEYS_ONLY;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}