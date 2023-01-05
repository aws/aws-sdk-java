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
package com.amazonaws.services.iotroborunner;

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

import com.amazonaws.services.iotroborunner.AWSIoTRoboRunnerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotroborunner.model.*;
import com.amazonaws.services.iotroborunner.model.transform.*;

/**
 * Client for accessing AWS IoT RoboRunner. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * An example service, deployed with the Octane Service creator, which will echo the string
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTRoboRunnerClient extends AmazonWebServiceClient implements AWSIoTRoboRunner {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTRoboRunner.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotroborunner";

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
                                    com.amazonaws.services.iotroborunner.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotroborunner.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotroborunner.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotroborunner.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotroborunner.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotroborunner.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotroborunner.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotroborunner.model.AWSIoTRoboRunnerException.class));

    public static AWSIoTRoboRunnerClientBuilder builder() {
        return AWSIoTRoboRunnerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT RoboRunner using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTRoboRunnerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT RoboRunner using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTRoboRunnerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iotroborunner.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotroborunner/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotroborunner/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Grants permission to create a destination
     * </p>
     * 
     * @param createDestinationRequest
     * @return Result of the CreateDestination operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDestinationResult createDestination(CreateDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDestination(request);
    }

    @SdkInternalApi
    final CreateDestinationResult executeCreateDestination(CreateDestinationRequest createDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDestinationRequest> request = null;
        Response<CreateDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to create a site
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSiteResult createSite(CreateSiteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSite(request);
    }

    @SdkInternalApi
    final CreateSiteResult executeCreateSite(CreateSiteRequest createSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(createSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSiteRequest> request = null;
        Response<CreateSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to create a worker
     * </p>
     * 
     * @param createWorkerRequest
     * @return Result of the CreateWorker operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorkerResult createWorker(CreateWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorker(request);
    }

    @SdkInternalApi
    final CreateWorkerResult executeCreateWorker(CreateWorkerRequest createWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkerRequest> request = null;
        Response<CreateWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to create a worker fleet
     * </p>
     * 
     * @param createWorkerFleetRequest
     * @return Result of the CreateWorkerFleet operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkerFleetResult createWorkerFleet(CreateWorkerFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkerFleet(request);
    }

    @SdkInternalApi
    final CreateWorkerFleetResult executeCreateWorkerFleet(CreateWorkerFleetRequest createWorkerFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkerFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkerFleetRequest> request = null;
        Response<CreateWorkerFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkerFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkerFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkerFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkerFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkerFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to delete a destination
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDestinationResult deleteDestination(DeleteDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDestination(request);
    }

    @SdkInternalApi
    final DeleteDestinationResult executeDeleteDestination(DeleteDestinationRequest deleteDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDestinationRequest> request = null;
        Response<DeleteDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to delete a site
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSiteResult deleteSite(DeleteSiteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSite(request);
    }

    @SdkInternalApi
    final DeleteSiteResult executeDeleteSite(DeleteSiteRequest deleteSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSiteRequest> request = null;
        Response<DeleteSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to delete a worker
     * </p>
     * 
     * @param deleteWorkerRequest
     * @return Result of the DeleteWorker operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorker" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWorkerResult deleteWorker(DeleteWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorker(request);
    }

    @SdkInternalApi
    final DeleteWorkerResult executeDeleteWorker(DeleteWorkerRequest deleteWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkerRequest> request = null;
        Response<DeleteWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to delete a worker fleet
     * </p>
     * 
     * @param deleteWorkerFleetRequest
     * @return Result of the DeleteWorkerFleet operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkerFleetResult deleteWorkerFleet(DeleteWorkerFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkerFleet(request);
    }

    @SdkInternalApi
    final DeleteWorkerFleetResult executeDeleteWorkerFleet(DeleteWorkerFleetRequest deleteWorkerFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkerFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkerFleetRequest> request = null;
        Response<DeleteWorkerFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkerFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkerFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkerFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkerFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkerFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to get a destination
     * </p>
     * 
     * @param getDestinationRequest
     * @return Result of the GetDestination operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDestinationResult getDestination(GetDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDestination(request);
    }

    @SdkInternalApi
    final GetDestinationResult executeGetDestination(GetDestinationRequest getDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDestinationRequest> request = null;
        Response<GetDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to get a site
     * </p>
     * 
     * @param getSiteRequest
     * @return Result of the GetSite operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSiteResult getSite(GetSiteRequest request) {
        request = beforeClientExecution(request);
        return executeGetSite(request);
    }

    @SdkInternalApi
    final GetSiteResult executeGetSite(GetSiteRequest getSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(getSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSiteRequest> request = null;
        Response<GetSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to get a worker
     * </p>
     * 
     * @param getWorkerRequest
     * @return Result of the GetWorker operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkerResult getWorker(GetWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorker(request);
    }

    @SdkInternalApi
    final GetWorkerResult executeGetWorker(GetWorkerRequest getWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkerRequest> request = null;
        Response<GetWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkerResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to get a worker fleet
     * </p>
     * 
     * @param getWorkerFleetRequest
     * @return Result of the GetWorkerFleet operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorkerFleet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetWorkerFleetResult getWorkerFleet(GetWorkerFleetRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkerFleet(request);
    }

    @SdkInternalApi
    final GetWorkerFleetResult executeGetWorkerFleet(GetWorkerFleetRequest getWorkerFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkerFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkerFleetRequest> request = null;
        Response<GetWorkerFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkerFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkerFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkerFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkerFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkerFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to list destinations
     * </p>
     * 
     * @param listDestinationsRequest
     * @return Result of the ListDestinations operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDestinationsResult listDestinations(ListDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDestinations(request);
    }

    @SdkInternalApi
    final ListDestinationsResult executeListDestinations(ListDestinationsRequest listDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDestinationsRequest> request = null;
        Response<ListDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to list sites
     * </p>
     * 
     * @param listSitesRequest
     * @return Result of the ListSites operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSitesResult listSites(ListSitesRequest request) {
        request = beforeClientExecution(request);
        return executeListSites(request);
    }

    @SdkInternalApi
    final ListSitesResult executeListSites(ListSitesRequest listSitesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSitesRequest> request = null;
        Response<ListSitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSitesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to list worker fleets
     * </p>
     * 
     * @param listWorkerFleetsRequest
     * @return Result of the ListWorkerFleets operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListWorkerFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkerFleets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkerFleetsResult listWorkerFleets(ListWorkerFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkerFleets(request);
    }

    @SdkInternalApi
    final ListWorkerFleetsResult executeListWorkerFleets(ListWorkerFleetsRequest listWorkerFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkerFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkerFleetsRequest> request = null;
        Response<ListWorkerFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkerFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkerFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkerFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkerFleetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkerFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to list workers
     * </p>
     * 
     * @param listWorkersRequest
     * @return Result of the ListWorkers operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkersResult listWorkers(ListWorkersRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkers(request);
    }

    @SdkInternalApi
    final ListWorkersResult executeListWorkers(ListWorkersRequest listWorkersRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkersRequest> request = null;
        Response<ListWorkersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to update a destination
     * </p>
     * 
     * @param updateDestinationRequest
     * @return Result of the UpdateDestination operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDestinationResult updateDestination(UpdateDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDestination(request);
    }

    @SdkInternalApi
    final UpdateDestinationResult executeUpdateDestination(UpdateDestinationRequest updateDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDestinationRequest> request = null;
        Response<UpdateDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to update a site
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSiteResult updateSite(UpdateSiteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSite(request);
    }

    @SdkInternalApi
    final UpdateSiteResult executeUpdateSite(UpdateSiteRequest updateSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSiteRequest> request = null;
        Response<UpdateSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to update a worker
     * </p>
     * 
     * @param updateWorkerRequest
     * @return Result of the UpdateWorker operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateWorkerResult updateWorker(UpdateWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorker(request);
    }

    @SdkInternalApi
    final UpdateWorkerResult executeUpdateWorker(UpdateWorkerRequest updateWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkerRequest> request = null;
        Response<UpdateWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Grants permission to update a worker fleet
     * </p>
     * 
     * @param updateWorkerFleetRequest
     * @return Result of the UpdateWorkerFleet operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkerFleetResult updateWorkerFleet(UpdateWorkerFleetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkerFleet(request);
    }

    @SdkInternalApi
    final UpdateWorkerFleetResult executeUpdateWorkerFleet(UpdateWorkerFleetRequest updateWorkerFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkerFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkerFleetRequest> request = null;
        Response<UpdateWorkerFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkerFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkerFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT RoboRunner");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkerFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkerFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkerFleetResultJsonUnmarshaller());
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
