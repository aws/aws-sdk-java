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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The rule to exclude from a rule group. This is applicable only when the <code>ActivatedRule</code> refers to a
 * <code>RuleGroup</code>. The rule must belong to the <code>RuleGroup</code> that is specified by the
 * <code>ActivatedRule</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ExcludedRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExcludedRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the rule to exclude from the rule group.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * The unique identifier for the rule to exclude from the rule group.
     * </p>
     * 
     * @param ruleId
     *        The unique identifier for the rule to exclude from the rule group.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The unique identifier for the rule to exclude from the rule group.
     * </p>
     * 
     * @return The unique identifier for the rule to exclude from the rule group.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The unique identifier for the rule to exclude from the rule group.
     * </p>
     * 
     * @param ruleId
     *        The unique identifier for the rule to exclude from the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExcludedRule withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExcludedRule == false)
            return false;
        ExcludedRule other = (ExcludedRule) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public ExcludedRule clone() {
        try {
            return (ExcludedRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.ExcludedRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
