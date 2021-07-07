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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a security group rule.
 * </p>
 * <p>
 * You must specify exactly one of the following parameters, based on the rule type:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CidrIpv4
 * </p>
 * </li>
 * <li>
 * <p>
 * CidrIpv6
 * </p>
 * </li>
 * <li>
 * <p>
 * PrefixListId
 * </p>
 * </li>
 * <li>
 * <p>
 * ReferencedGroupId
 * </p>
 * </li>
 * </ul>
 * <p>
 * When you modify a rule, you cannot change the rule type. For example, if the rule uses an IPv4 address range, you
 * must use <code>CidrIpv4</code> to specify a new IPv4 address range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroupRuleRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupRuleRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     * </p>
     */
    private String cidrIpv4;
    /**
     * <p>
     * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     * </p>
     */
    private String cidrIpv6;
    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The ID of the security group that is referenced in the security group rule.
     * </p>
     */
    private String referencedGroupId;
    /**
     * <p>
     * The description of the security group rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *        Numbers</a>). </p>
     *        <p>
     *        Use <code>-1</code> to specify all protocols.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *         number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). </p>
     *         <p>
     *         Use <code>-1</code> to specify all protocols.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *        Numbers</a>). </p>
     *        <p>
     *        Use <code>-1</code> to specify all protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     *        ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates
     *         all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     *        ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *        indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *         indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *        indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @param cidrIpv4
     *        The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     */

    public void setCidrIpv4(String cidrIpv4) {
        this.cidrIpv4 = cidrIpv4;
    }

    /**
     * <p>
     * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @return The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     */

    public String getCidrIpv4() {
        return this.cidrIpv4;
    }

    /**
     * <p>
     * The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     * </p>
     * 
     * @param cidrIpv4
     *        The IPv4 CIDR range. To specify a single IPv4 address, use the /32 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withCidrIpv4(String cidrIpv4) {
        setCidrIpv4(cidrIpv4);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     */

    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @return The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     */

    public String getCidrIpv6() {
        return this.cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range. To specify a single IPv6 address, use the /128 prefix length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withCidrIpv6(String cidrIpv6) {
        setCidrIpv6(cidrIpv6);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of the security group that is referenced in the security group rule.
     * </p>
     * 
     * @param referencedGroupId
     *        The ID of the security group that is referenced in the security group rule.
     */

    public void setReferencedGroupId(String referencedGroupId) {
        this.referencedGroupId = referencedGroupId;
    }

    /**
     * <p>
     * The ID of the security group that is referenced in the security group rule.
     * </p>
     * 
     * @return The ID of the security group that is referenced in the security group rule.
     */

    public String getReferencedGroupId() {
        return this.referencedGroupId;
    }

    /**
     * <p>
     * The ID of the security group that is referenced in the security group rule.
     * </p>
     * 
     * @param referencedGroupId
     *        The ID of the security group that is referenced in the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withReferencedGroupId(String referencedGroupId) {
        setReferencedGroupId(referencedGroupId);
        return this;
    }

    /**
     * <p>
     * The description of the security group rule.
     * </p>
     * 
     * @param description
     *        The description of the security group rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security group rule.
     * </p>
     * 
     * @return The description of the security group rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security group rule.
     * </p>
     * 
     * @param description
     *        The description of the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRuleRequest withDescription(String description) {
        setDescription(description);
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
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getCidrIpv4() != null)
            sb.append("CidrIpv4: ").append(getCidrIpv4()).append(",");
        if (getCidrIpv6() != null)
            sb.append("CidrIpv6: ").append(getCidrIpv6()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getReferencedGroupId() != null)
            sb.append("ReferencedGroupId: ").append(getReferencedGroupId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupRuleRequest == false)
            return false;
        SecurityGroupRuleRequest other = (SecurityGroupRuleRequest) obj;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getCidrIpv4() == null ^ this.getCidrIpv4() == null)
            return false;
        if (other.getCidrIpv4() != null && other.getCidrIpv4().equals(this.getCidrIpv4()) == false)
            return false;
        if (other.getCidrIpv6() == null ^ this.getCidrIpv6() == null)
            return false;
        if (other.getCidrIpv6() != null && other.getCidrIpv6().equals(this.getCidrIpv6()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getReferencedGroupId() == null ^ this.getReferencedGroupId() == null)
            return false;
        if (other.getReferencedGroupId() != null && other.getReferencedGroupId().equals(this.getReferencedGroupId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getCidrIpv4() == null) ? 0 : getCidrIpv4().hashCode());
        hashCode = prime * hashCode + ((getCidrIpv6() == null) ? 0 : getCidrIpv6().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getReferencedGroupId() == null) ? 0 : getReferencedGroupId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupRuleRequest clone() {
        try {
            return (SecurityGroupRuleRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
