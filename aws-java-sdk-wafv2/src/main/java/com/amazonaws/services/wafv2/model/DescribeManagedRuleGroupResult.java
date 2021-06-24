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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     */
    private Long capacity;
    /** <p/> */
    private java.util.List<RuleSummary> rules;
    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     */
    private String labelNamespace;
    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     */
    private java.util.List<LabelSummary> availableLabels;
    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     */
    private java.util.List<LabelSummary> consumedLabels;

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     *        calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs.
     *        WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group
     *        capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The
     *        WCU limit for web ACLs is 1,500.
     */

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     *         calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs.
     *         WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group
     *         capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The
     *         WCU limit for web ACLs is 1,500.
     */

    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     * calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF
     * calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group capacity is
     * fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group. WAF uses web ACL capacity units (WCU) to
     *        calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs.
     *        WAF calculates capacity differently for each rule type, to reflect each rule's relative cost. Rule group
     *        capacity is fixed at creation, so users can plan their web ACL WCU usage when they use a rule group. The
     *        WCU limit for web ACLs is 1,500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withCapacity(Long capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<RuleSummary> getRules() {
        return rules;
    }

    /**
     * <p/>
     * 
     * @param rules
     */

    public void setRules(java.util.Collection<RuleSummary> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RuleSummary>(rules);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withRules(RuleSummary... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RuleSummary>(rules.length));
        }
        for (RuleSummary ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param rules
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withRules(java.util.Collection<RuleSummary> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelNamespace
     *        The label namespace prefix for this rule group. All labels added by rules in this rule group have this
     *        prefix. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for a managed rule group is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     *        qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined
     *        and the label from the rule, separated by a colon:
     *        </p>
     *        <p>
     *        <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *        </p>
     *        </li>
     */

    public void setLabelNamespace(String labelNamespace) {
        this.labelNamespace = labelNamespace;
    }

    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The label namespace prefix for this rule group. All labels added by rules in this rule group have this
     *         prefix. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The syntax for the label namespace prefix for a managed rule group is the following:
     *         </p>
     *         <p>
     *         <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A
     *         fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is
     *         defined and the label from the rule, separated by a colon:
     *         </p>
     *         <p>
     *         <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *         </p>
     *         </li>
     */

    public String getLabelNamespace() {
        return this.labelNamespace;
    }

    /**
     * <p>
     * The label namespace prefix for this rule group. All labels added by rules in this rule group have this prefix.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The syntax for the label namespace prefix for a managed rule group is the following:
     * </p>
     * <p>
     * <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     * </p>
     * </li>
     * <li>
     * <p>
     * When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     * qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and
     * the label from the rule, separated by a colon:
     * </p>
     * <p>
     * <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelNamespace
     *        The label namespace prefix for this rule group. All labels added by rules in this rule group have this
     *        prefix. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The syntax for the label namespace prefix for a managed rule group is the following:
     *        </p>
     *        <p>
     *        <code>awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;</code>:
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully
     *        qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined
     *        and the label from the rule, separated by a colon:
     *        </p>
     *        <p>
     *        <code>&lt;label namespace&gt;:&lt;label from rule&gt;</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withLabelNamespace(String labelNamespace) {
        setLabelNamespace(labelNamespace);
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * 
     * @return The labels that one or more rules in this rule group add to matching web requests. These labels are
     *         defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     */

    public java.util.List<LabelSummary> getAvailableLabels() {
        return availableLabels;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * 
     * @param availableLabels
     *        The labels that one or more rules in this rule group add to matching web requests. These labels are
     *        defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     */

    public void setAvailableLabels(java.util.Collection<LabelSummary> availableLabels) {
        if (availableLabels == null) {
            this.availableLabels = null;
            return;
        }

        this.availableLabels = new java.util.ArrayList<LabelSummary>(availableLabels);
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableLabels(java.util.Collection)} or {@link #withAvailableLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param availableLabels
     *        The labels that one or more rules in this rule group add to matching web requests. These labels are
     *        defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withAvailableLabels(LabelSummary... availableLabels) {
        if (this.availableLabels == null) {
            setAvailableLabels(new java.util.ArrayList<LabelSummary>(availableLabels.length));
        }
        for (LabelSummary ele : availableLabels) {
            this.availableLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group add to matching web requests. These labels are defined in
     * the <code>RuleLabels</code> for a <a>Rule</a>.
     * </p>
     * 
     * @param availableLabels
     *        The labels that one or more rules in this rule group add to matching web requests. These labels are
     *        defined in the <code>RuleLabels</code> for a <a>Rule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withAvailableLabels(java.util.Collection<LabelSummary> availableLabels) {
        setAvailableLabels(availableLabels);
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * 
     * @return The labels that one or more rules in this rule group match against in label match statements. These
     *         labels are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a>
     *         definition of a rule.
     */

    public java.util.List<LabelSummary> getConsumedLabels() {
        return consumedLabels;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * 
     * @param consumedLabels
     *        The labels that one or more rules in this rule group match against in label match statements. These labels
     *        are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a
     *        rule.
     */

    public void setConsumedLabels(java.util.Collection<LabelSummary> consumedLabels) {
        if (consumedLabels == null) {
            this.consumedLabels = null;
            return;
        }

        this.consumedLabels = new java.util.ArrayList<LabelSummary>(consumedLabels);
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedLabels(java.util.Collection)} or {@link #withConsumedLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param consumedLabels
     *        The labels that one or more rules in this rule group match against in label match statements. These labels
     *        are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withConsumedLabels(LabelSummary... consumedLabels) {
        if (this.consumedLabels == null) {
            setConsumedLabels(new java.util.ArrayList<LabelSummary>(consumedLabels.length));
        }
        for (LabelSummary ele : consumedLabels) {
            this.consumedLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that one or more rules in this rule group match against in label match statements. These labels are
     * defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
     * </p>
     * 
     * @param consumedLabels
     *        The labels that one or more rules in this rule group match against in label match statements. These labels
     *        are defined in a <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedRuleGroupResult withConsumedLabels(java.util.Collection<LabelSummary> consumedLabels) {
        setConsumedLabels(consumedLabels);
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
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getLabelNamespace() != null)
            sb.append("LabelNamespace: ").append(getLabelNamespace()).append(",");
        if (getAvailableLabels() != null)
            sb.append("AvailableLabels: ").append(getAvailableLabels()).append(",");
        if (getConsumedLabels() != null)
            sb.append("ConsumedLabels: ").append(getConsumedLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedRuleGroupResult == false)
            return false;
        DescribeManagedRuleGroupResult other = (DescribeManagedRuleGroupResult) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getLabelNamespace() == null ^ this.getLabelNamespace() == null)
            return false;
        if (other.getLabelNamespace() != null && other.getLabelNamespace().equals(this.getLabelNamespace()) == false)
            return false;
        if (other.getAvailableLabels() == null ^ this.getAvailableLabels() == null)
            return false;
        if (other.getAvailableLabels() != null && other.getAvailableLabels().equals(this.getAvailableLabels()) == false)
            return false;
        if (other.getConsumedLabels() == null ^ this.getConsumedLabels() == null)
            return false;
        if (other.getConsumedLabels() != null && other.getConsumedLabels().equals(this.getConsumedLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getLabelNamespace() == null) ? 0 : getLabelNamespace().hashCode());
        hashCode = prime * hashCode + ((getAvailableLabels() == null) ? 0 : getAvailableLabels().hashCode());
        hashCode = prime * hashCode + ((getConsumedLabels() == null) ? 0 : getConsumedLabels().hashCode());
        return hashCode;
    }

    @Override
    public DescribeManagedRuleGroupResult clone() {
        try {
            return (DescribeManagedRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
