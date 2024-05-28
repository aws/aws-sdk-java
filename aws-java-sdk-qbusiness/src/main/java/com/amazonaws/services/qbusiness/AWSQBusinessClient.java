/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness;

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

import com.amazonaws.services.qbusiness.AWSQBusinessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.services.qbusiness.model.transform.*;

/**
 * Client for accessing QBusiness. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * This is the <i>Amazon Q Business</i> API Reference. Amazon Q Business is a fully managed, generative-AI powered
 * enterprise chat assistant that you can deploy within your organization. Amazon Q Business enhances employee
 * productivity by supporting key tasks such as question-answering, knowledge discovery, writing email messages,
 * summarizing text, drafting document outlines, and brainstorming ideas. Users ask questions of Amazon Q Business and
 * get answers that are presented in a conversational manner. For an introduction to the service, see the <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/what-is.html"> <i>Amazon Q Business User Guide</i>
 * </a>.
 * </p>
 * <p>
 * For an overview of the Amazon Q Business APIs, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/api-ref.html#api-overview">Overview of Amazon Q
 * Business API operations</a>.
 * </p>
 * <p>
 * For information about the IAM access control permissions you need to use this API, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html">IAM roles for Amazon Q Business</a>
 * in the <i>Amazon Q Business User Guide</i>.
 * </p>
 * <p>
 * You can use the following AWS SDKs to access Amazon Q Business APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-cpp">AWS SDK for C++</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-go">AWS SDK for Go</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-java">AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-javascript">AWS SDK for JavaScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-net">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/pythonsdk">AWS SDK for Python (Boto3)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-ruby">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following resources provide additional information about using the Amazon Q Business API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/setting-up.html">Setting up for Amazon Q
 * Business</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://awscli.amazonaws.com/v2/documentation/api/latest/reference/qbusiness/index.html">Amazon Q
 * Business CLI Reference</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/general/latest/gr/amazonq.html">Amazon Web Services General Reference</a>
 * </i>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSQBusinessClient extends AmazonWebServiceClient implements AWSQBusiness {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSQBusiness.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "qbusiness";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LicenseNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.LicenseNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.qbusiness.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.qbusiness.model.AWSQBusinessException.class));

    public static AWSQBusinessClientBuilder builder() {
        return AWSQBusinessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on QBusiness using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSQBusinessClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on QBusiness using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSQBusinessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("qbusiness.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/qbusiness/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/qbusiness/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Asynchronously deletes one or more documents added using the <code>BatchPutDocument</code> API from an Amazon Q
     * Business index.
     * </p>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return Result of the BatchDeleteDocument operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchDeleteDocument" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Adds one or more documents to an Amazon Q Business index.
     * </p>
     * <p>
     * You use this API to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ingest your structured and unstructured documents and documents stored in an Amazon S3 bucket into an Amazon Q
     * Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * add custom attributes to documents in an Amazon Q Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * attach an access control list to the documents added to an Amazon Q Business index.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return Result of the BatchPutDocument operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchPutDocument" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Starts or continues a non-streaming Amazon Q Business conversation.
     * </p>
     * 
     * @param chatSyncRequest
     * @return Result of the ChatSync operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ChatSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ChatSync" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ChatSyncResult chatSync(ChatSyncRequest request) {
        request = beforeClientExecution(request);
        return executeChatSync(request);
    }

    @SdkInternalApi
    final ChatSyncResult executeChatSync(ChatSyncRequest chatSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(chatSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChatSyncRequest> request = null;
        Response<ChatSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChatSyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(chatSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChatSync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChatSyncResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ChatSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Q Business application.
     * </p>
     * <note>
     * <p>
     * There are new tiers for Amazon Q Business. Not all features in Amazon Q Business Pro are also available in Amazon
     * Q Business Lite. For information on what's included in Amazon Q Business Lite and what's included in Amazon Q
     * Business Pro, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>. You must use the Amazon Q Business console to assign subscription tiers to users.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Q Business index.
     * </p>
     * <p>
     * To determine if index creation has completed, check the <code>Status</code> field returned from a call to
     * <code>DescribeIndex</code>. The <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready
     * to use.
     * </p>
     * <p>
     * Once the index is active, you can index your documents using the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_BatchPutDocument.html">
     * <code>BatchPutDocument</code> </a> API or the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_CreateDataSource.html">
     * <code>CreateDataSource</code> </a> API.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateIndex" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Creates an Amazon Q Business plugin.
     * </p>
     * 
     * @param createPluginRequest
     * @return Result of the CreatePlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePluginResult createPlugin(CreatePluginRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlugin(request);
    }

    @SdkInternalApi
    final CreatePluginResult executeCreatePlugin(CreatePluginRequest createPluginRequest) {

        ExecutionContext executionContext = createExecutionContext(createPluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePluginRequest> request = null;
        Response<CreatePluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePluginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a retriever to your Amazon Q Business application.
     * </p>
     * 
     * @param createRetrieverRequest
     * @return Result of the CreateRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRetrieverResult createRetriever(CreateRetrieverRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRetriever(request);
    }

    @SdkInternalApi
    final CreateRetrieverResult executeCreateRetriever(CreateRetrieverRequest createRetrieverRequest) {

        ExecutionContext executionContext = createExecutionContext(createRetrieverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRetrieverRequest> request = null;
        Response<CreateRetrieverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRetrieverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRetrieverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRetriever");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRetrieverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRetrieverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a universally unique identifier (UUID) mapped to a list of local user ids within an application.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Q Business web experience.
     * </p>
     * 
     * @param createWebExperienceRequest
     * @return Result of the CreateWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWebExperienceResult createWebExperience(CreateWebExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWebExperience(request);
    }

    @SdkInternalApi
    final CreateWebExperienceResult executeCreateWebExperience(CreateWebExperienceRequest createWebExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(createWebExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebExperienceRequest> request = null;
        Response<CreateWebExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWebExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWebExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWebExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWebExperienceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Q Business application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param deleteChatControlsConfigurationRequest
     * @return Result of the DeleteChatControlsConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChatControlsConfigurationResult deleteChatControlsConfiguration(DeleteChatControlsConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChatControlsConfiguration(request);
    }

    @SdkInternalApi
    final DeleteChatControlsConfigurationResult executeDeleteChatControlsConfiguration(
            DeleteChatControlsConfigurationRequest deleteChatControlsConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChatControlsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChatControlsConfigurationRequest> request = null;
        Response<DeleteChatControlsConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChatControlsConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteChatControlsConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChatControlsConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChatControlsConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteChatControlsConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param deleteConversationRequest
     * @return Result of the DeleteConversation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteConversation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteConversation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteConversationResult deleteConversation(DeleteConversationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConversation(request);
    }

    @SdkInternalApi
    final DeleteConversationResult executeDeleteConversation(DeleteConversationRequest deleteConversationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConversationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConversationRequest> request = null;
        Response<DeleteConversationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConversationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConversationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConversation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConversationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConversationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Q Business data source connector. While the data source is being deleted, the
     * <code>Status</code> field returned by a call to the <code>DescribeDataSource</code> API is set to
     * <code>DELETING</code>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteDataSource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group. For example, after deleting the group "Summer Interns", all interns who belonged to that
     * group no longer see intern-only documents in their chat results.
     * </p>
     * <p>
     * If you want to delete, update, or replace users or sub groups of a group, you need to use the
     * <code>PutGroup</code> operation. For example, if a user in the group "Engineering" leaves the engineering team
     * and another user takes their place, you provide an updated list of users or sub groups that belong to the
     * "Engineering" group when calling <code>PutGroup</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Q Business index.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return Result of the DeleteIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteIndex" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Deletes an Amazon Q Business plugin.
     * </p>
     * 
     * @param deletePluginRequest
     * @return Result of the DeletePlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeletePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeletePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePluginResult deletePlugin(DeletePluginRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlugin(request);
    }

    @SdkInternalApi
    final DeletePluginResult executeDeletePlugin(DeletePluginRequest deletePluginRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePluginRequest> request = null;
        Response<DeletePluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePluginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param deleteRetrieverRequest
     * @return Result of the DeleteRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRetrieverResult deleteRetriever(DeleteRetrieverRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRetriever(request);
    }

    @SdkInternalApi
    final DeleteRetrieverResult executeDeleteRetriever(DeleteRetrieverRequest deleteRetrieverRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRetrieverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetrieverRequest> request = null;
        Response<DeleteRetrieverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetrieverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRetrieverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRetriever");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRetrieverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRetrieverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user by email id.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Q Business web experience.
     * </p>
     * 
     * @param deleteWebExperienceRequest
     * @return Result of the DeleteWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWebExperienceResult deleteWebExperience(DeleteWebExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWebExperience(request);
    }

    @SdkInternalApi
    final DeleteWebExperienceResult executeDeleteWebExperience(DeleteWebExperienceRequest deleteWebExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWebExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebExperienceRequest> request = null;
        Response<DeleteWebExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWebExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWebExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWebExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWebExperienceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an existing Amazon Q Business application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplication(request);
    }

    @SdkInternalApi
    final GetApplicationResult executeGetApplication(GetApplicationRequest getApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param getChatControlsConfigurationRequest
     * @return Result of the GetChatControlsConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetChatControlsConfigurationResult getChatControlsConfiguration(GetChatControlsConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetChatControlsConfiguration(request);
    }

    @SdkInternalApi
    final GetChatControlsConfigurationResult executeGetChatControlsConfiguration(GetChatControlsConfigurationRequest getChatControlsConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getChatControlsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChatControlsConfigurationRequest> request = null;
        Response<GetChatControlsConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChatControlsConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getChatControlsConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChatControlsConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChatControlsConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetChatControlsConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataSourceResult getDataSource(GetDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSource(request);
    }

    @SdkInternalApi
    final GetDataSourceResult executeGetDataSource(GetDataSourceRequest getDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSourceRequest> request = null;
        Response<GetDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a group by group name.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroup(request);
    }

    @SdkInternalApi
    final GetGroupResult executeGetGroup(GetGroupRequest getGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an existing Amazon Q Business index.
     * </p>
     * 
     * @param getIndexRequest
     * @return Result of the GetIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIndexResult getIndex(GetIndexRequest request) {
        request = beforeClientExecution(request);
        return executeGetIndex(request);
    }

    @SdkInternalApi
    final GetIndexResult executeGetIndex(GetIndexRequest getIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(getIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIndexRequest> request = null;
        Response<GetIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIndexResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an existing Amazon Q Business plugin.
     * </p>
     * 
     * @param getPluginRequest
     * @return Result of the GetPlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetPlugin" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPluginResult getPlugin(GetPluginRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlugin(request);
    }

    @SdkInternalApi
    final GetPluginResult executeGetPlugin(GetPluginRequest getPluginRequest) {

        ExecutionContext executionContext = createExecutionContext(getPluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPluginRequest> request = null;
        Response<GetPluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPluginResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an existing retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param getRetrieverRequest
     * @return Result of the GetRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRetrieverResult getRetriever(GetRetrieverRequest request) {
        request = beforeClientExecution(request);
        return executeGetRetriever(request);
    }

    @SdkInternalApi
    final GetRetrieverResult executeGetRetriever(GetRetrieverRequest getRetrieverRequest) {

        ExecutionContext executionContext = createExecutionContext(getRetrieverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRetrieverRequest> request = null;
        Response<GetRetrieverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRetrieverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRetrieverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRetriever");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRetrieverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRetrieverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the universally unique identifier (UUID) associated with a local user in a data source.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserResult getUser(GetUserRequest request) {
        request = beforeClientExecution(request);
        return executeGetUser(request);
    }

    @SdkInternalApi
    final GetUserResult executeGetUser(GetUserRequest getUserRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an existing Amazon Q Business web experience.
     * </p>
     * 
     * @param getWebExperienceRequest
     * @return Result of the GetWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetWebExperience" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWebExperienceResult getWebExperience(GetWebExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeGetWebExperience(request);
    }

    @SdkInternalApi
    final GetWebExperienceResult executeGetWebExperience(GetWebExperienceRequest getWebExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(getWebExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebExperienceRequest> request = null;
        Response<GetWebExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWebExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWebExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWebExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWebExperienceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon Q Business applications.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists one or more Amazon Q Business conversations.
     * </p>
     * 
     * @param listConversationsRequest
     * @return Result of the ListConversations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListConversations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListConversations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListConversationsResult listConversations(ListConversationsRequest request) {
        request = beforeClientExecution(request);
        return executeListConversations(request);
    }

    @SdkInternalApi
    final ListConversationsResult executeListConversations(ListConversationsRequest listConversationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConversationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConversationsRequest> request = null;
        Response<ListConversationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConversationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConversationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConversations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConversationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConversationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about an Amazon Q Business data source connector synchronization.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return Result of the ListDataSourceSyncJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSourceSyncJobs"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Lists the Amazon Q Business data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSources" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * A list of documents attached to an index.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return Result of the ListDocuments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDocumentsResult listDocuments(ListDocumentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDocuments(request);
    }

    @SdkInternalApi
    final ListDocumentsResult executeListDocuments(ListDocumentsRequest listDocumentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentsRequest> request = null;
        Response<ListDocumentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDocumentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDocuments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDocumentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDocumentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of groups that are mapped to users.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Q Business indices you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListIndices" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Gets a list of messages associated with an Amazon Q Business web experience.
     * </p>
     * 
     * @param listMessagesRequest
     * @return Result of the ListMessages operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListMessages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMessagesResult listMessages(ListMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeListMessages(request);
    }

    @SdkInternalApi
    final ListMessagesResult executeListMessages(ListMessagesRequest listMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMessagesRequest> request = null;
        Response<ListMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMessagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists configured Amazon Q Business plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @return Result of the ListPlugins operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListPlugins" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPluginsResult listPlugins(ListPluginsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlugins(request);
    }

    @SdkInternalApi
    final ListPluginsResult executeListPlugins(ListPluginsRequest listPluginsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPluginsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPluginsRequest> request = null;
        Response<ListPluginsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPluginsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPluginsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlugins");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPluginsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPluginsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param listRetrieversRequest
     * @return Result of the ListRetrievers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListRetrievers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListRetrievers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRetrieversResult listRetrievers(ListRetrieversRequest request) {
        request = beforeClientExecution(request);
        return executeListRetrievers(request);
    }

    @SdkInternalApi
    final ListRetrieversResult executeListRetrievers(ListRetrieversRequest listRetrieversRequest) {

        ExecutionContext executionContext = createExecutionContext(listRetrieversRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRetrieversRequest> request = null;
        Response<ListRetrieversResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRetrieversRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRetrieversRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRetrievers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRetrieversResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRetrieversResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Amazon Q Business applications and data sources can
     * have tags associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Lists one or more Amazon Q Business Web Experiences.
     * </p>
     * 
     * @param listWebExperiencesRequest
     * @return Result of the ListWebExperiences operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListWebExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListWebExperiences" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWebExperiencesResult listWebExperiences(ListWebExperiencesRequest request) {
        request = beforeClientExecution(request);
        return executeListWebExperiences(request);
    }

    @SdkInternalApi
    final ListWebExperiencesResult executeListWebExperiences(ListWebExperiencesRequest listWebExperiencesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWebExperiencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebExperiencesRequest> request = null;
        Response<ListWebExperiencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebExperiencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWebExperiencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWebExperiences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWebExperiencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWebExperiencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables your end user to provide feedback on their Amazon Q Business generated chat responses.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutFeedbackResult putFeedback(PutFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executePutFeedback(request);
    }

    @SdkInternalApi
    final PutFeedbackResult executePutFeedback(PutFeedbackRequest putFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(putFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFeedbackRequest> request = null;
        Response<PutFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create, or updates, a mapping of users—who have access to a document—to groups.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their Amazon Q Business chat results.
     * </p>
     * 
     * @param putGroupRequest
     * @return Result of the PutGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.PutGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutGroupResult putGroup(PutGroupRequest request) {
        request = beforeClientExecution(request);
        return executePutGroup(request);
    }

    @SdkInternalApi
    final PutGroupResult executePutGroup(PutGroupRequest putGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(putGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutGroupRequest> request = null;
        Response<PutGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutGroupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a data source connector synchronization job. If a synchronization job is already in progress, Amazon Q
     * Business returns a <code>ConflictException</code>.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return Result of the StartDataSourceSyncJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StartDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Stops an Amazon Q Business data source connector synchronization job already in progress.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return Result of the StopDataSourceSyncJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StopDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Adds the specified tag to the specified Amazon Q Business application or data source resource. If the tag already
     * exists, the existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Removes a tag from an Amazon Q Business application or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Updates an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an set of chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateChatControlsConfigurationRequest
     * @return Result of the UpdateChatControlsConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChatControlsConfigurationResult updateChatControlsConfiguration(UpdateChatControlsConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChatControlsConfiguration(request);
    }

    @SdkInternalApi
    final UpdateChatControlsConfigurationResult executeUpdateChatControlsConfiguration(
            UpdateChatControlsConfigurationRequest updateChatControlsConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChatControlsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChatControlsConfigurationRequest> request = null;
        Response<UpdateChatControlsConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChatControlsConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateChatControlsConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChatControlsConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChatControlsConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateChatControlsConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateDataSource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Updates an Amazon Q Business index.
     * </p>
     * 
     * @param updateIndexRequest
     * @return Result of the UpdateIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateIndex" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
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
     * Updates an Amazon Q Business plugin.
     * </p>
     * 
     * @param updatePluginRequest
     * @return Result of the UpdatePlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePluginResult updatePlugin(UpdatePluginRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePlugin(request);
    }

    @SdkInternalApi
    final UpdatePluginResult executeUpdatePlugin(UpdatePluginRequest updatePluginRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePluginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePluginRequest> request = null;
        Response<UpdatePluginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePluginRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePluginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePlugin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePluginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePluginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the retriever used for your Amazon Q Business application.
     * </p>
     * 
     * @param updateRetrieverRequest
     * @return Result of the UpdateRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRetrieverResult updateRetriever(UpdateRetrieverRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRetriever(request);
    }

    @SdkInternalApi
    final UpdateRetrieverResult executeUpdateRetriever(UpdateRetrieverRequest updateRetrieverRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRetrieverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRetrieverRequest> request = null;
        Response<UpdateRetrieverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRetrieverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRetrieverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRetriever");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRetrieverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRetrieverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a information associated with a user id.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon Q Business web experience.
     * </p>
     * 
     * @param updateWebExperienceRequest
     * @return Result of the UpdateWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UpdateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateWebExperienceResult updateWebExperience(UpdateWebExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWebExperience(request);
    }

    @SdkInternalApi
    final UpdateWebExperienceResult executeUpdateWebExperience(UpdateWebExperienceRequest updateWebExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWebExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebExperienceRequest> request = null;
        Response<UpdateWebExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWebExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "QBusiness");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWebExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWebExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWebExperienceResultJsonUnmarshaller());
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
