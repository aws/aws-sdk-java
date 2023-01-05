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
package com.amazonaws.services.iotfleetwise;

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

import com.amazonaws.services.iotfleetwise.AWSIoTFleetWiseClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.services.iotfleetwise.model.transform.*;

/**
 * Client for accessing AWS IoT FleetWise. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services IoT FleetWise is a fully managed service that you can use to collect, model, and transfer vehicle
 * data to the Amazon Web Services cloud at scale. With Amazon Web Services IoT FleetWise, you can standardize all of
 * your vehicle data models, independent of the in-vehicle communication architecture, and define data collection rules
 * to transfer only high-value data to the cloud.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/">What is Amazon
 * Web Services IoT FleetWise?</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTFleetWiseClient extends AmazonWebServiceClient implements AWSIoTFleetWise {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTFleetWise.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotfleetwise";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DecoderManifestValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.DecoderManifestValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSignalsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.InvalidSignalsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNodeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotfleetwise.model.transform.InvalidNodeExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException.class));

    public static AWSIoTFleetWiseClientBuilder builder() {
        return AWSIoTFleetWiseClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT FleetWise using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTFleetWiseClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT FleetWise using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTFleetWiseClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iotfleetwise.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotfleetwise/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotfleetwise/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds, or associates, a vehicle with a fleet.
     * </p>
     * 
     * @param associateVehicleFleetRequest
     * @return Result of the AssociateVehicleFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.AssociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/AssociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateVehicleFleetResult associateVehicleFleet(AssociateVehicleFleetRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateVehicleFleet(request);
    }

    @SdkInternalApi
    final AssociateVehicleFleetResult executeAssociateVehicleFleet(AssociateVehicleFleetRequest associateVehicleFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(associateVehicleFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateVehicleFleetRequest> request = null;
        Response<AssociateVehicleFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateVehicleFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateVehicleFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateVehicleFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateVehicleFleetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateVehicleFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a group, or batch, of vehicles.
     * </p>
     * <note>
     * <p>
     * You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicles-cli.html">Create multiple
     * vehicles (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateVehicleRequest
     * @return Result of the BatchCreateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.BatchCreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchCreateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateVehicleResult batchCreateVehicle(BatchCreateVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateVehicle(request);
    }

    @SdkInternalApi
    final BatchCreateVehicleResult executeBatchCreateVehicle(BatchCreateVehicleRequest batchCreateVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateVehicleRequest> request = null;
        Response<BatchCreateVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchCreateVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateVehicleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchCreateVehicleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a group, or batch, of vehicles.
     * </p>
     * <note>
     * <p>
     * You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/update-vehicles-cli.html">Update multiple
     * vehicles (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param batchUpdateVehicleRequest
     * @return Result of the BatchUpdateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.BatchUpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchUpdateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateVehicleResult batchUpdateVehicle(BatchUpdateVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateVehicle(request);
    }

    @SdkInternalApi
    final BatchUpdateVehicleResult executeBatchUpdateVehicle(BatchUpdateVehicleRequest batchUpdateVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateVehicleRequest> request = null;
        Response<BatchUpdateVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateVehicleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateVehicleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an orchestration of data collection rules. The Amazon Web Services IoT FleetWise Edge Agent software
     * running in vehicles uses campaigns to decide how to collect and transfer data to the cloud. You create campaigns
     * in the cloud. After you or your team approve campaigns, Amazon Web Services IoT FleetWise automatically deploys
     * them to vehicles.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/campaigns.html">Collect and transfer data
     * with campaigns</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCampaignResult createCampaign(CreateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCampaign(request);
    }

    @SdkInternalApi
    final CreateCampaignResult executeCreateCampaign(CreateCampaignRequest createCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the decoder manifest associated with a model manifest. To create a decoder manifest, the following must
     * be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every signal decoder has a unique name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each signal decoder is associated with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each network interface has a unique ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The signal decoders are specified in the model manifest.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDecoderManifestRequest
     * @return Result of the CreateDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws DecoderManifestValidationException
     *         The request couldn't be completed because it contains signal decoders with one or more validation errors.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDecoderManifestResult createDecoderManifest(CreateDecoderManifestRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDecoderManifest(request);
    }

    @SdkInternalApi
    final CreateDecoderManifestResult executeCreateDecoderManifest(CreateDecoderManifestRequest createDecoderManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(createDecoderManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDecoderManifestRequest> request = null;
        Response<CreateDecoderManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDecoderManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDecoderManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDecoderManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDecoderManifestResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDecoderManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a fleet that represents a group of vehicles.
     * </p>
     * <note>
     * <p>
     * You must create both a signal catalog and vehicles before you can create a fleet.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleets.html">Fleets</a> in the <i>Amazon
     * Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleet(request);
    }

    @SdkInternalApi
    final CreateFleetResult executeCreateFleet(CreateFleetRequest createFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors, and actuators).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicle-models.html">Vehicle models</a> in
     * the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createModelManifestRequest
     * @return Result of the CreateModelManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateModelManifestResult createModelManifest(CreateModelManifestRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModelManifest(request);
    }

    @SdkInternalApi
    final CreateModelManifestResult executeCreateModelManifest(CreateModelManifestRequest createModelManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelManifestRequest> request = null;
        Response<CreateModelManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModelManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a collection of standardized signals that can be reused to create vehicle models.
     * </p>
     * 
     * @param createSignalCatalogRequest
     * @return Result of the CreateSignalCatalog operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws InvalidNodeException
     *         The specified node type doesn't match the expected node type for a node. You can specify the node type as
     *         branch, sensor, actuator, or attribute.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSignalCatalogResult createSignalCatalog(CreateSignalCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSignalCatalog(request);
    }

    @SdkInternalApi
    final CreateSignalCatalogResult executeCreateSignalCatalog(CreateSignalCatalogRequest createSignalCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(createSignalCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSignalCatalogRequest> request = null;
        Response<CreateSignalCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSignalCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSignalCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSignalCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSignalCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSignalCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a vehicle, which is an instance of a vehicle model (model manifest). Vehicles created from the same
     * vehicle model consist of the same signals inherited from the vehicle model.
     * </p>
     * <note>
     * <p>
     * If you have an existing Amazon Web Services IoT Thing, you can use Amazon Web Services IoT FleetWise to create a
     * vehicle and collect data from your thing.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicle-cli.html">Create a vehicle
     * (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createVehicleRequest
     * @return Result of the CreateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVehicleResult createVehicle(CreateVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVehicle(request);
    }

    @SdkInternalApi
    final CreateVehicleResult executeCreateVehicle(CreateVehicleRequest createVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(createVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVehicleRequest> request = null;
        Response<CreateVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVehicleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVehicleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a data collection campaign. Deleting a campaign suspends all data collection and removes it from any
     * vehicles.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCampaignResult deleteCampaign(DeleteCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCampaign(request);
    }

    @SdkInternalApi
    final DeleteCampaignResult executeDeleteCampaign(DeleteCampaignRequest deleteCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<DeleteCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a decoder manifest. You can't delete a decoder manifest if it has vehicles associated with it.
     * </p>
     * <note>
     * <p>
     * If the decoder manifest is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200
     * response with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteDecoderManifestRequest
     * @return Result of the DeleteDecoderManifest operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDecoderManifestResult deleteDecoderManifest(DeleteDecoderManifestRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDecoderManifest(request);
    }

    @SdkInternalApi
    final DeleteDecoderManifestResult executeDeleteDecoderManifest(DeleteDecoderManifestRequest deleteDecoderManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDecoderManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDecoderManifestRequest> request = null;
        Response<DeleteDecoderManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDecoderManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDecoderManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDecoderManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDecoderManifestResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDecoderManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a fleet. Before you delete a fleet, all vehicles must be dissociated from the fleet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/delete-fleet-cli.html">Delete a fleet (AWS
     * CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the fleet is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty body.
     * </p>
     * </note>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleet(request);
    }

    @SdkInternalApi
    final DeleteFleetResult executeDeleteFleet(DeleteFleetRequest deleteFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a vehicle model (model manifest).
     * </p>
     * <note>
     * <p>
     * If the vehicle model is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response
     * with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteModelManifestRequest
     * @return Result of the DeleteModelManifest operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteModelManifestResult deleteModelManifest(DeleteModelManifestRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModelManifest(request);
    }

    @SdkInternalApi
    final DeleteModelManifestResult executeDeleteModelManifest(DeleteModelManifestRequest deleteModelManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelManifestRequest> request = null;
        Response<DeleteModelManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModelManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a signal catalog.
     * </p>
     * <note>
     * <p>
     * If the signal catalog is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response
     * with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteSignalCatalogRequest
     * @return Result of the DeleteSignalCatalog operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSignalCatalogResult deleteSignalCatalog(DeleteSignalCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSignalCatalog(request);
    }

    @SdkInternalApi
    final DeleteSignalCatalogResult executeDeleteSignalCatalog(DeleteSignalCatalogRequest deleteSignalCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSignalCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSignalCatalogRequest> request = null;
        Response<DeleteSignalCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSignalCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSignalCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSignalCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSignalCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSignalCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a vehicle and removes it from any campaigns.
     * </p>
     * <note>
     * <p>
     * If the vehicle is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty body.
     * </p>
     * </note>
     * 
     * @param deleteVehicleRequest
     * @return Result of the DeleteVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVehicleResult deleteVehicle(DeleteVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVehicle(request);
    }

    @SdkInternalApi
    final DeleteVehicleResult executeDeleteVehicle(DeleteVehicleRequest deleteVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVehicleRequest> request = null;
        Response<DeleteVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVehicleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVehicleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes, or disassociates, a vehicle from a fleet. Disassociating a vehicle from a fleet doesn't delete the
     * vehicle.
     * </p>
     * <note>
     * <p>
     * If the vehicle is successfully dissociated from a fleet, Amazon Web Services IoT FleetWise sends back an HTTP 200
     * response with an empty body.
     * </p>
     * </note>
     * 
     * @param disassociateVehicleFleetRequest
     * @return Result of the DisassociateVehicleFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DisassociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DisassociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateVehicleFleetResult disassociateVehicleFleet(DisassociateVehicleFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateVehicleFleet(request);
    }

    @SdkInternalApi
    final DisassociateVehicleFleetResult executeDisassociateVehicleFleet(DisassociateVehicleFleetRequest disassociateVehicleFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateVehicleFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateVehicleFleetRequest> request = null;
        Response<DisassociateVehicleFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateVehicleFleetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateVehicleFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateVehicleFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateVehicleFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateVehicleFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCampaignResult getCampaign(GetCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaign(request);
    }

    @SdkInternalApi
    final GetCampaignResult executeGetCampaign(GetCampaignRequest getCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignRequest> request = null;
        Response<GetCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a created decoder manifest.
     * </p>
     * 
     * @param getDecoderManifestRequest
     * @return Result of the GetDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDecoderManifestResult getDecoderManifest(GetDecoderManifestRequest request) {
        request = beforeClientExecution(request);
        return executeGetDecoderManifest(request);
    }

    @SdkInternalApi
    final GetDecoderManifestResult executeGetDecoderManifest(GetDecoderManifestRequest getDecoderManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(getDecoderManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDecoderManifestRequest> request = null;
        Response<GetDecoderManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDecoderManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDecoderManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDecoderManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDecoderManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDecoderManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @return Result of the GetFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFleetResult getFleet(GetFleetRequest request) {
        request = beforeClientExecution(request);
        return executeGetFleet(request);
    }

    @SdkInternalApi
    final GetFleetResult executeGetFleet(GetFleetRequest getFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(getFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFleetRequest> request = null;
        Response<GetFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFleetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     * @return Result of the GetLoggingOptions operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoggingOptions(request);
    }

    @SdkInternalApi
    final GetLoggingOptionsResult executeGetLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingOptionsRequest> request = null;
        Response<GetLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a vehicle model (model manifest).
     * </p>
     * 
     * @param getModelManifestRequest
     * @return Result of the GetModelManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetModelManifest" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetModelManifestResult getModelManifest(GetModelManifestRequest request) {
        request = beforeClientExecution(request);
        return executeGetModelManifest(request);
    }

    @SdkInternalApi
    final GetModelManifestResult executeGetModelManifest(GetModelManifestRequest getModelManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(getModelManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelManifestRequest> request = null;
        Response<GetModelManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getModelManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetModelManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetModelManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetModelManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status of registering your Amazon Web Services account, IAM, and Amazon
     * Timestream resources so that Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web
     * Services Cloud.
     * </p>
     * <p>
     * For more information, including step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/setting-up.html">Setting up Amazon Web
     * Services IoT FleetWise</a>.
     * </p>
     * <note>
     * <p>
     * This API operation doesn't require input parameters.
     * </p>
     * </note>
     * 
     * @param getRegisterAccountStatusRequest
     * @return Result of the GetRegisterAccountStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetRegisterAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetRegisterAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRegisterAccountStatusResult getRegisterAccountStatus(GetRegisterAccountStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetRegisterAccountStatus(request);
    }

    @SdkInternalApi
    final GetRegisterAccountStatusResult executeGetRegisterAccountStatus(GetRegisterAccountStatusRequest getRegisterAccountStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getRegisterAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegisterAccountStatusRequest> request = null;
        Response<GetRegisterAccountStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegisterAccountStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRegisterAccountStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRegisterAccountStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRegisterAccountStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRegisterAccountStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a signal catalog.
     * </p>
     * 
     * @param getSignalCatalogRequest
     * @return Result of the GetSignalCatalog operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetSignalCatalog" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSignalCatalogResult getSignalCatalog(GetSignalCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeGetSignalCatalog(request);
    }

    @SdkInternalApi
    final GetSignalCatalogResult executeGetSignalCatalog(GetSignalCatalogRequest getSignalCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(getSignalCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSignalCatalogRequest> request = null;
        Response<GetSignalCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSignalCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSignalCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSignalCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSignalCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSignalCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a vehicle.
     * </p>
     * 
     * @param getVehicleRequest
     * @return Result of the GetVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVehicleResult getVehicle(GetVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeGetVehicle(request);
    }

    @SdkInternalApi
    final GetVehicleResult executeGetVehicle(GetVehicleRequest getVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(getVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVehicleRequest> request = null;
        Response<GetVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVehicleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVehicleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the status of a vehicle with any associated campaigns.
     * </p>
     * 
     * @param getVehicleStatusRequest
     * @return Result of the GetVehicleStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetVehicleStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicleStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetVehicleStatusResult getVehicleStatus(GetVehicleStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetVehicleStatus(request);
    }

    @SdkInternalApi
    final GetVehicleStatusResult executeGetVehicleStatus(GetVehicleStatusRequest getVehicleStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getVehicleStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVehicleStatusRequest> request = null;
        Response<GetVehicleStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVehicleStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVehicleStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVehicleStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVehicleStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVehicleStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a decoder manifest using your existing CAN DBC file from your local device.
     * </p>
     * 
     * @param importDecoderManifestRequest
     * @return Result of the ImportDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws DecoderManifestValidationException
     *         The request couldn't be completed because it contains signal decoders with one or more validation errors.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ImportDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportDecoderManifestResult importDecoderManifest(ImportDecoderManifestRequest request) {
        request = beforeClientExecution(request);
        return executeImportDecoderManifest(request);
    }

    @SdkInternalApi
    final ImportDecoderManifestResult executeImportDecoderManifest(ImportDecoderManifestRequest importDecoderManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(importDecoderManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportDecoderManifestRequest> request = null;
        Response<ImportDecoderManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportDecoderManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importDecoderManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportDecoderManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportDecoderManifestResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ImportDecoderManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a signal catalog using your existing VSS formatted content from your local device.
     * </p>
     * 
     * @param importSignalCatalogRequest
     * @return Result of the ImportSignalCatalog operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ImportSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportSignalCatalogResult importSignalCatalog(ImportSignalCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeImportSignalCatalog(request);
    }

    @SdkInternalApi
    final ImportSignalCatalogResult executeImportSignalCatalog(ImportSignalCatalogRequest importSignalCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(importSignalCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportSignalCatalogRequest> request = null;
        Response<ImportSignalCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportSignalCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importSignalCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportSignalCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportSignalCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportSignalCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about created campaigns.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listCampaignsRequest
     * @return Result of the ListCampaigns operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCampaignsResult listCampaigns(ListCampaignsRequest request) {
        request = beforeClientExecution(request);
        return executeListCampaigns(request);
    }

    @SdkInternalApi
    final ListCampaignsResult executeListCampaigns(ListCampaignsRequest listCampaignsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCampaignsRequest> request = null;
        Response<ListCampaignsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCampaignsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCampaignsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCampaigns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCampaignsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCampaignsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the network interfaces specified in a decoder manifest.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestNetworkInterfacesRequest
     * @return Result of the ListDecoderManifestNetworkInterfaces operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListDecoderManifestNetworkInterfaces
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestNetworkInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDecoderManifestNetworkInterfacesResult listDecoderManifestNetworkInterfaces(ListDecoderManifestNetworkInterfacesRequest request) {
        request = beforeClientExecution(request);
        return executeListDecoderManifestNetworkInterfaces(request);
    }

    @SdkInternalApi
    final ListDecoderManifestNetworkInterfacesResult executeListDecoderManifestNetworkInterfaces(
            ListDecoderManifestNetworkInterfacesRequest listDecoderManifestNetworkInterfacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDecoderManifestNetworkInterfacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDecoderManifestNetworkInterfacesRequest> request = null;
        Response<ListDecoderManifestNetworkInterfacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDecoderManifestNetworkInterfacesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDecoderManifestNetworkInterfacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDecoderManifestNetworkInterfaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDecoderManifestNetworkInterfacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDecoderManifestNetworkInterfacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of information about signal decoders specified in a decoder manifest.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestSignalsRequest
     * @return Result of the ListDecoderManifestSignals operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListDecoderManifestSignals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestSignals"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDecoderManifestSignalsResult listDecoderManifestSignals(ListDecoderManifestSignalsRequest request) {
        request = beforeClientExecution(request);
        return executeListDecoderManifestSignals(request);
    }

    @SdkInternalApi
    final ListDecoderManifestSignalsResult executeListDecoderManifestSignals(ListDecoderManifestSignalsRequest listDecoderManifestSignalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDecoderManifestSignalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDecoderManifestSignalsRequest> request = null;
        Response<ListDecoderManifestSignalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDecoderManifestSignalsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDecoderManifestSignalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDecoderManifestSignals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDecoderManifestSignalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDecoderManifestSignalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists decoder manifests.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestsRequest
     * @return Result of the ListDecoderManifests operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListDecoderManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDecoderManifestsResult listDecoderManifests(ListDecoderManifestsRequest request) {
        request = beforeClientExecution(request);
        return executeListDecoderManifests(request);
    }

    @SdkInternalApi
    final ListDecoderManifestsResult executeListDecoderManifests(ListDecoderManifestsRequest listDecoderManifestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDecoderManifestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDecoderManifestsRequest> request = null;
        Response<ListDecoderManifestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDecoderManifestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDecoderManifestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDecoderManifests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDecoderManifestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDecoderManifestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information for each created fleet in an Amazon Web Services account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFleetsResult listFleets(ListFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListFleets(request);
    }

    @SdkInternalApi
    final ListFleetsResult executeListFleets(ListFleetsRequest listFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of IDs for all fleets that the vehicle is associated with.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listFleetsForVehicleRequest
     * @return Result of the ListFleetsForVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListFleetsForVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleetsForVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFleetsForVehicleResult listFleetsForVehicle(ListFleetsForVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeListFleetsForVehicle(request);
    }

    @SdkInternalApi
    final ListFleetsForVehicleResult executeListFleetsForVehicle(ListFleetsForVehicleRequest listFleetsForVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetsForVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsForVehicleRequest> request = null;
        Response<ListFleetsForVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsForVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetsForVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleetsForVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetsForVehicleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetsForVehicleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about nodes specified in a vehicle model (model manifest).
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listModelManifestNodesRequest
     * @return Result of the ListModelManifestNodes operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListModelManifestNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifestNodes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListModelManifestNodesResult listModelManifestNodes(ListModelManifestNodesRequest request) {
        request = beforeClientExecution(request);
        return executeListModelManifestNodes(request);
    }

    @SdkInternalApi
    final ListModelManifestNodesResult executeListModelManifestNodes(ListModelManifestNodesRequest listModelManifestNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelManifestNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelManifestNodesRequest> request = null;
        Response<ListModelManifestNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelManifestNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listModelManifestNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModelManifestNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelManifestNodesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListModelManifestNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of vehicle models (model manifests).
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listModelManifestsRequest
     * @return Result of the ListModelManifests operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListModelManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListModelManifestsResult listModelManifests(ListModelManifestsRequest request) {
        request = beforeClientExecution(request);
        return executeListModelManifests(request);
    }

    @SdkInternalApi
    final ListModelManifestsResult executeListModelManifests(ListModelManifestsRequest listModelManifestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelManifestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelManifestsRequest> request = null;
        Response<ListModelManifestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelManifestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listModelManifestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModelManifests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelManifestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListModelManifestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists of information about the signals (nodes) specified in a signal catalog.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listSignalCatalogNodesRequest
     * @return Result of the ListSignalCatalogNodes operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListSignalCatalogNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogNodes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSignalCatalogNodesResult listSignalCatalogNodes(ListSignalCatalogNodesRequest request) {
        request = beforeClientExecution(request);
        return executeListSignalCatalogNodes(request);
    }

    @SdkInternalApi
    final ListSignalCatalogNodesResult executeListSignalCatalogNodes(ListSignalCatalogNodesRequest listSignalCatalogNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSignalCatalogNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSignalCatalogNodesRequest> request = null;
        Response<ListSignalCatalogNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSignalCatalogNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSignalCatalogNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSignalCatalogNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSignalCatalogNodesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSignalCatalogNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the created signal catalogs in an Amazon Web Services account.
     * </p>
     * <p>
     * You can use to list information about each signal (node) specified in a signal catalog.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listSignalCatalogsRequest
     * @return Result of the ListSignalCatalogs operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListSignalCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSignalCatalogsResult listSignalCatalogs(ListSignalCatalogsRequest request) {
        request = beforeClientExecution(request);
        return executeListSignalCatalogs(request);
    }

    @SdkInternalApi
    final ListSignalCatalogsResult executeListSignalCatalogs(ListSignalCatalogsRequest listSignalCatalogsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSignalCatalogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSignalCatalogsRequest> request = null;
        Response<ListSignalCatalogsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSignalCatalogsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSignalCatalogsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSignalCatalogs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSignalCatalogsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSignalCatalogsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
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
     * Retrieves a list of summaries of created vehicles.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listVehiclesRequest
     * @return Result of the ListVehicles operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListVehicles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehicles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVehiclesResult listVehicles(ListVehiclesRequest request) {
        request = beforeClientExecution(request);
        return executeListVehicles(request);
    }

    @SdkInternalApi
    final ListVehiclesResult executeListVehicles(ListVehiclesRequest listVehiclesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVehiclesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVehiclesRequest> request = null;
        Response<ListVehiclesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVehiclesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVehiclesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVehicles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVehiclesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVehiclesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of summaries of all vehicles associated with a fleet.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listVehiclesInFleetRequest
     * @return Result of the ListVehiclesInFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListVehiclesInFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehiclesInFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVehiclesInFleetResult listVehiclesInFleet(ListVehiclesInFleetRequest request) {
        request = beforeClientExecution(request);
        return executeListVehiclesInFleet(request);
    }

    @SdkInternalApi
    final ListVehiclesInFleetResult executeListVehiclesInFleet(ListVehiclesInFleetRequest listVehiclesInFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(listVehiclesInFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVehiclesInFleetRequest> request = null;
        Response<ListVehiclesInFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVehiclesInFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVehiclesInFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVehiclesInFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVehiclesInFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVehiclesInFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates the logging option.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutLoggingOptions(request);
    }

    @SdkInternalApi
    final PutLoggingOptionsResult executePutLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLoggingOptionsRequest> request = null;
        Response<PutLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers your Amazon Web Services account, IAM, and Amazon Timestream resources so Amazon Web Services IoT
     * FleetWise can transfer your vehicle data to the Amazon Web Services Cloud. For more information, including
     * step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/setting-up.html">Setting up Amazon Web
     * Services IoT FleetWise</a>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services account is <b>not</b> the same thing as a "user account". An <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/introduction_identity-management.html#intro-identity-users"
     * >Amazon Web Services user</a> is an identity that you create using Identity and Access Management (IAM) and takes
     * the form of either an <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users.html">IAM user</a> or an
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM role, both with credentials</a>. A
     * single Amazon Web Services account can, and typically does, contain many users and roles.
     * </p>
     * </note>
     * 
     * @param registerAccountRequest
     * @return Result of the RegisterAccount operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterAccountResult registerAccount(RegisterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterAccount(request);
    }

    @SdkInternalApi
    final RegisterAccountResult executeRegisterAccount(RegisterAccountRequest registerAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(registerAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAccountRequest> request = null;
        Response<RegisterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
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
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
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
     * Updates a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateCampaignResult updateCampaign(UpdateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaign(request);
    }

    @SdkInternalApi
    final UpdateCampaignResult executeUpdateCampaign(UpdateCampaignRequest updateCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignRequest> request = null;
        Response<UpdateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a decoder manifest.
     * </p>
     * <p>
     * A decoder manifest can only be updated when the status is <code>DRAFT</code>. Only <code>ACTIVE</code> decoder
     * manifests can be associated with vehicles.
     * </p>
     * 
     * @param updateDecoderManifestRequest
     * @return Result of the UpdateDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws DecoderManifestValidationException
     *         The request couldn't be completed because it contains signal decoders with one or more validation errors.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDecoderManifestResult updateDecoderManifest(UpdateDecoderManifestRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDecoderManifest(request);
    }

    @SdkInternalApi
    final UpdateDecoderManifestResult executeUpdateDecoderManifest(UpdateDecoderManifestRequest updateDecoderManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDecoderManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDecoderManifestRequest> request = null;
        Response<UpdateDecoderManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDecoderManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDecoderManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDecoderManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDecoderManifestResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDecoderManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of an existing fleet.
     * </p>
     * <note>
     * <p>
     * If the fleet is successfully updated, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty HTTP body.
     * </p>
     * </note>
     * 
     * @param updateFleetRequest
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFleetResult updateFleet(UpdateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleet(request);
    }

    @SdkInternalApi
    final UpdateFleetResult executeUpdateFleet(UpdateFleetRequest updateFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetRequest> request = null;
        Response<UpdateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a vehicle model (model manifest). If created vehicles are associated with a vehicle model, it can't be
     * updated.
     * </p>
     * 
     * @param updateModelManifestRequest
     * @return Result of the UpdateModelManifest operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateModelManifestResult updateModelManifest(UpdateModelManifestRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateModelManifest(request);
    }

    @SdkInternalApi
    final UpdateModelManifestResult executeUpdateModelManifest(UpdateModelManifestRequest updateModelManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(updateModelManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelManifestRequest> request = null;
        Response<UpdateModelManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateModelManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateModelManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateModelManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateModelManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a signal catalog.
     * </p>
     * 
     * @param updateSignalCatalogRequest
     * @return Result of the UpdateSignalCatalog operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws InvalidNodeException
     *         The specified node type doesn't match the expected node type for a node. You can specify the node type as
     *         branch, sensor, actuator, or attribute.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSignalCatalogResult updateSignalCatalog(UpdateSignalCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSignalCatalog(request);
    }

    @SdkInternalApi
    final UpdateSignalCatalogResult executeUpdateSignalCatalog(UpdateSignalCatalogRequest updateSignalCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSignalCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSignalCatalogRequest> request = null;
        Response<UpdateSignalCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSignalCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSignalCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSignalCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSignalCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSignalCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a vehicle.
     * </p>
     * 
     * @param updateVehicleRequest
     * @return Result of the UpdateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateVehicleResult updateVehicle(UpdateVehicleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVehicle(request);
    }

    @SdkInternalApi
    final UpdateVehicleResult executeUpdateVehicle(UpdateVehicleRequest updateVehicleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVehicleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVehicleRequest> request = null;
        Response<UpdateVehicleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVehicleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVehicleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoTFleetWise");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVehicle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVehicleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVehicleResultJsonUnmarshaller());
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
