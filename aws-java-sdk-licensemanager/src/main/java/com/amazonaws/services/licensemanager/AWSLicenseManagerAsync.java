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
package com.amazonaws.services.licensemanager;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;

/**
 * Interface for accessing AWS License Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanager.AbstractAWSLicenseManagerAsync} instead.
 * </p>
 * <p>
 * <fullname> AWS License Manager </fullname>
 * <p>
 * AWS License Manager makes it easier to manage licenses from software vendors across multiple AWS accounts and
 * on-premises servers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLicenseManagerAsync extends AWSLicenseManager {

    /**
     * <p>
     * Accepts the specified grant.
     * </p>
     * 
     * @param acceptGrantRequest
     * @return A Java Future containing the result of the AcceptGrant operation returned by the service.
     * @sample AWSLicenseManagerAsync.AcceptGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/AcceptGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptGrantResult> acceptGrantAsync(AcceptGrantRequest acceptGrantRequest);

    /**
     * <p>
     * Accepts the specified grant.
     * </p>
     * 
     * @param acceptGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptGrant operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.AcceptGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/AcceptGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptGrantResult> acceptGrantAsync(AcceptGrantRequest acceptGrantRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptGrantRequest, AcceptGrantResult> asyncHandler);

    /**
     * <p>
     * Checks in the specified license. Check in a license when it is no longer in use.
     * </p>
     * 
     * @param checkInLicenseRequest
     * @return A Java Future containing the result of the CheckInLicense operation returned by the service.
     * @sample AWSLicenseManagerAsync.CheckInLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckInLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CheckInLicenseResult> checkInLicenseAsync(CheckInLicenseRequest checkInLicenseRequest);

    /**
     * <p>
     * Checks in the specified license. Check in a license when it is no longer in use.
     * </p>
     * 
     * @param checkInLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckInLicense operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CheckInLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckInLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CheckInLicenseResult> checkInLicenseAsync(CheckInLicenseRequest checkInLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<CheckInLicenseRequest, CheckInLicenseResult> asyncHandler);

    /**
     * <p>
     * Checks out the specified license for offline use.
     * </p>
     * 
     * @param checkoutBorrowLicenseRequest
     * @return A Java Future containing the result of the CheckoutBorrowLicense operation returned by the service.
     * @sample AWSLicenseManagerAsync.CheckoutBorrowLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutBorrowLicense"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CheckoutBorrowLicenseResult> checkoutBorrowLicenseAsync(CheckoutBorrowLicenseRequest checkoutBorrowLicenseRequest);

    /**
     * <p>
     * Checks out the specified license for offline use.
     * </p>
     * 
     * @param checkoutBorrowLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckoutBorrowLicense operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CheckoutBorrowLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutBorrowLicense"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CheckoutBorrowLicenseResult> checkoutBorrowLicenseAsync(CheckoutBorrowLicenseRequest checkoutBorrowLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<CheckoutBorrowLicenseRequest, CheckoutBorrowLicenseResult> asyncHandler);

    /**
     * <p>
     * Checks out the specified license.
     * </p>
     * 
     * @param checkoutLicenseRequest
     * @return A Java Future containing the result of the CheckoutLicense operation returned by the service.
     * @sample AWSLicenseManagerAsync.CheckoutLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutLicense"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CheckoutLicenseResult> checkoutLicenseAsync(CheckoutLicenseRequest checkoutLicenseRequest);

    /**
     * <p>
     * Checks out the specified license.
     * </p>
     * 
     * @param checkoutLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckoutLicense operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CheckoutLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutLicense"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CheckoutLicenseResult> checkoutLicenseAsync(CheckoutLicenseRequest checkoutLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<CheckoutLicenseRequest, CheckoutLicenseResult> asyncHandler);

    /**
     * <p>
     * Creates a grant for the specified license. A grant shares the use of license entitlements with specific AWS
     * accounts.
     * </p>
     * 
     * @param createGrantRequest
     * @return A Java Future containing the result of the CreateGrant operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest createGrantRequest);

    /**
     * <p>
     * Creates a grant for the specified license. A grant shares the use of license entitlements with specific AWS
     * accounts.
     * </p>
     * 
     * @param createGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGrant operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest createGrantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the specified grant.
     * </p>
     * 
     * @param createGrantVersionRequest
     * @return A Java Future containing the result of the CreateGrantVersion operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateGrantVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrantVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGrantVersionResult> createGrantVersionAsync(CreateGrantVersionRequest createGrantVersionRequest);

    /**
     * <p>
     * Creates a new version of the specified grant.
     * </p>
     * 
     * @param createGrantVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGrantVersion operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateGrantVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrantVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGrantVersionResult> createGrantVersionAsync(CreateGrantVersionRequest createGrantVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGrantVersionRequest, CreateGrantVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a license.
     * </p>
     * 
     * @param createLicenseRequest
     * @return A Java Future containing the result of the CreateLicense operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseResult> createLicenseAsync(CreateLicenseRequest createLicenseRequest);

    /**
     * <p>
     * Creates a license.
     * </p>
     * 
     * @param createLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLicense operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseResult> createLicenseAsync(CreateLicenseRequest createLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLicenseRequest, CreateLicenseResult> asyncHandler);

    /**
     * <p>
     * Creates a license configuration.
     * </p>
     * <p>
     * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
     * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
     * vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), license affinity to
     * host (how long a license must be associated with a host), and the number of licenses purchased and used.
     * </p>
     * 
     * @param createLicenseConfigurationRequest
     * @return A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(
            CreateLicenseConfigurationRequest createLicenseConfigurationRequest);

    /**
     * <p>
     * Creates a license configuration.
     * </p>
     * <p>
     * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
     * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
     * vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), license affinity to
     * host (how long a license must be associated with a host), and the number of licenses purchased and used.
     * </p>
     * 
     * @param createLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(
            CreateLicenseConfigurationRequest createLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLicenseConfigurationRequest, CreateLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the specified license.
     * </p>
     * 
     * @param createLicenseVersionRequest
     * @return A Java Future containing the result of the CreateLicenseVersion operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateLicenseVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseVersionResult> createLicenseVersionAsync(CreateLicenseVersionRequest createLicenseVersionRequest);

    /**
     * <p>
     * Creates a new version of the specified license.
     * </p>
     * 
     * @param createLicenseVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLicenseVersion operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateLicenseVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseVersionResult> createLicenseVersionAsync(CreateLicenseVersionRequest createLicenseVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLicenseVersionRequest, CreateLicenseVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a long-lived token.
     * </p>
     * <p>
     * A refresh token is a JWT token used to get an access token. With an access token, you can call
     * AssumeRoleWithWebIdentity to get role credentials that you can use to call License Manager to manage the
     * specified license.
     * </p>
     * 
     * @param createTokenRequest
     * @return A Java Future containing the result of the CreateToken operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest createTokenRequest);

    /**
     * <p>
     * Creates a long-lived token.
     * </p>
     * <p>
     * A refresh token is a JWT token used to get an access token. With an access token, you can call
     * AssumeRoleWithWebIdentity to get role credentials that you can use to call License Manager to manage the
     * specified license.
     * </p>
     * 
     * @param createTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateToken operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest createTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified grant.
     * </p>
     * 
     * @param deleteGrantRequest
     * @return A Java Future containing the result of the DeleteGrant operation returned by the service.
     * @sample AWSLicenseManagerAsync.DeleteGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGrantResult> deleteGrantAsync(DeleteGrantRequest deleteGrantRequest);

    /**
     * <p>
     * Deletes the specified grant.
     * </p>
     * 
     * @param deleteGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGrant operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.DeleteGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGrantResult> deleteGrantAsync(DeleteGrantRequest deleteGrantRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGrantRequest, DeleteGrantResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified license.
     * </p>
     * 
     * @param deleteLicenseRequest
     * @return A Java Future containing the result of the DeleteLicense operation returned by the service.
     * @sample AWSLicenseManagerAsync.DeleteLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseResult> deleteLicenseAsync(DeleteLicenseRequest deleteLicenseRequest);

    /**
     * <p>
     * Deletes the specified license.
     * </p>
     * 
     * @param deleteLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLicense operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.DeleteLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseResult> deleteLicenseAsync(DeleteLicenseRequest deleteLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLicenseRequest, DeleteLicenseResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified license configuration.
     * </p>
     * <p>
     * You cannot delete a license configuration that is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @return A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(
            DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest);

    /**
     * <p>
     * Deletes the specified license configuration.
     * </p>
     * <p>
     * You cannot delete a license configuration that is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(
            DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLicenseConfigurationRequest, DeleteLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified token. Must be called in the license home Region.
     * </p>
     * 
     * @param deleteTokenRequest
     * @return A Java Future containing the result of the DeleteToken operation returned by the service.
     * @sample AWSLicenseManagerAsync.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(DeleteTokenRequest deleteTokenRequest);

    /**
     * <p>
     * Deletes the specified token. Must be called in the license home Region.
     * </p>
     * 
     * @param deleteTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteToken operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(DeleteTokenRequest deleteTokenRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTokenRequest, DeleteTokenResult> asyncHandler);

    /**
     * <p>
     * Extends the expiration date for license consumption.
     * </p>
     * 
     * @param extendLicenseConsumptionRequest
     * @return A Java Future containing the result of the ExtendLicenseConsumption operation returned by the service.
     * @sample AWSLicenseManagerAsync.ExtendLicenseConsumption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ExtendLicenseConsumption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExtendLicenseConsumptionResult> extendLicenseConsumptionAsync(ExtendLicenseConsumptionRequest extendLicenseConsumptionRequest);

    /**
     * <p>
     * Extends the expiration date for license consumption.
     * </p>
     * 
     * @param extendLicenseConsumptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExtendLicenseConsumption operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ExtendLicenseConsumption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ExtendLicenseConsumption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExtendLicenseConsumptionResult> extendLicenseConsumptionAsync(ExtendLicenseConsumptionRequest extendLicenseConsumptionRequest,
            com.amazonaws.handlers.AsyncHandler<ExtendLicenseConsumptionRequest, ExtendLicenseConsumptionResult> asyncHandler);

    /**
     * <p>
     * Gets a temporary access token to use with AssumeRoleWithWebIdentity. Access tokens are valid for one hour.
     * </p>
     * 
     * @param getAccessTokenRequest
     * @return A Java Future containing the result of the GetAccessToken operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetAccessToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetAccessToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessTokenResult> getAccessTokenAsync(GetAccessTokenRequest getAccessTokenRequest);

    /**
     * <p>
     * Gets a temporary access token to use with AssumeRoleWithWebIdentity. Access tokens are valid for one hour.
     * </p>
     * 
     * @param getAccessTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessToken operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetAccessToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetAccessToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessTokenResult> getAccessTokenAsync(GetAccessTokenRequest getAccessTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessTokenRequest, GetAccessTokenResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about the specified grant.
     * </p>
     * 
     * @param getGrantRequest
     * @return A Java Future containing the result of the GetGrant operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGrantResult> getGrantAsync(GetGrantRequest getGrantRequest);

    /**
     * <p>
     * Gets detailed information about the specified grant.
     * </p>
     * 
     * @param getGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGrant operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGrantResult> getGrantAsync(GetGrantRequest getGrantRequest,
            com.amazonaws.handlers.AsyncHandler<GetGrantRequest, GetGrantResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about the specified license.
     * </p>
     * 
     * @param getLicenseRequest
     * @return A Java Future containing the result of the GetLicense operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseResult> getLicenseAsync(GetLicenseRequest getLicenseRequest);

    /**
     * <p>
     * Gets detailed information about the specified license.
     * </p>
     * 
     * @param getLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLicense operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseResult> getLicenseAsync(GetLicenseRequest getLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<GetLicenseRequest, GetLicenseResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about the specified license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @return A Java Future containing the result of the GetLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest getLicenseConfigurationRequest);

    /**
     * <p>
     * Gets detailed information about the specified license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest getLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLicenseConfigurationRequest, GetLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about the usage of the specified license.
     * </p>
     * 
     * @param getLicenseUsageRequest
     * @return A Java Future containing the result of the GetLicenseUsage operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetLicenseUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseUsageResult> getLicenseUsageAsync(GetLicenseUsageRequest getLicenseUsageRequest);

    /**
     * <p>
     * Gets detailed information about the usage of the specified license.
     * </p>
     * 
     * @param getLicenseUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLicenseUsage operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetLicenseUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseUsageResult> getLicenseUsageAsync(GetLicenseUsageRequest getLicenseUsageRequest,
            com.amazonaws.handlers.AsyncHandler<GetLicenseUsageRequest, GetLicenseUsageResult> asyncHandler);

    /**
     * <p>
     * Gets the License Manager settings for the current Region.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return A Java Future containing the result of the GetServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest getServiceSettingsRequest);

    /**
     * <p>
     * Gets the License Manager settings for the current Region.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest getServiceSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceSettingsRequest, GetServiceSettingsResult> asyncHandler);

    /**
     * <p>
     * Lists the resource associations for the specified license configuration.
     * </p>
     * <p>
     * Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped
     * instance might not consume a license (depending on the license rules).
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @return A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsync.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest);

    /**
     * <p>
     * Lists the resource associations for the specified license configuration.
     * </p>
     * <p>
     * Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped
     * instance might not consume a license (depending on the license rules).
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsyncHandler.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsForLicenseConfigurationRequest, ListAssociationsForLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Lists the grants distributed for the specified license.
     * </p>
     * 
     * @param listDistributedGrantsRequest
     * @return A Java Future containing the result of the ListDistributedGrants operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListDistributedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListDistributedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributedGrantsResult> listDistributedGrantsAsync(ListDistributedGrantsRequest listDistributedGrantsRequest);

    /**
     * <p>
     * Lists the grants distributed for the specified license.
     * </p>
     * 
     * @param listDistributedGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributedGrants operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListDistributedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListDistributedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributedGrantsResult> listDistributedGrantsAsync(ListDistributedGrantsRequest listDistributedGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributedGrantsRequest, ListDistributedGrantsResult> asyncHandler);

    /**
     * <p>
     * Lists the license configuration operations that failed.
     * </p>
     * 
     * @param listFailuresForLicenseConfigurationOperationsRequest
     * @return A Java Future containing the result of the ListFailuresForLicenseConfigurationOperations operation
     *         returned by the service.
     * @sample AWSLicenseManagerAsync.ListFailuresForLicenseConfigurationOperations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListFailuresForLicenseConfigurationOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFailuresForLicenseConfigurationOperationsResult> listFailuresForLicenseConfigurationOperationsAsync(
            ListFailuresForLicenseConfigurationOperationsRequest listFailuresForLicenseConfigurationOperationsRequest);

    /**
     * <p>
     * Lists the license configuration operations that failed.
     * </p>
     * 
     * @param listFailuresForLicenseConfigurationOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFailuresForLicenseConfigurationOperations operation
     *         returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListFailuresForLicenseConfigurationOperations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListFailuresForLicenseConfigurationOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFailuresForLicenseConfigurationOperationsResult> listFailuresForLicenseConfigurationOperationsAsync(
            ListFailuresForLicenseConfigurationOperationsRequest listFailuresForLicenseConfigurationOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFailuresForLicenseConfigurationOperationsRequest, ListFailuresForLicenseConfigurationOperationsResult> asyncHandler);

    /**
     * <p>
     * Lists the license configurations for your account.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @return A Java Future containing the result of the ListLicenseConfigurations operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(
            ListLicenseConfigurationsRequest listLicenseConfigurationsRequest);

    /**
     * <p>
     * Lists the license configurations for your account.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenseConfigurations operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(
            ListLicenseConfigurationsRequest listLicenseConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicenseConfigurationsRequest, ListLicenseConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the license configurations for the specified resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @return A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsync.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Describes the license configurations for the specified resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsyncHandler.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicenseSpecificationsForResourceRequest, ListLicenseSpecificationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all versions of the specified license.
     * </p>
     * 
     * @param listLicenseVersionsRequest
     * @return A Java Future containing the result of the ListLicenseVersions operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListLicenseVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseVersionsResult> listLicenseVersionsAsync(ListLicenseVersionsRequest listLicenseVersionsRequest);

    /**
     * <p>
     * Lists all versions of the specified license.
     * </p>
     * 
     * @param listLicenseVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenseVersions operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListLicenseVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseVersionsResult> listLicenseVersionsAsync(ListLicenseVersionsRequest listLicenseVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicenseVersionsRequest, ListLicenseVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the licenses for your account.
     * </p>
     * 
     * @param listLicensesRequest
     * @return A Java Future containing the result of the ListLicenses operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLicensesResult> listLicensesAsync(ListLicensesRequest listLicensesRequest);

    /**
     * <p>
     * Lists the licenses for your account.
     * </p>
     * 
     * @param listLicensesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenses operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLicensesResult> listLicensesAsync(ListLicensesRequest listLicensesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicensesRequest, ListLicensesResult> asyncHandler);

    /**
     * <p>
     * Lists grants that are received but not accepted.
     * </p>
     * 
     * @param listReceivedGrantsRequest
     * @return A Java Future containing the result of the ListReceivedGrants operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListReceivedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReceivedGrantsResult> listReceivedGrantsAsync(ListReceivedGrantsRequest listReceivedGrantsRequest);

    /**
     * <p>
     * Lists grants that are received but not accepted.
     * </p>
     * 
     * @param listReceivedGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReceivedGrants operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListReceivedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReceivedGrantsResult> listReceivedGrantsAsync(ListReceivedGrantsRequest listReceivedGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceivedGrantsRequest, ListReceivedGrantsResult> asyncHandler);

    /**
     * <p>
     * Lists received licenses.
     * </p>
     * 
     * @param listReceivedLicensesRequest
     * @return A Java Future containing the result of the ListReceivedLicenses operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListReceivedLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedLicenses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReceivedLicensesResult> listReceivedLicensesAsync(ListReceivedLicensesRequest listReceivedLicensesRequest);

    /**
     * <p>
     * Lists received licenses.
     * </p>
     * 
     * @param listReceivedLicensesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReceivedLicenses operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListReceivedLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedLicenses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReceivedLicensesResult> listReceivedLicensesAsync(ListReceivedLicensesRequest listReceivedLicensesRequest,
            com.amazonaws.handlers.AsyncHandler<ListReceivedLicensesRequest, ListReceivedLicensesResult> asyncHandler);

    /**
     * <p>
     * Lists resources managed using Systems Manager inventory.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @return A Java Future containing the result of the ListResourceInventory operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest listResourceInventoryRequest);

    /**
     * <p>
     * Lists resources managed using Systems Manager inventory.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceInventory operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest listResourceInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceInventoryRequest, ListResourceInventoryResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified license configuration.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified license configuration.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists your tokens.
     * </p>
     * 
     * @param listTokensRequest
     * @return A Java Future containing the result of the ListTokens operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTokens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTokensResult> listTokensAsync(ListTokensRequest listTokensRequest);

    /**
     * <p>
     * Lists your tokens.
     * </p>
     * 
     * @param listTokensRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTokens operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTokens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTokensResult> listTokensAsync(ListTokensRequest listTokensRequest,
            com.amazonaws.handlers.AsyncHandler<ListTokensRequest, ListTokensResult> asyncHandler);

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @return A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsync.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest);

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsyncHandler.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsageForLicenseConfigurationRequest, ListUsageForLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Rejects the specified grant.
     * </p>
     * 
     * @param rejectGrantRequest
     * @return A Java Future containing the result of the RejectGrant operation returned by the service.
     * @sample AWSLicenseManagerAsync.RejectGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/RejectGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RejectGrantResult> rejectGrantAsync(RejectGrantRequest rejectGrantRequest);

    /**
     * <p>
     * Rejects the specified grant.
     * </p>
     * 
     * @param rejectGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectGrant operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.RejectGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/RejectGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RejectGrantResult> rejectGrantAsync(RejectGrantRequest rejectGrantRequest,
            com.amazonaws.handlers.AsyncHandler<RejectGrantRequest, RejectGrantResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified license configuration.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLicenseManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified license configuration.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified license configuration.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLicenseManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified license configuration.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the attributes of an existing license configuration.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @return A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(
            UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest);

    /**
     * <p>
     * Modifies the attributes of an existing license configuration.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(
            UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLicenseConfigurationRequest, UpdateLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds or removes the specified license configurations for the specified AWS resource.
     * </p>
     * <p>
     * You can update the license specifications of AMIs, instances, and hosts. You cannot update the license
     * specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the
     * operation that creates the resource.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @return A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsync.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Adds or removes the specified license configurations for the specified AWS resource.
     * </p>
     * <p>
     * You can update the license specifications of AMIs, instances, and hosts. You cannot update the license
     * specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the
     * operation that creates the resource.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsyncHandler.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLicenseSpecificationsForResourceRequest, UpdateLicenseSpecificationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Updates License Manager settings for the current Region.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return A Java Future containing the result of the UpdateServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsync.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest updateServiceSettingsRequest);

    /**
     * <p>
     * Updates License Manager settings for the current Region.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest updateServiceSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingsRequest, UpdateServiceSettingsResult> asyncHandler);

}
