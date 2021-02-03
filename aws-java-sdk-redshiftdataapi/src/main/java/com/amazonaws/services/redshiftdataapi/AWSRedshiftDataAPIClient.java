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
package com.amazonaws.services.redshiftdataapi;

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

import com.amazonaws.services.redshiftdataapi.AWSRedshiftDataAPIClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.redshiftdataapi.model.*;
import com.amazonaws.services.redshiftdataapi.model.transform.*;

/**
 * Client for accessing Redshift Data API Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * You can use the Amazon Redshift Data API to run queries on Amazon Redshift tables. You can run individual SQL
 * statements, which are committed if the statement succeeds.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRedshiftDataAPIClient extends AmazonWebServiceClient implements AWSRedshiftDataAPI {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRedshiftDataAPI.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "redshift-data";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftdataapi.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftdataapi.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftdataapi.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExecuteStatementException").withExceptionUnmarshaller(
                                    com.amazonaws.services.redshiftdataapi.model.transform.ExecuteStatementExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.redshiftdataapi.model.AWSRedshiftDataAPIException.class));

    public static AWSRedshiftDataAPIClientBuilder builder() {
        return AWSRedshiftDataAPIClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Redshift Data API Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRedshiftDataAPIClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Redshift Data API Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRedshiftDataAPIClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("redshift-data.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/redshiftdataapi/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/redshiftdataapi/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a running query. To be canceled, a query must be running.
     * </p>
     * 
     * @param cancelStatementRequest
     * @return Result of the CancelStatement operation returned by the service.
     * @throws ResourceNotFoundException
     *         The Amazon Redshift Data API operation failed due to a missing resource.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.CancelStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/CancelStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelStatementResult cancelStatement(CancelStatementRequest request) {
        request = beforeClientExecution(request);
        return executeCancelStatement(request);
    }

    @SdkInternalApi
    final CancelStatementResult executeCancelStatement(CancelStatementRequest cancelStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelStatementRequest> request = null;
        Response<CancelStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the details about a specific instance when a query was run by the Amazon Redshift Data API. The
     * information includes when the query started, when it finished, the query status, the number of rows returned, and
     * the SQL statement.
     * </p>
     * 
     * @param describeStatementRequest
     * @return Result of the DescribeStatement operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws ResourceNotFoundException
     *         The Amazon Redshift Data API operation failed due to a missing resource.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.DescribeStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeStatement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStatementResult describeStatement(DescribeStatementRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStatement(request);
    }

    @SdkInternalApi
    final DescribeStatementResult executeDescribeStatement(DescribeStatementRequest describeStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStatementRequest> request = null;
        Response<DescribeStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the detailed information about a table from metadata in the cluster. The information includes its
     * columns. A token is returned to page through the column list. Depending on the authorization method, use one of
     * the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeTableRequest
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeTable" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs an SQL statement, which can be data manipulation language (DML) or data definition language (DDL). This
     * statement must be a single SQL statement. Depending on the authorization method, use one of the following
     * combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executeStatementRequest
     * @return Result of the ExecuteStatement operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws ExecuteStatementException
     *         The SQL statement encountered an environmental error while running.
     * @sample AWSRedshiftDataAPI.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ExecuteStatementResult executeStatement(ExecuteStatementRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteStatement(request);
    }

    @SdkInternalApi
    final ExecuteStatementResult executeExecuteStatement(ExecuteStatementRequest executeStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(executeStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteStatementRequest> request = null;
        Response<ExecuteStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(executeStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExecuteStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetches the temporarily cached result of an SQL statement. A token is returned to page through the statement
     * results.
     * </p>
     * 
     * @param getStatementResultRequest
     * @return Result of the GetStatementResult operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws ResourceNotFoundException
     *         The Amazon Redshift Data API operation failed due to a missing resource.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.GetStatementResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/GetStatementResult"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStatementResultResult getStatementResult(GetStatementResultRequest request) {
        request = beforeClientExecution(request);
        return executeGetStatementResult(request);
    }

    @SdkInternalApi
    final GetStatementResultResult executeGetStatementResult(GetStatementResultRequest getStatementResultRequest) {

        ExecutionContext executionContext = createExecutionContext(getStatementResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStatementResultRequest> request = null;
        Response<GetStatementResultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStatementResultRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStatementResultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStatementResult");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStatementResultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStatementResultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the databases in a cluster. A token is returned to page through the database list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListDatabases" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
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
     * Lists the schemas in a database. A token is returned to page through the schema list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchemasResult listSchemas(ListSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemas(request);
    }

    @SdkInternalApi
    final ListSchemasResult executeListSchemas(ListSchemasRequest listSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemasRequest> request = null;
        Response<ListSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List of SQL statements. By default, only finished statements are shown. A token is returned to page through the
     * statement list.
     * </p>
     * 
     * @param listStatementsRequest
     * @return Result of the ListStatements operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListStatements" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStatementsResult listStatements(ListStatementsRequest request) {
        request = beforeClientExecution(request);
        return executeListStatements(request);
    }

    @SdkInternalApi
    final ListStatementsResult executeListStatements(ListStatementsRequest listStatementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStatementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStatementsRequest> request = null;
        Response<ListStatementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStatementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStatementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStatements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStatementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStatementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tables in a database. If neither <code>SchemaPattern</code> nor <code>TablePattern</code> are specified,
     * then all tables in the database are returned. A token is returned to page through the table list. Depending on
     * the authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListTables" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTablesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTablesResultJsonUnmarshaller());
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
