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
package com.amazonaws.services.appintegrations;

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

import com.amazonaws.services.appintegrations.AmazonAppIntegrationsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appintegrations.model.*;
import com.amazonaws.services.appintegrations.model.transform.*;

/**
 * Client for accessing Amazon AppIntegrations Service. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.
 * </p>
 * <p>
 * For information about how you can use external applications with Amazon Connect, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/crm.html">Set up pre-built integrations</a> and <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-wisdom.html">Deliver information to agents
 * using Amazon Connect Wisdom</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppIntegrationsClient extends AmazonWebServiceClient implements AmazonAppIntegrations {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAppIntegrations.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "app-integrations";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateResourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.DuplicateResourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.ResourceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appintegrations.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appintegrations.model.AmazonAppIntegrationsException.class));

    public static AmazonAppIntegrationsClientBuilder builder() {
        return AmazonAppIntegrationsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppIntegrations Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAppIntegrationsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppIntegrations Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAppIntegrationsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("app-integrations.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appintegrations/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appintegrations/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates and persists a DataIntegration resource.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <code>CreateDataIntegration</code> API.
     * </p>
     * </note>
     * 
     * @param createDataIntegrationRequest
     * @return Result of the CreateDataIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceQuotaExceededException
     *         The allowed quota for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.CreateDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDataIntegrationResult createDataIntegration(CreateDataIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataIntegration(request);
    }

    @SdkInternalApi
    final CreateDataIntegrationResult executeCreateDataIntegration(CreateDataIntegrationRequest createDataIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataIntegrationRequest> request = null;
        Response<CreateDataIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataIntegrationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDataIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an EventIntegration, given a specified name, description, and a reference to an Amazon EventBridge bus in
     * your account and a partner event source that pushes events to that bus. No objects are created in the your
     * account, only metadata that is persisted on the EventIntegration control plane.
     * </p>
     * 
     * @param createEventIntegrationRequest
     * @return Result of the CreateEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceQuotaExceededException
     *         The allowed quota for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.CreateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEventIntegrationResult createEventIntegration(CreateEventIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventIntegration(request);
    }

    @SdkInternalApi
    final CreateEventIntegrationResult executeCreateEventIntegration(CreateEventIntegrationRequest createEventIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventIntegrationRequest> request = null;
        Response<CreateEventIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEventIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEventIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the DataIntegration. Only DataIntegrations that don't have any DataIntegrationAssociations can be
     * deleted. Deleting a DataIntegration also deletes the underlying Amazon AppFlow flow and service linked role.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param deleteDataIntegrationRequest
     * @return Result of the DeleteDataIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.DeleteDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDataIntegrationResult deleteDataIntegration(DeleteDataIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataIntegration(request);
    }

    @SdkInternalApi
    final DeleteDataIntegrationResult executeDeleteDataIntegration(DeleteDataIntegrationRequest deleteDataIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataIntegrationRequest> request = null;
        Response<DeleteDataIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataIntegrationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDataIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified existing event integration. If the event integration is associated with clients, the
     * request is rejected.
     * </p>
     * 
     * @param deleteEventIntegrationRequest
     * @return Result of the DeleteEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.DeleteEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEventIntegrationResult deleteEventIntegration(DeleteEventIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventIntegration(request);
    }

    @SdkInternalApi
    final DeleteEventIntegrationResult executeDeleteEventIntegration(DeleteEventIntegrationRequest deleteEventIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventIntegrationRequest> request = null;
        Response<DeleteEventIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEventIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the DataIntegration.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param getDataIntegrationRequest
     * @return Result of the GetDataIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.GetDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDataIntegrationResult getDataIntegration(GetDataIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataIntegration(request);
    }

    @SdkInternalApi
    final GetDataIntegrationResult executeGetDataIntegration(GetDataIntegrationRequest getDataIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataIntegrationRequest> request = null;
        Response<GetDataIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the event integration.
     * </p>
     * 
     * @param getEventIntegrationRequest
     * @return Result of the GetEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.GetEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEventIntegrationResult getEventIntegration(GetEventIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventIntegration(request);
    }

    @SdkInternalApi
    final GetEventIntegrationResult executeGetEventIntegration(GetEventIntegrationRequest getEventIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventIntegrationRequest> request = null;
        Response<GetEventIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of DataIntegration associations in the account.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param listDataIntegrationAssociationsRequest
     * @return Result of the ListDataIntegrationAssociations operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.ListDataIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataIntegrationAssociationsResult listDataIntegrationAssociations(ListDataIntegrationAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataIntegrationAssociations(request);
    }

    @SdkInternalApi
    final ListDataIntegrationAssociationsResult executeListDataIntegrationAssociations(
            ListDataIntegrationAssociationsRequest listDataIntegrationAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataIntegrationAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataIntegrationAssociationsRequest> request = null;
        Response<ListDataIntegrationAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataIntegrationAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDataIntegrationAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataIntegrationAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataIntegrationAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDataIntegrationAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of DataIntegrations in the account.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param listDataIntegrationsRequest
     * @return Result of the ListDataIntegrations operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.ListDataIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataIntegrationsResult listDataIntegrations(ListDataIntegrationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataIntegrations(request);
    }

    @SdkInternalApi
    final ListDataIntegrationsResult executeListDataIntegrations(ListDataIntegrationsRequest listDataIntegrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataIntegrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataIntegrationsRequest> request = null;
        Response<ListDataIntegrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataIntegrationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataIntegrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataIntegrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataIntegrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataIntegrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of event integration associations in the account.
     * </p>
     * 
     * @param listEventIntegrationAssociationsRequest
     * @return Result of the ListEventIntegrationAssociations operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.ListEventIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEventIntegrationAssociationsResult listEventIntegrationAssociations(ListEventIntegrationAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListEventIntegrationAssociations(request);
    }

    @SdkInternalApi
    final ListEventIntegrationAssociationsResult executeListEventIntegrationAssociations(
            ListEventIntegrationAssociationsRequest listEventIntegrationAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventIntegrationAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventIntegrationAssociationsRequest> request = null;
        Response<ListEventIntegrationAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventIntegrationAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEventIntegrationAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventIntegrationAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventIntegrationAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEventIntegrationAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of event integrations in the account.
     * </p>
     * 
     * @param listEventIntegrationsRequest
     * @return Result of the ListEventIntegrations operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.ListEventIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEventIntegrationsResult listEventIntegrations(ListEventIntegrationsRequest request) {
        request = beforeClientExecution(request);
        return executeListEventIntegrations(request);
    }

    @SdkInternalApi
    final ListEventIntegrationsResult executeListEventIntegrations(ListEventIntegrationsRequest listEventIntegrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventIntegrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventIntegrationsRequest> request = null;
        Response<ListEventIntegrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventIntegrationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventIntegrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventIntegrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventIntegrationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListEventIntegrationsResultJsonUnmarshaller());
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
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonAppIntegrations.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
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
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonAppIntegrations.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
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
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonAppIntegrations.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
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
     * Updates the description of a DataIntegration.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param updateDataIntegrationRequest
     * @return Result of the UpdateDataIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.UpdateDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDataIntegrationResult updateDataIntegration(UpdateDataIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataIntegration(request);
    }

    @SdkInternalApi
    final UpdateDataIntegrationResult executeUpdateDataIntegration(UpdateDataIntegrationRequest updateDataIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataIntegrationRequest> request = null;
        Response<UpdateDataIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDataIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataIntegrationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDataIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of an event integration.
     * </p>
     * 
     * @param updateEventIntegrationRequest
     * @return Result of the UpdateEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.UpdateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEventIntegrationResult updateEventIntegration(UpdateEventIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventIntegration(request);
    }

    @SdkInternalApi
    final UpdateEventIntegrationResult executeUpdateEventIntegration(UpdateEventIntegrationRequest updateEventIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventIntegrationRequest> request = null;
        Response<UpdateEventIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEventIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppIntegrations");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEventIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEventIntegrationResultJsonUnmarshaller());
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
