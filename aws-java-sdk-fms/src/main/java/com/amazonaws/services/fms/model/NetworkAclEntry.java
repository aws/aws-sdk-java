/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a rule in a network ACL.
 * </p>
 * <p>
 * Each network ACL has a set of numbered ingress rules and a separate set of numbered egress rules. When determining
 * whether a packet should be allowed in or out of a subnet associated with the network ACL, Amazon Web Services
 * processes the entries in the network ACL according to the rule numbers, in ascending order.
 * </p>
 * <p>
 * When you manage an individual network ACL, you explicitly specify the rule numbers. When you specify the network ACL
 * rules in a Firewall Manager policy, you provide the rules to run first, in the order that you want them to run, and
 * the rules to run last, in the order that you want them to run. Firewall Manager assigns the rule numbers for you when
 * you save the network ACL policy specification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkAclEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     */
    private NetworkAclIcmpTypeCode icmpTypeCode;
    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     */
    private NetworkAclPortRange portRange;
    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If it's not
     * an egress rule, then it's an ingress, or inbound, rule.
     * </p>
     */
    private Boolean egress;

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     * 
     * @param icmpTypeCode
     *        ICMP protocol: The ICMP type and code.
     */

    public void setIcmpTypeCode(NetworkAclIcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     * 
     * @return ICMP protocol: The ICMP type and code.
     */

    public NetworkAclIcmpTypeCode getIcmpTypeCode() {
        return this.icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     * 
     * @param icmpTypeCode
     *        ICMP protocol: The ICMP type and code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withIcmpTypeCode(NetworkAclIcmpTypeCode icmpTypeCode) {
        setIcmpTypeCode(icmpTypeCode);
        return this;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     * 
     * @param protocol
     *        The protocol number. A value of "-1" means all protocols.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     * 
     * @return The protocol number. A value of "-1" means all protocols.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     * 
     * @param protocol
     *        The protocol number. A value of "-1" means all protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     * 
     * @param portRange
     *        TCP or UDP protocols: The range of ports the rule applies to.
     */

    public void setPortRange(NetworkAclPortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     * 
     * @return TCP or UDP protocols: The range of ports the rule applies to.
     */

    public NetworkAclPortRange getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     * 
     * @param portRange
     *        TCP or UDP protocols: The range of ports the rule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withPortRange(NetworkAclPortRange portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range to allow or deny, in CIDR notation.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @return The IPv4 network range to allow or deny, in CIDR notation.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range to allow or deny, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 network range to allow or deny, in CIDR notation.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @return The IPv6 network range to allow or deny, in CIDR notation.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 network range to allow or deny, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @see NetworkAclRuleAction
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @return Indicates whether to allow or deny the traffic that matches the rule.
     * @see NetworkAclRuleAction
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkAclRuleAction
     */

    public NetworkAclEntry withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkAclRuleAction
     */

    public NetworkAclEntry withRuleAction(NetworkAclRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If it's not
     * an egress rule, then it's an ingress, or inbound, rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If
     *        it's not an egress rule, then it's an ingress, or inbound, rule.
     */

    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If it's not
     * an egress rule, then it's an ingress, or inbound, rule.
     * </p>
     * 
     * @return Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If
     *         it's not an egress rule, then it's an ingress, or inbound, rule.
     */

    public Boolean getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If it's not
     * an egress rule, then it's an ingress, or inbound, rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If
     *        it's not an egress rule, then it's an ingress, or inbound, rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withEgress(Boolean egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If it's not
     * an egress rule, then it's an ingress, or inbound, rule.
     * </p>
     * 
     * @return Indicates whether the rule is an egress, or outbound, rule (applied to traffic leaving the subnet). If
     *         it's not an egress rule, then it's an ingress, or inbound, rule.
     */

    public Boolean isEgress() {
        return this.egress;
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
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: ").append(getIcmpTypeCode()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getEgress() != null)
            sb.append("Egress: ").append(getEgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclEntry == false)
            return false;
        NetworkAclEntry other = (NetworkAclEntry) obj;
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null)
            return false;
        if (other.getIcmpTypeCode() != null && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAclEntry clone() {
        try {
            return (NetworkAclEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkAclEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
