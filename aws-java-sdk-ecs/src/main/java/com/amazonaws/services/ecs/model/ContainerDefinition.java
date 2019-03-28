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
 * Container definitions are used in task definitions to describe the different containers that are launched as part of
 * a task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ContainerDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a container. If you are linking multiple containers together in a task definition, the
     * <code>name</code> of one container can be entered in the <code>links</code> of another container to connect the
     * containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. This
     * parameter maps to <code>name</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--name</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with either
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     * <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and tag
     * for the container to use. However, subsequent updates to a repository image are not propagated to already running
     * tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in Amazon ECR repositories can be specified by either using the full <code>registry/repository:tag</code>
     * or <code>registry/repository@digest</code>. For example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     */
    private String image;
    /**
     * <p>
     * The private repository authentication credentials to use.
     * </p>
     */
    private RepositoryCredentials repositoryCredentials;
    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container. This parameter maps to <code>CpuShares</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * This field is optional for tasks using the Fargate launch type, and the only requirement is that the total amount
     * of CPU reserved for all containers within a task be lower than the task-level <code>cpu</code> value.
     * </p>
     * <note>
     * <p>
     * You can determine the number of CPU units that are available per EC2 instance type by multiplying the vCPUs
     * listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instances</a>
     * detail page by 1,024.
     * </p>
     * </note>
     * <p>
     * For example, if you run a single-container task on a single-core instance type with 512 CPU units specified for
     * that container, and that is the only task running on the container instance, that container could use the full
     * 1,024 CPU unit share at any given time. However, if you launched another copy of the same task on that container
     * instance, each task would be guaranteed a minimum of 512 CPU units when needed, and each container could float to
     * higher CPU usage if the other container was not using it, but if both tasks were 100% active all of the time,
     * they would be limited to 512 CPU units.
     * </p>
     * <p>
     * Linux containers share unallocated CPU units with other containers on the container instance with the same ratio
     * as their allocated amount. For example, if you run a single-container task on a single-core instance type with
     * 512 CPU units specified for that container, and that is the only task running on the container instance, that
     * container could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     * same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when needed, and
     * each container could float to higher CPU usage if the other container was not using it, but if both tasks were
     * 100% active all of the time, they would be limited to 512 CPU units.
     * </p>
     * <p>
     * On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate the
     * relative CPU share ratios for running containers. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the Docker
     * documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the CPU parameter is
     * not required, and you can use CPU values below 2 in your container definitions. For CPU values below 2 (including
     * null), the behavior varies based on your Amazon ECS container agent version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0, which
     * Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux kernel
     * converts to two CPU shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to Docker as 2.
     * </p>
     * </li>
     * </ul>
     * <p>
     * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows containers
     * only have access to the specified amount of CPU that is described in the task definition.
     * </p>
     */
    private Integer cpu;
    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--memory</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * If your containers are part of a task using the Fargate launch type, this field is optional and the only
     * requirement is that the total amount of memory reserved for all containers within a task be lower than the task
     * <code>memory</code> value.
     * </p>
     * <p>
     * For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for one or
     * both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you specify both,
     * <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     * <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     * container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy contention,
     * Docker attempts to keep the container memory to this soft limit. However, your container can consume more memory
     * when it needs to, up to either the hard limit specified with the <code>memory</code> parameter (if applicable),
     * or all of the available memory on the container instance, whichever comes first. This parameter maps to
     * <code>MemoryReservation</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--memory-reservation</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * You must specify a non-zero integer for one or both of <code>memory</code> or <code>memoryReservation</code> in
     * container definitions. If you specify both, <code>memory</code> must be greater than
     * <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that value is subtracted from
     * the available memory resources for the container instance on which the container is placed. Otherwise, the value
     * of <code>memory</code> is used.
     * </p>
     * <p>
     * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of memory for
     * short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a <code>memory</code> hard
     * limit of 300 MiB. This configuration would allow the container to only reserve 128 MiB of memory from the
     * remaining resources on the container instance, but also allow the container to consume more memory resources when
     * needed.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     */
    private Integer memoryReservation;
    /**
     * <p>
     * The <code>link</code> parameter allows containers to communicate with each other without the need for port
     * mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     * <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information about
     * linking Docker containers, go to <a
     * href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     * >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps to
     * <code>Links</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     * <code>docker run</code> </a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note> <important>
     * <p>
     * Containers that are collocated on a single container instance may be able to communicate with each other without
     * requiring links or host port mappings. Network isolation is achieved on the container instance using security
     * groups and VPC settings.
     * </p>
     * </important>
     */
    private com.amazonaws.internal.SdkInternalList<String> links;
    /**
     * <p>
     * The list of port mappings for the container. Port mappings allow containers to access ports on the host container
     * instance to send or receive traffic.
     * </p>
     * <p>
     * For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     * <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the
     * <code>containerPort</code>.
     * </p>
     * <p>
     * Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>. There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from the host itself.
     * </p>
     * <p>
     * This parameter maps to <code>PortBindings</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--publish</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. If the network mode of a task
     * definition is set to <code>none</code>, then you can't specify port mappings. If the network mode of a task
     * definition is set to <code>host</code>, then host ports must either be undefined or they must match the container
     * port in the port mapping.
     * </p>
     * <note>
     * <p>
     * After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments
     * are visible in the <b>Network Bindings</b> section of a container description for a selected task in the Amazon
     * ECS console. The assignments are also visible in the <code>networkBindings</code> section <a>DescribeTasks</a>
     * responses.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<PortMapping> portMappings;
    /**
     * <p>
     * If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped. If the
     * <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not affect
     * the rest of the containers in a task. If this parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All tasks must have at least one essential container. If you have an application that is composed of multiple
     * containers, you should group containers that are used for a common purpose into components, and separate the
     * different components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Boolean essential;
    /**
     * <important>
     * <p>
     * Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code> parameters. If
     * you have problems using <code>entryPoint</code>, update your container agent or enter your commands and arguments
     * as <code>command</code> array items instead.
     * </p>
     * </important>
     * <p>
     * The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--entrypoint</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href
     * ="https://docs.docker.com/engine/reference/builder/#entrypoint">https://docs.docker.com/engine/reference/builder
     * /#entrypoint</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> entryPoint;
    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>COMMAND</code> parameter
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should
     * be a separated string in the array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> command;
    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValuePair> environment;
    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volume</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers cannot mount directories on a different drive, and mount point cannot be across drives.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MountPoint> mountPoints;
    /**
     * <p>
     * Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volumes-from</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeFrom> volumesFrom;
    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux <a>KernelCapabilities</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private LinuxParameters linuxParameters;
    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Secret> secrets;
    /**
     * <p>
     * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When
     * a dependency is defined for container startup, for container shutdown it is reversed.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container
     * dependencies. However, we recommend using the latest container agent version. For information about checking your
     * agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDependency> dependsOn;
    /**
     * <p>
     * Time duration to wait before giving up on resolving dependencies for a container. For example, you specify two
     * containers in a task definition with containerA having a dependency on containerB reaching a
     * <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a <code>startTimeout</code> value
     * is specified for containerB and it does not reach the desired status within that time then containerA will give
     * up and not start. This results in the task transitioning to a <code>STOPPED</code> state.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * start timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Integer startTimeout;
    /**
     * <p>
     * Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own. The stop
     * timeout value for the container takes precedence over the <code>ECS_CONTAINER_STOP_TIMEOUT</code> container agent
     * configuration parameter, if used.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * stop timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Integer stopTimeout;
    /**
     * <p>
     * The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--hostname</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     */
    private String hostname;
    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--user</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     * <code>user:gid</code>
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
     * The working directory in which to run commands inside the container. This parameter maps to
     * <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--workdir</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * When this parameter is true, networking is disabled within the container. This parameter maps to
     * <code>NetworkDisabled</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private Boolean disableNetworking;
    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
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
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     * A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsServers;
    /**
     * <p>
     * A list of DNS search domains that are presented to the container. This parameter maps to <code>DnsSearch</code>
     * in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     * section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsSearchDomains;
    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the container. This
     * parameter maps to <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--add-host</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<HostEntry> extraHosts;
    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This field is
     * not valid for containers in tasks using the Fargate launch type.
     * </p>
     * <p>
     * This parameter maps to <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--security-opt</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> dockerSecurityOptions;
    /**
     * <p>
     * When this parameter is <code>true</code>, this allows you to deploy containerized applications that require
     * <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to <code>OpenStdin</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--interactive</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private Boolean interactive;
    /**
     * <p>
     * When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--tty</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private Boolean pseudoTerminal;
    /**
     * <p>
     * A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--label</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.18 of
     * the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     */
    private java.util.Map<String, String> dockerLabels;
    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Valid naming values are displayed in the
     * <a>Ulimit</a> data type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your container instance, log in to your container
     * instance and run the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Ulimit> ulimits;
    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the
     * same logging driver that the Docker daemon uses. However the container may use a different logging driver than
     * the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance (or on a
     * different log server for remote logging options). For more information on the options for different supported log
     * drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in
     * the Docker documentation.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     * The health check command and associated configuration parameters for the container. This parameter maps to
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>HEALTHCHECK</code>
     * parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private HealthCheck healthCheck;
    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     * containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network modes. For
     * tasks that use the <code>awsvpc</code> network mode, the container that is started last determines which
     * <code>systemControls</code> parameters take effect. For tasks that use the <code>host</code> network mode, it
     * changes the container instance's namespaced kernel parameters as well as the containers.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<SystemControl> systemControls;
    /**
     * <p>
     * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * The name of a container. If you are linking multiple containers together in a task definition, the
     * <code>name</code> of one container can be entered in the <code>links</code> of another container to connect the
     * containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. This
     * parameter maps to <code>name</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--name</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param name
     *        The name of a container. If you are linking multiple containers together in a task definition, the
     *        <code>name</code> of one container can be entered in the <code>links</code> of another container to
     *        connect the containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed. This parameter maps to <code>name</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--name</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a container. If you are linking multiple containers together in a task definition, the
     * <code>name</code> of one container can be entered in the <code>links</code> of another container to connect the
     * containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. This
     * parameter maps to <code>name</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--name</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return The name of a container. If you are linking multiple containers together in a task definition, the
     *         <code>name</code> of one container can be entered in the <code>links</code> of another container to
     *         connect the containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed. This parameter maps to <code>name</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--name</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a container. If you are linking multiple containers together in a task definition, the
     * <code>name</code> of one container can be entered in the <code>links</code> of another container to connect the
     * containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. This
     * parameter maps to <code>name</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--name</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param name
     *        The name of a container. If you are linking multiple containers together in a task definition, the
     *        <code>name</code> of one container can be entered in the <code>links</code> of another container to
     *        connect the containers. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed. This parameter maps to <code>name</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--name</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with either
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     * <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and tag
     * for the container to use. However, subsequent updates to a repository image are not propagated to already running
     * tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in Amazon ECR repositories can be specified by either using the full <code>registry/repository:tag</code>
     * or <code>registry/repository@digest</code>. For example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image used to start a container. This string is passed directly to the Docker daemon. Images in the
     *        Docker Hub registry are available by default. Other repositories are specified with either
     *        <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     *        <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and
     *        lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed.
     *        This parameter maps to <code>Image</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and
     *        tag for the container to use. However, subsequent updates to a repository image are not propagated to
     *        already running tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in Amazon ECR repositories can be specified by either using the full
     *        <code>registry/repository:tag</code> or <code>registry/repository@digest</code>. For example,
     *        <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     *        <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     *        <code>mongo</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other repositories on Docker Hub are qualified with an organization name (for example,
     *        <code>amazon/amazon-ecs-agent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other online repositories are qualified further by a domain name (for example,
     *        <code>quay.io/assemblyline/ubuntu</code>).
     *        </p>
     *        </li>
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with either
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     * <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and tag
     * for the container to use. However, subsequent updates to a repository image are not propagated to already running
     * tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in Amazon ECR repositories can be specified by either using the full <code>registry/repository:tag</code>
     * or <code>registry/repository@digest</code>. For example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The image used to start a container. This string is passed directly to the Docker daemon. Images in the
     *         Docker Hub registry are available by default. Other repositories are specified with either
     *         <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     *         <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and
     *         lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are
     *         allowed. This parameter maps to <code>Image</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image
     *         and tag for the container to use. However, subsequent updates to a repository image are not propagated to
     *         already running tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in Amazon ECR repositories can be specified by either using the full
     *         <code>registry/repository:tag</code> or <code>registry/repository@digest</code>. For example,
     *         <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     *         <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     *         <code>mongo</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in other repositories on Docker Hub are qualified with an organization name (for example,
     *         <code>amazon/amazon-ecs-agent</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Images in other online repositories are qualified further by a domain name (for example,
     *         <code>quay.io/assemblyline/ubuntu</code>).
     *         </p>
     *         </li>
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker
     * Hub registry are available by default. Other repositories are specified with either
     * <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     * <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter
     * maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>IMAGE</code> parameter of
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and tag
     * for the container to use. However, subsequent updates to a repository image are not propagated to already running
     * tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in Amazon ECR repositories can be specified by either using the full <code>registry/repository:tag</code>
     * or <code>registry/repository@digest</code>. For example,
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     * <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     * <code>mongo</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other repositories on Docker Hub are qualified with an organization name (for example,
     * <code>amazon/amazon-ecs-agent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Images in other online repositories are qualified further by a domain name (for example,
     * <code>quay.io/assemblyline/ubuntu</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param image
     *        The image used to start a container. This string is passed directly to the Docker daemon. Images in the
     *        Docker Hub registry are available by default. Other repositories are specified with either
     *        <code> <i>repository-url</i>/<i>image</i>:<i>tag</i> </code> or
     *        <code> <i>repository-url</i>/<i>image</i>@<i>digest</i> </code>. Up to 255 letters (uppercase and
     *        lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed.
     *        This parameter maps to <code>Image</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>IMAGE</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When a new task starts, the Amazon ECS container agent pulls the latest version of the specified image and
     *        tag for the container to use. However, subsequent updates to a repository image are not propagated to
     *        already running tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in Amazon ECR repositories can be specified by either using the full
     *        <code>registry/repository:tag</code> or <code>registry/repository@digest</code>. For example,
     *        <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest</code> or
     *        <code>012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;@sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in official repositories on Docker Hub use a single name (for example, <code>ubuntu</code> or
     *        <code>mongo</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other repositories on Docker Hub are qualified with an organization name (for example,
     *        <code>amazon/amazon-ecs-agent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Images in other online repositories are qualified further by a domain name (for example,
     *        <code>quay.io/assemblyline/ubuntu</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withImage(String image) {
        setImage(image);
        return this;
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

    public ContainerDefinition withRepositoryCredentials(RepositoryCredentials repositoryCredentials) {
        setRepositoryCredentials(repositoryCredentials);
        return this;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container. This parameter maps to <code>CpuShares</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * This field is optional for tasks using the Fargate launch type, and the only requirement is that the total amount
     * of CPU reserved for all containers within a task be lower than the task-level <code>cpu</code> value.
     * </p>
     * <note>
     * <p>
     * You can determine the number of CPU units that are available per EC2 instance type by multiplying the vCPUs
     * listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instances</a>
     * detail page by 1,024.
     * </p>
     * </note>
     * <p>
     * For example, if you run a single-container task on a single-core instance type with 512 CPU units specified for
     * that container, and that is the only task running on the container instance, that container could use the full
     * 1,024 CPU unit share at any given time. However, if you launched another copy of the same task on that container
     * instance, each task would be guaranteed a minimum of 512 CPU units when needed, and each container could float to
     * higher CPU usage if the other container was not using it, but if both tasks were 100% active all of the time,
     * they would be limited to 512 CPU units.
     * </p>
     * <p>
     * Linux containers share unallocated CPU units with other containers on the container instance with the same ratio
     * as their allocated amount. For example, if you run a single-container task on a single-core instance type with
     * 512 CPU units specified for that container, and that is the only task running on the container instance, that
     * container could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     * same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when needed, and
     * each container could float to higher CPU usage if the other container was not using it, but if both tasks were
     * 100% active all of the time, they would be limited to 512 CPU units.
     * </p>
     * <p>
     * On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate the
     * relative CPU share ratios for running containers. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the Docker
     * documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the CPU parameter is
     * not required, and you can use CPU values below 2 in your container definitions. For CPU values below 2 (including
     * null), the behavior varies based on your Amazon ECS container agent version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0, which
     * Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux kernel
     * converts to two CPU shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to Docker as 2.
     * </p>
     * </li>
     * </ul>
     * <p>
     * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows containers
     * only have access to the specified amount of CPU that is described in the task definition.
     * </p>
     * 
     * @param cpu
     *        The number of <code>cpu</code> units reserved for the container. This parameter maps to
     *        <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        This field is optional for tasks using the Fargate launch type, and the only requirement is that the total
     *        amount of CPU reserved for all containers within a task be lower than the task-level <code>cpu</code>
     *        value.
     *        </p>
     *        <note>
     *        <p>
     *        You can determine the number of CPU units that are available per EC2 instance type by multiplying the
     *        vCPUs listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instances</a> detail page by 1,024.
     *        </p>
     *        </note>
     *        <p>
     *        For example, if you run a single-container task on a single-core instance type with 512 CPU units
     *        specified for that container, and that is the only task running on the container instance, that container
     *        could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     *        same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when
     *        needed, and each container could float to higher CPU usage if the other container was not using it, but if
     *        both tasks were 100% active all of the time, they would be limited to 512 CPU units.
     *        </p>
     *        <p>
     *        Linux containers share unallocated CPU units with other containers on the container instance with the same
     *        ratio as their allocated amount. For example, if you run a single-container task on a single-core instance
     *        type with 512 CPU units specified for that container, and that is the only task running on the container
     *        instance, that container could use the full 1,024 CPU unit share at any given time. However, if you
     *        launched another copy of the same task on that container instance, each task would be guaranteed a minimum
     *        of 512 CPU units when needed, and each container could float to higher CPU usage if the other container
     *        was not using it, but if both tasks were 100% active all of the time, they would be limited to 512 CPU
     *        units.
     *        </p>
     *        <p>
     *        On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate
     *        the relative CPU share ratios for running containers. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the
     *        Docker documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the
     *        CPU parameter is not required, and you can use CPU values below 2 in your container definitions. For CPU
     *        values below 2 (including null), the behavior varies based on your Amazon ECS container agent version:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0,
     *        which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux
     *        kernel converts to two CPU shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to Docker
     *        as 2.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows
     *        containers only have access to the specified amount of CPU that is described in the task definition.
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container. This parameter maps to <code>CpuShares</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * This field is optional for tasks using the Fargate launch type, and the only requirement is that the total amount
     * of CPU reserved for all containers within a task be lower than the task-level <code>cpu</code> value.
     * </p>
     * <note>
     * <p>
     * You can determine the number of CPU units that are available per EC2 instance type by multiplying the vCPUs
     * listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instances</a>
     * detail page by 1,024.
     * </p>
     * </note>
     * <p>
     * For example, if you run a single-container task on a single-core instance type with 512 CPU units specified for
     * that container, and that is the only task running on the container instance, that container could use the full
     * 1,024 CPU unit share at any given time. However, if you launched another copy of the same task on that container
     * instance, each task would be guaranteed a minimum of 512 CPU units when needed, and each container could float to
     * higher CPU usage if the other container was not using it, but if both tasks were 100% active all of the time,
     * they would be limited to 512 CPU units.
     * </p>
     * <p>
     * Linux containers share unallocated CPU units with other containers on the container instance with the same ratio
     * as their allocated amount. For example, if you run a single-container task on a single-core instance type with
     * 512 CPU units specified for that container, and that is the only task running on the container instance, that
     * container could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     * same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when needed, and
     * each container could float to higher CPU usage if the other container was not using it, but if both tasks were
     * 100% active all of the time, they would be limited to 512 CPU units.
     * </p>
     * <p>
     * On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate the
     * relative CPU share ratios for running containers. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the Docker
     * documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the CPU parameter is
     * not required, and you can use CPU values below 2 in your container definitions. For CPU values below 2 (including
     * null), the behavior varies based on your Amazon ECS container agent version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0, which
     * Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux kernel
     * converts to two CPU shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to Docker as 2.
     * </p>
     * </li>
     * </ul>
     * <p>
     * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows containers
     * only have access to the specified amount of CPU that is described in the task definition.
     * </p>
     * 
     * @return The number of <code>cpu</code> units reserved for the container. This parameter maps to
     *         <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p>
     *         <p>
     *         This field is optional for tasks using the Fargate launch type, and the only requirement is that the
     *         total amount of CPU reserved for all containers within a task be lower than the task-level
     *         <code>cpu</code> value.
     *         </p>
     *         <note>
     *         <p>
     *         You can determine the number of CPU units that are available per EC2 instance type by multiplying the
     *         vCPUs listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *         Instances</a> detail page by 1,024.
     *         </p>
     *         </note>
     *         <p>
     *         For example, if you run a single-container task on a single-core instance type with 512 CPU units
     *         specified for that container, and that is the only task running on the container instance, that container
     *         could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     *         same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when
     *         needed, and each container could float to higher CPU usage if the other container was not using it, but
     *         if both tasks were 100% active all of the time, they would be limited to 512 CPU units.
     *         </p>
     *         <p>
     *         Linux containers share unallocated CPU units with other containers on the container instance with the
     *         same ratio as their allocated amount. For example, if you run a single-container task on a single-core
     *         instance type with 512 CPU units specified for that container, and that is the only task running on the
     *         container instance, that container could use the full 1,024 CPU unit share at any given time. However, if
     *         you launched another copy of the same task on that container instance, each task would be guaranteed a
     *         minimum of 512 CPU units when needed, and each container could float to higher CPU usage if the other
     *         container was not using it, but if both tasks were 100% active all of the time, they would be limited to
     *         512 CPU units.
     *         </p>
     *         <p>
     *         On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate
     *         the relative CPU share ratios for running containers. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the
     *         Docker documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the
     *         CPU parameter is not required, and you can use CPU values below 2 in your container definitions. For CPU
     *         values below 2 (including null), the behavior varies based on your Amazon ECS container agent version:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0,
     *         which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     *         Linux kernel converts to two CPU shares.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to
     *         Docker as 2.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows
     *         containers only have access to the specified amount of CPU that is described in the task definition.
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container. This parameter maps to <code>CpuShares</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * This field is optional for tasks using the Fargate launch type, and the only requirement is that the total amount
     * of CPU reserved for all containers within a task be lower than the task-level <code>cpu</code> value.
     * </p>
     * <note>
     * <p>
     * You can determine the number of CPU units that are available per EC2 instance type by multiplying the vCPUs
     * listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instances</a>
     * detail page by 1,024.
     * </p>
     * </note>
     * <p>
     * For example, if you run a single-container task on a single-core instance type with 512 CPU units specified for
     * that container, and that is the only task running on the container instance, that container could use the full
     * 1,024 CPU unit share at any given time. However, if you launched another copy of the same task on that container
     * instance, each task would be guaranteed a minimum of 512 CPU units when needed, and each container could float to
     * higher CPU usage if the other container was not using it, but if both tasks were 100% active all of the time,
     * they would be limited to 512 CPU units.
     * </p>
     * <p>
     * Linux containers share unallocated CPU units with other containers on the container instance with the same ratio
     * as their allocated amount. For example, if you run a single-container task on a single-core instance type with
     * 512 CPU units specified for that container, and that is the only task running on the container instance, that
     * container could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     * same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when needed, and
     * each container could float to higher CPU usage if the other container was not using it, but if both tasks were
     * 100% active all of the time, they would be limited to 512 CPU units.
     * </p>
     * <p>
     * On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate the
     * relative CPU share ratios for running containers. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the Docker
     * documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the CPU parameter is
     * not required, and you can use CPU values below 2 in your container definitions. For CPU values below 2 (including
     * null), the behavior varies based on your Amazon ECS container agent version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0, which
     * Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux kernel
     * converts to two CPU shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to Docker as 2.
     * </p>
     * </li>
     * </ul>
     * <p>
     * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows containers
     * only have access to the specified amount of CPU that is described in the task definition.
     * </p>
     * 
     * @param cpu
     *        The number of <code>cpu</code> units reserved for the container. This parameter maps to
     *        <code>CpuShares</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cpu-shares</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        This field is optional for tasks using the Fargate launch type, and the only requirement is that the total
     *        amount of CPU reserved for all containers within a task be lower than the task-level <code>cpu</code>
     *        value.
     *        </p>
     *        <note>
     *        <p>
     *        You can determine the number of CPU units that are available per EC2 instance type by multiplying the
     *        vCPUs listed for that instance type on the <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instances</a> detail page by 1,024.
     *        </p>
     *        </note>
     *        <p>
     *        For example, if you run a single-container task on a single-core instance type with 512 CPU units
     *        specified for that container, and that is the only task running on the container instance, that container
     *        could use the full 1,024 CPU unit share at any given time. However, if you launched another copy of the
     *        same task on that container instance, each task would be guaranteed a minimum of 512 CPU units when
     *        needed, and each container could float to higher CPU usage if the other container was not using it, but if
     *        both tasks were 100% active all of the time, they would be limited to 512 CPU units.
     *        </p>
     *        <p>
     *        Linux containers share unallocated CPU units with other containers on the container instance with the same
     *        ratio as their allocated amount. For example, if you run a single-container task on a single-core instance
     *        type with 512 CPU units specified for that container, and that is the only task running on the container
     *        instance, that container could use the full 1,024 CPU unit share at any given time. However, if you
     *        launched another copy of the same task on that container instance, each task would be guaranteed a minimum
     *        of 512 CPU units when needed, and each container could float to higher CPU usage if the other container
     *        was not using it, but if both tasks were 100% active all of the time, they would be limited to 512 CPU
     *        units.
     *        </p>
     *        <p>
     *        On Linux container instances, the Docker daemon on the container instance uses the CPU value to calculate
     *        the relative CPU share ratios for running containers. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/run/#cpu-share-constraint">CPU share constraint</a> in the
     *        Docker documentation. The minimum valid CPU share value that the Linux kernel allows is 2. However, the
     *        CPU parameter is not required, and you can use CPU values below 2 in your container definitions. For CPU
     *        values below 2 (including null), the behavior varies based on your Amazon ECS container agent version:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Agent versions less than or equal to 1.1.0:</b> Null and zero CPU values are passed to Docker as 0,
     *        which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the Linux
     *        kernel converts to two CPU shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Agent versions greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1 are passed to Docker
     *        as 2.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota. Windows
     *        containers only have access to the specified amount of CPU that is described in the task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--memory</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * If your containers are part of a task using the Fargate launch type, this field is optional and the only
     * requirement is that the total amount of memory reserved for all containers within a task be lower than the task
     * <code>memory</code> value.
     * </p>
     * <p>
     * For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for one or
     * both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you specify both,
     * <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     * <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     * container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the
     *        memory specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        If your containers are part of a task using the Fargate launch type, this field is optional and the only
     *        requirement is that the total amount of memory reserved for all containers within a task be lower than the
     *        task <code>memory</code> value.
     *        </p>
     *        <p>
     *        For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for
     *        one or both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you
     *        specify both, <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     *        <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     *        container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     *        </p>
     *        <p>
     *        The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer
     *        than 4 MiB of memory for your containers.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--memory</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * If your containers are part of a task using the Fargate launch type, this field is optional and the only
     * requirement is that the total amount of memory reserved for all containers within a task be lower than the task
     * <code>memory</code> value.
     * </p>
     * <p>
     * For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for one or
     * both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you specify both,
     * <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     * <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     * container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     * 
     * @return The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the
     *         memory specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p>
     *         <p>
     *         If your containers are part of a task using the Fargate launch type, this field is optional and the only
     *         requirement is that the total amount of memory reserved for all containers within a task be lower than
     *         the task <code>memory</code> value.
     *         </p>
     *         <p>
     *         For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for
     *         one or both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you
     *         specify both, <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     *         <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     *         container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     *         </p>
     *         <p>
     *         The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer
     *         than 4 MiB of memory for your containers.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory
     * specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--memory</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * If your containers are part of a task using the Fargate launch type, this field is optional and the only
     * requirement is that the total amount of memory reserved for all containers within a task be lower than the task
     * <code>memory</code> value.
     * </p>
     * <p>
     * For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for one or
     * both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you specify both,
     * <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     * <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     * container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     * 
     * @param memory
     *        The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the
     *        memory specified here, the container is killed. This parameter maps to <code>Memory</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--memory</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        If your containers are part of a task using the Fargate launch type, this field is optional and the only
     *        requirement is that the total amount of memory reserved for all containers within a task be lower than the
     *        task <code>memory</code> value.
     *        </p>
     *        <p>
     *        For containers that are part of a task using the EC2 launch type, you must specify a non-zero integer for
     *        one or both of <code>memory</code> or <code>memoryReservation</code> in container definitions. If you
     *        specify both, <code>memory</code> must be greater than <code>memoryReservation</code>. If you specify
     *        <code>memoryReservation</code>, then that value is subtracted from the available memory resources for the
     *        container instance on which the container is placed. Otherwise, the value of <code>memory</code> is used.
     *        </p>
     *        <p>
     *        The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer
     *        than 4 MiB of memory for your containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy contention,
     * Docker attempts to keep the container memory to this soft limit. However, your container can consume more memory
     * when it needs to, up to either the hard limit specified with the <code>memory</code> parameter (if applicable),
     * or all of the available memory on the container instance, whichever comes first. This parameter maps to
     * <code>MemoryReservation</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--memory-reservation</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * You must specify a non-zero integer for one or both of <code>memory</code> or <code>memoryReservation</code> in
     * container definitions. If you specify both, <code>memory</code> must be greater than
     * <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that value is subtracted from
     * the available memory resources for the container instance on which the container is placed. Otherwise, the value
     * of <code>memory</code> is used.
     * </p>
     * <p>
     * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of memory for
     * short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a <code>memory</code> hard
     * limit of 300 MiB. This configuration would allow the container to only reserve 128 MiB of memory from the
     * remaining resources on the container instance, but also allow the container to consume more memory resources when
     * needed.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy
     *        contention, Docker attempts to keep the container memory to this soft limit. However, your container can
     *        consume more memory when it needs to, up to either the hard limit specified with the <code>memory</code>
     *        parameter (if applicable), or all of the available memory on the container instance, whichever comes
     *        first. This parameter maps to <code>MemoryReservation</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--memory-reservation</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        You must specify a non-zero integer for one or both of <code>memory</code> or
     *        <code>memoryReservation</code> in container definitions. If you specify both, <code>memory</code> must be
     *        greater than <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that
     *        value is subtracted from the available memory resources for the container instance on which the container
     *        is placed. Otherwise, the value of <code>memory</code> is used.
     *        </p>
     *        <p>
     *        For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of
     *        memory for short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a
     *        <code>memory</code> hard limit of 300 MiB. This configuration would allow the container to only reserve
     *        128 MiB of memory from the remaining resources on the container instance, but also allow the container to
     *        consume more memory resources when needed.
     *        </p>
     *        <p>
     *        The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer
     *        than 4 MiB of memory for your containers.
     */

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy contention,
     * Docker attempts to keep the container memory to this soft limit. However, your container can consume more memory
     * when it needs to, up to either the hard limit specified with the <code>memory</code> parameter (if applicable),
     * or all of the available memory on the container instance, whichever comes first. This parameter maps to
     * <code>MemoryReservation</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--memory-reservation</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * You must specify a non-zero integer for one or both of <code>memory</code> or <code>memoryReservation</code> in
     * container definitions. If you specify both, <code>memory</code> must be greater than
     * <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that value is subtracted from
     * the available memory resources for the container instance on which the container is placed. Otherwise, the value
     * of <code>memory</code> is used.
     * </p>
     * <p>
     * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of memory for
     * short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a <code>memory</code> hard
     * limit of 300 MiB. This configuration would allow the container to only reserve 128 MiB of memory from the
     * remaining resources on the container instance, but also allow the container to consume more memory resources when
     * needed.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     * 
     * @return The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy
     *         contention, Docker attempts to keep the container memory to this soft limit. However, your container can
     *         consume more memory when it needs to, up to either the hard limit specified with the <code>memory</code>
     *         parameter (if applicable), or all of the available memory on the container instance, whichever comes
     *         first. This parameter maps to <code>MemoryReservation</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--memory-reservation</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *         <p>
     *         You must specify a non-zero integer for one or both of <code>memory</code> or
     *         <code>memoryReservation</code> in container definitions. If you specify both, <code>memory</code> must be
     *         greater than <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that
     *         value is subtracted from the available memory resources for the container instance on which the container
     *         is placed. Otherwise, the value of <code>memory</code> is used.
     *         </p>
     *         <p>
     *         For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of
     *         memory for short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a
     *         <code>memory</code> hard limit of 300 MiB. This configuration would allow the container to only reserve
     *         128 MiB of memory from the remaining resources on the container instance, but also allow the container to
     *         consume more memory resources when needed.
     *         </p>
     *         <p>
     *         The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer
     *         than 4 MiB of memory for your containers.
     */

    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy contention,
     * Docker attempts to keep the container memory to this soft limit. However, your container can consume more memory
     * when it needs to, up to either the hard limit specified with the <code>memory</code> parameter (if applicable),
     * or all of the available memory on the container instance, whichever comes first. This parameter maps to
     * <code>MemoryReservation</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--memory-reservation</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     * run</a>.
     * </p>
     * <p>
     * You must specify a non-zero integer for one or both of <code>memory</code> or <code>memoryReservation</code> in
     * container definitions. If you specify both, <code>memory</code> must be greater than
     * <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that value is subtracted from
     * the available memory resources for the container instance on which the container is placed. Otherwise, the value
     * of <code>memory</code> is used.
     * </p>
     * <p>
     * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of memory for
     * short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a <code>memory</code> hard
     * limit of 300 MiB. This configuration would allow the container to only reserve 128 MiB of memory from the
     * remaining resources on the container instance, but also allow the container to consume more memory resources when
     * needed.
     * </p>
     * <p>
     * The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer than 4
     * MiB of memory for your containers.
     * </p>
     * 
     * @param memoryReservation
     *        The soft limit (in MiB) of memory to reserve for the container. When system memory is under heavy
     *        contention, Docker attempts to keep the container memory to this soft limit. However, your container can
     *        consume more memory when it needs to, up to either the hard limit specified with the <code>memory</code>
     *        parameter (if applicable), or all of the available memory on the container instance, whichever comes
     *        first. This parameter maps to <code>MemoryReservation</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--memory-reservation</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        You must specify a non-zero integer for one or both of <code>memory</code> or
     *        <code>memoryReservation</code> in container definitions. If you specify both, <code>memory</code> must be
     *        greater than <code>memoryReservation</code>. If you specify <code>memoryReservation</code>, then that
     *        value is subtracted from the available memory resources for the container instance on which the container
     *        is placed. Otherwise, the value of <code>memory</code> is used.
     *        </p>
     *        <p>
     *        For example, if your container normally uses 128 MiB of memory, but occasionally bursts to 256 MiB of
     *        memory for short periods of time, you can set a <code>memoryReservation</code> of 128 MiB, and a
     *        <code>memory</code> hard limit of 300 MiB. This configuration would allow the container to only reserve
     *        128 MiB of memory from the remaining resources on the container instance, but also allow the container to
     *        consume more memory resources when needed.
     *        </p>
     *        <p>
     *        The Docker daemon reserves a minimum of 4 MiB of memory for a container, so you should not specify fewer
     *        than 4 MiB of memory for your containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withMemoryReservation(Integer memoryReservation) {
        setMemoryReservation(memoryReservation);
        return this;
    }

    /**
     * <p>
     * The <code>link</code> parameter allows containers to communicate with each other without the need for port
     * mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     * <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information about
     * linking Docker containers, go to <a
     * href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     * >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps to
     * <code>Links</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     * <code>docker run</code> </a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note> <important>
     * <p>
     * Containers that are collocated on a single container instance may be able to communicate with each other without
     * requiring links or host port mappings. Network isolation is achieved on the container instance using security
     * groups and VPC settings.
     * </p>
     * </important>
     * 
     * @return The <code>link</code> parameter allows containers to communicate with each other without the need for
     *         port mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     *         <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to
     *         255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more
     *         information about linking Docker containers, go to <a
     *         href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     *         >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter
     *         maps to <code>Links</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     *         <code>docker run</code> </a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     *         </note> <important>
     *         <p>
     *         Containers that are collocated on a single container instance may be able to communicate with each other
     *         without requiring links or host port mappings. Network isolation is achieved on the container instance
     *         using security groups and VPC settings.
     *         </p>
     */

    public java.util.List<String> getLinks() {
        if (links == null) {
            links = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return links;
    }

    /**
     * <p>
     * The <code>link</code> parameter allows containers to communicate with each other without the need for port
     * mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     * <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information about
     * linking Docker containers, go to <a
     * href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     * >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps to
     * <code>Links</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     * <code>docker run</code> </a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note> <important>
     * <p>
     * Containers that are collocated on a single container instance may be able to communicate with each other without
     * requiring links or host port mappings. Network isolation is achieved on the container instance using security
     * groups and VPC settings.
     * </p>
     * </important>
     * 
     * @param links
     *        The <code>link</code> parameter allows containers to communicate with each other without the need for port
     *        mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     *        <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to
     *        255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information
     *        about linking Docker containers, go to <a
     *        href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     *        >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps
     *        to <code>Links</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     *        <code>docker run</code> </a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     *        </note> <important>
     *        <p>
     *        Containers that are collocated on a single container instance may be able to communicate with each other
     *        without requiring links or host port mappings. Network isolation is achieved on the container instance
     *        using security groups and VPC settings.
     *        </p>
     */

    public void setLinks(java.util.Collection<String> links) {
        if (links == null) {
            this.links = null;
            return;
        }

        this.links = new com.amazonaws.internal.SdkInternalList<String>(links);
    }

    /**
     * <p>
     * The <code>link</code> parameter allows containers to communicate with each other without the need for port
     * mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     * <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information about
     * linking Docker containers, go to <a
     * href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     * >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps to
     * <code>Links</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     * <code>docker run</code> </a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note> <important>
     * <p>
     * Containers that are collocated on a single container instance may be able to communicate with each other without
     * requiring links or host port mappings. Network isolation is achieved on the container instance using security
     * groups and VPC settings.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinks(java.util.Collection)} or {@link #withLinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param links
     *        The <code>link</code> parameter allows containers to communicate with each other without the need for port
     *        mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     *        <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to
     *        255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information
     *        about linking Docker containers, go to <a
     *        href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     *        >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps
     *        to <code>Links</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     *        <code>docker run</code> </a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     *        </note> <important>
     *        <p>
     *        Containers that are collocated on a single container instance may be able to communicate with each other
     *        without requiring links or host port mappings. Network isolation is achieved on the container instance
     *        using security groups and VPC settings.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withLinks(String... links) {
        if (this.links == null) {
            setLinks(new com.amazonaws.internal.SdkInternalList<String>(links.length));
        }
        for (String ele : links) {
            this.links.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>link</code> parameter allows containers to communicate with each other without the need for port
     * mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     * <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information about
     * linking Docker containers, go to <a
     * href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     * >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps to
     * <code>Links</code> in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a
     * container</a> section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     * <code>docker run</code> </a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note> <important>
     * <p>
     * Containers that are collocated on a single container instance may be able to communicate with each other without
     * requiring links or host port mappings. Network isolation is achieved on the container instance using security
     * groups and VPC settings.
     * </p>
     * </important>
     * 
     * @param links
     *        The <code>link</code> parameter allows containers to communicate with each other without the need for port
     *        mappings. Only supported if the network mode of a task definition is set to <code>bridge</code>. The
     *        <code>name:internalName</code> construct is analogous to <code>name:alias</code> in Docker links. Up to
     *        255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. For more information
     *        about linking Docker containers, go to <a
     *        href="https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/"
     *        >https://docs.docker.com/engine/userguide/networking/default_network/dockerlinks/</a>. This parameter maps
     *        to <code>Links</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--link</code> option to <a href="https://docs.docker.com/engine/reference/commandline/run/">
     *        <code>docker run</code> </a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     *        </note> <important>
     *        <p>
     *        Containers that are collocated on a single container instance may be able to communicate with each other
     *        without requiring links or host port mappings. Network isolation is achieved on the container instance
     *        using security groups and VPC settings.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withLinks(java.util.Collection<String> links) {
        setLinks(links);
        return this;
    }

    /**
     * <p>
     * The list of port mappings for the container. Port mappings allow containers to access ports on the host container
     * instance to send or receive traffic.
     * </p>
     * <p>
     * For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     * <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the
     * <code>containerPort</code>.
     * </p>
     * <p>
     * Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>. There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from the host itself.
     * </p>
     * <p>
     * This parameter maps to <code>PortBindings</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--publish</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. If the network mode of a task
     * definition is set to <code>none</code>, then you can't specify port mappings. If the network mode of a task
     * definition is set to <code>host</code>, then host ports must either be undefined or they must match the container
     * port in the port mapping.
     * </p>
     * <note>
     * <p>
     * After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments
     * are visible in the <b>Network Bindings</b> section of a container description for a selected task in the Amazon
     * ECS console. The assignments are also visible in the <code>networkBindings</code> section <a>DescribeTasks</a>
     * responses.
     * </p>
     * </note>
     * 
     * @return The list of port mappings for the container. Port mappings allow containers to access ports on the host
     *         container instance to send or receive traffic.</p>
     *         <p>
     *         For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     *         <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as
     *         the <code>containerPort</code>.
     *         </p>
     *         <p>
     *         Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>.
     *         There is no loopback for port mappings on Windows, so you cannot access a container's mapped port from
     *         the host itself.
     *         </p>
     *         <p>
     *         This parameter maps to <code>PortBindings</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--publish</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *         If the network mode of a task definition is set to <code>none</code>, then you can't specify port
     *         mappings. If the network mode of a task definition is set to <code>host</code>, then host ports must
     *         either be undefined or they must match the container port in the port mapping.
     *         </p>
     *         <note>
     *         <p>
     *         After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port
     *         assignments are visible in the <b>Network Bindings</b> section of a container description for a selected
     *         task in the Amazon ECS console. The assignments are also visible in the <code>networkBindings</code>
     *         section <a>DescribeTasks</a> responses.
     *         </p>
     */

    public java.util.List<PortMapping> getPortMappings() {
        if (portMappings == null) {
            portMappings = new com.amazonaws.internal.SdkInternalList<PortMapping>();
        }
        return portMappings;
    }

    /**
     * <p>
     * The list of port mappings for the container. Port mappings allow containers to access ports on the host container
     * instance to send or receive traffic.
     * </p>
     * <p>
     * For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     * <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the
     * <code>containerPort</code>.
     * </p>
     * <p>
     * Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>. There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from the host itself.
     * </p>
     * <p>
     * This parameter maps to <code>PortBindings</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--publish</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. If the network mode of a task
     * definition is set to <code>none</code>, then you can't specify port mappings. If the network mode of a task
     * definition is set to <code>host</code>, then host ports must either be undefined or they must match the container
     * port in the port mapping.
     * </p>
     * <note>
     * <p>
     * After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments
     * are visible in the <b>Network Bindings</b> section of a container description for a selected task in the Amazon
     * ECS console. The assignments are also visible in the <code>networkBindings</code> section <a>DescribeTasks</a>
     * responses.
     * </p>
     * </note>
     * 
     * @param portMappings
     *        The list of port mappings for the container. Port mappings allow containers to access ports on the host
     *        container instance to send or receive traffic.</p>
     *        <p>
     *        For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     *        <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as
     *        the <code>containerPort</code>.
     *        </p>
     *        <p>
     *        Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>.
     *        There is no loopback for port mappings on Windows, so you cannot access a container's mapped port from the
     *        host itself.
     *        </p>
     *        <p>
     *        This parameter maps to <code>PortBindings</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--publish</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        If the network mode of a task definition is set to <code>none</code>, then you can't specify port
     *        mappings. If the network mode of a task definition is set to <code>host</code>, then host ports must
     *        either be undefined or they must match the container port in the port mapping.
     *        </p>
     *        <note>
     *        <p>
     *        After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port
     *        assignments are visible in the <b>Network Bindings</b> section of a container description for a selected
     *        task in the Amazon ECS console. The assignments are also visible in the <code>networkBindings</code>
     *        section <a>DescribeTasks</a> responses.
     *        </p>
     */

    public void setPortMappings(java.util.Collection<PortMapping> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
            return;
        }

        this.portMappings = new com.amazonaws.internal.SdkInternalList<PortMapping>(portMappings);
    }

    /**
     * <p>
     * The list of port mappings for the container. Port mappings allow containers to access ports on the host container
     * instance to send or receive traffic.
     * </p>
     * <p>
     * For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     * <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the
     * <code>containerPort</code>.
     * </p>
     * <p>
     * Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>. There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from the host itself.
     * </p>
     * <p>
     * This parameter maps to <code>PortBindings</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--publish</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. If the network mode of a task
     * definition is set to <code>none</code>, then you can't specify port mappings. If the network mode of a task
     * definition is set to <code>host</code>, then host ports must either be undefined or they must match the container
     * port in the port mapping.
     * </p>
     * <note>
     * <p>
     * After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments
     * are visible in the <b>Network Bindings</b> section of a container description for a selected task in the Amazon
     * ECS console. The assignments are also visible in the <code>networkBindings</code> section <a>DescribeTasks</a>
     * responses.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortMappings(java.util.Collection)} or {@link #withPortMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portMappings
     *        The list of port mappings for the container. Port mappings allow containers to access ports on the host
     *        container instance to send or receive traffic.</p>
     *        <p>
     *        For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     *        <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as
     *        the <code>containerPort</code>.
     *        </p>
     *        <p>
     *        Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>.
     *        There is no loopback for port mappings on Windows, so you cannot access a container's mapped port from the
     *        host itself.
     *        </p>
     *        <p>
     *        This parameter maps to <code>PortBindings</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--publish</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        If the network mode of a task definition is set to <code>none</code>, then you can't specify port
     *        mappings. If the network mode of a task definition is set to <code>host</code>, then host ports must
     *        either be undefined or they must match the container port in the port mapping.
     *        </p>
     *        <note>
     *        <p>
     *        After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port
     *        assignments are visible in the <b>Network Bindings</b> section of a container description for a selected
     *        task in the Amazon ECS console. The assignments are also visible in the <code>networkBindings</code>
     *        section <a>DescribeTasks</a> responses.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withPortMappings(PortMapping... portMappings) {
        if (this.portMappings == null) {
            setPortMappings(new com.amazonaws.internal.SdkInternalList<PortMapping>(portMappings.length));
        }
        for (PortMapping ele : portMappings) {
            this.portMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of port mappings for the container. Port mappings allow containers to access ports on the host container
     * instance to send or receive traffic.
     * </p>
     * <p>
     * For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     * <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as the
     * <code>containerPort</code>.
     * </p>
     * <p>
     * Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>. There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from the host itself.
     * </p>
     * <p>
     * This parameter maps to <code>PortBindings</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--publish</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. If the network mode of a task
     * definition is set to <code>none</code>, then you can't specify port mappings. If the network mode of a task
     * definition is set to <code>host</code>, then host ports must either be undefined or they must match the container
     * port in the port mapping.
     * </p>
     * <note>
     * <p>
     * After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments
     * are visible in the <b>Network Bindings</b> section of a container description for a selected task in the Amazon
     * ECS console. The assignments are also visible in the <code>networkBindings</code> section <a>DescribeTasks</a>
     * responses.
     * </p>
     * </note>
     * 
     * @param portMappings
     *        The list of port mappings for the container. Port mappings allow containers to access ports on the host
     *        container instance to send or receive traffic.</p>
     *        <p>
     *        For task definitions that use the <code>awsvpc</code> network mode, you should only specify the
     *        <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as
     *        the <code>containerPort</code>.
     *        </p>
     *        <p>
     *        Port mappings on Windows use the <code>NetNAT</code> gateway address rather than <code>localhost</code>.
     *        There is no loopback for port mappings on Windows, so you cannot access a container's mapped port from the
     *        host itself.
     *        </p>
     *        <p>
     *        This parameter maps to <code>PortBindings</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--publish</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        If the network mode of a task definition is set to <code>none</code>, then you can't specify port
     *        mappings. If the network mode of a task definition is set to <code>host</code>, then host ports must
     *        either be undefined or they must match the container port in the port mapping.
     *        </p>
     *        <note>
     *        <p>
     *        After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port
     *        assignments are visible in the <b>Network Bindings</b> section of a container description for a selected
     *        task in the Amazon ECS console. The assignments are also visible in the <code>networkBindings</code>
     *        section <a>DescribeTasks</a> responses.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withPortMappings(java.util.Collection<PortMapping> portMappings) {
        setPortMappings(portMappings);
        return this;
    }

    /**
     * <p>
     * If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped. If the
     * <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not affect
     * the rest of the containers in a task. If this parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All tasks must have at least one essential container. If you have an application that is composed of multiple
     * containers, you should group containers that are used for a common purpose into components, and separate the
     * different components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param essential
     *        If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container
     *        fails or stops for any reason, all other containers that are part of the task are stopped. If the
     *        <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not
     *        affect the rest of the containers in a task. If this parameter is omitted, a container is assumed to be
     *        essential.</p>
     *        <p>
     *        All tasks must have at least one essential container. If you have an application that is composed of
     *        multiple containers, you should group containers that are used for a common purpose into components, and
     *        separate the different components into multiple task definitions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *        >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    /**
     * <p>
     * If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped. If the
     * <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not affect
     * the rest of the containers in a task. If this parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All tasks must have at least one essential container. If you have an application that is composed of multiple
     * containers, you should group containers that are used for a common purpose into components, and separate the
     * different components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container
     *         fails or stops for any reason, all other containers that are part of the task are stopped. If the
     *         <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does
     *         not affect the rest of the containers in a task. If this parameter is omitted, a container is assumed to
     *         be essential.</p>
     *         <p>
     *         All tasks must have at least one essential container. If you have an application that is composed of
     *         multiple containers, you should group containers that are used for a common purpose into components, and
     *         separate the different components into multiple task definitions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *         >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean getEssential() {
        return this.essential;
    }

    /**
     * <p>
     * If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped. If the
     * <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not affect
     * the rest of the containers in a task. If this parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All tasks must have at least one essential container. If you have an application that is composed of multiple
     * containers, you should group containers that are used for a common purpose into components, and separate the
     * different components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param essential
     *        If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container
     *        fails or stops for any reason, all other containers that are part of the task are stopped. If the
     *        <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not
     *        affect the rest of the containers in a task. If this parameter is omitted, a container is assumed to be
     *        essential.</p>
     *        <p>
     *        All tasks must have at least one essential container. If you have an application that is composed of
     *        multiple containers, you should group containers that are used for a common purpose into components, and
     *        separate the different components into multiple task definitions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *        >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEssential(Boolean essential) {
        setEssential(essential);
        return this;
    }

    /**
     * <p>
     * If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped. If the
     * <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does not affect
     * the rest of the containers in a task. If this parameter is omitted, a container is assumed to be essential.
     * </p>
     * <p>
     * All tasks must have at least one essential container. If you have an application that is composed of multiple
     * containers, you should group containers that are used for a common purpose into components, and separate the
     * different components into multiple task definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html">Application
     * Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return If the <code>essential</code> parameter of a container is marked as <code>true</code>, and that container
     *         fails or stops for any reason, all other containers that are part of the task are stopped. If the
     *         <code>essential</code> parameter of a container is marked as <code>false</code>, then its failure does
     *         not affect the rest of the containers in a task. If this parameter is omitted, a container is assumed to
     *         be essential.</p>
     *         <p>
     *         All tasks must have at least one essential container. If you have an application that is composed of
     *         multiple containers, you should group containers that are used for a common purpose into components, and
     *         separate the different components into multiple task definitions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html"
     *         >Application Architecture</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean isEssential() {
        return this.essential;
    }

    /**
     * <important>
     * <p>
     * Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code> parameters. If
     * you have problems using <code>entryPoint</code>, update your container agent or enter your commands and arguments
     * as <code>command</code> array items instead.
     * </p>
     * </important>
     * <p>
     * The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--entrypoint</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href
     * ="https://docs.docker.com/engine/reference/builder/#entrypoint">https://docs.docker.com/engine/reference/builder
     * /#entrypoint</a>.
     * </p>
     * 
     * @return <p>
     *         Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code>
     *         parameters. If you have problems using <code>entryPoint</code>, update your container agent or enter your
     *         commands and arguments as <code>command</code> array items instead.
     *         </p>
     *         </important>
     *         <p>
     *         The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--entrypoint</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/engine/reference/builder/#entrypoint">
     *         https://docs.docker.com/engine/reference/builder/#entrypoint</a>.
     */

    public java.util.List<String> getEntryPoint() {
        if (entryPoint == null) {
            entryPoint = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return entryPoint;
    }

    /**
     * <important>
     * <p>
     * Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code> parameters. If
     * you have problems using <code>entryPoint</code>, update your container agent or enter your commands and arguments
     * as <code>command</code> array items instead.
     * </p>
     * </important>
     * <p>
     * The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--entrypoint</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href
     * ="https://docs.docker.com/engine/reference/builder/#entrypoint">https://docs.docker.com/engine/reference/builder
     * /#entrypoint</a>.
     * </p>
     * 
     * @param entryPoint
     *        <p>
     *        Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code>
     *        parameters. If you have problems using <code>entryPoint</code>, update your container agent or enter your
     *        commands and arguments as <code>command</code> array items instead.
     *        </p>
     *        </important>
     *        <p>
     *        The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--entrypoint</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#entrypoint">https
     *        ://docs.docker.com/engine/reference/builder/#entrypoint</a>.
     */

    public void setEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
            return;
        }

        this.entryPoint = new com.amazonaws.internal.SdkInternalList<String>(entryPoint);
    }

    /**
     * <important>
     * <p>
     * Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code> parameters. If
     * you have problems using <code>entryPoint</code>, update your container agent or enter your commands and arguments
     * as <code>command</code> array items instead.
     * </p>
     * </important>
     * <p>
     * The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--entrypoint</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href
     * ="https://docs.docker.com/engine/reference/builder/#entrypoint">https://docs.docker.com/engine/reference/builder
     * /#entrypoint</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryPoint(java.util.Collection)} or {@link #withEntryPoint(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entryPoint
     *        <p>
     *        Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code>
     *        parameters. If you have problems using <code>entryPoint</code>, update your container agent or enter your
     *        commands and arguments as <code>command</code> array items instead.
     *        </p>
     *        </important>
     *        <p>
     *        The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--entrypoint</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#entrypoint">https
     *        ://docs.docker.com/engine/reference/builder/#entrypoint</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEntryPoint(String... entryPoint) {
        if (this.entryPoint == null) {
            setEntryPoint(new com.amazonaws.internal.SdkInternalList<String>(entryPoint.length));
        }
        for (String ele : entryPoint) {
            this.entryPoint.add(ele);
        }
        return this;
    }

    /**
     * <important>
     * <p>
     * Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code> parameters. If
     * you have problems using <code>entryPoint</code>, update your container agent or enter your commands and arguments
     * as <code>command</code> array items instead.
     * </p>
     * </important>
     * <p>
     * The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--entrypoint</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href
     * ="https://docs.docker.com/engine/reference/builder/#entrypoint">https://docs.docker.com/engine/reference/builder
     * /#entrypoint</a>.
     * </p>
     * 
     * @param entryPoint
     *        <p>
     *        Early versions of the Amazon ECS container agent do not properly handle <code>entryPoint</code>
     *        parameters. If you have problems using <code>entryPoint</code>, update your container agent or enter your
     *        commands and arguments as <code>command</code> array items instead.
     *        </p>
     *        </important>
     *        <p>
     *        The entry point that is passed to the container. This parameter maps to <code>Entrypoint</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--entrypoint</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#entrypoint">https
     *        ://docs.docker.com/engine/reference/builder/#entrypoint</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEntryPoint(java.util.Collection<String> entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>COMMAND</code> parameter
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should
     * be a separated string in the array.
     * </p>
     * 
     * @return The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>COMMAND</code> parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *         For more information, see <a
     *         href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker
     *         .com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should be a
     *         separated string in the array.
     */

    public java.util.List<String> getCommand() {
        if (command == null) {
            command = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return command;
    }

    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>COMMAND</code> parameter
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should
     * be a separated string in the array.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>COMMAND</code> parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker
     *        .com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should be a
     *        separated string in the array.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new com.amazonaws.internal.SdkInternalList<String>(command);
    }

    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>COMMAND</code> parameter
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should
     * be a separated string in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>COMMAND</code> parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker
     *        .com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should be a
     *        separated string in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withCommand(String... command) {
        if (this.command == null) {
            setCommand(new com.amazonaws.internal.SdkInternalList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>COMMAND</code> parameter
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. For more information, see <a
     * href="https://docs.docker.com/engine/reference/builder/#cmd"
     * >https://docs.docker.com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should
     * be a separated string in the array.
     * </p>
     * 
     * @param command
     *        The command that is passed to the container. This parameter maps to <code>Cmd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>COMMAND</code> parameter to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        For more information, see <a
     *        href="https://docs.docker.com/engine/reference/builder/#cmd">https://docs.docker
     *        .com/engine/reference/builder/#cmd</a>. If there are multiple arguments, each argument should be a
     *        separated string in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important>
     * 
     * @return The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--env</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *         <important>
     *         <p>
     *         We do not recommend using plaintext environment variables for sensitive information, such as credential
     *         data.
     *         </p>
     */

    public java.util.List<KeyValuePair> getEnvironment() {
        if (environment == null) {
            environment = new com.amazonaws.internal.SdkInternalList<KeyValuePair>();
        }
        return environment;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--env</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <important>
     *        <p>
     *        We do not recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new com.amazonaws.internal.SdkInternalList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--env</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <important>
     *        <p>
     *        We do not recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEnvironment(KeyValuePair... environment) {
        if (this.environment == null) {
            setEnvironment(new com.amazonaws.internal.SdkInternalList<KeyValuePair>(environment.length));
        }
        for (KeyValuePair ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <important>
     * <p>
     * We do not recommend using plaintext environment variables for sensitive information, such as credential data.
     * </p>
     * </important>
     * 
     * @param environment
     *        The environment variables to pass to a container. This parameter maps to <code>Env</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--env</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <important>
     *        <p>
     *        We do not recommend using plaintext environment variables for sensitive information, such as credential
     *        data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volume</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers cannot mount directories on a different drive, and mount point cannot be across drives.
     * </p>
     * 
     * @return The mount points for data volumes in your container.</p>
     *         <p>
     *         This parameter maps to <code>Volumes</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--volume</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *         </p>
     *         <p>
     *         Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>.
     *         Windows containers cannot mount directories on a different drive, and mount point cannot be across
     *         drives.
     */

    public java.util.List<MountPoint> getMountPoints() {
        if (mountPoints == null) {
            mountPoints = new com.amazonaws.internal.SdkInternalList<MountPoint>();
        }
        return mountPoints;
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volume</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers cannot mount directories on a different drive, and mount point cannot be across drives.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.</p>
     *        <p>
     *        This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--volume</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        </p>
     *        <p>
     *        Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     *        containers cannot mount directories on a different drive, and mount point cannot be across drives.
     */

    public void setMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }

        this.mountPoints = new com.amazonaws.internal.SdkInternalList<MountPoint>(mountPoints);
    }

    /**
     * <p>
     * The mount points for data volumes in your container.
     * </p>
     * <p>
     * This parameter maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volume</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers cannot mount directories on a different drive, and mount point cannot be across drives.
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
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--volume</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        </p>
     *        <p>
     *        Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     *        containers cannot mount directories on a different drive, and mount point cannot be across drives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withMountPoints(MountPoint... mountPoints) {
        if (this.mountPoints == null) {
            setMountPoints(new com.amazonaws.internal.SdkInternalList<MountPoint>(mountPoints.length));
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
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volume</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     * containers cannot mount directories on a different drive, and mount point cannot be across drives.
     * </p>
     * 
     * @param mountPoints
     *        The mount points for data volumes in your container.</p>
     *        <p>
     *        This parameter maps to <code>Volumes</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--volume</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        </p>
     *        <p>
     *        Windows containers can mount whole directories on the same drive as <code>$env:ProgramData</code>. Windows
     *        containers cannot mount directories on a different drive, and mount point cannot be across drives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withMountPoints(java.util.Collection<MountPoint> mountPoints) {
        setMountPoints(mountPoints);
        return this;
    }

    /**
     * <p>
     * Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volumes-from</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--volumes-from</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     */

    public java.util.List<VolumeFrom> getVolumesFrom() {
        if (volumesFrom == null) {
            volumesFrom = new com.amazonaws.internal.SdkInternalList<VolumeFrom>();
        }
        return volumesFrom;
    }

    /**
     * <p>
     * Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volumes-from</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param volumesFrom
     *        Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--volumes-from</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     */

    public void setVolumesFrom(java.util.Collection<VolumeFrom> volumesFrom) {
        if (volumesFrom == null) {
            this.volumesFrom = null;
            return;
        }

        this.volumesFrom = new com.amazonaws.internal.SdkInternalList<VolumeFrom>(volumesFrom);
    }

    /**
     * <p>
     * Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volumes-from</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumesFrom(java.util.Collection)} or {@link #withVolumesFrom(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumesFrom
     *        Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--volumes-from</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withVolumesFrom(VolumeFrom... volumesFrom) {
        if (this.volumesFrom == null) {
            setVolumesFrom(new com.amazonaws.internal.SdkInternalList<VolumeFrom>(volumesFrom.length));
        }
        for (VolumeFrom ele : volumesFrom) {
            this.volumesFrom.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--volumes-from</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param volumesFrom
     *        Data volumes to mount from another container. This parameter maps to <code>VolumesFrom</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--volumes-from</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withVolumesFrom(java.util.Collection<VolumeFrom> volumesFrom) {
        setVolumesFrom(volumesFrom);
        return this;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux <a>KernelCapabilities</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as Linux
     *        <a>KernelCapabilities</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux <a>KernelCapabilities</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return Linux-specific modifications that are applied to the container, such as Linux
     *         <a>KernelCapabilities</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public LinuxParameters getLinuxParameters() {
        return this.linuxParameters;
    }

    /**
     * <p>
     * Linux-specific modifications that are applied to the container, such as Linux <a>KernelCapabilities</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param linuxParameters
     *        Linux-specific modifications that are applied to the container, such as Linux
     *        <a>KernelCapabilities</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withLinuxParameters(LinuxParameters linuxParameters) {
        setLinuxParameters(linuxParameters);
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The secrets to pass to the container. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *         >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public java.util.List<Secret> getSecrets() {
        if (secrets == null) {
            secrets = new com.amazonaws.internal.SdkInternalList<Secret>();
        }
        return secrets;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *        >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setSecrets(java.util.Collection<Secret> secrets) {
        if (secrets == null) {
            this.secrets = null;
            return;
        }

        this.secrets = new com.amazonaws.internal.SdkInternalList<Secret>(secrets);
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecrets(java.util.Collection)} or {@link #withSecrets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *        >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withSecrets(Secret... secrets) {
        if (this.secrets == null) {
            setSecrets(new com.amazonaws.internal.SdkInternalList<Secret>(secrets.length));
        }
        for (Secret ele : secrets) {
            this.secrets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the container. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html">Specifying
     * Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param secrets
     *        The secrets to pass to the container. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html"
     *        >Specifying Sensitive Data</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withSecrets(java.util.Collection<Secret> secrets) {
        setSecrets(secrets);
        return this;
    }

    /**
     * <p>
     * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When
     * a dependency is defined for container startup, for container shutdown it is reversed.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container
     * dependencies. However, we recommend using the latest container agent version. For information about checking your
     * agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The dependencies defined for container startup and shutdown. A container can contain multiple
     *         dependencies. When a dependency is defined for container startup, for container shutdown it is
     *         reversed.</p>
     *         <p>
     *         Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable
     *         container dependencies. However, we recommend using the latest container agent version. For information
     *         about checking your agent version and updating to the latest version, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *         Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *         using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *         <code>ecs-init</code> package. If your container instances are launched from version
     *         <code>20190301</code> or later, then they contain the required versions of the container agent and
     *         <code>ecs-init</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *         ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public java.util.List<ContainerDependency> getDependsOn() {
        if (dependsOn == null) {
            dependsOn = new com.amazonaws.internal.SdkInternalList<ContainerDependency>();
        }
        return dependsOn;
    }

    /**
     * <p>
     * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When
     * a dependency is defined for container startup, for container shutdown it is reversed.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container
     * dependencies. However, we recommend using the latest container agent version. For information about checking your
     * agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param dependsOn
     *        The dependencies defined for container startup and shutdown. A container can contain multiple
     *        dependencies. When a dependency is defined for container startup, for container shutdown it is
     *        reversed.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable
     *        container dependencies. However, we recommend using the latest container agent version. For information
     *        about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setDependsOn(java.util.Collection<ContainerDependency> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new com.amazonaws.internal.SdkInternalList<ContainerDependency>(dependsOn);
    }

    /**
     * <p>
     * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When
     * a dependency is defined for container startup, for container shutdown it is reversed.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container
     * dependencies. However, we recommend using the latest container agent version. For information about checking your
     * agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        The dependencies defined for container startup and shutdown. A container can contain multiple
     *        dependencies. When a dependency is defined for container startup, for container shutdown it is
     *        reversed.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable
     *        container dependencies. However, we recommend using the latest container agent version. For information
     *        about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDependsOn(ContainerDependency... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new com.amazonaws.internal.SdkInternalList<ContainerDependency>(dependsOn.length));
        }
        for (ContainerDependency ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dependencies defined for container startup and shutdown. A container can contain multiple dependencies. When
     * a dependency is defined for container startup, for container shutdown it is reversed.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable container
     * dependencies. However, we recommend using the latest container agent version. For information about checking your
     * agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param dependsOn
     *        The dependencies defined for container startup and shutdown. A container can contain multiple
     *        dependencies. When a dependency is defined for container startup, for container shutdown it is
     *        reversed.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable
     *        container dependencies. However, we recommend using the latest container agent version. For information
     *        about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDependsOn(java.util.Collection<ContainerDependency> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * Time duration to wait before giving up on resolving dependencies for a container. For example, you specify two
     * containers in a task definition with containerA having a dependency on containerB reaching a
     * <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a <code>startTimeout</code> value
     * is specified for containerB and it does not reach the desired status within that time then containerA will give
     * up and not start. This results in the task transitioning to a <code>STOPPED</code> state.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * start timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param startTimeout
     *        Time duration to wait before giving up on resolving dependencies for a container. For example, you specify
     *        two containers in a task definition with containerA having a dependency on containerB reaching a
     *        <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a
     *        <code>startTimeout</code> value is specified for containerB and it does not reach the desired status
     *        within that time then containerA will give up and not start. This results in the task transitioning to a
     *        <code>STOPPED</code> state.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a
     *        container start timeout value. However, we recommend using the latest container agent version. For
     *        information about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setStartTimeout(Integer startTimeout) {
        this.startTimeout = startTimeout;
    }

    /**
     * <p>
     * Time duration to wait before giving up on resolving dependencies for a container. For example, you specify two
     * containers in a task definition with containerA having a dependency on containerB reaching a
     * <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a <code>startTimeout</code> value
     * is specified for containerB and it does not reach the desired status within that time then containerA will give
     * up and not start. This results in the task transitioning to a <code>STOPPED</code> state.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * start timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Time duration to wait before giving up on resolving dependencies for a container. For example, you
     *         specify two containers in a task definition with containerA having a dependency on containerB reaching a
     *         <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a
     *         <code>startTimeout</code> value is specified for containerB and it does not reach the desired status
     *         within that time then containerA will give up and not start. This results in the task transitioning to a
     *         <code>STOPPED</code> state.</p>
     *         <p>
     *         Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a
     *         container start timeout value. However, we recommend using the latest container agent version. For
     *         information about checking your agent version and updating to the latest version, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *         Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *         using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *         <code>ecs-init</code> package. If your container instances are launched from version
     *         <code>20190301</code> or later, then they contain the required versions of the container agent and
     *         <code>ecs-init</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *         ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Integer getStartTimeout() {
        return this.startTimeout;
    }

    /**
     * <p>
     * Time duration to wait before giving up on resolving dependencies for a container. For example, you specify two
     * containers in a task definition with containerA having a dependency on containerB reaching a
     * <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a <code>startTimeout</code> value
     * is specified for containerB and it does not reach the desired status within that time then containerA will give
     * up and not start. This results in the task transitioning to a <code>STOPPED</code> state.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * start timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param startTimeout
     *        Time duration to wait before giving up on resolving dependencies for a container. For example, you specify
     *        two containers in a task definition with containerA having a dependency on containerB reaching a
     *        <code>COMPLETE</code>, <code>SUCCESS</code>, or <code>HEALTHY</code> status. If a
     *        <code>startTimeout</code> value is specified for containerB and it does not reach the desired status
     *        within that time then containerA will give up and not start. This results in the task transitioning to a
     *        <code>STOPPED</code> state.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a
     *        container start timeout value. However, we recommend using the latest container agent version. For
     *        information about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withStartTimeout(Integer startTimeout) {
        setStartTimeout(startTimeout);
        return this;
    }

    /**
     * <p>
     * Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own. The stop
     * timeout value for the container takes precedence over the <code>ECS_CONTAINER_STOP_TIMEOUT</code> container agent
     * configuration parameter, if used.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * stop timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param stopTimeout
     *        Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own.
     *        The stop timeout value for the container takes precedence over the <code>ECS_CONTAINER_STOP_TIMEOUT</code>
     *        container agent configuration parameter, if used.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a
     *        container stop timeout value. However, we recommend using the latest container agent version. For
     *        information about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setStopTimeout(Integer stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    /**
     * <p>
     * Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own. The stop
     * timeout value for the container takes precedence over the <code>ECS_CONTAINER_STOP_TIMEOUT</code> container agent
     * configuration parameter, if used.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * stop timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own.
     *         The stop timeout value for the container takes precedence over the
     *         <code>ECS_CONTAINER_STOP_TIMEOUT</code> container agent configuration parameter, if used.</p>
     *         <p>
     *         Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a
     *         container stop timeout value. However, we recommend using the latest container agent version. For
     *         information about checking your agent version and updating to the latest version, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *         Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *         using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *         <code>ecs-init</code> package. If your container instances are launched from version
     *         <code>20190301</code> or later, then they contain the required versions of the container agent and
     *         <code>ecs-init</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *         ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Integer getStopTimeout() {
        return this.stopTimeout;
    }

    /**
     * <p>
     * Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own. The stop
     * timeout value for the container takes precedence over the <code>ECS_CONTAINER_STOP_TIMEOUT</code> container agent
     * configuration parameter, if used.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a container
     * stop timeout value. However, we recommend using the latest container agent version. For information about
     * checking your agent version and updating to the latest version, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the Amazon ECS
     * Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the <code>ecs-init</code> package. If
     * your container instances are launched from version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized
     * Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param stopTimeout
     *        Time duration to wait before the container is forcefully killed if it doesn't exit normally on its own.
     *        The stop timeout value for the container takes precedence over the <code>ECS_CONTAINER_STOP_TIMEOUT</code>
     *        container agent configuration parameter, if used.</p>
     *        <p>
     *        Your Amazon ECS container instances require at least version 1.26.0 of the container agent to enable a
     *        container stop timeout value. However, we recommend using the latest container agent version. For
     *        information about checking your agent version and updating to the latest version, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html">Updating the
     *        Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. If you are
     *        using an Amazon ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the
     *        <code>ecs-init</code> package. If your container instances are launched from version <code>20190301</code>
     *        or later, then they contain the required versions of the container agent and <code>ecs-init</code>. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon
     *        ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withStopTimeout(Integer stopTimeout) {
        setStopTimeout(stopTimeout);
        return this;
    }

    /**
     * <p>
     * The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--hostname</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * 
     * @param hostname
     *        The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--hostname</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network
     *        mode.
     *        </p>
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--hostname</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * 
     * @return The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--hostname</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network
     *         mode.
     *         </p>
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--hostname</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * 
     * @param hostname
     *        The hostname to use for your container. This parameter maps to <code>Hostname</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--hostname</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        The <code>hostname</code> parameter is not supported if you are using the <code>awsvpc</code> network
     *        mode.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--user</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     * <code>user:gid</code>
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
     *        The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--user</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <p>
     *        You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     *        <code>user:gid</code>
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
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--user</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     * <code>user:gid</code>
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
     * @return The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--user</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *         <p>
     *         You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     *         <code>user:gid</code>
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
     * The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--user</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     * <code>user:gid</code>
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
     *        The user name to use inside the container. This parameter maps to <code>User</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--user</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <p>
     *        You can use the following formats. If specifying a UID or GID, you must specify it as a positive integer.
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
     *        <code>user:gid</code>
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

    public ContainerDefinition withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The working directory in which to run commands inside the container. This parameter maps to
     * <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--workdir</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory in which to run commands inside the container. This parameter maps to
     *        <code>WorkingDir</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--workdir</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The working directory in which to run commands inside the container. This parameter maps to
     * <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--workdir</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return The working directory in which to run commands inside the container. This parameter maps to
     *         <code>WorkingDir</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--workdir</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The working directory in which to run commands inside the container. This parameter maps to
     * <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--workdir</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory in which to run commands inside the container. This parameter maps to
     *        <code>WorkingDir</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--workdir</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, networking is disabled within the container. This parameter maps to
     * <code>NetworkDisabled</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param disableNetworking
     *        When this parameter is true, networking is disabled within the container. This parameter maps to
     *        <code>NetworkDisabled</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
    }

    /**
     * <p>
     * When this parameter is true, networking is disabled within the container. This parameter maps to
     * <code>NetworkDisabled</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, networking is disabled within the container. This parameter maps to
     *         <code>NetworkDisabled</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public Boolean getDisableNetworking() {
        return this.disableNetworking;
    }

    /**
     * <p>
     * When this parameter is true, networking is disabled within the container. This parameter maps to
     * <code>NetworkDisabled</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param disableNetworking
     *        When this parameter is true, networking is disabled within the container. This parameter maps to
     *        <code>NetworkDisabled</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDisableNetworking(Boolean disableNetworking) {
        setDisableNetworking(disableNetworking);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, networking is disabled within the container. This parameter maps to
     * <code>NetworkDisabled</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, networking is disabled within the container. This parameter maps to
     *         <code>NetworkDisabled</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public Boolean isDisableNetworking() {
        return this.disableNetworking;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *         </p>
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param privileged
     *        When this parameter is true, the container is given elevated privileges on the host container instance
     *        (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given elevated privileges on the host container instance (similar
     * to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--privileged</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the Fargate launch type.
     * </p>
     * </note>
     * 
     * @return When this parameter is true, the container is given elevated privileges on the host container instance
     *         (similar to the <code>root</code> user). This parameter maps to <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--privileged</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks using the Fargate launch type.
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
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     *        <code>--read-only</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
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
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     *         <code>--read-only</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
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
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     *        <code>--read-only</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        setReadonlyRootFilesystem(readonlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * When this parameter is true, the container is given read-only access to its root file system. This parameter maps
     * to <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--read-only</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
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
     *         <code>--read-only</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public Boolean isReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem;
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the
     *         <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *         section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--dns</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public java.util.List<String> getDnsServers() {
        if (dnsServers == null) {
            dnsServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsServers;
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param dnsServers
     *        A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--dns</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setDnsServers(java.util.Collection<String> dnsServers) {
        if (dnsServers == null) {
            this.dnsServers = null;
            return;
        }

        this.dnsServers = new com.amazonaws.internal.SdkInternalList<String>(dnsServers);
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsServers(java.util.Collection)} or {@link #withDnsServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsServers
     *        A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--dns</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDnsServers(String... dnsServers) {
        if (this.dnsServers == null) {
            setDnsServers(new com.amazonaws.internal.SdkInternalList<String>(dnsServers.length));
        }
        for (String ele : dnsServers) {
            this.dnsServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param dnsServers
     *        A list of DNS servers that are presented to the container. This parameter maps to <code>Dns</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--dns</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.</p>
     *        <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDnsServers(java.util.Collection<String> dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container. This parameter maps to <code>DnsSearch</code>
     * in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     * section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return A list of DNS search domains that are presented to the container. This parameter maps to
     *         <code>DnsSearch</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public java.util.List<String> getDnsSearchDomains() {
        if (dnsSearchDomains == null) {
            dnsSearchDomains = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsSearchDomains;
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container. This parameter maps to <code>DnsSearch</code>
     * in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     * section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param dnsSearchDomains
     *        A list of DNS search domains that are presented to the container. This parameter maps to
     *        <code>DnsSearch</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setDnsSearchDomains(java.util.Collection<String> dnsSearchDomains) {
        if (dnsSearchDomains == null) {
            this.dnsSearchDomains = null;
            return;
        }

        this.dnsSearchDomains = new com.amazonaws.internal.SdkInternalList<String>(dnsSearchDomains);
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container. This parameter maps to <code>DnsSearch</code>
     * in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     * section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsSearchDomains(java.util.Collection)} or {@link #withDnsSearchDomains(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dnsSearchDomains
     *        A list of DNS search domains that are presented to the container. This parameter maps to
     *        <code>DnsSearch</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDnsSearchDomains(String... dnsSearchDomains) {
        if (this.dnsSearchDomains == null) {
            setDnsSearchDomains(new com.amazonaws.internal.SdkInternalList<String>(dnsSearchDomains.length));
        }
        for (String ele : dnsSearchDomains) {
            this.dnsSearchDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DNS search domains that are presented to the container. This parameter maps to <code>DnsSearch</code>
     * in the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     * section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     * <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param dnsSearchDomains
     *        A list of DNS search domains that are presented to the container. This parameter maps to
     *        <code>DnsSearch</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--dns-search</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDnsSearchDomains(java.util.Collection<String> dnsSearchDomains) {
        setDnsSearchDomains(dnsSearchDomains);
        return this;
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the container. This
     * parameter maps to <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--add-host</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * 
     * @return A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the
     *         container. This parameter maps to <code>ExtraHosts</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--add-host</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network
     *         mode.
     *         </p>
     */

    public java.util.List<HostEntry> getExtraHosts() {
        if (extraHosts == null) {
            extraHosts = new com.amazonaws.internal.SdkInternalList<HostEntry>();
        }
        return extraHosts;
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the container. This
     * parameter maps to <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--add-host</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * 
     * @param extraHosts
     *        A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the
     *        container. This parameter maps to <code>ExtraHosts</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--add-host</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network
     *        mode.
     *        </p>
     */

    public void setExtraHosts(java.util.Collection<HostEntry> extraHosts) {
        if (extraHosts == null) {
            this.extraHosts = null;
            return;
        }

        this.extraHosts = new com.amazonaws.internal.SdkInternalList<HostEntry>(extraHosts);
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the container. This
     * parameter maps to <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--add-host</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtraHosts(java.util.Collection)} or {@link #withExtraHosts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extraHosts
     *        A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the
     *        container. This parameter maps to <code>ExtraHosts</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--add-host</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network
     *        mode.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withExtraHosts(HostEntry... extraHosts) {
        if (this.extraHosts == null) {
            setExtraHosts(new com.amazonaws.internal.SdkInternalList<HostEntry>(extraHosts.length));
        }
        for (HostEntry ele : extraHosts) {
            this.extraHosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the container. This
     * parameter maps to <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--add-host</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * 
     * @param extraHosts
     *        A list of hostnames and IP address mappings to append to the <code>/etc/hosts</code> file on the
     *        container. This parameter maps to <code>ExtraHosts</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--add-host</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers or tasks that use the <code>awsvpc</code> network
     *        mode.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withExtraHosts(java.util.Collection<HostEntry> extraHosts) {
        setExtraHosts(extraHosts);
        return this;
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This field is
     * not valid for containers in tasks using the Fargate launch type.
     * </p>
     * <p>
     * This parameter maps to <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--security-opt</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This
     *         field is not valid for containers in tasks using the Fargate launch type.</p>
     *         <p>
     *         This parameter maps to <code>SecurityOpt</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--security-opt</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon ECS container agent running on a container instance must register with the
     *         <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables
     *         before containers placed on that instance can use these security options. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *         Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public java.util.List<String> getDockerSecurityOptions() {
        if (dockerSecurityOptions == null) {
            dockerSecurityOptions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dockerSecurityOptions;
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This field is
     * not valid for containers in tasks using the Fargate launch type.
     * </p>
     * <p>
     * This parameter maps to <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--security-opt</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param dockerSecurityOptions
     *        A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This
     *        field is not valid for containers in tasks using the Fargate launch type.</p>
     *        <p>
     *        This parameter maps to <code>SecurityOpt</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--security-opt</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register with the
     *        <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables
     *        before containers placed on that instance can use these security options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setDockerSecurityOptions(java.util.Collection<String> dockerSecurityOptions) {
        if (dockerSecurityOptions == null) {
            this.dockerSecurityOptions = null;
            return;
        }

        this.dockerSecurityOptions = new com.amazonaws.internal.SdkInternalList<String>(dockerSecurityOptions);
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This field is
     * not valid for containers in tasks using the Fargate launch type.
     * </p>
     * <p>
     * This parameter maps to <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--security-opt</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDockerSecurityOptions(java.util.Collection)} or
     * {@link #withDockerSecurityOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dockerSecurityOptions
     *        A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This
     *        field is not valid for containers in tasks using the Fargate launch type.</p>
     *        <p>
     *        This parameter maps to <code>SecurityOpt</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--security-opt</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register with the
     *        <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables
     *        before containers placed on that instance can use these security options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDockerSecurityOptions(String... dockerSecurityOptions) {
        if (this.dockerSecurityOptions == null) {
            setDockerSecurityOptions(new com.amazonaws.internal.SdkInternalList<String>(dockerSecurityOptions.length));
        }
        for (String ele : dockerSecurityOptions) {
            this.dockerSecurityOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This field is
     * not valid for containers in tasks using the Fargate launch type.
     * </p>
     * <p>
     * This parameter maps to <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--security-opt</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent running on a container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param dockerSecurityOptions
     *        A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems. This
     *        field is not valid for containers in tasks using the Fargate launch type.</p>
     *        <p>
     *        This parameter maps to <code>SecurityOpt</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--security-opt</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     *        </p>
     *        <note>
     *        <p>
     *        The Amazon ECS container agent running on a container instance must register with the
     *        <code>ECS_SELINUX_CAPABLE=true</code> or <code>ECS_APPARMOR_CAPABLE=true</code> environment variables
     *        before containers placed on that instance can use these security options. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS
     *        Container Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDockerSecurityOptions(java.util.Collection<String> dockerSecurityOptions) {
        setDockerSecurityOptions(dockerSecurityOptions);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, this allows you to deploy containerized applications that require
     * <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to <code>OpenStdin</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--interactive</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param interactive
     *        When this parameter is <code>true</code>, this allows you to deploy containerized applications that
     *        require <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to
     *        <code>OpenStdin</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--interactive</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     */

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, this allows you to deploy containerized applications that require
     * <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to <code>OpenStdin</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--interactive</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, this allows you to deploy containerized applications that
     *         require <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to
     *         <code>OpenStdin</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--interactive</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     */

    public Boolean getInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, this allows you to deploy containerized applications that require
     * <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to <code>OpenStdin</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--interactive</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param interactive
     *        When this parameter is <code>true</code>, this allows you to deploy containerized applications that
     *        require <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to
     *        <code>OpenStdin</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--interactive</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withInteractive(Boolean interactive) {
        setInteractive(interactive);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, this allows you to deploy containerized applications that require
     * <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to <code>OpenStdin</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--interactive</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, this allows you to deploy containerized applications that
     *         require <code>stdin</code> or a <code>tty</code> to be allocated. This parameter maps to
     *         <code>OpenStdin</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--interactive</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     */

    public Boolean isInteractive() {
        return this.interactive;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--tty</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param pseudoTerminal
     *        When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in
     *        the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--tty</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setPseudoTerminal(Boolean pseudoTerminal) {
        this.pseudoTerminal = pseudoTerminal;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--tty</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in
     *         the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *         section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--tty</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public Boolean getPseudoTerminal() {
        return this.pseudoTerminal;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--tty</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param pseudoTerminal
     *        When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in
     *        the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--tty</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withPseudoTerminal(Boolean pseudoTerminal) {
        setPseudoTerminal(pseudoTerminal);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--tty</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, a TTY is allocated. This parameter maps to <code>Tty</code> in
     *         the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *         section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--tty</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public Boolean isPseudoTerminal() {
        return this.pseudoTerminal;
    }

    /**
     * <p>
     * A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--label</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.18 of
     * the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * 
     * @return A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--label</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log in to your container instance and run
     *         the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     */

    public java.util.Map<String, String> getDockerLabels() {
        return dockerLabels;
    }

    /**
     * <p>
     * A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--label</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.18 of
     * the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * 
     * @param dockerLabels
     *        A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--label</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     */

    public void setDockerLabels(java.util.Map<String, String> dockerLabels) {
        this.dockerLabels = dockerLabels;
    }

    /**
     * <p>
     * A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--label</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. This parameter requires version 1.18 of
     * the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * 
     * @param dockerLabels
     *        A key/value map of labels to add to the container. This parameter maps to <code>Labels</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--label</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withDockerLabels(java.util.Map<String, String> dockerLabels) {
        setDockerLabels(dockerLabels);
        return this;
    }

    public ContainerDefinition addDockerLabelsEntry(String key, String value) {
        if (null == this.dockerLabels) {
            this.dockerLabels = new java.util.HashMap<String, String>();
        }
        if (this.dockerLabels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dockerLabels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DockerLabels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition clearDockerLabelsEntries() {
        this.dockerLabels = null;
        return this;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Valid naming values are displayed in the
     * <a>Ulimit</a> data type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your container instance, log in to your container
     * instance and run the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @return A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in
     *         the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *         section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *         Valid naming values are displayed in the <a>Ulimit</a> data type. This parameter requires version 1.18 of
     *         the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *         your container instance, log in to your container instance and run the following command:
     *         <code>sudo docker version --format '{{.Server.APIVersion}}'</code> </p> <note>
     *         <p>
     *         This parameter is not supported for Windows containers.
     *         </p>
     */

    public java.util.List<Ulimit> getUlimits() {
        if (ulimits == null) {
            ulimits = new com.amazonaws.internal.SdkInternalList<Ulimit>();
        }
        return ulimits;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Valid naming values are displayed in the
     * <a>Ulimit</a> data type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your container instance, log in to your container
     * instance and run the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        Valid naming values are displayed in the <a>Ulimit</a> data type. This parameter requires version 1.18 of
     *        the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *        your container instance, log in to your container instance and run the following command:
     *        <code>sudo docker version --format '{{.Server.APIVersion}}'</code> </p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     */

    public void setUlimits(java.util.Collection<Ulimit> ulimits) {
        if (ulimits == null) {
            this.ulimits = null;
            return;
        }

        this.ulimits = new com.amazonaws.internal.SdkInternalList<Ulimit>(ulimits);
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Valid naming values are displayed in the
     * <a>Ulimit</a> data type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your container instance, log in to your container
     * instance and run the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     *        A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        Valid naming values are displayed in the <a>Ulimit</a> data type. This parameter requires version 1.18 of
     *        the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *        your container instance, log in to your container instance and run the following command:
     *        <code>sudo docker version --format '{{.Server.APIVersion}}'</code> </p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withUlimits(Ulimit... ulimits) {
        if (this.ulimits == null) {
            setUlimits(new com.amazonaws.internal.SdkInternalList<Ulimit>(ulimits.length));
        }
        for (Ulimit ele : ulimits) {
            this.ulimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--ulimit</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. Valid naming values are displayed in the
     * <a>Ulimit</a> data type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your container instance, log in to your container
     * instance and run the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers.
     * </p>
     * </note>
     * 
     * @param ulimits
     *        A list of <code>ulimits</code> to set in the container. This parameter maps to <code>Ulimits</code> in the
     *        <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a>
     *        section of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--ulimit</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     *        Valid naming values are displayed in the <a>Ulimit</a> data type. This parameter requires version 1.18 of
     *        the Docker Remote API or greater on your container instance. To check the Docker Remote API version on
     *        your container instance, log in to your container instance and run the following command:
     *        <code>sudo docker version --format '{{.Server.APIVersion}}'</code> </p> <note>
     *        <p>
     *        This parameter is not supported for Windows containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withUlimits(java.util.Collection<Ulimit> ulimits) {
        setUlimits(ulimits);
        return this;
    }

    /**
     * <p>
     * The log configuration specification for the container.
     * </p>
     * <p>
     * If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the
     * same logging driver that the Docker daemon uses. However the container may use a different logging driver than
     * the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance (or on a
     * different log server for remote logging options). For more information on the options for different supported log
     * drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in
     * the Docker documentation.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     *        If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     *        </p>
     *        <p>
     *        This parameter maps to <code>LogConfig</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. By default, containers use the same logging driver that the Docker daemon uses. However the
     *        container may use a different logging driver than the Docker daemon by specifying a log driver with this
     *        parameter in the container definition. To use a different logging driver for a container, the log system
     *        must be configured properly on the container instance (or on a different log server for remote logging
     *        options). For more information on the options for different supported log drivers, see <a
     *        href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     *        documentation.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *        <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the
     *        Amazon ECS container agent.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     * If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the
     * same logging driver that the Docker daemon uses. However the container may use a different logging driver than
     * the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance (or on a
     * different log server for remote logging options). For more information on the options for different supported log
     * drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in
     * the Docker documentation.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     *         If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     *         </p>
     *         <p>
     *         This parameter maps to <code>LogConfig</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. By default, containers use the same logging driver that the Docker daemon uses. However the
     *         container may use a different logging driver than the Docker daemon by specifying a log driver with this
     *         parameter in the container definition. To use a different logging driver for a container, the log system
     *         must be configured properly on the container instance (or on a different log server for remote logging
     *         options). For more information on the options for different supported log drivers, see <a
     *         href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     *         documentation.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in
     *         the <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the
     *         Amazon ECS container agent.
     *         </p>
     *         </note>
     *         <p>
     *         This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *         check the Docker Remote API version on your container instance, log in to your container instance and run
     *         the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     * If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     * </p>
     * <p>
     * This parameter maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--log-driver</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>. By default, containers use the
     * same logging driver that the Docker daemon uses. However the container may use a different logging driver than
     * the Docker daemon by specifying a log driver with this parameter in the container definition. To use a different
     * logging driver for a container, the log system must be configured properly on the container instance (or on a
     * different log server for remote logging options). For more information on the options for different supported log
     * drivers, see <a href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in
     * the Docker documentation.
     * </p>
     * <note>
     * <p>
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     * <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     * </p>
     * </note>
     * <p>
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the
     * Docker Remote API version on your container instance, log in to your container instance and run the following
     * command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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
     *        If you are using the Fargate launch type, the only supported value is <code>awslogs</code>.
     *        </p>
     *        <p>
     *        This parameter maps to <code>LogConfig</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--log-driver</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>. By default, containers use the same logging driver that the Docker daemon uses. However the
     *        container may use a different logging driver than the Docker daemon by specifying a log driver with this
     *        parameter in the container definition. To use a different logging driver for a container, the log system
     *        must be configured properly on the container instance (or on a different log server for remote logging
     *        options). For more information on the options for different supported log drivers, see <a
     *        href="https://docs.docker.com/engine/admin/logging/overview/">Configure logging drivers</a> in the Docker
     *        documentation.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon (shown in the
     *        <a>LogConfiguration</a> data type). Additional log drivers may be available in future releases of the
     *        Amazon ECS container agent.
     *        </p>
     *        </note>
     *        <p>
     *        This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To
     *        check the Docker Remote API version on your container instance, log in to your container instance and run
     *        the following command: <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
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

    public ContainerDefinition withLogConfiguration(LogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The health check command and associated configuration parameters for the container. This parameter maps to
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>HEALTHCHECK</code>
     * parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param healthCheck
     *        The health check command and associated configuration parameters for the container. This parameter maps to
     *        <code>HealthCheck</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>HEALTHCHECK</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     */

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The health check command and associated configuration parameters for the container. This parameter maps to
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>HEALTHCHECK</code>
     * parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return The health check command and associated configuration parameters for the container. This parameter maps
     *         to <code>HealthCheck</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>HEALTHCHECK</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     */

    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The health check command and associated configuration parameters for the container. This parameter maps to
     * <code>HealthCheck</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>HEALTHCHECK</code>
     * parameter of <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param healthCheck
     *        The health check command and associated configuration parameters for the container. This parameter maps to
     *        <code>HealthCheck</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>HEALTHCHECK</code> parameter of <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withHealthCheck(HealthCheck healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     * containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network modes. For
     * tasks that use the <code>awsvpc</code> network mode, the container that is started last determines which
     * <code>systemControls</code> parameters take effect. For tasks that use the <code>host</code> network mode, it
     * changes the container instance's namespaced kernel parameters as well as the containers.
     * </p>
     * </note>
     * 
     * @return A list of namespaced kernel parameters to set in the container. This parameter maps to
     *         <code>Sysctls</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--sysctl</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         It is not recommended that you specify network-related <code>systemControls</code> parameters for
     *         multiple containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code>
     *         network modes. For tasks that use the <code>awsvpc</code> network mode, the container that is started
     *         last determines which <code>systemControls</code> parameters take effect. For tasks that use the
     *         <code>host</code> network mode, it changes the container instance's namespaced kernel parameters as well
     *         as the containers.
     *         </p>
     */

    public java.util.List<SystemControl> getSystemControls() {
        if (systemControls == null) {
            systemControls = new com.amazonaws.internal.SdkInternalList<SystemControl>();
        }
        return systemControls;
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     * containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network modes. For
     * tasks that use the <code>awsvpc</code> network mode, the container that is started last determines which
     * <code>systemControls</code> parameters take effect. For tasks that use the <code>host</code> network mode, it
     * changes the container instance's namespaced kernel parameters as well as the containers.
     * </p>
     * </note>
     * 
     * @param systemControls
     *        A list of namespaced kernel parameters to set in the container. This parameter maps to
     *        <code>Sysctls</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--sysctl</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     *        containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network
     *        modes. For tasks that use the <code>awsvpc</code> network mode, the container that is started last
     *        determines which <code>systemControls</code> parameters take effect. For tasks that use the
     *        <code>host</code> network mode, it changes the container instance's namespaced kernel parameters as well
     *        as the containers.
     *        </p>
     */

    public void setSystemControls(java.util.Collection<SystemControl> systemControls) {
        if (systemControls == null) {
            this.systemControls = null;
            return;
        }

        this.systemControls = new com.amazonaws.internal.SdkInternalList<SystemControl>(systemControls);
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     * containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network modes. For
     * tasks that use the <code>awsvpc</code> network mode, the container that is started last determines which
     * <code>systemControls</code> parameters take effect. For tasks that use the <code>host</code> network mode, it
     * changes the container instance's namespaced kernel parameters as well as the containers.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSystemControls(java.util.Collection)} or {@link #withSystemControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param systemControls
     *        A list of namespaced kernel parameters to set in the container. This parameter maps to
     *        <code>Sysctls</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--sysctl</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     *        containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network
     *        modes. For tasks that use the <code>awsvpc</code> network mode, the container that is started last
     *        determines which <code>systemControls</code> parameters take effect. For tasks that use the
     *        <code>host</code> network mode, it changes the container instance's namespaced kernel parameters as well
     *        as the containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withSystemControls(SystemControl... systemControls) {
        if (this.systemControls == null) {
            setSystemControls(new com.amazonaws.internal.SdkInternalList<SystemControl>(systemControls.length));
        }
        for (SystemControl ele : systemControls) {
            this.systemControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of namespaced kernel parameters to set in the container. This parameter maps to <code>Sysctls</code> in
     * the <a href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     * of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--sysctl</code>
     * option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     * containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network modes. For
     * tasks that use the <code>awsvpc</code> network mode, the container that is started last determines which
     * <code>systemControls</code> parameters take effect. For tasks that use the <code>host</code> network mode, it
     * changes the container instance's namespaced kernel parameters as well as the containers.
     * </p>
     * </note>
     * 
     * @param systemControls
     *        A list of namespaced kernel parameters to set in the container. This parameter maps to
     *        <code>Sysctls</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--sysctl</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        It is not recommended that you specify network-related <code>systemControls</code> parameters for multiple
     *        containers in a single task that also uses either the <code>awsvpc</code> or <code>host</code> network
     *        modes. For tasks that use the <code>awsvpc</code> network mode, the container that is started last
     *        determines which <code>systemControls</code> parameters take effect. For tasks that use the
     *        <code>host</code> network mode, it changes the container instance's namespaced kernel parameters as well
     *        as the containers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withSystemControls(java.util.Collection<SystemControl> systemControls) {
        setSystemControls(systemControls);
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
        if (resourceRequirements == null) {
            resourceRequirements = new com.amazonaws.internal.SdkInternalList<ResourceRequirement>();
        }
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

        this.resourceRequirements = new com.amazonaws.internal.SdkInternalList<ResourceRequirement>(resourceRequirements);
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

    public ContainerDefinition withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (this.resourceRequirements == null) {
            setResourceRequirements(new com.amazonaws.internal.SdkInternalList<ResourceRequirement>(resourceRequirements.length));
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

    public ContainerDefinition withResourceRequirements(java.util.Collection<ResourceRequirement> resourceRequirements) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getRepositoryCredentials() != null)
            sb.append("RepositoryCredentials: ").append(getRepositoryCredentials()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getMemoryReservation() != null)
            sb.append("MemoryReservation: ").append(getMemoryReservation()).append(",");
        if (getLinks() != null)
            sb.append("Links: ").append(getLinks()).append(",");
        if (getPortMappings() != null)
            sb.append("PortMappings: ").append(getPortMappings()).append(",");
        if (getEssential() != null)
            sb.append("Essential: ").append(getEssential()).append(",");
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getMountPoints() != null)
            sb.append("MountPoints: ").append(getMountPoints()).append(",");
        if (getVolumesFrom() != null)
            sb.append("VolumesFrom: ").append(getVolumesFrom()).append(",");
        if (getLinuxParameters() != null)
            sb.append("LinuxParameters: ").append(getLinuxParameters()).append(",");
        if (getSecrets() != null)
            sb.append("Secrets: ").append(getSecrets()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getStartTimeout() != null)
            sb.append("StartTimeout: ").append(getStartTimeout()).append(",");
        if (getStopTimeout() != null)
            sb.append("StopTimeout: ").append(getStopTimeout()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getDisableNetworking() != null)
            sb.append("DisableNetworking: ").append(getDisableNetworking()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged()).append(",");
        if (getReadonlyRootFilesystem() != null)
            sb.append("ReadonlyRootFilesystem: ").append(getReadonlyRootFilesystem()).append(",");
        if (getDnsServers() != null)
            sb.append("DnsServers: ").append(getDnsServers()).append(",");
        if (getDnsSearchDomains() != null)
            sb.append("DnsSearchDomains: ").append(getDnsSearchDomains()).append(",");
        if (getExtraHosts() != null)
            sb.append("ExtraHosts: ").append(getExtraHosts()).append(",");
        if (getDockerSecurityOptions() != null)
            sb.append("DockerSecurityOptions: ").append(getDockerSecurityOptions()).append(",");
        if (getInteractive() != null)
            sb.append("Interactive: ").append(getInteractive()).append(",");
        if (getPseudoTerminal() != null)
            sb.append("PseudoTerminal: ").append(getPseudoTerminal()).append(",");
        if (getDockerLabels() != null)
            sb.append("DockerLabels: ").append(getDockerLabels()).append(",");
        if (getUlimits() != null)
            sb.append("Ulimits: ").append(getUlimits()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getSystemControls() != null)
            sb.append("SystemControls: ").append(getSystemControls()).append(",");
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

        if (obj instanceof ContainerDefinition == false)
            return false;
        ContainerDefinition other = (ContainerDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getRepositoryCredentials() == null ^ this.getRepositoryCredentials() == null)
            return false;
        if (other.getRepositoryCredentials() != null && other.getRepositoryCredentials().equals(this.getRepositoryCredentials()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getLinks() == null ^ this.getLinks() == null)
            return false;
        if (other.getLinks() != null && other.getLinks().equals(this.getLinks()) == false)
            return false;
        if (other.getPortMappings() == null ^ this.getPortMappings() == null)
            return false;
        if (other.getPortMappings() != null && other.getPortMappings().equals(this.getPortMappings()) == false)
            return false;
        if (other.getEssential() == null ^ this.getEssential() == null)
            return false;
        if (other.getEssential() != null && other.getEssential().equals(this.getEssential()) == false)
            return false;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getMountPoints() == null ^ this.getMountPoints() == null)
            return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false)
            return false;
        if (other.getVolumesFrom() == null ^ this.getVolumesFrom() == null)
            return false;
        if (other.getVolumesFrom() != null && other.getVolumesFrom().equals(this.getVolumesFrom()) == false)
            return false;
        if (other.getLinuxParameters() == null ^ this.getLinuxParameters() == null)
            return false;
        if (other.getLinuxParameters() != null && other.getLinuxParameters().equals(this.getLinuxParameters()) == false)
            return false;
        if (other.getSecrets() == null ^ this.getSecrets() == null)
            return false;
        if (other.getSecrets() != null && other.getSecrets().equals(this.getSecrets()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getStartTimeout() == null ^ this.getStartTimeout() == null)
            return false;
        if (other.getStartTimeout() != null && other.getStartTimeout().equals(this.getStartTimeout()) == false)
            return false;
        if (other.getStopTimeout() == null ^ this.getStopTimeout() == null)
            return false;
        if (other.getStopTimeout() != null && other.getStopTimeout().equals(this.getStopTimeout()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getDisableNetworking() == null ^ this.getDisableNetworking() == null)
            return false;
        if (other.getDisableNetworking() != null && other.getDisableNetworking().equals(this.getDisableNetworking()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        if (other.getReadonlyRootFilesystem() == null ^ this.getReadonlyRootFilesystem() == null)
            return false;
        if (other.getReadonlyRootFilesystem() != null && other.getReadonlyRootFilesystem().equals(this.getReadonlyRootFilesystem()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getDnsSearchDomains() == null ^ this.getDnsSearchDomains() == null)
            return false;
        if (other.getDnsSearchDomains() != null && other.getDnsSearchDomains().equals(this.getDnsSearchDomains()) == false)
            return false;
        if (other.getExtraHosts() == null ^ this.getExtraHosts() == null)
            return false;
        if (other.getExtraHosts() != null && other.getExtraHosts().equals(this.getExtraHosts()) == false)
            return false;
        if (other.getDockerSecurityOptions() == null ^ this.getDockerSecurityOptions() == null)
            return false;
        if (other.getDockerSecurityOptions() != null && other.getDockerSecurityOptions().equals(this.getDockerSecurityOptions()) == false)
            return false;
        if (other.getInteractive() == null ^ this.getInteractive() == null)
            return false;
        if (other.getInteractive() != null && other.getInteractive().equals(this.getInteractive()) == false)
            return false;
        if (other.getPseudoTerminal() == null ^ this.getPseudoTerminal() == null)
            return false;
        if (other.getPseudoTerminal() != null && other.getPseudoTerminal().equals(this.getPseudoTerminal()) == false)
            return false;
        if (other.getDockerLabels() == null ^ this.getDockerLabels() == null)
            return false;
        if (other.getDockerLabels() != null && other.getDockerLabels().equals(this.getDockerLabels()) == false)
            return false;
        if (other.getUlimits() == null ^ this.getUlimits() == null)
            return false;
        if (other.getUlimits() != null && other.getUlimits().equals(this.getUlimits()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getSystemControls() == null ^ this.getSystemControls() == null)
            return false;
        if (other.getSystemControls() != null && other.getSystemControls().equals(this.getSystemControls()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getRepositoryCredentials() == null) ? 0 : getRepositoryCredentials().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode + ((getLinks() == null) ? 0 : getLinks().hashCode());
        hashCode = prime * hashCode + ((getPortMappings() == null) ? 0 : getPortMappings().hashCode());
        hashCode = prime * hashCode + ((getEssential() == null) ? 0 : getEssential().hashCode());
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode());
        hashCode = prime * hashCode + ((getVolumesFrom() == null) ? 0 : getVolumesFrom().hashCode());
        hashCode = prime * hashCode + ((getLinuxParameters() == null) ? 0 : getLinuxParameters().hashCode());
        hashCode = prime * hashCode + ((getSecrets() == null) ? 0 : getSecrets().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getStartTimeout() == null) ? 0 : getStartTimeout().hashCode());
        hashCode = prime * hashCode + ((getStopTimeout() == null) ? 0 : getStopTimeout().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getDisableNetworking() == null) ? 0 : getDisableNetworking().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        hashCode = prime * hashCode + ((getReadonlyRootFilesystem() == null) ? 0 : getReadonlyRootFilesystem().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getDnsSearchDomains() == null) ? 0 : getDnsSearchDomains().hashCode());
        hashCode = prime * hashCode + ((getExtraHosts() == null) ? 0 : getExtraHosts().hashCode());
        hashCode = prime * hashCode + ((getDockerSecurityOptions() == null) ? 0 : getDockerSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getInteractive() == null) ? 0 : getInteractive().hashCode());
        hashCode = prime * hashCode + ((getPseudoTerminal() == null) ? 0 : getPseudoTerminal().hashCode());
        hashCode = prime * hashCode + ((getDockerLabels() == null) ? 0 : getDockerLabels().hashCode());
        hashCode = prime * hashCode + ((getUlimits() == null) ? 0 : getUlimits().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getSystemControls() == null) ? 0 : getSystemControls().hashCode());
        hashCode = prime * hashCode + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
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
        com.amazonaws.services.ecs.model.transform.ContainerDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
