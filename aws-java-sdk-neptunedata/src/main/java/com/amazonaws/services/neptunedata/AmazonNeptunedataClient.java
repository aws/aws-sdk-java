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
package com.amazonaws.services.neptunedata;

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

import com.amazonaws.services.neptunedata.AmazonNeptunedataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.services.neptunedata.model.transform.*;

/**
 * Client for accessing Amazon NeptuneData. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * <fullname>Neptune Data API</fullname>
 * <p>
 * The Amazon Neptune data API provides SDK support for more than 40 of Neptune's data operations, including data
 * loading, query execution, data inquiry, and machine learning. It supports the Gremlin and openCypher query languages,
 * and is available in all SDK languages. It automatically signs API requests and greatly simplifies integrating Neptune
 * into your applications.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNeptunedataClient extends AmazonWebServiceClient implements AmazonNeptunedata {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonNeptunedata.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "neptune-db";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StreamRecordsNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.StreamRecordsNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BulkLoadIdNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.BulkLoadIdNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNumericDataException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.InvalidNumericDataExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IllegalArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.IllegalArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LoadUrlAccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.LoadUrlAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MLResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.MLResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.MissingParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CancelledByUserException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.CancelledByUserExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueryLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.QueryLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MemoryLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.MemoryLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParsingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ParsingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueryTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.QueryTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MethodNotAllowedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.MethodNotAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("S3Exception").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.S3ExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReadOnlyViolationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ReadOnlyViolationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StatisticsNotAvailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.StatisticsNotAvailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.InvalidArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConstraintViolationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ConstraintViolationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedQueryException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.MalformedQueryExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ClientTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionsFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.PreconditionsFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredStreamException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ExpiredStreamExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueryLimitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.QueryLimitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerShutdownException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.ServerShutdownExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FailureByQueryException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.FailureByQueryExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TimeLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.neptunedata.model.transform.TimeLimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.neptunedata.model.AmazonNeptunedataException.class));

    public static AmazonNeptunedataClientBuilder builder() {
        return AmazonNeptunedataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon NeptuneData using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonNeptunedataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon NeptuneData using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonNeptunedataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("neptune-db.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/neptunedata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/neptunedata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a Gremlin query. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status-cancel.html">Gremlin query
     * cancellation</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelquery"
     * >neptune-db:CancelQuery</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelGremlinQueryRequest
     * @return Result of the CancelGremlinQuery operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.CancelGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelGremlinQuery" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelGremlinQueryResult cancelGremlinQuery(CancelGremlinQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCancelGremlinQuery(request);
    }

    @SdkInternalApi
    final CancelGremlinQueryResult executeCancelGremlinQuery(CancelGremlinQueryRequest cancelGremlinQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelGremlinQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelGremlinQueryRequest> request = null;
        Response<CancelGremlinQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelGremlinQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelGremlinQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelGremlinQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelGremlinQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelGremlinQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a specified load job. This is an HTTP <code>DELETE</code> request. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/load-api-reference-status.htm">Neptune Loader
     * Get-Status API</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelloaderjob"
     * >neptune-db:CancelLoaderJob</a> IAM action in that cluster..
     * </p>
     * 
     * @param cancelLoaderJobRequest
     * @return Result of the CancelLoaderJob operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws BulkLoadIdNotFoundException
     *         Raised when a specified bulk-load job ID cannot be found.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws LoadUrlAccessDeniedException
     *         Raised when access is denied to a specified load URL.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.CancelLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelLoaderJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelLoaderJobResult cancelLoaderJob(CancelLoaderJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelLoaderJob(request);
    }

    @SdkInternalApi
    final CancelLoaderJobResult executeCancelLoaderJob(CancelLoaderJobRequest cancelLoaderJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelLoaderJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelLoaderJobRequest> request = null;
        Response<CancelLoaderJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelLoaderJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelLoaderJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelLoaderJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelLoaderJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelLoaderJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a Neptune ML data processing job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmldataprocessingjob"
     * >neptune-db:CancelMLDataProcessingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLDataProcessingJobRequest
     * @return Result of the CancelMLDataProcessingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CancelMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMLDataProcessingJobResult cancelMLDataProcessingJob(CancelMLDataProcessingJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMLDataProcessingJob(request);
    }

    @SdkInternalApi
    final CancelMLDataProcessingJobResult executeCancelMLDataProcessingJob(CancelMLDataProcessingJobRequest cancelMLDataProcessingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMLDataProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMLDataProcessingJobRequest> request = null;
        Response<CancelMLDataProcessingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMLDataProcessingJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelMLDataProcessingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMLDataProcessingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMLDataProcessingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMLDataProcessingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmlmodeltrainingjob"
     * >neptune-db:CancelMLModelTrainingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLModelTrainingJobRequest
     * @return Result of the CancelMLModelTrainingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CancelMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMLModelTrainingJobResult cancelMLModelTrainingJob(CancelMLModelTrainingJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMLModelTrainingJob(request);
    }

    @SdkInternalApi
    final CancelMLModelTrainingJobResult executeCancelMLModelTrainingJob(CancelMLModelTrainingJobRequest cancelMLModelTrainingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMLModelTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMLModelTrainingJobRequest> request = null;
        Response<CancelMLModelTrainingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMLModelTrainingJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelMLModelTrainingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMLModelTrainingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMLModelTrainingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMLModelTrainingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a specified model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelmlmodeltransformjob"
     * >neptune-db:CancelMLModelTransformJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelMLModelTransformJobRequest
     * @return Result of the CancelMLModelTransformJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CancelMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMLModelTransformJobResult cancelMLModelTransformJob(CancelMLModelTransformJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMLModelTransformJob(request);
    }

    @SdkInternalApi
    final CancelMLModelTransformJobResult executeCancelMLModelTransformJob(CancelMLModelTransformJobRequest cancelMLModelTransformJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMLModelTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMLModelTransformJobRequest> request = null;
        Response<CancelMLModelTransformJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMLModelTransformJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelMLModelTransformJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMLModelTransformJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMLModelTransformJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMLModelTransformJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a specified openCypher query. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-status.html">Neptune
     * openCypher status endpoint</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#cancelquery"
     * >neptune-db:CancelQuery</a> IAM action in that cluster.
     * </p>
     * 
     * @param cancelOpenCypherQueryRequest
     * @return Result of the CancelOpenCypherQuery operation returned by the service.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.CancelOpenCypherQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelOpenCypherQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelOpenCypherQueryResult cancelOpenCypherQuery(CancelOpenCypherQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCancelOpenCypherQuery(request);
    }

    @SdkInternalApi
    final CancelOpenCypherQueryResult executeCancelOpenCypherQuery(CancelOpenCypherQueryRequest cancelOpenCypherQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelOpenCypherQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelOpenCypherQueryRequest> request = null;
        Response<CancelOpenCypherQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelOpenCypherQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelOpenCypherQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelOpenCypherQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelOpenCypherQueryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CancelOpenCypherQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Neptune ML inference endpoint that lets you query one specific model that the model-training
     * process constructed. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#createmlendpoint"
     * >neptune-db:CreateMLEndpoint</a> IAM action in that cluster.
     * </p>
     * 
     * @param createMLEndpointRequest
     * @return Result of the CreateMLEndpoint operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.CreateMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CreateMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateMLEndpointResult createMLEndpoint(CreateMLEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMLEndpoint(request);
    }

    @SdkInternalApi
    final CreateMLEndpointResult executeCreateMLEndpoint(CreateMLEndpointRequest createMLEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createMLEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMLEndpointRequest> request = null;
        Response<CreateMLEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMLEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMLEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMLEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMLEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMLEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the creation of a Neptune ML inference endpoint. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletemlendpoint"
     * >neptune-db:DeleteMLEndpoint</a> IAM action in that cluster.
     * </p>
     * 
     * @param deleteMLEndpointRequest
     * @return Result of the DeleteMLEndpoint operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.DeleteMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteMLEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteMLEndpointResult deleteMLEndpoint(DeleteMLEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMLEndpoint(request);
    }

    @SdkInternalApi
    final DeleteMLEndpointResult executeDeleteMLEndpoint(DeleteMLEndpointRequest deleteMLEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMLEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMLEndpointRequest> request = null;
        Response<DeleteMLEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMLEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMLEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMLEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMLEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMLEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes statistics for Gremlin and openCypher (property graph) data.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletestatistics"
     * >neptune-db:DeleteStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param deletePropertygraphStatisticsRequest
     * @return Result of the DeletePropertygraphStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.DeletePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeletePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePropertygraphStatisticsResult deletePropertygraphStatistics(DeletePropertygraphStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePropertygraphStatistics(request);
    }

    @SdkInternalApi
    final DeletePropertygraphStatisticsResult executeDeletePropertygraphStatistics(DeletePropertygraphStatisticsRequest deletePropertygraphStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePropertygraphStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePropertygraphStatisticsRequest> request = null;
        Response<DeletePropertygraphStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePropertygraphStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePropertygraphStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePropertygraphStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePropertygraphStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePropertygraphStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes SPARQL statistics
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletestatistics"
     * >neptune-db:DeleteStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param deleteSparqlStatisticsRequest
     * @return Result of the DeleteSparqlStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.DeleteSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSparqlStatisticsResult deleteSparqlStatistics(DeleteSparqlStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSparqlStatistics(request);
    }

    @SdkInternalApi
    final DeleteSparqlStatisticsResult executeDeleteSparqlStatistics(DeleteSparqlStatisticsRequest deleteSparqlStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSparqlStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSparqlStatisticsRequest> request = null;
        Response<DeleteSparqlStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSparqlStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSparqlStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSparqlStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSparqlStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSparqlStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The fast reset REST API lets you reset a Neptune graph quicky and easily, removing all of its data.
     * </p>
     * <p>
     * Neptune fast reset is a two-step process. First you call <code>ExecuteFastReset</code> with <code>action</code>
     * set to <code>initiateDatabaseReset</code>. This returns a UUID token which you then include when calling
     * <code>ExecuteFastReset</code> again with <code>action</code> set to <code>performDatabaseReset</code>. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/manage-console-fast-reset.html">Empty an Amazon
     * Neptune DB cluster using the fast reset API</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#resetdatabase"
     * >neptune-db:ResetDatabase</a> IAM action in that cluster.
     * </p>
     * 
     * @param executeFastResetRequest
     * @return Result of the ExecuteFastReset operation returned by the service.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws ServerShutdownException
     *         Raised when the server shuts down while processing a request.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MethodNotAllowedException
     *         Raised when the HTTP method used by a request is not supported by the endpoint being used.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteFastReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteFastReset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ExecuteFastResetResult executeFastReset(ExecuteFastResetRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteFastReset(request);
    }

    @SdkInternalApi
    final ExecuteFastResetResult executeExecuteFastReset(ExecuteFastResetRequest executeFastResetRequest) {

        ExecutionContext executionContext = createExecutionContext(executeFastResetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteFastResetRequest> request = null;
        Response<ExecuteFastResetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteFastResetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(executeFastResetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteFastReset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteFastResetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExecuteFastResetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes a Gremlin Explain query.
     * </p>
     * <p>
     * Amazon Neptune has added a Gremlin feature named <code>explain</code> that provides is a self-service tool for
     * understanding the execution approach being taken by the Neptune engine for the query. You invoke it by adding an
     * <code>explain</code> parameter to an HTTP call that submits a Gremlin query.
     * </p>
     * <p>
     * The explain feature provides information about the logical structure of query execution plans. You can use this
     * information to identify potential evaluation and execution bottlenecks and to tune your query, as explained in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-traversal-tuning.html">Tuning Gremlin
     * queries</a>. You can also use query hints to improve query execution plans.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows one of the following IAM actions in that cluster,
     * depending on the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery">neptune-db:
     * ReadDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#writedataviaquery">neptune-db:
     * WriteDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletedataviaquery">neptune-db:
     * DeleteDataViaQuery</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinExplainQueryRequest
     * @return Result of the ExecuteGremlinExplainQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteGremlinExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteGremlinExplainQueryResult executeGremlinExplainQuery(ExecuteGremlinExplainQueryRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteGremlinExplainQuery(request);
    }

    @SdkInternalApi
    final ExecuteGremlinExplainQueryResult executeExecuteGremlinExplainQuery(ExecuteGremlinExplainQueryRequest executeGremlinExplainQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(executeGremlinExplainQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteGremlinExplainQueryRequest> request = null;
        Response<ExecuteGremlinExplainQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteGremlinExplainQueryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(executeGremlinExplainQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteGremlinExplainQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteGremlinExplainQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new ExecuteGremlinExplainQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes a Gremlin Profile query, which runs a specified traversal, collects various metrics about the run, and
     * produces a profile report as output. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin profile API in
     * Neptune</a> for details.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery"
     * >neptune-db:ReadDataViaQuery</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinProfileQueryRequest
     * @return Result of the ExecuteGremlinProfileQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteGremlinProfileQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinProfileQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteGremlinProfileQueryResult executeGremlinProfileQuery(ExecuteGremlinProfileQueryRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteGremlinProfileQuery(request);
    }

    @SdkInternalApi
    final ExecuteGremlinProfileQueryResult executeExecuteGremlinProfileQuery(ExecuteGremlinProfileQueryRequest executeGremlinProfileQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(executeGremlinProfileQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteGremlinProfileQueryRequest> request = null;
        Response<ExecuteGremlinProfileQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteGremlinProfileQueryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(executeGremlinProfileQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteGremlinProfileQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteGremlinProfileQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new ExecuteGremlinProfileQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This commands executes a Gremlin query. Amazon Neptune is compatible with Apache TinkerPop3 and Gremlin, so you
     * can use the Gremlin traversal language to query the graph, as described under <a
     * href="https://tinkerpop.apache.org/docs/current/reference/#graph">The Graph</a> in the Apache TinkerPop3
     * documentation. More details can also be found in <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin.html">Accessing a Neptune graph
     * with Gremlin</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that enables one of the following IAM actions in that cluster,
     * depending on the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery">neptune-db:
     * ReadDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#writedataviaquery">neptune-db:
     * WriteDataViaQuery</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#deletedataviaquery">neptune-db:
     * DeleteDataViaQuery</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeGremlinQueryRequest
     * @return Result of the ExecuteGremlinQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteGremlinQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteGremlinQueryResult executeGremlinQuery(ExecuteGremlinQueryRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteGremlinQuery(request);
    }

    @SdkInternalApi
    final ExecuteGremlinQueryResult executeExecuteGremlinQuery(ExecuteGremlinQueryRequest executeGremlinQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(executeGremlinQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteGremlinQueryRequest> request = null;
        Response<ExecuteGremlinQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteGremlinQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(executeGremlinQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteGremlinQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteGremlinQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExecuteGremlinQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes an openCypher <code>explain</code> request. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-explain.html">The openCypher
     * explain feature</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#readdataviaquery"
     * >neptune-db:ReadDataViaQuery</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param executeOpenCypherExplainQueryRequest
     * @return Result of the ExecuteOpenCypherExplainQuery operation returned by the service.
     * @throws QueryTooLargeException
     *         Raised when the body of a query is too large.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws QueryLimitExceededException
     *         Raised when the number of active queries exceeds what the server can process. The query in question can
     *         be retried when the system is less busy.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws QueryLimitException
     *         Raised when the size of a query exceeds the system limit.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws CancelledByUserException
     *         Raised when a user cancelled a request.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws MalformedQueryException
     *         Raised when a query is submitted that is syntactically incorrect or does not pass additional validation.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ExecuteOpenCypherExplainQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteOpenCypherExplainQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteOpenCypherExplainQueryResult executeOpenCypherExplainQuery(ExecuteOpenCypherExplainQueryRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteOpenCypherExplainQuery(request);
    }

    @SdkInternalApi
    final ExecuteOpenCypherExplainQueryResult executeExecuteOpenCypherExplainQuery(ExecuteOpenCypherExplainQueryRequest executeOpenCypherExplainQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(executeOpenCypherExplainQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteOpenCypherExplainQueryRequest> request = null;
        Response<ExecuteOpenCypherExplainQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteOpenCypherExplainQueryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(executeOpenCypherExplainQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteOpenCypherExplainQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteOpenCypherExplainQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false),
                    new ExecuteOpenCypherExplainQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status of the graph database on the host.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getenginestatus"
     * >neptune-db:GetEngineStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getEngineStatusRequest
     * @return Result of the GetEngineStatus operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetEngineStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetEngineStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEngineStatusResult getEngineStatus(GetEngineStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetEngineStatus(request);
    }

    @SdkInternalApi
    final GetEngineStatusResult executeGetEngineStatus(GetEngineStatusRequest getEngineStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getEngineStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEngineStatusRequest> request = null;
        Response<GetEngineStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEngineStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEngineStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEngineStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEngineStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEngineStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of a specified Gremlin query.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getGremlinQueryStatusRequest
     * @return Result of the GetGremlinQueryStatus operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetGremlinQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetGremlinQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetGremlinQueryStatusResult getGremlinQueryStatus(GetGremlinQueryStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetGremlinQueryStatus(request);
    }

    @SdkInternalApi
    final GetGremlinQueryStatusResult executeGetGremlinQueryStatus(GetGremlinQueryStatusRequest getGremlinQueryStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getGremlinQueryStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGremlinQueryStatusRequest> request = null;
        Response<GetGremlinQueryStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGremlinQueryStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGremlinQueryStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGremlinQueryStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGremlinQueryStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetGremlinQueryStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a specified data processing job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmldataprocessingjobstatus"
     * >neptune-db:neptune-db:GetMLDataProcessingJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLDataProcessingJobRequest
     * @return Result of the GetMLDataProcessingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMLDataProcessingJobResult getMLDataProcessingJob(GetMLDataProcessingJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetMLDataProcessingJob(request);
    }

    @SdkInternalApi
    final GetMLDataProcessingJobResult executeGetMLDataProcessingJob(GetMLDataProcessingJobRequest getMLDataProcessingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getMLDataProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLDataProcessingJobRequest> request = null;
        Response<GetMLDataProcessingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLDataProcessingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMLDataProcessingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMLDataProcessingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMLDataProcessingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMLDataProcessingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about an inference endpoint. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlendpointstatus"
     * >neptune-db:GetMLEndpointStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLEndpointRequest
     * @return Result of the GetMLEndpoint operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMLEndpointResult getMLEndpoint(GetMLEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetMLEndpoint(request);
    }

    @SdkInternalApi
    final GetMLEndpointResult executeGetMLEndpoint(GetMLEndpointRequest getMLEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getMLEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLEndpointRequest> request = null;
        Response<GetMLEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMLEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMLEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMLEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMLEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlmodeltrainingjobstatus"
     * >neptune-db:GetMLModelTrainingJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLModelTrainingJobRequest
     * @return Result of the GetMLModelTrainingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMLModelTrainingJobResult getMLModelTrainingJob(GetMLModelTrainingJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetMLModelTrainingJob(request);
    }

    @SdkInternalApi
    final GetMLModelTrainingJobResult executeGetMLModelTrainingJob(GetMLModelTrainingJobRequest getMLModelTrainingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getMLModelTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLModelTrainingJobRequest> request = null;
        Response<GetMLModelTrainingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLModelTrainingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMLModelTrainingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMLModelTrainingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMLModelTrainingJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetMLModelTrainingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getmlmodeltransformjobstatus"
     * >neptune-db:GetMLModelTransformJobStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getMLModelTransformJobRequest
     * @return Result of the GetMLModelTransformJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMLModelTransformJobResult getMLModelTransformJob(GetMLModelTransformJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetMLModelTransformJob(request);
    }

    @SdkInternalApi
    final GetMLModelTransformJobResult executeGetMLModelTransformJob(GetMLModelTransformJobRequest getMLModelTransformJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getMLModelTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLModelTransformJobRequest> request = null;
        Response<GetMLModelTransformJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLModelTransformJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMLModelTransformJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMLModelTransformJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMLModelTransformJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMLModelTransformJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status of a specified openCypher query.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getOpenCypherQueryStatusRequest
     * @return Result of the GetOpenCypherQueryStatus operation returned by the service.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetOpenCypherQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetOpenCypherQueryStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOpenCypherQueryStatusResult getOpenCypherQueryStatus(GetOpenCypherQueryStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetOpenCypherQueryStatus(request);
    }

    @SdkInternalApi
    final GetOpenCypherQueryStatusResult executeGetOpenCypherQueryStatus(GetOpenCypherQueryStatusRequest getOpenCypherQueryStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getOpenCypherQueryStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenCypherQueryStatusRequest> request = null;
        Response<GetOpenCypherQueryStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenCypherQueryStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOpenCypherQueryStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOpenCypherQueryStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOpenCypherQueryStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOpenCypherQueryStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets property graph statistics (Gremlin and openCypher).
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getstatisticsstatus"
     * >neptune-db:GetStatisticsStatus</a> IAM action in that cluster.
     * </p>
     * 
     * @param getPropertygraphStatisticsRequest
     * @return Result of the GetPropertygraphStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetPropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPropertygraphStatisticsResult getPropertygraphStatistics(GetPropertygraphStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetPropertygraphStatistics(request);
    }

    @SdkInternalApi
    final GetPropertygraphStatisticsResult executeGetPropertygraphStatistics(GetPropertygraphStatisticsRequest getPropertygraphStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getPropertygraphStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPropertygraphStatisticsRequest> request = null;
        Response<GetPropertygraphStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPropertygraphStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPropertygraphStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPropertygraphStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPropertygraphStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPropertygraphStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a graph summary for a property graph.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getgraphsummary"
     * >neptune-db:GetGraphSummary</a> IAM action in that cluster.
     * </p>
     * 
     * @param getPropertygraphSummaryRequest
     * @return Result of the GetPropertygraphSummary operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetPropertygraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPropertygraphSummaryResult getPropertygraphSummary(GetPropertygraphSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetPropertygraphSummary(request);
    }

    @SdkInternalApi
    final GetPropertygraphSummaryResult executeGetPropertygraphSummary(GetPropertygraphSummaryRequest getPropertygraphSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getPropertygraphSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPropertygraphSummaryRequest> request = null;
        Response<GetPropertygraphSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPropertygraphSummaryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPropertygraphSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPropertygraphSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPropertygraphSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPropertygraphSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a graph summary for an RDF graph.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getgraphsummary"
     * >neptune-db:GetGraphSummary</a> IAM action in that cluster.
     * </p>
     * 
     * @param getRDFGraphSummaryRequest
     * @return Result of the GetRDFGraphSummary operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetRDFGraphSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetRDFGraphSummary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetRDFGraphSummaryResult getRDFGraphSummary(GetRDFGraphSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetRDFGraphSummary(request);
    }

    @SdkInternalApi
    final GetRDFGraphSummaryResult executeGetRDFGraphSummary(GetRDFGraphSummaryRequest getRDFGraphSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getRDFGraphSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRDFGraphSummaryRequest> request = null;
        Response<GetRDFGraphSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRDFGraphSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRDFGraphSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRDFGraphSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRDFGraphSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRDFGraphSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets RDF statistics (SPARQL).
     * </p>
     * 
     * @param getSparqlStatisticsRequest
     * @return Result of the GetSparqlStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.GetSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSparqlStatisticsResult getSparqlStatistics(GetSparqlStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSparqlStatistics(request);
    }

    @SdkInternalApi
    final GetSparqlStatisticsResult executeGetSparqlStatistics(GetSparqlStatisticsRequest getSparqlStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSparqlStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSparqlStatisticsRequest> request = null;
        Response<GetSparqlStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSparqlStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSparqlStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSparqlStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSparqlStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSparqlStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a stream for an RDF graph.
     * </p>
     * <p>
     * With the Neptune Streams feature, you can generate a complete sequence of change-log entries that record every
     * change made to your graph data as it happens. <code>GetSparqlStream</code> lets you collect these change-log
     * entries for an RDF graph.
     * </p>
     * <p>
     * The Neptune streams feature needs to be enabled on your Neptune DBcluster. To enable streams, set the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/parameters.html#parameters-db-cluster-parameters-neptune_streams"
     * >neptune_streams</a> DB cluster parameter to <code>1</code>.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/streams.html">Capturing graph changes in real
     * time using Neptune streams</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getstreamrecords"
     * >neptune-db:GetStreamRecords</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Sparql</a> IAM condition key can be used in the policy document to restrict the use of
     * SPARQL queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param getSparqlStreamRequest
     * @return Result of the GetSparqlStream operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws ExpiredStreamException
     *         Raised when a request attempts to access an stream that has expired.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws MemoryLimitExceededException
     *         Raised when a request fails because of insufficient memory resources. The request can be retried.
     * @throws StreamRecordsNotFoundException
     *         Raised when stream records requested by a query cannot be found.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ThrottlingException
     *         Raised when the rate of requests exceeds the maximum throughput. Requests can be retried after
     *         encountering this exception.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.GetSparqlStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStream" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSparqlStreamResult getSparqlStream(GetSparqlStreamRequest request) {
        request = beforeClientExecution(request);
        return executeGetSparqlStream(request);
    }

    @SdkInternalApi
    final GetSparqlStreamResult executeGetSparqlStream(GetSparqlStreamRequest getSparqlStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(getSparqlStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSparqlStreamRequest> request = null;
        Response<GetSparqlStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSparqlStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSparqlStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSparqlStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSparqlStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSparqlStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists active Gremlin queries. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status.html">Gremlin query status API</a>
     * for details about the output.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:Gremlin</a> IAM condition key can be used in the policy document to restrict the use of
     * Gremlin queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param listGremlinQueriesRequest
     * @return Result of the ListGremlinQueries operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ListGremlinQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListGremlinQueries" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListGremlinQueriesResult listGremlinQueries(ListGremlinQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListGremlinQueries(request);
    }

    @SdkInternalApi
    final ListGremlinQueriesResult executeListGremlinQueries(ListGremlinQueriesRequest listGremlinQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGremlinQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGremlinQueriesRequest> request = null;
        Response<ListGremlinQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGremlinQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGremlinQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGremlinQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGremlinQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGremlinQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the <code>loadIds</code> for all active loader jobs.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listloaderjobs"
     * >neptune-db:ListLoaderJobs</a> IAM action in that cluster..
     * </p>
     * 
     * @param listLoaderJobsRequest
     * @return Result of the ListLoaderJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws BulkLoadIdNotFoundException
     *         Raised when a specified bulk-load job ID cannot be found.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws LoadUrlAccessDeniedException
     *         Raised when access is denied to a specified load URL.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListLoaderJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListLoaderJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLoaderJobsResult listLoaderJobs(ListLoaderJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListLoaderJobs(request);
    }

    @SdkInternalApi
    final ListLoaderJobsResult executeListLoaderJobs(ListLoaderJobsRequest listLoaderJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLoaderJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLoaderJobsRequest> request = null;
        Response<ListLoaderJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLoaderJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLoaderJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLoaderJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLoaderJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLoaderJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Neptune ML data processing jobs. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html#machine-learning-api-dataprocessing-list-jobs"
     * >Listing active data-processing jobs using the Neptune ML dataprocessing command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmldataprocessingjobs"
     * >neptune-db:ListMLDataProcessingJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLDataProcessingJobsRequest
     * @return Result of the ListMLDataProcessingJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLDataProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLDataProcessingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMLDataProcessingJobsResult listMLDataProcessingJobs(ListMLDataProcessingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMLDataProcessingJobs(request);
    }

    @SdkInternalApi
    final ListMLDataProcessingJobsResult executeListMLDataProcessingJobs(ListMLDataProcessingJobsRequest listMLDataProcessingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMLDataProcessingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMLDataProcessingJobsRequest> request = null;
        Response<ListMLDataProcessingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMLDataProcessingJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMLDataProcessingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMLDataProcessingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMLDataProcessingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMLDataProcessingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists existing inference endpoints. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-endpoints.html">Managing
     * inference endpoints using the endpoints command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmlendpoints"
     * >neptune-db:ListMLEndpoints</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLEndpointsRequest
     * @return Result of the ListMLEndpoints operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMLEndpointsResult listMLEndpoints(ListMLEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListMLEndpoints(request);
    }

    @SdkInternalApi
    final ListMLEndpointsResult executeListMLEndpoints(ListMLEndpointsRequest listMLEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMLEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMLEndpointsRequest> request = null;
        Response<ListMLEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMLEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMLEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMLEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMLEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMLEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Neptune ML model-training jobs. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#neptune-db:listmlmodeltrainingjobs"
     * >neptune-db:neptune-db:ListMLModelTrainingJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLModelTrainingJobsRequest
     * @return Result of the ListMLModelTrainingJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLModelTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTrainingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMLModelTrainingJobsResult listMLModelTrainingJobs(ListMLModelTrainingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMLModelTrainingJobs(request);
    }

    @SdkInternalApi
    final ListMLModelTrainingJobsResult executeListMLModelTrainingJobs(ListMLModelTrainingJobsRequest listMLModelTrainingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMLModelTrainingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMLModelTrainingJobsRequest> request = null;
        Response<ListMLModelTrainingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMLModelTrainingJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMLModelTrainingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMLModelTrainingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMLModelTrainingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMLModelTrainingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of model transform job IDs. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#listmlmodeltransformjobs"
     * >neptune-db:ListMLModelTransformJobs</a> IAM action in that cluster.
     * </p>
     * 
     * @param listMLModelTransformJobsRequest
     * @return Result of the ListMLModelTransformJobs operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.ListMLModelTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTransformJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMLModelTransformJobsResult listMLModelTransformJobs(ListMLModelTransformJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMLModelTransformJobs(request);
    }

    @SdkInternalApi
    final ListMLModelTransformJobsResult executeListMLModelTransformJobs(ListMLModelTransformJobsRequest listMLModelTransformJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMLModelTransformJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMLModelTransformJobsRequest> request = null;
        Response<ListMLModelTransformJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMLModelTransformJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMLModelTransformJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMLModelTransformJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMLModelTransformJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMLModelTransformJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists active openCypher queries. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-opencypher-status.html">Neptune
     * openCypher status endpoint</a> for more information.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#getquerystatus"
     * >neptune-db:GetQueryStatus</a> IAM action in that cluster.
     * </p>
     * <p>
     * Note that the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html#iam-neptune-condition-keys"
     * >neptune-db:QueryLanguage:OpenCypher</a> IAM condition key can be used in the policy document to restrict the use
     * of openCypher queries (see <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-data-condition-keys.html">Condition keys available
     * in Neptune IAM data-access policy statements</a>).
     * </p>
     * 
     * @param listOpenCypherQueriesRequest
     * @return Result of the ListOpenCypherQueries operation returned by the service.
     * @throws InvalidNumericDataException
     *         Raised when invalid numerical data is encountered when servicing a request.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws FailureByQueryException
     *         Raised when a request fails.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ParsingException
     *         Raised when a parsing issue is encountered.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws TimeLimitExceededException
     *         Raised when the an operation exceeds the time limit allowed for it.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws ConcurrentModificationException
     *         Raised when a request attempts to modify data that is concurrently being modified by another process.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ListOpenCypherQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListOpenCypherQueries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOpenCypherQueriesResult listOpenCypherQueries(ListOpenCypherQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListOpenCypherQueries(request);
    }

    @SdkInternalApi
    final ListOpenCypherQueriesResult executeListOpenCypherQueries(ListOpenCypherQueriesRequest listOpenCypherQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listOpenCypherQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOpenCypherQueriesRequest> request = null;
        Response<ListOpenCypherQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOpenCypherQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOpenCypherQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOpenCypherQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOpenCypherQueriesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListOpenCypherQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Manages the generation and use of property graph statistics.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#managestatistics"
     * >neptune-db:ManageStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param managePropertygraphStatisticsRequest
     * @return Result of the ManagePropertygraphStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ManagePropertygraphStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManagePropertygraphStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ManagePropertygraphStatisticsResult managePropertygraphStatistics(ManagePropertygraphStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeManagePropertygraphStatistics(request);
    }

    @SdkInternalApi
    final ManagePropertygraphStatisticsResult executeManagePropertygraphStatistics(ManagePropertygraphStatisticsRequest managePropertygraphStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(managePropertygraphStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ManagePropertygraphStatisticsRequest> request = null;
        Response<ManagePropertygraphStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ManagePropertygraphStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(managePropertygraphStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ManagePropertygraphStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ManagePropertygraphStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ManagePropertygraphStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Manages the generation and use of RDF graph statistics.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#managestatistics"
     * >neptune-db:ManageStatistics</a> IAM action in that cluster.
     * </p>
     * 
     * @param manageSparqlStatisticsRequest
     * @return Result of the ManageSparqlStatistics operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws StatisticsNotAvailableException
     *         Raised when statistics needed to satisfy a request are not available.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws AccessDeniedException
     *         Raised in case of an authentication or authorization failure.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ReadOnlyViolationException
     *         Raised when a request attempts to write to a read-only resource.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.ManageSparqlStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ManageSparqlStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ManageSparqlStatisticsResult manageSparqlStatistics(ManageSparqlStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeManageSparqlStatistics(request);
    }

    @SdkInternalApi
    final ManageSparqlStatisticsResult executeManageSparqlStatistics(ManageSparqlStatisticsRequest manageSparqlStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(manageSparqlStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ManageSparqlStatisticsRequest> request = null;
        Response<ManageSparqlStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ManageSparqlStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(manageSparqlStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ManageSparqlStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ManageSparqlStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ManageSparqlStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a Neptune bulk loader job to load data from an Amazon S3 bucket into a Neptune DB instance. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/bulk-load.html">Using the Amazon Neptune Bulk Loader
     * to Ingest Data</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startloaderjob"
     * >neptune-db:StartLoaderJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startLoaderJobRequest
     * @return Result of the StartLoaderJob operation returned by the service.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws BulkLoadIdNotFoundException
     *         Raised when a specified bulk-load job ID cannot be found.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws LoadUrlAccessDeniedException
     *         Raised when access is denied to a specified load URL.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws InternalFailureException
     *         Raised when the processing of the request failed unexpectedly.
     * @throws S3Exception
     *         Raised when there is a problem accessing Amazon S3.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @sample AmazonNeptunedata.StartLoaderJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartLoaderJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartLoaderJobResult startLoaderJob(StartLoaderJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartLoaderJob(request);
    }

    @SdkInternalApi
    final StartLoaderJobResult executeStartLoaderJob(StartLoaderJobRequest startLoaderJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startLoaderJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLoaderJobRequest> request = null;
        Response<StartLoaderJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLoaderJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startLoaderJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartLoaderJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartLoaderJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartLoaderJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Neptune ML data processing job for processing the graph data exported from Neptune for training.
     * See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-dataprocessing.html">The
     * <code>dataprocessing</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeldataprocessingjob"
     * >neptune-db:StartMLModelDataProcessingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLDataProcessingJobRequest
     * @return Result of the StartMLDataProcessingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.StartMLDataProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLDataProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMLDataProcessingJobResult startMLDataProcessingJob(StartMLDataProcessingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMLDataProcessingJob(request);
    }

    @SdkInternalApi
    final StartMLDataProcessingJobResult executeStartMLDataProcessingJob(StartMLDataProcessingJobRequest startMLDataProcessingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMLDataProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMLDataProcessingJobRequest> request = null;
        Response<StartMLDataProcessingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMLDataProcessingJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMLDataProcessingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMLDataProcessingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMLDataProcessingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMLDataProcessingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Neptune ML model training job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-api-modeltraining.html">Model
     * training using the <code>modeltraining</code> command</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeltrainingjob"
     * >neptune-db:StartMLModelTrainingJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLModelTrainingJobRequest
     * @return Result of the StartMLModelTrainingJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.StartMLModelTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTrainingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMLModelTrainingJobResult startMLModelTrainingJob(StartMLModelTrainingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMLModelTrainingJob(request);
    }

    @SdkInternalApi
    final StartMLModelTrainingJobResult executeStartMLModelTrainingJob(StartMLModelTrainingJobRequest startMLModelTrainingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMLModelTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMLModelTrainingJobRequest> request = null;
        Response<StartMLModelTrainingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMLModelTrainingJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMLModelTrainingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMLModelTrainingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMLModelTrainingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMLModelTrainingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new model transform job. See <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained
     * model to generate new model artifacts</a>.
     * </p>
     * <p>
     * When invoking this operation in a Neptune cluster that has IAM authentication enabled, the IAM user or role
     * making the request must have a policy attached that allows the <a
     * href="https://docs.aws.amazon.com/neptune/latest/userguide/iam-dp-actions.html#startmlmodeltransformjob"
     * >neptune-db:StartMLModelTransformJob</a> IAM action in that cluster.
     * </p>
     * 
     * @param startMLModelTransformJobRequest
     * @return Result of the StartMLModelTransformJob operation returned by the service.
     * @throws UnsupportedOperationException
     *         Raised when a request attempts to initiate an operation that is not supported.
     * @throws BadRequestException
     *         Raised when a request is submitted that cannot be processed.
     * @throws MLResourceNotFoundException
     *         Raised when a specified machine-learning resource could not be found.
     * @throws InvalidParameterException
     *         Raised when a parameter value is not valid.
     * @throws ClientTimeoutException
     *         Raised when a request timed out in the client.
     * @throws PreconditionsFailedException
     *         Raised when a precondition for processing a request is not satisfied.
     * @throws ConstraintViolationException
     *         Raised when a value in a request field did not satisfy required constraints.
     * @throws InvalidArgumentException
     *         Raised when an argument in a request has an invalid value.
     * @throws MissingParameterException
     *         Raised when a required parameter is missing.
     * @throws IllegalArgumentException
     *         Raised when an argument in a request is not supported.
     * @throws TooManyRequestsException
     *         Raised when the number of requests being processed exceeds the limit.
     * @sample AmazonNeptunedata.StartMLModelTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StartMLModelTransformJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMLModelTransformJobResult startMLModelTransformJob(StartMLModelTransformJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMLModelTransformJob(request);
    }

    @SdkInternalApi
    final StartMLModelTransformJobResult executeStartMLModelTransformJob(StartMLModelTransformJobRequest startMLModelTransformJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMLModelTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMLModelTransformJobRequest> request = null;
        Response<StartMLModelTransformJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMLModelTransformJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMLModelTransformJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "neptunedata");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMLModelTransformJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMLModelTransformJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMLModelTransformJobResultJsonUnmarshaller());
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

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata()
                .withCustomErrorCodeFieldName("code"));

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
