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

import com.amazonaws.services.pcaconnectorad.model.*;

/**
 * Interface for accessing PcaConnectorAd asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pcaconnectorad.AbstractAWSPcaConnectorAdAsync} instead.
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
public interface AWSPcaConnectorAdAsync extends AWSPcaConnectorAd {

    /**
     * <p>
     * Creates a connector between Amazon Web Services Private CA and an Active Directory. You must specify the private
     * CA, directory ID, and security groups.
     * </p>
     * 
     * @param createConnectorRequest
     * @return A Java Future containing the result of the CreateConnector operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest createConnectorRequest);

    /**
     * <p>
     * Creates a connector between Amazon Web Services Private CA and an Active Directory. You must specify the private
     * CA, directory ID, and security groups.
     * </p>
     * 
     * @param createConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnector operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest createConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler);

    /**
     * <p>
     * Creates a directory registration that authorizes communication between Amazon Web Services Private CA and an
     * Active Directory
     * </p>
     * 
     * @param createDirectoryRegistrationRequest
     * @return A Java Future containing the result of the CreateDirectoryRegistration operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.CreateDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryRegistrationResult> createDirectoryRegistrationAsync(
            CreateDirectoryRegistrationRequest createDirectoryRegistrationRequest);

    /**
     * <p>
     * Creates a directory registration that authorizes communication between Amazon Web Services Private CA and an
     * Active Directory
     * </p>
     * 
     * @param createDirectoryRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectoryRegistration operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.CreateDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryRegistrationResult> createDirectoryRegistrationAsync(
            CreateDirectoryRegistrationRequest createDirectoryRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectoryRegistrationRequest, CreateDirectoryRegistrationResult> asyncHandler);

    /**
     * <p>
     * Creates a service principal name (SPN) for the service account in Active Directory. Kerberos authentication uses
     * SPNs to associate a service instance with a service sign-in account.
     * </p>
     * 
     * @param createServicePrincipalNameRequest
     * @return A Java Future containing the result of the CreateServicePrincipalName operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.CreateServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServicePrincipalNameResult> createServicePrincipalNameAsync(
            CreateServicePrincipalNameRequest createServicePrincipalNameRequest);

    /**
     * <p>
     * Creates a service principal name (SPN) for the service account in Active Directory. Kerberos authentication uses
     * SPNs to associate a service instance with a service sign-in account.
     * </p>
     * 
     * @param createServicePrincipalNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServicePrincipalName operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.CreateServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServicePrincipalNameResult> createServicePrincipalNameAsync(
            CreateServicePrincipalNameRequest createServicePrincipalNameRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServicePrincipalNameRequest, CreateServicePrincipalNameResult> asyncHandler);

    /**
     * <p>
     * Creates an Active Directory compatible certificate template. The connectors issues certificates using these
     * templates based on the requester’s Active Directory group membership.
     * </p>
     * 
     * @param createTemplateRequest
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest);

    /**
     * <p>
     * Creates an Active Directory compatible certificate template. The connectors issues certificates using these
     * templates based on the requester’s Active Directory group membership.
     * </p>
     * 
     * @param createTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler);

    /**
     * <p>
     * Create a group access control entry. Allow or deny Active Directory groups from enrolling and/or autoenrolling
     * with the template based on the group security identifiers (SIDs).
     * </p>
     * 
     * @param createTemplateGroupAccessControlEntryRequest
     * @return A Java Future containing the result of the CreateTemplateGroupAccessControlEntry operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsync.CreateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateGroupAccessControlEntryResult> createTemplateGroupAccessControlEntryAsync(
            CreateTemplateGroupAccessControlEntryRequest createTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Create a group access control entry. Allow or deny Active Directory groups from enrolling and/or autoenrolling
     * with the template based on the group security identifiers (SIDs).
     * </p>
     * 
     * @param createTemplateGroupAccessControlEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplateGroupAccessControlEntry operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsyncHandler.CreateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateGroupAccessControlEntryResult> createTemplateGroupAccessControlEntryAsync(
            CreateTemplateGroupAccessControlEntryRequest createTemplateGroupAccessControlEntryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateGroupAccessControlEntryRequest, CreateTemplateGroupAccessControlEntryResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteConnector operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest deleteConnectorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnector operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest deleteConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler);

    /**
     * <p>
     * Deletes a directory registration. Deleting a directory registration deauthorizes Amazon Web Services Private CA
     * with the directory.
     * </p>
     * 
     * @param deleteDirectoryRegistrationRequest
     * @return A Java Future containing the result of the DeleteDirectoryRegistration operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.DeleteDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryRegistrationResult> deleteDirectoryRegistrationAsync(
            DeleteDirectoryRegistrationRequest deleteDirectoryRegistrationRequest);

    /**
     * <p>
     * Deletes a directory registration. Deleting a directory registration deauthorizes Amazon Web Services Private CA
     * with the directory.
     * </p>
     * 
     * @param deleteDirectoryRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectoryRegistration operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.DeleteDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryRegistrationResult> deleteDirectoryRegistrationAsync(
            DeleteDirectoryRegistrationRequest deleteDirectoryRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRegistrationRequest, DeleteDirectoryRegistrationResult> asyncHandler);

    /**
     * <p>
     * Deletes the service principal name (SPN) used by a connector to authenticate with your Active Directory.
     * </p>
     * 
     * @param deleteServicePrincipalNameRequest
     * @return A Java Future containing the result of the DeleteServicePrincipalName operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.DeleteServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServicePrincipalNameResult> deleteServicePrincipalNameAsync(
            DeleteServicePrincipalNameRequest deleteServicePrincipalNameRequest);

    /**
     * <p>
     * Deletes the service principal name (SPN) used by a connector to authenticate with your Active Directory.
     * </p>
     * 
     * @param deleteServicePrincipalNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServicePrincipalName operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.DeleteServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServicePrincipalNameResult> deleteServicePrincipalNameAsync(
            DeleteServicePrincipalNameRequest deleteServicePrincipalNameRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServicePrincipalNameRequest, DeleteServicePrincipalNameResult> asyncHandler);

    /**
     * <p>
     * Deletes a template. Certificates issued using the template are still valid until they are revoked or expired.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return A Java Future containing the result of the DeleteTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest deleteTemplateRequest);

    /**
     * <p>
     * Deletes a template. Certificates issued using the template are still valid until they are revoked or expired.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest deleteTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a group access control entry.
     * </p>
     * 
     * @param deleteTemplateGroupAccessControlEntryRequest
     * @return A Java Future containing the result of the DeleteTemplateGroupAccessControlEntry operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsync.DeleteTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateGroupAccessControlEntryResult> deleteTemplateGroupAccessControlEntryAsync(
            DeleteTemplateGroupAccessControlEntryRequest deleteTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Deletes a group access control entry.
     * </p>
     * 
     * @param deleteTemplateGroupAccessControlEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplateGroupAccessControlEntry operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsyncHandler.DeleteTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateGroupAccessControlEntryResult> deleteTemplateGroupAccessControlEntryAsync(
            DeleteTemplateGroupAccessControlEntryRequest deleteTemplateGroupAccessControlEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateGroupAccessControlEntryRequest, DeleteTemplateGroupAccessControlEntryResult> asyncHandler);

    /**
     * <p>
     * Lists information about your connector. You specify the connector on input by its ARN (Amazon Resource Name).
     * </p>
     * 
     * @param getConnectorRequest
     * @return A Java Future containing the result of the GetConnector operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.GetConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectorResult> getConnectorAsync(GetConnectorRequest getConnectorRequest);

    /**
     * <p>
     * Lists information about your connector. You specify the connector on input by its ARN (Amazon Resource Name).
     * </p>
     * 
     * @param getConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnector operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.GetConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectorResult> getConnectorAsync(GetConnectorRequest getConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectorRequest, GetConnectorResult> asyncHandler);

    /**
     * <p>
     * A structure that contains information about your directory registration.
     * </p>
     * 
     * @param getDirectoryRegistrationRequest
     * @return A Java Future containing the result of the GetDirectoryRegistration operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.GetDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDirectoryRegistrationResult> getDirectoryRegistrationAsync(GetDirectoryRegistrationRequest getDirectoryRegistrationRequest);

    /**
     * <p>
     * A structure that contains information about your directory registration.
     * </p>
     * 
     * @param getDirectoryRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDirectoryRegistration operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.GetDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDirectoryRegistrationResult> getDirectoryRegistrationAsync(GetDirectoryRegistrationRequest getDirectoryRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDirectoryRegistrationRequest, GetDirectoryRegistrationResult> asyncHandler);

    /**
     * <p>
     * Lists the service principal name that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param getServicePrincipalNameRequest
     * @return A Java Future containing the result of the GetServicePrincipalName operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.GetServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServicePrincipalNameResult> getServicePrincipalNameAsync(GetServicePrincipalNameRequest getServicePrincipalNameRequest);

    /**
     * <p>
     * Lists the service principal name that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param getServicePrincipalNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServicePrincipalName operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.GetServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServicePrincipalNameResult> getServicePrincipalNameAsync(GetServicePrincipalNameRequest getServicePrincipalNameRequest,
            com.amazonaws.handlers.AsyncHandler<GetServicePrincipalNameRequest, GetServicePrincipalNameResult> asyncHandler);

    /**
     * <p>
     * Retrieves a certificate template that the connector uses to issue certificates from a private CA.
     * </p>
     * 
     * @param getTemplateRequest
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Retrieves a certificate template that the connector uses to issue certificates from a private CA.
     * </p>
     * 
     * @param getTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves the group access control entries for a template.
     * </p>
     * 
     * @param getTemplateGroupAccessControlEntryRequest
     * @return A Java Future containing the result of the GetTemplateGroupAccessControlEntry operation returned by the
     *         service.
     * @sample AWSPcaConnectorAdAsync.GetTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateGroupAccessControlEntryResult> getTemplateGroupAccessControlEntryAsync(
            GetTemplateGroupAccessControlEntryRequest getTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Retrieves the group access control entries for a template.
     * </p>
     * 
     * @param getTemplateGroupAccessControlEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateGroupAccessControlEntry operation returned by the
     *         service.
     * @sample AWSPcaConnectorAdAsyncHandler.GetTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateGroupAccessControlEntryResult> getTemplateGroupAccessControlEntryAsync(
            GetTemplateGroupAccessControlEntryRequest getTemplateGroupAccessControlEntryRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateGroupAccessControlEntryRequest, GetTemplateGroupAccessControlEntryResult> asyncHandler);

    /**
     * <p>
     * Lists the connectors that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector</a> action.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return A Java Future containing the result of the ListConnectors operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest listConnectorsRequest);

    /**
     * <p>
     * Lists the connectors that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector</a> action.
     * </p>
     * 
     * @param listConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnectors operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest listConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler);

    /**
     * <p>
     * Lists the directory registrations that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration</a> action.
     * </p>
     * 
     * @param listDirectoryRegistrationsRequest
     * @return A Java Future containing the result of the ListDirectoryRegistrations operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.ListDirectoryRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListDirectoryRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDirectoryRegistrationsResult> listDirectoryRegistrationsAsync(
            ListDirectoryRegistrationsRequest listDirectoryRegistrationsRequest);

    /**
     * <p>
     * Lists the directory registrations that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration</a> action.
     * </p>
     * 
     * @param listDirectoryRegistrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDirectoryRegistrations operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.ListDirectoryRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListDirectoryRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDirectoryRegistrationsResult> listDirectoryRegistrationsAsync(
            ListDirectoryRegistrationsRequest listDirectoryRegistrationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDirectoryRegistrationsRequest, ListDirectoryRegistrationsResult> asyncHandler);

    /**
     * <p>
     * Lists the service principal names that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param listServicePrincipalNamesRequest
     * @return A Java Future containing the result of the ListServicePrincipalNames operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.ListServicePrincipalNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListServicePrincipalNames"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicePrincipalNamesResult> listServicePrincipalNamesAsync(
            ListServicePrincipalNamesRequest listServicePrincipalNamesRequest);

    /**
     * <p>
     * Lists the service principal names that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param listServicePrincipalNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServicePrincipalNames operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.ListServicePrincipalNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListServicePrincipalNames"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicePrincipalNamesResult> listServicePrincipalNamesAsync(
            ListServicePrincipalNamesRequest listServicePrincipalNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicePrincipalNamesRequest, ListServicePrincipalNamesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags, if any, that are associated with your resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags, if any, that are associated with your resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists group access control entries you created.
     * </p>
     * 
     * @param listTemplateGroupAccessControlEntriesRequest
     * @return A Java Future containing the result of the ListTemplateGroupAccessControlEntries operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsync.ListTemplateGroupAccessControlEntries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplateGroupAccessControlEntries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateGroupAccessControlEntriesResult> listTemplateGroupAccessControlEntriesAsync(
            ListTemplateGroupAccessControlEntriesRequest listTemplateGroupAccessControlEntriesRequest);

    /**
     * <p>
     * Lists group access control entries you created.
     * </p>
     * 
     * @param listTemplateGroupAccessControlEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateGroupAccessControlEntries operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsyncHandler.ListTemplateGroupAccessControlEntries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplateGroupAccessControlEntries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateGroupAccessControlEntriesResult> listTemplateGroupAccessControlEntriesAsync(
            ListTemplateGroupAccessControlEntriesRequest listTemplateGroupAccessControlEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateGroupAccessControlEntriesRequest, ListTemplateGroupAccessControlEntriesResult> asyncHandler);

    /**
     * <p>
     * Lists the templates, if any, that are associated with a connector.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Lists the templates, if any, that are associated with a connector.
     * </p>
     * 
     * @param listTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to your resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to your resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from your resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from your resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update template configuration to define the information included in certificates.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsync.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest);

    /**
     * <p>
     * Update template configuration to define the information included in certificates.
     * </p>
     * 
     * @param updateTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AWSPcaConnectorAdAsyncHandler.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler);

    /**
     * <p>
     * Update a group access control entry you created using <a href=
     * "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplateGroupAccessControlEntry.html"
     * >CreateTemplateGroupAccessControlEntry</a>.
     * </p>
     * 
     * @param updateTemplateGroupAccessControlEntryRequest
     * @return A Java Future containing the result of the UpdateTemplateGroupAccessControlEntry operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsync.UpdateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateGroupAccessControlEntryResult> updateTemplateGroupAccessControlEntryAsync(
            UpdateTemplateGroupAccessControlEntryRequest updateTemplateGroupAccessControlEntryRequest);

    /**
     * <p>
     * Update a group access control entry you created using <a href=
     * "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplateGroupAccessControlEntry.html"
     * >CreateTemplateGroupAccessControlEntry</a>.
     * </p>
     * 
     * @param updateTemplateGroupAccessControlEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplateGroupAccessControlEntry operation returned by
     *         the service.
     * @sample AWSPcaConnectorAdAsyncHandler.UpdateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateGroupAccessControlEntryResult> updateTemplateGroupAccessControlEntryAsync(
            UpdateTemplateGroupAccessControlEntryRequest updateTemplateGroupAccessControlEntryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateGroupAccessControlEntryRequest, UpdateTemplateGroupAccessControlEntryResult> asyncHandler);

}
