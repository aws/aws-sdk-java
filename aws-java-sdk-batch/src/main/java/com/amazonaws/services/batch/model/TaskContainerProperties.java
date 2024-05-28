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
 * Container properties are used for Amazon ECS-based job definitions. These properties to describe the container that's
 * launched as part of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TaskContainerProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskContainerProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * A list of containers that this container depends on.
     * </p>
     */
    private java.util.List<TaskContainerDependency> dependsOn;
    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to Env inthe <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> parameter to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We don't recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     */
    private java.util.List<KeyValuePair> environment;
    /**
     * <p>
     * If the essential parameter of a container is marked as <code>true</code>, and that container fails or stops for
     * any reason, all other containers that are part of the task are stopped. If the <code>essential</code> parameter
     * of a container is marked as false, its failure doesn't affect the rest of the containers in a task. If this
     * parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All jobs must have at least one essential container. If you have an application that's composed of multiple
     * containers, group containers that are used for a common purpose into components, and separate the different
     * components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Boolean essential;
    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. By default, images in
     * the Docker Hub registry are available. Other repositories are specified with either
     * <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters (uppercase
     * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed.
     * This parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * the <a href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     * </p>
     */
    private String image;
    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html">KernelCapabilities
     * </a>.
     * </p>
     */
    private LinuxParameters linuxParameters;
    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * By default, containers use the same logging driver that the Docker daemon uses. However the container can use a
     * different logging driver than the Docker daemon by specifying a log driver with this parameter in the container
     * definition. To use a different logging driver for a container, the log system must be configured properly on the
     * container instance (or on a different log server for remote logging options). For more information about the
     * options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the <i>Docker
     * documentation</i>.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases of the
     * Amazon ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS container
     * agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     */
    private LogConfiguration logConfiguration;
    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a href="">--volume</a> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers can't mount directories on a different drive, and mount point can't be across drives.
     * </p>
     */
    private java.util.List<MountPoint> mountPoints;
    /**
     * <p>
     * The name of a container. The name can be used as a unique identifier to target your <code>dependsOn</code> and
     * <code>Overrides</code> objects.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on Fargate.
     * </p>
     * </note>
     */
    private Boolean privileged;
    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--read-only</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private Boolean readonlyRootFilesystem;
    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     */
    private RepositoryCredentials repositoryCredentials;
    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;
    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     */
    private java.util.List<Secret> secrets;
    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a task
     * definition, it overrides the default values set by Docker. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with the
     * exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code> resource limit
     * sets a restriction on the number of open files that a container can use. The default <code>nofile</code> soft
     * limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     * </p>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private java.util.List<Ulimit> ulimits;
    /**
     * <p>
     * The user to use inside the container. This parameter maps to User in the Create a container section of the Docker
     * Remote API and the --user option to docker run.
     * </p>
     * <note>
     * <p>
     * When running tasks using the <code>host</code> network mode, don't run containers using the
     * <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     * </p>
     * </note>
     * <p>
     * You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must specify
     * it as a positive integer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:group</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:gid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:gi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:group</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private String user;

    /**
     * <p>
     * The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * </p>
     * 
     * @return The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *         parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more
     *         information, see <a href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference:
     *         CMD</a>.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * </p>
     * 
     * @param command
     *        The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information,
     *        see <a href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
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
     * The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information,
     *        see <a href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withCommand(String... command) {
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
     * The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code> parameter to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * </p>
     * 
     * @param command
     *        The command that's passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>COMMAND</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information,
     *        see <a href="https://docs.docker.com/engine/reference/builder/#cmd">Dockerfile reference: CMD</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * A list of containers that this container depends on.
     * </p>
     * 
     * @return A list of containers that this container depends on.
     */

    public java.util.List<TaskContainerDependency> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * A list of containers that this container depends on.
     * </p>
     * 
     * @param dependsOn
     *        A list of containers that this container depends on.
     */

    public void setDependsOn(java.util.Collection<TaskContainerDependency> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<TaskContainerDependency>(dependsOn);
    }

    /**
     * <p>
     * A list of containers that this container depends on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        A list of containers that this container depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withDependsOn(TaskContainerDependency... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<TaskContainerDependency>(dependsOn.length));
        }
        for (TaskContainerDependency ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of containers that this container depends on.
     * </p>
     * 
     * @param dependsOn
     *        A list of containers that this container depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withDependsOn(java.util.Collection<TaskContainerDependency> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to Env inthe <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> parameter to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We don't recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @return The environment variables to pass to a container. This parameter maps to Env inthe <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *         parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. </p> <important>
     *         <p>
     *         We don't recommend using plaintext environment variables for sensitive information, such as credential
     *         data.
     *         </p>
     *         </important> <note>
     *         <p>
     *         Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *         variables that Batch sets.
     *         </p>
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to Env inthe <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> parameter to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We don't recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to Env inthe <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. </p> <important>
     *        <p>
     *        We don't recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *        variables that Batch sets.
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
     * The environment variables to pass to a container. This parameter maps to Env inthe <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> parameter to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We don't recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to Env inthe <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. </p> <important>
     *        <p>
     *        We don't recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withEnvironment(KeyValuePair... environment) {
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
     * The environment variables to pass to a container. This parameter maps to Env inthe <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code> parameter to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We don't recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important> <note>
     * <p>
     * Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for variables
     * that Batch sets.
     * </p>
     * </note>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to Env inthe <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--env</code>
     *        parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. </p> <important>
     *        <p>
     *        We don't recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Environment variables cannot start with <code>AWS_BATCH</code>. This naming convention is reserved for
     *        variables that Batch sets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * If the essential parameter of a container is marked as <code>true</code>, and that container fails or stops for
     * any reason, all other containers that are part of the task are stopped. If the <code>essential</code> parameter
     * of a container is marked as false, its failure doesn't affect the rest of the containers in a task. If this
     * parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All jobs must have at least one essential container. If you have an application that's composed of multiple
     * containers, group containers that are used for a common purpose into components, and separate the different
     * components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param essential
     *        If the essential parameter of a container is marked as <code>true</code>, and that container fails or
     *        stops for any reason, all other containers that are part of the task are stopped. If the
     *        <code>essential</code> parameter of a container is marked as false, its failure doesn't affect the rest of
     *        the containers in a task. If this parameter is omitted, a container is assumed to be essential.</p>
     *        <p>
     *        All jobs must have at least one essential container. If you have an application that's composed of
     *        multiple containers, group containers that are used for a common purpose into components, and separate the
     *        different components into multiple task definitions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *        >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    /**
     * <p>
     * If the essential parameter of a container is marked as <code>true</code>, and that container fails or stops for
     * any reason, all other containers that are part of the task are stopped. If the <code>essential</code> parameter
     * of a container is marked as false, its failure doesn't affect the rest of the containers in a task. If this
     * parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All jobs must have at least one essential container. If you have an application that's composed of multiple
     * containers, group containers that are used for a common purpose into components, and separate the different
     * components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return If the essential parameter of a container is marked as <code>true</code>, and that container fails or
     *         stops for any reason, all other containers that are part of the task are stopped. If the
     *         <code>essential</code> parameter of a container is marked as false, its failure doesn't affect the rest
     *         of the containers in a task. If this parameter is omitted, a container is assumed to be essential.</p>
     *         <p>
     *         All jobs must have at least one essential container. If you have an application that's composed of
     *         multiple containers, group containers that are used for a common purpose into components, and separate
     *         the different components into multiple task definitions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *         >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean getEssential() {
        return this.essential;
    }

    /**
     * <p>
     * If the essential parameter of a container is marked as <code>true</code>, and that container fails or stops for
     * any reason, all other containers that are part of the task are stopped. If the <code>essential</code> parameter
     * of a container is marked as false, its failure doesn't affect the rest of the containers in a task. If this
     * parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All jobs must have at least one essential container. If you have an application that's composed of multiple
     * containers, group containers that are used for a common purpose into components, and separate the different
     * components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param essential
     *        If the essential parameter of a container is marked as <code>true</code>, and that container fails or
     *        stops for any reason, all other containers that are part of the task are stopped. If the
     *        <code>essential</code> parameter of a container is marked as false, its failure doesn't affect the rest of
     *        the containers in a task. If this parameter is omitted, a container is assumed to be essential.</p>
     *        <p>
     *        All jobs must have at least one essential container. If you have an application that's composed of
     *        multiple containers, group containers that are used for a common purpose into components, and separate the
     *        different components into multiple task definitions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *        >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withEssential(Boolean essential) {
        setEssential(essential);
        return this;
    }

    /**
     * <p>
     * If the essential parameter of a container is marked as <code>true</code>, and that container fails or stops for
     * any reason, all other containers that are part of the task are stopped. If the <code>essential</code> parameter
     * of a container is marked as false, its failure doesn't affect the rest of the containers in a task. If this
     * parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All jobs must have at least one essential container. If you have an application that's composed of multiple
     * containers, group containers that are used for a common purpose into components, and separate the different
     * components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return If the essential parameter of a container is marked as <code>true</code>, and that container fails or
     *         stops for any reason, all other containers that are part of the task are stopped. If the
     *         <code>essential</code> parameter of a container is marked as false, its failure doesn't affect the rest
     *         of the containers in a task. If this parameter is omitted, a container is assumed to be essential.</p>
     *         <p>
     *         All jobs must have at least one essential container. If you have an application that's composed of
     *         multiple containers, group containers that are used for a common purpose into components, and separate
     *         the different components into multiple task definitions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *         >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean isEssential() {
        return this.essential;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. By default, images in
     * the Docker Hub registry are available. Other repositories are specified with either
     * <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters (uppercase
     * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed.
     * This parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * the <a href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     * </p>
     * 
     * @param image
     *        The image used to start a container. This string is passed directly to the Docker daemon. By default,
     *        images in the Docker Hub registry are available. Other repositories are specified with either
     *        <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters
     *        (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number
     *        signs are allowed. This parameter maps to <code>Image</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>IMAGE</code> parameter of the <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. By default, images in
     * the Docker Hub registry are available. Other repositories are specified with either
     * <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters (uppercase
     * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed.
     * This parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * the <a href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     * </p>
     * 
     * @return The image used to start a container. This string is passed directly to the Docker daemon. By default,
     *         images in the Docker Hub registry are available. Other repositories are specified with either
     *         <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters
     *         (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number
     *         signs are allowed. This parameter maps to <code>Image</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>IMAGE</code> parameter of the <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. By default, images in
     * the Docker Hub registry are available. Other repositories are specified with either
     * <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters (uppercase
     * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed.
     * This parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * the <a href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     * </p>
     * 
     * @param image
     *        The image used to start a container. This string is passed directly to the Docker daemon. By default,
     *        images in the Docker Hub registry are available. Other repositories are specified with either
     *        <code>repository-url/image:tag</code> or <code>repository-url/image@digest</code>. Up to 255 letters
     *        (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number
     *        signs are allowed. This parameter maps to <code>Image</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>IMAGE</code> parameter of the <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration"> <i>docker run</i> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html">KernelCapabilities
     * </a>.
     * </p>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html"
     *        >KernelCapabilities</a>.
     */

    public void setLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html">KernelCapabilities
     * </a>.
     * </p>
     * 
     * @return Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html"
     *         >KernelCapabilities</a>.
     */

    public LinuxParameters getLinuxParameters() {
        return this.linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html">KernelCapabilities
     * </a>.
     * </p>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as Linux kernel capabilities. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html"
     *        >KernelCapabilities</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withLinuxParameters(LinuxParameters linuxParameters) {
        setLinuxParameters(linuxParameters);
        return this;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * By default, containers use the same logging driver that the Docker daemon uses. However the container can use a
     * different logging driver than the Docker daemon by specifying a log driver with this parameter in the container
     * definition. To use a different logging driver for a container, the log system must be configured properly on the
     * container instance (or on a different log server for remote logging options). For more information about the
     * options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the <i>Docker
     * documentation</i>.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases of the
     * Amazon ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS container
     * agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param logConfiguration
     *        The log configuration specification for the container.</p>
     *        <p>
     *        This parameter maps to <code>LogConfig</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--log-driver</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *        </p>
     *        <p>
     *        By default, containers use the same logging driver that the Docker daemon uses. However the container can
     *        use a different logging driver than the Docker daemon by specifying a log driver with this parameter in
     *        the container definition. To use a different logging driver for a container, the log system must be
     *        configured properly on the container instance (or on a different log server for remote logging options).
     *        For more information about the options for different supported log drivers, see <a
     *        href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the
     *        <i>Docker documentation</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *        <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases of
     *        the Amazon ECS container agent.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register the logging drivers available
     *        on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *        containers placed on that instance can use these log configuration options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        container agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * By default, containers use the same logging driver that the Docker daemon uses. However the container can use a
     * different logging driver than the Docker daemon by specifying a log driver with this parameter in the container
     * definition. To use a different logging driver for a container, the log system must be configured properly on the
     * container instance (or on a different log server for remote logging options). For more information about the
     * options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the <i>Docker
     * documentation</i>.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases of the
     * Amazon ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS container
     * agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The log configuration specification for the container.</p>
     *         <p>
     *         This parameter maps to <code>LogConfig</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--log-driver</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *         </p>
     *         <p>
     *         By default, containers use the same logging driver that the Docker daemon uses. However the container can
     *         use a different logging driver than the Docker daemon by specifying a log driver with this parameter in
     *         the container definition. To use a different logging driver for a container, the log system must be
     *         configured properly on the container instance (or on a different log server for remote logging options).
     *         For more information about the options for different supported log drivers, see <a
     *         href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the
     *         <i>Docker documentation</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in
     *         the <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases
     *         of the Amazon ECS container agent.
     *         </p>
     *         </note>
     *         <p>
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log in to your container instance and run
     *         the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon ECS container agent running on a container instance must register the logging drivers
     *         available on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable
     *         before containers placed on that instance can use these log configuration options. For more information,
     *         see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon
     *         ECS container agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * By default, containers use the same logging driver that the Docker daemon uses. However the container can use a
     * different logging driver than the Docker daemon by specifying a log driver with this parameter in the container
     * definition. To use a different logging driver for a container, the log system must be configured properly on the
     * container instance (or on a different log server for remote logging options). For more information about the
     * options for different supported log drivers, see <a
     * href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the <i>Docker
     * documentation</i>.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases of the
     * Amazon ECS container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register the logging drivers available on
     * that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before containers placed
     * on that instance can use these log configuration options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS container
     * agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param logConfiguration
     *        The log configuration specification for the container.</p>
     *        <p>
     *        This parameter maps to <code>LogConfig</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--log-driver</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *        </p>
     *        <p>
     *        By default, containers use the same logging driver that the Docker daemon uses. However the container can
     *        use a different logging driver than the Docker daemon by specifying a log driver with this parameter in
     *        the container definition. To use a different logging driver for a container, the log system must be
     *        configured properly on the container instance (or on a different log server for remote logging options).
     *        For more information about the options for different supported log drivers, see <a
     *        href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers </a> in the
     *        <i>Docker documentation</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *        <code>LogConfiguration</code> data type). Additional log drivers may be available in future releases of
     *        the Amazon ECS container agent.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register the logging drivers available
     *        on that instance with the <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *        containers placed on that instance can use these log configuration options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        container agent configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withLogConfiguration(LogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a href="">--volume</a> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers can't mount directories on a different drive, and mount point can't be across drives.
     * </p>
     * 
     * @return The mount points for data volumes in your container.</p>
     *         <p>
     *         This parameter maps to <code>Volumes</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a
     *         href="">--volume</a> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *         </p>
     *         <p>
     *         Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>.
     *         Windows containers can't mount directories on a different drive, and mount point can't be across drives.
     */

    public java.util.List<MountPoint> getMountPoints() {
        return mountPoints;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a href="">--volume</a> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers can't mount directories on a different drive, and mount point can't be across drives.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.</p>
     *        <p>
     *        This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a
     *        href="">--volume</a> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *        </p>
     *        <p>
     *        Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     *        containers can't mount directories on a different drive, and mount point can't be across drives.
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
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a href="">--volume</a> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers can't mount directories on a different drive, and mount point can't be across drives.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMountPoints(java.util.Collection)} or {@link #withMountPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.</p>
     *        <p>
     *        This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a
     *        href="">--volume</a> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *        </p>
     *        <p>
     *        Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     *        containers can't mount directories on a different drive, and mount point can't be across drives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withMountPoints(MountPoint... mountPoints) {
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
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a href="">--volume</a> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers can't mount directories on a different drive, and mount point can't be across drives.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.</p>
     *        <p>
     *        This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <a
     *        href="">--volume</a> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     *        </p>
     *        <p>
     *        Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     *        containers can't mount directories on a different drive, and mount point can't be across drives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withMountPoints(java.util.Collection<MountPoint> mountPoints) {
        setMountPoints(mountPoints);
        return this;
    }

    /**
     * <p>
     * The name of a container. The name can be used as a unique identifier to target your <code>dependsOn</code> and
     * <code>Overrides</code> objects.
     * </p>
     * 
     * @param name
     *        The name of a container. The name can be used as a unique identifier to target your <code>dependsOn</code>
     *        and <code>Overrides</code> objects.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a container. The name can be used as a unique identifier to target your <code>dependsOn</code> and
     * <code>Overrides</code> objects.
     * </p>
     * 
     * @return The name of a container. The name can be used as a unique identifier to target your
     *         <code>dependsOn</code> and <code>Overrides</code> objects.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a container. The name can be used as a unique identifier to target your <code>dependsOn</code> and
     * <code>Overrides</code> objects.
     * </p>
     * 
     * @param name
     *        The name of a container. The name can be used as a unique identifier to target your <code>dependsOn</code>
     *        and <code>Overrides</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on Fargate.
     * </p>
     * </note>
     * 
     * @param privileged
     *        When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     *        instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--privileged</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on Fargate.
     *        </p>
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on Fargate.
     * </p>
     * </note>
     * 
     * @return When this parameter is <code>true</code>, the container is given elevated privileges on the host
     *         container instance (similar to the <code>root</code> user). This parameter maps to
     *         <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--privileged</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks run on Fargate.
     *         </p>
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on Fargate.
     * </p>
     * </note>
     * 
     * @param privileged
     *        When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     *        instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--privileged</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks run on Fargate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated privileges on the host container
     * instance (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks run on Fargate.
     * </p>
     * </note>
     * 
     * @return When this parameter is <code>true</code>, the container is given elevated privileges on the host
     *         container instance (similar to the <code>root</code> user). This parameter maps to
     *         <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--privileged</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks run on Fargate.
     *         </p>
     */

    public Boolean isPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--read-only</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system. This
     *        parameter maps to <code>ReadonlyRootfs</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--read-only</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--read-only</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system. This
     *         parameter maps to <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--read-only</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public Boolean getReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--read-only</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param readonlyRootFilesystem
     *        When this parameter is true, the container is given read-only access to its root file system. This
     *        parameter maps to <code>ReadonlyRootfs</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--read-only</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        setReadonlyRootFilesystem(readonlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--read-only</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, the container is given read-only access to its root file system. This
     *         parameter maps to <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--read-only</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public Boolean isReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     * 
     * @param repositoryCredentials
     *        The private repository authentication credentials to use.
     */

    public void setRepositoryCredentials(RepositoryCredentials repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
    }

    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     * 
     * @return The private repository authentication credentials to use.
     */

    public RepositoryCredentials getRepositoryCredentials() {
        return this.repositoryCredentials;
    }

    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     * 
     * @param repositoryCredentials
     *        The private repository authentication credentials to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withRepositoryCredentials(RepositoryCredentials repositoryCredentials) {
        setRepositoryCredentials(repositoryCredentials);
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * 
     * @return The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     */

    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. The only supported resource is a GPU.
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
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequirements(java.util.Collection)} or {@link #withResourceRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withResourceRequirements(ResourceRequirement... resourceRequirements) {
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
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     * 
     * @param resourceRequirements
     *        The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @return The secrets to pass to the container. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *         >Specifying Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     */

    public java.util.List<Secret> getSecrets() {
        return secrets;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *        >Specifying Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
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
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecrets(java.util.Collection)} or {@link #withSecrets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *        >Specifying Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withSecrets(Secret... secrets) {
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
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *        >Specifying Sensitive Data</a> in the Amazon Elastic Container Service Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withSecrets(java.util.Collection<Secret> secrets) {
        setSecrets(secrets);
        return this;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a task
     * definition, it overrides the default values set by Docker. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with the
     * exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code> resource limit
     * sets a restriction on the number of open files that a container can use. The default <code>nofile</code> soft
     * limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     * </p>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a
     *         task definition, it overrides the default values set by Docker. This parameter maps to
     *         <code>Ulimits</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--ulimit</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p>
     *         <p>
     *         Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with
     *         the exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code>
     *         resource limit sets a restriction on the number of open files that a container can use. The default
     *         <code>nofile</code> soft limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     *         </p>
     *         <p>
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log in to your container instance and run
     *         the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public java.util.List<Ulimit> getUlimits() {
        return ulimits;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a task
     * definition, it overrides the default values set by Docker. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with the
     * exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code> resource limit
     * sets a restriction on the number of open files that a container can use. The default <code>nofile</code> soft
     * limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     * </p>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a
     *        task definition, it overrides the default values set by Docker. This parameter maps to
     *        <code>Ulimits</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p>
     *        <p>
     *        Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with
     *        the exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code>
     *        resource limit sets a restriction on the number of open files that a container can use. The default
     *        <code>nofile</code> soft limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     *        </p>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
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
     * A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a task
     * definition, it overrides the default values set by Docker. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with the
     * exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code> resource limit
     * sets a restriction on the number of open files that a container can use. The default <code>nofile</code> soft
     * limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     * </p>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUlimits(java.util.Collection)} or {@link #withUlimits(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a
     *        task definition, it overrides the default values set by Docker. This parameter maps to
     *        <code>Ulimits</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p>
     *        <p>
     *        Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with
     *        the exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code>
     *        resource limit sets a restriction on the number of open files that a container can use. The default
     *        <code>nofile</code> soft limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     *        </p>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withUlimits(Ulimit... ulimits) {
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
     * A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a task
     * definition, it overrides the default values set by Docker. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.
     * </p>
     * <p>
     * Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with the
     * exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code> resource limit
     * sets a restriction on the number of open files that a container can use. The default <code>nofile</code> soft
     * limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     * </p>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. If a <code>ulimit</code> value is specified in a
     *        task definition, it overrides the default values set by Docker. This parameter maps to
     *        <code>Ulimits</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a
     *        href="https://docs.docker.com/engine/reference/run/#security-configuration">docker run</a>.</p>
     *        <p>
     *        Amazon ECS tasks hosted on Fargate use the default resource limit values set by the operating system with
     *        the exception of the nofile resource limit parameter which Fargate overrides. The <code>nofile</code>
     *        resource limit sets a restriction on the number of open files that a container can use. The default
     *        <code>nofile</code> soft limit is <code>1024</code> and the default hard limit is <code>65535</code>.
     *        </p>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: sudo docker version <code>--format '{{.Server.APIVersion}}'</code>
     *        </p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withUlimits(java.util.Collection<Ulimit> ulimits) {
        setUlimits(ulimits);
        return this;
    }

    /**
     * <p>
     * The user to use inside the container. This parameter maps to User in the Create a container section of the Docker
     * Remote API and the --user option to docker run.
     * </p>
     * <note>
     * <p>
     * When running tasks using the <code>host</code> network mode, don't run containers using the
     * <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     * </p>
     * </note>
     * <p>
     * You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must specify
     * it as a positive integer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:group</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:gid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:gi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:group</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param user
     *        The user to use inside the container. This parameter maps to User in the Create a container section of the
     *        Docker Remote API and the --user option to docker run.</p> <note>
     *        <p>
     *        When running tasks using the <code>host</code> network mode, don't run containers using the
     *        <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must
     *        specify it as a positive integer.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>user</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>user:group</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>uid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>uid:gid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>user:gi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>uid:group</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user to use inside the container. This parameter maps to User in the Create a container section of the Docker
     * Remote API and the --user option to docker run.
     * </p>
     * <note>
     * <p>
     * When running tasks using the <code>host</code> network mode, don't run containers using the
     * <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     * </p>
     * </note>
     * <p>
     * You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must specify
     * it as a positive integer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:group</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:gid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:gi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:group</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return The user to use inside the container. This parameter maps to User in the Create a container section of
     *         the Docker Remote API and the --user option to docker run.</p> <note>
     *         <p>
     *         When running tasks using the <code>host</code> network mode, don't run containers using the
     *         <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must
     *         specify it as a positive integer.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>user</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>user:group</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>uid</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>uid:gid</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>user:gi</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>uid:group</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user to use inside the container. This parameter maps to User in the Create a container section of the Docker
     * Remote API and the --user option to docker run.
     * </p>
     * <note>
     * <p>
     * When running tasks using the <code>host</code> network mode, don't run containers using the
     * <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     * </p>
     * </note>
     * <p>
     * You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must specify
     * it as a positive integer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:group</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:gid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>user:gi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uid:group</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param user
     *        The user to use inside the container. This parameter maps to User in the Create a container section of the
     *        Docker Remote API and the --user option to docker run.</p> <note>
     *        <p>
     *        When running tasks using the <code>host</code> network mode, don't run containers using the
     *        <code>root user (UID 0)</code>. We recommend using a non-root user for better security.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the <code>user</code> using the following formats. If specifying a UID or GID, you must
     *        specify it as a positive integer.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>user</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>user:group</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>uid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>uid:gid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>user:gi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>uid:group</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerProperties withUser(String user) {
        setUser(user);
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
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getEssential() != null)
            sb.append("Essential: ").append(getEssential()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getLinuxParameters() != null)
            sb.append("LinuxParameters: ").append(getLinuxParameters()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getMountPoints() != null)
            sb.append("MountPoints: ").append(getMountPoints()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged()).append(",");
        if (getReadonlyRootFilesystem() != null)
            sb.append("ReadonlyRootFilesystem: ").append(getReadonlyRootFilesystem()).append(",");
        if (getRepositoryCredentials() != null)
            sb.append("RepositoryCredentials: ").append(getRepositoryCredentials()).append(",");
        if (getResourceRequirements() != null)
            sb.append("ResourceRequirements: ").append(getResourceRequirements()).append(",");
        if (getSecrets() != null)
            sb.append("Secrets: ").append(getSecrets()).append(",");
        if (getUlimits() != null)
            sb.append("Ulimits: ").append(getUlimits()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskContainerProperties == false)
            return false;
        TaskContainerProperties other = (TaskContainerProperties) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getEssential() == null ^ this.getEssential() == null)
            return false;
        if (other.getEssential() != null && other.getEssential().equals(this.getEssential()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getLinuxParameters() == null ^ this.getLinuxParameters() == null)
            return false;
        if (other.getLinuxParameters() != null && other.getLinuxParameters().equals(this.getLinuxParameters()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getMountPoints() == null ^ this.getMountPoints() == null)
            return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        if (other.getReadonlyRootFilesystem() == null ^ this.getReadonlyRootFilesystem() == null)
            return false;
        if (other.getReadonlyRootFilesystem() != null && other.getReadonlyRootFilesystem().equals(this.getReadonlyRootFilesystem()) == false)
            return false;
        if (other.getRepositoryCredentials() == null ^ this.getRepositoryCredentials() == null)
            return false;
        if (other.getRepositoryCredentials() != null && other.getRepositoryCredentials().equals(this.getRepositoryCredentials()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        if (other.getSecrets() == null ^ this.getSecrets() == null)
            return false;
        if (other.getSecrets() != null && other.getSecrets().equals(this.getSecrets()) == false)
            return false;
        if (other.getUlimits() == null ^ this.getUlimits() == null)
            return false;
        if (other.getUlimits() != null && other.getUlimits().equals(this.getUlimits()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getEssential() == null) ? 0 : getEssential().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getLinuxParameters() == null) ? 0 : getLinuxParameters().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        hashCode = prime * hashCode + ((getReadonlyRootFilesystem() == null) ? 0 : getReadonlyRootFilesystem().hashCode());
        hashCode = prime * hashCode + ((getRepositoryCredentials() == null) ? 0 : getRepositoryCredentials().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        hashCode = prime * hashCode + ((getSecrets() == null) ? 0 : getSecrets().hashCode());
        hashCode = prime * hashCode + ((getUlimits() == null) ? 0 : getUlimits().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public TaskContainerProperties clone() {
        try {
            return (TaskContainerProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.TaskContainerPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
