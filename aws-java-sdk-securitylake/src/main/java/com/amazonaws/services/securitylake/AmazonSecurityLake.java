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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.securitylake.model.*;

/**
 * Interface for accessing Amazon Security Lake.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securitylake.AbstractAmazonSecurityLake} instead.
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
public interface AmazonSecurityLake {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "securitylake";

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
     * @return Result of the CreateAwsLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAwsLogSourceResult createAwsLogSource(CreateAwsLogSourceRequest createAwsLogSourceRequest);

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
     * @return Result of the CreateCustomLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomLogSourceResult createCustomLogSource(CreateCustomLogSourceRequest createCustomLogSourceRequest);

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
     * @return Result of the CreateDataLake operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDataLakeResult createDataLake(CreateDataLakeRequest createDataLakeRequest);

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDataLakeExceptionSubscriptionRequest
     * @return Result of the CreateDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDataLakeExceptionSubscriptionResult createDataLakeExceptionSubscription(
            CreateDataLakeExceptionSubscriptionRequest createDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDataLakeOrganizationConfigurationRequest
     * @return Result of the CreateDataLakeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDataLakeOrganizationConfigurationResult createDataLakeOrganizationConfiguration(
            CreateDataLakeOrganizationConfigurationRequest createDataLakeOrganizationConfigurationRequest);

    /**
     * <p>
     * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a
     * subscriber with access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param createSubscriberRequest
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSubscriberResult createSubscriber(CreateSubscriberRequest createSubscriberRequest);

    /**
     * <p>
     * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in
     * Security Lake. You can create only one subscriber notification per subscriber.
     * </p>
     * 
     * @param createSubscriberNotificationRequest
     * @return Result of the CreateSubscriberNotification operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.CreateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriberNotificationResult createSubscriberNotification(CreateSubscriberNotificationRequest createSubscriberNotificationRequest);

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
     * @return Result of the DeleteAwsLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAwsLogSourceResult deleteAwsLogSource(DeleteAwsLogSourceRequest deleteAwsLogSourceRequest);

    /**
     * <p>
     * Removes a custom log source from Amazon Security Lake, to stop sending data from the custom source to Security
     * Lake.
     * </p>
     * 
     * @param deleteCustomLogSourceRequest
     * @return Result of the DeleteCustomLogSource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomLogSourceResult deleteCustomLogSource(DeleteCustomLogSourceRequest deleteCustomLogSourceRequest);

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
     * @return Result of the DeleteDataLake operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDataLakeResult deleteDataLake(DeleteDataLakeRequest deleteDataLakeRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDataLakeExceptionSubscriptionRequest
     * @return Result of the DeleteDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDataLakeExceptionSubscriptionResult deleteDataLakeExceptionSubscription(
            DeleteDataLakeExceptionSubscriptionRequest deleteDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Turns off automatic enablement of Amazon Security Lake for member accounts that are added to an organization in
     * Organizations. Only the delegated Security Lake administrator for an organization can perform this operation. If
     * the delegated Security Lake administrator performs this operation, new member accounts won't automatically
     * contribute data to the data lake.
     * </p>
     * 
     * @param deleteDataLakeOrganizationConfigurationRequest
     * @return Result of the DeleteDataLakeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDataLakeOrganizationConfigurationResult deleteDataLakeOrganizationConfiguration(
            DeleteDataLakeOrganizationConfigurationRequest deleteDataLakeOrganizationConfigurationRequest);

    /**
     * <p>
     * Deletes the subscription permission and all notification settings for accounts that are already enabled in Amazon
     * Security Lake. When you run <code>DeleteSubscriber</code>, the subscriber will no longer consume data from
     * Security Lake and the subscriber is removed. This operation deletes the subscriber and removes access to data in
     * the current Amazon Web Services Region.
     * </p>
     * 
     * @param deleteSubscriberRequest
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteSubscriberNotificationRequest
     * @return Result of the DeleteSubscriberNotification operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeleteSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSubscriberNotificationResult deleteSubscriberNotification(DeleteSubscriberNotificationRequest deleteSubscriberNotificationRequest);

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deregisterDataLakeDelegatedAdministratorRequest
     * @return Result of the DeregisterDataLakeDelegatedAdministrator operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.DeregisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeregisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterDataLakeDelegatedAdministratorResult deregisterDataLakeDelegatedAdministrator(
            DeregisterDataLakeDelegatedAdministratorRequest deregisterDataLakeDelegatedAdministratorRequest);

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDataLakeExceptionSubscriptionRequest
     * @return Result of the GetDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataLakeExceptionSubscriptionResult getDataLakeExceptionSubscription(GetDataLakeExceptionSubscriptionRequest getDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDataLakeOrganizationConfigurationRequest
     * @return Result of the GetDataLakeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetDataLakeOrganizationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataLakeOrganizationConfigurationResult getDataLakeOrganizationConfiguration(
            GetDataLakeOrganizationConfigurationRequest getDataLakeOrganizationConfigurationRequest);

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDataLakeSourcesRequest
     * @return Result of the GetDataLakeSources operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetDataLakeSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeSources"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataLakeSourcesResult getDataLakeSources(GetDataLakeSourcesRequest getDataLakeSourcesRequest);

    /**
     * <p>
     * Retrieves the subscription information for the specified subscription ID. You can get information about a
     * specific subscriber.
     * </p>
     * 
     * @param getSubscriberRequest
     * @return Result of the GetSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.GetSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetSubscriber" target="_top">AWS API
     *      Documentation</a>
     */
    GetSubscriberResult getSubscriber(GetSubscriberRequest getSubscriberRequest);

    /**
     * <p>
     * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
     * </p>
     * 
     * @param listDataLakeExceptionsRequest
     * @return Result of the ListDataLakeExceptions operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListDataLakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataLakeExceptionsResult listDataLakeExceptions(ListDataLakeExceptionsRequest listDataLakeExceptionsRequest);

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services Regions. You can
     * use this operation to determine whether Security Lake is enabled for a Region.
     * </p>
     * 
     * @param listDataLakesRequest
     * @return Result of the ListDataLakes operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListDataLakes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDataLakes" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataLakesResult listDataLakes(ListDataLakesRequest listDataLakesRequest);

    /**
     * <p>
     * Retrieves the log sources in the current Amazon Web Services Region.
     * </p>
     * 
     * @param listLogSourcesRequest
     * @return Result of the ListLogSources operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListLogSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS
     *      API Documentation</a>
     */
    ListLogSourcesResult listLogSources(ListLogSourcesRequest listLogSourcesRequest);

    /**
     * <p>
     * List all subscribers for the specific Amazon Security Lake account ID. You can retrieve a list of subscriptions
     * associated with a specific organization or Amazon Web Services account.
     * </p>
     * 
     * @param listSubscribersRequest
     * @return Result of the ListSubscribers operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListSubscribers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListSubscribers" target="_top">AWS
     *      API Documentation</a>
     */
    ListSubscribersResult listSubscribers(ListSubscribersRequest listSubscribersRequest);

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Security Lake resource: a subscriber, or
     * the data lake configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param registerDataLakeDelegatedAdministratorRequest
     * @return Result of the RegisterDataLakeDelegatedAdministrator operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.RegisterDataLakeDelegatedAdministrator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/RegisterDataLakeDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterDataLakeDelegatedAdministratorResult registerDataLakeDelegatedAdministrator(
            RegisterDataLakeDelegatedAdministratorRequest registerDataLakeDelegatedAdministratorRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an Amazon Security Lake resource: a subscriber, or the data lake
     * configuration for your Amazon Web Services account in a particular Amazon Web Services Region.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDataLakeRequest
     * @return Result of the UpdateDataLake operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateDataLake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLake" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDataLakeResult updateDataLake(UpdateDataLakeRequest updateDataLakeRequest);

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDataLakeExceptionSubscriptionRequest
     * @return Result of the UpdateDataLakeExceptionSubscription operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateDataLakeExceptionSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLakeExceptionSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDataLakeExceptionSubscriptionResult updateDataLakeExceptionSubscription(
            UpdateDataLakeExceptionSubscriptionRequest updateDataLakeExceptionSubscriptionRequest);

    /**
     * <p>
     * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by
     * changing the sources that the subscriber consumes data from.
     * </p>
     * 
     * @param updateSubscriberRequest
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest updateSubscriberRequest);

    /**
     * <p>
     * Updates an existing notification method for the subscription (SQS or HTTPs endpoint) or switches the notification
     * subscription endpoint for a subscriber.
     * </p>
     * 
     * @param updateSubscriberNotificationRequest
     * @return Result of the UpdateSubscriberNotification operation returned by the service.
     * @throws BadRequestException
     *         The request is malformed or contains an error such as an invalid parameter value or a missing required
     *         parameter.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @sample AmazonSecurityLake.UpdateSubscriberNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriberNotification"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubscriberNotificationResult updateSubscriberNotification(UpdateSubscriberNotificationRequest updateSubscriberNotificationRequest);

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
