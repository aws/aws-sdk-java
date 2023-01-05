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
package com.amazonaws.services.athena;

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

import com.amazonaws.services.athena.AmazonAthenaClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.services.athena.model.transform.*;

/**
 * Client for accessing Amazon Athena. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Athena is an interactive query service that lets you use standard SQL to analyze data directly in Amazon S3.
 * You can point Athena at your data in Amazon S3 and run ad-hoc queries and get results in seconds. Athena is
 * serverless, so there is no infrastructure to set up or manage. You pay only for the queries you run. Athena scales
 * automatically—executing queries in parallel—so results are fast, even with large datasets and complex queries. For
 * more information, see <a href="http://docs.aws.amazon.com/athena/latest/ug/what-is.html">What is Amazon Athena</a> in
 * the <i>Amazon Athena User Guide</i>.
 * </p>
 * <p>
 * If you connect to Athena using the JDBC driver, use version 1.1.0 of the driver or later with the Amazon Athena API.
 * Earlier version drivers do not support the API. For more information and to download the driver, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/connect-with-jdbc.html">Accessing Amazon Athena with JDBC</a>.
 * </p>
 * <p>
 * For code samples using the Amazon Web Services SDK for Java, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the <i>Amazon
 * Athena User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAthenaClient extends AmazonWebServiceClient implements AmazonAthena {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAthena.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "athena";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MetadataException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.MetadataExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SessionAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.SessionAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.athena.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.athena.model.AmazonAthenaException.class));

    public static AmazonAthenaClientBuilder builder() {
        return AmazonAthenaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Athena using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAthenaClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Athena using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAthenaClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("athena.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/athena/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/athena/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
     * ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
     * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the specified workgroup. If information could
     * not be retrieved for a submitted query ID, information about the query ID submitted is listed under
     * <a>UnprocessedNamedQueryId</a>. Named queries differ from executed queries. Use
     * <a>BatchGetQueryExecutionInput</a> to get details about each unique query execution, and
     * <a>ListQueryExecutionsInput</a> to get a list of query execution IDs.
     * </p>
     * 
     * @param batchGetNamedQueryRequest
     *        Contains an array of named query IDs.
     * @return Result of the BatchGetNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetNamedQueryResult batchGetNamedQuery(BatchGetNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetNamedQuery(request);
    }

    @SdkInternalApi
    final BatchGetNamedQueryResult executeBatchGetNamedQuery(BatchGetNamedQueryRequest batchGetNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetNamedQueryRequest> request = null;
        Response<BatchGetNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of a single prepared statement or a list of up to 256 prepared statements for the array of
     * prepared statement names that you provide. Requires you to have access to the workgroup to which the prepared
     * statements belong. If a prepared statement cannot be retrieved for the name specified, the statement is listed in
     * <code>UnprocessedPreparedStatementNames</code>.
     * </p>
     * 
     * @param batchGetPreparedStatementRequest
     * @return Result of the BatchGetPreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetPreparedStatement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetPreparedStatementResult batchGetPreparedStatement(BatchGetPreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetPreparedStatement(request);
    }

    @SdkInternalApi
    final BatchGetPreparedStatementResult executeBatchGetPreparedStatement(BatchGetPreparedStatementRequest batchGetPreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetPreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetPreparedStatementRequest> request = null;
        Response<BatchGetPreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetPreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetPreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetPreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetPreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetPreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
     * array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
     * get a list of query execution IDs, use <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     *        Contains an array of query execution IDs.
     * @return Result of the BatchGetQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetQueryExecutionResult batchGetQueryExecution(BatchGetQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetQueryExecution(request);
    }

    @SdkInternalApi
    final BatchGetQueryExecutionResult executeBatchGetQueryExecution(BatchGetQueryExecutionRequest batchGetQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetQueryExecutionRequest> request = null;
        Response<BatchGetQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all
     * users of the same Amazon Web Services account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @return Result of the CreateDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataCatalogResult createDataCatalog(CreateDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataCatalog(request);
    }

    @SdkInternalApi
    final CreateDataCatalogResult executeCreateDataCatalog(CreateDataCatalogRequest createDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataCatalogRequest> request = null;
        Response<CreateDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a named query in the specified workgroup. Requires that you have access to the workgroup.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param createNamedQueryRequest
     * @return Result of the CreateNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateNamedQueryResult createNamedQuery(CreateNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNamedQuery(request);
    }

    @SdkInternalApi
    final CreateNamedQueryResult executeCreateNamedQuery(CreateNamedQueryRequest createNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(createNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNamedQueryRequest> request = null;
        Response<CreateNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty <code>ipynb</code> file in the specified Apache Spark enabled workgroup. Throws an error if a
     * file in the workgroup with the same name already exists.
     * </p>
     * 
     * @param createNotebookRequest
     * @return Result of the CreateNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.CreateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateNotebookResult createNotebook(CreateNotebookRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNotebook(request);
    }

    @SdkInternalApi
    final CreateNotebookResult executeCreateNotebook(CreateNotebookRequest createNotebookRequest) {

        ExecutionContext executionContext = createExecutionContext(createNotebookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotebookRequest> request = null;
        Response<CreateNotebookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotebookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNotebookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNotebook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNotebookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNotebookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a prepared statement for use with SQL queries in Athena.
     * </p>
     * 
     * @param createPreparedStatementRequest
     * @return Result of the CreatePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePreparedStatementResult createPreparedStatement(CreatePreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePreparedStatement(request);
    }

    @SdkInternalApi
    final CreatePreparedStatementResult executeCreatePreparedStatement(CreatePreparedStatementRequest createPreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(createPreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePreparedStatementRequest> request = null;
        Response<CreatePreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an authentication token and the URL at which the notebook can be accessed. During programmatic access,
     * <code>CreatePresignedNotebookUrl</code> must be called every 10 minutes to refresh the authentication token.
     * </p>
     * 
     * @param createPresignedNotebookUrlRequest
     * @return Result of the CreatePresignedNotebookUrl operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.CreatePresignedNotebookUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePresignedNotebookUrl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePresignedNotebookUrlResult createPresignedNotebookUrl(CreatePresignedNotebookUrlRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePresignedNotebookUrl(request);
    }

    @SdkInternalApi
    final CreatePresignedNotebookUrlResult executeCreatePresignedNotebookUrl(CreatePresignedNotebookUrlRequest createPresignedNotebookUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(createPresignedNotebookUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresignedNotebookUrlRequest> request = null;
        Response<CreatePresignedNotebookUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresignedNotebookUrlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPresignedNotebookUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePresignedNotebookUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePresignedNotebookUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePresignedNotebookUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a workgroup with the specified name. Only one of <code>Configurations</code> or
     * <code>Configuration</code> can be specified; <code>Configurations</code> for a workgroup with multi engine
     * support (for example, an Apache Spark enabled workgroup) or <code>Configuration</code> for an Athena SQL
     * workgroup.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @return Result of the CreateWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkGroupResult createWorkGroup(CreateWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkGroup(request);
    }

    @SdkInternalApi
    final CreateWorkGroupResult executeCreateWorkGroup(CreateWorkGroupRequest createWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkGroupRequest> request = null;
        Response<CreateWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @return Result of the DeleteDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataCatalogResult deleteDataCatalog(DeleteDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataCatalog(request);
    }

    @SdkInternalApi
    final DeleteDataCatalogResult executeDeleteDataCatalog(DeleteDataCatalogRequest deleteDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataCatalogRequest> request = null;
        Response<DeleteDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the named query if you have access to the workgroup in which the query was saved.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param deleteNamedQueryRequest
     * @return Result of the DeleteNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNamedQuery(request);
    }

    @SdkInternalApi
    final DeleteNamedQueryResult executeDeleteNamedQuery(DeleteNamedQueryRequest deleteNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamedQueryRequest> request = null;
        Response<DeleteNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified notebook.
     * </p>
     * 
     * @param deleteNotebookRequest
     * @return Result of the DeleteNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.DeleteNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteNotebookResult deleteNotebook(DeleteNotebookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotebook(request);
    }

    @SdkInternalApi
    final DeleteNotebookResult executeDeleteNotebook(DeleteNotebookRequest deleteNotebookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotebookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotebookRequest> request = null;
        Response<DeleteNotebookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotebookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNotebookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotebook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotebookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNotebookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param deletePreparedStatementRequest
     * @return Result of the DeletePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.DeletePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeletePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePreparedStatementResult deletePreparedStatement(DeletePreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePreparedStatement(request);
    }

    @SdkInternalApi
    final DeletePreparedStatementResult executeDeletePreparedStatement(DeletePreparedStatementRequest deletePreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePreparedStatementRequest> request = null;
        Response<DeletePreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @return Result of the DeleteWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkGroupResult deleteWorkGroup(DeleteWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkGroup(request);
    }

    @SdkInternalApi
    final DeleteWorkGroupResult executeDeleteWorkGroup(DeleteWorkGroupRequest deleteWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkGroupRequest> request = null;
        Response<DeleteWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports the specified notebook and its metadata.
     * </p>
     * 
     * @param exportNotebookRequest
     * @return Result of the ExportNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ExportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ExportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportNotebookResult exportNotebook(ExportNotebookRequest request) {
        request = beforeClientExecution(request);
        return executeExportNotebook(request);
    }

    @SdkInternalApi
    final ExportNotebookResult executeExportNotebook(ExportNotebookRequest exportNotebookRequest) {

        ExecutionContext executionContext = createExecutionContext(exportNotebookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportNotebookRequest> request = null;
        Response<ExportNotebookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportNotebookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportNotebookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportNotebook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportNotebookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportNotebookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a previously submitted calculation execution.
     * </p>
     * 
     * @param getCalculationExecutionRequest
     * @return Result of the GetCalculationExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCalculationExecutionResult getCalculationExecution(GetCalculationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetCalculationExecution(request);
    }

    @SdkInternalApi
    final GetCalculationExecutionResult executeGetCalculationExecution(GetCalculationExecutionRequest getCalculationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getCalculationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCalculationExecutionRequest> request = null;
        Response<GetCalculationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCalculationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCalculationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCalculationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCalculationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCalculationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a pre-signed URL to a copy of the code that was executed for the calculation.
     * </p>
     * 
     * @param getCalculationExecutionCodeRequest
     * @return Result of the GetCalculationExecutionCode operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetCalculationExecutionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionCode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCalculationExecutionCodeResult getCalculationExecutionCode(GetCalculationExecutionCodeRequest request) {
        request = beforeClientExecution(request);
        return executeGetCalculationExecutionCode(request);
    }

    @SdkInternalApi
    final GetCalculationExecutionCodeResult executeGetCalculationExecutionCode(GetCalculationExecutionCodeRequest getCalculationExecutionCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(getCalculationExecutionCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCalculationExecutionCodeRequest> request = null;
        Response<GetCalculationExecutionCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCalculationExecutionCodeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCalculationExecutionCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCalculationExecutionCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCalculationExecutionCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCalculationExecutionCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of a current calculation.
     * </p>
     * 
     * @param getCalculationExecutionStatusRequest
     * @return Result of the GetCalculationExecutionStatus operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetCalculationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCalculationExecutionStatusResult getCalculationExecutionStatus(GetCalculationExecutionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetCalculationExecutionStatus(request);
    }

    @SdkInternalApi
    final GetCalculationExecutionStatusResult executeGetCalculationExecutionStatus(GetCalculationExecutionStatusRequest getCalculationExecutionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getCalculationExecutionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCalculationExecutionStatusRequest> request = null;
        Response<GetCalculationExecutionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCalculationExecutionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCalculationExecutionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCalculationExecutionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCalculationExecutionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCalculationExecutionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @return Result of the GetDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataCatalogResult getDataCatalog(GetDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataCatalog(request);
    }

    @SdkInternalApi
    final GetDataCatalogResult executeGetDataCatalog(GetDataCatalogRequest getDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataCatalogRequest> request = null;
        Response<GetDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a database object for the specified database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatabaseResult getDatabase(GetDatabaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatabase(request);
    }

    @SdkInternalApi
    final GetDatabaseResult executeGetDatabase(GetDatabaseRequest getDatabaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabaseRequest> request = null;
        Response<GetDatabaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatabaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatabase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatabaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatabaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a single query. Requires that you have access to the workgroup in which the query was
     * saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @return Result of the GetNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetNamedQueryResult getNamedQuery(GetNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeGetNamedQuery(request);
    }

    @SdkInternalApi
    final GetNamedQueryResult executeGetNamedQuery(GetNamedQueryRequest getNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(getNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamedQueryRequest> request = null;
        Response<GetNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves notebook metadata for the specified notebook ID.
     * </p>
     * 
     * @param getNotebookMetadataRequest
     * @return Result of the GetNotebookMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.GetNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNotebookMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetNotebookMetadataResult getNotebookMetadata(GetNotebookMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetNotebookMetadata(request);
    }

    @SdkInternalApi
    final GetNotebookMetadataResult executeGetNotebookMetadata(GetNotebookMetadataRequest getNotebookMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getNotebookMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNotebookMetadataRequest> request = null;
        Response<GetNotebookMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNotebookMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNotebookMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNotebookMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNotebookMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNotebookMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param getPreparedStatementRequest
     * @return Result of the GetPreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPreparedStatementResult getPreparedStatement(GetPreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeGetPreparedStatement(request);
    }

    @SdkInternalApi
    final GetPreparedStatementResult executeGetPreparedStatement(GetPreparedStatementRequest getPreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(getPreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPreparedStatementRequest> request = null;
        Response<GetPreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a single execution of a query if you have access to the workgroup in which the query
     * ran. Each time a query executes, information about the query execution is saved with a unique ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @return Result of the GetQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueryExecutionResult getQueryExecution(GetQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryExecution(request);
    }

    @SdkInternalApi
    final GetQueryExecutionResult executeGetQueryExecution(GetQueryExecutionRequest getQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryExecutionRequest> request = null;
        Response<GetQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Streams the results of a single query execution specified by <code>QueryExecutionId</code> from the Athena query
     * results location in Amazon S3. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> in the <i>Amazon Athena User
     * Guide</i>. This request does not execute the query but returns results. Use <a>StartQueryExecution</a> to run a
     * query.
     * </p>
     * <p>
     * To stream query results successfully, the IAM principal with permission to call <code>GetQueryResults</code> also
     * must have permissions to the Amazon S3 <code>GetObject</code> action for the Athena query results location.
     * </p>
     * <important>
     * <p>
     * IAM principals with permission to the Amazon S3 <code>GetObject</code> action for the query results location are
     * able to retrieve query results from Amazon S3 even if permission to the <code>GetQueryResults</code> action is
     * denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are
     * denied.
     * </p>
     * </important>
     * 
     * @param getQueryResultsRequest
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryResults(request);
    }

    @SdkInternalApi
    final GetQueryResultsResult executeGetQueryResults(GetQueryResultsRequest getQueryResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryResultsRequest> request = null;
        Response<GetQueryResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns query execution runtime statistics related to a single execution of a query if you have access to the
     * workgroup in which the query ran. Query execution runtime statistics are returned only when
     * <a>QueryExecutionStatus$State</a> is in a SUCCEEDED or FAILED state. Stage-level input and output row count and
     * data size statistics are not shown when a query has row-level filters defined in Lake Formation.
     * </p>
     * 
     * @param getQueryRuntimeStatisticsRequest
     * @return Result of the GetQueryRuntimeStatistics operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetQueryRuntimeStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryRuntimeStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetQueryRuntimeStatisticsResult getQueryRuntimeStatistics(GetQueryRuntimeStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryRuntimeStatistics(request);
    }

    @SdkInternalApi
    final GetQueryRuntimeStatisticsResult executeGetQueryRuntimeStatistics(GetQueryRuntimeStatisticsRequest getQueryRuntimeStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryRuntimeStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryRuntimeStatisticsRequest> request = null;
        Response<GetQueryRuntimeStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryRuntimeStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getQueryRuntimeStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryRuntimeStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryRuntimeStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetQueryRuntimeStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the full details of a previously created session, including the session status and configuration.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSessionResult getSession(GetSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSession(request);
    }

    @SdkInternalApi
    final GetSessionResult executeGetSession(GetSessionRequest getSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionRequest> request = null;
        Response<GetSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the current status of a session.
     * </p>
     * 
     * @param getSessionStatusRequest
     * @return Result of the GetSessionStatus operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetSessionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSessionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSessionStatusResult getSessionStatus(GetSessionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetSessionStatus(request);
    }

    @SdkInternalApi
    final GetSessionStatusResult executeGetSessionStatus(GetSessionStatusRequest getSessionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionStatusRequest> request = null;
        Response<GetSessionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSessionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSessionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSessionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @return Result of the GetTableMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.GetTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTableMetadataResult getTableMetadata(GetTableMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetTableMetadata(request);
    }

    @SdkInternalApi
    final GetTableMetadataResult executeGetTableMetadata(GetTableMetadataRequest getTableMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getTableMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableMetadataRequest> request = null;
        Response<GetTableMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTableMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTableMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTableMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTableMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @return Result of the GetWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkGroupResult getWorkGroup(GetWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkGroup(request);
    }

    @SdkInternalApi
    final GetWorkGroupResult executeGetWorkGroup(GetWorkGroupRequest getWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkGroupRequest> request = null;
        Response<GetWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a single <code>ipynb</code> file to a Spark enabled workgroup. The maximum file size that can be imported
     * is 10 megabytes. If an <code>ipynb</code> file with the same name already exists in the workgroup, throws an
     * error.
     * </p>
     * 
     * @param importNotebookRequest
     * @return Result of the ImportNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ImportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ImportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportNotebookResult importNotebook(ImportNotebookRequest request) {
        request = beforeClientExecution(request);
        return executeImportNotebook(request);
    }

    @SdkInternalApi
    final ImportNotebookResult executeImportNotebook(ImportNotebookRequest importNotebookRequest) {

        ExecutionContext executionContext = createExecutionContext(importNotebookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportNotebookRequest> request = null;
        Response<ImportNotebookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportNotebookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importNotebookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportNotebook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportNotebookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportNotebookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the supported DPU sizes for the supported application runtimes (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @param listApplicationDPUSizesRequest
     * @return Result of the ListApplicationDPUSizes operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ListApplicationDPUSizes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListApplicationDPUSizes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListApplicationDPUSizesResult listApplicationDPUSizes(ListApplicationDPUSizesRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationDPUSizes(request);
    }

    @SdkInternalApi
    final ListApplicationDPUSizesResult executeListApplicationDPUSizes(ListApplicationDPUSizesRequest listApplicationDPUSizesRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationDPUSizesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationDPUSizesRequest> request = null;
        Response<ListApplicationDPUSizesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationDPUSizesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationDPUSizesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationDPUSizes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationDPUSizesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationDPUSizesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the calculations that have been submitted to a session in descending order. Newer calculations are listed
     * first; older calculations are listed later.
     * </p>
     * 
     * @param listCalculationExecutionsRequest
     * @return Result of the ListCalculationExecutions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListCalculationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListCalculationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCalculationExecutionsResult listCalculationExecutions(ListCalculationExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCalculationExecutions(request);
    }

    @SdkInternalApi
    final ListCalculationExecutionsResult executeListCalculationExecutions(ListCalculationExecutionsRequest listCalculationExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCalculationExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCalculationExecutionsRequest> request = null;
        Response<ListCalculationExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCalculationExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCalculationExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCalculationExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCalculationExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCalculationExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data catalogs in the current Amazon Web Services account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @return Result of the ListDataCatalogs operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListDataCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDataCatalogs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataCatalogsResult listDataCatalogs(ListDataCatalogsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataCatalogs(request);
    }

    @SdkInternalApi
    final ListDataCatalogsResult executeListDataCatalogs(ListDataCatalogsRequest listDataCatalogsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataCatalogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataCatalogsRequest> request = null;
        Response<ListDataCatalogsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataCatalogsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataCatalogsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataCatalogs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataCatalogsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataCatalogsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDatabases" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of engine versions that are available to choose from, including the Auto option.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return Result of the ListEngineVersions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEngineVersionsResult listEngineVersions(ListEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEngineVersions(request);
    }

    @SdkInternalApi
    final ListEngineVersionsResult executeListEngineVersions(ListEngineVersionsRequest listEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEngineVersionsRequest> request = null;
        Response<ListEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEngineVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEngineVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEngineVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists, in descending order, the executors that have been submitted to a session. Newer executors are listed
     * first; older executors are listed later. The result can be optionally filtered by state.
     * </p>
     * 
     * @param listExecutorsRequest
     * @return Result of the ListExecutors operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListExecutors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListExecutors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExecutorsResult listExecutors(ListExecutorsRequest request) {
        request = beforeClientExecution(request);
        return executeListExecutors(request);
    }

    @SdkInternalApi
    final ListExecutorsResult executeListExecutors(ListExecutorsRequest listExecutorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExecutorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExecutorsRequest> request = null;
        Response<ListExecutorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExecutorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExecutorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExecutors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExecutorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExecutorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
     * access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary
     * workgroup.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listNamedQueriesRequest
     * @return Result of the ListNamedQueries operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListNamedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNamedQueries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNamedQueriesResult listNamedQueries(ListNamedQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListNamedQueries(request);
    }

    @SdkInternalApi
    final ListNamedQueriesResult executeListNamedQueries(ListNamedQueriesRequest listNamedQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNamedQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamedQueriesRequest> request = null;
        Response<ListNamedQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamedQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNamedQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNamedQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNamedQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNamedQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the notebook files for the specified workgroup in paginated format.
     * </p>
     * 
     * @param listNotebookMetadataRequest
     * @return Result of the ListNotebookMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ListNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNotebookMetadataResult listNotebookMetadata(ListNotebookMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeListNotebookMetadata(request);
    }

    @SdkInternalApi
    final ListNotebookMetadataResult executeListNotebookMetadata(ListNotebookMetadataRequest listNotebookMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotebookMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotebookMetadataRequest> request = null;
        Response<ListNotebookMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotebookMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotebookMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotebookMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotebookMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNotebookMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists, in descending order, the sessions that have been created in a notebook that are in an active state like
     * <code>CREATING</code>, <code>CREATED</code>, <code>IDLE</code> or <code>BUSY</code>. Newer sessions are listed
     * first; older sessions are listed later.
     * </p>
     * 
     * @param listNotebookSessionsRequest
     * @return Result of the ListNotebookSessions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListNotebookSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookSessions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNotebookSessionsResult listNotebookSessions(ListNotebookSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotebookSessions(request);
    }

    @SdkInternalApi
    final ListNotebookSessionsResult executeListNotebookSessions(ListNotebookSessionsRequest listNotebookSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotebookSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotebookSessionsRequest> request = null;
        Response<ListNotebookSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotebookSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotebookSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotebookSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotebookSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNotebookSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the prepared statements in the specified workgroup.
     * </p>
     * 
     * @param listPreparedStatementsRequest
     * @return Result of the ListPreparedStatements operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListPreparedStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListPreparedStatements" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPreparedStatementsResult listPreparedStatements(ListPreparedStatementsRequest request) {
        request = beforeClientExecution(request);
        return executeListPreparedStatements(request);
    }

    @SdkInternalApi
    final ListPreparedStatementsResult executeListPreparedStatements(ListPreparedStatementsRequest listPreparedStatementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPreparedStatementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPreparedStatementsRequest> request = null;
        Response<ListPreparedStatementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPreparedStatementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPreparedStatementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPreparedStatements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPreparedStatementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPreparedStatementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is
     * not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to
     * the workgroup in which the queries ran.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listQueryExecutionsRequest
     * @return Result of the ListQueryExecutions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListQueryExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListQueryExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueryExecutionsResult listQueryExecutions(ListQueryExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListQueryExecutions(request);
    }

    @SdkInternalApi
    final ListQueryExecutionsResult executeListQueryExecutions(ListQueryExecutionsRequest listQueryExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueryExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueryExecutionsRequest> request = null;
        Response<ListQueryExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueryExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueryExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueryExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueryExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueryExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the sessions in a workgroup that are in an active state like <code>CREATING</code>, <code>CREATED</code>,
     * <code>IDLE</code>, or <code>BUSY</code>. Newer sessions are listed first; older sessions are listed later.
     * </p>
     * 
     * @param listSessionsRequest
     * @return Result of the ListSessions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSessionsResult listSessions(ListSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSessions(request);
    }

    @SdkInternalApi
    final ListSessionsResult executeListSessions(ListSessionsRequest listSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSessionsRequest> request = null;
        Response<ListSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @return Result of the ListTableMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.ListTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTableMetadataResult listTableMetadata(ListTableMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeListTableMetadata(request);
    }

    @SdkInternalApi
    final ListTableMetadataResult executeListTableMetadata(ListTableMetadataRequest listTableMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(listTableMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTableMetadataRequest> request = null;
        Response<ListTableMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTableMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTableMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTableMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTableMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTableMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags associated with an Athena workgroup or data catalog resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
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
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @return Result of the ListWorkGroups operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListWorkGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListWorkGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkGroupsResult listWorkGroups(ListWorkGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkGroups(request);
    }

    @SdkInternalApi
    final ListWorkGroupsResult executeListWorkGroups(ListWorkGroupsRequest listWorkGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkGroupsRequest> request = null;
        Response<ListWorkGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Submits calculations for execution within a session. You can supply the code to run as an inline code block
     * within the request or as an Amazon S3 URL.
     * </p>
     * 
     * @param startCalculationExecutionRequest
     * @return Result of the StartCalculationExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.StartCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartCalculationExecutionResult startCalculationExecution(StartCalculationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartCalculationExecution(request);
    }

    @SdkInternalApi
    final StartCalculationExecutionResult executeStartCalculationExecution(StartCalculationExecutionRequest startCalculationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startCalculationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCalculationExecutionRequest> request = null;
        Response<StartCalculationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCalculationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startCalculationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCalculationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCalculationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartCalculationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs the SQL query statements contained in the <code>Query</code>. Requires you to have access to the workgroup
     * in which the query ran. Running queries against an external catalog requires <a>GetDataCatalog</a> permission to
     * the catalog. For code samples using the Amazon Web Services SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param startQueryExecutionRequest
     * @return Result of the StartQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.StartQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartQueryExecutionResult startQueryExecution(StartQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartQueryExecution(request);
    }

    @SdkInternalApi
    final StartQueryExecutionResult executeStartQueryExecution(StartQueryExecutionRequest startQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartQueryExecutionRequest> request = null;
        Response<StartQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a session for running calculations within a workgroup. The session is ready when it reaches an
     * <code>IDLE</code> state.
     * </p>
     * 
     * @param startSessionRequest
     * @return Result of the StartSession operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @throws SessionAlreadyExistsException
     *         The specified session already exists.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartSessionResult startSession(StartSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartSession(request);
    }

    @SdkInternalApi
    final StartSessionResult executeStartSession(StartSessionRequest startSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSessionRequest> request = null;
        Response<StartSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests the cancellation of a calculation. A <code>StopCalculationExecution</code> call on a calculation that is
     * already in a terminal state (for example, <code>STOPPED</code>, <code>FAILED</code>, or <code>COMPLETED</code>)
     * succeeds but has no effect.
     * </p>
     * <note>
     * <p>
     * Cancelling a calculation is done on a best effort basis. If a calculation cannot be cancelled, you can be charged
     * for its completion. If you are concerned about being charged for a calculation that cannot be cancelled, consider
     * terminating the session in which the calculation is running.
     * </p>
     * </note>
     * 
     * @param stopCalculationExecutionRequest
     * @return Result of the StopCalculationExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.StopCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopCalculationExecutionResult stopCalculationExecution(StopCalculationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStopCalculationExecution(request);
    }

    @SdkInternalApi
    final StopCalculationExecutionResult executeStopCalculationExecution(StopCalculationExecutionRequest stopCalculationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCalculationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCalculationExecutionRequest> request = null;
        Response<StopCalculationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCalculationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopCalculationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopCalculationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCalculationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopCalculationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a query execution. Requires you to have access to the workgroup in which the query ran.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param stopQueryExecutionRequest
     * @return Result of the StopQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.StopQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopQueryExecutionResult stopQueryExecution(StopQueryExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStopQueryExecution(request);
    }

    @SdkInternalApi
    final StopQueryExecutionResult executeStopQueryExecution(StopQueryExecutionRequest stopQueryExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopQueryExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopQueryExecutionRequest> request = null;
        Response<StopQueryExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopQueryExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopQueryExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopQueryExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopQueryExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopQueryExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. In Athena, a
     * resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you
     * define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or
     * environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs
     * in your account. For best practices, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">Tagging Best Practices</a>. Tag
     * keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
     * Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys
     * and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate
     * them by commas.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
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
     * Terminates an active session. A <code>TerminateSession</code> call on a session that is already inactive (for
     * example, in a <code>FAILED</code>, <code>TERMINATED</code> or <code>TERMINATING</code> state) succeeds but has no
     * effect. Calculations running in the session when <code>TerminateSession</code> is called are forcefully stopped,
     * but may display as <code>FAILED</code> instead of <code>STOPPED</code>.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return Result of the TerminateSession operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TerminateSessionResult terminateSession(TerminateSessionRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateSession(request);
    }

    @SdkInternalApi
    final TerminateSessionResult executeTerminateSession(TerminateSessionRequest terminateSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateSessionRequest> request = null;
        Response<TerminateSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
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
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @return Result of the UpdateDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDataCatalogResult updateDataCatalog(UpdateDataCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataCatalog(request);
    }

    @SdkInternalApi
    final UpdateDataCatalogResult executeUpdateDataCatalog(UpdateDataCatalogRequest updateDataCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataCatalogRequest> request = null;
        Response<UpdateDataCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <a>NamedQuery</a> object. The database or workgroup cannot be updated.
     * </p>
     * 
     * @param updateNamedQueryRequest
     * @return Result of the UpdateNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateNamedQueryResult updateNamedQuery(UpdateNamedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNamedQuery(request);
    }

    @SdkInternalApi
    final UpdateNamedQueryResult executeUpdateNamedQuery(UpdateNamedQueryRequest updateNamedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNamedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNamedQueryRequest> request = null;
        Response<UpdateNamedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNamedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNamedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNamedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNamedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNamedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the contents of a Spark notebook.
     * </p>
     * 
     * @param updateNotebookRequest
     * @return Result of the UpdateNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.UpdateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateNotebookResult updateNotebook(UpdateNotebookRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotebook(request);
    }

    @SdkInternalApi
    final UpdateNotebookResult executeUpdateNotebook(UpdateNotebookRequest updateNotebookRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotebookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotebookRequest> request = null;
        Response<UpdateNotebookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotebookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNotebookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotebook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotebookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNotebookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the metadata for a notebook.
     * </p>
     * 
     * @param updateNotebookMetadataRequest
     * @return Result of the UpdateNotebookMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.UpdateNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateNotebookMetadataResult updateNotebookMetadata(UpdateNotebookMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotebookMetadata(request);
    }

    @SdkInternalApi
    final UpdateNotebookMetadataResult executeUpdateNotebookMetadata(UpdateNotebookMetadataRequest updateNotebookMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotebookMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotebookMetadataRequest> request = null;
        Response<UpdateNotebookMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotebookMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNotebookMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotebookMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotebookMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNotebookMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a prepared statement.
     * </p>
     * 
     * @param updatePreparedStatementRequest
     * @return Result of the UpdatePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.UpdatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePreparedStatementResult updatePreparedStatement(UpdatePreparedStatementRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePreparedStatement(request);
    }

    @SdkInternalApi
    final UpdatePreparedStatementResult executeUpdatePreparedStatement(UpdatePreparedStatementRequest updatePreparedStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePreparedStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePreparedStatementRequest> request = null;
        Response<UpdatePreparedStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePreparedStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePreparedStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePreparedStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePreparedStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePreparedStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed. Only one of
     * <code>ConfigurationsUpdates</code> or <code>ConfigurationUpdates</code> can be specified;
     * <code>ConfigurationsUpdates</code> for a workgroup with multi engine support (for example, an Apache Spark
     * enabled workgroup) or <code>ConfigurationUpdates</code> for an Athena SQL workgroup.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @return Result of the UpdateWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkGroupResult updateWorkGroup(UpdateWorkGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkGroup(request);
    }

    @SdkInternalApi
    final UpdateWorkGroupResult executeUpdateWorkGroup(UpdateWorkGroupRequest updateWorkGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkGroupRequest> request = null;
        Response<UpdateWorkGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Athena");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkGroupResultJsonUnmarshaller());
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
