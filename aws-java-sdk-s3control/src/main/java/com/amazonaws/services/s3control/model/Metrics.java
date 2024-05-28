/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container that specifies replication metrics-related settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/Metrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Metrics implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether replication metrics are enabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A container that specifies the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private ReplicationTimeValue eventThreshold;

    /**
     * <p>
     * Specifies whether replication metrics are enabled.
     * </p>
     * 
     * @param status
     *        Specifies whether replication metrics are enabled.
     * @see MetricsStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether replication metrics are enabled.
     * </p>
     * 
     * @return Specifies whether replication metrics are enabled.
     * @see MetricsStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether replication metrics are enabled.
     * </p>
     * 
     * @param status
     *        Specifies whether replication metrics are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsStatus
     */

    public Metrics withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether replication metrics are enabled.
     * </p>
     * 
     * @param status
     *        Specifies whether replication metrics are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsStatus
     */

    public Metrics withStatus(MetricsStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A container that specifies the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param eventThreshold
     *        A container that specifies the time threshold for emitting the
     *        <code>s3:Replication:OperationMissedThreshold</code> event. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setEventThreshold(ReplicationTimeValue eventThreshold) {
        this.eventThreshold = eventThreshold;
    }

    /**
     * <p>
     * A container that specifies the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return A container that specifies the time threshold for emitting the
     *         <code>s3:Replication:OperationMissedThreshold</code> event. </p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public ReplicationTimeValue getEventThreshold() {
        return this.eventThreshold;
    }

    /**
     * <p>
     * A container that specifies the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param eventThreshold
     *        A container that specifies the time threshold for emitting the
     *        <code>s3:Replication:OperationMissedThreshold</code> event. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metrics withEventThreshold(ReplicationTimeValue eventThreshold) {
        setEventThreshold(eventThreshold);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEventThreshold() != null)
            sb.append("EventThreshold: ").append(getEventThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Metrics == false)
            return false;
        Metrics other = (Metrics) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEventThreshold() == null ^ this.getEventThreshold() == null)
            return false;
        if (other.getEventThreshold() != null && other.getEventThreshold().equals(this.getEventThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEventThreshold() == null) ? 0 : getEventThreshold().hashCode());
        return hashCode;
    }

    @Override
    public Metrics clone() {
        try {
            return (Metrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
