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
 * A Legal Hold configuration for an object.
 */
public class ObjectLockLegalHold implements Serializable {
    private String status;

    /**
     * Indicates whether the specified object has a Legal Hold in place.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Indicates whether the specified object has a Legal Hold in place.
     */
    public ObjectLockLegalHold withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Indicates whether the specified object has a Legal Hold in place.
     */
    public ObjectLockLegalHold withStatus(ObjectLockLegalHoldStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Indicates whether the specified object has a Legal Hold in place.
     */
    public void setStatus(String status) {
        withStatus(status);
    }

    /**
     * Indicates whether the specified object has a Legal Hold in place.
     */
    public void setStatus(ObjectLockLegalHoldStatus status) {
        setStatus(status.toString());
    }
}
