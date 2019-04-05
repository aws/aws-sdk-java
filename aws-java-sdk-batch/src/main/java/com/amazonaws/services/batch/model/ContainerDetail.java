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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the details of a container that is part of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ContainerDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image used to start the container.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The number of VCPUs allocated for the job.
     * </p>
     */
    private Integer vcpus;
    /**
     * <p>
     * The number of MiB of memory reserved for the job.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the job upon execution.
     * </p>
     */
    private String jobRoleArn;
    /**
     * <p>
     * A list of volumes associated with the job.
     * </p>
     */
    private java.util.List<Volume> volumes;
    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     */
    private java.util.List<KeyValuePair> environment;
    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     */
    private java.util.List<MountPoint> mountPoints;
    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system.
     * </p>
     */
    private Boolean readonlyRootFilesystem;
    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container.
     * </p>
     */
    private java.util.List<Ulimit> ulimits;
    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user).
     * </p>
     */
    private Boolean privileged;
    /**
     * <p>
     * The user name to use inside the container.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance on which the container is running.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is
     * <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The instance type of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The network interfaces associated with the job.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;
    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * The image used to start the container.
     * </p>
     * 
     * @param image
     *        The image used to start the container.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used to start the container.
     * </p>
     * 
     * @return The image used to start the container.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used to start the container.
     * </p>
     * 
     * @param image
     *        The image used to start the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The number of VCPUs allocated for the job.
     * </p>
     * 
     * @param vcpus
     *        The number of VCPUs allocated for the job.
     */

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    /**
     * <p>
     * The number of VCPUs allocated for the job.
     * </p>
     * 
     * @return The number of VCPUs allocated for the job.
     */

    public Integer getVcpus() {
        return this.vcpus;
    }

    /**
     * <p>
     * The number of VCPUs allocated for the job.
     * </p>
     * 
     * @param vcpus
     *        The number of VCPUs allocated for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withVcpus(Integer vcpus) {
        setVcpus(vcpus);
        return this;
    }

    /**
     * <p>
     * The number of MiB of memory reserved for the job.
     * </p>
     * 
     * @param memory
     *        The number of MiB of memory reserved for the job.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The number of MiB of memory reserved for the job.
     * </p>
     * 
     * @return The number of MiB of memory reserved for the job.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The number of MiB of memory reserved for the job.
     * </p>
     * 
     * @param memory
     *        The number of MiB of memory reserved for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * 
     * @return The command that is passed to the container.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withCommand(String... command) {
        if (this.command == null) {
            setCommand(new java.util.ArrayList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The command that is passed to the container.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the job upon execution.
     * </p>
     * 
     * @param jobRoleArn
     *        The Amazon Resource Name (ARN) associated with the job upon execution.
     */

    public void setJobRoleArn(String jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the job upon execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the job upon execution.
     */

    public String getJobRoleArn() {
        return this.jobRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the job upon execution.
     * </p>
     * 
     * @param jobRoleArn
     *        The Amazon Resource Name (ARN) associated with the job upon execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withJobRoleArn(String jobRoleArn) {
        setJobRoleArn(jobRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of volumes associated with the job.
     * </p>
     * 
     * @return A list of volumes associated with the job.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * A list of volumes associated with the job.
     * </p>
     * 
     * @param volumes
     *        A list of volumes associated with the job.
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
     * A list of volumes associated with the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volumes associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withVolumes(Volume... volumes) {
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
     * A list of volumes associated with the job.
     * </p>
     * 
     * @param volumes
     *        A list of volumes associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @return The environment variables to pass to a container.</p> <note>
     *         <p>
     *         Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *         variables that are set by the AWS Batch service.
     *         </p>
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to pass to a container.</p> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container.</p> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withEnvironment(KeyValuePair... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<KeyValuePair>(environment.length));
        }
        for (KeyValuePair ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container.
     * </p>
     * <note>
     * <p>
     * Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     * variables that are set by the AWS Batch service.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to pass to a container.</p> <note>
     *        <p>
     *        Environment variables must not start with <code>AWS_BATCH</code>; this naming convention is reserved for
     *        variables that are set by the AWS Batch service.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * 
     * @return The mount points for data volumes in your container.
     */

    public java.util.List<MountPoint> getMountPoints() {
        return mountPoints;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.
     */

    public void setMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }

        this.mountPoints = new java.util.ArrayList<MountPoint>(mountPoints);
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountPoints(java.util.Collection)} or {@link #withMountPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withMountPoints(MountPoint... mountPoints) {
        if (this.mountPoints == null) {
            setMountPoints(new java.util.ArrayList<MountPoint>(mountPoints.length));
        }
        for (MountPoint ele : mountPoints) {
            this.mountPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withMountPoints(java.util.Collection<MountPoint> mountPoints) {
        setMountPoints(mountPoints);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system.
     */

    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system.
     * </p>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system.
     */

    public Boolean getReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        setReadonlyRootFilesystem(readonlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system.
     * </p>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system.
     */

    public Boolean isReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container.
     * </p>
     * 
     * @return A list of <code>ulimit</code> values to set in the container.
     */

    public java.util.List<Ulimit> getUlimits() {
        return ulimits;
    }

    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimit</code> values to set in the container.
     */

    public void setUlimits(java.util.Collection<Ulimit> ulimits) {
        if (ulimits == null) {
            this.ulimits = null;
            return;
        }

        this.ulimits = new java.util.ArrayList<Ulimit>(ulimits);
    }

    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUlimits(java.util.Collection)} or {@link #withUlimits(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimit</code> values to set in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withUlimits(Ulimit... ulimits) {
        if (this.ulimits == null) {
            setUlimits(new java.util.ArrayList<Ulimit>(ulimits.length));
        }
        for (Ulimit ele : ulimits) {
            this.ulimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimit</code> values to set in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withUlimits(java.util.Collection<Ulimit> ulimits) {
        setUlimits(ulimits);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user).
     * </p>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the <code>root</code> user).
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user).
     * </p>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the <code>root</code> user).
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user).
     * </p>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the <code>root</code> user).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user).
     * </p>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the <code>root</code> user).
     */

    public Boolean isPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * The user name to use inside the container.
     * </p>
     * 
     * @param user
     *        The user name to use inside the container.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user name to use inside the container.
     * </p>
     * 
     * @return The user name to use inside the container.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user name to use inside the container.
     * </p>
     * 
     * @param user
     *        The user name to use inside the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     * 
     * @param exitCode
     *        The exit code to return upon completion.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     * 
     * @return The exit code to return upon completion.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     * 
     * @param exitCode
     *        The exit code to return upon completion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional details about a running or
     *        stopped container.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @return A short (255 max characters) human-readable string to provide additional details about a running or
     *         stopped container.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional details about a running or
     *        stopped container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance on which the container is running.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance on which the container is running.
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance on which the container is running.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instance on which the container is running.
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance on which the container is running.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance on which the container is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each
     *        container attempt receives a task ARN when they reach the <code>STARTING</code> status.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each
     *         container attempt receives a task ARN when they reach the <code>STARTING</code> status.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each
     *        container attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is
     * <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @param logStreamName
     *        The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs
     *        is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     *        <code>RUNNING</code> status.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is
     * <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @return The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch
     *         jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach
     *         the <code>RUNNING</code> status.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is
     * <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @param logStreamName
     *        The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs
     *        is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     *        <code>RUNNING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The instance type of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the underlying host infrastructure of a multi-node parallel job.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * 
     * @return The instance type of the underlying host infrastructure of a multi-node parallel job.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the underlying host infrastructure of a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The network interfaces associated with the job.
     * </p>
     * 
     * @return The network interfaces associated with the job.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces associated with the job.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces associated with the job.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces associated with the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces associated with the job.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * 
     * @return The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *         <code>GPU</code>.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *        <code>GPU</code>.
     */

    public void setResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<ResourceRequirement>(resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *        <code>GPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new java.util.ArrayList<ResourceRequirement>(resourceRequirements.length));
        }
        for (ResourceRequirement ele : resourceRequirements) {
            this.resourceRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. Currently, the only supported resource is
     * <code>GPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. Currently, the only supported resource is
     *        <code>GPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getVcpus() != null)
            sb.append("Vcpus: ").append(getVcpus()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getJobRoleArn() != null)
            sb.append("JobRoleArn: ").append(getJobRoleArn()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getMountPoints() != null)
            sb.append("MountPoints: ").append(getMountPoints()).append(",");
        if (getReadonlyRootFilesystem() != null)
            sb.append("ReadonlyRootFilesystem: ").append(getReadonlyRootFilesystem()).append(",");
        if (getUlimits() != null)
            sb.append("Ulimits: ").append(getUlimits()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getExitCode() != null)
            sb.append("ExitCode: ").append(getExitCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: ").append(getContainerInstanceArn()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getResourceRequirements() != null)
            sb.append("ResourceRequirements: ").append(getResourceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDetail == false)
            return false;
        ContainerDetail other = (ContainerDetail) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getVcpus() == null ^ this.getVcpus() == null)
            return false;
        if (other.getVcpus() != null && other.getVcpus().equals(this.getVcpus()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getJobRoleArn() == null ^ this.getJobRoleArn() == null)
            return false;
        if (other.getJobRoleArn() != null && other.getJobRoleArn().equals(this.getJobRoleArn()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getMountPoints() == null ^ this.getMountPoints() == null)
            return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false)
            return false;
        if (other.getReadonlyRootFilesystem() == null ^ this.getReadonlyRootFilesystem() == null)
            return false;
        if (other.getReadonlyRootFilesystem() != null && other.getReadonlyRootFilesystem().equals(this.getReadonlyRootFilesystem()) == false)
            return false;
        if (other.getUlimits() == null ^ this.getUlimits() == null)
            return false;
        if (other.getUlimits() != null && other.getUlimits().equals(this.getUlimits()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getVcpus() == null) ? 0 : getVcpus().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getJobRoleArn() == null) ? 0 : getJobRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode());
        hashCode = prime * hashCode + ((getReadonlyRootFilesystem() == null) ? 0 : getReadonlyRootFilesystem().hashCode());
        hashCode = prime * hashCode + ((getUlimits() == null) ? 0 : getUlimits().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDetail clone() {
        try {
            return (ContainerDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ContainerDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
