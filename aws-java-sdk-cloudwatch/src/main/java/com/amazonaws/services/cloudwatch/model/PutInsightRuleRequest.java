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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutInsightRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutInsightRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The state of the rule. Valid values are ENABLED and DISABLED.
     * </p>
     */
    private String ruleState;
    /**
     * <p>
     * The definition of the rule, as a JSON object. For details on the valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     */
    private String ruleDefinition;
    /**
     * <p>
     * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags
     * with a rule.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * <p>
     * To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission.
     * </p>
     * <p>
     * If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this
     * parameter are ignored. To change the tags of an existing rule, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * 
     * @param ruleName
     *        A unique name for the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * 
     * @return A unique name for the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * 
     * @param ruleName
     *        A unique name for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightRuleRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The state of the rule. Valid values are ENABLED and DISABLED.
     * </p>
     * 
     * @param ruleState
     *        The state of the rule. Valid values are ENABLED and DISABLED.
     */

    public void setRuleState(String ruleState) {
        this.ruleState = ruleState;
    }

    /**
     * <p>
     * The state of the rule. Valid values are ENABLED and DISABLED.
     * </p>
     * 
     * @return The state of the rule. Valid values are ENABLED and DISABLED.
     */

    public String getRuleState() {
        return this.ruleState;
    }

    /**
     * <p>
     * The state of the rule. Valid values are ENABLED and DISABLED.
     * </p>
     * 
     * @param ruleState
     *        The state of the rule. Valid values are ENABLED and DISABLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightRuleRequest withRuleState(String ruleState) {
        setRuleState(ruleState);
        return this;
    }

    /**
     * <p>
     * The definition of the rule, as a JSON object. For details on the valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     * 
     * @param ruleDefinition
     *        The definition of the rule, as a JSON object. For details on the valid syntax, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     *        >Contributor Insights Rule Syntax</a>.
     */

    public void setRuleDefinition(String ruleDefinition) {
        this.ruleDefinition = ruleDefinition;
    }

    /**
     * <p>
     * The definition of the rule, as a JSON object. For details on the valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     * 
     * @return The definition of the rule, as a JSON object. For details on the valid syntax, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     *         >Contributor Insights Rule Syntax</a>.
     */

    public String getRuleDefinition() {
        return this.ruleDefinition;
    }

    /**
     * <p>
     * The definition of the rule, as a JSON object. For details on the valid syntax, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     * >Contributor Insights Rule Syntax</a>.
     * </p>
     * 
     * @param ruleDefinition
     *        The definition of the rule, as a JSON object. For details on the valid syntax, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html"
     *        >Contributor Insights Rule Syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightRuleRequest withRuleDefinition(String ruleDefinition) {
        setRuleDefinition(ruleDefinition);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags
     * with a rule.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * <p>
     * To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission.
     * </p>
     * <p>
     * If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this
     * parameter are ignored. To change the tags of an existing rule, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as
     *         50 tags with a rule.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user
     *         permissions, by granting a user permission to access or change only the resources that have certain tag
     *         values.
     *         </p>
     *         <p>
     *         To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code>
     *         permission in addition to the <code>cloudwatch:PutInsightRule</code> permission.
     *         </p>
     *         <p>
     *         If you are using this operation to update an existing Contributor Insights rule, any tags you specify in
     *         this parameter are ignored. To change the tags of an existing rule, use <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html"
     *         >TagResource</a>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags
     * with a rule.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * <p>
     * To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission.
     * </p>
     * <p>
     * If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this
     * parameter are ignored. To change the tags of an existing rule, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50
     *        tags with a rule.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only the resources that have certain tag values.
     *        </p>
     *        <p>
     *        To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission
     *        in addition to the <code>cloudwatch:PutInsightRule</code> permission.
     *        </p>
     *        <p>
     *        If you are using this operation to update an existing Contributor Insights rule, any tags you specify in
     *        this parameter are ignored. To change the tags of an existing rule, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags
     * with a rule.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * <p>
     * To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission.
     * </p>
     * <p>
     * If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this
     * parameter are ignored. To change the tags of an existing rule, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50
     *        tags with a rule.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only the resources that have certain tag values.
     *        </p>
     *        <p>
     *        To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission
     *        in addition to the <code>cloudwatch:PutInsightRule</code> permission.
     *        </p>
     *        <p>
     *        If you are using this operation to update an existing Contributor Insights rule, any tags you specify in
     *        this parameter are ignored. To change the tags of an existing rule, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightRuleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags
     * with a rule.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only the resources that have certain tag values.
     * </p>
     * <p>
     * To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission.
     * </p>
     * <p>
     * If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this
     * parameter are ignored. To change the tags of an existing rule, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50
     *        tags with a rule.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only the resources that have certain tag values.
     *        </p>
     *        <p>
     *        To be able to associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission
     *        in addition to the <code>cloudwatch:PutInsightRule</code> permission.
     *        </p>
     *        <p>
     *        If you are using this operation to update an existing Contributor Insights rule, any tags you specify in
     *        this parameter are ignored. To change the tags of an existing rule, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html"
     *        >TagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightRuleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getRuleState() != null)
            sb.append("RuleState: ").append(getRuleState()).append(",");
        if (getRuleDefinition() != null)
            sb.append("RuleDefinition: ").append(getRuleDefinition()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutInsightRuleRequest == false)
            return false;
        PutInsightRuleRequest other = (PutInsightRuleRequest) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getRuleState() == null ^ this.getRuleState() == null)
            return false;
        if (other.getRuleState() != null && other.getRuleState().equals(this.getRuleState()) == false)
            return false;
        if (other.getRuleDefinition() == null ^ this.getRuleDefinition() == null)
            return false;
        if (other.getRuleDefinition() != null && other.getRuleDefinition().equals(this.getRuleDefinition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getRuleState() == null) ? 0 : getRuleState().hashCode());
        hashCode = prime * hashCode + ((getRuleDefinition() == null) ? 0 : getRuleDefinition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutInsightRuleRequest clone() {
        return (PutInsightRuleRequest) super.clone();
    }

}
