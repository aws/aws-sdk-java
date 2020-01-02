/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A container specifying the time value.
 */
public class ReplicationTimeValue implements Serializable {
    private Integer minutes;

    /**
     * Return an integer specifying time in minutes.
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Set the time in minutes.
     *
     * @param minutes The minutes.
     * @return This object for method chaining.
     */
    public ReplicationTimeValue withMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Set the time in minutes.
     *
     * @param minutes The minutes.
     */
    public void setMinutes(Integer minutes) {
        withMinutes(minutes);
    }
}
