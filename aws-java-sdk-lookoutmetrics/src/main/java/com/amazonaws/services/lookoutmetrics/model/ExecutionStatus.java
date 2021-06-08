/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of an anomaly detector run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ExecutionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The run's timestamp.
     * </p>
     */
    private String timestamp;
    /**
     * <p>
     * The run's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason that the run failed, if applicable.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The run's timestamp.
     * </p>
     * 
     * @param timestamp
     *        The run's timestamp.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The run's timestamp.
     * </p>
     * 
     * @return The run's timestamp.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The run's timestamp.
     * </p>
     * 
     * @param timestamp
     *        The run's timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatus withTimestamp(String timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @see AnomalyDetectionTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @return The run's status.
     * @see AnomalyDetectionTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectionTaskStatus
     */

    public ExecutionStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectionTaskStatus
     */

    public ExecutionStatus withStatus(AnomalyDetectionTaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the run failed, if applicable.
     * </p>
     * 
     * @param failureReason
     *        The reason that the run failed, if applicable.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that the run failed, if applicable.
     * </p>
     * 
     * @return The reason that the run failed, if applicable.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason that the run failed, if applicable.
     * </p>
     * 
     * @param failureReason
     *        The reason that the run failed, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatus withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionStatus == false)
            return false;
        ExecutionStatus other = (ExecutionStatus) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionStatus clone() {
        try {
            return (ExecutionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.ExecutionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
