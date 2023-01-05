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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata about a rule. Rule metadata includes an ID, a name, a list of tags, and a short and long description.
 * CodeGuru Reviewer uses rules to analyze code. A rule's recommendation is included in analysis results if code is
 * detected that violates the rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RuleMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * A short description of the rule.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * A long description of the rule.
     * </p>
     */
    private String longDescription;
    /**
     * <p>
     * Tags that are associated with the rule.
     * </p>
     */
    private java.util.List<String> ruleTags;

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @param ruleId
     *        The ID of the rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @return The ID of the rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @param ruleId
     *        The ID of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMetadata withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMetadata withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * A short description of the rule.
     * </p>
     * 
     * @param shortDescription
     *        A short description of the rule.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * A short description of the rule.
     * </p>
     * 
     * @return A short description of the rule.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * A short description of the rule.
     * </p>
     * 
     * @param shortDescription
     *        A short description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMetadata withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * A long description of the rule.
     * </p>
     * 
     * @param longDescription
     *        A long description of the rule.
     */

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * <p>
     * A long description of the rule.
     * </p>
     * 
     * @return A long description of the rule.
     */

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * <p>
     * A long description of the rule.
     * </p>
     * 
     * @param longDescription
     *        A long description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMetadata withLongDescription(String longDescription) {
        setLongDescription(longDescription);
        return this;
    }

    /**
     * <p>
     * Tags that are associated with the rule.
     * </p>
     * 
     * @return Tags that are associated with the rule.
     */

    public java.util.List<String> getRuleTags() {
        return ruleTags;
    }

    /**
     * <p>
     * Tags that are associated with the rule.
     * </p>
     * 
     * @param ruleTags
     *        Tags that are associated with the rule.
     */

    public void setRuleTags(java.util.Collection<String> ruleTags) {
        if (ruleTags == null) {
            this.ruleTags = null;
            return;
        }

        this.ruleTags = new java.util.ArrayList<String>(ruleTags);
    }

    /**
     * <p>
     * Tags that are associated with the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleTags(java.util.Collection)} or {@link #withRuleTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ruleTags
     *        Tags that are associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMetadata withRuleTags(String... ruleTags) {
        if (this.ruleTags == null) {
            setRuleTags(new java.util.ArrayList<String>(ruleTags.length));
        }
        for (String ele : ruleTags) {
            this.ruleTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags that are associated with the rule.
     * </p>
     * 
     * @param ruleTags
     *        Tags that are associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMetadata withRuleTags(java.util.Collection<String> ruleTags) {
        setRuleTags(ruleTags);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getShortDescription() != null)
            sb.append("ShortDescription: ").append(getShortDescription()).append(",");
        if (getLongDescription() != null)
            sb.append("LongDescription: ").append(getLongDescription()).append(",");
        if (getRuleTags() != null)
            sb.append("RuleTags: ").append(getRuleTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleMetadata == false)
            return false;
        RuleMetadata other = (RuleMetadata) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getLongDescription() == null ^ this.getLongDescription() == null)
            return false;
        if (other.getLongDescription() != null && other.getLongDescription().equals(this.getLongDescription()) == false)
            return false;
        if (other.getRuleTags() == null ^ this.getRuleTags() == null)
            return false;
        if (other.getRuleTags() != null && other.getRuleTags().equals(this.getRuleTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getLongDescription() == null) ? 0 : getLongDescription().hashCode());
        hashCode = prime * hashCode + ((getRuleTags() == null) ? 0 : getRuleTags().hashCode());
        return hashCode;
    }

    @Override
    public RuleMetadata clone() {
        try {
            return (RuleMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RuleMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
