/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot1clickdevices;

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

import com.amazonaws.services.iot1clickdevices.AWSIoT1ClickDevicesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iot1clickdevices.model.*;
import com.amazonaws.services.iot1clickdevices.model.transform.*;

/**
 * Client for accessing AWS IoT 1-Click Devices Service. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Describes all of the AWS IoT 1-Click device-related API operations for the service. Also provides sample requests,
 * responses, and errors for the supported web services protocols.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoT1ClickDevicesClient extends AmazonWebServiceClient implements AWSIoT1ClickDevices {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoT1ClickDevices.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iot1click";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionFailedException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.PreconditionFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RangeNotSatisfiableException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.RangeNotSatisfiableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withModeledClass(
                                    com.amazonaws.services.iot1clickdevices.model.ResourceConflictException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iot1clickdevices.model.AWSIoT1ClickDevicesException.class));

    public static AWSIoT1ClickDevicesClientBuilder builder() {
        return AWSIoT1ClickDevicesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT 1-Click Devices Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoT1ClickDevicesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT 1-Click Devices Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoT1ClickDevicesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("devices.iot1click.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iot1clickdevices/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iot1clickdevices/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds device(s) to your account (i.e., claim one or more devices) if and only if you received a claim code with
     * the device(s).
     * </p>
     * 
     * @param claimDevicesByClaimCodeRequest
     * @return Result of the ClaimDevicesByClaimCode operation returned by the service.
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @sample AWSIoT1ClickDevices.ClaimDevicesByClaimCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ClaimDevicesByClaimCode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClaimDevicesByClaimCodeResult claimDevicesByClaimCode(ClaimDevicesByClaimCodeRequest request) {
        request = beforeClientExecution(request);
        return executeClaimDevicesByClaimCode(request);
    }

    @SdkInternalApi
    final ClaimDevicesByClaimCodeResult executeClaimDevicesByClaimCode(ClaimDevicesByClaimCodeRequest claimDevicesByClaimCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(claimDevicesByClaimCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ClaimDevicesByClaimCodeRequest> request = null;
        Response<ClaimDevicesByClaimCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ClaimDevicesByClaimCodeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(claimDevicesByClaimCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ClaimDevicesByClaimCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ClaimDevicesByClaimCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ClaimDevicesByClaimCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a device ID, returns a DescribeDeviceResponse object describing the details of the device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDeviceResult describeDevice(DescribeDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDevice(request);
    }

    @SdkInternalApi
    final DescribeDeviceResult executeDescribeDevice(DescribeDeviceRequest describeDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeviceRequest> request = null;
        Response<DescribeDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a device ID, finalizes the claim request for the associated device.
     * </p>
     * <note>
     * <p>
     * Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
     * device of type button, a device event can be published by simply clicking the device.
     * </p>
     * </note>
     * 
     * @param finalizeDeviceClaimRequest
     * @return Result of the FinalizeDeviceClaim operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @throws PreconditionFailedException
     *         412 response
     * @throws ResourceConflictException
     *         409 response
     * @sample AWSIoT1ClickDevices.FinalizeDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/FinalizeDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public FinalizeDeviceClaimResult finalizeDeviceClaim(FinalizeDeviceClaimRequest request) {
        request = beforeClientExecution(request);
        return executeFinalizeDeviceClaim(request);
    }

    @SdkInternalApi
    final FinalizeDeviceClaimResult executeFinalizeDeviceClaim(FinalizeDeviceClaimRequest finalizeDeviceClaimRequest) {

        ExecutionContext executionContext = createExecutionContext(finalizeDeviceClaimRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FinalizeDeviceClaimRequest> request = null;
        Response<FinalizeDeviceClaimResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FinalizeDeviceClaimRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(finalizeDeviceClaimRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FinalizeDeviceClaim");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<FinalizeDeviceClaimResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new FinalizeDeviceClaimResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a device ID, returns the invokable methods associated with the device.
     * </p>
     * 
     * @param getDeviceMethodsRequest
     * @return Result of the GetDeviceMethods operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.GetDeviceMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/GetDeviceMethods" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeviceMethodsResult getDeviceMethods(GetDeviceMethodsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeviceMethods(request);
    }

    @SdkInternalApi
    final GetDeviceMethodsResult executeGetDeviceMethods(GetDeviceMethodsRequest getDeviceMethodsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceMethodsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceMethodsRequest> request = null;
        Response<GetDeviceMethodsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceMethodsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceMethodsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeviceMethods");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceMethodsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceMethodsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a device ID, initiates a claim request for the associated device.
     * </p>
     * <note>
     * <p>
     * Claiming a device consists of initiating a claim, then publishing a device event, and finalizing the claim. For a
     * device of type button, a device event can be published by simply clicking the device.
     * </p>
     * </note>
     * 
     * @param initiateDeviceClaimRequest
     * @return Result of the InitiateDeviceClaim operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @throws ResourceConflictException
     *         409 response
     * @sample AWSIoT1ClickDevices.InitiateDeviceClaim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InitiateDeviceClaim" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public InitiateDeviceClaimResult initiateDeviceClaim(InitiateDeviceClaimRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateDeviceClaim(request);
    }

    @SdkInternalApi
    final InitiateDeviceClaimResult executeInitiateDeviceClaim(InitiateDeviceClaimRequest initiateDeviceClaimRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateDeviceClaimRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateDeviceClaimRequest> request = null;
        Response<InitiateDeviceClaimResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateDeviceClaimRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateDeviceClaimRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateDeviceClaim");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateDeviceClaimResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitiateDeviceClaimResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a device ID, issues a request to invoke a named device method (with possible parameters). See the
     * "Example POST" code snippet below.
     * </p>
     * 
     * @param invokeDeviceMethodRequest
     * @return Result of the InvokeDeviceMethod operation returned by the service.
     * @throws InvalidRequestException
     *         400 response
     * @throws PreconditionFailedException
     *         412 response
     * @throws InternalFailureException
     *         500 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws RangeNotSatisfiableException
     *         416 response
     * @throws ResourceConflictException
     *         409 response
     * @sample AWSIoT1ClickDevices.InvokeDeviceMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InvokeDeviceMethod" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InvokeDeviceMethodResult invokeDeviceMethod(InvokeDeviceMethodRequest request) {
        request = beforeClientExecution(request);
        return executeInvokeDeviceMethod(request);
    }

    @SdkInternalApi
    final InvokeDeviceMethodResult executeInvokeDeviceMethod(InvokeDeviceMethodRequest invokeDeviceMethodRequest) {

        ExecutionContext executionContext = createExecutionContext(invokeDeviceMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeDeviceMethodRequest> request = null;
        Response<InvokeDeviceMethodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeDeviceMethodRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invokeDeviceMethodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InvokeDeviceMethod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvokeDeviceMethodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InvokeDeviceMethodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Using a device ID, returns a DeviceEventsResponse object containing an array of events for the device.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return Result of the ListDeviceEvents operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws RangeNotSatisfiableException
     *         416 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDeviceEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceEvents(request);
    }

    @SdkInternalApi
    final ListDeviceEventsResult executeListDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceEventsRequest> request = null;
        Response<ListDeviceEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeviceEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the 1-Click compatible devices associated with your AWS account.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws RangeNotSatisfiableException
     *         416 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListDevices(request);
    }

    @SdkInternalApi
    final ListDevicesResult executeListDevices(ListDevicesRequest listDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags associated with the specified resource ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
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
     * Adds or updates the tags associated with the resource ARN. See <a
     * href="https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-appendix.html#1click-limits">AWS IoT
     * 1-Click Service Limits</a> for the maximum number of tags allowed per resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
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
     * Disassociates a device from your AWS account using its device ID.
     * </p>
     * 
     * @param unclaimDeviceRequest
     * @return Result of the UnclaimDevice operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.UnclaimDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UnclaimDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnclaimDeviceResult unclaimDevice(UnclaimDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUnclaimDevice(request);
    }

    @SdkInternalApi
    final UnclaimDeviceResult executeUnclaimDevice(UnclaimDeviceRequest unclaimDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(unclaimDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnclaimDeviceRequest> request = null;
        Response<UnclaimDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnclaimDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unclaimDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnclaimDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnclaimDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnclaimDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Using tag keys, deletes the tags (key/value pairs) associated with the specified resource ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
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
     * Using a Boolean value (true or false), this operation enables or disables the device given a device ID.
     * </p>
     * 
     * @param updateDeviceStateRequest
     * @return Result of the UpdateDeviceState operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws InvalidRequestException
     *         400 response
     * @throws InternalFailureException
     *         500 response
     * @sample AWSIoT1ClickDevices.UpdateDeviceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UpdateDeviceState" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDeviceStateResult updateDeviceState(UpdateDeviceStateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDeviceState(request);
    }

    @SdkInternalApi
    final UpdateDeviceStateResult executeUpdateDeviceState(UpdateDeviceStateRequest updateDeviceStateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceStateRequest> request = null;
        Response<UpdateDeviceStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Devices Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDeviceState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceStateResultJsonUnmarshaller());
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

}
