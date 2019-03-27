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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Amazon ECS service deployment. This is used only when a service uses the <code>ECS</code>
 * deployment controller type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process of being replaced with a new
     * <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the service to use.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service to deploy or maintain.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>PENDING</code> status.
     * </p>
     */
    private Integer pendingCount;
    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     * </p>
     */
    private Integer runningCount;
    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The launch type the tasks in the service are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

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
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process of being replaced with a new
     * <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the deployment. The following describes each state:</p>
     *        <dl>
     *        <dt>PRIMARY</dt>
     *        <dd>
     *        <p>
     *        The most recent deployment of a service.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        A service deployment that still has running tasks, but are in the process of being replaced with a new
     *        <code>PRIMARY</code> deployment.
     *        </p>
     *        </dd>
     *        <dt>INACTIVE</dt>
     *        <dd>
     *        <p>
     *        A deployment that has been completely replaced.
     *        </p>
     *        </dd>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process of being replaced with a new
     * <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the deployment. The following describes each state:</p>
     *         <dl>
     *         <dt>PRIMARY</dt>
     *         <dd>
     *         <p>
     *         The most recent deployment of a service.
     *         </p>
     *         </dd>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         A service deployment that still has running tasks, but are in the process of being replaced with a new
     *         <code>PRIMARY</code> deployment.
     *         </p>
     *         </dd>
     *         <dt>INACTIVE</dt>
     *         <dd>
     *         <p>
     *         A deployment that has been completely replaced.
     *         </p>
     *         </dd>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process of being replaced with a new
     * <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the deployment. The following describes each state:</p>
     *        <dl>
     *        <dt>PRIMARY</dt>
     *        <dd>
     *        <p>
     *        The most recent deployment of a service.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        A service deployment that still has running tasks, but are in the process of being replaced with a new
     *        <code>PRIMARY</code> deployment.
     *        </p>
     *        </dd>
     *        <dt>INACTIVE</dt>
     *        <dd>
     *        <p>
     *        A deployment that has been completely replaced.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the service to use.
     * </p>
     * 
     * @param taskDefinition
     *        The most recent task definition that was specified for the tasks in the service to use.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the service to use.
     * </p>
     * 
     * @return The most recent task definition that was specified for the tasks in the service to use.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the service to use.
     * </p>
     * 
     * @param taskDefinition
     *        The most recent task definition that was specified for the tasks in the service to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service to deploy or maintain.
     * </p>
     * 
     * @param desiredCount
     *        The most recent desired count of tasks that was specified for the service to deploy or maintain.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service to deploy or maintain.
     * </p>
     * 
     * @return The most recent desired count of tasks that was specified for the service to deploy or maintain.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service to deploy or maintain.
     * </p>
     * 
     * @param desiredCount
     *        The most recent desired count of tasks that was specified for the service to deploy or maintain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>PENDING</code> status.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the deployment that are in the <code>PENDING</code> status.
     */

    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>PENDING</code> status.
     * </p>
     * 
     * @return The number of tasks in the deployment that are in the <code>PENDING</code> status.
     */

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>PENDING</code> status.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the deployment that are in the <code>PENDING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withPendingCount(Integer pendingCount) {
        setPendingCount(pendingCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     */

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     * </p>
     * 
     * @return The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     */

    public Integer getRunningCount() {
        return this.runningCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the deployment that are in the <code>RUNNING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withRunningCount(Integer runningCount) {
        setRunningCount(runningCount);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the service deployment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     * 
     * @return The Unix timestamp for when the service deployment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the service deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp for when the service deployment was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     * 
     * @return The Unix timestamp for when the service deployment was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp for when the service deployment was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type the tasks in the service are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The launch type the tasks in the service are using. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *         Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type the tasks in the service are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Deployment withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type the tasks in the service are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Deployment withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your tasks in the service are running. A platform version is only specified
     *        for tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version
     *        is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version on which your tasks in the service are running. A platform version is only specified
     *         for tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform
     *         version is used by default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your tasks in the service are running. A platform version is only specified
     *        for tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version
     *        is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC subnet and security group configuration for tasks that receive their own elastic network interface
     *        by using the <code>awsvpc</code> networking mode.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     * 
     * @return The VPC subnet and security group configuration for tasks that receive their own elastic network
     *         interface by using the <code>awsvpc</code> networking mode.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC subnet and security group configuration for tasks that receive their own elastic network interface
     *        by using the <code>awsvpc</code> networking mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getPendingCount() != null)
            sb.append("PendingCount: ").append(getPendingCount()).append(",");
        if (getRunningCount() != null)
            sb.append("RunningCount: ").append(getRunningCount()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration());
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null && other.getPendingCount().equals(this.getPendingCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
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
        com.amazonaws.services.ecs.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
