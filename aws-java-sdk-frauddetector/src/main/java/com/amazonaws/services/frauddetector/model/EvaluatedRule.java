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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the rule used for evaluating variable values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EvaluatedRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluatedRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule ID.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The rule version.
     * </p>
     */
    private String ruleVersion;
    /**
     * <p>
     * The rule expression.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The rule expression value.
     * </p>
     */
    private String expressionWithValues;
    /**
     * <p>
     * The rule outcome.
     * </p>
     */
    private java.util.List<String> outcomes;
    /**
     * <p>
     * Indicates whether the rule was evaluated.
     * </p>
     */
    private Boolean evaluated;
    /**
     * <p>
     * Indicates whether the rule matched.
     * </p>
     */
    private Boolean matched;

    /**
     * <p>
     * The rule ID.
     * </p>
     * 
     * @param ruleId
     *        The rule ID.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID.
     * </p>
     * 
     * @return The rule ID.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The rule ID.
     * </p>
     * 
     * @param ruleId
     *        The rule ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The rule version.
     * </p>
     * 
     * @param ruleVersion
     *        The rule version.
     */

    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * <p>
     * The rule version.
     * </p>
     * 
     * @return The rule version.
     */

    public String getRuleVersion() {
        return this.ruleVersion;
    }

    /**
     * <p>
     * The rule version.
     * </p>
     * 
     * @param ruleVersion
     *        The rule version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withRuleVersion(String ruleVersion) {
        setRuleVersion(ruleVersion);
        return this;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * 
     * @param expression
     *        The rule expression.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * 
     * @return The rule expression.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * 
     * @param expression
     *        The rule expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The rule expression value.
     * </p>
     * 
     * @param expressionWithValues
     *        The rule expression value.
     */

    public void setExpressionWithValues(String expressionWithValues) {
        this.expressionWithValues = expressionWithValues;
    }

    /**
     * <p>
     * The rule expression value.
     * </p>
     * 
     * @return The rule expression value.
     */

    public String getExpressionWithValues() {
        return this.expressionWithValues;
    }

    /**
     * <p>
     * The rule expression value.
     * </p>
     * 
     * @param expressionWithValues
     *        The rule expression value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withExpressionWithValues(String expressionWithValues) {
        setExpressionWithValues(expressionWithValues);
        return this;
    }

    /**
     * <p>
     * The rule outcome.
     * </p>
     * 
     * @return The rule outcome.
     */

    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The rule outcome.
     * </p>
     * 
     * @param outcomes
     *        The rule outcome.
     */

    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The rule outcome.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The rule outcome.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withOutcomes(String... outcomes) {
        if (this.outcomes == null) {
            setOutcomes(new java.util.ArrayList<String>(outcomes.length));
        }
        for (String ele : outcomes) {
            this.outcomes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule outcome.
     * </p>
     * 
     * @param outcomes
     *        The rule outcome.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule was evaluated.
     * </p>
     * 
     * @param evaluated
     *        Indicates whether the rule was evaluated.
     */

    public void setEvaluated(Boolean evaluated) {
        this.evaluated = evaluated;
    }

    /**
     * <p>
     * Indicates whether the rule was evaluated.
     * </p>
     * 
     * @return Indicates whether the rule was evaluated.
     */

    public Boolean getEvaluated() {
        return this.evaluated;
    }

    /**
     * <p>
     * Indicates whether the rule was evaluated.
     * </p>
     * 
     * @param evaluated
     *        Indicates whether the rule was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withEvaluated(Boolean evaluated) {
        setEvaluated(evaluated);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule was evaluated.
     * </p>
     * 
     * @return Indicates whether the rule was evaluated.
     */

    public Boolean isEvaluated() {
        return this.evaluated;
    }

    /**
     * <p>
     * Indicates whether the rule matched.
     * </p>
     * 
     * @param matched
     *        Indicates whether the rule matched.
     */

    public void setMatched(Boolean matched) {
        this.matched = matched;
    }

    /**
     * <p>
     * Indicates whether the rule matched.
     * </p>
     * 
     * @return Indicates whether the rule matched.
     */

    public Boolean getMatched() {
        return this.matched;
    }

    /**
     * <p>
     * Indicates whether the rule matched.
     * </p>
     * 
     * @param matched
     *        Indicates whether the rule matched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatedRule withMatched(Boolean matched) {
        setMatched(matched);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule matched.
     * </p>
     * 
     * @return Indicates whether the rule matched.
     */

    public Boolean isMatched() {
        return this.matched;
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
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getRuleVersion() != null)
            sb.append("RuleVersion: ").append(getRuleVersion()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append("***Sensitive Data Redacted***").append(",");
        if (getExpressionWithValues() != null)
            sb.append("ExpressionWithValues: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes()).append(",");
        if (getEvaluated() != null)
            sb.append("Evaluated: ").append(getEvaluated()).append(",");
        if (getMatched() != null)
            sb.append("Matched: ").append(getMatched());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatedRule == false)
            return false;
        EvaluatedRule other = (EvaluatedRule) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null && other.getRuleVersion().equals(this.getRuleVersion()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getExpressionWithValues() == null ^ this.getExpressionWithValues() == null)
            return false;
        if (other.getExpressionWithValues() != null && other.getExpressionWithValues().equals(this.getExpressionWithValues()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        if (other.getEvaluated() == null ^ this.getEvaluated() == null)
            return false;
        if (other.getEvaluated() != null && other.getEvaluated().equals(this.getEvaluated()) == false)
            return false;
        if (other.getMatched() == null ^ this.getMatched() == null)
            return false;
        if (other.getMatched() != null && other.getMatched().equals(this.getMatched()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionWithValues() == null) ? 0 : getExpressionWithValues().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode + ((getEvaluated() == null) ? 0 : getEvaluated().hashCode());
        hashCode = prime * hashCode + ((getMatched() == null) ? 0 : getMatched().hashCode());
        return hashCode;
    }

    @Override
    public EvaluatedRule clone() {
        try {
            return (EvaluatedRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EvaluatedRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
