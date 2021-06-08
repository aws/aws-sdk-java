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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The 5-tuple criteria for AWS Network Firewall to use to inspect packet headers in stateful traffic flow inspection.
 * Traffic flows that match the criteria are a match for the corresponding <a>StatefulRule</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/Header" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Header implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and on the
     * internet is IP.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you can
     * specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     */
    private String sourcePort;
    /**
     * <p>
     * The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     * traffic, both from the source to the destination and from the destination to the source. If set to
     * <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     * can specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     */
    private String destinationPort;

    /**
     * <p>
     * The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and on the
     * internet is IP.
     * </p>
     * 
     * @param protocol
     *        The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and
     *        on the internet is IP.
     * @see StatefulRuleProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and on the
     * internet is IP.
     * </p>
     * 
     * @return The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and
     *         on the internet is IP.
     * @see StatefulRuleProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and on the
     * internet is IP.
     * </p>
     * 
     * @param protocol
     *        The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and
     *        on the internet is IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatefulRuleProtocol
     */

    public Header withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and on the
     * internet is IP.
     * </p>
     * 
     * @param protocol
     *        The protocol to inspect for. To specify all, you can use <code>IP</code>, because all traffic on AWS and
     *        on the internet is IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatefulRuleProtocol
     */

    public Header withProtocol(StatefulRuleProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param source
     *        The source IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>. </p>
     *        <p>
     *        Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *        Network Firewall supports all address ranges for IPv4.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @return The source IP address or address range to inspect for, in CIDR notation. To match with any address,
     *         specify <code>ANY</code>. </p>
     *         <p>
     *         Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *         Network Firewall supports all address ranges for IPv4.
     *         </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     *         <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *         <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param source
     *        The source IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>. </p>
     *        <p>
     *        Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *        Network Firewall supports all address ranges for IPv4.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Header withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you can
     * specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param sourcePort
     *        The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     *        can specify a port range, for example <code>1990-1994</code>. To match with any port, specify
     *        <code>ANY</code>.
     */

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you can
     * specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @return The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     *         can specify a port range, for example <code>1990-1994</code>. To match with any port, specify
     *         <code>ANY</code>.
     */

    public String getSourcePort() {
        return this.sourcePort;
    }

    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you can
     * specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param sourcePort
     *        The source port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     *        can specify a port range, for example <code>1990-1994</code>. To match with any port, specify
     *        <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Header withSourcePort(String sourcePort) {
        setSourcePort(sourcePort);
        return this;
    }

    /**
     * <p>
     * The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     * traffic, both from the source to the destination and from the destination to the source. If set to
     * <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * </p>
     * 
     * @param direction
     *        The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     *        traffic, both from the source to the destination and from the destination to the source. If set to
     *        <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * @see StatefulRuleDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     * traffic, both from the source to the destination and from the destination to the source. If set to
     * <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * </p>
     * 
     * @return The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches
     *         bidirectional traffic, both from the source to the destination and from the destination to the source. If
     *         set to <code>FORWARD</code>, the inspection only matches traffic going from the source to the
     *         destination.
     * @see StatefulRuleDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     * traffic, both from the source to the destination and from the destination to the source. If set to
     * <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * </p>
     * 
     * @param direction
     *        The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     *        traffic, both from the source to the destination and from the destination to the source. If set to
     *        <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatefulRuleDirection
     */

    public Header withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     * traffic, both from the source to the destination and from the destination to the source. If set to
     * <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * </p>
     * 
     * @param direction
     *        The direction of traffic flow to inspect. If set to <code>ANY</code>, the inspection matches bidirectional
     *        traffic, both from the source to the destination and from the destination to the source. If set to
     *        <code>FORWARD</code>, the inspection only matches traffic going from the source to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatefulRuleDirection
     */

    public Header withDirection(StatefulRuleDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param destination
     *        The destination IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>. </p>
     *        <p>
     *        Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *        Network Firewall supports all address ranges for IPv4.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @return The destination IP address or address range to inspect for, in CIDR notation. To match with any address,
     *         specify <code>ANY</code>. </p>
     *         <p>
     *         Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *         Network Firewall supports all address ranges for IPv4.
     *         </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     *         <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *         <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * <p>
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network
     * Firewall supports all address ranges for IPv4.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * 
     * @param destination
     *        The destination IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>. </p>
     *        <p>
     *        Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     *        Network Firewall supports all address ranges for IPv4.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify
     *        <code>192.0.2.0/24</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry <a
     *        href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Header withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     * can specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param destinationPort
     *        The destination port to inspect for. You can specify an individual port, for example <code>1994</code> and
     *        you can specify a port range, for example <code>1990-1994</code>. To match with any port, specify
     *        <code>ANY</code>.
     */

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     * can specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @return The destination port to inspect for. You can specify an individual port, for example <code>1994</code>
     *         and you can specify a port range, for example <code>1990-1994</code>. To match with any port, specify
     *         <code>ANY</code>.
     */

    public String getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, for example <code>1994</code> and you
     * can specify a port range, for example <code>1990-1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param destinationPort
     *        The destination port to inspect for. You can specify an individual port, for example <code>1994</code> and
     *        you can specify a port range, for example <code>1990-1994</code>. To match with any port, specify
     *        <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Header withDestinationPort(String destinationPort) {
        setDestinationPort(destinationPort);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSourcePort() != null)
            sb.append("SourcePort: ").append(getSourcePort()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Header == false)
            return false;
        Header other = (Header) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourcePort() == null ^ this.getSourcePort() == null)
            return false;
        if (other.getSourcePort() != null && other.getSourcePort().equals(this.getSourcePort()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourcePort() == null) ? 0 : getSourcePort().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        return hashCode;
    }

    @Override
    public Header clone() {
        try {
            return (Header) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.HeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
