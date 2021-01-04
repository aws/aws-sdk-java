/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object representing the details of a container that's part of a job.
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
     * The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU requirement
     * for the job using <code>resourceRequirements</code> but the vCPU requirements can't be specified both here and in
     * the <code>resourceRequirement</code> object. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU. This is required but can be specified in several places. It must be
     * specified for each node at least once.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources must
     * specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     * </p>
     * </note>
     */
    private Integer vcpus;
    /**
     * <p>
     * For jobs run on EC2 resources that didn't specify memory requirements using <code>ResourceRequirement</code>, the
     * number of MiB of memory reserved for the job. For other jobs, including all run on Fargate resources, see
     * <code>resourceRequirements</code>.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The command that's passed to the container.
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
     * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution IAM
     * role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private String executionRoleArn;
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
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code> </a>.
     * </p>
     */
    private Boolean readonlyRootFilesystem;
    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code> in the
     * <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     */
    private java.util.List<Ulimit> ulimits;
    /**
     * <p>
     * When this parameter is true, the container is given elevated permissions on the host container instance (similar
     * to the <code>root</code> user). The default value is false.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or specified as
     * false.
     * </p>
     * </note>
     */
    private Boolean privileged;
    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     * The Amazon Resource Name (ARN) of the container instance that the container is running on.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each container
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
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
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
     * The type and amount of resources to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;
    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as details for device mappings.
     * </p>
     */
    private LinuxParameters linuxParameters;
    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--log-driver</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the same
     * logging driver that the Docker daemon uses. However the container might use a different logging driver than the
     * Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance. Or,
     * alternatively, it must be configured on a different log server for remote logging options. For more information
     * on the options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     * documentation.
     * </p>
     * <note>
     * <p>
     * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the Amazon
     * ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     */
    private LogConfiguration logConfiguration;
    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying sensitive
     * data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private java.util.List<Secret> secrets;
    /**
     * <p>
     * The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     */
    private FargatePlatformConfiguration fargatePlatformConfiguration;

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
     * The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU requirement
     * for the job using <code>resourceRequirements</code> but the vCPU requirements can't be specified both here and in
     * the <code>resourceRequirement</code> object. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU. This is required but can be specified in several places. It must be
     * specified for each node at least once.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources must
     * specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     * </p>
     * </note>
     * 
     * @param vcpus
     *        The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU
     *        requirement for the job using <code>resourceRequirements</code> but the vCPU requirements can't be
     *        specified both here and in the <code>resourceRequirement</code> object. This parameter maps to
     *        <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU. This is required
     *        but can be specified in several places. It must be specified for each node at least once.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources
     *        must specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     *        </p>
     */

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    /**
     * <p>
     * The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU requirement
     * for the job using <code>resourceRequirements</code> but the vCPU requirements can't be specified both here and in
     * the <code>resourceRequirement</code> object. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU. This is required but can be specified in several places. It must be
     * specified for each node at least once.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources must
     * specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     * </p>
     * </note>
     * 
     * @return The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU
     *         requirement for the job using <code>resourceRequirements</code> but the vCPU requirements can't be
     *         specified both here and in the <code>resourceRequirement</code> object. This parameter maps to
     *         <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU. This is
     *         required but can be specified in several places. It must be specified for each node at least once.</p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources
     *         must specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     *         </p>
     */

    public Integer getVcpus() {
        return this.vcpus;
    }

    /**
     * <p>
     * The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU requirement
     * for the job using <code>resourceRequirements</code> but the vCPU requirements can't be specified both here and in
     * the <code>resourceRequirement</code> object. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--cpu-shares</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Each vCPU is equivalent to 1,024 CPU
     * shares. You must specify at least one vCPU. This is required but can be specified in several places. It must be
     * specified for each node at least once.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources must
     * specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     * </p>
     * </note>
     * 
     * @param vcpus
     *        The number of vCPUs reserved for the container. Jobs running on EC2 resources can specify the vCPU
     *        requirement for the job using <code>resourceRequirements</code> but the vCPU requirements can't be
     *        specified both here and in the <code>resourceRequirement</code> object. This parameter maps to
     *        <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU. This is required
     *        but can be specified in several places. It must be specified for each node at least once.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources. Jobs running on Fargate resources
     *        must specify the vCPU requirement for the job using <code>resourceRequirements</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withVcpus(Integer vcpus) {
        setVcpus(vcpus);
        return this;
    }

    /**
     * <p>
     * For jobs run on EC2 resources that didn't specify memory requirements using <code>ResourceRequirement</code>, the
     * number of MiB of memory reserved for the job. For other jobs, including all run on Fargate resources, see
     * <code>resourceRequirements</code>.
     * </p>
     * 
     * @param memory
     *        For jobs run on EC2 resources that didn't specify memory requirements using
     *        <code>ResourceRequirement</code>, the number of MiB of memory reserved for the job. For other jobs,
     *        including all run on Fargate resources, see <code>resourceRequirements</code>.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * For jobs run on EC2 resources that didn't specify memory requirements using <code>ResourceRequirement</code>, the
     * number of MiB of memory reserved for the job. For other jobs, including all run on Fargate resources, see
     * <code>resourceRequirements</code>.
     * </p>
     * 
     * @return For jobs run on EC2 resources that didn't specify memory requirements using
     *         <code>ResourceRequirement</code>, the number of MiB of memory reserved for the job. For other jobs,
     *         including all run on Fargate resources, see <code>resourceRequirements</code>.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * For jobs run on EC2 resources that didn't specify memory requirements using <code>ResourceRequirement</code>, the
     * number of MiB of memory reserved for the job. For other jobs, including all run on Fargate resources, see
     * <code>resourceRequirements</code>.
     * </p>
     * 
     * @param memory
     *        For jobs run on EC2 resources that didn't specify memory requirements using
     *        <code>ResourceRequirement</code>, the number of MiB of memory reserved for the job. For other jobs,
     *        including all run on Fargate resources, see <code>resourceRequirements</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The command that's passed to the container.
     * </p>
     * 
     * @return The command that's passed to the container.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command that's passed to the container.
     * </p>
     * 
     * @param command
     *        The command that's passed to the container.
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
     * The command that's passed to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that's passed to the container.
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
     * The command that's passed to the container.
     * </p>
     * 
     * @param command
     *        The command that's passed to the container.
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
     * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution IAM
     * role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see
     *        <a href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution
     *        IAM role</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution IAM
     * role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see
     *         <a href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution
     *         IAM role</a> in the <i>AWS Batch User Guide</i>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution IAM
     * role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the execution role that AWS Batch can assume. For more information, see
     *        <a href="https://docs.aws.amazon.com/batch/latest/userguide/execution-IAM-role.html">AWS Batch execution
     *        IAM role</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
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
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code> </a>.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system. This
     *        parameter maps to <code>ReadonlyRootfs</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code>
     *        option to <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code>
     *        </a>.
     */

    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code> </a>.
     * </p>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system. This
     *         parameter maps to <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--read-only</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     *         <code>docker run</code> </a>.
     */

    public Boolean getReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code> </a>.
     * </p>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system. This
     *        parameter maps to <code>ReadonlyRootfs</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code>
     *        option to <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code>
     *        </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        setReadonlyRootFilesystem(readonlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--read-only</code> option to
     * <a href="https://docs.docker.com/engine/reference/commandline/run/"> <code>docker run</code> </a>.
     * </p>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system. This
     *         parameter maps to <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--read-only</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     *         <code>docker run</code> </a>.
     */

    public Boolean isReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code> in the
     * <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * 
     * @return A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code>
     *         in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a>
     *         section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources.
     *         </p>
     */

    public java.util.List<Ulimit> getUlimits() {
        return ulimits;
    }

    /**
     * <p>
     * A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code> in the
     * <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * 
     * @param ulimits
     *        A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code>
     *        in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources.
     *        </p>
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
     * A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code> in the
     * <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUlimits(java.util.Collection)} or {@link #withUlimits(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code>
     *        in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources.
     *        </p>
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
     * A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code> in the
     * <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * 
     * @param ulimits
     *        A list of <code>ulimit</code> values to set in the container. This parameter maps to <code>Ulimits</code>
     *        in the <a href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withUlimits(java.util.Collection<Ulimit> ulimits) {
        setUlimits(ulimits);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated permissions on the host container instance (similar
     * to the <code>root</code> user). The default value is false.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or specified as
     * false.
     * </p>
     * </note>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated permissions on the host container instance
     *        (similar to the <code>root</code> user). The default value is false.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or
     *        specified as false.
     *        </p>
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated permissions on the host container instance (similar
     * to the <code>root</code> user). The default value is false.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or specified as
     * false.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, the container is given elevated permissions on the host container instance
     *         (similar to the <code>root</code> user). The default value is false.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or
     *         specified as false.
     *         </p>
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated permissions on the host container instance (similar
     * to the <code>root</code> user). The default value is false.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or specified as
     * false.
     * </p>
     * </note>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated permissions on the host container instance
     *        (similar to the <code>root</code> user). The default value is false.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or
     *        specified as false.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated permissions on the host container instance (similar
     * to the <code>root</code> user). The default value is false.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or specified as
     * false.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, the container is given elevated permissions on the host container instance
     *         (similar to the <code>root</code> user). The default value is false.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources and shouldn't be provided, or
     *         specified as false.
     *         </p>
     */

    public Boolean isPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param user
     *        The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param user
     *        The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--user</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     * The Amazon Resource Name (ARN) of the container instance that the container is running on.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance that the container is running on.
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that the container is running on.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instance that the container is running on.
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that the container is running on.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance that the container is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each
     *        container attempt receives a task ARN when they reach the <code>STARTING</code> status.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each
     *         container attempt receives a task ARN when they reach the <code>STARTING</code> status.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each container
     * attempt receives a task ARN when they reach the <code>STARTING</code> status.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the Amazon ECS task that's associated with the container job. Each
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
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources.
     *        </p>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * 
     * @return The instance type of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources.
     *         </p>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the underlying host infrastructure of a multi-node parallel job.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type of the underlying host infrastructure of a multi-node parallel job.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources.
     *        </p>
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
     * The type and amount of resources to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @return The type and amount of resources to assign to a container. The supported resources include
     *         <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of resources to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. The supported resources include
     *        <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
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
     * The type and amount of resources to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. The supported resources include
     *        <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
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
     * The type and amount of resources to assign to a container. The supported resources include <code>GPU</code>,
     * <code>MEMORY</code>, and <code>VCPU</code>.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of resources to assign to a container. The supported resources include
     *        <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
        return this;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as details for device mappings.
     * </p>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as details for device mappings.
     */

    public void setLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as details for device mappings.
     * </p>
     * 
     * @return Linux-specific modifications that are applied to the container, such as details for device mappings.
     */

    public LinuxParameters getLinuxParameters() {
        return this.linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as details for device mappings.
     * </p>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as details for device mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withLinuxParameters(LinuxParameters linuxParameters) {
        setLinuxParameters(linuxParameters);
        return this;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--log-driver</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the same
     * logging driver that the Docker daemon uses. However the container might use a different logging driver than the
     * Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance. Or,
     * alternatively, it must be configured on a different log server for remote logging options. For more information
     * on the options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     * documentation.
     * </p>
     * <note>
     * <p>
     * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the Amazon
     * ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param logConfiguration
     *        The log configuration specification for the container.</p>
     *        <p>
     *        This parameter maps to <code>LogConfig</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. By default, containers use the same logging driver that the Docker daemon uses. However the
     *        container might use a different logging driver than the Docker daemon by specifying a log driver with this
     *        parameter in the container definition. To use a different logging driver for a container, the log system
     *        must be configured properly on the container instance. Or, alternatively, it must be configured on a
     *        different log server for remote logging options. For more information on the options for different
     *        supported log drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure
     *        logging drivers</a> in the Docker documentation.
     *        </p>
     *        <note>
     *        <p>
     *        AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *        <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the
     *        Amazon ECS container agent.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register the logging drivers available
     *        on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *        containers placed on that instance can use these log configuration options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     */

    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--log-driver</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the same
     * logging driver that the Docker daemon uses. However the container might use a different logging driver than the
     * Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance. Or,
     * alternatively, it must be configured on a different log server for remote logging options. For more information
     * on the options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     * documentation.
     * </p>
     * <note>
     * <p>
     * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the Amazon
     * ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The log configuration specification for the container.</p>
     *         <p>
     *         This parameter maps to <code>LogConfig</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *         <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. By default, containers use the same logging driver that the Docker daemon uses. However the
     *         container might use a different logging driver than the Docker daemon by specifying a log driver with
     *         this parameter in the container definition. To use a different logging driver for a container, the log
     *         system must be configured properly on the container instance. Or, alternatively, it must be configured on
     *         a different log server for remote logging options. For more information on the options for different
     *         supported log drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure
     *         logging drivers</a> in the Docker documentation.
     *         </p>
     *         <note>
     *         <p>
     *         AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *         <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the
     *         Amazon ECS container agent.
     *         </p>
     *         </note>
     *         <p>
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log into your container instance and run
     *         the following command: <code>sudo docker version | grep "Server API version"</code>
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon ECS container agent running on a container instance must register the logging drivers
     *         available on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable
     *         before containers placed on that instance can use these log configuration options. For more information,
     *         see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     */

    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--log-driver</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the same
     * logging driver that the Docker daemon uses. However the container might use a different logging driver than the
     * Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance. Or,
     * alternatively, it must be configured on a different log server for remote logging options. For more information
     * on the options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     * documentation.
     * </p>
     * <note>
     * <p>
     * AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the Amazon
     * ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param logConfiguration
     *        The log configuration specification for the container.</p>
     *        <p>
     *        This parameter maps to <code>LogConfig</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the
     *        <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. By default, containers use the same logging driver that the Docker daemon uses. However the
     *        container might use a different logging driver than the Docker daemon by specifying a log driver with this
     *        parameter in the container definition. To use a different logging driver for a container, the log system
     *        must be configured properly on the container instance. Or, alternatively, it must be configured on a
     *        different log server for remote logging options. For more information on the options for different
     *        supported log drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure
     *        logging drivers</a> in the Docker documentation.
     *        </p>
     *        <note>
     *        <p>
     *        AWS Batch currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *        <a>LogConfiguration</a> data type). Additional log drivers might be available in future releases of the
     *        Amazon ECS container agent.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log into your container instance and run
     *        the following command: <code>sudo docker version | grep "Server API version"</code>
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register the logging drivers available
     *        on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *        containers placed on that instance can use these log configuration options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withLogConfiguration(LogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying sensitive
     * data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The secrets to pass to the container. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *         sensitive data</a> in the <i>AWS Batch User Guide</i>.
     */

    public java.util.List<Secret> getSecrets() {
        return secrets;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying sensitive
     * data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *        sensitive data</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setSecrets(java.util.Collection<Secret> secrets) {
        if (secrets == null) {
            this.secrets = null;
            return;
        }

        this.secrets = new java.util.ArrayList<Secret>(secrets);
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying sensitive
     * data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecrets(java.util.Collection)} or {@link #withSecrets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *        sensitive data</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withSecrets(Secret... secrets) {
        if (this.secrets == null) {
            setSecrets(new java.util.ArrayList<Secret>(secrets.length));
        }
        for (Secret ele : secrets) {
            this.secrets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying sensitive
     * data</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html">Specifying
     *        sensitive data</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withSecrets(java.util.Collection<Secret> secrets) {
        setSecrets(secrets);
        return this;
    }

    /**
     * <p>
     * The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not
     *        specify this parameter.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     * 
     * @return The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not
     *         specify this parameter.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not
     *        specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     * 
     * @param fargatePlatformConfiguration
     *        The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not
     *        specify this parameter.
     */

    public void setFargatePlatformConfiguration(FargatePlatformConfiguration fargatePlatformConfiguration) {
        this.fargatePlatformConfiguration = fargatePlatformConfiguration;
    }

    /**
     * <p>
     * The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     * 
     * @return The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not
     *         specify this parameter.
     */

    public FargatePlatformConfiguration getFargatePlatformConfiguration() {
        return this.fargatePlatformConfiguration;
    }

    /**
     * <p>
     * The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify
     * this parameter.
     * </p>
     * 
     * @param fargatePlatformConfiguration
     *        The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not
     *        specify this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetail withFargatePlatformConfiguration(FargatePlatformConfiguration fargatePlatformConfiguration) {
        setFargatePlatformConfiguration(fargatePlatformConfiguration);
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
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
            sb.append("ResourceRequirements: ").append(getResourceRequirements()).append(",");
        if (getLinuxParameters() != null)
            sb.append("LinuxParameters: ").append(getLinuxParameters()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getSecrets() != null)
            sb.append("Secrets: ").append(getSecrets()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getFargatePlatformConfiguration() != null)
            sb.append("FargatePlatformConfiguration: ").append(getFargatePlatformConfiguration());
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
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
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
        if (other.getLinuxParameters() == null ^ this.getLinuxParameters() == null)
            return false;
        if (other.getLinuxParameters() != null && other.getLinuxParameters().equals(this.getLinuxParameters()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getSecrets() == null ^ this.getSecrets() == null)
            return false;
        if (other.getSecrets() != null && other.getSecrets().equals(this.getSecrets()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getFargatePlatformConfiguration() == null ^ this.getFargatePlatformConfiguration() == null)
            return false;
        if (other.getFargatePlatformConfiguration() != null && other.getFargatePlatformConfiguration().equals(this.getFargatePlatformConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
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
        hashCode = prime * hashCode + ((getLinuxParameters() == null) ? 0 : getLinuxParameters().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSecrets() == null) ? 0 : getSecrets().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFargatePlatformConfiguration() == null) ? 0 : getFargatePlatformConfiguration().hashCode());
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
