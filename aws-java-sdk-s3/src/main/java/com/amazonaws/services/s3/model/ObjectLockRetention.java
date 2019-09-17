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
import java.util.Date;

/**
 * A Retention configuration for an object.
 */
public class ObjectLockRetention implements Serializable {
    private String mode;
    private Date retainUntilDate;

    /**
     * Indicates the Retention mode for the specified object.
     */
    public String getMode() {
        return mode;
    }

    /**
     * Indicates the Retention mode for the specified object.
     */
    public ObjectLockRetention withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Indicates the Retention mode for the specified object.
     */
    public ObjectLockRetention withMode(ObjectLockRetentionMode mode) {
        return withMode(mode.toString());
    }

    /**
     * Indicates the Retention mode for the specified object.
     */
    public void setMode(String mode) {
        withMode(mode);
    }

    /**
     * Indicates the Retention mode for the specified object.
     */
    public void setMode(ObjectLockRetentionMode mode) {
        setMode(mode.toString());
    }

    public Date getRetainUntilDate() {
        return retainUntilDate;
    }

    public ObjectLockRetention withRetainUntilDate(Date retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
        return this;
    }

    public void setRetainUntilDate(Date retainUntilDate) {
        withRetainUntilDate(retainUntilDate);
    }
}
