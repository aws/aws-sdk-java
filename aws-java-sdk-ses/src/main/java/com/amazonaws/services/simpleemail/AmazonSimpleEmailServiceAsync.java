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

import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing Amazon SES asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public interface AmazonSimpleEmailServiceAsync extends AmazonSimpleEmailService {

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
     * @return A Java Future containing the result of the CloneReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CloneReceiptRuleSet
     */
    java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloneReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CloneReceiptRuleSet
     */
    java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateReceiptFilter
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptFilter
     */
    java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            CreateReceiptFilterRequest createReceiptFilterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReceiptFilter
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateReceiptFilter
     */
    java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            CreateReceiptFilterRequest createReceiptFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptRule
     */
    java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            CreateReceiptRuleRequest createReceiptRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateReceiptRule
     */
    java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            CreateReceiptRuleRequest createReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptRuleSet
     */
    java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateReceiptRuleSet
     */
    java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteIdentity
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteIdentity
     */
    java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(
            DeleteIdentityRequest deleteIdentityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentity
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteIdentity
     */
    java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(
            DeleteIdentityRequest deleteIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteIdentityPolicy
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteIdentityPolicy
     */
    java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentityPolicy
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteIdentityPolicy
     */
    java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteReceiptFilter
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptFilter
     */
    java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReceiptFilter
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteReceiptFilter
     */
    java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptRule
     */
    java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            DeleteReceiptRuleRequest deleteReceiptRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteReceiptRule
     */
    java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            DeleteReceiptRuleRequest deleteReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptRuleSet
     */
    java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteReceiptRuleSet
     */
    java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler);

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
     * @sample AmazonSimpleEmailServiceAsync.DeleteVerifiedEmailAddress
     */
    java.util.concurrent.Future<Void> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteVerifiedEmailAddress
     */
    java.util.concurrent.Future<Void> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVerifiedEmailAddressRequest, Void> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         DescribeActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeActiveReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeActiveReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeReceiptRule
     */
    java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            DescribeReceiptRuleRequest describeReceiptRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeReceiptRule
     */
    java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            DescribeReceiptRuleRequest describeReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         GetIdentityDkimAttributes operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityDkimAttributes
     */
    java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetIdentityDkimAttributes operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityDkimAttributes
     */
    java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         GetIdentityNotificationAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityNotificationAttributes
     */
    java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetIdentityNotificationAttributes operation returned by the
     *         service.
     * @sample 
     *         AmazonSimpleEmailServiceAsyncHandler.GetIdentityNotificationAttributes
     */
    java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetIdentityPolicies
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityPolicies
     */
    java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityPolicies
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityPolicies
     */
    java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         GetIdentityVerificationAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityVerificationAttributes
     */
    java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetIdentityVerificationAttributes operation returned by the
     *         service.
     * @sample 
     *         AmazonSimpleEmailServiceAsyncHandler.GetIdentityVerificationAttributes
     */
    java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return A Java Future containing the result of the GetSendQuota operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetSendQuota
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            GetSendQuotaRequest getSendQuotaRequest);

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSendQuota operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetSendQuota
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            GetSendQuotaRequest getSendQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetSendQuota operation.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest)
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync();

    /**
     * Simplified method form for invoking the GetSendQuota operation with an
     * AsyncHandler.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSendStatistics
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetSendStatistics
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            GetSendStatisticsRequest getSendStatisticsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSendStatistics
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetSendStatistics
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            GetSendStatisticsRequest getSendStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetSendStatistics operation.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest)
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync();

    /**
     * Simplified method form for invoking the GetSendStatistics operation with
     * an AsyncHandler.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListIdentities
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListIdentities
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            ListIdentitiesRequest listIdentitiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentities
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListIdentities
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            ListIdentitiesRequest listIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListIdentities operation.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest)
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync();

    /**
     * Simplified method form for invoking the ListIdentities operation with an
     * AsyncHandler.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListIdentityPolicies
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListIdentityPolicies
     */
    java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityPolicies
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListIdentityPolicies
     */
    java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListReceiptFilters
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListReceiptFilters
     */
    java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            ListReceiptFiltersRequest listReceiptFiltersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReceiptFilters
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListReceiptFilters
     */
    java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            ListReceiptFiltersRequest listReceiptFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListReceiptRuleSets
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListReceiptRuleSets
     */
    java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReceiptRuleSets
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListReceiptRuleSets
     */
    java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListVerifiedEmailAddresses
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListVerifiedEmailAddresses
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses
     * operation.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest)
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync();

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses
     * operation with an AsyncHandler.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutIdentityPolicy
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.PutIdentityPolicy
     */
    java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            PutIdentityPolicyRequest putIdentityPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIdentityPolicy
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.PutIdentityPolicy
     */
    java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            PutIdentityPolicyRequest putIdentityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the ReorderReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ReorderReceiptRuleSet
     */
    java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReorderReceiptRuleSet
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ReorderReceiptRuleSet
     */
    java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the SendBounce operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendBounce
     */
    java.util.concurrent.Future<SendBounceResult> sendBounceAsync(
            SendBounceRequest sendBounceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendBounce operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendBounce
     */
    java.util.concurrent.Future<SendBounceResult> sendBounceAsync(
            SendBounceRequest sendBounceRequest,
            com.amazonaws.handlers.AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler);

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
     * @return A Java Future containing the result of the SendEmail operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendEmail
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(
            SendEmailRequest sendEmailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendEmail operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendEmail
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(
            SendEmailRequest sendEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler);

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
     * @return A Java Future containing the result of the SendRawEmail operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendRawEmail
     */
    java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(
            SendRawEmailRequest sendRawEmailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendRawEmail operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendRawEmail
     */
    java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(
            SendRawEmailRequest sendRawEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         SetActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetActiveReceiptRuleSet
     */
    java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         SetActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetActiveReceiptRuleSet
     */
    java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetIdentityDkimEnabled
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityDkimEnabled
     */
    java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityDkimEnabled
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetIdentityDkimEnabled
     */
    java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         SetIdentityFeedbackForwardingEnabled operation returned by the
     *         service.
     * @sample 
     *         AmazonSimpleEmailServiceAsync.SetIdentityFeedbackForwardingEnabled
     */
    java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         SetIdentityFeedbackForwardingEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.
     *         SetIdentityFeedbackForwardingEnabled
     */
    java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         SetIdentityNotificationTopic operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityNotificationTopic
     */
    java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         SetIdentityNotificationTopic operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetIdentityNotificationTopic
     */
    java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetReceiptRulePosition
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetReceiptRulePosition
     */
    java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetReceiptRulePosition
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetReceiptRulePosition
     */
    java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest,
            com.amazonaws.handlers.AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateReceiptRule
     */
    java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            UpdateReceiptRuleRequest updateReceiptRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReceiptRule
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateReceiptRule
     */
    java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            UpdateReceiptRuleRequest updateReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the VerifyDomainDkim
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyDomainDkim
     */
    java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            VerifyDomainDkimRequest verifyDomainDkimRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyDomainDkim
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyDomainDkim
     */
    java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            VerifyDomainDkimRequest verifyDomainDkimRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler);

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
     * @return A Java Future containing the result of the VerifyDomainIdentity
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyDomainIdentity
     */
    java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyDomainIdentity
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyDomainIdentity
     */
    java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler);

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
     * @sample AmazonSimpleEmailServiceAsync.VerifyEmailAddress
     */
    java.util.concurrent.Future<Void> verifyEmailAddressAsync(
            VerifyEmailAddressRequest verifyEmailAddressRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyEmailAddress
     */
    java.util.concurrent.Future<Void> verifyEmailAddressAsync(
            VerifyEmailAddressRequest verifyEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailAddressRequest, Void> asyncHandler);

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
     * @return A Java Future containing the result of the VerifyEmailIdentity
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyEmailIdentity
     */
    java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyEmailIdentity
     *         operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyEmailIdentity
     */
    java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler);

}
