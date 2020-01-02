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
package com.amazonaws.services.dataexchange;

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

import com.amazonaws.services.dataexchange.AWSDataExchangeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.services.dataexchange.model.transform.*;

/**
 * Client for accessing AWS Data Exchange. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Data Exchange is a service that makes it easy for AWS customers to exchange data in the cloud. You can use the
 * AWS Data Exchange APIs to create, update, manage, and access file-based data set in the AWS Cloud.
 * </p>
 * <p>
 * As a subscriber, you can view and access the data sets that you have an entitlement to through a subscription. You
 * can use the APIS to download or copy your entitled data sets to Amazon S3 for use across a variety of AWS analytics
 * and machine learning services.
 * </p>
 * <p>
 * As a provider, you can create and manage your data sets that you would like to publish to a product. Being able to
 * package and provide your data sets into products requires a few steps to determine eligibility. For more information,
 * visit the AWS Data Exchange User Guide.
 * </p>
 * <p>
 * A data set is a collection of data that can be changed or updated over time. Data sets can be updated using
 * revisions, which represent a new version or incremental change to a data set. A revision contains one or more assets.
 * An asset in AWS Data Exchange is a piece of data that can be stored as an Amazon S3 object. The asset can be a
 * structured data file, an image file, or some other data file. Jobs are asynchronous import or export operations used
 * to create or copy assets.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDataExchangeClient extends AmazonWebServiceClient implements AWSDataExchange {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDataExchange.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dataexchange";

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
                                    com.amazonaws.services.dataexchange.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.dataexchange.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.dataexchange.model.transform.ServiceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.dataexchange.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.dataexchange.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.dataexchange.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.dataexchange.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.dataexchange.model.AWSDataExchangeException.class));

    public static AWSDataExchangeClientBuilder builder() {
        return AWSDataExchangeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Exchange using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDataExchangeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Exchange using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDataExchangeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("dataexchange.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/dataexchange/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/dataexchange/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This operation cancels a job. Jobs can be cancelled only when they are in the WAITING state.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJob(request);
    }

    @SdkInternalApi
    final CancelJobResult executeCancelJob(CancelJobRequest cancelJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a data set.
     * </p>
     * 
     * @param createDataSetRequest
     *        The request body for CreateDataSet.
     * @return Result of the CreateDataSet operation returned by the service.
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws ServiceLimitExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataSetResult createDataSet(CreateDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSet(request);
    }

    @SdkInternalApi
    final CreateDataSetResult executeCreateDataSet(CreateDataSetRequest createDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSetRequest> request = null;
        Response<CreateDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a job.
     * </p>
     * 
     * @param createJobRequest
     *        The request body for CreateJob.
     * @return Result of the CreateJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates a revision for a data set.
     * </p>
     * 
     * @param createRevisionRequest
     *        The request body for CreateRevision.
     * @return Result of the CreateRevision operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.CreateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRevisionResult createRevision(CreateRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRevision(request);
    }

    @SdkInternalApi
    final CreateRevisionResult executeCreateRevision(CreateRevisionRequest createRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(createRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRevisionRequest> request = null;
        Response<CreateRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes an asset.
     * </p>
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAssetResult deleteAsset(DeleteAssetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAsset(request);
    }

    @SdkInternalApi
    final DeleteAssetResult executeDeleteAsset(DeleteAssetRequest deleteAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetRequest> request = null;
        Response<DeleteAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes a data set.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return Result of the DeleteDataSet operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataSetResult deleteDataSet(DeleteDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSet(request);
    }

    @SdkInternalApi
    final DeleteDataSetResult executeDeleteDataSet(DeleteDataSetRequest deleteDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSetRequest> request = null;
        Response<DeleteDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes a revision.
     * </p>
     * 
     * @param deleteRevisionRequest
     * @return Result of the DeleteRevision operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.DeleteRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteRevision" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRevisionResult deleteRevision(DeleteRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRevision(request);
    }

    @SdkInternalApi
    final DeleteRevisionResult executeDeleteRevision(DeleteRevisionRequest deleteRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRevisionRequest> request = null;
        Response<DeleteRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about an asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return Result of the GetAsset operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAssetResult getAsset(GetAssetRequest request) {
        request = beforeClientExecution(request);
        return executeGetAsset(request);
    }

    @SdkInternalApi
    final GetAssetResult executeGetAsset(GetAssetRequest getAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetRequest> request = null;
        Response<GetAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about a data set.
     * </p>
     * 
     * @param getDataSetRequest
     * @return Result of the GetDataSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataSetResult getDataSet(GetDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSet(request);
    }

    @SdkInternalApi
    final GetDataSetResult executeGetDataSet(GetDataSetRequest getDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSetRequest> request = null;
        Response<GetDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about a job.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobResult getJob(GetJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetJob(request);
    }

    @SdkInternalApi
    final GetJobResult executeGetJob(GetJobRequest getJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns information about a revision.
     * </p>
     * 
     * @param getRevisionRequest
     * @return Result of the GetRevision operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRevisionResult getRevision(GetRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeGetRevision(request);
    }

    @SdkInternalApi
    final GetRevisionResult executeGetRevision(GetRevisionRequest getRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(getRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRevisionRequest> request = null;
        Response<GetRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRevisionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists a data set's revisions sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listDataSetRevisionsRequest
     * @return Result of the ListDataSetRevisions operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListDataSetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSetRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataSetRevisionsResult listDataSetRevisions(ListDataSetRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSetRevisions(request);
    }

    @SdkInternalApi
    final ListDataSetRevisionsResult executeListDataSetRevisions(ListDataSetRevisionsRequest listDataSetRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSetRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetRevisionsRequest> request = null;
        Response<ListDataSetRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetRevisionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSetRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSetRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSetRevisionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSetRevisionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists your data sets. When listing by origin OWNED, results are sorted by CreatedAt in descending
     * order. When listing by origin ENTITLED, there is no order and the maxResults parameter is ignored.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return Result of the ListDataSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataSetsResult listDataSets(ListDataSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSets(request);
    }

    @SdkInternalApi
    final ListDataSetsResult executeListDataSets(ListDataSetsRequest listDataSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetsRequest> request = null;
        Response<ListDataSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists your jobs sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists a revision's assets sorted alphabetically in descending order.
     * </p>
     * 
     * @param listRevisionAssetsRequest
     * @return Result of the ListRevisionAssets operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListRevisionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListRevisionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRevisionAssetsResult listRevisionAssets(ListRevisionAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListRevisionAssets(request);
    }

    @SdkInternalApi
    final ListRevisionAssetsResult executeListRevisionAssets(ListRevisionAssetsRequest listRevisionAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRevisionAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRevisionAssetsRequest> request = null;
        Response<ListRevisionAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRevisionAssetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRevisionAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRevisionAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRevisionAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRevisionAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation lists the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AWSDataExchange.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation starts a job.
     * </p>
     * 
     * @param startJobRequest
     * @return Result of the StartJob operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobResult startJob(StartJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartJob(request);
    }

    @SdkInternalApi
    final StartJobResult executeStartJob(StartJobRequest startJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRequest> request = null;
        Response<StartJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request body for TagResource.
     * @return Result of the TagResource operation returned by the service.
     * @sample AWSDataExchange.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AWSDataExchange.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates an asset.
     * </p>
     * 
     * @param updateAssetRequest
     *        The request body for UpdateAsset.
     * @return Result of the UpdateAsset operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAssetResult updateAsset(UpdateAssetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAsset(request);
    }

    @SdkInternalApi
    final UpdateAssetResult executeUpdateAsset(UpdateAssetRequest updateAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetRequest> request = null;
        Response<UpdateAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates a data set.
     * </p>
     * 
     * @param updateDataSetRequest
     *        The request body for UpdateDataSet.
     * @return Result of the UpdateDataSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDataSetResult updateDataSet(UpdateDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSet(request);
    }

    @SdkInternalApi
    final UpdateDataSetResult executeUpdateDataSet(UpdateDataSetRequest updateDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSetRequest> request = null;
        Response<UpdateDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates a revision.
     * </p>
     * 
     * @param updateRevisionRequest
     *        The request body for UpdateRevision.
     * @return Result of the UpdateRevision operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.UpdateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRevisionResult updateRevision(UpdateRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRevision(request);
    }

    @SdkInternalApi
    final UpdateRevisionResult executeUpdateRevision(UpdateRevisionRequest updateRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRevisionRequest> request = null;
        Response<UpdateRevisionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRevisionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataExchange");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRevisionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRevisionResultJsonUnmarshaller());
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

}
