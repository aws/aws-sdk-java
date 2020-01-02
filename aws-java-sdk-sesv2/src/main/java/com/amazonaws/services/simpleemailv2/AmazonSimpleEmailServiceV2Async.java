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
package com.amazonaws.services.simpleemailv2;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;

/**
 * Interface for accessing Amazon SES V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpleemailv2.AbstractAmazonSimpleEmailServiceV2Async} instead.
 * </p>
 * <p>
 * <fullname>Amazon SES API v2</fullname>
 * <p>
 * Welcome to the Amazon SES API v2 Reference. This guide provides information about the Amazon SES API v2, including
 * supported operations, data types, parameters, and schemas.
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/pinpoint">Amazon SES</a> is an AWS service that you can use to send email messages to
 * your customers.
 * </p>
 * <p>
 * If you're new to Amazon SES API v2, you might find it helpful to also review the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/">Amazon Simple Email Service Developer Guide</a>. The
 * <i>Amazon SES Developer Guide</i> provides information and code samples that demonstrate how to use Amazon SES API v2
 * features programmatically.
 * </p>
 * <p>
 * The Amazon SES API v2 is available in several AWS Regions and it provides an endpoint for each of these Regions. For
 * a list of all the Regions and endpoints where the API is currently available, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region">AWS Service Endpoints</a> in the <i>Amazon
 * Web Services General Reference</i>. To learn more about AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>Amazon Web
 * Services General Reference</i>.
 * </p>
 * <p>
 * In each Region, AWS maintains multiple Availability Zones. These Availability Zones are physically isolated from each
 * other, but are united by private, low-latency, high-throughput, and highly redundant network connections. These
 * Availability Zones enable us to provide very high levels of availability and redundancy, while also minimizing
 * latency. To learn more about the number of Availability Zones that are available in each Region, see <a
 * href="http://aws.amazon.com/about-aws/global-infrastructure/">AWS Global Infrastructure</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSimpleEmailServiceV2Async extends AmazonSimpleEmailServiceV2 {

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails that
     * you send. You apply a configuration set to an email by specifying the name of the configuration set when you call
     * the Amazon SES API v2. When you apply a configuration set to an email, all of the rules in that configuration set
     * are applied to the email.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        A request to create a configuration set.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest);

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails that
     * you send. You apply a configuration set to an email by specifying the name of the configuration set when you call
     * the Amazon SES API v2. When you apply a configuration set to an email, all of the rules in that configuration set
     * are applied to the email.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        A request to create a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Create an event destination. <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and
     * complaints. <i>Event destinations</i> are places that you can send information about these events to. For
     * example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints,
     * or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * <p>
     * A single configuration set can include more than one event destination.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        A request to add an event destination to a configuration set.
     * @return A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2Async.CreateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Create an event destination. <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and
     * complaints. <i>Event destinations</i> are places that you can send information about these events to. For
     * example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints,
     * or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * <p>
     * A single configuration set can include more than one event destination.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        A request to add an event destination to a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.CreateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your AWS account. You can associate a pool with a configuration set. When you send an email that
     * uses that configuration set, the message is sent from one of the addresses in the associated pool.
     * </p>
     * 
     * @param createDedicatedIpPoolRequest
     *        A request to create a new dedicated IP pool.
     * @return A Java Future containing the result of the CreateDedicatedIpPool operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest);

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your AWS account. You can associate a pool with a configuration set. When you send an email that
     * uses that configuration set, the message is sent from one of the addresses in the associated pool.
     * </p>
     * 
     * @param createDedicatedIpPoolRequest
     *        A request to create a new dedicated IP pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDedicatedIpPool operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDedicatedIpPoolRequest, CreateDedicatedIpPoolResult> asyncHandler);

    /**
     * <p>
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
     * messages will be handled by various email providers around the world. When you perform a predictive inbox
     * placement test, you provide a sample message that contains the content that you plan to send to your customers.
     * Amazon SES then sends that message to special email addresses spread across several major email providers. After
     * about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to
     * view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. We send that message to special email addresses spread across several major email
     *        providers around the world. The test takes about 24 hours to complete. When the test is complete, you can
     *        use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
     * @return A Java Future containing the result of the CreateDeliverabilityTestReport operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(
            CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest);

    /**
     * <p>
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
     * messages will be handled by various email providers around the world. When you perform a predictive inbox
     * placement test, you provide a sample message that contains the content that you plan to send to your customers.
     * Amazon SES then sends that message to special email addresses spread across several major email providers. After
     * about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to
     * view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. We send that message to special email addresses spread across several major email
     *        providers around the world. The test takes about 24 hours to complete. When the test is complete, you can
     *        use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeliverabilityTestReport operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(
            CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeliverabilityTestReportRequest, CreateDeliverabilityTestReportResult> asyncHandler);

    /**
     * <p>
     * Starts the process of verifying an email identity. An <i>identity</i> is an email address or domain that you use
     * when you send email. Before you can use an identity to send email, you first have to verify it. By verifying an
     * identity, you demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2
     * permission to send email from the identity.
     * </p>
     * <p>
     * When you verify an email address, Amazon SES sends an email to the address. Your email address is verified as
     * soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain without specifying the <code>DkimSigningAttributes</code> object, this operation
     * provides a set of DKIM tokens. You can convert these tokens into CNAME records, which you then add to the DNS
     * configuration for your domain. Your domain is verified when Amazon SES detects these records in the DNS
     * configuration for your domain. This verification method is known as <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * Alternatively, you can perform the verification process by providing your own public-private key pair. This
     * verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your call to the
     * <code>CreateEmailIdentity</code> operation has to include the <code>DkimSigningAttributes</code> object. When you
     * specify this object, you provide a selector (a component of the DNS record name that identifies the public key
     * that you want to use for DKIM authentication) and a private key.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @return A Java Future containing the result of the CreateEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(CreateEmailIdentityRequest createEmailIdentityRequest);

    /**
     * <p>
     * Starts the process of verifying an email identity. An <i>identity</i> is an email address or domain that you use
     * when you send email. Before you can use an identity to send email, you first have to verify it. By verifying an
     * identity, you demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2
     * permission to send email from the identity.
     * </p>
     * <p>
     * When you verify an email address, Amazon SES sends an email to the address. Your email address is verified as
     * soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain without specifying the <code>DkimSigningAttributes</code> object, this operation
     * provides a set of DKIM tokens. You can convert these tokens into CNAME records, which you then add to the DNS
     * configuration for your domain. Your domain is verified when Amazon SES detects these records in the DNS
     * configuration for your domain. This verification method is known as <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * Alternatively, you can perform the verification process by providing your own public-private key pair. This
     * verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your call to the
     * <code>CreateEmailIdentity</code> operation has to include the <code>DkimSigningAttributes</code> object. When you
     * specify this object, you provide a selector (a component of the DNS record name that identifies the public key
     * that you want to use for DKIM authentication) and a private key.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(CreateEmailIdentityRequest createEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEmailIdentityRequest, CreateEmailIdentityResult> asyncHandler);

    /**
     * <p>
     * Delete an existing configuration set.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        A request to delete a configuration set.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * <p>
     * Delete an existing configuration set.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        A request to delete a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Delete an event destination.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        A request to delete an event destination from a configuration set.
     * @return A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2Async.DeleteConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Delete an event destination.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        A request to delete an event destination from a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.DeleteConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Delete a dedicated IP pool.
     * </p>
     * 
     * @param deleteDedicatedIpPoolRequest
     *        A request to delete a dedicated IP pool.
     * @return A Java Future containing the result of the DeleteDedicatedIpPool operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(DeleteDedicatedIpPoolRequest deleteDedicatedIpPoolRequest);

    /**
     * <p>
     * Delete a dedicated IP pool.
     * </p>
     * 
     * @param deleteDedicatedIpPoolRequest
     *        A request to delete a dedicated IP pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDedicatedIpPool operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(DeleteDedicatedIpPoolRequest deleteDedicatedIpPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDedicatedIpPoolRequest, DeleteDedicatedIpPoolResult> asyncHandler);

    /**
     * <p>
     * Deletes an email identity. An identity can be either an email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to send
     *        email from that identity. You can restore your ability to send email by completing the verification
     *        process for the identity again.
     * @return A Java Future containing the result of the DeleteEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(DeleteEmailIdentityRequest deleteEmailIdentityRequest);

    /**
     * <p>
     * Deletes an email identity. An identity can be either an email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to send
     *        email from that identity. You can restore your ability to send email by completing the verification
     *        process for the identity again.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(DeleteEmailIdentityRequest deleteEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEmailIdentityRequest, DeleteEmailIdentityResult> asyncHandler);

    /**
     * <p>
     * Removes an email address from the suppression list for your account.
     * </p>
     * 
     * @param deleteSuppressedDestinationRequest
     *        A request to remove an email address from the suppression list for your account.
     * @return A Java Future containing the result of the DeleteSuppressedDestination operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.DeleteSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteSuppressedDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSuppressedDestinationResult> deleteSuppressedDestinationAsync(
            DeleteSuppressedDestinationRequest deleteSuppressedDestinationRequest);

    /**
     * <p>
     * Removes an email address from the suppression list for your account.
     * </p>
     * 
     * @param deleteSuppressedDestinationRequest
     *        A request to remove an email address from the suppression list for your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSuppressedDestination operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.DeleteSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteSuppressedDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSuppressedDestinationResult> deleteSuppressedDestinationAsync(
            DeleteSuppressedDestinationRequest deleteSuppressedDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSuppressedDestinationRequest, DeleteSuppressedDestinationResult> asyncHandler);

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon SES account in the current AWS
     * Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon SES account.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon SES account in the current AWS
     * Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon SES account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * </p>
     * 
     * @param getBlacklistReportsRequest
     *        A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * @return A Java Future containing the result of the GetBlacklistReports operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetBlacklistReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(GetBlacklistReportsRequest getBlacklistReportsRequest);

    /**
     * <p>
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * </p>
     * 
     * @param getBlacklistReportsRequest
     *        A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlacklistReports operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetBlacklistReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(GetBlacklistReportsRequest getBlacklistReportsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlacklistReportsRequest, GetBlacklistReportsResult> asyncHandler);

    /**
     * <p>
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
     * whether or not it's enabled for sending email, and more.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param getConfigurationSetRequest
     *        A request to obtain information about a configuration set.
     * @return A Java Future containing the result of the GetConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(GetConfigurationSetRequest getConfigurationSetRequest);

    /**
     * <p>
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
     * whether or not it's enabled for sending email, and more.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param getConfigurationSetRequest
     *        A request to obtain information about a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfigurationSet operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(GetConfigurationSetRequest getConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationSetRequest, GetConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of event destinations that are associated with a configuration set.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param getConfigurationSetEventDestinationsRequest
     *        A request to obtain information about the event destinations for a configuration set.
     * @return A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.GetConfigurationSetEventDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest);

    /**
     * <p>
     * Retrieve a list of event destinations that are associated with a configuration set.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param getConfigurationSetEventDestinationsRequest
     *        A request to obtain information about the event destinations for a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetConfigurationSetEventDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationSetEventDestinationsRequest, GetConfigurationSetEventDestinationsResult> asyncHandler);

    /**
     * <p>
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
     * with, as well information about the automatic warm-up process for the address.
     * </p>
     * 
     * @param getDedicatedIpRequest
     *        A request to obtain more information about a dedicated IP address.
     * @return A Java Future containing the result of the GetDedicatedIp operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(GetDedicatedIpRequest getDedicatedIpRequest);

    /**
     * <p>
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
     * with, as well information about the automatic warm-up process for the address.
     * </p>
     * 
     * @param getDedicatedIpRequest
     *        A request to obtain more information about a dedicated IP address.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDedicatedIp operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(GetDedicatedIpRequest getDedicatedIpRequest,
            com.amazonaws.handlers.AsyncHandler<GetDedicatedIpRequest, GetDedicatedIpResult> asyncHandler);

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your AWS account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @return A Java Future containing the result of the GetDedicatedIps operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(GetDedicatedIpsRequest getDedicatedIpsRequest);

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your AWS account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDedicatedIps operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(GetDedicatedIpsRequest getDedicatedIpsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDedicatedIpsRequest, GetDedicatedIpsResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about the status of the Deliverability dashboard for your account. When the Deliverability
     * dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you
     * use to send email. You also gain the ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        Retrieve information about the status of the Deliverability dashboard for your AWS account. When the
     *        Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for
     *        your domains. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @return A Java Future containing the result of the GetDeliverabilityDashboardOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityDashboardOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            GetDeliverabilityDashboardOptionsRequest getDeliverabilityDashboardOptionsRequest);

    /**
     * <p>
     * Retrieve information about the status of the Deliverability dashboard for your account. When the Deliverability
     * dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you
     * use to send email. You also gain the ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        Retrieve information about the status of the Deliverability dashboard for your AWS account. When the
     *        Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for
     *        your domains. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeliverabilityDashboardOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityDashboardOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            GetDeliverabilityDashboardOptionsRequest getDeliverabilityDashboardOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeliverabilityDashboardOptionsRequest, GetDeliverabilityDashboardOptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieve the results of a predictive inbox placement test.
     * </p>
     * 
     * @param getDeliverabilityTestReportRequest
     *        A request to retrieve the results of a predictive inbox placement test.
     * @return A Java Future containing the result of the GetDeliverabilityTestReport operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(
            GetDeliverabilityTestReportRequest getDeliverabilityTestReportRequest);

    /**
     * <p>
     * Retrieve the results of a predictive inbox placement test.
     * </p>
     * 
     * @param getDeliverabilityTestReportRequest
     *        A request to retrieve the results of a predictive inbox placement test.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeliverabilityTestReport operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(
            GetDeliverabilityTestReportRequest getDeliverabilityTestReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeliverabilityTestReportRequest, GetDeliverabilityTestReportResult> asyncHandler);

    /**
     * <p>
     * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
     * campaign sent email by using a domain that the Deliverability dashboard is enabled for.
     * </p>
     * 
     * @param getDomainDeliverabilityCampaignRequest
     *        Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only
     *        if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (
     *        <code>PutDeliverabilityDashboardOption</code> operation).
     * @return A Java Future containing the result of the GetDomainDeliverabilityCampaign operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.GetDomainDeliverabilityCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainDeliverabilityCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainDeliverabilityCampaignResult> getDomainDeliverabilityCampaignAsync(
            GetDomainDeliverabilityCampaignRequest getDomainDeliverabilityCampaignRequest);

    /**
     * <p>
     * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
     * campaign sent email by using a domain that the Deliverability dashboard is enabled for.
     * </p>
     * 
     * @param getDomainDeliverabilityCampaignRequest
     *        Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only
     *        if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (
     *        <code>PutDeliverabilityDashboardOption</code> operation).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainDeliverabilityCampaign operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetDomainDeliverabilityCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainDeliverabilityCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainDeliverabilityCampaignResult> getDomainDeliverabilityCampaignAsync(
            GetDomainDeliverabilityCampaignRequest getDomainDeliverabilityCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainDeliverabilityCampaignRequest, GetDomainDeliverabilityCampaignResult> asyncHandler);

    /**
     * <p>
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     * </p>
     * 
     * @param getDomainStatisticsReportRequest
     *        A request to obtain deliverability metrics for a domain.
     * @return A Java Future containing the result of the GetDomainStatisticsReport operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainStatisticsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(
            GetDomainStatisticsReportRequest getDomainStatisticsReportRequest);

    /**
     * <p>
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     * </p>
     * 
     * @param getDomainStatisticsReportRequest
     *        A request to obtain deliverability metrics for a domain.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainStatisticsReport operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainStatisticsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(
            GetDomainStatisticsReportRequest getDomainStatisticsReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainStatisticsReportRequest, GetDomainStatisticsReportResult> asyncHandler);

    /**
     * <p>
     * Provides information about a specific identity, including the identity's verification status, its DKIM
     * authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @return A Java Future containing the result of the GetEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(GetEmailIdentityRequest getEmailIdentityRequest);

    /**
     * <p>
     * Provides information about a specific identity, including the identity's verification status, its DKIM
     * authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(GetEmailIdentityRequest getEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<GetEmailIdentityRequest, GetEmailIdentityResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specific email address that's on the suppression list for your account.
     * </p>
     * 
     * @param getSuppressedDestinationRequest
     *        A request to retrieve information about an email address that's on the suppression list for your account.
     * @return A Java Future containing the result of the GetSuppressedDestination operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.GetSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSuppressedDestinationResult> getSuppressedDestinationAsync(GetSuppressedDestinationRequest getSuppressedDestinationRequest);

    /**
     * <p>
     * Retrieves information about a specific email address that's on the suppression list for your account.
     * </p>
     * 
     * @param getSuppressedDestinationRequest
     *        A request to retrieve information about an email address that's on the suppression list for your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSuppressedDestination operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.GetSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSuppressedDestinationResult> getSuppressedDestinationAsync(GetSuppressedDestinationRequest getSuppressedDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSuppressedDestinationRequest, GetSuppressedDestinationResult> asyncHandler);

    /**
     * <p>
     * List all of the configuration sets associated with your account in the current region.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon SES account in the current AWS Region.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * <p>
     * List all of the configuration sets associated with your account in the current region.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon SES account in the current AWS Region.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler);

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your AWS account in the current Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @return A Java Future containing the result of the ListDedicatedIpPools operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDedicatedIpPools" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(ListDedicatedIpPoolsRequest listDedicatedIpPoolsRequest);

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your AWS account in the current Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDedicatedIpPools operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDedicatedIpPools" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(ListDedicatedIpPoolsRequest listDedicatedIpPoolsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDedicatedIpPoolsRequest, ListDedicatedIpPoolsResult> asyncHandler);

    /**
     * <p>
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
     * predictive inbox placement tests that are complete, you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results.
     * </p>
     * 
     * @param listDeliverabilityTestReportsRequest
     *        A request to list all of the predictive inbox placement tests that you've performed.
     * @return A Java Future containing the result of the ListDeliverabilityTestReports operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDeliverabilityTestReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(
            ListDeliverabilityTestReportsRequest listDeliverabilityTestReportsRequest);

    /**
     * <p>
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
     * predictive inbox placement tests that are complete, you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results.
     * </p>
     * 
     * @param listDeliverabilityTestReportsRequest
     *        A request to list all of the predictive inbox placement tests that you've performed.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeliverabilityTestReports operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDeliverabilityTestReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(
            ListDeliverabilityTestReportsRequest listDeliverabilityTestReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeliverabilityTestReportsRequest, ListDeliverabilityTestReportsResult> asyncHandler);

    /**
     * <p>
     * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified
     * time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @param listDomainDeliverabilityCampaignsRequest
     *        Retrieve deliverability data for all the campaigns that used a specific domain to send email during a
     *        specified time range. This data is available for a domain only if you enabled the Deliverability
     *        dashboard.
     * @return A Java Future containing the result of the ListDomainDeliverabilityCampaigns operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.ListDomainDeliverabilityCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDomainDeliverabilityCampaigns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainDeliverabilityCampaignsResult> listDomainDeliverabilityCampaignsAsync(
            ListDomainDeliverabilityCampaignsRequest listDomainDeliverabilityCampaignsRequest);

    /**
     * <p>
     * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified
     * time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @param listDomainDeliverabilityCampaignsRequest
     *        Retrieve deliverability data for all the campaigns that used a specific domain to send email during a
     *        specified time range. This data is available for a domain only if you enabled the Deliverability
     *        dashboard.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainDeliverabilityCampaigns operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListDomainDeliverabilityCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDomainDeliverabilityCampaigns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainDeliverabilityCampaignsResult> listDomainDeliverabilityCampaignsAsync(
            ListDomainDeliverabilityCampaignsRequest listDomainDeliverabilityCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainDeliverabilityCampaignsRequest, ListDomainDeliverabilityCampaignsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your AWS account. An identity can be
     * either an email address or a domain. This operation returns identities that are verified as well as those that
     * aren't. This operation returns identities that are associated with Amazon SES and Amazon Pinpoint.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your AWS account. This list includes
     *        identities that you've already verified, identities that are unverified, and identities that were verified
     *        in the past, but are no longer verified.
     * @return A Java Future containing the result of the ListEmailIdentities operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListEmailIdentities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(ListEmailIdentitiesRequest listEmailIdentitiesRequest);

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your AWS account. An identity can be
     * either an email address or a domain. This operation returns identities that are verified as well as those that
     * aren't. This operation returns identities that are associated with Amazon SES and Amazon Pinpoint.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your AWS account. This list includes
     *        identities that you've already verified, identities that are unverified, and identities that were verified
     *        in the past, but are no longer verified.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEmailIdentities operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListEmailIdentities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(ListEmailIdentitiesRequest listEmailIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEmailIdentitiesRequest, ListEmailIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of email addresses that are on the suppression list for your account.
     * </p>
     * 
     * @param listSuppressedDestinationsRequest
     *        A request to obtain a list of email destinations that are on the suppression list for your account.
     * @return A Java Future containing the result of the ListSuppressedDestinations operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.ListSuppressedDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListSuppressedDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSuppressedDestinationsResult> listSuppressedDestinationsAsync(
            ListSuppressedDestinationsRequest listSuppressedDestinationsRequest);

    /**
     * <p>
     * Retrieves a list of email addresses that are on the suppression list for your account.
     * </p>
     * 
     * @param listSuppressedDestinationsRequest
     *        A request to obtain a list of email destinations that are on the suppression list for your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSuppressedDestinations operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListSuppressedDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListSuppressedDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSuppressedDestinationsResult> listSuppressedDestinationsAsync(
            ListSuppressedDestinationsRequest listSuppressedDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuppressedDestinationsRequest, ListSuppressedDestinationsResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     * </p>
     * 
     * @param putAccountDedicatedIpWarmupAttributesRequest
     *        A request to enable or disable the automatic IP address warm-up feature.
     * @return A Java Future containing the result of the PutAccountDedicatedIpWarmupAttributes operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2Async.PutAccountDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountDedicatedIpWarmupAttributesResult> putAccountDedicatedIpWarmupAttributesAsync(
            PutAccountDedicatedIpWarmupAttributesRequest putAccountDedicatedIpWarmupAttributesRequest);

    /**
     * <p>
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     * </p>
     * 
     * @param putAccountDedicatedIpWarmupAttributesRequest
     *        A request to enable or disable the automatic IP address warm-up feature.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountDedicatedIpWarmupAttributes operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutAccountDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountDedicatedIpWarmupAttributesResult> putAccountDedicatedIpWarmupAttributesAsync(
            PutAccountDedicatedIpWarmupAttributesRequest putAccountDedicatedIpWarmupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountDedicatedIpWarmupAttributesRequest, PutAccountDedicatedIpWarmupAttributesResult> asyncHandler);

    /**
     * <p>
     * Enable or disable the ability of your account to send email.
     * </p>
     * 
     * @param putAccountSendingAttributesRequest
     *        A request to change the ability of your account to send email.
     * @return A Java Future containing the result of the PutAccountSendingAttributes operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSendingAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(
            PutAccountSendingAttributesRequest putAccountSendingAttributesRequest);

    /**
     * <p>
     * Enable or disable the ability of your account to send email.
     * </p>
     * 
     * @param putAccountSendingAttributesRequest
     *        A request to change the ability of your account to send email.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountSendingAttributes operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSendingAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(
            PutAccountSendingAttributesRequest putAccountSendingAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountSendingAttributesRequest, PutAccountSendingAttributesResult> asyncHandler);

    /**
     * <p>
     * Change the settings for the account-level suppression list.
     * </p>
     * 
     * @param putAccountSuppressionAttributesRequest
     *        A request to change your account's suppression preferences.
     * @return A Java Future containing the result of the PutAccountSuppressionAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutAccountSuppressionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSuppressionAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSuppressionAttributesResult> putAccountSuppressionAttributesAsync(
            PutAccountSuppressionAttributesRequest putAccountSuppressionAttributesRequest);

    /**
     * <p>
     * Change the settings for the account-level suppression list.
     * </p>
     * 
     * @param putAccountSuppressionAttributesRequest
     *        A request to change your account's suppression preferences.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountSuppressionAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutAccountSuppressionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSuppressionAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSuppressionAttributesResult> putAccountSuppressionAttributesAsync(
            PutAccountSuppressionAttributesRequest putAccountSuppressionAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountSuppressionAttributesRequest, PutAccountSuppressionAttributesResult> asyncHandler);

    /**
     * <p>
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
     * dedicated IP addresses for sending specific types of email.
     * </p>
     * 
     * @param putConfigurationSetDeliveryOptionsRequest
     *        A request to associate a configuration set with a dedicated IP pool.
     * @return A Java Future containing the result of the PutConfigurationSetDeliveryOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutConfigurationSetDeliveryOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetDeliveryOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetDeliveryOptionsResult> putConfigurationSetDeliveryOptionsAsync(
            PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest);

    /**
     * <p>
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
     * dedicated IP addresses for sending specific types of email.
     * </p>
     * 
     * @param putConfigurationSetDeliveryOptionsRequest
     *        A request to associate a configuration set with a dedicated IP pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationSetDeliveryOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutConfigurationSetDeliveryOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetDeliveryOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetDeliveryOptionsResult> putConfigurationSetDeliveryOptionsAsync(
            PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationSetDeliveryOptionsRequest, PutConfigurationSetDeliveryOptionsResult> asyncHandler);

    /**
     * <p>
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
     * in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetReputationOptionsRequest
     *        A request to enable or disable tracking of reputation metrics for a configuration set.
     * @return A Java Future containing the result of the PutConfigurationSetReputationOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutConfigurationSetReputationOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetReputationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetReputationOptionsResult> putConfigurationSetReputationOptionsAsync(
            PutConfigurationSetReputationOptionsRequest putConfigurationSetReputationOptionsRequest);

    /**
     * <p>
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
     * in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetReputationOptionsRequest
     *        A request to enable or disable tracking of reputation metrics for a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationSetReputationOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutConfigurationSetReputationOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetReputationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetReputationOptionsResult> putConfigurationSetReputationOptionsAsync(
            PutConfigurationSetReputationOptionsRequest putConfigurationSetReputationOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationSetReputationOptionsRequest, PutConfigurationSetReputationOptionsResult> asyncHandler);

    /**
     * <p>
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetSendingOptionsRequest
     *        A request to enable or disable the ability of Amazon SES to send emails that use a specific configuration
     *        set.
     * @return A Java Future containing the result of the PutConfigurationSetSendingOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSendingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            PutConfigurationSetSendingOptionsRequest putConfigurationSetSendingOptionsRequest);

    /**
     * <p>
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetSendingOptionsRequest
     *        A request to enable or disable the ability of Amazon SES to send emails that use a specific configuration
     *        set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationSetSendingOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSendingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            PutConfigurationSetSendingOptionsRequest putConfigurationSetSendingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationSetSendingOptionsRequest, PutConfigurationSetSendingOptionsResult> asyncHandler);

    /**
     * <p>
     * Specify the account suppression list preferences for a configuration set.
     * </p>
     * 
     * @param putConfigurationSetSuppressionOptionsRequest
     *        A request to change the account suppression list preferences for a specific configuration set.
     * @return A Java Future containing the result of the PutConfigurationSetSuppressionOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2Async.PutConfigurationSetSuppressionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSuppressionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetSuppressionOptionsResult> putConfigurationSetSuppressionOptionsAsync(
            PutConfigurationSetSuppressionOptionsRequest putConfigurationSetSuppressionOptionsRequest);

    /**
     * <p>
     * Specify the account suppression list preferences for a configuration set.
     * </p>
     * 
     * @param putConfigurationSetSuppressionOptionsRequest
     *        A request to change the account suppression list preferences for a specific configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationSetSuppressionOptions operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutConfigurationSetSuppressionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSuppressionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetSuppressionOptionsResult> putConfigurationSetSuppressionOptionsAsync(
            PutConfigurationSetSuppressionOptionsRequest putConfigurationSetSuppressionOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationSetSuppressionOptionsRequest, PutConfigurationSetSuppressionOptionsResult> asyncHandler);

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send.
     * </p>
     * 
     * @param putConfigurationSetTrackingOptionsRequest
     *        A request to add a custom domain for tracking open and click events to a configuration set.
     * @return A Java Future containing the result of the PutConfigurationSetTrackingOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            PutConfigurationSetTrackingOptionsRequest putConfigurationSetTrackingOptionsRequest);

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send.
     * </p>
     * 
     * @param putConfigurationSetTrackingOptionsRequest
     *        A request to add a custom domain for tracking open and click events to a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationSetTrackingOptions operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            PutConfigurationSetTrackingOptionsRequest putConfigurationSetTrackingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationSetTrackingOptionsRequest, PutConfigurationSetTrackingOptionsResult> asyncHandler);

    /**
     * <p>
     * Move a dedicated IP address to an existing dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * The dedicated IP address that you specify must already exist, and must be associated with your AWS account.
     * </p>
     * <p>
     * The dedicated IP pool you specify must already exist. You can create a new pool by using the
     * <code>CreateDedicatedIpPool</code> operation.
     * </p>
     * </note>
     * 
     * @param putDedicatedIpInPoolRequest
     *        A request to move a dedicated IP address to a dedicated IP pool.
     * @return A Java Future containing the result of the PutDedicatedIpInPool operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpInPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(PutDedicatedIpInPoolRequest putDedicatedIpInPoolRequest);

    /**
     * <p>
     * Move a dedicated IP address to an existing dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * The dedicated IP address that you specify must already exist, and must be associated with your AWS account.
     * </p>
     * <p>
     * The dedicated IP pool you specify must already exist. You can create a new pool by using the
     * <code>CreateDedicatedIpPool</code> operation.
     * </p>
     * </note>
     * 
     * @param putDedicatedIpInPoolRequest
     *        A request to move a dedicated IP address to a dedicated IP pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDedicatedIpInPool operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpInPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(PutDedicatedIpInPoolRequest putDedicatedIpInPoolRequest,
            com.amazonaws.handlers.AsyncHandler<PutDedicatedIpInPoolRequest, PutDedicatedIpInPoolResult> asyncHandler);

    /**
     * <p/>
     * 
     * @param putDedicatedIpWarmupAttributesRequest
     *        A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you
     *        want to resume the warm-up process for an existing IP address.
     * @return A Java Future containing the result of the PutDedicatedIpWarmupAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(
            PutDedicatedIpWarmupAttributesRequest putDedicatedIpWarmupAttributesRequest);

    /**
     * <p/>
     * 
     * @param putDedicatedIpWarmupAttributesRequest
     *        A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you
     *        want to resume the warm-up process for an existing IP address.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDedicatedIpWarmupAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(
            PutDedicatedIpWarmupAttributesRequest putDedicatedIpWarmupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutDedicatedIpWarmupAttributesRequest, PutDedicatedIpWarmupAttributesResult> asyncHandler);

    /**
     * <p>
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
     * reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the
     * ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain
     *        access to reputation, deliverability, and other metrics for the domains that you use to send email using
     *        Amazon SES API v2. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @return A Java Future containing the result of the PutDeliverabilityDashboardOption operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDeliverabilityDashboardOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            PutDeliverabilityDashboardOptionRequest putDeliverabilityDashboardOptionRequest);

    /**
     * <p>
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
     * reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the
     * ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain
     *        access to reputation, deliverability, and other metrics for the domains that you use to send email using
     *        Amazon SES API v2. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDeliverabilityDashboardOption operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDeliverabilityDashboardOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            PutDeliverabilityDashboardOptionRequest putDeliverabilityDashboardOptionRequest,
            com.amazonaws.handlers.AsyncHandler<PutDeliverabilityDashboardOptionRequest, PutDeliverabilityDashboardOptionResult> asyncHandler);

    /**
     * <p>
     * Used to enable or disable DKIM authentication for an email identity.
     * </p>
     * 
     * @param putEmailIdentityDkimAttributesRequest
     *        A request to enable or disable DKIM signing of email that you send from an email identity.
     * @return A Java Future containing the result of the PutEmailIdentityDkimAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(
            PutEmailIdentityDkimAttributesRequest putEmailIdentityDkimAttributesRequest);

    /**
     * <p>
     * Used to enable or disable DKIM authentication for an email identity.
     * </p>
     * 
     * @param putEmailIdentityDkimAttributesRequest
     *        A request to enable or disable DKIM signing of email that you send from an email identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEmailIdentityDkimAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(
            PutEmailIdentityDkimAttributesRequest putEmailIdentityDkimAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailIdentityDkimAttributesRequest, PutEmailIdentityDkimAttributesResult> asyncHandler);

    /**
     * <p>
     * Used to configure or change the DKIM authentication settings for an email domain identity. You can use this
     * operation to do any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using Easy DKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using Easy DKIM to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using BYODKIM to using Easy DKIM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putEmailIdentityDkimSigningAttributesRequest
     *        A request to change the DKIM attributes for an email identity.
     * @return A Java Future containing the result of the PutEmailIdentityDkimSigningAttributes operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2Async.PutEmailIdentityDkimSigningAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimSigningAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityDkimSigningAttributesResult> putEmailIdentityDkimSigningAttributesAsync(
            PutEmailIdentityDkimSigningAttributesRequest putEmailIdentityDkimSigningAttributesRequest);

    /**
     * <p>
     * Used to configure or change the DKIM authentication settings for an email domain identity. You can use this
     * operation to do any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using Easy DKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using Easy DKIM to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using BYODKIM to using Easy DKIM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putEmailIdentityDkimSigningAttributesRequest
     *        A request to change the DKIM attributes for an email identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEmailIdentityDkimSigningAttributes operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutEmailIdentityDkimSigningAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimSigningAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityDkimSigningAttributesResult> putEmailIdentityDkimSigningAttributesAsync(
            PutEmailIdentityDkimSigningAttributesRequest putEmailIdentityDkimSigningAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailIdentityDkimSigningAttributesRequest, PutEmailIdentityDkimSigningAttributesResult> asyncHandler);

    /**
     * <p>
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
     * identity is used to send an email that results in a bounce or complaint event.
     * </p>
     * <p>
     * If the value is <code>true</code>, you receive email notifications when bounce or complaint events occur. These
     * notifications are sent to the address that you specified in the <code>Return-Path</code> header of the original
     * email.
     * </p>
     * <p>
     * You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for
     * receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an
     * email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param putEmailIdentityFeedbackAttributesRequest
     *        A request to set the attributes that control how bounce and complaint events are processed.
     * @return A Java Future containing the result of the PutEmailIdentityFeedbackAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutEmailIdentityFeedbackAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityFeedbackAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityFeedbackAttributesResult> putEmailIdentityFeedbackAttributesAsync(
            PutEmailIdentityFeedbackAttributesRequest putEmailIdentityFeedbackAttributesRequest);

    /**
     * <p>
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
     * identity is used to send an email that results in a bounce or complaint event.
     * </p>
     * <p>
     * If the value is <code>true</code>, you receive email notifications when bounce or complaint events occur. These
     * notifications are sent to the address that you specified in the <code>Return-Path</code> header of the original
     * email.
     * </p>
     * <p>
     * You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for
     * receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an
     * email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param putEmailIdentityFeedbackAttributesRequest
     *        A request to set the attributes that control how bounce and complaint events are processed.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEmailIdentityFeedbackAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutEmailIdentityFeedbackAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityFeedbackAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityFeedbackAttributesResult> putEmailIdentityFeedbackAttributesAsync(
            PutEmailIdentityFeedbackAttributesRequest putEmailIdentityFeedbackAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailIdentityFeedbackAttributesRequest, PutEmailIdentityFeedbackAttributesResult> asyncHandler);

    /**
     * <p>
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     * </p>
     * 
     * @param putEmailIdentityMailFromAttributesRequest
     *        A request to configure the custom MAIL FROM domain for a verified identity.
     * @return A Java Future containing the result of the PutEmailIdentityMailFromAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2Async.PutEmailIdentityMailFromAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityMailFromAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest);

    /**
     * <p>
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     * </p>
     * 
     * @param putEmailIdentityMailFromAttributesRequest
     *        A request to configure the custom MAIL FROM domain for a verified identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEmailIdentityMailFromAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutEmailIdentityMailFromAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityMailFromAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailIdentityMailFromAttributesRequest, PutEmailIdentityMailFromAttributesResult> asyncHandler);

    /**
     * <p>
     * Adds an email address to the suppression list for your account.
     * </p>
     * 
     * @param putSuppressedDestinationRequest
     *        A request to add an email destination to the suppression list for your account.
     * @return A Java Future containing the result of the PutSuppressedDestination operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.PutSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSuppressedDestinationResult> putSuppressedDestinationAsync(PutSuppressedDestinationRequest putSuppressedDestinationRequest);

    /**
     * <p>
     * Adds an email address to the suppression list for your account.
     * </p>
     * 
     * @param putSuppressedDestinationRequest
     *        A request to add an email destination to the suppression list for your account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSuppressedDestination operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.PutSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSuppressedDestinationResult> putSuppressedDestinationAsync(PutSuppressedDestinationRequest putSuppressedDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<PutSuppressedDestinationRequest, PutSuppressedDestinationResult> asyncHandler);

    /**
     * <p>
     * Sends an email message. You can use the Amazon SES API v2 to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon SES assembles the message for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
     * the message headers, as well as the message body. You can use this message type to send messages that contain
     * attachments. The message that you specify has to be a valid MIME message.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        A request to send an email message.
     * @return A Java Future containing the result of the SendEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest);

    /**
     * <p>
     * Sends an email message. You can use the Amazon SES API v2 to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon SES assembles the message for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
     * the message headers, as well as the message body. You can use this message type to send messages that contain
     * attachments. The message that you specify has to be a valid MIME message.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        A request to send an email message.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendEmail operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler);

    /**
     * <p>
     * Add one or more tags (keys and values) to a specified resource. A <i>tag</i> is a label that you optionally
     * define and associate with a resource. Tags can help you categorize and manage resources in different ways, such
     * as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add one or more tags (keys and values) to a specified resource. A <i>tag</i> is a label that you optionally
     * define and associate with a resource. Tags can help you categorize and manage resources in different ways, such
     * as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update the configuration of an event destination for a configuration set.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        A request to change the settings for an event destination for a configuration set.
     * @return A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2Async.UpdateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Update the configuration of an event destination for a configuration set.
     * </p>
     * <p>
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        A request to change the settings for an event destination for a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonSimpleEmailServiceV2AsyncHandler.UpdateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler);

}
