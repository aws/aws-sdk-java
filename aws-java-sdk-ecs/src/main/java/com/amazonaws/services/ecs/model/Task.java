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
 * Details on a task in a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Task" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Task implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * One or more container overrides.
     * </p>
     */
    private TaskOverride overrides;
    /**
     * <p>
     * The last known status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The desired status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     */
    private String desiredStatus;
    /**
     * <p>
     * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer
     * using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs, for example
     * <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer indicating the CPU units
     * when the task definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     * units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     */
    private String cpu;
    /**
     * <p>
     * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an
     * integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for example
     * <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the MiB when the task
     * definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     */
    private String memory;
    /**
     * <p>
     * The containers associated with the task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Container> containers;
    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can
     * compare the version of a task reported by the Amazon ECS API actionss with the version reported in CloudWatch
     * Events for the task (inside the <code>detail</code> object) to verify that the version in your event stream is
     * current.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     */
    private String stoppedReason;
    /**
     * <p>
     * The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional details.
     * </p>
     */
    private String stopCode;
    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     */
    private String connectivity;
    /**
     * <p>
     * The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     * </p>
     */
    private java.util.Date connectivityAt;
    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     */
    private java.util.Date pullStartedAt;
    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     */
    private java.util.Date pullStoppedAt;
    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     */
    private java.util.Date executionStoppedAt;
    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state to the
     * <code>RUNNING</code> state).
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     * <code>STOPPED</code>).
     * </p>
     */
    private java.util.Date stoppingAt;
    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     */
    private java.util.Date stoppedAt;
    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The launch type on which your task is running. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version on which your task is running. A platform version is only specified for tasks using the
     * Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network mode.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attachment> attachments;
    /**
     * <p>
     * The health status for the task, which is determined by the health of the essential containers in the task. If all
     * essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also reports as
     * <code>HEALTHY</code>. If any essential containers in the task are reporting as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, then the task status also reports as <code>UNHEALTHY</code> or <code>UNKNOWN</code>,
     * accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     * container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in
     * the container definition. Health check parameters that are specified in a container definition override any
     * Docker health checks that exist in the container image.
     * </p>
     * </note>
     */
    private String healthStatus;
    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and
     * tag values can have a maximum length of 256 characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     * 
     * @param clusterArn
     *        The ARN of the cluster that hosts the task.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     * 
     * @return The ARN of the cluster that hosts the task.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     * 
     * @param clusterArn
     *        The ARN of the cluster that hosts the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition that creates the task.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @return The ARN of the task definition that creates the task.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition that creates the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The ARN of the container instances that host the task.
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     * 
     * @return The ARN of the container instances that host the task.
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The ARN of the container instances that host the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * 
     * @param overrides
     *        One or more container overrides.
     */

    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * 
     * @return One or more container overrides.
     */

    public TaskOverride getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * 
     * @param overrides
     *        One or more container overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withOverrides(TaskOverride overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * The last known status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task
     *        Lifecycle</a>.
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     * 
     * @return The last known status of the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task
     *         Lifecycle</a>.
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The last known status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task
     *        Lifecycle</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The desired status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     * 
     * @param desiredStatus
     *        The desired status of the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task
     *        Lifecycle</a>.
     */

    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    /**
     * <p>
     * The desired status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     * 
     * @return The desired status of the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task
     *         Lifecycle</a>.
     */

    public String getDesiredStatus() {
        return this.desiredStatus;
    }

    /**
     * <p>
     * The desired status of the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task Lifecycle</a>.
     * </p>
     * 
     * @param desiredStatus
     *        The desired status of the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_life_cycle.html">Task
     *        Lifecycle</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withDesiredStatus(String desiredStatus) {
        setDesiredStatus(desiredStatus);
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer
     * using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs, for example
     * <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer indicating the CPU units
     * when the task definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     * units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpu
     *        The number of CPU units used by the task as expressed in a task definition. It can be expressed as an
     *        integer using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs,
     *        for example <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer
     *        indicating the CPU units when the task definition is registered.</p>
     *        <p>
     *        If you are using the EC2 launch type, this field is optional. Supported values are between
     *        <code>128</code> CPU units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code>
     *        vCPUs).
     *        </p>
     *        <p>
     *        If you are using the Fargate launch type, this field is required and you must use one of the following
     *        values, which determines your range of supported values for the <code>memory</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *        6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer
     * using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs, for example
     * <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer indicating the CPU units
     * when the task definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     * units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of CPU units used by the task as expressed in a task definition. It can be expressed as an
     *         integer using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs,
     *         for example <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer
     *         indicating the CPU units when the task definition is registered.</p>
     *         <p>
     *         If you are using the EC2 launch type, this field is optional. Supported values are between
     *         <code>128</code> CPU units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code>
     *         vCPUs).
     *         </p>
     *         <p>
     *         If you are using the Fargate launch type, this field is required and you must use one of the following
     *         values, which determines your range of supported values for the <code>memory</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *         6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *         of 1024 (1 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *         of 1024 (1 GB)
     *         </p>
     *         </li>
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer
     * using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs, for example
     * <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer indicating the CPU units
     * when the task definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported values are between <code>128</code> CPU
     * units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     * GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024
     * (1 GB)
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpu
     *        The number of CPU units used by the task as expressed in a task definition. It can be expressed as an
     *        integer using CPU units, for example <code>1024</code>. It can also be expressed as a string using vCPUs,
     *        for example <code>1 vCPU</code> or <code>1 vcpu</code>. String values are converted to an integer
     *        indicating the CPU units when the task definition is registered.</p>
     *        <p>
     *        If you are using the EC2 launch type, this field is optional. Supported values are between
     *        <code>128</code> CPU units (<code>0.125</code> vCPUs) and <code>10240</code> CPU units (<code>10</code>
     *        vCPUs).
     *        </p>
     *        <p>
     *        If you are using the Fargate launch type, this field is required and you must use one of the following
     *        values, which determines your range of supported values for the <code>memory</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB),
     *        6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB) and 16384 (16 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB) and 30720 (30 GB) in increments
     *        of 1024 (1 GB)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an
     * integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for example
     * <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the MiB when the task
     * definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @param memory
     *        The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as
     *        an integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for
     *        example <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the
     *        MiB when the task definition is registered.</p>
     *        <p>
     *        If you are using the EC2 launch type, this field is optional.
     *        </p>
     *        <p>
     *        If you are using the Fargate launch type, this field is required and you must use one of the following
     *        values, which determines your range of supported values for the <code>cpu</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *        <code>cpu</code> values: 1024 (1 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        2048 (2 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        4096 (4 vCPU)
     *        </p>
     *        </li>
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an
     * integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for example
     * <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the MiB when the task
     * definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as
     *         an integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for
     *         example <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the
     *         MiB when the task definition is registered.</p>
     *         <p>
     *         If you are using the EC2 launch type, this field is optional.
     *         </p>
     *         <p>
     *         If you are using the Fargate launch type, this field is required and you must use one of the following
     *         values, which determines your range of supported values for the <code>cpu</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *         <code>cpu</code> values: 1024 (1 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *         2048 (2 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *         4096 (4 vCPU)
     *         </p>
     *         </li>
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an
     * integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for example
     * <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the MiB when the task
     * definition is registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you must use one of the following values,
     * which determines your range of supported values for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     * <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 2048 (2
     * vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values: 4096 (4
     * vCPU)
     * </p>
     * </li>
     * </ul>
     * 
     * @param memory
     *        The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as
     *        an integer using MiB, for example <code>1024</code>. It can also be expressed as a string using GB, for
     *        example <code>1GB</code> or <code>1 GB</code>. String values are converted to an integer indicating the
     *        MiB when the task definition is registered.</p>
     *        <p>
     *        If you are using the EC2 launch type, this field is optional.
     *        </p>
     *        <p>
     *        If you are using the Fargate launch type, this field is required and you must use one of the following
     *        values, which determines your range of supported values for the <code>cpu</code> parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code> values: 256 (.25 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available <code>cpu</code> values: 512 (.5 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available
     *        <code>cpu</code> values: 1024 (1 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        2048 (2 vCPU)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available <code>cpu</code> values:
     *        4096 (4 vCPU)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * 
     * @return The containers associated with the task.
     */

    public java.util.List<Container> getContainers() {
        if (containers == null) {
            containers = new com.amazonaws.internal.SdkInternalList<Container>();
        }
        return containers;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers associated with the task.
     */

    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new com.amazonaws.internal.SdkInternalList<Container>(containers);
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The containers associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withContainers(Container... containers) {
        if (this.containers == null) {
            setContainers(new com.amazonaws.internal.SdkInternalList<Container>(containers.length));
        }
        for (Container ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withContainers(java.util.Collection<Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     *        <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     * 
     * @return The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     *         <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     *        <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can
     * compare the version of a task reported by the Amazon ECS API actionss with the version reported in CloudWatch
     * Events for the task (inside the <code>detail</code> object) to verify that the version in your event stream is
     * current.
     * </p>
     * 
     * @param version
     *        The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event,
     *        the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch
     *        Events, you can compare the version of a task reported by the Amazon ECS API actionss with the version
     *        reported in CloudWatch Events for the task (inside the <code>detail</code> object) to verify that the
     *        version in your event stream is current.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can
     * compare the version of a task reported by the Amazon ECS API actionss with the version reported in CloudWatch
     * Events for the task (inside the <code>detail</code> object) to verify that the version in your event stream is
     * current.
     * </p>
     * 
     * @return The version counter for the task. Every time a task experiences a change that triggers a CloudWatch
     *         event, the version counter is incremented. If you are replicating your Amazon ECS task state with
     *         CloudWatch Events, you can compare the version of a task reported by the Amazon ECS API actionss with the
     *         version reported in CloudWatch Events for the task (inside the <code>detail</code> object) to verify that
     *         the version in your event stream is current.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can
     * compare the version of a task reported by the Amazon ECS API actionss with the version reported in CloudWatch
     * Events for the task (inside the <code>detail</code> object) to verify that the version in your event stream is
     * current.
     * </p>
     * 
     * @param version
     *        The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event,
     *        the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch
     *        Events, you can compare the version of a task reported by the Amazon ECS API actionss with the version
     *        reported in CloudWatch Events for the task (inside the <code>detail</code> object) to verify that the
     *        version in your event stream is current.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     * 
     * @param stoppedReason
     *        The reason that the task was stopped.
     */

    public void setStoppedReason(String stoppedReason) {
        this.stoppedReason = stoppedReason;
    }

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     * 
     * @return The reason that the task was stopped.
     */

    public String getStoppedReason() {
        return this.stoppedReason;
    }

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     * 
     * @param stoppedReason
     *        The reason that the task was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStoppedReason(String stoppedReason) {
        setStoppedReason(stoppedReason);
        return this;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional details.
     * </p>
     * 
     * @param stopCode
     *        The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional
     *        details.
     * @see TaskStopCode
     */

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional details.
     * </p>
     * 
     * @return The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional
     *         details.
     * @see TaskStopCode
     */

    public String getStopCode() {
        return this.stopCode;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional details.
     * </p>
     * 
     * @param stopCode
     *        The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional
     *        details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStopCode
     */

    public Task withStopCode(String stopCode) {
        setStopCode(stopCode);
        return this;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional details.
     * </p>
     * 
     * @param stopCode
     *        The stop code indicating why a task was stopped. The <code>stoppedReason</code> may contain additional
     *        details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStopCode
     */

    public Task withStopCode(TaskStopCode stopCode) {
        this.stopCode = stopCode.toString();
        return this;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * 
     * @param connectivity
     *        The connectivity status of a task.
     * @see Connectivity
     */

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * 
     * @return The connectivity status of a task.
     * @see Connectivity
     */

    public String getConnectivity() {
        return this.connectivity;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * 
     * @param connectivity
     *        The connectivity status of a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Connectivity
     */

    public Task withConnectivity(String connectivity) {
        setConnectivity(connectivity);
        return this;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * 
     * @param connectivity
     *        The connectivity status of a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Connectivity
     */

    public Task withConnectivity(Connectivity connectivity) {
        this.connectivity = connectivity.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     * </p>
     * 
     * @param connectivityAt
     *        The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     */

    public void setConnectivityAt(java.util.Date connectivityAt) {
        this.connectivityAt = connectivityAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     * </p>
     * 
     * @return The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     */

    public java.util.Date getConnectivityAt() {
        return this.connectivityAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     * </p>
     * 
     * @param connectivityAt
     *        The Unix timestamp for when the task last went into <code>CONNECTED</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withConnectivityAt(java.util.Date connectivityAt) {
        setConnectivityAt(connectivityAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     * 
     * @param pullStartedAt
     *        The Unix timestamp for when the container image pull began.
     */

    public void setPullStartedAt(java.util.Date pullStartedAt) {
        this.pullStartedAt = pullStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     * 
     * @return The Unix timestamp for when the container image pull began.
     */

    public java.util.Date getPullStartedAt() {
        return this.pullStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     * 
     * @param pullStartedAt
     *        The Unix timestamp for when the container image pull began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withPullStartedAt(java.util.Date pullStartedAt) {
        setPullStartedAt(pullStartedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     * 
     * @param pullStoppedAt
     *        The Unix timestamp for when the container image pull completed.
     */

    public void setPullStoppedAt(java.util.Date pullStoppedAt) {
        this.pullStoppedAt = pullStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     * 
     * @return The Unix timestamp for when the container image pull completed.
     */

    public java.util.Date getPullStoppedAt() {
        return this.pullStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     * 
     * @param pullStoppedAt
     *        The Unix timestamp for when the container image pull completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withPullStoppedAt(java.util.Date pullStoppedAt) {
        setPullStoppedAt(pullStoppedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     * 
     * @param executionStoppedAt
     *        The Unix timestamp for when the task execution stopped.
     */

    public void setExecutionStoppedAt(java.util.Date executionStoppedAt) {
        this.executionStoppedAt = executionStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     * 
     * @return The Unix timestamp for when the task execution stopped.
     */

    public java.util.Date getExecutionStoppedAt() {
        return this.executionStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     * 
     * @param executionStoppedAt
     *        The Unix timestamp for when the task execution stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withExecutionStoppedAt(java.util.Date executionStoppedAt) {
        setExecutionStoppedAt(executionStoppedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state to the
     * <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state to
     *        the <code>RUNNING</code> state).
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state to the
     * <code>RUNNING</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state
     *         to the <code>RUNNING</code> state).
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state to the
     * <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for when the task started (the task transitioned from the <code>PENDING</code> state to
     *        the <code>RUNNING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     * <code>STOPPED</code>).
     * </p>
     * 
     * @param stoppingAt
     *        The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     *        <code>STOPPED</code>).
     */

    public void setStoppingAt(java.util.Date stoppingAt) {
        this.stoppingAt = stoppingAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     * <code>STOPPED</code>).
     * </p>
     * 
     * @return The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     *         <code>STOPPED</code>).
     */

    public java.util.Date getStoppingAt() {
        return this.stoppingAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     * <code>STOPPED</code>).
     * </p>
     * 
     * @param stoppingAt
     *        The Unix timestamp for when the task stops (transitions from the <code>RUNNING</code> state to
     *        <code>STOPPED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStoppingAt(java.util.Date stoppingAt) {
        setStoppingAt(stoppingAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code>
     *        state to the <code>STOPPED</code> state).
     */

    public void setStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code>
     *         state to the <code>STOPPED</code> state).
     */

    public java.util.Date getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code>
     *        state to the <code>STOPPED</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStoppedAt(java.util.Date stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     * 
     * @param group
     *        The name of the task group associated with the task.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     * 
     * @return The name of the task group associated with the task.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     * 
     * @param group
     *        The name of the task group associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The launch type on which your task is running. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type on which your task is running. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which your task is running. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The launch type on which your task is running. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *         Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type on which your task is running. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type on which your task is running. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Task withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type on which your task is running. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type on which your task is running. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Task withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version on which your task is running. A platform version is only specified for tasks using the
     * Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your task is running. A platform version is only specified for tasks using
     *        the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which your task is running. A platform version is only specified for tasks using the
     * Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version on which your task is running. A platform version is only specified for tasks using
     *         the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     *         default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version on which your task is running. A platform version is only specified for tasks using the
     * Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your task is running. A platform version is only specified for tasks using
     *        the Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network mode.
     * </p>
     * 
     * @return The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network
     *         mode.
     */

    public java.util.List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<Attachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network mode.
     * </p>
     * 
     * @param attachments
     *        The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network
     *        mode.
     */

    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<Attachment>(attachments);
    }

    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network mode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withAttachments(Attachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<Attachment>(attachments.length));
        }
        for (Attachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network mode.
     * </p>
     * 
     * @param attachments
     *        The Elastic Network Adapter associated with the task if the task uses the <code>awsvpc</code> network
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the essential containers in the task. If all
     * essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also reports as
     * <code>HEALTHY</code>. If any essential containers in the task are reporting as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, then the task status also reports as <code>UNHEALTHY</code> or <code>UNKNOWN</code>,
     * accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     * container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in
     * the container definition. Health check parameters that are specified in a container definition override any
     * Docker health checks that exist in the container image.
     * </p>
     * </note>
     * 
     * @param healthStatus
     *        The health status for the task, which is determined by the health of the essential containers in the task.
     *        If all essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also
     *        reports as <code>HEALTHY</code>. If any essential containers in the task are reporting as
     *        <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the task status also reports as
     *        <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.</p> <note>
     *        <p>
     *        The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     *        container image (such as those specified in a parent image or from the image's Dockerfile) and not
     *        specified in the container definition. Health check parameters that are specified in a container
     *        definition override any Docker health checks that exist in the container image.
     *        </p>
     * @see HealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the essential containers in the task. If all
     * essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also reports as
     * <code>HEALTHY</code>. If any essential containers in the task are reporting as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, then the task status also reports as <code>UNHEALTHY</code> or <code>UNKNOWN</code>,
     * accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     * container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in
     * the container definition. Health check parameters that are specified in a container definition override any
     * Docker health checks that exist in the container image.
     * </p>
     * </note>
     * 
     * @return The health status for the task, which is determined by the health of the essential containers in the
     *         task. If all essential containers in the task are reporting as <code>HEALTHY</code>, then the task status
     *         also reports as <code>HEALTHY</code>. If any essential containers in the task are reporting as
     *         <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the task status also reports as
     *         <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.</p> <note>
     *         <p>
     *         The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     *         container image (such as those specified in a parent image or from the image's Dockerfile) and not
     *         specified in the container definition. Health check parameters that are specified in a container
     *         definition override any Docker health checks that exist in the container image.
     *         </p>
     * @see HealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the essential containers in the task. If all
     * essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also reports as
     * <code>HEALTHY</code>. If any essential containers in the task are reporting as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, then the task status also reports as <code>UNHEALTHY</code> or <code>UNKNOWN</code>,
     * accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     * container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in
     * the container definition. Health check parameters that are specified in a container definition override any
     * Docker health checks that exist in the container image.
     * </p>
     * </note>
     * 
     * @param healthStatus
     *        The health status for the task, which is determined by the health of the essential containers in the task.
     *        If all essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also
     *        reports as <code>HEALTHY</code>. If any essential containers in the task are reporting as
     *        <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the task status also reports as
     *        <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.</p> <note>
     *        <p>
     *        The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     *        container image (such as those specified in a parent image or from the image's Dockerfile) and not
     *        specified in the container definition. Health check parameters that are specified in a container
     *        definition override any Docker health checks that exist in the container image.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public Task withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the essential containers in the task. If all
     * essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also reports as
     * <code>HEALTHY</code>. If any essential containers in the task are reporting as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, then the task status also reports as <code>UNHEALTHY</code> or <code>UNKNOWN</code>,
     * accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     * container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in
     * the container definition. Health check parameters that are specified in a container definition override any
     * Docker health checks that exist in the container image.
     * </p>
     * </note>
     * 
     * @param healthStatus
     *        The health status for the task, which is determined by the health of the essential containers in the task.
     *        If all essential containers in the task are reporting as <code>HEALTHY</code>, then the task status also
     *        reports as <code>HEALTHY</code>. If any essential containers in the task are reporting as
     *        <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the task status also reports as
     *        <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.</p> <note>
     *        <p>
     *        The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a
     *        container image (such as those specified in a parent image or from the image's Dockerfile) and not
     *        specified in the container definition. Health check parameters that are specified in a container
     *        definition override any Docker health checks that exist in the container image.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public Task withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and
     * tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *         key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *         characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and
     * tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and
     * tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and
     * tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn()).append(",");
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: ").append(getContainerInstanceArn()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus()).append(",");
        if (getDesiredStatus() != null)
            sb.append("DesiredStatus: ").append(getDesiredStatus()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStoppedReason() != null)
            sb.append("StoppedReason: ").append(getStoppedReason()).append(",");
        if (getStopCode() != null)
            sb.append("StopCode: ").append(getStopCode()).append(",");
        if (getConnectivity() != null)
            sb.append("Connectivity: ").append(getConnectivity()).append(",");
        if (getConnectivityAt() != null)
            sb.append("ConnectivityAt: ").append(getConnectivityAt()).append(",");
        if (getPullStartedAt() != null)
            sb.append("PullStartedAt: ").append(getPullStartedAt()).append(",");
        if (getPullStoppedAt() != null)
            sb.append("PullStoppedAt: ").append(getPullStoppedAt()).append(",");
        if (getExecutionStoppedAt() != null)
            sb.append("ExecutionStoppedAt: ").append(getExecutionStoppedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStoppingAt() != null)
            sb.append("StoppingAt: ").append(getStoppingAt()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Task == false)
            return false;
        Task other = (Task) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getDesiredStatus() == null ^ this.getDesiredStatus() == null)
            return false;
        if (other.getDesiredStatus() != null && other.getDesiredStatus().equals(this.getDesiredStatus()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStoppedReason() == null ^ this.getStoppedReason() == null)
            return false;
        if (other.getStoppedReason() != null && other.getStoppedReason().equals(this.getStoppedReason()) == false)
            return false;
        if (other.getStopCode() == null ^ this.getStopCode() == null)
            return false;
        if (other.getStopCode() != null && other.getStopCode().equals(this.getStopCode()) == false)
            return false;
        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        if (other.getConnectivityAt() == null ^ this.getConnectivityAt() == null)
            return false;
        if (other.getConnectivityAt() != null && other.getConnectivityAt().equals(this.getConnectivityAt()) == false)
            return false;
        if (other.getPullStartedAt() == null ^ this.getPullStartedAt() == null)
            return false;
        if (other.getPullStartedAt() != null && other.getPullStartedAt().equals(this.getPullStartedAt()) == false)
            return false;
        if (other.getPullStoppedAt() == null ^ this.getPullStoppedAt() == null)
            return false;
        if (other.getPullStoppedAt() != null && other.getPullStoppedAt().equals(this.getPullStoppedAt()) == false)
            return false;
        if (other.getExecutionStoppedAt() == null ^ this.getExecutionStoppedAt() == null)
            return false;
        if (other.getExecutionStoppedAt() != null && other.getExecutionStoppedAt().equals(this.getExecutionStoppedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStoppingAt() == null ^ this.getStoppingAt() == null)
            return false;
        if (other.getStoppingAt() != null && other.getStoppingAt().equals(this.getStoppingAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getDesiredStatus() == null) ? 0 : getDesiredStatus().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStoppedReason() == null) ? 0 : getStoppedReason().hashCode());
        hashCode = prime * hashCode + ((getStopCode() == null) ? 0 : getStopCode().hashCode());
        hashCode = prime * hashCode + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        hashCode = prime * hashCode + ((getConnectivityAt() == null) ? 0 : getConnectivityAt().hashCode());
        hashCode = prime * hashCode + ((getPullStartedAt() == null) ? 0 : getPullStartedAt().hashCode());
        hashCode = prime * hashCode + ((getPullStoppedAt() == null) ? 0 : getPullStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getExecutionStoppedAt() == null) ? 0 : getExecutionStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppingAt() == null) ? 0 : getStoppingAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Task clone() {
        try {
            return (Task) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
