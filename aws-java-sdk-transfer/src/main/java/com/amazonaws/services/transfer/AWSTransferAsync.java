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
package com.amazonaws.services.transfer;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;

/**
 * Interface for accessing AWS Transfer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.transfer.AbstractAWSTransferAsync} instead.
 * </p>
 * <p>
 * <p>
 * Transfer Family is a fully managed service that enables the transfer of files over the File Transfer Protocol (FTP),
 * File Transfer Protocol over SSL (FTPS), or Secure Shell (SSH) File Transfer Protocol (SFTP) directly into and out of
 * Amazon Simple Storage Service (Amazon S3) or Amazon EFS. Additionally, you can use Applicability Statement 2 (AS2) to
 * transfer files into and out of Amazon S3. Amazon Web Services helps you seamlessly migrate your file transfer
 * workflows to Transfer Family by integrating with existing authentication systems, and providing DNS routing with
 * Amazon Route 53 so nothing changes for your customers and partners, or their applications. With your data in Amazon
 * S3, you can use it with Amazon Web Services for processing, analytics, machine learning, and archiving. Getting
 * started with Transfer Family is easy since there is no infrastructure to buy and set up.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTransferAsync extends AWSTransfer {

    /**
     * <p>
     * Used by administrators to choose which groups in the directory should have access to upload and download files
     * over the enabled protocols using Transfer Family. For example, a Microsoft Active Directory might contain 50,000
     * users, but only a small fraction might need the ability to transfer files to the server. An administrator can use
     * <code>CreateAccess</code> to limit the access to the correct set of users who need this ability.
     * </p>
     * 
     * @param createAccessRequest
     * @return A Java Future containing the result of the CreateAccess operation returned by the service.
     * @sample AWSTransferAsync.CreateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessResult> createAccessAsync(CreateAccessRequest createAccessRequest);

    /**
     * <p>
     * Used by administrators to choose which groups in the directory should have access to upload and download files
     * over the enabled protocols using Transfer Family. For example, a Microsoft Active Directory might contain 50,000
     * users, but only a small fraction might need the ability to transfer files to the server. An administrator can use
     * <code>CreateAccess</code> to limit the access to the correct set of users who need this ability.
     * </p>
     * 
     * @param createAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccess operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessResult> createAccessAsync(CreateAccessRequest createAccessRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessRequest, CreateAccessResult> asyncHandler);

    /**
     * <p>
     * Creates an agreement. An agreement is a bilateral trading partner agreement, or partnership, between an Transfer
     * Family server and an AS2 process. The agreement defines the file and message transfer relationship between the
     * server and the AS2 process. To define an agreement, Transfer Family combines a server, local profile, partner
     * profile, certificate, and other attributes.
     * </p>
     * <p>
     * The partner is identified with the <code>PartnerProfileId</code>, and the AS2 process is identified with the
     * <code>LocalProfileId</code>.
     * </p>
     * 
     * @param createAgreementRequest
     * @return A Java Future containing the result of the CreateAgreement operation returned by the service.
     * @sample AWSTransferAsync.CreateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgreementResult> createAgreementAsync(CreateAgreementRequest createAgreementRequest);

    /**
     * <p>
     * Creates an agreement. An agreement is a bilateral trading partner agreement, or partnership, between an Transfer
     * Family server and an AS2 process. The agreement defines the file and message transfer relationship between the
     * server and the AS2 process. To define an agreement, Transfer Family combines a server, local profile, partner
     * profile, certificate, and other attributes.
     * </p>
     * <p>
     * The partner is identified with the <code>PartnerProfileId</code>, and the AS2 process is identified with the
     * <code>LocalProfileId</code>.
     * </p>
     * 
     * @param createAgreementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgreement operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgreementResult> createAgreementAsync(CreateAgreementRequest createAgreementRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgreementRequest, CreateAgreementResult> asyncHandler);

    /**
     * <p>
     * Creates the connector, which captures the parameters for an outbound connection for the AS2 protocol. The
     * connector is required for sending files to an externally hosted AS2 server. For more details about connectors,
     * see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/create-b2b-server.html#configure-as2-connector"
     * >Create AS2 connectors</a>.
     * </p>
     * 
     * @param createConnectorRequest
     * @return A Java Future containing the result of the CreateConnector operation returned by the service.
     * @sample AWSTransferAsync.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest createConnectorRequest);

    /**
     * <p>
     * Creates the connector, which captures the parameters for an outbound connection for the AS2 protocol. The
     * connector is required for sending files to an externally hosted AS2 server. For more details about connectors,
     * see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/create-b2b-server.html#configure-as2-connector"
     * >Create AS2 connectors</a>.
     * </p>
     * 
     * @param createConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnector operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest createConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler);

    /**
     * <p>
     * Creates the local or partner profile to use for AS2 transfers.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSTransferAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates the local or partner profile to use for AS2 transfers.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services.
     * When you make updates to your file transfer protocol-enabled server or when you work with users, use the
     * service-generated <code>ServerId</code> property that is assigned to the newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @return A Java Future containing the result of the CreateServer operation returned by the service.
     * @sample AWSTransferAsync.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest createServerRequest);

    /**
     * <p>
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services.
     * When you make updates to your file transfer protocol-enabled server or when you work with users, use the
     * service-generated <code>ServerId</code> property that is assigned to the newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServer operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest createServerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler);

    /**
     * <p>
     * Creates a user and associates them with an existing file transfer protocol-enabled server. You can only create
     * and associate users with servers that have the <code>IdentityProviderType</code> set to
     * <code>SERVICE_MANAGED</code>. Using parameters for <code>CreateUser</code>, you can specify the user name, set
     * the home directory, store the user's public key, and assign the user's Identity and Access Management (IAM) role.
     * You can also optionally add a session policy, and assign metadata with tags that can be used to group and search
     * for users.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSTransferAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user and associates them with an existing file transfer protocol-enabled server. You can only create
     * and associate users with servers that have the <code>IdentityProviderType</code> set to
     * <code>SERVICE_MANAGED</code>. Using parameters for <code>CreateUser</code>, you can specify the user name, set
     * the home directory, store the user's public key, and assign the user's Identity and Access Management (IAM) role.
     * You can also optionally add a session policy, and assign metadata with tags that can be used to group and search
     * for users.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer
     * completes. After creating a workflow, you can associate the workflow created with any transfer servers by
     * specifying the <code>workflow-details</code> field in <code>CreateServer</code> and <code>UpdateServer</code>
     * operations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AWSTransferAsync.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer
     * completes. After creating a workflow, you can associate the workflow created with any transfer servers by
     * specifying the <code>workflow-details</code> field in <code>CreateServer</code> and <code>UpdateServer</code>
     * operations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AWSTransferAsyncHandler.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler);

    /**
     * <p>
     * Allows you to delete the access specified in the <code>ServerID</code> and <code>ExternalID</code> parameters.
     * </p>
     * 
     * @param deleteAccessRequest
     * @return A Java Future containing the result of the DeleteAccess operation returned by the service.
     * @sample AWSTransferAsync.DeleteAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessResult> deleteAccessAsync(DeleteAccessRequest deleteAccessRequest);

    /**
     * <p>
     * Allows you to delete the access specified in the <code>ServerID</code> and <code>ExternalID</code> parameters.
     * </p>
     * 
     * @param deleteAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccess operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessResult> deleteAccessAsync(DeleteAccessRequest deleteAccessRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessRequest, DeleteAccessResult> asyncHandler);

    /**
     * <p>
     * Delete the agreement that's specified in the provided <code>AgreementId</code>.
     * </p>
     * 
     * @param deleteAgreementRequest
     * @return A Java Future containing the result of the DeleteAgreement operation returned by the service.
     * @sample AWSTransferAsync.DeleteAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgreementResult> deleteAgreementAsync(DeleteAgreementRequest deleteAgreementRequest);

    /**
     * <p>
     * Delete the agreement that's specified in the provided <code>AgreementId</code>.
     * </p>
     * 
     * @param deleteAgreementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgreement operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgreementResult> deleteAgreementAsync(DeleteAgreementRequest deleteAgreementRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgreementRequest, DeleteAgreementResult> asyncHandler);

    /**
     * <p>
     * Deletes the certificate that's specified in the <code>CertificateId</code> parameter.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSTransferAsync.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes the certificate that's specified in the <code>CertificateId</code> parameter.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes the agreement that's specified in the provided <code>ConnectorId</code>.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return A Java Future containing the result of the DeleteConnector operation returned by the service.
     * @sample AWSTransferAsync.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest deleteConnectorRequest);

    /**
     * <p>
     * Deletes the agreement that's specified in the provided <code>ConnectorId</code>.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnector operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest deleteConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler);

    /**
     * <p>
     * Deletes the host key that's specified in the <code>HoskKeyId</code> parameter.
     * </p>
     * 
     * @param deleteHostKeyRequest
     * @return A Java Future containing the result of the DeleteHostKey operation returned by the service.
     * @sample AWSTransferAsync.DeleteHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHostKeyResult> deleteHostKeyAsync(DeleteHostKeyRequest deleteHostKeyRequest);

    /**
     * <p>
     * Deletes the host key that's specified in the <code>HoskKeyId</code> parameter.
     * </p>
     * 
     * @param deleteHostKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHostKey operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHostKeyResult> deleteHostKeyAsync(DeleteHostKeyRequest deleteHostKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHostKeyRequest, DeleteHostKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes the profile that's specified in the <code>ProfileId</code> parameter.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSTransferAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes the profile that's specified in the <code>ProfileId</code> parameter.
     * </p>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes the file transfer protocol-enabled server that you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * 
     * @param deleteServerRequest
     * @return A Java Future containing the result of the DeleteServer operation returned by the service.
     * @sample AWSTransferAsync.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Deletes the file transfer protocol-enabled server that you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * 
     * @param deleteServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServer operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest deleteServerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServerRequest, DeleteServerResult> asyncHandler);

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @return A Java Future containing the result of the DeleteSshPublicKey operation returned by the service.
     * @sample AWSTransferAsync.DeleteSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSshPublicKeyResult> deleteSshPublicKeyAsync(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest);

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSshPublicKey operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSshPublicKeyResult> deleteSshPublicKeyAsync(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSshPublicKeyRequest, DeleteSshPublicKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes the user belonging to a file transfer protocol-enabled server you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * <note>
     * <p>
     * When you delete a user from a server, the user's information is lost.
     * </p>
     * </note>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSTransferAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the user belonging to a file transfer protocol-enabled server you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * <note>
     * <p>
     * When you delete a user from a server, the user's information is lost.
     * </p>
     * </note>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AWSTransferAsync.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Deletes the specified workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AWSTransferAsyncHandler.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler);

    /**
     * <p>
     * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property and its <code>ExternalId</code>.
     * </p>
     * <p>
     * The response from this call returns the properties of the access that is associated with the
     * <code>ServerId</code> value that was specified.
     * </p>
     * 
     * @param describeAccessRequest
     * @return A Java Future containing the result of the DescribeAccess operation returned by the service.
     * @sample AWSTransferAsync.DescribeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessResult> describeAccessAsync(DescribeAccessRequest describeAccessRequest);

    /**
     * <p>
     * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property and its <code>ExternalId</code>.
     * </p>
     * <p>
     * The response from this call returns the properties of the access that is associated with the
     * <code>ServerId</code> value that was specified.
     * </p>
     * 
     * @param describeAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccess operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessResult> describeAccessAsync(DescribeAccessRequest describeAccessRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccessRequest, DescribeAccessResult> asyncHandler);

    /**
     * <p>
     * Describes the agreement that's identified by the <code>AgreementId</code>.
     * </p>
     * 
     * @param describeAgreementRequest
     * @return A Java Future containing the result of the DescribeAgreement operation returned by the service.
     * @sample AWSTransferAsync.DescribeAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(DescribeAgreementRequest describeAgreementRequest);

    /**
     * <p>
     * Describes the agreement that's identified by the <code>AgreementId</code>.
     * </p>
     * 
     * @param describeAgreementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgreement operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(DescribeAgreementRequest describeAgreementRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgreementRequest, DescribeAgreementResult> asyncHandler);

    /**
     * <p>
     * Describes the certificate that's identified by the <code>CertificateId</code>.
     * </p>
     * 
     * @param describeCertificateRequest
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSTransferAsync.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Describes the certificate that's identified by the <code>CertificateId</code>.
     * </p>
     * 
     * @param describeCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler);

    /**
     * <p>
     * Describes the connector that's identified by the <code>ConnectorId.</code>
     * </p>
     * 
     * @param describeConnectorRequest
     * @return A Java Future containing the result of the DescribeConnector operation returned by the service.
     * @sample AWSTransferAsync.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest describeConnectorRequest);

    /**
     * <p>
     * Describes the connector that's identified by the <code>ConnectorId.</code>
     * </p>
     * 
     * @param describeConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnector operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest describeConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorRequest, DescribeConnectorResult> asyncHandler);

    /**
     * <p>
     * You can use <code>DescribeExecution</code> to check the details of the execution of the specified workflow.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return A Java Future containing the result of the DescribeExecution operation returned by the service.
     * @sample AWSTransferAsync.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * You can use <code>DescribeExecution</code> to check the details of the execution of the specified workflow.
     * </p>
     * 
     * @param describeExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExecution operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest describeExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the host key that's specified by the <code>HostKeyId</code> and <code>ServerId</code>.
     * </p>
     * 
     * @param describeHostKeyRequest
     * @return A Java Future containing the result of the DescribeHostKey operation returned by the service.
     * @sample AWSTransferAsync.DescribeHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostKeyResult> describeHostKeyAsync(DescribeHostKeyRequest describeHostKeyRequest);

    /**
     * <p>
     * Returns the details of the host key that's specified by the <code>HostKeyId</code> and <code>ServerId</code>.
     * </p>
     * 
     * @param describeHostKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHostKey operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHostKeyResult> describeHostKeyAsync(DescribeHostKeyRequest describeHostKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHostKeyRequest, DescribeHostKeyResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the profile that's specified by the <code>ProfileId</code>.
     * </p>
     * 
     * @param describeProfileRequest
     * @return A Java Future containing the result of the DescribeProfile operation returned by the service.
     * @sample AWSTransferAsync.DescribeProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProfileResult> describeProfileAsync(DescribeProfileRequest describeProfileRequest);

    /**
     * <p>
     * Returns the details of the profile that's specified by the <code>ProfileId</code>.
     * </p>
     * 
     * @param describeProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProfile operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProfileResult> describeProfileAsync(DescribeProfileRequest describeProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProfileRequest, DescribeProfileResult> asyncHandler);

    /**
     * <p>
     * Describes the security policy that is attached to your file transfer protocol-enabled server. The response
     * contains a description of the security policy's properties. For more information about security policies, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security
     * policies</a>.
     * </p>
     * 
     * @param describeSecurityPolicyRequest
     * @return A Java Future containing the result of the DescribeSecurityPolicy operation returned by the service.
     * @sample AWSTransferAsync.DescribeSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityPolicyResult> describeSecurityPolicyAsync(DescribeSecurityPolicyRequest describeSecurityPolicyRequest);

    /**
     * <p>
     * Describes the security policy that is attached to your file transfer protocol-enabled server. The response
     * contains a description of the security policy's properties. For more information about security policies, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security
     * policies</a>.
     * </p>
     * 
     * @param describeSecurityPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecurityPolicy operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSecurityPolicyResult> describeSecurityPolicyAsync(DescribeSecurityPolicyRequest describeSecurityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityPolicyRequest, DescribeSecurityPolicyResult> asyncHandler);

    /**
     * <p>
     * Describes a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * <p>
     * The response contains a description of a server's properties. When you set <code>EndpointType</code> to VPC, the
     * response will contain the <code>EndpointDetails</code>.
     * </p>
     * 
     * @param describeServerRequest
     * @return A Java Future containing the result of the DescribeServer operation returned by the service.
     * @sample AWSTransferAsync.DescribeServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServerResult> describeServerAsync(DescribeServerRequest describeServerRequest);

    /**
     * <p>
     * Describes a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * <p>
     * The response contains a description of a server's properties. When you set <code>EndpointType</code> to VPC, the
     * response will contain the <code>EndpointDetails</code>.
     * </p>
     * 
     * @param describeServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServer operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServerResult> describeServerAsync(DescribeServerRequest describeServerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServerRequest, DescribeServerResult> asyncHandler);

    /**
     * <p>
     * Describes the user assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property.
     * </p>
     * <p>
     * The response from this call returns the properties of the user associated with the <code>ServerId</code> value
     * that was specified.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AWSTransferAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Describes the user assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property.
     * </p>
     * <p>
     * The response from this call returns the properties of the user associated with the <code>ServerId</code> value
     * that was specified.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * <p>
     * Describes the specified workflow.
     * </p>
     * 
     * @param describeWorkflowRequest
     * @return A Java Future containing the result of the DescribeWorkflow operation returned by the service.
     * @sample AWSTransferAsync.DescribeWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkflowResult> describeWorkflowAsync(DescribeWorkflowRequest describeWorkflowRequest);

    /**
     * <p>
     * Describes the specified workflow.
     * </p>
     * 
     * @param describeWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkflow operation returned by the service.
     * @sample AWSTransferAsyncHandler.DescribeWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkflowResult> describeWorkflowAsync(DescribeWorkflowRequest describeWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkflowRequest, DescribeWorkflowResult> asyncHandler);

    /**
     * <p>
     * Imports the signing and encryption certificates that you need to create local (AS2) profiles and partner
     * profiles.
     * </p>
     * 
     * @param importCertificateRequest
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSTransferAsync.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Imports the signing and encryption certificates that you need to create local (AS2) profiles and partner
     * profiles.
     * </p>
     * 
     * @param importCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSTransferAsyncHandler.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler);

    /**
     * <p>
     * Adds a host key to the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param importHostKeyRequest
     * @return A Java Future containing the result of the ImportHostKey operation returned by the service.
     * @sample AWSTransferAsync.ImportHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportHostKeyResult> importHostKeyAsync(ImportHostKeyRequest importHostKeyRequest);

    /**
     * <p>
     * Adds a host key to the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param importHostKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportHostKey operation returned by the service.
     * @sample AWSTransferAsyncHandler.ImportHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportHostKeyResult> importHostKeyAsync(ImportHostKeyRequest importHostKeyRequest,
            com.amazonaws.handlers.AsyncHandler<ImportHostKeyRequest, ImportHostKeyResult> asyncHandler);

    /**
     * <p>
     * Adds a Secure Shell (SSH) public key to a user account identified by a <code>UserName</code> value assigned to
     * the specific file transfer protocol-enabled server, identified by <code>ServerId</code>.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> value, the <code>ServerId</code> value, and the name of the
     * <code>SshPublicKeyId</code>.
     * </p>
     * 
     * @param importSshPublicKeyRequest
     * @return A Java Future containing the result of the ImportSshPublicKey operation returned by the service.
     * @sample AWSTransferAsync.ImportSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportSshPublicKeyResult> importSshPublicKeyAsync(ImportSshPublicKeyRequest importSshPublicKeyRequest);

    /**
     * <p>
     * Adds a Secure Shell (SSH) public key to a user account identified by a <code>UserName</code> value assigned to
     * the specific file transfer protocol-enabled server, identified by <code>ServerId</code>.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> value, the <code>ServerId</code> value, and the name of the
     * <code>SshPublicKeyId</code>.
     * </p>
     * 
     * @param importSshPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportSshPublicKey operation returned by the service.
     * @sample AWSTransferAsyncHandler.ImportSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportSshPublicKeyResult> importSshPublicKeyAsync(ImportSshPublicKeyRequest importSshPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<ImportSshPublicKeyRequest, ImportSshPublicKeyResult> asyncHandler);

    /**
     * <p>
     * Lists the details for all the accesses you have on your server.
     * </p>
     * 
     * @param listAccessesRequest
     * @return A Java Future containing the result of the ListAccesses operation returned by the service.
     * @sample AWSTransferAsync.ListAccesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAccesses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessesResult> listAccessesAsync(ListAccessesRequest listAccessesRequest);

    /**
     * <p>
     * Lists the details for all the accesses you have on your server.
     * </p>
     * 
     * @param listAccessesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccesses operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListAccesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAccesses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessesResult> listAccessesAsync(ListAccessesRequest listAccessesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessesRequest, ListAccessesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the agreements for the server that's identified by the <code>ServerId</code> that you supply.
     * If you want to limit the results to a certain number, supply a value for the <code>MaxResults</code> parameter.
     * If you ran the command previously and received a value for <code>NextToken</code>, you can supply that value to
     * continue listing agreements from where you left off.
     * </p>
     * 
     * @param listAgreementsRequest
     * @return A Java Future containing the result of the ListAgreements operation returned by the service.
     * @sample AWSTransferAsync.ListAgreements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAgreements" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgreementsResult> listAgreementsAsync(ListAgreementsRequest listAgreementsRequest);

    /**
     * <p>
     * Returns a list of the agreements for the server that's identified by the <code>ServerId</code> that you supply.
     * If you want to limit the results to a certain number, supply a value for the <code>MaxResults</code> parameter.
     * If you ran the command previously and received a value for <code>NextToken</code>, you can supply that value to
     * continue listing agreements from where you left off.
     * </p>
     * 
     * @param listAgreementsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgreements operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListAgreements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAgreements" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgreementsResult> listAgreementsAsync(ListAgreementsRequest listAgreementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgreementsRequest, ListAgreementsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the current certificates that have been imported into Transfer Family. If you want to limit the
     * results to a certain number, supply a value for the <code>MaxResults</code> parameter. If you ran the command
     * previously and received a value for the <code>NextToken</code> parameter, you can supply that value to continue
     * listing certificates from where you left off.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSTransferAsync.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Returns a list of the current certificates that have been imported into Transfer Family. If you want to limit the
     * results to a certain number, supply a value for the <code>MaxResults</code> parameter. If you ran the command
     * previously and received a value for the <code>NextToken</code> parameter, you can supply that value to continue
     * listing certificates from where you left off.
     * </p>
     * 
     * @param listCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists the connectors for the specified Region.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return A Java Future containing the result of the ListConnectors operation returned by the service.
     * @sample AWSTransferAsync.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest listConnectorsRequest);

    /**
     * <p>
     * Lists the connectors for the specified Region.
     * </p>
     * 
     * @param listConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnectors operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest listConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler);

    /**
     * <p>
     * Lists all executions for the specified workflow.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSTransferAsync.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Lists all executions for the specified workflow.
     * </p>
     * 
     * @param listExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of host keys for the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param listHostKeysRequest
     * @return A Java Future containing the result of the ListHostKeys operation returned by the service.
     * @sample AWSTransferAsync.ListHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListHostKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHostKeysResult> listHostKeysAsync(ListHostKeysRequest listHostKeysRequest);

    /**
     * <p>
     * Returns a list of host keys for the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param listHostKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostKeys operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListHostKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHostKeysResult> listHostKeysAsync(ListHostKeysRequest listHostKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListHostKeysRequest, ListHostKeysResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the profiles for your system. If you want to limit the results to a certain number, supply a
     * value for the <code>MaxResults</code> parameter. If you ran the command previously and received a value for
     * <code>NextToken</code>, you can supply that value to continue listing profiles from where you left off.
     * </p>
     * 
     * @param listProfilesRequest
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSTransferAsync.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Returns a list of the profiles for your system. If you want to limit the results to a certain number, supply a
     * value for the <code>MaxResults</code> parameter. If you ran the command previously and received a value for
     * <code>NextToken</code>, you can supply that value to continue listing profiles from where you left off.
     * </p>
     * 
     * @param listProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the security policies that are attached to your file transfer protocol-enabled servers.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return A Java Future containing the result of the ListSecurityPolicies operation returned by the service.
     * @sample AWSTransferAsync.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListSecurityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(ListSecurityPoliciesRequest listSecurityPoliciesRequest);

    /**
     * <p>
     * Lists the security policies that are attached to your file transfer protocol-enabled servers.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityPolicies operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListSecurityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(ListSecurityPoliciesRequest listSecurityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityPoliciesRequest, ListSecurityPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listServersRequest
     * @return A Java Future containing the result of the ListServers operation returned by the service.
     * @sample AWSTransferAsync.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest listServersRequest);

    /**
     * <p>
     * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServers operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest listServersRequest,
            com.amazonaws.handlers.AsyncHandler<ListServersRequest, ListServersResult> asyncHandler);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * user, server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSTransferAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * user, server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the users for a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSTransferAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists the users for a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Lists all of your workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AWSTransferAsync.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Lists all of your workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AWSTransferAsyncHandler.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Sends a callback for asynchronous custom steps.
     * </p>
     * <p>
     * The <code>ExecutionId</code>, <code>WorkflowId</code>, and <code>Token</code> are passed to the target resource
     * during execution of a custom step of a workflow. You must include those with their callback as well as providing
     * a status.
     * </p>
     * 
     * @param sendWorkflowStepStateRequest
     * @return A Java Future containing the result of the SendWorkflowStepState operation returned by the service.
     * @sample AWSTransferAsync.SendWorkflowStepState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SendWorkflowStepState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendWorkflowStepStateResult> sendWorkflowStepStateAsync(SendWorkflowStepStateRequest sendWorkflowStepStateRequest);

    /**
     * <p>
     * Sends a callback for asynchronous custom steps.
     * </p>
     * <p>
     * The <code>ExecutionId</code>, <code>WorkflowId</code>, and <code>Token</code> are passed to the target resource
     * during execution of a custom step of a workflow. You must include those with their callback as well as providing
     * a status.
     * </p>
     * 
     * @param sendWorkflowStepStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendWorkflowStepState operation returned by the service.
     * @sample AWSTransferAsyncHandler.SendWorkflowStepState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SendWorkflowStepState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendWorkflowStepStateResult> sendWorkflowStepStateAsync(SendWorkflowStepStateRequest sendWorkflowStepStateRequest,
            com.amazonaws.handlers.AsyncHandler<SendWorkflowStepStateRequest, SendWorkflowStepStateResult> asyncHandler);

    /**
     * <p>
     * Begins an outbound file transfer to a remote AS2 server. You specify the <code>ConnectorId</code> and the file
     * paths for where to send the files.
     * </p>
     * 
     * @param startFileTransferRequest
     * @return A Java Future containing the result of the StartFileTransfer operation returned by the service.
     * @sample AWSTransferAsync.StartFileTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartFileTransfer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFileTransferResult> startFileTransferAsync(StartFileTransferRequest startFileTransferRequest);

    /**
     * <p>
     * Begins an outbound file transfer to a remote AS2 server. You specify the <code>ConnectorId</code> and the file
     * paths for where to send the files.
     * </p>
     * 
     * @param startFileTransferRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFileTransfer operation returned by the service.
     * @sample AWSTransferAsyncHandler.StartFileTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartFileTransfer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFileTransferResult> startFileTransferAsync(StartFileTransferRequest startFileTransferRequest,
            com.amazonaws.handlers.AsyncHandler<StartFileTransferRequest, StartFileTransferResult> asyncHandler);

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>OFFLINE</code> to <code>ONLINE</code>. It
     * has no impact on a server that is already <code>ONLINE</code>. An <code>ONLINE</code> server can accept and
     * process file transfer jobs.
     * </p>
     * <p>
     * The state of <code>STARTING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully online. The values of <code>START_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param startServerRequest
     * @return A Java Future containing the result of the StartServer operation returned by the service.
     * @sample AWSTransferAsync.StartServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartServerResult> startServerAsync(StartServerRequest startServerRequest);

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>OFFLINE</code> to <code>ONLINE</code>. It
     * has no impact on a server that is already <code>ONLINE</code>. An <code>ONLINE</code> server can accept and
     * process file transfer jobs.
     * </p>
     * <p>
     * The state of <code>STARTING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully online. The values of <code>START_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param startServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartServer operation returned by the service.
     * @sample AWSTransferAsyncHandler.StartServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartServerResult> startServerAsync(StartServerRequest startServerRequest,
            com.amazonaws.handlers.AsyncHandler<StartServerRequest, StartServerResult> asyncHandler);

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>ONLINE</code> to <code>OFFLINE</code>. An
     * <code>OFFLINE</code> server cannot accept and process file transfer jobs. Information tied to your server, such
     * as server and user properties, are not affected by stopping your server.
     * </p>
     * <note>
     * <p>
     * Stopping the server does not reduce or impact your file transfer protocol endpoint billing; you must delete the
     * server to stop being billed.
     * </p>
     * </note>
     * <p>
     * The state of <code>STOPPING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully offline. The values of <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param stopServerRequest
     * @return A Java Future containing the result of the StopServer operation returned by the service.
     * @sample AWSTransferAsync.StopServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StopServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopServerResult> stopServerAsync(StopServerRequest stopServerRequest);

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>ONLINE</code> to <code>OFFLINE</code>. An
     * <code>OFFLINE</code> server cannot accept and process file transfer jobs. Information tied to your server, such
     * as server and user properties, are not affected by stopping your server.
     * </p>
     * <note>
     * <p>
     * Stopping the server does not reduce or impact your file transfer protocol endpoint billing; you must delete the
     * server to stop being billed.
     * </p>
     * </note>
     * <p>
     * The state of <code>STOPPING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully offline. The values of <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param stopServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopServer operation returned by the service.
     * @sample AWSTransferAsyncHandler.StopServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StopServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopServerResult> stopServerAsync(StopServerRequest stopServerRequest,
            com.amazonaws.handlers.AsyncHandler<StopServerRequest, StopServerResult> asyncHandler);

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSTransferAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSTransferAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * If the <code>IdentityProviderType</code> of a file transfer protocol-enabled server is
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_Gateway</code>, tests whether your identity provider is set up
     * successfully. We highly recommend that you call this operation to test your authentication method as soon as you
     * create your server. By doing so, you can troubleshoot issues with the identity provider integration to ensure
     * that your users can successfully use the service.
     * </p>
     * <p>
     * The <code>ServerId</code> and <code>UserName</code> parameters are required. The <code>ServerProtocol</code>,
     * <code>SourceIp</code>, and <code>UserPassword</code> are all optional.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>TestIdentityProvider</code> if the <code>IdentityProviderType</code> of your server is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If you provide any incorrect values for any parameters, the <code>Response</code> field is empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you provide a server ID for a server that uses service-managed users, you get an error:
     * </p>
     * <p>
     * <code> An error occurred (InvalidRequestException) when calling the TestIdentityProvider operation: s-<i>server-ID</i> not configured for external auth </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enter a Server ID for the <code>--server-id</code> parameter that does not identify an actual Transfer
     * server, you receive the following error:
     * </p>
     * <p>
     * <code>An error occurred (ResourceNotFoundException) when calling the TestIdentityProvider operation: Unknown server</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param testIdentityProviderRequest
     * @return A Java Future containing the result of the TestIdentityProvider operation returned by the service.
     * @sample AWSTransferAsync.TestIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestIdentityProviderResult> testIdentityProviderAsync(TestIdentityProviderRequest testIdentityProviderRequest);

    /**
     * <p>
     * If the <code>IdentityProviderType</code> of a file transfer protocol-enabled server is
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_Gateway</code>, tests whether your identity provider is set up
     * successfully. We highly recommend that you call this operation to test your authentication method as soon as you
     * create your server. By doing so, you can troubleshoot issues with the identity provider integration to ensure
     * that your users can successfully use the service.
     * </p>
     * <p>
     * The <code>ServerId</code> and <code>UserName</code> parameters are required. The <code>ServerProtocol</code>,
     * <code>SourceIp</code>, and <code>UserPassword</code> are all optional.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>TestIdentityProvider</code> if the <code>IdentityProviderType</code> of your server is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If you provide any incorrect values for any parameters, the <code>Response</code> field is empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you provide a server ID for a server that uses service-managed users, you get an error:
     * </p>
     * <p>
     * <code> An error occurred (InvalidRequestException) when calling the TestIdentityProvider operation: s-<i>server-ID</i> not configured for external auth </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enter a Server ID for the <code>--server-id</code> parameter that does not identify an actual Transfer
     * server, you receive the following error:
     * </p>
     * <p>
     * <code>An error occurred (ResourceNotFoundException) when calling the TestIdentityProvider operation: Unknown server</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param testIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestIdentityProvider operation returned by the service.
     * @sample AWSTransferAsyncHandler.TestIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestIdentityProviderResult> testIdentityProviderAsync(TestIdentityProviderRequest testIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<TestIdentityProviderRequest, TestIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSTransferAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSTransferAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Allows you to update parameters for the access specified in the <code>ServerID</code> and <code>ExternalID</code>
     * parameters.
     * </p>
     * 
     * @param updateAccessRequest
     * @return A Java Future containing the result of the UpdateAccess operation returned by the service.
     * @sample AWSTransferAsync.UpdateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessResult> updateAccessAsync(UpdateAccessRequest updateAccessRequest);

    /**
     * <p>
     * Allows you to update parameters for the access specified in the <code>ServerID</code> and <code>ExternalID</code>
     * parameters.
     * </p>
     * 
     * @param updateAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccess operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessResult> updateAccessAsync(UpdateAccessRequest updateAccessRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessRequest, UpdateAccessResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters for an existing agreement. Provide the <code>AgreementId</code> and the
     * <code>ServerId</code> for the agreement that you want to update, along with the new values for the parameters to
     * update.
     * </p>
     * 
     * @param updateAgreementRequest
     * @return A Java Future containing the result of the UpdateAgreement operation returned by the service.
     * @sample AWSTransferAsync.UpdateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgreementResult> updateAgreementAsync(UpdateAgreementRequest updateAgreementRequest);

    /**
     * <p>
     * Updates some of the parameters for an existing agreement. Provide the <code>AgreementId</code> and the
     * <code>ServerId</code> for the agreement that you want to update, along with the new values for the parameters to
     * update.
     * </p>
     * 
     * @param updateAgreementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgreement operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgreementResult> updateAgreementAsync(UpdateAgreementRequest updateAgreementRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgreementRequest, UpdateAgreementResult> asyncHandler);

    /**
     * <p>
     * Updates the active and inactive dates for a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     * @return A Java Future containing the result of the UpdateCertificate operation returned by the service.
     * @sample AWSTransferAsync.UpdateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(UpdateCertificateRequest updateCertificateRequest);

    /**
     * <p>
     * Updates the active and inactive dates for a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCertificate operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(UpdateCertificateRequest updateCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, UpdateCertificateResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters for an existing connector. Provide the <code>ConnectorId</code> for the connector
     * that you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateConnectorRequest
     * @return A Java Future containing the result of the UpdateConnector operation returned by the service.
     * @sample AWSTransferAsync.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest updateConnectorRequest);

    /**
     * <p>
     * Updates some of the parameters for an existing connector. Provide the <code>ConnectorId</code> for the connector
     * that you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnector operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest updateConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectorRequest, UpdateConnectorResult> asyncHandler);

    /**
     * <p>
     * Updates the description for the host key that's specified by the <code>ServerId</code> and <code>HostKeyId</code>
     * parameters.
     * </p>
     * 
     * @param updateHostKeyRequest
     * @return A Java Future containing the result of the UpdateHostKey operation returned by the service.
     * @sample AWSTransferAsync.UpdateHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateHostKeyResult> updateHostKeyAsync(UpdateHostKeyRequest updateHostKeyRequest);

    /**
     * <p>
     * Updates the description for the host key that's specified by the <code>ServerId</code> and <code>HostKeyId</code>
     * parameters.
     * </p>
     * 
     * @param updateHostKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHostKey operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateHostKeyResult> updateHostKeyAsync(UpdateHostKeyRequest updateHostKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHostKeyRequest, UpdateHostKeyResult> asyncHandler);

    /**
     * <p>
     * Updates some of the parameters for an existing profile. Provide the <code>ProfileId</code> for the profile that
     * you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateProfileRequest
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSTransferAsync.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates some of the parameters for an existing profile. Provide the <code>ProfileId</code> for the profile that
     * you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the file transfer protocol-enabled server's properties after that server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of the server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @return A Java Future containing the result of the UpdateServer operation returned by the service.
     * @sample AWSTransferAsync.UpdateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest updateServerRequest);

    /**
     * <p>
     * Updates the file transfer protocol-enabled server's properties after that server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of the server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServer operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest updateServerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler);

    /**
     * <p>
     * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory,
     * role, and policy for the <code>UserName</code> and <code>ServerId</code> you specify.
     * </p>
     * <p>
     * The response returns the <code>ServerId</code> and the <code>UserName</code> for the updated user.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSTransferAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory,
     * role, and policy for the <code>UserName</code> and <code>ServerId</code> you specify.
     * </p>
     * <p>
     * The response returns the <code>ServerId</code> and the <code>UserName</code> for the updated user.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSTransferAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

}
