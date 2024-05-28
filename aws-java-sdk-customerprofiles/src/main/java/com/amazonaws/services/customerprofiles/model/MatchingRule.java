/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how does the rule-based matching process should match profiles. You can choose from the following
 * attributes to build the matching Rule:
 * </p>
 * <ul>
 * <li>
 * <p>
 * AccountNumber
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.Address
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.City
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.Country
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.County
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.PostalCode
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.State
 * </p>
 * </li>
 * <li>
 * <p>
 * Address.Province
 * </p>
 * </li>
 * <li>
 * <p>
 * BirthDate
 * </p>
 * </li>
 * <li>
 * <p>
 * BusinessName
 * </p>
 * </li>
 * <li>
 * <p>
 * EmailAddress
 * </p>
 * </li>
 * <li>
 * <p>
 * FirstName
 * </p>
 * </li>
 * <li>
 * <p>
 * Gender
 * </p>
 * </li>
 * <li>
 * <p>
 * LastName
 * </p>
 * </li>
 * <li>
 * <p>
 * MiddleName
 * </p>
 * </li>
 * <li>
 * <p>
 * PhoneNumber
 * </p>
 * </li>
 * <li>
 * <p>
 * Any customized profile attributes that start with the <code>Attributes</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MatchingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should match
     * profiles.
     * </p>
     */
    private java.util.List<String> rule;

    /**
     * <p>
     * A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should match
     * profiles.
     * </p>
     * 
     * @return A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should
     *         match profiles.
     */

    public java.util.List<String> getRule() {
        return rule;
    }

    /**
     * <p>
     * A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should match
     * profiles.
     * </p>
     * 
     * @param rule
     *        A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should
     *        match profiles.
     */

    public void setRule(java.util.Collection<String> rule) {
        if (rule == null) {
            this.rule = null;
            return;
        }

        this.rule = new java.util.ArrayList<String>(rule);
    }

    /**
     * <p>
     * A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should match
     * profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRule(java.util.Collection)} or {@link #withRule(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rule
     *        A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should
     *        match profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingRule withRule(String... rule) {
        if (this.rule == null) {
            setRule(new java.util.ArrayList<String>(rule.length));
        }
        for (String ele : rule) {
            this.rule.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should match
     * profiles.
     * </p>
     * 
     * @param rule
     *        A single rule level of the <code>MatchRules</code>. Configures how the rule-based matching process should
     *        match profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingRule withRule(java.util.Collection<String> rule) {
        setRule(rule);
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
        if (getRule() != null)
            sb.append("Rule: ").append(getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchingRule == false)
            return false;
        MatchingRule other = (MatchingRule) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public MatchingRule clone() {
        try {
            return (MatchingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.MatchingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
