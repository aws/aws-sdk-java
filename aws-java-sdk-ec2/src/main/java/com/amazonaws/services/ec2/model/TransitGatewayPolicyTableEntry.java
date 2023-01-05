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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a transit gateway policy table entry
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPolicyTableEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyTableEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The rule number for the transit gateway policy table entry.
     * </p>
     */
    private String policyRuleNumber;
    /**
     * <p>
     * The policy rule associated with the transit gateway policy table.
     * </p>
     */
    private TransitGatewayPolicyRule policyRule;
    /**
     * <p>
     * The ID of the target route table.
     * </p>
     */
    private String targetRouteTableId;

    /**
     * <p>
     * The rule number for the transit gateway policy table entry.
     * </p>
     * 
     * @param policyRuleNumber
     *        The rule number for the transit gateway policy table entry.
     */

    public void setPolicyRuleNumber(String policyRuleNumber) {
        this.policyRuleNumber = policyRuleNumber;
    }

    /**
     * <p>
     * The rule number for the transit gateway policy table entry.
     * </p>
     * 
     * @return The rule number for the transit gateway policy table entry.
     */

    public String getPolicyRuleNumber() {
        return this.policyRuleNumber;
    }

    /**
     * <p>
     * The rule number for the transit gateway policy table entry.
     * </p>
     * 
     * @param policyRuleNumber
     *        The rule number for the transit gateway policy table entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTableEntry withPolicyRuleNumber(String policyRuleNumber) {
        setPolicyRuleNumber(policyRuleNumber);
        return this;
    }

    /**
     * <p>
     * The policy rule associated with the transit gateway policy table.
     * </p>
     * 
     * @param policyRule
     *        The policy rule associated with the transit gateway policy table.
     */

    public void setPolicyRule(TransitGatewayPolicyRule policyRule) {
        this.policyRule = policyRule;
    }

    /**
     * <p>
     * The policy rule associated with the transit gateway policy table.
     * </p>
     * 
     * @return The policy rule associated with the transit gateway policy table.
     */

    public TransitGatewayPolicyRule getPolicyRule() {
        return this.policyRule;
    }

    /**
     * <p>
     * The policy rule associated with the transit gateway policy table.
     * </p>
     * 
     * @param policyRule
     *        The policy rule associated with the transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTableEntry withPolicyRule(TransitGatewayPolicyRule policyRule) {
        setPolicyRule(policyRule);
        return this;
    }

    /**
     * <p>
     * The ID of the target route table.
     * </p>
     * 
     * @param targetRouteTableId
     *        The ID of the target route table.
     */

    public void setTargetRouteTableId(String targetRouteTableId) {
        this.targetRouteTableId = targetRouteTableId;
    }

    /**
     * <p>
     * The ID of the target route table.
     * </p>
     * 
     * @return The ID of the target route table.
     */

    public String getTargetRouteTableId() {
        return this.targetRouteTableId;
    }

    /**
     * <p>
     * The ID of the target route table.
     * </p>
     * 
     * @param targetRouteTableId
     *        The ID of the target route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyTableEntry withTargetRouteTableId(String targetRouteTableId) {
        setTargetRouteTableId(targetRouteTableId);
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
        if (getPolicyRuleNumber() != null)
            sb.append("PolicyRuleNumber: ").append(getPolicyRuleNumber()).append(",");
        if (getPolicyRule() != null)
            sb.append("PolicyRule: ").append(getPolicyRule()).append(",");
        if (getTargetRouteTableId() != null)
            sb.append("TargetRouteTableId: ").append(getTargetRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPolicyTableEntry == false)
            return false;
        TransitGatewayPolicyTableEntry other = (TransitGatewayPolicyTableEntry) obj;
        if (other.getPolicyRuleNumber() == null ^ this.getPolicyRuleNumber() == null)
            return false;
        if (other.getPolicyRuleNumber() != null && other.getPolicyRuleNumber().equals(this.getPolicyRuleNumber()) == false)
            return false;
        if (other.getPolicyRule() == null ^ this.getPolicyRule() == null)
            return false;
        if (other.getPolicyRule() != null && other.getPolicyRule().equals(this.getPolicyRule()) == false)
            return false;
        if (other.getTargetRouteTableId() == null ^ this.getTargetRouteTableId() == null)
            return false;
        if (other.getTargetRouteTableId() != null && other.getTargetRouteTableId().equals(this.getTargetRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyRuleNumber() == null) ? 0 : getPolicyRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getPolicyRule() == null) ? 0 : getPolicyRule().hashCode());
        hashCode = prime * hashCode + ((getTargetRouteTableId() == null) ? 0 : getTargetRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPolicyTableEntry clone() {
        try {
            return (TransitGatewayPolicyTableEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
