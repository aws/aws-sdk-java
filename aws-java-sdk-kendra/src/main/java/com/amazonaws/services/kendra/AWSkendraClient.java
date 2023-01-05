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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendra.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
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
     * Grants users or groups in your IAM Identity Center identity source access to your Amazon Kendra experience. You
     * can create an Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param associateEntitiesToExperienceRequest
     * @return Result of the AssociateEntitiesToExperience operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ResourceAlreadyExistException
     *         The resource you want to use already exists. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.AssociateEntitiesToExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociateEntitiesToExperience"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateEntitiesToExperienceResult associateEntitiesToExperience(AssociateEntitiesToExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateEntitiesToExperience(request);
    }

    @SdkInternalApi
    final AssociateEntitiesToExperienceResult executeAssociateEntitiesToExperience(AssociateEntitiesToExperienceRequest associateEntitiesToExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateEntitiesToExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateEntitiesToExperienceRequest> request = null;
        Response<AssociateEntitiesToExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateEntitiesToExperienceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateEntitiesToExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateEntitiesToExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateEntitiesToExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateEntitiesToExperienceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines the specific permissions of users or groups in your IAM Identity Center identity source with access to
     * your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
     * information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param associatePersonasToEntitiesRequest
     * @return Result of the AssociatePersonasToEntities operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ResourceAlreadyExistException
     *         The resource you want to use already exists. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.AssociatePersonasToEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociatePersonasToEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePersonasToEntitiesResult associatePersonasToEntities(AssociatePersonasToEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePersonasToEntities(request);
    }

    @SdkInternalApi
    final AssociatePersonasToEntitiesResult executeAssociatePersonasToEntities(AssociatePersonasToEntitiesRequest associatePersonasToEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePersonasToEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePersonasToEntitiesRequest> request = null;
        Response<AssociatePersonasToEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePersonasToEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePersonasToEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePersonasToEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePersonasToEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociatePersonasToEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more documents from an index. The documents must have been added with the
     * <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * The documents are deleted asynchronously. You can see the progress of the deletion by using Amazon Web Services
     * CloudWatch. Any error messages related to the processing of the batch are sent to you CloudWatch log.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return Result of the BatchDeleteDocument operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Returns the indexing status for one or more documents submitted with the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html"> BatchPutDocument</a> API.
     * </p>
     * <p>
     * When you use the <code>BatchPutDocument</code> API, documents are indexed asynchronously. You can use the
     * <code>BatchGetDocumentStatus</code> API to get the current status of a list of documents so that you can
     * determine if they have been successfully indexed.
     * </p>
     * <p>
     * You can also use the <code>BatchGetDocumentStatus</code> API to check the status of the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchDeleteDocument.html"> BatchDeleteDocument</a> API.
     * When a document is deleted from the index, Amazon Kendra returns <code>NOT_FOUND</code> as the status.
     * </p>
     * 
     * @param batchGetDocumentStatusRequest
     * @return Result of the BatchGetDocumentStatus operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.BatchGetDocumentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchGetDocumentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetDocumentStatusResult batchGetDocumentStatus(BatchGetDocumentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetDocumentStatus(request);
    }

    @SdkInternalApi
    final BatchGetDocumentStatusResult executeBatchGetDocumentStatus(BatchGetDocumentStatusRequest batchGetDocumentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetDocumentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDocumentStatusRequest> request = null;
        Response<BatchGetDocumentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDocumentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetDocumentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetDocumentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetDocumentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetDocumentStatusResultJsonUnmarshaller());
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
     * The <code>BatchPutDocument</code> API enables you to ingest inline documents or a set of documents stored in an
     * Amazon S3 bucket. Use this API to ingest your text and unstructured text into an index, add custom attributes to
     * the documents, and to attach an access control list to the documents added to the index.
     * </p>
     * <p>
     * The documents are indexed asynchronously. You can see the progress of the batch using Amazon Web Services
     * CloudWatch. Any error messages related to processing the batch are sent to your Amazon Web Services CloudWatch
     * log.
     * </p>
     * <p>
     * For an example of ingesting inline documents using Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-binary-doc.html">Adding files directly to an
     * index</a>.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return Result of the BatchPutDocument operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * <p>
     * <code>ClearQuerySuggestions</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param clearQuerySuggestionsRequest
     * @return Result of the ClearQuerySuggestions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Creates an access configuration for your documents. This includes user and group access information for your
     * documents. This is useful for user context filtering, where search results are filtered based on the user or
     * their group access to documents.
     * </p>
     * <p>
     * You can use this to re-configure your existing document level access control without indexing all of your
     * documents again. For example, your index contains top-secret company documents that only certain employees or
     * users should access. One of these users leaves the company or switches to a team that should be blocked from
     * accessing top-secret documents. The user still has access to top-secret documents because the user had access
     * when your documents were previously indexed. You can create a specific access control configuration for the user
     * with deny access. You can later update the access control configuration to allow access if the user returns to
     * the company and re-joins the 'top-secret' team. You can re-configure access control for your documents as
     * circumstances change.
     * </p>
     * <p>
     * To apply your access control configuration to certain documents, you call the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a> API with the
     * <code>AccessControlConfigurationId</code> included in the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Document.html">Document</a> object. If you use an S3
     * bucket as a data source, you update the <code>.metadata.json</code> with the
     * <code>AccessControlConfigurationId</code> and synchronize your data source. Amazon Kendra currently only supports
     * access control configuration for S3 data sources and documents indexed using the <code>BatchPutDocument</code>
     * API.
     * </p>
     * 
     * @param createAccessControlConfigurationRequest
     * @return Result of the CreateAccessControlConfiguration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.CreateAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessControlConfigurationResult createAccessControlConfiguration(CreateAccessControlConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessControlConfiguration(request);
    }

    @SdkInternalApi
    final CreateAccessControlConfigurationResult executeCreateAccessControlConfiguration(
            CreateAccessControlConfigurationRequest createAccessControlConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessControlConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessControlConfigurationRequest> request = null;
        Response<CreateAccessControlConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessControlConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAccessControlConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessControlConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccessControlConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAccessControlConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data source connector that you want to use with an Amazon Kendra index.
     * </p>
     * <p>
     * You specify a name, data source connector type and description for your data source. You also specify
     * configuration information for the data source connector.
     * </p>
     * <p>
     * <code>CreateDataSource</code> is a synchronous operation. The operation returns 200 if the data source was
     * successfully created. Otherwise, an exception is raised.
     * </p>
     * <p>
     * Amazon S3 and <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-custom.html">custom</a> data
     * sources are the only supported data sources in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * <p>
     * For an example of creating an index and data source using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-python.html">Getting started with Python SDK</a>. For an
     * example of creating an index and data source using the Java SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-java.html">Getting started with Java SDK</a>.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ResourceAlreadyExistException
     *         The resource you want to use already exists. Please check you have provided the correct resource and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Creates an Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, including using the Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param createExperienceRequest
     * @return Result of the CreateExperience operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.CreateExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateExperience" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateExperienceResult createExperience(CreateExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExperience(request);
    }

    @SdkInternalApi
    final CreateExperienceResult executeCreateExperience(CreateExperienceRequest createExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(createExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExperienceRequest> request = null;
        Response<CreateExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateExperienceResultJsonUnmarshaller());
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
     * <p>
     * Adding FAQs to an index is an asynchronous operation.
     * </p>
     * <p>
     * For an example of adding an FAQ to an index using Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html#using-faq-file">Using your FAQ file</a>.
     * </p>
     * 
     * @param createFaqRequest
     * @return Result of the CreateFaq operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Creates an Amazon Kendra index. Index creation is an asynchronous API. To determine if index creation has
     * completed, check the <code>Status</code> field returned from a call to <code>DescribeIndex</code>. The
     * <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready to use.
     * </p>
     * <p>
     * Once the index is active you can index your documents using the <code>BatchPutDocument</code> API or using one of
     * the supported data sources.
     * </p>
     * <p>
     * For an example of creating an index and data source using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-python.html">Getting started with Python SDK</a>. For an
     * example of creating an index and data source using the Java SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-java.html">Getting started with Java SDK</a>.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceAlreadyExistException
     *         The resource you want to use already exists. Please check you have provided the correct resource and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * <p>
     * <code>CreateQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * <p>
     * For an example of creating a block list for query suggestions using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/query-suggestions.html#suggestions-block-list">Query
     * suggestions block list</a>.
     * </p>
     * 
     * @param createQuerySuggestionsBlockListRequest
     * @return Result of the CreateQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * <p>
     * For an example of adding a thesaurus file to an index, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/index-synonyms-adding-thesaurus-file.html">Adding custom
     * synonyms to an index</a>.
     * </p>
     * 
     * @param createThesaurusRequest
     * @return Result of the CreateThesaurus operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Deletes an access control configuration that you created for your documents in an index. This includes user and
     * group access information for your documents. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param deleteAccessControlConfigurationRequest
     * @return Result of the DeleteAccessControlConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DeleteAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessControlConfigurationResult deleteAccessControlConfiguration(DeleteAccessControlConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessControlConfiguration(request);
    }

    @SdkInternalApi
    final DeleteAccessControlConfigurationResult executeDeleteAccessControlConfiguration(
            DeleteAccessControlConfigurationRequest deleteAccessControlConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessControlConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessControlConfigurationRequest> request = null;
        Response<DeleteAccessControlConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessControlConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAccessControlConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessControlConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccessControlConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAccessControlConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Kendra data source connector. An exception is not thrown if the data source is already being
     * deleted. While the data source is being deleted, the <code>Status</code> field returned by a call to the
     * <code>DescribeDataSource</code> API is set to <code>DELETING</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/delete-data-source.html">Deleting Data Sources</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Deletes your Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param deleteExperienceRequest
     * @return Result of the DeleteExperience operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DeleteExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteExperience" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteExperienceResult deleteExperience(DeleteExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExperience(request);
    }

    @SdkInternalApi
    final DeleteExperienceResult executeDeleteExperience(DeleteExperienceRequest deleteExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExperienceRequest> request = null;
        Response<DeleteExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteExperienceResultJsonUnmarshaller());
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * API is set to <code>DELETING</code>.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return Result of the DeleteIndex operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group.
     * </p>
     * <p>
     * For example, after deleting the group "Summer Interns", all interns who belonged to that group no longer see
     * intern-only documents in their search results.
     * </p>
     * <p>
     * If you want to delete or replace users or sub groups of a group, you need to use the
     * <code>PutPrincipalMapping</code> operation. For example, if a user in the group "Engineering" leaves the
     * engineering team and another user takes their place, you provide an updated list of users or sub groups that
     * belong to the "Engineering" group when calling <code>PutPrincipalMapping</code>. You can update your internal
     * list of users or sub groups and input this list when calling <code>PutPrincipalMapping</code>.
     * </p>
     * <p>
     * <code>DeletePrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param deletePrincipalMappingRequest
     * @return Result of the DeletePrincipalMapping operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DeletePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeletePrincipalMapping" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePrincipalMappingResult deletePrincipalMapping(DeletePrincipalMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePrincipalMapping(request);
    }

    @SdkInternalApi
    final DeletePrincipalMappingResult executeDeletePrincipalMapping(DeletePrincipalMappingRequest deletePrincipalMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePrincipalMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePrincipalMappingRequest> request = null;
        Response<DeletePrincipalMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePrincipalMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePrincipalMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePrincipalMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePrincipalMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePrincipalMappingResultJsonUnmarshaller());
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
     * <p>
     * <code>DeleteQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param deleteQuerySuggestionsBlockListRequest
     * @return Result of the DeleteQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Gets information about an access control configuration that you created for your documents in an index. This
     * includes user and group access information for your documents. This is useful for user context filtering, where
     * search results are filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param describeAccessControlConfigurationRequest
     * @return Result of the DescribeAccessControlConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DescribeAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccessControlConfigurationResult describeAccessControlConfiguration(DescribeAccessControlConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccessControlConfiguration(request);
    }

    @SdkInternalApi
    final DescribeAccessControlConfigurationResult executeDescribeAccessControlConfiguration(
            DescribeAccessControlConfigurationRequest describeAccessControlConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccessControlConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccessControlConfigurationRequest> request = null;
        Response<DescribeAccessControlConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccessControlConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccessControlConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccessControlConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccessControlConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccessControlConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an Amazon Kendra data source connector.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return Result of the DescribeDataSource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Gets information about your Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param describeExperienceRequest
     * @return Result of the DescribeExperience operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DescribeExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeExperience" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeExperienceResult describeExperience(DescribeExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExperience(request);
    }

    @SdkInternalApi
    final DescribeExperienceResult executeDescribeExperience(DescribeExperienceRequest describeExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExperienceRequest> request = null;
        Response<DescribeExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExperienceResultJsonUnmarshaller());
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Gets information about an existing Amazon Kendra index.
     * </p>
     * 
     * @param describeIndexRequest
     * @return Result of the DescribeIndex operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Describes the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping users to their groups.
     * This includes information on the status of actions currently processing or yet to be processed, when actions were
     * last updated, when actions were received by Amazon Kendra, the latest action that should process and apply after
     * other actions, and useful error messages if an action could not be processed.
     * </p>
     * <p>
     * <code>DescribePrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param describePrincipalMappingRequest
     * @return Result of the DescribePrincipalMapping operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DescribePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribePrincipalMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePrincipalMappingResult describePrincipalMapping(DescribePrincipalMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePrincipalMapping(request);
    }

    @SdkInternalApi
    final DescribePrincipalMappingResult executeDescribePrincipalMapping(DescribePrincipalMappingRequest describePrincipalMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(describePrincipalMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePrincipalMappingRequest> request = null;
        Response<DescribePrincipalMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePrincipalMappingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePrincipalMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePrincipalMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePrincipalMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePrincipalMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a block list used for query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings that are applied to a block list.
     * </p>
     * <p>
     * <code>DescribeQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param describeQuerySuggestionsBlockListRequest
     * @return Result of the DescribeQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Gets information on the settings of query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings applied to query suggestions.
     * </p>
     * <p>
     * <code>DescribeQuerySuggestionsConfig</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param describeQuerySuggestionsConfigRequest
     * @return Result of the DescribeQuerySuggestionsConfig operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Gets information about an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param describeThesaurusRequest
     * @return Result of the DescribeThesaurus operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Prevents users or groups in your IAM Identity Center identity source from accessing your Amazon Kendra
     * experience. You can create an Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param disassociateEntitiesFromExperienceRequest
     * @return Result of the DisassociateEntitiesFromExperience operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DisassociateEntitiesFromExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociateEntitiesFromExperience"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateEntitiesFromExperienceResult disassociateEntitiesFromExperience(DisassociateEntitiesFromExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateEntitiesFromExperience(request);
    }

    @SdkInternalApi
    final DisassociateEntitiesFromExperienceResult executeDisassociateEntitiesFromExperience(
            DisassociateEntitiesFromExperienceRequest disassociateEntitiesFromExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateEntitiesFromExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateEntitiesFromExperienceRequest> request = null;
        Response<DisassociateEntitiesFromExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateEntitiesFromExperienceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateEntitiesFromExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateEntitiesFromExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateEntitiesFromExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateEntitiesFromExperienceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specific permissions of users or groups in your IAM Identity Center identity source with access to
     * your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
     * information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param disassociatePersonasFromEntitiesRequest
     * @return Result of the DisassociatePersonasFromEntities operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.DisassociatePersonasFromEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociatePersonasFromEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePersonasFromEntitiesResult disassociatePersonasFromEntities(DisassociatePersonasFromEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePersonasFromEntities(request);
    }

    @SdkInternalApi
    final DisassociatePersonasFromEntitiesResult executeDisassociatePersonasFromEntities(
            DisassociatePersonasFromEntitiesRequest disassociatePersonasFromEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePersonasFromEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePersonasFromEntitiesRequest> request = null;
        Response<DisassociatePersonasFromEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePersonasFromEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePersonasFromEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePersonasFromEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePersonasFromEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociatePersonasFromEntitiesResultJsonUnmarshaller());
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
     * <p>
     * <code>GetQuerySuggestions</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param getQuerySuggestionsRequest
     * @return Result of the GetQuerySuggestions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Retrieves search metrics data. The data provides a snapshot of how your users interact with your search
     * application and how effective the application is.
     * </p>
     * 
     * @param getSnapshotsRequest
     * @return Result of the GetSnapshots operation returned by the service.
     * @throws InvalidRequestException
     *         The input to the request is not valid. Please provide the correct input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.GetSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSnapshotsResult getSnapshots(GetSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSnapshots(request);
    }

    @SdkInternalApi
    final GetSnapshotsResult executeGetSnapshots(GetSnapshotsRequest getSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotsRequest> request = null;
        Response<GetSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists one or more access control configurations for an index. This includes user and group access information for
     * your documents. This is useful for user context filtering, where search results are filtered based on the user or
     * their group access to documents.
     * </p>
     * 
     * @param listAccessControlConfigurationsRequest
     * @return Result of the ListAccessControlConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.ListAccessControlConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListAccessControlConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessControlConfigurationsResult listAccessControlConfigurations(ListAccessControlConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessControlConfigurations(request);
    }

    @SdkInternalApi
    final ListAccessControlConfigurationsResult executeListAccessControlConfigurations(
            ListAccessControlConfigurationsRequest listAccessControlConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessControlConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessControlConfigurationsRequest> request = null;
        Response<ListAccessControlConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessControlConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccessControlConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessControlConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccessControlConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccessControlConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets statistics about synchronizing a data source connector.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return Result of the ListDataSourceSyncJobs operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Lists the data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Lists specific permissions of users and groups with access to your Amazon Kendra experience.
     * </p>
     * 
     * @param listEntityPersonasRequest
     * @return Result of the ListEntityPersonas operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.ListEntityPersonas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListEntityPersonas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEntityPersonasResult listEntityPersonas(ListEntityPersonasRequest request) {
        request = beforeClientExecution(request);
        return executeListEntityPersonas(request);
    }

    @SdkInternalApi
    final ListEntityPersonasResult executeListEntityPersonas(ListEntityPersonasRequest listEntityPersonasRequest) {

        ExecutionContext executionContext = createExecutionContext(listEntityPersonasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntityPersonasRequest> request = null;
        Response<ListEntityPersonasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntityPersonasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEntityPersonasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntityPersonas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEntityPersonasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEntityPersonasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists users or groups in your IAM Identity Center identity source that are granted access to your Amazon Kendra
     * experience. You can create an Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param listExperienceEntitiesRequest
     * @return Result of the ListExperienceEntities operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.ListExperienceEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperienceEntities" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListExperienceEntitiesResult listExperienceEntities(ListExperienceEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListExperienceEntities(request);
    }

    @SdkInternalApi
    final ListExperienceEntitiesResult executeListExperienceEntities(ListExperienceEntitiesRequest listExperienceEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listExperienceEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExperienceEntitiesRequest> request = null;
        Response<ListExperienceEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExperienceEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExperienceEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExperienceEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExperienceEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListExperienceEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists one or more Amazon Kendra experiences. You can create an Amazon Kendra experience such as a search
     * application. For more information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param listExperiencesRequest
     * @return Result of the ListExperiences operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.ListExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperiences" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExperiencesResult listExperiences(ListExperiencesRequest request) {
        request = beforeClientExecution(request);
        return executeListExperiences(request);
    }

    @SdkInternalApi
    final ListExperiencesResult executeListExperiences(ListExperiencesRequest listExperiencesRequest) {

        ExecutionContext executionContext = createExecutionContext(listExperiencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExperiencesRequest> request = null;
        Response<ListExperiencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExperiencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExperiencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExperiences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExperiencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExperiencesResultJsonUnmarshaller());
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Provides a list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * <p>
     * <code>ListGroupsOlderThanOrderingId</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param listGroupsOlderThanOrderingIdRequest
     * @return Result of the ListGroupsOlderThanOrderingId operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.ListGroupsOlderThanOrderingId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListGroupsOlderThanOrderingId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGroupsOlderThanOrderingIdResult listGroupsOlderThanOrderingId(ListGroupsOlderThanOrderingIdRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupsOlderThanOrderingId(request);
    }

    @SdkInternalApi
    final ListGroupsOlderThanOrderingIdResult executeListGroupsOlderThanOrderingId(ListGroupsOlderThanOrderingIdRequest listGroupsOlderThanOrderingIdRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsOlderThanOrderingIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsOlderThanOrderingIdRequest> request = null;
        Response<ListGroupsOlderThanOrderingIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsOlderThanOrderingIdRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listGroupsOlderThanOrderingIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupsOlderThanOrderingId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsOlderThanOrderingIdResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListGroupsOlderThanOrderingIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Kendra indexes that you created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * <p>
     * <code>ListQuerySuggestionsBlockLists</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param listQuerySuggestionsBlockListsRequest
     * @return Result of the ListQuerySuggestionsBlockLists operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use isn't available. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Lists the thesauri for an index.
     * </p>
     * 
     * @param listThesauriRequest
     * @return Result of the ListThesauri operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Maps users to their groups so that you only need to provide the user ID when you issue the query.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their search results.
     * </p>
     * <p>
     * This is useful for user context filtering, where search results are filtered based on the user or their group
     * access to documents. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * <p>
     * If more than five <code>PUT</code> actions for a group are currently processing, a validation exception is
     * thrown.
     * </p>
     * <p>
     * <code>PutPrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param putPrincipalMappingRequest
     * @return Result of the PutPrincipalMapping operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.PutPrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/PutPrincipalMapping" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutPrincipalMappingResult putPrincipalMapping(PutPrincipalMappingRequest request) {
        request = beforeClientExecution(request);
        return executePutPrincipalMapping(request);
    }

    @SdkInternalApi
    final PutPrincipalMappingResult executePutPrincipalMapping(PutPrincipalMappingRequest putPrincipalMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(putPrincipalMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPrincipalMappingRequest> request = null;
        Response<PutPrincipalMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPrincipalMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putPrincipalMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPrincipalMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPrincipalMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutPrincipalMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches an active index. Use this API to search your documents using query. The <code>Query</code> API enables
     * to do faceted search and to filter results based on document attributes.
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Starts a synchronization job for a data source connector. If a synchronization job is already in progress, Amazon
     * Kendra returns a <code>ResourceInUseException</code> exception.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return Result of the StartDataSourceSyncJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ResourceInUseException
     *         The resource you want to use is currently in use. Please check you have provided the correct resource and
     *         try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Stops a synchronization job that is currently running. You can't stop a scheduled synchronization job.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return Result of the StopDataSourceSyncJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Enables you to provide feedback to Amazon Kendra to improve the performance of your index.
     * </p>
     * <p>
     * <code>SubmitFeedback</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param submitFeedbackRequest
     * @return Result of the SubmitFeedback operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use isn't available. Please check you have provided the correct resource and try
     *         again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use isn't available. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use isn't available. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Updates an access control configuration for your documents in an index. This includes user and group access
     * information for your documents. This is useful for user context filtering, where search results are filtered
     * based on the user or their group access to documents.
     * </p>
     * <p>
     * You can update an access control configuration you created without indexing all of your documents again. For
     * example, your index contains top-secret company documents that only certain employees or users should access. You
     * created an 'allow' access control configuration for one user who recently joined the 'top-secret' team, switching
     * from a team with 'deny' access to top-secret documents. However, the user suddenly returns to their previous team
     * and should no longer have access to top secret documents. You can update the access control configuration to
     * re-configure access control for your documents as circumstances change.
     * </p>
     * <p>
     * You call the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a> API to apply
     * the updated access control configuration, with the <code>AccessControlConfigurationId</code> included in the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Document.html">Document</a> object. If you use an S3
     * bucket as a data source, you synchronize your data source to apply the <code>AccessControlConfigurationId</code>
     * in the <code>.metadata.json</code> file. Amazon Kendra currently only supports access control configuration for
     * S3 data sources and documents indexed using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @param updateAccessControlConfigurationRequest
     * @return Result of the UpdateAccessControlConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.UpdateAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccessControlConfigurationResult updateAccessControlConfiguration(UpdateAccessControlConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccessControlConfiguration(request);
    }

    @SdkInternalApi
    final UpdateAccessControlConfigurationResult executeUpdateAccessControlConfiguration(
            UpdateAccessControlConfigurationRequest updateAccessControlConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccessControlConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessControlConfigurationRequest> request = null;
        Response<UpdateAccessControlConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessControlConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAccessControlConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccessControlConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccessControlConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAccessControlConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amazon Kendra data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Updates your Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param updateExperienceRequest
     * @return Result of the UpdateExperience operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
     * @sample AWSkendra.UpdateExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateExperience" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateExperienceResult updateExperience(UpdateExperienceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateExperience(request);
    }

    @SdkInternalApi
    final UpdateExperienceResult executeUpdateExperience(UpdateExperienceRequest updateExperienceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateExperienceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateExperienceRequest> request = null;
        Response<UpdateExperienceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateExperienceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateExperienceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "kendra");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateExperience");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateExperienceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateExperienceResultJsonUnmarshaller());
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
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra service. Please see Quotas[hyperlink Kendra
     *         Quotas pg] for more information, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us">
     *         Support</a> to inquire about an increase of limits.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * <p>
     * <code>UpdateQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param updateQuerySuggestionsBlockListRequest
     * @return Result of the UpdateQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * <p>
     * <code>UpdateQuerySuggestionsConfig</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param updateQuerySuggestionsConfigRequest
     * @return Result of the UpdateQuerySuggestionsConfig operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
     * Updates a thesaurus for an index.
     * </p>
     * 
     * @param updateThesaurusRequest
     * @return Result of the UpdateThesaurus operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra service. Please provide the correct
     *         input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistences with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra service. Please wait a few minutes
     *         and try again, or contact <a href="http://aws.amazon.com/aws.amazon.com/contact-us"> Support</a> for
     *         help.
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
