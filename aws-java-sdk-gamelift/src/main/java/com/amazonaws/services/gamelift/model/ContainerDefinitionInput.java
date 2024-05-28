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
 * Describes a container's configuration, resources, and start instructions. Use this data type to create a container
 * group definition. For the properties of a container that's been deployed to a fleet, see <a>ContainerDefinition</a>.
 * You can't change these properties after you've created the container group definition. If you need a container group
 * with different properties, then you must create a new one.
 * </p>
 * <p>
 * <b>Used with: </b> <a>CreateContainerGroupDefinition</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerDefinitionInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinitionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that uniquely identifies the container definition within a container group.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The location of a container image that $short; will copy and deploy to a container fleet. Images in Amazon
     * Elastic Container Registry private repositories are supported. The repository must be in the same Amazon Web
     * Services account and Amazon Web Services Region where you're creating the container group definition. For limits
     * on image size, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon GameLift
     * endpoints and quotas</a>. You can use any of the following image URI formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and digest: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     * </p>
     * </li>
     * </ul>
     */
    private String imageUri;
    /**
     * <p>
     * The amount of memory to make available to the container. If you don't specify memory limits for this container,
     * then it shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     */
    private ContainerMemoryLimits memoryLimits;
    /**
     * <p>
     * A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept inbound
     * traffic connections, including game server processes, must be assigned a port from this set. The set of ports
     * must be large enough to assign one to each process in the container that needs one. If the container includes
     * your game server, include enough ports to assign one port to each concurrent server process (as defined in a
     * container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for container
     * fleets</a>.
     * </p>
     * <p>
     * Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports to
     * externally accessible connection ports, which are assigned as needed from the container fleet's
     * <code>ConnectionPortRange</code>.
     * </p>
     */
    private ContainerPortConfiguration portConfiguration;
    /**
     * <p>
     * The number of CPU units to reserve for this container. The container can use more resources when needed, if
     * available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container, then it
     * shares the total CPU limit for the container group. This property is similar to the Amazon ECS container
     * definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     * >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i>
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     */
    private Integer cpu;
    /**
     * <p>
     * Configuration for a non-terminal health check. A container automatically restarts if it stops functioning. This
     * parameter lets you define additional reasons to consider a container unhealthy and restart it. You can set a
     * health check for any container except for the essential container in the replica container group. If an essential
     * container in the daemon group fails a health check, the entire container group is restarted.
     * </p>
     */
    private ContainerHealthCheck healthCheck;
    /**
     * <p>
     * A command to pass to the container on startup. Add multiple arguments as additional strings in the array. See the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * Specifies whether the container is vital for the container group to function properly. If an essential container
     * fails, it causes the entire container group to restart. Each container group must have an essential container.
     * </p>
     * <p>
     * <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the following to
     * configure an essential replica container:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a container is running your game server and the Amazon GameLift Agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include a port configuration. This container runs your game server processes, and each process requires a
     * container port to allow access to game clients.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't configure a health check. The Agent handles this task for the essential replica container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     * </p>
     * <p>
     * </p>
     */
    private Boolean essential;
    /**
     * <p>
     * An entry point to pass to the container on startup. Add multiple arguments as additional strings in the array.
     * See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     */
    private java.util.List<String> entryPoint;
    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * A set of environment variables to pass to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     */
    private java.util.List<ContainerEnvironment> environment;
    /**
     * <p>
     * Sets up dependencies between this container and the status of other containers in the same container group. A
     * container can have dependencies on multiple different containers.
     * </p>
     * <p>
     * You can use dependencies to establish a startup/shutdown sequence across the container group. A container startup
     * dependency is reversed on shutdown.
     * </p>
     * <p>
     * For example, you might specify that SideCarContainerB has a <code>START</code> dependency on SideCarContainerA.
     * This dependency means that SideCarContainerB can't start until after SideCarContainerA has started. This
     * dependency is reversed on shutdown, which means that SideCarContainerB must shut down before SideCarContainerA
     * can shut down.
     * </p>
     */
    private java.util.List<ContainerDependency> dependsOn;

    /**
     * <p>
     * A string that uniquely identifies the container definition within a container group.
     * </p>
     * 
     * @param containerName
     *        A string that uniquely identifies the container definition within a container group.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * A string that uniquely identifies the container definition within a container group.
     * </p>
     * 
     * @return A string that uniquely identifies the container definition within a container group.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * A string that uniquely identifies the container definition within a container group.
     * </p>
     * 
     * @param containerName
     *        A string that uniquely identifies the container definition within a container group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The location of a container image that $short; will copy and deploy to a container fleet. Images in Amazon
     * Elastic Container Registry private repositories are supported. The repository must be in the same Amazon Web
     * Services account and Amazon Web Services Region where you're creating the container group definition. For limits
     * on image size, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon GameLift
     * endpoints and quotas</a>. You can use any of the following image URI formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and digest: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param imageUri
     *        The location of a container image that $short; will copy and deploy to a container fleet. Images in Amazon
     *        Elastic Container Registry private repositories are supported. The repository must be in the same Amazon
     *        Web Services account and Amazon Web Services Region where you're creating the container group definition.
     *        For limits on image size, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon
     *        GameLift endpoints and quotas</a>. You can use any of the following image URI formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Image ID and digest:
     *        <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     *        </p>
     *        </li>
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The location of a container image that $short; will copy and deploy to a container fleet. Images in Amazon
     * Elastic Container Registry private repositories are supported. The repository must be in the same Amazon Web
     * Services account and Amazon Web Services Region where you're creating the container group definition. For limits
     * on image size, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon GameLift
     * endpoints and quotas</a>. You can use any of the following image URI formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and digest: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The location of a container image that $short; will copy and deploy to a container fleet. Images in
     *         Amazon Elastic Container Registry private repositories are supported. The repository must be in the same
     *         Amazon Web Services account and Amazon Web Services Region where you're creating the container group
     *         definition. For limits on image size, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon GameLift endpoints and
     *         quotas</a>. You can use any of the following image URI formats: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Image ID and digest:
     *         <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     *         </p>
     *         </li>
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The location of a container image that $short; will copy and deploy to a container fleet. Images in Amazon
     * Elastic Container Registry private repositories are supported. The repository must be in the same Amazon Web
     * Services account and Amazon Web Services Region where you're creating the container group definition. For limits
     * on image size, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon GameLift
     * endpoints and quotas</a>. You can use any of the following image URI formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and digest: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param imageUri
     *        The location of a container image that $short; will copy and deploy to a container fleet. Images in Amazon
     *        Elastic Container Registry private repositories are supported. The repository must be in the same Amazon
     *        Web Services account and Amazon Web Services Region where you're creating the container group definition.
     *        For limits on image size, see <a href="https://docs.aws.amazon.com/general/latest/gr/gamelift.html">Amazon
     *        GameLift endpoints and quotas</a>. You can use any of the following image URI formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Image ID only: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Image ID and digest:
     *        <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]@[digest]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Image ID and tag: <code>[AWS account].dkr.ecr.[AWS region].amazonaws.com/[repository ID]:[tag]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withImageUri(String imageUri) {
        setImageUri(imageUri);
        return this;
    }

    /**
     * <p>
     * The amount of memory to make available to the container. If you don't specify memory limits for this container,
     * then it shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     * 
     * @param memoryLimits
     *        The amount of memory to make available to the container. If you don't specify memory limits for this
     *        container, then it shares the container group's total memory allocation. </p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     */

    public void setMemoryLimits(ContainerMemoryLimits memoryLimits) {
        this.memoryLimits = memoryLimits;
    }

    /**
     * <p>
     * The amount of memory to make available to the container. If you don't specify memory limits for this container,
     * then it shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     * 
     * @return The amount of memory to make available to the container. If you don't specify memory limits for this
     *         container, then it shares the container group's total memory allocation. </p>
     *         <p>
     *         <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     */

    public ContainerMemoryLimits getMemoryLimits() {
        return this.memoryLimits;
    }

    /**
     * <p>
     * The amount of memory to make available to the container. If you don't specify memory limits for this container,
     * then it shares the container group's total memory allocation.
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * </p>
     * 
     * @param memoryLimits
     *        The amount of memory to make available to the container. If you don't specify memory limits for this
     *        container, then it shares the container group's total memory allocation. </p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalMemoryLimit</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withMemoryLimits(ContainerMemoryLimits memoryLimits) {
        setMemoryLimits(memoryLimits);
        return this;
    }

    /**
     * <p>
     * A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept inbound
     * traffic connections, including game server processes, must be assigned a port from this set. The set of ports
     * must be large enough to assign one to each process in the container that needs one. If the container includes
     * your game server, include enough ports to assign one port to each concurrent server process (as defined in a
     * container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for container
     * fleets</a>.
     * </p>
     * <p>
     * Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports to
     * externally accessible connection ports, which are assigned as needed from the container fleet's
     * <code>ConnectionPortRange</code>.
     * </p>
     * 
     * @param portConfiguration
     *        A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept
     *        inbound traffic connections, including game server processes, must be assigned a port from this set. The
     *        set of ports must be large enough to assign one to each process in the container that needs one. If the
     *        container includes your game server, include enough ports to assign one port to each concurrent server
     *        process (as defined in a container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for
     *        container fleets</a>. </p>
     *        <p>
     *        Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports to
     *        externally accessible connection ports, which are assigned as needed from the container fleet's
     *        <code>ConnectionPortRange</code>.
     */

    public void setPortConfiguration(ContainerPortConfiguration portConfiguration) {
        this.portConfiguration = portConfiguration;
    }

    /**
     * <p>
     * A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept inbound
     * traffic connections, including game server processes, must be assigned a port from this set. The set of ports
     * must be large enough to assign one to each process in the container that needs one. If the container includes
     * your game server, include enough ports to assign one port to each concurrent server process (as defined in a
     * container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for container
     * fleets</a>.
     * </p>
     * <p>
     * Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports to
     * externally accessible connection ports, which are assigned as needed from the container fleet's
     * <code>ConnectionPortRange</code>.
     * </p>
     * 
     * @return A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept
     *         inbound traffic connections, including game server processes, must be assigned a port from this set. The
     *         set of ports must be large enough to assign one to each process in the container that needs one. If the
     *         container includes your game server, include enough ports to assign one port to each concurrent server
     *         process (as defined in a container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for
     *         container fleets</a>. </p>
     *         <p>
     *         Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports
     *         to externally accessible connection ports, which are assigned as needed from the container fleet's
     *         <code>ConnectionPortRange</code>.
     */

    public ContainerPortConfiguration getPortConfiguration() {
        return this.portConfiguration;
    }

    /**
     * <p>
     * A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept inbound
     * traffic connections, including game server processes, must be assigned a port from this set. The set of ports
     * must be large enough to assign one to each process in the container that needs one. If the container includes
     * your game server, include enough ports to assign one port to each concurrent server process (as defined in a
     * container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for container
     * fleets</a>.
     * </p>
     * <p>
     * Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports to
     * externally accessible connection ports, which are assigned as needed from the container fleet's
     * <code>ConnectionPortRange</code>.
     * </p>
     * 
     * @param portConfiguration
     *        A set of ports that Amazon GameLift can assign to processes in the container. All processes that accept
     *        inbound traffic connections, including game server processes, must be assigned a port from this set. The
     *        set of ports must be large enough to assign one to each process in the container that needs one. If the
     *        container includes your game server, include enough ports to assign one port to each concurrent server
     *        process (as defined in a container fleet's <a>RuntimeConfiguration</a>). For more details, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-network">Networking for
     *        container fleets</a>. </p>
     *        <p>
     *        Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these container ports to
     *        externally accessible connection ports, which are assigned as needed from the container fleet's
     *        <code>ConnectionPortRange</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withPortConfiguration(ContainerPortConfiguration portConfiguration) {
        setPortConfiguration(portConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of CPU units to reserve for this container. The container can use more resources when needed, if
     * available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container, then it
     * shares the total CPU limit for the container group. This property is similar to the Amazon ECS container
     * definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     * >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i>
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     * 
     * @param cpu
     *        The number of CPU units to reserve for this container. The container can use more resources when needed,
     *        if available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container,
     *        then it shares the total CPU limit for the container group. This property is similar to the Amazon ECS
     *        container definition parameter <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     *        >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i> </p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units to reserve for this container. The container can use more resources when needed, if
     * available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container, then it
     * shares the total CPU limit for the container group. This property is similar to the Amazon ECS container
     * definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     * >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i>
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     * 
     * @return The number of CPU units to reserve for this container. The container can use more resources when needed,
     *         if available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container,
     *         then it shares the total CPU limit for the container group. This property is similar to the Amazon ECS
     *         container definition parameter <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     *         >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i> </p>
     *         <p>
     *         <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units to reserve for this container. The container can use more resources when needed, if
     * available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container, then it
     * shares the total CPU limit for the container group. This property is similar to the Amazon ECS container
     * definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     * >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i>
     * </p>
     * <p>
     * <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * </p>
     * 
     * @param cpu
     *        The number of CPU units to reserve for this container. The container can use more resources when needed,
     *        if available. Note: 1 vCPU unit equals 1024 CPU units. If you don't reserve CPU units for this container,
     *        then it shares the total CPU limit for the container group. This property is similar to the Amazon ECS
     *        container definition parameter <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_environment"
     *        >environment</a> (<i>Amazon Elastic Container Service Developer Guide).</i> </p>
     *        <p>
     *        <b>Related data type: </b> <a>ContainerGroupDefinition$TotalCpuLimit</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * Configuration for a non-terminal health check. A container automatically restarts if it stops functioning. This
     * parameter lets you define additional reasons to consider a container unhealthy and restart it. You can set a
     * health check for any container except for the essential container in the replica container group. If an essential
     * container in the daemon group fails a health check, the entire container group is restarted.
     * </p>
     * 
     * @param healthCheck
     *        Configuration for a non-terminal health check. A container automatically restarts if it stops functioning.
     *        This parameter lets you define additional reasons to consider a container unhealthy and restart it. You
     *        can set a health check for any container except for the essential container in the replica container
     *        group. If an essential container in the daemon group fails a health check, the entire container group is
     *        restarted.
     */

    public void setHealthCheck(ContainerHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * Configuration for a non-terminal health check. A container automatically restarts if it stops functioning. This
     * parameter lets you define additional reasons to consider a container unhealthy and restart it. You can set a
     * health check for any container except for the essential container in the replica container group. If an essential
     * container in the daemon group fails a health check, the entire container group is restarted.
     * </p>
     * 
     * @return Configuration for a non-terminal health check. A container automatically restarts if it stops
     *         functioning. This parameter lets you define additional reasons to consider a container unhealthy and
     *         restart it. You can set a health check for any container except for the essential container in the
     *         replica container group. If an essential container in the daemon group fails a health check, the entire
     *         container group is restarted.
     */

    public ContainerHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * Configuration for a non-terminal health check. A container automatically restarts if it stops functioning. This
     * parameter lets you define additional reasons to consider a container unhealthy and restart it. You can set a
     * health check for any container except for the essential container in the replica container group. If an essential
     * container in the daemon group fails a health check, the entire container group is restarted.
     * </p>
     * 
     * @param healthCheck
     *        Configuration for a non-terminal health check. A container automatically restarts if it stops functioning.
     *        This parameter lets you define additional reasons to consider a container unhealthy and restart it. You
     *        can set a health check for any container except for the essential container in the replica container
     *        group. If an essential container in the daemon group fails a health check, the entire container group is
     *        restarted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withHealthCheck(ContainerHealthCheck healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * A command to pass to the container on startup. Add multiple arguments as additional strings in the array. See the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * 
     * @return A command to pass to the container on startup. Add multiple arguments as additional strings in the array.
     *         See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *         >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * A command to pass to the container on startup. Add multiple arguments as additional strings in the array. See the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * 
     * @param command
     *        A command to pass to the container on startup. Add multiple arguments as additional strings in the array.
     *        See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *        >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
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
     * A command to pass to the container on startup. Add multiple arguments as additional strings in the array. See the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        A command to pass to the container on startup. Add multiple arguments as additional strings in the array.
     *        See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *        >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withCommand(String... command) {
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
     * A command to pass to the container on startup. Add multiple arguments as additional strings in the array. See the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     * >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * </p>
     * 
     * @param command
     *        A command to pass to the container on startup. Add multiple arguments as additional strings in the array.
     *        See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command"
     *        >ContainerDefinition command</a> parameter in the <i>Amazon Elastic Container Service API reference.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * Specifies whether the container is vital for the container group to function properly. If an essential container
     * fails, it causes the entire container group to restart. Each container group must have an essential container.
     * </p>
     * <p>
     * <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the following to
     * configure an essential replica container:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a container is running your game server and the Amazon GameLift Agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include a port configuration. This container runs your game server processes, and each process requires a
     * container port to allow access to game clients.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't configure a health check. The Agent handles this task for the essential replica container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     * </p>
     * <p>
     * </p>
     * 
     * @param essential
     *        Specifies whether the container is vital for the container group to function properly. If an essential
     *        container fails, it causes the entire container group to restart. Each container group must have an
     *        essential container.</p>
     *        <p>
     *        <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the
     *        following to configure an essential replica container:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Choose a container is running your game server and the Amazon GameLift Agent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Include a port configuration. This container runs your game server processes, and each process requires a
     *        container port to allow access to game clients.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't configure a health check. The Agent handles this task for the essential replica container.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     *        </p>
     *        <p>
     */

    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    /**
     * <p>
     * Specifies whether the container is vital for the container group to function properly. If an essential container
     * fails, it causes the entire container group to restart. Each container group must have an essential container.
     * </p>
     * <p>
     * <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the following to
     * configure an essential replica container:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a container is running your game server and the Amazon GameLift Agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include a port configuration. This container runs your game server processes, and each process requires a
     * container port to allow access to game clients.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't configure a health check. The Agent handles this task for the essential replica container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     * </p>
     * <p>
     * </p>
     * 
     * @return Specifies whether the container is vital for the container group to function properly. If an essential
     *         container fails, it causes the entire container group to restart. Each container group must have an
     *         essential container.</p>
     *         <p>
     *         <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the
     *         following to configure an essential replica container:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Choose a container is running your game server and the Amazon GameLift Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Include a port configuration. This container runs your game server processes, and each process requires a
     *         container port to allow access to game clients.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Don't configure a health check. The Agent handles this task for the essential replica container.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     *         </p>
     *         <p>
     */

    public Boolean getEssential() {
        return this.essential;
    }

    /**
     * <p>
     * Specifies whether the container is vital for the container group to function properly. If an essential container
     * fails, it causes the entire container group to restart. Each container group must have an essential container.
     * </p>
     * <p>
     * <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the following to
     * configure an essential replica container:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a container is running your game server and the Amazon GameLift Agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include a port configuration. This container runs your game server processes, and each process requires a
     * container port to allow access to game clients.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't configure a health check. The Agent handles this task for the essential replica container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     * </p>
     * <p>
     * </p>
     * 
     * @param essential
     *        Specifies whether the container is vital for the container group to function properly. If an essential
     *        container fails, it causes the entire container group to restart. Each container group must have an
     *        essential container.</p>
     *        <p>
     *        <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the
     *        following to configure an essential replica container:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Choose a container is running your game server and the Amazon GameLift Agent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Include a port configuration. This container runs your game server processes, and each process requires a
     *        container port to allow access to game clients.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't configure a health check. The Agent handles this task for the essential replica container.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     *        </p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withEssential(Boolean essential) {
        setEssential(essential);
        return this;
    }

    /**
     * <p>
     * Specifies whether the container is vital for the container group to function properly. If an essential container
     * fails, it causes the entire container group to restart. Each container group must have an essential container.
     * </p>
     * <p>
     * <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the following to
     * configure an essential replica container:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a container is running your game server and the Amazon GameLift Agent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include a port configuration. This container runs your game server processes, and each process requires a
     * container port to allow access to game clients.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't configure a health check. The Agent handles this task for the essential replica container.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     * </p>
     * <p>
     * </p>
     * 
     * @return Specifies whether the container is vital for the container group to function properly. If an essential
     *         container fails, it causes the entire container group to restart. Each container group must have an
     *         essential container.</p>
     *         <p>
     *         <b>Replica container groups</b> - A replica group must have exactly one essential container. Use the
     *         following to configure an essential replica container:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Choose a container is running your game server and the Amazon GameLift Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Include a port configuration. This container runs your game server processes, and each process requires a
     *         container port to allow access to game clients.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Don't configure a health check. The Agent handles this task for the essential replica container.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Daemon container groups</b> - A daemon group must have at least one essential container.
     *         </p>
     *         <p>
     */

    public Boolean isEssential() {
        return this.essential;
    }

    /**
     * <p>
     * An entry point to pass to the container on startup. Add multiple arguments as additional strings in the array.
     * See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @return An entry point to pass to the container on startup. Add multiple arguments as additional strings in the
     *         array. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *         >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *         Reference</i>.
     */

    public java.util.List<String> getEntryPoint() {
        return entryPoint;
    }

    /**
     * <p>
     * An entry point to pass to the container on startup. Add multiple arguments as additional strings in the array.
     * See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param entryPoint
     *        An entry point to pass to the container on startup. Add multiple arguments as additional strings in the
     *        array. See the <a href=
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
     * An entry point to pass to the container on startup. Add multiple arguments as additional strings in the array.
     * See the <a href=
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
     *        An entry point to pass to the container on startup. Add multiple arguments as additional strings in the
     *        array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *        >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withEntryPoint(String... entryPoint) {
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
     * An entry point to pass to the container on startup. Add multiple arguments as additional strings in the array.
     * See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     * >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param entryPoint
     *        An entry point to pass to the container on startup. Add multiple arguments as additional strings in the
     *        array. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint"
     *        >ContainerDefinition::entryPoint</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withEntryPoint(java.util.Collection<String> entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     * 
     * @param workingDirectory
     *        The directory in the container where commands are run. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     *        >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     * 
     * @return The directory in the container where commands are run. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     *         >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     *         Reference</i>.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The directory in the container where commands are run. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     * >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     * Reference</i>.
     * </p>
     * 
     * @param workingDirectory
     *        The directory in the container where commands are run. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory"
     *        >ContainerDefinition::workingDirectory parameter</a> in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * A set of environment variables to pass to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @return A set of environment variables to pass to the container on startup. See the <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *         >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *         Reference</i>.
     */

    public java.util.List<ContainerEnvironment> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * A set of environment variables to pass to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param environment
     *        A set of environment variables to pass to the container on startup. See the <a href=
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
     * A set of environment variables to pass to the container on startup. See the <a href=
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
     *        A set of environment variables to pass to the container on startup. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *        >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withEnvironment(ContainerEnvironment... environment) {
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
     * A set of environment variables to pass to the container on startup. See the <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     * >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API Reference</i>.
     * </p>
     * 
     * @param environment
     *        A set of environment variables to pass to the container on startup. See the <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment"
     *        >ContainerDefinition::environment</a> parameter in the <i>Amazon Elastic Container Service API
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withEnvironment(java.util.Collection<ContainerEnvironment> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * Sets up dependencies between this container and the status of other containers in the same container group. A
     * container can have dependencies on multiple different containers.
     * </p>
     * <p>
     * You can use dependencies to establish a startup/shutdown sequence across the container group. A container startup
     * dependency is reversed on shutdown.
     * </p>
     * <p>
     * For example, you might specify that SideCarContainerB has a <code>START</code> dependency on SideCarContainerA.
     * This dependency means that SideCarContainerB can't start until after SideCarContainerA has started. This
     * dependency is reversed on shutdown, which means that SideCarContainerB must shut down before SideCarContainerA
     * can shut down.
     * </p>
     * 
     * @return Sets up dependencies between this container and the status of other containers in the same container
     *         group. A container can have dependencies on multiple different containers. </p>
     *         <p>
     *         You can use dependencies to establish a startup/shutdown sequence across the container group. A container
     *         startup dependency is reversed on shutdown.
     *         </p>
     *         <p>
     *         For example, you might specify that SideCarContainerB has a <code>START</code> dependency on
     *         SideCarContainerA. This dependency means that SideCarContainerB can't start until after SideCarContainerA
     *         has started. This dependency is reversed on shutdown, which means that SideCarContainerB must shut down
     *         before SideCarContainerA can shut down.
     */

    public java.util.List<ContainerDependency> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * Sets up dependencies between this container and the status of other containers in the same container group. A
     * container can have dependencies on multiple different containers.
     * </p>
     * <p>
     * You can use dependencies to establish a startup/shutdown sequence across the container group. A container startup
     * dependency is reversed on shutdown.
     * </p>
     * <p>
     * For example, you might specify that SideCarContainerB has a <code>START</code> dependency on SideCarContainerA.
     * This dependency means that SideCarContainerB can't start until after SideCarContainerA has started. This
     * dependency is reversed on shutdown, which means that SideCarContainerB must shut down before SideCarContainerA
     * can shut down.
     * </p>
     * 
     * @param dependsOn
     *        Sets up dependencies between this container and the status of other containers in the same container
     *        group. A container can have dependencies on multiple different containers. </p>
     *        <p>
     *        You can use dependencies to establish a startup/shutdown sequence across the container group. A container
     *        startup dependency is reversed on shutdown.
     *        </p>
     *        <p>
     *        For example, you might specify that SideCarContainerB has a <code>START</code> dependency on
     *        SideCarContainerA. This dependency means that SideCarContainerB can't start until after SideCarContainerA
     *        has started. This dependency is reversed on shutdown, which means that SideCarContainerB must shut down
     *        before SideCarContainerA can shut down.
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
     * Sets up dependencies between this container and the status of other containers in the same container group. A
     * container can have dependencies on multiple different containers.
     * </p>
     * <p>
     * You can use dependencies to establish a startup/shutdown sequence across the container group. A container startup
     * dependency is reversed on shutdown.
     * </p>
     * <p>
     * For example, you might specify that SideCarContainerB has a <code>START</code> dependency on SideCarContainerA.
     * This dependency means that SideCarContainerB can't start until after SideCarContainerA has started. This
     * dependency is reversed on shutdown, which means that SideCarContainerB must shut down before SideCarContainerA
     * can shut down.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        Sets up dependencies between this container and the status of other containers in the same container
     *        group. A container can have dependencies on multiple different containers. </p>
     *        <p>
     *        You can use dependencies to establish a startup/shutdown sequence across the container group. A container
     *        startup dependency is reversed on shutdown.
     *        </p>
     *        <p>
     *        For example, you might specify that SideCarContainerB has a <code>START</code> dependency on
     *        SideCarContainerA. This dependency means that SideCarContainerB can't start until after SideCarContainerA
     *        has started. This dependency is reversed on shutdown, which means that SideCarContainerB must shut down
     *        before SideCarContainerA can shut down.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withDependsOn(ContainerDependency... dependsOn) {
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
     * Sets up dependencies between this container and the status of other containers in the same container group. A
     * container can have dependencies on multiple different containers.
     * </p>
     * <p>
     * You can use dependencies to establish a startup/shutdown sequence across the container group. A container startup
     * dependency is reversed on shutdown.
     * </p>
     * <p>
     * For example, you might specify that SideCarContainerB has a <code>START</code> dependency on SideCarContainerA.
     * This dependency means that SideCarContainerB can't start until after SideCarContainerA has started. This
     * dependency is reversed on shutdown, which means that SideCarContainerB must shut down before SideCarContainerA
     * can shut down.
     * </p>
     * 
     * @param dependsOn
     *        Sets up dependencies between this container and the status of other containers in the same container
     *        group. A container can have dependencies on multiple different containers. </p>
     *        <p>
     *        You can use dependencies to establish a startup/shutdown sequence across the container group. A container
     *        startup dependency is reversed on shutdown.
     *        </p>
     *        <p>
     *        For example, you might specify that SideCarContainerB has a <code>START</code> dependency on
     *        SideCarContainerA. This dependency means that SideCarContainerB can't start until after SideCarContainerA
     *        has started. This dependency is reversed on shutdown, which means that SideCarContainerB must shut down
     *        before SideCarContainerA can shut down.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinitionInput withDependsOn(java.util.Collection<ContainerDependency> dependsOn) {
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

        if (obj instanceof ContainerDefinitionInput == false)
            return false;
        ContainerDefinitionInput other = (ContainerDefinitionInput) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
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
    public ContainerDefinitionInput clone() {
        try {
            return (ContainerDefinitionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerDefinitionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
