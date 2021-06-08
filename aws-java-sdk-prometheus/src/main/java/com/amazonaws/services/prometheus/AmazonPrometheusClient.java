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
package com.amazonaws.services.prometheus;

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

import com.amazonaws.services.prometheus.AmazonPrometheusClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.prometheus.model.*;
import com.amazonaws.services.prometheus.model.transform.*;

/**
 * Client for accessing Amazon Prometheus Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Managed Service for Prometheus
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPrometheusClient extends AmazonWebServiceClient implements AmazonPrometheus {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPrometheus.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "aps";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.prometheus.model.AmazonPrometheusException.class));

    public static AmazonPrometheusClientBuilder builder() {
        return AmazonPrometheusClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Prometheus Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPrometheusClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Prometheus Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPrometheusClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("aps.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/prometheus/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/prometheus/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new AMP workspace.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a CreateWorkspace operation.
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspace(request);
    }

    @SdkInternalApi
    final CreateWorkspaceResult executeCreateWorkspace(CreateWorkspaceRequest createWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceRequest> request = null;
        Response<CreateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AMP workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a DeleteWorkspace operation.
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspace(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceResult executeDeleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceRequest> request = null;
        Response<DeleteWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing AMP workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a DescribeWorkspace operation.
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspace(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceResult executeDescribeWorkspace(DescribeWorkspaceRequest describeWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceRequest> request = null;
        Response<DescribeWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all AMP workspaces, including workspaces being created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a ListWorkspaces operation.
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkspacesResult listWorkspaces(ListWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkspaces(request);
    }

    @SdkInternalApi
    final ListWorkspacesResult executeListWorkspaces(ListWorkspacesRequest listWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkspacesRequest> request = null;
        Response<ListWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an AMP workspace alias.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an UpdateWorkspaceAlias operation.
     * @return Result of the UpdateWorkspaceAlias operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.UpdateWorkspaceAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkspaceAliasResult updateWorkspaceAlias(UpdateWorkspaceAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspaceAlias(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceAliasResult executeUpdateWorkspaceAlias(UpdateWorkspaceAliasRequest updateWorkspaceAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceAliasRequest> request = null;
        Response<UpdateWorkspaceAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkspaceAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspaceAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkspaceAliasResultJsonUnmarshaller());
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
