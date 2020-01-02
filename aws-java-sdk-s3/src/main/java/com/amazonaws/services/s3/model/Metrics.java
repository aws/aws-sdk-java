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
 *  A container specifying replication metrics-related information including whether emitting metrics and Amazon S3
 *  events for replication are enabled. In addition, contains configurations related to specific metrics or events. Must
 *  be specified together with a <code>ReplicationTime</code> block. <code>ReplicationTime</code> block.
 */
public class Metrics implements Serializable {
    private String status;
    private ReplicationTimeValue eventThreshold;

    /**
     * Return whether the replication metrics are enabled.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set whether the replication metrics are enabled.
     *
     * @param status The status.
     * @return This object for method chaining.
     */
    public Metrics withStatus(MetricsStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Set whether the replication metrics are enabled.
     *
     * @param status The status.
     * @return This object for method chaining.
     */
    public Metrics withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Set whether the replication metrics are enabled.
     *
     * @param status The status.
     */
    public void setStatus(MetricsStatus status) {
        withStatus(status);
    }

    /**
     * Set whether the replication metrics are enabled.
     *
     * @param status The status.
     */
    public void setStatus(String status) {
        withStatus(status);
    }

    /**
     * Return A container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     */
    public ReplicationTimeValue getEventThreshold() {
        return eventThreshold;
    }

    /**
     * set the container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     *
     * @param eventThreshold The event threshold.
     * @return This object for method chaining.
     */
    public Metrics withEventThreshold(ReplicationTimeValue eventThreshold) {
        this.eventThreshold = eventThreshold;
        return this;
    }

    /**
     * set the container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     *
     * @param eventThreshold The event threshold.
     */
    public void setEventThreshold(ReplicationTimeValue eventThreshold) {
        withEventThreshold(eventThreshold);
    }
}
