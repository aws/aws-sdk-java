/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the approval rules applied to a pull request and whether conditions have been met.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Evaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     */
    private Boolean approved;
    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
     * </p>
     */
    private Boolean overridden;
    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     */
    private java.util.List<String> approvalRulesSatisfied;
    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     */
    private java.util.List<String> approvalRulesNotSatisfied;

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     * 
     * @param approved
     *        Whether the state of the pull request is approved.
     */

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     * 
     * @return Whether the state of the pull request is approved.
     */

    public Boolean getApproved() {
        return this.approved;
    }

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     * 
     * @param approved
     *        Whether the state of the pull request is approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withApproved(Boolean approved) {
        setApproved(approved);
        return this;
    }

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     * 
     * @return Whether the state of the pull request is approved.
     */

    public Boolean isApproved() {
        return this.approved;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
     * </p>
     * 
     * @param overridden
     *        Whether the approval rule requirements for the pull request have been overridden and no longer need to be
     *        met.
     */

    public void setOverridden(Boolean overridden) {
        this.overridden = overridden;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
     * </p>
     * 
     * @return Whether the approval rule requirements for the pull request have been overridden and no longer need to be
     *         met.
     */

    public Boolean getOverridden() {
        return this.overridden;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
     * </p>
     * 
     * @param overridden
     *        Whether the approval rule requirements for the pull request have been overridden and no longer need to be
     *        met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withOverridden(Boolean overridden) {
        setOverridden(overridden);
        return this;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
     * </p>
     * 
     * @return Whether the approval rule requirements for the pull request have been overridden and no longer need to be
     *         met.
     */

    public Boolean isOverridden() {
        return this.overridden;
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     * 
     * @return The names of the approval rules that have had their conditions met.
     */

    public java.util.List<String> getApprovalRulesSatisfied() {
        return approvalRulesSatisfied;
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     * 
     * @param approvalRulesSatisfied
     *        The names of the approval rules that have had their conditions met.
     */

    public void setApprovalRulesSatisfied(java.util.Collection<String> approvalRulesSatisfied) {
        if (approvalRulesSatisfied == null) {
            this.approvalRulesSatisfied = null;
            return;
        }

        this.approvalRulesSatisfied = new java.util.ArrayList<String>(approvalRulesSatisfied);
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovalRulesSatisfied(java.util.Collection)} or
     * {@link #withApprovalRulesSatisfied(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param approvalRulesSatisfied
     *        The names of the approval rules that have had their conditions met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withApprovalRulesSatisfied(String... approvalRulesSatisfied) {
        if (this.approvalRulesSatisfied == null) {
            setApprovalRulesSatisfied(new java.util.ArrayList<String>(approvalRulesSatisfied.length));
        }
        for (String ele : approvalRulesSatisfied) {
            this.approvalRulesSatisfied.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     * 
     * @param approvalRulesSatisfied
     *        The names of the approval rules that have had their conditions met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withApprovalRulesSatisfied(java.util.Collection<String> approvalRulesSatisfied) {
        setApprovalRulesSatisfied(approvalRulesSatisfied);
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     * 
     * @return The names of the approval rules that have not had their conditions met.
     */

    public java.util.List<String> getApprovalRulesNotSatisfied() {
        return approvalRulesNotSatisfied;
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     * 
     * @param approvalRulesNotSatisfied
     *        The names of the approval rules that have not had their conditions met.
     */

    public void setApprovalRulesNotSatisfied(java.util.Collection<String> approvalRulesNotSatisfied) {
        if (approvalRulesNotSatisfied == null) {
            this.approvalRulesNotSatisfied = null;
            return;
        }

        this.approvalRulesNotSatisfied = new java.util.ArrayList<String>(approvalRulesNotSatisfied);
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovalRulesNotSatisfied(java.util.Collection)} or
     * {@link #withApprovalRulesNotSatisfied(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param approvalRulesNotSatisfied
     *        The names of the approval rules that have not had their conditions met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withApprovalRulesNotSatisfied(String... approvalRulesNotSatisfied) {
        if (this.approvalRulesNotSatisfied == null) {
            setApprovalRulesNotSatisfied(new java.util.ArrayList<String>(approvalRulesNotSatisfied.length));
        }
        for (String ele : approvalRulesNotSatisfied) {
            this.approvalRulesNotSatisfied.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     * 
     * @param approvalRulesNotSatisfied
     *        The names of the approval rules that have not had their conditions met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withApprovalRulesNotSatisfied(java.util.Collection<String> approvalRulesNotSatisfied) {
        setApprovalRulesNotSatisfied(approvalRulesNotSatisfied);
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
        if (getApproved() != null)
            sb.append("Approved: ").append(getApproved()).append(",");
        if (getOverridden() != null)
            sb.append("Overridden: ").append(getOverridden()).append(",");
        if (getApprovalRulesSatisfied() != null)
            sb.append("ApprovalRulesSatisfied: ").append(getApprovalRulesSatisfied()).append(",");
        if (getApprovalRulesNotSatisfied() != null)
            sb.append("ApprovalRulesNotSatisfied: ").append(getApprovalRulesNotSatisfied());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evaluation == false)
            return false;
        Evaluation other = (Evaluation) obj;
        if (other.getApproved() == null ^ this.getApproved() == null)
            return false;
        if (other.getApproved() != null && other.getApproved().equals(this.getApproved()) == false)
            return false;
        if (other.getOverridden() == null ^ this.getOverridden() == null)
            return false;
        if (other.getOverridden() != null && other.getOverridden().equals(this.getOverridden()) == false)
            return false;
        if (other.getApprovalRulesSatisfied() == null ^ this.getApprovalRulesSatisfied() == null)
            return false;
        if (other.getApprovalRulesSatisfied() != null && other.getApprovalRulesSatisfied().equals(this.getApprovalRulesSatisfied()) == false)
            return false;
        if (other.getApprovalRulesNotSatisfied() == null ^ this.getApprovalRulesNotSatisfied() == null)
            return false;
        if (other.getApprovalRulesNotSatisfied() != null && other.getApprovalRulesNotSatisfied().equals(this.getApprovalRulesNotSatisfied()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApproved() == null) ? 0 : getApproved().hashCode());
        hashCode = prime * hashCode + ((getOverridden() == null) ? 0 : getOverridden().hashCode());
        hashCode = prime * hashCode + ((getApprovalRulesSatisfied() == null) ? 0 : getApprovalRulesSatisfied().hashCode());
        hashCode = prime * hashCode + ((getApprovalRulesNotSatisfied() == null) ? 0 : getApprovalRulesNotSatisfied().hashCode());
        return hashCode;
    }

    @Override
    public Evaluation clone() {
        try {
            return (Evaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.EvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
