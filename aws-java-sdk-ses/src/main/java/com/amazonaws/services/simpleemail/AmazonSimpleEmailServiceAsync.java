/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing Amazon SES asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpleemail.AbstractAmazonSimpleEmailServiceAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This documentation is intended to be used in
 * conjunction with the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions and Amazon SES</a> in the Amazon SES
 * Developer Guide.
 * </p>
 * </note>
 */
public interface AmazonSimpleEmailServiceAsync extends AmazonSimpleEmailService {

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new
     * receipt rule set and are completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest
     *        Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CloneReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CloneReceiptRuleSet
     */
    java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest);

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new
     * receipt rule set and are completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest
     *        Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloneReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CloneReceiptRuleSet
     */
    java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        Represents a request to create a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateConfigurationSet
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest);

    /**
     * <p>
     * Creates a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        Represents a request to create a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateConfigurationSet
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration set event destination.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be either Amazon CloudWatch or Amazon Kinesis Firehose.
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
     * configuration set. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        Represents a request to create a configuration set event destination. A configuration set event
     *        destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in
     *        which Amazon SES publishes the email sending events associated with a configuration set. For information
     *        about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateConfigurationSetEventDestination
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Creates a configuration set event destination.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be either Amazon CloudWatch or Amazon Kinesis Firehose.
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
     * configuration set. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        Represents a request to create a configuration set event destination. A configuration set event
     *        destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in
     *        which Amazon SES publishes the email sending events associated with a configuration set. For information
     *        about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateConfigurationSetEventDestination
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptFilterRequest
     *        Represents a request to create a new IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptFilter
     */
    java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(CreateReceiptFilterRequest createReceiptFilterRequest);

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptFilterRequest
     *        Represents a request to create a new IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateReceiptFilter
     */
    java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(CreateReceiptFilterRequest createReceiptFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler);

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleRequest
     *        Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptRule
     */
    java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(CreateReceiptRuleRequest createReceiptRuleRequest);

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleRequest
     *        Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateReceiptRule
     */
    java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(CreateReceiptRuleRequest createReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler);

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest
     *        Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptRuleSet
     */
    java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(CreateReceiptRuleSetRequest createReceiptRuleSetRequest);

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest
     *        Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateReceiptRuleSet
     */
    java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(CreateReceiptRuleSetRequest createReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        Represents a request to delete a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteConfigurationSet
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * <p>
     * Deletes a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        Represents a request to delete a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteConfigurationSet
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration set event destination.
     * </p>
     * <p>
     * Configuration set event destinations are associated with configuration sets, which enable you to publish email
     * sending events. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        Represents a request to delete a configuration set event destination. Configuration set event destinations
     *        are associated with configuration sets, which enable you to publish email sending events. For information
     *        about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteConfigurationSetEventDestination
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Deletes a configuration set event destination.
     * </p>
     * <p>
     * Configuration set event destinations are associated with configuration sets, which enable you to publish email
     * sending events. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        Represents a request to delete a configuration set event destination. Configuration set event destinations
     *        are associated with configuration sets, which enable you to publish email sending events. For information
     *        about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteConfigurationSetEventDestination
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityRequest
     *        Represents a request to delete one of your Amazon SES identities (an email address or domain).
     * @return A Java Future containing the result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteIdentity
     */
    java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest);

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityRequest
     *        Represents a request to delete one of your Amazon SES identities (an email address or domain).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteIdentity
     */
    java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest
     *        Represents a request to delete a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *        SES Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteIdentityPolicy
     */
    java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest);

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest
     *        Represents a request to delete a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *        SES Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteIdentityPolicy
     */
    java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest
     *        Represents a request to delete an IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptFilter
     */
    java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(DeleteReceiptFilterRequest deleteReceiptFilterRequest);

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest
     *        Represents a request to delete an IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteReceiptFilter
     */
    java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(DeleteReceiptFilterRequest deleteReceiptFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest
     *        Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptRule
     */
    java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(DeleteReceiptRuleRequest deleteReceiptRuleRequest);

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest
     *        Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteReceiptRule
     */
    java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(DeleteReceiptRuleRequest deleteReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest
     *        Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use
     *        receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptRuleSet
     */
    java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest);

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest
     *        Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use
     *        receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteReceiptRuleSet
     */
    java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified email address from the list of verified addresses.
     * </p>
     * <important>
     * <p>
     * The DeleteVerifiedEmailAddress action is deprecated as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request to delete an email address from the list of email addresses you have attempted to
     *        verify under your AWS account.
     * @return A Java Future containing the result of the DeleteVerifiedEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteVerifiedEmailAddress
     */
    java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest);

    /**
     * <p>
     * Deletes the specified email address from the list of verified addresses.
     * </p>
     * <important>
     * <p>
     * The DeleteVerifiedEmailAddress action is deprecated as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request to delete an email address from the list of email addresses you have attempted to
     *        verify under your AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVerifiedEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteVerifiedEmailAddress
     */
    java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVerifiedEmailAddressRequest, DeleteVerifiedEmailAddressResult> asyncHandler);

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest
     *        Represents a request to return the metadata and receipt rules for the receipt rule set that is currently
     *        active. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeActiveReceiptRuleSet operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeActiveReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest);

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest
     *        Represents a request to return the metadata and receipt rules for the receipt rule set that is currently
     *        active. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActiveReceiptRuleSet operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeActiveReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the specified configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeConfigurationSetRequest
     *        Represents a request to return the details of a configuration set. Configuration sets enable you to
     *        publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeConfigurationSet
     */
    java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(DescribeConfigurationSetRequest describeConfigurationSetRequest);

    /**
     * <p>
     * Returns the details of the specified configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeConfigurationSetRequest
     *        Represents a request to return the details of a configuration set. Configuration sets enable you to
     *        publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeConfigurationSet
     */
    java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(DescribeConfigurationSetRequest describeConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSetRequest, DescribeConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest
     *        Represents a request to return the details of a receipt rule. You use receipt rules to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeReceiptRule
     */
    java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(DescribeReceiptRuleRequest describeReceiptRuleRequest);

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest
     *        Represents a request to return the details of a receipt rule. You use receipt rules to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeReceiptRule
     */
    java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(DescribeReceiptRuleRequest describeReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest
     *        Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive
     *        email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest);

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest
     *        Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive
     *        email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DescribeReceiptRuleSet
     */
    java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this action also
     * returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified
     * that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the following information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the
     * domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is
     * only returned for domain name identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a
     * time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest
     *        Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain
     *        identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether
     *        Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer
     *        Guide</a>.
     * @return A Java Future containing the result of the GetIdentityDkimAttributes operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityDkimAttributes
     */
    java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest);

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this action also
     * returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified
     * that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the following information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the
     * domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is
     * only returned for domain name identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a
     * time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest
     *        Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain
     *        identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether
     *        Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer
     *        Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityDkimAttributes operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityDkimAttributes
     */
    java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email addresses and/or domains).
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
     * identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest
     *        Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For
     *        information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @return A Java Future containing the result of the GetIdentityMailFromDomainAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityMailFromDomainAttributes
     */
    java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest);

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email addresses and/or domains).
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
     * identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest
     *        Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For
     *        information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityMailFromDomainAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityMailFromDomainAttributes
     */
    java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityMailFromDomainAttributesRequest, GetIdentityMailFromDomainAttributesResult> asyncHandler);

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity
     * notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get notification attributes for up to 100
     * identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest
     *        Represents a request to return the notification attributes for a list of identities you verified with
     *        Amazon SES. For information about Amazon SES notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer
     *        Guide</a>.
     * @return A Java Future containing the result of the GetIdentityNotificationAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityNotificationAttributes
     */
    java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest);

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity
     * notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get notification attributes for up to 100
     * identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest
     *        Represents a request to return the notification attributes for a list of identities you verified with
     *        Amazon SES. For information about Amazon SES notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer
     *        Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityNotificationAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityNotificationAttributes
     */
    java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns the requested sending authorization policies for the given identity (an email address or a domain). The
     * policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
     * time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest
     *        Represents a request to return the requested sending authorization policies for an identity. Sending
     *        authorization is an Amazon SES feature that enables you to authorize other senders to use your identities.
     *        For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the GetIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityPolicies
     */
    java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest getIdentityPoliciesRequest);

    /**
     * <p>
     * Returns the requested sending authorization policies for the given identity (an email address or a domain). The
     * policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
     * time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest
     *        Represents a request to return the requested sending authorization policies for an identity. Sending
     *        authorization is an Amazon SES feature that enables you to authorize other senders to use your identities.
     *        For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityPolicies
     */
    java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest getIdentityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler);

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain
     * identities) the verification token for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get verification attributes for up to 100
     * identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest
     *        Represents a request to return the Amazon SES verification status of a list of identities. For domain
     *        identities, this request also returns the verification token. For information about verifying identities
     *        with Amazon SES, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the GetIdentityVerificationAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.GetIdentityVerificationAttributes
     */
    java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest);

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain
     * identities) the verification token for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get verification attributes for up to 100
     * identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest
     *        Represents a request to return the Amazon SES verification status of a list of identities. For domain
     *        identities, this request also returns the verification token. For information about verifying identities
     *        with Amazon SES, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityVerificationAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetIdentityVerificationAttributes
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
     * @return A Java Future containing the result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetSendQuota
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest);

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
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetSendQuota
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetSendQuota operation.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest)
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync();

    /**
     * Simplified method form for invoking the GetSendQuota operation with an AsyncHandler.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler);

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data points, representing the last two weeks of
     * sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return A Java Future containing the result of the GetSendStatistics operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetSendStatistics
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(GetSendStatisticsRequest getSendStatisticsRequest);

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data points, representing the last two weeks of
     * sending activity.
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
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSendStatistics operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetSendStatistics
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(GetSendStatisticsRequest getSendStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetSendStatistics operation.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest)
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync();

    /**
     * Simplified method form for invoking the GetSendStatistics operation with an AsyncHandler.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler);

    /**
     * <p>
     * Lists the configuration sets associated with your AWS account.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second and can return up to 50 configuration sets at a time.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        Represents a request to list the configuration sets associated with your AWS account. Configuration sets
     *        enable you to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListConfigurationSets
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * <p>
     * Lists the configuration sets associated with your AWS account.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second and can return up to 50 configuration sets at a time.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        Represents a request to list the configuration sets associated with your AWS account. Configuration sets
     *        enable you to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListConfigurationSets
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler);

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and domains) for your AWS account, regardless of
     * verification status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Represents a request to return a list of all identities (email addresses and domains) that you have
     *        attempted to verify under your AWS account, regardless of verification status.
     * @return A Java Future containing the result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListIdentities
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest);

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and domains) for your AWS account, regardless of
     * verification status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Represents a request to return a list of all identities (email addresses and domains) that you have
     *        attempted to verify under your AWS account, regardless of verification status.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListIdentities
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListIdentities operation.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest)
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync();

    /**
     * Simplified method form for invoking the ListIdentities operation with an AsyncHandler.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the given identity (an email address or a
     * domain). This API returns only a list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest
     *        Represents a request to return a list of sending authorization policies that are attached to an identity.
     *        Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your
     *        identities. For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListIdentityPolicies
     */
    java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(ListIdentityPoliciesRequest listIdentityPoliciesRequest);

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the given identity (an email address or a
     * domain). This API returns only a list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest
     *        Represents a request to return a list of sending authorization policies that are attached to an identity.
     *        Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your
     *        identities. For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListIdentityPolicies
     */
    java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(ListIdentityPoliciesRequest listIdentityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest
     *        Represents a request to list the IP address filters that exist under your AWS account. You use IP address
     *        filters when you receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListReceiptFilters operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListReceiptFilters
     */
    java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(ListReceiptFiltersRequest listReceiptFiltersRequest);

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest
     *        Represents a request to list the IP address filters that exist under your AWS account. You use IP address
     *        filters when you receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReceiptFilters operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListReceiptFilters
     */
    java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(ListReceiptFiltersRequest listReceiptFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If there are additional receipt rule sets to be
     * retrieved, you will receive a <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest
     *        Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListReceiptRuleSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListReceiptRuleSets
     */
    java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest);

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If there are additional receipt rule sets to be
     * retrieved, you will receive a <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest
     *        Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReceiptRuleSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListReceiptRuleSets
     */
    java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler);

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been verified.
     * </p>
     * <important>
     * <p>
     * The ListVerifiedEmailAddresses action is deprecated as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return A Java Future containing the result of the ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListVerifiedEmailAddresses
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest);

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been verified.
     * </p>
     * <important>
     * <p>
     * The ListVerifiedEmailAddresses action is deprecated as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListVerifiedEmailAddresses
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses operation.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest)
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync();

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses operation with an AsyncHandler.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler);

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest
     *        Represents a request to add or update a sending authorization policy for an identity. Sending
     *        authorization is an Amazon SES feature that enables you to authorize other senders to use your identities.
     *        For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the PutIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.PutIdentityPolicy
     */
    java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(PutIdentityPolicyRequest putIdentityPolicyRequest);

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest
     *        Represents a request to add or update a sending authorization policy for an identity. Sending
     *        authorization is an Amazon SES feature that enables you to authorize other senders to use your identities.
     *        For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.PutIdentityPolicy
     */
    java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(PutIdentityPolicyRequest putIdentityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler);

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request. That is, this API will return an error if
     * the reorder request doesn't explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest
     *        Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ReorderReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ReorderReceiptRuleSet
     */
    java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest);

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request. That is, this API will return an error if
     * the reorder request doesn't explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest
     *        Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReorderReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ReorderReceiptRuleSet
     */
    java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use
     * this API on an email up to 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param sendBounceRequest
     *        Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
     * @return A Java Future containing the result of the SendBounce operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendBounce
     */
    java.util.concurrent.Future<SendBounceResult> sendBounceAsync(SendBounceRequest sendBounceRequest);

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use
     * this API on an email up to 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param sendBounceRequest
     *        Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendBounce operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendBounce
     */
    java.util.concurrent.Future<SendBounceResult> sendBounceAsync(SendBounceRequest sendBounceRequest,
            com.amazonaws.handlers.AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler);

    /**
     * <p>
     * Composes an email message based on input data, and then immediately queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about <code>SendEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains; otherwise, you will get an
     * "Email address not verified" error. If your account is still in the Amazon SES sandbox, you must also verify
     * every recipient email address except for the recipients provided by the Amazon SES mailbox simulator. For more
     * information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The combined number of To:, CC: and BCC:
     * email addresses cannot exceed 50. If you need to send an email message to a larger audience, you can divide your
     * recipient list into groups of 50 or fewer, and then call Amazon SES repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC: and BCC:) is counted against your
     * sending quota - the maximum number of emails you can send in a 24-hour period. For information about your sending
     * quota, go to the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer
     *        Guide</a>.
     * @return A Java Future containing the result of the SendEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendEmail
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest);

    /**
     * <p>
     * Composes an email message based on input data, and then immediately queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about <code>SendEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains; otherwise, you will get an
     * "Email address not verified" error. If your account is still in the Amazon SES sandbox, you must also verify
     * every recipient email address except for the recipients provided by the Amazon SES mailbox simulator. For more
     * information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The combined number of To:, CC: and BCC:
     * email addresses cannot exceed 50. If you need to send an email message to a larger audience, you can divide your
     * recipient list into groups of 50 or fewer, and then call Amazon SES repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC: and BCC:) is counted against your
     * sending quota - the maximum number of emails you can send in a 24-hour period. For information about your sending
     * quota, go to the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer
     *        Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendEmail
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler);

    /**
     * <p>
     * Sends an email message, with header and content specified by the client. The <code>SendRawEmail</code> action is
     * useful for sending multipart MIME emails. The raw text of the message must comply with Internet email standards;
     * otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about <code>SendRawEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains; otherwise, you will get an
     * "Email address not verified" error. If your account is still in the Amazon SES sandbox, you must also verify
     * every recipient email address except for the recipients provided by the Amazon SES mailbox simulator. For more
     * information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The combined number of To:, CC: and BCC:
     * email addresses cannot exceed 50. If you need to send an email message to a larger audience, you can divide your
     * recipient list into groups of 50 or fewer, and then call Amazon SES repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group list. Note that each recipient in a group
     * list counts towards the 50-recipient limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES overrides any Message-ID and Date headers you provide.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC: and BCC:) is counted against your
     * sending quota - the maximum number of emails you can send in a 24-hour period. For information about your sending
     * quota, go to the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user, <code>SendRawEmail</code> enables you
     * to specify the cross-account identity for the email's "Source," "From," and "Return-Path" parameters in one of
     * two ways: you can pass optional parameters <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following X-headers in the header of your raw
     * email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * </important>
     * <p>
     * For the most common sending authorization use case, we recommend that you specify the
     * <code>SourceIdentityArn</code> and do not specify either the <code>FromIdentityArn</code> or
     * <code>ReturnPathIdentityArn</code>. (The same note applies to the corresponding X-headers.) If you only specify
     * the <code>SourceIdentityArn</code>, Amazon SES will simply set the "From" address and the "Return Path" address
     * to the identity specified in <code>SourceIdentityArn</code>. For more information about sending authorization,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest
     *        Represents a request to send a single raw email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *        Guide</a>.
     * @return A Java Future containing the result of the SendRawEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendRawEmail
     */
    java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest);

    /**
     * <p>
     * Sends an email message, with header and content specified by the client. The <code>SendRawEmail</code> action is
     * useful for sending multipart MIME emails. The raw text of the message must comply with Internet email standards;
     * otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about <code>SendRawEmail</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from verified email addresses and domains; otherwise, you will get an
     * "Email address not verified" error. If your account is still in the Amazon SES sandbox, you must also verify
     * every recipient email address except for the recipients provided by the Amazon SES mailbox simulator. For more
     * information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any attachments that are part of the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message. The combined number of To:, CC: and BCC:
     * email addresses cannot exceed 50. If you need to send an email message to a larger audience, you can divide your
     * recipient list into groups of 50 or fewer, and then call Amazon SES repeatedly to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group list. Note that each recipient in a group
     * list counts towards the 50-recipient limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES overrides any Message-ID and Date headers you provide.
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (To:, CC: and BCC:) is counted against your
     * sending quota - the maximum number of emails you can send in a 24-hour period. For information about your sending
     * quota, go to the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user, <code>SendRawEmail</code> enables you
     * to specify the cross-account identity for the email's "Source," "From," and "Return-Path" parameters in one of
     * two ways: you can pass optional parameters <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following X-headers in the header of your raw
     * email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * </important>
     * <p>
     * For the most common sending authorization use case, we recommend that you specify the
     * <code>SourceIdentityArn</code> and do not specify either the <code>FromIdentityArn</code> or
     * <code>ReturnPathIdentityArn</code>. (The same note applies to the corresponding X-headers.) If you only specify
     * the <code>SourceIdentityArn</code>, Amazon SES will simply set the "From" address and the "Return Path" address
     * to the identity specified in <code>SourceIdentityArn</code>. For more information about sending authorization,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest
     *        Represents a request to send a single raw email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *        Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendRawEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendRawEmail
     */
    java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler);

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to
     * null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest
     *        Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets
     *        to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetActiveReceiptRuleSet
     */
    java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest);

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to
     * null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest
     *        Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets
     *        to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetActiveReceiptRuleSet
     */
    java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (e.g., <code>example.com</code>), then Amazon SES will
     * DKIM-sign all email sent by addresses under that domain name (e.g., <code>user@example.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email
     * address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code>), you can only enable Easy DKIM signing if the
     * corresponding domain (e.g., <code>example.com</code>) has been set up for Easy DKIM using the AWS Console or the
     * <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest
     *        Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more
     *        information about setting up Easy DKIM, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * @return A Java Future containing the result of the SetIdentityDkimEnabled operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityDkimEnabled
     */
    java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest);

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (e.g., <code>example.com</code>), then Amazon SES will
     * DKIM-sign all email sent by addresses under that domain name (e.g., <code>user@example.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email
     * address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code>), you can only enable Easy DKIM signing if the
     * corresponding domain (e.g., <code>example.com</code>) has been set up for Easy DKIM using the AWS Console or the
     * <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest
     *        Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more
     *        information about setting up Easy DKIM, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityDkimEnabled operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetIdentityDkimEnabled
     */
    java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler);

    /**
     * <p>
     * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and
     * complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest
     *        Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint
     *        notifications through email. For information about email feedback forwarding, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetIdentityFeedbackForwardingEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityFeedbackForwardingEnabled
     */
    java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest);

    /**
     * <p>
     * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and
     * complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest
     *        Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint
     *        notifications through email. For information about email feedback forwarding, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityFeedbackForwardingEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetIdentityFeedbackForwardingEnabled
     */
    java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler);

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in
     * the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest
     *        Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS
     *        notifications of a specified type. For information about notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetIdentityHeadersInNotificationsEnabled operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityHeadersInNotificationsEnabled
     */
    java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest);

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in
     * the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest
     *        Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS
     *        notifications of a specified type. For information about notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityHeadersInNotificationsEnabled operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetIdentityHeadersInNotificationsEnabled
     */
    java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityHeadersInNotificationsEnabledRequest, SetIdentityHeadersInNotificationsEnabledResult> asyncHandler);

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS
     * settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an
     * SPF record. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html">Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest
     *        Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified
     *        identity. For information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @return A Java Future containing the result of the SetIdentityMailFromDomain operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityMailFromDomain
     */
    java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest);

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS
     * settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an
     * SPF record. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html">Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest
     *        Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified
     *        identity. For information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityMailFromDomain operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetIdentityMailFromDomain
     */
    java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler);

    /**
     * <p>
     * Given an identity (an email address or a domain), sets the Amazon Simple Notification Service (Amazon SNS) topic
     * to which Amazon SES will publish bounce, complaint, and/or delivery notifications for emails sent with that
     * identity as the <code>Source</code>.
     * </p>
     * <note>
     * <p>
     * Unless feedback forwarding is enabled, you must specify Amazon SNS topics for bounce and complaint notifications.
     * For more information, see <code>SetIdentityFeedbackForwardingEnabled</code>.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest
     *        Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint,
     *        or delivery notifications for emails sent with that identity as the Source. For information about Amazon
     *        SES notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetIdentityNotificationTopic operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityNotificationTopic
     */
    java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest);

    /**
     * <p>
     * Given an identity (an email address or a domain), sets the Amazon Simple Notification Service (Amazon SNS) topic
     * to which Amazon SES will publish bounce, complaint, and/or delivery notifications for emails sent with that
     * identity as the <code>Source</code>.
     * </p>
     * <note>
     * <p>
     * Unless feedback forwarding is enabled, you must specify Amazon SNS topics for bounce and complaint notifications.
     * For more information, see <code>SetIdentityFeedbackForwardingEnabled</code>.
     * </p>
     * </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest
     *        Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint,
     *        or delivery notifications for emails sent with that identity as the Source. For information about Amazon
     *        SES notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIdentityNotificationTopic operation returned by the
     *         service.
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
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest
     *        Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetReceiptRulePosition operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetReceiptRulePosition
     */
    java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(SetReceiptRulePositionRequest setReceiptRulePositionRequest);

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest
     *        Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetReceiptRulePosition operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SetReceiptRulePosition
     */
    java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(SetReceiptRulePositionRequest setReceiptRulePositionRequest,
            com.amazonaws.handlers.AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler);

    /**
     * <p>
     * Updates the event destination of a configuration set.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be either Amazon CloudWatch or Amazon Kinesis Firehose.
     * </p>
     * </note>
     * <p>
     * Event destinations are associated with configuration sets, which enable you to publish email sending events to
     * Amazon CloudWatch or Amazon Kinesis Firehose. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        Represents a request to update the event destination of a configuration set. Configuration sets enable you
     *        to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateConfigurationSetEventDestination
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Updates the event destination of a configuration set.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be either Amazon CloudWatch or Amazon Kinesis Firehose.
     * </p>
     * </note>
     * <p>
     * Event destinations are associated with configuration sets, which enable you to publish email sending events to
     * Amazon CloudWatch or Amazon Kinesis Firehose. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        Represents a request to update the event destination of a configuration set. Configuration sets enable you
     *        to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateConfigurationSetEventDestination
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest
     *        Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the UpdateReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateReceiptRule
     */
    java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(UpdateReceiptRuleRequest updateReceiptRuleRequest);

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest
     *        Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateReceiptRule
     */
    java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(UpdateReceiptRuleRequest updateReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler);

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are character strings that represent your domain's
     * identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     * Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email
     * originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest
     *        Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more
     *        information about setting up Easy DKIM, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * @return A Java Future containing the result of the VerifyDomainDkim operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyDomainDkim
     */
    java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest verifyDomainDkimRequest);

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are character strings that represent your domain's
     * identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     * Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email
     * originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest
     *        Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more
     *        information about setting up Easy DKIM, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyDomainDkim operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyDomainDkim
     */
    java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest verifyDomainDkimRequest,
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
     *        Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must
     *        publish to the DNS server of your domain to complete the verification. For information about domain
     *        verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html">Amazon SES Developer
     *        Guide</a>.
     * @return A Java Future containing the result of the VerifyDomainIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyDomainIdentity
     */
    java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest verifyDomainIdentityRequest);

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest
     *        Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must
     *        publish to the DNS server of your domain to complete the verification. For information about domain
     *        verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html">Amazon SES Developer
     *        Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyDomainIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyDomainIdentity
     */
    java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler);

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email message to be sent to the specified address.
     * </p>
     * <important>
     * <p>
     * The VerifyEmailAddress action is deprecated as of the May 15, 2012 release of Domain Verification. The
     * VerifyEmailIdentity action is now preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailAddressRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the VerifyEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyEmailAddress
     */
    java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest);

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email message to be sent to the specified address.
     * </p>
     * <important>
     * <p>
     * The VerifyEmailAddress action is deprecated as of the May 15, 2012 release of Domain Verification. The
     * VerifyEmailIdentity action is now preferred.
     * </p>
     * </important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailAddressRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyEmailAddress
     */
    java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailAddressRequest, VerifyEmailAddressResult> asyncHandler);

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the VerifyEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyEmailIdentity
     */
    java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest verifyEmailIdentityRequest);

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.VerifyEmailIdentity
     */
    java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler);

}
