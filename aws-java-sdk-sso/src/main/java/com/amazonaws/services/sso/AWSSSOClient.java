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

import com.amazonaws.services.sso.AWSSSOClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sso.model.*;
import com.amazonaws.services.sso.model.transform.*;

/**
 * Client for accessing SSO. All service calls made using this client are blocking, and will not return until the
 * service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSOClient extends AmazonWebServiceClient implements AWSSSO {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSSO.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "awsssoportal";

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
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sso.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sso.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sso.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sso.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.sso.model.AWSSSOException.class));

    public static AWSSSOClientBuilder builder() {
        return AWSSSOClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SSO using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSOClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SSO using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSOClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("portal.sso.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sso/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sso/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public GetRoleCredentialsResult getRoleCredentials(GetRoleCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoleCredentials(request);
    }

    @SdkInternalApi
    final GetRoleCredentialsResult executeGetRoleCredentials(GetRoleCredentialsRequest getRoleCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoleCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoleCredentialsRequest> request = null;
        Response<GetRoleCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoleCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoleCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoleCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRoleCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRoleCredentialsResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListAccountRolesResult listAccountRoles(ListAccountRolesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountRoles(request);
    }

    @SdkInternalApi
    final ListAccountRolesResult executeListAccountRoles(ListAccountRolesRequest listAccountRolesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountRolesRequest> request = null;
        Response<ListAccountRolesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountRolesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountRoles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountRolesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccountRolesResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/useraccess.html#assignusers">Assign User
     * Access</a> in the <i>AWS SSO User Guide</i>. This operation returns a paginated response.
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
    @Override
    public ListAccountsResult listAccounts(ListAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccounts(request);
    }

    @SdkInternalApi
    final ListAccountsResult executeListAccounts(ListAccountsRequest listAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsRequest> request = null;
        Response<ListAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccountsResultJsonUnmarshaller());
            response = anonymousInvoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the client- and server-side session that is associated with the user.
     * </p>
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
    @Override
    public LogoutResult logout(LogoutRequest request) {
        request = beforeClientExecution(request);
        return executeLogout(request);
    }

    @SdkInternalApi
    final LogoutResult executeLogout(LogoutRequest logoutRequest) {

        ExecutionContext executionContext = createExecutionContext(logoutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LogoutRequest> request = null;
        Response<LogoutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LogoutRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(logoutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSO");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Logout");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LogoutResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new LogoutResultJsonUnmarshaller());
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
