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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of a rule set you want to update.
     * </p>
     */
    private String ruleSetId;
    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * A new set of rules to replace the current rules of the rule set—these rules will override all the rules of the
     * rule set.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The identifier of a rule set you want to update.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of a rule set you want to update.
     */

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    /**
     * <p>
     * The identifier of a rule set you want to update.
     * </p>
     * 
     * @return The identifier of a rule set you want to update.
     */

    public String getRuleSetId() {
        return this.ruleSetId;
    }

    /**
     * <p>
     * The identifier of a rule set you want to update.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of a rule set you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleSetRequest withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     * 
     * @param ruleSetName
     *        A user-friendly name for the rule set resource.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     * 
     * @return A user-friendly name for the rule set resource.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * A user-friendly name for the rule set resource.
     * </p>
     * 
     * @param ruleSetName
     *        A user-friendly name for the rule set resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleSetRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * A new set of rules to replace the current rules of the rule set—these rules will override all the rules of the
     * rule set.
     * </p>
     * 
     * @return A new set of rules to replace the current rules of the rule set—these rules will override all the rules
     *         of the rule set.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A new set of rules to replace the current rules of the rule set—these rules will override all the rules of the
     * rule set.
     * </p>
     * 
     * @param rules
     *        A new set of rules to replace the current rules of the rule set—these rules will override all the rules of
     *        the rule set.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * A new set of rules to replace the current rules of the rule set—these rules will override all the rules of the
     * rule set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A new set of rules to replace the current rules of the rule set—these rules will override all the rules of
     *        the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleSetRequest withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A new set of rules to replace the current rules of the rule set—these rules will override all the rules of the
     * rule set.
     * </p>
     * 
     * @param rules
     *        A new set of rules to replace the current rules of the rule set—these rules will override all the rules of
     *        the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleSetRequest withRules(java.util.Collection<Rule> rules) {
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
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId()).append(",");
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName()).append(",");
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

        if (obj instanceof UpdateRuleSetRequest == false)
            return false;
        UpdateRuleSetRequest other = (UpdateRuleSetRequest) obj;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleSetRequest clone() {
        return (UpdateRuleSetRequest) super.clone();
    }

}
