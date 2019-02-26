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
 * Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment. An Amazon ECS task set includes details
 * such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TaskSet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the task set.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     */
    private String taskSetArn;
    /**
     * <p>
     * The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment, then the
     * <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The deployment ID of the AWS CodeDeploy deployment.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * The computed desired count for the task set. This is calculated by multiplying the service's
     * <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     * </p>
     */
    private Integer computedDesiredCount;
    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A task in
     * the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     */
    private Integer pendingCount;
    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A task in
     * the <code>RUNNING</code> state is running and ready for use.
     * </p>
     */
    private Integer runningCount;
    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The launch type the tasks in the task set are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version on which the tasks in the task set are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancers;
    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and keep running in the service.
     * </p>
     */
    private Scale scale;
    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a steady state. If the following
     * conditions are met, the task set will be in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * </p>
     */
    private String stabilityStatus;
    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     */
    private java.util.Date stabilityStatusAt;

    /**
     * <p>
     * The ID of the task set.
     * </p>
     * 
     * @param id
     *        The ID of the task set.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the task set.
     * </p>
     * 
     * @return The ID of the task set.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the task set.
     * </p>
     * 
     * @param id
     *        The ID of the task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     * 
     * @param taskSetArn
     *        The Amazon Resource Name (ARN) of the task set.
     */

    public void setTaskSetArn(String taskSetArn) {
        this.taskSetArn = taskSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task set.
     */

    public String getTaskSetArn() {
        return this.taskSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     * 
     * @param taskSetArn
     *        The Amazon Resource Name (ARN) of the task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withTaskSetArn(String taskSetArn) {
        setTaskSetArn(taskSetArn);
        return this;
    }

    /**
     * <p>
     * The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment, then the
     * <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment, then
     *        the <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment, then the
     * <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     * </p>
     * 
     * @return The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment,
     *         then the <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment, then the
     * <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task set is started. If the task is started by an AWS CodeDeploy deployment, then
     *        the <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The deployment ID of the AWS CodeDeploy deployment.
     * </p>
     * 
     * @param externalId
     *        The deployment ID of the AWS CodeDeploy deployment.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The deployment ID of the AWS CodeDeploy deployment.
     * </p>
     * 
     * @return The deployment ID of the AWS CodeDeploy deployment.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The deployment ID of the AWS CodeDeploy deployment.
     * </p>
     * 
     * @param externalId
     *        The deployment ID of the AWS CodeDeploy deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the task set. The following describes each state:</p>
     *        <dl>
     *        <dt>PRIMARY</dt>
     *        <dd>
     *        <p>
     *        The task set is serving production traffic.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The task set is not serving production traffic.
     *        </p>
     *        </dd>
     *        <dt>DRAINING</dt>
     *        <dd>
     *        <p>
     *        The tasks in the task set are being stopped and their corresponding targets are being deregistered from
     *        their target group.
     *        </p>
     *        </dd>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the task set. The following describes each state:</p>
     *         <dl>
     *         <dt>PRIMARY</dt>
     *         <dd>
     *         <p>
     *         The task set is serving production traffic.
     *         </p>
     *         </dd>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The task set is not serving production traffic.
     *         </p>
     *         </dd>
     *         <dt>DRAINING</dt>
     *         <dd>
     *         <p>
     *         The tasks in the task set are being stopped and their corresponding targets are being deregistered from
     *         their target group.
     *         </p>
     *         </dd>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the task set. The following describes each state:</p>
     *        <dl>
     *        <dt>PRIMARY</dt>
     *        <dd>
     *        <p>
     *        The task set is serving production traffic.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The task set is not serving production traffic.
     *        </p>
     *        </dd>
     *        <dt>DRAINING</dt>
     *        <dd>
     *        <p>
     *        The tasks in the task set are being stopped and their corresponding targets are being deregistered from
     *        their target group.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition the task set is using.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     * 
     * @return The task definition the task set is using.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition the task set is using.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by multiplying the service's
     * <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     * </p>
     * 
     * @param computedDesiredCount
     *        The computed desired count for the task set. This is calculated by multiplying the service's
     *        <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     */

    public void setComputedDesiredCount(Integer computedDesiredCount) {
        this.computedDesiredCount = computedDesiredCount;
    }

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by multiplying the service's
     * <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     * </p>
     * 
     * @return The computed desired count for the task set. This is calculated by multiplying the service's
     *         <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     */

    public Integer getComputedDesiredCount() {
        return this.computedDesiredCount;
    }

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by multiplying the service's
     * <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     * </p>
     * 
     * @param computedDesiredCount
     *        The computed desired count for the task set. This is calculated by multiplying the service's
     *        <code>desiredCount</code> by the task set's <code>scale</code> percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withComputedDesiredCount(Integer computedDesiredCount) {
        setComputedDesiredCount(computedDesiredCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A task in
     * the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A
     *        task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set
     *        enters the <code>PENDING</code> status when it launches for the first time, or when it is restarted after
     *        being in the <code>STOPPED</code> state.
     */

    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A task in
     * the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * 
     * @return The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A
     *         task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set
     *         enters the <code>PENDING</code> status when it launches for the first time, or when it is restarted after
     *         being in the <code>STOPPED</code> state.
     */

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A task in
     * the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the task set that are in the <code>PENDING</code> status during a deployment. A
     *        task in the <code>PENDING</code> state is preparing to enter the <code>RUNNING</code> state. A task set
     *        enters the <code>PENDING</code> status when it launches for the first time, or when it is restarted after
     *        being in the <code>STOPPED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withPendingCount(Integer pendingCount) {
        setPendingCount(pendingCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A task in
     * the <code>RUNNING</code> state is running and ready for use.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A
     *        task in the <code>RUNNING</code> state is running and ready for use.
     */

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A task in
     * the <code>RUNNING</code> state is running and ready for use.
     * </p>
     * 
     * @return The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A
     *         task in the <code>RUNNING</code> state is running and ready for use.
     */

    public Integer getRunningCount() {
        return this.runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A task in
     * the <code>RUNNING</code> state is running and ready for use.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the task set that are in the <code>RUNNING</code> status during a deployment. A
     *        task in the <code>RUNNING</code> state is running and ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withRunningCount(Integer runningCount) {
        setRunningCount(runningCount);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the task set was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     * 
     * @return The Unix timestamp for when the task set was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the task set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp for when the task set was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     * 
     * @return The Unix timestamp for when the task set was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp for when the task set was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type the tasks in the task set are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The launch type the tasks in the task set are using. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *         Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type the tasks in the task set are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public TaskSet withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type the tasks in the task set are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public TaskSet withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version on which the tasks in the task set are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which the tasks in the task set are running. A platform version is only specified
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
     * The platform version on which the tasks in the task set are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version on which the tasks in the task set are running. A platform version is only specified
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
     * The platform version on which the tasks in the task set are running. A platform version is only specified for
     * tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which the tasks in the task set are running. A platform version is only specified
     *        for tasks using the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version
     *        is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the task set.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     * 
     * @return The network configuration for the task set.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     * 
     * @return Details on a load balancer that is used with a task set.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     * 
     * @param loadBalancers
     *        Details on a load balancer that is used with a task set.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        Details on a load balancer that is used with a task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     * 
     * @param loadBalancers
     *        Details on a load balancer that is used with a task set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and keep running in the service.
     * </p>
     * 
     * @param scale
     *        A floating-point percentage of the desired number of tasks to place and keep running in the service.
     */

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and keep running in the service.
     * </p>
     * 
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the service.
     */

    public Scale getScale() {
        return this.scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and keep running in the service.
     * </p>
     * 
     * @param scale
     *        A floating-point percentage of the desired number of tasks to place and keep running in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withScale(Scale scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a steady state. If the following
     * conditions are met, the task set will be in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * </p>
     * 
     * @param stabilityStatus
     *        The stability status, which indicates whether the task set has reached a steady state. If the following
     *        conditions are met, the task set will be in <code>STEADY_STATE</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>pendingCount</code> is <code>0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There are no tasks running on container instances in the <code>DRAINING</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All tasks are reporting a healthy status from the load balancers, service discovery, and container health
     *        checks.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * @see StabilityStatus
     */

    public void setStabilityStatus(String stabilityStatus) {
        this.stabilityStatus = stabilityStatus;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a steady state. If the following
     * conditions are met, the task set will be in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * </p>
     * 
     * @return The stability status, which indicates whether the task set has reached a steady state. If the following
     *         conditions are met, the task set will be in <code>STEADY_STATE</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>pendingCount</code> is <code>0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There are no tasks running on container instances in the <code>DRAINING</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All tasks are reporting a healthy status from the load balancers, service discovery, and container health
     *         checks.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * @see StabilityStatus
     */

    public String getStabilityStatus() {
        return this.stabilityStatus;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a steady state. If the following
     * conditions are met, the task set will be in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * </p>
     * 
     * @param stabilityStatus
     *        The stability status, which indicates whether the task set has reached a steady state. If the following
     *        conditions are met, the task set will be in <code>STEADY_STATE</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>pendingCount</code> is <code>0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There are no tasks running on container instances in the <code>DRAINING</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All tasks are reporting a healthy status from the load balancers, service discovery, and container health
     *        checks.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StabilityStatus
     */

    public TaskSet withStabilityStatus(String stabilityStatus) {
        setStabilityStatus(stabilityStatus);
        return this;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a steady state. If the following
     * conditions are met, the task set will be in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * </p>
     * 
     * @param stabilityStatus
     *        The stability status, which indicates whether the task set has reached a steady state. If the following
     *        conditions are met, the task set will be in <code>STEADY_STATE</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The task <code>runningCount</code> is equal to the <code>computedDesiredCount</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>pendingCount</code> is <code>0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        There are no tasks running on container instances in the <code>DRAINING</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All tasks are reporting a healthy status from the load balancers, service discovery, and container health
     *        checks.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of those conditions are not met, the stability status returns <code>STABILIZING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StabilityStatus
     */

    public TaskSet withStabilityStatus(StabilityStatus stabilityStatus) {
        this.stabilityStatus = stabilityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     * 
     * @param stabilityStatusAt
     *        The Unix timestamp for when the task set stability status was retrieved.
     */

    public void setStabilityStatusAt(java.util.Date stabilityStatusAt) {
        this.stabilityStatusAt = stabilityStatusAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     * 
     * @return The Unix timestamp for when the task set stability status was retrieved.
     */

    public java.util.Date getStabilityStatusAt() {
        return this.stabilityStatusAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     * 
     * @param stabilityStatusAt
     *        The Unix timestamp for when the task set stability status was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSet withStabilityStatusAt(java.util.Date stabilityStatusAt) {
        setStabilityStatusAt(stabilityStatusAt);
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
        if (getTaskSetArn() != null)
            sb.append("TaskSetArn: ").append(getTaskSetArn()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getComputedDesiredCount() != null)
            sb.append("ComputedDesiredCount: ").append(getComputedDesiredCount()).append(",");
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
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getStabilityStatus() != null)
            sb.append("StabilityStatus: ").append(getStabilityStatus()).append(",");
        if (getStabilityStatusAt() != null)
            sb.append("StabilityStatusAt: ").append(getStabilityStatusAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSet == false)
            return false;
        TaskSet other = (TaskSet) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTaskSetArn() == null ^ this.getTaskSetArn() == null)
            return false;
        if (other.getTaskSetArn() != null && other.getTaskSetArn().equals(this.getTaskSetArn()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getComputedDesiredCount() == null ^ this.getComputedDesiredCount() == null)
            return false;
        if (other.getComputedDesiredCount() != null && other.getComputedDesiredCount().equals(this.getComputedDesiredCount()) == false)
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
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getStabilityStatus() == null ^ this.getStabilityStatus() == null)
            return false;
        if (other.getStabilityStatus() != null && other.getStabilityStatus().equals(this.getStabilityStatus()) == false)
            return false;
        if (other.getStabilityStatusAt() == null ^ this.getStabilityStatusAt() == null)
            return false;
        if (other.getStabilityStatusAt() != null && other.getStabilityStatusAt().equals(this.getStabilityStatusAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTaskSetArn() == null) ? 0 : getTaskSetArn().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getComputedDesiredCount() == null) ? 0 : getComputedDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getStabilityStatus() == null) ? 0 : getStabilityStatus().hashCode());
        hashCode = prime * hashCode + ((getStabilityStatusAt() == null) ? 0 : getStabilityStatusAt().hashCode());
        return hashCode;
    }

    @Override
    public TaskSet clone() {
        try {
            return (TaskSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
