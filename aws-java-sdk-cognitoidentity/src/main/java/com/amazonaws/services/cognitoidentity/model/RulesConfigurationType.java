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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/RulesConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RulesConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of rules. You can specify up to 25 rules per identity provider.
     * </p>
     * <p>
     * Rules are evaluated in order. The first one to match specifies the role.
     * </p>
     */
    private java.util.List<MappingRule> rules;

    /**
     * <p>
     * An array of rules. You can specify up to 25 rules per identity provider.
     * </p>
     * <p>
     * Rules are evaluated in order. The first one to match specifies the role.
     * </p>
     * 
     * @return An array of rules. You can specify up to 25 rules per identity provider.</p>
     *         <p>
     *         Rules are evaluated in order. The first one to match specifies the role.
     */

    public java.util.List<MappingRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array of rules. You can specify up to 25 rules per identity provider.
     * </p>
     * <p>
     * Rules are evaluated in order. The first one to match specifies the role.
     * </p>
     * 
     * @param rules
     *        An array of rules. You can specify up to 25 rules per identity provider.</p>
     *        <p>
     *        Rules are evaluated in order. The first one to match specifies the role.
     */

    public void setRules(java.util.Collection<MappingRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<MappingRule>(rules);
    }

    /**
     * <p>
     * An array of rules. You can specify up to 25 rules per identity provider.
     * </p>
     * <p>
     * Rules are evaluated in order. The first one to match specifies the role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        An array of rules. You can specify up to 25 rules per identity provider.</p>
     *        <p>
     *        Rules are evaluated in order. The first one to match specifies the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesConfigurationType withRules(MappingRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<MappingRule>(rules.length));
        }
        for (MappingRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of rules. You can specify up to 25 rules per identity provider.
     * </p>
     * <p>
     * Rules are evaluated in order. The first one to match specifies the role.
     * </p>
     * 
     * @param rules
     *        An array of rules. You can specify up to 25 rules per identity provider.</p>
     *        <p>
     *        Rules are evaluated in order. The first one to match specifies the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesConfigurationType withRules(java.util.Collection<MappingRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RulesConfigurationType == false)
            return false;
        RulesConfigurationType other = (RulesConfigurationType) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public RulesConfigurationType clone() {
        try {
            return (RulesConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidentity.model.transform.RulesConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
