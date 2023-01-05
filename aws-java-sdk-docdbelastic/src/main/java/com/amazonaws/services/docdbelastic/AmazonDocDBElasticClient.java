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
package com.amazonaws.services.docdbelastic;

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

import com.amazonaws.services.docdbelastic.AmazonDocDBElasticClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.docdbelastic.model.*;
import com.amazonaws.services.docdbelastic.model.transform.*;

/**
 * Client for accessing DocDB Elastic. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * The new Amazon Elastic DocumentDB service endpoint.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDocDBElasticClient extends AmazonWebServiceClient implements AmazonDocDBElastic {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDocDBElastic.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "docdb-elastic";

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
                                    com.amazonaws.services.docdbelastic.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.docdbelastic.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.docdbelastic.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.docdbelastic.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.docdbelastic.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.docdbelastic.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.docdbelastic.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.docdbelastic.model.AmazonDocDBElasticException.class));

    public static AmazonDocDBElasticClientBuilder builder() {
        return AmazonDocDBElasticClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on DocDB Elastic using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDocDBElasticClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on DocDB Elastic using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDocDBElasticClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("docdb-elastic.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/docdbelastic/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/docdbelastic/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new Elastic DocumentDB cluster and returns its Cluster structure.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCluster(request);
    }

    @SdkInternalApi
    final CreateClusterResult executeCreateCluster(CreateClusterRequest createClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a cluster.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @return Result of the CreateClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateClusterSnapshotResult createClusterSnapshot(CreateClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClusterSnapshot(request);
    }

    @SdkInternalApi
    final CreateClusterSnapshotResult executeCreateClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSnapshotRequest> request = null;
        Response<CreateClusterSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClusterSnapshotResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateClusterSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a Elastic DocumentDB cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCluster(request);
    }

    @SdkInternalApi
    final DeleteClusterResult executeDeleteCluster(DeleteClusterRequest deleteClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @return Result of the DeleteClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteClusterSnapshotResult deleteClusterSnapshot(DeleteClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClusterSnapshot(request);
    }

    @SdkInternalApi
    final DeleteClusterSnapshotResult executeDeleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSnapshotRequest> request = null;
        Response<DeleteClusterSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClusterSnapshotResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteClusterSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific Elastic DocumentDB cluster.
     * </p>
     * 
     * @param getClusterRequest
     * @return Result of the GetCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.GetCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetClusterResult getCluster(GetClusterRequest request) {
        request = beforeClientExecution(request);
        return executeGetCluster(request);
    }

    @SdkInternalApi
    final GetClusterResult executeGetCluster(GetClusterRequest getClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(getClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClusterRequest> request = null;
        Response<GetClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClusterResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific Elastic DocumentDB snapshot
     * </p>
     * 
     * @param getClusterSnapshotRequest
     * @return Result of the GetClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.GetClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetClusterSnapshotResult getClusterSnapshot(GetClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeGetClusterSnapshot(request);
    }

    @SdkInternalApi
    final GetClusterSnapshotResult executeGetClusterSnapshot(GetClusterSnapshotRequest getClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(getClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClusterSnapshotRequest> request = null;
        Response<GetClusterSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClusterSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClusterSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetClusterSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * 
     * @param listClusterSnapshotsRequest
     * @return Result of the ListClusterSnapshots operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.ListClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListClusterSnapshotsResult listClusterSnapshots(ListClusterSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeListClusterSnapshots(request);
    }

    @SdkInternalApi
    final ListClusterSnapshotsResult executeListClusterSnapshots(ListClusterSnapshotsRequest listClusterSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClusterSnapshotsRequest> request = null;
        Response<ListClusterSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClusterSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClusterSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusterSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClusterSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClusterSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about provisioned Elastic DocumentDB clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        request = beforeClientExecution(request);
        return executeListClusters(request);
    }

    @SdkInternalApi
    final ListClustersResult executeListClusters(ListClustersRequest listClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags on a Elastic DocumentDB resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @sample AmazonDocDBElastic.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
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
     * Restores a Elastic DocumentDB cluster from a snapshot.
     * </p>
     * 
     * @param restoreClusterFromSnapshotRequest
     * @return Result of the RestoreClusterFromSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.RestoreClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/RestoreClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestoreClusterFromSnapshotResult restoreClusterFromSnapshot(RestoreClusterFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreClusterFromSnapshot(request);
    }

    @SdkInternalApi
    final RestoreClusterFromSnapshotResult executeRestoreClusterFromSnapshot(RestoreClusterFromSnapshotRequest restoreClusterFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreClusterFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreClusterFromSnapshotRequest> request = null;
        Response<RestoreClusterFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreClusterFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(restoreClusterFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreClusterFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreClusterFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RestoreClusterFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds metadata tags to a Elastic DocumentDB resource
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @sample AmazonDocDBElastic.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
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
     * Removes metadata tags to a Elastic DocumentDB resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @sample AmazonDocDBElastic.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
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
     * Modifies a Elastic DocumentDB cluster. This includes updating admin-username/password, upgrading API version
     * setting up a backup window and maintenance window
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateClusterResult updateCluster(UpdateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCluster(request);
    }

    @SdkInternalApi
    final UpdateClusterResult executeUpdateCluster(UpdateClusterRequest updateClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterRequest> request = null;
        Response<UpdateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DocDB Elastic");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateClusterResultJsonUnmarshaller());
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
