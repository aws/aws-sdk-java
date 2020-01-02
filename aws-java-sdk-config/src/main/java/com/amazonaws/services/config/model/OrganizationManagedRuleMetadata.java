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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that specifies organization managed rule metadata such as resource type and ID of AWS resource along with
 * the rule identifier. It also provides the frequency with which you want AWS Config to run evaluations for the rule if
 * the trigger type is periodic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationManagedRuleMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationManagedRuleMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description that you provide for organization config rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * For organization config managed rules, a predefined identifier from a list. For example,
     * <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     */
    private String ruleIdentifier;
    /**
     * <p>
     * A string, in JSON format, that is passed to organization config rule Lambda function.
     * </p>
     */
    private String inputParameters;
    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that
     * is triggered at a periodic frequency.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     */
    private String maximumExecutionFrequency;
    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypesScope;
    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     */
    private String resourceIdScope;
    /**
     * <p>
     * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     */
    private String tagKeyScope;
    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     */
    private String tagValueScope;

    /**
     * <p>
     * The description that you provide for organization config rule.
     * </p>
     * 
     * @param description
     *        The description that you provide for organization config rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you provide for organization config rule.
     * </p>
     * 
     * @return The description that you provide for organization config rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description that you provide for organization config rule.
     * </p>
     * 
     * @param description
     *        The description that you provide for organization config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * For organization config managed rules, a predefined identifier from a list. For example,
     * <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * 
     * @param ruleIdentifier
     *        For organization config managed rules, a predefined identifier from a list. For example,
     *        <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Using AWS Managed Config Rules</a>.
     */

    public void setRuleIdentifier(String ruleIdentifier) {
        this.ruleIdentifier = ruleIdentifier;
    }

    /**
     * <p>
     * For organization config managed rules, a predefined identifier from a list. For example,
     * <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * 
     * @return For organization config managed rules, a predefined identifier from a list. For example,
     *         <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *         >Using AWS Managed Config Rules</a>.
     */

    public String getRuleIdentifier() {
        return this.ruleIdentifier;
    }

    /**
     * <p>
     * For organization config managed rules, a predefined identifier from a list. For example,
     * <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * 
     * @param ruleIdentifier
     *        For organization config managed rules, a predefined identifier from a list. For example,
     *        <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Using AWS Managed Config Rules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withRuleIdentifier(String ruleIdentifier) {
        setRuleIdentifier(ruleIdentifier);
        return this;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to organization config rule Lambda function.
     * </p>
     * 
     * @param inputParameters
     *        A string, in JSON format, that is passed to organization config rule Lambda function.
     */

    public void setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to organization config rule Lambda function.
     * </p>
     * 
     * @return A string, in JSON format, that is passed to organization config rule Lambda function.
     */

    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to organization config rule Lambda function.
     * </p>
     * 
     * @param inputParameters
     *        A string, in JSON format, that is passed to organization config rule Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withInputParameters(String inputParameters) {
        setInputParameters(inputParameters);
        return this;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that
     * is triggered at a periodic frequency.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule
     *        that is triggered at a periodic frequency.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that
     * is triggered at a periodic frequency.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @return The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed
     *         rule that is triggered at a periodic frequency.</p> <note>
     *         <p>
     *         By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify
     *         a valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *         </p>
     * @see MaximumExecutionFrequency
     */

    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that
     * is triggered at a periodic frequency.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule
     *        that is triggered at a periodic frequency.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public OrganizationManagedRuleMetadata withMaximumExecutionFrequency(String maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * <p>
     * The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule that
     * is triggered at a periodic frequency.
     * </p>
     * <note>
     * <p>
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid
     * value for the <code>MaximumExecutionFrequency</code> parameter.
     * </p>
     * </note>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which AWS Config runs evaluations for a rule. You are using an AWS managed rule
     *        that is triggered at a periodic frequency.</p> <note>
     *        <p>
     *        By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a
     *        valid value for the <code>MaximumExecutionFrequency</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public OrganizationManagedRuleMetadata withMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * 
     * @return The type of the AWS resource that was evaluated.
     */

    public java.util.List<String> getResourceTypesScope() {
        if (resourceTypesScope == null) {
            resourceTypesScope = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypesScope;
    }

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceTypesScope
     *        The type of the AWS resource that was evaluated.
     */

    public void setResourceTypesScope(java.util.Collection<String> resourceTypesScope) {
        if (resourceTypesScope == null) {
            this.resourceTypesScope = null;
            return;
        }

        this.resourceTypesScope = new com.amazonaws.internal.SdkInternalList<String>(resourceTypesScope);
    }

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypesScope(java.util.Collection)} or {@link #withResourceTypesScope(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceTypesScope
     *        The type of the AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withResourceTypesScope(String... resourceTypesScope) {
        if (this.resourceTypesScope == null) {
            setResourceTypesScope(new com.amazonaws.internal.SdkInternalList<String>(resourceTypesScope.length));
        }
        for (String ele : resourceTypesScope) {
            this.resourceTypesScope.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceTypesScope
     *        The type of the AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withResourceTypesScope(java.util.Collection<String> resourceTypesScope) {
        setResourceTypesScope(resourceTypesScope);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceIdScope
     *        The ID of the AWS resource that was evaluated.
     */

    public void setResourceIdScope(String resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @return The ID of the AWS resource that was evaluated.
     */

    public String getResourceIdScope() {
        return this.resourceIdScope;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceIdScope
     *        The ID of the AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withResourceIdScope(String resourceIdScope) {
        setResourceIdScope(resourceIdScope);
        return this;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @param tagKeyScope
     *        One part of a key-value pair that make up a tag. A key is a general label that acts like a category for
     *        more specific tag values.
     */

    public void setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @return One part of a key-value pair that make up a tag. A key is a general label that acts like a category for
     *         more specific tag values.
     */

    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @param tagKeyScope
     *        One part of a key-value pair that make up a tag. A key is a general label that acts like a category for
     *        more specific tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withTagKeyScope(String tagKeyScope) {
        setTagKeyScope(tagKeyScope);
        return this;
    }

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     * 
     * @param tagValueScope
     *        The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag
     *        category (key).
     */

    public void setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
    }

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     * 
     * @return The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag
     *         category (key).
     */

    public String getTagValueScope() {
        return this.tagValueScope;
    }

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     * 
     * @param tagValueScope
     *        The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag
     *        category (key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationManagedRuleMetadata withTagValueScope(String tagValueScope) {
        setTagValueScope(tagValueScope);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRuleIdentifier() != null)
            sb.append("RuleIdentifier: ").append(getRuleIdentifier()).append(",");
        if (getInputParameters() != null)
            sb.append("InputParameters: ").append(getInputParameters()).append(",");
        if (getMaximumExecutionFrequency() != null)
            sb.append("MaximumExecutionFrequency: ").append(getMaximumExecutionFrequency()).append(",");
        if (getResourceTypesScope() != null)
            sb.append("ResourceTypesScope: ").append(getResourceTypesScope()).append(",");
        if (getResourceIdScope() != null)
            sb.append("ResourceIdScope: ").append(getResourceIdScope()).append(",");
        if (getTagKeyScope() != null)
            sb.append("TagKeyScope: ").append(getTagKeyScope()).append(",");
        if (getTagValueScope() != null)
            sb.append("TagValueScope: ").append(getTagValueScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationManagedRuleMetadata == false)
            return false;
        OrganizationManagedRuleMetadata other = (OrganizationManagedRuleMetadata) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRuleIdentifier() == null ^ this.getRuleIdentifier() == null)
            return false;
        if (other.getRuleIdentifier() != null && other.getRuleIdentifier().equals(this.getRuleIdentifier()) == false)
            return false;
        if (other.getInputParameters() == null ^ this.getInputParameters() == null)
            return false;
        if (other.getInputParameters() != null && other.getInputParameters().equals(this.getInputParameters()) == false)
            return false;
        if (other.getMaximumExecutionFrequency() == null ^ this.getMaximumExecutionFrequency() == null)
            return false;
        if (other.getMaximumExecutionFrequency() != null && other.getMaximumExecutionFrequency().equals(this.getMaximumExecutionFrequency()) == false)
            return false;
        if (other.getResourceTypesScope() == null ^ this.getResourceTypesScope() == null)
            return false;
        if (other.getResourceTypesScope() != null && other.getResourceTypesScope().equals(this.getResourceTypesScope()) == false)
            return false;
        if (other.getResourceIdScope() == null ^ this.getResourceIdScope() == null)
            return false;
        if (other.getResourceIdScope() != null && other.getResourceIdScope().equals(this.getResourceIdScope()) == false)
            return false;
        if (other.getTagKeyScope() == null ^ this.getTagKeyScope() == null)
            return false;
        if (other.getTagKeyScope() != null && other.getTagKeyScope().equals(this.getTagKeyScope()) == false)
            return false;
        if (other.getTagValueScope() == null ^ this.getTagValueScope() == null)
            return false;
        if (other.getTagValueScope() != null && other.getTagValueScope().equals(this.getTagValueScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRuleIdentifier() == null) ? 0 : getRuleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getInputParameters() == null) ? 0 : getInputParameters().hashCode());
        hashCode = prime * hashCode + ((getMaximumExecutionFrequency() == null) ? 0 : getMaximumExecutionFrequency().hashCode());
        hashCode = prime * hashCode + ((getResourceTypesScope() == null) ? 0 : getResourceTypesScope().hashCode());
        hashCode = prime * hashCode + ((getResourceIdScope() == null) ? 0 : getResourceIdScope().hashCode());
        hashCode = prime * hashCode + ((getTagKeyScope() == null) ? 0 : getTagKeyScope().hashCode());
        hashCode = prime * hashCode + ((getTagValueScope() == null) ? 0 : getTagValueScope().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationManagedRuleMetadata clone() {
        try {
            return (OrganizationManagedRuleMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationManagedRuleMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
