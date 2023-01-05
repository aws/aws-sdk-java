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
 * AWS IoT Wireless provides bi-directional communication between internet-connected wireless devices and the AWS Cloud.
 * To onboard both LoRaWAN and Sidewalk devices to AWS IoT, use the IoT Wireless API. These wireless devices use the Low
 * Power Wide Area Networking (LPWAN) communication protocol to communicate with AWS IoT.
 * </p>
 * <p>
 * Using the API, you can perform create, read, update, and delete operations for your wireless devices, gateways,
 * destinations, and profiles. After onboarding your devices, you can use the API operations to set log levels and
 * monitor your devices with CloudWatch.
 * </p>
 * <p>
 * You can also use the API operations to create multicast groups and schedule a multicast session for sending a
 * downlink message to devices in the group. By using Firmware Updates Over-The-Air (FUOTA) API operations, you can
 * create a FUOTA task and schedule a session to update the firmware of individual devices or an entire group of devices
 * in a multicast group.
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
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotwireless.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
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
     * Associate a multicast group with a FUOTA task.
     * </p>
     * 
     * @param associateMulticastGroupWithFuotaTaskRequest
     * @return Result of the AssociateMulticastGroupWithFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.AssociateMulticastGroupWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateMulticastGroupWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateMulticastGroupWithFuotaTaskResult associateMulticastGroupWithFuotaTask(AssociateMulticastGroupWithFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMulticastGroupWithFuotaTask(request);
    }

    @SdkInternalApi
    final AssociateMulticastGroupWithFuotaTaskResult executeAssociateMulticastGroupWithFuotaTask(
            AssociateMulticastGroupWithFuotaTaskRequest associateMulticastGroupWithFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMulticastGroupWithFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMulticastGroupWithFuotaTaskRequest> request = null;
        Response<AssociateMulticastGroupWithFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMulticastGroupWithFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateMulticastGroupWithFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMulticastGroupWithFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMulticastGroupWithFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateMulticastGroupWithFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate a wireless device with a FUOTA task.
     * </p>
     * 
     * @param associateWirelessDeviceWithFuotaTaskRequest
     * @return Result of the AssociateWirelessDeviceWithFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.AssociateWirelessDeviceWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateWirelessDeviceWithFuotaTaskResult associateWirelessDeviceWithFuotaTask(AssociateWirelessDeviceWithFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWirelessDeviceWithFuotaTask(request);
    }

    @SdkInternalApi
    final AssociateWirelessDeviceWithFuotaTaskResult executeAssociateWirelessDeviceWithFuotaTask(
            AssociateWirelessDeviceWithFuotaTaskRequest associateWirelessDeviceWithFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWirelessDeviceWithFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWirelessDeviceWithFuotaTaskRequest> request = null;
        Response<AssociateWirelessDeviceWithFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWirelessDeviceWithFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateWirelessDeviceWithFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWirelessDeviceWithFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWirelessDeviceWithFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateWirelessDeviceWithFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a wireless device with a multicast group.
     * </p>
     * 
     * @param associateWirelessDeviceWithMulticastGroupRequest
     * @return Result of the AssociateWirelessDeviceWithMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.AssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateWirelessDeviceWithMulticastGroupResult associateWirelessDeviceWithMulticastGroup(AssociateWirelessDeviceWithMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWirelessDeviceWithMulticastGroup(request);
    }

    @SdkInternalApi
    final AssociateWirelessDeviceWithMulticastGroupResult executeAssociateWirelessDeviceWithMulticastGroup(
            AssociateWirelessDeviceWithMulticastGroupRequest associateWirelessDeviceWithMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWirelessDeviceWithMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWirelessDeviceWithMulticastGroupRequest> request = null;
        Response<AssociateWirelessDeviceWithMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWirelessDeviceWithMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateWirelessDeviceWithMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWirelessDeviceWithMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWirelessDeviceWithMulticastGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateWirelessDeviceWithMulticastGroupResultJsonUnmarshaller());
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
     * Cancels an existing multicast group session.
     * </p>
     * 
     * @param cancelMulticastGroupSessionRequest
     * @return Result of the CancelMulticastGroupSession operation returned by the service.
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
     * @sample AWSIoTWireless.CancelMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CancelMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMulticastGroupSessionResult cancelMulticastGroupSession(CancelMulticastGroupSessionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMulticastGroupSession(request);
    }

    @SdkInternalApi
    final CancelMulticastGroupSessionResult executeCancelMulticastGroupSession(CancelMulticastGroupSessionRequest cancelMulticastGroupSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMulticastGroupSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMulticastGroupSessionRequest> request = null;
        Response<CancelMulticastGroupSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMulticastGroupSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelMulticastGroupSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMulticastGroupSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMulticastGroupSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMulticastGroupSessionResultJsonUnmarshaller());
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
     * Creates a FUOTA task.
     * </p>
     * 
     * @param createFuotaTaskRequest
     * @return Result of the CreateFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.CreateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFuotaTaskResult createFuotaTask(CreateFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFuotaTask(request);
    }

    @SdkInternalApi
    final CreateFuotaTaskResult executeCreateFuotaTask(CreateFuotaTaskRequest createFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFuotaTaskRequest> request = null;
        Response<CreateFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a multicast group.
     * </p>
     * 
     * @param createMulticastGroupRequest
     * @return Result of the CreateMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.CreateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMulticastGroupResult createMulticastGroup(CreateMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMulticastGroup(request);
    }

    @SdkInternalApi
    final CreateMulticastGroupResult executeCreateMulticastGroup(CreateMulticastGroupRequest createMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMulticastGroupRequest> request = null;
        Response<CreateMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMulticastGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMulticastGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new network analyzer configuration.
     * </p>
     * 
     * @param createNetworkAnalyzerConfigurationRequest
     * @return Result of the CreateNetworkAnalyzerConfiguration operation returned by the service.
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
     * @sample AWSIoTWireless.CreateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNetworkAnalyzerConfigurationResult createNetworkAnalyzerConfiguration(CreateNetworkAnalyzerConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNetworkAnalyzerConfiguration(request);
    }

    @SdkInternalApi
    final CreateNetworkAnalyzerConfigurationResult executeCreateNetworkAnalyzerConfiguration(
            CreateNetworkAnalyzerConfigurationRequest createNetworkAnalyzerConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createNetworkAnalyzerConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkAnalyzerConfigurationRequest> request = null;
        Response<CreateNetworkAnalyzerConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkAnalyzerConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createNetworkAnalyzerConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNetworkAnalyzerConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNetworkAnalyzerConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateNetworkAnalyzerConfigurationResultJsonUnmarshaller());
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
     * Deletes a FUOTA task.
     * </p>
     * 
     * @param deleteFuotaTaskRequest
     * @return Result of the DeleteFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.DeleteFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFuotaTaskResult deleteFuotaTask(DeleteFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFuotaTask(request);
    }

    @SdkInternalApi
    final DeleteFuotaTaskResult executeDeleteFuotaTask(DeleteFuotaTaskRequest deleteFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFuotaTaskRequest> request = null;
        Response<DeleteFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a multicast group if it is not in use by a fuota task.
     * </p>
     * 
     * @param deleteMulticastGroupRequest
     * @return Result of the DeleteMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.DeleteMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMulticastGroupResult deleteMulticastGroup(DeleteMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMulticastGroup(request);
    }

    @SdkInternalApi
    final DeleteMulticastGroupResult executeDeleteMulticastGroup(DeleteMulticastGroupRequest deleteMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMulticastGroupRequest> request = null;
        Response<DeleteMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMulticastGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMulticastGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a network analyzer configuration.
     * </p>
     * 
     * @param deleteNetworkAnalyzerConfigurationRequest
     * @return Result of the DeleteNetworkAnalyzerConfiguration operation returned by the service.
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
     * @sample AWSIoTWireless.DeleteNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNetworkAnalyzerConfigurationResult deleteNetworkAnalyzerConfiguration(DeleteNetworkAnalyzerConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNetworkAnalyzerConfiguration(request);
    }

    @SdkInternalApi
    final DeleteNetworkAnalyzerConfigurationResult executeDeleteNetworkAnalyzerConfiguration(
            DeleteNetworkAnalyzerConfigurationRequest deleteNetworkAnalyzerConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNetworkAnalyzerConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkAnalyzerConfigurationRequest> request = null;
        Response<DeleteNetworkAnalyzerConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkAnalyzerConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteNetworkAnalyzerConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNetworkAnalyzerConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNetworkAnalyzerConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteNetworkAnalyzerConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove queued messages from the downlink queue.
     * </p>
     * 
     * @param deleteQueuedMessagesRequest
     * @return Result of the DeleteQueuedMessages operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.DeleteQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteQueuedMessages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteQueuedMessagesResult deleteQueuedMessages(DeleteQueuedMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueuedMessages(request);
    }

    @SdkInternalApi
    final DeleteQueuedMessagesResult executeDeleteQueuedMessages(DeleteQueuedMessagesRequest deleteQueuedMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueuedMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueuedMessagesRequest> request = null;
        Response<DeleteQueuedMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueuedMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueuedMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueuedMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueuedMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteQueuedMessagesResultJsonUnmarshaller());
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
     * Disassociates a multicast group from a fuota task.
     * </p>
     * 
     * @param disassociateMulticastGroupFromFuotaTaskRequest
     * @return Result of the DisassociateMulticastGroupFromFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.DisassociateMulticastGroupFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateMulticastGroupFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMulticastGroupFromFuotaTaskResult disassociateMulticastGroupFromFuotaTask(DisassociateMulticastGroupFromFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMulticastGroupFromFuotaTask(request);
    }

    @SdkInternalApi
    final DisassociateMulticastGroupFromFuotaTaskResult executeDisassociateMulticastGroupFromFuotaTask(
            DisassociateMulticastGroupFromFuotaTaskRequest disassociateMulticastGroupFromFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMulticastGroupFromFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMulticastGroupFromFuotaTaskRequest> request = null;
        Response<DisassociateMulticastGroupFromFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMulticastGroupFromFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMulticastGroupFromFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMulticastGroupFromFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMulticastGroupFromFuotaTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateMulticastGroupFromFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a wireless device from a FUOTA task.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromFuotaTaskRequest
     * @return Result of the DisassociateWirelessDeviceFromFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.DisassociateWirelessDeviceFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWirelessDeviceFromFuotaTaskResult disassociateWirelessDeviceFromFuotaTask(DisassociateWirelessDeviceFromFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWirelessDeviceFromFuotaTask(request);
    }

    @SdkInternalApi
    final DisassociateWirelessDeviceFromFuotaTaskResult executeDisassociateWirelessDeviceFromFuotaTask(
            DisassociateWirelessDeviceFromFuotaTaskRequest disassociateWirelessDeviceFromFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWirelessDeviceFromFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWirelessDeviceFromFuotaTaskRequest> request = null;
        Response<DisassociateWirelessDeviceFromFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWirelessDeviceFromFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateWirelessDeviceFromFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWirelessDeviceFromFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWirelessDeviceFromFuotaTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateWirelessDeviceFromFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a wireless device from a multicast group.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromMulticastGroupRequest
     * @return Result of the DisassociateWirelessDeviceFromMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWirelessDeviceFromMulticastGroupResult disassociateWirelessDeviceFromMulticastGroup(
            DisassociateWirelessDeviceFromMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWirelessDeviceFromMulticastGroup(request);
    }

    @SdkInternalApi
    final DisassociateWirelessDeviceFromMulticastGroupResult executeDisassociateWirelessDeviceFromMulticastGroup(
            DisassociateWirelessDeviceFromMulticastGroupRequest disassociateWirelessDeviceFromMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWirelessDeviceFromMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWirelessDeviceFromMulticastGroupRequest> request = null;
        Response<DisassociateWirelessDeviceFromMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWirelessDeviceFromMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateWirelessDeviceFromMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWirelessDeviceFromMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWirelessDeviceFromMulticastGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateWirelessDeviceFromMulticastGroupResultJsonUnmarshaller());
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
     * Get the event configuration based on resource types.
     * </p>
     * 
     * @param getEventConfigurationByResourceTypesRequest
     * @return Result of the GetEventConfigurationByResourceTypes operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetEventConfigurationByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEventConfigurationByResourceTypesResult getEventConfigurationByResourceTypes(GetEventConfigurationByResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventConfigurationByResourceTypes(request);
    }

    @SdkInternalApi
    final GetEventConfigurationByResourceTypesResult executeGetEventConfigurationByResourceTypes(
            GetEventConfigurationByResourceTypesRequest getEventConfigurationByResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventConfigurationByResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventConfigurationByResourceTypesRequest> request = null;
        Response<GetEventConfigurationByResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventConfigurationByResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEventConfigurationByResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventConfigurationByResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventConfigurationByResourceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEventConfigurationByResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a FUOTA task.
     * </p>
     * 
     * @param getFuotaTaskRequest
     * @return Result of the GetFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.GetFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFuotaTaskResult getFuotaTask(GetFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetFuotaTask(request);
    }

    @SdkInternalApi
    final GetFuotaTaskResult executeGetFuotaTask(GetFuotaTaskRequest getFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFuotaTaskRequest> request = null;
        Response<GetFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns current default log levels or log levels by resource types. Based on resource types, log levels can be
     * for wireless device log options or wireless gateway log options.
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
     * Gets information about a multicast group.
     * </p>
     * 
     * @param getMulticastGroupRequest
     * @return Result of the GetMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.GetMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMulticastGroupResult getMulticastGroup(GetMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetMulticastGroup(request);
    }

    @SdkInternalApi
    final GetMulticastGroupResult executeGetMulticastGroup(GetMulticastGroupRequest getMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMulticastGroupRequest> request = null;
        Response<GetMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMulticastGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMulticastGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a multicast group session.
     * </p>
     * 
     * @param getMulticastGroupSessionRequest
     * @return Result of the GetMulticastGroupSession operation returned by the service.
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
     * @sample AWSIoTWireless.GetMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMulticastGroupSessionResult getMulticastGroupSession(GetMulticastGroupSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetMulticastGroupSession(request);
    }

    @SdkInternalApi
    final GetMulticastGroupSessionResult executeGetMulticastGroupSession(GetMulticastGroupSessionRequest getMulticastGroupSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getMulticastGroupSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMulticastGroupSessionRequest> request = null;
        Response<GetMulticastGroupSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMulticastGroupSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMulticastGroupSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMulticastGroupSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMulticastGroupSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMulticastGroupSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get network analyzer configuration.
     * </p>
     * 
     * @param getNetworkAnalyzerConfigurationRequest
     * @return Result of the GetNetworkAnalyzerConfiguration operation returned by the service.
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
     * @sample AWSIoTWireless.GetNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkAnalyzerConfigurationResult getNetworkAnalyzerConfiguration(GetNetworkAnalyzerConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkAnalyzerConfiguration(request);
    }

    @SdkInternalApi
    final GetNetworkAnalyzerConfigurationResult executeGetNetworkAnalyzerConfiguration(
            GetNetworkAnalyzerConfigurationRequest getNetworkAnalyzerConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkAnalyzerConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkAnalyzerConfigurationRequest> request = null;
        Response<GetNetworkAnalyzerConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkAnalyzerConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getNetworkAnalyzerConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkAnalyzerConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkAnalyzerConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetNetworkAnalyzerConfigurationResultJsonUnmarshaller());
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
     * Get the position information for a given resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to retrieve the position information should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html"
     * >GetResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param getPositionRequest
     * @return Result of the GetPosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public GetPositionResult getPosition(GetPositionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPosition(request);
    }

    @SdkInternalApi
    final GetPositionResult executeGetPosition(GetPositionRequest getPositionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPositionRequest> request = null;
        Response<GetPositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get position configuration for a given resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to retrieve the position configuration should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html"
     * >GetResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param getPositionConfigurationRequest
     * @return Result of the GetPositionConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public GetPositionConfigurationResult getPositionConfiguration(GetPositionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetPositionConfiguration(request);
    }

    @SdkInternalApi
    final GetPositionConfigurationResult executeGetPositionConfiguration(GetPositionConfigurationRequest getPositionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getPositionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPositionConfigurationRequest> request = null;
        Response<GetPositionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPositionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPositionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPositionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPositionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPositionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get estimated position information as a payload in GeoJSON format. The payload measurement data is resolved using
     * solvers that are provided by third-party vendors.
     * </p>
     * 
     * @param getPositionEstimateRequest
     * @return Result of the GetPositionEstimate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetPositionEstimate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionEstimate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPositionEstimateResult getPositionEstimate(GetPositionEstimateRequest request) {
        request = beforeClientExecution(request);
        return executeGetPositionEstimate(request);
    }

    @SdkInternalApi
    final GetPositionEstimateResult executeGetPositionEstimate(GetPositionEstimateRequest getPositionEstimateRequest) {

        ExecutionContext executionContext = createExecutionContext(getPositionEstimateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPositionEstimateRequest> request = null;
        Response<GetPositionEstimateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPositionEstimateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPositionEstimateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPositionEstimate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPositionEstimateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetPositionEstimateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param getResourceEventConfigurationRequest
     * @return Result of the GetResourceEventConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceEventConfigurationResult getResourceEventConfiguration(GetResourceEventConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceEventConfiguration(request);
    }

    @SdkInternalApi
    final GetResourceEventConfigurationResult executeGetResourceEventConfiguration(GetResourceEventConfigurationRequest getResourceEventConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceEventConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceEventConfigurationRequest> request = null;
        Response<GetResourceEventConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceEventConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResourceEventConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceEventConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceEventConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResourceEventConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless
     * device or a wireless gateway.
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
     * Get the position information for a given wireless device or a wireless gateway resource. The postion information
     * uses the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic System (WGS84)</a>.
     * </p>
     * 
     * @param getResourcePositionRequest
     * @return Result of the GetResourcePosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcePositionResult getResourcePosition(GetResourcePositionRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePosition(request);
    }

    @SdkInternalApi
    final GetResourcePositionResult executeGetResourcePosition(GetResourcePositionRequest getResourcePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePositionRequest> request = null;
        Response<GetResourcePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetResourcePositionResultJsonUnmarshaller());
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
     * List event configurations where at least one event topic has been enabled.
     * </p>
     * 
     * @param listEventConfigurationsRequest
     * @return Result of the ListEventConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.ListEventConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListEventConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEventConfigurationsResult listEventConfigurations(ListEventConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListEventConfigurations(request);
    }

    @SdkInternalApi
    final ListEventConfigurationsResult executeListEventConfigurations(ListEventConfigurationsRequest listEventConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventConfigurationsRequest> request = null;
        Response<ListEventConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEventConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEventConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the FUOTA tasks registered to your AWS account.
     * </p>
     * 
     * @param listFuotaTasksRequest
     * @return Result of the ListFuotaTasks operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListFuotaTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListFuotaTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFuotaTasksResult listFuotaTasks(ListFuotaTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListFuotaTasks(request);
    }

    @SdkInternalApi
    final ListFuotaTasksResult executeListFuotaTasks(ListFuotaTasksRequest listFuotaTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listFuotaTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFuotaTasksRequest> request = null;
        Response<ListFuotaTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFuotaTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFuotaTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFuotaTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFuotaTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFuotaTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the multicast groups registered to your AWS account.
     * </p>
     * 
     * @param listMulticastGroupsRequest
     * @return Result of the ListMulticastGroups operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListMulticastGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMulticastGroupsResult listMulticastGroups(ListMulticastGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListMulticastGroups(request);
    }

    @SdkInternalApi
    final ListMulticastGroupsResult executeListMulticastGroups(ListMulticastGroupsRequest listMulticastGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMulticastGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMulticastGroupsRequest> request = null;
        Response<ListMulticastGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMulticastGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMulticastGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMulticastGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMulticastGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMulticastGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all multicast groups associated with a fuota task.
     * </p>
     * 
     * @param listMulticastGroupsByFuotaTaskRequest
     * @return Result of the ListMulticastGroupsByFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListMulticastGroupsByFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroupsByFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMulticastGroupsByFuotaTaskResult listMulticastGroupsByFuotaTask(ListMulticastGroupsByFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeListMulticastGroupsByFuotaTask(request);
    }

    @SdkInternalApi
    final ListMulticastGroupsByFuotaTaskResult executeListMulticastGroupsByFuotaTask(ListMulticastGroupsByFuotaTaskRequest listMulticastGroupsByFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(listMulticastGroupsByFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMulticastGroupsByFuotaTaskRequest> request = null;
        Response<ListMulticastGroupsByFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMulticastGroupsByFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMulticastGroupsByFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMulticastGroupsByFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMulticastGroupsByFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMulticastGroupsByFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the network analyzer configurations.
     * </p>
     * 
     * @param listNetworkAnalyzerConfigurationsRequest
     * @return Result of the ListNetworkAnalyzerConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListNetworkAnalyzerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListNetworkAnalyzerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNetworkAnalyzerConfigurationsResult listNetworkAnalyzerConfigurations(ListNetworkAnalyzerConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworkAnalyzerConfigurations(request);
    }

    @SdkInternalApi
    final ListNetworkAnalyzerConfigurationsResult executeListNetworkAnalyzerConfigurations(
            ListNetworkAnalyzerConfigurationsRequest listNetworkAnalyzerConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworkAnalyzerConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworkAnalyzerConfigurationsRequest> request = null;
        Response<ListNetworkAnalyzerConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworkAnalyzerConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listNetworkAnalyzerConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworkAnalyzerConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworkAnalyzerConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListNetworkAnalyzerConfigurationsResultJsonUnmarshaller());
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
     * List position configurations for a given resource, such as positioning solvers.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to retrieve position information should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html"
     * >GetResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param listPositionConfigurationsRequest
     * @return Result of the ListPositionConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.ListPositionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPositionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public ListPositionConfigurationsResult listPositionConfigurations(ListPositionConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListPositionConfigurations(request);
    }

    @SdkInternalApi
    final ListPositionConfigurationsResult executeListPositionConfigurations(ListPositionConfigurationsRequest listPositionConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPositionConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPositionConfigurationsRequest> request = null;
        Response<ListPositionConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPositionConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPositionConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPositionConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPositionConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPositionConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List queued messages in the downlink queue.
     * </p>
     * 
     * @param listQueuedMessagesRequest
     * @return Result of the ListQueuedMessages operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.ListQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListQueuedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListQueuedMessagesResult listQueuedMessages(ListQueuedMessagesRequest request) {
        request = beforeClientExecution(request);
        return executeListQueuedMessages(request);
    }

    @SdkInternalApi
    final ListQueuedMessagesResult executeListQueuedMessages(ListQueuedMessagesRequest listQueuedMessagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueuedMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuedMessagesRequest> request = null;
        Response<ListQueuedMessagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuedMessagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueuedMessagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueuedMessages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueuedMessagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueuedMessagesResultJsonUnmarshaller());
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
     * Put position configuration for a given resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to update the position configuration should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_UpdateResourcePosition.html"
     * >UpdateResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param putPositionConfigurationRequest
     * @return Result of the PutPositionConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.PutPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public PutPositionConfigurationResult putPositionConfiguration(PutPositionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutPositionConfiguration(request);
    }

    @SdkInternalApi
    final PutPositionConfigurationResult executePutPositionConfiguration(PutPositionConfigurationRequest putPositionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putPositionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPositionConfigurationRequest> request = null;
        Response<PutPositionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPositionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putPositionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPositionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPositionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutPositionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless
     * gateway or a wireless device. A limit of 200 log level override can be set per account.
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
     * Removes the log-level overrides for all resources; both wireless devices and wireless gateways.
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
     * Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a
     * wireless device or a wireless gateway.
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
     * Sends the specified data to a multicast group.
     * </p>
     * 
     * @param sendDataToMulticastGroupRequest
     * @return Result of the SendDataToMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.SendDataToMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendDataToMulticastGroupResult sendDataToMulticastGroup(SendDataToMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeSendDataToMulticastGroup(request);
    }

    @SdkInternalApi
    final SendDataToMulticastGroupResult executeSendDataToMulticastGroup(SendDataToMulticastGroupRequest sendDataToMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(sendDataToMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendDataToMulticastGroupRequest> request = null;
        Response<SendDataToMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendDataToMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendDataToMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendDataToMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendDataToMulticastGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendDataToMulticastGroupResultJsonUnmarshaller());
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
     * Starts a bulk association of all qualifying wireless devices with a multicast group.
     * </p>
     * 
     * @param startBulkAssociateWirelessDeviceWithMulticastGroupRequest
     * @return Result of the StartBulkAssociateWirelessDeviceWithMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.StartBulkAssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkAssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartBulkAssociateWirelessDeviceWithMulticastGroupResult startBulkAssociateWirelessDeviceWithMulticastGroup(
            StartBulkAssociateWirelessDeviceWithMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeStartBulkAssociateWirelessDeviceWithMulticastGroup(request);
    }

    @SdkInternalApi
    final StartBulkAssociateWirelessDeviceWithMulticastGroupResult executeStartBulkAssociateWirelessDeviceWithMulticastGroup(
            StartBulkAssociateWirelessDeviceWithMulticastGroupRequest startBulkAssociateWirelessDeviceWithMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(startBulkAssociateWirelessDeviceWithMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBulkAssociateWirelessDeviceWithMulticastGroupRequest> request = null;
        Response<StartBulkAssociateWirelessDeviceWithMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBulkAssociateWirelessDeviceWithMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startBulkAssociateWirelessDeviceWithMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartBulkAssociateWirelessDeviceWithMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartBulkAssociateWirelessDeviceWithMulticastGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartBulkAssociateWirelessDeviceWithMulticastGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.
     * </p>
     * 
     * @param startBulkDisassociateWirelessDeviceFromMulticastGroupRequest
     * @return Result of the StartBulkDisassociateWirelessDeviceFromMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.StartBulkDisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkDisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartBulkDisassociateWirelessDeviceFromMulticastGroupResult startBulkDisassociateWirelessDeviceFromMulticastGroup(
            StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeStartBulkDisassociateWirelessDeviceFromMulticastGroup(request);
    }

    @SdkInternalApi
    final StartBulkDisassociateWirelessDeviceFromMulticastGroupResult executeStartBulkDisassociateWirelessDeviceFromMulticastGroup(
            StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest startBulkDisassociateWirelessDeviceFromMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(startBulkDisassociateWirelessDeviceFromMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest> request = null;
        Response<StartBulkDisassociateWirelessDeviceFromMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBulkDisassociateWirelessDeviceFromMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startBulkDisassociateWirelessDeviceFromMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartBulkDisassociateWirelessDeviceFromMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartBulkDisassociateWirelessDeviceFromMulticastGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartBulkDisassociateWirelessDeviceFromMulticastGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a FUOTA task.
     * </p>
     * 
     * @param startFuotaTaskRequest
     * @return Result of the StartFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.StartFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartFuotaTaskResult startFuotaTask(StartFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartFuotaTask(request);
    }

    @SdkInternalApi
    final StartFuotaTaskResult executeStartFuotaTask(StartFuotaTaskRequest startFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFuotaTaskRequest> request = null;
        Response<StartFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a multicast group session.
     * </p>
     * 
     * @param startMulticastGroupSessionRequest
     * @return Result of the StartMulticastGroupSession operation returned by the service.
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
     * @sample AWSIoTWireless.StartMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMulticastGroupSessionResult startMulticastGroupSession(StartMulticastGroupSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartMulticastGroupSession(request);
    }

    @SdkInternalApi
    final StartMulticastGroupSessionResult executeStartMulticastGroupSession(StartMulticastGroupSessionRequest startMulticastGroupSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startMulticastGroupSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMulticastGroupSessionRequest> request = null;
        Response<StartMulticastGroupSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMulticastGroupSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMulticastGroupSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMulticastGroupSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMulticastGroupSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMulticastGroupSessionResultJsonUnmarshaller());
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
     * Update the event configuration based on resource types.
     * </p>
     * 
     * @param updateEventConfigurationByResourceTypesRequest
     * @return Result of the UpdateEventConfigurationByResourceTypes operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdateEventConfigurationByResourceTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEventConfigurationByResourceTypesResult updateEventConfigurationByResourceTypes(UpdateEventConfigurationByResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventConfigurationByResourceTypes(request);
    }

    @SdkInternalApi
    final UpdateEventConfigurationByResourceTypesResult executeUpdateEventConfigurationByResourceTypes(
            UpdateEventConfigurationByResourceTypesRequest updateEventConfigurationByResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventConfigurationByResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventConfigurationByResourceTypesRequest> request = null;
        Response<UpdateEventConfigurationByResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventConfigurationByResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEventConfigurationByResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEventConfigurationByResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventConfigurationByResourceTypesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateEventConfigurationByResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates properties of a FUOTA task.
     * </p>
     * 
     * @param updateFuotaTaskRequest
     * @return Result of the UpdateFuotaTask operation returned by the service.
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
     * @sample AWSIoTWireless.UpdateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFuotaTaskResult updateFuotaTask(UpdateFuotaTaskRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFuotaTask(request);
    }

    @SdkInternalApi
    final UpdateFuotaTaskResult executeUpdateFuotaTask(UpdateFuotaTaskRequest updateFuotaTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFuotaTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFuotaTaskRequest> request = null;
        Response<UpdateFuotaTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFuotaTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFuotaTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFuotaTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFuotaTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFuotaTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set default log level, or log levels by resource types. This can be for wireless device log options or wireless
     * gateways log options and is used to control the log messages that'll be displayed in CloudWatch.
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
     * Updates properties of a multicast group session.
     * </p>
     * 
     * @param updateMulticastGroupRequest
     * @return Result of the UpdateMulticastGroup operation returned by the service.
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
     * @sample AWSIoTWireless.UpdateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMulticastGroupResult updateMulticastGroup(UpdateMulticastGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMulticastGroup(request);
    }

    @SdkInternalApi
    final UpdateMulticastGroupResult executeUpdateMulticastGroup(UpdateMulticastGroupRequest updateMulticastGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMulticastGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMulticastGroupRequest> request = null;
        Response<UpdateMulticastGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMulticastGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMulticastGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMulticastGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMulticastGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMulticastGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update network analyzer configuration.
     * </p>
     * 
     * @param updateNetworkAnalyzerConfigurationRequest
     * @return Result of the UpdateNetworkAnalyzerConfiguration operation returned by the service.
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
     * @sample AWSIoTWireless.UpdateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNetworkAnalyzerConfigurationResult updateNetworkAnalyzerConfiguration(UpdateNetworkAnalyzerConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNetworkAnalyzerConfiguration(request);
    }

    @SdkInternalApi
    final UpdateNetworkAnalyzerConfigurationResult executeUpdateNetworkAnalyzerConfiguration(
            UpdateNetworkAnalyzerConfigurationRequest updateNetworkAnalyzerConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNetworkAnalyzerConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkAnalyzerConfigurationRequest> request = null;
        Response<UpdateNetworkAnalyzerConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkAnalyzerConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateNetworkAnalyzerConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNetworkAnalyzerConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNetworkAnalyzerConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNetworkAnalyzerConfigurationResultJsonUnmarshaller());
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
     * Update the position information of a resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to update the position information should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_UpdateResourcePosition.html"
     * >UpdateResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param updatePositionRequest
     * @return Result of the UpdatePosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdatePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public UpdatePositionResult updatePosition(UpdatePositionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePosition(request);
    }

    @SdkInternalApi
    final UpdatePositionResult executeUpdatePosition(UpdatePositionRequest updatePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePositionRequest> request = null;
        Response<UpdatePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param updateResourceEventConfigurationRequest
     * @return Result of the UpdateResourceEventConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdateResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourceEventConfigurationResult updateResourceEventConfiguration(UpdateResourceEventConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourceEventConfiguration(request);
    }

    @SdkInternalApi
    final UpdateResourceEventConfigurationResult executeUpdateResourceEventConfiguration(
            UpdateResourceEventConfigurationRequest updateResourceEventConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceEventConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceEventConfigurationRequest> request = null;
        Response<UpdateResourceEventConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceEventConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateResourceEventConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourceEventConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceEventConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateResourceEventConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the position information of a given wireless device or a wireless gateway resource. The postion
     * coordinates are based on the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic
     * System (WGS84)</a>.
     * </p>
     * 
     * @param updateResourcePositionRequest
     * @return Result of the UpdateResourcePosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdateResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourcePositionResult updateResourcePosition(UpdateResourcePositionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourcePosition(request);
    }

    @SdkInternalApi
    final UpdateResourcePositionResult executeUpdateResourcePosition(UpdateResourcePositionRequest updateResourcePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourcePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourcePositionRequest> request = null;
        Response<UpdateResourcePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourcePositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourcePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Wireless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourcePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourcePositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateResourcePositionResultJsonUnmarshaller());
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
