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
package com.amazonaws.services.mailmanager;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mailmanager.model.*;

/**
 * Interface for accessing MailManager.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mailmanager.AbstractAWSMailManager} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>AWS SES Mail Manager API</fullname>
 * <p>
 * <a href="http://aws.amazon.com/ses">AWS SES Mail Manager API</a> contains operations and data types that comprise the
 * Mail Manager feature of Amazon Simple Email Service.
 * </p>
 * <p>
 * Mail Manager is a set of Amazon SES email gateway features designed to help you strengthen your organization's email
 * infrastructure, simplify email workflow management, and streamline email compliance control. To learn more, see the
 * <a href="https://docs.aws.amazon.com/ses/latest/dg/eb.html">Mail Manager chapter</a> in the Amazon SES Developer
 * Guide.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMailManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mail-manager";

    /**
     * <p>
     * Creates an Add On instance for the subscription indicated in the request. The resulting Amazon Resource Name
     * (ARN) can be used in a conditional statement for a rule set or traffic policy.
     * </p>
     * 
     * @param createAddonInstanceRequest
     * @return Result of the CreateAddonInstance operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.CreateAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAddonInstanceResult createAddonInstance(CreateAddonInstanceRequest createAddonInstanceRequest);

    /**
     * <p>
     * Creates a subscription for an Add On representing the acceptance of its terms of use and additional pricing. The
     * subscription can then be used to create an instance for use in rule sets or traffic policies.
     * </p>
     * 
     * @param createAddonSubscriptionRequest
     * @return Result of the CreateAddonSubscription operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAddonSubscriptionResult createAddonSubscription(CreateAddonSubscriptionRequest createAddonSubscriptionRequest);

    /**
     * <p>
     * Creates a new email archive resource for storing and retaining emails.
     * </p>
     * 
     * @param createArchiveRequest
     *        The request to create a new email archive.
     * @return Result of the CreateArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.CreateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    CreateArchiveResult createArchive(CreateArchiveRequest createArchiveRequest);

    /**
     * <p>
     * Provision a new ingress endpoint resource.
     * </p>
     * 
     * @param createIngressPointRequest
     * @return Result of the CreateIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    CreateIngressPointResult createIngressPoint(CreateIngressPointRequest createIngressPointRequest);

    /**
     * <p>
     * Creates a relay resource which can be used in rules to relay incoming emails to defined relay destinations.
     * </p>
     * 
     * @param createRelayRequest
     * @return Result of the CreateRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRelayResult createRelay(CreateRelayRequest createRelayRequest);

    /**
     * <p>
     * Provision a new rule set.
     * </p>
     * 
     * @param createRuleSetRequest
     * @return Result of the CreateRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleSetResult createRuleSet(CreateRuleSetRequest createRuleSetRequest);

    /**
     * <p>
     * Provision a new traffic policy resource.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     * @return Result of the CreateTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Deletes an Add On instance.
     * </p>
     * 
     * @param deleteAddonInstanceRequest
     * @return Result of the DeleteAddonInstance operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.DeleteAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAddonInstanceResult deleteAddonInstance(DeleteAddonInstanceRequest deleteAddonInstanceRequest);

    /**
     * <p>
     * Deletes an Add On subscription.
     * </p>
     * 
     * @param deleteAddonSubscriptionRequest
     * @return Result of the DeleteAddonSubscription operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.DeleteAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAddonSubscriptionResult deleteAddonSubscription(DeleteAddonSubscriptionRequest deleteAddonSubscriptionRequest);

    /**
     * <p>
     * Initiates deletion of an email archive. This changes the archive state to pending deletion. In this state, no new
     * emails can be added, and existing archived emails become inaccessible (search, export, download). The archive and
     * all of its contents will be permanently deleted 30 days after entering the pending deletion state, regardless of
     * the configured retention period.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        The request to initiate deletion of an email archive.
     * @return Result of the DeleteArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.DeleteArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteArchive" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteArchiveResult deleteArchive(DeleteArchiveRequest deleteArchiveRequest);

    /**
     * <p>
     * Delete an ingress endpoint resource.
     * </p>
     * 
     * @param deleteIngressPointRequest
     * @return Result of the DeleteIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.DeleteIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteIngressPointResult deleteIngressPoint(DeleteIngressPointRequest deleteIngressPointRequest);

    /**
     * <p>
     * Deletes an existing relay resource.
     * </p>
     * 
     * @param deleteRelayRequest
     * @return Result of the DeleteRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.DeleteRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRelay" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRelayResult deleteRelay(DeleteRelayRequest deleteRelayRequest);

    /**
     * <p>
     * Delete a rule set.
     * </p>
     * 
     * @param deleteRuleSetRequest
     * @return Result of the DeleteRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.DeleteRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleSetResult deleteRuleSet(DeleteRuleSetRequest deleteRuleSetRequest);

    /**
     * <p>
     * Delete a traffic policy resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     * @return Result of the DeleteTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrafficPolicyResult deleteTrafficPolicy(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Gets detailed information about an Add On instance.
     * </p>
     * 
     * @param getAddonInstanceRequest
     * @return Result of the GetAddonInstance operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonInstance" target="_top">AWS
     *      API Documentation</a>
     */
    GetAddonInstanceResult getAddonInstance(GetAddonInstanceRequest getAddonInstanceRequest);

    /**
     * <p>
     * Gets detailed information about an Add On subscription.
     * </p>
     * 
     * @param getAddonSubscriptionRequest
     * @return Result of the GetAddonSubscription operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    GetAddonSubscriptionResult getAddonSubscription(GetAddonSubscriptionRequest getAddonSubscriptionRequest);

    /**
     * <p>
     * Retrieves the full details and current state of a specified email archive.
     * </p>
     * 
     * @param getArchiveRequest
     *        The request to retrieve details of an email archive.
     * @return Result of the GetArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchive" target="_top">AWS API
     *      Documentation</a>
     */
    GetArchiveResult getArchive(GetArchiveRequest getArchiveRequest);

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive export job.
     * </p>
     * 
     * @param getArchiveExportRequest
     *        The request to retrieve details of a specific archive export job.
     * @return Result of the GetArchiveExport operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    GetArchiveExportResult getArchiveExport(GetArchiveExportRequest getArchiveExportRequest);

    /**
     * <p>
     * Returns a pre-signed URL that provides temporary download access to the specific email message stored in the
     * archive.
     * </p>
     * 
     * @param getArchiveMessageRequest
     *        The request to get details of a specific email message stored in an archive.
     * @return Result of the GetArchiveMessage operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessage" target="_top">AWS
     *      API Documentation</a>
     */
    GetArchiveMessageResult getArchiveMessage(GetArchiveMessageRequest getArchiveMessageRequest);

    /**
     * <p>
     * Returns the textual content of a specific email message stored in the archive. Attachments are not included.
     * </p>
     * 
     * @param getArchiveMessageContentRequest
     *        The request to get the textual content of a specific email message stored in an archive.
     * @return Result of the GetArchiveMessageContent operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    GetArchiveMessageContentResult getArchiveMessageContent(GetArchiveMessageContentRequest getArchiveMessageContentRequest);

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive search job.
     * </p>
     * 
     * @param getArchiveSearchRequest
     *        The request to retrieve details of a specific archive search job.
     * @return Result of the GetArchiveSearch operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    GetArchiveSearchResult getArchiveSearch(GetArchiveSearchRequest getArchiveSearchRequest);

    /**
     * <p>
     * Returns the results of a completed email archive search job.
     * </p>
     * 
     * @param getArchiveSearchResultsRequest
     *        The request to retrieve results from a completed archive search job.
     * @return Result of the GetArchiveSearchResults operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveSearchResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearchResults"
     *      target="_top">AWS API Documentation</a>
     */
    GetArchiveSearchResultsResult getArchiveSearchResults(GetArchiveSearchResultsRequest getArchiveSearchResultsRequest);

    /**
     * <p>
     * Fetch ingress endpoint resource attributes.
     * </p>
     * 
     * @param getIngressPointRequest
     * @return Result of the GetIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    GetIngressPointResult getIngressPoint(GetIngressPointRequest getIngressPointRequest);

    /**
     * <p>
     * Fetch the relay resource and it's attributes.
     * </p>
     * 
     * @param getRelayRequest
     * @return Result of the GetRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRelay" target="_top">AWS API
     *      Documentation</a>
     */
    GetRelayResult getRelay(GetRelayRequest getRelayRequest);

    /**
     * <p>
     * Fetch attributes of a rule set.
     * </p>
     * 
     * @param getRuleSetRequest
     * @return Result of the GetRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetRuleSetResult getRuleSet(GetRuleSetRequest getRuleSetRequest);

    /**
     * <p>
     * Fetch attributes of a traffic policy resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     * @return Result of the GetTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Lists all Add On instances in your account.
     * </p>
     * 
     * @param listAddonInstancesRequest
     * @return Result of the ListAddonInstances operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListAddonInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListAddonInstancesResult listAddonInstances(ListAddonInstancesRequest listAddonInstancesRequest);

    /**
     * <p>
     * Lists all Add On subscriptions in your account.
     * </p>
     * 
     * @param listAddonSubscriptionsRequest
     * @return Result of the ListAddonSubscriptions operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListAddonSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAddonSubscriptionsResult listAddonSubscriptions(ListAddonSubscriptionsRequest listAddonSubscriptionsRequest);

    /**
     * <p>
     * Returns a list of email archive export jobs.
     * </p>
     * 
     * @param listArchiveExportsRequest
     *        The request to list archive export jobs in your account.
     * @return Result of the ListArchiveExports operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.ListArchiveExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveExports" target="_top">AWS
     *      API Documentation</a>
     */
    ListArchiveExportsResult listArchiveExports(ListArchiveExportsRequest listArchiveExportsRequest);

    /**
     * <p>
     * Returns a list of email archive search jobs.
     * </p>
     * 
     * @param listArchiveSearchesRequest
     *        The request to list archive search jobs in your account.
     * @return Result of the ListArchiveSearches operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.ListArchiveSearches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveSearches"
     *      target="_top">AWS API Documentation</a>
     */
    ListArchiveSearchesResult listArchiveSearches(ListArchiveSearchesRequest listArchiveSearchesRequest);

    /**
     * <p>
     * Returns a list of all email archives in your account.
     * </p>
     * 
     * @param listArchivesRequest
     *        The request to list email archives in your account.
     * @return Result of the ListArchives operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.ListArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchives" target="_top">AWS API
     *      Documentation</a>
     */
    ListArchivesResult listArchives(ListArchivesRequest listArchivesRequest);

    /**
     * <p>
     * List all ingress endpoint resources.
     * </p>
     * 
     * @param listIngressPointsRequest
     * @return Result of the ListIngressPoints operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListIngressPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListIngressPoints" target="_top">AWS
     *      API Documentation</a>
     */
    ListIngressPointsResult listIngressPoints(ListIngressPointsRequest listIngressPointsRequest);

    /**
     * <p>
     * Lists all the existing relay resources.
     * </p>
     * 
     * @param listRelaysRequest
     * @return Result of the ListRelays operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListRelays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRelays" target="_top">AWS API
     *      Documentation</a>
     */
    ListRelaysResult listRelays(ListRelaysRequest listRelaysRequest);

    /**
     * <p>
     * List rule sets for this account.
     * </p>
     * 
     * @param listRuleSetsRequest
     * @return Result of the ListRuleSets operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListRuleSetsResult listRuleSets(ListRuleSetsRequest listRuleSetsRequest);

    /**
     * <p>
     * Retrieves the list of tags (keys and values) assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List traffic policy resources.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     * @return Result of the ListTrafficPolicies operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTrafficPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficPoliciesResult listTrafficPolicies(ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * <p>
     * Initiates an export of emails from the specified archive.
     * </p>
     * 
     * @param startArchiveExportRequest
     *        The request to initiate an export of emails from an archive.
     * @return Result of the StartArchiveExport operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StartArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    StartArchiveExportResult startArchiveExport(StartArchiveExportRequest startArchiveExportRequest);

    /**
     * <p>
     * Initiates a search across emails in the specified archive.
     * </p>
     * 
     * @param startArchiveSearchRequest
     *        The request to initiate a search across emails in an archive.
     * @return Result of the StartArchiveSearch operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StartArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    StartArchiveSearchResult startArchiveSearch(StartArchiveSearchRequest startArchiveSearchRequest);

    /**
     * <p>
     * Stops an in-progress export of emails from an archive.
     * </p>
     * 
     * @param stopArchiveExportRequest
     *        The request to stop an in-progress archive export job.
     * @return Result of the StopArchiveExport operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StopArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    StopArchiveExportResult stopArchiveExport(StopArchiveExportRequest stopArchiveExportRequest);

    /**
     * <p>
     * Stops an in-progress archive search job.
     * </p>
     * 
     * @param stopArchiveSearchRequest
     *        The request to stop an in-progress archive search job.
     * @return Result of the StopArchiveSearch operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StopArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    StopArchiveSearchResult stopArchiveSearch(StopArchiveSearchRequest stopArchiveSearchRequest);

    /**
     * <p>
     * Adds one or more tags (keys and values) to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/TagResource" target="_top">AWS API
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
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the attributes of an existing email archive.
     * </p>
     * 
     * @param updateArchiveRequest
     *        The request to update properties of an existing email archive.
     * @return Result of the UpdateArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.UpdateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateArchiveResult updateArchive(UpdateArchiveRequest updateArchiveRequest);

    /**
     * <p>
     * Update attributes of a provisioned ingress endpoint resource.
     * </p>
     * 
     * @param updateIngressPointRequest
     * @return Result of the UpdateIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateIngressPointResult updateIngressPoint(UpdateIngressPointRequest updateIngressPointRequest);

    /**
     * <p>
     * Updates the attributes of an existing relay resource.
     * </p>
     * 
     * @param updateRelayRequest
     * @return Result of the UpdateRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRelayResult updateRelay(UpdateRelayRequest updateRelayRequest);

    /**
     * <p>
     * &gt;Update attributes of an already provisioned rule set.
     * </p>
     * 
     * @param updateRuleSetRequest
     * @return Result of the UpdateRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRuleSetResult updateRuleSet(UpdateRuleSetRequest updateRuleSetRequest);

    /**
     * <p>
     * Update attributes of an already provisioned traffic policy resource.
     * </p>
     * 
     * @param updateTrafficPolicyRequest
     * @return Result of the UpdateTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrafficPolicyResult updateTrafficPolicy(UpdateTrafficPolicyRequest updateTrafficPolicyRequest);

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
