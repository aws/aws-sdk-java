/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * he container element for specifying the default Object Lock retention settings for new objects placed in the specified
 * bucket.
 */
public class DefaultRetention implements Serializable {
    private String mode;
    private Integer days;
    private Integer years;

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */
    public String getMode() {
        return mode;
    }

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */
    public DefaultRetention withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */
    public DefaultRetention withMode(ObjectLockRetentionMode mode) {
        return withMode(mode.toString());
    }

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */
    public void setMode(ObjectLockRetentionMode mode) {
        withMode(mode);
    }

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */
    public void setMode(String mode) {
        withMode(mode);
    }

    /**
     * The number of days that you want to specify for the default retention period.
     */
    public Integer getDays() {
        return days;
    }

    /**
     * The number of days that you want to specify for the default retention period.
     */
    public DefaultRetention withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * The number of days that you want to specify for the default retention period.
     */
    public void setDays(Integer days) {
        withDays(days);
    }

    /**
     * The number of years that you want to specify for the default retention period.
     */
    public Integer getYears() {
        return years;
    }

    /**
     * The number of years that you want to specify for the default retention period.
     */
    public DefaultRetention withYears(Integer years) {
        this.years = years;
        return this;
    }

    /**
     * The number of years that you want to specify for the default retention period.
     */
    public void setYears(Integer years) {
        withYears(years);
    }
}
