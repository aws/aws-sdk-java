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
package com.amazonaws.services.licensemanagerusersubscriptions;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;

/**
 * Interface for accessing AWS License Manager User Subscriptions.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanagerusersubscriptions.AbstractAWSLicenseManagerUserSubscriptions} instead.
 * </p>
 * <p>
 * <p>
 * With License Manager, you can create user-based subscriptions to utilize licensed software with a per user
 * subscription fee on Amazon EC2 instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLicenseManagerUserSubscriptions {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "license-manager-user-subscriptions";

    /**
     * <p>
     * Associates the user to an EC2 instance to utilize user-based subscriptions.
     * </p>
     * <note>
     * <p>
     * Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing
     * periods that haven't closed (marked as <b>Pending</b> billing status) in Amazon Web Services Billing. For more
     * information, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/invoice.html">Viewing your
     * monthly charges</a> in the <i>Amazon Web Services Billing User Guide</i>.
     * </p>
     * </note>
     * 
     * @param associateUserRequest
     * @return Result of the AssociateUser operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.AssociateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/AssociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateUserResult associateUser(AssociateUserRequest associateUserRequest);

    /**
     * <p>
     * Deregisters the identity provider from providing user-based subscriptions.
     * </p>
     * 
     * @param deregisterIdentityProviderRequest
     * @return Result of the DeregisterIdentityProvider operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.DeregisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DeregisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterIdentityProviderResult deregisterIdentityProvider(DeregisterIdentityProviderRequest deregisterIdentityProviderRequest);

    /**
     * <p>
     * Disassociates the user from an EC2 instance providing user-based subscriptions.
     * </p>
     * 
     * @param disassociateUserRequest
     * @return Result of the DisassociateUser operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.DisassociateUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DisassociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateUserResult disassociateUser(DisassociateUserRequest disassociateUserRequest);

    /**
     * <p>
     * Lists the identity providers for user-based subscriptions.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return Result of the ListIdentityProviders operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListIdentityProviders
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest listIdentityProvidersRequest);

    /**
     * <p>
     * Lists the EC2 instances providing user-based subscriptions.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists the user-based subscription products available from an identity provider.
     * </p>
     * 
     * @param listProductSubscriptionsRequest
     * @return Result of the ListProductSubscriptions operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListProductSubscriptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListProductSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    ListProductSubscriptionsResult listProductSubscriptions(ListProductSubscriptionsRequest listProductSubscriptionsRequest);

    /**
     * <p>
     * Lists user associations for an identity provider.
     * </p>
     * 
     * @param listUserAssociationsRequest
     * @return Result of the ListUserAssociations operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListUserAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListUserAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListUserAssociationsResult listUserAssociations(ListUserAssociationsRequest listUserAssociationsRequest);

    /**
     * <p>
     * Registers an identity provider for user-based subscriptions.
     * </p>
     * 
     * @param registerIdentityProviderRequest
     * @return Result of the RegisterIdentityProvider operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.RegisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/RegisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterIdentityProviderResult registerIdentityProvider(RegisterIdentityProviderRequest registerIdentityProviderRequest);

    /**
     * <p>
     * Starts a product subscription for a user with the specified identity provider.
     * </p>
     * <note>
     * <p>
     * Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing
     * periods that haven't closed (marked as <b>Pending</b> billing status) in Amazon Web Services Billing. For more
     * information, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/invoice.html">Viewing your
     * monthly charges</a> in the <i>Amazon Web Services Billing User Guide</i>.
     * </p>
     * </note>
     * 
     * @param startProductSubscriptionRequest
     * @return Result of the StartProductSubscription operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.StartProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StartProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    StartProductSubscriptionResult startProductSubscription(StartProductSubscriptionRequest startProductSubscriptionRequest);

    /**
     * <p>
     * Stops a product subscription for a user with the specified identity provider.
     * </p>
     * 
     * @param stopProductSubscriptionRequest
     * @return Result of the StopProductSubscription operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.StopProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StopProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    StopProductSubscriptionResult stopProductSubscription(StopProductSubscriptionRequest stopProductSubscriptionRequest);

    /**
     * <p>
     * Updates additional product configuration settings for the registered identity provider.
     * </p>
     * 
     * @param updateIdentityProviderSettingsRequest
     * @return Result of the UpdateIdentityProviderSettings operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.UpdateIdentityProviderSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/UpdateIdentityProviderSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdentityProviderSettingsResult updateIdentityProviderSettings(UpdateIdentityProviderSettingsRequest updateIdentityProviderSettingsRequest);

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
