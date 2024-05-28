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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ExecutionStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the execution was completed.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * The time when the execution was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the execution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The code for the status of the execution.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The reason for the failed status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The time when the execution was completed.
     * </p>
     * 
     * @param completedAt
     *        The time when the execution was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time when the execution was completed.
     * </p>
     * 
     * @return The time when the execution was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The time when the execution was completed.
     * </p>
     * 
     * @param completedAt
     *        The time when the execution was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatus withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The time when the execution was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the execution was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the execution was created.
     * </p>
     * 
     * @return The time when the execution was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the execution was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the execution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatus withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the execution was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time when the execution was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time when the execution was last updated.
     * </p>
     * 
     * @return The time when the execution was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time when the execution was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time when the execution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStatus withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The code for the status of the execution.
     * </p>
     * 
     * @param statusCode
     *        The code for the status of the execution.
     * @see ExecutionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The code for the status of the execution.
     * </p>
     * 
     * @return The code for the status of the execution.
     * @see ExecutionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The code for the status of the execution.
     * </p>
     * 
     * @param statusCode
     *        The code for the status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatusCode
     */

    public ExecutionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The code for the status of the execution.
     * </p>
     * 
     * @param statusCode
     *        The code for the status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatusCode
     */

    public ExecutionStatus withStatusCode(ExecutionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the failed status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the failed status.
     * @see ExecutionStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the failed status.
     * </p>
     * 
     * @return The reason for the failed status.
     * @see ExecutionStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the failed status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the failed status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatusReason
     */

    public ExecutionStatus withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The reason for the failed status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the failed status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatusReason
     */

    public ExecutionStatus withStatusReason(ExecutionStatusReason statusReason) {
        this.statusReason = statusReason.toString();
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
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
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

        if (obj instanceof ExecutionStatus == false)
            return false;
        ExecutionStatus other = (ExecutionStatus) obj;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
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

        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
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
        com.amazonaws.services.bcmdataexports.model.transform.ExecutionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
