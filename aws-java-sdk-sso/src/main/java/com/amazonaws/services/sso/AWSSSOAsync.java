/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.sso.model.*;

/**
 * Interface for accessing SSO asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sso.AbstractAWSSSOAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Single Sign-On Portal is a web service that makes it easy for you to assign user access to AWS SSO resources such
 * as the user portal. Users can get AWS account applications and roles assigned to them and get federated into the
 * application.
 * </p>
 * <p>
 * For general information about AWS SSO, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">What is AWS Single Sign-On?</a> in the
 * <i>AWS SSO User Guide</i>.
 * </p>
 * <p>
 * This API reference guide describes the AWS SSO Portal operations that you can call programatically and includes
 * detailed information on data types and errors.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms, such as
 * Java, Ruby, .Net, iOS, or Android. The SDKs provide a convenient way to create programmatic access to AWS SSO and
 * other AWS services. For more information about the AWS SDKs, including how to download and install them, see <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSOAsync extends AWSSSO {

    /**
     * <p>
     * Returns the STS short-term credentials for a given role name that is assigned to the user.
     * </p>
     * 
     * @param getRoleCredentialsRequest
     * @return A Java Future containing the result of the GetRoleCredentials operation returned by the service.
     * @sample AWSSSOAsync.GetRoleCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/GetRoleCredentials" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoleCredentialsResult> getRoleCredentialsAsync(GetRoleCredentialsRequest getRoleCredentialsRequest);

    /**
     * <p>
     * Returns the STS short-term credentials for a given role name that is assigned to the user.
     * </p>
     * 
     * @param getRoleCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoleCredentials operation returned by the service.
     * @sample AWSSSOAsyncHandler.GetRoleCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/GetRoleCredentials" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoleCredentialsResult> getRoleCredentialsAsync(GetRoleCredentialsRequest getRoleCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoleCredentialsRequest, GetRoleCredentialsResult> asyncHandler);

    /**
     * <p>
     * Lists all roles that are assigned to the user for a given AWS account.
     * </p>
     * 
     * @param listAccountRolesRequest
     * @return A Java Future containing the result of the ListAccountRoles operation returned by the service.
     * @sample AWSSSOAsync.ListAccountRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccountRoles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountRolesResult> listAccountRolesAsync(ListAccountRolesRequest listAccountRolesRequest);

    /**
     * <p>
     * Lists all roles that are assigned to the user for a given AWS account.
     * </p>
     * 
     * @param listAccountRolesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountRoles operation returned by the service.
     * @sample AWSSSOAsyncHandler.ListAccountRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccountRoles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountRolesResult> listAccountRolesAsync(ListAccountRolesRequest listAccountRolesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountRolesRequest, ListAccountRolesResult> asyncHandler);

    /**
     * <p>
     * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/useraccess.html#assignusers">Assign User
     * Access</a> in the <i>AWS SSO User Guide</i>. This operation returns a paginated response.
     * </p>
     * 
     * @param listAccountsRequest
     * @return A Java Future containing the result of the ListAccounts operation returned by the service.
     * @sample AWSSSOAsync.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest listAccountsRequest);

    /**
     * <p>
     * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/useraccess.html#assignusers">Assign User
     * Access</a> in the <i>AWS SSO User Guide</i>. This operation returns a paginated response.
     * </p>
     * 
     * @param listAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccounts operation returned by the service.
     * @sample AWSSSOAsyncHandler.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest listAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler);

    /**
     * <p>
     * Removes the client- and server-side session that is associated with the user.
     * </p>
     * 
     * @param logoutRequest
     * @return A Java Future containing the result of the Logout operation returned by the service.
     * @sample AWSSSOAsync.Logout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/Logout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LogoutResult> logoutAsync(LogoutRequest logoutRequest);

    /**
     * <p>
     * Removes the client- and server-side session that is associated with the user.
     * </p>
     * 
     * @param logoutRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Logout operation returned by the service.
     * @sample AWSSSOAsyncHandler.Logout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/Logout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LogoutResult> logoutAsync(LogoutRequest logoutRequest,
            com.amazonaws.handlers.AsyncHandler<LogoutRequest, LogoutResult> asyncHandler);

}
