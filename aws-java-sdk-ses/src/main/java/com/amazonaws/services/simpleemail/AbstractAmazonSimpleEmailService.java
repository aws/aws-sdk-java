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
package com.amazonaws.services.simpleemail;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.*;
import com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters;

/**
 * Abstract implementation of {@code AmazonSimpleEmailService}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSimpleEmailService implements AmazonSimpleEmailService {

    protected AbstractAmazonSimpleEmailService() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CloneReceiptRuleSetResult cloneReceiptRuleSet(CloneReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(CreateConfigurationSetEventDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateConfigurationSetTrackingOptionsResult createConfigurationSetTrackingOptions(CreateConfigurationSetTrackingOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCustomVerificationEmailTemplateResult createCustomVerificationEmailTemplate(CreateCustomVerificationEmailTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReceiptFilterResult createReceiptFilter(CreateReceiptFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReceiptRuleSetResult createReceiptRuleSet(CreateReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTemplateResult createTemplate(CreateTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(DeleteConfigurationSetEventDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConfigurationSetTrackingOptionsResult deleteConfigurationSetTrackingOptions(DeleteConfigurationSetTrackingOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCustomVerificationEmailTemplateResult deleteCustomVerificationEmailTemplate(DeleteCustomVerificationEmailTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteIdentityResult deleteIdentity(DeleteIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteIdentityPolicyResult deleteIdentityPolicy(DeleteIdentityPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReceiptFilterResult deleteReceiptFilter(DeleteReceiptFilterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReceiptRuleResult deleteReceiptRule(DeleteReceiptRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReceiptRuleSetResult deleteReceiptRuleSet(DeleteReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTemplateResult deleteTemplate(DeleteTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteVerifiedEmailAddressResult deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(DescribeActiveReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationSetResult describeConfigurationSet(DescribeConfigurationSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReceiptRuleResult describeReceiptRule(DescribeReceiptRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountSendingEnabledResult getAccountSendingEnabled(GetAccountSendingEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplate(GetCustomVerificationEmailTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIdentityDkimAttributesResult getIdentityDkimAttributes(GetIdentityDkimAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIdentityMailFromDomainAttributesResult getIdentityMailFromDomainAttributes(GetIdentityMailFromDomainAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(GetIdentityNotificationAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIdentityPoliciesResult getIdentityPolicies(GetIdentityPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSendQuotaResult getSendQuota(GetSendQuotaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSendQuotaResult getSendQuota() {
        return getSendQuota(new GetSendQuotaRequest());
    }

    @Override
    public GetSendStatisticsResult getSendStatistics(GetSendStatisticsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSendStatisticsResult getSendStatistics() {
        return getSendStatistics(new GetSendStatisticsRequest());
    }

    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCustomVerificationEmailTemplatesResult listCustomVerificationEmailTemplates(ListCustomVerificationEmailTemplatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIdentitiesResult listIdentities() {
        return listIdentities(new ListIdentitiesRequest());
    }

    @Override
    public ListIdentityPoliciesResult listIdentityPolicies(ListIdentityPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListReceiptFiltersResult listReceiptFilters(ListReceiptFiltersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListReceiptRuleSetsResult listReceiptRuleSets(ListReceiptRuleSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses() {
        return listVerifiedEmailAddresses(new ListVerifiedEmailAddressesRequest());
    }

    @Override
    public PutIdentityPolicyResult putIdentityPolicy(PutIdentityPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReorderReceiptRuleSetResult reorderReceiptRuleSet(ReorderReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendBounceResult sendBounce(SendBounceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendBulkTemplatedEmailResult sendBulkTemplatedEmail(SendBulkTemplatedEmailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendCustomVerificationEmailResult sendCustomVerificationEmail(SendCustomVerificationEmailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendEmailResult sendEmail(SendEmailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendRawEmailResult sendRawEmail(SendRawEmailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendTemplatedEmailResult sendTemplatedEmail(SendTemplatedEmailRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(SetActiveReceiptRuleSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetIdentityDkimEnabledResult setIdentityDkimEnabled(SetIdentityDkimEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(SetIdentityFeedbackForwardingEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetIdentityHeadersInNotificationsEnabledResult setIdentityHeadersInNotificationsEnabled(SetIdentityHeadersInNotificationsEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetIdentityMailFromDomainResult setIdentityMailFromDomain(SetIdentityMailFromDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetIdentityNotificationTopicResult setIdentityNotificationTopic(SetIdentityNotificationTopicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SetReceiptRulePositionResult setReceiptRulePosition(SetReceiptRulePositionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestRenderTemplateResult testRenderTemplate(TestRenderTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAccountSendingEnabledResult updateAccountSendingEnabled(UpdateAccountSendingEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(UpdateConfigurationSetEventDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateConfigurationSetReputationMetricsEnabledResult updateConfigurationSetReputationMetricsEnabled(
            UpdateConfigurationSetReputationMetricsEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateConfigurationSetTrackingOptionsResult updateConfigurationSetTrackingOptions(UpdateConfigurationSetTrackingOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateCustomVerificationEmailTemplateResult updateCustomVerificationEmailTemplate(UpdateCustomVerificationEmailTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateTemplateResult updateTemplate(UpdateTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public VerifyDomainDkimResult verifyDomainDkim(VerifyDomainDkimRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public VerifyDomainIdentityResult verifyDomainIdentity(VerifyDomainIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public VerifyEmailAddressResult verifyEmailAddress(VerifyEmailAddressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public VerifyEmailIdentityResult verifyEmailIdentity(VerifyEmailIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonSimpleEmailServiceWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
