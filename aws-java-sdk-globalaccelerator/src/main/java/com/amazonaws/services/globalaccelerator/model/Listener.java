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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for a listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/Listener" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listener implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The list of port ranges for the connections from clients to the accelerator.
     * </p>
     */
    private java.util.List<PortRange> portRanges;
    /**
     * <p>
     * The protocol for the connections from clients to the accelerator.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to
     * always route each client to the same specific endpoint.
     * </p>
     * <p>
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection.
     * If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP
     * address, source port, destination IP address, destination port, and protocol—to select the hash value, and then
     * chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global
     * Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.
     * </p>
     * <p>
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     */
    private String clientAffinity;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The list of port ranges for the connections from clients to the accelerator.
     * </p>
     * 
     * @return The list of port ranges for the connections from clients to the accelerator.
     */

    public java.util.List<PortRange> getPortRanges() {
        return portRanges;
    }

    /**
     * <p>
     * The list of port ranges for the connections from clients to the accelerator.
     * </p>
     * 
     * @param portRanges
     *        The list of port ranges for the connections from clients to the accelerator.
     */

    public void setPortRanges(java.util.Collection<PortRange> portRanges) {
        if (portRanges == null) {
            this.portRanges = null;
            return;
        }

        this.portRanges = new java.util.ArrayList<PortRange>(portRanges);
    }

    /**
     * <p>
     * The list of port ranges for the connections from clients to the accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortRanges(java.util.Collection)} or {@link #withPortRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portRanges
     *        The list of port ranges for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withPortRanges(PortRange... portRanges) {
        if (this.portRanges == null) {
            setPortRanges(new java.util.ArrayList<PortRange>(portRanges.length));
        }
        for (PortRange ele : portRanges) {
            this.portRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of port ranges for the connections from clients to the accelerator.
     * </p>
     * 
     * @param portRanges
     *        The list of port ranges for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withPortRanges(java.util.Collection<PortRange> portRanges) {
        setPortRanges(portRanges);
        return this;
    }

    /**
     * <p>
     * The protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @param protocol
     *        The protocol for the connections from clients to the accelerator.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @return The protocol for the connections from clients to the accelerator.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @param protocol
     *        The protocol for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public Listener withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @param protocol
     *        The protocol for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public Listener withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to
     * always route each client to the same specific endpoint.
     * </p>
     * <p>
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection.
     * If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP
     * address, source port, destination IP address, destination port, and protocol—to select the hash value, and then
     * chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global
     * Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.
     * </p>
     * <p>
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @param clientAffinity
     *        Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *        applications, regardless of the port and protocol of the client request. Clienty affinity gives you
     *        control over whether to always route each client to the same specific endpoint.</p>
     *        <p>
     *        AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a
     *        connection. If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple)
     *        properties—source IP address, source port, destination IP address, destination port, and protocol—to
     *        select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses
     *        different ports to connect to Global Accelerator, their connections might not be always routed to the same
     *        endpoint because the hash value changes.
     *        </p>
     *        <p>
     *        If you want a given client to always be routed to the same endpoint, set client affinity to
     *        <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses
     *        the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the
     *        hash value.
     *        </p>
     *        <p>
     *        The default value is <code>NONE</code>.
     * @see ClientAffinity
     */

    public void setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to
     * always route each client to the same specific endpoint.
     * </p>
     * <p>
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection.
     * If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP
     * address, source port, destination IP address, destination port, and protocol—to select the hash value, and then
     * chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global
     * Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.
     * </p>
     * <p>
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @return Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *         applications, regardless of the port and protocol of the client request. Clienty affinity gives you
     *         control over whether to always route each client to the same specific endpoint.</p>
     *         <p>
     *         AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a
     *         connection. If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple)
     *         properties—source IP address, source port, destination IP address, destination port, and protocol—to
     *         select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses
     *         different ports to connect to Global Accelerator, their connections might not be always routed to the
     *         same endpoint because the hash value changes.
     *         </p>
     *         <p>
     *         If you want a given client to always be routed to the same endpoint, set client affinity to
     *         <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses
     *         the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the
     *         hash value.
     *         </p>
     *         <p>
     *         The default value is <code>NONE</code>.
     * @see ClientAffinity
     */

    public String getClientAffinity() {
        return this.clientAffinity;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to
     * always route each client to the same specific endpoint.
     * </p>
     * <p>
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection.
     * If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP
     * address, source port, destination IP address, destination port, and protocol—to select the hash value, and then
     * chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global
     * Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.
     * </p>
     * <p>
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @param clientAffinity
     *        Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *        applications, regardless of the port and protocol of the client request. Clienty affinity gives you
     *        control over whether to always route each client to the same specific endpoint.</p>
     *        <p>
     *        AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a
     *        connection. If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple)
     *        properties—source IP address, source port, destination IP address, destination port, and protocol—to
     *        select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses
     *        different ports to connect to Global Accelerator, their connections might not be always routed to the same
     *        endpoint because the hash value changes.
     *        </p>
     *        <p>
     *        If you want a given client to always be routed to the same endpoint, set client affinity to
     *        <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses
     *        the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the
     *        hash value.
     *        </p>
     *        <p>
     *        The default value is <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAffinity
     */

    public Listener withClientAffinity(String clientAffinity) {
        setClientAffinity(clientAffinity);
        return this;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to
     * always route each client to the same specific endpoint.
     * </p>
     * <p>
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection.
     * If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP
     * address, source port, destination IP address, destination port, and protocol—to select the hash value, and then
     * chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global
     * Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.
     * </p>
     * <p>
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @param clientAffinity
     *        Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *        applications, regardless of the port and protocol of the client request. Clienty affinity gives you
     *        control over whether to always route each client to the same specific endpoint.</p>
     *        <p>
     *        AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a
     *        connection. If client affinity is <code>NONE</code>, Global Accelerator uses the "five-tuple" (5-tuple)
     *        properties—source IP address, source port, destination IP address, destination port, and protocol—to
     *        select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses
     *        different ports to connect to Global Accelerator, their connections might not be always routed to the same
     *        endpoint because the hash value changes.
     *        </p>
     *        <p>
     *        If you want a given client to always be routed to the same endpoint, set client affinity to
     *        <code>SOURCE_IP</code> instead. When you use the <code>SOURCE_IP</code> setting, Global Accelerator uses
     *        the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the
     *        hash value.
     *        </p>
     *        <p>
     *        The default value is <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAffinity
     */

    public Listener withClientAffinity(ClientAffinity clientAffinity) {
        this.clientAffinity = clientAffinity.toString();
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getPortRanges() != null)
            sb.append("PortRanges: ").append(getPortRanges()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getClientAffinity() != null)
            sb.append("ClientAffinity: ").append(getClientAffinity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Listener == false)
            return false;
        Listener other = (Listener) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getPortRanges() == null ^ this.getPortRanges() == null)
            return false;
        if (other.getPortRanges() != null && other.getPortRanges().equals(this.getPortRanges()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getClientAffinity() == null ^ this.getClientAffinity() == null)
            return false;
        if (other.getClientAffinity() != null && other.getClientAffinity().equals(this.getClientAffinity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getPortRanges() == null) ? 0 : getPortRanges().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getClientAffinity() == null) ? 0 : getClientAffinity().hashCode());
        return hashCode;
    }

    @Override
    public Listener clone() {
        try {
            return (Listener) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.ListenerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
