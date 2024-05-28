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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the submission time of a single allocation request for a capacity reservation and the most recent status of
 * the attempted allocation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CapacityAllocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityAllocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the capacity allocation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the capacity allocation.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time when the capacity allocation was requested.
     * </p>
     */
    private java.util.Date requestTime;
    /**
     * <p>
     * The time when the capacity allocation request was completed.
     * </p>
     */
    private java.util.Date requestCompletionTime;

    /**
     * <p>
     * The status of the capacity allocation.
     * </p>
     * 
     * @param status
     *        The status of the capacity allocation.
     * @see CapacityAllocationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the capacity allocation.
     * </p>
     * 
     * @return The status of the capacity allocation.
     * @see CapacityAllocationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the capacity allocation.
     * </p>
     * 
     * @param status
     *        The status of the capacity allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityAllocationStatus
     */

    public CapacityAllocation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the capacity allocation.
     * </p>
     * 
     * @param status
     *        The status of the capacity allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityAllocationStatus
     */

    public CapacityAllocation withStatus(CapacityAllocationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the capacity allocation.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the capacity allocation.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the capacity allocation.
     * </p>
     * 
     * @return The status message of the capacity allocation.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the capacity allocation.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the capacity allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAllocation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time when the capacity allocation was requested.
     * </p>
     * 
     * @param requestTime
     *        The time when the capacity allocation was requested.
     */

    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * <p>
     * The time when the capacity allocation was requested.
     * </p>
     * 
     * @return The time when the capacity allocation was requested.
     */

    public java.util.Date getRequestTime() {
        return this.requestTime;
    }

    /**
     * <p>
     * The time when the capacity allocation was requested.
     * </p>
     * 
     * @param requestTime
     *        The time when the capacity allocation was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAllocation withRequestTime(java.util.Date requestTime) {
        setRequestTime(requestTime);
        return this;
    }

    /**
     * <p>
     * The time when the capacity allocation request was completed.
     * </p>
     * 
     * @param requestCompletionTime
     *        The time when the capacity allocation request was completed.
     */

    public void setRequestCompletionTime(java.util.Date requestCompletionTime) {
        this.requestCompletionTime = requestCompletionTime;
    }

    /**
     * <p>
     * The time when the capacity allocation request was completed.
     * </p>
     * 
     * @return The time when the capacity allocation request was completed.
     */

    public java.util.Date getRequestCompletionTime() {
        return this.requestCompletionTime;
    }

    /**
     * <p>
     * The time when the capacity allocation request was completed.
     * </p>
     * 
     * @param requestCompletionTime
     *        The time when the capacity allocation request was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAllocation withRequestCompletionTime(java.util.Date requestCompletionTime) {
        setRequestCompletionTime(requestCompletionTime);
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
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getRequestTime() != null)
            sb.append("RequestTime: ").append(getRequestTime()).append(",");
        if (getRequestCompletionTime() != null)
            sb.append("RequestCompletionTime: ").append(getRequestCompletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityAllocation == false)
            return false;
        CapacityAllocation other = (CapacityAllocation) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getRequestCompletionTime() == null ^ this.getRequestCompletionTime() == null)
            return false;
        if (other.getRequestCompletionTime() != null && other.getRequestCompletionTime().equals(this.getRequestCompletionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode + ((getRequestCompletionTime() == null) ? 0 : getRequestCompletionTime().hashCode());
        return hashCode;
    }

    @Override
    public CapacityAllocation clone() {
        try {
            return (CapacityAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CapacityAllocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
