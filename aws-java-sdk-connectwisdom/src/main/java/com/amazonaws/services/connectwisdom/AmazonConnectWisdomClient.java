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
package com.amazonaws.services.connectwisdom;

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

import com.amazonaws.services.connectwisdom.AmazonConnectWisdomClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.connectwisdom.model.*;
import com.amazonaws.services.connectwisdom.model.transform.*;

/**
 * Client for accessing Amazon Connect Wisdom Service. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Amazon Connect Wisdom delivers agents the information they need to solve customer issues as they're actively speaking
 * with customers. Agents can search across connected repositories from within their agent desktop to find answers
 * quickly. Use the Amazon Connect Wisdom APIs to create an assistant and a knowledge base, for example, or manage
 * content by uploading custom files.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectWisdomClient extends AmazonWebServiceClient implements AmazonConnectWisdom {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConnectWisdom.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "wisdom";

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
                                    com.amazonaws.services.connectwisdom.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectwisdom.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectwisdom.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectwisdom.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectwisdom.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectwisdom.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectwisdom.model.transform.PreconditionFailedExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.connectwisdom.model.AmazonConnectWisdomException.class));

    public static AmazonConnectWisdomClientBuilder builder() {
        return AmazonConnectWisdomClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Connect Wisdom Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectWisdomClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Connect Wisdom Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectWisdomClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("wisdom.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/connectwisdom/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/connectwisdom/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Amazon Connect Wisdom assistant.
     * </p>
     * 
     * @param createAssistantRequest
     * @return Result of the CreateAssistant operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.CreateAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAssistantResult createAssistant(CreateAssistantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssistant(request);
    }

    @SdkInternalApi
    final CreateAssistantResult executeCreateAssistant(CreateAssistantRequest createAssistantRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssistantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssistantRequest> request = null;
        Response<CreateAssistantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssistantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssistantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssistant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssistantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssistantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an association between an Amazon Connect Wisdom assistant and another resource. Currently, the only
     * supported association is with a knowledge base. An assistant can have only a single association.
     * </p>
     * 
     * @param createAssistantAssociationRequest
     * @return Result of the CreateAssistantAssociation operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.CreateAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAssistantAssociationResult createAssistantAssociation(CreateAssistantAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssistantAssociation(request);
    }

    @SdkInternalApi
    final CreateAssistantAssociationResult executeCreateAssistantAssociation(CreateAssistantAssociationRequest createAssistantAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssistantAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssistantAssociationRequest> request = null;
        Response<CreateAssistantAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssistantAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAssistantAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssistantAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssistantAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssistantAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates Wisdom content. Before to calling this API, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>
     * to upload an asset.
     * </p>
     * 
     * @param createContentRequest
     * @return Result of the CreateContent operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.CreateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateContentResult createContent(CreateContentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContent(request);
    }

    @SdkInternalApi
    final CreateContentResult executeCreateContent(CreateContentRequest createContentRequest) {

        ExecutionContext executionContext = createExecutionContext(createContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContentRequest> request = null;
        Response<CreateContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a knowledge base.
     * </p>
     * <note>
     * <p>
     * When using this API, you cannot reuse <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/Welcome.html">Amazon AppIntegrations</a>
     * DataIntegrations with external knowledge bases such as Salesforce and ServiceNow. If you do, you'll get an
     * <code>InvalidRequestException</code> error.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For example, you're programmatically managing your external knowledge base, and you want to add or remove one of the fields that is being ingested from Salesforce. Do the following:&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_DeleteKnowledgeBase.html&quot;&gt;DeleteKnowledgeBase&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html&quot;&gt;DeleteDataIntegration&lt;/a&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call &lt;a href=&quot;https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html&quot;&gt;CreateDataIntegration&lt;/a&gt; to recreate the DataIntegration or a create different one.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Call CreateKnowledgeBase.&lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @param createKnowledgeBaseRequest
     * @return Result of the CreateKnowledgeBase operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ServiceQuotaExceededException
     *         You've exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use service quotas to request a service quota increase.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateKnowledgeBaseResult createKnowledgeBase(CreateKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKnowledgeBase(request);
    }

    @SdkInternalApi
    final CreateKnowledgeBaseResult executeCreateKnowledgeBase(CreateKnowledgeBaseRequest createKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKnowledgeBaseRequest> request = null;
        Response<CreateKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a session. A session is a contextual container used for generating recommendations. Amazon Connect
     * creates a new Wisdom session for each contact on which Wisdom is enabled.
     * </p>
     * 
     * @param createSessionRequest
     * @return Result of the CreateSession operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.CreateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSessionResult createSession(CreateSessionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSession(request);
    }

    @SdkInternalApi
    final CreateSessionResult executeCreateSession(CreateSessionRequest createSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSessionRequest> request = null;
        Response<CreateSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an assistant.
     * </p>
     * 
     * @param deleteAssistantRequest
     * @return Result of the DeleteAssistant operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAssistantResult deleteAssistant(DeleteAssistantRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssistant(request);
    }

    @SdkInternalApi
    final DeleteAssistantResult executeDeleteAssistant(DeleteAssistantRequest deleteAssistantRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssistantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssistantRequest> request = null;
        Response<DeleteAssistantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssistantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssistantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssistant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssistantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssistantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an assistant association.
     * </p>
     * 
     * @param deleteAssistantAssociationRequest
     * @return Result of the DeleteAssistantAssociation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistantAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAssistantAssociationResult deleteAssistantAssociation(DeleteAssistantAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssistantAssociation(request);
    }

    @SdkInternalApi
    final DeleteAssistantAssociationResult executeDeleteAssistantAssociation(DeleteAssistantAssociationRequest deleteAssistantAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssistantAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssistantAssociationRequest> request = null;
        Response<DeleteAssistantAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssistantAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAssistantAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssistantAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssistantAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssistantAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the content.
     * </p>
     * 
     * @param deleteContentRequest
     * @return Result of the DeleteContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteContentResult deleteContent(DeleteContentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContent(request);
    }

    @SdkInternalApi
    final DeleteContentResult executeDeleteContent(DeleteContentRequest deleteContentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContentRequest> request = null;
        Response<DeleteContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the knowledge base.
     * </p>
     * <note>
     * <p>
     * When you use this API to delete an external knowledge base such as Salesforce or ServiceNow, you must also delete
     * the <a href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/Welcome.html">Amazon
     * AppIntegrations</a> DataIntegration. This is because you can't reuse the DataIntegration after it's been
     * associated with an external knowledge base. However, you can delete and recreate it. See <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_DeleteDataIntegration.html"
     * >DeleteDataIntegration</a> and <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> in the <i>Amazon AppIntegrations API Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return Result of the DeleteKnowledgeBase operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. For example,
     *         if you're using a <code>Create</code> API (such as <code>CreateAssistant</code>) that accepts name, a
     *         conflicting resource (usually with the same name) is being created or mutated.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteKnowledgeBaseResult deleteKnowledgeBase(DeleteKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKnowledgeBase(request);
    }

    @SdkInternalApi
    final DeleteKnowledgeBaseResult executeDeleteKnowledgeBase(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKnowledgeBaseRequest> request = null;
        Response<DeleteKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an assistant.
     * </p>
     * 
     * @param getAssistantRequest
     * @return Result of the GetAssistant operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAssistantResult getAssistant(GetAssistantRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssistant(request);
    }

    @SdkInternalApi
    final GetAssistantResult executeGetAssistant(GetAssistantRequest getAssistantRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssistantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssistantRequest> request = null;
        Response<GetAssistantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssistantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssistantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssistant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssistantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssistantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an assistant association.
     * </p>
     * 
     * @param getAssistantAssociationRequest
     * @return Result of the GetAssistantAssociation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetAssistantAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistantAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAssistantAssociationResult getAssistantAssociation(GetAssistantAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssistantAssociation(request);
    }

    @SdkInternalApi
    final GetAssistantAssociationResult executeGetAssistantAssociation(GetAssistantAssociationRequest getAssistantAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssistantAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssistantAssociationRequest> request = null;
        Response<GetAssistantAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssistantAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAssistantAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssistantAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssistantAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAssistantAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves content, including a pre-signed URL to download the content.
     * </p>
     * 
     * @param getContentRequest
     * @return Result of the GetContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetContentResult getContent(GetContentRequest request) {
        request = beforeClientExecution(request);
        return executeGetContent(request);
    }

    @SdkInternalApi
    final GetContentResult executeGetContent(GetContentRequest getContentRequest) {

        ExecutionContext executionContext = createExecutionContext(getContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContentRequest> request = null;
        Response<GetContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves summary information about the content.
     * </p>
     * 
     * @param getContentSummaryRequest
     * @return Result of the GetContentSummary operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetContentSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetContentSummary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetContentSummaryResult getContentSummary(GetContentSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetContentSummary(request);
    }

    @SdkInternalApi
    final GetContentSummaryResult executeGetContentSummary(GetContentSummaryRequest getContentSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getContentSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContentSummaryRequest> request = null;
        Response<GetContentSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContentSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContentSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContentSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContentSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContentSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the knowledge base.
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return Result of the GetKnowledgeBase operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetKnowledgeBase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKnowledgeBaseResult getKnowledgeBase(GetKnowledgeBaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetKnowledgeBase(request);
    }

    @SdkInternalApi
    final GetKnowledgeBaseResult executeGetKnowledgeBase(GetKnowledgeBaseRequest getKnowledgeBaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getKnowledgeBaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKnowledgeBaseRequest> request = null;
        Response<GetKnowledgeBaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKnowledgeBaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKnowledgeBaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKnowledgeBase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKnowledgeBaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKnowledgeBaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves recommendations for the specified session. To avoid retrieving the same recommendations in subsequent
     * calls, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_NotifyRecommendationsReceived.html"
     * >NotifyRecommendationsReceived</a>. This API supports long-polling behavior with the <code>waitTimeSeconds</code>
     * parameter. Short poll is the default behavior and only returns recommendations already available. To perform a
     * manual query against an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_QueryAssistant.html">QueryAssistant</a>.
     * </p>
     * 
     * @param getRecommendationsRequest
     * @return Result of the GetRecommendations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetRecommendations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRecommendationsResult getRecommendations(GetRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecommendations(request);
    }

    @SdkInternalApi
    final GetRecommendationsResult executeGetRecommendations(GetRecommendationsRequest getRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommendationsRequest> request = null;
        Response<GetRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information for a specified session.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetSession" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
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
     * Lists information about assistant associations.
     * </p>
     * 
     * @param listAssistantAssociationsRequest
     * @return Result of the ListAssistantAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.ListAssistantAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistantAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssistantAssociationsResult listAssistantAssociations(ListAssistantAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssistantAssociations(request);
    }

    @SdkInternalApi
    final ListAssistantAssociationsResult executeListAssistantAssociations(ListAssistantAssociationsRequest listAssistantAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssistantAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssistantAssociationsRequest> request = null;
        Response<ListAssistantAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssistantAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssistantAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssistantAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssistantAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssistantAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about assistants.
     * </p>
     * 
     * @param listAssistantsRequest
     * @return Result of the ListAssistants operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.ListAssistants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListAssistants" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAssistantsResult listAssistants(ListAssistantsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssistants(request);
    }

    @SdkInternalApi
    final ListAssistantsResult executeListAssistants(ListAssistantsRequest listAssistantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssistantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssistantsRequest> request = null;
        Response<ListAssistantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssistantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssistantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssistants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssistantsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssistantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the content.
     * </p>
     * 
     * @param listContentsRequest
     * @return Result of the ListContents operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.ListContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListContents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListContentsResult listContents(ListContentsRequest request) {
        request = beforeClientExecution(request);
        return executeListContents(request);
    }

    @SdkInternalApi
    final ListContentsResult executeListContents(ListContentsRequest listContentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listContentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContentsRequest> request = null;
        Response<ListContentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListContentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the knowledge bases.
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return Result of the ListKnowledgeBases operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectWisdom.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListKnowledgeBases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListKnowledgeBasesResult listKnowledgeBases(ListKnowledgeBasesRequest request) {
        request = beforeClientExecution(request);
        return executeListKnowledgeBases(request);
    }

    @SdkInternalApi
    final ListKnowledgeBasesResult executeListKnowledgeBases(ListKnowledgeBasesRequest listKnowledgeBasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listKnowledgeBasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKnowledgeBasesRequest> request = null;
        Response<ListKnowledgeBasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKnowledgeBasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKnowledgeBasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKnowledgeBases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKnowledgeBasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKnowledgeBasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
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
     * Removes the specified recommendations from the specified assistant's queue of newly available recommendations.
     * You can use this API in conjunction with <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>
     * and a <code>waitTimeSeconds</code> input for long-polling behavior and avoiding duplicate recommendations.
     * </p>
     * 
     * @param notifyRecommendationsReceivedRequest
     * @return Result of the NotifyRecommendationsReceived operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.NotifyRecommendationsReceived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/NotifyRecommendationsReceived"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public NotifyRecommendationsReceivedResult notifyRecommendationsReceived(NotifyRecommendationsReceivedRequest request) {
        request = beforeClientExecution(request);
        return executeNotifyRecommendationsReceived(request);
    }

    @SdkInternalApi
    final NotifyRecommendationsReceivedResult executeNotifyRecommendationsReceived(NotifyRecommendationsReceivedRequest notifyRecommendationsReceivedRequest) {

        ExecutionContext executionContext = createExecutionContext(notifyRecommendationsReceivedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyRecommendationsReceivedRequest> request = null;
        Response<NotifyRecommendationsReceivedResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyRecommendationsReceivedRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(notifyRecommendationsReceivedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "NotifyRecommendationsReceived");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<NotifyRecommendationsReceivedResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new NotifyRecommendationsReceivedResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Performs a manual search against the specified assistant. To retrieve recommendations for an assistant, use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetRecommendations.html">GetRecommendations</a>.
     * </p>
     * 
     * @param queryAssistantRequest
     * @return Result of the QueryAssistant operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.QueryAssistant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QueryAssistant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public QueryAssistantResult queryAssistant(QueryAssistantRequest request) {
        request = beforeClientExecution(request);
        return executeQueryAssistant(request);
    }

    @SdkInternalApi
    final QueryAssistantResult executeQueryAssistant(QueryAssistantRequest queryAssistantRequest) {

        ExecutionContext executionContext = createExecutionContext(queryAssistantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryAssistantRequest> request = null;
        Response<QueryAssistantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryAssistantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(queryAssistantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "QueryAssistant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<QueryAssistantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new QueryAssistantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a URI template from a knowledge base.
     * </p>
     * 
     * @param removeKnowledgeBaseTemplateUriRequest
     * @return Result of the RemoveKnowledgeBaseTemplateUri operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.RemoveKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RemoveKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveKnowledgeBaseTemplateUriResult removeKnowledgeBaseTemplateUri(RemoveKnowledgeBaseTemplateUriRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveKnowledgeBaseTemplateUri(request);
    }

    @SdkInternalApi
    final RemoveKnowledgeBaseTemplateUriResult executeRemoveKnowledgeBaseTemplateUri(RemoveKnowledgeBaseTemplateUriRequest removeKnowledgeBaseTemplateUriRequest) {

        ExecutionContext executionContext = createExecutionContext(removeKnowledgeBaseTemplateUriRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveKnowledgeBaseTemplateUriRequest> request = null;
        Response<RemoveKnowledgeBaseTemplateUriResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveKnowledgeBaseTemplateUriRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeKnowledgeBaseTemplateUriRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveKnowledgeBaseTemplateUri");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveKnowledgeBaseTemplateUriResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveKnowledgeBaseTemplateUriResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for content in a specified knowledge base. Can be used to get a specific content resource by its name.
     * </p>
     * 
     * @param searchContentRequest
     * @return Result of the SearchContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.SearchContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchContentResult searchContent(SearchContentRequest request) {
        request = beforeClientExecution(request);
        return executeSearchContent(request);
    }

    @SdkInternalApi
    final SearchContentResult executeSearchContent(SearchContentRequest searchContentRequest) {

        ExecutionContext executionContext = createExecutionContext(searchContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchContentRequest> request = null;
        Response<SearchContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for sessions.
     * </p>
     * 
     * @param searchSessionsRequest
     * @return Result of the SearchSessions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.SearchSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchSessions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchSessionsResult searchSessions(SearchSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSessions(request);
    }

    @SdkInternalApi
    final SearchSessionsResult executeSearchSessions(SearchSessionsRequest searchSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSessionsRequest> request = null;
        Response<SearchSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a URL to upload content to a knowledge base. To upload content, first make a PUT request to the returned URL
     * with your file, making sure to include the required headers. Then use <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_CreateContent.html">CreateContent</a> to
     * finalize the content creation process or <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_UpdateContent.html">UpdateContent</a> to modify
     * an existing resource. You can only upload content to a knowledge base of type CUSTOM.
     * </p>
     * 
     * @param startContentUploadRequest
     * @return Result of the StartContentUpload operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.StartContentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartContentUpload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartContentUploadResult startContentUpload(StartContentUploadRequest request) {
        request = beforeClientExecution(request);
        return executeStartContentUpload(request);
    }

    @SdkInternalApi
    final StartContentUploadResult executeStartContentUpload(StartContentUploadRequest startContentUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(startContentUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContentUploadRequest> request = null;
        Response<StartContentUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContentUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startContentUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartContentUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartContentUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartContentUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyTagsException
     *         Amazon Connect Wisdom throws this exception if you have too many tags in your tag set.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
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
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
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
     * Updates information about the content.
     * </p>
     * 
     * @param updateContentRequest
     * @return Result of the UpdateContent operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws PreconditionFailedException
     *         The provided <code>revisionId</code> does not match, indicating the content has been modified since it
     *         was last read.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.UpdateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateContentResult updateContent(UpdateContentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContent(request);
    }

    @SdkInternalApi
    final UpdateContentResult executeUpdateContent(UpdateContentRequest updateContentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContentRequest> request = null;
        Response<UpdateContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the template URI of a knowledge base. This is only supported for knowledge bases of type EXTERNAL.
     * Include a single variable in <code>${variable}</code> format; this interpolated by Wisdom using ingested content.
     * For example, if you ingest a Salesforce article, it has an <code>Id</code> value, and you can set the template
     * URI to <code>https://myInstanceName.lightning.force.com/lightning/r/Knowledge__kav/*${Id}*&#47;view</code>.
     * </p>
     * 
     * @param updateKnowledgeBaseTemplateUriRequest
     * @return Result of the UpdateKnowledgeBaseTemplateUri operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by a service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonConnectWisdom.UpdateKnowledgeBaseTemplateUri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateKnowledgeBaseTemplateUri"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateKnowledgeBaseTemplateUriResult updateKnowledgeBaseTemplateUri(UpdateKnowledgeBaseTemplateUriRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateKnowledgeBaseTemplateUri(request);
    }

    @SdkInternalApi
    final UpdateKnowledgeBaseTemplateUriResult executeUpdateKnowledgeBaseTemplateUri(UpdateKnowledgeBaseTemplateUriRequest updateKnowledgeBaseTemplateUriRequest) {

        ExecutionContext executionContext = createExecutionContext(updateKnowledgeBaseTemplateUriRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKnowledgeBaseTemplateUriRequest> request = null;
        Response<UpdateKnowledgeBaseTemplateUriResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKnowledgeBaseTemplateUriRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateKnowledgeBaseTemplateUriRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Wisdom");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateKnowledgeBaseTemplateUri");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateKnowledgeBaseTemplateUriResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateKnowledgeBaseTemplateUriResultJsonUnmarshaller());
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
