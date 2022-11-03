/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases;

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

import com.amazonaws.services.connectcases.AmazonConnectCasesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.connectcases.model.*;
import com.amazonaws.services.connectcases.model.transform.*;

/**
 * Client for accessing ConnectCases. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Welcome to the Amazon Connect Cases API Reference. This guide provides information about the Amazon Connect Cases
 * API, which you can use to create, update, get, and list Cases domains, fields, field options, layouts, templates,
 * cases, related items, and tags.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;For more information about Amazon Connect Cases, see &lt;a href=&quot;https://docs.aws.amazon.com/connect/latest/adminguide/cases.html&quot;&gt;Amazon Connect Cases&lt;/a&gt; in the &lt;i&gt;Amazon Connect Administrator Guide&lt;/i&gt;. &lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectCasesClient extends AmazonWebServiceClient implements AmazonConnectCases {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConnectCases.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cases";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcases.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.connectcases.model.AmazonConnectCasesException.class));

    public static AmazonConnectCasesClientBuilder builder() {
        return AmazonConnectCasesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ConnectCases using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectCasesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ConnectCases using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectCasesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cases.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/connectcases/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/connectcases/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns the description for the list of fields in the request parameters.
     * </p>
     * 
     * @param batchGetFieldRequest
     * @return Result of the BatchGetField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.BatchGetField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchGetField" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetFieldResult batchGetField(BatchGetFieldRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetField(request);
    }

    @SdkInternalApi
    final BatchGetFieldResult executeBatchGetField(BatchGetFieldRequest batchGetFieldRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetFieldRequest> request = null;
        Response<BatchGetFieldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetFieldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetField");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetFieldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetFieldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and updates a set of field options for a single select field in a Cases domain.
     * </p>
     * 
     * @param batchPutFieldOptionsRequest
     * @return Result of the BatchPutFieldOptions operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.BatchPutFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchPutFieldOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchPutFieldOptionsResult batchPutFieldOptions(BatchPutFieldOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutFieldOptions(request);
    }

    @SdkInternalApi
    final BatchPutFieldOptionsResult executeBatchPutFieldOptions(BatchPutFieldOptionsRequest batchPutFieldOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutFieldOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutFieldOptionsRequest> request = null;
        Response<BatchPutFieldOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutFieldOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutFieldOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutFieldOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutFieldOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchPutFieldOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a case in the specified Cases domain. Case system and custom fields are taken as an array id/value pairs
     * with a declared data types.
     * </p>
     * <note>
     * <p>
     * <code>customer_id</code> is a required field when creating a case.
     * </p>
     * </note>
     * 
     * @param createCaseRequest
     * @return Result of the CreateCase operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCaseResult createCase(CreateCaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCase(request);
    }

    @SdkInternalApi
    final CreateCaseResult executeCreateCase(CreateCaseRequest createCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCaseRequest> request = null;
        Response<CreateCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCaseResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a domain, which is a container for all case data, such as cases, fields, templates and layouts. Each
     * Amazon Connect instance can be associated with only one Cases domain.
     * </p>
     * <important>
     * <p>
     * This will not associate your connect instance to Cases domain. Instead, use the Amazon Connect <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateIntegrationAssociation.html"
     * >CreateIntegrationAssociation</a> API.
     * </p>
     * </important>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a field in the Cases domain. This field is used to define the case object model (that is, defines what
     * data can be captured on cases) in a Cases domain.
     * </p>
     * 
     * @param createFieldRequest
     * @return Result of the CreateField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateField" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFieldResult createField(CreateFieldRequest request) {
        request = beforeClientExecution(request);
        return executeCreateField(request);
    }

    @SdkInternalApi
    final CreateFieldResult executeCreateField(CreateFieldRequest createFieldRequest) {

        ExecutionContext executionContext = createExecutionContext(createFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFieldRequest> request = null;
        Response<CreateFieldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFieldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateField");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFieldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFieldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a layout in the Cases domain. Layouts define the following configuration in the top section and More Info
     * tab of the Cases user interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fields to display to the users
     * </p>
     * </li>
     * <li>
     * <p>
     * Field ordering
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts since they are not configurable.
     * </p>
     * </note>
     * 
     * @param createLayoutRequest
     * @return Result of the CreateLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLayoutResult createLayout(CreateLayoutRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLayout(request);
    }

    @SdkInternalApi
    final CreateLayoutResult executeCreateLayout(CreateLayoutRequest createLayoutRequest) {

        ExecutionContext executionContext = createExecutionContext(createLayoutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLayoutRequest> request = null;
        Response<CreateLayoutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLayoutRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLayoutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLayout");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLayoutResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLayoutResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a related item (comments, tasks, and contacts) and associates it with a case.
     * </p>
     * <note>
     * <p>
     * A Related Item is a resource that is associated with a case. It may or may not have an external identifier
     * linking it to an external resource (for example, a <code>contactArn</code>). All Related Items have their own
     * internal identifier, the <code>relatedItemArn</code>. Examples of related items include <code>comments</code> and
     * <code>contacts</code>.
     * </p>
     * </note>
     * 
     * @param createRelatedItemRequest
     * @return Result of the CreateRelatedItem operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateRelatedItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateRelatedItem" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRelatedItemResult createRelatedItem(CreateRelatedItemRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRelatedItem(request);
    }

    @SdkInternalApi
    final CreateRelatedItemResult executeCreateRelatedItem(CreateRelatedItemRequest createRelatedItemRequest) {

        ExecutionContext executionContext = createExecutionContext(createRelatedItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelatedItemRequest> request = null;
        Response<CreateRelatedItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelatedItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRelatedItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRelatedItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRelatedItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRelatedItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a template in the Cases domain. This template is used to define the case object model (that is, define
     * what data can be captured on cases) in a Cases domain. A template must have a unique name within a domain, and it
     * must reference existing field IDs and layout IDs. Additionally, multiple fields with same IDs are not allowed
     * within the same Template.
     * </p>
     * 
     * @param createTemplateRequest
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTemplateResult createTemplate(CreateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplate(request);
    }

    @SdkInternalApi
    final CreateTemplateResult executeCreateTemplate(CreateTemplateRequest createTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateRequest> request = null;
        Response<CreateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific case if it exists.
     * </p>
     * 
     * @param getCaseRequest
     * @return Result of the GetCase operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCaseResult getCase(GetCaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetCase(request);
    }

    @SdkInternalApi
    final GetCaseResult executeGetCase(GetCaseRequest getCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCaseRequest> request = null;
        Response<GetCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCaseResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the case event publishing configuration.
     * </p>
     * 
     * @param getCaseEventConfigurationRequest
     * @return Result of the GetCaseEventConfiguration operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCaseEventConfigurationResult getCaseEventConfiguration(GetCaseEventConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetCaseEventConfiguration(request);
    }

    @SdkInternalApi
    final GetCaseEventConfigurationResult executeGetCaseEventConfiguration(GetCaseEventConfigurationRequest getCaseEventConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getCaseEventConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCaseEventConfigurationRequest> request = null;
        Response<GetCaseEventConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCaseEventConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCaseEventConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCaseEventConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCaseEventConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCaseEventConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific domain if it exists.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainResult getDomain(GetDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomain(request);
    }

    @SdkInternalApi
    final GetDomainResult executeGetDomain(GetDomainRequest getDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainRequest> request = null;
        Response<GetDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details for the requested layout.
     * </p>
     * 
     * @param getLayoutRequest
     * @return Result of the GetLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetLayout" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLayoutResult getLayout(GetLayoutRequest request) {
        request = beforeClientExecution(request);
        return executeGetLayout(request);
    }

    @SdkInternalApi
    final GetLayoutResult executeGetLayout(GetLayoutRequest getLayoutRequest) {

        ExecutionContext executionContext = createExecutionContext(getLayoutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLayoutRequest> request = null;
        Response<GetLayoutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLayoutRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLayoutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLayout");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLayoutResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLayoutResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details for the requested template.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplate(request);
    }

    @SdkInternalApi
    final GetTemplateResult executeGetTemplate(GetTemplateRequest getTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists cases for a given contact.
     * </p>
     * 
     * @param listCasesForContactRequest
     * @return Result of the ListCasesForContact operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListCasesForContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListCasesForContact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCasesForContactResult listCasesForContact(ListCasesForContactRequest request) {
        request = beforeClientExecution(request);
        return executeListCasesForContact(request);
    }

    @SdkInternalApi
    final ListCasesForContactResult executeListCasesForContact(ListCasesForContactRequest listCasesForContactRequest) {

        ExecutionContext executionContext = createExecutionContext(listCasesForContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCasesForContactRequest> request = null;
        Response<ListCasesForContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCasesForContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCasesForContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCasesForContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCasesForContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCasesForContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all cases domains in the Amazon Web Services account. Each list item is a condensed summary object of the
     * domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the field options for a field identifier in the domain.
     * </p>
     * 
     * @param listFieldOptionsRequest
     * @return Result of the ListFieldOptions operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFieldOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFieldOptionsResult listFieldOptions(ListFieldOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListFieldOptions(request);
    }

    @SdkInternalApi
    final ListFieldOptionsResult executeListFieldOptions(ListFieldOptionsRequest listFieldOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFieldOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFieldOptionsRequest> request = null;
        Response<ListFieldOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFieldOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFieldOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFieldOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFieldOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFieldOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all fields in a Cases domain.
     * </p>
     * 
     * @param listFieldsRequest
     * @return Result of the ListFields operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFields" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFieldsResult listFields(ListFieldsRequest request) {
        request = beforeClientExecution(request);
        return executeListFields(request);
    }

    @SdkInternalApi
    final ListFieldsResult executeListFields(ListFieldsRequest listFieldsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFieldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFieldsRequest> request = null;
        Response<ListFieldsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFieldsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFieldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFields");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFieldsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFieldsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all layouts in the given cases domain. Each list item is a condensed summary object of the layout.
     * </p>
     * 
     * @param listLayoutsRequest
     * @return Result of the ListLayouts operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListLayouts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListLayouts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLayoutsResult listLayouts(ListLayoutsRequest request) {
        request = beforeClientExecution(request);
        return executeListLayouts(request);
    }

    @SdkInternalApi
    final ListLayoutsResult executeListLayouts(ListLayoutsRequest listLayoutsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLayoutsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLayoutsRequest> request = null;
        Response<ListLayoutsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLayoutsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLayoutsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLayouts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLayoutsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLayoutsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
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
     * Lists all of the templates in a Cases domain. Each list item is a condensed summary object of the template.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplates(request);
    }

    @SdkInternalApi
    final ListTemplatesResult executeListTemplates(ListTemplatesRequest listTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * API for adding case event publishing configuration
     * </p>
     * 
     * @param putCaseEventConfigurationRequest
     * @return Result of the PutCaseEventConfiguration operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.PutCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/PutCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutCaseEventConfigurationResult putCaseEventConfiguration(PutCaseEventConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutCaseEventConfiguration(request);
    }

    @SdkInternalApi
    final PutCaseEventConfigurationResult executePutCaseEventConfiguration(PutCaseEventConfigurationRequest putCaseEventConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putCaseEventConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutCaseEventConfigurationRequest> request = null;
        Response<PutCaseEventConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutCaseEventConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putCaseEventConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutCaseEventConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutCaseEventConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutCaseEventConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for cases within their associated Cases domain. Search results are returned as a paginated list of
     * abridged case documents.
     * </p>
     * 
     * @param searchCasesRequest
     * @return Result of the SearchCases operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.SearchCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchCases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchCasesResult searchCases(SearchCasesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchCases(request);
    }

    @SdkInternalApi
    final SearchCasesResult executeSearchCases(SearchCasesRequest searchCasesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchCasesRequest> request = null;
        Response<SearchCasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchCasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchCasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchCases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchCasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchCasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for related items that are associated with a case.
     * </p>
     * <note>
     * <p>
     * If no filters are provided, this returns all related items associated with a case.
     * </p>
     * </note>
     * 
     * @param searchRelatedItemsRequest
     * @return Result of the SearchRelatedItems operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.SearchRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchRelatedItemsResult searchRelatedItems(SearchRelatedItemsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchRelatedItems(request);
    }

    @SdkInternalApi
    final SearchRelatedItemsResult executeSearchRelatedItems(SearchRelatedItemsRequest searchRelatedItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRelatedItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRelatedItemsRequest> request = null;
        Response<SearchRelatedItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRelatedItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRelatedItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchRelatedItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchRelatedItemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchRelatedItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
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
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
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
     * Updates the values of fields on a case. Fields to be updated are received as an array of id/value pairs identical
     * to the <code>CreateCase</code> input .
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param updateCaseRequest
     * @return Result of the UpdateCase operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.UpdateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCaseResult updateCase(UpdateCaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCase(request);
    }

    @SdkInternalApi
    final UpdateCaseResult executeUpdateCase(UpdateCaseRequest updateCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCaseRequest> request = null;
        Response<UpdateCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCaseResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the properties of an existing field.
     * </p>
     * 
     * @param updateFieldRequest
     * @return Result of the UpdateField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.UpdateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateField" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFieldResult updateField(UpdateFieldRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateField(request);
    }

    @SdkInternalApi
    final UpdateFieldResult executeUpdateField(UpdateFieldRequest updateFieldRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFieldRequest> request = null;
        Response<UpdateFieldResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFieldRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateField");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFieldResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFieldResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the attributes of an existing layout.
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * <p>
     * A <code>ValidationException</code> is returned when you add non-existent <code>fieldIds</code> to a layout.
     * </p>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts because they are not configurable.
     * </p>
     * </note>
     * 
     * @param updateLayoutRequest
     * @return Result of the UpdateLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.UpdateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLayoutResult updateLayout(UpdateLayoutRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLayout(request);
    }

    @SdkInternalApi
    final UpdateLayoutResult executeUpdateLayout(UpdateLayoutRequest updateLayoutRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLayoutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLayoutRequest> request = null;
        Response<UpdateLayoutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLayoutRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLayoutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLayout");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLayoutResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLayoutResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the attributes of an existing template. The template attributes that can be modified include
     * <code>name</code>, <code>description</code>, <code>layouts</code>, and <code>requiredFields</code>. At least one
     * of these attributes must not be null. If a null value is provided for a given attribute, that attribute is
     * ignored and its current value is preserved.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTemplateResult updateTemplate(UpdateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplate(request);
    }

    @SdkInternalApi
    final UpdateTemplateResult executeUpdateTemplate(UpdateTemplateRequest updateTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateRequest> request = null;
        Response<UpdateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCases");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTemplateResultJsonUnmarshaller());
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
