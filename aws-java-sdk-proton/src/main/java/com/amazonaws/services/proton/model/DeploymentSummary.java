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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary data of the deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeploymentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time the deployment was completed.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * The name of the component associated with the deployment.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The date and time the deployment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The current status of the deployment.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The name of the environment associated with the deployment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the last attempted deployment.
     * </p>
     */
    private String lastAttemptedDeploymentId;
    /**
     * <p>
     * The date and time the deployment was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The ID of the last successful deployment.
     * </p>
     */
    private String lastSucceededDeploymentId;
    /**
     * <p>
     * The name of the service instance associated with the deployment.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service associated with the deployment.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of the deployment.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The date and time the target resource was created.
     * </p>
     */
    private java.util.Date targetResourceCreatedAt;
    /**
     * <p>
     * The resource type of the deployment target. It can be an environment, service, service instance, or component.
     * </p>
     */
    private String targetResourceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the deployment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deployment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time the deployment was completed.
     * </p>
     * 
     * @param completedAt
     *        The date and time the deployment was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The date and time the deployment was completed.
     * </p>
     * 
     * @return The date and time the deployment was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The date and time the deployment was completed.
     * </p>
     * 
     * @param completedAt
     *        The date and time the deployment was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The name of the component associated with the deployment.
     * </p>
     * 
     * @param componentName
     *        The name of the component associated with the deployment.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component associated with the deployment.
     * </p>
     * 
     * @return The name of the component associated with the deployment.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component associated with the deployment.
     * </p>
     * 
     * @param componentName
     *        The name of the component associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The date and time the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the deployment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the deployment was created.
     * </p>
     * 
     * @return The date and time the deployment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The current status of the deployment.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @return The current status of the deployment.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The current status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentSummary withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The current status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentSummary withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the environment associated with the deployment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment associated with the deployment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment associated with the deployment.
     * </p>
     * 
     * @return The name of the environment associated with the deployment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment associated with the deployment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param id
     *        The ID of the deployment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @return The ID of the deployment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param id
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the last attempted deployment.
     * </p>
     * 
     * @param lastAttemptedDeploymentId
     *        The ID of the last attempted deployment.
     */

    public void setLastAttemptedDeploymentId(String lastAttemptedDeploymentId) {
        this.lastAttemptedDeploymentId = lastAttemptedDeploymentId;
    }

    /**
     * <p>
     * The ID of the last attempted deployment.
     * </p>
     * 
     * @return The ID of the last attempted deployment.
     */

    public String getLastAttemptedDeploymentId() {
        return this.lastAttemptedDeploymentId;
    }

    /**
     * <p>
     * The ID of the last attempted deployment.
     * </p>
     * 
     * @param lastAttemptedDeploymentId
     *        The ID of the last attempted deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withLastAttemptedDeploymentId(String lastAttemptedDeploymentId) {
        setLastAttemptedDeploymentId(lastAttemptedDeploymentId);
        return this;
    }

    /**
     * <p>
     * The date and time the deployment was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time the deployment was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The date and time the deployment was last modified.
     * </p>
     * 
     * @return The date and time the deployment was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The date and time the deployment was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time the deployment was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the last successful deployment.
     * </p>
     * 
     * @param lastSucceededDeploymentId
     *        The ID of the last successful deployment.
     */

    public void setLastSucceededDeploymentId(String lastSucceededDeploymentId) {
        this.lastSucceededDeploymentId = lastSucceededDeploymentId;
    }

    /**
     * <p>
     * The ID of the last successful deployment.
     * </p>
     * 
     * @return The ID of the last successful deployment.
     */

    public String getLastSucceededDeploymentId() {
        return this.lastSucceededDeploymentId;
    }

    /**
     * <p>
     * The ID of the last successful deployment.
     * </p>
     * 
     * @param lastSucceededDeploymentId
     *        The ID of the last successful deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withLastSucceededDeploymentId(String lastSucceededDeploymentId) {
        setLastSucceededDeploymentId(lastSucceededDeploymentId);
        return this;
    }

    /**
     * <p>
     * The name of the service instance associated with the deployment.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance associated with the deployment.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance associated with the deployment.
     * </p>
     * 
     * @return The name of the service instance associated with the deployment.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance associated with the deployment.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service associated with the deployment.
     * </p>
     * 
     * @param serviceName
     *        The name of the service associated with the deployment.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the deployment.
     * </p>
     * 
     * @return The name of the service associated with the deployment.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the deployment.
     * </p>
     * 
     * @param serviceName
     *        The name of the service associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of the deployment.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the target of the deployment.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of the deployment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target of the deployment.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of the deployment.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the target of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The date and time the target resource was created.
     * </p>
     * 
     * @param targetResourceCreatedAt
     *        The date and time the target resource was created.
     */

    public void setTargetResourceCreatedAt(java.util.Date targetResourceCreatedAt) {
        this.targetResourceCreatedAt = targetResourceCreatedAt;
    }

    /**
     * <p>
     * The date and time the target resource was created.
     * </p>
     * 
     * @return The date and time the target resource was created.
     */

    public java.util.Date getTargetResourceCreatedAt() {
        return this.targetResourceCreatedAt;
    }

    /**
     * <p>
     * The date and time the target resource was created.
     * </p>
     * 
     * @param targetResourceCreatedAt
     *        The date and time the target resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSummary withTargetResourceCreatedAt(java.util.Date targetResourceCreatedAt) {
        setTargetResourceCreatedAt(targetResourceCreatedAt);
        return this;
    }

    /**
     * <p>
     * The resource type of the deployment target. It can be an environment, service, service instance, or component.
     * </p>
     * 
     * @param targetResourceType
     *        The resource type of the deployment target. It can be an environment, service, service instance, or
     *        component.
     * @see DeploymentTargetResourceType
     */

    public void setTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
    }

    /**
     * <p>
     * The resource type of the deployment target. It can be an environment, service, service instance, or component.
     * </p>
     * 
     * @return The resource type of the deployment target. It can be an environment, service, service instance, or
     *         component.
     * @see DeploymentTargetResourceType
     */

    public String getTargetResourceType() {
        return this.targetResourceType;
    }

    /**
     * <p>
     * The resource type of the deployment target. It can be an environment, service, service instance, or component.
     * </p>
     * 
     * @param targetResourceType
     *        The resource type of the deployment target. It can be an environment, service, service instance, or
     *        component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTargetResourceType
     */

    public DeploymentSummary withTargetResourceType(String targetResourceType) {
        setTargetResourceType(targetResourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the deployment target. It can be an environment, service, service instance, or component.
     * </p>
     * 
     * @param targetResourceType
     *        The resource type of the deployment target. It can be an environment, service, service instance, or
     *        component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTargetResourceType
     */

    public DeploymentSummary withTargetResourceType(DeploymentTargetResourceType targetResourceType) {
        this.targetResourceType = targetResourceType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastAttemptedDeploymentId() != null)
            sb.append("LastAttemptedDeploymentId: ").append(getLastAttemptedDeploymentId()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getLastSucceededDeploymentId() != null)
            sb.append("LastSucceededDeploymentId: ").append(getLastSucceededDeploymentId()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getTargetResourceCreatedAt() != null)
            sb.append("TargetResourceCreatedAt: ").append(getTargetResourceCreatedAt()).append(",");
        if (getTargetResourceType() != null)
            sb.append("TargetResourceType: ").append(getTargetResourceType());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastAttemptedDeploymentId() == null ^ this.getLastAttemptedDeploymentId() == null)
            return false;
        if (other.getLastAttemptedDeploymentId() != null && other.getLastAttemptedDeploymentId().equals(this.getLastAttemptedDeploymentId()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getLastSucceededDeploymentId() == null ^ this.getLastSucceededDeploymentId() == null)
            return false;
        if (other.getLastSucceededDeploymentId() != null && other.getLastSucceededDeploymentId().equals(this.getLastSucceededDeploymentId()) == false)
            return false;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getTargetResourceCreatedAt() == null ^ this.getTargetResourceCreatedAt() == null)
            return false;
        if (other.getTargetResourceCreatedAt() != null && other.getTargetResourceCreatedAt().equals(this.getTargetResourceCreatedAt()) == false)
            return false;
        if (other.getTargetResourceType() == null ^ this.getTargetResourceType() == null)
            return false;
        if (other.getTargetResourceType() != null && other.getTargetResourceType().equals(this.getTargetResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastAttemptedDeploymentId() == null) ? 0 : getLastAttemptedDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getLastSucceededDeploymentId() == null) ? 0 : getLastSucceededDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceCreatedAt() == null) ? 0 : getTargetResourceCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceType() == null) ? 0 : getTargetResourceType().hashCode());
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
        com.amazonaws.services.proton.model.transform.DeploymentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
