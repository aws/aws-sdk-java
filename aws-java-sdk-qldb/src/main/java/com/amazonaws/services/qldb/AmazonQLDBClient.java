/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldb;

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

import com.amazonaws.services.qldb.AmazonQLDBClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.services.qldb.model.transform.*;

/**
 * Client for accessing QLDB. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * The control plane for Amazon QLDB
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonQLDBClient extends AmazonWebServiceClient implements AmazonQLDB {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonQLDB.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "qldb";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourcePreconditionNotMetException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qldb.model.transform.ResourcePreconditionNotMetExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qldb.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qldb.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qldb.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qldb.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qldb.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.qldb.model.AmazonQLDBException.class));

    public static AmazonQLDBClientBuilder builder() {
        return AmazonQLDBClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on QLDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonQLDBClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on QLDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonQLDBClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("qldb.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/qldb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/qldb/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new ledger in your AWS account.
     * </p>
     * 
     * @param createLedgerRequest
     * @return Result of the CreateLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         You have reached the limit on the maximum number of resources allowed.
     * @throws ResourceInUseException
     *         The specified resource can't be modified at this time.
     * @sample AmazonQLDB.CreateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/CreateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLedgerResult createLedger(CreateLedgerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLedger(request);
    }

    @SdkInternalApi
    final CreateLedgerResult executeCreateLedger(CreateLedgerRequest createLedgerRequest) {

        ExecutionContext executionContext = createExecutionContext(createLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLedgerRequest> request = null;
        Response<CreateLedgerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLedgerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLedgerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLedger");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLedgerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLedgerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a ledger and all of its contents. This action is irreversible.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @param deleteLedgerRequest
     * @return Result of the DeleteLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceInUseException
     *         The specified resource can't be modified at this time.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.DeleteLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DeleteLedger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLedgerResult deleteLedger(DeleteLedgerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLedger(request);
    }

    @SdkInternalApi
    final DeleteLedgerResult executeDeleteLedger(DeleteLedgerRequest deleteLedgerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLedgerRequest> request = null;
        Response<DeleteLedgerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLedgerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLedgerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLedger");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLedgerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLedgerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a journal export job, including the ledger name, export ID, when it was created,
     * current status, and its start and end time export parameters.
     * </p>
     * <p>
     * If the export job with the given <code>ExportId</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param describeJournalS3ExportRequest
     * @return Result of the DescribeJournalS3Export operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.DescribeJournalS3Export
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeJournalS3Export" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeJournalS3ExportResult describeJournalS3Export(DescribeJournalS3ExportRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJournalS3Export(request);
    }

    @SdkInternalApi
    final DescribeJournalS3ExportResult executeDescribeJournalS3Export(DescribeJournalS3ExportRequest describeJournalS3ExportRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJournalS3ExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJournalS3ExportRequest> request = null;
        Response<DescribeJournalS3ExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJournalS3ExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeJournalS3ExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJournalS3Export");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJournalS3ExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeJournalS3ExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a ledger, including its state and when it was created.
     * </p>
     * 
     * @param describeLedgerRequest
     * @return Result of the DescribeLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.DescribeLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeLedger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeLedgerResult describeLedger(DescribeLedgerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLedger(request);
    }

    @SdkInternalApi
    final DescribeLedgerResult executeDescribeLedger(DescribeLedgerRequest describeLedgerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLedgerRequest> request = null;
        Response<DescribeLedgerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLedgerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLedgerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLedger");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLedgerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLedgerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage
     * Service (Amazon S3) bucket. The data is written as files in Amazon Ion format.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export
     * requests throw <code>LimitExceededException</code>.
     * </p>
     * 
     * @param exportJournalToS3Request
     * @return Result of the ExportJournalToS3 operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.ExportJournalToS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ExportJournalToS3" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportJournalToS3Result exportJournalToS3(ExportJournalToS3Request request) {
        request = beforeClientExecution(request);
        return executeExportJournalToS3(request);
    }

    @SdkInternalApi
    final ExportJournalToS3Result executeExportJournalToS3(ExportJournalToS3Request exportJournalToS3Request) {

        ExecutionContext executionContext = createExecutionContext(exportJournalToS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportJournalToS3Request> request = null;
        Response<ExportJournalToS3Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportJournalToS3RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportJournalToS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportJournalToS3");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportJournalToS3Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportJournalToS3ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a journal block object at a specified address in a ledger. Also returns a proof of the specified block
     * for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * <p>
     * If the specified ledger doesn't exist or is in <code>DELETING</code> status, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the specified ledger is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * If no block exists with the specified address, then throws <code>InvalidParameterException</code>.
     * </p>
     * 
     * @param getBlockRequest
     * @return Result of the GetBlock operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.GetBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetBlock" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBlockResult getBlock(GetBlockRequest request) {
        request = beforeClientExecution(request);
        return executeGetBlock(request);
    }

    @SdkInternalApi
    final GetBlockResult executeGetBlock(GetBlockRequest getBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(getBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlockRequest> request = null;
        Response<GetBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBlockResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBlockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash
     * value and a block address.
     * </p>
     * 
     * @param getDigestRequest
     * @return Result of the GetDigest operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.GetDigest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetDigest" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDigestResult getDigest(GetDigestRequest request) {
        request = beforeClientExecution(request);
        return executeGetDigest(request);
    }

    @SdkInternalApi
    final GetDigestResult executeGetDigest(GetDigestRequest getDigestRequest) {

        ExecutionContext executionContext = createExecutionContext(getDigestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDigestRequest> request = null;
        Response<GetDigestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDigestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDigestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDigest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDigestResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDigestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a revision data object for a specified document ID and block address. Also returns a proof of the
     * specified revision for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * 
     * @param getRevisionRequest
     * @return Result of the GetRevision operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetRevision" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
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
     * Returns an array of journal export job descriptions for all ledgers that are associated with the current AWS
     * account and Region.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is paginated so that you can retrieve all the
     * items by calling <code>ListJournalS3Exports</code> multiple times.
     * </p>
     * 
     * @param listJournalS3ExportsRequest
     * @return Result of the ListJournalS3Exports operation returned by the service.
     * @sample AmazonQLDB.ListJournalS3Exports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3Exports" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJournalS3ExportsResult listJournalS3Exports(ListJournalS3ExportsRequest request) {
        request = beforeClientExecution(request);
        return executeListJournalS3Exports(request);
    }

    @SdkInternalApi
    final ListJournalS3ExportsResult executeListJournalS3Exports(ListJournalS3ExportsRequest listJournalS3ExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJournalS3ExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJournalS3ExportsRequest> request = null;
        Response<ListJournalS3ExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJournalS3ExportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJournalS3ExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJournalS3Exports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJournalS3ExportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJournalS3ExportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of journal export job descriptions for a specified ledger.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is paginated so that you can retrieve all the
     * items by calling <code>ListJournalS3ExportsForLedger</code> multiple times.
     * </p>
     * 
     * @param listJournalS3ExportsForLedgerRequest
     * @return Result of the ListJournalS3ExportsForLedger operation returned by the service.
     * @sample AmazonQLDB.ListJournalS3ExportsForLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3ExportsForLedger"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedger(ListJournalS3ExportsForLedgerRequest request) {
        request = beforeClientExecution(request);
        return executeListJournalS3ExportsForLedger(request);
    }

    @SdkInternalApi
    final ListJournalS3ExportsForLedgerResult executeListJournalS3ExportsForLedger(ListJournalS3ExportsForLedgerRequest listJournalS3ExportsForLedgerRequest) {

        ExecutionContext executionContext = createExecutionContext(listJournalS3ExportsForLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJournalS3ExportsForLedgerRequest> request = null;
        Response<ListJournalS3ExportsForLedgerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJournalS3ExportsForLedgerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listJournalS3ExportsForLedgerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJournalS3ExportsForLedger");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJournalS3ExportsForLedgerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListJournalS3ExportsForLedgerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling
     * <code>ListLedgers</code> multiple times.
     * </p>
     * 
     * @param listLedgersRequest
     * @return Result of the ListLedgers operation returned by the service.
     * @sample AmazonQLDB.ListLedgers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListLedgers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLedgersResult listLedgers(ListLedgersRequest request) {
        request = beforeClientExecution(request);
        return executeListLedgers(request);
    }

    @SdkInternalApi
    final ListLedgersResult executeListLedgers(ListLedgersRequest listLedgersRequest) {

        ExecutionContext executionContext = createExecutionContext(listLedgersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLedgersRequest> request = null;
        Response<ListLedgersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLedgersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLedgersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLedgers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLedgersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLedgersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all tags for a specified Amazon QLDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
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
     * Adds one or more tags to a specified Amazon QLDB resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and
     * returns an error.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
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
     * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
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
     * Updates properties on a ledger.
     * </p>
     * 
     * @param updateLedgerRequest
     * @return Result of the UpdateLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.UpdateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLedgerResult updateLedger(UpdateLedgerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLedger(request);
    }

    @SdkInternalApi
    final UpdateLedgerResult executeUpdateLedger(UpdateLedgerRequest updateLedgerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLedgerRequest> request = null;
        Response<UpdateLedgerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLedgerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLedgerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QLDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLedger");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLedgerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLedgerResultJsonUnmarshaller());
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
