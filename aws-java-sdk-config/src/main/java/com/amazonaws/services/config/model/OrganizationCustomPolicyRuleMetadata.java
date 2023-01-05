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
 * An object that specifies metadata for your organization's Config Custom Policy rule. The metadata includes the
 * runtime system in use, which accounts have debug logging enabled, and other custom rule metadata, such as resource
 * type, resource ID of Amazon Web Services resource, and organization trigger types that initiate Config to evaluate
 * Amazon Web Services resources against a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationCustomPolicyRuleMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationCustomPolicyRuleMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description that you provide for your organization Config Custom Policy rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy rules,
     * Config supports change-initiated notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a configuration
     * item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers an
     * oversized configuration item. Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> organizationConfigRuleTriggerTypes;
    /**
     * <p>
     * A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     * </p>
     */
    private String inputParameters;
    /**
     * <p>
     * The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is triggered
     * when Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     */
    private String maximumExecutionFrequency;
    /**
     * <p>
     * The type of the Amazon Web Services resource that was evaluated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypesScope;
    /**
     * <p>
     * The ID of the Amazon Web Services resource that was evaluated.
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
     * The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language that
     * allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard,
     * see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     */
    private String policyRuntime;
    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     */
    private String policyText;
    /**
     * <p>
     * A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List is
     * null when debug logging is enabled for all accounts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> debugLogDeliveryAccounts;

    /**
     * <p>
     * The description that you provide for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param description
     *        The description that you provide for your organization Config Custom Policy rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you provide for your organization Config Custom Policy rule.
     * </p>
     * 
     * @return The description that you provide for your organization Config Custom Policy rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description that you provide for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param description
     *        The description that you provide for your organization Config Custom Policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy rules,
     * Config supports change-initiated notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a configuration
     * item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers an
     * oversized configuration item. Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy
     *         rules, Config supports change-initiated notification types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a
     *         configuration item as a result of a resource change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers
     *         an oversized configuration item. Config may generate this notification type when a resource changes and
     *         the notification exceeds the maximum size allowed by Amazon SNS.
     *         </p>
     *         </li>
     * @see OrganizationConfigRuleTriggerTypeNoSN
     */

    public java.util.List<String> getOrganizationConfigRuleTriggerTypes() {
        if (organizationConfigRuleTriggerTypes == null) {
            organizationConfigRuleTriggerTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return organizationConfigRuleTriggerTypes;
    }

    /**
     * <p>
     * The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy rules,
     * Config supports change-initiated notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a configuration
     * item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers an
     * oversized configuration item. Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationConfigRuleTriggerTypes
     *        The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy
     *        rules, Config supports change-initiated notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers
     *        an oversized configuration item. Config may generate this notification type when a resource changes and
     *        the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     * @see OrganizationConfigRuleTriggerTypeNoSN
     */

    public void setOrganizationConfigRuleTriggerTypes(java.util.Collection<String> organizationConfigRuleTriggerTypes) {
        if (organizationConfigRuleTriggerTypes == null) {
            this.organizationConfigRuleTriggerTypes = null;
            return;
        }

        this.organizationConfigRuleTriggerTypes = new com.amazonaws.internal.SdkInternalList<String>(organizationConfigRuleTriggerTypes);
    }

    /**
     * <p>
     * The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy rules,
     * Config supports change-initiated notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a configuration
     * item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers an
     * oversized configuration item. Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConfigRuleTriggerTypes(java.util.Collection)} or
     * {@link #withOrganizationConfigRuleTriggerTypes(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param organizationConfigRuleTriggerTypes
     *        The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy
     *        rules, Config supports change-initiated notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers
     *        an oversized configuration item. Config may generate this notification type when a resource changes and
     *        the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigRuleTriggerTypeNoSN
     */

    public OrganizationCustomPolicyRuleMetadata withOrganizationConfigRuleTriggerTypes(String... organizationConfigRuleTriggerTypes) {
        if (this.organizationConfigRuleTriggerTypes == null) {
            setOrganizationConfigRuleTriggerTypes(new com.amazonaws.internal.SdkInternalList<String>(organizationConfigRuleTriggerTypes.length));
        }
        for (String ele : organizationConfigRuleTriggerTypes) {
            this.organizationConfigRuleTriggerTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy rules,
     * Config supports change-initiated notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a configuration
     * item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers an
     * oversized configuration item. Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationConfigRuleTriggerTypes
     *        The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy
     *        rules, Config supports change-initiated notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers
     *        an oversized configuration item. Config may generate this notification type when a resource changes and
     *        the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigRuleTriggerTypeNoSN
     */

    public OrganizationCustomPolicyRuleMetadata withOrganizationConfigRuleTriggerTypes(java.util.Collection<String> organizationConfigRuleTriggerTypes) {
        setOrganizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes);
        return this;
    }

    /**
     * <p>
     * The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy rules,
     * Config supports change-initiated notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a configuration
     * item as a result of a resource change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers an
     * oversized configuration item. Config may generate this notification type when a resource changes and the
     * notification exceeds the maximum size allowed by Amazon SNS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationConfigRuleTriggerTypes
     *        The type of notification that initiates Config to run an evaluation for a rule. For Config Custom Policy
     *        rules, Config supports change-initiated notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers a
     *        configuration item as a result of a resource change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OversizedConfigurationItemChangeNotification</code> - Initiates an evaluation when Config delivers
     *        an oversized configuration item. Config may generate this notification type when a resource changes and
     *        the notification exceeds the maximum size allowed by Amazon SNS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigRuleTriggerTypeNoSN
     */

    public OrganizationCustomPolicyRuleMetadata withOrganizationConfigRuleTriggerTypes(
            OrganizationConfigRuleTriggerTypeNoSN... organizationConfigRuleTriggerTypes) {
        com.amazonaws.internal.SdkInternalList<String> organizationConfigRuleTriggerTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                organizationConfigRuleTriggerTypes.length);
        for (OrganizationConfigRuleTriggerTypeNoSN value : organizationConfigRuleTriggerTypes) {
            organizationConfigRuleTriggerTypesCopy.add(value.toString());
        }
        if (getOrganizationConfigRuleTriggerTypes() == null) {
            setOrganizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypesCopy);
        } else {
            getOrganizationConfigRuleTriggerTypes().addAll(organizationConfigRuleTriggerTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     * </p>
     * 
     * @param inputParameters
     *        A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     */

    public void setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     * </p>
     * 
     * @return A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     */

    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * <p>
     * A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     * </p>
     * 
     * @param inputParameters
     *        A string, in JSON format, that is passed to your organization Config Custom Policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withInputParameters(String inputParameters) {
        setInputParameters(inputParameters);
        return this;
    }

    /**
     * <p>
     * The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is triggered
     * when Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is
     *        triggered when Config delivers the configuration snapshot. For more information, see
     *        <a>ConfigSnapshotDeliveryProperties</a>.
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is triggered
     * when Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * 
     * @return The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is
     *         triggered when Config delivers the configuration snapshot. For more information, see
     *         <a>ConfigSnapshotDeliveryProperties</a>.
     * @see MaximumExecutionFrequency
     */

    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    /**
     * <p>
     * The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is triggered
     * when Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is
     *        triggered when Config delivers the configuration snapshot. For more information, see
     *        <a>ConfigSnapshotDeliveryProperties</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public OrganizationCustomPolicyRuleMetadata withMaximumExecutionFrequency(String maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * <p>
     * The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is triggered
     * when Config delivers the configuration snapshot. For more information, see
     * <a>ConfigSnapshotDeliveryProperties</a>.
     * </p>
     * 
     * @param maximumExecutionFrequency
     *        The maximum frequency with which Config runs evaluations for a rule. Your Config Custom Policy rule is
     *        triggered when Config delivers the configuration snapshot. For more information, see
     *        <a>ConfigSnapshotDeliveryProperties</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public OrganizationCustomPolicyRuleMetadata withMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The type of the Amazon Web Services resource that was evaluated.
     * </p>
     * 
     * @return The type of the Amazon Web Services resource that was evaluated.
     */

    public java.util.List<String> getResourceTypesScope() {
        if (resourceTypesScope == null) {
            resourceTypesScope = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypesScope;
    }

    /**
     * <p>
     * The type of the Amazon Web Services resource that was evaluated.
     * </p>
     * 
     * @param resourceTypesScope
     *        The type of the Amazon Web Services resource that was evaluated.
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
     * The type of the Amazon Web Services resource that was evaluated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypesScope(java.util.Collection)} or {@link #withResourceTypesScope(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceTypesScope
     *        The type of the Amazon Web Services resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withResourceTypesScope(String... resourceTypesScope) {
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
     * The type of the Amazon Web Services resource that was evaluated.
     * </p>
     * 
     * @param resourceTypesScope
     *        The type of the Amazon Web Services resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withResourceTypesScope(java.util.Collection<String> resourceTypesScope) {
        setResourceTypesScope(resourceTypesScope);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services resource that was evaluated.
     * </p>
     * 
     * @param resourceIdScope
     *        The ID of the Amazon Web Services resource that was evaluated.
     */

    public void setResourceIdScope(String resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services resource that was evaluated.
     * </p>
     * 
     * @return The ID of the Amazon Web Services resource that was evaluated.
     */

    public String getResourceIdScope() {
        return this.resourceIdScope;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services resource that was evaluated.
     * </p>
     * 
     * @param resourceIdScope
     *        The ID of the Amazon Web Services resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withResourceIdScope(String resourceIdScope) {
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

    public OrganizationCustomPolicyRuleMetadata withTagKeyScope(String tagKeyScope) {
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

    public OrganizationCustomPolicyRuleMetadata withTagValueScope(String tagValueScope) {
        setTagValueScope(tagValueScope);
        return this;
    }

    /**
     * <p>
     * The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language that
     * allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard,
     * see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     * 
     * @param policyRuntime
     *        The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language
     *        that allows you to write policies that are enforced by Config Custom Policy rules. For more information
     *        about Guard, see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub
     *        Repository</a>.
     */

    public void setPolicyRuntime(String policyRuntime) {
        this.policyRuntime = policyRuntime;
    }

    /**
     * <p>
     * The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language that
     * allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard,
     * see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     * 
     * @return The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language
     *         that allows you to write policies that are enforced by Config Custom Policy rules. For more information
     *         about Guard, see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub
     *         Repository</a>.
     */

    public String getPolicyRuntime() {
        return this.policyRuntime;
    }

    /**
     * <p>
     * The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language that
     * allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard,
     * see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>.
     * </p>
     * 
     * @param policyRuntime
     *        The runtime system for your organization Config Custom Policy rules. Guard is a policy-as-code language
     *        that allows you to write policies that are enforced by Config Custom Policy rules. For more information
     *        about Guard, see the <a href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub
     *        Repository</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withPolicyRuntime(String policyRuntime) {
        setPolicyRuntime(policyRuntime);
        return this;
    }

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param policyText
     *        The policy definition containing the logic for your organization Config Custom Policy rule.
     */

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @return The policy definition containing the logic for your organization Config Custom Policy rule.
     */

    public String getPolicyText() {
        return this.policyText;
    }

    /**
     * <p>
     * The policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param policyText
     *        The policy definition containing the logic for your organization Config Custom Policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withPolicyText(String policyText) {
        setPolicyText(policyText);
        return this;
    }

    /**
     * <p>
     * A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List is
     * null when debug logging is enabled for all accounts.
     * </p>
     * 
     * @return A list of accounts that you can enable debug logging for your organization Config Custom Policy rule.
     *         List is null when debug logging is enabled for all accounts.
     */

    public java.util.List<String> getDebugLogDeliveryAccounts() {
        if (debugLogDeliveryAccounts == null) {
            debugLogDeliveryAccounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return debugLogDeliveryAccounts;
    }

    /**
     * <p>
     * A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List is
     * null when debug logging is enabled for all accounts.
     * </p>
     * 
     * @param debugLogDeliveryAccounts
     *        A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List
     *        is null when debug logging is enabled for all accounts.
     */

    public void setDebugLogDeliveryAccounts(java.util.Collection<String> debugLogDeliveryAccounts) {
        if (debugLogDeliveryAccounts == null) {
            this.debugLogDeliveryAccounts = null;
            return;
        }

        this.debugLogDeliveryAccounts = new com.amazonaws.internal.SdkInternalList<String>(debugLogDeliveryAccounts);
    }

    /**
     * <p>
     * A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List is
     * null when debug logging is enabled for all accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDebugLogDeliveryAccounts(java.util.Collection)} or
     * {@link #withDebugLogDeliveryAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param debugLogDeliveryAccounts
     *        A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List
     *        is null when debug logging is enabled for all accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withDebugLogDeliveryAccounts(String... debugLogDeliveryAccounts) {
        if (this.debugLogDeliveryAccounts == null) {
            setDebugLogDeliveryAccounts(new com.amazonaws.internal.SdkInternalList<String>(debugLogDeliveryAccounts.length));
        }
        for (String ele : debugLogDeliveryAccounts) {
            this.debugLogDeliveryAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List is
     * null when debug logging is enabled for all accounts.
     * </p>
     * 
     * @param debugLogDeliveryAccounts
     *        A list of accounts that you can enable debug logging for your organization Config Custom Policy rule. List
     *        is null when debug logging is enabled for all accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomPolicyRuleMetadata withDebugLogDeliveryAccounts(java.util.Collection<String> debugLogDeliveryAccounts) {
        setDebugLogDeliveryAccounts(debugLogDeliveryAccounts);
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
        if (getOrganizationConfigRuleTriggerTypes() != null)
            sb.append("OrganizationConfigRuleTriggerTypes: ").append(getOrganizationConfigRuleTriggerTypes()).append(",");
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
            sb.append("TagValueScope: ").append(getTagValueScope()).append(",");
        if (getPolicyRuntime() != null)
            sb.append("PolicyRuntime: ").append(getPolicyRuntime()).append(",");
        if (getPolicyText() != null)
            sb.append("PolicyText: ").append(getPolicyText()).append(",");
        if (getDebugLogDeliveryAccounts() != null)
            sb.append("DebugLogDeliveryAccounts: ").append(getDebugLogDeliveryAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationCustomPolicyRuleMetadata == false)
            return false;
        OrganizationCustomPolicyRuleMetadata other = (OrganizationCustomPolicyRuleMetadata) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOrganizationConfigRuleTriggerTypes() == null ^ this.getOrganizationConfigRuleTriggerTypes() == null)
            return false;
        if (other.getOrganizationConfigRuleTriggerTypes() != null
                && other.getOrganizationConfigRuleTriggerTypes().equals(this.getOrganizationConfigRuleTriggerTypes()) == false)
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
        if (other.getPolicyRuntime() == null ^ this.getPolicyRuntime() == null)
            return false;
        if (other.getPolicyRuntime() != null && other.getPolicyRuntime().equals(this.getPolicyRuntime()) == false)
            return false;
        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        if (other.getDebugLogDeliveryAccounts() == null ^ this.getDebugLogDeliveryAccounts() == null)
            return false;
        if (other.getDebugLogDeliveryAccounts() != null && other.getDebugLogDeliveryAccounts().equals(this.getDebugLogDeliveryAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConfigRuleTriggerTypes() == null) ? 0 : getOrganizationConfigRuleTriggerTypes().hashCode());
        hashCode = prime * hashCode + ((getInputParameters() == null) ? 0 : getInputParameters().hashCode());
        hashCode = prime * hashCode + ((getMaximumExecutionFrequency() == null) ? 0 : getMaximumExecutionFrequency().hashCode());
        hashCode = prime * hashCode + ((getResourceTypesScope() == null) ? 0 : getResourceTypesScope().hashCode());
        hashCode = prime * hashCode + ((getResourceIdScope() == null) ? 0 : getResourceIdScope().hashCode());
        hashCode = prime * hashCode + ((getTagKeyScope() == null) ? 0 : getTagKeyScope().hashCode());
        hashCode = prime * hashCode + ((getTagValueScope() == null) ? 0 : getTagValueScope().hashCode());
        hashCode = prime * hashCode + ((getPolicyRuntime() == null) ? 0 : getPolicyRuntime().hashCode());
        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        hashCode = prime * hashCode + ((getDebugLogDeliveryAccounts() == null) ? 0 : getDebugLogDeliveryAccounts().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationCustomPolicyRuleMetadata clone() {
        try {
            return (OrganizationCustomPolicyRuleMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationCustomPolicyRuleMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
