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
package com.amazonaws.services.rdsdata;

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

import com.amazonaws.services.rdsdata.AWSRDSDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.rdsdata.model.*;
import com.amazonaws.services.rdsdata.model.transform.*;

/**
 * Client for accessing AWS RDS DataService. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * <fullname>Amazon RDS Data Service</fullname>
 * <p>
 * Amazon RDS provides an HTTP endpoint to run SQL statements on an Amazon Aurora Serverless DB cluster. To run these
 * statements, you work with the Data Service API.
 * </p>
 * <p>
 * For more information about the Data Service API, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
 * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * <note>
 * <p>
 * If you have questions or comments related to the Data API, send email to <a
 * href="mailto:Rds-data-api-feedback@amazon.com">Rds-data-api-feedback@amazon.com</a>.
 * </p>
 * </note></p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRDSDataClient extends AmazonWebServiceClient implements AWSRDSData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRDSData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rds-data";

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rdsdata.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rdsdata.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableError").withExceptionUnmarshaller(
                                    com.amazonaws.services.rdsdata.model.transform.ServiceUnavailableErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StatementTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rdsdata.model.transform.StatementTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rdsdata.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rdsdata.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.rdsdata.model.AWSRDSDataException.class));

    public static AWSRDSDataClientBuilder builder() {
        return AWSRDSDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS RDS DataService using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRDSDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS RDS DataService using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRDSDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("rds-data.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/rdsdata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/rdsdata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Runs a batch SQL statement over an array of data.
     * </p>
     * <p>
     * You can run bulk update and insert operations for multiple records using a DML statement with different parameter
     * sets. Bulk operations can provide a significant performance improvement over individual insert and update
     * operations.
     * </p>
     * <important>
     * <p>
     * If a call isn't part of a transaction because it doesn't include the <code>transactionID</code> parameter,
     * changes that result from the call are committed automatically.
     * </p>
     * </important>
     * 
     * @param batchExecuteStatementRequest
     *        The request parameters represent the input of a SQL statement over an array of data.
     * @return Result of the BatchExecuteStatement operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.BatchExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BatchExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchExecuteStatementResult batchExecuteStatement(BatchExecuteStatementRequest request) {
        request = beforeClientExecution(request);
        return executeBatchExecuteStatement(request);
    }

    @SdkInternalApi
    final BatchExecuteStatementResult executeBatchExecuteStatement(BatchExecuteStatementRequest batchExecuteStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(batchExecuteStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchExecuteStatementRequest> request = null;
        Response<BatchExecuteStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchExecuteStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchExecuteStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchExecuteStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchExecuteStatementResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchExecuteStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a SQL transaction.
     * </p>
     * 
     * <pre>
     * <code> &lt;important&gt; &lt;p&gt;A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours.&lt;/p&gt; &lt;p&gt;A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically.&lt;/p&gt; &lt;p&gt;DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate &lt;code&gt;ExecuteStatement&lt;/code&gt; call with &lt;code&gt;continueAfterTimeout&lt;/code&gt; enabled.&lt;/p&gt; &lt;/important&gt; </code>
     * </pre>
     * 
     * @param beginTransactionRequest
     *        The request parameters represent the input of a request to start a SQL transaction.
     * @return Result of the BeginTransaction operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.BeginTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BeginTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BeginTransactionResult beginTransaction(BeginTransactionRequest request) {
        request = beforeClientExecution(request);
        return executeBeginTransaction(request);
    }

    @SdkInternalApi
    final BeginTransactionResult executeBeginTransaction(BeginTransactionRequest beginTransactionRequest) {

        ExecutionContext executionContext = createExecutionContext(beginTransactionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BeginTransactionRequest> request = null;
        Response<BeginTransactionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BeginTransactionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(beginTransactionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BeginTransaction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BeginTransactionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BeginTransactionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ends a SQL transaction started with the <code>BeginTransaction</code> operation and commits the changes.
     * </p>
     * 
     * @param commitTransactionRequest
     *        The request parameters represent the input of a commit transaction request.
     * @return Result of the CommitTransaction operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @throws NotFoundException
     *         The <code>resourceArn</code>, <code>secretArn</code>, or <code>transactionId</code> value can't be found.
     * @sample AWSRDSData.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/CommitTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CommitTransactionResult commitTransaction(CommitTransactionRequest request) {
        request = beforeClientExecution(request);
        return executeCommitTransaction(request);
    }

    @SdkInternalApi
    final CommitTransactionResult executeCommitTransaction(CommitTransactionRequest commitTransactionRequest) {

        ExecutionContext executionContext = createExecutionContext(commitTransactionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CommitTransactionRequest> request = null;
        Response<CommitTransactionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CommitTransactionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(commitTransactionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CommitTransaction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CommitTransactionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CommitTransactionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs one or more SQL statements.
     * </p>
     * <important>
     * <p>
     * This operation is deprecated. Use the <code>BatchExecuteStatement</code> or <code>ExecuteStatement</code>
     * operation.
     * </p>
     * </important>
     * 
     * @param executeSqlRequest
     *        The request parameters represent the input of a request to run one or more SQL statements.
     * @return Result of the ExecuteSql operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public ExecuteSqlResult executeSql(ExecuteSqlRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteSql(request);
    }

    @SdkInternalApi
    final ExecuteSqlResult executeExecuteSql(ExecuteSqlRequest executeSqlRequest) {

        ExecutionContext executionContext = createExecutionContext(executeSqlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteSqlRequest> request = null;
        Response<ExecuteSqlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteSqlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(executeSqlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteSql");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteSqlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExecuteSqlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs a SQL statement against a database.
     * </p>
     * <important>
     * <p>
     * If a call isn't part of a transaction because it doesn't include the <code>transactionID</code> parameter,
     * changes that result from the call are committed automatically.
     * </p>
     * </important>
     * <p>
     * The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over
     * 1,000 records, the call is terminated.
     * </p>
     * 
     * @param executeStatementRequest
     *        The request parameters represent the input of a request to run a SQL statement against a database.
     * @return Result of the ExecuteStatement operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteStatement" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS Data");
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
     * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
     * </p>
     * 
     * @param rollbackTransactionRequest
     *        The request parameters represent the input of a request to perform a rollback of a transaction.
     * @return Result of the RollbackTransaction operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @throws NotFoundException
     *         The <code>resourceArn</code>, <code>secretArn</code>, or <code>transactionId</code> value can't be found.
     * @sample AWSRDSData.RollbackTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/RollbackTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RollbackTransactionResult rollbackTransaction(RollbackTransactionRequest request) {
        request = beforeClientExecution(request);
        return executeRollbackTransaction(request);
    }

    @SdkInternalApi
    final RollbackTransactionResult executeRollbackTransaction(RollbackTransactionRequest rollbackTransactionRequest) {

        ExecutionContext executionContext = createExecutionContext(rollbackTransactionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RollbackTransactionRequest> request = null;
        Response<RollbackTransactionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RollbackTransactionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rollbackTransactionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RollbackTransaction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RollbackTransactionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RollbackTransactionResultJsonUnmarshaller());
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
