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
 * The detailed information about a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

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
     * The name of the component associated with this deployment.
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
     * The status of the deployment.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The deployment status message.
     * </p>
     */
    private String deploymentStatusMessage;
    /**
     * <p>
     * The name of the environment associated with this deployment.
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
     * The initial state of the target resource at the time of the deployment.
     * </p>
     */
    private DeploymentState initialState;
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
     * The name of the deployment's service instance.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service in this deployment.
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
     * The date and time the depoyment target was created.
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
     * The target state of the target resource at the time of the deployment.
     * </p>
     */
    private DeploymentState targetState;

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

    public Deployment withArn(String arn) {
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

    public Deployment withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The name of the component associated with this deployment.
     * </p>
     * 
     * @param componentName
     *        The name of the component associated with this deployment.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component associated with this deployment.
     * </p>
     * 
     * @return The name of the component associated with this deployment.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component associated with this deployment.
     * </p>
     * 
     * @param componentName
     *        The name of the component associated with this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withComponentName(String componentName) {
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

    public Deployment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @return The status of the deployment.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The deployment status message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        The deployment status message.
     */

    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * The deployment status message.
     * </p>
     * 
     * @return The deployment status message.
     */

    public String getDeploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * <p>
     * The deployment status message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        The deployment status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentStatusMessage(String deploymentStatusMessage) {
        setDeploymentStatusMessage(deploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the environment associated with this deployment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment associated with this deployment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment associated with this deployment.
     * </p>
     * 
     * @return The name of the environment associated with this deployment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment associated with this deployment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment associated with this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withEnvironmentName(String environmentName) {
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

    public Deployment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The initial state of the target resource at the time of the deployment.
     * </p>
     * 
     * @param initialState
     *        The initial state of the target resource at the time of the deployment.
     */

    public void setInitialState(DeploymentState initialState) {
        this.initialState = initialState;
    }

    /**
     * <p>
     * The initial state of the target resource at the time of the deployment.
     * </p>
     * 
     * @return The initial state of the target resource at the time of the deployment.
     */

    public DeploymentState getInitialState() {
        return this.initialState;
    }

    /**
     * <p>
     * The initial state of the target resource at the time of the deployment.
     * </p>
     * 
     * @param initialState
     *        The initial state of the target resource at the time of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withInitialState(DeploymentState initialState) {
        setInitialState(initialState);
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

    public Deployment withLastAttemptedDeploymentId(String lastAttemptedDeploymentId) {
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

    public Deployment withLastModifiedAt(java.util.Date lastModifiedAt) {
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

    public Deployment withLastSucceededDeploymentId(String lastSucceededDeploymentId) {
        setLastSucceededDeploymentId(lastSucceededDeploymentId);
        return this;
    }

    /**
     * <p>
     * The name of the deployment's service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the deployment's service instance.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the deployment's service instance.
     * </p>
     * 
     * @return The name of the deployment's service instance.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the deployment's service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the deployment's service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service in this deployment.
     * </p>
     * 
     * @param serviceName
     *        The name of the service in this deployment.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service in this deployment.
     * </p>
     * 
     * @return The name of the service in this deployment.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service in this deployment.
     * </p>
     * 
     * @param serviceName
     *        The name of the service in this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withServiceName(String serviceName) {
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

    public Deployment withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The date and time the depoyment target was created.
     * </p>
     * 
     * @param targetResourceCreatedAt
     *        The date and time the depoyment target was created.
     */

    public void setTargetResourceCreatedAt(java.util.Date targetResourceCreatedAt) {
        this.targetResourceCreatedAt = targetResourceCreatedAt;
    }

    /**
     * <p>
     * The date and time the depoyment target was created.
     * </p>
     * 
     * @return The date and time the depoyment target was created.
     */

    public java.util.Date getTargetResourceCreatedAt() {
        return this.targetResourceCreatedAt;
    }

    /**
     * <p>
     * The date and time the depoyment target was created.
     * </p>
     * 
     * @param targetResourceCreatedAt
     *        The date and time the depoyment target was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withTargetResourceCreatedAt(java.util.Date targetResourceCreatedAt) {
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

    public Deployment withTargetResourceType(String targetResourceType) {
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

    public Deployment withTargetResourceType(DeploymentTargetResourceType targetResourceType) {
        this.targetResourceType = targetResourceType.toString();
        return this;
    }

    /**
     * <p>
     * The target state of the target resource at the time of the deployment.
     * </p>
     * 
     * @param targetState
     *        The target state of the target resource at the time of the deployment.
     */

    public void setTargetState(DeploymentState targetState) {
        this.targetState = targetState;
    }

    /**
     * <p>
     * The target state of the target resource at the time of the deployment.
     * </p>
     * 
     * @return The target state of the target resource at the time of the deployment.
     */

    public DeploymentState getTargetState() {
        return this.targetState;
    }

    /**
     * <p>
     * The target state of the target resource at the time of the deployment.
     * </p>
     * 
     * @param targetState
     *        The target state of the target resource at the time of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withTargetState(DeploymentState targetState) {
        setTargetState(targetState);
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
        if (getDeploymentStatusMessage() != null)
            sb.append("DeploymentStatusMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInitialState() != null)
            sb.append("InitialState: ").append(getInitialState()).append(",");
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
            sb.append("TargetResourceType: ").append(getTargetResourceType()).append(",");
        if (getTargetState() != null)
            sb.append("TargetState: ").append(getTargetState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;
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
        if (other.getDeploymentStatusMessage() == null ^ this.getDeploymentStatusMessage() == null)
            return false;
        if (other.getDeploymentStatusMessage() != null && other.getDeploymentStatusMessage().equals(this.getDeploymentStatusMessage()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInitialState() == null ^ this.getInitialState() == null)
            return false;
        if (other.getInitialState() != null && other.getInitialState().equals(this.getInitialState()) == false)
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
        if (other.getTargetState() == null ^ this.getTargetState() == null)
            return false;
        if (other.getTargetState() != null && other.getTargetState().equals(this.getTargetState()) == false)
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
        hashCode = prime * hashCode + ((getDeploymentStatusMessage() == null) ? 0 : getDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInitialState() == null) ? 0 : getInitialState().hashCode());
        hashCode = prime * hashCode + ((getLastAttemptedDeploymentId() == null) ? 0 : getLastAttemptedDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getLastSucceededDeploymentId() == null) ? 0 : getLastSucceededDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceCreatedAt() == null) ? 0 : getTargetResourceCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceType() == null) ? 0 : getTargetResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargetState() == null) ? 0 : getTargetState().hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
