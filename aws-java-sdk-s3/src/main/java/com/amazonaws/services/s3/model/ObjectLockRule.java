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
 * The container element for an Object Lock rule.
 */
public class ObjectLockRule implements Serializable {
    private DefaultRetention defaultRetention;

    /**
     * The default retention period that you want to apply to new objects placed in the specified bucket.
     */
    public DefaultRetention getDefaultRetention() {
        return defaultRetention;
    }

    /**
     * The default retention period that you want to apply to new objects placed in the specified bucket.
     */
    public ObjectLockRule withDefaultRetention(DefaultRetention defaultRetention) {
        this.defaultRetention = defaultRetention;
        return this;
    }

    /**
     * The default retention period that you want to apply to new objects placed in the specified bucket.
     */
    public void setDefaultRetention(DefaultRetention defaultRetention) {
        withDefaultRetention(defaultRetention);
    }
}
