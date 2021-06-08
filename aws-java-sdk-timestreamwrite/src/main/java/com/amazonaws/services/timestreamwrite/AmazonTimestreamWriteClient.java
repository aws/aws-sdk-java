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
package com.amazonaws.services.timestreamwrite;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.services.timestreamwrite.endpointdiscovery.AmazonTimestreamWriteEndpointCache;
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

import com.amazonaws.services.timestreamwrite.AmazonTimestreamWriteClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.timestreamwrite.model.*;
import com.amazonaws.services.timestreamwrite.model.transform.*;

/**
 * Client for accessing Timestream Write. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Timestream is a fast, scalable, fully managed time series database service that makes it easy to store and
 * analyze trillions of time series data points per day. With Timestream, you can easily store and analyze IoT sensor
 * data to derive insights from your IoT applications. You can analyze industrial telemetry to streamline equipment
 * management and maintenance. You can also store and analyze log data and metrics to improve the performance and
 * availability of your applications. Timestream is built from the ground up to effectively ingest, process, and store
 * time series data. It organizes data to optimize query processing. It automatically scales based on the volume of data
 * ingested and on the query volume to ensure you receive optimal performance while inserting and querying data. As your
 * data grows over time, Timestream’s adaptive query processing engine spans across storage tiers to provide fast
 * analysis while reducing costs.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTimestreamWriteClient extends AmazonWebServiceClient implements AmazonTimestreamWrite {

    protected AmazonTimestreamWriteEndpointCache cache;

    private final boolean endpointDiscoveryEnabled;
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonTimestreamWrite.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "timestream";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEndpointException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.InvalidEndpointExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RejectedRecordsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamwrite.model.transform.RejectedRecordsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.timestreamwrite.model.AmazonTimestreamWriteException.class));

    public static AmazonTimestreamWriteClientBuilder builder() {
        return AmazonTimestreamWriteClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Timestream Write using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTimestreamWriteClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Timestream Write using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTimestreamWriteClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.endpointDiscoveryEnabled = endpointDiscoveryEnabled;
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        if (endpointDiscoveryEnabled) {
            cache = new AmazonTimestreamWriteEndpointCache(this);
        }
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ingest.timestream.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/timestreamwrite/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/timestreamwrite/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new Timestream database. If the KMS key is not specified, the database will be encrypted with a
     * Timestream managed KMS key located in your account. Refer to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     * keys</a> for more info. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return Result of the CreateDatabase operation returned by the service.
     * @throws ConflictException
     *         Timestream was unable to process this request because it contains resource that already exists.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @sample AmazonTimestreamWrite.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatabaseResult createDatabase(CreateDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatabase(request);
    }

    @SdkInternalApi
    final CreateDatabaseResult executeCreateDatabase(CreateDatabaseRequest createDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatabaseRequest> request = null;
        Response<CreateDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The CreateTable operation adds a new table to an existing database in your account. In an AWS account, table
     * names must be at least unique within each Region if they are in the same database. You may have identical table
     * names in the same Region if the tables are in seperate databases. While creating the table, you must specify the
     * table name, database name, and the retention properties. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param createTableRequest
     * @return Result of the CreateTable operation returned by the service.
     * @throws ConflictException
     *         Timestream was unable to process this request because it contains resource that already exists.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateTable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTableResult createTable(CreateTableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTable(request);
    }

    @SdkInternalApi
    final CreateTableResult executeCreateTable(CreateTableRequest createTableRequest) {

        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a given Timestream database. <i>This is an irreversible operation. After a database is deleted, the time
     * series data from its tables cannot be recovered.</i>
     * </p>
     * <p>
     * All tables in the database must be deleted first, or a ValidationException error will be thrown.
     * </p>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * 
     * @param deleteDatabaseRequest
     * @return Result of the DeleteDatabase operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatabaseResult deleteDatabase(DeleteDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatabase(request);
    }

    @SdkInternalApi
    final DeleteDatabaseResult executeDeleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatabaseRequest> request = null;
        Response<DeleteDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a given Timestream table. This is an irreversible operation. After a Timestream database table is
     * deleted, the time series data stored in the table cannot be recovered.
     * </p>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * 
     * @param deleteTableRequest
     * @return Result of the DeleteTable operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteTable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTable(request);
    }

    @SdkInternalApi
    final DeleteTableResult executeDeleteTable(DeleteTableRequest deleteTableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the database, including the database name, time that the database was created, and the
     * total number of tables found within the database. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param describeDatabaseRequest
     * @return Result of the DescribeDatabase operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DescribeDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDatabaseResult describeDatabase(DescribeDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDatabase(request);
    }

    @SdkInternalApi
    final DescribeDatabaseResult executeDescribeDatabase(DescribeDatabaseRequest describeDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatabaseRequest> request = null;
        Response<DescribeDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is
     * available through both Write and Query.
     * </p>
     * <p>
     * Because Timestream’s SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>it is not recommended that you use this API unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your application uses a programming language that does not yet have SDK support
     * </p>
     * </li>
     * <li>
     * <p>
     * You require better control over the client-side implementation
     * </p>
     * </li>
     * </ul>
     * <p>
     * For detailed information on how to use DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using-API.endpoint-discovery.html">The
     * Endpoint Discovery Pattern and REST APIs</a>.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @sample AmazonTimestreamWrite.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpoints(request);
    }

    @SdkInternalApi
    final DescribeEndpointsResult executeDescribeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the table, including the table name, database name, retention duration of the memory
     * store and the magnetic store. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param describeTableRequest
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTableResult describeTable(DescribeTableRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTable(request);
    }

    @SdkInternalApi
    final DescribeTableResult executeDescribeTable(DescribeTableRequest describeTableRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRequest> request = null;
        Response<DescribeTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of your Timestream databases. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDatabasesResult listDatabases(ListDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeListDatabases(request);
    }

    @SdkInternalApi
    final ListDatabasesResult executeListDatabases(ListDatabasesRequest listDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatabasesRequest> request = null;
        Response<ListDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of tables, along with the name, status and retention properties of each table.
     * </p>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTablesResult listTables(ListTablesRequest request) {
        request = beforeClientExecution(request);
        return executeListTables(request);
    }

    @SdkInternalApi
    final ListTablesResult executeListTables(ListTablesRequest listTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTablesRequest> request = null;
        Response<ListTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTablesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all tags on a Timestream resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the association of tags from a Timestream resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the KMS key for an existing database. While updating the database, you must specify the database name
     * and the identifier of the new KMS key to be used (<code>KmsKeyId</code>). If there are any concurrent
     * <code>UpdateDatabase</code> requests, first writer wins.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return Result of the UpdateDatabase operation returned by the service.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDatabaseResult updateDatabase(UpdateDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatabase(request);
    }

    @SdkInternalApi
    final UpdateDatabaseResult executeUpdateDatabase(UpdateDatabaseRequest updateDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatabaseRequest> request = null;
        Response<UpdateDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the retention duration of the memory store and magnetic store for your Timestream table. Note that the
     * change in retention duration takes effect immediately. For example, if the retention period of the memory store
     * was initially set to 2 hours and then changed to 24 hours, the memory store will be capable of holding 24 hours
     * of data, but will be populated with 24 hours of data 22 hours after this change was made. Timestream does not
     * retrieve data from the magnetic store to populate the memory store.
     * </p>
     * <p>
     * Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param updateTableRequest
     * @return Result of the UpdateTable operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateTable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTableResult updateTable(UpdateTableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTable(request);
    }

    @SdkInternalApi
    final UpdateTableResult executeUpdateTable(UpdateTableRequest updateTableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The WriteRecords operation enables you to write your time series data into Timestream. You can specify a single
     * data point or a batch of data points to be inserted into the system. Timestream offers you with a flexible schema
     * that auto detects the column names and data types for your Timestream tables based on the dimension names and
     * data types of the data points you specify when invoking writes into the database. Timestream support eventual
     * consistency read semantics. This means that when you query data immediately after writing a batch of data into
     * Timestream, the query results might not reflect the results of a recently completed write operation. The results
     * may also include some stale data. If you repeat the query request after a short time, the results should return
     * the latest data. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param writeRecordsRequest
     * @return Result of the WriteRecords operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws RejectedRecordsException
     *         WriteRecords would throw this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Records with duplicate data where there are multiple records with the same dimensions, timestamps, and
     *         measure names but different measure values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Records with timestamps that lie outside the retention duration of the memory store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Records with dimensions or measures that exceed the Timestream defined limits.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a>
     *         in the Timestream Developer Guide.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.WriteRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/WriteRecords" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public WriteRecordsResult writeRecords(WriteRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeWriteRecords(request);
    }

    @SdkInternalApi
    final WriteRecordsResult executeWriteRecords(WriteRecordsRequest writeRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(writeRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<WriteRecordsRequest> request = null;
        Response<WriteRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new WriteRecordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(writeRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Write");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "WriteRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WriteRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WriteRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

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
        if (cache != null) {
            cache.shutdown();
        }
    }

}
