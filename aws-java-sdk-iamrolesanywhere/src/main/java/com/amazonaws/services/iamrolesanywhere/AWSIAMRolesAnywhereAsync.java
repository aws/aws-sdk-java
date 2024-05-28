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
package com.amazonaws.services.iamrolesanywhere;

import javax.annotation.Generated;

import com.amazonaws.services.iamrolesanywhere.model.*;

/**
 * Interface for accessing IAM Roles Anywhere asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iamrolesanywhere.AbstractAWSIAMRolesAnywhereAsync} instead.
 * </p>
 * <p>
 * <p>
 * Identity and Access Management Roles Anywhere provides a secure way for your workloads such as servers, containers,
 * and applications that run outside of Amazon Web Services to obtain temporary Amazon Web Services credentials. Your
 * workloads can use the same IAM policies and roles you have for native Amazon Web Services applications to access
 * Amazon Web Services resources. Using IAM Roles Anywhere eliminates the need to manage long-term credentials for
 * workloads running outside of Amazon Web Services.
 * </p>
 * <p>
 * To use IAM Roles Anywhere, your workloads must use X.509 certificates issued by their certificate authority (CA). You
 * register the CA with IAM Roles Anywhere as a trust anchor to establish trust between your public key infrastructure
 * (PKI) and IAM Roles Anywhere. If you don't manage your own PKI system, you can use Private Certificate Authority to
 * create a CA and then use that to establish trust with IAM Roles Anywhere.
 * </p>
 * <p>
 * This guide describes the IAM Roles Anywhere operations that you can call programmatically. For more information about
 * IAM Roles Anywhere, see the <a
 * href="https://docs.aws.amazon.com/rolesanywhere/latest/userguide/introduction.html">IAM Roles Anywhere User
 * Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIAMRolesAnywhereAsync extends AWSIAMRolesAnywhere {

    /**
     * <p>
     * Creates a <i>profile</i>, a list of the roles that Roles Anywhere service is trusted to assume. You use profiles
     * to intersect permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateProfile</code>.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a <i>profile</i>, a list of the roles that Roles Anywhere service is trusted to assume. You use profiles
     * to intersect permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateProfile</code>.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a trust anchor to establish trust between IAM Roles Anywhere and your certificate authority (CA). You can
     * define a trust anchor as a reference to an Private Certificate Authority (Private CA) or by uploading a CA
     * certificate. Your Amazon Web Services workloads can authenticate with the trust anchor using certificates issued
     * by the CA in exchange for temporary Amazon Web Services credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateTrustAnchor</code>.
     * </p>
     * 
     * @param createTrustAnchorRequest
     * @return A Java Future containing the result of the CreateTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.CreateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustAnchorResult> createTrustAnchorAsync(CreateTrustAnchorRequest createTrustAnchorRequest);

    /**
     * <p>
     * Creates a trust anchor to establish trust between IAM Roles Anywhere and your certificate authority (CA). You can
     * define a trust anchor as a reference to an Private Certificate Authority (Private CA) or by uploading a CA
     * certificate. Your Amazon Web Services workloads can authenticate with the trust anchor using certificates issued
     * by the CA in exchange for temporary Amazon Web Services credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateTrustAnchor</code>.
     * </p>
     * 
     * @param createTrustAnchorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.CreateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustAnchorResult> createTrustAnchorAsync(CreateTrustAnchorRequest createTrustAnchorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrustAnchorRequest, CreateTrustAnchorResult> asyncHandler);

    /**
     * <p>
     * Delete an entry from the attribute mapping rules enforced by a given profile.
     * </p>
     * 
     * @param deleteAttributeMappingRequest
     * @return A Java Future containing the result of the DeleteAttributeMapping operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DeleteAttributeMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteAttributeMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttributeMappingResult> deleteAttributeMappingAsync(DeleteAttributeMappingRequest deleteAttributeMappingRequest);

    /**
     * <p>
     * Delete an entry from the attribute mapping rules enforced by a given profile.
     * </p>
     * 
     * @param deleteAttributeMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAttributeMapping operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DeleteAttributeMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteAttributeMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttributeMappingResult> deleteAttributeMappingAsync(DeleteAttributeMappingRequest deleteAttributeMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAttributeMappingRequest, DeleteAttributeMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteCrl</code>.
     * </p>
     * 
     * @param deleteCrlRequest
     * @return A Java Future containing the result of the DeleteCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DeleteCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrlResult> deleteCrlAsync(DeleteCrlRequest deleteCrlRequest);

    /**
     * <p>
     * Deletes a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteCrl</code>.
     * </p>
     * 
     * @param deleteCrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DeleteCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrlResult> deleteCrlAsync(DeleteCrlRequest deleteCrlRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCrlRequest, DeleteCrlResult> asyncHandler);

    /**
     * <p>
     * Deletes a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteProfile</code>.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteProfile</code>.
     * </p>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteTrustAnchor</code>.
     * </p>
     * 
     * @param deleteTrustAnchorRequest
     * @return A Java Future containing the result of the DeleteTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DeleteTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustAnchorResult> deleteTrustAnchorAsync(DeleteTrustAnchorRequest deleteTrustAnchorRequest);

    /**
     * <p>
     * Deletes a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteTrustAnchor</code>.
     * </p>
     * 
     * @param deleteTrustAnchorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DeleteTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustAnchorResult> deleteTrustAnchorAsync(DeleteTrustAnchorRequest deleteTrustAnchorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrustAnchorRequest, DeleteTrustAnchorResult> asyncHandler);

    /**
     * <p>
     * Disables a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableCrl</code>.
     * </p>
     * 
     * @param disableCrlRequest
     * @return A Java Future containing the result of the DisableCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DisableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableCrlResult> disableCrlAsync(DisableCrlRequest disableCrlRequest);

    /**
     * <p>
     * Disables a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableCrl</code>.
     * </p>
     * 
     * @param disableCrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DisableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableCrlResult> disableCrlAsync(DisableCrlRequest disableCrlRequest,
            com.amazonaws.handlers.AsyncHandler<DisableCrlRequest, DisableCrlResult> asyncHandler);

    /**
     * <p>
     * Disables a profile. When disabled, temporary credential requests with this profile fail.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableProfile</code>.
     * </p>
     * 
     * @param disableProfileRequest
     * @return A Java Future containing the result of the DisableProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DisableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableProfileResult> disableProfileAsync(DisableProfileRequest disableProfileRequest);

    /**
     * <p>
     * Disables a profile. When disabled, temporary credential requests with this profile fail.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableProfile</code>.
     * </p>
     * 
     * @param disableProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DisableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableProfileResult> disableProfileAsync(DisableProfileRequest disableProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DisableProfileRequest, DisableProfileResult> asyncHandler);

    /**
     * <p>
     * Disables a trust anchor. When disabled, temporary credential requests specifying this trust anchor are
     * unauthorized.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableTrustAnchor</code>.
     * </p>
     * 
     * @param disableTrustAnchorRequest
     * @return A Java Future containing the result of the DisableTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.DisableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableTrustAnchorResult> disableTrustAnchorAsync(DisableTrustAnchorRequest disableTrustAnchorRequest);

    /**
     * <p>
     * Disables a trust anchor. When disabled, temporary credential requests specifying this trust anchor are
     * unauthorized.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableTrustAnchor</code>.
     * </p>
     * 
     * @param disableTrustAnchorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.DisableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableTrustAnchorResult> disableTrustAnchorAsync(DisableTrustAnchorRequest disableTrustAnchorRequest,
            com.amazonaws.handlers.AsyncHandler<DisableTrustAnchorRequest, DisableTrustAnchorResult> asyncHandler);

    /**
     * <p>
     * Enables a certificate revocation list (CRL). When enabled, certificates stored in the CRL are unauthorized to
     * receive session credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableCrl</code>.
     * </p>
     * 
     * @param enableCrlRequest
     * @return A Java Future containing the result of the EnableCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.EnableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableCrlResult> enableCrlAsync(EnableCrlRequest enableCrlRequest);

    /**
     * <p>
     * Enables a certificate revocation list (CRL). When enabled, certificates stored in the CRL are unauthorized to
     * receive session credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableCrl</code>.
     * </p>
     * 
     * @param enableCrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.EnableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableCrlResult> enableCrlAsync(EnableCrlRequest enableCrlRequest,
            com.amazonaws.handlers.AsyncHandler<EnableCrlRequest, EnableCrlResult> asyncHandler);

    /**
     * <p>
     * Enables temporary credential requests for a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableProfile</code>.
     * </p>
     * 
     * @param enableProfileRequest
     * @return A Java Future containing the result of the EnableProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.EnableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableProfileResult> enableProfileAsync(EnableProfileRequest enableProfileRequest);

    /**
     * <p>
     * Enables temporary credential requests for a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableProfile</code>.
     * </p>
     * 
     * @param enableProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.EnableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableProfileResult> enableProfileAsync(EnableProfileRequest enableProfileRequest,
            com.amazonaws.handlers.AsyncHandler<EnableProfileRequest, EnableProfileResult> asyncHandler);

    /**
     * <p>
     * Enables a trust anchor. When enabled, certificates in the trust anchor chain are authorized for trust validation.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableTrustAnchor</code>.
     * </p>
     * 
     * @param enableTrustAnchorRequest
     * @return A Java Future containing the result of the EnableTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.EnableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableTrustAnchorResult> enableTrustAnchorAsync(EnableTrustAnchorRequest enableTrustAnchorRequest);

    /**
     * <p>
     * Enables a trust anchor. When enabled, certificates in the trust anchor chain are authorized for trust validation.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableTrustAnchor</code>.
     * </p>
     * 
     * @param enableTrustAnchorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.EnableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableTrustAnchorResult> enableTrustAnchorAsync(EnableTrustAnchorRequest enableTrustAnchorRequest,
            com.amazonaws.handlers.AsyncHandler<EnableTrustAnchorRequest, EnableTrustAnchorResult> asyncHandler);

    /**
     * <p>
     * Gets a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetCrl</code>.
     * </p>
     * 
     * @param getCrlRequest
     * @return A Java Future containing the result of the GetCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.GetCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrlResult> getCrlAsync(GetCrlRequest getCrlRequest);

    /**
     * <p>
     * Gets a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetCrl</code>.
     * </p>
     * 
     * @param getCrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.GetCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCrlResult> getCrlAsync(GetCrlRequest getCrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetCrlRequest, GetCrlResult> asyncHandler);

    /**
     * <p>
     * Gets a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetProfile</code>.
     * </p>
     * 
     * @param getProfileRequest
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Gets a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetProfile</code>.
     * </p>
     * 
     * @param getProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler);

    /**
     * <p>
     * Gets a <i>subject</i>, which associates a certificate identity with authentication attempts. The subject stores
     * auditing information such as the status of the last authentication attempt, the certificate data used in the
     * attempt, and the last time the associated identity attempted authentication.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetSubject</code>.
     * </p>
     * 
     * @param getSubjectRequest
     * @return A Java Future containing the result of the GetSubject operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.GetSubject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetSubject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSubjectResult> getSubjectAsync(GetSubjectRequest getSubjectRequest);

    /**
     * <p>
     * Gets a <i>subject</i>, which associates a certificate identity with authentication attempts. The subject stores
     * auditing information such as the status of the last authentication attempt, the certificate data used in the
     * attempt, and the last time the associated identity attempted authentication.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetSubject</code>.
     * </p>
     * 
     * @param getSubjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubject operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.GetSubject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetSubject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSubjectResult> getSubjectAsync(GetSubjectRequest getSubjectRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubjectRequest, GetSubjectResult> asyncHandler);

    /**
     * <p>
     * Gets a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetTrustAnchor</code>.
     * </p>
     * 
     * @param getTrustAnchorRequest
     * @return A Java Future containing the result of the GetTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.GetTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetTrustAnchor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrustAnchorResult> getTrustAnchorAsync(GetTrustAnchorRequest getTrustAnchorRequest);

    /**
     * <p>
     * Gets a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetTrustAnchor</code>.
     * </p>
     * 
     * @param getTrustAnchorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.GetTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetTrustAnchor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrustAnchorResult> getTrustAnchorAsync(GetTrustAnchorRequest getTrustAnchorRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrustAnchorRequest, GetTrustAnchorResult> asyncHandler);

    /**
     * <p>
     * Imports the certificate revocation list (CRL). A CRL is a list of certificates that have been revoked by the
     * issuing certificate Authority (CA).In order to be properly imported, a CRL must be in PEM format. IAM Roles
     * Anywhere validates against the CRL before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ImportCrl</code>.
     * </p>
     * 
     * @param importCrlRequest
     * @return A Java Future containing the result of the ImportCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ImportCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ImportCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCrlResult> importCrlAsync(ImportCrlRequest importCrlRequest);

    /**
     * <p>
     * Imports the certificate revocation list (CRL). A CRL is a list of certificates that have been revoked by the
     * issuing certificate Authority (CA).In order to be properly imported, a CRL must be in PEM format. IAM Roles
     * Anywhere validates against the CRL before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ImportCrl</code>.
     * </p>
     * 
     * @param importCrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ImportCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ImportCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCrlResult> importCrlAsync(ImportCrlRequest importCrlRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCrlRequest, ImportCrlResult> asyncHandler);

    /**
     * <p>
     * Lists all certificate revocation lists (CRL) in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListCrls</code>.
     * </p>
     * 
     * @param listCrlsRequest
     * @return A Java Future containing the result of the ListCrls operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ListCrls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListCrls" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCrlsResult> listCrlsAsync(ListCrlsRequest listCrlsRequest);

    /**
     * <p>
     * Lists all certificate revocation lists (CRL) in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListCrls</code>.
     * </p>
     * 
     * @param listCrlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCrls operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ListCrls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListCrls" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCrlsResult> listCrlsAsync(ListCrlsRequest listCrlsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCrlsRequest, ListCrlsResult> asyncHandler);

    /**
     * <p>
     * Lists all profiles in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListProfiles</code>.
     * </p>
     * 
     * @param listProfilesRequest
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists all profiles in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListProfiles</code>.
     * </p>
     * 
     * @param listProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the subjects in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListSubjects</code>.
     * </p>
     * 
     * @param listSubjectsRequest
     * @return A Java Future containing the result of the ListSubjects operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ListSubjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListSubjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSubjectsResult> listSubjectsAsync(ListSubjectsRequest listSubjectsRequest);

    /**
     * <p>
     * Lists the subjects in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListSubjects</code>.
     * </p>
     * 
     * @param listSubjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubjects operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ListSubjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListSubjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSubjectsResult> listSubjectsAsync(ListSubjectsRequest listSubjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubjectsRequest, ListSubjectsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTagsForResource</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTagsForResource</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the trust anchors in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTrustAnchors</code>.
     * </p>
     * 
     * @param listTrustAnchorsRequest
     * @return A Java Future containing the result of the ListTrustAnchors operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ListTrustAnchors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTrustAnchors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustAnchorsResult> listTrustAnchorsAsync(ListTrustAnchorsRequest listTrustAnchorsRequest);

    /**
     * <p>
     * Lists the trust anchors in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTrustAnchors</code>.
     * </p>
     * 
     * @param listTrustAnchorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrustAnchors operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ListTrustAnchors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTrustAnchors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustAnchorsResult> listTrustAnchorsAsync(ListTrustAnchorsRequest listTrustAnchorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrustAnchorsRequest, ListTrustAnchorsResult> asyncHandler);

    /**
     * <p>
     * Put an entry in the attribute mapping rules that will be enforced by a given profile. A mapping specifies a
     * certificate field and one or more specifiers that have contextual meanings.
     * </p>
     * 
     * @param putAttributeMappingRequest
     * @return A Java Future containing the result of the PutAttributeMapping operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.PutAttributeMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/PutAttributeMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAttributeMappingResult> putAttributeMappingAsync(PutAttributeMappingRequest putAttributeMappingRequest);

    /**
     * <p>
     * Put an entry in the attribute mapping rules that will be enforced by a given profile. A mapping specifies a
     * certificate field and one or more specifiers that have contextual meanings.
     * </p>
     * 
     * @param putAttributeMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAttributeMapping operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.PutAttributeMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/PutAttributeMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAttributeMappingResult> putAttributeMappingAsync(PutAttributeMappingRequest putAttributeMappingRequest,
            com.amazonaws.handlers.AsyncHandler<PutAttributeMappingRequest, PutAttributeMappingResult> asyncHandler);

    /**
     * <p>
     * Attaches a list of <i>notification settings</i> to a trust anchor.
     * </p>
     * <p>
     * A notification setting includes information such as event name, threshold, status of the notification setting,
     * and the channel to notify.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:PutNotificationSettings</code>.
     * </p>
     * 
     * @param putNotificationSettingsRequest
     * @return A Java Future containing the result of the PutNotificationSettings operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.PutNotificationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/PutNotificationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutNotificationSettingsResult> putNotificationSettingsAsync(PutNotificationSettingsRequest putNotificationSettingsRequest);

    /**
     * <p>
     * Attaches a list of <i>notification settings</i> to a trust anchor.
     * </p>
     * <p>
     * A notification setting includes information such as event name, threshold, status of the notification setting,
     * and the channel to notify.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:PutNotificationSettings</code>.
     * </p>
     * 
     * @param putNotificationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutNotificationSettings operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.PutNotificationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/PutNotificationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutNotificationSettingsResult> putNotificationSettingsAsync(PutNotificationSettingsRequest putNotificationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutNotificationSettingsRequest, PutNotificationSettingsResult> asyncHandler);

    /**
     * <p>
     * Resets the <i>custom notification setting</i> to IAM Roles Anywhere default setting.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ResetNotificationSettings</code>.
     * </p>
     * 
     * @param resetNotificationSettingsRequest
     * @return A Java Future containing the result of the ResetNotificationSettings operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.ResetNotificationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ResetNotificationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetNotificationSettingsResult> resetNotificationSettingsAsync(
            ResetNotificationSettingsRequest resetNotificationSettingsRequest);

    /**
     * <p>
     * Resets the <i>custom notification setting</i> to IAM Roles Anywhere default setting.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ResetNotificationSettings</code>.
     * </p>
     * 
     * @param resetNotificationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetNotificationSettings operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.ResetNotificationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ResetNotificationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetNotificationSettingsResult> resetNotificationSettingsAsync(
            ResetNotificationSettingsRequest resetNotificationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<ResetNotificationSettingsRequest, ResetNotificationSettingsResult> asyncHandler);

    /**
     * <p>
     * Attaches tags to a resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:TagResource</code>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Attaches tags to a resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:TagResource</code>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UntagResource</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UntagResource</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the certificate revocation list (CRL). A CRL is a list of certificates that have been revoked by the
     * issuing certificate authority (CA). IAM Roles Anywhere validates against the CRL before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateCrl</code>.
     * </p>
     * 
     * @param updateCrlRequest
     * @return A Java Future containing the result of the UpdateCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.UpdateCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCrlResult> updateCrlAsync(UpdateCrlRequest updateCrlRequest);

    /**
     * <p>
     * Updates the certificate revocation list (CRL). A CRL is a list of certificates that have been revoked by the
     * issuing certificate authority (CA). IAM Roles Anywhere validates against the CRL before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateCrl</code>.
     * </p>
     * 
     * @param updateCrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCrl operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.UpdateCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateCrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCrlResult> updateCrlAsync(UpdateCrlRequest updateCrlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCrlRequest, UpdateCrlResult> asyncHandler);

    /**
     * <p>
     * Updates a <i>profile</i>, a list of the roles that IAM Roles Anywhere service is trusted to assume. You use
     * profiles to intersect permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateProfile</code>.
     * </p>
     * 
     * @param updateProfileRequest
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates a <i>profile</i>, a list of the roles that IAM Roles Anywhere service is trusted to assume. You use
     * profiles to intersect permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateProfile</code>.
     * </p>
     * 
     * @param updateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler);

    /**
     * <p>
     * Updates a trust anchor. You establish trust between IAM Roles Anywhere and your certificate authority (CA) by
     * configuring a trust anchor. You can define a trust anchor as a reference to an Private Certificate Authority
     * (Private CA) or by uploading a CA certificate. Your Amazon Web Services workloads can authenticate with the trust
     * anchor using certificates issued by the CA in exchange for temporary Amazon Web Services credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateTrustAnchor</code>.
     * </p>
     * 
     * @param updateTrustAnchorRequest
     * @return A Java Future containing the result of the UpdateTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsync.UpdateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustAnchorResult> updateTrustAnchorAsync(UpdateTrustAnchorRequest updateTrustAnchorRequest);

    /**
     * <p>
     * Updates a trust anchor. You establish trust between IAM Roles Anywhere and your certificate authority (CA) by
     * configuring a trust anchor. You can define a trust anchor as a reference to an Private Certificate Authority
     * (Private CA) or by uploading a CA certificate. Your Amazon Web Services workloads can authenticate with the trust
     * anchor using certificates issued by the CA in exchange for temporary Amazon Web Services credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateTrustAnchor</code>.
     * </p>
     * 
     * @param updateTrustAnchorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrustAnchor operation returned by the service.
     * @sample AWSIAMRolesAnywhereAsyncHandler.UpdateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustAnchorResult> updateTrustAnchorAsync(UpdateTrustAnchorRequest updateTrustAnchorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrustAnchorRequest, UpdateTrustAnchorResult> asyncHandler);

}
