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
 * Violation detail for the rule violation in a security group when compared to the primary security group of the
 * Firewall Manager policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AwsVPCSecurityGroupViolation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsVPCSecurityGroupViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The security group rule that is being evaluated.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * A description of the security group that violates the policy.
     * </p>
     */
    private String violationTargetDescription;
    /**
     * <p>
     * List of rules specified in the security group of the Firewall Manager policy that partially match the
     * <code>ViolationTarget</code> rule.
     * </p>
     */
    private java.util.List<PartialMatch> partialMatches;
    /**
     * <p>
     * Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * </p>
     */
    private java.util.List<SecurityGroupRemediationAction> possibleSecurityGroupRemediationActions;

    /**
     * <p>
     * The security group rule that is being evaluated.
     * </p>
     * 
     * @param violationTarget
     *        The security group rule that is being evaluated.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * The security group rule that is being evaluated.
     * </p>
     * 
     * @return The security group rule that is being evaluated.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * The security group rule that is being evaluated.
     * </p>
     * 
     * @param violationTarget
     *        The security group rule that is being evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVPCSecurityGroupViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * A description of the security group that violates the policy.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the security group that violates the policy.
     */

    public void setViolationTargetDescription(String violationTargetDescription) {
        this.violationTargetDescription = violationTargetDescription;
    }

    /**
     * <p>
     * A description of the security group that violates the policy.
     * </p>
     * 
     * @return A description of the security group that violates the policy.
     */

    public String getViolationTargetDescription() {
        return this.violationTargetDescription;
    }

    /**
     * <p>
     * A description of the security group that violates the policy.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the security group that violates the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVPCSecurityGroupViolation withViolationTargetDescription(String violationTargetDescription) {
        setViolationTargetDescription(violationTargetDescription);
        return this;
    }

    /**
     * <p>
     * List of rules specified in the security group of the Firewall Manager policy that partially match the
     * <code>ViolationTarget</code> rule.
     * </p>
     * 
     * @return List of rules specified in the security group of the Firewall Manager policy that partially match the
     *         <code>ViolationTarget</code> rule.
     */

    public java.util.List<PartialMatch> getPartialMatches() {
        return partialMatches;
    }

    /**
     * <p>
     * List of rules specified in the security group of the Firewall Manager policy that partially match the
     * <code>ViolationTarget</code> rule.
     * </p>
     * 
     * @param partialMatches
     *        List of rules specified in the security group of the Firewall Manager policy that partially match the
     *        <code>ViolationTarget</code> rule.
     */

    public void setPartialMatches(java.util.Collection<PartialMatch> partialMatches) {
        if (partialMatches == null) {
            this.partialMatches = null;
            return;
        }

        this.partialMatches = new java.util.ArrayList<PartialMatch>(partialMatches);
    }

    /**
     * <p>
     * List of rules specified in the security group of the Firewall Manager policy that partially match the
     * <code>ViolationTarget</code> rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartialMatches(java.util.Collection)} or {@link #withPartialMatches(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partialMatches
     *        List of rules specified in the security group of the Firewall Manager policy that partially match the
     *        <code>ViolationTarget</code> rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVPCSecurityGroupViolation withPartialMatches(PartialMatch... partialMatches) {
        if (this.partialMatches == null) {
            setPartialMatches(new java.util.ArrayList<PartialMatch>(partialMatches.length));
        }
        for (PartialMatch ele : partialMatches) {
            this.partialMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of rules specified in the security group of the Firewall Manager policy that partially match the
     * <code>ViolationTarget</code> rule.
     * </p>
     * 
     * @param partialMatches
     *        List of rules specified in the security group of the Firewall Manager policy that partially match the
     *        <code>ViolationTarget</code> rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVPCSecurityGroupViolation withPartialMatches(java.util.Collection<PartialMatch> partialMatches) {
        setPartialMatches(partialMatches);
        return this;
    }

    /**
     * <p>
     * Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * </p>
     * 
     * @return Remediation options for the rule specified in the <code>ViolationTarget</code>.
     */

    public java.util.List<SecurityGroupRemediationAction> getPossibleSecurityGroupRemediationActions() {
        return possibleSecurityGroupRemediationActions;
    }

    /**
     * <p>
     * Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * </p>
     * 
     * @param possibleSecurityGroupRemediationActions
     *        Remediation options for the rule specified in the <code>ViolationTarget</code>.
     */

    public void setPossibleSecurityGroupRemediationActions(java.util.Collection<SecurityGroupRemediationAction> possibleSecurityGroupRemediationActions) {
        if (possibleSecurityGroupRemediationActions == null) {
            this.possibleSecurityGroupRemediationActions = null;
            return;
        }

        this.possibleSecurityGroupRemediationActions = new java.util.ArrayList<SecurityGroupRemediationAction>(possibleSecurityGroupRemediationActions);
    }

    /**
     * <p>
     * Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPossibleSecurityGroupRemediationActions(java.util.Collection)} or
     * {@link #withPossibleSecurityGroupRemediationActions(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param possibleSecurityGroupRemediationActions
     *        Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVPCSecurityGroupViolation withPossibleSecurityGroupRemediationActions(SecurityGroupRemediationAction... possibleSecurityGroupRemediationActions) {
        if (this.possibleSecurityGroupRemediationActions == null) {
            setPossibleSecurityGroupRemediationActions(new java.util.ArrayList<SecurityGroupRemediationAction>(possibleSecurityGroupRemediationActions.length));
        }
        for (SecurityGroupRemediationAction ele : possibleSecurityGroupRemediationActions) {
            this.possibleSecurityGroupRemediationActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * </p>
     * 
     * @param possibleSecurityGroupRemediationActions
     *        Remediation options for the rule specified in the <code>ViolationTarget</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVPCSecurityGroupViolation withPossibleSecurityGroupRemediationActions(
            java.util.Collection<SecurityGroupRemediationAction> possibleSecurityGroupRemediationActions) {
        setPossibleSecurityGroupRemediationActions(possibleSecurityGroupRemediationActions);
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
        if (getViolationTarget() != null)
            sb.append("ViolationTarget: ").append(getViolationTarget()).append(",");
        if (getViolationTargetDescription() != null)
            sb.append("ViolationTargetDescription: ").append(getViolationTargetDescription()).append(",");
        if (getPartialMatches() != null)
            sb.append("PartialMatches: ").append(getPartialMatches()).append(",");
        if (getPossibleSecurityGroupRemediationActions() != null)
            sb.append("PossibleSecurityGroupRemediationActions: ").append(getPossibleSecurityGroupRemediationActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsVPCSecurityGroupViolation == false)
            return false;
        AwsVPCSecurityGroupViolation other = (AwsVPCSecurityGroupViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getViolationTargetDescription() == null ^ this.getViolationTargetDescription() == null)
            return false;
        if (other.getViolationTargetDescription() != null && other.getViolationTargetDescription().equals(this.getViolationTargetDescription()) == false)
            return false;
        if (other.getPartialMatches() == null ^ this.getPartialMatches() == null)
            return false;
        if (other.getPartialMatches() != null && other.getPartialMatches().equals(this.getPartialMatches()) == false)
            return false;
        if (other.getPossibleSecurityGroupRemediationActions() == null ^ this.getPossibleSecurityGroupRemediationActions() == null)
            return false;
        if (other.getPossibleSecurityGroupRemediationActions() != null
                && other.getPossibleSecurityGroupRemediationActions().equals(this.getPossibleSecurityGroupRemediationActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getViolationTargetDescription() == null) ? 0 : getViolationTargetDescription().hashCode());
        hashCode = prime * hashCode + ((getPartialMatches() == null) ? 0 : getPartialMatches().hashCode());
        hashCode = prime * hashCode + ((getPossibleSecurityGroupRemediationActions() == null) ? 0 : getPossibleSecurityGroupRemediationActions().hashCode());
        return hashCode;
    }

    @Override
    public AwsVPCSecurityGroupViolation clone() {
        try {
            return (AwsVPCSecurityGroupViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AwsVPCSecurityGroupViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
