/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes information about ports for an Amazon Lightsail instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstancePortInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePortInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer fromPort;
    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer toPort;
    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
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
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached. When you specify <code>icmp</code> as the <code>protocol</code>, you must
     * specify the ICMP type using the <code>fromPort</code> parameter, and ICMP code using the <code>toPort</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String protocol;
    /**
     * <p>
     * The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or <code>Custom</code>
     * if a specific IP address or range of IP addresses is allowed.
     * </p>
     */
    private String accessFrom;
    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     */
    private String accessType;
    /**
     * <p>
     * The common name of the port information.
     * </p>
     */
    private String commonName;
    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * <note>
     * <p>
     * Lightsail currently supports only <code>inbound</code> access direction.
     * </p>
     * </note>
     */
    private String accessDirection;
    /**
     * <p>
     * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol.
     * </p>
     * <note>
     * <p>
     * The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     */
    private java.util.List<String> cidrs;
    /**
     * <p>
     * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through IPv6;
     * otherwise, IPv4 should be used.
     * </p>
     * <note>
     * <p>
     * The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     */
    private java.util.List<String> ipv6Cidrs;
    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     */
    private java.util.List<String> cidrListAliases;

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fromPort
     *        The first port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code>
     *        (ICMP type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control
     *        Messages</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the
     *        <code>fromPort</code> (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message
     *        Protocol for IPv6</a>.
     *        </p>
     *        </li>
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The first port in a range of open ports on an instance.</p>
     *         <p>
     *         Allowed ports:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         TCP and UDP - <code>0</code> to <code>65535</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code>
     *         (ICMP type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *         information, see <a
     *         href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control
     *         Messages</a> on <i>Wikipedia</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the
     *         <code>fromPort</code> (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more
     *         information, see <a
     *         href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message
     *         Protocol for IPv6</a>.
     *         </p>
     *         </li>
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fromPort
     *        The first port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - The ICMP type for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code>
     *        (ICMP type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control
     *        Messages</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMPv6 - The ICMP type for IPv6 addresses. For example, specify <code>128</code> as the
     *        <code>fromPort</code> (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message
     *        Protocol for IPv6</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param toPort
     *        The last port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code>
     *        (ICMP type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control
     *        Messages</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the
     *        <code>fromPort</code> (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message
     *        Protocol for IPv6</a>.
     *        </p>
     *        </li>
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The last port in a range of open ports on an instance.</p>
     *         <p>
     *         Allowed ports:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         TCP and UDP - <code>0</code> to <code>65535</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code>
     *         (ICMP type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *         information, see <a
     *         href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control
     *         Messages</a> on <i>Wikipedia</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the
     *         <code>fromPort</code> (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more
     *         information, see <a
     *         href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message
     *         Protocol for IPv6</a>.
     *         </p>
     *         </li>
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code> (ICMP
     * type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more information, see
     * <a href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control Messages</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the <code>fromPort</code>
     * (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more information, see <a
     * href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message Protocol
     * for IPv6</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param toPort
     *        The last port in a range of open ports on an instance.</p>
     *        <p>
     *        Allowed ports:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        TCP and UDP - <code>0</code> to <code>65535</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMP - The ICMP code for IPv4 addresses. For example, specify <code>8</code> as the <code>fromPort</code>
     *        (ICMP type), and <code>-1</code> as the <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages">Control
     *        Messages</a> on <i>Wikipedia</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ICMPv6 - The ICMP code for IPv6 addresses. For example, specify <code>128</code> as the
     *        <code>fromPort</code> (ICMPv6 type), and <code>0</code> as <code>toPort</code> (ICMPv6 code). For more
     *        information, see <a
     *        href="https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol_for_IPv6">Internet Control Message
     *        Protocol for IPv6</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
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
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached. When you specify <code>icmp</code> as the <code>protocol</code>, you must
     * specify the ICMP type using the <code>fromPort</code> parameter, and ICMP code using the <code>toPort</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
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
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached. When you specify <code>icmp</code> as the
     *        <code>protocol</code>, you must specify the ICMP type using the <code>fromPort</code> parameter, and ICMP
     *        code using the <code>toPort</code> parameter.
     *        </p>
     *        </li>
     * @see NetworkProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
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
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached. When you specify <code>icmp</code> as the <code>protocol</code>, you must
     * specify the ICMP type using the <code>fromPort</code> parameter, and ICMP code using the <code>toPort</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The IP protocol name.</p>
     *         <p>
     *         The name can be one of the following:
     *         </p>
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
     *         href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     *         <li>
     *         <p>
     *         <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *         operational information indicating success or failure when communicating with an instance. For example,
     *         an error is indicated when an instance could not be reached. When you specify <code>icmp</code> as the
     *         <code>protocol</code>, you must specify the ICMP type using the <code>fromPort</code> parameter, and ICMP
     *         code using the <code>toPort</code> parameter.
     *         </p>
     *         </li>
     * @see NetworkProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
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
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached. When you specify <code>icmp</code> as the <code>protocol</code>, you must
     * specify the ICMP type using the <code>fromPort</code> parameter, and ICMP code using the <code>toPort</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
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
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached. When you specify <code>icmp</code> as the
     *        <code>protocol</code>, you must specify the ICMP type using the <code>fromPort</code> parameter, and ICMP
     *        code using the <code>toPort</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public InstancePortInfo withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
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
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached. When you specify <code>icmp</code> as the <code>protocol</code>, you must
     * specify the ICMP type using the <code>fromPort</code> parameter, and ICMP code using the <code>toPort</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
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
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached. When you specify <code>icmp</code> as the
     *        <code>protocol</code>, you must specify the ICMP type using the <code>fromPort</code> parameter, and ICMP
     *        code using the <code>toPort</code> parameter.
     *        </p>
     *        </li>
     * @see NetworkProtocol
     */

    public void setProtocol(NetworkProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
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
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and operational
     * information indicating success or failure when communicating with an instance. For example, an error is indicated
     * when an instance could not be reached. When you specify <code>icmp</code> as the <code>protocol</code>, you must
     * specify the ICMP type using the <code>fromPort</code> parameter, and ICMP code using the <code>toPort</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocol
     *        The IP protocol name.</p>
     *        <p>
     *        The name can be one of the following:
     *        </p>
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
     *        href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a> on <i>Wikipedia</i>.
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
     *        <li>
     *        <p>
     *        <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to send error messages and
     *        operational information indicating success or failure when communicating with an instance. For example, an
     *        error is indicated when an instance could not be reached. When you specify <code>icmp</code> as the
     *        <code>protocol</code>, you must specify the ICMP type using the <code>fromPort</code> parameter, and ICMP
     *        code using the <code>toPort</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public InstancePortInfo withProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or <code>Custom</code>
     * if a specific IP address or range of IP addresses is allowed.
     * </p>
     * 
     * @param accessFrom
     *        The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or
     *        <code>Custom</code> if a specific IP address or range of IP addresses is allowed.
     */

    public void setAccessFrom(String accessFrom) {
        this.accessFrom = accessFrom;
    }

    /**
     * <p>
     * The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or <code>Custom</code>
     * if a specific IP address or range of IP addresses is allowed.
     * </p>
     * 
     * @return The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or
     *         <code>Custom</code> if a specific IP address or range of IP addresses is allowed.
     */

    public String getAccessFrom() {
        return this.accessFrom;
    }

    /**
     * <p>
     * The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or <code>Custom</code>
     * if a specific IP address or range of IP addresses is allowed.
     * </p>
     * 
     * @param accessFrom
     *        The location from which access is allowed. For example, <code>Anywhere (0.0.0.0/0)</code>, or
     *        <code>Custom</code> if a specific IP address or range of IP addresses is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withAccessFrom(String accessFrom) {
        setAccessFrom(accessFrom);
        return this;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @see PortAccessType
     */

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @return The type of access (<code>Public</code> or <code>Private</code>).
     * @see PortAccessType
     */

    public String getAccessType() {
        return this.accessType;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortAccessType
     */

    public InstancePortInfo withAccessType(String accessType) {
        setAccessType(accessType);
        return this;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @see PortAccessType
     */

    public void setAccessType(PortAccessType accessType) {
        withAccessType(accessType);
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortAccessType
     */

    public InstancePortInfo withAccessType(PortAccessType accessType) {
        this.accessType = accessType.toString();
        return this;
    }

    /**
     * <p>
     * The common name of the port information.
     * </p>
     * 
     * @param commonName
     *        The common name of the port information.
     */

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * <p>
     * The common name of the port information.
     * </p>
     * 
     * @return The common name of the port information.
     */

    public String getCommonName() {
        return this.commonName;
    }

    /**
     * <p>
     * The common name of the port information.
     * </p>
     * 
     * @param commonName
     *        The common name of the port information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withCommonName(String commonName) {
        setCommonName(commonName);
        return this;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * <note>
     * <p>
     * Lightsail currently supports only <code>inbound</code> access direction.
     * </p>
     * </note>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).</p> <note>
     *        <p>
     *        Lightsail currently supports only <code>inbound</code> access direction.
     *        </p>
     * @see AccessDirection
     */

    public void setAccessDirection(String accessDirection) {
        this.accessDirection = accessDirection;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * <note>
     * <p>
     * Lightsail currently supports only <code>inbound</code> access direction.
     * </p>
     * </note>
     * 
     * @return The access direction (<code>inbound</code> or <code>outbound</code>).</p> <note>
     *         <p>
     *         Lightsail currently supports only <code>inbound</code> access direction.
     *         </p>
     * @see AccessDirection
     */

    public String getAccessDirection() {
        return this.accessDirection;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * <note>
     * <p>
     * Lightsail currently supports only <code>inbound</code> access direction.
     * </p>
     * </note>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).</p> <note>
     *        <p>
     *        Lightsail currently supports only <code>inbound</code> access direction.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDirection
     */

    public InstancePortInfo withAccessDirection(String accessDirection) {
        setAccessDirection(accessDirection);
        return this;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * <note>
     * <p>
     * Lightsail currently supports only <code>inbound</code> access direction.
     * </p>
     * </note>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).</p> <note>
     *        <p>
     *        Lightsail currently supports only <code>inbound</code> access direction.
     *        </p>
     * @see AccessDirection
     */

    public void setAccessDirection(AccessDirection accessDirection) {
        withAccessDirection(accessDirection);
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * <note>
     * <p>
     * Lightsail currently supports only <code>inbound</code> access direction.
     * </p>
     * </note>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).</p> <note>
     *        <p>
     *        Lightsail currently supports only <code>inbound</code> access direction.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDirection
     */

    public InstancePortInfo withAccessDirection(AccessDirection accessDirection) {
        this.accessDirection = accessDirection.toString();
        return this;
    }

    /**
     * <p>
     * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol.
     * </p>
     * <note>
     * <p>
     * The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @return The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an
     *         instance through the ports, and the protocol.</p> <note>
     *         <p>
     *         The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     *         </p>
     *         </note>
     *         <p>
     *         For more information about CIDR block notation, see <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *         Routing</a> on <i>Wikipedia</i>.
     */

    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol.
     * </p>
     * <note>
     * <p>
     * The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @param cidrs
     *        The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     *        through the ports, and the protocol.</p> <note>
     *        <p>
     *        The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     *        </p>
     *        </note>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     */

    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol.
     * </p>
     * <note>
     * <p>
     * The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrs(java.util.Collection)} or {@link #withCidrs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cidrs
     *        The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     *        through the ports, and the protocol.</p> <note>
     *        <p>
     *        The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     *        </p>
     *        </note>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withCidrs(String... cidrs) {
        if (this.cidrs == null) {
            setCidrs(new java.util.ArrayList<String>(cidrs.length));
        }
        for (String ele : cidrs) {
            this.cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol.
     * </p>
     * <note>
     * <p>
     * The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @param cidrs
     *        The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance
     *        through the ports, and the protocol.</p> <note>
     *        <p>
     *        The <code>ipv6Cidrs</code> parameter lists the IPv6 addresses that are allowed to connect to an instance.
     *        </p>
     *        </note>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through IPv6;
     * otherwise, IPv4 should be used.
     * </p>
     * <note>
     * <p>
     * The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @return The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an
     *         instance through the ports, and the protocol. Only devices with an IPv6 address can connect to an
     *         instance through IPv6; otherwise, IPv4 should be used.</p> <note>
     *         <p>
     *         The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     *         </p>
     *         </note>
     *         <p>
     *         For more information about CIDR block notation, see <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *         Routing</a> on <i>Wikipedia</i>.
     */

    public java.util.List<String> getIpv6Cidrs() {
        return ipv6Cidrs;
    }

    /**
     * <p>
     * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through IPv6;
     * otherwise, IPv4 should be used.
     * </p>
     * <note>
     * <p>
     * The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @param ipv6Cidrs
     *        The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     *        through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through
     *        IPv6; otherwise, IPv4 should be used.</p> <note>
     *        <p>
     *        The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     *        </p>
     *        </note>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     */

    public void setIpv6Cidrs(java.util.Collection<String> ipv6Cidrs) {
        if (ipv6Cidrs == null) {
            this.ipv6Cidrs = null;
            return;
        }

        this.ipv6Cidrs = new java.util.ArrayList<String>(ipv6Cidrs);
    }

    /**
     * <p>
     * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through IPv6;
     * otherwise, IPv4 should be used.
     * </p>
     * <note>
     * <p>
     * The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Cidrs(java.util.Collection)} or {@link #withIpv6Cidrs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv6Cidrs
     *        The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     *        through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through
     *        IPv6; otherwise, IPv4 should be used.</p> <note>
     *        <p>
     *        The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     *        </p>
     *        </note>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withIpv6Cidrs(String... ipv6Cidrs) {
        if (this.ipv6Cidrs == null) {
            setIpv6Cidrs(new java.util.ArrayList<String>(ipv6Cidrs.length));
        }
        for (String ele : ipv6Cidrs) {
            this.ipv6Cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     * through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through IPv6;
     * otherwise, IPv4 should be used.
     * </p>
     * <note>
     * <p>
     * The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     * </p>
     * </note>
     * <p>
     * For more information about CIDR block notation, see <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     * Routing</a> on <i>Wikipedia</i>.
     * </p>
     * 
     * @param ipv6Cidrs
     *        The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance
     *        through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through
     *        IPv6; otherwise, IPv4 should be used.</p> <note>
     *        <p>
     *        The <code>cidrs</code> parameter lists the IPv4 addresses that are allowed to connect to an instance.
     *        </p>
     *        </note>
     *        <p>
     *        For more information about CIDR block notation, see <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation">Classless Inter-Domain
     *        Routing</a> on <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withIpv6Cidrs(java.util.Collection<String> ipv6Cidrs) {
        setIpv6Cidrs(ipv6Cidrs);
        return this;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * 
     * @return An alias that defines access for a preconfigured range of IP addresses.</p>
     *         <p>
     *         The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *         browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     */

    public java.util.List<String> getCidrListAliases() {
        return cidrListAliases;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * 
     * @param cidrListAliases
     *        An alias that defines access for a preconfigured range of IP addresses.</p>
     *        <p>
     *        The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *        browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     */

    public void setCidrListAliases(java.util.Collection<String> cidrListAliases) {
        if (cidrListAliases == null) {
            this.cidrListAliases = null;
            return;
        }

        this.cidrListAliases = new java.util.ArrayList<String>(cidrListAliases);
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrListAliases(java.util.Collection)} or {@link #withCidrListAliases(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cidrListAliases
     *        An alias that defines access for a preconfigured range of IP addresses.</p>
     *        <p>
     *        The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *        browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withCidrListAliases(String... cidrListAliases) {
        if (this.cidrListAliases == null) {
            setCidrListAliases(new java.util.ArrayList<String>(cidrListAliases.length));
        }
        for (String ele : cidrListAliases) {
            this.cidrListAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * </p>
     * 
     * @param cidrListAliases
     *        An alias that defines access for a preconfigured range of IP addresses.</p>
     *        <p>
     *        The only alias currently supported is <code>lightsail-connect</code>, which allows IP addresses of the
     *        browser-based RDP/SSH client in the Lightsail console to connect to your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withCidrListAliases(java.util.Collection<String> cidrListAliases) {
        setCidrListAliases(cidrListAliases);
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
        if (getAccessFrom() != null)
            sb.append("AccessFrom: ").append(getAccessFrom()).append(",");
        if (getAccessType() != null)
            sb.append("AccessType: ").append(getAccessType()).append(",");
        if (getCommonName() != null)
            sb.append("CommonName: ").append(getCommonName()).append(",");
        if (getAccessDirection() != null)
            sb.append("AccessDirection: ").append(getAccessDirection()).append(",");
        if (getCidrs() != null)
            sb.append("Cidrs: ").append(getCidrs()).append(",");
        if (getIpv6Cidrs() != null)
            sb.append("Ipv6Cidrs: ").append(getIpv6Cidrs()).append(",");
        if (getCidrListAliases() != null)
            sb.append("CidrListAliases: ").append(getCidrListAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePortInfo == false)
            return false;
        InstancePortInfo other = (InstancePortInfo) obj;
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
        if (other.getAccessFrom() == null ^ this.getAccessFrom() == null)
            return false;
        if (other.getAccessFrom() != null && other.getAccessFrom().equals(this.getAccessFrom()) == false)
            return false;
        if (other.getAccessType() == null ^ this.getAccessType() == null)
            return false;
        if (other.getAccessType() != null && other.getAccessType().equals(this.getAccessType()) == false)
            return false;
        if (other.getCommonName() == null ^ this.getCommonName() == null)
            return false;
        if (other.getCommonName() != null && other.getCommonName().equals(this.getCommonName()) == false)
            return false;
        if (other.getAccessDirection() == null ^ this.getAccessDirection() == null)
            return false;
        if (other.getAccessDirection() != null && other.getAccessDirection().equals(this.getAccessDirection()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getIpv6Cidrs() == null ^ this.getIpv6Cidrs() == null)
            return false;
        if (other.getIpv6Cidrs() != null && other.getIpv6Cidrs().equals(this.getIpv6Cidrs()) == false)
            return false;
        if (other.getCidrListAliases() == null ^ this.getCidrListAliases() == null)
            return false;
        if (other.getCidrListAliases() != null && other.getCidrListAliases().equals(this.getCidrListAliases()) == false)
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
        hashCode = prime * hashCode + ((getAccessFrom() == null) ? 0 : getAccessFrom().hashCode());
        hashCode = prime * hashCode + ((getAccessType() == null) ? 0 : getAccessType().hashCode());
        hashCode = prime * hashCode + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        hashCode = prime * hashCode + ((getAccessDirection() == null) ? 0 : getAccessDirection().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode + ((getIpv6Cidrs() == null) ? 0 : getIpv6Cidrs().hashCode());
        hashCode = prime * hashCode + ((getCidrListAliases() == null) ? 0 : getCidrListAliases().hashCode());
        return hashCode;
    }

    @Override
    public InstancePortInfo clone() {
        try {
            return (InstancePortInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstancePortInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
