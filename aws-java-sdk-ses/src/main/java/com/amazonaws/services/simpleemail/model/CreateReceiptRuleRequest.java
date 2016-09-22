/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more
 * information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 */
public class CreateReceiptRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule set to which to add the rule.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule
     * will be inserted at the beginning of the rule list.
     * </p>
     */
    private String after;
    /**
     * <p>
     * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan
     * status, and TLS policy.
     * </p>
     */
    private ReceiptRule rule;

    /**
     * <p>
     * The name of the rule set to which to add the rule.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the rule set to which to add the rule.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the rule set to which to add the rule.
     * </p>
     * 
     * @return The name of the rule set to which to add the rule.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the rule set to which to add the rule.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the rule set to which to add the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReceiptRuleRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule
     * will be inserted at the beginning of the rule list.
     * </p>
     * 
     * @param after
     *        The name of an existing rule after which the new rule will be placed. If this parameter is null, the new
     *        rule will be inserted at the beginning of the rule list.
     */

    public void setAfter(String after) {
        this.after = after;
    }

    /**
     * <p>
     * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule
     * will be inserted at the beginning of the rule list.
     * </p>
     * 
     * @return The name of an existing rule after which the new rule will be placed. If this parameter is null, the new
     *         rule will be inserted at the beginning of the rule list.
     */

    public String getAfter() {
        return this.after;
    }

    /**
     * <p>
     * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule
     * will be inserted at the beginning of the rule list.
     * </p>
     * 
     * @param after
     *        The name of an existing rule after which the new rule will be placed. If this parameter is null, the new
     *        rule will be inserted at the beginning of the rule list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReceiptRuleRequest withAfter(String after) {
        setAfter(after);
        return this;
    }

    /**
     * <p>
     * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan
     * status, and TLS policy.
     * </p>
     * 
     * @param rule
     *        A data structure that contains the specified rule's name, actions, recipients, domains, enabled status,
     *        scan status, and TLS policy.
     */

    public void setRule(ReceiptRule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan
     * status, and TLS policy.
     * </p>
     * 
     * @return A data structure that contains the specified rule's name, actions, recipients, domains, enabled status,
     *         scan status, and TLS policy.
     */

    public ReceiptRule getRule() {
        return this.rule;
    }

    /**
     * <p>
     * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan
     * status, and TLS policy.
     * </p>
     * 
     * @param rule
     *        A data structure that contains the specified rule's name, actions, recipients, domains, enabled status,
     *        scan status, and TLS policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReceiptRuleRequest withRule(ReceiptRule rule) {
        setRule(rule);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRuleSetName() != null)
            sb.append("RuleSetName: " + getRuleSetName() + ",");
        if (getAfter() != null)
            sb.append("After: " + getAfter() + ",");
        if (getRule() != null)
            sb.append("Rule: " + getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReceiptRuleRequest == false)
            return false;
        CreateReceiptRuleRequest other = (CreateReceiptRuleRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getAfter() == null ^ this.getAfter() == null)
            return false;
        if (other.getAfter() != null && other.getAfter().equals(this.getAfter()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getAfter() == null) ? 0 : getAfter().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public CreateReceiptRuleRequest clone() {
        return (CreateReceiptRuleRequest) super.clone();
    }
}
