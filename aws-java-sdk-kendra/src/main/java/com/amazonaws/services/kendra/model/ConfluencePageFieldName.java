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
package com.amazonaws.services.kendra.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ConfluencePageFieldName {

    AUTHOR("AUTHOR"),
    CONTENT_STATUS("CONTENT_STATUS"),
    CREATED_DATE("CREATED_DATE"),
    DISPLAY_URL("DISPLAY_URL"),
    ITEM_TYPE("ITEM_TYPE"),
    LABELS("LABELS"),
    MODIFIED_DATE("MODIFIED_DATE"),
    PARENT_ID("PARENT_ID"),
    SPACE_KEY("SPACE_KEY"),
    SPACE_NAME("SPACE_NAME"),
    URL("URL"),
    VERSION("VERSION");

    private String value;

    private ConfluencePageFieldName(String value) {
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
     * @return ConfluencePageFieldName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ConfluencePageFieldName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ConfluencePageFieldName enumEntry : ConfluencePageFieldName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
