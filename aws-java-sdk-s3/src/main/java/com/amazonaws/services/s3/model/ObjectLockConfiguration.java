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
 * The container element for Object Lock configuration parameters
 */
public class ObjectLockConfiguration implements Serializable {
    private String objectLockEnabled;
    private ObjectLockRule rule;

    /**
     * Indicates whether this object has an Object Lock configuration enabled.
     */
    public String getObjectLockEnabled() {
        return objectLockEnabled;
    }

    /**
     * Indicates whether this object has an Object Lock configuration enabled.
     */
    public ObjectLockConfiguration withObjectLockEnabled(String objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
        return this;
    }

    /**
     * Indicates whether this object has an Object Lock configuration enabled.
     */
    public ObjectLockConfiguration withObjectLockEnabled(ObjectLockEnabled objectLockEnabled) {
        return withObjectLockEnabled(objectLockEnabled.toString());
    }

    /**
     * Indicates whether this object has an Object Lock configuration enabled.
     */
    public void setObjectLockEnabled(String objectLockEnabled) {
        withObjectLockEnabled(objectLockEnabled);
    }

    /**
     * Indicates whether this object has an Object Lock configuration enabled.
     */
    public void setObjectLockEnabled(ObjectLockEnabled objectLockEnabled) {
        setObjectLockEnabled(objectLockEnabled.toString());
    }

    /**
     * The Object Lock rule in place for the specified object.
     */
    public ObjectLockRule getRule() {
        return rule;
    }

    /**
     * The Object Lock rule in place for the specified object.
     */
    public ObjectLockConfiguration withRule(ObjectLockRule rule) {
        this.rule = rule;
        return this;
    }
    /**
     * The Object Lock rule in place for the specified object.
     */
    public void setRule(ObjectLockRule rule) {
        withRule(rule);
    }
}
