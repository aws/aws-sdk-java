/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an entry in a network ACL.
 * </p>
 */
public class NetworkAclEntry implements Serializable {

    /**
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     */
    private Integer ruleNumber;

    /**
     * The protocol. A value of <code>-1</code> means all protocols.
     */
    private String protocol;

    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     */
    private String ruleAction;

    /**
     * Indicates whether the rule is an egress rule (applied to traffic
     * leaving the subnet).
     */
    private Boolean egress;

    /**
     * The network range to allow or deny, in CIDR notation.
     */
    private String cidrBlock;

    /**
     * ICMP protocol: The ICMP type and code.
     */
    private IcmpTypeCode icmpTypeCode;

    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     */
    private PortRange portRange;

    /**
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     *
     * @return The rule number for the entry. ACL entries are processed in ascending
     *         order by rule number.
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }
    
    /**
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     *
     * @param ruleNumber The rule number for the entry. ACL entries are processed in ascending
     *         order by rule number.
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    
    /**
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNumber The rule number for the entry. ACL entries are processed in ascending
     *         order by rule number.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkAclEntry withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * The protocol. A value of <code>-1</code> means all protocols.
     *
     * @return The protocol. A value of <code>-1</code> means all protocols.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * The protocol. A value of <code>-1</code> means all protocols.
     *
     * @param protocol The protocol. A value of <code>-1</code> means all protocols.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * The protocol. A value of <code>-1</code> means all protocols.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol The protocol. A value of <code>-1</code> means all protocols.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkAclEntry withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @return Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @see RuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }
    
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @see RuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }
    
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RuleAction
     */
    public NetworkAclEntry withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @see RuleAction
     */
    public void setRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }
    
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RuleAction
     */
    public NetworkAclEntry withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * Indicates whether the rule is an egress rule (applied to traffic
     * leaving the subnet).
     *
     * @return Indicates whether the rule is an egress rule (applied to traffic
     *         leaving the subnet).
     */
    public Boolean isEgress() {
        return egress;
    }
    
    /**
     * Indicates whether the rule is an egress rule (applied to traffic
     * leaving the subnet).
     *
     * @param egress Indicates whether the rule is an egress rule (applied to traffic
     *         leaving the subnet).
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }
    
    /**
     * Indicates whether the rule is an egress rule (applied to traffic
     * leaving the subnet).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egress Indicates whether the rule is an egress rule (applied to traffic
     *         leaving the subnet).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkAclEntry withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * Indicates whether the rule is an egress rule (applied to traffic
     * leaving the subnet).
     *
     * @return Indicates whether the rule is an egress rule (applied to traffic
     *         leaving the subnet).
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * The network range to allow or deny, in CIDR notation.
     *
     * @return The network range to allow or deny, in CIDR notation.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * The network range to allow or deny, in CIDR notation.
     *
     * @param cidrBlock The network range to allow or deny, in CIDR notation.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * The network range to allow or deny, in CIDR notation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The network range to allow or deny, in CIDR notation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkAclEntry withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * ICMP protocol: The ICMP type and code.
     *
     * @return ICMP protocol: The ICMP type and code.
     */
    public IcmpTypeCode getIcmpTypeCode() {
        return icmpTypeCode;
    }
    
    /**
     * ICMP protocol: The ICMP type and code.
     *
     * @param icmpTypeCode ICMP protocol: The ICMP type and code.
     */
    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }
    
    /**
     * ICMP protocol: The ICMP type and code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param icmpTypeCode ICMP protocol: The ICMP type and code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkAclEntry withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
        return this;
    }

    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     *
     * @return TCP or UDP protocols: The range of ports the rule applies to.
     */
    public PortRange getPortRange() {
        return portRange;
    }
    
    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     *
     * @param portRange TCP or UDP protocols: The range of ports the rule applies to.
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }
    
    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portRange TCP or UDP protocols: The range of ports the rule applies to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkAclEntry withPortRange(PortRange portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRuleNumber() != null) sb.append("RuleNumber: " + getRuleNumber() + ",");
        if (getProtocol() != null) sb.append("Protocol: " + getProtocol() + ",");
        if (getRuleAction() != null) sb.append("RuleAction: " + getRuleAction() + ",");
        if (isEgress() != null) sb.append("Egress: " + isEgress() + ",");
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getIcmpTypeCode() != null) sb.append("IcmpTypeCode: " + getIcmpTypeCode() + ",");
        if (getPortRange() != null) sb.append("PortRange: " + getPortRange() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode()); 
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode()); 
        hashCode = prime * hashCode + ((isEgress() == null) ? 0 : isEgress().hashCode()); 
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode()); 
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkAclEntry == false) return false;
        NetworkAclEntry other = (NetworkAclEntry)obj;
        
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null) return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false) return false; 
        if (other.getProtocol() == null ^ this.getProtocol() == null) return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false) return false; 
        if (other.getRuleAction() == null ^ this.getRuleAction() == null) return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false) return false; 
        if (other.isEgress() == null ^ this.isEgress() == null) return false;
        if (other.isEgress() != null && other.isEgress().equals(this.isEgress()) == false) return false; 
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null) return false;
        if (other.getIcmpTypeCode() != null && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false) return false; 
        if (other.getPortRange() == null ^ this.getPortRange() == null) return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false) return false; 
        return true;
    }
    
}
    