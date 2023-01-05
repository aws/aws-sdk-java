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
package com.amazonaws.services.cloudcontrolapi;

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

import com.amazonaws.services.cloudcontrolapi.AWSCloudControlApiClientBuilder;
import com.amazonaws.services.cloudcontrolapi.waiters.AWSCloudControlApiWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudcontrolapi.model.*;
import com.amazonaws.services.cloudcontrolapi.model.transform.*;

/**
 * Client for accessing CloudControlApi. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * For more information about Amazon Web Services Cloud Control API, see the <a
 * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/what-is-cloudcontrolapi.html">Amazon Web Services
 * Cloud Control API User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudControlApiClient extends AmazonWebServiceClient implements AWSCloudControlApi {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudControlApi.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudcontrolapi";

    private volatile AWSCloudControlApiWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HandlerFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.HandlerFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HandlerInternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.HandlerInternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ServiceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceInternalErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ServiceInternalErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PrivateTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.PrivateTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTokenNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.RequestTokenNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientTokenConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ClientTokenConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NetworkFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.NetworkFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.AlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ConcurrentOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedActionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.UnsupportedActionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotStabilizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.NotStabilizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ResourceConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCredentialsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.InvalidCredentialsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GeneralServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.GeneralServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TypeNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.TypeNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotUpdatableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudcontrolapi.model.transform.NotUpdatableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudcontrolapi.model.AWSCloudControlApiException.class));

    public static AWSCloudControlApiClientBuilder builder() {
        return AWSCloudControlApiClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudControlApi using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudControlApiClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudControlApi using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudControlApiClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cloudcontrolapi.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudcontrolapi/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudcontrolapi/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels the specified resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-cancel"
     * >Canceling resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * Only resource operations requests with a status of <code>PENDING</code> or <code>IN_PROGRESS</code> can be
     * canceled.
     * </p>
     * 
     * @param cancelResourceRequestRequest
     * @return Result of the CancelResourceRequest operation returned by the service.
     * @throws ConcurrentModificationException
     *         The resource is currently being modified by another operation.
     * @throws RequestTokenNotFoundException
     *         A resource operation with the specified request token can't be found.
     * @sample AWSCloudControlApi.CancelResourceRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CancelResourceRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelResourceRequestResult cancelResourceRequest(CancelResourceRequestRequest request) {
        request = beforeClientExecution(request);
        return executeCancelResourceRequest(request);
    }

    @SdkInternalApi
    final CancelResourceRequestResult executeCancelResourceRequest(CancelResourceRequestRequest cancelResourceRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelResourceRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelResourceRequestRequest> request = null;
        Response<CancelResourceRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelResourceRequestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelResourceRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelResourceRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelResourceRequestResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CancelResourceRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified resource. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html">Creating a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> type returned
     * by <code>CreateResource</code>.
     * </p>
     * 
     * @param createResourceRequest
     * @return Result of the CreateResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws ConcurrentOperationException
     *         Another resource operation is currently being performed on this resource.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ClientTokenConflictException
     *         The specified client token has already been used in another resource request.</p>
     *         <p>
     *         It's best practice for client tokens to be unique for each resource operation request. However, client
     *         token expire after 36 hours.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CreateResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateResourceResult createResource(CreateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResource(request);
    }

    @SdkInternalApi
    final CreateResourceResult executeCreateResource(CreateResourceRequest createResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceRequest> request = null;
        Response<CreateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified resource. For details, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-delete.html">Deleting a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource deletion request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>DeleteResource</code>.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return Result of the DeleteResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws ConcurrentOperationException
     *         Another resource operation is currently being performed on this resource.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ClientTokenConflictException
     *         The specified client token has already been used in another resource request.</p>
     *         <p>
     *         It's best practice for client tokens to be unique for each resource operation request. However, client
     *         token expire after 36 hours.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/DeleteResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteResourceResult deleteResource(DeleteResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResource(request);
    }

    @SdkInternalApi
    final DeleteResourceResult executeDeleteResource(DeleteResourceRequest deleteResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceRequest> request = null;
        Response<DeleteResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the current state of the specified resource. For details, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-read.html">Reading a
     * resource's current state</a>.
     * </p>
     * <p>
     * You can use this action to return information about an existing resource in your account and Amazon Web Services
     * Region, whether those resources were provisioned using Cloud Control API.
     * </p>
     * 
     * @param getResourceRequest
     * @return Result of the GetResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.GetResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetResourceResult getResource(GetResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetResource(request);
    }

    @SdkInternalApi
    final GetResourceResult executeGetResource(GetResourceRequest getResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceRequest> request = null;
        Response<GetResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current status of a resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-track"
     * >Tracking the progress of resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @param getResourceRequestStatusRequest
     * @return Result of the GetResourceRequestStatus operation returned by the service.
     * @throws RequestTokenNotFoundException
     *         A resource operation with the specified request token can't be found.
     * @sample AWSCloudControlApi.GetResourceRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResourceRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceRequestStatusResult getResourceRequestStatus(GetResourceRequestStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceRequestStatus(request);
    }

    @SdkInternalApi
    final GetResourceRequestStatusResult executeGetResourceRequestStatus(GetResourceRequestStatusRequest getResourceRequestStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceRequestStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceRequestStatusRequest> request = null;
        Response<GetResourceRequestStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceRequestStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResourceRequestStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceRequestStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceRequestStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResourceRequestStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns existing resource operation requests. This includes requests of all status types. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-list"
     * >Listing active resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Resource operation requests expire after 7 days.
     * </p>
     * </note>
     * 
     * @param listResourceRequestsRequest
     * @return Result of the ListResourceRequests operation returned by the service.
     * @sample AWSCloudControlApi.ListResourceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResourceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceRequestsResult listResourceRequests(ListResourceRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceRequests(request);
    }

    @SdkInternalApi
    final ListResourceRequestsResult executeListResourceRequests(ListResourceRequestsRequest listResourceRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceRequestsRequest> request = null;
        Response<ListResourceRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceRequestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourceRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified resources. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-list.html">Discovering
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * You can use this action to return information about existing resources in your account and Amazon Web Services
     * Region, whether those resources were provisioned using Cloud Control API.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListResources(request);
    }

    @SdkInternalApi
    final ListResourcesResult executeListResources(ListResourcesRequest listResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesRequest> request = null;
        Response<ListResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified property values in the resource.
     * </p>
     * <p>
     * You specify your resource property updates as a list of patch operations contained in a JSON patch document that
     * adheres to the <a href="https://datatracker.ietf.org/doc/html/rfc6902"> <i>RFC 6902 - JavaScript Object Notation
     * (JSON) Patch</i> </a> standard.
     * </p>
     * <p>
     * For details on how Cloud Control API performs resource update operations, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-update.html">Updating a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource update request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>UpdateResource</code>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>CloudFormation Users Guide</i>.
     * </p>
     * 
     * @param updateResourceRequest
     * @return Result of the UpdateResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws ConcurrentOperationException
     *         Another resource operation is currently being performed on this resource.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ClientTokenConflictException
     *         The specified client token has already been used in another resource request.</p>
     *         <p>
     *         It's best practice for client tokens to be unique for each resource operation request. However, client
     *         token expire after 36 hours.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResource(request);
    }

    @SdkInternalApi
    final UpdateResourceResult executeUpdateResource(UpdateResourceRequest updateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudControl");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceResultJsonUnmarshaller());
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
    public AWSCloudControlApiWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSCloudControlApiWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
