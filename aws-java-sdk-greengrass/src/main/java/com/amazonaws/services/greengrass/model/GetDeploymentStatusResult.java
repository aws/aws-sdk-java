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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeploymentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''. */
    private String deploymentStatus;
    /** The type of the deployment. */
    private String deploymentType;
    /** Error details */
    private java.util.List<ErrorDetail> errorDetails;
    /** Error message */
    private String errorMessage;
    /** The time, in milliseconds since the epoch, when the deployment status was updated. */
    private String updatedAt;

    /**
     * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * 
     * @param deploymentStatus
     *        The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * 
     * @return The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * 
     * @param deploymentStatus
     *        The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withDeploymentStatus(String deploymentStatus) {
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

    public GetDeploymentStatusResult withDeploymentType(String deploymentType) {
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

    public GetDeploymentStatusResult withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * Error details
     * 
     * @return Error details
     */

    public java.util.List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Error details
     * 
     * @param errorDetails
     *        Error details
     */

    public void setErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        if (errorDetails == null) {
            this.errorDetails = null;
            return;
        }

        this.errorDetails = new java.util.ArrayList<ErrorDetail>(errorDetails);
    }

    /**
     * Error details
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorDetails(java.util.Collection)} or {@link #withErrorDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorDetails
     *        Error details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withErrorDetails(ErrorDetail... errorDetails) {
        if (this.errorDetails == null) {
            setErrorDetails(new java.util.ArrayList<ErrorDetail>(errorDetails.length));
        }
        for (ErrorDetail ele : errorDetails) {
            this.errorDetails.add(ele);
        }
        return this;
    }

    /**
     * Error details
     * 
     * @param errorDetails
     *        Error details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * Error message
     * 
     * @param errorMessage
     *        Error message
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error message
     * 
     * @return Error message
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Error message
     * 
     * @param errorMessage
     *        Error message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * The time, in milliseconds since the epoch, when the deployment status was updated.
     * 
     * @param updatedAt
     *        The time, in milliseconds since the epoch, when the deployment status was updated.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The time, in milliseconds since the epoch, when the deployment status was updated.
     * 
     * @return The time, in milliseconds since the epoch, when the deployment status was updated.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * The time, in milliseconds since the epoch, when the deployment status was updated.
     * 
     * @param updatedAt
     *        The time, in milliseconds since the epoch, when the deployment status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentStatusResult == false)
            return false;
        GetDeploymentStatusResult other = (GetDeploymentStatusResult) obj;
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
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentStatusResult clone() {
        try {
            return (GetDeploymentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
