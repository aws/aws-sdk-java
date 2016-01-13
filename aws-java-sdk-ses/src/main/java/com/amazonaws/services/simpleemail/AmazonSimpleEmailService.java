/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing Amazon SES.
 * <p>
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This
 * documentation is intended to be used in conjunction with the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <note>For a list of Amazon SES endpoints to use in service requests, see <a
 * href
 * ="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions
 * and Amazon SES</a> in the Amazon SES Developer Guide. </note>
 */
public interface AmazonSimpleEmailService {

    /**
     * Overrides the default endpoint for this client
     * ("https://email.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "email.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://email.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "email.us-east-1.amazonaws.com") or a full URL,
     *        including the protocol (ex:
     *        "https://email.us-east-1.amazonaws.com") of the region specific
     *        AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonSimpleEmailService#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest
     * @return Result of the CloneReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CloneReceiptRuleSet
     */
    CloneReceiptRuleSetResult cloneReceiptRuleSet(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest);

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptFilterRequest
     * @return Result of the CreateReceiptFilter operation returned by the
     *         service.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @sample AmazonSimpleEmailService.CreateReceiptFilter
     */
    CreateReceiptFilterResult createReceiptFilter(
            CreateReceiptFilterRequest createReceiptFilterRequest);

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleRequest
     * @return Result of the CreateReceiptRule operation returned by the
     *         service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that
     *         Amazon SES could not publish to the topic, possibly due to
     *         permissions issues. For information about giving permissions, see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS
     *         encryption key is invalid, or that Amazon SES could not publish
     *         to the bucket, possibly due to permissions issues. For
     *         information about giving permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or
     *         that Amazon SES could not execute the provided function, possibly
     *         due to permissions issues. For information about giving
     *         permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRule
     */
    CreateReceiptRuleResult createReceiptRule(
            CreateReceiptRuleRequest createReceiptRuleRequest);

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest
     * @return Result of the CreateReceiptRuleSet operation returned by the
     *         service.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRuleSet
     */
    CreateReceiptRuleSetResult createReceiptRuleSet(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest);

    /**
     * <p>
     * Deletes the specified identity (email address or domain) from the list of
     * verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityRequest
     *        Represents a request instructing the service to delete an identity
     *        from the list of identities for the AWS Account.
     * @return Result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteIdentity
     */
    DeleteIdentityResult deleteIdentity(
            DeleteIdentityRequest deleteIdentityRequest);

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (email address or domain). This API returns successfully even if a policy
     * with the specified name does not exist.
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest
     *        Represents a request instructing the service to delete an
     *        authorization policy applying to an identity.</p>
     *        <p>
     *        This request succeeds regardless of whether the specified policy
     *        exists.
     * @return Result of the DeleteIdentityPolicy operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.DeleteIdentityPolicy
     */
    DeleteIdentityPolicyResult deleteIdentityPolicy(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest);

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest
     * @return Result of the DeleteReceiptFilter operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.DeleteReceiptFilter
     */
    DeleteReceiptFilterResult deleteReceiptFilter(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest);

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest
     * @return Result of the DeleteReceiptRule operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DeleteReceiptRule
     */
    DeleteReceiptRuleResult deleteReceiptRule(
            DeleteReceiptRuleRequest deleteReceiptRuleRequest);

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it
     * contains.
     * </p>
     * <note>The currently active rule set cannot be deleted.</note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest
     * @return Result of the DeleteReceiptRuleSet operation returned by the
     *         service.
     * @throws CannotDeleteException
     *         Indicates that the delete operation could not be completed.
     * @sample AmazonSimpleEmailService.DeleteReceiptRuleSet
     */
    DeleteReceiptRuleSetResult deleteReceiptRuleSet(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest);

    /**
     * <p>
     * Deletes the specified email address from the list of verified addresses.
     * </p>
     * <important>The DeleteVerifiedEmailAddress action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The DeleteIdentity action is
     * now preferred.</important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request instructing the service to delete an address
     *        from the list of verified email addresses.
     * @sample AmazonSimpleEmailService.DeleteVerifiedEmailAddress
     */
    void deleteVerifiedEmailAddress(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest);

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest
     * @return Result of the DescribeActiveReceiptRuleSet operation returned by
     *         the service.
     * @sample AmazonSimpleEmailService.DescribeActiveReceiptRuleSet
     */
    DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest);

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest
     * @return Result of the DescribeReceiptRule operation returned by the
     *         service.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRule
     */
    DescribeReceiptRuleResult describeReceiptRule(
            DescribeReceiptRuleRequest describeReceiptRuleRequest);

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest
     * @return Result of the DescribeReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRuleSet
     */
    DescribeReceiptRuleSetResult describeReceiptRuleSet(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest);

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain
     * name identities, this action also returns the DKIM tokens that are
     * required for Easy DKIM signing, and whether Amazon SES has successfully
     * verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the following
     * information for each:
     * </p>
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>A set of DKIM tokens that represent the identity. If the identity is
     * an email address, the tokens represent the domain of that address.</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain's DNS. This information is only returned for
     * domain name identities, not for email addresses.</li>
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get DKIM
     * attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest
     *        Given a list of verified identities, describes their DKIM
     *        attributes. The DKIM attributes of an email address identity
     *        includes whether DKIM signing is individually enabled or disabled
     *        for that address. The DKIM attributes of a domain name identity
     *        includes whether DKIM signing is enabled, as well as the DNS
     *        records (tokens) that must remain published in the domain name's
     *        DNS.
     * @return Result of the GetIdentityDkimAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.GetIdentityDkimAttributes
     */
    GetIdentityDkimAttributesResult getIdentityDkimAttributes(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest);

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest
     * @return Result of the GetIdentityNotificationAttributes operation
     *         returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityNotificationAttributes
     */
    GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest);

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (email address or domain). The policies are returned as a map of
     * policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest
     *        Represents a request instructing the service to retrieve the text
     *        of a list of authorization policies applying to an identity.
     * @return Result of the GetIdentityPolicies operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.GetIdentityPolicies
     */
    GetIdentityPoliciesResult getIdentityPolicies(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest);

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the
     * verification status and (for domain identities) the verification token
     * for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest
     *        Represents a request instructing the service to provide the
     *        verification attributes for a list of identities.
     * @return Result of the GetIdentityVerificationAttributes operation
     *         returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityVerificationAttributes
     */
    GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest);

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return Result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailService.GetSendQuota
     */
    GetSendQuotaResult getSendQuota(GetSendQuotaRequest getSendQuotaRequest);

    /**
     * Simplified method form for invoking the GetSendQuota operation.
     *
     * @see #getSendQuota(GetSendQuotaRequest)
     */
    GetSendQuotaResult getSendQuota();

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return Result of the GetSendStatistics operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.GetSendStatistics
     */
    GetSendStatisticsResult getSendStatistics(
            GetSendStatisticsRequest getSendStatisticsRequest);

    /**
     * Simplified method form for invoking the GetSendStatistics operation.
     *
     * @see #getSendStatistics(GetSendStatisticsRequest)
     */
    GetSendStatisticsResult getSendStatistics();

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Represents a request instructing the service to list all
     *        identities for the AWS Account.
     * @return Result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailService.ListIdentities
     */
    ListIdentitiesResult listIdentities(
            ListIdentitiesRequest listIdentitiesRequest);

    /**
     * Simplified method form for invoking the ListIdentities operation.
     *
     * @see #listIdentities(ListIdentitiesRequest)
     */
    ListIdentitiesResult listIdentities();

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (email address or domain). This API returns only a list.
     * If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest
     *        Represents a request instructing the service to list all
     *        authorization policies, by name, applying to an identity.
     * @return Result of the ListIdentityPolicies operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.ListIdentityPolicies
     */
    ListIdentityPoliciesResult listIdentityPolicies(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest);

    /**
     * <p>
     * Lists the IP address filters associated with your account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest
     * @return Result of the ListReceiptFilters operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.ListReceiptFilters
     */
    ListReceiptFiltersResult listReceiptFilters(
            ListReceiptFiltersRequest listReceiptFiltersRequest);

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If there
     * are additional receipt rule sets to be retrieved, you will receive a
     * <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest
     * @return Result of the ListReceiptRuleSets operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.ListReceiptRuleSets
     */
    ListReceiptRuleSetsResult listReceiptRuleSets(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest);

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <important>The ListVerifiedEmailAddresses action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The ListIdentities action is
     * now preferred.</important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return Result of the ListVerifiedEmailAddresses operation returned by
     *         the service.
     * @sample AmazonSimpleEmailService.ListVerifiedEmailAddresses
     */
    ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest);

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses
     * operation.
     *
     * @see #listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest)
     */
    ListVerifiedEmailAddressesResult listVerifiedEmailAddresses();

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (email address or domain).
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest
     *        Represents a request instructing the service to apply an
     *        authorization policy to an identity.
     * @return Result of the PutIdentityPolicy operation returned by the
     *         service.
     * @throws InvalidPolicyException
     *         Indicates that the provided policy is invalid. Check the error
     *         stack for more information about what caused the error.
     * @sample AmazonSimpleEmailService.PutIdentityPolicy
     */
    PutIdentityPolicyResult putIdentityPolicy(
            PutIdentityPolicyRequest putIdentityPolicyRequest);

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>All of the rules in the rule set must be represented in this
     * request. That is, this API will return an error if the reorder request
     * doesn’t explicitly position all of the rules.</note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest
     * @return Result of the ReorderReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.ReorderReceiptRuleSet
     */
    ReorderReceiptRuleSetResult reorderReceiptRuleSet(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest);

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up to
     * 24 hours after you receive it.
     * </p>
     * <note>You cannot use this API to send generic bounces for mail that was
     * not received by Amazon SES.</note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param sendBounceRequest
     *        Request object for sending a simple/complex bounce. It contains
     *        all of the information needed to generate a basic DSN or a
     *        fully-customized DSN.
     * @return Result of the SendBounce operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be
     *         sent. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.SendBounce
     */
    SendBounceResult sendBounce(SendBounceRequest sendBounceRequest);

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about <code>SendEmail</code>:
     * </p>
     * <ul>
     * <li>You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per message.
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.</li>
     * <li>For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your sending quota - the maximum number
     * of emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.</li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        Represents a request instructing the service to send a single
     *        email message.</p>
     *        <p>
     *        This datatype can be used in application code to compose a message
     *        consisting of source, destination, message, reply-to, and
     *        return-path parts. This object can then be sent using the
     *        <code>SendEmail</code> action.
     * @return Result of the SendEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be
     *         sent. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.SendEmail
     */
    SendEmailResult sendEmail(SendEmailRequest sendEmailRequest);

    /**
     * <p>
     * Sends an email message, with header and content specified by the client.
     * The <code>SendRawEmail</code> action is useful for sending multipart MIME
     * emails. The raw text of the message must comply with Internet email
     * standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code>:
     * </p>
     * <ul>
     * <li>You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per message.
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.</li>
     * <li>The To:, CC:, and BCC: headers in the raw message can contain a group
     * list. Note that each recipient in a group list counts towards the
     * 50-recipient limit.</li>
     * <li>For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your sending quota - the maximum number
     * of emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>If you are using sending authorization to send on behalf of another
     * user, <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's "Source," "From," and "Return-Path" parameters
     * in one of two ways: you can pass optional parameters
     * <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following
     * X-headers in the header of your raw email:
     * <ul>
     * <li><code>X-SES-SOURCE-ARN</code></li>
     * <li><code>X-SES-FROM-ARN</code></li>
     * <li><code>X-SES-RETURN-PATH-ARN</code></li>
     * </ul>
     * <important>Do not include these X-headers in the DKIM signature, because
     * they are removed by Amazon SES before sending the email.</important> For
     * the most common sending authorization use case, we recommend that you
     * specify the <code>SourceIdentityArn</code> and do not specify either the
     * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>. (The
     * same note applies to the corresponding X-headers.) If you only specify
     * the <code>SourceIdentityArn</code>, Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code>. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.</li>
     * </ul>
     * 
     * @param sendRawEmailRequest
     *        Represents a request instructing the service to send a raw email
     *        message.</p>
     *        <p>
     *        This datatype can be used in application code to compose a message
     *        consisting of source, destination, and raw message text. This
     *        object can then be sent using the <code>SendRawEmail</code>
     *        action.
     * @return Result of the SendRawEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be
     *         sent. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.SendRawEmail
     */
    SendRawEmailResult sendRawEmail(SendRawEmailRequest sendRawEmailRequest);

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>To disable your email-receiving through Amazon SES completely, you
     * can call this API with RuleSetName set to null.</note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest
     * @return Result of the SetActiveReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.SetActiveReceiptRuleSet
     */
    SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest);

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code>), then Amazon SES will DKIM-sign all email sent
     * by addresses under that domain name (e.g., <code>user@example.com</code>
     * ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon SES
     * will DKIM-sign all email sent by that email address.</li>
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code>), you can only
     * enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code>) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest
     *        Represents a request instructing the service to enable or disable
     *        DKIM signing for an identity.
     * @return Result of the SetIdentityDkimEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.SetIdentityDkimEnabled
     */
    SetIdentityDkimEnabledResult setIdentityDkimEnabled(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest);

    /**
     * <p>
     * Given an identity (email address or domain), enables or disables whether
     * Amazon SES forwards bounce and complaint notifications as email. Feedback
     * forwarding can only be disabled when Amazon Simple Notification Service
     * (Amazon SNS) topics are specified for both bounces and complaints.
     * </p>
     * <note>Feedback forwarding does not apply to delivery notifications.
     * Delivery notifications are only available through Amazon SNS.</note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest
     * @return Result of the SetIdentityFeedbackForwardingEnabled operation
     *         returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityFeedbackForwardingEnabled
     */
    SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest);

    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will publish
     * bounce, complaint, and/or delivery notifications for emails sent with
     * that identity as the <code>Source</code>.
     * </p>
     * <note>Unless feedback forwarding is enabled, you must specify Amazon SNS
     * topics for bounce and complaint notifications. For more information, see
     * <code>SetIdentityFeedbackForwardingEnabled</code>. </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest
     *        Represents a request to set or clear an identity's notification
     *        topic.
     * @return Result of the SetIdentityNotificationTopic operation returned by
     *         the service.
     * @sample AmazonSimpleEmailService.SetIdentityNotificationTopic
     */
    SetIdentityNotificationTopicResult setIdentityNotificationTopic(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest);

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest
     * @return Result of the SetReceiptRulePosition operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.SetReceiptRulePosition
     */
    SetReceiptRulePositionResult setReceiptRulePosition(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest);

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest
     * @return Result of the UpdateReceiptRule operation returned by the
     *         service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that
     *         Amazon SES could not publish to the topic, possibly due to
     *         permissions issues. For information about giving permissions, see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS
     *         encryption key is invalid, or that Amazon SES could not publish
     *         to the bucket, possibly due to permissions issues. For
     *         information about giving permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or
     *         that Amazon SES could not execute the provided function, possibly
     *         due to permissions issues. For information about giving
     *         permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.UpdateReceiptRule
     */
    UpdateReceiptRuleResult updateReceiptRule(
            UpdateReceiptRuleRequest updateReceiptRuleRequest);

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process may
     * take up to 72 hours. Upon successful detection, Amazon SES will be able
     * to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest
     *        Represents a request instructing the service to begin DKIM
     *        verification for a domain.
     * @return Result of the VerifyDomainDkim operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyDomainDkim
     */
    VerifyDomainDkimResult verifyDomainDkim(
            VerifyDomainDkimRequest verifyDomainDkimRequest);

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest
     *        Represents a request instructing the service to begin domain
     *        verification.
     * @return Result of the VerifyDomainIdentity operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.VerifyDomainIdentity
     */
    VerifyDomainIdentityResult verifyDomainIdentity(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest);

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <important>The VerifyEmailAddress action is deprecated as of the May 15,
     * 2012 release of Domain Verification. The VerifyEmailIdentity action is
     * now preferred.</important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailAddressRequest
     *        Represents a request instructing the service to begin email
     *        address verification.
     * @sample AmazonSimpleEmailService.VerifyEmailAddress
     */
    void verifyEmailAddress(VerifyEmailAddressRequest verifyEmailAddressRequest);

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest
     *        Represents a request instructing the service to begin email
     *        address verification.
     * @return Result of the VerifyEmailIdentity operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.VerifyEmailIdentity
     */
    VerifyEmailIdentityResult verifyEmailIdentity(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
