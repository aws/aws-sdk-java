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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The network access control list (ACL) is an optional layer of security for your VPC that acts as a firewall for
 * controlling traffic in and out of one or more subnets. The entry is a set of numbered ingress and egress rules that
 * determine whether a packet should be allowed in or out of a subnet associated with the ACL. We process the entries in
 * the ACL according to the rule numbers, in ascending order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/NetworkACLEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkACLEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in ascending
     * order by rule number.
     * </p>
     */
    private Integer ruleNumber;
    /**
     * <p>
     * The protocol number. A value of <i>-1</i> means all the protocols.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The range of ports the rule applies to.
     * </p>
     */
    private PortRange portRange;
    /**
     * <p>
     * Defines the ICMP protocol that consists of the ICMP type and code.
     * </p>
     */
    private IcmpTypeCode icmpTypeCode;
    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form. For example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in ascending
     * order by rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in
     *        ascending order by rule number.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in ascending
     * order by rule number.
     * </p>
     * 
     * @return The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in
     *         ascending order by rule number.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in ascending
     * order by rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number for the entry. For example <i>100</i>. All the network ACL entries are processed in
     *        ascending order by rule number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkACLEntry withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * <p>
     * The protocol number. A value of <i>-1</i> means all the protocols.
     * </p>
     * 
     * @param protocol
     *        The protocol number. A value of <i>-1</i> means all the protocols.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol number. A value of <i>-1</i> means all the protocols.
     * </p>
     * 
     * @return The protocol number. A value of <i>-1</i> means all the protocols.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol number. A value of <i>-1</i> means all the protocols.
     * </p>
     * 
     * @param protocol
     *        The protocol number. A value of <i>-1</i> means all the protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkACLEntry withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @see RuleAction
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
     * @see RuleAction
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
     * @see RuleAction
     */

    public NetworkACLEntry withRuleAction(String ruleAction) {
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
     * @see RuleAction
     */

    public NetworkACLEntry withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The range of ports the rule applies to.
     * </p>
     * 
     * @param portRange
     *        The range of ports the rule applies to.
     */

    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * The range of ports the rule applies to.
     * </p>
     * 
     * @return The range of ports the rule applies to.
     */

    public PortRange getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * The range of ports the rule applies to.
     * </p>
     * 
     * @param portRange
     *        The range of ports the rule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkACLEntry withPortRange(PortRange portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * Defines the ICMP protocol that consists of the ICMP type and code.
     * </p>
     * 
     * @param icmpTypeCode
     *        Defines the ICMP protocol that consists of the ICMP type and code.
     */

    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * Defines the ICMP protocol that consists of the ICMP type and code.
     * </p>
     * 
     * @return Defines the ICMP protocol that consists of the ICMP type and code.
     */

    public IcmpTypeCode getIcmpTypeCode() {
        return this.icmpTypeCode;
    }

    /**
     * <p>
     * Defines the ICMP protocol that consists of the ICMP type and code.
     * </p>
     * 
     * @param icmpTypeCode
     *        Defines the ICMP protocol that consists of the ICMP type and code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkACLEntry withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        setIcmpTypeCode(icmpTypeCode);
        return this;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form. For example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We
     *        modify the specified CIDR block to its canonical form. For example, if you specify
     *        <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form. For example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @return The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We
     *         modify the specified CIDR block to its canonical form. For example, if you specify
     *         <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We modify the
     * specified CIDR block to its canonical form. For example, if you specify <code>100.68.0.18/18</code>, we modify it
     * to <code>100.68.0.0/18</code>.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range to allow or deny, in CIDR notation. For example, <code>172.16.0.0/24</code>. We
     *        modify the specified CIDR block to its canonical form. For example, if you specify
     *        <code>100.68.0.18/18</code>, we modify it to <code>100.68.0.0/18</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkACLEntry withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
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
        if (getRuleNumber() != null)
            sb.append("RuleNumber: ").append(getRuleNumber()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange()).append(",");
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: ").append(getIcmpTypeCode()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkACLEntry == false)
            return false;
        NetworkACLEntry other = (NetworkACLEntry) obj;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null)
            return false;
        if (other.getIcmpTypeCode() != null && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public NetworkACLEntry clone() {
        try {
            return (NetworkACLEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.NetworkACLEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
