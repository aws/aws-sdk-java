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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the port state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstancePortState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePortState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first port in the range.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The last port in the range.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The protocol being used. Can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * </ul>
     */
    private String protocol;
    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param fromPort
     *        The first port in the range.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @return The first port in the range.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param fromPort
     *        The first port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortState withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param toPort
     *        The last port in the range.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @return The last port in the range.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param toPort
     *        The last port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortState withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The protocol being used. Can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocol being used. Can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     * @see NetworkProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol being used. Can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The protocol being used. Can be one of the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *         delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *         have an application that doesn't require reliable data stream service, use UDP instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>all</code> - All transport layer protocol types. For more general information, see <a
     *         href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *         datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *         set up transmission channels or data paths. Applications that don't require reliable data stream service
     *         can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *         reliability. If you do require reliable data stream service, use TCP instead.
     *         </p>
     *         </li>
     * @see NetworkProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol being used. Can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocol being used. Can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public InstancePortState withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol being used. Can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocol being used. Can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     * @see NetworkProtocol
     */

    public void setProtocol(NetworkProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol being used. Can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of
     * streamed data between applications running on hosts communicating by an IP network. If you have an application
     * that doesn't require reliable data stream service, use UDP instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to
     * other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission
     * channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides
     * a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable
     * data stream service, use TCP instead.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The protocol being used. Can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
     *        delivery of streamed data between applications running on hosts communicating by an IP network. If you
     *        have an application that doesn't require reliable data stream service, use UDP instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> - All transport layer protocol types. For more general information, see <a
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on Wikipedia.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>udp</code> - With User Datagram Protocol (UDP), computer applications can send messages (or
     *        datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to
     *        set up transmission channels or data paths. Applications that don't require reliable data stream service
     *        can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over
     *        reliability. If you do require reliable data stream service, use TCP instead.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public InstancePortState withProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * </p>
     * 
     * @param state
     *        Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * @see PortState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * </p>
     * 
     * @return Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * @see PortState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * </p>
     * 
     * @param state
     *        Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortState
     */

    public InstancePortState withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * </p>
     * 
     * @param state
     *        Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * @see PortState
     */

    public void setState(PortState state) {
        withState(state);
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * </p>
     * 
     * @param state
     *        Specifies whether the instance port is <code>open</code> or <code>closed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortState
     */

    public InstancePortState withState(PortState state) {
        this.state = state.toString();
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePortState == false)
            return false;
        InstancePortState other = (InstancePortState) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public InstancePortState clone() {
        try {
            return (InstancePortState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstancePortStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
