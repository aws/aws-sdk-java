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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pinpointemail.model.*;

/**
 * Interface for accessing Pinpoint Email.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpointemail.AbstractAmazonPinpointEmail} instead.
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
public interface AmazonPinpointEmail {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "email";

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
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest);

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
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.CreateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest);

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
     * @return Result of the CreateDedicatedIpPool operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest);

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
     * @return Result of the CreateDeliverabilityTestReport operation returned by the service.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeliverabilityTestReportResult createDeliverabilityTestReport(CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest);

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
     * @return Result of the CreateEmailIdentity operation returned by the service.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEmailIdentityResult createEmailIdentity(CreateEmailIdentityRequest createEmailIdentityRequest);

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
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest);

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
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.DeleteConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest);

    /**
     * <p>
     * Delete a dedicated IP pool.
     * </p>
     * 
     * @param deleteDedicatedIpPoolRequest
     *        A request to delete a dedicated IP pool.
     * @return Result of the DeleteDedicatedIpPool operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDedicatedIpPoolResult deleteDedicatedIpPool(DeleteDedicatedIpPoolRequest deleteDedicatedIpPoolRequest);

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
     * @return Result of the DeleteEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEmailIdentityResult deleteEmailIdentity(DeleteEmailIdentityRequest deleteEmailIdentityRequest);

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current
     * AWS Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.
     * @return Result of the GetAccount operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * </p>
     * 
     * @param getBlacklistReportsRequest
     *        A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * @return Result of the GetBlacklistReports operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetBlacklistReports"
     *      target="_top">AWS API Documentation</a>
     */
    GetBlacklistReportsResult getBlacklistReports(GetBlacklistReportsRequest getBlacklistReportsRequest);

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
     * @return Result of the GetConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfigurationSetResult getConfigurationSet(GetConfigurationSetRequest getConfigurationSetRequest);

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
     * @return Result of the GetConfigurationSetEventDestinations operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetConfigurationSetEventDestinations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfigurationSetEventDestinationsResult getConfigurationSetEventDestinations(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest);

    /**
     * <p>
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
     * with, as well information about the automatic warm-up process for the address.
     * </p>
     * 
     * @param getDedicatedIpRequest
     *        A request to obtain more information about a dedicated IP address.
     * @return Result of the GetDedicatedIp operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIp" target="_top">AWS
     *      API Documentation</a>
     */
    GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest getDedicatedIpRequest);

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @return Result of the GetDedicatedIps operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIps" target="_top">AWS
     *      API Documentation</a>
     */
    GetDedicatedIpsResult getDedicatedIps(GetDedicatedIpsRequest getDedicatedIpsRequest);

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
     * @return Result of the GetDeliverabilityDashboardOptions operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityDashboardOptions"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeliverabilityDashboardOptionsResult getDeliverabilityDashboardOptions(GetDeliverabilityDashboardOptionsRequest getDeliverabilityDashboardOptionsRequest);

    /**
     * <p>
     * Retrieve the results of a predictive inbox placement test.
     * </p>
     * 
     * @param getDeliverabilityTestReportRequest
     *        A request to retrieve the results of a predictive inbox placement test.
     * @return Result of the GetDeliverabilityTestReport operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeliverabilityTestReportResult getDeliverabilityTestReport(GetDeliverabilityTestReportRequest getDeliverabilityTestReportRequest);

    /**
     * <p>
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     * </p>
     * 
     * @param getDomainStatisticsReportRequest
     *        A request to obtain deliverability metrics for a domain.
     * @return Result of the GetDomainStatisticsReport operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainStatisticsReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetDomainStatisticsReportResult getDomainStatisticsReport(GetDomainStatisticsReportRequest getDomainStatisticsReportRequest);

    /**
     * <p>
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the
     * identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @return Result of the GetEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    GetEmailIdentityResult getEmailIdentity(GetEmailIdentityRequest getEmailIdentityRequest);

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
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest);

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @return Result of the ListDedicatedIpPools operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDedicatedIpPools"
     *      target="_top">AWS API Documentation</a>
     */
    ListDedicatedIpPoolsResult listDedicatedIpPools(ListDedicatedIpPoolsRequest listDedicatedIpPoolsRequest);

    /**
     * <p>
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
     * predictive inbox placement tests that are complete, you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results.
     * </p>
     * 
     * @param listDeliverabilityTestReportsRequest
     *        A request to list all of the predictive inbox placement tests that you've performed.
     * @return Result of the ListDeliverabilityTestReports operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDeliverabilityTestReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeliverabilityTestReportsResult listDeliverabilityTestReports(ListDeliverabilityTestReportsRequest listDeliverabilityTestReportsRequest);

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
     * @return Result of the ListEmailIdentities operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListEmailIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    ListEmailIdentitiesResult listEmailIdentities(ListEmailIdentitiesRequest listEmailIdentitiesRequest);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specific resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource in Amazon Pinpoint. Each tag consists of a
     * required <i>tag key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a
     * category for more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonPinpointEmail.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     * </p>
     * 
     * @param putAccountDedicatedIpWarmupAttributesRequest
     *        A request to enable or disable the automatic IP address warm-up feature.
     * @return Result of the PutAccountDedicatedIpWarmupAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutAccountDedicatedIpWarmupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutAccountDedicatedIpWarmupAttributesResult putAccountDedicatedIpWarmupAttributes(
            PutAccountDedicatedIpWarmupAttributesRequest putAccountDedicatedIpWarmupAttributesRequest);

    /**
     * <p>
     * Enable or disable the ability of your account to send email.
     * </p>
     * 
     * @param putAccountSendingAttributesRequest
     *        A request to change the ability of your account to send email.
     * @return Result of the PutAccountSendingAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountSendingAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutAccountSendingAttributesResult putAccountSendingAttributes(PutAccountSendingAttributesRequest putAccountSendingAttributesRequest);

    /**
     * <p>
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
     * dedicated IP addresses for sending specific types of email.
     * </p>
     * 
     * @param putConfigurationSetDeliveryOptionsRequest
     *        A request to associate a configuration set with a dedicated IP pool.
     * @return Result of the PutConfigurationSetDeliveryOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetDeliveryOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetDeliveryOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetDeliveryOptionsResult putConfigurationSetDeliveryOptions(
            PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest);

    /**
     * <p>
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
     * in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetReputationOptionsRequest
     *        A request to enable or disable tracking of reputation metrics for a configuration set.
     * @return Result of the PutConfigurationSetReputationOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetReputationOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetReputationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetReputationOptionsResult putConfigurationSetReputationOptions(
            PutConfigurationSetReputationOptionsRequest putConfigurationSetReputationOptionsRequest);

    /**
     * <p>
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetSendingOptionsRequest
     *        A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific
     *        configuration set.
     * @return Result of the PutConfigurationSetSendingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetSendingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetSendingOptionsResult putConfigurationSetSendingOptions(PutConfigurationSetSendingOptionsRequest putConfigurationSetSendingOptionsRequest);

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     * </p>
     * 
     * @param putConfigurationSetTrackingOptionsRequest
     *        A request to add a custom domain for tracking open and click events to a configuration set.
     * @return Result of the PutConfigurationSetTrackingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetTrackingOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationSetTrackingOptionsResult putConfigurationSetTrackingOptions(
            PutConfigurationSetTrackingOptionsRequest putConfigurationSetTrackingOptionsRequest);

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
     * @return Result of the PutDedicatedIpInPool operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpInPool"
     *      target="_top">AWS API Documentation</a>
     */
    PutDedicatedIpInPoolResult putDedicatedIpInPool(PutDedicatedIpInPoolRequest putDedicatedIpInPoolRequest);

    /**
     * <p/>
     * 
     * @param putDedicatedIpWarmupAttributesRequest
     *        A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you
     *        want to resume the warm-up process for an existing IP address.
     * @return Result of the PutDedicatedIpWarmupAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutDedicatedIpWarmupAttributesResult putDedicatedIpWarmupAttributes(PutDedicatedIpWarmupAttributesRequest putDedicatedIpWarmupAttributesRequest);

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
     * @return Result of the PutDeliverabilityDashboardOption operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDeliverabilityDashboardOption"
     *      target="_top">AWS API Documentation</a>
     */
    PutDeliverabilityDashboardOptionResult putDeliverabilityDashboardOption(PutDeliverabilityDashboardOptionRequest putDeliverabilityDashboardOptionRequest);

    /**
     * <p>
     * Used to enable or disable DKIM authentication for an email identity.
     * </p>
     * 
     * @param putEmailIdentityDkimAttributesRequest
     *        A request to enable or disable DKIM signing of email that you send from an email identity.
     * @return Result of the PutEmailIdentityDkimAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityDkimAttributesResult putEmailIdentityDkimAttributes(PutEmailIdentityDkimAttributesRequest putEmailIdentityDkimAttributesRequest);

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
     * @return Result of the PutEmailIdentityFeedbackAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutEmailIdentityFeedbackAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityFeedbackAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityFeedbackAttributesResult putEmailIdentityFeedbackAttributes(
            PutEmailIdentityFeedbackAttributesRequest putEmailIdentityFeedbackAttributesRequest);

    /**
     * <p>
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     * </p>
     * 
     * @param putEmailIdentityMailFromAttributesRequest
     *        A request to configure the custom MAIL FROM domain for a verified identity.
     * @return Result of the PutEmailIdentityMailFromAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutEmailIdentityMailFromAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityMailFromAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutEmailIdentityMailFromAttributesResult putEmailIdentityMailFromAttributes(
            PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest);

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
     * @return Result of the SendEmail operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    SendEmailResult sendEmail(SendEmailRequest sendEmailRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonPinpointEmail.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonPinpointEmail.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.UpdateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest);

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

}
