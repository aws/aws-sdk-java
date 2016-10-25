/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Port mappings allow containers to access ports on the host container instance to send or receive traffic. Port
 * mappings are specified as part of the container definition. After a task reaches the <code>RUNNING</code> status,
 * manual and automatic host and container port assignments are visible in the <code>networkBindings</code> section of
 * <a>DescribeTasks</a> API responses.
 * </p>
 */
public class PortMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port. If you
     * specify a container port and not a host port, your container automatically receives a host port in the ephemeral
     * port range (for more information, see <code>hostPort</code>). Port mappings that are automatically assigned in
     * this way do not count toward the 100 reserved ports limit of a container instance.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port number on the container instance to reserve for your container. You can specify a non-reserved host port
     * for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>) while
     * specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to 1.6.0.
     * For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     * ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range, because
     * these are reserved for automatic assignment. In general, ports below 32768 are outside of the ephemeral port
     * range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678 and 51679. Any host port that was previously specified in a running task is also reserved while the
     * task is running (after a task stops, the host port is released).The current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a> output, and a container instance may have up
     * to 100 reserved ports at a time, including the default reserved ports (automatically assigned ports do not count
     * toward the 100 reserved ports limit).
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
     * The port number on the container that is bound to the user-specified or automatically assigned host port. If you
     * specify a container port and not a host port, your container automatically receives a host port in the ephemeral
     * port range (for more information, see <code>hostPort</code>). Port mappings that are automatically assigned in
     * this way do not count toward the 100 reserved ports limit of a container instance.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that is bound to the user-specified or automatically assigned host port.
     *        If you specify a container port and not a host port, your container automatically receives a host port in
     *        the ephemeral port range (for more information, see <code>hostPort</code>). Port mappings that are
     *        automatically assigned in this way do not count toward the 100 reserved ports limit of a container
     *        instance.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port. If you
     * specify a container port and not a host port, your container automatically receives a host port in the ephemeral
     * port range (for more information, see <code>hostPort</code>). Port mappings that are automatically assigned in
     * this way do not count toward the 100 reserved ports limit of a container instance.
     * </p>
     * 
     * @return The port number on the container that is bound to the user-specified or automatically assigned host port.
     *         If you specify a container port and not a host port, your container automatically receives a host port in
     *         the ephemeral port range (for more information, see <code>hostPort</code>). Port mappings that are
     *         automatically assigned in this way do not count toward the 100 reserved ports limit of a container
     *         instance.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port. If you
     * specify a container port and not a host port, your container automatically receives a host port in the ephemeral
     * port range (for more information, see <code>hostPort</code>). Port mappings that are automatically assigned in
     * this way do not count toward the 100 reserved ports limit of a container instance.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that is bound to the user-specified or automatically assigned host port.
     *        If you specify a container port and not a host port, your container automatically receives a host port in
     *        the ephemeral port range (for more information, see <code>hostPort</code>). Port mappings that are
     *        automatically assigned in this way do not count toward the 100 reserved ports limit of a container
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container. You can specify a non-reserved host port
     * for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>) while
     * specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to 1.6.0.
     * For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     * ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range, because
     * these are reserved for automatic assignment. In general, ports below 32768 are outside of the ephemeral port
     * range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678 and 51679. Any host port that was previously specified in a running task is also reserved while the
     * task is running (after a task stops, the host port is released).The current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a> output, and a container instance may have up
     * to 100 reserved ports at a time, including the default reserved ports (automatically assigned ports do not count
     * toward the 100 reserved ports limit).
     * </p>
     * 
     * @param hostPort
     *        The port number on the container instance to reserve for your container. You can specify a non-reserved
     *        host port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to
     *        <code>0</code>) while specifying a <code>containerPort</code> and your container automatically receives a
     *        port in the ephemeral port range for your container instance operating system and Docker version.</p>
     *        <p>
     *        The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to
     *        1.6.0. For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     *        <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     *        ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range,
     *        because these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     *        ephemeral port range.
     *        </p>
     *        <p>
     *        The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container
     *        agent ports 51678 and 51679. Any host port that was previously specified in a running task is also
     *        reserved while the task is running (after a task stops, the host port is released).The current reserved
     *        ports are displayed in the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output,
     *        and a container instance may have up to 100 reserved ports at a time, including the default reserved ports
     *        (automatically assigned ports do not count toward the 100 reserved ports limit).
     */

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container. You can specify a non-reserved host port
     * for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>) while
     * specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to 1.6.0.
     * For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     * ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range, because
     * these are reserved for automatic assignment. In general, ports below 32768 are outside of the ephemeral port
     * range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678 and 51679. Any host port that was previously specified in a running task is also reserved while the
     * task is running (after a task stops, the host port is released).The current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a> output, and a container instance may have up
     * to 100 reserved ports at a time, including the default reserved ports (automatically assigned ports do not count
     * toward the 100 reserved ports limit).
     * </p>
     * 
     * @return The port number on the container instance to reserve for your container. You can specify a non-reserved
     *         host port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to
     *         <code>0</code>) while specifying a <code>containerPort</code> and your container automatically receives a
     *         port in the ephemeral port range for your container instance operating system and Docker version.</p>
     *         <p>
     *         The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to
     *         1.6.0. For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     *         <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     *         ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range,
     *         because these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     *         ephemeral port range.
     *         </p>
     *         <p>
     *         The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container
     *         agent ports 51678 and 51679. Any host port that was previously specified in a running task is also
     *         reserved while the task is running (after a task stops, the host port is released).The current reserved
     *         ports are displayed in the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output,
     *         and a container instance may have up to 100 reserved ports at a time, including the default reserved
     *         ports (automatically assigned ports do not count toward the 100 reserved ports limit).
     */

    public Integer getHostPort() {
        return this.hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container. You can specify a non-reserved host port
     * for your container port mapping, or you can omit the <code>hostPort</code> (or set it to <code>0</code>) while
     * specifying a <code>containerPort</code> and your container automatically receives a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to 1.6.0.
     * For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     * ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range, because
     * these are reserved for automatic assignment. In general, ports below 32768 are outside of the ephemeral port
     * range.
     * </p>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent
     * ports 51678 and 51679. Any host port that was previously specified in a running task is also reserved while the
     * task is running (after a task stops, the host port is released).The current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a> output, and a container instance may have up
     * to 100 reserved ports at a time, including the default reserved ports (automatically assigned ports do not count
     * toward the 100 reserved ports limit).
     * </p>
     * 
     * @param hostPort
     *        The port number on the container instance to reserve for your container. You can specify a non-reserved
     *        host port for your container port mapping, or you can omit the <code>hostPort</code> (or set it to
     *        <code>0</code>) while specifying a <code>containerPort</code> and your container automatically receives a
     *        port in the ephemeral port range for your container instance operating system and Docker version.</p>
     *        <p>
     *        The default ephemeral port range is 49153 to 65535, and this range is used for Docker versions prior to
     *        1.6.0. For Docker version 1.6.0 and later, the Docker daemon tries to read the ephemeral port range from
     *        <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this kernel parameter is unavailable, the default
     *        ephemeral port range is used. You should not attempt to specify a host port in the ephemeral port range,
     *        because these are reserved for automatic assignment. In general, ports below 32768 are outside of the
     *        ephemeral port range.
     *        </p>
     *        <p>
     *        The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container
     *        agent ports 51678 and 51679. Any host port that was previously specified in a running task is also
     *        reserved while the task is running (after a task stops, the host port is released).The current reserved
     *        ports are displayed in the <code>remainingResources</code> of <a>DescribeContainerInstances</a> output,
     *        and a container instance may have up to 100 reserved ports at a time, including the default reserved ports
     *        (automatically assigned ports do not count toward the 100 reserved ports limit).
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
        this.protocol = protocol.toString();
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
        setProtocol(protocol);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ContainerPort: " + getContainerPort() + ",");
        if (getHostPort() != null)
            sb.append("HostPort: " + getHostPort() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
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
}
