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
package com.amazonaws.services.account;

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

import com.amazonaws.services.account.AWSAccountClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.account.model.*;
import com.amazonaws.services.account.model.transform.*;

/**
 * Client for accessing AWS Account. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Operations for Amazon Web Services Account Management
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAccountClient extends AmazonWebServiceClient implements AWSAccount {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAccount.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "account";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.account.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.account.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.account.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.account.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.account.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.account.model.AWSAccountException.class));

    public static AWSAccountClientBuilder builder() {
        return AWSAccountClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Account using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAccountClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Account using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAccountClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("account.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/account/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/account/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified alternate contact from an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param deleteAlternateContactRequest
     * @return Result of the DeleteAlternateContact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation failed because it specified a resource that can't be found.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.DeleteAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/DeleteAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAlternateContactResult deleteAlternateContact(DeleteAlternateContactRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlternateContact(request);
    }

    @SdkInternalApi
    final DeleteAlternateContactResult executeDeleteAlternateContact(DeleteAlternateContactRequest deleteAlternateContactRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAlternateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlternateContactRequest> request = null;
        Response<DeleteAlternateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlternateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAlternateContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Account");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlternateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAlternateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAlternateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified alternate contact attached to an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param getAlternateContactRequest
     * @return Result of the GetAlternateContact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation failed because it specified a resource that can't be found.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.GetAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAlternateContactResult getAlternateContact(GetAlternateContactRequest request) {
        request = beforeClientExecution(request);
        return executeGetAlternateContact(request);
    }

    @SdkInternalApi
    final GetAlternateContactResult executeGetAlternateContact(GetAlternateContactRequest getAlternateContactRequest) {

        ExecutionContext executionContext = createExecutionContext(getAlternateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAlternateContactRequest> request = null;
        Response<GetAlternateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAlternateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAlternateContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Account");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAlternateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAlternateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAlternateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the primary contact information of an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the primary contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Update the primary
     * and alternate contact information</a>.
     * </p>
     * 
     * @param getContactInformationRequest
     * @return Result of the GetContactInformation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation failed because it specified a resource that can't be found.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.GetContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactInformationResult getContactInformation(GetContactInformationRequest request) {
        request = beforeClientExecution(request);
        return executeGetContactInformation(request);
    }

    @SdkInternalApi
    final GetContactInformationResult executeGetContactInformation(GetContactInformationRequest getContactInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactInformationRequest> request = null;
        Response<GetContactInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactInformationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Account");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContactInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactInformationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetContactInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified alternate contact attached to an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param putAlternateContactRequest
     * @return Result of the PutAlternateContact operation returned by the service.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.PutAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAlternateContactResult putAlternateContact(PutAlternateContactRequest request) {
        request = beforeClientExecution(request);
        return executePutAlternateContact(request);
    }

    @SdkInternalApi
    final PutAlternateContactResult executePutAlternateContact(PutAlternateContactRequest putAlternateContactRequest) {

        ExecutionContext executionContext = createExecutionContext(putAlternateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAlternateContactRequest> request = null;
        Response<PutAlternateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAlternateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAlternateContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Account");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAlternateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAlternateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAlternateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the primary contact information of an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the primary contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Update the primary
     * and alternate contact information</a>.
     * </p>
     * 
     * @param putContactInformationRequest
     * @return Result of the PutContactInformation operation returned by the service.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.PutContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutContactInformationResult putContactInformation(PutContactInformationRequest request) {
        request = beforeClientExecution(request);
        return executePutContactInformation(request);
    }

    @SdkInternalApi
    final PutContactInformationResult executePutContactInformation(PutContactInformationRequest putContactInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(putContactInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutContactInformationRequest> request = null;
        Response<PutContactInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutContactInformationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putContactInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Account");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutContactInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutContactInformationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutContactInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

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

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
