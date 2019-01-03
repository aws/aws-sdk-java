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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters;

/**
 * Interface for accessing Amazon SES.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpleemail.AbstractAmazonSimpleEmailService} instead.
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
public interface AmazonSimpleEmailService {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "email";

    /**
     * Overrides the default endpoint for this client ("https://email.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "email.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://email.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "email.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://email.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonSimpleEmailService#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the CloneReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CloneReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CloneReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    CloneReceiptRuleSetResult cloneReceiptRuleSet(CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest);

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
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws ConfigurationSetAlreadyExistsException
     *         Indicates that the configuration set could not be created because of a naming conflict.
     * @throws InvalidConfigurationSetException
     *         Indicates that the configuration set is invalid. See the error message for details.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest);

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
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws EventDestinationAlreadyExistsException
     *         Indicates that the event destination could not be created because of a naming conflict.
     * @throws InvalidCloudWatchDestinationException
     *         Indicates that the Amazon CloudWatch destination is invalid. See the error message for details.
     * @throws InvalidFirehoseDestinationException
     *         Indicates that the Amazon Kinesis Firehose destination is invalid. See the error message for details.
     * @throws InvalidSNSDestinationException
     *         Indicates that the Amazon Simple Notification Service (Amazon SNS) destination is invalid. See the error
     *         message for details.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

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
     * @return Result of the CreateConfigurationSetTrackingOptions operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TrackingOptionsAlreadyExistsException
     *         Indicates that the configuration set you specified already contains a TrackingOptions object.
     * @throws InvalidTrackingOptionsException
     *         Indicates that the custom domain to be used for open and click tracking redirects is invalid. This error
     *         appears most often in the following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not verified in Amazon SES.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not a valid domain or subdomain.
     *         </p>
     *         </li>
     * @sample AmazonSimpleEmailService.CreateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetTrackingOptionsResult createConfigurationSetTrackingOptions(
            CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest);

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
     * @return Result of the CreateCustomVerificationEmailTemplate operation returned by the service.
     * @throws CustomVerificationEmailTemplateAlreadyExistsException
     *         Indicates that a custom verification email template with the name you specified already exists.
     * @throws FromEmailAddressNotVerifiedException
     *         Indicates that the sender address specified for a custom verification email is not verified, and is
     *         therefore not eligible to send the custom verification email.
     * @throws CustomVerificationEmailInvalidContentException
     *         Indicates that custom verification email template provided content is invalid.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomVerificationEmailTemplateResult createCustomVerificationEmailTemplate(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest);

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
     * @return Result of the CreateReceiptFilter operation returned by the service.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @sample AmazonSimpleEmailService.CreateReceiptFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptFilter" target="_top">AWS API
     *      Documentation</a>
     */
    CreateReceiptFilterResult createReceiptFilter(CreateReceiptFilterRequest createReceiptFilterRequest);

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
     * @return Result of the CreateReceiptRule operation returned by the service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the
     *         topic, possibly due to permissions issues. For information about giving permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS encryption key is invalid, or that Amazon SES
     *         could not publish to the bucket, possibly due to permissions issues. For information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or that Amazon SES could not execute the
     *         provided function, possibly due to permissions issues. For information about giving permissions, see the
     *         <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest createReceiptRuleRequest);

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
     * @return Result of the CreateReceiptRuleSet operation returned by the service.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateReceiptRuleSetResult createReceiptRuleSet(CreateReceiptRuleSetRequest createReceiptRuleSetRequest);

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
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws InvalidTemplateException
     *         Indicates that the template that you specified could not be rendered. This issue may occur when a
     *         template refers to a partial that does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest);

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
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

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
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws EventDestinationDoesNotExistException
     *         Indicates that the event destination does not exist.
     * @sample AmazonSimpleEmailService.DeleteConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

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
     * @return Result of the DeleteConfigurationSetTrackingOptions operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TrackingOptionsDoesNotExistException
     *         Indicates that the TrackingOptions object you specified does not exist.
     * @sample AmazonSimpleEmailService.DeleteConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetTrackingOptionsResult deleteConfigurationSetTrackingOptions(
            DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest);

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
     * @return Result of the DeleteCustomVerificationEmailTemplate operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomVerificationEmailTemplateResult deleteCustomVerificationEmailTemplate(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest);

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
     * @return Result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIdentityResult deleteIdentity(DeleteIdentityRequest deleteIdentityRequest);

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
     * @return Result of the DeleteIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIdentityPolicyResult deleteIdentityPolicy(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest);

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
     * @return Result of the DeleteReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteReceiptFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReceiptFilterResult deleteReceiptFilter(DeleteReceiptFilterRequest deleteReceiptFilterRequest);

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
     * @return Result of the DeleteReceiptRule operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DeleteReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReceiptRuleResult deleteReceiptRule(DeleteReceiptRuleRequest deleteReceiptRuleRequest);

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
     * @return Result of the DeleteReceiptRuleSet operation returned by the service.
     * @throws CannotDeleteException
     *         Indicates that the delete operation could not be completed.
     * @sample AmazonSimpleEmailService.DeleteReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReceiptRuleSetResult deleteReceiptRuleSet(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest);

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
     * @return Result of the DeleteTemplate operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest);

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email addresses and domains.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request to delete an email address from the list of email addresses you have attempted to
     *        verify under your AWS account.
     * @return Result of the DeleteVerifiedEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteVerifiedEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteVerifiedEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVerifiedEmailAddressResult deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest);

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
     * @return Result of the DescribeActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailService.DescribeActiveReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeActiveReceiptRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest);

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
     * @return Result of the DescribeConfigurationSet operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.DescribeConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeConfigurationSetResult describeConfigurationSet(DescribeConfigurationSetRequest describeConfigurationSetRequest);

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
     * @return Result of the DescribeReceiptRule operation returned by the service.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeReceiptRuleResult describeReceiptRule(DescribeReceiptRuleRequest describeReceiptRuleRequest);

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
     * @return Result of the DescribeReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest);

    /**
     * <p>
     * Returns the email sending status of the Amazon SES account for the current region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @return Result of the GetAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.GetAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetAccountSendingEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccountSendingEnabledResult getAccountSendingEnabled(GetAccountSendingEnabledRequest getAccountSendingEnabledRequest);

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
     * @return Result of the GetCustomVerificationEmailTemplate operation returned by the service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     *         Indicates that a custom verification email template with the name you specified does not exist.
     * @sample AmazonSimpleEmailService.GetCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplate(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest);

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
     * @return Result of the GetIdentityDkimAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityDkimAttributesResult getIdentityDkimAttributes(GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest);

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
     * @return Result of the GetIdentityMailFromDomainAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityMailFromDomainAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityMailFromDomainAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityMailFromDomainAttributesResult getIdentityMailFromDomainAttributes(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest);

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
     * @return Result of the GetIdentityNotificationAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityNotificationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest);

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
     * @return Result of the GetIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    GetIdentityPoliciesResult getIdentityPolicies(GetIdentityPoliciesRequest getIdentityPoliciesRequest);

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
     * @return Result of the GetIdentityVerificationAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityVerificationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityVerificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest);

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return Result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailService.GetSendQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendQuota" target="_top">AWS API
     *      Documentation</a>
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
     * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the
     * last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of
     * time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return Result of the GetSendStatistics operation returned by the service.
     * @sample AmazonSimpleEmailService.GetSendStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    GetSendStatisticsResult getSendStatistics(GetSendStatisticsRequest getSendStatisticsRequest);

    /**
     * Simplified method form for invoking the GetSendStatistics operation.
     *
     * @see #getSendStatistics(GetSendStatisticsRequest)
     */
    GetSendStatisticsResult getSendStatistics();

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
     * @return Result of the GetTemplate operation returned by the service.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @sample AmazonSimpleEmailService.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest);

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
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailService.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest);

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
     * @return Result of the ListCustomVerificationEmailTemplates operation returned by the service.
     * @sample AmazonSimpleEmailService.ListCustomVerificationEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListCustomVerificationEmailTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomVerificationEmailTemplatesResult listCustomVerificationEmailTemplates(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest);

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
     * @return Result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailService.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentities" target="_top">AWS API
     *      Documentation</a>
     */
    ListIdentitiesResult listIdentities(ListIdentitiesRequest listIdentitiesRequest);

    /**
     * Simplified method form for invoking the ListIdentities operation.
     *
     * @see #listIdentities(ListIdentitiesRequest)
     */
    ListIdentitiesResult listIdentities();

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
     * @return Result of the ListIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailService.ListIdentityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    ListIdentityPoliciesResult listIdentityPolicies(ListIdentityPoliciesRequest listIdentityPoliciesRequest);

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
     * @return Result of the ListReceiptFilters operation returned by the service.
     * @sample AmazonSimpleEmailService.ListReceiptFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListReceiptFiltersResult listReceiptFilters(ListReceiptFiltersRequest listReceiptFiltersRequest);

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
     * @return Result of the ListReceiptRuleSets operation returned by the service.
     * @sample AmazonSimpleEmailService.ListReceiptRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListReceiptRuleSetsResult listReceiptRuleSets(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest);

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @sample AmazonSimpleEmailService.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the email addresses and domains associated with
     * your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return Result of the ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailService.ListVerifiedEmailAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListVerifiedEmailAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest);

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses operation.
     *
     * @see #listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest)
     */
    ListVerifiedEmailAddressesResult listVerifiedEmailAddresses();

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
     * @return Result of the PutIdentityPolicy operation returned by the service.
     * @throws InvalidPolicyException
     *         Indicates that the provided policy is invalid. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.PutIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/PutIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutIdentityPolicyResult putIdentityPolicy(PutIdentityPolicyRequest putIdentityPolicyRequest);

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
     * @return Result of the ReorderReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.ReorderReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReorderReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    ReorderReceiptRuleSetResult reorderReceiptRuleSet(ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest);

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
     * @return Result of the SendBounce operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @sample AmazonSimpleEmailService.SendBounce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBounce" target="_top">AWS API
     *      Documentation</a>
     */
    SendBounceResult sendBounce(SendBounceRequest sendBounceRequest);

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
     * @return Result of the SendBulkTemplatedEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendBulkTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBulkTemplatedEmail" target="_top">AWS
     *      API Documentation</a>
     */
    SendBulkTemplatedEmailResult sendBulkTemplatedEmail(SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest);

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
     * @return Result of the SendCustomVerificationEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     *         Indicates that a custom verification email template with the name you specified does not exist.
     * @throws FromEmailAddressNotVerifiedException
     *         Indicates that the sender address specified for a custom verification email is not verified, and is
     *         therefore not eligible to send the custom verification email.
     * @throws ProductionAccessNotGrantedException
     *         Indicates that the account has not been granted production access.
     * @sample AmazonSimpleEmailService.SendCustomVerificationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendCustomVerificationEmail"
     *      target="_top">AWS API Documentation</a>
     */
    SendCustomVerificationEmailResult sendCustomVerificationEmail(SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest);

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
     * @return Result of the SendEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    SendEmailResult sendEmail(SendEmailRequest sendEmailRequest);

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
     * @return Result of the SendRawEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendRawEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendRawEmail" target="_top">AWS API
     *      Documentation</a>
     */
    SendRawEmailResult sendRawEmail(SendRawEmailRequest sendRawEmailRequest);

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
     * @return Result of the SendTemplatedEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendTemplatedEmail" target="_top">AWS API
     *      Documentation</a>
     */
    SendTemplatedEmailResult sendTemplatedEmail(SendTemplatedEmailRequest sendTemplatedEmailRequest);

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
     * @return Result of the SetActiveReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.SetActiveReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetActiveReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest);

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
     * @return Result of the SetIdentityDkimEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityDkimEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityDkimEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    SetIdentityDkimEnabledResult setIdentityDkimEnabled(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest);

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
     * @return Result of the SetIdentityFeedbackForwardingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityFeedbackForwardingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityFeedbackForwardingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest);

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
     * @return Result of the SetIdentityHeadersInNotificationsEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityHeadersInNotificationsEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityHeadersInNotificationsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    SetIdentityHeadersInNotificationsEnabledResult setIdentityHeadersInNotificationsEnabled(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest);

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
     * @return Result of the SetIdentityMailFromDomain operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityMailFromDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityMailFromDomain"
     *      target="_top">AWS API Documentation</a>
     */
    SetIdentityMailFromDomainResult setIdentityMailFromDomain(SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest);

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
     * @return Result of the SetIdentityNotificationTopic operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityNotificationTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityNotificationTopic"
     *      target="_top">AWS API Documentation</a>
     */
    SetIdentityNotificationTopicResult setIdentityNotificationTopic(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest);

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
     * @return Result of the SetReceiptRulePosition operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.SetReceiptRulePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetReceiptRulePosition" target="_top">AWS
     *      API Documentation</a>
     */
    SetReceiptRulePositionResult setReceiptRulePosition(SetReceiptRulePositionRequest setReceiptRulePositionRequest);

    /**
     * <p>
     * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderTemplateRequest
     * @return Result of the TestRenderTemplate operation returned by the service.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws InvalidRenderingParameterException
     *         Indicates that one or more of the replacement values you provided is invalid. This error may occur when
     *         the TemplateData object contains invalid JSON.
     * @throws MissingRenderingAttributeException
     *         Indicates that one or more of the replacement values for the specified template was not specified. Ensure
     *         that the TemplateData object contains references to all of the replacement tags in the specified
     *         template.
     * @sample AmazonSimpleEmailService.TestRenderTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TestRenderTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    TestRenderTemplateResult testRenderTemplate(TestRenderTemplateRequest testRenderTemplateRequest);

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
     * @return Result of the UpdateAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.UpdateAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateAccountSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountSendingEnabledResult updateAccountSendingEnabled(UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest);

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
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws EventDestinationDoesNotExistException
     *         Indicates that the event destination does not exist.
     * @throws InvalidCloudWatchDestinationException
     *         Indicates that the Amazon CloudWatch destination is invalid. See the error message for details.
     * @throws InvalidFirehoseDestinationException
     *         Indicates that the Amazon Kinesis Firehose destination is invalid. See the error message for details.
     * @throws InvalidSNSDestinationException
     *         Indicates that the Amazon Simple Notification Service (Amazon SNS) destination is invalid. See the error
     *         message for details.
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

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
     * @return Result of the UpdateConfigurationSetReputationMetricsEnabled operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetReputationMetricsEnabled
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetReputationMetricsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetReputationMetricsEnabledResult updateConfigurationSetReputationMetricsEnabled(
            UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest);

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
     * @return Result of the UpdateConfigurationSetSendingEnabled operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(
            UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest);

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
     * @return Result of the UpdateConfigurationSetTrackingOptions operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TrackingOptionsDoesNotExistException
     *         Indicates that the TrackingOptions object you specified does not exist.
     * @throws InvalidTrackingOptionsException
     *         Indicates that the custom domain to be used for open and click tracking redirects is invalid. This error
     *         appears most often in the following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not verified in Amazon SES.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not a valid domain or subdomain.
     *         </p>
     *         </li>
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetTrackingOptionsResult updateConfigurationSetTrackingOptions(
            UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest);

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
     * @return Result of the UpdateCustomVerificationEmailTemplate operation returned by the service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     *         Indicates that a custom verification email template with the name you specified does not exist.
     * @throws FromEmailAddressNotVerifiedException
     *         Indicates that the sender address specified for a custom verification email is not verified, and is
     *         therefore not eligible to send the custom verification email.
     * @throws CustomVerificationEmailInvalidContentException
     *         Indicates that custom verification email template provided content is invalid.
     * @sample AmazonSimpleEmailService.UpdateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCustomVerificationEmailTemplateResult updateCustomVerificationEmailTemplate(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest);

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
     * @return Result of the UpdateReceiptRule operation returned by the service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the
     *         topic, possibly due to permissions issues. For information about giving permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS encryption key is invalid, or that Amazon SES
     *         could not publish to the bucket, possibly due to permissions issues. For information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or that Amazon SES could not execute the
     *         provided function, possibly due to permissions issues. For information about giving permissions, see the
     *         <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.UpdateReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest updateReceiptRuleRequest);

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
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws InvalidTemplateException
     *         Indicates that the template that you specified could not be rendered. This issue may occur when a
     *         template refers to a partial that does not exist.
     * @sample AmazonSimpleEmailService.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest);

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
     * @return Result of the VerifyDomainDkim operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyDomainDkim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainDkim" target="_top">AWS API
     *      Documentation</a>
     */
    VerifyDomainDkimResult verifyDomainDkim(VerifyDomainDkimRequest verifyDomainDkimRequest);

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
     * @return Result of the VerifyDomainIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyDomainIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    VerifyDomainIdentityResult verifyDomainIdentity(VerifyDomainIdentityRequest verifyDomainIdentityRequest);

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
     * @return Result of the VerifyEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailAddress" target="_top">AWS API
     *      Documentation</a>
     */
    VerifyEmailAddressResult verifyEmailAddress(VerifyEmailAddressRequest verifyEmailAddressRequest);

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
     * @return Result of the VerifyEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    VerifyEmailIdentityResult verifyEmailIdentity(VerifyEmailIdentityRequest verifyEmailIdentityRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonSimpleEmailServiceWaiters waiters();

}
