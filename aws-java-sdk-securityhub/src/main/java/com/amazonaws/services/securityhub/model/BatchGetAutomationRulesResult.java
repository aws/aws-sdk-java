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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetAutomationRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAutomationRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of rule details for the provided rule ARNs.
     * </p>
     */
    private java.util.List<AutomationRulesConfig> rules;
    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't retrieve and why.
     * </p>
     */
    private java.util.List<UnprocessedAutomationRule> unprocessedAutomationRules;

    /**
     * <p>
     * A list of rule details for the provided rule ARNs.
     * </p>
     * 
     * @return A list of rule details for the provided rule ARNs.
     */

    public java.util.List<AutomationRulesConfig> getRules() {
        return rules;
    }

    /**
     * <p>
     * A list of rule details for the provided rule ARNs.
     * </p>
     * 
     * @param rules
     *        A list of rule details for the provided rule ARNs.
     */

    public void setRules(java.util.Collection<AutomationRulesConfig> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AutomationRulesConfig>(rules);
    }

    /**
     * <p>
     * A list of rule details for the provided rule ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A list of rule details for the provided rule ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAutomationRulesResult withRules(AutomationRulesConfig... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<AutomationRulesConfig>(rules.length));
        }
        for (AutomationRulesConfig ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of rule details for the provided rule ARNs.
     * </p>
     * 
     * @param rules
     *        A list of rule details for the provided rule ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAutomationRulesResult withRules(java.util.Collection<AutomationRulesConfig> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't retrieve and why.
     * </p>
     * 
     * @return A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *         This parameter tells you which automation rules the request didn't retrieve and why.
     */

    public java.util.List<UnprocessedAutomationRule> getUnprocessedAutomationRules() {
        return unprocessedAutomationRules;
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't retrieve and why.
     * </p>
     * 
     * @param unprocessedAutomationRules
     *        A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *        This parameter tells you which automation rules the request didn't retrieve and why.
     */

    public void setUnprocessedAutomationRules(java.util.Collection<UnprocessedAutomationRule> unprocessedAutomationRules) {
        if (unprocessedAutomationRules == null) {
            this.unprocessedAutomationRules = null;
            return;
        }

        this.unprocessedAutomationRules = new java.util.ArrayList<UnprocessedAutomationRule>(unprocessedAutomationRules);
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't retrieve and why.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAutomationRules(java.util.Collection)} or
     * {@link #withUnprocessedAutomationRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAutomationRules
     *        A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *        This parameter tells you which automation rules the request didn't retrieve and why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAutomationRulesResult withUnprocessedAutomationRules(UnprocessedAutomationRule... unprocessedAutomationRules) {
        if (this.unprocessedAutomationRules == null) {
            setUnprocessedAutomationRules(new java.util.ArrayList<UnprocessedAutomationRule>(unprocessedAutomationRules.length));
        }
        for (UnprocessedAutomationRule ele : unprocessedAutomationRules) {
            this.unprocessedAutomationRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
     * parameter tells you which automation rules the request didn't retrieve and why.
     * </p>
     * 
     * @param unprocessedAutomationRules
     *        A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>.
     *        This parameter tells you which automation rules the request didn't retrieve and why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAutomationRulesResult withUnprocessedAutomationRules(java.util.Collection<UnprocessedAutomationRule> unprocessedAutomationRules) {
        setUnprocessedAutomationRules(unprocessedAutomationRules);
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
            sb.append("Rules: ").append(getRules()).append(",");
        if (getUnprocessedAutomationRules() != null)
            sb.append("UnprocessedAutomationRules: ").append(getUnprocessedAutomationRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAutomationRulesResult == false)
            return false;
        BatchGetAutomationRulesResult other = (BatchGetAutomationRulesResult) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getUnprocessedAutomationRules() == null ^ this.getUnprocessedAutomationRules() == null)
            return false;
        if (other.getUnprocessedAutomationRules() != null && other.getUnprocessedAutomationRules().equals(this.getUnprocessedAutomationRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAutomationRules() == null) ? 0 : getUnprocessedAutomationRules().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAutomationRulesResult clone() {
        try {
            return (BatchGetAutomationRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
