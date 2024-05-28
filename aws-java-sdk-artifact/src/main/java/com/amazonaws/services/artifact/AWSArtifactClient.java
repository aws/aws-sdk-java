/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.artifact;

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

import com.amazonaws.services.artifact.AWSArtifactClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.artifact.model.*;

import com.amazonaws.services.artifact.model.transform.*;

/**
 * Client for accessing AWS Artifact. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * This reference provides descriptions of the low-level AWS Artifact Service API.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSArtifactClient extends AmazonWebServiceClient implements AWSArtifact {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSArtifact.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "artifact";

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
                                    com.amazonaws.services.artifact.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.artifact.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.artifact.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.artifact.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.artifact.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.artifact.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.artifact.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.artifact.model.AWSArtifactException.class));

    public static AWSArtifactClientBuilder builder() {
        return AWSArtifactClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Artifact using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSArtifactClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Artifact using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSArtifactClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("artifact.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/artifact/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/artifact/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Get the account settings for Artifact.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Artifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the content for a single report.
     * </p>
     * 
     * @param getReportRequest
     * @return Result of the GetReport operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReportResult getReport(GetReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetReport(request);
    }

    @SdkInternalApi
    final GetReportResult executeGetReport(GetReportRequest getReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReportRequest> request = null;
        Response<GetReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Artifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReportResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the metadata for a single report.
     * </p>
     * 
     * @param getReportMetadataRequest
     * @return Result of the GetReportMetadata operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetReportMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReportMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReportMetadataResult getReportMetadata(GetReportMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetReportMetadata(request);
    }

    @SdkInternalApi
    final GetReportMetadataResult executeGetReportMetadata(GetReportMetadataRequest getReportMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getReportMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReportMetadataRequest> request = null;
        Response<GetReportMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReportMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReportMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Artifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReportMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReportMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReportMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the Term content associated with a single report.
     * </p>
     * 
     * @param getTermForReportRequest
     * @return Result of the GetTermForReport operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetTermForReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetTermForReport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTermForReportResult getTermForReport(GetTermForReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetTermForReport(request);
    }

    @SdkInternalApi
    final GetTermForReportResult executeGetTermForReport(GetTermForReportRequest getTermForReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getTermForReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTermForReportRequest> request = null;
        Response<GetTermForReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTermForReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTermForReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Artifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTermForReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTermForReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTermForReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List available reports.
     * </p>
     * 
     * @param listReportsRequest
     * @return Result of the ListReports operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.ListReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/ListReports" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReportsResult listReports(ListReportsRequest request) {
        request = beforeClientExecution(request);
        return executeListReports(request);
    }

    @SdkInternalApi
    final ListReportsResult executeListReports(ListReportsRequest listReportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportsRequest> request = null;
        Response<ListReportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Artifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Put the account settings for Artifact.
     * </p>
     * 
     * @param putAccountSettingsRequest
     * @return Result of the PutAccountSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.PutAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/PutAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAccountSettingsResult putAccountSettings(PutAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountSettings(request);
    }

    @SdkInternalApi
    final PutAccountSettingsResult executePutAccountSettings(PutAccountSettingsRequest putAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSettingsRequest> request = null;
        Response<PutAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Artifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAccountSettingsResultJsonUnmarshaller());
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
