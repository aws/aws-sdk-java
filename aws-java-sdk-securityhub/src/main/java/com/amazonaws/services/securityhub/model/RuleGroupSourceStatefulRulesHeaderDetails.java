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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The inspection criteria for a stateful rule.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatefulRulesHeaderDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatefulRulesHeaderDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     */
    private String destinationPort;
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
     * The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     */
    private String sourcePort;

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * 
     * @param destination
     *        The destination IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * 
     * @return The destination IP address or address range to inspect for, in CIDR notation. To match with any address,
     *         specify <code>ANY</code>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * 
     * @param destination
     *        The destination IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesHeaderDetails withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param destinationPort
     *        The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You
     *        also can specify a port range, such as <code>1990:1994</code>. To match with any port, specify
     *        <code>ANY</code>.
     */

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @return The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You
     *         also can specify a port range, such as <code>1990:1994</code>. To match with any port, specify
     *         <code>ANY</code>.
     */

    public String getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param destinationPort
     *        The destination port to inspect for. You can specify an individual port, such as <code>1994</code>. You
     *        also can specify a port range, such as <code>1990:1994</code>. To match with any port, specify
     *        <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesHeaderDetails withDestinationPort(String destinationPort) {
        setDestinationPort(destinationPort);
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
     */

    public RuleGroupSourceStatefulRulesHeaderDetails withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     * </p>
     * 
     * @return The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to inspect for. To inspector for all protocols, use <code>IP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesHeaderDetails withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * 
     * @param source
     *        The source IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * 
     * @return The source IP address or address range to inspect for, in CIDR notation. To match with any address,
     *         specify <code>ANY</code>.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify
     * <code>ANY</code>.
     * </p>
     * 
     * @param source
     *        The source IP address or address range to inspect for, in CIDR notation. To match with any address,
     *        specify <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesHeaderDetails withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param sourcePort
     *        The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also
     *        can specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>
     *        .
     */

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @return The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also
     *         can specify a port range, such as <code>1990:1994</code>. To match with any port, specify
     *         <code>ANY</code>.
     */

    public String getSourcePort() {
        return this.sourcePort;
    }

    /**
     * <p>
     * The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also can
     * specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>.
     * </p>
     * 
     * @param sourcePort
     *        The source port to inspect for. You can specify an individual port, such as <code>1994</code>. You also
     *        can specify a port range, such as <code>1990:1994</code>. To match with any port, specify <code>ANY</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesHeaderDetails withSourcePort(String sourcePort) {
        setSourcePort(sourcePort);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSourcePort() != null)
            sb.append("SourcePort: ").append(getSourcePort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatefulRulesHeaderDetails == false)
            return false;
        RuleGroupSourceStatefulRulesHeaderDetails other = (RuleGroupSourceStatefulRulesHeaderDetails) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourcePort() == null) ? 0 : getSourcePort().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatefulRulesHeaderDetails clone() {
        try {
            return (RuleGroupSourceStatefulRulesHeaderDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatefulRulesHeaderDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
