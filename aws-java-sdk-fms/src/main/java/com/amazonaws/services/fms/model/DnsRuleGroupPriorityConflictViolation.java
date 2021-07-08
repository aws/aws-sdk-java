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
 * A rule group that Firewall Manager tried to associate with a VPC has the same priority as a rule group that's already
 * associated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DnsRuleGroupPriorityConflictViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRuleGroupPriorityConflictViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * A description of the violation that specifies the VPC and the rule group that's already associated with it.
     * </p>
     */
    private String violationTargetDescription;
    /**
     * <p>
     * The priority setting of the two conflicting rule groups.
     * </p>
     */
    private Integer conflictingPriority;
    /**
     * <p>
     * The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy contains the
     * rule group that's already associated with the VPC.
     * </p>
     */
    private String conflictingPolicyId;
    /**
     * <p>
     * The priorities of rule groups that are already associated with the VPC. To retry your operation, choose priority
     * settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * </p>
     */
    private java.util.List<Integer> unavailablePriorities;

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param violationTarget
     *        Information about the VPC ID.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @return Information about the VPC ID.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param violationTarget
     *        Information about the VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupPriorityConflictViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * A description of the violation that specifies the VPC and the rule group that's already associated with it.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the violation that specifies the VPC and the rule group that's already associated with
     *        it.
     */

    public void setViolationTargetDescription(String violationTargetDescription) {
        this.violationTargetDescription = violationTargetDescription;
    }

    /**
     * <p>
     * A description of the violation that specifies the VPC and the rule group that's already associated with it.
     * </p>
     * 
     * @return A description of the violation that specifies the VPC and the rule group that's already associated with
     *         it.
     */

    public String getViolationTargetDescription() {
        return this.violationTargetDescription;
    }

    /**
     * <p>
     * A description of the violation that specifies the VPC and the rule group that's already associated with it.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the violation that specifies the VPC and the rule group that's already associated with
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupPriorityConflictViolation withViolationTargetDescription(String violationTargetDescription) {
        setViolationTargetDescription(violationTargetDescription);
        return this;
    }

    /**
     * <p>
     * The priority setting of the two conflicting rule groups.
     * </p>
     * 
     * @param conflictingPriority
     *        The priority setting of the two conflicting rule groups.
     */

    public void setConflictingPriority(Integer conflictingPriority) {
        this.conflictingPriority = conflictingPriority;
    }

    /**
     * <p>
     * The priority setting of the two conflicting rule groups.
     * </p>
     * 
     * @return The priority setting of the two conflicting rule groups.
     */

    public Integer getConflictingPriority() {
        return this.conflictingPriority;
    }

    /**
     * <p>
     * The priority setting of the two conflicting rule groups.
     * </p>
     * 
     * @param conflictingPriority
     *        The priority setting of the two conflicting rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupPriorityConflictViolation withConflictingPriority(Integer conflictingPriority) {
        setConflictingPriority(conflictingPriority);
        return this;
    }

    /**
     * <p>
     * The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy contains the
     * rule group that's already associated with the VPC.
     * </p>
     * 
     * @param conflictingPolicyId
     *        The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy
     *        contains the rule group that's already associated with the VPC.
     */

    public void setConflictingPolicyId(String conflictingPolicyId) {
        this.conflictingPolicyId = conflictingPolicyId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy contains the
     * rule group that's already associated with the VPC.
     * </p>
     * 
     * @return The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy
     *         contains the rule group that's already associated with the VPC.
     */

    public String getConflictingPolicyId() {
        return this.conflictingPolicyId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy contains the
     * rule group that's already associated with the VPC.
     * </p>
     * 
     * @param conflictingPolicyId
     *        The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy
     *        contains the rule group that's already associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupPriorityConflictViolation withConflictingPolicyId(String conflictingPolicyId) {
        setConflictingPolicyId(conflictingPolicyId);
        return this;
    }

    /**
     * <p>
     * The priorities of rule groups that are already associated with the VPC. To retry your operation, choose priority
     * settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * </p>
     * 
     * @return The priorities of rule groups that are already associated with the VPC. To retry your operation, choose
     *         priority settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     */

    public java.util.List<Integer> getUnavailablePriorities() {
        return unavailablePriorities;
    }

    /**
     * <p>
     * The priorities of rule groups that are already associated with the VPC. To retry your operation, choose priority
     * settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * </p>
     * 
     * @param unavailablePriorities
     *        The priorities of rule groups that are already associated with the VPC. To retry your operation, choose
     *        priority settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     */

    public void setUnavailablePriorities(java.util.Collection<Integer> unavailablePriorities) {
        if (unavailablePriorities == null) {
            this.unavailablePriorities = null;
            return;
        }

        this.unavailablePriorities = new java.util.ArrayList<Integer>(unavailablePriorities);
    }

    /**
     * <p>
     * The priorities of rule groups that are already associated with the VPC. To retry your operation, choose priority
     * settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnavailablePriorities(java.util.Collection)} or
     * {@link #withUnavailablePriorities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unavailablePriorities
     *        The priorities of rule groups that are already associated with the VPC. To retry your operation, choose
     *        priority settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupPriorityConflictViolation withUnavailablePriorities(Integer... unavailablePriorities) {
        if (this.unavailablePriorities == null) {
            setUnavailablePriorities(new java.util.ArrayList<Integer>(unavailablePriorities.length));
        }
        for (Integer ele : unavailablePriorities) {
            this.unavailablePriorities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The priorities of rule groups that are already associated with the VPC. To retry your operation, choose priority
     * settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * </p>
     * 
     * @param unavailablePriorities
     *        The priorities of rule groups that are already associated with the VPC. To retry your operation, choose
     *        priority settings that aren't in this list for the rule groups in your new DNS Firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupPriorityConflictViolation withUnavailablePriorities(java.util.Collection<Integer> unavailablePriorities) {
        setUnavailablePriorities(unavailablePriorities);
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
        if (getConflictingPriority() != null)
            sb.append("ConflictingPriority: ").append(getConflictingPriority()).append(",");
        if (getConflictingPolicyId() != null)
            sb.append("ConflictingPolicyId: ").append(getConflictingPolicyId()).append(",");
        if (getUnavailablePriorities() != null)
            sb.append("UnavailablePriorities: ").append(getUnavailablePriorities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRuleGroupPriorityConflictViolation == false)
            return false;
        DnsRuleGroupPriorityConflictViolation other = (DnsRuleGroupPriorityConflictViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getViolationTargetDescription() == null ^ this.getViolationTargetDescription() == null)
            return false;
        if (other.getViolationTargetDescription() != null && other.getViolationTargetDescription().equals(this.getViolationTargetDescription()) == false)
            return false;
        if (other.getConflictingPriority() == null ^ this.getConflictingPriority() == null)
            return false;
        if (other.getConflictingPriority() != null && other.getConflictingPriority().equals(this.getConflictingPriority()) == false)
            return false;
        if (other.getConflictingPolicyId() == null ^ this.getConflictingPolicyId() == null)
            return false;
        if (other.getConflictingPolicyId() != null && other.getConflictingPolicyId().equals(this.getConflictingPolicyId()) == false)
            return false;
        if (other.getUnavailablePriorities() == null ^ this.getUnavailablePriorities() == null)
            return false;
        if (other.getUnavailablePriorities() != null && other.getUnavailablePriorities().equals(this.getUnavailablePriorities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getViolationTargetDescription() == null) ? 0 : getViolationTargetDescription().hashCode());
        hashCode = prime * hashCode + ((getConflictingPriority() == null) ? 0 : getConflictingPriority().hashCode());
        hashCode = prime * hashCode + ((getConflictingPolicyId() == null) ? 0 : getConflictingPolicyId().hashCode());
        hashCode = prime * hashCode + ((getUnavailablePriorities() == null) ? 0 : getUnavailablePriorities().hashCode());
        return hashCode;
    }

    @Override
    public DnsRuleGroupPriorityConflictViolation clone() {
        try {
            return (DnsRuleGroupPriorityConflictViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.DnsRuleGroupPriorityConflictViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
