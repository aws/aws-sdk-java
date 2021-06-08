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
package com.amazonaws.services.applicationcostprofiler;

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

import com.amazonaws.services.applicationcostprofiler.AWSApplicationCostProfilerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.applicationcostprofiler.model.*;
import com.amazonaws.services.applicationcostprofiler.model.transform.*;

/**
 * Client for accessing AWS Application Cost Profiler. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * This reference provides descriptions of the AWS Application Cost Profiler API.
 * </p>
 * <p>
 * The AWS Application Cost Profiler API provides programmatic access to view, create, update, and delete application
 * cost report definitions, as well as to import your usage data into the Application Cost Profiler service.
 * </p>
 * <p>
 * For more information about using this service, see the <a
 * href="https://docs.aws.amazon.com/application-cost-profiler/latest/userguide/introduction.html">AWS Application Cost
 * Profiler User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSApplicationCostProfilerClient extends AmazonWebServiceClient implements AWSApplicationCostProfiler {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSApplicationCostProfiler.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "application-cost-profiler";

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
                                    com.amazonaws.services.applicationcostprofiler.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationcostprofiler.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationcostprofiler.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationcostprofiler.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationcostprofiler.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.applicationcostprofiler.model.AWSApplicationCostProfilerException.class));

    public static AWSApplicationCostProfilerClientBuilder builder() {
        return AWSApplicationCostProfilerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Cost Profiler using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationCostProfilerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Cost Profiler using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationCostProfilerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("application-cost-profiler.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/applicationcostprofiler/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/applicationcostprofiler/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified report definition in AWS Application Cost Profiler. This stops the report from being
     * generated.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     * @return Result of the DeleteReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.DeleteReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/DeleteReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteReportDefinitionResult deleteReportDefinition(DeleteReportDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReportDefinition(request);
    }

    @SdkInternalApi
    final DeleteReportDefinitionResult executeDeleteReportDefinition(DeleteReportDefinitionRequest deleteReportDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReportDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReportDefinitionRequest> request = null;
        Response<DeleteReportDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReportDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReportDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApplicationCostProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReportDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReportDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteReportDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the definition of a report already configured in AWS Application Cost Profiler.
     * </p>
     * 
     * @param getReportDefinitionRequest
     * @return Result of the GetReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.GetReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/GetReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReportDefinitionResult getReportDefinition(GetReportDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetReportDefinition(request);
    }

    @SdkInternalApi
    final GetReportDefinitionResult executeGetReportDefinition(GetReportDefinitionRequest getReportDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getReportDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReportDefinitionRequest> request = null;
        Response<GetReportDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReportDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReportDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApplicationCostProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReportDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReportDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReportDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ingests application usage data from Amazon Simple Storage Service (Amazon S3).
     * </p>
     * <p>
     * The data must already exist in the S3 location. As part of the action, AWS Application Cost Profiler copies the
     * object from your S3 bucket to an S3 bucket owned by Amazon for processing asynchronously.
     * </p>
     * 
     * @param importApplicationUsageRequest
     * @return Result of the ImportApplicationUsage operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.ImportApplicationUsage
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ImportApplicationUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportApplicationUsageResult importApplicationUsage(ImportApplicationUsageRequest request) {
        request = beforeClientExecution(request);
        return executeImportApplicationUsage(request);
    }

    @SdkInternalApi
    final ImportApplicationUsageResult executeImportApplicationUsage(ImportApplicationUsageRequest importApplicationUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(importApplicationUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportApplicationUsageRequest> request = null;
        Response<ImportApplicationUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportApplicationUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importApplicationUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApplicationCostProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportApplicationUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportApplicationUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportApplicationUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all reports and their configurations for your AWS account.
     * </p>
     * <p>
     * The maximum number of reports is one.
     * </p>
     * 
     * @param listReportDefinitionsRequest
     * @return Result of the ListReportDefinitions operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.ListReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ListReportDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReportDefinitionsResult listReportDefinitions(ListReportDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListReportDefinitions(request);
    }

    @SdkInternalApi
    final ListReportDefinitionsResult executeListReportDefinitions(ListReportDefinitionsRequest listReportDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReportDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportDefinitionsRequest> request = null;
        Response<ListReportDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReportDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApplicationCostProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReportDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReportDefinitionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListReportDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the report definition for a report in Application Cost Profiler.
     * </p>
     * 
     * @param putReportDefinitionRequest
     * @return Result of the PutReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ServiceQuotaExceededException
     *         Your request exceeds one or more of the service quotas.
     * @sample AWSApplicationCostProfiler.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/PutReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutReportDefinitionResult putReportDefinition(PutReportDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executePutReportDefinition(request);
    }

    @SdkInternalApi
    final PutReportDefinitionResult executePutReportDefinition(PutReportDefinitionRequest putReportDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(putReportDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutReportDefinitionRequest> request = null;
        Response<PutReportDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutReportDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putReportDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApplicationCostProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutReportDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutReportDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutReportDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates existing report in AWS Application Cost Profiler.
     * </p>
     * 
     * @param updateReportDefinitionRequest
     * @return Result of the UpdateReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.UpdateReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/UpdateReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReportDefinitionResult updateReportDefinition(UpdateReportDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReportDefinition(request);
    }

    @SdkInternalApi
    final UpdateReportDefinitionResult executeUpdateReportDefinition(UpdateReportDefinitionRequest updateReportDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReportDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReportDefinitionRequest> request = null;
        Response<UpdateReportDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReportDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReportDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ApplicationCostProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReportDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReportDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateReportDefinitionResultJsonUnmarshaller());
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
