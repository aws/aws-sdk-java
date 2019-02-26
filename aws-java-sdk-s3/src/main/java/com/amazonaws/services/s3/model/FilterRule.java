/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

/**
 * Model class representing a Filter Rule for a {@link NotificationConfiguration}.
 */
public class FilterRule implements Serializable {

    private String name;
    private String value;

    /**
     * Returns the name for this {@link FilterRule}.
     * 
     * @return Name of this {@link FilterRule}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for this {@link FilterRule}.
     * 
     * @param name
     *            New name for this {@link FilterRule}.
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("FilterRule Name is a required argument");
        }
        this.name = name;
    }

    /**
     * Sets the name for this {@link FilterRule} and returns this object for method chaining.
     * 
     * @param name
     *            New name for this {@link FilterRule}.
     * @return This object for method chaining
     */
    public FilterRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns the value for this {@link FilterRule}
     * 
     * @return Value for this {@link FilterRule}
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value for this {@link FilterRule}
     * 
     * @param value
     *            New value for this {@link FilterRule}
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Sets the value for this {@link FilterRule} and returns this object for method chaining
     * 
     * @param value
     *            New value for this {@link FilterRule}
     * @return This object for method chaining
     */
    public FilterRule withValue(String value) {
        setValue(value);
        return this;
    }
}
