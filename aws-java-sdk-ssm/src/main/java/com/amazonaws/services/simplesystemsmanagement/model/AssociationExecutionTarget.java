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
 * Includes information about the specified association execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationExecutionTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationExecutionTarget implements Serializable, Cloneable, StructuredPojo {

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
     * The execution ID.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The resource ID, for example, the instance ID where the association ran.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type, for example, instance.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The association execution status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Detailed information about the execution status.
     * </p>
     */
    private String detailedStatus;
    /**
     * <p>
     * The date of the last execution.
     * </p>
     */
    private java.util.Date lastExecutionDate;
    /**
     * <p>
     * The location where the association details are saved.
     * </p>
     */
    private OutputSource outputSource;

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

    public AssociationExecutionTarget withAssociationId(String associationId) {
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

    public AssociationExecutionTarget withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
        return this;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param executionId
     *        The execution ID.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @return The execution ID.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param executionId
     *        The execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTarget withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The resource ID, for example, the instance ID where the association ran.
     * </p>
     * 
     * @param resourceId
     *        The resource ID, for example, the instance ID where the association ran.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID, for example, the instance ID where the association ran.
     * </p>
     * 
     * @return The resource ID, for example, the instance ID where the association ran.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID, for example, the instance ID where the association ran.
     * </p>
     * 
     * @param resourceId
     *        The resource ID, for example, the instance ID where the association ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTarget withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type, for example, instance.
     * </p>
     * 
     * @param resourceType
     *        The resource type, for example, instance.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type, for example, instance.
     * </p>
     * 
     * @return The resource type, for example, instance.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type, for example, instance.
     * </p>
     * 
     * @param resourceType
     *        The resource type, for example, instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTarget withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The association execution status.
     * </p>
     * 
     * @param status
     *        The association execution status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The association execution status.
     * </p>
     * 
     * @return The association execution status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The association execution status.
     * </p>
     * 
     * @param status
     *        The association execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTarget withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Detailed information about the execution status.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed information about the execution status.
     */

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed information about the execution status.
     * </p>
     * 
     * @return Detailed information about the execution status.
     */

    public String getDetailedStatus() {
        return this.detailedStatus;
    }

    /**
     * <p>
     * Detailed information about the execution status.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed information about the execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTarget withDetailedStatus(String detailedStatus) {
        setDetailedStatus(detailedStatus);
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

    public AssociationExecutionTarget withLastExecutionDate(java.util.Date lastExecutionDate) {
        setLastExecutionDate(lastExecutionDate);
        return this;
    }

    /**
     * <p>
     * The location where the association details are saved.
     * </p>
     * 
     * @param outputSource
     *        The location where the association details are saved.
     */

    public void setOutputSource(OutputSource outputSource) {
        this.outputSource = outputSource;
    }

    /**
     * <p>
     * The location where the association details are saved.
     * </p>
     * 
     * @return The location where the association details are saved.
     */

    public OutputSource getOutputSource() {
        return this.outputSource;
    }

    /**
     * <p>
     * The location where the association details are saved.
     * </p>
     * 
     * @param outputSource
     *        The location where the association details are saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTarget withOutputSource(OutputSource outputSource) {
        setOutputSource(outputSource);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: ").append(getDetailedStatus()).append(",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: ").append(getLastExecutionDate()).append(",");
        if (getOutputSource() != null)
            sb.append("OutputSource: ").append(getOutputSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationExecutionTarget == false)
            return false;
        AssociationExecutionTarget other = (AssociationExecutionTarget) obj;
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
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        if (other.getOutputSource() == null ^ this.getOutputSource() == null)
            return false;
        if (other.getOutputSource() != null && other.getOutputSource().equals(this.getOutputSource()) == false)
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
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getOutputSource() == null) ? 0 : getOutputSource().hashCode());
        return hashCode;
    }

    @Override
    public AssociationExecutionTarget clone() {
        try {
            return (AssociationExecutionTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationExecutionTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
