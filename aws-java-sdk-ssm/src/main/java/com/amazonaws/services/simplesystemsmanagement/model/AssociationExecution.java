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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Includes information about the specified association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The association ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The association version.
     * </p>
     */
    private String associationVersion;
    /**
     * <p>
     * The execution ID for the association.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The status of the association execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     */
    private String detailedStatus;
    /**
     * <p>
     * The time the execution started.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The date of the last execution.
     * </p>
     */
    private java.util.Date lastExecutionDate;
    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status type.
     * </p>
     */
    private String resourceCountByStatus;

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @param associationId
     *        The association ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @return The association ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @param associationId
     *        The association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * 
     * @param associationVersion
     *        The association version.
     */

    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * 
     * @return The association version.
     */

    public String getAssociationVersion() {
        return this.associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * 
     * @param associationVersion
     *        The association version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
        return this;
    }

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * 
     * @param executionId
     *        The execution ID for the association.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * 
     * @return The execution ID for the association.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * 
     * @param executionId
     *        The execution ID for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The status of the association execution.
     * </p>
     * 
     * @param status
     *        The status of the association execution.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the association execution.
     * </p>
     * 
     * @return The status of the association execution.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the association execution.
     * </p>
     * 
     * @param status
     *        The status of the association execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed status information about the execution.
     */

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     * 
     * @return Detailed status information about the execution.
     */

    public String getDetailedStatus() {
        return this.detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed status information about the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withDetailedStatus(String detailedStatus) {
        setDetailedStatus(detailedStatus);
        return this;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @param createdTime
     *        The time the execution started.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @return The time the execution started.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @param createdTime
     *        The time the execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date of the last execution.
     * </p>
     * 
     * @param lastExecutionDate
     *        The date of the last execution.
     */

    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>
     * The date of the last execution.
     * </p>
     * 
     * @return The date of the last execution.
     */

    public java.util.Date getLastExecutionDate() {
        return this.lastExecutionDate;
    }

    /**
     * <p>
     * The date of the last execution.
     * </p>
     * 
     * @param lastExecutionDate
     *        The date of the last execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withLastExecutionDate(java.util.Date lastExecutionDate) {
        setLastExecutionDate(lastExecutionDate);
        return this;
    }

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status type.
     * </p>
     * 
     * @param resourceCountByStatus
     *        An aggregate status of the resources in the execution based on the status type.
     */

    public void setResourceCountByStatus(String resourceCountByStatus) {
        this.resourceCountByStatus = resourceCountByStatus;
    }

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status type.
     * </p>
     * 
     * @return An aggregate status of the resources in the execution based on the status type.
     */

    public String getResourceCountByStatus() {
        return this.resourceCountByStatus;
    }

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status type.
     * </p>
     * 
     * @param resourceCountByStatus
     *        An aggregate status of the resources in the execution based on the status type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecution withResourceCountByStatus(String resourceCountByStatus) {
        setResourceCountByStatus(resourceCountByStatus);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: ").append(getAssociationVersion()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: ").append(getDetailedStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: ").append(getLastExecutionDate()).append(",");
        if (getResourceCountByStatus() != null)
            sb.append("ResourceCountByStatus: ").append(getResourceCountByStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationExecution == false)
            return false;
        AssociationExecution other = (AssociationExecution) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        if (other.getResourceCountByStatus() == null ^ this.getResourceCountByStatus() == null)
            return false;
        if (other.getResourceCountByStatus() != null && other.getResourceCountByStatus().equals(this.getResourceCountByStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getResourceCountByStatus() == null) ? 0 : getResourceCountByStatus().hashCode());
        return hashCode;
    }

    @Override
    public AssociationExecution clone() {
        try {
            return (AssociationExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
