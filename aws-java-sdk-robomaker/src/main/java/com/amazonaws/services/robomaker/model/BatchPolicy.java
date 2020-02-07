/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the batch policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time, in seconds, to wait for the batch to complete.
     * </p>
     * <p>
     * If a batch times out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     * <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending requests will
     * be moved to the failed list and the batch status will be <code>TimedOut</code>.
     * </p>
     */
    private Long timeoutInSeconds;
    /**
     * <p>
     * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.
     * </p>
     * <p>
     * Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>, <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are terminal states.
     * </p>
     */
    private Integer maxConcurrency;

    /**
     * <p>
     * The amount of time, in seconds, to wait for the batch to complete.
     * </p>
     * <p>
     * If a batch times out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     * <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending requests will
     * be moved to the failed list and the batch status will be <code>TimedOut</code>.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The amount of time, in seconds, to wait for the batch to complete. </p>
     *        <p>
     *        If a batch times out, and there are pending requests that were failing due to an internal failure (like
     *        <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     *        <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending
     *        requests will be moved to the failed list and the batch status will be <code>TimedOut</code>.
     */

    public void setTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for the batch to complete.
     * </p>
     * <p>
     * If a batch times out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     * <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending requests will
     * be moved to the failed list and the batch status will be <code>TimedOut</code>.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait for the batch to complete. </p>
     *         <p>
     *         If a batch times out, and there are pending requests that were failing due to an internal failure (like
     *         <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     *         <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending
     *         requests will be moved to the failed list and the batch status will be <code>TimedOut</code>.
     */

    public Long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for the batch to complete.
     * </p>
     * <p>
     * If a batch times out, and there are pending requests that were failing due to an internal failure (like
     * <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     * <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending requests will
     * be moved to the failed list and the batch status will be <code>TimedOut</code>.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The amount of time, in seconds, to wait for the batch to complete. </p>
     *        <p>
     *        If a batch times out, and there are pending requests that were failing due to an internal failure (like
     *        <code>InternalServiceError</code>), they will be moved to the failed list and the batch status will be
     *        <code>Failed</code>. If the pending requests were failing for any other reason, the failed pending
     *        requests will be moved to the failed list and the batch status will be <code>TimedOut</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPolicy withTimeoutInSeconds(Long timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.
     * </p>
     * <p>
     * Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>, <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are terminal states.
     * </p>
     * 
     * @param maxConcurrency
     *        The number of active simulation jobs create as part of the batch that can be in an active state at the
     *        same time. </p>
     *        <p>
     *        Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>,
     *        <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are
     *        terminal states.
     */

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.
     * </p>
     * <p>
     * Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>, <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are terminal states.
     * </p>
     * 
     * @return The number of active simulation jobs create as part of the batch that can be in an active state at the
     *         same time. </p>
     *         <p>
     *         Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>,
     *         <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are
     *         terminal states.
     */

    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.
     * </p>
     * <p>
     * Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>, <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are terminal states.
     * </p>
     * 
     * @param maxConcurrency
     *        The number of active simulation jobs create as part of the batch that can be in an active state at the
     *        same time. </p>
     *        <p>
     *        Active states include: <code>Pending</code>,<code>Preparing</code>, <code>Running</code>,
     *        <code>Restarting</code>, <code>RunningFailed</code> and <code>Terminating</code>. All other states are
     *        terminal states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPolicy withMaxConcurrency(Integer maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
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
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPolicy == false)
            return false;
        BatchPolicy other = (BatchPolicy) obj;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public BatchPolicy clone() {
        try {
            return (BatchPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.BatchPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
