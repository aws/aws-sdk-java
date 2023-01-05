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
 * A subset of the possible application attributes. Used in the application list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ApplicationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationArn;
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
     * The timestamp when the application was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The unique identifier of the runtime environment that hosts this application.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     */
    private java.util.Date lastStartTime;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates the status of the latest version of the application.
     * </p>
     */
    private String versionStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

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

    public ApplicationSummary withApplicationId(String applicationId) {
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

    public ApplicationSummary withApplicationVersion(Integer applicationVersion) {
        setApplicationVersion(applicationVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp when the application was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the application was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the application was created.
     * </p>
     * 
     * @return The timestamp when the application was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the application was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * </p>
     * 
     * @param deploymentStatus
     *        Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * @see ApplicationDeploymentLifecycle
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * </p>
     * 
     * @return Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * @see ApplicationDeploymentLifecycle
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * </p>
     * 
     * @param deploymentStatus
     *        Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationDeploymentLifecycle
     */

    public ApplicationSummary withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * </p>
     * 
     * @param deploymentStatus
     *        Indicates either an ongoing deployment or if the application has ever deployed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationDeploymentLifecycle
     */

    public ApplicationSummary withDeploymentStatus(ApplicationDeploymentLifecycle deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for this application.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @return The type of the target platform for this application.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public ApplicationSummary withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public ApplicationSummary withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment that hosts this application.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment that hosts this application.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment that hosts this application.
     * </p>
     * 
     * @return The unique identifier of the runtime environment that hosts this application.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment that hosts this application.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment that hosts this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     * 
     * @param lastStartTime
     *        The timestamp when you last started the application. Null until the application runs for the first time.
     */

    public void setLastStartTime(java.util.Date lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     * 
     * @return The timestamp when you last started the application. Null until the application runs for the first time.
     */

    public java.util.Date getLastStartTime() {
        return this.lastStartTime;
    }

    /**
     * <p>
     * The timestamp when you last started the application. Null until the application runs for the first time.
     * </p>
     * 
     * @param lastStartTime
     *        The timestamp when you last started the application. Null until the application runs for the first time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withLastStartTime(java.util.Date lastStartTime) {
        setLastStartTime(lastStartTime);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @see ApplicationLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @return The status of the application.
     * @see ApplicationLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationLifecycle
     */

    public ApplicationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationLifecycle
     */

    public ApplicationSummary withStatus(ApplicationLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the status of the latest version of the application.
     * </p>
     * 
     * @param versionStatus
     *        Indicates the status of the latest version of the application.
     * @see ApplicationVersionLifecycle
     */

    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    /**
     * <p>
     * Indicates the status of the latest version of the application.
     * </p>
     * 
     * @return Indicates the status of the latest version of the application.
     * @see ApplicationVersionLifecycle
     */

    public String getVersionStatus() {
        return this.versionStatus;
    }

    /**
     * <p>
     * Indicates the status of the latest version of the application.
     * </p>
     * 
     * @param versionStatus
     *        Indicates the status of the latest version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionLifecycle
     */

    public ApplicationSummary withVersionStatus(String versionStatus) {
        setVersionStatus(versionStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the latest version of the application.
     * </p>
     * 
     * @param versionStatus
     *        Indicates the status of the latest version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionLifecycle
     */

    public ApplicationSummary withVersionStatus(ApplicationVersionLifecycle versionStatus) {
        this.versionStatus = versionStatus.toString();
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getLastStartTime() != null)
            sb.append("LastStartTime: ").append(getLastStartTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVersionStatus() != null)
            sb.append("VersionStatus: ").append(getVersionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
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
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getLastStartTime() == null ^ this.getLastStartTime() == null)
            return false;
        if (other.getLastStartTime() != null && other.getLastStartTime().equals(this.getLastStartTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVersionStatus() == null ^ this.getVersionStatus() == null)
            return false;
        if (other.getVersionStatus() != null && other.getVersionStatus().equals(this.getVersionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getLastStartTime() == null) ? 0 : getLastStartTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVersionStatus() == null) ? 0 : getVersionStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
