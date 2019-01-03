/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of rules defining the approval rules for a patch baseline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchRuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rules that make up the rule group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PatchRule> patchRules;

    /**
     * <p>
     * The rules that make up the rule group.
     * </p>
     * 
     * @return The rules that make up the rule group.
     */

    public java.util.List<PatchRule> getPatchRules() {
        if (patchRules == null) {
            patchRules = new com.amazonaws.internal.SdkInternalList<PatchRule>();
        }
        return patchRules;
    }

    /**
     * <p>
     * The rules that make up the rule group.
     * </p>
     * 
     * @param patchRules
     *        The rules that make up the rule group.
     */

    public void setPatchRules(java.util.Collection<PatchRule> patchRules) {
        if (patchRules == null) {
            this.patchRules = null;
            return;
        }

        this.patchRules = new com.amazonaws.internal.SdkInternalList<PatchRule>(patchRules);
    }

    /**
     * <p>
     * The rules that make up the rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatchRules(java.util.Collection)} or {@link #withPatchRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param patchRules
     *        The rules that make up the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchRuleGroup withPatchRules(PatchRule... patchRules) {
        if (this.patchRules == null) {
            setPatchRules(new com.amazonaws.internal.SdkInternalList<PatchRule>(patchRules.length));
        }
        for (PatchRule ele : patchRules) {
            this.patchRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules that make up the rule group.
     * </p>
     * 
     * @param patchRules
     *        The rules that make up the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchRuleGroup withPatchRules(java.util.Collection<PatchRule> patchRules) {
        setPatchRules(patchRules);
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
        if (getPatchRules() != null)
            sb.append("PatchRules: ").append(getPatchRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchRuleGroup == false)
            return false;
        PatchRuleGroup other = (PatchRuleGroup) obj;
        if (other.getPatchRules() == null ^ this.getPatchRules() == null)
            return false;
        if (other.getPatchRules() != null && other.getPatchRules().equals(this.getPatchRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchRules() == null) ? 0 : getPatchRules().hashCode());
        return hashCode;
    }

    @Override
    public PatchRuleGroup clone() {
        try {
            return (PatchRuleGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchRuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
