/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateNetworkAclEntryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createNetworkAclEntry(CreateNetworkAclEntryRequest) CreateNetworkAclEntry operation}.
 * <p>
 * Creates an entry (i.e., rule) in a network ACL with a rule number you specify. Each network ACL has a set of numbered ingress rules and a separate
 * set of numbered egress rules. When determining whether a packet should be allowed in or out of a subnet associated with the ACL, Amazon VPC processes
 * the entries in the ACL according to the rule numbers, in ascending order.
 * </p>
 * <p>
 * <b>Important:</b> We recommend that you leave room between the rules (e.g., 100, 110, 120, etc.), and not number them sequentially (101, 102, 103,
 * etc.). This allows you to easily add a new rule between existing ones without having to renumber the rules.
 * </p>
 * <p>
 * After you add an entry, you can't modify it; you must either replace it, or create a new entry and delete the old one.
 * </p>
 * <p>
 * For more information about network ACLs, go to Network ACLs in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createNetworkAclEntry(CreateNetworkAclEntryRequest)
 */
public class CreateNetworkAclEntryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateNetworkAclEntryRequest> {

    /**
     * ID of the ACL where the entry will be created.
     */
    private String networkAclId;

    /**
     * Rule number to assign to the entry (e.g., 100). ACL entries are
     * processed in ascending order by rule number.
     */
    private Integer ruleNumber;

    /**
     * IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code> or an IP protocol number.
     */
    private String protocol;

    /**
     * Whether to allow or deny traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     */
    private String ruleAction;

    /**
     * Whether this rule applies to egress traffic from the subnet
     * (<code>true</code>) or ingress traffic to the subnet
     * (<code>false</code>).
     */
    private Boolean egress;

    /**
     * The CIDR range to allow or deny, in CIDR notation (e.g.,
     * <code>172.16.0.0/24</code>).
     */
    private String cidrBlock;

    /**
     * ICMP values.
     */
    private IcmpTypeCode icmpTypeCode;

    /**
     * Port ranges.
     */
    private PortRange portRange;

    /**
     * ID of the ACL where the entry will be created.
     *
     * @return ID of the ACL where the entry will be created.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * ID of the ACL where the entry will be created.
     *
     * @param networkAclId ID of the ACL where the entry will be created.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * ID of the ACL where the entry will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId ID of the ACL where the entry will be created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * Rule number to assign to the entry (e.g., 100). ACL entries are
     * processed in ascending order by rule number.
     *
     * @return Rule number to assign to the entry (e.g., 100). ACL entries are
     *         processed in ascending order by rule number.
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }
    
    /**
     * Rule number to assign to the entry (e.g., 100). ACL entries are
     * processed in ascending order by rule number.
     *
     * @param ruleNumber Rule number to assign to the entry (e.g., 100). ACL entries are
     *         processed in ascending order by rule number.
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    
    /**
     * Rule number to assign to the entry (e.g., 100). ACL entries are
     * processed in ascending order by rule number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNumber Rule number to assign to the entry (e.g., 100). ACL entries are
     *         processed in ascending order by rule number.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code> or an IP protocol number.
     *
     * @return IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     *         <code>udp</code>, <code>icmp</code> or an IP protocol number.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code> or an IP protocol number.
     *
     * @param protocol IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     *         <code>udp</code>, <code>icmp</code> or an IP protocol number.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code> or an IP protocol number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol IP protocol the rule applies to. Valid Values: <code>tcp</code>,
     *         <code>udp</code>, <code>icmp</code> or an IP protocol number.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Whether to allow or deny traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @return Whether to allow or deny traffic that matches the rule.
     *
     * @see RuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }
    
    /**
     * Whether to allow or deny traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Whether to allow or deny traffic that matches the rule.
     *
     * @see RuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }
    
    /**
     * Whether to allow or deny traffic that matches the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Whether to allow or deny traffic that matches the rule.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RuleAction
     */
    public CreateNetworkAclEntryRequest withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * Whether to allow or deny traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Whether to allow or deny traffic that matches the rule.
     *
     * @see RuleAction
     */
    public void setRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }
    
    /**
     * Whether to allow or deny traffic that matches the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Whether to allow or deny traffic that matches the rule.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RuleAction
     */
    public CreateNetworkAclEntryRequest withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * Whether this rule applies to egress traffic from the subnet
     * (<code>true</code>) or ingress traffic to the subnet
     * (<code>false</code>).
     *
     * @return Whether this rule applies to egress traffic from the subnet
     *         (<code>true</code>) or ingress traffic to the subnet
     *         (<code>false</code>).
     */
    public Boolean isEgress() {
        return egress;
    }
    
    /**
     * Whether this rule applies to egress traffic from the subnet
     * (<code>true</code>) or ingress traffic to the subnet
     * (<code>false</code>).
     *
     * @param egress Whether this rule applies to egress traffic from the subnet
     *         (<code>true</code>) or ingress traffic to the subnet
     *         (<code>false</code>).
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }
    
    /**
     * Whether this rule applies to egress traffic from the subnet
     * (<code>true</code>) or ingress traffic to the subnet
     * (<code>false</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egress Whether this rule applies to egress traffic from the subnet
     *         (<code>true</code>) or ingress traffic to the subnet
     *         (<code>false</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * Whether this rule applies to egress traffic from the subnet
     * (<code>true</code>) or ingress traffic to the subnet
     * (<code>false</code>).
     *
     * @return Whether this rule applies to egress traffic from the subnet
     *         (<code>true</code>) or ingress traffic to the subnet
     *         (<code>false</code>).
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * The CIDR range to allow or deny, in CIDR notation (e.g.,
     * <code>172.16.0.0/24</code>).
     *
     * @return The CIDR range to allow or deny, in CIDR notation (e.g.,
     *         <code>172.16.0.0/24</code>).
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * The CIDR range to allow or deny, in CIDR notation (e.g.,
     * <code>172.16.0.0/24</code>).
     *
     * @param cidrBlock The CIDR range to allow or deny, in CIDR notation (e.g.,
     *         <code>172.16.0.0/24</code>).
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * The CIDR range to allow or deny, in CIDR notation (e.g.,
     * <code>172.16.0.0/24</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The CIDR range to allow or deny, in CIDR notation (e.g.,
     *         <code>172.16.0.0/24</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * ICMP values.
     *
     * @return ICMP values.
     */
    public IcmpTypeCode getIcmpTypeCode() {
        return icmpTypeCode;
    }
    
    /**
     * ICMP values.
     *
     * @param icmpTypeCode ICMP values.
     */
    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }
    
    /**
     * ICMP values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param icmpTypeCode ICMP values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
        return this;
    }

    /**
     * Port ranges.
     *
     * @return Port ranges.
     */
    public PortRange getPortRange() {
        return portRange;
    }
    
    /**
     * Port ranges.
     *
     * @param portRange Port ranges.
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }
    
    /**
     * Port ranges.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portRange Port ranges.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateNetworkAclEntryRequest withPortRange(PortRange portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkAclEntryRequest> getDryRunRequest() {
        Request<CreateNetworkAclEntryRequest> request = new CreateNetworkAclEntryRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkAclId() != null) sb.append("NetworkAclId: " + getNetworkAclId() + ",");
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
        
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode()); 
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

        if (obj instanceof CreateNetworkAclEntryRequest == false) return false;
        CreateNetworkAclEntryRequest other = (CreateNetworkAclEntryRequest)obj;
        
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null) return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false) return false; 
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
    