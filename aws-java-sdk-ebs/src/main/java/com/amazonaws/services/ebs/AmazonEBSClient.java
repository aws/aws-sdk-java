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
package com.amazonaws.services.ebs;

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

import com.amazonaws.services.ebs.AmazonEBSClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.services.ebs.model.transform.*;

/**
 * Client for accessing Amazon EBS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * You can use the Amazon Elastic Block Store (Amazon EBS) direct APIs to create EBS snapshots, write data directly to
 * your snapshots, read data on your snapshots, and identify the differences or changes between two snapshots. If you’re
 * an independent software vendor (ISV) who offers backup services for Amazon EBS, the EBS direct APIs make it more
 * efficient and cost-effective to track incremental changes on your EBS volumes through snapshots. This can be done
 * without having to create new volumes from snapshots, and then use Amazon Elastic Compute Cloud (Amazon EC2) instances
 * to compare the differences.
 * </p>
 * <p>
 * You can create incremental snapshots directly from data on-premises into EBS volumes and the cloud to use for quick
 * disaster recovery. With the ability to write and read snapshots, you can write your on-premises data to an EBS
 * snapshot during a disaster. Then after recovery, you can restore it back to AWS or on-premises from the snapshot. You
 * no longer need to build and maintain complex mechanisms to copy data to and from Amazon EBS.
 * </p>
 * <p>
 * This API reference provides detailed information about the actions, data types, parameters, and errors of the EBS
 * direct APIs. For more information about the elements that make up the EBS direct APIs, and examples of how to use
 * them effectively, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html">Accessing the Contents of an
 * EBS Snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>. For more information about the supported AWS
 * Regions, endpoints, and service quotas for the EBS direct APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/ebs-service.html">Amazon Elastic Block Store Endpoints and
 * Quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEBSClient extends AmazonWebServiceClient implements AmazonEBS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonEBS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ebs";

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
                                    com.amazonaws.services.ebs.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestThrottledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.RequestThrottledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.ConcurrentLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ebs.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ebs.model.AmazonEBSException.class));

    public static AmazonEBSClientBuilder builder() {
        return AmazonEBSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EBS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonEBSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EBS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonEBSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ebs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ebs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ebs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Seals and completes the snapshot after all of the required blocks of data have been written to it. Completing the
     * snapshot changes the status to <code>completed</code>. You cannot write new blocks to a snapshot after it has
     * been completed.
     * </p>
     * 
     * @param completeSnapshotRequest
     * @return Result of the CompleteSnapshot operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.CompleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/CompleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CompleteSnapshotResult completeSnapshot(CompleteSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteSnapshot(request);
    }

    @SdkInternalApi
    final CompleteSnapshotResult executeCompleteSnapshot(CompleteSnapshotRequest completeSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(completeSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteSnapshotRequest> request = null;
        Response<CompleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(completeSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EBS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompleteSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CompleteSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data in a block in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param getSnapshotBlockRequest
     * @return Result of the GetSnapshotBlock operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.GetSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSnapshotBlockResult getSnapshotBlock(GetSnapshotBlockRequest request) {
        request = beforeClientExecution(request);
        return executeGetSnapshotBlock(request);
    }

    @SdkInternalApi
    final GetSnapshotBlockResult executeGetSnapshotBlock(GetSnapshotBlockRequest getSnapshotBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(getSnapshotBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotBlockRequest> request = null;
        Response<GetSnapshotBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotBlockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnapshotBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EBS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSnapshotBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSnapshotBlockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetSnapshotBlockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the blocks that are different between two Amazon Elastic Block Store snapshots of the
     * same volume/snapshot lineage.
     * </p>
     * 
     * @param listChangedBlocksRequest
     * @return Result of the ListChangedBlocks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.ListChangedBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListChangedBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChangedBlocksResult listChangedBlocks(ListChangedBlocksRequest request) {
        request = beforeClientExecution(request);
        return executeListChangedBlocks(request);
    }

    @SdkInternalApi
    final ListChangedBlocksResult executeListChangedBlocks(ListChangedBlocksRequest listChangedBlocksRequest) {

        ExecutionContext executionContext = createExecutionContext(listChangedBlocksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangedBlocksRequest> request = null;
        Response<ListChangedBlocksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChangedBlocksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChangedBlocksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EBS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChangedBlocks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChangedBlocksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChangedBlocksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the blocks in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param listSnapshotBlocksRequest
     * @return Result of the ListSnapshotBlocks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.ListSnapshotBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListSnapshotBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSnapshotBlocksResult listSnapshotBlocks(ListSnapshotBlocksRequest request) {
        request = beforeClientExecution(request);
        return executeListSnapshotBlocks(request);
    }

    @SdkInternalApi
    final ListSnapshotBlocksResult executeListSnapshotBlocks(ListSnapshotBlocksRequest listSnapshotBlocksRequest) {

        ExecutionContext executionContext = createExecutionContext(listSnapshotBlocksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSnapshotBlocksRequest> request = null;
        Response<ListSnapshotBlocksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSnapshotBlocksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSnapshotBlocksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EBS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSnapshotBlocks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSnapshotBlocksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSnapshotBlocksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Writes a block of data to a snapshot. If the specified block contains data, the existing data is overwritten. The
     * target snapshot must be in the <code>pending</code> state.
     * </p>
     * <p>
     * Data written to a snapshot must be aligned with 512-byte sectors.
     * </p>
     * 
     * @param putSnapshotBlockRequest
     * @return Result of the PutSnapshotBlock operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.PutSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/PutSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSnapshotBlockResult putSnapshotBlock(PutSnapshotBlockRequest request) {
        request = beforeClientExecution(request);
        return executePutSnapshotBlock(request);
    }

    @SdkInternalApi
    final PutSnapshotBlockResult executePutSnapshotBlock(PutSnapshotBlockRequest putSnapshotBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(putSnapshotBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSnapshotBlockRequest> request = null;
        Response<PutSnapshotBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSnapshotBlockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSnapshotBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EBS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSnapshotBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSnapshotBlockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSnapshotBlockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon EBS snapshot. The new snapshot enters the <code>pending</code> state after the request
     * completes.
     * </p>
     * <p>
     * After creating the snapshot, use <a
     * href="https://docs.aws.amazon.com/ebs/latest/APIReference/API_PutSnapshotBlock.html"> PutSnapshotBlock</a> to
     * write blocks of data to the snapshot.
     * </p>
     * 
     * @param startSnapshotRequest
     * @return Result of the StartSnapshot operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ConcurrentLimitExceededException
     *         You have reached the limit for concurrent API requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapi-performance"
     *         >Optimizing performance of the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @throws ConflictException
     *         The request uses the same client token as a previous, but non-identical request.
     * @sample AmazonEBS.StartSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/StartSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartSnapshotResult startSnapshot(StartSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeStartSnapshot(request);
    }

    @SdkInternalApi
    final StartSnapshotResult executeStartSnapshot(StartSnapshotRequest startSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(startSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSnapshotRequest> request = null;
        Response<StartSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EBS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSnapshotResultJsonUnmarshaller());
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
