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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RegisterTaskDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTaskDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String family;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     * If you are using the EC2 launch type, any network mode can be used. If the network mode is set to
     * <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks containers do
     * not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     * networking performance for containers because they use the EC2 network stack instead of the virtualized network
     * stack provided by the <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     */
    private String networkMode;
    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;
    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint> placementConstraints;
    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> requiresCompatibilities;
    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition. String values are converted to an integer indicating the CPU units when the task definition is
     * registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
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
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
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
     * The metadata that you apply to the task definition to help you categorize and organize them. Each tag consists of
     * a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same IPC resources with the host Amazon EC2
     * instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     */
    private String pidMode;
    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     */
    private String ipcMode;

    private ProxyConfiguration proxyConfiguration;

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *        of the same task definition. The <code>family</code> is used as a name for your task definition. Up to 255
     *        letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *         of the same task definition. The <code>family</code> is used as a name for your task definition. Up to
     *         255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which allows you to track multiple versions of the
     * same task definition. The <code>family</code> is used as a name for your task definition. Up to 255 letters
     * (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition, which allows you to track multiple versions
     *        of the same task definition. The <code>family</code> is used as a name for your task definition. Up to 255
     *        letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *        All containers in this task are granted the permissions that are specified in this role. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *        Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can
     *         assume. All containers in this task are granted the permissions that are specified in this role. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *         Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All
     * containers in this task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The short name or full Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *        All containers in this task are granted the permissions that are specified in this role. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for
     *        Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the
     *        Docker daemon can assume.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the
     *         Docker daemon can assume.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the Docker
     * daemon can assume.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that the Amazon ECS container agent and the
     *        Docker daemon can assume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     * If you are using the EC2 launch type, any network mode can be used. If the network mode is set to
     * <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks containers do
     * not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     * networking performance for containers because they use the EC2 network stack instead of the virtualized network
     * stack provided by the <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is
     *        required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set
     *        to <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     * If you are using the EC2 launch type, any network mode can be used. If the network mode is set to
     * <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks containers do
     * not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     * networking performance for containers because they use the EC2 network stack instead of the virtualized network
     * stack provided by the <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @return The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *         <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *         <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is
     *         required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set
     *         to <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks
     *         containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *         offer the highest networking performance for containers because they use the EC2 network stack instead of
     *         the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *         <p>
     *         With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *         directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *         network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of
     *         dynamic host port mappings.
     *         </p>
     *         <p>
     *         If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *         must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *         definition. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *         Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *         package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *         </p>
     *         </note>
     *         <p>
     *         If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *         single container instance when port mappings are used.
     *         </p>
     *         <p>
     *         Docker for Windows uses different network modes than Docker for Linux. When you register a task
     *         definition with Windows containers, you must not specify a network mode. If you use the console to
     *         register a task definition with Windows containers, you must choose the <code>&lt;default&gt;</code>
     *         network mode object.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#network-settings">Network settings</a> in the
     *         <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public String getNetworkMode() {
        return this.networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     * If you are using the EC2 launch type, any network mode can be used. If the network mode is set to
     * <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks containers do
     * not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     * networking performance for containers because they use the EC2 network stack instead of the virtualized network
     * stack provided by the <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is
     *        required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set
     *        to <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public RegisterTaskDefinitionRequest withNetworkMode(String networkMode) {
        setNetworkMode(networkMode);
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     * If you are using the EC2 launch type, any network mode can be used. If the network mode is set to
     * <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks containers do
     * not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     * networking performance for containers because they use the EC2 network stack instead of the virtualized network
     * stack provided by the <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is
     *        required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set
     *        to <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @see NetworkMode
     */

    public void setNetworkMode(NetworkMode networkMode) {
        withNetworkMode(networkMode);
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     * <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     * <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is required.
     * If you are using the EC2 launch type, any network mode can be used. If the network mode is set to
     * <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks containers do
     * not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes offer the highest
     * networking performance for containers because they use the EC2 network stack instead of the virtualized network
     * stack provided by the <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the <code>host</code> network mode) or the attached elastic network interface
     * port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you must
     * specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task definition. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code> package, or
     * AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a single
     * container instance when port mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with
     * Windows containers, you must not specify a network mode. If you use the console to register a task definition
     * with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     * settings</a> in the <i>Docker run reference</i>.
     * </p>
     * 
     * @param networkMode
     *        The Docker networking mode to use for the containers in the task. The valid values are <code>none</code>,
     *        <code>bridge</code>, <code>awsvpc</code>, and <code>host</code>. The default Docker network mode is
     *        <code>bridge</code>. If you are using the Fargate launch type, the <code>awsvpc</code> network mode is
     *        required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set
     *        to <code>none</code>, you cannot specify port mappings in your container definitions, and the tasks
     *        containers do not have external connectivity. The <code>host</code> and <code>awsvpc</code> network modes
     *        offer the highest networking performance for containers because they use the EC2 network stack instead of
     *        the virtualized network stack provided by the <code>bridge</code> mode.</p>
     *        <p>
     *        With the <code>host</code> and <code>awsvpc</code> network modes, exposed container ports are mapped
     *        directly to the corresponding host port (for the <code>host</code> network mode) or the attached elastic
     *        network interface port (for the <code>awsvpc</code> network mode), so you cannot take advantage of dynamic
     *        host port mappings.
     *        </p>
     *        <p>
     *        If the network mode is <code>awsvpc</code>, the task is allocated an elastic network interface, and you
     *        must specify a <a>NetworkConfiguration</a> value when you create a service or run a task with the task
     *        definition. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the <code>ecs-init</code>
     *        package, or AWS Fargate infrastructure support the <code>awsvpc</code> network mode.
     *        </p>
     *        </note>
     *        <p>
     *        If the network mode is <code>host</code>, you cannot run multiple instantiations of the same task on a
     *        single container instance when port mappings are used.
     *        </p>
     *        <p>
     *        Docker for Windows uses different network modes than Docker for Linux. When you register a task definition
     *        with Windows containers, you must not specify a network mode. If you use the console to register a task
     *        definition with Windows containers, you must choose the <code>&lt;default&gt;</code> network mode object.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://docs.docker.com/engine/reference/run/#network-settings">Network
     *        settings</a> in the <i>Docker run reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkMode
     */

    public RegisterTaskDefinitionRequest withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @return A list of container definitions in JSON format that describe the different containers that make up your
     *         task.
     */

    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
            containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>();
        }
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     */

    public void setContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions);
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerDefinitions(java.util.Collection)} or {@link #withContainerDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(containerDefinitions.length));
        }
        for (ContainerDefinition ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the different containers that make up your
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @return A list of volume definitions in JSON format that containers in your task may use.
     */

    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<Volume>(volumes);
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in your task may use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @return An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *         per task (this limit includes constraints in the task definition and those specified at runtime).
     */

    public java.util.List<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *        per task (this limit includes constraints in the task definition and those specified at runtime).
     */

    public void setPlacementConstraints(java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *        per task (this limit includes constraints in the task definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withPlacementConstraints(TaskDefinitionPlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<TaskDefinitionPlacementConstraint>(placementConstraints.length));
        }
        for (TaskDefinitionPlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints per
     * task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify a maximum of 10 constraints
     *        per task (this limit includes constraints in the task definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withPlacementConstraints(java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @return The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @see Compatibility
     */

    public java.util.List<String> getRequiresCompatibilities() {
        if (requiresCompatibilities == null) {
            requiresCompatibilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return requiresCompatibilities;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @see Compatibility
     */

    public void setRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        if (requiresCompatibilities == null) {
            this.requiresCompatibilities = null;
            return;
        }

        this.requiresCompatibilities = new com.amazonaws.internal.SdkInternalList<String>(requiresCompatibilities);
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiresCompatibilities(java.util.Collection)} or
     * {@link #withRequiresCompatibilities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public RegisterTaskDefinitionRequest withRequiresCompatibilities(String... requiresCompatibilities) {
        if (this.requiresCompatibilities == null) {
            setRequiresCompatibilities(new com.amazonaws.internal.SdkInternalList<String>(requiresCompatibilities.length));
        }
        for (String ele : requiresCompatibilities) {
            this.requiresCompatibilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public RegisterTaskDefinitionRequest withRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        setRequiresCompatibilities(requiresCompatibilities);
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * </p>
     * 
     * @param requiresCompatibilities
     *        The launch type required by the task. If no value is specified, it defaults to <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public RegisterTaskDefinitionRequest withRequiresCompatibilities(Compatibility... requiresCompatibilities) {
        com.amazonaws.internal.SdkInternalList<String> requiresCompatibilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                requiresCompatibilities.length);
        for (Compatibility value : requiresCompatibilities) {
            requiresCompatibilitiesCopy.add(value.toString());
        }
        if (getRequiresCompatibilities() == null) {
            setRequiresCompatibilities(requiresCompatibilitiesCopy);
        } else {
            getRequiresCompatibilities().addAll(requiresCompatibilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition. String values are converted to an integer indicating the CPU units when the task definition is
     * registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
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
     *        The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     *        <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in
     *        a task definition. String values are converted to an integer indicating the CPU units when the task
     *        definition is registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
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
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition. String values are converted to an integer indicating the CPU units when the task definition is
     * registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
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
     * @return The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     *         <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in
     *         a task definition. String values are converted to an integer indicating the CPU units when the task
     *         definition is registered.</p> <note>
     *         <p>
     *         Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *         container-level resources for Windows containers.
     *         </p>
     *         </note>
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
     * The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     * <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a task
     * definition. String values are converted to an integer indicating the CPU units when the task definition is
     * registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
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
     *        The number of CPU units used by the task. It can be expressed as an integer using CPU units, for example
     *        <code>1024</code>, or as a string using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in
     *        a task definition. String values are converted to an integer indicating the CPU units when the task
     *        definition is registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
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

    public RegisterTaskDefinitionRequest withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
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
     *        The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     *        <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     *        definition. String values are converted to an integer indicating the MiB when the task definition is
     *        registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
     *        <p>
     *        If using the EC2 launch type, this field is optional.
     *        </p>
     *        <p>
     *        If using the Fargate launch type, this field is required and you must use one of the following values,
     *        which determines your range of supported values for the <code>cpu</code> parameter:
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
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
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
     * @return The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     *         <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     *         definition. String values are converted to an integer indicating the MiB when the task definition is
     *         registered.</p> <note>
     *         <p>
     *         Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *         container-level resources for Windows containers.
     *         </p>
     *         </note>
     *         <p>
     *         If using the EC2 launch type, this field is optional.
     *         </p>
     *         <p>
     *         If using the Fargate launch type, this field is required and you must use one of the following values,
     *         which determines your range of supported values for the <code>cpu</code> parameter:
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
     * The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     * <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying container-level
     * resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use one of the following values, which
     * determines your range of supported values for the <code>cpu</code> parameter:
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
     *        The amount of memory (in MiB) used by the task. It can be expressed as an integer using MiB, for example
     *        <code>1024</code>, or as a string using GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     *        definition. String values are converted to an integer indicating the MiB when the task definition is
     *        registered.</p> <note>
     *        <p>
     *        Task-level CPU and memory parameters are ignored for Windows containers. We recommend specifying
     *        container-level resources for Windows containers.
     *        </p>
     *        </note>
     *        <p>
     *        If using the EC2 launch type, this field is optional.
     *        </p>
     *        <p>
     *        If using the Fargate launch type, this field is required and you must use one of the following values,
     *        which determines your range of supported values for the <code>cpu</code> parameter:
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

    public RegisterTaskDefinitionRequest withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task definition to help you categorize and organize them. Each tag consists of
     * a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata that you apply to the task definition to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *         length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the task definition to help you categorize and organize them. Each tag consists of
     * a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task definition to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
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
     * The metadata that you apply to the task definition to help you categorize and organize them. Each tag consists of
     * a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task definition to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withTags(Tag... tags) {
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
     * The metadata that you apply to the task definition to help you categorize and organize them. Each tag consists of
     * a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task definition to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same IPC resources with the host Amazon EC2
     * instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same IPC resources with the host
     *        Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share the
     *        same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @see PidMode
     */

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same IPC resources with the host Amazon EC2
     * instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @return The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *         <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *         the <code>host</code> PID mode on the same container instance share the same IPC resources with the host
     *         Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     *         the same process namespace. If no value is specified, the default is a private namespace. For more
     *         information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *         settings</a> in the <i>Docker run reference</i>.</p>
     *         <p>
     *         If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *         namespace expose. For more information, see <a
     *         href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *         </p>
     * @see PidMode
     */

    public String getPidMode() {
        return this.pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same IPC resources with the host Amazon EC2
     * instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same IPC resources with the host
     *        Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share the
     *        same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PidMode
     */

    public RegisterTaskDefinitionRequest withPidMode(String pidMode) {
        setPidMode(pidMode);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same IPC resources with the host Amazon EC2
     * instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same IPC resources with the host
     *        Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share the
     *        same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @see PidMode
     */

    public void setPidMode(PidMode pidMode) {
        withPidMode(pidMode);
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same IPC resources with the host Amazon EC2
     * instance. If <code>task</code> is specified, all containers within the specified task share the same process
     * namespace. If no value is specified, the default is a private namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the <i>Docker run
     * reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     * namespace expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. If <code>host</code> is specified, then all containers within the tasks that specified
     *        the <code>host</code> PID mode on the same container instance share the same IPC resources with the host
     *        Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share the
     *        same process namespace. If no value is specified, the default is a private namespace. For more
     *        information, see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID
     *        settings</a> in the <i>Docker run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> PID mode is used, be aware that there is a heightened risk of undesired process
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PidMode
     */

    public RegisterTaskDefinitionRequest withPidMode(PidMode pidMode) {
        this.pidMode = pidMode.toString();
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @see IpcMode
     */

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @return The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *         <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within
     *         the tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *         resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *         specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *         the containers of a task are private and not shared with other containers in a task or on the container
     *         instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *         setting on the container instance. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *         run reference</i>.</p>
     *         <p>
     *         If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *         namespace expose. For more information, see <a
     *         href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *         </p>
     *         <p>
     *         If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *         the task, the following will apply to your IPC resource namespace. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *         Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *         not supported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *         apply to all containers within a task.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *         </p>
     * @see IpcMode
     */

    public String getIpcMode() {
        return this.ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpcMode
     */

    public RegisterTaskDefinitionRequest withIpcMode(String ipcMode) {
        setIpcMode(ipcMode);
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @see IpcMode
     */

    public void setIpcMode(IpcMode ipcMode) {
        withIpcMode(ipcMode);
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the tasks
     * that specified the <code>host</code> IPC mode on the same container instance share the same IPC resources with
     * the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the specified task share
     * the same IPC resources. If <code>none</code> is specified, then IPC resources within the containers of a task are
     * private and not shared with other containers in a task or on the container instance. If no value is specified,
     * then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see <a href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in
     * the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace
     * expose. For more information, see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in the task,
     * the following will apply to your IPC resource namespace. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     * Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are not
     * supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will apply
     * to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>. If <code>host</code> is specified, then all containers within the
     *        tasks that specified the <code>host</code> IPC mode on the same container instance share the same IPC
     *        resources with the host Amazon EC2 instance. If <code>task</code> is specified, all containers within the
     *        specified task share the same IPC resources. If <code>none</code> is specified, then IPC resources within
     *        the containers of a task are private and not shared with other containers in a task or on the container
     *        instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon
     *        setting on the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the <i>Docker
     *        run reference</i>.</p>
     *        <p>
     *        If the <code>host</code> IPC mode is used, be aware that there is a heightened risk of undesired IPC
     *        namespace expose. For more information, see <a
     *        href="https://docs.docker.com/engine/security/security/">Docker security</a>.
     *        </p>
     *        <p>
     *        If you are setting namespaced kernel parameters using <code>systemControls</code> for the containers in
     *        the task, the following will apply to your IPC resource namespace. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html">System
     *        Controls</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For tasks that use the <code>host</code> IPC mode, IPC namespace related <code>systemControls</code> are
     *        not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For tasks that use the <code>task</code> IPC mode, IPC namespace related <code>systemControls</code> will
     *        apply to all containers within a task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpcMode
     */

    public RegisterTaskDefinitionRequest withIpcMode(IpcMode ipcMode) {
        this.ipcMode = ipcMode.toString();
        return this;
    }

    /**
     * @param proxyConfiguration
     */

    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * @return
     */

    public ProxyConfiguration getProxyConfiguration() {
        return this.proxyConfiguration;
    }

    /**
     * @param proxyConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskDefinitionRequest withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: ").append(getTaskRoleArn()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getNetworkMode() != null)
            sb.append("NetworkMode: ").append(getNetworkMode()).append(",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: ").append(getContainerDefinitions()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getRequiresCompatibilities() != null)
            sb.append("RequiresCompatibilities: ").append(getRequiresCompatibilities()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPidMode() != null)
            sb.append("PidMode: ").append(getPidMode()).append(",");
        if (getIpcMode() != null)
            sb.append("IpcMode: ").append(getIpcMode()).append(",");
        if (getProxyConfiguration() != null)
            sb.append("ProxyConfiguration: ").append(getProxyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskDefinitionRequest == false)
            return false;
        RegisterTaskDefinitionRequest other = (RegisterTaskDefinitionRequest) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getNetworkMode() == null ^ this.getNetworkMode() == null)
            return false;
        if (other.getNetworkMode() != null && other.getNetworkMode().equals(this.getNetworkMode()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getRequiresCompatibilities() == null ^ this.getRequiresCompatibilities() == null)
            return false;
        if (other.getRequiresCompatibilities() != null && other.getRequiresCompatibilities().equals(this.getRequiresCompatibilities()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPidMode() == null ^ this.getPidMode() == null)
            return false;
        if (other.getPidMode() != null && other.getPidMode().equals(this.getPidMode()) == false)
            return false;
        if (other.getIpcMode() == null ^ this.getIpcMode() == null)
            return false;
        if (other.getIpcMode() != null && other.getIpcMode().equals(this.getIpcMode()) == false)
            return false;
        if (other.getProxyConfiguration() == null ^ this.getProxyConfiguration() == null)
            return false;
        if (other.getProxyConfiguration() != null && other.getProxyConfiguration().equals(this.getProxyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getRequiresCompatibilities() == null) ? 0 : getRequiresCompatibilities().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPidMode() == null) ? 0 : getPidMode().hashCode());
        hashCode = prime * hashCode + ((getIpcMode() == null) ? 0 : getIpcMode().hashCode());
        hashCode = prime * hashCode + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskDefinitionRequest clone() {
        return (RegisterTaskDefinitionRequest) super.clone();
    }

}
