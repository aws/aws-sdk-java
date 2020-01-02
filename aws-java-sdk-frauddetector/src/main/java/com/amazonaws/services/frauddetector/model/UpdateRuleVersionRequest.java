/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule to update.
     * </p>
     */
    private Rule rule;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The rule expression.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The language.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The outcomes.
     * </p>
     */
    private java.util.List<String> outcomes;

    /**
     * <p>
     * The rule to update.
     * </p>
     * 
     * @param rule
     *        The rule to update.
     */

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * The rule to update.
     * </p>
     * 
     * @return The rule to update.
     */

    public Rule getRule() {
        return this.rule;
    }

    /**
     * <p>
     * The rule to update.
     * </p>
     * 
     * @param rule
     *        The rule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleVersionRequest withRule(Rule rule) {
        setRule(rule);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleVersionRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateRuleVersionRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The language.
     * </p>
     * 
     * @param language
     *        The language.
     * @see Language
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language.
     * </p>
     * 
     * @return The language.
     * @see Language
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language.
     * </p>
     * 
     * @param language
     *        The language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Language
     */

    public UpdateRuleVersionRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The language.
     * </p>
     * 
     * @param language
     *        The language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Language
     */

    public UpdateRuleVersionRequest withLanguage(Language language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * 
     * @return The outcomes.
     */

    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * 
     * @param outcomes
     *        The outcomes.
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
     * The outcomes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleVersionRequest withOutcomes(String... outcomes) {
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
     * The outcomes.
     * </p>
     * 
     * @param outcomes
     *        The outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleVersionRequest withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
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
            sb.append("Rule: ").append(getRule()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleVersionRequest == false)
            return false;
        UpdateRuleVersionRequest other = (UpdateRuleVersionRequest) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleVersionRequest clone() {
        return (UpdateRuleVersionRequest) super.clone();
    }

}
