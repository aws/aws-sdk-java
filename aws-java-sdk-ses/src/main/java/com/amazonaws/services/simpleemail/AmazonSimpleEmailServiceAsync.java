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
 * This document contains reference information for the <a href="https://aws.amazon.com/ses/">Amazon Simple Email
 * Service</a> (Amazon SES) API, version 2010-12-01. This document is best used in conjunction with the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions and Amazon SES</a> in the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer Guide</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest
     *        Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CloneReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CloneReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CloneReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CloneReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        Represents a request to create a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
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
     * can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
     * configuration set. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
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
     * can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
     * configuration set. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Creates an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param createConfigurationSetTrackingOptionsRequest
     *        Represents a request to create an open and click tracking option object in a configuration set.
     * @return A Java Future containing the result of the CreateConfigurationSetTrackingOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetTrackingOptionsResult> createConfigurationSetTrackingOptionsAsync(
            CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest);

    /**
     * <p>
     * Creates an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param createConfigurationSetTrackingOptionsRequest
     *        Represents a request to create an open and click tracking option object in a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSetTrackingOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetTrackingOptionsResult> createConfigurationSetTrackingOptionsAsync(
            CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetTrackingOptionsRequest, CreateConfigurationSetTrackingOptionsResult> asyncHandler);

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest
     *        Represents a request to create a custom verification email template.
     * @return A Java Future containing the result of the CreateCustomVerificationEmailTemplate operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomVerificationEmailTemplateResult> createCustomVerificationEmailTemplateAsync(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest
     *        Represents a request to create a custom verification email template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomVerificationEmailTemplate operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomVerificationEmailTemplateResult> createCustomVerificationEmailTemplateAsync(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomVerificationEmailTemplateRequest, CreateCustomVerificationEmailTemplateResult> asyncHandler);

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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptFilterRequest
     *        Represents a request to create a new IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptFilter" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptFilter" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleRequest
     *        Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest
     *        Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(CreateReceiptRuleSetRequest createReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createTemplateRequest
     *        Represents a request to create an email template. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest);

    /**
     * <p>
     * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createTemplateRequest
     *        Represents a request to create an email template. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about
     * using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        Represents a request to delete a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * <p>
     * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about
     * using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration set event destination. Configuration set event destinations are associated with
     * configuration sets, which enable you to publish email sending events. For information about using configuration
     * sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Deletes a configuration set event destination. Configuration set event destinations are associated with
     * configuration sets, which enable you to publish email sending events. For information about using configuration
     * sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Deleting this kind of association will result in emails sent using the specified configuration set to capture
     * open and click events using the standard, Amazon SES-operated domains.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationSetTrackingOptionsRequest
     *        Represents a request to delete open and click tracking options in a configuration set.
     * @return A Java Future containing the result of the DeleteConfigurationSetTrackingOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetTrackingOptionsResult> deleteConfigurationSetTrackingOptionsAsync(
            DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest);

    /**
     * <p>
     * Deletes an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Deleting this kind of association will result in emails sent using the specified configuration set to capture
     * open and click events using the standard, Amazon SES-operated domains.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationSetTrackingOptionsRequest
     *        Represents a request to delete open and click tracking options in a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSetTrackingOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetTrackingOptionsResult> deleteConfigurationSetTrackingOptionsAsync(
            DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetTrackingOptionsRequest, DeleteConfigurationSetTrackingOptionsResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest
     *        Represents a request to delete an existing custom verification email template.
     * @return A Java Future containing the result of the DeleteCustomVerificationEmailTemplate operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomVerificationEmailTemplateResult> deleteCustomVerificationEmailTemplateAsync(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest
     *        Represents a request to delete an existing custom verification email template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomVerificationEmailTemplate operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomVerificationEmailTemplateResult> deleteCustomVerificationEmailTemplateAsync(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomVerificationEmailTemplateRequest, DeleteCustomVerificationEmailTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the list of verified identities.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityRequest
     *        Represents a request to delete one of your Amazon SES identities (an email address or domain).
     * @return A Java Future containing the result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest);

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the list of verified identities.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentity" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest
     *        Represents a request to delete a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *        SES Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest
     *        Represents a request to delete an IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptFilter" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptFilter" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest
     *        Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest
     *        Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use
     *        receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteTemplateRequest
     *        Represents a request to delete an email template. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DeleteTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest deleteTemplateRequest);

    /**
     * <p>
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteTemplateRequest
     *        Represents a request to delete an email template. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest deleteTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email addresses and domains.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request to delete an email address from the list of email addresses you have attempted to
     *        verify under your AWS account.
     * @return A Java Future containing the result of the DeleteVerifiedEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DeleteVerifiedEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteVerifiedEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest);

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email addresses and domains.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteVerifiedEmailAddress"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeActiveReceiptRuleSet"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeActiveReceiptRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the specified configuration set. For information about using configuration sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeConfigurationSetRequest
     *        Represents a request to return the details of a configuration set. Configuration sets enable you to
     *        publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(DescribeConfigurationSetRequest describeConfigurationSetRequest);

    /**
     * <p>
     * Returns the details of the specified configuration set. For information about using configuration sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeConfigurationSet" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest
     *        Represents a request to return the details of a receipt rule. You use receipt rules to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest
     *        Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive
     *        email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the DescribeReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.DescribeReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler);

    /**
     * <p>
     * Returns the email sending status of the Amazon SES account for the current region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @return A Java Future containing the result of the GetAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetAccountSendingEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSendingEnabledResult> getAccountSendingEnabledAsync(GetAccountSendingEnabledRequest getAccountSendingEnabledRequest);

    /**
     * <p>
     * Returns the email sending status of the Amazon SES account for the current region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetAccountSendingEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSendingEnabledResult> getAccountSendingEnabledAsync(GetAccountSendingEnabledRequest getAccountSendingEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSendingEnabledRequest, GetAccountSendingEnabledResult> asyncHandler);

    /**
     * <p>
     * Returns the custom email verification template for the template name you specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest
     *        Represents a request to retrieve an existing custom verification email template.
     * @return A Java Future containing the result of the GetCustomVerificationEmailTemplate operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.GetCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Returns the custom email verification template for the template name you specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest
     *        Represents a request to retrieve an existing custom verification email template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCustomVerificationEmailTemplate operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCustomVerificationEmailTemplateRequest, GetCustomVerificationEmailTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also
     * returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified
     * that these tokens have been published.
     * </p>
     * <p>
     * This operation takes a list of identities as input and returns the following information for each:
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
     * This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities
     * at a time.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest);

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also
     * returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified
     * that these tokens have been published.
     * </p>
     * <p>
     * This operation takes a list of identities as input and returns the following information for each:
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
     * This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities
     * at a time.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains).
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityMailFromDomainAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest);

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains).
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityMailFromDomainAttributes"
     *      target="_top">AWS API Documentation</a>
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
     * This operation is throttled at one request per second and can only get notification attributes for up to 100
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest);

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity
     * notification attributes.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get notification attributes for up to 100
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest getIdentityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler);

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain
     * identities) the verification token for each identity.
     * </p>
     * <p>
     * The verification status of an email address is "Pending" until the email address owner clicks the link within the
     * verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24
     * hours, the verification status of the email address changes to "Success". If the link is not clicked within 24
     * hours, the verification status changes to "Failed." In that case, if you still want to verify the email address,
     * you must restart the verification process from the beginning.
     * </p>
     * <p>
     * For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT
     * record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status
     * changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification
     * status changes to "Failed." In that case, if you still want to verify the domain, you must restart the
     * verification process from the beginning.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get verification attributes for up to 100
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityVerificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest);

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain
     * identities) the verification token for each identity.
     * </p>
     * <p>
     * The verification status of an email address is "Pending" until the email address owner clicks the link within the
     * verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24
     * hours, the verification status of the email address changes to "Success". If the link is not clicked within 24
     * hours, the verification status changes to "Failed." In that case, if you still want to verify the email address,
     * you must restart the verification process from the beginning.
     * </p>
     * <p>
     * For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT
     * record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status
     * changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification
     * status changes to "Failed." In that case, if you still want to verify the domain, you must restart the
     * verification process from the beginning.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get verification attributes for up to 100
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityVerificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler);

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return A Java Future containing the result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetSendQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendQuota" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest);

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetSendQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendQuota" target="_top">AWS API
     *      Documentation</a>
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
     * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the
     * last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of
     * time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return A Java Future containing the result of the GetSendStatistics operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetSendStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(GetSendStatisticsRequest getSendStatisticsRequest);

    /**
     * <p>
     * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the
     * last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of
     * time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSendStatistics operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetSendStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendStatistics" target="_top">AWS API
     *      Documentation</a>
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
     * Displays the template object (which includes the Subject line, HTML part and text part) for the template you
     * specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getTemplateRequest
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Displays the template object (which includes the Subject line, HTML part and text part) for the template you
     * specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler);

    /**
     * <p>
     * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For
     * information about using configuration sets, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Monitoring Your Amazon
     * SES Sending Activity</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second. This operation will return up to 1,000 configuration
     * sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will
     * also return a NextToken element. You can then execute the <code>ListConfigurationSets</code> operation again,
     * passing the <code>NextToken</code> parameter and the value of the NextToken element to retrieve additional
     * results.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        Represents a request to list the configuration sets associated with your AWS account. Configuration sets
     *        enable you to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * <p>
     * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For
     * information about using configuration sets, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Monitoring Your Amazon
     * SES Sending Activity</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second. This operation will return up to 1,000 configuration
     * sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will
     * also return a NextToken element. You can then execute the <code>ListConfigurationSets</code> operation again,
     * passing the <code>NextToken</code> parameter and the value of the NextToken element to retrieve additional
     * results.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler);

    /**
     * <p>
     * Lists the existing custom verification email templates for your account in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest
     *        Represents a request to list the existing custom verification email templates for your account.</p>
     *        <p>
     *        For more information about custom verification email templates, see <a
     *        href="ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom Verification Email
     *        Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * @return A Java Future containing the result of the ListCustomVerificationEmailTemplates operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.ListCustomVerificationEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListCustomVerificationEmailTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest);

    /**
     * <p>
     * Lists the existing custom verification email templates for your account in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest
     *        Represents a request to list the existing custom verification email templates for your account.</p>
     *        <p>
     *        For more information about custom verification email templates, see <a
     *        href="ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom Verification Email
     *        Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomVerificationEmailTemplates operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListCustomVerificationEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListCustomVerificationEmailTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomVerificationEmailTemplatesRequest, ListCustomVerificationEmailTemplatesResult> asyncHandler);

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current
     * AWS Region, regardless of verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Represents a request to return a list of all identities (email addresses and domains) that you have
     *        attempted to verify under your AWS account, regardless of verification status.
     * @return A Java Future containing the result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest);

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current
     * AWS Region, regardless of verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentities" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(ListIdentityPoliciesRequest listIdentityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account in the current AWS Region.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest
     *        Represents a request to list the IP address filters that exist under your AWS account. You use IP address
     *        filters when you receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListReceiptFilters operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListReceiptFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(ListReceiptFiltersRequest listReceiptFiltersRequest);

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account in the current AWS Region.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(ListReceiptFiltersRequest listReceiptFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional
     * receipt rule sets to be retrieved, you will receive a <code>NextToken</code> that you can provide to the next
     * call to <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest
     *        Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ListReceiptRuleSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListReceiptRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest);

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional
     * receipt rule sets to be retrieved, you will receive a <code>NextToken</code> that you can provide to the next
     * call to <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler);

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the email addresses and domains associated with
     * your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return A Java Future containing the result of the ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ListVerifiedEmailAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListVerifiedEmailAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest);

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the email addresses and domains associated with
     * your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.ListVerifiedEmailAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListVerifiedEmailAddresses"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/PutIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/PutIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest
     *        Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the ReorderReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.ReorderReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReorderReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReorderReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendBounceRequest
     *        Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
     * @return A Java Future containing the result of the SendBounce operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendBounce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBounce" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBounce" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendBounceResult> sendBounceAsync(SendBounceRequest sendBounceRequest,
            com.amazonaws.handlers.AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler);

    /**
     * <p>
     * Composes an email message to multiple destinations. The message body is created using an email template.
     * </p>
     * <p>
     * In order to send email using the <code>SendBulkTemplatedEmail</code> operation, your call to the API must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email templates using the <a>CreateTemplate</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each <code>Destination</code> parameter must include at least one recipient email address. The recipient address
     * can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
     * not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even
     * if the message contains other recipients that are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
     * email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
     * the <code>SendBulkTemplatedEmail</code> operation several times to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of destinations you can contact in a single call to the API may be limited by your account's maximum
     * sending rate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendBulkTemplatedEmailRequest
     *        Represents a request to send a templated email to multiple destinations using Amazon SES. For more
     *        information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SendBulkTemplatedEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendBulkTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBulkTemplatedEmail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendBulkTemplatedEmailResult> sendBulkTemplatedEmailAsync(SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest);

    /**
     * <p>
     * Composes an email message to multiple destinations. The message body is created using an email template.
     * </p>
     * <p>
     * In order to send email using the <code>SendBulkTemplatedEmail</code> operation, your call to the API must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email templates using the <a>CreateTemplate</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each <code>Destination</code> parameter must include at least one recipient email address. The recipient address
     * can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
     * not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even
     * if the message contains other recipients that are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
     * email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
     * the <code>SendBulkTemplatedEmail</code> operation several times to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of destinations you can contact in a single call to the API may be limited by your account's maximum
     * sending rate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendBulkTemplatedEmailRequest
     *        Represents a request to send a templated email to multiple destinations using Amazon SES. For more
     *        information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendBulkTemplatedEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendBulkTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBulkTemplatedEmail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendBulkTemplatedEmailResult> sendBulkTemplatedEmailAsync(SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendBulkTemplatedEmailRequest, SendBulkTemplatedEmailResult> asyncHandler);

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
     * attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email template. For more information about
     * creating and using custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest
     *        Represents a request to send a custom verification email to a specified recipient.
     * @return A Java Future containing the result of the SendCustomVerificationEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendCustomVerificationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendCustomVerificationEmail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(
            SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest);

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
     * attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email template. For more information about
     * creating and using custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest
     *        Represents a request to send a custom verification email to a specified recipient.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendCustomVerificationEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendCustomVerificationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendCustomVerificationEmail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(
            SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendCustomVerificationEmailRequest, SendCustomVerificationEmailResult> asyncHandler);

    /**
     * <p>
     * Composes an email message and immediately queues it for sending. In order to send email using the
     * <code>SendEmail</code> operation, your message must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain. If you attempt to send email using a
     * non-verified address or domain, the operation will result in an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must include at least one recipient email address. The recipient address can be a To: address, a CC:
     * address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even if the message
     * contains other recipients that are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
     * email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
     * the <code>SendEmail</code> operation several times to send the message to each group.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
     * BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your <i>sending
     * quota</i>). For more information about sending quotas in Amazon SES, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Managing Your Amazon SES
     * Sending Limits</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </important>
     * 
     * @param sendEmailRequest
     *        Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer
     *        Guide</a>.
     * @return A Java Future containing the result of the SendEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest);

    /**
     * <p>
     * Composes an email message and immediately queues it for sending. In order to send email using the
     * <code>SendEmail</code> operation, your message must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain. If you attempt to send email using a
     * non-verified address or domain, the operation will result in an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must include at least one recipient email address. The recipient address can be a To: address, a CC:
     * address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even if the message
     * contains other recipients that are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
     * email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
     * the <code>SendEmail</code> operation several times to send the message to each group.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
     * BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your <i>sending
     * quota</i>). For more information about sending quotas in Amazon SES, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Managing Your Amazon SES
     * Sending Limits</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </important>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler);

    /**
     * <p>
     * Composes an email message and immediately queues it for sending.
     * </p>
     * <p>
     * This operation is more flexible than the <code>SendEmail</code> API operation. When you use the
     * <code>SendRawEmail</code> operation, you can specify the headers of the message as well as its content. This
     * flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains
     * both a text and an HTML version). You can also use this operation to send messages that include attachments.
     * </p>
     * <p>
     * The <code>SendRawEmail</code> operation has the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">verified email
     * addresses or domains</a>. If you try to send email from an address that isn't verified, the operation results in
     * an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html">Amazon SES
     * sandbox</a>, you can only send email to other verified addresses in your account, or to addresses that are
     * associated with the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html">Amazon
     * SES mailbox simulator</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size, including attachments, is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message has to include at least one recipient address. A recipient address includes any address on the To:,
     * CC:, or BCC: lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a
     * valid format (that is, it's not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), Amazon SES
     * rejects the entire message, even if the other addresses are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a
     * single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less
     * than 50 recipients, and send separate messages to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES
     * has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't
     * preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding">MIME
     * Encoding</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, keep the following considerations in mind when using the <code>SendRawEmail</code> operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although you can customize the message headers when using the <code>SendRawEmail</code> operation, Amazon SES
     * will automatically apply its own <code>Message-ID</code> and <code>Date</code> headers; if you passed these
     * headers when creating the message, they will be overwritten by the values that Amazon SES provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user, <code>SendRawEmail</code> enables you
     * to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two
     * ways: you can pass optional parameters <code>SourceArn</code>, <code>FromArn</code>, and/or
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
     * Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.
     * </p>
     * </important>
     * <p>
     * For most common sending authorization scenarios, we recommend that you specify the <code>SourceIdentityArn</code>
     * parameter and not the <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code> parameters. If you only
     * specify the <code>SourceIdentityArn</code> parameter, Amazon SES will set the From and Return Path addresses to
     * the identity specified in <code>SourceIdentityArn</code>. For more information about sending authorization, see
     * the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Using Sending
     * Authorization with Amazon SES</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
     * BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your <i>sending
     * quota</i>). For more information about sending quotas in Amazon SES, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Managing Your Amazon SES
     * Sending Limits</a> in the <i>Amazon SES Developer Guide.</i>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendRawEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest);

    /**
     * <p>
     * Composes an email message and immediately queues it for sending.
     * </p>
     * <p>
     * This operation is more flexible than the <code>SendEmail</code> API operation. When you use the
     * <code>SendRawEmail</code> operation, you can specify the headers of the message as well as its content. This
     * flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains
     * both a text and an HTML version). You can also use this operation to send messages that include attachments.
     * </p>
     * <p>
     * The <code>SendRawEmail</code> operation has the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">verified email
     * addresses or domains</a>. If you try to send email from an address that isn't verified, the operation results in
     * an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html">Amazon SES
     * sandbox</a>, you can only send email to other verified addresses in your account, or to addresses that are
     * associated with the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html">Amazon
     * SES mailbox simulator</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size, including attachments, is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message has to include at least one recipient address. A recipient address includes any address on the To:,
     * CC:, or BCC: lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a
     * valid format (that is, it's not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), Amazon SES
     * rejects the entire message, even if the other addresses are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a
     * single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less
     * than 50 recipients, and send separate messages to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES
     * has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't
     * preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding">MIME
     * Encoding</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, keep the following considerations in mind when using the <code>SendRawEmail</code> operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although you can customize the message headers when using the <code>SendRawEmail</code> operation, Amazon SES
     * will automatically apply its own <code>Message-ID</code> and <code>Date</code> headers; if you passed these
     * headers when creating the message, they will be overwritten by the values that Amazon SES provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user, <code>SendRawEmail</code> enables you
     * to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two
     * ways: you can pass optional parameters <code>SourceArn</code>, <code>FromArn</code>, and/or
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
     * Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.
     * </p>
     * </important>
     * <p>
     * For most common sending authorization scenarios, we recommend that you specify the <code>SourceIdentityArn</code>
     * parameter and not the <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code> parameters. If you only
     * specify the <code>SourceIdentityArn</code> parameter, Amazon SES will set the From and Return Path addresses to
     * the identity specified in <code>SourceIdentityArn</code>. For more information about sending authorization, see
     * the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Using Sending
     * Authorization with Amazon SES</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
     * BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your <i>sending
     * quota</i>). For more information about sending quotas in Amazon SES, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Managing Your Amazon SES
     * Sending Limits</a> in the <i>Amazon SES Developer Guide.</i>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendRawEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler);

    /**
     * <p>
     * Composes an email message using an email template and immediately queues it for sending.
     * </p>
     * <p>
     * In order to send email using the <code>SendTemplatedEmail</code> operation, your call to the API must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email templates using the <a>CreateTemplate</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls to the <code>SendTemplatedEmail</code> operation may only include one <code>Destination</code> parameter. A
     * destination is a set of recipients who will receive the same version of the email. The <code>Destination</code>
     * parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Destination</code> parameter must include at least one recipient email address. The recipient address
     * can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
     * not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even
     * if the message contains other recipients that are valid.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If your call to the <code>SendTemplatedEmail</code> operation includes all of the required parameters, Amazon SES
     * accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains
     * errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't
     * return a message stating that it was unable to send the email.
     * </p>
     * <p>
     * For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering
     * Failure events occur. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Sending Personalized
     * Email Using the Amazon SES API</a> in the <i>Amazon Simple Email Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param sendTemplatedEmailRequest
     *        Represents a request to send a templated email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SendTemplatedEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SendTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendTemplatedEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTemplatedEmailResult> sendTemplatedEmailAsync(SendTemplatedEmailRequest sendTemplatedEmailRequest);

    /**
     * <p>
     * Composes an email message using an email template and immediately queues it for sending.
     * </p>
     * <p>
     * In order to send email using the <code>SendTemplatedEmail</code> operation, your call to the API must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email templates using the <a>CreateTemplate</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls to the <code>SendTemplatedEmail</code> operation may only include one <code>Destination</code> parameter. A
     * destination is a set of recipients who will receive the same version of the email. The <code>Destination</code>
     * parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Destination</code> parameter must include at least one recipient email address. The recipient address
     * can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
     * not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even
     * if the message contains other recipients that are valid.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If your call to the <code>SendTemplatedEmail</code> operation includes all of the required parameters, Amazon SES
     * accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains
     * errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't
     * return a message stating that it was unable to send the email.
     * </p>
     * <p>
     * For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering
     * Failure events occur. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Sending Personalized
     * Email Using the Amazon SES API</a> in the <i>Amazon Simple Email Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param sendTemplatedEmailRequest
     *        Represents a request to send a templated email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendTemplatedEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.SendTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendTemplatedEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendTemplatedEmailResult> sendTemplatedEmailAsync(SendTemplatedEmailRequest sendTemplatedEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendTemplatedEmailRequest, SendTemplatedEmailResult> asyncHandler);

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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest
     *        Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets
     *        to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetActiveReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetActiveReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetActiveReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
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
     * If Easy DKIM signing is enabled for a domain name identity (such as <code>example.com</code>), then Amazon SES
     * will DKIM-sign all email sent by addresses under that domain name (for example, <code>user@example.com</code>).
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
     * For email addresses (for example, <code>user@example.com</code>), you can only enable Easy DKIM signing if the
     * corresponding domain (in this case, <code>example.com</code>) has been set up for Easy DKIM using the AWS Console
     * or the <code>VerifyDomainDkim</code> operation.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityDkimEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest);

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (such as <code>example.com</code>), then Amazon SES
     * will DKIM-sign all email sent by addresses under that domain name (for example, <code>user@example.com</code>).
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
     * For email addresses (for example, <code>user@example.com</code>), you can only enable Easy DKIM signing if the
     * corresponding domain (in this case, <code>example.com</code>) has been set up for Easy DKIM using the AWS Console
     * or the <code>VerifyDomainDkim</code> operation.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityDkimEnabled" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityFeedbackForwardingEnabled"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityFeedbackForwardingEnabled"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityHeadersInNotificationsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest);

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in
     * the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityHeadersInNotificationsEnabled"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest
     *        Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified
     *        identity. For information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @return A Java Future containing the result of the SetIdentityMailFromDomain operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetIdentityMailFromDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityMailFromDomain"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityMailFromDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest,
            com.amazonaws.handlers.AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler);

    /**
     * <p>
     * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use
     * this operation, you specify a verified identity, such as an email address or domain. When you send an email that
     * uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can
     * send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that
     * you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityNotificationTopic"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest);

    /**
     * <p>
     * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use
     * this operation, you specify a verified identity, such as an email address or domain. When you send an email that
     * uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can
     * send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that
     * you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityNotificationTopic"
     *      target="_top">AWS API Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest
     *        Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the SetReceiptRulePosition operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.SetReceiptRulePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetReceiptRulePosition" target="_top">AWS
     *      API Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetReceiptRulePosition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(SetReceiptRulePositionRequest setReceiptRulePositionRequest,
            com.amazonaws.handlers.AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler);

    /**
     * <p>
     * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderTemplateRequest
     * @return A Java Future containing the result of the TestRenderTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.TestRenderTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TestRenderTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestRenderTemplateResult> testRenderTemplateAsync(TestRenderTemplateRequest testRenderTemplateRequest);

    /**
     * <p>
     * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestRenderTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.TestRenderTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TestRenderTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestRenderTemplateResult> testRenderTemplateAsync(TestRenderTemplateRequest testRenderTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<TestRenderTemplateRequest, TestRenderTemplateResult> asyncHandler);

    /**
     * <p>
     * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use
     * this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon
     * SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain
     * thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateAccountSendingEnabledRequest
     *        Represents a request to enable or disable the email sending capabilities for your entire Amazon SES
     *        account.
     * @return A Java Future containing the result of the UpdateAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateAccountSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSendingEnabledResult> updateAccountSendingEnabledAsync(
            UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest);

    /**
     * <p>
     * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use
     * this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon
     * SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain
     * thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateAccountSendingEnabledRequest
     *        Represents a request to enable or disable the email sending capabilities for your entire Amazon SES
     *        account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateAccountSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSendingEnabledResult> updateAccountSendingEnabledAsync(
            UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSendingEnabledRequest, UpdateAccountSendingEnabledResult> asyncHandler);

    /**
     * <p>
     * Updates the event destination of a configuration set. Event destinations are associated with configuration sets,
     * which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple
     * Notification Service (Amazon SNS). For information about using configuration sets, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Monitoring Your Amazon
     * SES Sending Activity</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Updates the event destination of a configuration set. Event destinations are associated with configuration sets,
     * which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple
     * Notification Service (Amazon SNS). For information about using configuration sets, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Monitoring Your Amazon
     * SES Sending Activity</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a
     * given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon
     * CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetReputationMetricsEnabledRequest
     *        Represents a request to modify the reputation metric publishing settings for a configuration set.
     * @return A Java Future containing the result of the UpdateConfigurationSetReputationMetricsEnabled operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateConfigurationSetReputationMetricsEnabled
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetReputationMetricsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetReputationMetricsEnabledResult> updateConfigurationSetReputationMetricsEnabledAsync(
            UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest);

    /**
     * <p>
     * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a
     * given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon
     * CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetReputationMetricsEnabledRequest
     *        Represents a request to modify the reputation metric publishing settings for a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationSetReputationMetricsEnabled operation
     *         returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateConfigurationSetReputationMetricsEnabled
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetReputationMetricsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetReputationMetricsEnabledResult> updateConfigurationSetReputationMetricsEnabledAsync(
            UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetReputationMetricsEnabledRequest, UpdateConfigurationSetReputationMetricsEnabledResult> asyncHandler);

    /**
     * <p>
     * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You
     * can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a
     * configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate)
     * exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetSendingEnabledRequest
     *        Represents a request to enable or disable the email sending capabilities for a specific configuration set.
     * @return A Java Future containing the result of the UpdateConfigurationSetSendingEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateConfigurationSetSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetSendingEnabledResult> updateConfigurationSetSendingEnabledAsync(
            UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest);

    /**
     * <p>
     * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You
     * can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a
     * configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate)
     * exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetSendingEnabledRequest
     *        Represents a request to enable or disable the email sending capabilities for a specific configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationSetSendingEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateConfigurationSetSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetSendingEnabledResult> updateConfigurationSetSendingEnabledAsync(
            UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetSendingEnabledRequest, UpdateConfigurationSetSendingEnabledResult> asyncHandler);

    /**
     * <p>
     * Modifies an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateConfigurationSetTrackingOptionsRequest
     *        Represents a request to update the tracking options for a configuration set.
     * @return A Java Future containing the result of the UpdateConfigurationSetTrackingOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetTrackingOptionsResult> updateConfigurationSetTrackingOptionsAsync(
            UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest);

    /**
     * <p>
     * Modifies an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateConfigurationSetTrackingOptionsRequest
     *        Represents a request to update the tracking options for a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationSetTrackingOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetTrackingOptionsResult> updateConfigurationSetTrackingOptionsAsync(
            UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetTrackingOptionsRequest, UpdateConfigurationSetTrackingOptionsResult> asyncHandler);

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest
     *        Represents a request to update an existing custom verification email template.
     * @return A Java Future containing the result of the UpdateCustomVerificationEmailTemplate operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomVerificationEmailTemplateResult> updateCustomVerificationEmailTemplateAsync(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest);

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest
     *        Represents a request to update an existing custom verification email template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCustomVerificationEmailTemplate operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomVerificationEmailTemplateResult> updateCustomVerificationEmailTemplateAsync(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomVerificationEmailTemplateRequest, UpdateCustomVerificationEmailTemplateResult> asyncHandler);

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
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest
     *        Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the UpdateReceiptRule operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateReceiptRule" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(UpdateReceiptRuleRequest updateReceiptRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler);

    /**
     * <p>
     * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest);

    /**
     * <p>
     * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsyncHandler.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are character strings that represent your domain's
     * identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     * Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email
     * originating from that domain.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the <code>SetIdentityDkimEnabled</code> operation.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainDkim" target="_top">AWS API
     *      Documentation</a>
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
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the <code>SetIdentityDkimEnabled</code> operation.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainDkim" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest verifyDomainDkimRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler);

    /**
     * <p>
     * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to
     * verify it. For more information about verifying domains, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest verifyDomainIdentityRequest);

    /**
     * <p>
     * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to
     * verify it. For more information about verifying domains, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler);

    /**
     * <p>
     * Deprecated. Use the <code>VerifyEmailIdentity</code> operation to verify a new email address.
     * </p>
     * 
     * @param verifyEmailAddressRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the VerifyEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest);

    /**
     * <p>
     * Deprecated. Use the <code>VerifyEmailIdentity</code> operation to verify a new email address.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailAddressRequest, VerifyEmailAddressResult> asyncHandler);

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and
     * attempts to verify it. As a result of executing this operation, a verification email is sent to the specified
     * address.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @return A Java Future containing the result of the VerifyEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceAsync.VerifyEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest verifyEmailIdentityRequest);

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and
     * attempts to verify it. As a result of executing this operation, a verification email is sent to the specified
     * address.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler);

}
