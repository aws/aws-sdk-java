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
package com.amazonaws.services.ssooidc;

import javax.annotation.Generated;

import com.amazonaws.services.ssooidc.model.*;

/**
 * Interface for accessing SSO OIDC asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssooidc.AbstractAWSSSOOIDCAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IAM Identity Center (successor to AWS Single Sign-On) OpenID Connect (OIDC) is a web service that enables a
 * client (such as AWS CLI or a native application) to register with IAM Identity Center. The service also enables the
 * client to fetch the user’s access token upon successful authentication and authorization with IAM Identity Center.
 * </p>
 * <note>
 * <p>
 * Although AWS Single Sign-On was renamed, the <code>sso</code> and <code>identitystore</code> API namespaces will
 * continue to retain their original name for backward compatibility purposes. For more information, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed">IAM Identity Center rename</a>.
 * </p>
 * </note>
 * <p>
 * <b>Considerations for Using This Guide</b>
 * </p>
 * <p>
 * Before you begin using this guide, we recommend that you first review the following important information about how
 * the IAM Identity Center OIDC service works.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The IAM Identity Center OIDC service currently implements only the portions of the OAuth 2.0 Device Authorization
 * Grant standard (<a href="https://tools.ietf.org/html/rfc8628">https://tools.ietf.org/html/rfc8628</a>) that are
 * necessary to enable single sign-on authentication with the AWS CLI. Support for other OIDC flows frequently needed
 * for native applications, such as Authorization Code Flow (+ PKCE), will be addressed in future releases.
 * </p>
 * </li>
 * <li>
 * <p>
 * The service emits only OIDC access tokens, such that obtaining a new token (For example, token refresh) requires
 * explicit user re-authentication.
 * </p>
 * </li>
 * <li>
 * <p>
 * The access tokens provided by this service grant access to all AWS account entitlements assigned to an IAM Identity
 * Center user, not just a particular application.
 * </p>
 * </li>
 * <li>
 * <p>
 * The documentation in this guide does not describe the mechanism to convert the access token into AWS Auth (“sigv4”)
 * credentials for use with IAM-protected AWS service endpoints. For more information, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/PortalAPIReference/API_GetRoleCredentials.html"
 * >GetRoleCredentials</a> in the <i>IAM Identity Center Portal API Reference Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For general information about IAM Identity Center, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">What is IAM Identity Center?</a> in the
 * <i>IAM Identity Center User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSOOIDCAsync extends AWSSSOOIDC {

    /**
     * <p>
     * Creates and returns an access token for the authorized client. The access token issued will be used to fetch
     * short-term credentials for the assigned roles in the AWS account.
     * </p>
     * 
     * @param createTokenRequest
     * @return A Java Future containing the result of the CreateToken operation returned by the service.
     * @sample AWSSSOOIDCAsync.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest createTokenRequest);

    /**
     * <p>
     * Creates and returns an access token for the authorized client. The access token issued will be used to fetch
     * short-term credentials for the assigned roles in the AWS account.
     * </p>
     * 
     * @param createTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateToken operation returned by the service.
     * @sample AWSSSOOIDCAsyncHandler.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest createTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler);

    /**
     * <p>
     * Registers a client with IAM Identity Center. This allows clients to initiate device authorization. The output
     * should be persisted for reuse through many authentication requests.
     * </p>
     * 
     * @param registerClientRequest
     * @return A Java Future containing the result of the RegisterClient operation returned by the service.
     * @sample AWSSSOOIDCAsync.RegisterClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/RegisterClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterClientResult> registerClientAsync(RegisterClientRequest registerClientRequest);

    /**
     * <p>
     * Registers a client with IAM Identity Center. This allows clients to initiate device authorization. The output
     * should be persisted for reuse through many authentication requests.
     * </p>
     * 
     * @param registerClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterClient operation returned by the service.
     * @sample AWSSSOOIDCAsyncHandler.RegisterClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/RegisterClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterClientResult> registerClientAsync(RegisterClientRequest registerClientRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterClientRequest, RegisterClientResult> asyncHandler);

    /**
     * <p>
     * Initiates device authorization by requesting a pair of verification codes from the authorization service.
     * </p>
     * 
     * @param startDeviceAuthorizationRequest
     * @return A Java Future containing the result of the StartDeviceAuthorization operation returned by the service.
     * @sample AWSSSOOIDCAsync.StartDeviceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/StartDeviceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDeviceAuthorizationResult> startDeviceAuthorizationAsync(StartDeviceAuthorizationRequest startDeviceAuthorizationRequest);

    /**
     * <p>
     * Initiates device authorization by requesting a pair of verification codes from the authorization service.
     * </p>
     * 
     * @param startDeviceAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDeviceAuthorization operation returned by the service.
     * @sample AWSSSOOIDCAsyncHandler.StartDeviceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/StartDeviceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDeviceAuthorizationResult> startDeviceAuthorizationAsync(StartDeviceAuthorizationRequest startDeviceAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResult> asyncHandler);

}
