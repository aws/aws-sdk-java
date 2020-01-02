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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ssooidc.model.*;

/**
 * Interface for accessing SSO OIDC.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssooidc.AbstractAWSSSOOIDC} instead.
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
public interface AWSSSOOIDC {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "oidc";

    /**
     * <p>
     * Creates and returns an access token for the authorized client. The access token issued will be used to fetch
     * short-term credentials for the assigned roles in the AWS account.
     * </p>
     * 
     * @param createTokenRequest
     * @return Result of the CreateToken operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws InvalidClientException
     *         Indicates that the <code>clientId</code> or <code>clientSecret</code> in the request is invalid. For
     *         example, this can occur when a client sends an incorrect <code>clientId</code> or an expired
     *         <code>clientSecret</code>.
     * @throws InvalidGrantException
     *         Indicates that a request contains an invalid grant. This can occur if a client makes a <a>CreateToken</a>
     *         request with an invalid grant type.
     * @throws UnauthorizedClientException
     *         Indicates that the client is not currently authorized to make the request. This can happen when a
     *         <code>clientId</code> is not issued for a public client.
     * @throws UnsupportedGrantTypeException
     *         Indicates that the grant type in the request is not supported by the service.
     * @throws InvalidScopeException
     *         Indicates that the scope provided in the request is invalid.
     * @throws AuthorizationPendingException
     *         Indicates that a request to authorize a client with an access user session token is pending.
     * @throws SlowDownException
     *         Indicates that the client is making the request too frequently and is more than the service can handle.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ExpiredTokenException
     *         Indicates that the token issued by the service is expired and is no longer valid.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @sample AWSSSOOIDC.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTokenResult createToken(CreateTokenRequest createTokenRequest);

    /**
     * <p>
     * Registers a client with AWS SSO. This allows clients to initiate device authorization. The output should be
     * persisted for reuse through many authentication requests.
     * </p>
     * 
     * @param registerClientRequest
     * @return Result of the RegisterClient operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws InvalidScopeException
     *         Indicates that the scope provided in the request is invalid.
     * @throws InvalidClientMetadataException
     *         Indicates that the client information sent in the request during registration is invalid.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @sample AWSSSOOIDC.RegisterClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/RegisterClient" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterClientResult registerClient(RegisterClientRequest registerClientRequest);

    /**
     * <p>
     * Initiates device authorization by requesting a pair of verification codes from the authorization service.
     * </p>
     * 
     * @param startDeviceAuthorizationRequest
     * @return Result of the StartDeviceAuthorization operation returned by the service.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter might
     *         be missing or out of range.
     * @throws InvalidClientException
     *         Indicates that the <code>clientId</code> or <code>clientSecret</code> in the request is invalid. For
     *         example, this can occur when a client sends an incorrect <code>clientId</code> or an expired
     *         <code>clientSecret</code>.
     * @throws UnauthorizedClientException
     *         Indicates that the client is not currently authorized to make the request. This can happen when a
     *         <code>clientId</code> is not issued for a public client.
     * @throws SlowDownException
     *         Indicates that the client is making the request too frequently and is more than the service can handle.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @sample AWSSSOOIDC.StartDeviceAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/StartDeviceAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    StartDeviceAuthorizationResult startDeviceAuthorization(StartDeviceAuthorizationRequest startDeviceAuthorizationRequest);

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
