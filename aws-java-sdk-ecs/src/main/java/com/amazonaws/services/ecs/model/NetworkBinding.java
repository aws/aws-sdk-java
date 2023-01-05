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
 * Details on the network bindings between a container and its host container instance. After a task reaches the
 * <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the
 * <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/NetworkBinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkBinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     */
    private String bindIP;
    /**
     * <p>
     * The port number on the container that's used with the network binding.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port number on the host that's used with the network binding.
     * </p>
     */
    private Integer hostPort;
    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     */
    private String protocol;
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
     * The port number range on the host that's used with the network binding. This is assigned is assigned by Docker
     * and delivered by the Amazon ECS agent.
     * </p>
     */
    private String hostPortRange;

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * 
     * @param bindIP
     *        The IP address that the container is bound to on the container instance.
     */

    public void setBindIP(String bindIP) {
        this.bindIP = bindIP;
    }

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * 
     * @return The IP address that the container is bound to on the container instance.
     */

    public String getBindIP() {
        return this.bindIP;
    }

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * 
     * @param bindIP
     *        The IP address that the container is bound to on the container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withBindIP(String bindIP) {
        setBindIP(bindIP);
        return this;
    }

    /**
     * <p>
     * The port number on the container that's used with the network binding.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that's used with the network binding.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that's used with the network binding.
     * </p>
     * 
     * @return The port number on the container that's used with the network binding.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port number on the container that's used with the network binding.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that's used with the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port number on the host that's used with the network binding.
     * </p>
     * 
     * @param hostPort
     *        The port number on the host that's used with the network binding.
     */

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the host that's used with the network binding.
     * </p>
     * 
     * @return The port number on the host that's used with the network binding.
     */

    public Integer getHostPort() {
        return this.hostPort;
    }

    /**
     * <p>
     * The port number on the host that's used with the network binding.
     * </p>
     * 
     * @param hostPort
     *        The port number on the host that's used with the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withHostPort(Integer hostPort) {
        setHostPort(hostPort);
        return this;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @see TransportProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @return The protocol used for the network binding.
     * @see TransportProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public NetworkBinding withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @see TransportProtocol
     */

    public void setProtocol(TransportProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public NetworkBinding withProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
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

    public NetworkBinding withContainerPortRange(String containerPortRange) {
        setContainerPortRange(containerPortRange);
        return this;
    }

    /**
     * <p>
     * The port number range on the host that's used with the network binding. This is assigned is assigned by Docker
     * and delivered by the Amazon ECS agent.
     * </p>
     * 
     * @param hostPortRange
     *        The port number range on the host that's used with the network binding. This is assigned is assigned by
     *        Docker and delivered by the Amazon ECS agent.
     */

    public void setHostPortRange(String hostPortRange) {
        this.hostPortRange = hostPortRange;
    }

    /**
     * <p>
     * The port number range on the host that's used with the network binding. This is assigned is assigned by Docker
     * and delivered by the Amazon ECS agent.
     * </p>
     * 
     * @return The port number range on the host that's used with the network binding. This is assigned is assigned by
     *         Docker and delivered by the Amazon ECS agent.
     */

    public String getHostPortRange() {
        return this.hostPortRange;
    }

    /**
     * <p>
     * The port number range on the host that's used with the network binding. This is assigned is assigned by Docker
     * and delivered by the Amazon ECS agent.
     * </p>
     * 
     * @param hostPortRange
     *        The port number range on the host that's used with the network binding. This is assigned is assigned by
     *        Docker and delivered by the Amazon ECS agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withHostPortRange(String hostPortRange) {
        setHostPortRange(hostPortRange);
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
        if (getBindIP() != null)
            sb.append("BindIP: ").append(getBindIP()).append(",");
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort()).append(",");
        if (getHostPort() != null)
            sb.append("HostPort: ").append(getHostPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getContainerPortRange() != null)
            sb.append("ContainerPortRange: ").append(getContainerPortRange()).append(",");
        if (getHostPortRange() != null)
            sb.append("HostPortRange: ").append(getHostPortRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkBinding == false)
            return false;
        NetworkBinding other = (NetworkBinding) obj;
        if (other.getBindIP() == null ^ this.getBindIP() == null)
            return false;
        if (other.getBindIP() != null && other.getBindIP().equals(this.getBindIP()) == false)
            return false;
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
        if (other.getContainerPortRange() == null ^ this.getContainerPortRange() == null)
            return false;
        if (other.getContainerPortRange() != null && other.getContainerPortRange().equals(this.getContainerPortRange()) == false)
            return false;
        if (other.getHostPortRange() == null ^ this.getHostPortRange() == null)
            return false;
        if (other.getHostPortRange() != null && other.getHostPortRange().equals(this.getHostPortRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBindIP() == null) ? 0 : getBindIP().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getContainerPortRange() == null) ? 0 : getContainerPortRange().hashCode());
        hashCode = prime * hashCode + ((getHostPortRange() == null) ? 0 : getHostPortRange().hashCode());
        return hashCode;
    }

    @Override
    public NetworkBinding clone() {
        try {
            return (NetworkBinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.NetworkBindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
