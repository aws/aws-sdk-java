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
package com.amazonaws.services.kendra;

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

import com.amazonaws.services.kendra.AWSkendraClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.services.kendra.model.transform.*;

/**
 * Client for accessing kendra. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon Kendra is a service for indexing large document sets.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSkendraClient extends AmazonWebServiceClient implements AWSkendra {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSkendra.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kendra";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ResourceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.ResourceAlreadyExistExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kendra.model.AWSkendraException.class));

    public static AWSkendraClientBuilder builder() {
        return AWSkendraClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on kendra using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSkendraClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on kendra using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSkendraClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kendra.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kendra/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kendra/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Removes one or more documents from an index. The documents must have been added with the
     * <code>BatchPutDocument</code> operation.
     * </p>
     * <p>
     * The documents are deleted asynchronously. You can see the progress of the deletion by using AWS CloudWatch. Any
     * error messages related to the processing of the batch are sent to you CloudWatch log.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return Result of the BatchDeleteDocument operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchDeleteDocumentResult batchDeleteDocument(BatchDeleteDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteDocument(request);
    }

    @SdkInternalApi
    final BatchDeleteDocumentResult executeBatchDeleteDocument(BatchDeleteDocumentRequest batchDeleteDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteDocumentRequest> request = null;
        Response<BatchDeleteDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more documents to an index.
     * </p>
     * <p>
     * The <code>BatchPutDocument</code> operation enables you to ingest inline documents or a set of documents stored
     * in an Amazon S3 bucket. Use this operation to ingest your text and unstructured text into an index, add custom
     * attributes to the documents, and to attach an access control list to the documents added to the index.
     * </p>
     * <p>
     * The documents are indexed asynchronously. You can see the progress of the batch using AWS CloudWatch. Any error
     * messages related to processing the batch are sent to your AWS CloudWatch log.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return Result of the BatchPutDocument operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchPutDocumentResult batchPutDocument(BatchPutDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutDocument(request);
    }

    @SdkInternalApi
    final BatchPutDocumentResult executeBatchPutDocument(BatchPutDocumentRequest batchPutDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutDocumentRequest> request = null;
        Response<BatchPutDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchPutDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Clears existing query suggestions from an index.
     * </p>
     * <p>
     * This deletes existing suggestions only, not the queries in the query log. After you clear suggestions, Amazon
     * Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions.
     * If you do not see any new suggestions, then please allow Amazon Kendra to collect enough queries to learn new
     * suggestions.
     * </p>
     * 
     * @param clearQuerySuggestionsRequest
     * @return Result of the ClearQuerySuggestions operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ClearQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ClearQuerySuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ClearQuerySuggestionsResult clearQuerySuggestions(ClearQuerySuggestionsRequest request) {
        request = beforeClientExecution(request);
        return executeClearQuerySuggestions(request);
    }

    @SdkInternalApi
    final ClearQuerySuggestionsResult executeClearQuerySuggestions(ClearQuerySuggestionsRequest clearQuerySuggestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(clearQuerySuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ClearQuerySuggestionsRequest> request = null;
        Response<ClearQuerySuggestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ClearQuerySuggestionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(clearQuerySuggestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ClearQuerySuggestions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ClearQuerySuggestionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ClearQuerySuggestionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data source that you use to with an Amazon Kendra index.
     * </p>
     * <p>
     * You specify a name, data source connector type and description for your data source. You also specify
     * configuration information such as document metadata (author, source URI, and so on) and user context information.
     * </p>
     * <p>
     * <code>CreateDataSource</code> is a synchronous operation. The operation returns 200 if the data source was
     * successfully created. Otherwise, an exception is raised.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataSourceResult createDataSource(CreateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSource(request);
    }

    @SdkInternalApi
    final CreateDataSourceResult executeCreateDataSource(CreateDataSourceRequest createDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceRequest> request = null;
        Response<CreateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an new set of frequently asked question (FAQ) questions and answers.
     * </p>
     * 
     * @param createFaqRequest
     * @return Result of the CreateFaq operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.CreateFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFaq" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFaqResult createFaq(CreateFaqRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFaq(request);
    }

    @SdkInternalApi
    final CreateFaqResult executeCreateFaq(CreateFaqRequest createFaqRequest) {

        ExecutionContext executionContext = createExecutionContext(createFaqRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFaqRequest> request = null;
        Response<CreateFaqResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFaqRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFaqRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFaq");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFaqResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFaqResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Kendra index. Index creation is an asynchronous operation. To determine if index creation
     * has completed, check the <code>Status</code> field returned from a call to <code>DescribeIndex</code>. The
     * <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready to use.
     * </p>
     * <p>
     * Once the index is active you can index your documents using the <code>BatchPutDocument</code> operation or using
     * one of the supported data sources.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws ValidationException
     * @throws ResourceAlreadyExistException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIndexResult createIndex(CreateIndexRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIndex(request);
    }

    @SdkInternalApi
    final CreateIndexResult executeCreateIndex(CreateIndexRequest createIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(createIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIndexRequest> request = null;
        Response<CreateIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a block list to exlcude certain queries from suggestions.
     * </p>
     * <p>
     * Any query that contains words or phrases specified in the block list is blocked or filtered out from being shown
     * as a suggestion.
     * </p>
     * <p>
     * You need to provide the file location of your block list text file in your S3 bucket. In your text file, enter
     * each block word or phrase on a separate line.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param createQuerySuggestionsBlockListRequest
     * @return Result of the CreateQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.CreateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateQuerySuggestionsBlockListResult createQuerySuggestionsBlockList(CreateQuerySuggestionsBlockListRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQuerySuggestionsBlockList(request);
    }

    @SdkInternalApi
    final CreateQuerySuggestionsBlockListResult executeCreateQuerySuggestionsBlockList(
            CreateQuerySuggestionsBlockListRequest createQuerySuggestionsBlockListRequest) {

        ExecutionContext executionContext = createExecutionContext(createQuerySuggestionsBlockListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQuerySuggestionsBlockListRequest> request = null;
        Response<CreateQuerySuggestionsBlockListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQuerySuggestionsBlockListRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createQuerySuggestionsBlockListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQuerySuggestionsBlockList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQuerySuggestionsBlockListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateQuerySuggestionsBlockListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a thesaurus for an index. The thesaurus contains a list of synonyms in Solr format.
     * </p>
     * 
     * @param createThesaurusRequest
     * @return Result of the CreateThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.CreateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateThesaurusResult createThesaurus(CreateThesaurusRequest request) {
        request = beforeClientExecution(request);
        return executeCreateThesaurus(request);
    }

    @SdkInternalApi
    final CreateThesaurusResult executeCreateThesaurus(CreateThesaurusRequest createThesaurusRequest) {

        ExecutionContext executionContext = createExecutionContext(createThesaurusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThesaurusRequest> request = null;
        Response<CreateThesaurusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThesaurusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createThesaurusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateThesaurus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateThesaurusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateThesaurusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Kendra data source. An exception is not thrown if the data source is already being deleted.
     * While the data source is being deleted, the <code>Status</code> field returned by a call to the
     * <code>DescribeDataSource</code> operation is set to <code>DELETING</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/delete-data-source.html">Deleting Data Sources</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataSource(request);
    }

    @SdkInternalApi
    final DeleteDataSourceResult executeDeleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an FAQ from an index.
     * </p>
     * 
     * @param deleteFaqRequest
     * @return Result of the DeleteFaq operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteFaq" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFaqResult deleteFaq(DeleteFaqRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFaq(request);
    }

    @SdkInternalApi
    final DeleteFaqResult executeDeleteFaq(DeleteFaqRequest deleteFaqRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFaqRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFaqRequest> request = null;
        Response<DeleteFaqResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFaqRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFaqRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFaq");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFaqResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFaqResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While
     * the index is being deleted, the <code>Status</code> field returned by a call to the <code>DescribeIndex</code>
     * operation is set to <code>DELETING</code>.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return Result of the DeleteIndex operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIndexResult deleteIndex(DeleteIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIndex(request);
    }

    @SdkInternalApi
    final DeleteIndexResult executeDeleteIndex(DeleteIndexRequest deleteIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIndexRequest> request = null;
        Response<DeleteIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a block list used for query suggestions for an index.
     * </p>
     * <p>
     * A deleted block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list
     * to add back the queries that were previously blocked.
     * </p>
     * 
     * @param deleteQuerySuggestionsBlockListRequest
     * @return Result of the DeleteQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteQuerySuggestionsBlockListResult deleteQuerySuggestionsBlockList(DeleteQuerySuggestionsBlockListRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQuerySuggestionsBlockList(request);
    }

    @SdkInternalApi
    final DeleteQuerySuggestionsBlockListResult executeDeleteQuerySuggestionsBlockList(
            DeleteQuerySuggestionsBlockListRequest deleteQuerySuggestionsBlockListRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQuerySuggestionsBlockListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQuerySuggestionsBlockListRequest> request = null;
        Response<DeleteQuerySuggestionsBlockListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQuerySuggestionsBlockListRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteQuerySuggestionsBlockListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQuerySuggestionsBlockList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQuerySuggestionsBlockListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteQuerySuggestionsBlockListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param deleteThesaurusRequest
     * @return Result of the DeleteThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteThesaurusResult deleteThesaurus(DeleteThesaurusRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteThesaurus(request);
    }

    @SdkInternalApi
    final DeleteThesaurusResult executeDeleteThesaurus(DeleteThesaurusRequest deleteThesaurusRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteThesaurusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThesaurusRequest> request = null;
        Response<DeleteThesaurusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThesaurusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteThesaurusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteThesaurus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteThesaurusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteThesaurusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Amazon Kendra data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return Result of the DescribeDataSource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataSource(request);
    }

    @SdkInternalApi
    final DescribeDataSourceResult executeDescribeDataSource(DescribeDataSourceRequest describeDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourceRequest> request = null;
        Response<DescribeDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an FAQ list.
     * </p>
     * 
     * @param describeFaqRequest
     * @return Result of the DescribeFaq operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFaq" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFaqResult describeFaq(DescribeFaqRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFaq(request);
    }

    @SdkInternalApi
    final DescribeFaqResult executeDescribeFaq(DescribeFaqRequest describeFaqRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFaqRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFaqRequest> request = null;
        Response<DescribeFaqResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFaqRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFaqRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFaq");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFaqResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFaqResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing Amazon Kendra index
     * </p>
     * 
     * @param describeIndexRequest
     * @return Result of the DescribeIndex operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeIndexResult describeIndex(DescribeIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIndex(request);
    }

    @SdkInternalApi
    final DescribeIndexResult executeDescribeIndex(DescribeIndexRequest describeIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIndexRequest> request = null;
        Response<DescribeIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a block list used for query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings that are applied to a block list.
     * </p>
     * 
     * @param describeQuerySuggestionsBlockListRequest
     * @return Result of the DescribeQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeQuerySuggestionsBlockListResult describeQuerySuggestionsBlockList(DescribeQuerySuggestionsBlockListRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQuerySuggestionsBlockList(request);
    }

    @SdkInternalApi
    final DescribeQuerySuggestionsBlockListResult executeDescribeQuerySuggestionsBlockList(
            DescribeQuerySuggestionsBlockListRequest describeQuerySuggestionsBlockListRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQuerySuggestionsBlockListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQuerySuggestionsBlockListRequest> request = null;
        Response<DescribeQuerySuggestionsBlockListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQuerySuggestionsBlockListRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeQuerySuggestionsBlockListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQuerySuggestionsBlockList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQuerySuggestionsBlockListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeQuerySuggestionsBlockListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the settings of query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings applied to query suggestions.
     * </p>
     * 
     * @param describeQuerySuggestionsConfigRequest
     * @return Result of the DescribeQuerySuggestionsConfig operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeQuerySuggestionsConfigResult describeQuerySuggestionsConfig(DescribeQuerySuggestionsConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQuerySuggestionsConfig(request);
    }

    @SdkInternalApi
    final DescribeQuerySuggestionsConfigResult executeDescribeQuerySuggestionsConfig(DescribeQuerySuggestionsConfigRequest describeQuerySuggestionsConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQuerySuggestionsConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQuerySuggestionsConfigRequest> request = null;
        Response<DescribeQuerySuggestionsConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQuerySuggestionsConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeQuerySuggestionsConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQuerySuggestionsConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQuerySuggestionsConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeQuerySuggestionsConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param describeThesaurusRequest
     * @return Result of the DescribeThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeThesaurusResult describeThesaurus(DescribeThesaurusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeThesaurus(request);
    }

    @SdkInternalApi
    final DescribeThesaurusResult executeDescribeThesaurus(DescribeThesaurusRequest describeThesaurusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeThesaurusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThesaurusRequest> request = null;
        Response<DescribeThesaurusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThesaurusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeThesaurusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeThesaurus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeThesaurusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeThesaurusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetches the queries that are suggested to your users.
     * </p>
     * 
     * @param getQuerySuggestionsRequest
     * @return Result of the GetQuerySuggestions operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.GetQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetQuerySuggestions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQuerySuggestionsResult getQuerySuggestions(GetQuerySuggestionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQuerySuggestions(request);
    }

    @SdkInternalApi
    final GetQuerySuggestionsResult executeGetQuerySuggestions(GetQuerySuggestionsRequest getQuerySuggestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQuerySuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQuerySuggestionsRequest> request = null;
        Response<GetQuerySuggestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQuerySuggestionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQuerySuggestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQuerySuggestions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQuerySuggestionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQuerySuggestionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets statistics about synchronizing Amazon Kendra with a data source.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return Result of the ListDataSourceSyncJobs operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSourceSyncJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDataSourceSyncJobsResult listDataSourceSyncJobs(ListDataSourceSyncJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSourceSyncJobs(request);
    }

    @SdkInternalApi
    final ListDataSourceSyncJobsResult executeListDataSourceSyncJobs(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourceSyncJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourceSyncJobsRequest> request = null;
        Response<ListDataSourceSyncJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourceSyncJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourceSyncJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSourceSyncJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourceSyncJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDataSourceSyncJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data sources that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @sample AWSkendra.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSources(request);
    }

    @SdkInternalApi
    final ListDataSourcesResult executeListDataSources(ListDataSourcesRequest listDataSourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourcesRequest> request = null;
        Response<ListDataSourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of FAQ lists associated with an index.
     * </p>
     * 
     * @param listFaqsRequest
     * @return Result of the ListFaqs operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListFaqs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListFaqs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFaqsResult listFaqs(ListFaqsRequest request) {
        request = beforeClientExecution(request);
        return executeListFaqs(request);
    }

    @SdkInternalApi
    final ListFaqsResult executeListFaqs(ListFaqsRequest listFaqsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFaqsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFaqsRequest> request = null;
        Response<ListFaqsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFaqsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFaqsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFaqs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFaqsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFaqsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Kendra indexes that you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIndicesResult listIndices(ListIndicesRequest request) {
        request = beforeClientExecution(request);
        return executeListIndices(request);
    }

    @SdkInternalApi
    final ListIndicesResult executeListIndices(ListIndicesRequest listIndicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIndicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIndicesRequest> request = null;
        Response<ListIndicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIndicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIndicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIndices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIndicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIndicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the block lists used for query suggestions for an index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param listQuerySuggestionsBlockListsRequest
     * @return Result of the ListQuerySuggestionsBlockLists operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListQuerySuggestionsBlockLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListQuerySuggestionsBlockLists"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListQuerySuggestionsBlockListsResult listQuerySuggestionsBlockLists(ListQuerySuggestionsBlockListsRequest request) {
        request = beforeClientExecution(request);
        return executeListQuerySuggestionsBlockLists(request);
    }

    @SdkInternalApi
    final ListQuerySuggestionsBlockListsResult executeListQuerySuggestionsBlockLists(ListQuerySuggestionsBlockListsRequest listQuerySuggestionsBlockListsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQuerySuggestionsBlockListsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQuerySuggestionsBlockListsRequest> request = null;
        Response<ListQuerySuggestionsBlockListsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQuerySuggestionsBlockListsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listQuerySuggestionsBlockListsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQuerySuggestionsBlockLists");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQuerySuggestionsBlockListsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListQuerySuggestionsBlockListsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Indexes, FAQs, and data sources can have tags
     * associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
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
     * Lists the Amazon Kendra thesauri associated with an index.
     * </p>
     * 
     * @param listThesauriRequest
     * @return Result of the ListThesauri operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListThesauri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListThesauri" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListThesauriResult listThesauri(ListThesauriRequest request) {
        request = beforeClientExecution(request);
        return executeListThesauri(request);
    }

    @SdkInternalApi
    final ListThesauriResult executeListThesauri(ListThesauriRequest listThesauriRequest) {

        ExecutionContext executionContext = createExecutionContext(listThesauriRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThesauriRequest> request = null;
        Response<ListThesauriResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThesauriRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listThesauriRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListThesauri");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListThesauriResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListThesauriResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches an active index. Use this API to search your documents using query. The <code>Query</code> operation
     * enables to do faceted search and to filter results based on document attributes.
     * </p>
     * <p>
     * It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the
     * search results.
     * </p>
     * <p>
     * Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response
     * contains three types of results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Relevant passages
     * </p>
     * </li>
     * <li>
     * <p>
     * Matching FAQs
     * </p>
     * </li>
     * <li>
     * <p>
     * Relevant documents
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify that the query return only one type of result using the <code>QueryResultTypeConfig</code>
     * parameter.
     * </p>
     * <p>
     * Each query returns the 100 most relevant results.
     * </p>
     * 
     * @param queryRequest
     * @return Result of the Query operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public QueryResult query(QueryRequest request) {
        request = beforeClientExecution(request);
        return executeQuery(request);
    }

    @SdkInternalApi
    final QueryResult executeQuery(QueryRequest queryRequest) {

        ExecutionContext executionContext = createExecutionContext(queryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryRequest> request = null;
        Response<QueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(queryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Query");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<QueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new QueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a synchronization job for a data source. If a synchronization job is already in progress, Amazon Kendra
     * returns a <code>ResourceInUseException</code> exception.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return Result of the StartDataSourceSyncJob operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StartDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartDataSourceSyncJobResult startDataSourceSyncJob(StartDataSourceSyncJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartDataSourceSyncJob(request);
    }

    @SdkInternalApi
    final StartDataSourceSyncJobResult executeStartDataSourceSyncJob(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startDataSourceSyncJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDataSourceSyncJobRequest> request = null;
        Response<StartDataSourceSyncJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDataSourceSyncJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDataSourceSyncJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDataSourceSyncJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDataSourceSyncJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDataSourceSyncJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running synchronization job. You can't stop a scheduled synchronization job.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return Result of the StopDataSourceSyncJob operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StopDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopDataSourceSyncJobResult stopDataSourceSyncJob(StopDataSourceSyncJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopDataSourceSyncJob(request);
    }

    @SdkInternalApi
    final StopDataSourceSyncJobResult executeStopDataSourceSyncJob(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDataSourceSyncJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDataSourceSyncJobRequest> request = null;
        Response<StopDataSourceSyncJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDataSourceSyncJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopDataSourceSyncJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDataSourceSyncJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopDataSourceSyncJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StopDataSourceSyncJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables you to provide feedback to Amazon Kendra to improve the performance of the service.
     * </p>
     * 
     * @param submitFeedbackRequest
     * @return Result of the SubmitFeedback operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SubmitFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SubmitFeedbackResult submitFeedback(SubmitFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executeSubmitFeedback(request);
    }

    @SdkInternalApi
    final SubmitFeedbackResult executeSubmitFeedback(SubmitFeedbackRequest submitFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(submitFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitFeedbackRequest> request = null;
        Response<SubmitFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(submitFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubmitFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubmitFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SubmitFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tag to the specified index, FAQ, or data source resource. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
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
     * Removes a tag from an index, FAQ, or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
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
     * Updates an existing Amazon Kendra data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataSource(request);
    }

    @SdkInternalApi
    final UpdateDataSourceResult executeUpdateDataSource(UpdateDataSourceRequest updateDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amazon Kendra index.
     * </p>
     * 
     * @param updateIndexRequest
     * @return Result of the UpdateIndex operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateIndexResult updateIndex(UpdateIndexRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIndex(request);
    }

    @SdkInternalApi
    final UpdateIndexResult executeUpdateIndex(UpdateIndexRequest updateIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIndexRequest> request = null;
        Response<UpdateIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a block list used for query suggestions for an index.
     * </p>
     * <p>
     * Updates to a block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions
     * list to apply any updates to the block list. Other changes not related to the block list apply immediately.
     * </p>
     * <p>
     * If a block list is updating, then you need to wait for the first update to finish before submitting another
     * update.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * 
     * @param updateQuerySuggestionsBlockListRequest
     * @return Result of the UpdateQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQuerySuggestionsBlockListResult updateQuerySuggestionsBlockList(UpdateQuerySuggestionsBlockListRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQuerySuggestionsBlockList(request);
    }

    @SdkInternalApi
    final UpdateQuerySuggestionsBlockListResult executeUpdateQuerySuggestionsBlockList(
            UpdateQuerySuggestionsBlockListRequest updateQuerySuggestionsBlockListRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQuerySuggestionsBlockListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQuerySuggestionsBlockListRequest> request = null;
        Response<UpdateQuerySuggestionsBlockListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQuerySuggestionsBlockListRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQuerySuggestionsBlockListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQuerySuggestionsBlockList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQuerySuggestionsBlockListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQuerySuggestionsBlockListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings of query suggestions for an index.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * <p>
     * If an update is currently processing (i.e. 'happening'), you need to wait for the update to finish before making
     * another update.
     * </p>
     * <p>
     * Updates to query suggestions settings might not take effect right away. The time for your updated settings to
     * take effect depends on the updates made and the number of search queries in your index.
     * </p>
     * <p>
     * You can still enable/disable query suggestions at any time.
     * </p>
     * 
     * @param updateQuerySuggestionsConfigRequest
     * @return Result of the UpdateQuerySuggestionsConfig operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQuerySuggestionsConfigResult updateQuerySuggestionsConfig(UpdateQuerySuggestionsConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQuerySuggestionsConfig(request);
    }

    @SdkInternalApi
    final UpdateQuerySuggestionsConfigResult executeUpdateQuerySuggestionsConfig(UpdateQuerySuggestionsConfigRequest updateQuerySuggestionsConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQuerySuggestionsConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQuerySuggestionsConfigRequest> request = null;
        Response<UpdateQuerySuggestionsConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQuerySuggestionsConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQuerySuggestionsConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQuerySuggestionsConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQuerySuggestionsConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQuerySuggestionsConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a thesaurus file associated with an index.
     * </p>
     * 
     * @param updateThesaurusRequest
     * @return Result of the UpdateThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateThesaurusResult updateThesaurus(UpdateThesaurusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateThesaurus(request);
    }

    @SdkInternalApi
    final UpdateThesaurusResult executeUpdateThesaurus(UpdateThesaurusRequest updateThesaurusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateThesaurusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThesaurusRequest> request = null;
        Response<UpdateThesaurusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThesaurusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateThesaurusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateThesaurus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateThesaurusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateThesaurusResultJsonUnmarshaller());
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
