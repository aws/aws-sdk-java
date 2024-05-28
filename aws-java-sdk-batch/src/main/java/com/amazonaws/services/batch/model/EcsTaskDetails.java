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
 * The details of a task definition that describes the container and volume definitions of an Amazon ECS task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EcsTaskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsTaskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     */
    private java.util.List<TaskContainerDetails> containers;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The amount of ephemeral storage allocated for the task.
     * </p>
     */
    private EphemeralStorage ephemeralStorage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Fargate platform version where the jobs are running.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     */
    private String ipcMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services permissions.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     * The process namespace to use for the containers in the task.
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
     * A list of data volumes used in a job.
     * </p>
     */
    private java.util.List<Volume> volumes;

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * 
     * @return A list of containers that are included in the <code>taskProperties</code> list.
     */

    public java.util.List<TaskContainerDetails> getContainers() {
        return containers;
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * 
     * @param containers
     *        A list of containers that are included in the <code>taskProperties</code> list.
     */

    public void setContainers(java.util.Collection<TaskContainerDetails> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<TaskContainerDetails>(containers);
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        A list of containers that are included in the <code>taskProperties</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withContainers(TaskContainerDetails... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<TaskContainerDetails>(containers.length));
        }
        for (TaskContainerDetails ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * 
     * @param containers
     *        A list of containers that are included in the <code>taskProperties</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withContainers(java.util.Collection<TaskContainerDetails> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance that hosts the task.
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instance that hosts the task.
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the Amazon ECS task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     * 
     * @return The ARN of the Amazon ECS task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the Amazon ECS task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The amount of ephemeral storage allocated for the task.
     * </p>
     * 
     * @param ephemeralStorage
     *        The amount of ephemeral storage allocated for the task.
     */

    public void setEphemeralStorage(EphemeralStorage ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    /**
     * <p>
     * The amount of ephemeral storage allocated for the task.
     * </p>
     * 
     * @return The amount of ephemeral storage allocated for the task.
     */

    public EphemeralStorage getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * <p>
     * The amount of ephemeral storage allocated for the task.
     * </p>
     * 
     * @param ephemeralStorage
     *        The amount of ephemeral storage allocated for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withEphemeralStorage(EphemeralStorage ephemeralStorage) {
        setEphemeralStorage(ephemeralStorage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM
     *        role</a> in the <i>Batch User Guide</i>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM
     *         role</a> in the <i>Batch User Guide</i>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM role</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role that Batch can assume. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">Batch execution IAM
     *        role</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Fargate platform version where the jobs are running.
     * </p>
     * 
     * @param platformVersion
     *        The Fargate platform version where the jobs are running.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The Fargate platform version where the jobs are running.
     * </p>
     * 
     * @return The Fargate platform version where the jobs are running.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The Fargate platform version where the jobs are running.
     * </p>
     * 
     * @param platformVersion
     *        The Fargate platform version where the jobs are running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task.
     */

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     * 
     * @return The IPC resource namespace to use for the containers in the task.
     */

    public String getIpcMode() {
        return this.ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task.
     * </p>
     * 
     * @param ipcMode
     *        The IPC resource namespace to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withIpcMode(String ipcMode) {
        setIpcMode(ipcMode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services permissions.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     *        The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services
     *        permissions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for
     *        tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
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
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services permissions.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This is object is comparable to <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     * >ContainerProperties:jobRoleArn</a>.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services
     *         permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for
     *         tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
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
     * The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services permissions.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     *        The Amazon Resource Name (ARN) of the IAM role that the container can assume for Amazon Web Services
     *        permissions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM roles for
     *        tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p> <note>
     *        <p>
     *        This is object is comparable to <a
     *        href="https://docs.aws.amazon.com/batch/latest/APIReference/API_ContainerProperties.html"
     *        >ContainerProperties:jobRoleArn</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task.
     */

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     * 
     * @return The process namespace to use for the containers in the task.
     */

    public String getPidMode() {
        return this.pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task.
     * </p>
     * 
     * @param pidMode
     *        The process namespace to use for the containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withPidMode(String pidMode) {
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

    public EcsTaskDetails withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
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

    public EcsTaskDetails withRuntimePlatform(RuntimePlatform runtimePlatform) {
        setRuntimePlatform(runtimePlatform);
        return this;
    }

    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     * 
     * @return A list of data volumes used in a job.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * A list of data volumes used in a job.
     * </p>
     * 
     * @param volumes
     *        A list of data volumes used in a job.
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
     * A list of data volumes used in a job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of data volumes used in a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withVolumes(Volume... volumes) {
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
     * A list of data volumes used in a job.
     * </p>
     * 
     * @param volumes
     *        A list of data volumes used in a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskDetails withVolumes(java.util.Collection<Volume> volumes) {
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
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: ").append(getContainerInstanceArn()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
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

        if (obj instanceof EcsTaskDetails == false)
            return false;
        EcsTaskDetails other = (EcsTaskDetails) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
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
        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
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
    public EcsTaskDetails clone() {
        try {
            return (EcsTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EcsTaskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
