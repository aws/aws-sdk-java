/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Interface for accessing AWS Transfer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.transfer.AbstractAWSTransfer} instead.
 * </p>
 * <p>
 * <p>
 * AWS Transfer for SFTP is a fully managed service that enables the transfer of files directly into and out of Amazon
 * S3 using the Secure File Transfer Protocol (SFTP)—also known as Secure Shell (SSH) File Transfer Protocol. AWS helps
 * you seamlessly migrate your file transfer workflows to AWS Transfer for SFTP—by integrating with existing
 * authentication systems, and providing DNS routing with Amazon Route 53—so nothing changes for your customers and
 * partners, or their applications. With your data in S3, you can use it with AWS services for processing, analytics,
 * machine learning, and archiving. Getting started with AWS Transfer for SFTP (AWS SFTP) is easy; there is no
 * infrastructure to buy and setup.
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
     * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns
     * the <code>ServerId</code> property assigned by the service to the newly created server. Reference this
     * <code>ServerId</code> property when you make updates to your server, or work with users.
     * </p>
     * <p>
     * The response returns the <code>ServerId</code> value for the newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @return Result of the CreateServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest);

    /**
     * <p>
     * Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for
     * <code>CreateUser</code>, you can specify the user name, set the home directory, store the user's public key, and
     * assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy,
     * and assign metadata with tags that can be used to group and search for users.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> and <code>ServerId</code> values of the new user for that server.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deletes the Secure File Transfer Protocol (SFTP) server that you specify. If you used
     * <code>SERVICE_MANAGED</code> as your <code>IdentityProviderType</code>, you need to delete all users associated
     * with this server before deleting the server itself
     * </p>
     * <p>
     * No response returns from this call.
     * </p>
     * 
     * @param deleteServerRequest
     * @return Result of the DeleteServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServerResult deleteServer(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @return Result of the DeleteSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.DeleteSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSshPublicKeyResult deleteSshPublicKey(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest);

    /**
     * <p>
     * Deletes the user belonging to the server you specify.
     * </p>
     * <p>
     * No response returns from this call.
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
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Describes the server that you specify by passing the <code>ServerId</code> parameter.
     * </p>
     * <p>
     * The response contains a description of the server's properties.
     * </p>
     * 
     * @param describeServerRequest
     * @return Result of the DescribeServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.DescribeServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServerResult describeServer(DescribeServerRequest describeServerRequest);

    /**
     * <p>
     * Describes the user assigned to a specific server, as identified by its <code>ServerId</code> property.
     * </p>
     * <p>
     * The response from this call returns the properties of the user associated with the <code>ServerId</code> value
     * that was specified.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Adds a Secure Shell (SSH) public key to a user account identified by a <code>UserName</code> value assigned to a
     * specific server, identified by <code>ServerId</code>.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> value, the <code>ServerId</code> value, and the name of the
     * <code>SshPublicKeyId</code>.
     * </p>
     * 
     * @param importSshPublicKeyRequest
     * @return Result of the ImportSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.ImportSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    ImportSshPublicKeyResult importSshPublicKey(ImportSshPublicKeyRequest importSshPublicKeyRequest);

    /**
     * <p>
     * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
     * </p>
     * 
     * @param listServersRequest
     * @return Result of the ListServers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
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
     * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user,
     * server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
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
     * Lists the users for the server that you specify by passing the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Changes the state of a Secure File Transfer Protocol (SFTP) server from <code>OFFLINE</code> to
     * <code>ONLINE</code>. It has no impact on an SFTP server that is already <code>ONLINE</code>. An
     * <code>ONLINE</code> server can accept and process file transfer jobs.
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
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
     * @sample AWSTransfer.StartServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartServer" target="_top">AWS API
     *      Documentation</a>
     */
    StartServerResult startServer(StartServerRequest startServerRequest);

    /**
     * <p>
     * Changes the state of an SFTP server from <code>ONLINE</code> to <code>OFFLINE</code>. An <code>OFFLINE</code>
     * server cannot accept and process file transfer jobs. Information tied to your server such as server and user
     * properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File
     * Transfer Protocol (SFTP) endpoint billing.
     * </p>
     * <p>
     * The states of <code>STOPPING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully offline. The values of <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param stopServerRequest
     * @return Result of the StopServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
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
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * If the <code>IdentityProviderType</code> of the server is <code>API_Gateway</code>, tests whether your API
     * Gateway is set up successfully. We highly recommend that you call this method to test your authentication method
     * as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to
     * ensure that your users can successfully use the service.
     * </p>
     * 
     * @param testIdentityProviderRequest
     * @return Result of the TestIdentityProvider operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
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
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the server properties after that server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of the Secure File Transfer Protocol (SFTP)
     * server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @return Result of the UpdateServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
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
     *         The request has failed because the AWS Transfer for SFTP service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the AWS Transfer for SFTP service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
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

}
