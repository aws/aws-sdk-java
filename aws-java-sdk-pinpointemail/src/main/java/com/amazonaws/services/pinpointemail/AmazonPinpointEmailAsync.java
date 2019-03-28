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
package com.amazonaws.services.pinpointemail;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointemail.model.*;

/**
 * Interface for accessing Pinpoint Email asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpointemail.AbstractAmazonPinpointEmailAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Pinpoint Email Service</fullname>
 * <p>
 * This document contains reference information for the <a href="https://aws.amazon.com/pinpoint">Amazon Pinpoint</a>
 * Email API, version 1.0. This document is best used in conjunction with the <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer Guide</a>.
 * </p>
 * <p>
 * The Amazon Pinpoint Email API is available in the US East (N. Virginia), US West (Oregon), EU (Frankfurt), and EU
 * (Ireland) Regions at the following endpoints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>US East (N. Virginia)</b>: <code>email.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>US West (Oregon)</b>: <code>email.us-west-2.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>EU (Frankfurt)</b>: <code>email.eu-central-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>EU (Ireland)</b>: <code>email.eu-west-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpointEmailAsync extends AmazonPinpointEmail {

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails you
     * send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the
     * configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules
     * in that configuration set are applied to the email.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        A request to create a configuration set.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonPinpointEmailAsync.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest);

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails you
     * send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the
     * configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules
     * in that configuration set are applied to the email.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        A request to create a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationSet operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest createConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Create an event destination. In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks,
     * bounces, and complaints. <i>Event destinations</i> are places that you can send information about these events
     * to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or
     * complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * <p>
     * A single configuration set can include more than one event destination.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        A request to add an event destination to a configuration set.
     * @return A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonPinpointEmailAsync.CreateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Create an event destination. In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks,
     * bounces, and complaints. <i>Event destinations</i> are places that you can send information about these events
     * to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or
     * complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonPinpointEmailAsyncHandler.CreateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler);

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an
     * email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated
     * pool.
     * </p>
     * 
     * @param createDedicatedIpPoolRequest
     *        A request to create a new dedicated IP pool.
     * @return A Java Future containing the result of the CreateDedicatedIpPool operation returned by the service.
     * @sample AmazonPinpointEmailAsync.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest);

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an
     * email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated
     * pool.
     * </p>
     * 
     * @param createDedicatedIpPoolRequest
     *        A request to create a new dedicated IP pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDedicatedIpPool operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDedicatedIpPoolResult> createDedicatedIpPoolAsync(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDedicatedIpPoolRequest, CreateDedicatedIpPoolResult> asyncHandler);

    /**
     * <p>
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
     * messages will be handled by various email providers around the world. When you perform a predictive inbox
     * placement test, you provide a sample message that contains the content that you plan to send to your customers.
     * Amazon Pinpoint then sends that message to special email addresses spread across several major email providers.
     * After about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across
     *        several major email providers. After about 24 hours, the test is complete, and you can use the
     *        <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
     * @return A Java Future containing the result of the CreateDeliverabilityTestReport operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(
            CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest);

    /**
     * <p>
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
     * messages will be handled by various email providers around the world. When you perform a predictive inbox
     * placement test, you provide a sample message that contains the content that you plan to send to your customers.
     * Amazon Pinpoint then sends that message to special email addresses spread across several major email providers.
     * After about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across
     *        several major email providers. After about 24 hours, the test is complete, and you can use the
     *        <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeliverabilityTestReport operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsyncHandler.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeliverabilityTestReportResult> createDeliverabilityTestReportAsync(
            CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeliverabilityTestReportRequest, CreateDeliverabilityTestReportResult> asyncHandler);

    /**
     * <p>
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or
     * domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you
     * first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that
     * you've given Amazon Pinpoint permission to send email from the address.
     * </p>
     * <p>
     * When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified
     * as soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens.
     * You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint
     * detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the
     * domain verification process.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @return A Java Future containing the result of the CreateEmailIdentity operation returned by the service.
     * @sample AmazonPinpointEmailAsync.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(CreateEmailIdentityRequest createEmailIdentityRequest);

    /**
     * <p>
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or
     * domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you
     * first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that
     * you've given Amazon Pinpoint permission to send email from the address.
     * </p>
     * <p>
     * When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified
     * as soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens.
     * You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint
     * detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the
     * domain verification process.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEmailIdentity operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEmailIdentityResult> createEmailIdentityAsync(CreateEmailIdentityRequest createEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEmailIdentityRequest, CreateEmailIdentityResult> asyncHandler);

    /**
     * <p>
     * Delete an existing configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        A request to delete a configuration set.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonPinpointEmailAsync.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

    /**
     * <p>
     * Delete an existing configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        A request to delete a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationSet operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest deleteConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Delete an event destination.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        A request to delete an event destination from a configuration set.
     * @return A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonPinpointEmailAsync.DeleteConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Delete an event destination.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonPinpointEmailAsyncHandler.DeleteConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSetEventDestination"
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
     * @sample AmazonPinpointEmailAsync.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AmazonPinpointEmailAsyncHandler.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDedicatedIpPoolResult> deleteDedicatedIpPoolAsync(DeleteDedicatedIpPoolRequest deleteDedicatedIpPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDedicatedIpPoolRequest, DeleteDedicatedIpPoolResult> asyncHandler);

    /**
     * <p>
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an
     * email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to use
     *        Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing
     *        the verification process for the identity again.
     * @return A Java Future containing the result of the DeleteEmailIdentity operation returned by the service.
     * @sample AmazonPinpointEmailAsync.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(DeleteEmailIdentityRequest deleteEmailIdentityRequest);

    /**
     * <p>
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an
     * email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to use
     *        Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing
     *        the verification process for the identity again.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEmailIdentity operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailIdentityResult> deleteEmailIdentityAsync(DeleteEmailIdentityRequest deleteEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEmailIdentityRequest, DeleteEmailIdentityResult> asyncHandler);

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current
     * AWS Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonPinpointEmailAsync.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current
     * AWS Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetAccount" target="_top">AWS API
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
     * @sample AmazonPinpointEmailAsync.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetBlacklistReports"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AmazonPinpointEmailAsyncHandler.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetBlacklistReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBlacklistReportsResult> getBlacklistReportsAsync(GetBlacklistReportsRequest getBlacklistReportsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlacklistReportsRequest, GetBlacklistReportsResult> asyncHandler);

    /**
     * <p>
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
     * whether or not it's enabled for sending email, and more.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param getConfigurationSetRequest
     *        A request to obtain information about a configuration set.
     * @return A Java Future containing the result of the GetConfigurationSet operation returned by the service.
     * @sample AmazonPinpointEmailAsync.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(GetConfigurationSetRequest getConfigurationSetRequest);

    /**
     * <p>
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
     * whether or not it's enabled for sending email, and more.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param getConfigurationSetRequest
     *        A request to obtain information about a configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfigurationSet operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetResult> getConfigurationSetAsync(GetConfigurationSetRequest getConfigurationSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationSetRequest, GetConfigurationSetResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of event destinations that are associated with a configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param getConfigurationSetEventDestinationsRequest
     *        A request to obtain information about the event destinations for a configuration set.
     * @return A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.GetConfigurationSetEventDestinations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationSetEventDestinationsResult> getConfigurationSetEventDestinationsAsync(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest);

    /**
     * <p>
     * Retrieve a list of event destinations that are associated with a configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonPinpointEmailAsyncHandler.GetConfigurationSetEventDestinations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSetEventDestinations"
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
     * @sample AmazonPinpointEmailAsync.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIp" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonPinpointEmailAsyncHandler.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpResult> getDedicatedIpAsync(GetDedicatedIpRequest getDedicatedIpRequest,
            com.amazonaws.handlers.AsyncHandler<GetDedicatedIpRequest, GetDedicatedIpResult> asyncHandler);

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @return A Java Future containing the result of the GetDedicatedIps operation returned by the service.
     * @sample AmazonPinpointEmailAsync.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIps" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(GetDedicatedIpsRequest getDedicatedIpsRequest);

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDedicatedIps operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIps" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDedicatedIpsResult> getDedicatedIpsAsync(GetDedicatedIpsRequest getDedicatedIpsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDedicatedIpsRequest, GetDedicatedIpsResult> asyncHandler);

    /**
     * <p>
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to
     * reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to
     * perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other
     * fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of
     * a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar
     * month.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        A request to retrieve the status of the Deliverability dashboard for your account. When the Deliverability
     *        dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email
     *        using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any
     *        other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the
     *        first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the
     *        current calendar month.
     * @return A Java Future containing the result of the GetDeliverabilityDashboardOptions operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityDashboardOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeliverabilityDashboardOptionsResult> getDeliverabilityDashboardOptionsAsync(
            GetDeliverabilityDashboardOptionsRequest getDeliverabilityDashboardOptionsRequest);

    /**
     * <p>
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to
     * reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to
     * perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other
     * fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of
     * a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar
     * month.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        A request to retrieve the status of the Deliverability dashboard for your account. When the Deliverability
     *        dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email
     *        using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any
     *        other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the
     *        first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the
     *        current calendar month.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeliverabilityDashboardOptions operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsyncHandler.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityDashboardOptions"
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
     * @sample AmazonPinpointEmailAsync.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityTestReport"
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
     * @sample AmazonPinpointEmailAsyncHandler.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeliverabilityTestReportResult> getDeliverabilityTestReportAsync(
            GetDeliverabilityTestReportRequest getDeliverabilityTestReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeliverabilityTestReportRequest, GetDeliverabilityTestReportResult> asyncHandler);

    /**
     * <p>
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     * </p>
     * 
     * @param getDomainStatisticsReportRequest
     *        A request to obtain deliverability metrics for a domain.
     * @return A Java Future containing the result of the GetDomainStatisticsReport operation returned by the service.
     * @sample AmazonPinpointEmailAsync.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainStatisticsReport"
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
     * @sample AmazonPinpointEmailAsyncHandler.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainStatisticsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainStatisticsReportResult> getDomainStatisticsReportAsync(
            GetDomainStatisticsReportRequest getDomainStatisticsReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainStatisticsReportRequest, GetDomainStatisticsReportResult> asyncHandler);

    /**
     * <p>
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the
     * identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @return A Java Future containing the result of the GetEmailIdentity operation returned by the service.
     * @sample AmazonPinpointEmailAsync.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(GetEmailIdentityRequest getEmailIdentityRequest);

    /**
     * <p>
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the
     * identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEmailIdentity operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEmailIdentityResult> getEmailIdentityAsync(GetEmailIdentityRequest getEmailIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<GetEmailIdentityRequest, GetEmailIdentityResult> asyncHandler);

    /**
     * <p>
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS
     *        Region.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonPinpointEmailAsync.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * <p>
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS
     *        Region.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest listConfigurationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler);

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @return A Java Future containing the result of the ListDedicatedIpPools operation returned by the service.
     * @sample AmazonPinpointEmailAsync.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDedicatedIpPools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDedicatedIpPoolsResult> listDedicatedIpPoolsAsync(ListDedicatedIpPoolsRequest listDedicatedIpPoolsRequest);

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDedicatedIpPools operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDedicatedIpPools"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AmazonPinpointEmailAsync.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDeliverabilityTestReports"
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
     * @sample AmazonPinpointEmailAsyncHandler.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDeliverabilityTestReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeliverabilityTestReportsResult> listDeliverabilityTestReportsAsync(
            ListDeliverabilityTestReportsRequest listDeliverabilityTestReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeliverabilityTestReportsRequest, ListDeliverabilityTestReportsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity
     * can be either an email address or a domain. This operation returns identities that are verified as well as those
     * that aren't.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your Amazon Pinpoint account. This list
     *        includes identities that you've already verified, identities that are unverified, and identities that were
     *        verified in the past, but are no longer verified.
     * @return A Java Future containing the result of the ListEmailIdentities operation returned by the service.
     * @sample AmazonPinpointEmailAsync.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListEmailIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(ListEmailIdentitiesRequest listEmailIdentitiesRequest);

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity
     * can be either an email address or a domain. This operation returns identities that are verified as well as those
     * that aren't.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your Amazon Pinpoint account. This list
     *        includes identities that you've already verified, identities that are unverified, and identities that were
     *        verified in the past, but are no longer verified.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEmailIdentities operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListEmailIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEmailIdentitiesResult> listEmailIdentitiesAsync(ListEmailIdentitiesRequest listEmailIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEmailIdentitiesRequest, ListEmailIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specific resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource in Amazon Pinpoint. Each tag consists of a
     * required <i>tag key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a
     * category for more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpointEmailAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specific resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource in Amazon Pinpoint. Each tag consists of a
     * required <i>tag key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a
     * category for more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpointEmailAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AmazonPinpointEmailAsync.PutAccountDedicatedIpWarmupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountDedicatedIpWarmupAttributes"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutAccountDedicatedIpWarmupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountDedicatedIpWarmupAttributes"
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
     * @sample AmazonPinpointEmailAsync.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountSendingAttributes"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountSendingAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSendingAttributesResult> putAccountSendingAttributesAsync(
            PutAccountSendingAttributesRequest putAccountSendingAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountSendingAttributesRequest, PutAccountSendingAttributesResult> asyncHandler);

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
     * @sample AmazonPinpointEmailAsync.PutConfigurationSetDeliveryOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetDeliveryOptions"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutConfigurationSetDeliveryOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetDeliveryOptions"
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
     * @sample AmazonPinpointEmailAsync.PutConfigurationSetReputationOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetReputationOptions"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutConfigurationSetReputationOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetReputationOptions"
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
     *        A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific
     *        configuration set.
     * @return A Java Future containing the result of the PutConfigurationSetSendingOptions operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetSendingOptions"
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
     *        A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific
     *        configuration set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfigurationSetSendingOptions operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsyncHandler.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetSendingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetSendingOptionsResult> putConfigurationSetSendingOptionsAsync(
            PutConfigurationSetSendingOptionsRequest putConfigurationSetSendingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationSetSendingOptionsRequest, PutConfigurationSetSendingOptionsResult> asyncHandler);

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     * </p>
     * 
     * @param putConfigurationSetTrackingOptionsRequest
     *        A request to add a custom domain for tracking open and click events to a configuration set.
     * @return A Java Future containing the result of the PutConfigurationSetTrackingOptions operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.PutConfigurationSetTrackingOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfigurationSetTrackingOptionsResult> putConfigurationSetTrackingOptionsAsync(
            PutConfigurationSetTrackingOptionsRequest putConfigurationSetTrackingOptionsRequest);

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
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
     * @sample AmazonPinpointEmailAsyncHandler.PutConfigurationSetTrackingOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetTrackingOptions"
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
     * The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint
     * account.
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
     * @sample AmazonPinpointEmailAsync.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpInPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDedicatedIpInPoolResult> putDedicatedIpInPoolAsync(PutDedicatedIpInPoolRequest putDedicatedIpInPoolRequest);

    /**
     * <p>
     * Move a dedicated IP address to an existing dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint
     * account.
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
     * @sample AmazonPinpointEmailAsyncHandler.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpInPool"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AmazonPinpointEmailAsync.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpWarmupAttributes"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDedicatedIpWarmupAttributesResult> putDedicatedIpWarmupAttributesAsync(
            PutDedicatedIpWarmupAttributesRequest putDedicatedIpWarmupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutDedicatedIpWarmupAttributesRequest, PutDedicatedIpWarmupAttributesResult> asyncHandler);

    /**
     * <p>
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
     * reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to
     * perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other
     * fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of
     * a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar
     * month.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        A request to enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard,
     *        you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint.
     *        You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any
     *        other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the
     *        first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the
     *        current calendar month.
     * @return A Java Future containing the result of the PutDeliverabilityDashboardOption operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDeliverabilityDashboardOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDeliverabilityDashboardOptionResult> putDeliverabilityDashboardOptionAsync(
            PutDeliverabilityDashboardOptionRequest putDeliverabilityDashboardOptionRequest);

    /**
     * <p>
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
     * reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to
     * perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other
     * fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of
     * a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar
     * month.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        A request to enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard,
     *        you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint.
     *        You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any
     *        other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the
     *        first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the
     *        current calendar month.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDeliverabilityDashboardOption operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsyncHandler.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDeliverabilityDashboardOption"
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
     * @sample AmazonPinpointEmailAsync.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityDkimAttributes"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityDkimAttributesResult> putEmailIdentityDkimAttributesAsync(
            PutEmailIdentityDkimAttributesRequest putEmailIdentityDkimAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailIdentityDkimAttributesRequest, PutEmailIdentityDkimAttributesResult> asyncHandler);

    /**
     * <p>
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
     * identity is used to send an email that results in a bounce or complaint event.
     * </p>
     * <p>
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint
     * events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header
     * of the original email.
     * </p>
     * <p>
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by
     * notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you
     * haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email
     * notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param putEmailIdentityFeedbackAttributesRequest
     *        A request to set the attributes that control how bounce and complaint events are processed.
     * @return A Java Future containing the result of the PutEmailIdentityFeedbackAttributes operation returned by the
     *         service.
     * @sample AmazonPinpointEmailAsync.PutEmailIdentityFeedbackAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityFeedbackAttributes"
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
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint
     * events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header
     * of the original email.
     * </p>
     * <p>
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by
     * notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you
     * haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email
     * notification when these events occur (even if this setting is disabled).
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
     * @sample AmazonPinpointEmailAsyncHandler.PutEmailIdentityFeedbackAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityFeedbackAttributes"
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
     * @sample AmazonPinpointEmailAsync.PutEmailIdentityMailFromAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityMailFromAttributes"
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
     * @sample AmazonPinpointEmailAsyncHandler.PutEmailIdentityMailFromAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityMailFromAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailIdentityMailFromAttributesResult> putEmailIdentityMailFromAttributesAsync(
            PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailIdentityMailFromAttributesRequest, PutEmailIdentityMailFromAttributesResult> asyncHandler);

    /**
     * <p>
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon Pinpoint assembles the message for you.
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
     * @sample AmazonPinpointEmailAsync.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest);

    /**
     * <p>
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon Pinpoint assembles the message for you.
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
     * @sample AmazonPinpointEmailAsyncHandler.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest,
            com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler);

    /**
     * <p>
     * Add one or more tags (keys and values) to one or more specified resources. A <i>tag</i> is a label that you
     * optionally define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage
     * resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as
     * many as 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPinpointEmailAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add one or more tags (keys and values) to one or more specified resources. A <i>tag</i> is a label that you
     * optionally define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage
     * resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as
     * many as 50 tags.
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
     * @sample AmazonPinpointEmailAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/TagResource" target="_top">AWS API
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
     * @sample AmazonPinpointEmailAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonPinpointEmailAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update the configuration of an event destination for a configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        A request to change the settings for an event destination for a configuration set.
     * @return A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
     *         the service.
     * @sample AmazonPinpointEmailAsync.UpdateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Update the configuration of an event destination for a configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonPinpointEmailAsyncHandler.UpdateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler);

}
