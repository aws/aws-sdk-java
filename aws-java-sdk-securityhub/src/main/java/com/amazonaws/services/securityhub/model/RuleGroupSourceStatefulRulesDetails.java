/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Suricata rule specification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatefulRulesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatefulRulesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The stateful inspection criteria for the rule.
     * </p>
     */
    private RuleGroupSourceStatefulRulesHeaderDetails header;
    /**
     * <p>
     * Additional options for the rule.
     * </p>
     */
    private java.util.List<RuleGroupSourceStatefulRulesOptionsDetails> ruleOptions;

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria.
     * </p>
     * 
     * @param action
     *        Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *        stateful rule criteria.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria.
     * </p>
     * 
     * @return Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *         stateful rule criteria.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful
     * rule criteria.
     * </p>
     * 
     * @param action
     *        Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the
     *        stateful rule criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesDetails withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The stateful inspection criteria for the rule.
     * </p>
     * 
     * @param header
     *        The stateful inspection criteria for the rule.
     */

    public void setHeader(RuleGroupSourceStatefulRulesHeaderDetails header) {
        this.header = header;
    }

    /**
     * <p>
     * The stateful inspection criteria for the rule.
     * </p>
     * 
     * @return The stateful inspection criteria for the rule.
     */

    public RuleGroupSourceStatefulRulesHeaderDetails getHeader() {
        return this.header;
    }

    /**
     * <p>
     * The stateful inspection criteria for the rule.
     * </p>
     * 
     * @param header
     *        The stateful inspection criteria for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesDetails withHeader(RuleGroupSourceStatefulRulesHeaderDetails header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Additional options for the rule.
     * </p>
     * 
     * @return Additional options for the rule.
     */

    public java.util.List<RuleGroupSourceStatefulRulesOptionsDetails> getRuleOptions() {
        return ruleOptions;
    }

    /**
     * <p>
     * Additional options for the rule.
     * </p>
     * 
     * @param ruleOptions
     *        Additional options for the rule.
     */

    public void setRuleOptions(java.util.Collection<RuleGroupSourceStatefulRulesOptionsDetails> ruleOptions) {
        if (ruleOptions == null) {
            this.ruleOptions = null;
            return;
        }

        this.ruleOptions = new java.util.ArrayList<RuleGroupSourceStatefulRulesOptionsDetails>(ruleOptions);
    }

    /**
     * <p>
     * Additional options for the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleOptions(java.util.Collection)} or {@link #withRuleOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleOptions
     *        Additional options for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesDetails withRuleOptions(RuleGroupSourceStatefulRulesOptionsDetails... ruleOptions) {
        if (this.ruleOptions == null) {
            setRuleOptions(new java.util.ArrayList<RuleGroupSourceStatefulRulesOptionsDetails>(ruleOptions.length));
        }
        for (RuleGroupSourceStatefulRulesOptionsDetails ele : ruleOptions) {
            this.ruleOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional options for the rule.
     * </p>
     * 
     * @param ruleOptions
     *        Additional options for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesDetails withRuleOptions(java.util.Collection<RuleGroupSourceStatefulRulesOptionsDetails> ruleOptions) {
        setRuleOptions(ruleOptions);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getRuleOptions() != null)
            sb.append("RuleOptions: ").append(getRuleOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatefulRulesDetails == false)
            return false;
        RuleGroupSourceStatefulRulesDetails other = (RuleGroupSourceStatefulRulesDetails) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getRuleOptions() == null ^ this.getRuleOptions() == null)
            return false;
        if (other.getRuleOptions() != null && other.getRuleOptions().equals(this.getRuleOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getRuleOptions() == null) ? 0 : getRuleOptions().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatefulRulesDetails clone() {
        try {
            return (RuleGroupSourceStatefulRulesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatefulRulesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
