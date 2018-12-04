/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** Status of the deployment. */
    private String deploymentStatus;
    /** The type of the deployment. */
    private String deploymentType;
    /** The error Details */
    private java.util.List<ErrorDetail> errorDetails;
    /** Error Message */
    private String errorMessage;
    /** Last time the deployment status was updated. */
    private String updatedAt;

    /**
     * Status of the deployment.
     * 
     * @param deploymentStatus
     *        Status of the deployment.
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * Status of the deployment.
     * 
     * @return Status of the deployment.
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Status of the deployment.
     * 
     * @param deploymentStatus
     *        Status of the deployment.
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
     * The error Details
     * 
     * @return The error Details
     */

    public java.util.List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    /**
     * The error Details
     * 
     * @param errorDetails
     *        The error Details
     */

    public void setErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        if (errorDetails == null) {
            this.errorDetails = null;
            return;
        }

        this.errorDetails = new java.util.ArrayList<ErrorDetail>(errorDetails);
    }

    /**
     * The error Details
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorDetails(java.util.Collection)} or {@link #withErrorDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorDetails
     *        The error Details
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
     * The error Details
     * 
     * @param errorDetails
     *        The error Details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withErrorDetails(java.util.Collection<ErrorDetail> errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * Error Message
     * 
     * @param errorMessage
     *        Error Message
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error Message
     * 
     * @return Error Message
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Error Message
     * 
     * @param errorMessage
     *        Error Message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * Last time the deployment status was updated.
     * 
     * @param updatedAt
     *        Last time the deployment status was updated.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Last time the deployment status was updated.
     * 
     * @return Last time the deployment status was updated.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Last time the deployment status was updated.
     * 
     * @param updatedAt
     *        Last time the deployment status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStatusResult withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
