/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A subset of information about a specific deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeploymentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private Integer applicationVersion;
    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The unique identifier of the deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The current status of the deployment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the reported status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @return The unique identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the application.
     */

    public void setApplicationVersion(Integer applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public Integer getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withApplicationVersion(Integer applicationVersion) {
        setApplicationVersion(applicationVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the deployment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     * 
     * @return The timestamp when the deployment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique identifier of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique identifier of the deployment.
     * </p>
     * 
     * @return The unique identifier of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique identifier of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique identifier of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     * 
     * @return The unique identifier of the runtime environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @param status
     *        The current status of the deployment.
     * @see DeploymentLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @return The current status of the deployment.
     * @see DeploymentLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @param status
     *        The current status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentLifecycle
     */

    public DeploymentSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @param status
     *        The current status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentLifecycle
     */

    public DeploymentSummary withStatus(DeploymentLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @return The reason for the reported status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withStatusReason(String statusReason) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DeploymentSummary == false)
            return false;
        DeploymentSummary other = (DeploymentSummary) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentSummary clone() {
        try {
            return (DeploymentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DeploymentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
