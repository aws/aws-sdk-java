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
package com.amazonaws.services.backupstorage;

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

import com.amazonaws.services.backupstorage.AWSBackupStorageClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.backupstorage.model.*;
import com.amazonaws.services.backupstorage.model.transform.*;

/**
 * Client for accessing AWS Backup Storage. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * The frontend service for Cryo Storage.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBackupStorageClient extends AmazonWebServiceClient implements AWSBackupStorage {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBackupStorage.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "backup-storage";

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
                                    com.amazonaws.services.backupstorage.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotReadableInputStreamException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.NotReadableInputStreamExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidKeyUsageException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.KMSInvalidKeyUsageExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IllegalArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.IllegalArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.DataAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceInternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.ServiceInternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RetryableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.RetryableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupstorage.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.backupstorage.model.AWSBackupStorageException.class));

    public static AWSBackupStorageClientBuilder builder() {
        return AWSBackupStorageClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Backup Storage using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBackupStorageClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Backup Storage using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBackupStorageClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("backupstorage.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/backupstorage/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/backupstorage/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Delete Object from the incremental base Backup.
     * 
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/DeleteObject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteObjectResult deleteObject(DeleteObjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteObject(request);
    }

    @SdkInternalApi
    final DeleteObjectResult executeDeleteObject(DeleteObjectRequest deleteObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteObjectRequest> request = null;
        Response<DeleteObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Gets the specified object's chunk.
     * 
     * @param getChunkRequest
     * @return Result of the GetChunk operation returned by the service.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.GetChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetChunk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChunkResult getChunk(GetChunkRequest request) {
        request = beforeClientExecution(request);
        return executeGetChunk(request);
    }

    @SdkInternalApi
    final GetChunkResult executeGetChunk(GetChunkRequest getChunkRequest) {

        ExecutionContext executionContext = createExecutionContext(getChunkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChunkRequest> request = null;
        Response<GetChunkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChunkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChunkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChunk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChunkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetChunkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get metadata associated with an Object.
     * 
     * @param getObjectMetadataRequest
     * @return Result of the GetObjectMetadata operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.GetObjectMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetObjectMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetObjectMetadataResult getObjectMetadata(GetObjectMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetObjectMetadata(request);
    }

    @SdkInternalApi
    final GetObjectMetadataResult executeGetObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getObjectMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetObjectMetadataRequest> request = null;
        Response<GetObjectMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetObjectMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getObjectMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetObjectMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetObjectMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetObjectMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List chunks in a given Object
     * 
     * @param listChunksRequest
     * @return Result of the ListChunks operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.ListChunks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListChunks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChunksResult listChunks(ListChunksRequest request) {
        request = beforeClientExecution(request);
        return executeListChunks(request);
    }

    @SdkInternalApi
    final ListChunksResult executeListChunks(ListChunksRequest listChunksRequest) {

        ExecutionContext executionContext = createExecutionContext(listChunksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChunksRequest> request = null;
        Response<ListChunksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChunksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChunksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChunks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChunksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChunksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List all Objects in a given Backup.
     * 
     * @param listObjectsRequest
     * @return Result of the ListObjects operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.ListObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListObjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListObjectsResult listObjects(ListObjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListObjects(request);
    }

    @SdkInternalApi
    final ListObjectsResult executeListObjects(ListObjectsRequest listObjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listObjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListObjectsRequest> request = null;
        Response<ListObjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListObjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listObjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListObjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListObjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListObjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Complete upload
     * 
     * @param notifyObjectCompleteRequest
     * @return Result of the NotifyObjectComplete operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws NotReadableInputStreamException
     *         Retryalble exception. Indicated issues while reading an input stream due to the networking issues or
     *         connection drop on the client side.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.NotifyObjectComplete
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/NotifyObjectComplete"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public NotifyObjectCompleteResult notifyObjectComplete(NotifyObjectCompleteRequest request) {
        request = beforeClientExecution(request);
        return executeNotifyObjectComplete(request);
    }

    @SdkInternalApi
    final NotifyObjectCompleteResult executeNotifyObjectComplete(NotifyObjectCompleteRequest notifyObjectCompleteRequest) {

        ExecutionContext executionContext = createExecutionContext(notifyObjectCompleteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyObjectCompleteRequest> request = null;
        Response<NotifyObjectCompleteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyObjectCompleteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(notifyObjectCompleteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "NotifyObjectComplete");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<NotifyObjectCompleteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new NotifyObjectCompleteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Upload chunk.
     * 
     * @param putChunkRequest
     * @return Result of the PutChunk operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws NotReadableInputStreamException
     *         Retryalble exception. Indicated issues while reading an input stream due to the networking issues or
     *         connection drop on the client side.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.PutChunk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutChunk" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutChunkResult putChunk(PutChunkRequest request) {
        request = beforeClientExecution(request);
        return executePutChunk(request);
    }

    @SdkInternalApi
    final PutChunkResult executePutChunk(PutChunkRequest putChunkRequest) {

        ExecutionContext executionContext = createExecutionContext(putChunkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutChunkRequest> request = null;
        Response<PutChunkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutChunkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putChunkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutChunk");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutChunkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutChunkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Upload object that can store object metadata String and data blob in single API call using inline chunk field.
     * 
     * @param putObjectRequest
     * @return Result of the PutObject operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws NotReadableInputStreamException
     *         Retryalble exception. Indicated issues while reading an input stream due to the networking issues or
     *         connection drop on the client side.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws KMSInvalidKeyUsageException
     *         Non-retryable exception. Indicates the KMS key usage is incorrect. See exception message for details.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutObjectResult putObject(PutObjectRequest request) {
        request = beforeClientExecution(request);
        return executePutObject(request);
    }

    @SdkInternalApi
    final PutObjectResult executePutObject(PutObjectRequest putObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(putObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutObjectRequest> request = null;
        Response<PutObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutObjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Start upload containing one or many chunks.
     * 
     * @param startObjectRequest
     * @return Result of the StartObject operation returned by the service.
     * @throws ServiceUnavailableException
     *         Retryable exception, indicates internal server error.
     * @throws ServiceInternalException
     *         Deprecated. To be removed from the model.
     * @throws RetryableException
     *         Retryable exception. In general indicates internal failure that can be fixed by retry.
     * @throws IllegalArgumentException
     *         Non-retryable exception, indicates client error (wrong argument passed to API). See exception message for
     *         details.
     * @throws ResourceNotFoundException
     *         Non-retryable exception. Attempted to make an operation on non-existing or expired resource.
     * @throws DataAlreadyExistsException
     *         Non-retryable exception. Attempted to create already existing object or chunk. This message contains a
     *         checksum of already presented data.
     * @throws ThrottlingException
     *         Increased rate over throttling limits. Can be retried with exponential backoff.
     * @throws AccessDeniedException
     * @sample AWSBackupStorage.StartObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/StartObject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartObjectResult startObject(StartObjectRequest request) {
        request = beforeClientExecution(request);
        return executeStartObject(request);
    }

    @SdkInternalApi
    final StartObjectResult executeStartObject(StartObjectRequest startObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(startObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartObjectRequest> request = null;
        Response<StartObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "BackupStorage");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartObjectResultJsonUnmarshaller());
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
