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
 * AWS Single Sign-On (SSO) OpenID Connect (OIDC) is a web service that enables a client (such as AWS CLI or a native
 * application) to register with AWS SSO. The service also enables the client to fetch the user’s access token upon
 * successful authentication and authorization with AWS SSO. This service conforms with the OAuth 2.0 based
 * implementation of the device authorization grant standard (<a
 * href="https://tools.ietf.org/html/rfc8628">https://tools.ietf.org/html/rfc8628</a>).
 * </p>
 * <p>
 * For general information about AWS SSO, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">What is AWS Single Sign-On?</a> in the
 * <i>AWS SSO User Guide</i>.
 * </p>
 * <p>
 * This API reference guide describes the AWS SSO OIDC operations that you can call programatically and includes
 * detailed information on data types and errors.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms such as
 * Java, Ruby, .Net, iOS, and Android. The SDKs provide a convenient way to create programmatic access to AWS SSO and
 * other AWS services. For more information about the AWS SDKs, including how to download and install them, see <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
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
     * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be
     * persisted for reuse through many authentication requests.
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
     * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be
     * persisted for reuse through many authentication requests.
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
