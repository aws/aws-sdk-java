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
package com.amazonaws.services.workspacesweb;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;

/**
 * Interface for accessing Amazon WorkSpaces Web asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspacesweb.AbstractAmazonWorkSpacesWebAsync} instead.
 * </p>
 * <p>
 * <p>
 * WorkSpaces Web is a low cost, fully managed WorkSpace built specifically to facilitate secure, web-based workloads.
 * WorkSpaces Web makes it easy for customers to safely provide their employees with access to internal websites and
 * SaaS web applications without the administrative burden of appliances or specialized client software. WorkSpaces Web
 * provides simple policy tools tailored for user interactions, while offloading common tasks like capacity management,
 * scaling, and maintaining browser images.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkSpacesWebAsync extends AmazonWorkSpacesWeb {

    /**
     * <p>
     * Associates a browser settings resource with a web portal.
     * </p>
     * 
     * @param associateBrowserSettingsRequest
     * @return A Java Future containing the result of the AssociateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.AssociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateBrowserSettingsResult> associateBrowserSettingsAsync(AssociateBrowserSettingsRequest associateBrowserSettingsRequest);

    /**
     * <p>
     * Associates a browser settings resource with a web portal.
     * </p>
     * 
     * @param associateBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.AssociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateBrowserSettingsResult> associateBrowserSettingsAsync(AssociateBrowserSettingsRequest associateBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateBrowserSettingsRequest, AssociateBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Associates a network settings resource with a web portal.
     * </p>
     * 
     * @param associateNetworkSettingsRequest
     * @return A Java Future containing the result of the AssociateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.AssociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateNetworkSettingsResult> associateNetworkSettingsAsync(AssociateNetworkSettingsRequest associateNetworkSettingsRequest);

    /**
     * <p>
     * Associates a network settings resource with a web portal.
     * </p>
     * 
     * @param associateNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.AssociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateNetworkSettingsResult> associateNetworkSettingsAsync(AssociateNetworkSettingsRequest associateNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateNetworkSettingsRequest, AssociateNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Associates a trust store with a web portal.
     * </p>
     * 
     * @param associateTrustStoreRequest
     * @return A Java Future containing the result of the AssociateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.AssociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTrustStoreResult> associateTrustStoreAsync(AssociateTrustStoreRequest associateTrustStoreRequest);

    /**
     * <p>
     * Associates a trust store with a web portal.
     * </p>
     * 
     * @param associateTrustStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.AssociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTrustStoreResult> associateTrustStoreAsync(AssociateTrustStoreRequest associateTrustStoreRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTrustStoreRequest, AssociateTrustStoreResult> asyncHandler);

    /**
     * <p>
     * Associates a user access logging settings resource with a web portal.
     * </p>
     * 
     * @param associateUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the AssociateUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.AssociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserAccessLoggingSettingsResult> associateUserAccessLoggingSettingsAsync(
            AssociateUserAccessLoggingSettingsRequest associateUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Associates a user access logging settings resource with a web portal.
     * </p>
     * 
     * @param associateUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.AssociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserAccessLoggingSettingsResult> associateUserAccessLoggingSettingsAsync(
            AssociateUserAccessLoggingSettingsRequest associateUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateUserAccessLoggingSettingsRequest, AssociateUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Associates a user settings resource with a web portal.
     * </p>
     * 
     * @param associateUserSettingsRequest
     * @return A Java Future containing the result of the AssociateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.AssociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserSettingsResult> associateUserSettingsAsync(AssociateUserSettingsRequest associateUserSettingsRequest);

    /**
     * <p>
     * Associates a user settings resource with a web portal.
     * </p>
     * 
     * @param associateUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.AssociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserSettingsResult> associateUserSettingsAsync(AssociateUserSettingsRequest associateUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateUserSettingsRequest, AssociateUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Creates a browser settings resource that can be associated with a web portal. Once associated with a web portal,
     * browser settings control how the browser will behave once a user starts a streaming session for the web portal.
     * </p>
     * 
     * @param createBrowserSettingsRequest
     * @return A Java Future containing the result of the CreateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.CreateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBrowserSettingsResult> createBrowserSettingsAsync(CreateBrowserSettingsRequest createBrowserSettingsRequest);

    /**
     * <p>
     * Creates a browser settings resource that can be associated with a web portal. Once associated with a web portal,
     * browser settings control how the browser will behave once a user starts a streaming session for the web portal.
     * </p>
     * 
     * @param createBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBrowserSettingsResult> createBrowserSettingsAsync(CreateBrowserSettingsRequest createBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBrowserSettingsRequest, CreateBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Creates an identity provider resource that is then associated with a web portal.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @return A Java Future containing the result of the CreateIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(CreateIdentityProviderRequest createIdentityProviderRequest);

    /**
     * <p>
     * Creates an identity provider resource that is then associated with a web portal.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(CreateIdentityProviderRequest createIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIdentityProviderRequest, CreateIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Creates a network settings resource that can be associated with a web portal. Once associated with a web portal,
     * network settings define how streaming instances will connect with your specified VPC.
     * </p>
     * 
     * @param createNetworkSettingsRequest
     * @return A Java Future containing the result of the CreateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.CreateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkSettingsResult> createNetworkSettingsAsync(CreateNetworkSettingsRequest createNetworkSettingsRequest);

    /**
     * <p>
     * Creates a network settings resource that can be associated with a web portal. Once associated with a web portal,
     * network settings define how streaming instances will connect with your specified VPC.
     * </p>
     * 
     * @param createNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkSettingsResult> createNetworkSettingsAsync(CreateNetworkSettingsRequest createNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkSettingsRequest, CreateNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Creates a web portal.
     * </p>
     * 
     * @param createPortalRequest
     * @return A Java Future containing the result of the CreatePortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePortalResult> createPortalAsync(CreatePortalRequest createPortalRequest);

    /**
     * <p>
     * Creates a web portal.
     * </p>
     * 
     * @param createPortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePortalResult> createPortalAsync(CreatePortalRequest createPortalRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePortalRequest, CreatePortalResult> asyncHandler);

    /**
     * <p>
     * Creates a trust store that can be associated with a web portal. A trust store contains certificate authority (CA)
     * certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates
     * that have been issued using any of the CAs in the trust store. If your organization has internal websites that
     * use certificates issued by private CAs, you should add the private CA certificate to the trust store.
     * </p>
     * 
     * @param createTrustStoreRequest
     * @return A Java Future containing the result of the CreateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.CreateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustStoreResult> createTrustStoreAsync(CreateTrustStoreRequest createTrustStoreRequest);

    /**
     * <p>
     * Creates a trust store that can be associated with a web portal. A trust store contains certificate authority (CA)
     * certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates
     * that have been issued using any of the CAs in the trust store. If your organization has internal websites that
     * use certificates issued by private CAs, you should add the private CA certificate to the trust store.
     * </p>
     * 
     * @param createTrustStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustStoreResult> createTrustStoreAsync(CreateTrustStoreRequest createTrustStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrustStoreRequest, CreateTrustStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a user access logging settings resource that can be associated with a web portal.
     * </p>
     * 
     * @param createUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the CreateUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.CreateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserAccessLoggingSettingsResult> createUserAccessLoggingSettingsAsync(
            CreateUserAccessLoggingSettingsRequest createUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Creates a user access logging settings resource that can be associated with a web portal.
     * </p>
     * 
     * @param createUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserAccessLoggingSettingsResult> createUserAccessLoggingSettingsAsync(
            CreateUserAccessLoggingSettingsRequest createUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserAccessLoggingSettingsRequest, CreateUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Creates a user settings resource that can be associated with a web portal. Once associated with a web portal,
     * user settings control how users can transfer data between a streaming session and the their local devices.
     * </p>
     * 
     * @param createUserSettingsRequest
     * @return A Java Future containing the result of the CreateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.CreateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserSettingsResult> createUserSettingsAsync(CreateUserSettingsRequest createUserSettingsRequest);

    /**
     * <p>
     * Creates a user settings resource that can be associated with a web portal. Once associated with a web portal,
     * user settings control how users can transfer data between a streaming session and the their local devices.
     * </p>
     * 
     * @param createUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.CreateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserSettingsResult> createUserSettingsAsync(CreateUserSettingsRequest createUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserSettingsRequest, CreateUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Deletes browser settings.
     * </p>
     * 
     * @param deleteBrowserSettingsRequest
     * @return A Java Future containing the result of the DeleteBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DeleteBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBrowserSettingsResult> deleteBrowserSettingsAsync(DeleteBrowserSettingsRequest deleteBrowserSettingsRequest);

    /**
     * <p>
     * Deletes browser settings.
     * </p>
     * 
     * @param deleteBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeleteBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBrowserSettingsResult> deleteBrowserSettingsAsync(DeleteBrowserSettingsRequest deleteBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBrowserSettingsRequest, DeleteBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Deletes the identity provider.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @return A Java Future containing the result of the DeleteIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(DeleteIdentityProviderRequest deleteIdentityProviderRequest);

    /**
     * <p>
     * Deletes the identity provider.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(DeleteIdentityProviderRequest deleteIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityProviderRequest, DeleteIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Deletes network settings.
     * </p>
     * 
     * @param deleteNetworkSettingsRequest
     * @return A Java Future containing the result of the DeleteNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DeleteNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkSettingsResult> deleteNetworkSettingsAsync(DeleteNetworkSettingsRequest deleteNetworkSettingsRequest);

    /**
     * <p>
     * Deletes network settings.
     * </p>
     * 
     * @param deleteNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeleteNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkSettingsResult> deleteNetworkSettingsAsync(DeleteNetworkSettingsRequest deleteNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkSettingsRequest, DeleteNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Deletes a web portal.
     * </p>
     * 
     * @param deletePortalRequest
     * @return A Java Future containing the result of the DeletePortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeletePortal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(DeletePortalRequest deletePortalRequest);

    /**
     * <p>
     * Deletes a web portal.
     * </p>
     * 
     * @param deletePortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeletePortal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(DeletePortalRequest deletePortalRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePortalRequest, DeletePortalResult> asyncHandler);

    /**
     * <p>
     * Deletes the trust store.
     * </p>
     * 
     * @param deleteTrustStoreRequest
     * @return A Java Future containing the result of the DeleteTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DeleteTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustStoreResult> deleteTrustStoreAsync(DeleteTrustStoreRequest deleteTrustStoreRequest);

    /**
     * <p>
     * Deletes the trust store.
     * </p>
     * 
     * @param deleteTrustStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeleteTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustStoreResult> deleteTrustStoreAsync(DeleteTrustStoreRequest deleteTrustStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrustStoreRequest, DeleteTrustStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes user access logging settings.
     * </p>
     * 
     * @param deleteUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the DeleteUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.DeleteUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserAccessLoggingSettingsResult> deleteUserAccessLoggingSettingsAsync(
            DeleteUserAccessLoggingSettingsRequest deleteUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Deletes user access logging settings.
     * </p>
     * 
     * @param deleteUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeleteUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserAccessLoggingSettingsResult> deleteUserAccessLoggingSettingsAsync(
            DeleteUserAccessLoggingSettingsRequest deleteUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserAccessLoggingSettingsRequest, DeleteUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Deletes user settings.
     * </p>
     * 
     * @param deleteUserSettingsRequest
     * @return A Java Future containing the result of the DeleteUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DeleteUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserSettingsResult> deleteUserSettingsAsync(DeleteUserSettingsRequest deleteUserSettingsRequest);

    /**
     * <p>
     * Deletes user settings.
     * </p>
     * 
     * @param deleteUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DeleteUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserSettingsResult> deleteUserSettingsAsync(DeleteUserSettingsRequest deleteUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserSettingsRequest, DeleteUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Disassociates browser settings from a web portal.
     * </p>
     * 
     * @param disassociateBrowserSettingsRequest
     * @return A Java Future containing the result of the DisassociateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DisassociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateBrowserSettingsResult> disassociateBrowserSettingsAsync(
            DisassociateBrowserSettingsRequest disassociateBrowserSettingsRequest);

    /**
     * <p>
     * Disassociates browser settings from a web portal.
     * </p>
     * 
     * @param disassociateBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DisassociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateBrowserSettingsResult> disassociateBrowserSettingsAsync(
            DisassociateBrowserSettingsRequest disassociateBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateBrowserSettingsRequest, DisassociateBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Disassociates network settings from a web portal.
     * </p>
     * 
     * @param disassociateNetworkSettingsRequest
     * @return A Java Future containing the result of the DisassociateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DisassociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateNetworkSettingsResult> disassociateNetworkSettingsAsync(
            DisassociateNetworkSettingsRequest disassociateNetworkSettingsRequest);

    /**
     * <p>
     * Disassociates network settings from a web portal.
     * </p>
     * 
     * @param disassociateNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DisassociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateNetworkSettingsResult> disassociateNetworkSettingsAsync(
            DisassociateNetworkSettingsRequest disassociateNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateNetworkSettingsRequest, DisassociateNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Disassociates a trust store from a web portal.
     * </p>
     * 
     * @param disassociateTrustStoreRequest
     * @return A Java Future containing the result of the DisassociateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DisassociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTrustStoreResult> disassociateTrustStoreAsync(DisassociateTrustStoreRequest disassociateTrustStoreRequest);

    /**
     * <p>
     * Disassociates a trust store from a web portal.
     * </p>
     * 
     * @param disassociateTrustStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DisassociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTrustStoreResult> disassociateTrustStoreAsync(DisassociateTrustStoreRequest disassociateTrustStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateTrustStoreRequest, DisassociateTrustStoreResult> asyncHandler);

    /**
     * <p>
     * Disassociates user access logging settings from a web portal.
     * </p>
     * 
     * @param disassociateUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the DisassociateUserAccessLoggingSettings operation returned by
     *         the service.
     * @sample AmazonWorkSpacesWebAsync.DisassociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserAccessLoggingSettingsResult> disassociateUserAccessLoggingSettingsAsync(
            DisassociateUserAccessLoggingSettingsRequest disassociateUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Disassociates user access logging settings from a web portal.
     * </p>
     * 
     * @param disassociateUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateUserAccessLoggingSettings operation returned by
     *         the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DisassociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserAccessLoggingSettingsResult> disassociateUserAccessLoggingSettingsAsync(
            DisassociateUserAccessLoggingSettingsRequest disassociateUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateUserAccessLoggingSettingsRequest, DisassociateUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Disassociates user settings from a web portal.
     * </p>
     * 
     * @param disassociateUserSettingsRequest
     * @return A Java Future containing the result of the DisassociateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.DisassociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserSettingsResult> disassociateUserSettingsAsync(DisassociateUserSettingsRequest disassociateUserSettingsRequest);

    /**
     * <p>
     * Disassociates user settings from a web portal.
     * </p>
     * 
     * @param disassociateUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.DisassociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserSettingsResult> disassociateUserSettingsAsync(DisassociateUserSettingsRequest disassociateUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateUserSettingsRequest, DisassociateUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets browser settings.
     * </p>
     * 
     * @param getBrowserSettingsRequest
     * @return A Java Future containing the result of the GetBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBrowserSettingsResult> getBrowserSettingsAsync(GetBrowserSettingsRequest getBrowserSettingsRequest);

    /**
     * <p>
     * Gets browser settings.
     * </p>
     * 
     * @param getBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBrowserSettingsResult> getBrowserSettingsAsync(GetBrowserSettingsRequest getBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBrowserSettingsRequest, GetBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets the identity provider.
     * </p>
     * 
     * @param getIdentityProviderRequest
     * @return A Java Future containing the result of the GetIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityProviderResult> getIdentityProviderAsync(GetIdentityProviderRequest getIdentityProviderRequest);

    /**
     * <p>
     * Gets the identity provider.
     * </p>
     * 
     * @param getIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityProviderResult> getIdentityProviderAsync(GetIdentityProviderRequest getIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityProviderRequest, GetIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Gets the network settings.
     * </p>
     * 
     * @param getNetworkSettingsRequest
     * @return A Java Future containing the result of the GetNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkSettingsResult> getNetworkSettingsAsync(GetNetworkSettingsRequest getNetworkSettingsRequest);

    /**
     * <p>
     * Gets the network settings.
     * </p>
     * 
     * @param getNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkSettingsResult> getNetworkSettingsAsync(GetNetworkSettingsRequest getNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkSettingsRequest, GetNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets the web portal.
     * </p>
     * 
     * @param getPortalRequest
     * @return A Java Future containing the result of the GetPortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetPortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPortalResult> getPortalAsync(GetPortalRequest getPortalRequest);

    /**
     * <p>
     * Gets the web portal.
     * </p>
     * 
     * @param getPortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetPortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPortalResult> getPortalAsync(GetPortalRequest getPortalRequest,
            com.amazonaws.handlers.AsyncHandler<GetPortalRequest, GetPortalResult> asyncHandler);

    /**
     * <p>
     * Gets the service provider metadata.
     * </p>
     * 
     * @param getPortalServiceProviderMetadataRequest
     * @return A Java Future containing the result of the GetPortalServiceProviderMetadata operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.GetPortalServiceProviderMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortalServiceProviderMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPortalServiceProviderMetadataResult> getPortalServiceProviderMetadataAsync(
            GetPortalServiceProviderMetadataRequest getPortalServiceProviderMetadataRequest);

    /**
     * <p>
     * Gets the service provider metadata.
     * </p>
     * 
     * @param getPortalServiceProviderMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPortalServiceProviderMetadata operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetPortalServiceProviderMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortalServiceProviderMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPortalServiceProviderMetadataResult> getPortalServiceProviderMetadataAsync(
            GetPortalServiceProviderMetadataRequest getPortalServiceProviderMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetPortalServiceProviderMetadataRequest, GetPortalServiceProviderMetadataResult> asyncHandler);

    /**
     * <p>
     * Gets the trust store.
     * </p>
     * 
     * @param getTrustStoreRequest
     * @return A Java Future containing the result of the GetTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrustStoreResult> getTrustStoreAsync(GetTrustStoreRequest getTrustStoreRequest);

    /**
     * <p>
     * Gets the trust store.
     * </p>
     * 
     * @param getTrustStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTrustStoreResult> getTrustStoreAsync(GetTrustStoreRequest getTrustStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrustStoreRequest, GetTrustStoreResult> asyncHandler);

    /**
     * <p>
     * Gets the trust store certificate.
     * </p>
     * 
     * @param getTrustStoreCertificateRequest
     * @return A Java Future containing the result of the GetTrustStoreCertificate operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetTrustStoreCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStoreCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrustStoreCertificateResult> getTrustStoreCertificateAsync(GetTrustStoreCertificateRequest getTrustStoreCertificateRequest);

    /**
     * <p>
     * Gets the trust store certificate.
     * </p>
     * 
     * @param getTrustStoreCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrustStoreCertificate operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetTrustStoreCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStoreCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrustStoreCertificateResult> getTrustStoreCertificateAsync(GetTrustStoreCertificateRequest getTrustStoreCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrustStoreCertificateRequest, GetTrustStoreCertificateResult> asyncHandler);

    /**
     * <p>
     * Gets user access logging settings.
     * </p>
     * 
     * @param getUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the GetUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.GetUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUserAccessLoggingSettingsResult> getUserAccessLoggingSettingsAsync(
            GetUserAccessLoggingSettingsRequest getUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Gets user access logging settings.
     * </p>
     * 
     * @param getUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUserAccessLoggingSettingsResult> getUserAccessLoggingSettingsAsync(
            GetUserAccessLoggingSettingsRequest getUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserAccessLoggingSettingsRequest, GetUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets user settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return A Java Future containing the result of the GetUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUserSettingsResult> getUserSettingsAsync(GetUserSettingsRequest getUserSettingsRequest);

    /**
     * <p>
     * Gets user settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUserSettingsResult> getUserSettingsAsync(GetUserSettingsRequest getUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserSettingsRequest, GetUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of browser settings.
     * </p>
     * 
     * @param listBrowserSettingsRequest
     * @return A Java Future containing the result of the ListBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBrowserSettingsResult> listBrowserSettingsAsync(ListBrowserSettingsRequest listBrowserSettingsRequest);

    /**
     * <p>
     * Retrieves a list of browser settings.
     * </p>
     * 
     * @param listBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBrowserSettingsResult> listBrowserSettingsAsync(ListBrowserSettingsRequest listBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBrowserSettingsRequest, ListBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of identity providers for a specific web portal.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return A Java Future containing the result of the ListIdentityProviders operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest listIdentityProvidersRequest);

    /**
     * <p>
     * Retrieves a list of identity providers for a specific web portal.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityProviders operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest listIdentityProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of network settings.
     * </p>
     * 
     * @param listNetworkSettingsRequest
     * @return A Java Future containing the result of the ListNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkSettingsResult> listNetworkSettingsAsync(ListNetworkSettingsRequest listNetworkSettingsRequest);

    /**
     * <p>
     * Retrieves a list of network settings.
     * </p>
     * 
     * @param listNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkSettingsResult> listNetworkSettingsAsync(ListNetworkSettingsRequest listNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworkSettingsRequest, ListNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list or web portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return A Java Future containing the result of the ListPortals operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(ListPortalsRequest listPortalsRequest);

    /**
     * <p>
     * Retrieves a list or web portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPortals operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(ListPortalsRequest listPortalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPortalsRequest, ListPortalsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of trust store certificates.
     * </p>
     * 
     * @param listTrustStoreCertificatesRequest
     * @return A Java Future containing the result of the ListTrustStoreCertificates operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListTrustStoreCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStoreCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustStoreCertificatesResult> listTrustStoreCertificatesAsync(
            ListTrustStoreCertificatesRequest listTrustStoreCertificatesRequest);

    /**
     * <p>
     * Retrieves a list of trust store certificates.
     * </p>
     * 
     * @param listTrustStoreCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrustStoreCertificates operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListTrustStoreCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStoreCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustStoreCertificatesResult> listTrustStoreCertificatesAsync(
            ListTrustStoreCertificatesRequest listTrustStoreCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrustStoreCertificatesRequest, ListTrustStoreCertificatesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of trust stores.
     * </p>
     * 
     * @param listTrustStoresRequest
     * @return A Java Future containing the result of the ListTrustStores operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListTrustStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustStoresResult> listTrustStoresAsync(ListTrustStoresRequest listTrustStoresRequest);

    /**
     * <p>
     * Retrieves a list of trust stores.
     * </p>
     * 
     * @param listTrustStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrustStores operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListTrustStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustStoresResult> listTrustStoresAsync(ListTrustStoresRequest listTrustStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrustStoresRequest, ListTrustStoresResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of user access logging settings.
     * </p>
     * 
     * @param listUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the ListUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.ListUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserAccessLoggingSettingsResult> listUserAccessLoggingSettingsAsync(
            ListUserAccessLoggingSettingsRequest listUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Retrieves a list of user access logging settings.
     * </p>
     * 
     * @param listUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserAccessLoggingSettingsResult> listUserAccessLoggingSettingsAsync(
            ListUserAccessLoggingSettingsRequest listUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserAccessLoggingSettingsRequest, ListUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of user settings.
     * </p>
     * 
     * @param listUserSettingsRequest
     * @return A Java Future containing the result of the ListUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.ListUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserSettingsResult> listUserSettingsAsync(ListUserSettingsRequest listUserSettingsRequest);

    /**
     * <p>
     * Retrieves a list of user settings.
     * </p>
     * 
     * @param listUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.ListUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserSettingsResult> listUserSettingsAsync(ListUserSettingsRequest listUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserSettingsRequest, ListUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates browser settings.
     * </p>
     * 
     * @param updateBrowserSettingsRequest
     * @return A Java Future containing the result of the UpdateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UpdateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrowserSettingsResult> updateBrowserSettingsAsync(UpdateBrowserSettingsRequest updateBrowserSettingsRequest);

    /**
     * <p>
     * Updates browser settings.
     * </p>
     * 
     * @param updateBrowserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBrowserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrowserSettingsResult> updateBrowserSettingsAsync(UpdateBrowserSettingsRequest updateBrowserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBrowserSettingsRequest, UpdateBrowserSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates the identity provider.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return A Java Future containing the result of the UpdateIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(UpdateIdentityProviderRequest updateIdentityProviderRequest);

    /**
     * <p>
     * Updates the identity provider.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentityProvider operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(UpdateIdentityProviderRequest updateIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderRequest, UpdateIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Updates network settings.
     * </p>
     * 
     * @param updateNetworkSettingsRequest
     * @return A Java Future containing the result of the UpdateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UpdateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkSettingsResult> updateNetworkSettingsAsync(UpdateNetworkSettingsRequest updateNetworkSettingsRequest);

    /**
     * <p>
     * Updates network settings.
     * </p>
     * 
     * @param updateNetworkSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNetworkSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkSettingsResult> updateNetworkSettingsAsync(UpdateNetworkSettingsRequest updateNetworkSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNetworkSettingsRequest, UpdateNetworkSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates a web portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return A Java Future containing the result of the UpdatePortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(UpdatePortalRequest updatePortalRequest);

    /**
     * <p>
     * Updates a web portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePortal operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(UpdatePortalRequest updatePortalRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePortalRequest, UpdatePortalResult> asyncHandler);

    /**
     * <p>
     * Updates the trust store.
     * </p>
     * 
     * @param updateTrustStoreRequest
     * @return A Java Future containing the result of the UpdateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UpdateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustStoreResult> updateTrustStoreAsync(UpdateTrustStoreRequest updateTrustStoreRequest);

    /**
     * <p>
     * Updates the trust store.
     * </p>
     * 
     * @param updateTrustStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrustStore operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustStoreResult> updateTrustStoreAsync(UpdateTrustStoreRequest updateTrustStoreRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrustStoreRequest, UpdateTrustStoreResult> asyncHandler);

    /**
     * <p>
     * Updates the user access logging settings.
     * </p>
     * 
     * @param updateUserAccessLoggingSettingsRequest
     * @return A Java Future containing the result of the UpdateUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsync.UpdateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserAccessLoggingSettingsResult> updateUserAccessLoggingSettingsAsync(
            UpdateUserAccessLoggingSettingsRequest updateUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Updates the user access logging settings.
     * </p>
     * 
     * @param updateUserAccessLoggingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserAccessLoggingSettings operation returned by the
     *         service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserAccessLoggingSettingsResult> updateUserAccessLoggingSettingsAsync(
            UpdateUserAccessLoggingSettingsRequest updateUserAccessLoggingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserAccessLoggingSettingsRequest, UpdateUserAccessLoggingSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates the user settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @return A Java Future containing the result of the UpdateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsync.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserSettingsResult> updateUserSettingsAsync(UpdateUserSettingsRequest updateUserSettingsRequest);

    /**
     * <p>
     * Updates the user settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserSettings operation returned by the service.
     * @sample AmazonWorkSpacesWebAsyncHandler.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserSettingsResult> updateUserSettingsAsync(UpdateUserSettingsRequest updateUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserSettingsRequest, UpdateUserSettingsResult> asyncHandler);

}
