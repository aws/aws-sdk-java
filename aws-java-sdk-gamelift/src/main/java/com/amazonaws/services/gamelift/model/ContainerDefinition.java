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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * Describes a container in a container fleet, the resources available to the container, and the commands that are run
 * when the container starts. Container properties can't be updated. To change a property, create a new container group
 * definition. See also <a>ContainerDefinitionInput</a>.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerGroupDefinition</a>
 * </p>
 * <p>
 * <b>Returned by:</b> <a>DescribeContainerGroupDefinition</a>, <a>ListContainerGroupDefinitions</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container definition identifier. Container names are unique within a container group definition.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The URI to the image that $short; copied and deployed to a container fleet. For a more specific identifier, see
     * <code>ResolvedImageDigest</code>.
     * </p>
     */
    private String imageUri;
    /**
     * <p>
     * A unique and immutable identifier for the container image that is deployed to a container fleet. The digest is a
     * SHA 256 hash of the container image manifest.
     * </p>
     */
    private String resolvedImageDigest;
    /**
     * <p>
     * The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set for an
     * individual container, the container shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     */
    private ContainerMemoryLimits memoryLimits;
    /**
     * <p>
     * Defines the ports that are available to assign to processes in the container. For example, a game server process
     * requires a container port to allow game clients to connect to it. Container ports aren't directly accessed by
     * inbound traffic. Amazon GameLift maps these container ports to externally accessible connection ports, which are
     * assigned as needed from the container fleet's <code>ConnectionPortRange</code>.
     * </p>
     */
    private ContainerPortConfiguration portConfiguration;
    /**
     * <p>
     * The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If no
     * resources are reserved, the container shares the total CPU limit for the container group.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     */
    private Integer cpu;
    /**
     * <p>
     * A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     * functioning, also restarts if it fails this health check. If an essential container in the daemon group fails a
     * health check, the entire container group is restarted. The essential container in the replica group doesn't use
     * this health check mechanism, because the Amazon GameLift Agent automatically handles the task.
     * </p>
     */
    private ContainerHealthCheck healthCheck;
    /**
     * <p>
     * A command that's passed to the container on startup. Each argument for the command is an additional string in the
     * array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * Indicates whether the container is vital to the container group. If an essential container fails, the entire
     * container group is restarted.
     * </p>
     */
    private Boolean essential;
    /**
     * <p>
     * The entry point that's passed to the container on startup. If there are multiple arguments, each argument is an
     * additional string in the array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     */
    private java.util.List<String> entryPoint;
    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * A set of environment variables that's passed to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     */
    private java.util.List<ContainerEnvironment> environment;
    /**
     * <p>
     * Indicates that the container relies on the status of other containers in the same container group during its
     * startup and shutdown sequences. A container might have dependencies on multiple containers.
     * </p>
     */
    private java.util.List<ContainerDependency> dependsOn;

    /**
     * <p>
     * The container definition identifier. Container names are unique within a container group definition.
     * </p>
     * 
     * @param containerName
     *        The container definition identifier. Container names are unique within a container group definition.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The container definition identifier. Container names are unique within a container group definition.
     * </p>
     * 
     * @return The container definition identifier. Container names are unique within a container group definition.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The container definition identifier. Container names are unique within a container group definition.
     * </p>
     * 
     * @param containerName
     *        The container definition identifier. Container names are unique within a container group definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The URI to the image that $short; copied and deployed to a container fleet. For a more specific identifier, see
     * <code>ResolvedImageDigest</code>.
     * </p>
     * 
     * @param imageUri
     *        The URI to the image that $short; copied and deployed to a container fleet. For a more specific
     *        identifier, see <code>ResolvedImageDigest</code>.
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The URI to the image that $short; copied and deployed to a container fleet. For a more specific identifier, see
     * <code>ResolvedImageDigest</code>.
     * </p>
     * 
     * @return The URI to the image that $short; copied and deployed to a container fleet. For a more specific
     *         identifier, see <code>ResolvedImageDigest</code>.
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The URI to the image that $short; copied and deployed to a container fleet. For a more specific identifier, see
     * <code>ResolvedImageDigest</code>.
     * </p>
     * 
     * @param imageUri
     *        The URI to the image that $short; copied and deployed to a container fleet. For a more specific
     *        identifier, see <code>ResolvedImageDigest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withImageUri(String imageUri) {
        setImageUri(imageUri);
        return this;
    }

    /**
     * <p>
     * A unique and immutable identifier for the container image that is deployed to a container fleet. The digest is a
     * SHA 256 hash of the container image manifest.
     * </p>
     * 
     * @param resolvedImageDigest
     *        A unique and immutable identifier for the container image that is deployed to a container fleet. The
     *        digest is a SHA 256 hash of the container image manifest.
     */

    public void setResolvedImageDigest(String resolvedImageDigest) {
        this.resolvedImageDigest = resolvedImageDigest;
    }

    /**
     * <p>
     * A unique and immutable identifier for the container image that is deployed to a container fleet. The digest is a
     * SHA 256 hash of the container image manifest.
     * </p>
     * 
     * @return A unique and immutable identifier for the container image that is deployed to a container fleet. The
     *         digest is a SHA 256 hash of the container image manifest.
     */

    public String getResolvedImageDigest() {
        return this.resolvedImageDigest;
    }

    /**
     * <p>
     * A unique and immutable identifier for the container image that is deployed to a container fleet. The digest is a
     * SHA 256 hash of the container image manifest.
     * </p>
     * 
     * @param resolvedImageDigest
     *        A unique and immutable identifier for the container image that is deployed to a container fleet. The
     *        digest is a SHA 256 hash of the container image manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withResolvedImageDigest(String resolvedImageDigest) {
        setResolvedImageDigest(resolvedImageDigest);
        return this;
    }

    /**
     * <p>
     * The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set for an
     * individual container, the container shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     * 
     * @param memoryLimits
     *        The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set
     *        for an individual container, the container shares the container group's total memory allocation.</p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     */

    public void setMemoryLimits(ContainerMemoryLimits memoryLimits) {
        this.memoryLimits = memoryLimits;
    }

    /**
     * <p>
     * The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set for an
     * individual container, the container shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     * 
     * @return The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set
     *         for an individual container, the container shares the container group's total memory allocation.</p>
     *         <p>
     *         <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     */

    public ContainerMemoryLimits getMemoryLimits() {
        return this.memoryLimits;
    }

    /**
     * <p>
     * The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set for an
     * individual container, the container shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     * 
     * @param memoryLimits
     *        The amount of memory that Amazon GameLift makes available to the container. If memory limits aren't set
     *        for an individual container, the container shares the container group's total memory allocation.</p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withMemoryLimits(ContainerMemoryLimits memoryLimits) {
        setMemoryLimits(memoryLimits);
        return this;
    }

    /**
     * <p>
     * Defines the ports that are available to assign to processes in the container. For example, a game server process
     * requires a container port to allow game clients to connect to it. Container ports aren't directly accessed by
     * inbound traffic. Amazon GameLift maps these container ports to externally accessible connection ports, which are
     * assigned as needed from the container fleet's <code>ConnectionPortRange</code>.
     * </p>
     * 
     * @param portConfiguration
     *        Defines the ports that are available to assign to processes in the container. For example, a game server
     *        process requires a container port to allow game clients to connect to it. Container ports aren't directly
     *        accessed by inbound traffic. Amazon GameLift maps these container ports to externally accessible
     *        connection ports, which are assigned as needed from the container fleet's <code>ConnectionPortRange</code>
     *        .
     */

    public void setPortConfiguration(ContainerPortConfiguration portConfiguration) {
        this.portConfiguration = portConfiguration;
    }

    /**
     * <p>
     * Defines the ports that are available to assign to processes in the container. For example, a game server process
     * requires a container port to allow game clients to connect to it. Container ports aren't directly accessed by
     * inbound traffic. Amazon GameLift maps these container ports to externally accessible connection ports, which are
     * assigned as needed from the container fleet's <code>ConnectionPortRange</code>.
     * </p>
     * 
     * @return Defines the ports that are available to assign to processes in the container. For example, a game server
     *         process requires a container port to allow game clients to connect to it. Container ports aren't directly
     *         accessed by inbound traffic. Amazon GameLift maps these container ports to externally accessible
     *         connection ports, which are assigned as needed from the container fleet's
     *         <code>ConnectionPortRange</code>.
     */

    public ContainerPortConfiguration getPortConfiguration() {
        return this.portConfiguration;
    }

    /**
     * <p>
     * Defines the ports that are available to assign to processes in the container. For example, a game server process
     * requires a container port to allow game clients to connect to it. Container ports aren't directly accessed by
     * inbound traffic. Amazon GameLift maps these container ports to externally accessible connection ports, which are
     * assigned as needed from the container fleet's <code>ConnectionPortRange</code>.
     * </p>
     * 
     * @param portConfiguration
     *        Defines the ports that are available to assign to processes in the container. For example, a game server
     *        process requires a container port to allow game clients to connect to it. Container ports aren't directly
     *        accessed by inbound traffic. Amazon GameLift maps these container ports to externally accessible
     *        connection ports, which are assigned as needed from the container fleet's <code>ConnectionPortRange</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withPortConfiguration(ContainerPortConfiguration portConfiguration) {
        setPortConfiguration(portConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If no
     * resources are reserved, the container shares the total CPU limit for the container group.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     * 
     * @param cpu
     *        The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If
     *        no resources are reserved, the container shares the total CPU limit for the container group.</p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If no
     * resources are reserved, the container shares the total CPU limit for the container group.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     * 
     * @return The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If
     *         no resources are reserved, the container shares the total CPU limit for the container group.</p>
     *         <p>
     *         <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If no
     * resources are reserved, the container shares the total CPU limit for the container group.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     * 
     * @param cpu
     *        The number of CPU units that are reserved for the container. Note: 1 vCPU unit equals 1024 CPU units. If
     *        no resources are reserved, the container shares the total CPU limit for the container group.</p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     * functioning, also restarts if it fails this health check. If an essential container in the daemon group fails a
     * health check, the entire container group is restarted. The essential container in the replica group doesn't use
     * this health check mechanism, because the Amazon GameLift Agent automatically handles the task.
     * </p>
     * 
     * @param healthCheck
     *        A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     *        functioning, also restarts if it fails this health check. If an essential container in the daemon group
     *        fails a health check, the entire container group is restarted. The essential container in the replica
     *        group doesn't use this health check mechanism, because the Amazon GameLift Agent automatically handles the
     *        task.
     */

    public void setHealthCheck(ContainerHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     * functioning, also restarts if it fails this health check. If an essential container in the daemon group fails a
     * health check, the entire container group is restarted. The essential container in the replica group doesn't use
     * this health check mechanism, because the Amazon GameLift Agent automatically handles the task.
     * </p>
     * 
     * @return A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     *         functioning, also restarts if it fails this health check. If an essential container in the daemon group
     *         fails a health check, the entire container group is restarted. The essential container in the replica
     *         group doesn't use this health check mechanism, because the Amazon GameLift Agent automatically handles
     *         the task.
     */

    public ContainerHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     * functioning, also restarts if it fails this health check. If an essential container in the daemon group fails a
     * health check, the entire container group is restarted. The essential container in the replica group doesn't use
     * this health check mechanism, because the Amazon GameLift Agent automatically handles the task.
     * </p>
     * 
     * @param healthCheck
     *        A configuration for a non-terminal health check. A container, which automatically restarts if it stops
     *        functioning, also restarts if it fails this health check. If an essential container in the daemon group
     *        fails a health check, the entire container group is restarted. The essential container in the replica
     *        group doesn't use this health check mechanism, because the Amazon GameLift Agent automatically handles the
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withHealthCheck(ContainerHealthCheck healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * A command that's passed to the container on startup. Each argument for the command is an additional string in the
     * array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * 
     * @return A command that's passed to the container on startup. Each argument for the command is an additional
     *         string in the array. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *         >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * A command that's passed to the container on startup. Each argument for the command is an additional string in the
     * array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * 
     * @param command
     *        A command that's passed to the container on startup. Each argument for the command is an additional string
     *        in the array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *        >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
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
     * A command that's passed to the container on startup. Each argument for the command is an additional string in the
     * array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        A command that's passed to the container on startup. Each argument for the command is an additional string
     *        in the array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *        >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withCommand(String... command) {
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
     * A command that's passed to the container on startup. Each argument for the command is an additional string in the
     * array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * 
     * @param command
     *        A command that's passed to the container on startup. Each argument for the command is an additional string
     *        in the array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *        >ContainerDefinition::command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * Indicates whether the container is vital to the container group. If an essential container fails, the entire
     * container group is restarted.
     * </p>
     * 
     * @param essential
     *        Indicates whether the container is vital to the container group. If an essential container fails, the
     *        entire container group is restarted.
     */

    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    /**
     * <p>
     * Indicates whether the container is vital to the container group. If an essential container fails, the entire
     * container group is restarted.
     * </p>
     * 
     * @return Indicates whether the container is vital to the container group. If an essential container fails, the
     *         entire container group is restarted.
     */

    public Boolean getEssential() {
        return this.essential;
    }

    /**
     * <p>
     * Indicates whether the container is vital to the container group. If an essential container fails, the entire
     * container group is restarted.
     * </p>
     * 
     * @param essential
     *        Indicates whether the container is vital to the container group. If an essential container fails, the
     *        entire container group is restarted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEssential(Boolean essential) {
        setEssential(essential);
        return this;
    }

    /**
     * <p>
     * Indicates whether the container is vital to the container group. If an essential container fails, the entire
     * container group is restarted.
     * </p>
     * 
     * @return Indicates whether the container is vital to the container group. If an essential container fails, the
     *         entire container group is restarted.
     */

    public Boolean isEssential() {
        return this.essential;
    }

    /**
     * <p>
     * The entry point that's passed to the container on startup. If there are multiple arguments, each argument is an
     * additional string in the array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @return The entry point that's passed to the container on startup. If there are multiple arguments, each argument
     *         is an additional string in the array. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *         >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *         Reference</i>.
     */

    public java.util.List<String> getEntryPoint() {
        return entryPoint;
    }

    /**
     * <p>
     * The entry point that's passed to the container on startup. If there are multiple arguments, each argument is an
     * additional string in the array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param entryPoint
     *        The entry point that's passed to the container on startup. If there are multiple arguments, each argument
     *        is an additional string in the array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *        >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     */

    public void setEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
            return;
        }

        this.entryPoint = new java.util.ArrayList<String>(entryPoint);
    }

    /**
     * <p>
     * The entry point that's passed to the container on startup. If there are multiple arguments, each argument is an
     * additional string in the array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryPoint(java.util.Collection)} or {@link #withEntryPoint(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entryPoint
     *        The entry point that's passed to the container on startup. If there are multiple arguments, each argument
     *        is an additional string in the array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *        >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEntryPoint(String... entryPoint) {
        if (this.entryPoint == null) {
            setEntryPoint(new java.util.ArrayList<String>(entryPoint.length));
        }
        for (String ele : entryPoint) {
            this.entryPoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entry point that's passed to the container on startup. If there are multiple arguments, each argument is an
     * additional string in the array. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param entryPoint
     *        The entry point that's passed to the container on startup. If there are multiple arguments, each argument
     *        is an additional string in the array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *        >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEntryPoint(java.util.Collection<String> entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     * 
     * @param workingDirectory
     *        The directory in the container where commands are run. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     *        >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     * 
     * @return The directory in the container where commands are run. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     *         >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     *         Reference</i>.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     * 
     * @param workingDirectory
     *        The directory in the container where commands are run. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     *        >ContainerDefinition::workingDirectory</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * A set of environment variables that's passed to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @return A set of environment variables that's passed to the container on startup. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *         >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *         Reference</i>.
     */

    public java.util.List<ContainerEnvironment> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * A set of environment variables that's passed to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param environment
     *        A set of environment variables that's passed to the container on startup. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *        >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     */

    public void setEnvironment(java.util.Collection<ContainerEnvironment> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<ContainerEnvironment>(environment);
    }

    /**
     * <p>
     * A set of environment variables that's passed to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        A set of environment variables that's passed to the container on startup. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *        >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEnvironment(ContainerEnvironment... environment) {
        if (this.environment == null) {
            setEnvironment(new java.util.ArrayList<ContainerEnvironment>(environment.length));
        }
        for (ContainerEnvironment ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables that's passed to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param environment
     *        A set of environment variables that's passed to the container on startup. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *        >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEnvironment(java.util.Collection<ContainerEnvironment> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * Indicates that the container relies on the status of other containers in the same container group during its
     * startup and shutdown sequences. A container might have dependencies on multiple containers.
     * </p>
     * 
     * @return Indicates that the container relies on the status of other containers in the same container group during
     *         its startup and shutdown sequences. A container might have dependencies on multiple containers.
     */

    public java.util.List<ContainerDependency> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * Indicates that the container relies on the status of other containers in the same container group during its
     * startup and shutdown sequences. A container might have dependencies on multiple containers.
     * </p>
     * 
     * @param dependsOn
     *        Indicates that the container relies on the status of other containers in the same container group during
     *        its startup and shutdown sequences. A container might have dependencies on multiple containers.
     */

    public void setDependsOn(java.util.Collection<ContainerDependency> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<ContainerDependency>(dependsOn);
    }

    /**
     * <p>
     * Indicates that the container relies on the status of other containers in the same container group during its
     * startup and shutdown sequences. A container might have dependencies on multiple containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        Indicates that the container relies on the status of other containers in the same container group during
     *        its startup and shutdown sequences. A container might have dependencies on multiple containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDependsOn(ContainerDependency... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<ContainerDependency>(dependsOn.length));
        }
        for (ContainerDependency ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates that the container relies on the status of other containers in the same container group during its
     * startup and shutdown sequences. A container might have dependencies on multiple containers.
     * </p>
     * 
     * @param dependsOn
     *        Indicates that the container relies on the status of other containers in the same container group during
     *        its startup and shutdown sequences. A container might have dependencies on multiple containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDependsOn(java.util.Collection<ContainerDependency> dependsOn) {
        setDependsOn(dependsOn);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getImageUri() != null)
            sb.append("ImageUri: ").append(getImageUri()).append(",");
        if (getResolvedImageDigest() != null)
            sb.append("ResolvedImageDigest: ").append(getResolvedImageDigest()).append(",");
        if (getMemoryLimits() != null)
            sb.append("MemoryLimits: ").append(getMemoryLimits()).append(",");
        if (getPortConfiguration() != null)
            sb.append("PortConfiguration: ").append(getPortConfiguration()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getEssential() != null)
            sb.append("Essential: ").append(getEssential()).append(",");
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDefinition == false)
            return false;
        ContainerDefinition other = (ContainerDefinition) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getResolvedImageDigest() == null ^ this.getResolvedImageDigest() == null)
            return false;
        if (other.getResolvedImageDigest() != null && other.getResolvedImageDigest().equals(this.getResolvedImageDigest()) == false)
            return false;
        if (other.getMemoryLimits() == null ^ this.getMemoryLimits() == null)
            return false;
        if (other.getMemoryLimits() != null && other.getMemoryLimits().equals(this.getMemoryLimits()) == false)
            return false;
        if (other.getPortConfiguration() == null ^ this.getPortConfiguration() == null)
            return false;
        if (other.getPortConfiguration() != null && other.getPortConfiguration().equals(this.getPortConfiguration()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEssential() == null ^ this.getEssential() == null)
            return false;
        if (other.getEssential() != null && other.getEssential().equals(this.getEssential()) == false)
            return false;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode + ((getResolvedImageDigest() == null) ? 0 : getResolvedImageDigest().hashCode());
        hashCode = prime * hashCode + ((getMemoryLimits() == null) ? 0 : getMemoryLimits().hashCode());
        hashCode = prime * hashCode + ((getPortConfiguration() == null) ? 0 : getPortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getEssential() == null) ? 0 : getEssential().hashCode());
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDefinition clone() {
        try {
            return (ContainerDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
