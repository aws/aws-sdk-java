/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Container definitions are used in task definitions to describe the
 * different containers that are launched as part of a task.
 * </p>
 */
public class ContainerDefinition implements Serializable, Cloneable {

    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. This parameter maps to
     * <code>name</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--name</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private String name;

    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, underscores,
     * colons, periods, forward slashes, and number signs are allowed. This
     * parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>IMAGE</code> parameter of <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private String image;

    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--cpu-shares</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>You can determine the number of CPU units that are
     * available per EC2 instance type by multiplying the vCPUs listed for
     * that instance type on the <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instances</a> detail page by 1,024. </note> <p>For example, if you run
     * a single-container task on a single-core instance type with 512 CPU
     * units specified for that container, and that is the only task running
     * on the container instance, that container could use the full 1,024 CPU
     * unit share at any given time. However, if you launched another copy of
     * the same task on that container instance, each task would be
     * guaranteed a minimum of 512 CPU units when needed, and each container
     * could float to higher CPU usage if the other container was not using
     * it, but if both tasks were 100% active all of the time, they would be
     * limited to 512 CPU units. <p>The Docker daemon on the container
     * instance uses the CPU value to calculate the relative CPU share ratios
     * for running containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel allows is 2; however, the CPU
     * parameter is not required, and you can use CPU values below 2 in your
     * container definitions. For CPU values below 2 (including null), the
     * behavior varies based on your Amazon ECS container agent version: <ul>
     * <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     * CPU values are passed to Docker as 0, which Docker then converts to
     * 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     * Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     */
    private Integer cpu;

    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private Integer memory;

    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter and optionally, an <code>alias</code> for
     * the link. This construct is analogous to <code>name:alias</code> in
     * Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     * hyphens, and underscores are allowed for each <code>name</code> and
     * <code>alias</code>. For more information on linking Docker containers,
     * see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * This parameter maps to <code>Links</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--link</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/"><code>docker
     * run</code></a>. <important> <p>Containers that are collocated on a
     * single container instance may be able to communicate with each other
     * without requiring links or host port mappings. Network isolation is
     * achieved on the container instance using security groups and VPC
     * settings. </important>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> links;

    /**
     * The list of port mappings for the container. Port mappings allow
     * containers to access ports on the host container instance to send or
     * receive traffic. This parameter maps to <code>PortBindings</code> in
     * the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--publish</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappings;

    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container stops the task. If
     * the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure does not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     */
    private Boolean essential;

    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The entry point that is passed to the
     * container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--entrypoint</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPoint;

    /**
     * The command that is passed to the container. This parameter maps to
     * <code>Cmd</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>COMMAND</code> parameter to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> command;

    /**
     * The environment variables to pass to a container. This parameter maps
     * to <code>Env</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environment;

    /**
     * The mount points for data volumes in your container. This parameter
     * maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPoints;

    /**
     * Data volumes to mount from another container. This parameter maps to
     * <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volumes-from</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFrom;

    /**
     * The hostname to use for your container. This parameter maps to
     * <code>Hostname</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--hostname</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private String hostname;

    /**
     * The user name to use inside the container. This parameter maps to
     * <code>User</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private String user;

    /**
     * The working directory in which to run commands inside the container.
     * This parameter maps to <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--workdir</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private String workingDirectory;

    /**
     * When this parameter is true, networking is disabled within the
     * container. This parameter maps to <code>NetworkDisabled</code> in the
     * <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a>.
     */
    private Boolean disableNetworking;

    /**
     * When this parameter is true, the container is given elevated
     * privileges on the host container instance (similar to the
     * <code>root</code> user). This parameter maps to
     * <code>Privileged</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--privileged</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private Boolean privileged;

    /**
     * When this parameter is true, the container is given read-only access
     * to its root file system. This parameter maps to
     * <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--read-only</code> option to <code>docker
     * run</code>.
     */
    private Boolean readonlyRootFilesystem;

    /**
     * A list of DNS servers that are presented to the container. This
     * parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsServers;

    /**
     * A list of DNS search domains that are presented to the container. This
     * parameter maps to <code>DnsSearch</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns-search</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsSearchDomains;

    /**
     * A list of hostnames and IP address mappings to append to the
     * <code>/etc/hosts</code> file on the container. This parameter maps to
     * <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--add-host</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry> extraHosts;

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor
     * multi-level security systems. This parameter maps to
     * <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--security-opt</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>The Amazon ECS container agent running on a
     * container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or
     * <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dockerSecurityOptions;

    /**
     * A key/value map of labels to add to the container. This parameter maps
     * to <code>Labels</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--label</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. This parameter requires version 1.18 of the Docker Remote API
     * or greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     */
    private java.util.Map<String,String> dockerLabels;

    /**
     * A list of <code>ulimits</code> to set in the container. This parameter
     * maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     * type. This parameter requires version 1.18 of the Docker Remote API or
     * greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit> ulimits;

    /**
     * The log configuration specification for the container. This parameter
     * maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--log-driver</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid log drivers are displayed in the
     * <a>LogConfiguration</a> data type. This parameter requires version
     * 1.18 of the Docker Remote API or greater on your container instance.
     * To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command: <code>sudo
     * docker version | grep "Server API version"</code> <note> <p>The Amazon
     * ECS container agent running on a container instance must register the
     * logging drivers available on that instance with the
     * <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     * containers placed on that instance can use these log configuration
     * options. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     */
    private LogConfiguration logConfiguration;

    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. This parameter maps to
     * <code>name</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--name</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The name of a container. If you are linking multiple containers
     *         together in a task definition, the <code>name</code> of one container
     *         can be entered in the <code>links</code> of another container to
     *         connect the containers. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed. This parameter maps to
     *         <code>name</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--name</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. This parameter maps to
     * <code>name</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--name</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param name The name of a container. If you are linking multiple containers
     *         together in a task definition, the <code>name</code> of one container
     *         can be entered in the <code>links</code> of another container to
     *         connect the containers. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed. This parameter maps to
     *         <code>name</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--name</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of a container. If you are linking multiple containers
     * together in a task definition, the <code>name</code> of one container
     * can be entered in the <code>links</code> of another container to
     * connect the containers. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. This parameter maps to
     * <code>name</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--name</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of a container. If you are linking multiple containers
     *         together in a task definition, the <code>name</code> of one container
     *         can be entered in the <code>links</code> of another container to
     *         connect the containers. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed. This parameter maps to
     *         <code>name</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--name</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, underscores,
     * colons, periods, forward slashes, and number signs are allowed. This
     * parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>IMAGE</code> parameter of <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The image used to start a container. This string is passed directly to
     *         the Docker daemon. Images in the Docker Hub registry are available by
     *         default. Other repositories are specified with
     *         <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     *         letters (uppercase and lowercase), numbers, hyphens, underscores,
     *         colons, periods, forward slashes, and number signs are allowed. This
     *         parameter maps to <code>Image</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>IMAGE</code> parameter of <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public String getImage() {
        return image;
    }
    
    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, underscores,
     * colons, periods, forward slashes, and number signs are allowed. This
     * parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>IMAGE</code> parameter of <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param image The image used to start a container. This string is passed directly to
     *         the Docker daemon. Images in the Docker Hub registry are available by
     *         default. Other repositories are specified with
     *         <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     *         letters (uppercase and lowercase), numbers, hyphens, underscores,
     *         colons, periods, forward slashes, and number signs are allowed. This
     *         parameter maps to <code>Image</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>IMAGE</code> parameter of <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    /**
     * The image used to start a container. This string is passed directly to
     * the Docker daemon. Images in the Docker Hub registry are available by
     * default. Other repositories are specified with
     * <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, underscores,
     * colons, periods, forward slashes, and number signs are allowed. This
     * parameter maps to <code>Image</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>IMAGE</code> parameter of <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param image The image used to start a container. This string is passed directly to
     *         the Docker daemon. Images in the Docker Hub registry are available by
     *         default. Other repositories are specified with
     *         <code><i>repository-url</i>/<i>image</i>:<i>tag</i></code>. Up to 255
     *         letters (uppercase and lowercase), numbers, hyphens, underscores,
     *         colons, periods, forward slashes, and number signs are allowed. This
     *         parameter maps to <code>Image</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>IMAGE</code> parameter of <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--cpu-shares</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>You can determine the number of CPU units that are
     * available per EC2 instance type by multiplying the vCPUs listed for
     * that instance type on the <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instances</a> detail page by 1,024. </note> <p>For example, if you run
     * a single-container task on a single-core instance type with 512 CPU
     * units specified for that container, and that is the only task running
     * on the container instance, that container could use the full 1,024 CPU
     * unit share at any given time. However, if you launched another copy of
     * the same task on that container instance, each task would be
     * guaranteed a minimum of 512 CPU units when needed, and each container
     * could float to higher CPU usage if the other container was not using
     * it, but if both tasks were 100% active all of the time, they would be
     * limited to 512 CPU units. <p>The Docker daemon on the container
     * instance uses the CPU value to calculate the relative CPU share ratios
     * for running containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel allows is 2; however, the CPU
     * parameter is not required, and you can use CPU values below 2 in your
     * container definitions. For CPU values below 2 (including null), the
     * behavior varies based on your Amazon ECS container agent version: <ul>
     * <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     * CPU values are passed to Docker as 0, which Docker then converts to
     * 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     * Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     *
     * @return The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core. This parameter specifies the minimum amount of CPU to reserve
     *         for a container, and containers share unallocated CPU units with other
     *         containers on the instance with the same ratio as their allocated
     *         amount. This parameter maps to <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--cpu-shares</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>You can determine the number of CPU units that are
     *         available per EC2 instance type by multiplying the vCPUs listed for
     *         that instance type on the <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *         Instances</a> detail page by 1,024. </note> <p>For example, if you run
     *         a single-container task on a single-core instance type with 512 CPU
     *         units specified for that container, and that is the only task running
     *         on the container instance, that container could use the full 1,024 CPU
     *         unit share at any given time. However, if you launched another copy of
     *         the same task on that container instance, each task would be
     *         guaranteed a minimum of 512 CPU units when needed, and each container
     *         could float to higher CPU usage if the other container was not using
     *         it, but if both tasks were 100% active all of the time, they would be
     *         limited to 512 CPU units. <p>The Docker daemon on the container
     *         instance uses the CPU value to calculate the relative CPU share ratios
     *         for running containers. For more information, see <a
     *         href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     *         share constraint</a> in the Docker documentation. The minimum valid
     *         CPU share value that the Linux kernel allows is 2; however, the CPU
     *         parameter is not required, and you can use CPU values below 2 in your
     *         container definitions. For CPU values below 2 (including null), the
     *         behavior varies based on your Amazon ECS container agent version: <ul>
     *         <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     *         CPU values are passed to Docker as 0, which Docker then converts to
     *         1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     *         Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     *         greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     *         are passed to Docker as 2.</li></ul>
     */
    public Integer getCpu() {
        return cpu;
    }
    
    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--cpu-shares</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>You can determine the number of CPU units that are
     * available per EC2 instance type by multiplying the vCPUs listed for
     * that instance type on the <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instances</a> detail page by 1,024. </note> <p>For example, if you run
     * a single-container task on a single-core instance type with 512 CPU
     * units specified for that container, and that is the only task running
     * on the container instance, that container could use the full 1,024 CPU
     * unit share at any given time. However, if you launched another copy of
     * the same task on that container instance, each task would be
     * guaranteed a minimum of 512 CPU units when needed, and each container
     * could float to higher CPU usage if the other container was not using
     * it, but if both tasks were 100% active all of the time, they would be
     * limited to 512 CPU units. <p>The Docker daemon on the container
     * instance uses the CPU value to calculate the relative CPU share ratios
     * for running containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel allows is 2; however, the CPU
     * parameter is not required, and you can use CPU values below 2 in your
     * container definitions. For CPU values below 2 (including null), the
     * behavior varies based on your Amazon ECS container agent version: <ul>
     * <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     * CPU values are passed to Docker as 0, which Docker then converts to
     * 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     * Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     *
     * @param cpu The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core. This parameter specifies the minimum amount of CPU to reserve
     *         for a container, and containers share unallocated CPU units with other
     *         containers on the instance with the same ratio as their allocated
     *         amount. This parameter maps to <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--cpu-shares</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>You can determine the number of CPU units that are
     *         available per EC2 instance type by multiplying the vCPUs listed for
     *         that instance type on the <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *         Instances</a> detail page by 1,024. </note> <p>For example, if you run
     *         a single-container task on a single-core instance type with 512 CPU
     *         units specified for that container, and that is the only task running
     *         on the container instance, that container could use the full 1,024 CPU
     *         unit share at any given time. However, if you launched another copy of
     *         the same task on that container instance, each task would be
     *         guaranteed a minimum of 512 CPU units when needed, and each container
     *         could float to higher CPU usage if the other container was not using
     *         it, but if both tasks were 100% active all of the time, they would be
     *         limited to 512 CPU units. <p>The Docker daemon on the container
     *         instance uses the CPU value to calculate the relative CPU share ratios
     *         for running containers. For more information, see <a
     *         href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     *         share constraint</a> in the Docker documentation. The minimum valid
     *         CPU share value that the Linux kernel allows is 2; however, the CPU
     *         parameter is not required, and you can use CPU values below 2 in your
     *         container definitions. For CPU values below 2 (including null), the
     *         behavior varies based on your Amazon ECS container agent version: <ul>
     *         <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     *         CPU values are passed to Docker as 0, which Docker then converts to
     *         1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     *         Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     *         greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     *         are passed to Docker as 2.</li></ul>
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }
    
    /**
     * The number of <code>cpu</code> units reserved for the container. A
     * container instance has 1,024 <code>cpu</code> units for every CPU
     * core. This parameter specifies the minimum amount of CPU to reserve
     * for a container, and containers share unallocated CPU units with other
     * containers on the instance with the same ratio as their allocated
     * amount. This parameter maps to <code>CpuShares</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--cpu-shares</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>You can determine the number of CPU units that are
     * available per EC2 instance type by multiplying the vCPUs listed for
     * that instance type on the <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instances</a> detail page by 1,024. </note> <p>For example, if you run
     * a single-container task on a single-core instance type with 512 CPU
     * units specified for that container, and that is the only task running
     * on the container instance, that container could use the full 1,024 CPU
     * unit share at any given time. However, if you launched another copy of
     * the same task on that container instance, each task would be
     * guaranteed a minimum of 512 CPU units when needed, and each container
     * could float to higher CPU usage if the other container was not using
     * it, but if both tasks were 100% active all of the time, they would be
     * limited to 512 CPU units. <p>The Docker daemon on the container
     * instance uses the CPU value to calculate the relative CPU share ratios
     * for running containers. For more information, see <a
     * href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     * share constraint</a> in the Docker documentation. The minimum valid
     * CPU share value that the Linux kernel allows is 2; however, the CPU
     * parameter is not required, and you can use CPU values below 2 in your
     * container definitions. For CPU values below 2 (including null), the
     * behavior varies based on your Amazon ECS container agent version: <ul>
     * <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     * CPU values are passed to Docker as 0, which Docker then converts to
     * 1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     * Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     * greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     * are passed to Docker as 2.</li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cpu The number of <code>cpu</code> units reserved for the container. A
     *         container instance has 1,024 <code>cpu</code> units for every CPU
     *         core. This parameter specifies the minimum amount of CPU to reserve
     *         for a container, and containers share unallocated CPU units with other
     *         containers on the instance with the same ratio as their allocated
     *         amount. This parameter maps to <code>CpuShares</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--cpu-shares</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>You can determine the number of CPU units that are
     *         available per EC2 instance type by multiplying the vCPUs listed for
     *         that instance type on the <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *         Instances</a> detail page by 1,024. </note> <p>For example, if you run
     *         a single-container task on a single-core instance type with 512 CPU
     *         units specified for that container, and that is the only task running
     *         on the container instance, that container could use the full 1,024 CPU
     *         unit share at any given time. However, if you launched another copy of
     *         the same task on that container instance, each task would be
     *         guaranteed a minimum of 512 CPU units when needed, and each container
     *         could float to higher CPU usage if the other container was not using
     *         it, but if both tasks were 100% active all of the time, they would be
     *         limited to 512 CPU units. <p>The Docker daemon on the container
     *         instance uses the CPU value to calculate the relative CPU share ratios
     *         for running containers. For more information, see <a
     *         href="https://docs.docker.com/reference/run/#cpu-share-constraint">CPU
     *         share constraint</a> in the Docker documentation. The minimum valid
     *         CPU share value that the Linux kernel allows is 2; however, the CPU
     *         parameter is not required, and you can use CPU values below 2 in your
     *         container definitions. For CPU values below 2 (including null), the
     *         behavior varies based on your Amazon ECS container agent version: <ul>
     *         <li><b>Agent versions less than or equal to 1.1.0:</b> Null and zero
     *         CPU values are passed to Docker as 0, which Docker then converts to
     *         1,024 CPU shares. CPU values of 1 are passed to Docker as 1, which the
     *         Linux kernel converts to 2 CPU shares.</li> <li><b>Agent versions
     *         greater than or equal to 1.2.0:</b> Null, zero, and CPU values of 1
     *         are passed to Docker as 2.</li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The number of MiB of memory reserved for the container. If your
     *         container attempts to exceed the memory allocated here, the container
     *         is killed. This parameter maps to <code>Memory</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--memory</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public Integer getMemory() {
        return memory;
    }
    
    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param memory The number of MiB of memory reserved for the container. If your
     *         container attempts to exceed the memory allocated here, the container
     *         is killed. This parameter maps to <code>Memory</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--memory</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    
    /**
     * The number of MiB of memory reserved for the container. If your
     * container attempts to exceed the memory allocated here, the container
     * is killed. This parameter maps to <code>Memory</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--memory</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memory The number of MiB of memory reserved for the container. If your
     *         container attempts to exceed the memory allocated here, the container
     *         is killed. This parameter maps to <code>Memory</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--memory</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter and optionally, an <code>alias</code> for
     * the link. This construct is analogous to <code>name:alias</code> in
     * Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     * hyphens, and underscores are allowed for each <code>name</code> and
     * <code>alias</code>. For more information on linking Docker containers,
     * see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * This parameter maps to <code>Links</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--link</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/"><code>docker
     * run</code></a>. <important> <p>Containers that are collocated on a
     * single container instance may be able to communicate with each other
     * without requiring links or host port mappings. Network isolation is
     * achieved on the container instance using security groups and VPC
     * settings. </important>
     *
     * @return The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter and optionally, an <code>alias</code> for
     *         the link. This construct is analogous to <code>name:alias</code> in
     *         Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     *         hyphens, and underscores are allowed for each <code>name</code> and
     *         <code>alias</code>. For more information on linking Docker containers,
     *         see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         This parameter maps to <code>Links</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--link</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/"><code>docker
     *         run</code></a>. <important> <p>Containers that are collocated on a
     *         single container instance may be able to communicate with each other
     *         without requiring links or host port mappings. Network isolation is
     *         achieved on the container instance using security groups and VPC
     *         settings. </important>
     */
    public java.util.List<String> getLinks() {
        if (links == null) {
              links = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              links.setAutoConstruct(true);
        }
        return links;
    }
    
    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter and optionally, an <code>alias</code> for
     * the link. This construct is analogous to <code>name:alias</code> in
     * Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     * hyphens, and underscores are allowed for each <code>name</code> and
     * <code>alias</code>. For more information on linking Docker containers,
     * see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * This parameter maps to <code>Links</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--link</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/"><code>docker
     * run</code></a>. <important> <p>Containers that are collocated on a
     * single container instance may be able to communicate with each other
     * without requiring links or host port mappings. Network isolation is
     * achieved on the container instance using security groups and VPC
     * settings. </important>
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter and optionally, an <code>alias</code> for
     *         the link. This construct is analogous to <code>name:alias</code> in
     *         Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     *         hyphens, and underscores are allowed for each <code>name</code> and
     *         <code>alias</code>. For more information on linking Docker containers,
     *         see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         This parameter maps to <code>Links</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--link</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/"><code>docker
     *         run</code></a>. <important> <p>Containers that are collocated on a
     *         single container instance may be able to communicate with each other
     *         without requiring links or host port mappings. Network isolation is
     *         achieved on the container instance using security groups and VPC
     *         settings. </important>
     */
    public void setLinks(java.util.Collection<String> links) {
        if (links == null) {
            this.links = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> linksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(links.size());
        linksCopy.addAll(links);
        this.links = linksCopy;
    }
    
    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter and optionally, an <code>alias</code> for
     * the link. This construct is analogous to <code>name:alias</code> in
     * Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     * hyphens, and underscores are allowed for each <code>name</code> and
     * <code>alias</code>. For more information on linking Docker containers,
     * see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * This parameter maps to <code>Links</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--link</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/"><code>docker
     * run</code></a>. <important> <p>Containers that are collocated on a
     * single container instance may be able to communicate with each other
     * without requiring links or host port mappings. Network isolation is
     * achieved on the container instance using security groups and VPC
     * settings. </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLinks(java.util.Collection)} or {@link
     * #withLinks(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter and optionally, an <code>alias</code> for
     *         the link. This construct is analogous to <code>name:alias</code> in
     *         Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     *         hyphens, and underscores are allowed for each <code>name</code> and
     *         <code>alias</code>. For more information on linking Docker containers,
     *         see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         This parameter maps to <code>Links</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--link</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/"><code>docker
     *         run</code></a>. <important> <p>Containers that are collocated on a
     *         single container instance may be able to communicate with each other
     *         without requiring links or host port mappings. Network isolation is
     *         achieved on the container instance using security groups and VPC
     *         settings. </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withLinks(String... links) {
        if (getLinks() == null) setLinks(new java.util.ArrayList<String>(links.length));
        for (String value : links) {
            getLinks().add(value);
        }
        return this;
    }
    
    /**
     * The <code>link</code> parameter allows containers to communicate with
     * each other without the need for port mappings, using the
     * <code>name</code> parameter and optionally, an <code>alias</code> for
     * the link. This construct is analogous to <code>name:alias</code> in
     * Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     * hyphens, and underscores are allowed for each <code>name</code> and
     * <code>alias</code>. For more information on linking Docker containers,
     * see <a
     * href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     * This parameter maps to <code>Links</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--link</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/"><code>docker
     * run</code></a>. <important> <p>Containers that are collocated on a
     * single container instance may be able to communicate with each other
     * without requiring links or host port mappings. Network isolation is
     * achieved on the container instance using security groups and VPC
     * settings. </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param links The <code>link</code> parameter allows containers to communicate with
     *         each other without the need for port mappings, using the
     *         <code>name</code> parameter and optionally, an <code>alias</code> for
     *         the link. This construct is analogous to <code>name:alias</code> in
     *         Docker links. Up to 255 letters (uppercase and lowercase), numbers,
     *         hyphens, and underscores are allowed for each <code>name</code> and
     *         <code>alias</code>. For more information on linking Docker containers,
     *         see <a
     *         href="https://docs.docker.com/userguide/dockerlinks/">https://docs.docker.com/userguide/dockerlinks/</a>.
     *         This parameter maps to <code>Links</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--link</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/"><code>docker
     *         run</code></a>. <important> <p>Containers that are collocated on a
     *         single container instance may be able to communicate with each other
     *         without requiring links or host port mappings. Network isolation is
     *         achieved on the container instance using security groups and VPC
     *         settings. </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withLinks(java.util.Collection<String> links) {
        if (links == null) {
            this.links = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> linksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(links.size());
            linksCopy.addAll(links);
            this.links = linksCopy;
        }

        return this;
    }

    /**
     * The list of port mappings for the container. Port mappings allow
     * containers to access ports on the host container instance to send or
     * receive traffic. This parameter maps to <code>PortBindings</code> in
     * the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--publish</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The list of port mappings for the container. Port mappings allow
     *         containers to access ports on the host container instance to send or
     *         receive traffic. This parameter maps to <code>PortBindings</code> in
     *         the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--publish</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<PortMapping> getPortMappings() {
        if (portMappings == null) {
              portMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>();
              portMappings.setAutoConstruct(true);
        }
        return portMappings;
    }
    
    /**
     * The list of port mappings for the container. Port mappings allow
     * containers to access ports on the host container instance to send or
     * receive traffic. This parameter maps to <code>PortBindings</code> in
     * the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--publish</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param portMappings The list of port mappings for the container. Port mappings allow
     *         containers to access ports on the host container instance to send or
     *         receive traffic. This parameter maps to <code>PortBindings</code> in
     *         the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--publish</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setPortMappings(java.util.Collection<PortMapping> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>(portMappings.size());
        portMappingsCopy.addAll(portMappings);
        this.portMappings = portMappingsCopy;
    }
    
    /**
     * The list of port mappings for the container. Port mappings allow
     * containers to access ports on the host container instance to send or
     * receive traffic. This parameter maps to <code>PortBindings</code> in
     * the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--publish</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPortMappings(java.util.Collection)} or {@link
     * #withPortMappings(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portMappings The list of port mappings for the container. Port mappings allow
     *         containers to access ports on the host container instance to send or
     *         receive traffic. This parameter maps to <code>PortBindings</code> in
     *         the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--publish</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withPortMappings(PortMapping... portMappings) {
        if (getPortMappings() == null) setPortMappings(new java.util.ArrayList<PortMapping>(portMappings.length));
        for (PortMapping value : portMappings) {
            getPortMappings().add(value);
        }
        return this;
    }
    
    /**
     * The list of port mappings for the container. Port mappings allow
     * containers to access ports on the host container instance to send or
     * receive traffic. This parameter maps to <code>PortBindings</code> in
     * the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--publish</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portMappings The list of port mappings for the container. Port mappings allow
     *         containers to access ports on the host container instance to send or
     *         receive traffic. This parameter maps to <code>PortBindings</code> in
     *         the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--publish</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withPortMappings(java.util.Collection<PortMapping> portMappings) {
        if (portMappings == null) {
            this.portMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping> portMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PortMapping>(portMappings.size());
            portMappingsCopy.addAll(portMappings);
            this.portMappings = portMappingsCopy;
        }

        return this;
    }

    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container stops the task. If
     * the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure does not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     *
     * @return If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container stops the task. If
     *         the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure does not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     */
    public Boolean isEssential() {
        return essential;
    }
    
    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container stops the task. If
     * the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure does not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     *
     * @param essential If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container stops the task. If
     *         the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure does not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     */
    public void setEssential(Boolean essential) {
        this.essential = essential;
    }
    
    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container stops the task. If
     * the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure does not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param essential If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container stops the task. If
     *         the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure does not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * If the <code>essential</code> parameter of a container is marked as
     * <code>true</code>, the failure of that container stops the task. If
     * the <code>essential</code> parameter of a container is marked as
     * <code>false</code>, then its failure does not affect the rest of the
     * containers in a task. If this parameter is omitted, a container is
     * assumed to be essential. <note> <p>All tasks must have at least one
     * essential container. </note>
     *
     * @return If the <code>essential</code> parameter of a container is marked as
     *         <code>true</code>, the failure of that container stops the task. If
     *         the <code>essential</code> parameter of a container is marked as
     *         <code>false</code>, then its failure does not affect the rest of the
     *         containers in a task. If this parameter is omitted, a container is
     *         assumed to be essential. <note> <p>All tasks must have at least one
     *         essential container. </note>
     */
    public Boolean getEssential() {
        return essential;
    }

    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The entry point that is passed to the
     * container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--entrypoint</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The entry point that is passed to the
     *         container. This parameter maps to <code>Entrypoint</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--entrypoint</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     */
    public java.util.List<String> getEntryPoint() {
        if (entryPoint == null) {
              entryPoint = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              entryPoint.setAutoConstruct(true);
        }
        return entryPoint;
    }
    
    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The entry point that is passed to the
     * container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--entrypoint</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @param entryPoint <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The entry point that is passed to the
     *         container. This parameter maps to <code>Entrypoint</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--entrypoint</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     */
    public void setEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPointCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(entryPoint.size());
        entryPointCopy.addAll(entryPoint);
        this.entryPoint = entryPointCopy;
    }
    
    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The entry point that is passed to the
     * container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--entrypoint</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEntryPoint(java.util.Collection)} or {@link
     * #withEntryPoint(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entryPoint <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The entry point that is passed to the
     *         container. This parameter maps to <code>Entrypoint</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--entrypoint</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEntryPoint(String... entryPoint) {
        if (getEntryPoint() == null) setEntryPoint(new java.util.ArrayList<String>(entryPoint.length));
        for (String value : entryPoint) {
            getEntryPoint().add(value);
        }
        return this;
    }
    
    /**
     * <important> <p>Early versions of the Amazon ECS container agent do not
     * properly handle <code>entryPoint</code> parameters. If you have
     * problems using <code>entryPoint</code>, update your container agent or
     * enter your commands and arguments as <code>command</code> array items
     * instead. </important> <p>The entry point that is passed to the
     * container. This parameter maps to <code>Entrypoint</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--entrypoint</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entryPoint <important> <p>Early versions of the Amazon ECS container agent do not
     *         properly handle <code>entryPoint</code> parameters. If you have
     *         problems using <code>entryPoint</code>, update your container agent or
     *         enter your commands and arguments as <code>command</code> array items
     *         instead. </important> <p>The entry point that is passed to the
     *         container. This parameter maps to <code>Entrypoint</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--entrypoint</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#entrypoint">https://docs.docker.com/reference/builder/#entrypoint</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEntryPoint(java.util.Collection<String> entryPoint) {
        if (entryPoint == null) {
            this.entryPoint = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> entryPointCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(entryPoint.size());
            entryPointCopy.addAll(entryPoint);
            this.entryPoint = entryPointCopy;
        }

        return this;
    }

    /**
     * The command that is passed to the container. This parameter maps to
     * <code>Cmd</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>COMMAND</code> parameter to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @return The command that is passed to the container. This parameter maps to
     *         <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>COMMAND</code> parameter to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     */
    public java.util.List<String> getCommand() {
        if (command == null) {
              command = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              command.setAutoConstruct(true);
        }
        return command;
    }
    
    /**
     * The command that is passed to the container. This parameter maps to
     * <code>Cmd</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>COMMAND</code> parameter to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @param command The command that is passed to the container. This parameter maps to
     *         <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>COMMAND</code> parameter to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     */
    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> commandCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(command.size());
        commandCopy.addAll(command);
        this.command = commandCopy;
    }
    
    /**
     * The command that is passed to the container. This parameter maps to
     * <code>Cmd</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>COMMAND</code> parameter to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCommand(java.util.Collection)} or {@link
     * #withCommand(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command The command that is passed to the container. This parameter maps to
     *         <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>COMMAND</code> parameter to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCommand(String... command) {
        if (getCommand() == null) setCommand(new java.util.ArrayList<String>(command.length));
        for (String value : command) {
            getCommand().add(value);
        }
        return this;
    }
    
    /**
     * The command that is passed to the container. This parameter maps to
     * <code>Cmd</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>COMMAND</code> parameter to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. For more information, see <a
     * href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command The command that is passed to the container. This parameter maps to
     *         <code>Cmd</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>COMMAND</code> parameter to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. For more information, see <a
     *         href="https://docs.docker.com/reference/builder/#cmd">https://docs.docker.com/reference/builder/#cmd</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> commandCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(command.size());
            commandCopy.addAll(command);
            this.command = commandCopy;
        }

        return this;
    }

    /**
     * The environment variables to pass to a container. This parameter maps
     * to <code>Env</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The environment variables to pass to a container. This parameter maps
     *         to <code>Env</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--env</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<KeyValuePair> getEnvironment() {
        if (environment == null) {
              environment = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>();
              environment.setAutoConstruct(true);
        }
        return environment;
    }
    
    /**
     * The environment variables to pass to a container. This parameter maps
     * to <code>Env</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param environment The environment variables to pass to a container. This parameter maps
     *         to <code>Env</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--env</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environmentCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>(environment.size());
        environmentCopy.addAll(environment);
        this.environment = environmentCopy;
    }
    
    /**
     * The environment variables to pass to a container. This parameter maps
     * to <code>Env</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEnvironment(java.util.Collection)} or {@link
     * #withEnvironment(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environment The environment variables to pass to a container. This parameter maps
     *         to <code>Env</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--env</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEnvironment(KeyValuePair... environment) {
        if (getEnvironment() == null) setEnvironment(new java.util.ArrayList<KeyValuePair>(environment.length));
        for (KeyValuePair value : environment) {
            getEnvironment().add(value);
        }
        return this;
    }
    
    /**
     * The environment variables to pass to a container. This parameter maps
     * to <code>Env</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--env</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environment The environment variables to pass to a container. This parameter maps
     *         to <code>Env</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--env</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environmentCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>(environment.size());
            environmentCopy.addAll(environment);
            this.environment = environmentCopy;
        }

        return this;
    }

    /**
     * The mount points for data volumes in your container. This parameter
     * maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The mount points for data volumes in your container. This parameter
     *         maps to <code>Volumes</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volume</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<MountPoint> getMountPoints() {
        if (mountPoints == null) {
              mountPoints = new com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>();
              mountPoints.setAutoConstruct(true);
        }
        return mountPoints;
    }
    
    /**
     * The mount points for data volumes in your container. This parameter
     * maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param mountPoints The mount points for data volumes in your container. This parameter
     *         maps to <code>Volumes</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volume</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>(mountPoints.size());
        mountPointsCopy.addAll(mountPoints);
        this.mountPoints = mountPointsCopy;
    }
    
    /**
     * The mount points for data volumes in your container. This parameter
     * maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMountPoints(java.util.Collection)} or {@link
     * #withMountPoints(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoints The mount points for data volumes in your container. This parameter
     *         maps to <code>Volumes</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volume</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withMountPoints(MountPoint... mountPoints) {
        if (getMountPoints() == null) setMountPoints(new java.util.ArrayList<MountPoint>(mountPoints.length));
        for (MountPoint value : mountPoints) {
            getMountPoints().add(value);
        }
        return this;
    }
    
    /**
     * The mount points for data volumes in your container. This parameter
     * maps to <code>Volumes</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volume</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mountPoints The mount points for data volumes in your container. This parameter
     *         maps to <code>Volumes</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volume</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withMountPoints(java.util.Collection<MountPoint> mountPoints) {
        if (mountPoints == null) {
            this.mountPoints = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint> mountPointsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MountPoint>(mountPoints.size());
            mountPointsCopy.addAll(mountPoints);
            this.mountPoints = mountPointsCopy;
        }

        return this;
    }

    /**
     * Data volumes to mount from another container. This parameter maps to
     * <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volumes-from</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return Data volumes to mount from another container. This parameter maps to
     *         <code>VolumesFrom</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volumes-from</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<VolumeFrom> getVolumesFrom() {
        if (volumesFrom == null) {
              volumesFrom = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>();
              volumesFrom.setAutoConstruct(true);
        }
        return volumesFrom;
    }
    
    /**
     * Data volumes to mount from another container. This parameter maps to
     * <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volumes-from</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param volumesFrom Data volumes to mount from another container. This parameter maps to
     *         <code>VolumesFrom</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volumes-from</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setVolumesFrom(java.util.Collection<VolumeFrom> volumesFrom) {
        if (volumesFrom == null) {
            this.volumesFrom = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFromCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>(volumesFrom.size());
        volumesFromCopy.addAll(volumesFrom);
        this.volumesFrom = volumesFromCopy;
    }
    
    /**
     * Data volumes to mount from another container. This parameter maps to
     * <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volumes-from</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumesFrom(java.util.Collection)} or {@link
     * #withVolumesFrom(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumesFrom Data volumes to mount from another container. This parameter maps to
     *         <code>VolumesFrom</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volumes-from</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withVolumesFrom(VolumeFrom... volumesFrom) {
        if (getVolumesFrom() == null) setVolumesFrom(new java.util.ArrayList<VolumeFrom>(volumesFrom.length));
        for (VolumeFrom value : volumesFrom) {
            getVolumesFrom().add(value);
        }
        return this;
    }
    
    /**
     * Data volumes to mount from another container. This parameter maps to
     * <code>VolumesFrom</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--volumes-from</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumesFrom Data volumes to mount from another container. This parameter maps to
     *         <code>VolumesFrom</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--volumes-from</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withVolumesFrom(java.util.Collection<VolumeFrom> volumesFrom) {
        if (volumesFrom == null) {
            this.volumesFrom = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom> volumesFromCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeFrom>(volumesFrom.size());
            volumesFromCopy.addAll(volumesFrom);
            this.volumesFrom = volumesFromCopy;
        }

        return this;
    }

    /**
     * The hostname to use for your container. This parameter maps to
     * <code>Hostname</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--hostname</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The hostname to use for your container. This parameter maps to
     *         <code>Hostname</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--hostname</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The hostname to use for your container. This parameter maps to
     * <code>Hostname</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--hostname</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param hostname The hostname to use for your container. This parameter maps to
     *         <code>Hostname</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--hostname</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The hostname to use for your container. This parameter maps to
     * <code>Hostname</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--hostname</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostname The hostname to use for your container. This parameter maps to
     *         <code>Hostname</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--hostname</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * The user name to use inside the container. This parameter maps to
     * <code>User</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The user name to use inside the container. This parameter maps to
     *         <code>User</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--user</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public String getUser() {
        return user;
    }
    
    /**
     * The user name to use inside the container. This parameter maps to
     * <code>User</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param user The user name to use inside the container. This parameter maps to
     *         <code>User</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--user</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    /**
     * The user name to use inside the container. This parameter maps to
     * <code>User</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--user</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param user The user name to use inside the container. This parameter maps to
     *         <code>User</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--user</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * The working directory in which to run commands inside the container.
     * This parameter maps to <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--workdir</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return The working directory in which to run commands inside the container.
     *         This parameter maps to <code>WorkingDir</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--workdir</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }
    
    /**
     * The working directory in which to run commands inside the container.
     * This parameter maps to <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--workdir</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param workingDirectory The working directory in which to run commands inside the container.
     *         This parameter maps to <code>WorkingDir</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--workdir</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
    
    /**
     * The working directory in which to run commands inside the container.
     * This parameter maps to <code>WorkingDir</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--workdir</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workingDirectory The working directory in which to run commands inside the container.
     *         This parameter maps to <code>WorkingDir</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--workdir</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }

    /**
     * When this parameter is true, networking is disabled within the
     * container. This parameter maps to <code>NetworkDisabled</code> in the
     * <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a>.
     *
     * @return When this parameter is true, networking is disabled within the
     *         container. This parameter maps to <code>NetworkDisabled</code> in the
     *         <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a>.
     */
    public Boolean isDisableNetworking() {
        return disableNetworking;
    }
    
    /**
     * When this parameter is true, networking is disabled within the
     * container. This parameter maps to <code>NetworkDisabled</code> in the
     * <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a>.
     *
     * @param disableNetworking When this parameter is true, networking is disabled within the
     *         container. This parameter maps to <code>NetworkDisabled</code> in the
     *         <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a>.
     */
    public void setDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
    }
    
    /**
     * When this parameter is true, networking is disabled within the
     * container. This parameter maps to <code>NetworkDisabled</code> in the
     * <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableNetworking When this parameter is true, networking is disabled within the
     *         container. This parameter maps to <code>NetworkDisabled</code> in the
     *         <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
        return this;
    }

    /**
     * When this parameter is true, networking is disabled within the
     * container. This parameter maps to <code>NetworkDisabled</code> in the
     * <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a>.
     *
     * @return When this parameter is true, networking is disabled within the
     *         container. This parameter maps to <code>NetworkDisabled</code> in the
     *         <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a>.
     */
    public Boolean getDisableNetworking() {
        return disableNetworking;
    }

    /**
     * When this parameter is true, the container is given elevated
     * privileges on the host container instance (similar to the
     * <code>root</code> user). This parameter maps to
     * <code>Privileged</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--privileged</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return When this parameter is true, the container is given elevated
     *         privileges on the host container instance (similar to the
     *         <code>root</code> user). This parameter maps to
     *         <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--privileged</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public Boolean isPrivileged() {
        return privileged;
    }
    
    /**
     * When this parameter is true, the container is given elevated
     * privileges on the host container instance (similar to the
     * <code>root</code> user). This parameter maps to
     * <code>Privileged</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--privileged</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param privileged When this parameter is true, the container is given elevated
     *         privileges on the host container instance (similar to the
     *         <code>root</code> user). This parameter maps to
     *         <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--privileged</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }
    
    /**
     * When this parameter is true, the container is given elevated
     * privileges on the host container instance (similar to the
     * <code>root</code> user). This parameter maps to
     * <code>Privileged</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--privileged</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privileged When this parameter is true, the container is given elevated
     *         privileges on the host container instance (similar to the
     *         <code>root</code> user). This parameter maps to
     *         <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--privileged</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * When this parameter is true, the container is given elevated
     * privileges on the host container instance (similar to the
     * <code>root</code> user). This parameter maps to
     * <code>Privileged</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--privileged</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return When this parameter is true, the container is given elevated
     *         privileges on the host container instance (similar to the
     *         <code>root</code> user). This parameter maps to
     *         <code>Privileged</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--privileged</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * When this parameter is true, the container is given read-only access
     * to its root file system. This parameter maps to
     * <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--read-only</code> option to <code>docker
     * run</code>.
     *
     * @return When this parameter is true, the container is given read-only access
     *         to its root file system. This parameter maps to
     *         <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--read-only</code> option to <code>docker
     *         run</code>.
     */
    public Boolean isReadonlyRootFilesystem() {
        return readonlyRootFilesystem;
    }
    
    /**
     * When this parameter is true, the container is given read-only access
     * to its root file system. This parameter maps to
     * <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--read-only</code> option to <code>docker
     * run</code>.
     *
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only access
     *         to its root file system. This parameter maps to
     *         <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--read-only</code> option to <code>docker
     *         run</code>.
     */
    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }
    
    /**
     * When this parameter is true, the container is given read-only access
     * to its root file system. This parameter maps to
     * <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--read-only</code> option to <code>docker
     * run</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only access
     *         to its root file system. This parameter maps to
     *         <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--read-only</code> option to <code>docker
     *         run</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
        return this;
    }

    /**
     * When this parameter is true, the container is given read-only access
     * to its root file system. This parameter maps to
     * <code>ReadonlyRootfs</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--read-only</code> option to <code>docker
     * run</code>.
     *
     * @return When this parameter is true, the container is given read-only access
     *         to its root file system. This parameter maps to
     *         <code>ReadonlyRootfs</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--read-only</code> option to <code>docker
     *         run</code>.
     */
    public Boolean getReadonlyRootFilesystem() {
        return readonlyRootFilesystem;
    }

    /**
     * A list of DNS servers that are presented to the container. This
     * parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return A list of DNS servers that are presented to the container. This
     *         parameter maps to <code>Dns</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<String> getDnsServers() {
        if (dnsServers == null) {
              dnsServers = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dnsServers.setAutoConstruct(true);
        }
        return dnsServers;
    }
    
    /**
     * A list of DNS servers that are presented to the container. This
     * parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. This
     *         parameter maps to <code>Dns</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setDnsServers(java.util.Collection<String> dnsServers) {
        if (dnsServers == null) {
            this.dnsServers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsServersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsServers.size());
        dnsServersCopy.addAll(dnsServers);
        this.dnsServers = dnsServersCopy;
    }
    
    /**
     * A list of DNS servers that are presented to the container. This
     * parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDnsServers(java.util.Collection)} or {@link
     * #withDnsServers(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. This
     *         parameter maps to <code>Dns</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDnsServers(String... dnsServers) {
        if (getDnsServers() == null) setDnsServers(new java.util.ArrayList<String>(dnsServers.length));
        for (String value : dnsServers) {
            getDnsServers().add(value);
        }
        return this;
    }
    
    /**
     * A list of DNS servers that are presented to the container. This
     * parameter maps to <code>Dns</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. This
     *         parameter maps to <code>Dns</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDnsServers(java.util.Collection<String> dnsServers) {
        if (dnsServers == null) {
            this.dnsServers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsServersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsServers.size());
            dnsServersCopy.addAll(dnsServers);
            this.dnsServers = dnsServersCopy;
        }

        return this;
    }

    /**
     * A list of DNS search domains that are presented to the container. This
     * parameter maps to <code>DnsSearch</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns-search</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return A list of DNS search domains that are presented to the container. This
     *         parameter maps to <code>DnsSearch</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns-search</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<String> getDnsSearchDomains() {
        if (dnsSearchDomains == null) {
              dnsSearchDomains = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dnsSearchDomains.setAutoConstruct(true);
        }
        return dnsSearchDomains;
    }
    
    /**
     * A list of DNS search domains that are presented to the container. This
     * parameter maps to <code>DnsSearch</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns-search</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. This
     *         parameter maps to <code>DnsSearch</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns-search</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setDnsSearchDomains(java.util.Collection<String> dnsSearchDomains) {
        if (dnsSearchDomains == null) {
            this.dnsSearchDomains = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsSearchDomainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsSearchDomains.size());
        dnsSearchDomainsCopy.addAll(dnsSearchDomains);
        this.dnsSearchDomains = dnsSearchDomainsCopy;
    }
    
    /**
     * A list of DNS search domains that are presented to the container. This
     * parameter maps to <code>DnsSearch</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns-search</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDnsSearchDomains(java.util.Collection)} or {@link
     * #withDnsSearchDomains(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. This
     *         parameter maps to <code>DnsSearch</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns-search</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDnsSearchDomains(String... dnsSearchDomains) {
        if (getDnsSearchDomains() == null) setDnsSearchDomains(new java.util.ArrayList<String>(dnsSearchDomains.length));
        for (String value : dnsSearchDomains) {
            getDnsSearchDomains().add(value);
        }
        return this;
    }
    
    /**
     * A list of DNS search domains that are presented to the container. This
     * parameter maps to <code>DnsSearch</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--dns-search</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. This
     *         parameter maps to <code>DnsSearch</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--dns-search</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDnsSearchDomains(java.util.Collection<String> dnsSearchDomains) {
        if (dnsSearchDomains == null) {
            this.dnsSearchDomains = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsSearchDomainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsSearchDomains.size());
            dnsSearchDomainsCopy.addAll(dnsSearchDomains);
            this.dnsSearchDomains = dnsSearchDomainsCopy;
        }

        return this;
    }

    /**
     * A list of hostnames and IP address mappings to append to the
     * <code>/etc/hosts</code> file on the container. This parameter maps to
     * <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--add-host</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @return A list of hostnames and IP address mappings to append to the
     *         <code>/etc/hosts</code> file on the container. This parameter maps to
     *         <code>ExtraHosts</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--add-host</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public java.util.List<HostEntry> getExtraHosts() {
        if (extraHosts == null) {
              extraHosts = new com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry>();
              extraHosts.setAutoConstruct(true);
        }
        return extraHosts;
    }
    
    /**
     * A list of hostnames and IP address mappings to append to the
     * <code>/etc/hosts</code> file on the container. This parameter maps to
     * <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--add-host</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     *
     * @param extraHosts A list of hostnames and IP address mappings to append to the
     *         <code>/etc/hosts</code> file on the container. This parameter maps to
     *         <code>ExtraHosts</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--add-host</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     */
    public void setExtraHosts(java.util.Collection<HostEntry> extraHosts) {
        if (extraHosts == null) {
            this.extraHosts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry> extraHostsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry>(extraHosts.size());
        extraHostsCopy.addAll(extraHosts);
        this.extraHosts = extraHostsCopy;
    }
    
    /**
     * A list of hostnames and IP address mappings to append to the
     * <code>/etc/hosts</code> file on the container. This parameter maps to
     * <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--add-host</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setExtraHosts(java.util.Collection)} or {@link
     * #withExtraHosts(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extraHosts A list of hostnames and IP address mappings to append to the
     *         <code>/etc/hosts</code> file on the container. This parameter maps to
     *         <code>ExtraHosts</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--add-host</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withExtraHosts(HostEntry... extraHosts) {
        if (getExtraHosts() == null) setExtraHosts(new java.util.ArrayList<HostEntry>(extraHosts.length));
        for (HostEntry value : extraHosts) {
            getExtraHosts().add(value);
        }
        return this;
    }
    
    /**
     * A list of hostnames and IP address mappings to append to the
     * <code>/etc/hosts</code> file on the container. This parameter maps to
     * <code>ExtraHosts</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--add-host</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param extraHosts A list of hostnames and IP address mappings to append to the
     *         <code>/etc/hosts</code> file on the container. This parameter maps to
     *         <code>ExtraHosts</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--add-host</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withExtraHosts(java.util.Collection<HostEntry> extraHosts) {
        if (extraHosts == null) {
            this.extraHosts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry> extraHostsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HostEntry>(extraHosts.size());
            extraHostsCopy.addAll(extraHosts);
            this.extraHosts = extraHostsCopy;
        }

        return this;
    }

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor
     * multi-level security systems. This parameter maps to
     * <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--security-opt</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>The Amazon ECS container agent running on a
     * container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or
     * <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     *
     * @return A list of strings to provide custom labels for SELinux and AppArmor
     *         multi-level security systems. This parameter maps to
     *         <code>SecurityOpt</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--security-opt</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>The Amazon ECS container agent running on a
     *         container instance must register with the
     *         <code>ECS_SELINUX_CAPABLE=true</code> or
     *         <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     *         containers placed on that instance can use these security options. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     */
    public java.util.List<String> getDockerSecurityOptions() {
        if (dockerSecurityOptions == null) {
              dockerSecurityOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dockerSecurityOptions.setAutoConstruct(true);
        }
        return dockerSecurityOptions;
    }
    
    /**
     * A list of strings to provide custom labels for SELinux and AppArmor
     * multi-level security systems. This parameter maps to
     * <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--security-opt</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>The Amazon ECS container agent running on a
     * container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or
     * <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and AppArmor
     *         multi-level security systems. This parameter maps to
     *         <code>SecurityOpt</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--security-opt</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>The Amazon ECS container agent running on a
     *         container instance must register with the
     *         <code>ECS_SELINUX_CAPABLE=true</code> or
     *         <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     *         containers placed on that instance can use these security options. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     */
    public void setDockerSecurityOptions(java.util.Collection<String> dockerSecurityOptions) {
        if (dockerSecurityOptions == null) {
            this.dockerSecurityOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dockerSecurityOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dockerSecurityOptions.size());
        dockerSecurityOptionsCopy.addAll(dockerSecurityOptions);
        this.dockerSecurityOptions = dockerSecurityOptionsCopy;
    }
    
    /**
     * A list of strings to provide custom labels for SELinux and AppArmor
     * multi-level security systems. This parameter maps to
     * <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--security-opt</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>The Amazon ECS container agent running on a
     * container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or
     * <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDockerSecurityOptions(java.util.Collection)} or
     * {@link #withDockerSecurityOptions(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and AppArmor
     *         multi-level security systems. This parameter maps to
     *         <code>SecurityOpt</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--security-opt</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>The Amazon ECS container agent running on a
     *         container instance must register with the
     *         <code>ECS_SELINUX_CAPABLE=true</code> or
     *         <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     *         containers placed on that instance can use these security options. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDockerSecurityOptions(String... dockerSecurityOptions) {
        if (getDockerSecurityOptions() == null) setDockerSecurityOptions(new java.util.ArrayList<String>(dockerSecurityOptions.length));
        for (String value : dockerSecurityOptions) {
            getDockerSecurityOptions().add(value);
        }
        return this;
    }
    
    /**
     * A list of strings to provide custom labels for SELinux and AppArmor
     * multi-level security systems. This parameter maps to
     * <code>SecurityOpt</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--security-opt</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. <note> <p>The Amazon ECS container agent running on a
     * container instance must register with the
     * <code>ECS_SELINUX_CAPABLE=true</code> or
     * <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     * containers placed on that instance can use these security options. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and AppArmor
     *         multi-level security systems. This parameter maps to
     *         <code>SecurityOpt</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--security-opt</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. <note> <p>The Amazon ECS container agent running on a
     *         container instance must register with the
     *         <code>ECS_SELINUX_CAPABLE=true</code> or
     *         <code>ECS_APPARMOR_CAPABLE=true</code> environment variables before
     *         containers placed on that instance can use these security options. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDockerSecurityOptions(java.util.Collection<String> dockerSecurityOptions) {
        if (dockerSecurityOptions == null) {
            this.dockerSecurityOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dockerSecurityOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dockerSecurityOptions.size());
            dockerSecurityOptionsCopy.addAll(dockerSecurityOptions);
            this.dockerSecurityOptions = dockerSecurityOptionsCopy;
        }

        return this;
    }

    /**
     * A key/value map of labels to add to the container. This parameter maps
     * to <code>Labels</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--label</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. This parameter requires version 1.18 of the Docker Remote API
     * or greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     *
     * @return A key/value map of labels to add to the container. This parameter maps
     *         to <code>Labels</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--label</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. This parameter requires version 1.18 of the Docker Remote API
     *         or greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     */
    public java.util.Map<String,String> getDockerLabels() {
        
        if (dockerLabels == null) {
            dockerLabels = new java.util.HashMap<String,String>();
        }
        return dockerLabels;
    }
    
    /**
     * A key/value map of labels to add to the container. This parameter maps
     * to <code>Labels</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--label</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. This parameter requires version 1.18 of the Docker Remote API
     * or greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     *
     * @param dockerLabels A key/value map of labels to add to the container. This parameter maps
     *         to <code>Labels</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--label</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. This parameter requires version 1.18 of the Docker Remote API
     *         or greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     */
    public void setDockerLabels(java.util.Map<String,String> dockerLabels) {
        this.dockerLabels = dockerLabels;
    }
    
    /**
     * A key/value map of labels to add to the container. This parameter maps
     * to <code>Labels</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--label</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. This parameter requires version 1.18 of the Docker Remote API
     * or greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dockerLabels A key/value map of labels to add to the container. This parameter maps
     *         to <code>Labels</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--label</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. This parameter requires version 1.18 of the Docker Remote API
     *         or greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withDockerLabels(java.util.Map<String,String> dockerLabels) {
        setDockerLabels(dockerLabels);
        return this;
    }

    /**
     * A key/value map of labels to add to the container. This parameter maps
     * to <code>Labels</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--label</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. This parameter requires version 1.18 of the Docker Remote API
     * or greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     * <p>
     * The method adds a new key-value pair into DockerLabels parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into DockerLabels.
     * @param value The corresponding value of the entry to be added into DockerLabels.
     */
  public ContainerDefinition addDockerLabelsEntry(String key, String value) {
    if (null == this.dockerLabels) {
      this.dockerLabels = new java.util.HashMap<String,String>();
    }
    if (this.dockerLabels.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.dockerLabels.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into DockerLabels.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public ContainerDefinition clearDockerLabelsEntries() {
    this.dockerLabels = null;
    return this;
  }
  
    /**
     * A list of <code>ulimits</code> to set in the container. This parameter
     * maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     * type. This parameter requires version 1.18 of the Docker Remote API or
     * greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     *
     * @return A list of <code>ulimits</code> to set in the container. This parameter
     *         maps to <code>Ulimits</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--ulimit</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     *         type. This parameter requires version 1.18 of the Docker Remote API or
     *         greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     */
    public java.util.List<Ulimit> getUlimits() {
        if (ulimits == null) {
              ulimits = new com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit>();
              ulimits.setAutoConstruct(true);
        }
        return ulimits;
    }
    
    /**
     * A list of <code>ulimits</code> to set in the container. This parameter
     * maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     * type. This parameter requires version 1.18 of the Docker Remote API or
     * greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     *
     * @param ulimits A list of <code>ulimits</code> to set in the container. This parameter
     *         maps to <code>Ulimits</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--ulimit</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     *         type. This parameter requires version 1.18 of the Docker Remote API or
     *         greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     */
    public void setUlimits(java.util.Collection<Ulimit> ulimits) {
        if (ulimits == null) {
            this.ulimits = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit> ulimitsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit>(ulimits.size());
        ulimitsCopy.addAll(ulimits);
        this.ulimits = ulimitsCopy;
    }
    
    /**
     * A list of <code>ulimits</code> to set in the container. This parameter
     * maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     * type. This parameter requires version 1.18 of the Docker Remote API or
     * greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUlimits(java.util.Collection)} or {@link
     * #withUlimits(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ulimits A list of <code>ulimits</code> to set in the container. This parameter
     *         maps to <code>Ulimits</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--ulimit</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     *         type. This parameter requires version 1.18 of the Docker Remote API or
     *         greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withUlimits(Ulimit... ulimits) {
        if (getUlimits() == null) setUlimits(new java.util.ArrayList<Ulimit>(ulimits.length));
        for (Ulimit value : ulimits) {
            getUlimits().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>ulimits</code> to set in the container. This parameter
     * maps to <code>Ulimits</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--ulimit</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     * type. This parameter requires version 1.18 of the Docker Remote API or
     * greater on your container instance. To check the Docker Remote API
     * version on your container instance, log into your container instance
     * and run the following command: <code>sudo docker version | grep
     * "Server API version"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ulimits A list of <code>ulimits</code> to set in the container. This parameter
     *         maps to <code>Ulimits</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--ulimit</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid naming values are displayed in the <a>Ulimit</a> data
     *         type. This parameter requires version 1.18 of the Docker Remote API or
     *         greater on your container instance. To check the Docker Remote API
     *         version on your container instance, log into your container instance
     *         and run the following command: <code>sudo docker version | grep
     *         "Server API version"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withUlimits(java.util.Collection<Ulimit> ulimits) {
        if (ulimits == null) {
            this.ulimits = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit> ulimitsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Ulimit>(ulimits.size());
            ulimitsCopy.addAll(ulimits);
            this.ulimits = ulimitsCopy;
        }

        return this;
    }

    /**
     * The log configuration specification for the container. This parameter
     * maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--log-driver</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid log drivers are displayed in the
     * <a>LogConfiguration</a> data type. This parameter requires version
     * 1.18 of the Docker Remote API or greater on your container instance.
     * To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command: <code>sudo
     * docker version | grep "Server API version"</code> <note> <p>The Amazon
     * ECS container agent running on a container instance must register the
     * logging drivers available on that instance with the
     * <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     * containers placed on that instance can use these log configuration
     * options. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     *
     * @return The log configuration specification for the container. This parameter
     *         maps to <code>LogConfig</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--log-driver</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid log drivers are displayed in the
     *         <a>LogConfiguration</a> data type. This parameter requires version
     *         1.18 of the Docker Remote API or greater on your container instance.
     *         To check the Docker Remote API version on your container instance, log
     *         into your container instance and run the following command: <code>sudo
     *         docker version | grep "Server API version"</code> <note> <p>The Amazon
     *         ECS container agent running on a container instance must register the
     *         logging drivers available on that instance with the
     *         <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *         containers placed on that instance can use these log configuration
     *         options. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     */
    public LogConfiguration getLogConfiguration() {
        return logConfiguration;
    }
    
    /**
     * The log configuration specification for the container. This parameter
     * maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--log-driver</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid log drivers are displayed in the
     * <a>LogConfiguration</a> data type. This parameter requires version
     * 1.18 of the Docker Remote API or greater on your container instance.
     * To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command: <code>sudo
     * docker version | grep "Server API version"</code> <note> <p>The Amazon
     * ECS container agent running on a container instance must register the
     * logging drivers available on that instance with the
     * <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     * containers placed on that instance can use these log configuration
     * options. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     *
     * @param logConfiguration The log configuration specification for the container. This parameter
     *         maps to <code>LogConfig</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--log-driver</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid log drivers are displayed in the
     *         <a>LogConfiguration</a> data type. This parameter requires version
     *         1.18 of the Docker Remote API or greater on your container instance.
     *         To check the Docker Remote API version on your container instance, log
     *         into your container instance and run the following command: <code>sudo
     *         docker version | grep "Server API version"</code> <note> <p>The Amazon
     *         ECS container agent running on a container instance must register the
     *         logging drivers available on that instance with the
     *         <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *         containers placed on that instance can use these log configuration
     *         options. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     */
    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }
    
    /**
     * The log configuration specification for the container. This parameter
     * maps to <code>LogConfig</code> in the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     * a container</a> section of the <a
     * href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     * Remote API</a> and the <code>--log-driver</code> option to <a
     * href="https://docs.docker.com/reference/commandline/run/">docker
     * run</a>. Valid log drivers are displayed in the
     * <a>LogConfiguration</a> data type. This parameter requires version
     * 1.18 of the Docker Remote API or greater on your container instance.
     * To check the Docker Remote API version on your container instance, log
     * into your container instance and run the following command: <code>sudo
     * docker version | grep "Server API version"</code> <note> <p>The Amazon
     * ECS container agent running on a container instance must register the
     * logging drivers available on that instance with the
     * <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     * containers placed on that instance can use these log configuration
     * options. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     * ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     * Service Developer Guide</i>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logConfiguration The log configuration specification for the container. This parameter
     *         maps to <code>LogConfig</code> in the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/#create-a-container">Create
     *         a container</a> section of the <a
     *         href="https://docs.docker.com/reference/api/docker_remote_api_v1.19/">Docker
     *         Remote API</a> and the <code>--log-driver</code> option to <a
     *         href="https://docs.docker.com/reference/commandline/run/">docker
     *         run</a>. Valid log drivers are displayed in the
     *         <a>LogConfiguration</a> data type. This parameter requires version
     *         1.18 of the Docker Remote API or greater on your container instance.
     *         To check the Docker Remote API version on your container instance, log
     *         into your container instance and run the following command: <code>sudo
     *         docker version | grep "Server API version"</code> <note> <p>The Amazon
     *         ECS container agent running on a container instance must register the
     *         logging drivers available on that instance with the
     *         <code>ECS_AVAILABLE_LOGGING_DRIVERS</code> environment variable before
     *         containers placed on that instance can use these log configuration
     *         options. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/developerguide/ecs-agent-config.html">Amazon
     *         ECS Container Agent Configuration</a> in the <i>Amazon EC2 Container
     *         Service Developer Guide</i>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContainerDefinition withLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getImage() != null) sb.append("Image: " + getImage() + ",");
        if (getCpu() != null) sb.append("Cpu: " + getCpu() + ",");
        if (getMemory() != null) sb.append("Memory: " + getMemory() + ",");
        if (getLinks() != null) sb.append("Links: " + getLinks() + ",");
        if (getPortMappings() != null) sb.append("PortMappings: " + getPortMappings() + ",");
        if (isEssential() != null) sb.append("Essential: " + isEssential() + ",");
        if (getEntryPoint() != null) sb.append("EntryPoint: " + getEntryPoint() + ",");
        if (getCommand() != null) sb.append("Command: " + getCommand() + ",");
        if (getEnvironment() != null) sb.append("Environment: " + getEnvironment() + ",");
        if (getMountPoints() != null) sb.append("MountPoints: " + getMountPoints() + ",");
        if (getVolumesFrom() != null) sb.append("VolumesFrom: " + getVolumesFrom() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getUser() != null) sb.append("User: " + getUser() + ",");
        if (getWorkingDirectory() != null) sb.append("WorkingDirectory: " + getWorkingDirectory() + ",");
        if (isDisableNetworking() != null) sb.append("DisableNetworking: " + isDisableNetworking() + ",");
        if (isPrivileged() != null) sb.append("Privileged: " + isPrivileged() + ",");
        if (isReadonlyRootFilesystem() != null) sb.append("ReadonlyRootFilesystem: " + isReadonlyRootFilesystem() + ",");
        if (getDnsServers() != null) sb.append("DnsServers: " + getDnsServers() + ",");
        if (getDnsSearchDomains() != null) sb.append("DnsSearchDomains: " + getDnsSearchDomains() + ",");
        if (getExtraHosts() != null) sb.append("ExtraHosts: " + getExtraHosts() + ",");
        if (getDockerSecurityOptions() != null) sb.append("DockerSecurityOptions: " + getDockerSecurityOptions() + ",");
        if (getDockerLabels() != null) sb.append("DockerLabels: " + getDockerLabels() + ",");
        if (getUlimits() != null) sb.append("Ulimits: " + getUlimits() + ",");
        if (getLogConfiguration() != null) sb.append("LogConfiguration: " + getLogConfiguration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode()); 
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode()); 
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode()); 
        hashCode = prime * hashCode + ((getLinks() == null) ? 0 : getLinks().hashCode()); 
        hashCode = prime * hashCode + ((getPortMappings() == null) ? 0 : getPortMappings().hashCode()); 
        hashCode = prime * hashCode + ((isEssential() == null) ? 0 : isEssential().hashCode()); 
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode()); 
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode()); 
        hashCode = prime * hashCode + ((getMountPoints() == null) ? 0 : getMountPoints().hashCode()); 
        hashCode = prime * hashCode + ((getVolumesFrom() == null) ? 0 : getVolumesFrom().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode()); 
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode()); 
        hashCode = prime * hashCode + ((isDisableNetworking() == null) ? 0 : isDisableNetworking().hashCode()); 
        hashCode = prime * hashCode + ((isPrivileged() == null) ? 0 : isPrivileged().hashCode()); 
        hashCode = prime * hashCode + ((isReadonlyRootFilesystem() == null) ? 0 : isReadonlyRootFilesystem().hashCode()); 
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode()); 
        hashCode = prime * hashCode + ((getDnsSearchDomains() == null) ? 0 : getDnsSearchDomains().hashCode()); 
        hashCode = prime * hashCode + ((getExtraHosts() == null) ? 0 : getExtraHosts().hashCode()); 
        hashCode = prime * hashCode + ((getDockerSecurityOptions() == null) ? 0 : getDockerSecurityOptions().hashCode()); 
        hashCode = prime * hashCode + ((getDockerLabels() == null) ? 0 : getDockerLabels().hashCode()); 
        hashCode = prime * hashCode + ((getUlimits() == null) ? 0 : getUlimits().hashCode()); 
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContainerDefinition == false) return false;
        ContainerDefinition other = (ContainerDefinition)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getImage() == null ^ this.getImage() == null) return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false) return false; 
        if (other.getCpu() == null ^ this.getCpu() == null) return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false) return false; 
        if (other.getMemory() == null ^ this.getMemory() == null) return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false) return false; 
        if (other.getLinks() == null ^ this.getLinks() == null) return false;
        if (other.getLinks() != null && other.getLinks().equals(this.getLinks()) == false) return false; 
        if (other.getPortMappings() == null ^ this.getPortMappings() == null) return false;
        if (other.getPortMappings() != null && other.getPortMappings().equals(this.getPortMappings()) == false) return false; 
        if (other.isEssential() == null ^ this.isEssential() == null) return false;
        if (other.isEssential() != null && other.isEssential().equals(this.isEssential()) == false) return false; 
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null) return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false) return false; 
        if (other.getCommand() == null ^ this.getCommand() == null) return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false) return false; 
        if (other.getEnvironment() == null ^ this.getEnvironment() == null) return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false) return false; 
        if (other.getMountPoints() == null ^ this.getMountPoints() == null) return false;
        if (other.getMountPoints() != null && other.getMountPoints().equals(this.getMountPoints()) == false) return false; 
        if (other.getVolumesFrom() == null ^ this.getVolumesFrom() == null) return false;
        if (other.getVolumesFrom() != null && other.getVolumesFrom().equals(this.getVolumesFrom()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getUser() == null ^ this.getUser() == null) return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false) return false; 
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null) return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false) return false; 
        if (other.isDisableNetworking() == null ^ this.isDisableNetworking() == null) return false;
        if (other.isDisableNetworking() != null && other.isDisableNetworking().equals(this.isDisableNetworking()) == false) return false; 
        if (other.isPrivileged() == null ^ this.isPrivileged() == null) return false;
        if (other.isPrivileged() != null && other.isPrivileged().equals(this.isPrivileged()) == false) return false; 
        if (other.isReadonlyRootFilesystem() == null ^ this.isReadonlyRootFilesystem() == null) return false;
        if (other.isReadonlyRootFilesystem() != null && other.isReadonlyRootFilesystem().equals(this.isReadonlyRootFilesystem()) == false) return false; 
        if (other.getDnsServers() == null ^ this.getDnsServers() == null) return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false) return false; 
        if (other.getDnsSearchDomains() == null ^ this.getDnsSearchDomains() == null) return false;
        if (other.getDnsSearchDomains() != null && other.getDnsSearchDomains().equals(this.getDnsSearchDomains()) == false) return false; 
        if (other.getExtraHosts() == null ^ this.getExtraHosts() == null) return false;
        if (other.getExtraHosts() != null && other.getExtraHosts().equals(this.getExtraHosts()) == false) return false; 
        if (other.getDockerSecurityOptions() == null ^ this.getDockerSecurityOptions() == null) return false;
        if (other.getDockerSecurityOptions() != null && other.getDockerSecurityOptions().equals(this.getDockerSecurityOptions()) == false) return false; 
        if (other.getDockerLabels() == null ^ this.getDockerLabels() == null) return false;
        if (other.getDockerLabels() != null && other.getDockerLabels().equals(this.getDockerLabels()) == false) return false; 
        if (other.getUlimits() == null ^ this.getUlimits() == null) return false;
        if (other.getUlimits() != null && other.getUlimits().equals(this.getUlimits()) == false) return false; 
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null) return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false) return false; 
        return true;
    }
    
    @Override
    public ContainerDefinition clone() {
        try {
            return (ContainerDefinition) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    