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
 * Describes a network access control (ACL) rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AnalysisAclRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisAclRule implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * Indicates whether the rule is an outbound rule.
     * </p>
     */
    private Boolean egress;
    /**
     * <p>
     * The range of ports.
     * </p>
     */
    private PortRange portRange;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Indicates whether to allow or deny traffic that matches the rule.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The rule number.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The IPv4 address range, in CIDR notation.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The IPv4 address range, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisAclRule withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an outbound rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an outbound rule.
     */

    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an outbound rule.
     * </p>
     * 
     * @return Indicates whether the rule is an outbound rule.
     */

    public Boolean getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an outbound rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether the rule is an outbound rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisAclRule withEgress(Boolean egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an outbound rule.
     * </p>
     * 
     * @return Indicates whether the rule is an outbound rule.
     */

    public Boolean isEgress() {
        return this.egress;
    }

    /**
     * <p>
     * The range of ports.
     * </p>
     * 
     * @param portRange
     *        The range of ports.
     */

    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * The range of ports.
     * </p>
     * 
     * @return The range of ports.
     */

    public PortRange getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * The range of ports.
     * </p>
     * 
     * @param portRange
     *        The range of ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisAclRule withPortRange(PortRange portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisAclRule withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny traffic that matches the rule.
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny traffic that matches the rule.
     * </p>
     * 
     * @return Indicates whether to allow or deny traffic that matches the rule.
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny traffic that matches the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisAclRule withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number.
     * </p>
     * 
     * @return The rule number.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisAclRule withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getEgress() != null)
            sb.append("Egress: ").append(getEgress()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: ").append(getRuleNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisAclRule == false)
            return false;
        AnalysisAclRule other = (AnalysisAclRule) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisAclRule clone() {
        try {
            return (AnalysisAclRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
