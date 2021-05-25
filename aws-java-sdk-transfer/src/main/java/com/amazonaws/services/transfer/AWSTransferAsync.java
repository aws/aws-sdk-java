/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Transfer Family is a fully managed service that enables the transfer of files over the File Transfer Protocol
 * (FTP), File Transfer Protocol over SSL (FTPS), or Secure Shell (SSH) File Transfer Protocol (SFTP) directly into and
 * out of Amazon Simple Storage Service (Amazon S3). AWS helps you seamlessly migrate your file transfer workflows to
 * AWS Transfer Family by integrating with existing authentication systems, and providing DNS routing with Amazon Route
 * 53 so nothing changes for your customers and partners, or their applications. With your data in Amazon S3, you can
 * use it with AWS services for processing, analytics, machine learning, and archiving. Getting started with AWS
 * Transfer Family is easy since there is no infrastructure to buy and set up.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTransferAsync extends AWSTransfer {

    /**
     * <p>
     * Used by administrators to choose which groups in the directory should have access to upload and download files
     * over the enabled protocols using AWS Transfer Family. For example, a Microsoft Active Directory might contain
     * 50,000 users, but only a small fraction might need the ability to transfer files to the server. An administrator
     * can use <code>CreateAccess</code> to limit the access to the correct set of users who need this ability.
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
     * over the enabled protocols using AWS Transfer Family. For example, a Microsoft Active Directory might contain
     * 50,000 users, but only a small fraction might need the ability to transfer files to the server. An administrator
     * can use <code>CreateAccess</code> to limit the access to the correct set of users who need this ability.
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
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in AWS. When you make
     * updates to your file transfer protocol-enabled server or when you work with users, use the service-generated
     * <code>ServerId</code> property that is assigned to the newly created server.
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
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in AWS. When you make
     * updates to your file transfer protocol-enabled server or when you work with users, use the service-generated
     * <code>ServerId</code> property that is assigned to the newly created server.
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
     * the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM)
     * role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group
     * and search for users.
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
     * the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM)
     * role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group
     * and search for users.
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
     * <p>
     * No response is returned from this operation.
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
     * <p>
     * No response is returned from this operation.
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
     * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property and its <code>ExternalID</code>.
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
     * <code>ServerId</code> property and its <code>ExternalID</code>.
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
     * Lists the file transfer protocol-enabled servers that are associated with your AWS account.
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
     * Lists the file transfer protocol-enabled servers that are associated with your AWS account.
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
     * Stopping the server will not reduce or impact your file transfer protocol endpoint billing; you must delete the
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
     * Stopping the server will not reduce or impact your file transfer protocol endpoint billing; you must delete the
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
