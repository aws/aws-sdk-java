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
package com.amazonaws.services.pcaconnectorad;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pcaconnectorad.model.*;

/**
 * Interface for accessing PcaConnectorAd.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pcaconnectorad.AbstractAWSPcaConnectorAd} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Private CA Connector for Active Directory creates a connector between Amazon Web Services Private
 * CA and Active Directory (AD) that enables you to provision security certificates for AD signed by a private CA that
 * you own. For more information, see <a
 * href="https://docs.aws.amazon.com/privateca/latest/userguide/ad-connector.html">Amazon Web Services Private CA
 * Connector for Active Directory</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPcaConnectorAd {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pca-connector-ad";

    /**
     * <p>
     * Creates a connector between Amazon Web Services Private CA and an Active Directory. You must specify the private
     * CA, directory ID, and security groups.
     * </p>
     * 
     * @param createConnectorRequest
     * @return Result of the CreateConnector operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateConnector"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectorResult createConnector(CreateConnectorRequest createConnectorRequest);

    /**
     * <p>
     * Creates a directory registration that authorizes communication between Amazon Web Services Private CA and an
     * Active Directory
     * </p>
     * 
     * @param createDirectoryRegistrationRequest
     * @return Result of the CreateDirectoryRegistration operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectoryRegistrationResult createDirectoryRegistration(CreateDirectoryRegistrationRequest createDirectoryRegistrationRequest);

    /**
     * <p>
     * Creates a service principal name (SPN) for the service account in Active Directory. Kerberos authentication uses
     * SPNs to associate a service instance with a service sign-in account.
     * </p>
     * 
     * @param createServicePrincipalNameRequest
     * @return Result of the CreateServicePrincipalName operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServicePrincipalNameResult createServicePrincipalName(CreateServicePrincipalNameRequest createServicePrincipalNameRequest);

    /**
     * <p>
     * Creates an Active Directory compatible certificate template. The connectors issues certificates using these
     * templates based on the requester’s Active Directory group membership.
     * </p>
     * 
     * @param createTemplateRequest
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest);

    /**
     * <p>
     * Create a group access control entry. Allow or deny Active Directory groups from enrolling and/or autoenrolling
     * with the template based on the group security identifiers (SIDs).
     * </p>
     * 
     * @param createTemplateGroupAccessControlEntryRequest
     * @return Result of the CreateTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTemplateGroupAccessControlEntryResult createTemplateGroupAccessControlEntry(
            CreateTemplateGroupAccessControlEntryRequest createTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Deletes a connector for Active Directory. You must provide the Amazon Resource Name (ARN) of the connector that
     * you want to delete. You can find the ARN by calling the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_ListConnectors"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_ListConnectors</a> action. Deleting a
     * connector does not deregister your directory with Amazon Web Services Private CA. You can deregister your
     * directory by calling the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_DeleteDirectoryRegistration"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_DeleteDirectoryRegistration</a> action.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return Result of the DeleteConnector operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteConnector"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectorResult deleteConnector(DeleteConnectorRequest deleteConnectorRequest);

    /**
     * <p>
     * Deletes a directory registration. Deleting a directory registration deauthorizes Amazon Web Services Private CA
     * with the directory.
     * </p>
     * 
     * @param deleteDirectoryRegistrationRequest
     * @return Result of the DeleteDirectoryRegistration operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectoryRegistrationResult deleteDirectoryRegistration(DeleteDirectoryRegistrationRequest deleteDirectoryRegistrationRequest);

    /**
     * <p>
     * Deletes the service principal name (SPN) used by a connector to authenticate with your Active Directory.
     * </p>
     * 
     * @param deleteServicePrincipalNameRequest
     * @return Result of the DeleteServicePrincipalName operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServicePrincipalNameResult deleteServicePrincipalName(DeleteServicePrincipalNameRequest deleteServicePrincipalNameRequest);

    /**
     * <p>
     * Deletes a template. Certificates issued using the template are still valid until they are revoked or expired.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return Result of the DeleteTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest);

    /**
     * <p>
     * Deletes a group access control entry.
     * </p>
     * 
     * @param deleteTemplateGroupAccessControlEntryRequest
     * @return Result of the DeleteTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTemplateGroupAccessControlEntryResult deleteTemplateGroupAccessControlEntry(
            DeleteTemplateGroupAccessControlEntryRequest deleteTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Lists information about your connector. You specify the connector on input by its ARN (Amazon Resource Name).
     * </p>
     * 
     * @param getConnectorRequest
     * @return Result of the GetConnector operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetConnector" target="_top">AWS
     *      API Documentation</a>
     */
    GetConnectorResult getConnector(GetConnectorRequest getConnectorRequest);

    /**
     * <p>
     * A structure that contains information about your directory registration.
     * </p>
     * 
     * @param getDirectoryRegistrationRequest
     * @return Result of the GetDirectoryRegistration operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    GetDirectoryRegistrationResult getDirectoryRegistration(GetDirectoryRegistrationRequest getDirectoryRegistrationRequest);

    /**
     * <p>
     * Lists the service principal name that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param getServicePrincipalNameRequest
     * @return Result of the GetServicePrincipalName operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    GetServicePrincipalNameResult getServicePrincipalName(GetServicePrincipalNameRequest getServicePrincipalNameRequest);

    /**
     * <p>
     * Retrieves a certificate template that the connector uses to issue certificates from a private CA.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Retrieves the group access control entries for a template.
     * </p>
     * 
     * @param getTemplateGroupAccessControlEntryRequest
     * @return Result of the GetTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    GetTemplateGroupAccessControlEntryResult getTemplateGroupAccessControlEntry(
            GetTemplateGroupAccessControlEntryRequest getTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Lists the connectors that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector</a> action.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return Result of the ListConnectors operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    ListConnectorsResult listConnectors(ListConnectorsRequest listConnectorsRequest);

    /**
     * <p>
     * Lists the directory registrations that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration</a> action.
     * </p>
     * 
     * @param listDirectoryRegistrationsRequest
     * @return Result of the ListDirectoryRegistrations operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListDirectoryRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListDirectoryRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    ListDirectoryRegistrationsResult listDirectoryRegistrations(ListDirectoryRegistrationsRequest listDirectoryRegistrationsRequest);

    /**
     * <p>
     * Lists the service principal names that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param listServicePrincipalNamesRequest
     * @return Result of the ListServicePrincipalNames operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListServicePrincipalNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListServicePrincipalNames"
     *      target="_top">AWS API Documentation</a>
     */
    ListServicePrincipalNamesResult listServicePrincipalNames(ListServicePrincipalNamesRequest listServicePrincipalNamesRequest);

    /**
     * <p>
     * Lists the tags, if any, that are associated with your resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists group access control entries you created.
     * </p>
     * 
     * @param listTemplateGroupAccessControlEntriesRequest
     * @return Result of the ListTemplateGroupAccessControlEntries operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListTemplateGroupAccessControlEntries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplateGroupAccessControlEntries"
     *      target="_top">AWS API Documentation</a>
     */
    ListTemplateGroupAccessControlEntriesResult listTemplateGroupAccessControlEntries(
            ListTemplateGroupAccessControlEntriesRequest listTemplateGroupAccessControlEntriesRequest);

    /**
     * <p>
     * Lists the templates, if any, that are associated with a connector.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Adds one or more tags to your resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from your resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update template configuration to define the information included in certificates.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest);

    /**
     * <p>
     * Update a group access control entry you created using <a href=
     * "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplateGroupAccessControlEntry.html"
     * >CreateTemplateGroupAccessControlEntry</a>.
     * </p>
     * 
     * @param updateTemplateGroupAccessControlEntryRequest
     * @return Result of the UpdateTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.UpdateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTemplateGroupAccessControlEntryResult updateTemplateGroupAccessControlEntry(
            UpdateTemplateGroupAccessControlEntryRequest updateTemplateGroupAccessControlEntryRequest);

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
