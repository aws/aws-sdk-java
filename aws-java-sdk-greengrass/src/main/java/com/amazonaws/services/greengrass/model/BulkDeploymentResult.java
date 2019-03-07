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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about an individual group deployment in a bulk deployment operation.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/BulkDeploymentResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkDeploymentResult implements Serializable, Cloneable, StructuredPojo {

    /** The time, in ISO format, when the deployment was created. */
    private String createdAt;
    /** The ARN of the group deployment. */
    private String deploymentArn;
    /** The ID of the group deployment. */
    private String deploymentId;
    /** The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''. */
    private String deploymentStatus;
    /** The type of the deployment. */
    private String deploymentType;
    /** Details about the error. */
    private java.util.List<ErrorDetail> errorDetails;
    /** The error message for a failed deployment */
    private String errorMessage;
    /** The ARN of the Greengrass group. */
    private String groupArn;

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in ISO format, when the deployment was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @return The time, in ISO format, when the deployment was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in ISO format, when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * The ARN of the group deployment.
     * 
     * @param deploymentArn
     *        The ARN of the group deployment.
     */

    public void setDeploymentArn(String deploymentArn) {
        this.deploymentArn = deploymentArn;
    }

    /**
     * The ARN of the group deployment.
     * 
     * @return The ARN of the group deployment.
     */

    public String getDeploymentArn() {
        return this.deploymentArn;
    }

    /**
     * The ARN of the group deployment.
     * 
     * @param deploymentArn
     *        The ARN of the group deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withDeploymentArn(String deploymentArn) {
        setDeploymentArn(deploymentArn);
        return this;
    }

    /**
     * The ID of the group deployment.
     * 
     * @param deploymentId
     *        The ID of the group deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * The ID of the group deployment.
     * 
     * @return The ID of the group deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * The ID of the group deployment.
     * 
     * @param deploymentId
     *        The ID of the group deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * 
     * @param deploymentStatus
     *        The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * 
     * @return The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * 
     * @param deploymentStatus
     *        The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * The type of the deployment.
     * 
     * @param deploymentType
     *        The type of the deployment.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * The type of the deployment.
     * 
     * @return The type of the deployment.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * The type of the deployment.
     * 
     * @param deploymentType
     *        The type of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public BulkDeploymentResult withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * The type of the deployment.
     * 
     * @param deploymentType
     *        The type of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public BulkDeploymentResult withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * Details about the error.
     * 
     * @return Details about the error.
     */

    public java.util.List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Details about the error.
     * 
     * @param errorDetails
     *        Details about the error.
     */

    public void setErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        if (errorDetails == null) {
            this.errorDetails = null;
            return;
        }

        this.errorDetails = new java.util.ArrayList<ErrorDetail>(errorDetails);
    }

    /**
     * Details about the error.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorDetails(java.util.Collection)} or {@link #withErrorDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorDetails
     *        Details about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withErrorDetails(ErrorDetail... errorDetails) {
        if (this.errorDetails == null) {
            setErrorDetails(new java.util.ArrayList<ErrorDetail>(errorDetails.length));
        }
        for (ErrorDetail ele : errorDetails) {
            this.errorDetails.add(ele);
        }
        return this;
    }

    /**
     * Details about the error.
     * 
     * @param errorDetails
     *        Details about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * The error message for a failed deployment
     * 
     * @param errorMessage
     *        The error message for a failed deployment
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * The error message for a failed deployment
     * 
     * @return The error message for a failed deployment
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * The error message for a failed deployment
     * 
     * @param errorMessage
     *        The error message for a failed deployment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * The ARN of the Greengrass group.
     * 
     * @param groupArn
     *        The ARN of the Greengrass group.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * The ARN of the Greengrass group.
     * 
     * @return The ARN of the Greengrass group.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * The ARN of the Greengrass group.
     * 
     * @param groupArn
     *        The ARN of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentResult withGroupArn(String groupArn) {
        setGroupArn(groupArn);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeploymentArn() != null)
            sb.append("DeploymentArn: ").append(getDeploymentArn()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getGroupArn() != null)
            sb.append("GroupArn: ").append(getGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkDeploymentResult == false)
            return false;
        BulkDeploymentResult other = (BulkDeploymentResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeploymentArn() == null ^ this.getDeploymentArn() == null)
            return false;
        if (other.getDeploymentArn() != null && other.getDeploymentArn().equals(this.getDeploymentArn()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeploymentArn() == null) ? 0 : getDeploymentArn().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public BulkDeploymentResult clone() {
        try {
            return (BulkDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.BulkDeploymentResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
