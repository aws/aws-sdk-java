/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a job attempt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/AttemptDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttemptDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the container in this job attempt.
     * </p>
     */
    private AttemptContainerDetail container;
    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned
     * from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     */
    private Long startedAt;
    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     */
    private Long stoppedAt;
    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job attempt.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * Details about the container in this job attempt.
     * </p>
     * 
     * @param container
     *        Details about the container in this job attempt.
     */

    public void setContainer(AttemptContainerDetail container) {
        this.container = container;
    }

    /**
     * <p>
     * Details about the container in this job attempt.
     * </p>
     * 
     * @return Details about the container in this job attempt.
     */

    public AttemptContainerDetail getContainer() {
        return this.container;
    }

    /**
     * <p>
     * Details about the container in this job attempt.
     * </p>
     * 
     * @param container
     *        Details about the container in this job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptDetail withContainer(AttemptContainerDetail container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned
     * from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt
     *        transitioned from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     */

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned
     * from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @return The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt
     *         transitioned from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     */

    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt transitioned
     * from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the attempt was started (when the attempt
     *        transitioned from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptDetail withStartedAt(Long startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt
     *        transitioned from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *        <code>FAILED</code>).
     */

    public void setStoppedAt(Long stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @return The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt
     *         transitioned from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *         <code>FAILED</code>).
     */

    public Long getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the attempt was stopped (when the attempt
     *        transitioned from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *        <code>FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptDetail withStoppedAt(Long stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job attempt.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job attempt.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job attempt.
     * </p>
     * 
     * @return A short, human-readable string to provide additional details about the current status of the job attempt.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job attempt.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptDetail withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttemptDetail == false)
            return false;
        AttemptDetail other = (AttemptDetail) obj;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public AttemptDetail clone() {
        try {
            return (AttemptDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.AttemptDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
