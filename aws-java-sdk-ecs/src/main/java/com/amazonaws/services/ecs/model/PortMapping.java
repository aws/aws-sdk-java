/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port
 * mappings are specified as part of the container definition.
 * </p>
 * <p>
 * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify the exposed
 * ports using <code>containerPort</code>. The <code>hostPort</code> can be left blank or it must be the same value as
 * the <code>containerPort</code>.
 * </p>
 * <note>
 * <p>
 * You can't expose the same container port for multiple protocols. If you attempt this, an error is returned.
 * </p>
 * </note>
 * <p>
 * After a task reaches the <code>RUNNING</code> status, manual and automatic host and container port assignments are
 * visible in the <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PortMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port number on the container that's bound to the user-specified or automatically assigned host port.
     * </p>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify the
     * exposed ports using <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode and you specify a container port and
     * not a host port, your container automatically receives a host port in the ephemeral port range. For more
     * information, see <code>hostPort</code>. Port mappings that are automatically assigned in this way do not count
     * toward the 100 reserved ports limit of a container instance.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     * <code>hostPort</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports on the
     * host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     * <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved host
     * port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>)
     * while specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral
     * port range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     * ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the ephemeral
     * port range as these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     * ephemeral port range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678-51680. Any host port that was previously specified in a running task is also reserved while the task
     * is running. That is, after a task stops, the host port is released. The current reserved ports are displayed in
     * the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A container instance can have up
     * to 100 reserved ports at a time. This number includes the default reserved ports. Automatically assigned ports
     * aren't included in the 100 reserved ports quota.
     * </p>
     */
    private Integer hostPort;
    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter is the
     * name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can include up to 64
     * characters. The characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     * can't start with a hyphen.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We
     * recommend that you set this parameter to be consistent with the protocol that your application uses. If you set
     * this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set
     * this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     * </p>
     * <p>
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific
     * telemetry for TCP.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String appProtocol;
    /**
     * <p>
     * The port number range on the container that's bound to the dynamically mapped host port range.
     * </p>
     * <p>
     * The following rules apply when you specify a <code>containerPortRange</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the EC2 and Fargate launch types.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the Linux and Windows operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * The container instance must have at least version 1.67.0 of the container agent and at least version 1.67.0-1 of
     * the <code>ecs-init</code> package
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify a maximum of 100 port ranges per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host ports
     * from the default ephemeral range and passes it to docker to bind them to the container ports.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>containerPortRange</code> valid values are between 1 and 65535.
     * </p>
     * </li>
     * <li>
     * <p>
     * A port can only be included in one port mapping per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot specify overlapping port ranges.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first port in the range must be less than last port in the range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a large
     * number of ports.
     * </p>
     * <p>
     * For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the Github
     * website.
     * </p>
     * <p>
     * For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     * >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     * <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are bound to
     * the container ports.
     * </p>
     */
    private String containerPortRange;

    /**
     * <p>
     * The port number on the container that's bound to the user-specified or automatically assigned host port.
     * </p>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify the
     * exposed ports using <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode and you specify a container port and
     * not a host port, your container automatically receives a host port in the ephemeral port range. For more
     * information, see <code>hostPort</code>. Port mappings that are automatically assigned in this way do not count
     * toward the 100 reserved ports limit of a container instance.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that's bound to the user-specified or automatically assigned host
     *        port.</p>
     *        <p>
     *        If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify
     *        the exposed ports using <code>containerPort</code>.
     *        </p>
     *        <p>
     *        If you use containers in a task with the <code>bridge</code> network mode and you specify a container port
     *        and not a host port, your container automatically receives a host port in the ephemeral port range. For
     *        more information, see <code>hostPort</code>. Port mappings that are automatically assigned in this way do
     *        not count toward the 100 reserved ports limit of a container instance.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that's bound to the user-specified or automatically assigned host port.
     * </p>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify the
     * exposed ports using <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode and you specify a container port and
     * not a host port, your container automatically receives a host port in the ephemeral port range. For more
     * information, see <code>hostPort</code>. Port mappings that are automatically assigned in this way do not count
     * toward the 100 reserved ports limit of a container instance.
     * </p>
     * 
     * @return The port number on the container that's bound to the user-specified or automatically assigned host
     *         port.</p>
     *         <p>
     *         If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify
     *         the exposed ports using <code>containerPort</code>.
     *         </p>
     *         <p>
     *         If you use containers in a task with the <code>bridge</code> network mode and you specify a container
     *         port and not a host port, your container automatically receives a host port in the ephemeral port range.
     *         For more information, see <code>hostPort</code>. Port mappings that are automatically assigned in this
     *         way do not count toward the 100 reserved ports limit of a container instance.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port number on the container that's bound to the user-specified or automatically assigned host port.
     * </p>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify the
     * exposed ports using <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode and you specify a container port and
     * not a host port, your container automatically receives a host port in the ephemeral port range. For more
     * information, see <code>hostPort</code>. Port mappings that are automatically assigned in this way do not count
     * toward the 100 reserved ports limit of a container instance.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that's bound to the user-specified or automatically assigned host
     *        port.</p>
     *        <p>
     *        If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, specify
     *        the exposed ports using <code>containerPort</code>.
     *        </p>
     *        <p>
     *        If you use containers in a task with the <code>bridge</code> network mode and you specify a container port
     *        and not a host port, your container automatically receives a host port in the ephemeral port range. For
     *        more information, see <code>hostPort</code>. Port mappings that are automatically assigned in this way do
     *        not count toward the 100 reserved ports limit of a container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     * <code>hostPort</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports on the
     * host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     * <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved host
     * port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>)
     * while specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral
     * port range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     * ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the ephemeral
     * port range as these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     * ephemeral port range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678-51680. Any host port that was previously specified in a running task is also reserved while the task
     * is running. That is, after a task stops, the host port is released. The current reserved ports are displayed in
     * the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A container instance can have up
     * to 100 reserved ports at a time. This number includes the default reserved ports. Automatically assigned ports
     * aren't included in the 100 reserved ports quota.
     * </p>
     * 
     * @param hostPort
     *        The port number on the container instance to reserve for your container.</p>
     *        <p>
     *        If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     *        <code>hostPort</code> is set as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to
     *        the same value as the <code>containerPort</code>. This is a static mapping strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports
     *        on the host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     *        <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>.
     *        </p>
     *        <p>
     *        If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved
     *        host port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to
     *        <code>0</code>) while specifying a <code>containerPort</code> and your container automatically receives a
     *        port in the ephemeral port range for your container instance operating system and Docker version.
     *        </p>
     *        <p>
     *        The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     *        <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     *        ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the
     *        ephemeral port range as these are reserved for automatic assignment. In general, ports below 32768 are
     *        outside of the ephemeral port range.
     *        </p>
     *        <p>
     *        The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container
     *        agent ports 51678-51680. Any host port that was previously specified in a running task is also reserved
     *        while the task is running. That is, after a task stops, the host port is released. The current reserved
     *        ports are displayed in the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A
     *        container instance can have up to 100 reserved ports at a time. This number includes the default reserved
     *        ports. Automatically assigned ports aren't included in the 100 reserved ports quota.
     */

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     * <code>hostPort</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports on the
     * host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     * <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved host
     * port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>)
     * while specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral
     * port range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     * ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the ephemeral
     * port range as these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     * ephemeral port range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678-51680. Any host port that was previously specified in a running task is also reserved while the task
     * is running. That is, after a task stops, the host port is released. The current reserved ports are displayed in
     * the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A container instance can have up
     * to 100 reserved ports at a time. This number includes the default reserved ports. Automatically assigned ports
     * aren't included in the 100 reserved ports quota.
     * </p>
     * 
     * @return The port number on the container instance to reserve for your container.</p>
     *         <p>
     *         If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     *         <code>hostPort</code> is set as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to
     *         the same value as the <code>containerPort</code>. This is a static mapping strategy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports
     *         on the host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     *         <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>
     *         .
     *         </p>
     *         <p>
     *         If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved
     *         host port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to
     *         <code>0</code>) while specifying a <code>containerPort</code> and your container automatically receives a
     *         port in the ephemeral port range for your container instance operating system and Docker version.
     *         </p>
     *         <p>
     *         The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     *         <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     *         ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the
     *         ephemeral port range as these are reserved for automatic assignment. In general, ports below 32768 are
     *         outside of the ephemeral port range.
     *         </p>
     *         <p>
     *         The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container
     *         agent ports 51678-51680. Any host port that was previously specified in a running task is also reserved
     *         while the task is running. That is, after a task stops, the host port is released. The current reserved
     *         ports are displayed in the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A
     *         container instance can have up to 100 reserved ports at a time. This number includes the default reserved
     *         ports. Automatically assigned ports aren't included in the 100 reserved ports quota.
     */

    public Integer getHostPort() {
        return this.hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     * <code>hostPort</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports on the
     * host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     * <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved host
     * port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>)
     * while specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral
     * port range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     * ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the ephemeral
     * port range as these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     * ephemeral port range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678-51680. Any host port that was previously specified in a running task is also reserved while the task
     * is running. That is, after a task stops, the host port is released. The current reserved ports are displayed in
     * the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A container instance can have up
     * to 100 reserved ports at a time. This number includes the default reserved ports. Automatically assigned ports
     * aren't included in the 100 reserved ports quota.
     * </p>
     * 
     * @param hostPort
     *        The port number on the container instance to reserve for your container.</p>
     *        <p>
     *        If you specify a <code>containerPortRange</code>, leave this field empty and the value of the
     *        <code>hostPort</code> is set as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to
     *        the same value as the <code>containerPort</code>. This is a static mapping strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open ports
     *        on the host and automaticaly binds them to the container ports. This is a dynamic mapping strategy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use containers in a task with the <code>awsvpc</code> or <code>host</code> network mode, the
     *        <code>hostPort</code> can either be left blank or set to the same value as the <code>containerPort</code>.
     *        </p>
     *        <p>
     *        If you use containers in a task with the <code>bridge</code> network mode, you can specify a non-reserved
     *        host port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to
     *        <code>0</code>) while specifying a <code>containerPort</code> and your container automatically receives a
     *        port in the ephemeral port range for your container instance operating system and Docker version.
     *        </p>
     *        <p>
     *        The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under
     *        <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel parameter is unavailable, the default
     *        ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the
     *        ephemeral port range as these are reserved for automatic assignment. In general, ports below 32768 are
     *        outside of the ephemeral port range.
     *        </p>
     *        <p>
     *        The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container
     *        agent ports 51678-51680. Any host port that was previously specified in a running task is also reserved
     *        while the task is running. That is, after a task stops, the host port is released. The current reserved
     *        ports are displayed in the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output. A
     *        container instance can have up to 100 reserved ports at a time. This number includes the default reserved
     *        ports. Automatically assigned ports aren't included in the 100 reserved ports quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withHostPort(Integer hostPort) {
        setHostPort(hostPort);
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The
     *        default is <code>tcp</code>.
     * @see TransportProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * </p>
     * 
     * @return The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The
     *         default is <code>tcp</code>.
     * @see TransportProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The
     *        default is <code>tcp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public PortMapping withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The
     *        default is <code>tcp</code>.
     * @see TransportProtocol
     */

    public void setProtocol(TransportProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping. Valid values are <code>tcp</code> and <code>udp</code>. The
     *        default is <code>tcp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public PortMapping withProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter is the
     * name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can include up to 64
     * characters. The characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     * can't start with a hyphen.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param name
     *        The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter
     *        is the name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can
     *        include up to 64 characters. The characters can include lowercase letters, numbers, underscores (_), and
     *        hyphens (-). The name can't start with a hyphen.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter is the
     * name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can include up to 64
     * characters. The characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     * can't start with a hyphen.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter
     *         is the name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can
     *         include up to 64 characters. The characters can include lowercase letters, numbers, underscores (_), and
     *         hyphens (-). The name can't start with a hyphen.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *         Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter is the
     * name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can include up to 64
     * characters. The characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     * can't start with a hyphen.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param name
     *        The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter
     *        is the name that you use in the <code>serviceConnectConfiguration</code> of a service. The name can
     *        include up to 64 characters. The characters can include lowercase letters, numbers, underscores (_), and
     *        hyphens (-). The name can't start with a hyphen.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We
     * recommend that you set this parameter to be consistent with the protocol that your application uses. If you set
     * this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set
     * this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     * </p>
     * <p>
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific
     * telemetry for TCP.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param appProtocol
     *        The application protocol that's used for the port mapping. This parameter only applies to Service Connect.
     *        We recommend that you set this parameter to be consistent with the protocol that your application uses. If
     *        you set this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect
     *        proxy. If you set this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console
     *        and CloudWatch.</p>
     *        <p>
     *        If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add
     *        protocol-specific telemetry for TCP.
     *        </p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see ApplicationProtocol
     */

    public void setAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
    }

    /**
     * <p>
     * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We
     * recommend that you set this parameter to be consistent with the protocol that your application uses. If you set
     * this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set
     * this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     * </p>
     * <p>
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific
     * telemetry for TCP.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The application protocol that's used for the port mapping. This parameter only applies to Service
     *         Connect. We recommend that you set this parameter to be consistent with the protocol that your
     *         application uses. If you set this parameter, Amazon ECS adds protocol-specific connection handling to the
     *         Service Connect proxy. If you set this parameter, Amazon ECS adds protocol-specific telemetry in the
     *         Amazon ECS console and CloudWatch.</p>
     *         <p>
     *         If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add
     *         protocol-specific telemetry for TCP.
     *         </p>
     *         <p>
     *         Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *         connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *         container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS
     *         services create are supported with Service Connect. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *         Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see ApplicationProtocol
     */

    public String getAppProtocol() {
        return this.appProtocol;
    }

    /**
     * <p>
     * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We
     * recommend that you set this parameter to be consistent with the protocol that your application uses. If you set
     * this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set
     * this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     * </p>
     * <p>
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific
     * telemetry for TCP.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param appProtocol
     *        The application protocol that's used for the port mapping. This parameter only applies to Service Connect.
     *        We recommend that you set this parameter to be consistent with the protocol that your application uses. If
     *        you set this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect
     *        proxy. If you set this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console
     *        and CloudWatch.</p>
     *        <p>
     *        If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add
     *        protocol-specific telemetry for TCP.
     *        </p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationProtocol
     */

    public PortMapping withAppProtocol(String appProtocol) {
        setAppProtocol(appProtocol);
        return this;
    }

    /**
     * <p>
     * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We
     * recommend that you set this parameter to be consistent with the protocol that your application uses. If you set
     * this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set
     * this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     * </p>
     * <p>
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific
     * telemetry for TCP.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param appProtocol
     *        The application protocol that's used for the port mapping. This parameter only applies to Service Connect.
     *        We recommend that you set this parameter to be consistent with the protocol that your application uses. If
     *        you set this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect
     *        proxy. If you set this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console
     *        and CloudWatch.</p>
     *        <p>
     *        If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add
     *        protocol-specific telemetry for TCP.
     *        </p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see ApplicationProtocol
     */

    public void setAppProtocol(ApplicationProtocol appProtocol) {
        withAppProtocol(appProtocol);
    }

    /**
     * <p>
     * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We
     * recommend that you set this parameter to be consistent with the protocol that your application uses. If you set
     * this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set
     * this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     * </p>
     * <p>
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific
     * telemetry for TCP.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param appProtocol
     *        The application protocol that's used for the port mapping. This parameter only applies to Service Connect.
     *        We recommend that you set this parameter to be consistent with the protocol that your application uses. If
     *        you set this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect
     *        proxy. If you set this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console
     *        and CloudWatch.</p>
     *        <p>
     *        If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add
     *        protocol-specific telemetry for TCP.
     *        </p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationProtocol
     */

    public PortMapping withAppProtocol(ApplicationProtocol appProtocol) {
        this.appProtocol = appProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The port number range on the container that's bound to the dynamically mapped host port range.
     * </p>
     * <p>
     * The following rules apply when you specify a <code>containerPortRange</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the EC2 and Fargate launch types.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the Linux and Windows operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * The container instance must have at least version 1.67.0 of the container agent and at least version 1.67.0-1 of
     * the <code>ecs-init</code> package
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify a maximum of 100 port ranges per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host ports
     * from the default ephemeral range and passes it to docker to bind them to the container ports.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>containerPortRange</code> valid values are between 1 and 65535.
     * </p>
     * </li>
     * <li>
     * <p>
     * A port can only be included in one port mapping per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot specify overlapping port ranges.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first port in the range must be less than last port in the range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a large
     * number of ports.
     * </p>
     * <p>
     * For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the Github
     * website.
     * </p>
     * <p>
     * For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     * >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     * <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are bound to
     * the container ports.
     * </p>
     * 
     * @param containerPortRange
     *        The port number range on the container that's bound to the dynamically mapped host port range.</p>
     *        <p>
     *        The following rules apply when you specify a <code>containerPortRange</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter is available for both the EC2 and Fargate launch types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter is available for both the Linux and Windows operating systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The container instance must have at least version 1.67.0 of the container agent and at least version
     *        1.67.0-1 of the <code>ecs-init</code> package
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify a maximum of 100 port ranges per container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as
     *        follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to
     *        the same value as the <code>containerPort</code>. This is a static mapping strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host
     *        ports from the default ephemeral range and passes it to docker to bind them to the container ports.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>containerPortRange</code> valid values are between 1 and 65535.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A port can only be included in one port mapping per container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You cannot specify overlapping port ranges.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first port in the range must be less than last port in the range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a
     *        large number of ports.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the
     *        Github website.
     *        </p>
     *        <p>
     *        For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     *        >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     *        <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are
     *        bound to the container ports.
     */

    public void setContainerPortRange(String containerPortRange) {
        this.containerPortRange = containerPortRange;
    }

    /**
     * <p>
     * The port number range on the container that's bound to the dynamically mapped host port range.
     * </p>
     * <p>
     * The following rules apply when you specify a <code>containerPortRange</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the EC2 and Fargate launch types.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the Linux and Windows operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * The container instance must have at least version 1.67.0 of the container agent and at least version 1.67.0-1 of
     * the <code>ecs-init</code> package
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify a maximum of 100 port ranges per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host ports
     * from the default ephemeral range and passes it to docker to bind them to the container ports.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>containerPortRange</code> valid values are between 1 and 65535.
     * </p>
     * </li>
     * <li>
     * <p>
     * A port can only be included in one port mapping per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot specify overlapping port ranges.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first port in the range must be less than last port in the range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a large
     * number of ports.
     * </p>
     * <p>
     * For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the Github
     * website.
     * </p>
     * <p>
     * For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     * >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     * <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are bound to
     * the container ports.
     * </p>
     * 
     * @return The port number range on the container that's bound to the dynamically mapped host port range.</p>
     *         <p>
     *         The following rules apply when you specify a <code>containerPortRange</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This parameter is available for both the EC2 and Fargate launch types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This parameter is available for both the Linux and Windows operating systems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The container instance must have at least version 1.67.0 of the container agent and at least version
     *         1.67.0-1 of the <code>ecs-init</code> package
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can specify a maximum of 100 port ranges per container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as
     *         follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to
     *         the same value as the <code>containerPort</code>. This is a static mapping strategy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host
     *         ports from the default ephemeral range and passes it to docker to bind them to the container ports.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>containerPortRange</code> valid values are between 1 and 65535.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A port can only be included in one port mapping per container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You cannot specify overlapping port ranges.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first port in the range must be less than last port in the range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a
     *         large number of ports.
     *         </p>
     *         <p>
     *         For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the
     *         Github website.
     *         </p>
     *         <p>
     *         For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     *         >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     *         <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are
     *         bound to the container ports.
     */

    public String getContainerPortRange() {
        return this.containerPortRange;
    }

    /**
     * <p>
     * The port number range on the container that's bound to the dynamically mapped host port range.
     * </p>
     * <p>
     * The following rules apply when you specify a <code>containerPortRange</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the EC2 and Fargate launch types.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter is available for both the Linux and Windows operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * The container instance must have at least version 1.67.0 of the container agent and at least version 1.67.0-1 of
     * the <code>ecs-init</code> package
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify a maximum of 100 port ranges per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to the same
     * value as the <code>containerPort</code>. This is a static mapping strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host ports
     * from the default ephemeral range and passes it to docker to bind them to the container ports.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>containerPortRange</code> valid values are between 1 and 65535.
     * </p>
     * </li>
     * <li>
     * <p>
     * A port can only be included in one port mapping per container.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot specify overlapping port ranges.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first port in the range must be less than last port in the range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a large
     * number of ports.
     * </p>
     * <p>
     * For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the Github
     * website.
     * </p>
     * <p>
     * For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     * >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     * <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are bound to
     * the container ports.
     * </p>
     * 
     * @param containerPortRange
     *        The port number range on the container that's bound to the dynamically mapped host port range.</p>
     *        <p>
     *        The following rules apply when you specify a <code>containerPortRange</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You must use either the <code>bridge</code> network mode or the <code>awsvpc</code> network mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter is available for both the EC2 and Fargate launch types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter is available for both the Linux and Windows operating systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The container instance must have at least version 1.67.0 of the container agent and at least version
     *        1.67.0-1 of the <code>ecs-init</code> package
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify a maximum of 100 port ranges per container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You do not specify a <code>hostPortRange</code>. The value of the <code>hostPortRange</code> is set as
     *        follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>awsvpc</code> network mode, the <code>hostPort</code> is set to
     *        the same value as the <code>containerPort</code>. This is a static mapping strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For containers in a task with the <code>bridge</code> network mode, the Amazon ECS agent finds open host
     *        ports from the default ephemeral range and passes it to docker to bind them to the container ports.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>containerPortRange</code> valid values are between 1 and 65535.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A port can only be included in one port mapping per container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You cannot specify overlapping port ranges.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first port in the range must be less than last port in the range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a
     *        large number of ports.
     *        </p>
     *        <p>
     *        For more information, see <a href="https://github.com/moby/moby/issues/11185"> Issue #11185</a> on the
     *        Github website.
     *        </p>
     *        <p>
     *        For information about how to turn off the docker-proxy in the Docker daemon config file, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon"
     *        >Docker daemon</a> in the <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can call <a href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html">
     *        <code>DescribeTasks</code> </a> to view the <code>hostPortRange</code> which are the host ports that are
     *        bound to the container ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withContainerPortRange(String containerPortRange) {
        setContainerPortRange(containerPortRange);
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
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort()).append(",");
        if (getHostPort() != null)
            sb.append("HostPort: ").append(getHostPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAppProtocol() != null)
            sb.append("AppProtocol: ").append(getAppProtocol()).append(",");
        if (getContainerPortRange() != null)
            sb.append("ContainerPortRange: ").append(getContainerPortRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortMapping == false)
            return false;
        PortMapping other = (PortMapping) obj;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getHostPort() == null ^ this.getHostPort() == null)
            return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAppProtocol() == null ^ this.getAppProtocol() == null)
            return false;
        if (other.getAppProtocol() != null && other.getAppProtocol().equals(this.getAppProtocol()) == false)
            return false;
        if (other.getContainerPortRange() == null ^ this.getContainerPortRange() == null)
            return false;
        if (other.getContainerPortRange() != null && other.getContainerPortRange().equals(this.getContainerPortRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAppProtocol() == null) ? 0 : getAppProtocol().hashCode());
        hashCode = prime * hashCode + ((getContainerPortRange() == null) ? 0 : getContainerPortRange().hashCode());
        return hashCode;
    }

    @Override
    public PortMapping clone() {
        try {
            return (PortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.PortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
