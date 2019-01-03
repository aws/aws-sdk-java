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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the GetTopicRule operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTopicRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The rule ARN.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * The rule.
     * </p>
     */
    private TopicRule rule;

    /**
     * <p>
     * The rule ARN.
     * </p>
     * 
     * @param ruleArn
     *        The rule ARN.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The rule ARN.
     * </p>
     * 
     * @return The rule ARN.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The rule ARN.
     * </p>
     * 
     * @param ruleArn
     *        The rule ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTopicRuleResult withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * The rule.
     * </p>
     * 
     * @param rule
     *        The rule.
     */

    public void setRule(TopicRule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * The rule.
     * </p>
     * 
     * @return The rule.
     */

    public TopicRule getRule() {
        return this.rule;
    }

    /**
     * <p>
     * The rule.
     * </p>
     * 
     * @param rule
     *        The rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTopicRuleResult withRule(TopicRule rule) {
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
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
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

        if (obj instanceof GetTopicRuleResult == false)
            return false;
        GetTopicRuleResult other = (GetTopicRuleResult) obj;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
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

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public GetTopicRuleResult clone() {
        try {
            return (GetTopicRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
