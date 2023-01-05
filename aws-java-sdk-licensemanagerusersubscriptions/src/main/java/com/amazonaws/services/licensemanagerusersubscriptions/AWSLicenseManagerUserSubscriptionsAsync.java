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

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;

/**
 * Interface for accessing AWS License Manager User Subscriptions asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanagerusersubscriptions.AbstractAWSLicenseManagerUserSubscriptionsAsync}
 * instead.
 * </p>
 * <p>
 * <p>
 * With License Manager, you can create user-based subscriptions to utilize licensed software with a per user
 * subscription fee on Amazon EC2 instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLicenseManagerUserSubscriptionsAsync extends AWSLicenseManagerUserSubscriptions {

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
     * @return A Java Future containing the result of the AssociateUser operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.AssociateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/AssociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserResult> associateUserAsync(AssociateUserRequest associateUserRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateUser operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.AssociateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/AssociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserResult> associateUserAsync(AssociateUserRequest associateUserRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateUserRequest, AssociateUserResult> asyncHandler);

    /**
     * <p>
     * Deregisters the identity provider from providing user-based subscriptions.
     * </p>
     * 
     * @param deregisterIdentityProviderRequest
     * @return A Java Future containing the result of the DeregisterIdentityProvider operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.DeregisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DeregisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterIdentityProviderResult> deregisterIdentityProviderAsync(
            DeregisterIdentityProviderRequest deregisterIdentityProviderRequest);

    /**
     * <p>
     * Deregisters the identity provider from providing user-based subscriptions.
     * </p>
     * 
     * @param deregisterIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterIdentityProvider operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.DeregisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DeregisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterIdentityProviderResult> deregisterIdentityProviderAsync(
            DeregisterIdentityProviderRequest deregisterIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterIdentityProviderRequest, DeregisterIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Disassociates the user from an EC2 instance providing user-based subscriptions.
     * </p>
     * 
     * @param disassociateUserRequest
     * @return A Java Future containing the result of the DisassociateUser operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.DisassociateUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DisassociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserResult> disassociateUserAsync(DisassociateUserRequest disassociateUserRequest);

    /**
     * <p>
     * Disassociates the user from an EC2 instance providing user-based subscriptions.
     * </p>
     * 
     * @param disassociateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateUser operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.DisassociateUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DisassociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserResult> disassociateUserAsync(DisassociateUserRequest disassociateUserRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateUserRequest, DisassociateUserResult> asyncHandler);

    /**
     * <p>
     * Lists the identity providers for user-based subscriptions.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return A Java Future containing the result of the ListIdentityProviders operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.ListIdentityProviders
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest listIdentityProvidersRequest);

    /**
     * <p>
     * Lists the identity providers for user-based subscriptions.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityProviders operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.ListIdentityProviders
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest listIdentityProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler);

    /**
     * <p>
     * Lists the EC2 instances providing user-based subscriptions.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists the EC2 instances providing user-based subscriptions.
     * </p>
     * 
     * @param listInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the user-based subscription products available from an identity provider.
     * </p>
     * 
     * @param listProductSubscriptionsRequest
     * @return A Java Future containing the result of the ListProductSubscriptions operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.ListProductSubscriptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListProductSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProductSubscriptionsResult> listProductSubscriptionsAsync(ListProductSubscriptionsRequest listProductSubscriptionsRequest);

    /**
     * <p>
     * Lists the user-based subscription products available from an identity provider.
     * </p>
     * 
     * @param listProductSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProductSubscriptions operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.ListProductSubscriptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListProductSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProductSubscriptionsResult> listProductSubscriptionsAsync(ListProductSubscriptionsRequest listProductSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProductSubscriptionsRequest, ListProductSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Lists user associations for an identity provider.
     * </p>
     * 
     * @param listUserAssociationsRequest
     * @return A Java Future containing the result of the ListUserAssociations operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.ListUserAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListUserAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserAssociationsResult> listUserAssociationsAsync(ListUserAssociationsRequest listUserAssociationsRequest);

    /**
     * <p>
     * Lists user associations for an identity provider.
     * </p>
     * 
     * @param listUserAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserAssociations operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.ListUserAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListUserAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserAssociationsResult> listUserAssociationsAsync(ListUserAssociationsRequest listUserAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserAssociationsRequest, ListUserAssociationsResult> asyncHandler);

    /**
     * <p>
     * Registers an identity provider for user-based subscriptions.
     * </p>
     * 
     * @param registerIdentityProviderRequest
     * @return A Java Future containing the result of the RegisterIdentityProvider operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.RegisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/RegisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterIdentityProviderResult> registerIdentityProviderAsync(RegisterIdentityProviderRequest registerIdentityProviderRequest);

    /**
     * <p>
     * Registers an identity provider for user-based subscriptions.
     * </p>
     * 
     * @param registerIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterIdentityProvider operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.RegisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/RegisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterIdentityProviderResult> registerIdentityProviderAsync(RegisterIdentityProviderRequest registerIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterIdentityProviderRequest, RegisterIdentityProviderResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartProductSubscription operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.StartProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StartProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartProductSubscriptionResult> startProductSubscriptionAsync(StartProductSubscriptionRequest startProductSubscriptionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartProductSubscription operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.StartProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StartProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartProductSubscriptionResult> startProductSubscriptionAsync(StartProductSubscriptionRequest startProductSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<StartProductSubscriptionRequest, StartProductSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Stops a product subscription for a user with the specified identity provider.
     * </p>
     * 
     * @param stopProductSubscriptionRequest
     * @return A Java Future containing the result of the StopProductSubscription operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.StopProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StopProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopProductSubscriptionResult> stopProductSubscriptionAsync(StopProductSubscriptionRequest stopProductSubscriptionRequest);

    /**
     * <p>
     * Stops a product subscription for a user with the specified identity provider.
     * </p>
     * 
     * @param stopProductSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopProductSubscription operation returned by the service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.StopProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StopProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopProductSubscriptionResult> stopProductSubscriptionAsync(StopProductSubscriptionRequest stopProductSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<StopProductSubscriptionRequest, StopProductSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Updates additional product configuration settings for the registered identity provider.
     * </p>
     * 
     * @param updateIdentityProviderSettingsRequest
     * @return A Java Future containing the result of the UpdateIdentityProviderSettings operation returned by the
     *         service.
     * @sample AWSLicenseManagerUserSubscriptionsAsync.UpdateIdentityProviderSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/UpdateIdentityProviderSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderSettingsResult> updateIdentityProviderSettingsAsync(
            UpdateIdentityProviderSettingsRequest updateIdentityProviderSettingsRequest);

    /**
     * <p>
     * Updates additional product configuration settings for the registered identity provider.
     * </p>
     * 
     * @param updateIdentityProviderSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentityProviderSettings operation returned by the
     *         service.
     * @sample AWSLicenseManagerUserSubscriptionsAsyncHandler.UpdateIdentityProviderSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/UpdateIdentityProviderSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderSettingsResult> updateIdentityProviderSettingsAsync(
            UpdateIdentityProviderSettingsRequest updateIdentityProviderSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderSettingsRequest, UpdateIdentityProviderSettingsResult> asyncHandler);

}
