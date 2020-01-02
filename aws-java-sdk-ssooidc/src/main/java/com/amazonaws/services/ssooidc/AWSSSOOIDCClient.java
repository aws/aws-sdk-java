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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.ssooidc.AWSSSOOIDCClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ssooidc.model.*;
import com.amazonaws.services.ssooidc.model.transform.*;

/**
 * Client for accessing SSO OIDC. All service calls made using this client are blocking, and will not return until the
 * service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSOOIDCClient extends AmazonWebServiceClient implements AWSSSOOIDC {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSSOOIDC.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "awsssooidc";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SlowDownException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.SlowDownExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.ExpiredTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientMetadataException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.InvalidClientMetadataExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.InvalidGrantExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.UnauthorizedClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.InvalidClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AuthorizationPendingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.AuthorizationPendingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidScopeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.InvalidScopeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedGrantTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssooidc.model.transform.UnsupportedGrantTypeExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ssooidc.model.AWSSSOOIDCException.class));

    public static AWSSSOOIDCClientBuilder builder() {
        return AWSSSOOIDCClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SSO OIDC using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSOOIDCClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SSO OIDC using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSOOIDCClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("oidc.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ssooidc/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ssooidc/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public CreateTokenResult createToken(CreateTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateToken(request);
    }

    @SdkInternalApi
    final CreateTokenResult executeCreateToken(CreateTokenRequest createTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTokenRequest> request = null;
        Response<CreateTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO OIDC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTokenResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public RegisterClientResult registerClient(RegisterClientRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterClient(request);
    }

    @SdkInternalApi
    final RegisterClientResult executeRegisterClient(RegisterClientRequest registerClientRequest) {

        ExecutionContext executionContext = createExecutionContext(registerClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterClientRequest> request = null;
        Response<RegisterClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterClientRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO OIDC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterClient");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterClientResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterClientResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartDeviceAuthorizationResult startDeviceAuthorization(StartDeviceAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeStartDeviceAuthorization(request);
    }

    @SdkInternalApi
    final StartDeviceAuthorizationResult executeStartDeviceAuthorization(StartDeviceAuthorizationRequest startDeviceAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(startDeviceAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeviceAuthorizationRequest> request = null;
        Response<StartDeviceAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeviceAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startDeviceAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO OIDC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDeviceAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDeviceAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDeviceAuthorizationResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
