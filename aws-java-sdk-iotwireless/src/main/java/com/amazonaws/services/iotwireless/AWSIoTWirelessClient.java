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
package com.amazonaws.services.iotwireless;

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

import com.amazonaws.services.iotwireless.AWSIoTWirelessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.services.iotwireless.model.transform.*;

/**
 * Client for accessing AWS IoT Wireless. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IoT Wireless API documentation
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTWirelessClient extends AmazonWebServiceClient implements AWSIoTWireless {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTWireless.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotwireless";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotwireless.model.AWSIoTWirelessException.class));

    public static AWSIoTWirelessClientBuilder builder() {
        return AWSIoTWirelessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Wireless using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTWirelessClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Wireless using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTWirelessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("api.iotwireless.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotwireless/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotwireless/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a partner account with your AWS account.
     * </p>
     * 
     * @param associateAwsAccountWithPartnerAccountRequest
     * @return Result of the AssociateAwsAccountWithPartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.AssociateAwsAccountWithPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateAwsAccountWithPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAwsAccountWithPartnerAccountResult associateAwsAccountWithPartnerAccount(AssociateAwsAccountWithPartnerAccountRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAwsAccountWithPartnerAccount(request);
    }

    @SdkInternalApi
    final AssociateAwsAccountWithPartnerAccountResult executeAssociateAwsAccountWithPartnerAccount(
            AssociateAwsAccountWithPartnerAccountRequest associateAwsAccountWithPartnerAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAwsAccountWithPartnerAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAwsAccountWithPartnerAccountRequest> request = null;
        Response<AssociateAwsAccountWithPartnerAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAwsAccountWithPartnerAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateAwsAccountWithPartnerAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAwsAccountWithPartnerAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAwsAccountWithPartnerAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateAwsAccountWithPartnerAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a wireless device with a thing.
     * </p>
     * 
     * @param associateWirelessDeviceWithThingRequest
     * @return Result of the AssociateWirelessDeviceWithThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateWirelessDeviceWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateWirelessDeviceWithThingResult associateWirelessDeviceWithThing(AssociateWirelessDeviceWithThingRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWirelessDeviceWithThing(request);
    }

    @SdkInternalApi
    final AssociateWirelessDeviceWithThingResult executeAssociateWirelessDeviceWithThing(
            AssociateWirelessDeviceWithThingRequest associateWirelessDeviceWithThingRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWirelessDeviceWithThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWirelessDeviceWithThingRequest> request = null;
        Response<AssociateWirelessDeviceWithThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWirelessDeviceWithThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateWirelessDeviceWithThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWirelessDeviceWithThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWirelessDeviceWithThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateWirelessDeviceWithThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a wireless gateway with a certificate.
     * </p>
     * 
     * @param associateWirelessGatewayWithCertificateRequest
     * @return Result of the AssociateWirelessGatewayWithCertificate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.AssociateWirelessGatewayWithCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateWirelessGatewayWithCertificateResult associateWirelessGatewayWithCertificate(AssociateWirelessGatewayWithCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWirelessGatewayWithCertificate(request);
    }

    @SdkInternalApi
    final AssociateWirelessGatewayWithCertificateResult executeAssociateWirelessGatewayWithCertificate(
            AssociateWirelessGatewayWithCertificateRequest associateWirelessGatewayWithCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWirelessGatewayWithCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWirelessGatewayWithCertificateRequest> request = null;
        Response<AssociateWirelessGatewayWithCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWirelessGatewayWithCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateWirelessGatewayWithCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWirelessGatewayWithCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWirelessGatewayWithCertificateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateWirelessGatewayWithCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a wireless gateway with a thing.
     * </p>
     * 
     * @param associateWirelessGatewayWithThingRequest
     * @return Result of the AssociateWirelessGatewayWithThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateWirelessGatewayWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateWirelessGatewayWithThingResult associateWirelessGatewayWithThing(AssociateWirelessGatewayWithThingRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWirelessGatewayWithThing(request);
    }

    @SdkInternalApi
    final AssociateWirelessGatewayWithThingResult executeAssociateWirelessGatewayWithThing(
            AssociateWirelessGatewayWithThingRequest associateWirelessGatewayWithThingRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWirelessGatewayWithThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWirelessGatewayWithThingRequest> request = null;
        Response<AssociateWirelessGatewayWithThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWirelessGatewayWithThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateWirelessGatewayWithThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWirelessGatewayWithThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWirelessGatewayWithThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateWirelessGatewayWithThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new destination that maps a device message to an AWS IoT rule.
     * </p>
     * 
     * @param createDestinationRequest
     * @return Result of the CreateDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDestination" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Creates a new device profile.
     * </p>
     * 
     * @param createDeviceProfileRequest
     * @return Result of the CreateDeviceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDeviceProfileResult createDeviceProfile(CreateDeviceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeviceProfile(request);
    }

    @SdkInternalApi
    final CreateDeviceProfileResult executeCreateDeviceProfile(CreateDeviceProfileRequest createDeviceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeviceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeviceProfileRequest> request = null;
        Response<CreateDeviceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeviceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeviceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeviceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeviceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeviceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new service profile.
     * </p>
     * 
     * @param createServiceProfileRequest
     * @return Result of the CreateServiceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceProfileResult createServiceProfile(CreateServiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceProfile(request);
    }

    @SdkInternalApi
    final CreateServiceProfileResult executeCreateServiceProfile(CreateServiceProfileRequest createServiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceProfileRequest> request = null;
        Response<CreateServiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions a wireless device.
     * </p>
     * 
     * @param createWirelessDeviceRequest
     * @return Result of the CreateWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWirelessDeviceResult createWirelessDevice(CreateWirelessDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWirelessDevice(request);
    }

    @SdkInternalApi
    final CreateWirelessDeviceResult executeCreateWirelessDevice(CreateWirelessDeviceRequest createWirelessDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(createWirelessDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWirelessDeviceRequest> request = null;
        Response<CreateWirelessDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWirelessDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWirelessDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWirelessDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWirelessDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWirelessDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayRequest
     * @return Result of the CreateWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWirelessGatewayResult createWirelessGateway(CreateWirelessGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWirelessGateway(request);
    }

    @SdkInternalApi
    final CreateWirelessGatewayResult executeCreateWirelessGateway(CreateWirelessGatewayRequest createWirelessGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(createWirelessGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWirelessGatewayRequest> request = null;
        Response<CreateWirelessGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWirelessGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWirelessGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWirelessGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWirelessGatewayResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateWirelessGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a task for a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayTaskRequest
     * @return Result of the CreateWirelessGatewayTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWirelessGatewayTaskResult createWirelessGatewayTask(CreateWirelessGatewayTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWirelessGatewayTask(request);
    }

    @SdkInternalApi
    final CreateWirelessGatewayTaskResult executeCreateWirelessGatewayTask(CreateWirelessGatewayTaskRequest createWirelessGatewayTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createWirelessGatewayTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWirelessGatewayTaskRequest> request = null;
        Response<CreateWirelessGatewayTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWirelessGatewayTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWirelessGatewayTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWirelessGatewayTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWirelessGatewayTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWirelessGatewayTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a gateway task definition.
     * </p>
     * 
     * @param createWirelessGatewayTaskDefinitionRequest
     * @return Result of the CreateWirelessGatewayTaskDefinition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWirelessGatewayTaskDefinitionResult createWirelessGatewayTaskDefinition(CreateWirelessGatewayTaskDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWirelessGatewayTaskDefinition(request);
    }

    @SdkInternalApi
    final CreateWirelessGatewayTaskDefinitionResult executeCreateWirelessGatewayTaskDefinition(
            CreateWirelessGatewayTaskDefinitionRequest createWirelessGatewayTaskDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(createWirelessGatewayTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWirelessGatewayTaskDefinitionRequest> request = null;
        Response<CreateWirelessGatewayTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWirelessGatewayTaskDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWirelessGatewayTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWirelessGatewayTaskDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWirelessGatewayTaskDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWirelessGatewayTaskDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDestination" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Deletes a device profile.
     * </p>
     * 
     * @param deleteDeviceProfileRequest
     * @return Result of the DeleteDeviceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDeviceProfileResult deleteDeviceProfile(DeleteDeviceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeviceProfile(request);
    }

    @SdkInternalApi
    final DeleteDeviceProfileResult executeDeleteDeviceProfile(DeleteDeviceProfileRequest deleteDeviceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeviceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceProfileRequest> request = null;
        Response<DeleteDeviceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeviceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeviceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeviceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeviceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a service profile.
     * </p>
     * 
     * @param deleteServiceProfileRequest
     * @return Result of the DeleteServiceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceProfileResult deleteServiceProfile(DeleteServiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceProfile(request);
    }

    @SdkInternalApi
    final DeleteServiceProfileResult executeDeleteServiceProfile(DeleteServiceProfileRequest deleteServiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceProfileRequest> request = null;
        Response<DeleteServiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a wireless device.
     * </p>
     * 
     * @param deleteWirelessDeviceRequest
     * @return Result of the DeleteWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWirelessDeviceResult deleteWirelessDevice(DeleteWirelessDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWirelessDevice(request);
    }

    @SdkInternalApi
    final DeleteWirelessDeviceResult executeDeleteWirelessDevice(DeleteWirelessDeviceRequest deleteWirelessDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWirelessDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWirelessDeviceRequest> request = null;
        Response<DeleteWirelessDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWirelessDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWirelessDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWirelessDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWirelessDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWirelessDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a wireless gateway.
     * </p>
     * 
     * @param deleteWirelessGatewayRequest
     * @return Result of the DeleteWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWirelessGatewayResult deleteWirelessGateway(DeleteWirelessGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWirelessGateway(request);
    }

    @SdkInternalApi
    final DeleteWirelessGatewayResult executeDeleteWirelessGateway(DeleteWirelessGatewayRequest deleteWirelessGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWirelessGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWirelessGatewayRequest> request = null;
        Response<DeleteWirelessGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWirelessGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWirelessGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWirelessGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWirelessGatewayResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteWirelessGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a wireless gateway task.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskRequest
     * @return Result of the DeleteWirelessGatewayTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWirelessGatewayTaskResult deleteWirelessGatewayTask(DeleteWirelessGatewayTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWirelessGatewayTask(request);
    }

    @SdkInternalApi
    final DeleteWirelessGatewayTaskResult executeDeleteWirelessGatewayTask(DeleteWirelessGatewayTaskRequest deleteWirelessGatewayTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWirelessGatewayTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWirelessGatewayTaskRequest> request = null;
        Response<DeleteWirelessGatewayTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWirelessGatewayTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteWirelessGatewayTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWirelessGatewayTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWirelessGatewayTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteWirelessGatewayTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are
     * currently in progress.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskDefinitionRequest
     * @return Result of the DeleteWirelessGatewayTaskDefinition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWirelessGatewayTaskDefinitionResult deleteWirelessGatewayTaskDefinition(DeleteWirelessGatewayTaskDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWirelessGatewayTaskDefinition(request);
    }

    @SdkInternalApi
    final DeleteWirelessGatewayTaskDefinitionResult executeDeleteWirelessGatewayTaskDefinition(
            DeleteWirelessGatewayTaskDefinitionRequest deleteWirelessGatewayTaskDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWirelessGatewayTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWirelessGatewayTaskDefinitionRequest> request = null;
        Response<DeleteWirelessGatewayTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWirelessGatewayTaskDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteWirelessGatewayTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWirelessGatewayTaskDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWirelessGatewayTaskDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteWirelessGatewayTaskDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates your AWS account from a partner account. If <code>PartnerAccountId</code> and
     * <code>PartnerType</code> are <code>null</code>, disassociates your AWS account from all partner accounts.
     * </p>
     * 
     * @param disassociateAwsAccountFromPartnerAccountRequest
     * @return Result of the DisassociateAwsAccountFromPartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DisassociateAwsAccountFromPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateAwsAccountFromPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateAwsAccountFromPartnerAccountResult disassociateAwsAccountFromPartnerAccount(DisassociateAwsAccountFromPartnerAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAwsAccountFromPartnerAccount(request);
    }

    @SdkInternalApi
    final DisassociateAwsAccountFromPartnerAccountResult executeDisassociateAwsAccountFromPartnerAccount(
            DisassociateAwsAccountFromPartnerAccountRequest disassociateAwsAccountFromPartnerAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAwsAccountFromPartnerAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAwsAccountFromPartnerAccountRequest> request = null;
        Response<DisassociateAwsAccountFromPartnerAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAwsAccountFromPartnerAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateAwsAccountFromPartnerAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAwsAccountFromPartnerAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAwsAccountFromPartnerAccountResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateAwsAccountFromPartnerAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a wireless device from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromThingRequest
     * @return Result of the DisassociateWirelessDeviceFromThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessDeviceFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWirelessDeviceFromThingResult disassociateWirelessDeviceFromThing(DisassociateWirelessDeviceFromThingRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWirelessDeviceFromThing(request);
    }

    @SdkInternalApi
    final DisassociateWirelessDeviceFromThingResult executeDisassociateWirelessDeviceFromThing(
            DisassociateWirelessDeviceFromThingRequest disassociateWirelessDeviceFromThingRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWirelessDeviceFromThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWirelessDeviceFromThingRequest> request = null;
        Response<DisassociateWirelessDeviceFromThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWirelessDeviceFromThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateWirelessDeviceFromThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWirelessDeviceFromThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWirelessDeviceFromThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateWirelessDeviceFromThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated certificate.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromCertificateRequest
     * @return Result of the DisassociateWirelessGatewayFromCertificate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DisassociateWirelessGatewayFromCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWirelessGatewayFromCertificateResult disassociateWirelessGatewayFromCertificate(DisassociateWirelessGatewayFromCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWirelessGatewayFromCertificate(request);
    }

    @SdkInternalApi
    final DisassociateWirelessGatewayFromCertificateResult executeDisassociateWirelessGatewayFromCertificate(
            DisassociateWirelessGatewayFromCertificateRequest disassociateWirelessGatewayFromCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWirelessGatewayFromCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWirelessGatewayFromCertificateRequest> request = null;
        Response<DisassociateWirelessGatewayFromCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWirelessGatewayFromCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateWirelessGatewayFromCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWirelessGatewayFromCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWirelessGatewayFromCertificateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateWirelessGatewayFromCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromThingRequest
     * @return Result of the DisassociateWirelessGatewayFromThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessGatewayFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWirelessGatewayFromThingResult disassociateWirelessGatewayFromThing(DisassociateWirelessGatewayFromThingRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWirelessGatewayFromThing(request);
    }

    @SdkInternalApi
    final DisassociateWirelessGatewayFromThingResult executeDisassociateWirelessGatewayFromThing(
            DisassociateWirelessGatewayFromThingRequest disassociateWirelessGatewayFromThingRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWirelessGatewayFromThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWirelessGatewayFromThingRequest> request = null;
        Response<DisassociateWirelessGatewayFromThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWirelessGatewayFromThingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateWirelessGatewayFromThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWirelessGatewayFromThing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWirelessGatewayFromThingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateWirelessGatewayFromThingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a destination.
     * </p>
     * 
     * @param getDestinationRequest
     * @return Result of the GetDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDestination" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Gets information about a device profile.
     * </p>
     * 
     * @param getDeviceProfileRequest
     * @return Result of the GetDeviceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDeviceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDeviceProfileResult getDeviceProfile(GetDeviceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeviceProfile(request);
    }

    @SdkInternalApi
    final GetDeviceProfileResult executeGetDeviceProfile(GetDeviceProfileRequest getDeviceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceProfileRequest> request = null;
        Response<GetDeviceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeviceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns current default log-levels, or log levels by resource types, could be for wireless device log options or
     * wireless gateway log options.
     * </p>
     * 
     * @param getLogLevelsByResourceTypesRequest
     * @return Result of the GetLogLevelsByResourceTypes operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.GetLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLogLevelsByResourceTypesResult getLogLevelsByResourceTypes(GetLogLevelsByResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetLogLevelsByResourceTypes(request);
    }

    @SdkInternalApi
    final GetLogLevelsByResourceTypesResult executeGetLogLevelsByResourceTypes(GetLogLevelsByResourceTypesRequest getLogLevelsByResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getLogLevelsByResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogLevelsByResourceTypesRequest> request = null;
        Response<GetLogLevelsByResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogLevelsByResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLogLevelsByResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLogLevelsByResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLogLevelsByResourceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLogLevelsByResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a partner account. If <code>PartnerAccountId</code> and <code>PartnerType</code> are
     * <code>null</code>, returns all partner accounts.
     * </p>
     * 
     * @param getPartnerAccountRequest
     * @return Result of the GetPartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetPartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPartnerAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPartnerAccountResult getPartnerAccount(GetPartnerAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetPartnerAccount(request);
    }

    @SdkInternalApi
    final GetPartnerAccountResult executeGetPartnerAccount(GetPartnerAccountRequest getPartnerAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getPartnerAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPartnerAccountRequest> request = null;
        Response<GetPartnerAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPartnerAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPartnerAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPartnerAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPartnerAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPartnerAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetches the log-level override if any for a given resource-ID and resource-type, coulde be a wireless device or a
     * wireless gateway.
     * </p>
     * 
     * @param getResourceLogLevelRequest
     * @return Result of the GetResourceLogLevel operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.GetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceLogLevelResult getResourceLogLevel(GetResourceLogLevelRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceLogLevel(request);
    }

    @SdkInternalApi
    final GetResourceLogLevelResult executeGetResourceLogLevel(GetResourceLogLevelRequest getResourceLogLevelRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceLogLevelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceLogLevelRequest> request = null;
        Response<GetResourceLogLevelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceLogLevelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceLogLevelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceLogLevel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceLogLevelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceLogLevelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server
     * (LNS) connections.
     * </p>
     * 
     * @param getServiceEndpointRequest
     * @return Result of the GetServiceEndpoint operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetServiceEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetServiceEndpointResult getServiceEndpoint(GetServiceEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceEndpoint(request);
    }

    @SdkInternalApi
    final GetServiceEndpointResult executeGetServiceEndpoint(GetServiceEndpointRequest getServiceEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceEndpointRequest> request = null;
        Response<GetServiceEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a service profile.
     * </p>
     * 
     * @param getServiceProfileRequest
     * @return Result of the GetServiceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetServiceProfileResult getServiceProfile(GetServiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceProfile(request);
    }

    @SdkInternalApi
    final GetServiceProfileResult executeGetServiceProfile(GetServiceProfileRequest getServiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceProfileRequest> request = null;
        Response<GetServiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceRequest
     * @return Result of the GetWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetWirelessDeviceResult getWirelessDevice(GetWirelessDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessDevice(request);
    }

    @SdkInternalApi
    final GetWirelessDeviceResult executeGetWirelessDevice(GetWirelessDeviceRequest getWirelessDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessDeviceRequest> request = null;
        Response<GetWirelessDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWirelessDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWirelessDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets operating information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceStatisticsRequest
     * @return Result of the GetWirelessDeviceStatistics operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessDeviceStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWirelessDeviceStatisticsResult getWirelessDeviceStatistics(GetWirelessDeviceStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessDeviceStatistics(request);
    }

    @SdkInternalApi
    final GetWirelessDeviceStatisticsResult executeGetWirelessDeviceStatistics(GetWirelessDeviceStatisticsRequest getWirelessDeviceStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessDeviceStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessDeviceStatisticsRequest> request = null;
        Response<GetWirelessDeviceStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessDeviceStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getWirelessDeviceStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessDeviceStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessDeviceStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetWirelessDeviceStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayRequest
     * @return Result of the GetWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetWirelessGatewayResult getWirelessGateway(GetWirelessGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessGateway(request);
    }

    @SdkInternalApi
    final GetWirelessGatewayResult executeGetWirelessGateway(GetWirelessGatewayRequest getWirelessGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessGatewayRequest> request = null;
        Response<GetWirelessGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWirelessGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWirelessGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the ID of the certificate that is currently associated with a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayCertificateRequest
     * @return Result of the GetWirelessGatewayCertificate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWirelessGatewayCertificateResult getWirelessGatewayCertificate(GetWirelessGatewayCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessGatewayCertificate(request);
    }

    @SdkInternalApi
    final GetWirelessGatewayCertificateResult executeGetWirelessGatewayCertificate(GetWirelessGatewayCertificateRequest getWirelessGatewayCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessGatewayCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessGatewayCertificateRequest> request = null;
        Response<GetWirelessGatewayCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessGatewayCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getWirelessGatewayCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessGatewayCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessGatewayCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetWirelessGatewayCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the firmware version and other information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayFirmwareInformationRequest
     * @return Result of the GetWirelessGatewayFirmwareInformation operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayFirmwareInformation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayFirmwareInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWirelessGatewayFirmwareInformationResult getWirelessGatewayFirmwareInformation(GetWirelessGatewayFirmwareInformationRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessGatewayFirmwareInformation(request);
    }

    @SdkInternalApi
    final GetWirelessGatewayFirmwareInformationResult executeGetWirelessGatewayFirmwareInformation(
            GetWirelessGatewayFirmwareInformationRequest getWirelessGatewayFirmwareInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessGatewayFirmwareInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessGatewayFirmwareInformationRequest> request = null;
        Response<GetWirelessGatewayFirmwareInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessGatewayFirmwareInformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getWirelessGatewayFirmwareInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessGatewayFirmwareInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessGatewayFirmwareInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetWirelessGatewayFirmwareInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets operating information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayStatisticsRequest
     * @return Result of the GetWirelessGatewayStatistics operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWirelessGatewayStatisticsResult getWirelessGatewayStatistics(GetWirelessGatewayStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessGatewayStatistics(request);
    }

    @SdkInternalApi
    final GetWirelessGatewayStatisticsResult executeGetWirelessGatewayStatistics(GetWirelessGatewayStatisticsRequest getWirelessGatewayStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessGatewayStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessGatewayStatisticsRequest> request = null;
        Response<GetWirelessGatewayStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessGatewayStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getWirelessGatewayStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessGatewayStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessGatewayStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetWirelessGatewayStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a wireless gateway task.
     * </p>
     * 
     * @param getWirelessGatewayTaskRequest
     * @return Result of the GetWirelessGatewayTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWirelessGatewayTaskResult getWirelessGatewayTask(GetWirelessGatewayTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessGatewayTask(request);
    }

    @SdkInternalApi
    final GetWirelessGatewayTaskResult executeGetWirelessGatewayTask(GetWirelessGatewayTaskRequest getWirelessGatewayTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessGatewayTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessGatewayTaskRequest> request = null;
        Response<GetWirelessGatewayTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessGatewayTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWirelessGatewayTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessGatewayTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessGatewayTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetWirelessGatewayTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a wireless gateway task definition.
     * </p>
     * 
     * @param getWirelessGatewayTaskDefinitionRequest
     * @return Result of the GetWirelessGatewayTaskDefinition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWirelessGatewayTaskDefinitionResult getWirelessGatewayTaskDefinition(GetWirelessGatewayTaskDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetWirelessGatewayTaskDefinition(request);
    }

    @SdkInternalApi
    final GetWirelessGatewayTaskDefinitionResult executeGetWirelessGatewayTaskDefinition(
            GetWirelessGatewayTaskDefinitionRequest getWirelessGatewayTaskDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getWirelessGatewayTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWirelessGatewayTaskDefinitionRequest> request = null;
        Response<GetWirelessGatewayTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWirelessGatewayTaskDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getWirelessGatewayTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWirelessGatewayTaskDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWirelessGatewayTaskDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetWirelessGatewayTaskDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the destinations registered to your AWS account.
     * </p>
     * 
     * @param listDestinationsRequest
     * @return Result of the ListDestinations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDestinations" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Lists the device profiles registered to your AWS account.
     * </p>
     * 
     * @param listDeviceProfilesRequest
     * @return Result of the ListDeviceProfiles operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListDeviceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDeviceProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeviceProfilesResult listDeviceProfiles(ListDeviceProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceProfiles(request);
    }

    @SdkInternalApi
    final ListDeviceProfilesResult executeListDeviceProfiles(ListDeviceProfilesRequest listDeviceProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceProfilesRequest> request = null;
        Response<ListDeviceProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeviceProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the partner accounts associated with your AWS account.
     * </p>
     * 
     * @param listPartnerAccountsRequest
     * @return Result of the ListPartnerAccounts operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListPartnerAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPartnerAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPartnerAccountsResult listPartnerAccounts(ListPartnerAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListPartnerAccounts(request);
    }

    @SdkInternalApi
    final ListPartnerAccountsResult executeListPartnerAccounts(ListPartnerAccountsRequest listPartnerAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPartnerAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPartnerAccountsRequest> request = null;
        Response<ListPartnerAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPartnerAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPartnerAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPartnerAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPartnerAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPartnerAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the service profiles registered to your AWS account.
     * </p>
     * 
     * @param listServiceProfilesRequest
     * @return Result of the ListServiceProfiles operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListServiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListServiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceProfilesResult listServiceProfiles(ListServiceProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceProfiles(request);
    }

    @SdkInternalApi
    final ListServiceProfilesResult executeListServiceProfiles(ListServiceProfilesRequest listServiceProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceProfilesRequest> request = null;
        Response<ListServiceProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceProfilesResultJsonUnmarshaller());
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
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Lists the wireless devices registered to your AWS account.
     * </p>
     * 
     * @param listWirelessDevicesRequest
     * @return Result of the ListWirelessDevices operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.ListWirelessDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessDevices"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWirelessDevicesResult listWirelessDevices(ListWirelessDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListWirelessDevices(request);
    }

    @SdkInternalApi
    final ListWirelessDevicesResult executeListWirelessDevices(ListWirelessDevicesRequest listWirelessDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWirelessDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWirelessDevicesRequest> request = null;
        Response<ListWirelessDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWirelessDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWirelessDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWirelessDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWirelessDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWirelessDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the wireless gateway tasks definitions registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewayTaskDefinitionsRequest
     * @return Result of the ListWirelessGatewayTaskDefinitions operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListWirelessGatewayTaskDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGatewayTaskDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWirelessGatewayTaskDefinitionsResult listWirelessGatewayTaskDefinitions(ListWirelessGatewayTaskDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListWirelessGatewayTaskDefinitions(request);
    }

    @SdkInternalApi
    final ListWirelessGatewayTaskDefinitionsResult executeListWirelessGatewayTaskDefinitions(
            ListWirelessGatewayTaskDefinitionsRequest listWirelessGatewayTaskDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWirelessGatewayTaskDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWirelessGatewayTaskDefinitionsRequest> request = null;
        Response<ListWirelessGatewayTaskDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWirelessGatewayTaskDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWirelessGatewayTaskDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWirelessGatewayTaskDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWirelessGatewayTaskDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWirelessGatewayTaskDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the wireless gateways registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewaysRequest
     * @return Result of the ListWirelessGateways operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.ListWirelessGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGateways"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWirelessGatewaysResult listWirelessGateways(ListWirelessGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeListWirelessGateways(request);
    }

    @SdkInternalApi
    final ListWirelessGatewaysResult executeListWirelessGateways(ListWirelessGatewaysRequest listWirelessGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listWirelessGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWirelessGatewaysRequest> request = null;
        Response<ListWirelessGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWirelessGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWirelessGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWirelessGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWirelessGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWirelessGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the log-level override for a resource-ID and resource-type, could be a wireless gateway or a wireless
     * device.
     * </p>
     * 
     * @param putResourceLogLevelRequest
     * @return Result of the PutResourceLogLevel operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.PutResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourceLogLevelResult putResourceLogLevel(PutResourceLogLevelRequest request) {
        request = beforeClientExecution(request);
        return executePutResourceLogLevel(request);
    }

    @SdkInternalApi
    final PutResourceLogLevelResult executePutResourceLogLevel(PutResourceLogLevelRequest putResourceLogLevelRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourceLogLevelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourceLogLevelRequest> request = null;
        Response<PutResourceLogLevelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourceLogLevelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourceLogLevelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourceLogLevel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourceLogLevelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourceLogLevelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove log-level overrides if any for all resources (both wireless devices and wireless gateways).
     * </p>
     * 
     * @param resetAllResourceLogLevelsRequest
     * @return Result of the ResetAllResourceLogLevels operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.ResetAllResourceLogLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetAllResourceLogLevels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetAllResourceLogLevelsResult resetAllResourceLogLevels(ResetAllResourceLogLevelsRequest request) {
        request = beforeClientExecution(request);
        return executeResetAllResourceLogLevels(request);
    }

    @SdkInternalApi
    final ResetAllResourceLogLevelsResult executeResetAllResourceLogLevels(ResetAllResourceLogLevelsRequest resetAllResourceLogLevelsRequest) {

        ExecutionContext executionContext = createExecutionContext(resetAllResourceLogLevelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetAllResourceLogLevelsRequest> request = null;
        Response<ResetAllResourceLogLevelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetAllResourceLogLevelsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(resetAllResourceLogLevelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetAllResourceLogLevels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetAllResourceLogLevelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResetAllResourceLogLevelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove log-level override if any for a specific resource-ID and resource-type, could be a wireless device or a
     * wireless gateway.
     * </p>
     * 
     * @param resetResourceLogLevelRequest
     * @return Result of the ResetResourceLogLevel operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.ResetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetResourceLogLevelResult resetResourceLogLevel(ResetResourceLogLevelRequest request) {
        request = beforeClientExecution(request);
        return executeResetResourceLogLevel(request);
    }

    @SdkInternalApi
    final ResetResourceLogLevelResult executeResetResourceLogLevel(ResetResourceLogLevelRequest resetResourceLogLevelRequest) {

        ExecutionContext executionContext = createExecutionContext(resetResourceLogLevelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetResourceLogLevelRequest> request = null;
        Response<ResetResourceLogLevelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetResourceLogLevelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetResourceLogLevelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetResourceLogLevel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetResourceLogLevelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ResetResourceLogLevelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a decrypted application data frame to a device.
     * </p>
     * 
     * @param sendDataToWirelessDeviceRequest
     * @return Result of the SendDataToWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.SendDataToWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendDataToWirelessDeviceResult sendDataToWirelessDevice(SendDataToWirelessDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeSendDataToWirelessDevice(request);
    }

    @SdkInternalApi
    final SendDataToWirelessDeviceResult executeSendDataToWirelessDevice(SendDataToWirelessDeviceRequest sendDataToWirelessDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(sendDataToWirelessDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendDataToWirelessDeviceRequest> request = null;
        Response<SendDataToWirelessDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendDataToWirelessDeviceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendDataToWirelessDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendDataToWirelessDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendDataToWirelessDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendDataToWirelessDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws TooManyTagsException
     *         The request was denied because the resource can't have any more tags.
     * @sample AWSIoTWireless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Simulates a provisioned device by sending an uplink data payload of <code>Hello</code>.
     * </p>
     * 
     * @param testWirelessDeviceRequest
     * @return Result of the TestWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.TestWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TestWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TestWirelessDeviceResult testWirelessDevice(TestWirelessDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeTestWirelessDevice(request);
    }

    @SdkInternalApi
    final TestWirelessDeviceResult executeTestWirelessDevice(TestWirelessDeviceRequest testWirelessDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(testWirelessDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestWirelessDeviceRequest> request = null;
        Response<TestWirelessDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestWirelessDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testWirelessDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestWirelessDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestWirelessDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestWirelessDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Updates properties of a destination.
     * </p>
     * 
     * @param updateDestinationRequest
     * @return Result of the UpdateDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateDestination" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
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
     * Set default log level, or log levels by resource types, could be for wireless device log options or wireless
     * gateways log options. This is to control the log messages that will be displayed in CloudWatch.
     * </p>
     * 
     * @param updateLogLevelsByResourceTypesRequest
     * @return Result of the UpdateLogLevelsByResourceTypes operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.UpdateLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLogLevelsByResourceTypesResult updateLogLevelsByResourceTypes(UpdateLogLevelsByResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLogLevelsByResourceTypes(request);
    }

    @SdkInternalApi
    final UpdateLogLevelsByResourceTypesResult executeUpdateLogLevelsByResourceTypes(UpdateLogLevelsByResourceTypesRequest updateLogLevelsByResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLogLevelsByResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLogLevelsByResourceTypesRequest> request = null;
        Response<UpdateLogLevelsByResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLogLevelsByResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLogLevelsByResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLogLevelsByResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLogLevelsByResourceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLogLevelsByResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates properties of a partner account.
     * </p>
     * 
     * @param updatePartnerAccountRequest
     * @return Result of the UpdatePartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdatePartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePartnerAccountResult updatePartnerAccount(UpdatePartnerAccountRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePartnerAccount(request);
    }

    @SdkInternalApi
    final UpdatePartnerAccountResult executeUpdatePartnerAccount(UpdatePartnerAccountRequest updatePartnerAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePartnerAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePartnerAccountRequest> request = null;
        Response<UpdatePartnerAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePartnerAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePartnerAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePartnerAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePartnerAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePartnerAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates properties of a wireless device.
     * </p>
     * 
     * @param updateWirelessDeviceRequest
     * @return Result of the UpdateWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWirelessDeviceResult updateWirelessDevice(UpdateWirelessDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWirelessDevice(request);
    }

    @SdkInternalApi
    final UpdateWirelessDeviceResult executeUpdateWirelessDevice(UpdateWirelessDeviceRequest updateWirelessDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWirelessDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWirelessDeviceRequest> request = null;
        Response<UpdateWirelessDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWirelessDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWirelessDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWirelessDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWirelessDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWirelessDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates properties of a wireless gateway.
     * </p>
     * 
     * @param updateWirelessGatewayRequest
     * @return Result of the UpdateWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWirelessGatewayResult updateWirelessGateway(UpdateWirelessGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWirelessGateway(request);
    }

    @SdkInternalApi
    final UpdateWirelessGatewayResult executeUpdateWirelessGateway(UpdateWirelessGatewayRequest updateWirelessGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWirelessGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWirelessGatewayRequest> request = null;
        Response<UpdateWirelessGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWirelessGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWirelessGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWirelessGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWirelessGatewayResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateWirelessGatewayResultJsonUnmarshaller());
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
