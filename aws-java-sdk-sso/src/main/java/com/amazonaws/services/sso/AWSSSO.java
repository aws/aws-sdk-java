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
package com.amazonaws.services.sso;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sso.model.*;

/**
 * Interface for accessing SSO.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sso.AbstractAWSSSO} instead.
 * </p>
 * <p>
 * <p>
 * AWS IAM Identity Center (successor to AWS Single Sign-On) Portal is a web service that makes it easy for you to
 * assign user access to IAM Identity Center resources such as the AWS access portal. Users can get AWS account
 * applications and roles assigned to them and get federated into the application.
 * </p>
 * <note>
 * <p>
 * Although AWS Single Sign-On was renamed, the <code>sso</code> and <code>identitystore</code> API namespaces will
 * continue to retain their original name for backward compatibility purposes. For more information, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed">IAM Identity Center rename</a>.
 * </p>
 * </note>
 * <p>
 * This reference guide describes the IAM Identity Center Portal operations that you can call programatically and
 * includes detailed information on data types and errors.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms, such as
 * Java, Ruby, .Net, iOS, or Android. The SDKs provide a convenient way to create programmatic access to IAM Identity
 * Center and other AWS services. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSO {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "portal.sso";

    /**
     * <p>
     * Returns the STS short-term credentials for a given role name that is assigned to the user.
     * </p>
     * 
     * @param getRoleCredentialsRequest
     * @return Result of the GetRoleCredentials operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that a problem occurred with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws UnauthorizedException
     *         Indicates that the request is not authorized. This can happen due to an invalid access token in the
     *         request.
     * @throws TooManyRequestsException
     *         Indicates that the request is being made too frequently and is more than what the server can handle.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSSSO.GetRoleCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/GetRoleCredentials" target="_top">AWS API
     *      Documentation</a>
     */
    GetRoleCredentialsResult getRoleCredentials(GetRoleCredentialsRequest getRoleCredentialsRequest);

    /**
     * <p>
     * Lists all roles that are assigned to the user for a given AWS account.
     * </p>
     * 
     * @param listAccountRolesRequest
     * @return Result of the ListAccountRoles operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that a problem occurred with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws UnauthorizedException
     *         Indicates that the request is not authorized. This can happen due to an invalid access token in the
     *         request.
     * @throws TooManyRequestsException
     *         Indicates that the request is being made too frequently and is more than what the server can handle.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSSSO.ListAccountRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccountRoles" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccountRolesResult listAccountRoles(ListAccountRolesRequest listAccountRolesRequest);

    /**
     * <p>
     * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/useraccess.html#assignusers">Assign User
     * Access</a> in the <i>IAM Identity Center User Guide</i>. This operation returns a paginated response.
     * </p>
     * 
     * @param listAccountsRequest
     * @return Result of the ListAccounts operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that a problem occurred with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws UnauthorizedException
     *         Indicates that the request is not authorized. This can happen due to an invalid access token in the
     *         request.
     * @throws TooManyRequestsException
     *         Indicates that the request is being made too frequently and is more than what the server can handle.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSSSO.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccountsResult listAccounts(ListAccountsRequest listAccountsRequest);

    /**
     * <p>
     * Removes the locally stored SSO tokens from the client-side cache and sends an API call to the IAM Identity Center
     * service to invalidate the corresponding server-side IAM Identity Center sign in session.
     * </p>
     * <note>
     * <p>
     * If a user uses IAM Identity Center to access the AWS CLI, the user’s IAM Identity Center sign in session is used
     * to obtain an IAM session, as specified in the corresponding IAM Identity Center permission set. More
     * specifically, IAM Identity Center assumes an IAM role in the target account on behalf of the user, and the
     * corresponding temporary AWS credentials are returned to the client.
     * </p>
     * <p>
     * After user logout, any existing IAM role sessions that were created by using IAM Identity Center permission sets
     * continue based on the duration configured in the permission set. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/authconcept.html">User authentications</a> in the
     * <i>IAM Identity Center User Guide</i>.
     * </p>
     * </note>
     * 
     * @param logoutRequest
     * @return Result of the Logout operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that a problem occurred with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws UnauthorizedException
     *         Indicates that the request is not authorized. This can happen due to an invalid access token in the
     *         request.
     * @throws TooManyRequestsException
     *         Indicates that the request is being made too frequently and is more than what the server can handle.
     * @sample AWSSSO.Logout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/Logout" target="_top">AWS API
     *      Documentation</a>
     */
    LogoutResult logout(LogoutRequest logoutRequest);

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
