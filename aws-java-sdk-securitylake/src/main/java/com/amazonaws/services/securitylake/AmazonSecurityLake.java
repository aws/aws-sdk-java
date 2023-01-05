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
     * @return Result of the CreateAwsLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws S3Exception
     *         Provides an extension of the AmazonServiceException for errors reported by Amazon S3 while processing a
     *         request. In particular, this class provides access to the Amazon S3 extended request ID. If Amazon S3 is
     *         incorrectly handling a request and you need to contact Amazon, this extended request ID may provide
     *         useful debugging information.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * the custom source in addition to an associated Glue table and an Glue crawler.
     * </p>
     * 
     * @param createCustomLogSourceRequest
     * @return Result of the CreateCustomLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ConflictSourceNamesException
     *         There was a conflict when you attempted to modify a Security Lake source name.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.CreateCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomLogSourceResult createCustomLogSource(CreateCustomLogSourceRequest createCustomLogSourceRequest);

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
     * @return Result of the CreateDatalake operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonSecurityLake.CreateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatalakeResult createDatalake(CreateDatalakeRequest createDatalakeRequest);

    /**
     * <p>
     * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not
     * automatically enabled for any existing member accounts in your organization.
     * </p>
     * 
     * @param createDatalakeAutoEnableRequest
     * @return Result of the CreateDatalakeAutoEnable operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.CreateDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatalakeAutoEnableResult createDatalakeAutoEnable(CreateDatalakeAutoEnableRequest createDatalakeAutoEnableRequest);

    /**
     * <p>
     * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param createDatalakeDelegatedAdminRequest
     * @return Result of the CreateDatalakeDelegatedAdmin operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @sample AmazonSecurityLake.CreateDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatalakeDelegatedAdminResult createDatalakeDelegatedAdmin(CreateDatalakeDelegatedAdminRequest createDatalakeDelegatedAdminRequest);

    /**
     * <p>
     * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param createDatalakeExceptionsSubscriptionRequest
     * @return Result of the CreateDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.CreateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatalakeExceptionsSubscriptionResult createDatalakeExceptionsSubscription(
            CreateDatalakeExceptionsSubscriptionRequest createDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a
     * subscriber with access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param createSubscriberRequest
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws ConflictSubscriptionException
     *         A conflicting subscription exception operation is in progress.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.CreateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSubscriberResult createSubscriber(CreateSubscriberRequest createSubscriberRequest);

    /**
     * <p>
     * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in
     * Security Lake.
     * </p>
     * 
     * @param createSubscriptionNotificationConfigurationRequest
     * @return Result of the CreateSubscriptionNotificationConfiguration operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.CreateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSubscriptionNotificationConfigurationResult createSubscriptionNotificationConfiguration(
            CreateSubscriptionNotificationConfigurationRequest createSubscriptionNotificationConfigurationRequest);

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
     * @return Result of the DeleteAwsLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.DeleteAwsLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteAwsLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAwsLogSourceResult deleteAwsLogSource(DeleteAwsLogSourceRequest deleteAwsLogSourceRequest);

    /**
     * <p>
     * Removes a custom log source from Amazon Security Lake.
     * </p>
     * 
     * @param deleteCustomLogSourceRequest
     * @return Result of the DeleteCustomLogSource operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ConflictSourceNamesException
     *         There was a conflict when you attempted to modify a Security Lake source name.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.DeleteCustomLogSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteCustomLogSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomLogSourceResult deleteCustomLogSource(DeleteCustomLogSourceRequest deleteCustomLogSourceRequest);

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
     * @return Result of the DeleteDatalake operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonSecurityLake.DeleteDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatalakeResult deleteDatalake(DeleteDatalakeRequest deleteDatalakeRequest);

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
     * @return Result of the DeleteDatalakeAutoEnable operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.DeleteDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDatalakeAutoEnableResult deleteDatalakeAutoEnable(DeleteDatalakeAutoEnableRequest deleteDatalakeAutoEnableRequest);

    /**
     * <p>
     * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be
     * called by the organization management account. The organization management account cannot be the delegated
     * administrator account.
     * </p>
     * 
     * @param deleteDatalakeDelegatedAdminRequest
     * @return Result of the DeleteDatalakeDelegatedAdmin operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @sample AmazonSecurityLake.DeleteDatalakeDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDatalakeDelegatedAdminResult deleteDatalakeDelegatedAdmin(DeleteDatalakeDelegatedAdminRequest deleteDatalakeDelegatedAdminRequest);

    /**
     * <p>
     * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param deleteDatalakeExceptionsSubscriptionRequest
     * @return Result of the DeleteDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.DeleteDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDatalakeExceptionsSubscriptionResult deleteDatalakeExceptionsSubscription(
            DeleteDatalakeExceptionsSubscriptionRequest deleteDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Deletes the subscription permission for accounts that are already enabled in Amazon Security Lake. You can delete
     * a subscriber and remove access to data in the current Amazon Web Services Region.
     * </p>
     * 
     * @param deleteSubscriberRequest
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws BucketNotFoundException
     *         Amazon Security Lake generally returns 404 errors if the requested object is missing from the bucket.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * @param deleteSubscriptionNotificationConfigurationRequest
     * @return Result of the DeleteSubscriptionNotificationConfiguration operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.DeleteSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSubscriptionNotificationConfigurationResult deleteSubscriptionNotificationConfiguration(
            DeleteSubscriptionNotificationConfigurationRequest deleteSubscriptionNotificationConfigurationRequest);

    /**
     * <p>
     * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services account ID. You can
     * use the <code>GetDatalake</code> API to know whether Security Lake is enabled for the current Region. This API
     * does not take input parameters.
     * </p>
     * 
     * @param getDatalakeRequest
     * @return Result of the GetDatalake operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalake" target="_top">AWS API
     *      Documentation</a>
     */
    GetDatalakeResult getDatalake(GetDatalakeRequest getDatalakeRequest);

    /**
     * <p>
     * Retrieves the configuration that will be automatically set up for accounts added to the organization after the
     * organization has onboarded to Amazon Security Lake. This API does not take input parameters.
     * </p>
     * 
     * @param getDatalakeAutoEnableRequest
     * @return Result of the GetDatalakeAutoEnable operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeAutoEnable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeAutoEnable"
     *      target="_top">AWS API Documentation</a>
     */
    GetDatalakeAutoEnableResult getDatalakeAutoEnable(GetDatalakeAutoEnableRequest getDatalakeAutoEnableRequest);

    /**
     * <p>
     * Retrieves the expiration period and time-to-live (TTL) for which the exception message will remain. Exceptions
     * are stored by default, for 2 weeks from when a record was created in Amazon Security Lake. This API does not take
     * input parameters.
     * </p>
     * 
     * @param getDatalakeExceptionsExpiryRequest
     * @return Result of the GetDatalakeExceptionsExpiry operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    GetDatalakeExceptionsExpiryResult getDatalakeExceptionsExpiry(GetDatalakeExceptionsExpiryRequest getDatalakeExceptionsExpiryRequest);

    /**
     * <p>
     * Retrieves the details of exception notifications for the account in Amazon Security Lake.
     * </p>
     * 
     * @param getDatalakeExceptionsSubscriptionRequest
     * @return Result of the GetDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeExceptionsSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    GetDatalakeExceptionsSubscriptionResult getDatalakeExceptionsSubscription(GetDatalakeExceptionsSubscriptionRequest getDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts
     * and which sources Security Lake is collecting data from.
     * </p>
     * 
     * @param getDatalakeStatusRequest
     * @return Result of the GetDatalakeStatus operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.GetDatalakeStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetDatalakeStatusResult getDatalakeStatus(GetDatalakeStatusRequest getDatalakeStatusRequest);

    /**
     * <p>
     * Retrieves the subscription information for the specified subscription ID. You can get information about a
     * specific subscriber.
     * </p>
     * 
     * @param getSubscriberRequest
     * @return Result of the GetSubscriber operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
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
     * @param listDatalakeExceptionsRequest
     * @return Result of the ListDatalakeExceptions operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.ListDatalakeExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDatalakeExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDatalakeExceptionsResult listDatalakeExceptions(ListDatalakeExceptionsRequest listDatalakeExceptionsRequest);

    /**
     * <p>
     * Retrieves the log sources in the current Amazon Web Services Region.
     * </p>
     * 
     * @param listLogSourcesRequest
     * @return Result of the ListLogSources operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
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
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.ListSubscribers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListSubscribers" target="_top">AWS
     *      API Documentation</a>
     */
    ListSubscribersResult listSubscribers(ListSubscribersRequest listSubscribersRequest);

    /**
     * <p>
     * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data
     * from multiple Amazon Web Services Regions.
     * </p>
     * 
     * @param updateDatalakeRequest
     * @return Result of the UpdateDatalake operation returned by the service.
     * @throws EventBridgeException
     *         Represents an error interacting with the Amazon EventBridge service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonSecurityLake.UpdateDatalake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalake" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDatalakeResult updateDatalake(UpdateDatalakeRequest updateDatalakeRequest);

    /**
     * <p>
     * Update the expiration period for the exception message to your preferred time, and control the time-to-live (TTL)
     * for the exception message to remain. Exceptions are stored by default for 2 weeks from when a record was created
     * in Amazon Security Lake.
     * </p>
     * 
     * @param updateDatalakeExceptionsExpiryRequest
     * @return Result of the UpdateDatalakeExceptionsExpiry operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.UpdateDatalakeExceptionsExpiry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsExpiry"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDatalakeExceptionsExpiryResult updateDatalakeExceptionsExpiry(UpdateDatalakeExceptionsExpiryRequest updateDatalakeExceptionsExpiryRequest);

    /**
     * <p>
     * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
     * </p>
     * 
     * @param updateDatalakeExceptionsSubscriptionRequest
     * @return Result of the UpdateDatalakeExceptionsSubscription operation returned by the service.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @sample AmazonSecurityLake.UpdateDatalakeExceptionsSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDatalakeExceptionsSubscriptionResult updateDatalakeExceptionsSubscription(
            UpdateDatalakeExceptionsSubscriptionRequest updateDatalakeExceptionsSubscriptionRequest);

    /**
     * <p>
     * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by
     * changing the sources that the subscriber consumes data from.
     * </p>
     * 
     * @param updateSubscriberRequest
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws ConflictSubscriptionException
     *         A conflicting subscription exception operation is in progress.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.UpdateSubscriber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriber" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest updateSubscriberRequest);

    /**
     * <p>
     * Creates a new subscription notification or adds the existing subscription notification setting for the specified
     * subscription ID.
     * </p>
     * 
     * @param updateSubscriptionNotificationConfigurationRequest
     * @return Result of the UpdateSubscriptionNotificationConfiguration operation returned by the service.
     * @throws ConcurrentModificationException
     *         More than one process tried to modify a resource at the same time.
     * @throws InternalServerException
     *         Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting,
     *         perform the operation again.
     * @throws ValidationException
     *         Your signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Access denied errors appear when Amazon
     *         Security Lake explicitly or implicitly denies an authorization request. An explicit denial occurs when a
     *         policy contains a Deny statement for the specific Amazon Web Services action. An implicit denial occurs
     *         when there is no applicable Deny statement and also no applicable Allow statement.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccountNotFoundException
     *         Amazon Security Lake cannot find an Amazon Web Services account with the accountID that you specified, or
     *         the account whose credentials you used to make this request isn't a member of an organization.
     * @throws InvalidInputException
     *         The request was rejected because a value that's not valid or is out of range was supplied for an input
     *         parameter.
     * @sample AmazonSecurityLake.UpdateSubscriptionNotificationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriptionNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubscriptionNotificationConfigurationResult updateSubscriptionNotificationConfiguration(
            UpdateSubscriptionNotificationConfigurationRequest updateSubscriptionNotificationConfigurationRequest);

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
