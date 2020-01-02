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
 * A container specifying the time when all objects and operations on objects are replicated. Must be specified together
 * with a <code>Metrics</code> block.
 */
public class ReplicationTime implements Serializable {
    private String status;
    private ReplicationTimeValue time;

    /**
     * Return whether the replication time is enabled.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set whether the replication time is enabled.
     *
     * @param status The status.
     * @return This object for method chaining.
     */
    public ReplicationTime withStatus(ReplicationTimeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Set whether the replication time is enabled.
     *
     * @param status The status.
     * @return This object for method chaining.
     */
    public ReplicationTime withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Set whether the replication time is enabled.
     *
     * @param status The status.
     */
    public void setStatus(ReplicationTimeStatus status) {
        withStatus(status);
    }

    /**
     * Set whether the replication time is enabled.
     *
     * @param status The status.
     */
    public void setStatus(String status) {
        withStatus(status);
    }

    /**
     * Return a container specifying the time by which replication should complete for all objects and operations on
     * objects.
     */
    public ReplicationTimeValue getTime() {
        return time;
    }

    /**
     * Set a container specifying the time by which replication should complete for all objects and operations on
     * objects.
     *
     * @param time The time.
     * @return This object for method chaining.
     */
    public ReplicationTime withTime(ReplicationTimeValue time) {
        this.time = time;
        return this;
    }

    /**
     * Set a container specifying the time by which replication should complete for all objects and operations on
     * objects.
     *
     * @param time The time.
     */
    public void setTime(ReplicationTimeValue time) {
        withTime(time);
    }
}
