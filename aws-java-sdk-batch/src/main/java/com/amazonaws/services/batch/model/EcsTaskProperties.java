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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties for a task definition that describes the container and volume definitions of an Amazon ECS task. You
 * can specify which Docker images to use, the required resources, and other configurations related to launching the
 * task definition through an Amazon ECS service or task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EcsTaskProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsTaskProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This object is a list of containers.
     * </p>
     */
    private java.util.List<TaskContainerProperties> containers;
    /**
     * <p>
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of
     * ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     * </p>
     */
    private EphemeralStorage ephemeralStorage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     * resources, you must provide an execution role. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Fargate platform version where the jobs are running. A platform version is specified only for jobs that are
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This uses a recent, approved version of the Fargate platform for compute resources. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate platform
     * versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> IPC mode
     * on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified <code>task</code> share the same IPC
     * resources.
     * </p>
     * <p>
     * If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are not
     * shared with other containers in a task or on the container instance.
     * </p>
     * <p>
     * If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the
     * container instance. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker run
     * reference.
     * </p>
     */
    private String ipcMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.
     * </p>
     * <note>
     * <p>
     * This is object is comparable to <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     * >ContainerProperties:jobRoleArn</a>.
     * </p>
     * </note>
     */
    private String taskRoleArn;
    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information about
     * other containers running in the same task.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> PID mode
     * on the same container instance share the process namespace with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified task share the same process namespace.
     * </p>
     * <p>
     * If no value is specified, the default is a private namespace for each container. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the Docker run
     * reference.
     * </p>
     */
    private String pidMode;
    /**
     * <p>
     * The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon EC2
     * resources must not specify this parameter.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * An object that represents the compute environment architecture for Batch jobs on Fargate.
     * </p>
     */
    private RuntimePlatform runtimePlatform;
    /**
     * <p>
     * A list of volumes that are associated with the job.
     * </p>
     */
    private java.util.List<Volume> volumes;

    /**
     * <p>
     * This object is a list of containers.
     * </p>
     * 
     * @return This object is a list of containers.
     */

    public java.util.List<TaskContainerProperties> getContainers() {
        return containers;
    }

    /**
     * <p>
     * This object is a list of containers.
     * </p>
     * 
     * @param containers
     *        This object is a list of containers.
     */

    public void setContainers(java.util.Collection<TaskContainerProperties> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<TaskContainerProperties>(containers);
    }

    /**
     * <p>
     * This object is a list of containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        This object is a list of containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withContainers(TaskContainerProperties... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<TaskContainerProperties>(containers.length));
        }
        for (TaskContainerProperties ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This object is a list of containers.
     * </p>
     * 
     * @param containers
     *        This object is a list of containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withContainers(java.util.Collection<TaskContainerProperties> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of
     * ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     * </p>
     * 
     * @param ephemeralStorage
     *        The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total
     *        amount of ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     */

    public void setEphemeralStorage(EphemeralStorage ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    /**
     * <p>
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of
     * ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     * </p>
     * 
     * @return The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total
     *         amount of ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     */

    public EphemeralStorage getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * <p>
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of
     * ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     * </p>
     * 
     * @param ephemeralStorage
     *        The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total
     *        amount of ephemeral storage available, beyond the default amount, for tasks hosted on Fargate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withEphemeralStorage(EphemeralStorage ephemeralStorage) {
        setEphemeralStorage(ephemeralStorage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     * resources, you must provide an execution role. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     *        resources, you must provide an execution role. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM
     *        role</a> in the <i>Batch User Guide</i>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     * resources, you must provide an execution role. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     *         resources, you must provide an execution role. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM
     *         role</a> in the <i>Batch User Guide</i>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     * resources, you must provide an execution role. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role that Batch can assume. For jobs that run on Fargate
     *        resources, you must provide an execution role. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM
     *        role</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Fargate platform version where the jobs are running. A platform version is specified only for jobs that are
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This uses a recent, approved version of the Fargate platform for compute resources. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate platform
     * versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The Fargate platform version where the jobs are running. A platform version is specified only for jobs
     *        that are running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is
     *        used by default. This uses a recent, approved version of the Fargate platform for compute resources. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate platform
     *        versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The Fargate platform version where the jobs are running. A platform version is specified only for jobs that are
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This uses a recent, approved version of the Fargate platform for compute resources. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate platform
     * versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The Fargate platform version where the jobs are running. A platform version is specified only for jobs
     *         that are running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version
     *         is used by default. This uses a recent, approved version of the Fargate platform for compute resources.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate
     *         platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The Fargate platform version where the jobs are running. A platform version is specified only for jobs that are
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This uses a recent, approved version of the Fargate platform for compute resources. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate platform
     * versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The Fargate platform version where the jobs are running. A platform version is specified only for jobs
     *        that are running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is
     *        used by default. This uses a recent, approved version of the Fargate platform for compute resources. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">Fargate platform
     *        versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> IPC mode
     * on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified <code>task</code> share the same IPC
     * resources.
     * </p>
     * <p>
     * If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are not
     * shared with other containers in a task or on the container instance.
     * </p>
     * <p>
     * If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the
     * container instance. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>.</p>
     *        <p>
     *        If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code>
     *        IPC mode on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     *        </p>
     *        <p>
     *        If <code>task</code> is specified, all containers within the specified <code>task</code> share the same
     *        IPC resources.
     *        </p>
     *        <p>
     *        If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are
     *        not shared with other containers in a task or on the container instance.
     *        </p>
     *        <p>
     *        If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on
     *        the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker run
     *        reference.
     */

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> IPC mode
     * on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified <code>task</code> share the same IPC
     * resources.
     * </p>
     * <p>
     * If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are not
     * shared with other containers in a task or on the container instance.
     * </p>
     * <p>
     * If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the
     * container instance. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @return The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *         <code>task</code>, or <code>none</code>.</p>
     *         <p>
     *         If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code>
     *         IPC mode on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     *         </p>
     *         <p>
     *         If <code>task</code> is specified, all containers within the specified <code>task</code> share the same
     *         IPC resources.
     *         </p>
     *         <p>
     *         If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are
     *         not shared with other containers in a task or on the container instance.
     *         </p>
     *         <p>
     *         If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on
     *         the container instance. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker
     *         run reference.
     */

    public String getIpcMode() {
        return this.ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     * <code>task</code>, or <code>none</code>.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> IPC mode
     * on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified <code>task</code> share the same IPC
     * resources.
     * </p>
     * <p>
     * If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are not
     * shared with other containers in a task or on the container instance.
     * </p>
     * <p>
     * If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the
     * container instance. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task. The valid values are <code>host</code>,
     *        <code>task</code>, or <code>none</code>.</p>
     *        <p>
     *        If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code>
     *        IPC mode on the same container instance share the same IPC resources with the host Amazon EC2 instance.
     *        </p>
     *        <p>
     *        If <code>task</code> is specified, all containers within the specified <code>task</code> share the same
     *        IPC resources.
     *        </p>
     *        <p>
     *        If <code>none</code> is specified, the IPC resources within the containers of a task are private, and are
     *        not shared with other containers in a task or on the container instance.
     *        </p>
     *        <p>
     *        If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on
     *        the container instance. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc">IPC settings</a> in the Docker run
     *        reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withIpcMode(String ipcMode) {
        setIpcMode(ipcMode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.
     * </p>
     * <note>
     * <p>
     * This is object is comparable to <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     * >ContainerProperties:jobRoleArn</a>.
     * </p>
     * </note>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.</p> <note>
     *        <p>
     *        This is object is comparable to <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     *        >ContainerProperties:jobRoleArn</a>.
     *        </p>
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.
     * </p>
     * <note>
     * <p>
     * This is object is comparable to <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     * >ContainerProperties:jobRoleArn</a>.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.</p> <note>
     *         <p>
     *         This is object is comparable to <a
     *         href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     *         >ContainerProperties:jobRoleArn</a>.
     *         </p>
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.
     * </p>
     * <note>
     * <p>
     * This is object is comparable to <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     * >ContainerProperties:jobRoleArn</a>.
     * </p>
     * </note>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) that's associated with the Amazon ECS task.</p> <note>
     *        <p>
     *        This is object is comparable to <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     *        >ContainerProperties:jobRoleArn</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information about
     * other containers running in the same task.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> PID mode
     * on the same container instance share the process namespace with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified task share the same process namespace.
     * </p>
     * <p>
     * If no value is specified, the default is a private namespace for each container. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information
     *        about other containers running in the same task.</p>
     *        <p>
     *        If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code>
     *        PID mode on the same container instance share the process namespace with the host Amazon EC2 instance.
     *        </p>
     *        <p>
     *        If <code>task</code> is specified, all containers within the specified task share the same process
     *        namespace.
     *        </p>
     *        <p>
     *        If no value is specified, the default is a private namespace for each container. For more information, see
     *        <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the Docker
     *        run reference.
     */

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information about
     * other containers running in the same task.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> PID mode
     * on the same container instance share the process namespace with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified task share the same process namespace.
     * </p>
     * <p>
     * If no value is specified, the default is a private namespace for each container. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @return The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *         <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information
     *         about other containers running in the same task.</p>
     *         <p>
     *         If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code>
     *         PID mode on the same container instance share the process namespace with the host Amazon EC2 instance.
     *         </p>
     *         <p>
     *         If <code>task</code> is specified, all containers within the specified task share the same process
     *         namespace.
     *         </p>
     *         <p>
     *         If no value is specified, the default is a private namespace for each container. For more information,
     *         see <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the
     *         Docker run reference.
     */

    public String getPidMode() {
        return this.pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     * <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information about
     * other containers running in the same task.
     * </p>
     * <p>
     * If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code> PID mode
     * on the same container instance share the process namespace with the host Amazon EC2 instance.
     * </p>
     * <p>
     * If <code>task</code> is specified, all containers within the specified task share the same process namespace.
     * </p>
     * <p>
     * If no value is specified, the default is a private namespace for each container. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task. The valid values are <code>host</code> or
     *        <code>task</code>. For example, monitoring sidecars might need <code>pidMode</code> to access information
     *        about other containers running in the same task.</p>
     *        <p>
     *        If <code>host</code> is specified, all containers within the tasks that specified the <code>host</code>
     *        PID mode on the same container instance share the process namespace with the host Amazon EC2 instance.
     *        </p>
     *        <p>
     *        If <code>task</code> is specified, all containers within the specified task share the same process
     *        namespace.
     *        </p>
     *        <p>
     *        If no value is specified, the default is a private namespace for each container. For more information, see
     *        <a href="https://docs.docker.com/engine/reference/run/#pid-settings---pid">PID settings</a> in the Docker
     *        run reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withPidMode(String pidMode) {
        setPidMode(pidMode);
        return this;
    }

    /**
     * <p>
     * The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon EC2
     * resources must not specify this parameter.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon
     *        EC2 resources must not specify this parameter.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon EC2
     * resources must not specify this parameter.
     * </p>
     * 
     * @return The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon
     *         EC2 resources must not specify this parameter.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon EC2
     * resources must not specify this parameter.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for jobs that are running on Fargate resources. Jobs that are running on Amazon
     *        EC2 resources must not specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * An object that represents the compute environment architecture for Batch jobs on Fargate.
     * </p>
     * 
     * @param runtimePlatform
     *        An object that represents the compute environment architecture for Batch jobs on Fargate.
     */

    public void setRuntimePlatform(RuntimePlatform runtimePlatform) {
        this.runtimePlatform = runtimePlatform;
    }

    /**
     * <p>
     * An object that represents the compute environment architecture for Batch jobs on Fargate.
     * </p>
     * 
     * @return An object that represents the compute environment architecture for Batch jobs on Fargate.
     */

    public RuntimePlatform getRuntimePlatform() {
        return this.runtimePlatform;
    }

    /**
     * <p>
     * An object that represents the compute environment architecture for Batch jobs on Fargate.
     * </p>
     * 
     * @param runtimePlatform
     *        An object that represents the compute environment architecture for Batch jobs on Fargate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withRuntimePlatform(RuntimePlatform runtimePlatform) {
        setRuntimePlatform(runtimePlatform);
        return this;
    }

    /**
     * <p>
     * A list of volumes that are associated with the job.
     * </p>
     * 
     * @return A list of volumes that are associated with the job.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * A list of volumes that are associated with the job.
     * </p>
     * 
     * @param volumes
     *        A list of volumes that are associated with the job.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * A list of volumes that are associated with the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volumes that are associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volumes that are associated with the job.
     * </p>
     * 
     * @param volumes
     *        A list of volumes that are associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskProperties withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
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
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: ").append(getEphemeralStorage()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getIpcMode() != null)
            sb.append("IpcMode: ").append(getIpcMode()).append(",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: ").append(getTaskRoleArn()).append(",");
        if (getPidMode() != null)
            sb.append("PidMode: ").append(getPidMode()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getRuntimePlatform() != null)
            sb.append("RuntimePlatform: ").append(getRuntimePlatform()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsTaskProperties == false)
            return false;
        EcsTaskProperties other = (EcsTaskProperties) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getEphemeralStorage() == null ^ this.getEphemeralStorage() == null)
            return false;
        if (other.getEphemeralStorage() != null && other.getEphemeralStorage().equals(this.getEphemeralStorage()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getIpcMode() == null ^ this.getIpcMode() == null)
            return false;
        if (other.getIpcMode() != null && other.getIpcMode().equals(this.getIpcMode()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        if (other.getPidMode() == null ^ this.getPidMode() == null)
            return false;
        if (other.getPidMode() != null && other.getPidMode().equals(this.getPidMode()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getRuntimePlatform() == null ^ this.getRuntimePlatform() == null)
            return false;
        if (other.getRuntimePlatform() != null && other.getRuntimePlatform().equals(this.getRuntimePlatform()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getIpcMode() == null) ? 0 : getIpcMode().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPidMode() == null) ? 0 : getPidMode().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRuntimePlatform() == null) ? 0 : getRuntimePlatform().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public EcsTaskProperties clone() {
        try {
            return (EcsTaskProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EcsTaskPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
