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
package com.amazonaws.services.finspacedata;

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

import com.amazonaws.services.finspacedata.AWSFinSpaceDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.services.finspacedata.model.transform.*;

/**
 * Client for accessing FinSpace Data. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace environment.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSFinSpaceDataClient extends AmazonWebServiceClient implements AWSFinSpaceData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSFinSpaceData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "finspace-api";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/x-amz-json-1.1")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.finspacedata.model.AWSFinSpaceDataException.class));

    public static AWSFinSpaceDataClientBuilder builder() {
        return AWSFinSpaceDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on FinSpace Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSFinSpaceDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on FinSpace Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSFinSpaceDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("finspace-api.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/finspacedata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/finspacedata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new changeset in a FinSpace dataset.
     * </p>
     * 
     * @param createChangesetRequest
     * @return Result of the CreateChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateChangesetResult createChangeset(CreateChangesetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChangeset(request);
    }

    @SdkInternalApi
    final CreateChangesetResult executeCreateChangeset(CreateChangesetRequest createChangesetRequest) {

        ExecutionContext executionContext = createExecutionContext(createChangesetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChangesetRequest> request = null;
        Response<CreateChangesetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChangesetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChangesetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChangeset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChangesetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChangesetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request programmatic credentials to use with Habanero SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     * @return Result of the GetProgrammaticAccessCredentials operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProgrammaticAccessCredentialsResult getProgrammaticAccessCredentials(GetProgrammaticAccessCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeGetProgrammaticAccessCredentials(request);
    }

    @SdkInternalApi
    final GetProgrammaticAccessCredentialsResult executeGetProgrammaticAccessCredentials(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(getProgrammaticAccessCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProgrammaticAccessCredentialsRequest> request = null;
        Response<GetProgrammaticAccessCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProgrammaticAccessCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getProgrammaticAccessCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProgrammaticAccessCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProgrammaticAccessCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetProgrammaticAccessCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A temporary Amazon S3 location to copy your files from a source location to stage or use as a scratch space in
     * Habanero notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return Result of the GetWorkingLocation operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSFinSpaceData.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetWorkingLocationResult getWorkingLocation(GetWorkingLocationRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkingLocation(request);
    }

    @SdkInternalApi
    final GetWorkingLocationResult executeGetWorkingLocation(GetWorkingLocationRequest getWorkingLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkingLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkingLocationRequest> request = null;
        Response<GetWorkingLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkingLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkingLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkingLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkingLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkingLocationResultJsonUnmarshaller());
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
