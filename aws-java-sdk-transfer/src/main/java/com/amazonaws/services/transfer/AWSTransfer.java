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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.services.transfer.waiters.AWSTransferWaiters;

/**
 * Interface for accessing AWS Transfer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.transfer.AbstractAWSTransfer} instead.
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
public interface AWSTransfer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "transfer";

    /**
     * <p>
     * Used by administrators to choose which groups in the directory should have access to upload and download files
     * over the enabled protocols using Transfer Family. For example, a Microsoft Active Directory might contain 50,000
     * users, but only a small fraction might need the ability to transfer files to the server. An administrator can use
     * <code>CreateAccess</code> to limit the access to the correct set of users who need this ability.
     * </p>
     * 
     * @param createAccessRequest
     * @return Result of the CreateAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.CreateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAccessResult createAccess(CreateAccessRequest createAccessRequest);

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
     * @return Result of the CreateAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAgreementResult createAgreement(CreateAgreementRequest createAgreementRequest);

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
     * @return Result of the CreateConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    CreateConnectorResult createConnector(CreateConnectorRequest createConnectorRequest);

    /**
     * <p>
     * Creates the local or partner profile to use for AS2 transfers.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services.
     * When you make updates to your file transfer protocol-enabled server or when you work with users, use the
     * service-generated <code>ServerId</code> property that is assigned to the newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @return Result of the CreateServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest);

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
     * @return Result of the CreateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer
     * completes. After creating a workflow, you can associate the workflow created with any transfer servers by
     * specifying the <code>workflow-details</code> field in <code>CreateServer</code> and <code>UpdateServer</code>
     * operations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Allows you to delete the access specified in the <code>ServerID</code> and <code>ExternalID</code> parameters.
     * </p>
     * 
     * @param deleteAccessRequest
     * @return Result of the DeleteAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAccess" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAccessResult deleteAccess(DeleteAccessRequest deleteAccessRequest);

    /**
     * <p>
     * Delete the agreement that's specified in the provided <code>AgreementId</code>.
     * </p>
     * 
     * @param deleteAgreementRequest
     * @return Result of the DeleteAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAgreementResult deleteAgreement(DeleteAgreementRequest deleteAgreementRequest);

    /**
     * <p>
     * Deletes the certificate that's specified in the <code>CertificateId</code> parameter.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes the agreement that's specified in the provided <code>ConnectorId</code>.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return Result of the DeleteConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteConnector" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteConnectorResult deleteConnector(DeleteConnectorRequest deleteConnectorRequest);

    /**
     * <p>
     * Deletes the host key that's specified in the <code>HoskKeyId</code> parameter.
     * </p>
     * 
     * @param deleteHostKeyRequest
     * @return Result of the DeleteHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.DeleteHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHostKeyResult deleteHostKey(DeleteHostKeyRequest deleteHostKeyRequest);

    /**
     * <p>
     * Deletes the profile that's specified in the <code>ProfileId</code> parameter.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes the file transfer protocol-enabled server that you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * 
     * @param deleteServerRequest
     * @return Result of the DeleteServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServerResult deleteServer(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @return Result of the DeleteSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.DeleteSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSshPublicKeyResult deleteSshPublicKey(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest);

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
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the specified workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest);

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
     * @return Result of the DescribeAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAccessResult describeAccess(DescribeAccessRequest describeAccessRequest);

    /**
     * <p>
     * Describes the agreement that's identified by the <code>AgreementId</code>.
     * </p>
     * 
     * @param describeAgreementRequest
     * @return Result of the DescribeAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAgreementResult describeAgreement(DescribeAgreementRequest describeAgreementRequest);

    /**
     * <p>
     * Describes the certificate that's identified by the <code>CertificateId</code>.
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCertificateResult describeCertificate(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Describes the connector that's identified by the <code>ConnectorId.</code>
     * </p>
     * 
     * @param describeConnectorRequest
     * @return Result of the DescribeConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeConnector" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeConnectorResult describeConnector(DescribeConnectorRequest describeConnectorRequest);

    /**
     * <p>
     * You can use <code>DescribeExecution</code> to check the details of the execution of the specified workflow.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeExecutionResult describeExecution(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * Returns the details of the host key that's specified by the <code>HostKeyId</code> and <code>ServerId</code>.
     * </p>
     * 
     * @param describeHostKeyRequest
     * @return Result of the DescribeHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHostKeyResult describeHostKey(DescribeHostKeyRequest describeHostKeyRequest);

    /**
     * <p>
     * Returns the details of the profile that's specified by the <code>ProfileId</code>.
     * </p>
     * 
     * @param describeProfileRequest
     * @return Result of the DescribeProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeProfileResult describeProfile(DescribeProfileRequest describeProfileRequest);

    /**
     * <p>
     * Describes the security policy that is attached to your file transfer protocol-enabled server. The response
     * contains a description of the security policy's properties. For more information about security policies, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security
     * policies</a>.
     * </p>
     * 
     * @param describeSecurityPolicyRequest
     * @return Result of the DescribeSecurityPolicy operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSecurityPolicyResult describeSecurityPolicy(DescribeSecurityPolicyRequest describeSecurityPolicyRequest);

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
     * @return Result of the DescribeServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServerResult describeServer(DescribeServerRequest describeServerRequest);

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
     * @return Result of the DescribeUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Describes the specified workflow.
     * </p>
     * 
     * @param describeWorkflowRequest
     * @return Result of the DescribeWorkflow operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorkflowResult describeWorkflow(DescribeWorkflowRequest describeWorkflowRequest);

    /**
     * <p>
     * Imports the signing and encryption certificates that you need to create local (AS2) profiles and partner
     * profiles.
     * </p>
     * 
     * @param importCertificateRequest
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    ImportCertificateResult importCertificate(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Adds a host key to the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param importHostKeyRequest
     * @return Result of the ImportHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.ImportHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    ImportHostKeyResult importHostKey(ImportHostKeyRequest importHostKeyRequest);

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
     * @return Result of the ImportSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.ImportSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    ImportSshPublicKeyResult importSshPublicKey(ImportSshPublicKeyRequest importSshPublicKeyRequest);

    /**
     * <p>
     * Lists the details for all the accesses you have on your server.
     * </p>
     * 
     * @param listAccessesRequest
     * @return Result of the ListAccesses operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListAccesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAccesses" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccessesResult listAccesses(ListAccessesRequest listAccessesRequest);

    /**
     * <p>
     * Returns a list of the agreements for the server that's identified by the <code>ServerId</code> that you supply.
     * If you want to limit the results to a certain number, supply a value for the <code>MaxResults</code> parameter.
     * If you ran the command previously and received a value for <code>NextToken</code>, you can supply that value to
     * continue listing agreements from where you left off.
     * </p>
     * 
     * @param listAgreementsRequest
     * @return Result of the ListAgreements operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListAgreements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAgreements" target="_top">AWS API
     *      Documentation</a>
     */
    ListAgreementsResult listAgreements(ListAgreementsRequest listAgreementsRequest);

    /**
     * <p>
     * Returns a list of the current certificates that have been imported into Transfer Family. If you want to limit the
     * results to a certain number, supply a value for the <code>MaxResults</code> parameter. If you ran the command
     * previously and received a value for the <code>NextToken</code> parameter, you can supply that value to continue
     * listing certificates from where you left off.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Lists the connectors for the specified Region.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return Result of the ListConnectors operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    ListConnectorsResult listConnectors(ListConnectorsRequest listConnectorsRequest);

    /**
     * <p>
     * Lists all executions for the specified workflow.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    ListExecutionsResult listExecutions(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Returns a list of host keys for the server that's specified by the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param listHostKeysRequest
     * @return Result of the ListHostKeys operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListHostKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListHostKeysResult listHostKeys(ListHostKeysRequest listHostKeysRequest);

    /**
     * <p>
     * Returns a list of the profiles for your system. If you want to limit the results to a certain number, supply a
     * value for the <code>MaxResults</code> parameter. If you ran the command previously and received a value for
     * <code>NextToken</code>, you can supply that value to continue listing profiles from where you left off.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListProfilesResult listProfiles(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists the security policies that are attached to your file transfer protocol-enabled servers.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return Result of the ListSecurityPolicies operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListSecurityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    ListSecurityPoliciesResult listSecurityPolicies(ListSecurityPoliciesRequest listSecurityPoliciesRequest);

    /**
     * <p>
     * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listServersRequest
     * @return Result of the ListServers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
     *      Documentation</a>
     */
    ListServersResult listServers(ListServersRequest listServersRequest);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * user, server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the users for a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists all of your workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest);

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
     * @return Result of the SendWorkflowStepState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.SendWorkflowStepState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SendWorkflowStepState" target="_top">AWS
     *      API Documentation</a>
     */
    SendWorkflowStepStateResult sendWorkflowStepState(SendWorkflowStepStateRequest sendWorkflowStepStateRequest);

    /**
     * <p>
     * Begins an outbound file transfer to a remote AS2 server. You specify the <code>ConnectorId</code> and the file
     * paths for where to send the files.
     * </p>
     * 
     * @param startFileTransferRequest
     * @return Result of the StartFileTransfer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.StartFileTransfer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartFileTransfer" target="_top">AWS API
     *      Documentation</a>
     */
    StartFileTransferResult startFileTransfer(StartFileTransferRequest startFileTransferRequest);

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
     * @return Result of the StartServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.StartServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartServer" target="_top">AWS API
     *      Documentation</a>
     */
    StartServerResult startServer(StartServerRequest startServerRequest);

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
     * @return Result of the StopServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.StopServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StopServer" target="_top">AWS API
     *      Documentation</a>
     */
    StopServerResult stopServer(StopServerRequest stopServerRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the TestIdentityProvider operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.TestIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS
     *      API Documentation</a>
     */
    TestIdentityProviderResult testIdentityProvider(TestIdentityProviderRequest testIdentityProviderRequest);

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
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Allows you to update parameters for the access specified in the <code>ServerID</code> and <code>ExternalID</code>
     * parameters.
     * </p>
     * 
     * @param updateAccessRequest
     * @return Result of the UpdateAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAccessResult updateAccess(UpdateAccessRequest updateAccessRequest);

    /**
     * <p>
     * Updates some of the parameters for an existing agreement. Provide the <code>AgreementId</code> and the
     * <code>ServerId</code> for the agreement that you want to update, along with the new values for the parameters to
     * update.
     * </p>
     * 
     * @param updateAgreementRequest
     * @return Result of the UpdateAgreement operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAgreement" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAgreementResult updateAgreement(UpdateAgreementRequest updateAgreementRequest);

    /**
     * <p>
     * Updates the active and inactive dates for a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     * @return Result of the UpdateCertificate operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCertificateResult updateCertificate(UpdateCertificateRequest updateCertificateRequest);

    /**
     * <p>
     * Updates some of the parameters for an existing connector. Provide the <code>ConnectorId</code> for the connector
     * that you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateConnectorRequest
     * @return Result of the UpdateConnector operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateConnectorResult updateConnector(UpdateConnectorRequest updateConnectorRequest);

    /**
     * <p>
     * Updates the description for the host key that's specified by the <code>ServerId</code> and <code>HostKeyId</code>
     * parameters.
     * </p>
     * 
     * @param updateHostKeyRequest
     * @return Result of the UpdateHostKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateHostKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateHostKey" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateHostKeyResult updateHostKey(UpdateHostKeyRequest updateHostKeyRequest);

    /**
     * <p>
     * Updates some of the parameters for an existing profile. Provide the <code>ProfileId</code> for the profile that
     * you want to update, along with the new values for the parameters to update.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates the file transfer protocol-enabled server's properties after that server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of the server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @return Result of the UpdateServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws ConflictException
     *         This exception is thrown when the <code>UpdateServer</code> is called for a file transfer
     *         protocol-enabled server that has VPC as the endpoint type and the server's <code>VpcEndpointID</code> is
     *         not in the available state.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServerResult updateServer(UpdateServerRequest updateServerRequest);

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
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTransfer.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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

    AWSTransferWaiters waiters();

}
