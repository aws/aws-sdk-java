/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake;

import javax.annotation.Generated;

import com.amazonaws.services.securitylake.model.*;

/**
 * Interface for accessing Amazon Security Lake asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securitylake.AbstractAmazonSecurityLakeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Services account. Amazon Web Services Organizations is an account management service that lets you consolidate
 * multiple Amazon Web Services accounts into an organization that you create and centrally manage. With Organizations,
 * you can create member accounts and invite existing accounts to join your organization. Security Lake helps you
 * analyze security data for a more complete understanding of your security posture across the entire organization. It
 * can also help you improve the protection of your workloads, applications, and data.
 * </p>
 * <p>
 * The data lake is backed by Amazon Simple Storage Service (Amazon S3) buckets, and you retain ownership over your
 * data.
 * </p>
 * <p>
 * Amazon Security Lake integrates with CloudTrail, a service that provides a record of actions taken by a user, role,
 * or an Amazon Web Services service. In Security Lake, CloudTrail captures API calls for Security Lake as events. The
 * calls captured include calls from the Security Lake console and code calls to the Security Lake API operations. If
 * you create a trail, you can enable continuous delivery of CloudTrail events to an Amazon S3 bucket, including events
 * for Security Lake. If you don't configure a trail, you can still view the most recent events in the CloudTrail
 * console in Event history. Using the information collected by CloudTrail you can determine the request that was made
 * to Security Lake, the IP address from which the request was made, who made the request, when it was made, and
 * additional details. To learn more about Security Lake information in CloudTrail, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/securitylake-cloudtrail.html">Amazon Security Lake
 * User Guide</a>.
 * </p>
 * <p>
 * Security Lake automates the collection of security-related log and event data from integrated Amazon Web Services and
 * third-party services. It also helps you manage the lifecycle of data with customizable retention and replication
 * settings. Security Lake converts ingested data into Apache Parquet format and a standard open-source schema called
 * the Open Cybersecurity Schema Framework (OCSF).
 * </p>
 * <p>
 * Other Amazon Web Services and third-party services can subscribe to the data that's stored in Security Lake for
 * incident response and security data analytics.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSecurityLakeAsync extends AmazonSecurityLake {

    /**
     * <p>
     * Adds a natively supported Amazon Web Service as an Amazon Security Lake source. Enables source types for member
     * accounts in required Amazon Web Services Regions, based on the parameters you specify. You can choose any source
     * type in any Region for either accounts that are part of a trusted organization or standalone accounts. Once you
     * add an Amazon Web Service as a source, Security Lake starts collecting logs and events from it.
     * </p>
     * <p>
     * You can use this API only to enable natively supported Amazon Web Services as a source. Use
     * <code>CreateCustomLogSource</code> to enable data collection from a custom source.
     * </p>
     * 
     * @param createAwsLogSourceRequest
     * @return A Java Future containing the result of the CreateAwsLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.CreateAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAwsLogSourceResult> createAwsLogSourceAsync(CreateAwsLogSourceRequest createAwsLogSourceRequest);

    /**
     * <p>
     * Adds a natively supported Amazon Web Service as an Amazon Security Lake source. Enables source types for member
     * accounts in required Amazon Web Services Regions, based on the parameters you specify. You can choose any source
     * type in any Region for either accounts that are part of a trusted organization or standalone accounts. Once you
     * add an Amazon Web Service as a source, Security Lake starts collecting logs and events from it.
     * </p>
     * <p>
     * You can use this API only to enable natively supported Amazon Web Services as a source. Use
     * <code>CreateCustomLogSource</code> to enable data collection from a custom source.
     * </p>
     * 
     * @param createAwsLogSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAwsLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAwsLogSourceResult> createAwsLogSourceAsync(CreateAwsLogSourceRequest createAwsLogSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAwsLogSourceRequest, CreateAwsLogSourceResult> asyncHandler);

    /**
     * <p>
     * Adds a third-party custom source in Amazon Security Lake, from the Amazon Web Services Region where you want to
     * create a custom source. Security Lake can collect logs and events from third-party custom sources. After creating
     * the appropriate IAM role to invoke Glue crawler, use this API to add a custom source name in Security Lake. This
     * operation creates a partition in the Amazon S3 bucket for Security Lake as the target location for log files from
     * the custom source. In addition, this operation also creates an associated Glue table and an Glue crawler.
     * </p>
     * 
     * @param createCustomLogSourceRequest
     * @return A Java Future containing the result of the CreateCustomLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.CreateCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomLogSourceResult> createCustomLogSourceAsync(CreateCustomLogSourceRequest createCustomLogSourceRequest);

    /**
     * <p>
     * Adds a third-party custom source in Amazon Security Lake, from the Amazon Web Services Region where you want to
     * create a custom source. Security Lake can collect logs and events from third-party custom sources. After creating
     * the appropriate IAM role to invoke Glue crawler, use this API to add a custom source name in Security Lake. This
     * operation creates a partition in the Amazon S3 bucket for Security Lake as the target location for log files from
     * the custom source. In addition, this operation also creates an associated Glue table and an Glue crawler.
     * </p>
     * 
     * @param createCustomLogSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomLogSourceResult> createCustomLogSourceAsync(CreateCustomLogSourceRequest createCustomLogSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomLogSourceRequest, CreateCustomLogSourceResult> asyncHandler);

    /**
     * <p>
     * Initializes an Amazon Security Lake instance with the provided (or default) configuration. You can enable
     * Security Lake in Amazon Web Services Regions with customized settings before enabling log collection in Regions.
     * To specify particular Regions, configure these Regions using the <code>configurations</code> parameter. If you
     * have already enabled Security Lake in a Region when you call this command, the command will update the Region if
     * you provide new configuration parameters. If you have not already enabled Security Lake in the Region when you
     * call this API, it will set up the data lake in the Region with the specified configurations.
     * </p>
     * <p>
     * When you enable Security Lake, it starts ingesting security data after the <code>CreateAwsLogSource</code> call.
     * This includes ingesting security data from sources, storing data, and making data accessible to subscribers.
     * Security Lake also enables all the existing settings and resources that it stores or maintains for your Amazon
     * Web Services account in the current Region, including security log and event data. For more information, see the
     * <a href="https://docs.aws.amazon.com/security-lake/latest/userguide/what-is-security-lake.html">Amazon Security
     * Lake User Guide</a>.
     * </p>
     * 
     * @param createDataLakeRequest
     * @return A Java Future containing the result of the CreateDataLake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.CreateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataLakeResult> createDataLakeAsync(CreateDataLakeRequest createDataLakeRequest);

    /**
     * <p>
     * Initializes an Amazon Security Lake instance with the provided (or default) configuration. You can enable
     * Security Lake in Amazon Web Services Regions with customized settings before enabling log collection in Regions.
     * To specify particular Regions, configure these Regions using the <code>configurations</code> parameter. If you
     * have already enabled Security Lake in a Region when you call this command, the command will update the Region if
     * you provide new configuration parameters. If you have not already enabled Security Lake in the Region when you
     * call this API, it will set up the data lake in the Region with the specified configurations.
     * </p>
     * <p>
     * When you enable Security Lake, it starts ingesting security data after the <code>CreateAwsLogSource</code> call.
     * This includes ingesting security data from sources, storing data, and making data accessible to subscribers.
     * Security Lake also enables all the existing settings and resources that it stores or maintains for your Amazon
     * Web Services account in the current Region, including security log and event data. For more information, see the
     * <a href="https://docs.aws.amazon.com/security-lake/latest/userguide/what-is-security-lake.html">Amazon Security
     * Lake User Guide</a>.
     * </p>
     * 
     * @param createDataLakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataLake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataLakeResult> createDataLakeAsync(CreateDataLakeRequest createDataLakeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataLakeRequest, CreateDataLakeResult> asyncHandler);

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDataLakeExceptionSubscriptionRequest
     * @return A Java Future containing the result of the CreateDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.CreateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataLakeExceptionSubscriptionResult> createDataLakeExceptionSubscriptionAsync(
            CreateDataLakeExceptionSubscriptionRequest createDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDataLakeExceptionSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataLakeExceptionSubscriptionResult> createDataLakeExceptionSubscriptionAsync(
            CreateDataLakeExceptionSubscriptionRequest createDataLakeExceptionSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataLakeExceptionSubscriptionRequest, CreateDataLakeExceptionSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDataLakeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the CreateDataLakeOrganizationConfiguration operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsync.CreateDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataLakeOrganizationConfigurationResult> createDataLakeOrganizationConfigurationAsync(
            CreateDataLakeOrganizationConfigurationRequest createDataLakeOrganizationConfigurationRequest);

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDataLakeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataLakeOrganizationConfiguration operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataLakeOrganizationConfigurationResult> createDataLakeOrganizationConfigurationAsync(
            CreateDataLakeOrganizationConfigurationRequest createDataLakeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataLakeOrganizationConfigurationRequest, CreateDataLakeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a
     * subscriber with access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param createSubscriberRequest
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsync.CreateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest);

    /**
     * <p>
     * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a
     * subscriber with access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param createSubscriberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest createSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriberRequest, CreateSubscriberResult> asyncHandler);

    /**
     * <p>
     * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in
     * Security Lake. You can create only one subscriber notification per subscriber.
     * </p>
     * 
     * @param createSubscriberNotificationRequest
     * @return A Java Future containing the result of the CreateSubscriberNotification operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.CreateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriberNotificationResult> createSubscriberNotificationAsync(
            CreateSubscriberNotificationRequest createSubscriberNotificationRequest);

    /**
     * <p>
     * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in
     * Security Lake. You can create only one subscriber notification per subscriber.
     * </p>
     * 
     * @param createSubscriberNotificationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriberNotification operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriberNotificationResult> createSubscriberNotificationAsync(
            CreateSubscriberNotificationRequest createSubscriberNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriberNotificationRequest, CreateSubscriberNotificationResult> asyncHandler);

    /**
     * <p>
     * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. You can remove a source for
     * one or more Regions. When you remove the source, Security Lake stops collecting data from that source in the
     * specified Regions and accounts, and subscribers can no longer consume new data from the source. However,
     * subscribers can still consume data that Security Lake collected from the source before removal.
     * </p>
     * <p>
     * You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted
     * organization or standalone accounts.
     * </p>
     * 
     * @param deleteAwsLogSourceRequest
     * @return A Java Future containing the result of the DeleteAwsLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.DeleteAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAwsLogSourceResult> deleteAwsLogSourceAsync(DeleteAwsLogSourceRequest deleteAwsLogSourceRequest);

    /**
     * <p>
     * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. You can remove a source for
     * one or more Regions. When you remove the source, Security Lake stops collecting data from that source in the
     * specified Regions and accounts, and subscribers can no longer consume new data from the source. However,
     * subscribers can still consume data that Security Lake collected from the source before removal.
     * </p>
     * <p>
     * You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted
     * organization or standalone accounts.
     * </p>
     * 
     * @param deleteAwsLogSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAwsLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAwsLogSourceResult> deleteAwsLogSourceAsync(DeleteAwsLogSourceRequest deleteAwsLogSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAwsLogSourceRequest, DeleteAwsLogSourceResult> asyncHandler);

    /**
     * <p>
     * Removes a custom log source from Amazon Security Lake, to stop sending data from the custom source to Security
     * Lake.
     * </p>
     * 
     * @param deleteCustomLogSourceRequest
     * @return A Java Future containing the result of the DeleteCustomLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.DeleteCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomLogSourceResult> deleteCustomLogSourceAsync(DeleteCustomLogSourceRequest deleteCustomLogSourceRequest);

    /**
     * <p>
     * Removes a custom log source from Amazon Security Lake, to stop sending data from the custom source to Security
     * Lake.
     * </p>
     * 
     * @param deleteCustomLogSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomLogSource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomLogSourceResult> deleteCustomLogSourceAsync(DeleteCustomLogSourceRequest deleteCustomLogSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomLogSourceRequest, DeleteCustomLogSourceResult> asyncHandler);

    /**
     * <p>
     * When you disable Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services
     * Regions and it stops collecting data from your sources. Also, this API automatically takes steps to remove the
     * account from Security Lake. However, Security Lake retains all of your existing settings and the resources that
     * it created in your Amazon Web Services account in the current Amazon Web Services Region.
     * </p>
     * <p>
     * The <code>DeleteDataLake</code> operation does not delete the data that is stored in your Amazon S3 bucket, which
     * is owned by your Amazon Web Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDataLakeRequest
     * @return A Java Future containing the result of the DeleteDataLake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.DeleteDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataLakeResult> deleteDataLakeAsync(DeleteDataLakeRequest deleteDataLakeRequest);

    /**
     * <p>
     * When you disable Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services
     * Regions and it stops collecting data from your sources. Also, this API automatically takes steps to remove the
     * account from Security Lake. However, Security Lake retains all of your existing settings and the resources that
     * it created in your Amazon Web Services account in the current Amazon Web Services Region.
     * </p>
     * <p>
     * The <code>DeleteDataLake</code> operation does not delete the data that is stored in your Amazon S3 bucket, which
     * is owned by your Amazon Web Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDataLakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataLake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataLakeResult> deleteDataLakeAsync(DeleteDataLakeRequest deleteDataLakeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataLakeRequest, DeleteDataLakeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDataLakeExceptionSubscriptionRequest
     * @return A Java Future containing the result of the DeleteDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.DeleteDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataLakeExceptionSubscriptionResult> deleteDataLakeExceptionSubscriptionAsync(
            DeleteDataLakeExceptionSubscriptionRequest deleteDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDataLakeExceptionSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataLakeExceptionSubscriptionResult> deleteDataLakeExceptionSubscriptionAsync(
            DeleteDataLakeExceptionSubscriptionRequest deleteDataLakeExceptionSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataLakeExceptionSubscriptionRequest, DeleteDataLakeExceptionSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Turns off automatic enablement of Amazon Security Lake for member accounts that are added to an organization in
     * Organizations. Only the delegated Security Lake administrator for an organization can perform this operation. If
     * the delegated Security Lake administrator performs this operation, new member accounts won't automatically
     * contribute data to the data lake.
     * </p>
     * 
     * @param deleteDataLakeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DeleteDataLakeOrganizationConfiguration operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsync.DeleteDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataLakeOrganizationConfigurationResult> deleteDataLakeOrganizationConfigurationAsync(
            DeleteDataLakeOrganizationConfigurationRequest deleteDataLakeOrganizationConfigurationRequest);

    /**
     * <p>
     * Turns off automatic enablement of Amazon Security Lake for member accounts that are added to an organization in
     * Organizations. Only the delegated Security Lake administrator for an organization can perform this operation. If
     * the delegated Security Lake administrator performs this operation, new member accounts won't automatically
     * contribute data to the data lake.
     * </p>
     * 
     * @param deleteDataLakeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataLakeOrganizationConfiguration operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataLakeOrganizationConfigurationResult> deleteDataLakeOrganizationConfigurationAsync(
            DeleteDataLakeOrganizationConfigurationRequest deleteDataLakeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataLakeOrganizationConfigurationRequest, DeleteDataLakeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the subscription permission and all notification settings for accounts that are already enabled in Amazon
     * Security Lake. When you run <code>DeleteSubscriber</code>, the subscriber will no longer consume data from
     * Security Lake and the subscriber is removed. This operation deletes the subscriber and removes access to data in
     * the current Amazon Web Services Region.
     * </p>
     * 
     * @param deleteSubscriberRequest
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsync.DeleteSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest);

    /**
     * <p>
     * Deletes the subscription permission and all notification settings for accounts that are already enabled in Amazon
     * Security Lake. When you run <code>DeleteSubscriber</code>, the subscriber will no longer consume data from
     * Security Lake and the subscriber is removed. This operation deletes the subscriber and removes access to data in
     * the current Amazon Web Services Region.
     * </p>
     * 
     * @param deleteSubscriberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest deleteSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriberRequest, DeleteSubscriberResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteSubscriberNotificationRequest
     * @return A Java Future containing the result of the DeleteSubscriberNotification operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.DeleteSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriberNotificationResult> deleteSubscriberNotificationAsync(
            DeleteSubscriberNotificationRequest deleteSubscriberNotificationRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteSubscriberNotificationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriberNotification operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriberNotificationResult> deleteSubscriberNotificationAsync(
            DeleteSubscriberNotificationRequest deleteSubscriberNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriberNotificationRequest, DeleteSubscriberNotificationResult> asyncHandler);

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deregisterDataLakeDelegatedAdministratorRequest
     * @return A Java Future containing the result of the DeregisterDataLakeDelegatedAdministrator operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsync.DeregisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeregisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDataLakeDelegatedAdministratorResult> deregisterDataLakeDelegatedAdministratorAsync(
            DeregisterDataLakeDelegatedAdministratorRequest deregisterDataLakeDelegatedAdministratorRequest);

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deregisterDataLakeDelegatedAdministratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterDataLakeDelegatedAdministrator operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeregisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeregisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDataLakeDelegatedAdministratorResult> deregisterDataLakeDelegatedAdministratorAsync(
            DeregisterDataLakeDelegatedAdministratorRequest deregisterDataLakeDelegatedAdministratorRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterDataLakeDelegatedAdministratorRequest, DeregisterDataLakeDelegatedAdministratorResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDataLakeExceptionSubscriptionRequest
     * @return A Java Future containing the result of the GetDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.GetDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeExceptionSubscriptionResult> getDataLakeExceptionSubscriptionAsync(
            GetDataLakeExceptionSubscriptionRequest getDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDataLakeExceptionSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeExceptionSubscriptionResult> getDataLakeExceptionSubscriptionAsync(
            GetDataLakeExceptionSubscriptionRequest getDataLakeExceptionSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeExceptionSubscriptionRequest, GetDataLakeExceptionSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDataLakeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the GetDataLakeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.GetDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeOrganizationConfigurationResult> getDataLakeOrganizationConfigurationAsync(
            GetDataLakeOrganizationConfigurationRequest getDataLakeOrganizationConfigurationRequest);

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDataLakeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataLakeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeOrganizationConfigurationResult> getDataLakeOrganizationConfigurationAsync(
            GetDataLakeOrganizationConfigurationRequest getDataLakeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeOrganizationConfigurationRequest, GetDataLakeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDataLakeSourcesRequest
     * @return A Java Future containing the result of the GetDataLakeSources operation returned by the service.
     * @sample AmazonSecurityLakeAsync.GetDataLakeSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeSources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeSourcesResult> getDataLakeSourcesAsync(GetDataLakeSourcesRequest getDataLakeSourcesRequest);

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDataLakeSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataLakeSources operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDataLakeSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeSources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeSourcesResult> getDataLakeSourcesAsync(GetDataLakeSourcesRequest getDataLakeSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeSourcesRequest, GetDataLakeSourcesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the subscription information for the specified subscription ID. You can get information about a
     * specific subscriber.
     * </p>
     * 
     * @param getSubscriberRequest
     * @return A Java Future containing the result of the GetSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsync.GetSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetSubscriber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriberResult> getSubscriberAsync(GetSubscriberRequest getSubscriberRequest);

    /**
     * <p>
     * Retrieves the subscription information for the specified subscription ID. You can get information about a
     * specific subscriber.
     * </p>
     * 
     * @param getSubscriberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.GetSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetSubscriber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriberResult> getSubscriberAsync(GetSubscriberRequest getSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriberRequest, GetSubscriberResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
     * </p>
     * 
     * @param listDataLakeExceptionsRequest
     * @return A Java Future containing the result of the ListDataLakeExceptions operation returned by the service.
     * @sample AmazonSecurityLakeAsync.ListDataLakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataLakeExceptionsResult> listDataLakeExceptionsAsync(ListDataLakeExceptionsRequest listDataLakeExceptionsRequest);

    /**
     * <p>
     * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
     * </p>
     * 
     * @param listDataLakeExceptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataLakeExceptions operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.ListDataLakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataLakeExceptionsResult> listDataLakeExceptionsAsync(ListDataLakeExceptionsRequest listDataLakeExceptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataLakeExceptionsRequest, ListDataLakeExceptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services Regions. You can
     * use this operation to determine whether Security Lake is enabled for a Region.
     * </p>
     * 
     * @param listDataLakesRequest
     * @return A Java Future containing the result of the ListDataLakes operation returned by the service.
     * @sample AmazonSecurityLakeAsync.ListDataLakes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataLakesResult> listDataLakesAsync(ListDataLakesRequest listDataLakesRequest);

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services Regions. You can
     * use this operation to determine whether Security Lake is enabled for a Region.
     * </p>
     * 
     * @param listDataLakesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataLakes operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.ListDataLakes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataLakesResult> listDataLakesAsync(ListDataLakesRequest listDataLakesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataLakesRequest, ListDataLakesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the log sources in the current Amazon Web Services Region.
     * </p>
     * 
     * @param listLogSourcesRequest
     * @return A Java Future containing the result of the ListLogSources operation returned by the service.
     * @sample AmazonSecurityLakeAsync.ListLogSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLogSourcesResult> listLogSourcesAsync(ListLogSourcesRequest listLogSourcesRequest);

    /**
     * <p>
     * Retrieves the log sources in the current Amazon Web Services Region.
     * </p>
     * 
     * @param listLogSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLogSources operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.ListLogSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLogSourcesResult> listLogSourcesAsync(ListLogSourcesRequest listLogSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLogSourcesRequest, ListLogSourcesResult> asyncHandler);

    /**
     * <p>
     * List all subscribers for the specific Amazon Security Lake account ID. You can retrieve a list of subscriptions
     * associated with a specific organization or Amazon Web Services account.
     * </p>
     * 
     * @param listSubscribersRequest
     * @return A Java Future containing the result of the ListSubscribers operation returned by the service.
     * @sample AmazonSecurityLakeAsync.ListSubscribers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListSubscribers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribersResult> listSubscribersAsync(ListSubscribersRequest listSubscribersRequest);

    /**
     * <p>
     * List all subscribers for the specific Amazon Security Lake account ID. You can retrieve a list of subscriptions
     * associated with a specific organization or Amazon Web Services account.
     * </p>
     * 
     * @param listSubscribersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscribers operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.ListSubscribers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListSubscribers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribersResult> listSubscribersAsync(ListSubscribersRequest listSubscribersRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscribersRequest, ListSubscribersResult> asyncHandler);

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Security Lake resource: a subscriber, or
     * the data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Security Lake resource: a subscriber, or
     * the data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param registerDataLakeDelegatedAdministratorRequest
     * @return A Java Future containing the result of the RegisterDataLakeDelegatedAdministrator operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsync.RegisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/RegisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDataLakeDelegatedAdministratorResult> registerDataLakeDelegatedAdministratorAsync(
            RegisterDataLakeDelegatedAdministratorRequest registerDataLakeDelegatedAdministratorRequest);

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param registerDataLakeDelegatedAdministratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDataLakeDelegatedAdministrator operation returned by
     *         the service.
     * @sample AmazonSecurityLakeAsyncHandler.RegisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/RegisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDataLakeDelegatedAdministratorResult> registerDataLakeDelegatedAdministratorAsync(
            RegisterDataLakeDelegatedAdministratorRequest registerDataLakeDelegatedAdministratorRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDataLakeDelegatedAdministratorRequest, RegisterDataLakeDelegatedAdministratorResult> asyncHandler);

    /**
     * <p>
     * Adds or updates one or more tags that are associated with an Amazon Security Lake resource: a subscriber, or the
     * data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region. A
     * <i>tag</i> is a label that you can define and associate with Amazon Web Services resources. Each tag consists of
     * a required <i>tag key</i> and an associated <i>tag value</i>. A <i>tag key</i> is a general label that acts as a
     * category for a more specific tag value. A <i>tag value</i> acts as a descriptor for a tag key. Tags can help you
     * identify, categorize, and manage resources in different ways, such as by owner, environment, or other criteria.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/tagging-resources.html">Tagging Amazon Security
     * Lake resources</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates one or more tags that are associated with an Amazon Security Lake resource: a subscriber, or the
     * data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region. A
     * <i>tag</i> is a label that you can define and associate with Amazon Web Services resources. Each tag consists of
     * a required <i>tag key</i> and an associated <i>tag value</i>. A <i>tag key</i> is a general label that acts as a
     * category for a more specific tag value. A <i>tag value</i> acts as a descriptor for a tag key. Tags can help you
     * identify, categorize, and manage resources in different ways, such as by owner, environment, or other criteria.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/tagging-resources.html">Tagging Amazon Security
     * Lake resources</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an Amazon Security Lake resource: a subscriber, or the data lake
     * configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSecurityLakeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an Amazon Security Lake resource: a subscriber, or the data lake
     * configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDataLakeRequest
     * @return A Java Future containing the result of the UpdateDataLake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.UpdateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataLakeResult> updateDataLakeAsync(UpdateDataLakeRequest updateDataLakeRequest);

    /**
     * <p>
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDataLakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataLake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataLakeResult> updateDataLakeAsync(UpdateDataLakeRequest updateDataLakeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataLakeRequest, UpdateDataLakeResult> asyncHandler);

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDataLakeExceptionSubscriptionRequest
     * @return A Java Future containing the result of the UpdateDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.UpdateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataLakeExceptionSubscriptionResult> updateDataLakeExceptionSubscriptionAsync(
            UpdateDataLakeExceptionSubscriptionRequest updateDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDataLakeExceptionSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataLakeExceptionSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataLakeExceptionSubscriptionResult> updateDataLakeExceptionSubscriptionAsync(
            UpdateDataLakeExceptionSubscriptionRequest updateDataLakeExceptionSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataLakeExceptionSubscriptionRequest, UpdateDataLakeExceptionSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by
     * changing the sources that the subscriber consumes data from.
     * </p>
     * 
     * @param updateSubscriberRequest
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsync.UpdateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest);

    /**
     * <p>
     * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by
     * changing the sources that the subscriber consumes data from.
     * </p>
     * 
     * @param updateSubscriberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriber operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest updateSubscriberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriberRequest, UpdateSubscriberResult> asyncHandler);

    /**
     * <p>
     * Updates an existing notification method for the subscription (SQS or HTTPs endpoint) or switches the notification
     * subscription endpoint for a subscriber.
     * </p>
     * 
     * @param updateSubscriberNotificationRequest
     * @return A Java Future containing the result of the UpdateSubscriberNotification operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.UpdateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriberNotificationResult> updateSubscriberNotificationAsync(
            UpdateSubscriberNotificationRequest updateSubscriberNotificationRequest);

    /**
     * <p>
     * Updates an existing notification method for the subscription (SQS or HTTPs endpoint) or switches the notification
     * subscription endpoint for a subscriber.
     * </p>
     * 
     * @param updateSubscriberNotificationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriberNotification operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriberNotificationResult> updateSubscriberNotificationAsync(
            UpdateSubscriberNotificationRequest updateSubscriberNotificationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriberNotificationRequest, UpdateSubscriberNotificationResult> asyncHandler);

}
