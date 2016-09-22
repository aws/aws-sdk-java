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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an entry in a network ACL.
 * </p>
 */
public class NetworkAclEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number.
     * </p>
     */
    private Integer ruleNumber;
    /**
     * <p>
     * The protocol. A value of <code>-1</code> means all protocols.
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
     * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     * </p>
     */
    private Boolean egress;
    /**
     * <p>
     * The network range to allow or deny, in CIDR notation.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     */
    private IcmpTypeCode icmpTypeCode;
    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     */
    private PortRange portRange;

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number for the entry. ACL entries are processed in ascending order by rule number.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number.
     * </p>
     * 
     * @return The rule number for the entry. ACL entries are processed in ascending order by rule number.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending order by rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number for the entry. ACL entries are processed in ascending order by rule number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * <p>
     * The protocol. A value of <code>-1</code> means all protocols.
     * </p>
     * 
     * @param protocol
     *        The protocol. A value of <code>-1</code> means all protocols.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol. A value of <code>-1</code> means all protocols.
     * </p>
     * 
     * @return The protocol. A value of <code>-1</code> means all protocols.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol. A value of <code>-1</code> means all protocols.
     * </p>
     * 
     * @param protocol
     *        The protocol. A value of <code>-1</code> means all protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withProtocol(String protocol) {
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
     * @see RuleAction
     */

    public void setRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
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

    public NetworkAclEntry withRuleAction(RuleAction ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     */

    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     * </p>
     * 
     * @return Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     */

    public Boolean getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withEgress(Boolean egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     * </p>
     * 
     * @return Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
     */

    public Boolean isEgress() {
        return this.egress;
    }

    /**
     * <p>
     * The network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @param cidrBlock
     *        The network range to allow or deny, in CIDR notation.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @return The network range to allow or deny, in CIDR notation.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The network range to allow or deny, in CIDR notation.
     * </p>
     * 
     * @param cidrBlock
     *        The network range to allow or deny, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclEntry withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     * 
     * @param icmpTypeCode
     *        ICMP protocol: The ICMP type and code.
     */

    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     * 
     * @return ICMP protocol: The ICMP type and code.
     */

    public IcmpTypeCode getIcmpTypeCode() {
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

    public NetworkAclEntry withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        setIcmpTypeCode(icmpTypeCode);
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

    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     * 
     * @return TCP or UDP protocols: The range of ports the rule applies to.
     */

    public PortRange getPortRange() {
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

    public NetworkAclEntry withPortRange(PortRange portRange) {
        setPortRange(portRange);
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
        if (getRuleNumber() != null)
            sb.append("RuleNumber: " + getRuleNumber() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getRuleAction() != null)
            sb.append("RuleAction: " + getRuleAction() + ",");
        if (getEgress() != null)
            sb.append("Egress: " + getEgress() + ",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: " + getIcmpTypeCode() + ",");
        if (getPortRange() != null)
            sb.append("PortRange: " + getPortRange());
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
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null)
            return false;
        if (other.getIcmpTypeCode() != null && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
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
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
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
}
