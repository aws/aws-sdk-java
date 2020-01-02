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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name
 * and the name of the rule group in this statement. You can retrieve the required names by calling
 * <a>ListAvailableManagedRuleGroups</a>.
 * </p>
 * <p>
 * You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code> or
 * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleGroupStatement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     */
    private String vendorName;
    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set on the
     * rule. This effectively excludes the rule from acting on web requests.
     * </p>
     */
    private java.util.List<ExcludedRule> excludedRules;

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *        rule group.
     */

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @return The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *         rule group.
     */

    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *        rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withVendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @param name
     *        The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @return The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @param name
     *        The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set on the
     * rule. This effectively excludes the rule from acting on web requests.
     * </p>
     * 
     * @return The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is
     *         set on the rule. This effectively excludes the rule from acting on web requests.
     */

    public java.util.List<ExcludedRule> getExcludedRules() {
        return excludedRules;
    }

    /**
     * <p>
     * The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set on the
     * rule. This effectively excludes the rule from acting on web requests.
     * </p>
     * 
     * @param excludedRules
     *        The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set
     *        on the rule. This effectively excludes the rule from acting on web requests.
     */

    public void setExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        if (excludedRules == null) {
            this.excludedRules = null;
            return;
        }

        this.excludedRules = new java.util.ArrayList<ExcludedRule>(excludedRules);
    }

    /**
     * <p>
     * The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set on the
     * rule. This effectively excludes the rule from acting on web requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedRules(java.util.Collection)} or {@link #withExcludedRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param excludedRules
     *        The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set
     *        on the rule. This effectively excludes the rule from acting on web requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withExcludedRules(ExcludedRule... excludedRules) {
        if (this.excludedRules == null) {
            setExcludedRules(new java.util.ArrayList<ExcludedRule>(excludedRules.length));
        }
        for (ExcludedRule ele : excludedRules) {
            this.excludedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set on the
     * rule. This effectively excludes the rule from acting on web requests.
     * </p>
     * 
     * @param excludedRules
     *        The rules whose actions are set to <code>COUNT</code> by the web ACL, regardless of the action that is set
     *        on the rule. This effectively excludes the rule from acting on web requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupStatement withExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        setExcludedRules(excludedRules);
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
        if (getVendorName() != null)
            sb.append("VendorName: ").append(getVendorName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getExcludedRules() != null)
            sb.append("ExcludedRules: ").append(getExcludedRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleGroupStatement == false)
            return false;
        ManagedRuleGroupStatement other = (ManagedRuleGroupStatement) obj;
        if (other.getVendorName() == null ^ this.getVendorName() == null)
            return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExcludedRules() == null ^ this.getExcludedRules() == null)
            return false;
        if (other.getExcludedRules() != null && other.getExcludedRules().equals(this.getExcludedRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExcludedRules() == null) ? 0 : getExcludedRules().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleGroupStatement clone() {
        try {
            return (ManagedRuleGroupStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleGroupStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
