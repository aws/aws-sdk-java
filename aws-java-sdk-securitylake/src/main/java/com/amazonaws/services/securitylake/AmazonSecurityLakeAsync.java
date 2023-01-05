/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <note>
 * <p>
 * Amazon Security Lake is in preview release. Your use of the Security Lake preview is subject to Section 2 of the <a
 * href="http://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a>("Betas and Previews").
 * </p>
 * </note>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Servicesaccount. Amazon Web Services Organizations is an account management service that lets you consolidate
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
 * or an Amazon Web Services service in Security Lake CloudTrail captures API calls for Security Lake as events. The
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
     * type in any Region for either accounts that are part of a trusted organization or standalone accounts. At least
     * one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the
     * three dimensions to this API.
     * </p>
     * <p>
     * By default, a dimension refers to the entire set. When you don't provide a dimension, Security Lake assumes that
     * the missing dimension refers to the entire set. This is overridden when you supply any one of the inputs. For
     * instance, when you do not specify members, the API enables all Security Lake member accounts for all sources.
     * Similarly, when you do not specify Regions, Security Lake is enabled for all the Regions where Security Lake is
     * available as a service.
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
     * type in any Region for either accounts that are part of a trusted organization or standalone accounts. At least
     * one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the
     * three dimensions to this API.
     * </p>
     * <p>
     * By default, a dimension refers to the entire set. When you don't provide a dimension, Security Lake assumes that
     * the missing dimension refers to the entire set. This is overridden when you supply any one of the inputs. For
     * instance, when you do not specify members, the API enables all Security Lake member accounts for all sources.
     * Similarly, when you do not specify Regions, Security Lake is enabled for all the Regions where Security Lake is
     * available as a service.
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
     * the custom source in addition to an associated Glue table and an Glue crawler.
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
     * the custom source in addition to an associated Glue table and an Glue crawler.
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
     * You can either use the <code>enableAll</code> parameter to specify all Regions or specify the Regions where you
     * want to enable Security Lake. To specify particular Regions, use the <code>Regions</code> parameter and then
     * configure these Regions using the <code>configurations</code> parameter. If you have already enabled Security
     * Lake in a Region when you call this command, the command will update the Region if you provide new configuration
     * parameters. If you have not already enabled Security Lake in the Region when you call this API, it will set up
     * the data lake in the Region with the specified configurations.
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
     * @param createDatalakeRequest
     * @return A Java Future containing the result of the CreateDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.CreateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeResult> createDatalakeAsync(CreateDatalakeRequest createDatalakeRequest);

    /**
     * <p>
     * Initializes an Amazon Security Lake instance with the provided (or default) configuration. You can enable
     * Security Lake in Amazon Web Services Regions with customized settings before enabling log collection in Regions.
     * You can either use the <code>enableAll</code> parameter to specify all Regions or specify the Regions where you
     * want to enable Security Lake. To specify particular Regions, use the <code>Regions</code> parameter and then
     * configure these Regions using the <code>configurations</code> parameter. If you have already enabled Security
     * Lake in a Region when you call this command, the command will update the Region if you provide new configuration
     * parameters. If you have not already enabled Security Lake in the Region when you call this API, it will set up
     * the data lake in the Region with the specified configurations.
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
     * @param createDatalakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeResult> createDatalakeAsync(CreateDatalakeRequest createDatalakeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeRequest, CreateDatalakeResult> asyncHandler);

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDatalakeAutoEnableRequest
     * @return A Java Future containing the result of the CreateDatalakeAutoEnable operation returned by the service.
     * @sample AmazonSecurityLakeAsync.CreateDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeAutoEnableResult> createDatalakeAutoEnableAsync(CreateDatalakeAutoEnableRequest createDatalakeAutoEnableRequest);

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDatalakeAutoEnableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatalakeAutoEnable operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeAutoEnableResult> createDatalakeAutoEnableAsync(CreateDatalakeAutoEnableRequest createDatalakeAutoEnableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeAutoEnableRequest, CreateDatalakeAutoEnableResult> asyncHandler);

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param createDatalakeDelegatedAdminRequest
     * @return A Java Future containing the result of the CreateDatalakeDelegatedAdmin operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.CreateDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeDelegatedAdminResult> createDatalakeDelegatedAdminAsync(
            CreateDatalakeDelegatedAdminRequest createDatalakeDelegatedAdminRequest);

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param createDatalakeDelegatedAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatalakeDelegatedAdmin operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeDelegatedAdminResult> createDatalakeDelegatedAdminAsync(
            CreateDatalakeDelegatedAdminRequest createDatalakeDelegatedAdminRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeDelegatedAdminRequest, CreateDatalakeDelegatedAdminResult> asyncHandler);

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDatalakeExceptionsSubscriptionRequest
     * @return A Java Future containing the result of the CreateDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.CreateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeExceptionsSubscriptionResult> createDatalakeExceptionsSubscriptionAsync(
            CreateDatalakeExceptionsSubscriptionRequest createDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDatalakeExceptionsSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatalakeExceptionsSubscriptionResult> createDatalakeExceptionsSubscriptionAsync(
            CreateDatalakeExceptionsSubscriptionRequest createDatalakeExceptionsSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatalakeExceptionsSubscriptionRequest, CreateDatalakeExceptionsSubscriptionResult> asyncHandler);

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
     * Security Lake.
     * </p>
     * 
     * @param createSubscriptionNotificationConfigurationRequest
     * @return A Java Future containing the result of the CreateSubscriptionNotificationConfiguration operation returned
     *         by the service.
     * @sample AmazonSecurityLakeAsync.CreateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionNotificationConfigurationResult> createSubscriptionNotificationConfigurationAsync(
            CreateSubscriptionNotificationConfigurationRequest createSubscriptionNotificationConfigurationRequest);

    /**
     * <p>
     * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in
     * Security Lake.
     * </p>
     * 
     * @param createSubscriptionNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscriptionNotificationConfiguration operation returned
     *         by the service.
     * @sample AmazonSecurityLakeAsyncHandler.CreateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionNotificationConfigurationResult> createSubscriptionNotificationConfigurationAsync(
            CreateSubscriptionNotificationConfigurationRequest createSubscriptionNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionNotificationConfigurationRequest, CreateSubscriptionNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. When you remove the source,
     * Security Lake stops collecting data from that source, and subscribers can no longer consume new data from the
     * source. Subscribers can still consume data that Security Lake collected from the source before disablement.
     * </p>
     * <p>
     * You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted
     * organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API.
     * However, you can supply any combination of the three dimensions to this API.
     * </p>
     * <p>
     * By default, a dimension refers to the entire set. This is overridden when you supply any one of the inputs. For
     * instance, when you do not specify members, the API disables all Security Lake member accounts for sources.
     * Similarly, when you do not specify Regions, Security Lake is disabled for all the Regions where Security Lake is
     * available as a service.
     * </p>
     * <p>
     * When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set.
     * For example, if you don't provide specific accounts, the API applies to the entire set of accounts in your
     * organization.
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
     * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. When you remove the source,
     * Security Lake stops collecting data from that source, and subscribers can no longer consume new data from the
     * source. Subscribers can still consume data that Security Lake collected from the source before disablement.
     * </p>
     * <p>
     * You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted
     * organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API.
     * However, you can supply any combination of the three dimensions to this API.
     * </p>
     * <p>
     * By default, a dimension refers to the entire set. This is overridden when you supply any one of the inputs. For
     * instance, when you do not specify members, the API disables all Security Lake member accounts for sources.
     * Similarly, when you do not specify Regions, Security Lake is disabled for all the Regions where Security Lake is
     * available as a service.
     * </p>
     * <p>
     * When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set.
     * For example, if you don't provide specific accounts, the API applies to the entire set of accounts in your
     * organization.
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
     * Removes a custom log source from Amazon Security Lake.
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
     * Removes a custom log source from Amazon Security Lake.
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
     * When you delete Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services
     * Regions. Also, this API automatically takes steps to remove the account from Security Lake .
     * </p>
     * <p>
     * This operation disables security data collection from sources, deletes data stored, and stops making data
     * accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or
     * maintains for your Amazon Web Services account in the current Region, including security log and event data. The
     * <code>DeleteDatalake</code> operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web
     * Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDatalakeRequest
     * @return A Java Future containing the result of the DeleteDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.DeleteDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeResult> deleteDatalakeAsync(DeleteDatalakeRequest deleteDatalakeRequest);

    /**
     * <p>
     * When you delete Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services
     * Regions. Also, this API automatically takes steps to remove the account from Security Lake .
     * </p>
     * <p>
     * This operation disables security data collection from sources, deletes data stored, and stops making data
     * accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or
     * maintains for your Amazon Web Services account in the current Region, including security log and event data. The
     * <code>DeleteDatalake</code> operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web
     * Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDatalakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeResult> deleteDatalakeAsync(DeleteDatalakeRequest deleteDatalakeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeRequest, DeleteDatalakeResult> asyncHandler);

    /**
     * <p>
     * Automatically deletes Amazon Security Lake to stop collecting security data. When you delete Amazon Security Lake
     * from your account, Security Lake is disabled in all Regions. Also, this API automatically takes steps to remove
     * the account from Security Lake .
     * </p>
     * <p>
     * This operation disables security data collection from sources, deletes data stored, and stops making data
     * accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or
     * maintains for your Amazon Web Services account in the current Region, including security log and event data. The
     * <code>DeleteDatalake</code> operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web
     * Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDatalakeAutoEnableRequest
     * @return A Java Future containing the result of the DeleteDatalakeAutoEnable operation returned by the service.
     * @sample AmazonSecurityLakeAsync.DeleteDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeAutoEnableResult> deleteDatalakeAutoEnableAsync(DeleteDatalakeAutoEnableRequest deleteDatalakeAutoEnableRequest);

    /**
     * <p>
     * Automatically deletes Amazon Security Lake to stop collecting security data. When you delete Amazon Security Lake
     * from your account, Security Lake is disabled in all Regions. Also, this API automatically takes steps to remove
     * the account from Security Lake .
     * </p>
     * <p>
     * This operation disables security data collection from sources, deletes data stored, and stops making data
     * accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or
     * maintains for your Amazon Web Services account in the current Region, including security log and event data. The
     * <code>DeleteDatalake</code> operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web
     * Services account. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/disable-security-lake.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param deleteDatalakeAutoEnableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatalakeAutoEnable operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeAutoEnableResult> deleteDatalakeAutoEnableAsync(DeleteDatalakeAutoEnableRequest deleteDatalakeAutoEnableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeAutoEnableRequest, DeleteDatalakeAutoEnableResult> asyncHandler);

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deleteDatalakeDelegatedAdminRequest
     * @return A Java Future containing the result of the DeleteDatalakeDelegatedAdmin operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.DeleteDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeDelegatedAdminResult> deleteDatalakeDelegatedAdminAsync(
            DeleteDatalakeDelegatedAdminRequest deleteDatalakeDelegatedAdminRequest);

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deleteDatalakeDelegatedAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatalakeDelegatedAdmin operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeDelegatedAdminResult> deleteDatalakeDelegatedAdminAsync(
            DeleteDatalakeDelegatedAdminRequest deleteDatalakeDelegatedAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeDelegatedAdminRequest, DeleteDatalakeDelegatedAdminResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDatalakeExceptionsSubscriptionRequest
     * @return A Java Future containing the result of the DeleteDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.DeleteDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeExceptionsSubscriptionResult> deleteDatalakeExceptionsSubscriptionAsync(
            DeleteDatalakeExceptionsSubscriptionRequest deleteDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDatalakeExceptionsSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatalakeExceptionsSubscriptionResult> deleteDatalakeExceptionsSubscriptionAsync(
            DeleteDatalakeExceptionsSubscriptionRequest deleteDatalakeExceptionsSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatalakeExceptionsSubscriptionRequest, DeleteDatalakeExceptionsSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the subscription permission for accounts that are already enabled in Amazon Security Lake. You can delete
     * a subscriber and remove access to data in the current Amazon Web Services Region.
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
     * Deletes the subscription permission for accounts that are already enabled in Amazon Security Lake. You can delete
     * a subscriber and remove access to data in the current Amazon Web Services Region.
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
     * @param deleteSubscriptionNotificationConfigurationRequest
     * @return A Java Future containing the result of the DeleteSubscriptionNotificationConfiguration operation returned
     *         by the service.
     * @sample AmazonSecurityLakeAsync.DeleteSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionNotificationConfigurationResult> deleteSubscriptionNotificationConfigurationAsync(
            DeleteSubscriptionNotificationConfigurationRequest deleteSubscriptionNotificationConfigurationRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteSubscriptionNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscriptionNotificationConfiguration operation returned
     *         by the service.
     * @sample AmazonSecurityLakeAsyncHandler.DeleteSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSubscriptionNotificationConfigurationResult> deleteSubscriptionNotificationConfigurationAsync(
            DeleteSubscriptionNotificationConfigurationRequest deleteSubscriptionNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionNotificationConfigurationRequest, DeleteSubscriptionNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services account ID. You can
     * use the <code>GetDatalake</code> API to know whether Security Lake is enabled for the current Region. This API
     * does not take input parameters.
     * </p>
     * 
     * @param getDatalakeRequest
     * @return A Java Future containing the result of the GetDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.GetDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalake" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeResult> getDatalakeAsync(GetDatalakeRequest getDatalakeRequest);

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services account ID. You can
     * use the <code>GetDatalake</code> API to know whether Security Lake is enabled for the current Region. This API
     * does not take input parameters.
     * </p>
     * 
     * @param getDatalakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalake" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeResult> getDatalakeAsync(GetDatalakeRequest getDatalakeRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeRequest, GetDatalakeResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDatalakeAutoEnableRequest
     * @return A Java Future containing the result of the GetDatalakeAutoEnable operation returned by the service.
     * @sample AmazonSecurityLakeAsync.GetDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeAutoEnableResult> getDatalakeAutoEnableAsync(GetDatalakeAutoEnableRequest getDatalakeAutoEnableRequest);

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDatalakeAutoEnableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatalakeAutoEnable operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeAutoEnableResult> getDatalakeAutoEnableAsync(GetDatalakeAutoEnableRequest getDatalakeAutoEnableRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeAutoEnableRequest, GetDatalakeAutoEnableResult> asyncHandler);

    /**
     * <p>
     * Retrieves the expiration period and time-to-live (TTL) for which the exception message will remain. Exceptions
     * are stored by default, for 2 weeks from when a record was created in Amazon Security Lake. This API does not take
     * input parameters.
     * </p>
     * 
     * @param getDatalakeExceptionsExpiryRequest
     * @return A Java Future containing the result of the GetDatalakeExceptionsExpiry operation returned by the service.
     * @sample AmazonSecurityLakeAsync.GetDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeExceptionsExpiryResult> getDatalakeExceptionsExpiryAsync(
            GetDatalakeExceptionsExpiryRequest getDatalakeExceptionsExpiryRequest);

    /**
     * <p>
     * Retrieves the expiration period and time-to-live (TTL) for which the exception message will remain. Exceptions
     * are stored by default, for 2 weeks from when a record was created in Amazon Security Lake. This API does not take
     * input parameters.
     * </p>
     * 
     * @param getDatalakeExceptionsExpiryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatalakeExceptionsExpiry operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeExceptionsExpiryResult> getDatalakeExceptionsExpiryAsync(
            GetDatalakeExceptionsExpiryRequest getDatalakeExceptionsExpiryRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeExceptionsExpiryRequest, GetDatalakeExceptionsExpiryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDatalakeExceptionsSubscriptionRequest
     * @return A Java Future containing the result of the GetDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.GetDatalakeExceptionsSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeExceptionsSubscriptionResult> getDatalakeExceptionsSubscriptionAsync(
            GetDatalakeExceptionsSubscriptionRequest getDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDatalakeExceptionsSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDatalakeExceptionsSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeExceptionsSubscriptionResult> getDatalakeExceptionsSubscriptionAsync(
            GetDatalakeExceptionsSubscriptionRequest getDatalakeExceptionsSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeExceptionsSubscriptionRequest, GetDatalakeExceptionsSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDatalakeStatusRequest
     * @return A Java Future containing the result of the GetDatalakeStatus operation returned by the service.
     * @sample AmazonSecurityLakeAsync.GetDatalakeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeStatusResult> getDatalakeStatusAsync(GetDatalakeStatusRequest getDatalakeStatusRequest);

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDatalakeStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatalakeStatus operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.GetDatalakeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDatalakeStatusResult> getDatalakeStatusAsync(GetDatalakeStatusRequest getDatalakeStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatalakeStatusRequest, GetDatalakeStatusResult> asyncHandler);

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
     * @param listDatalakeExceptionsRequest
     * @return A Java Future containing the result of the ListDatalakeExceptions operation returned by the service.
     * @sample AmazonSecurityLakeAsync.ListDatalakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDatalakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatalakeExceptionsResult> listDatalakeExceptionsAsync(ListDatalakeExceptionsRequest listDatalakeExceptionsRequest);

    /**
     * <p>
     * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
     * </p>
     * 
     * @param listDatalakeExceptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatalakeExceptions operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.ListDatalakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDatalakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatalakeExceptionsResult> listDatalakeExceptionsAsync(ListDatalakeExceptionsRequest listDatalakeExceptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatalakeExceptionsRequest, ListDatalakeExceptionsResult> asyncHandler);

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
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDatalakeRequest
     * @return A Java Future containing the result of the UpdateDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsync.UpdateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatalakeResult> updateDatalakeAsync(UpdateDatalakeRequest updateDatalakeRequest);

    /**
     * <p>
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDatalakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatalake operation returned by the service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatalakeResult> updateDatalakeAsync(UpdateDatalakeRequest updateDatalakeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatalakeRequest, UpdateDatalakeResult> asyncHandler);

    /**
     * <p>
     * Update the expiration period for the exception message to your preferred time, and control the time-to-live (TTL)
     * for the exception message to remain. Exceptions are stored by default for 2 weeks from when a record was created
     * in Amazon Security Lake.
     * </p>
     * 
     * @param updateDatalakeExceptionsExpiryRequest
     * @return A Java Future containing the result of the UpdateDatalakeExceptionsExpiry operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.UpdateDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatalakeExceptionsExpiryResult> updateDatalakeExceptionsExpiryAsync(
            UpdateDatalakeExceptionsExpiryRequest updateDatalakeExceptionsExpiryRequest);

    /**
     * <p>
     * Update the expiration period for the exception message to your preferred time, and control the time-to-live (TTL)
     * for the exception message to remain. Exceptions are stored by default for 2 weeks from when a record was created
     * in Amazon Security Lake.
     * </p>
     * 
     * @param updateDatalakeExceptionsExpiryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatalakeExceptionsExpiry operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatalakeExceptionsExpiryResult> updateDatalakeExceptionsExpiryAsync(
            UpdateDatalakeExceptionsExpiryRequest updateDatalakeExceptionsExpiryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatalakeExceptionsExpiryRequest, UpdateDatalakeExceptionsExpiryResult> asyncHandler);

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDatalakeExceptionsSubscriptionRequest
     * @return A Java Future containing the result of the UpdateDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsync.UpdateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatalakeExceptionsSubscriptionResult> updateDatalakeExceptionsSubscriptionAsync(
            UpdateDatalakeExceptionsSubscriptionRequest updateDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDatalakeExceptionsSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatalakeExceptionsSubscription operation returned by the
     *         service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatalakeExceptionsSubscriptionResult> updateDatalakeExceptionsSubscriptionAsync(
            UpdateDatalakeExceptionsSubscriptionRequest updateDatalakeExceptionsSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatalakeExceptionsSubscriptionRequest, UpdateDatalakeExceptionsSubscriptionResult> asyncHandler);

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
     * Creates a new subscription notification or adds the existing subscription notification setting for the specified
     * subscription ID.
     * </p>
     * 
     * @param updateSubscriptionNotificationConfigurationRequest
     * @return A Java Future containing the result of the UpdateSubscriptionNotificationConfiguration operation returned
     *         by the service.
     * @sample AmazonSecurityLakeAsync.UpdateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionNotificationConfigurationResult> updateSubscriptionNotificationConfigurationAsync(
            UpdateSubscriptionNotificationConfigurationRequest updateSubscriptionNotificationConfigurationRequest);

    /**
     * <p>
     * Creates a new subscription notification or adds the existing subscription notification setting for the specified
     * subscription ID.
     * </p>
     * 
     * @param updateSubscriptionNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscriptionNotificationConfiguration operation returned
     *         by the service.
     * @sample AmazonSecurityLakeAsyncHandler.UpdateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionNotificationConfigurationResult> updateSubscriptionNotificationConfigurationAsync(
            UpdateSubscriptionNotificationConfigurationRequest updateSubscriptionNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionNotificationConfigurationRequest, UpdateSubscriptionNotificationConfigurationResult> asyncHandler);

}
