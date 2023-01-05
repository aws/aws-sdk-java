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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the CustomPolicyDetails, the rule owner (<code>Amazon Web Services</code> for managed rules,
 * <code>CUSTOM_POLICY</code> for Custom Policy rules, and <code>CUSTOM_LAMBDA</code> for Custom Lambda rules), the rule
 * identifier, and the events that cause the evaluation of your Amazon Web Services resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether Amazon Web Services or the customer owns and manages the Config rule.
     * </p>
     * <p>
     * Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     * Managed Rules</a> in the <i>Config developer guide</i>.
     * </p>
     * <p>
     * Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or Lambda (
     * <code>CUSTOM_LAMBDA</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config Custom
     * Rules </a> in the <i>Config developer guide</i>.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * For Config Managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code> is a
     * managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of Config
     * Managed Rules</a>.
     * </p>
     * <p>
     * For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda function,
     * such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * <p>
     * For Config Custom Policy rules, this field will be ignored.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     * against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the
     * trigger type is periodic.
     * </p>
     * <p>
     * If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger message
     * type are <code>ConfigurationItemChangeNotification</code> and
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SourceDetail> sourceDetails;
    /**
     * <p>
     * Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set
     * to <code>CUSTOM_POLICY</code>.
     * </p>
     */
    private CustomPolicyDetails customPolicyDetails;

    /**
     * <p>
     * Indicates whether Amazon Web Services or the customer owns and manages the Config rule.
     * </p>
     * <p>
     * Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     * Managed Rules</a> in the <i>Config developer guide</i>.
     * </p>
     * <p>
     * Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or Lambda (
     * <code>CUSTOM_LAMBDA</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config Custom
     * Rules </a> in the <i>Config developer guide</i>.
     * </p>
     * 
     * @param owner
     *        Indicates whether Amazon Web Services or the customer owns and manages the Config rule.</p>
     *        <p>
     *        Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Config Managed Rules</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <p>
     *        Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or
     *        Lambda (<code>CUSTOM_LAMBDA</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config
     *        Custom Rules </a> in the <i>Config developer guide</i>.
     * @see Owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Indicates whether Amazon Web Services or the customer owns and manages the Config rule.
     * </p>
     * <p>
     * Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     * Managed Rules</a> in the <i>Config developer guide</i>.
     * </p>
     * <p>
     * Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or Lambda (
     * <code>CUSTOM_LAMBDA</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config Custom
     * Rules </a> in the <i>Config developer guide</i>.
     * </p>
     * 
     * @return Indicates whether Amazon Web Services or the customer owns and manages the Config rule.</p>
     *         <p>
     *         Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     *         Managed Rules</a> in the <i>Config developer guide</i>.
     *         </p>
     *         <p>
     *         Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or
     *         Lambda (<code>CUSTOM_LAMBDA</code>). For more information, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config
     *         Custom Rules </a> in the <i>Config developer guide</i>.
     * @see Owner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * Indicates whether Amazon Web Services or the customer owns and manages the Config rule.
     * </p>
     * <p>
     * Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     * Managed Rules</a> in the <i>Config developer guide</i>.
     * </p>
     * <p>
     * Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or Lambda (
     * <code>CUSTOM_LAMBDA</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config Custom
     * Rules </a> in the <i>Config developer guide</i>.
     * </p>
     * 
     * @param owner
     *        Indicates whether Amazon Web Services or the customer owns and manages the Config rule.</p>
     *        <p>
     *        Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Config Managed Rules</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <p>
     *        Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or
     *        Lambda (<code>CUSTOM_LAMBDA</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config
     *        Custom Rules </a> in the <i>Config developer guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public Source withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Web Services or the customer owns and manages the Config rule.
     * </p>
     * <p>
     * Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     * Managed Rules</a> in the <i>Config developer guide</i>.
     * </p>
     * <p>
     * Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or Lambda (
     * <code>CUSTOM_LAMBDA</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config Custom
     * Rules </a> in the <i>Config developer guide</i>.
     * </p>
     * 
     * @param owner
     *        Indicates whether Amazon Web Services or the customer owns and manages the Config rule.</p>
     *        <p>
     *        Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Config Managed Rules</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <p>
     *        Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or
     *        Lambda (<code>CUSTOM_LAMBDA</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config
     *        Custom Rules </a> in the <i>Config developer guide</i>.
     * @see Owner
     */

    public void setOwner(Owner owner) {
        withOwner(owner);
    }

    /**
     * <p>
     * Indicates whether Amazon Web Services or the customer owns and manages the Config rule.
     * </p>
     * <p>
     * Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Config
     * Managed Rules</a> in the <i>Config developer guide</i>.
     * </p>
     * <p>
     * Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or Lambda (
     * <code>CUSTOM_LAMBDA</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config Custom
     * Rules </a> in the <i>Config developer guide</i>.
     * </p>
     * 
     * @param owner
     *        Indicates whether Amazon Web Services or the customer owns and manages the Config rule.</p>
     *        <p>
     *        Config Managed Rules are predefined rules owned by Amazon Web Services. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Config Managed Rules</a> in the <i>Config developer guide</i>.
     *        </p>
     *        <p>
     *        Config Custom Rules are rules that you can develop either with Guard (<code>CUSTOM_POLICY</code>) or
     *        Lambda (<code>CUSTOM_LAMBDA</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html">Config
     *        Custom Rules </a> in the <i>Config developer guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public Source withOwner(Owner owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * For Config Managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code> is a
     * managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of Config
     * Managed Rules</a>.
     * </p>
     * <p>
     * For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda function,
     * such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * <p>
     * For Config Custom Policy rules, this field will be ignored.
     * </p>
     * 
     * @param sourceIdentifier
     *        For Config Managed rules, a predefined identifier from a list. For example,
     *        <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of
     *        Config Managed Rules</a>.</p>
     *        <p>
     *        For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda
     *        function, such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     *        </p>
     *        <p>
     *        For Config Custom Policy rules, this field will be ignored.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * For Config Managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code> is a
     * managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of Config
     * Managed Rules</a>.
     * </p>
     * <p>
     * For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda function,
     * such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * <p>
     * For Config Custom Policy rules, this field will be ignored.
     * </p>
     * 
     * @return For Config Managed rules, a predefined identifier from a list. For example,
     *         <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of
     *         Config Managed Rules</a>.</p>
     *         <p>
     *         For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda
     *         function, such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     *         </p>
     *         <p>
     *         For Config Custom Policy rules, this field will be ignored.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * For Config Managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code> is a
     * managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of Config
     * Managed Rules</a>.
     * </p>
     * <p>
     * For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda function,
     * such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * <p>
     * For Config Custom Policy rules, this field will be ignored.
     * </p>
     * 
     * @param sourceIdentifier
     *        For Config Managed rules, a predefined identifier from a list. For example,
     *        <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of
     *        Config Managed Rules</a>.</p>
     *        <p>
     *        For Config Custom Lambda rules, the identifier is the Amazon Resource Name (ARN) of the rule's Lambda
     *        function, such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     *        </p>
     *        <p>
     *        For Config Custom Policy rules, this field will be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     * against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the
     * trigger type is periodic.
     * </p>
     * <p>
     * If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger message
     * type are <code>ConfigurationItemChangeNotification</code> and
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @return Provides the source and the message types that cause Config to evaluate your Amazon Web Services
     *         resources against a rule. It also provides the frequency with which you want Config to run evaluations
     *         for the rule if the trigger type is periodic.</p>
     *         <p>
     *         If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger
     *         message type are <code>ConfigurationItemChangeNotification</code> and
     *         <code>OversizedConfigurationItemChangeNotification</code>.
     */

    public java.util.List<SourceDetail> getSourceDetails() {
        if (sourceDetails == null) {
            sourceDetails = new com.amazonaws.internal.SdkInternalList<SourceDetail>();
        }
        return sourceDetails;
    }

    /**
     * <p>
     * Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     * against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the
     * trigger type is periodic.
     * </p>
     * <p>
     * If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger message
     * type are <code>ConfigurationItemChangeNotification</code> and
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @param sourceDetails
     *        Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     *        against a rule. It also provides the frequency with which you want Config to run evaluations for the rule
     *        if the trigger type is periodic.</p>
     *        <p>
     *        If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger
     *        message type are <code>ConfigurationItemChangeNotification</code> and
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     */

    public void setSourceDetails(java.util.Collection<SourceDetail> sourceDetails) {
        if (sourceDetails == null) {
            this.sourceDetails = null;
            return;
        }

        this.sourceDetails = new com.amazonaws.internal.SdkInternalList<SourceDetail>(sourceDetails);
    }

    /**
     * <p>
     * Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     * against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the
     * trigger type is periodic.
     * </p>
     * <p>
     * If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger message
     * type are <code>ConfigurationItemChangeNotification</code> and
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDetails(java.util.Collection)} or {@link #withSourceDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceDetails
     *        Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     *        against a rule. It also provides the frequency with which you want Config to run evaluations for the rule
     *        if the trigger type is periodic.</p>
     *        <p>
     *        If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger
     *        message type are <code>ConfigurationItemChangeNotification</code> and
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceDetails(SourceDetail... sourceDetails) {
        if (this.sourceDetails == null) {
            setSourceDetails(new com.amazonaws.internal.SdkInternalList<SourceDetail>(sourceDetails.length));
        }
        for (SourceDetail ele : sourceDetails) {
            this.sourceDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     * against a rule. It also provides the frequency with which you want Config to run evaluations for the rule if the
     * trigger type is periodic.
     * </p>
     * <p>
     * If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger message
     * type are <code>ConfigurationItemChangeNotification</code> and
     * <code>OversizedConfigurationItemChangeNotification</code>.
     * </p>
     * 
     * @param sourceDetails
     *        Provides the source and the message types that cause Config to evaluate your Amazon Web Services resources
     *        against a rule. It also provides the frequency with which you want Config to run evaluations for the rule
     *        if the trigger type is periodic.</p>
     *        <p>
     *        If the owner is set to <code>CUSTOM_POLICY</code>, the only acceptable values for the Config rule trigger
     *        message type are <code>ConfigurationItemChangeNotification</code> and
     *        <code>OversizedConfigurationItemChangeNotification</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceDetails(java.util.Collection<SourceDetail> sourceDetails) {
        setSourceDetails(sourceDetails);
        return this;
    }

    /**
     * <p>
     * Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set
     * to <code>CUSTOM_POLICY</code>.
     * </p>
     * 
     * @param customPolicyDetails
     *        Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner
     *        is set to <code>CUSTOM_POLICY</code>.
     */

    public void setCustomPolicyDetails(CustomPolicyDetails customPolicyDetails) {
        this.customPolicyDetails = customPolicyDetails;
    }

    /**
     * <p>
     * Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set
     * to <code>CUSTOM_POLICY</code>.
     * </p>
     * 
     * @return Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner
     *         is set to <code>CUSTOM_POLICY</code>.
     */

    public CustomPolicyDetails getCustomPolicyDetails() {
        return this.customPolicyDetails;
    }

    /**
     * <p>
     * Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set
     * to <code>CUSTOM_POLICY</code>.
     * </p>
     * 
     * @param customPolicyDetails
     *        Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner
     *        is set to <code>CUSTOM_POLICY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withCustomPolicyDetails(CustomPolicyDetails customPolicyDetails) {
        setCustomPolicyDetails(customPolicyDetails);
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier()).append(",");
        if (getSourceDetails() != null)
            sb.append("SourceDetails: ").append(getSourceDetails()).append(",");
        if (getCustomPolicyDetails() != null)
            sb.append("CustomPolicyDetails: ").append(getCustomPolicyDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Source == false)
            return false;
        Source other = (Source) obj;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null)
            return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false)
            return false;
        if (other.getCustomPolicyDetails() == null ^ this.getCustomPolicyDetails() == null)
            return false;
        if (other.getCustomPolicyDetails() != null && other.getCustomPolicyDetails().equals(this.getCustomPolicyDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode());
        hashCode = prime * hashCode + ((getCustomPolicyDetails() == null) ? 0 : getCustomPolicyDetails().hashCode());
        return hashCode;
    }

    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
