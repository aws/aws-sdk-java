/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Network Acl Entry
 */
public class NetworkAclEntry {

    private Integer ruleNumber;

    private String protocol;

    private String ruleAction;

    private Boolean egress;

    private String cidrBlock;

    /**
     * 
     */
    private IcmpTypeCode icmpTypeCode;

    /**
     * 
     */
    private PortRange portRange;

    /**
     * Returns the value of the RuleNumber property for this object.
     *
     * @return The value of the RuleNumber property for this object.
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }
    
    /**
     * Sets the value of the RuleNumber property for this object.
     *
     * @param ruleNumber The new value for the RuleNumber property for this object.
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    
    /**
     * Sets the value of the RuleNumber property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNumber The new value for the RuleNumber property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NetworkAclEntry withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }
    
    
    /**
     * Returns the value of the Protocol property for this object.
     *
     * @return The value of the Protocol property for this object.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * Sets the value of the Protocol property for this object.
     *
     * @param protocol The new value for the Protocol property for this object.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * Sets the value of the Protocol property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol The new value for the Protocol property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NetworkAclEntry withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    
    /**
     * Returns the value of the RuleAction property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @return The value of the RuleAction property for this object.
     *
     * @see RuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }
    
    /**
     * Sets the value of the RuleAction property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction The new value for the RuleAction property for this object.
     *
     * @see RuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }
    
    /**
     * Sets the value of the RuleAction property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction The new value for the RuleAction property for this object.
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
     * Returns the value of the Egress property for this object.
     *
     * @return The value of the Egress property for this object.
     */
    public Boolean isEgress() {
        return egress;
    }
    
    /**
     * Sets the value of the Egress property for this object.
     *
     * @param egress The new value for the Egress property for this object.
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }
    
    /**
     * Sets the value of the Egress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egress The new value for the Egress property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NetworkAclEntry withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }
    
    
    /**
     * Returns the value of the Egress property for this object.
     *
     * @return The value of the Egress property for this object.
     */
    public Boolean getEgress() {
        return egress;
    }
    
    /**
     * Returns the value of the CidrBlock property for this object.
     *
     * @return The value of the CidrBlock property for this object.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * Sets the value of the CidrBlock property for this object.
     *
     * @param cidrBlock The new value for the CidrBlock property for this object.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * Sets the value of the CidrBlock property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The new value for the CidrBlock property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NetworkAclEntry withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public IcmpTypeCode getIcmpTypeCode() {
        return icmpTypeCode;
    }
    
    /**
     * 
     *
     * @param icmpTypeCode 
     */
    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param icmpTypeCode 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NetworkAclEntry withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public PortRange getPortRange() {
        return portRange;
    }
    
    /**
     * 
     *
     * @param portRange 
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portRange 
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
        sb.append("RuleNumber: " + ruleNumber + ", ");
        sb.append("Protocol: " + protocol + ", ");
        sb.append("RuleAction: " + ruleAction + ", ");
        sb.append("Egress: " + egress + ", ");
        sb.append("CidrBlock: " + cidrBlock + ", ");
        sb.append("IcmpTypeCode: " + icmpTypeCode + ", ");
        sb.append("PortRange: " + portRange + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    