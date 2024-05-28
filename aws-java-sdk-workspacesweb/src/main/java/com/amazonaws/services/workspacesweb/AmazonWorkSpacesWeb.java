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
package com.amazonaws.services.workspacesweb;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workspacesweb.model.*;

/**
 * Interface for accessing Amazon WorkSpaces Web.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspacesweb.AbstractAmazonWorkSpacesWeb} instead.
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
public interface AmazonWorkSpacesWeb {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workspaces-web";

    /**
     * <p>
     * Associates a browser settings resource with a web portal.
     * </p>
     * 
     * @param associateBrowserSettingsRequest
     * @return Result of the AssociateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateBrowserSettingsResult associateBrowserSettings(AssociateBrowserSettingsRequest associateBrowserSettingsRequest);

    /**
     * <p>
     * Associates an IP access settings resource with a web portal.
     * </p>
     * 
     * @param associateIpAccessSettingsRequest
     * @return Result of the AssociateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateIpAccessSettingsResult associateIpAccessSettings(AssociateIpAccessSettingsRequest associateIpAccessSettingsRequest);

    /**
     * <p>
     * Associates a network settings resource with a web portal.
     * </p>
     * 
     * @param associateNetworkSettingsRequest
     * @return Result of the AssociateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateNetworkSettingsResult associateNetworkSettings(AssociateNetworkSettingsRequest associateNetworkSettingsRequest);

    /**
     * <p>
     * Associates a trust store with a web portal.
     * </p>
     * 
     * @param associateTrustStoreRequest
     * @return Result of the AssociateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.AssociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTrustStoreResult associateTrustStore(AssociateTrustStoreRequest associateTrustStoreRequest);

    /**
     * <p>
     * Associates a user access logging settings resource with a web portal.
     * </p>
     * 
     * @param associateUserAccessLoggingSettingsRequest
     * @return Result of the AssociateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateUserAccessLoggingSettingsResult associateUserAccessLoggingSettings(
            AssociateUserAccessLoggingSettingsRequest associateUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Associates a user settings resource with a web portal.
     * </p>
     * 
     * @param associateUserSettingsRequest
     * @return Result of the AssociateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateUserSettingsResult associateUserSettings(AssociateUserSettingsRequest associateUserSettingsRequest);

    /**
     * <p>
     * Creates a browser settings resource that can be associated with a web portal. Once associated with a web portal,
     * browser settings control how the browser will behave once a user starts a streaming session for the web portal.
     * </p>
     * 
     * @param createBrowserSettingsRequest
     * @return Result of the CreateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBrowserSettingsResult createBrowserSettings(CreateBrowserSettingsRequest createBrowserSettingsRequest);

    /**
     * <p>
     * Creates an identity provider resource that is then associated with a web portal.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @return Result of the CreateIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIdentityProviderResult createIdentityProvider(CreateIdentityProviderRequest createIdentityProviderRequest);

    /**
     * <p>
     * Creates an IP access settings resource that can be associated with a web portal.
     * </p>
     * 
     * @param createIpAccessSettingsRequest
     * @return Result of the CreateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIpAccessSettingsResult createIpAccessSettings(CreateIpAccessSettingsRequest createIpAccessSettingsRequest);

    /**
     * <p>
     * Creates a network settings resource that can be associated with a web portal. Once associated with a web portal,
     * network settings define how streaming instances will connect with your specified VPC.
     * </p>
     * 
     * @param createNetworkSettingsRequest
     * @return Result of the CreateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNetworkSettingsResult createNetworkSettings(CreateNetworkSettingsRequest createNetworkSettingsRequest);

    /**
     * <p>
     * Creates a web portal.
     * </p>
     * 
     * @param createPortalRequest
     * @return Result of the CreatePortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePortalResult createPortal(CreatePortalRequest createPortalRequest);

    /**
     * <p>
     * Creates a trust store that can be associated with a web portal. A trust store contains certificate authority (CA)
     * certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates
     * that have been issued using any of the CAs in the trust store. If your organization has internal websites that
     * use certificates issued by private CAs, you should add the private CA certificate to the trust store.
     * </p>
     * 
     * @param createTrustStoreRequest
     * @return Result of the CreateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrustStoreResult createTrustStore(CreateTrustStoreRequest createTrustStoreRequest);

    /**
     * <p>
     * Creates a user access logging settings resource that can be associated with a web portal.
     * </p>
     * 
     * @param createUserAccessLoggingSettingsRequest
     * @return Result of the CreateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserAccessLoggingSettingsResult createUserAccessLoggingSettings(CreateUserAccessLoggingSettingsRequest createUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Creates a user settings resource that can be associated with a web portal. Once associated with a web portal,
     * user settings control how users can transfer data between a streaming session and the their local devices.
     * </p>
     * 
     * @param createUserSettingsRequest
     * @return Result of the CreateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserSettingsResult createUserSettings(CreateUserSettingsRequest createUserSettingsRequest);

    /**
     * <p>
     * Deletes browser settings.
     * </p>
     * 
     * @param deleteBrowserSettingsRequest
     * @return Result of the DeleteBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBrowserSettingsResult deleteBrowserSettings(DeleteBrowserSettingsRequest deleteBrowserSettingsRequest);

    /**
     * <p>
     * Deletes the identity provider.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @return Result of the DeleteIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdentityProviderResult deleteIdentityProvider(DeleteIdentityProviderRequest deleteIdentityProviderRequest);

    /**
     * <p>
     * Deletes IP access settings.
     * </p>
     * 
     * @param deleteIpAccessSettingsRequest
     * @return Result of the DeleteIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIpAccessSettingsResult deleteIpAccessSettings(DeleteIpAccessSettingsRequest deleteIpAccessSettingsRequest);

    /**
     * <p>
     * Deletes network settings.
     * </p>
     * 
     * @param deleteNetworkSettingsRequest
     * @return Result of the DeleteNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNetworkSettingsResult deleteNetworkSettings(DeleteNetworkSettingsRequest deleteNetworkSettingsRequest);

    /**
     * <p>
     * Deletes a web portal.
     * </p>
     * 
     * @param deletePortalRequest
     * @return Result of the DeletePortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeletePortal" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePortalResult deletePortal(DeletePortalRequest deletePortalRequest);

    /**
     * <p>
     * Deletes the trust store.
     * </p>
     * 
     * @param deleteTrustStoreRequest
     * @return Result of the DeleteTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrustStoreResult deleteTrustStore(DeleteTrustStoreRequest deleteTrustStoreRequest);

    /**
     * <p>
     * Deletes user access logging settings.
     * </p>
     * 
     * @param deleteUserAccessLoggingSettingsRequest
     * @return Result of the DeleteUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserAccessLoggingSettingsResult deleteUserAccessLoggingSettings(DeleteUserAccessLoggingSettingsRequest deleteUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Deletes user settings.
     * </p>
     * 
     * @param deleteUserSettingsRequest
     * @return Result of the DeleteUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserSettingsResult deleteUserSettings(DeleteUserSettingsRequest deleteUserSettingsRequest);

    /**
     * <p>
     * Disassociates browser settings from a web portal.
     * </p>
     * 
     * @param disassociateBrowserSettingsRequest
     * @return Result of the DisassociateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateBrowserSettingsResult disassociateBrowserSettings(DisassociateBrowserSettingsRequest disassociateBrowserSettingsRequest);

    /**
     * <p>
     * Disassociates IP access settings from a web portal.
     * </p>
     * 
     * @param disassociateIpAccessSettingsRequest
     * @return Result of the DisassociateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateIpAccessSettingsResult disassociateIpAccessSettings(DisassociateIpAccessSettingsRequest disassociateIpAccessSettingsRequest);

    /**
     * <p>
     * Disassociates network settings from a web portal.
     * </p>
     * 
     * @param disassociateNetworkSettingsRequest
     * @return Result of the DisassociateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateNetworkSettingsResult disassociateNetworkSettings(DisassociateNetworkSettingsRequest disassociateNetworkSettingsRequest);

    /**
     * <p>
     * Disassociates a trust store from a web portal.
     * </p>
     * 
     * @param disassociateTrustStoreRequest
     * @return Result of the DisassociateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTrustStoreResult disassociateTrustStore(DisassociateTrustStoreRequest disassociateTrustStoreRequest);

    /**
     * <p>
     * Disassociates user access logging settings from a web portal.
     * </p>
     * 
     * @param disassociateUserAccessLoggingSettingsRequest
     * @return Result of the DisassociateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateUserAccessLoggingSettingsResult disassociateUserAccessLoggingSettings(
            DisassociateUserAccessLoggingSettingsRequest disassociateUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Disassociates user settings from a web portal.
     * </p>
     * 
     * @param disassociateUserSettingsRequest
     * @return Result of the DisassociateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateUserSettingsResult disassociateUserSettings(DisassociateUserSettingsRequest disassociateUserSettingsRequest);

    /**
     * <p>
     * Gets browser settings.
     * </p>
     * 
     * @param getBrowserSettingsRequest
     * @return Result of the GetBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetBrowserSettingsResult getBrowserSettings(GetBrowserSettingsRequest getBrowserSettingsRequest);

    /**
     * <p>
     * Gets the identity provider.
     * </p>
     * 
     * @param getIdentityProviderRequest
     * @return Result of the GetIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentityProviderResult getIdentityProvider(GetIdentityProviderRequest getIdentityProviderRequest);

    /**
     * <p>
     * Gets the IP access settings.
     * </p>
     * 
     * @param getIpAccessSettingsRequest
     * @return Result of the GetIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetIpAccessSettingsResult getIpAccessSettings(GetIpAccessSettingsRequest getIpAccessSettingsRequest);

    /**
     * <p>
     * Gets the network settings.
     * </p>
     * 
     * @param getNetworkSettingsRequest
     * @return Result of the GetNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkSettingsResult getNetworkSettings(GetNetworkSettingsRequest getNetworkSettingsRequest);

    /**
     * <p>
     * Gets the web portal.
     * </p>
     * 
     * @param getPortalRequest
     * @return Result of the GetPortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetPortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortal" target="_top">AWS API
     *      Documentation</a>
     */
    GetPortalResult getPortal(GetPortalRequest getPortalRequest);

    /**
     * <p>
     * Gets the service provider metadata.
     * </p>
     * 
     * @param getPortalServiceProviderMetadataRequest
     * @return Result of the GetPortalServiceProviderMetadata operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetPortalServiceProviderMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortalServiceProviderMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    GetPortalServiceProviderMetadataResult getPortalServiceProviderMetadata(GetPortalServiceProviderMetadataRequest getPortalServiceProviderMetadataRequest);

    /**
     * <p>
     * Gets the trust store.
     * </p>
     * 
     * @param getTrustStoreRequest
     * @return Result of the GetTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStore" target="_top">AWS
     *      API Documentation</a>
     */
    GetTrustStoreResult getTrustStore(GetTrustStoreRequest getTrustStoreRequest);

    /**
     * <p>
     * Gets the trust store certificate.
     * </p>
     * 
     * @param getTrustStoreCertificateRequest
     * @return Result of the GetTrustStoreCertificate operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetTrustStoreCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStoreCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    GetTrustStoreCertificateResult getTrustStoreCertificate(GetTrustStoreCertificateRequest getTrustStoreCertificateRequest);

    /**
     * <p>
     * Gets user access logging settings.
     * </p>
     * 
     * @param getUserAccessLoggingSettingsRequest
     * @return Result of the GetUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetUserAccessLoggingSettingsResult getUserAccessLoggingSettings(GetUserAccessLoggingSettingsRequest getUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Gets user settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return Result of the GetUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    GetUserSettingsResult getUserSettings(GetUserSettingsRequest getUserSettingsRequest);

    /**
     * <p>
     * Retrieves a list of browser settings.
     * </p>
     * 
     * @param listBrowserSettingsRequest
     * @return Result of the ListBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    ListBrowserSettingsResult listBrowserSettings(ListBrowserSettingsRequest listBrowserSettingsRequest);

    /**
     * <p>
     * Retrieves a list of identity providers for a specific web portal.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return Result of the ListIdentityProviders operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest listIdentityProvidersRequest);

    /**
     * <p>
     * Retrieves a list of IP access settings.
     * </p>
     * 
     * @param listIpAccessSettingsRequest
     * @return Result of the ListIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    ListIpAccessSettingsResult listIpAccessSettings(ListIpAccessSettingsRequest listIpAccessSettingsRequest);

    /**
     * <p>
     * Retrieves a list of network settings.
     * </p>
     * 
     * @param listNetworkSettingsRequest
     * @return Result of the ListNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    ListNetworkSettingsResult listNetworkSettings(ListNetworkSettingsRequest listNetworkSettingsRequest);

    /**
     * <p>
     * Retrieves a list or web portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return Result of the ListPortals operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    ListPortalsResult listPortals(ListPortalsRequest listPortalsRequest);

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves a list of trust store certificates.
     * </p>
     * 
     * @param listTrustStoreCertificatesRequest
     * @return Result of the ListTrustStoreCertificates operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListTrustStoreCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStoreCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrustStoreCertificatesResult listTrustStoreCertificates(ListTrustStoreCertificatesRequest listTrustStoreCertificatesRequest);

    /**
     * <p>
     * Retrieves a list of trust stores.
     * </p>
     * 
     * @param listTrustStoresRequest
     * @return Result of the ListTrustStores operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListTrustStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStores" target="_top">AWS
     *      API Documentation</a>
     */
    ListTrustStoresResult listTrustStores(ListTrustStoresRequest listTrustStoresRequest);

    /**
     * <p>
     * Retrieves a list of user access logging settings.
     * </p>
     * 
     * @param listUserAccessLoggingSettingsRequest
     * @return Result of the ListUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    ListUserAccessLoggingSettingsResult listUserAccessLoggingSettings(ListUserAccessLoggingSettingsRequest listUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Retrieves a list of user settings.
     * </p>
     * 
     * @param listUserSettingsRequest
     * @return Result of the ListUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    ListUserSettingsResult listUserSettings(ListUserSettingsRequest listUserSettingsRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws TooManyTagsException
     *         There are too many tags.
     * @sample AmazonWorkSpacesWeb.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates browser settings.
     * </p>
     * 
     * @param updateBrowserSettingsRequest
     * @return Result of the UpdateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBrowserSettingsResult updateBrowserSettings(UpdateBrowserSettingsRequest updateBrowserSettingsRequest);

    /**
     * <p>
     * Updates the identity provider.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return Result of the UpdateIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdentityProviderResult updateIdentityProvider(UpdateIdentityProviderRequest updateIdentityProviderRequest);

    /**
     * <p>
     * Updates IP access settings.
     * </p>
     * 
     * @param updateIpAccessSettingsRequest
     * @return Result of the UpdateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIpAccessSettingsResult updateIpAccessSettings(UpdateIpAccessSettingsRequest updateIpAccessSettingsRequest);

    /**
     * <p>
     * Updates network settings.
     * </p>
     * 
     * @param updateNetworkSettingsRequest
     * @return Result of the UpdateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNetworkSettingsResult updateNetworkSettings(UpdateNetworkSettingsRequest updateNetworkSettingsRequest);

    /**
     * <p>
     * Updates a web portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return Result of the UpdatePortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePortalResult updatePortal(UpdatePortalRequest updatePortalRequest);

    /**
     * <p>
     * Updates the trust store.
     * </p>
     * 
     * @param updateTrustStoreRequest
     * @return Result of the UpdateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrustStoreResult updateTrustStore(UpdateTrustStoreRequest updateTrustStoreRequest);

    /**
     * <p>
     * Updates the user access logging settings.
     * </p>
     * 
     * @param updateUserAccessLoggingSettingsRequest
     * @return Result of the UpdateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserAccessLoggingSettingsResult updateUserAccessLoggingSettings(UpdateUserAccessLoggingSettingsRequest updateUserAccessLoggingSettingsRequest);

    /**
     * <p>
     * Updates the user settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @return Result of the UpdateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserSettingsResult updateUserSettings(UpdateUserSettingsRequest updateUserSettingsRequest);

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
