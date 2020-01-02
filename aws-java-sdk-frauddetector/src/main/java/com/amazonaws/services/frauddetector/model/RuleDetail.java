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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/RuleDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rule ID.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     */
    private String detectorId;
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
     * The rule language.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The rule outcomes.
     * </p>
     */
    private java.util.List<String> outcomes;
    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     */
    private String createdTime;

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

    public RuleDetail withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @param description
     *        The rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @return The rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * 
     * @param description
     *        The rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * 
     * @param detectorId
     *        The detector for which the rule is associated.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * 
     * @return The detector for which the rule is associated.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * 
     * @param detectorId
     *        The detector for which the rule is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDetail withDetectorId(String detectorId) {
        setDetectorId(detectorId);
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

    public RuleDetail withRuleVersion(String ruleVersion) {
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

    public RuleDetail withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * 
     * @param language
     *        The rule language.
     * @see Language
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * 
     * @return The rule language.
     * @see Language
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * 
     * @param language
     *        The rule language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Language
     */

    public RuleDetail withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * 
     * @param language
     *        The rule language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Language
     */

    public RuleDetail withLanguage(Language language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The rule outcomes.
     * </p>
     * 
     * @return The rule outcomes.
     */

    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The rule outcomes.
     * </p>
     * 
     * @param outcomes
     *        The rule outcomes.
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
     * The rule outcomes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The rule outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDetail withOutcomes(String... outcomes) {
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
     * The rule outcomes.
     * </p>
     * 
     * @param outcomes
     *        The rule outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDetail withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of the last time the rule was updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     * 
     * @return Timestamp of the last time the rule was updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of the last time the rule was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDetail withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the rule was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     * 
     * @return The timestamp of when the rule was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDetail withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getRuleVersion() != null)
            sb.append("RuleVersion: ").append(getRuleVersion()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleDetail == false)
            return false;
        RuleDetail other = (RuleDetail) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null && other.getRuleVersion().equals(this.getRuleVersion()) == false)
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
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public RuleDetail clone() {
        try {
            return (RuleDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.RuleDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
