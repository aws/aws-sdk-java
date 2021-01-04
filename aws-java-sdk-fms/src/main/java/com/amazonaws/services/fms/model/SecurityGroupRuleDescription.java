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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a set of permissions for a security group rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/SecurityGroupRuleDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupRuleDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IPv4 ranges for the security group rule.
     * </p>
     */
    private String iPV4Range;
    /**
     * <p>
     * The IPv6 ranges for the security group rule.
     * </p>
     */
    private String iPV6Range;
    /**
     * <p>
     * The ID of the prefix list for the security group rule.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     * <code>-1</code> indicates all ICMP/ICMPv6 types.
     * </p>
     */
    private Long fromPort;
    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 codes.
     * </p>
     */
    private Long toPort;

    /**
     * <p>
     * The IPv4 ranges for the security group rule.
     * </p>
     * 
     * @param iPV4Range
     *        The IPv4 ranges for the security group rule.
     */

    public void setIPV4Range(String iPV4Range) {
        this.iPV4Range = iPV4Range;
    }

    /**
     * <p>
     * The IPv4 ranges for the security group rule.
     * </p>
     * 
     * @return The IPv4 ranges for the security group rule.
     */

    public String getIPV4Range() {
        return this.iPV4Range;
    }

    /**
     * <p>
     * The IPv4 ranges for the security group rule.
     * </p>
     * 
     * @param iPV4Range
     *        The IPv4 ranges for the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withIPV4Range(String iPV4Range) {
        setIPV4Range(iPV4Range);
        return this;
    }

    /**
     * <p>
     * The IPv6 ranges for the security group rule.
     * </p>
     * 
     * @param iPV6Range
     *        The IPv6 ranges for the security group rule.
     */

    public void setIPV6Range(String iPV6Range) {
        this.iPV6Range = iPV6Range;
    }

    /**
     * <p>
     * The IPv6 ranges for the security group rule.
     * </p>
     * 
     * @return The IPv6 ranges for the security group rule.
     */

    public String getIPV6Range() {
        return this.iPV6Range;
    }

    /**
     * <p>
     * The IPv6 ranges for the security group rule.
     * </p>
     * 
     * @param iPV6Range
     *        The IPv6 ranges for the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withIPV6Range(String iPV6Range) {
        setIPV6Range(iPV6Range);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list for the security group rule.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list for the security group rule.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list for the security group rule.
     * </p>
     * 
     * @return The ID of the prefix list for the security group rule.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list for the security group rule.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list for the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * 
     * @param protocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *         number.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * 
     * @param protocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     * <code>-1</code> indicates all ICMP/ICMPv6 types.
     * </p>
     * 
     * @param fromPort
     *        The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     *        <code>-1</code> indicates all ICMP/ICMPv6 types.
     */

    public void setFromPort(Long fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     * <code>-1</code> indicates all ICMP/ICMPv6 types.
     * </p>
     * 
     * @return The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     *         <code>-1</code> indicates all ICMP/ICMPv6 types.
     */

    public Long getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     * <code>-1</code> indicates all ICMP/ICMPv6 types.
     * </p>
     * 
     * @param fromPort
     *        The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     *        <code>-1</code> indicates all ICMP/ICMPv6 types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withFromPort(Long fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 codes.
     * </p>
     * 
     * @param toPort
     *        The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of
     *        <code>-1</code> indicates all ICMP/ICMPv6 codes.
     */

    public void setToPort(Long toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 codes.
     * </p>
     * 
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of
     *         <code>-1</code> indicates all ICMP/ICMPv6 codes.
     */

    public Long getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 codes.
     * </p>
     * 
     * @param toPort
     *        The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of
     *        <code>-1</code> indicates all ICMP/ICMPv6 codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleDescription withToPort(Long toPort) {
        setToPort(toPort);
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
        if (getIPV4Range() != null)
            sb.append("IPV4Range: ").append(getIPV4Range()).append(",");
        if (getIPV6Range() != null)
            sb.append("IPV6Range: ").append(getIPV6Range()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupRuleDescription == false)
            return false;
        SecurityGroupRuleDescription other = (SecurityGroupRuleDescription) obj;
        if (other.getIPV4Range() == null ^ this.getIPV4Range() == null)
            return false;
        if (other.getIPV4Range() != null && other.getIPV4Range().equals(this.getIPV4Range()) == false)
            return false;
        if (other.getIPV6Range() == null ^ this.getIPV6Range() == null)
            return false;
        if (other.getIPV6Range() != null && other.getIPV6Range().equals(this.getIPV6Range()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPV4Range() == null) ? 0 : getIPV4Range().hashCode());
        hashCode = prime * hashCode + ((getIPV6Range() == null) ? 0 : getIPV6Range().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupRuleDescription clone() {
        try {
            return (SecurityGroupRuleDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.SecurityGroupRuleDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
