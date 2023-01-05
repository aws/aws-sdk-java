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
package com.amazonaws.services.snowdevicemanagement;

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

import com.amazonaws.services.snowdevicemanagement.AWSSnowDeviceManagementClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.snowdevicemanagement.model.*;
import com.amazonaws.services.snowdevicemanagement.model.transform.*;

/**
 * Client for accessing AWS Snow Device Management. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Snow Device Management documentation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSnowDeviceManagementClient extends AmazonWebServiceClient implements AWSSnowDeviceManagement {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSnowDeviceManagement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "snow-device-management";

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
                                    com.amazonaws.services.snowdevicemanagement.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.snowdevicemanagement.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.snowdevicemanagement.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.snowdevicemanagement.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.snowdevicemanagement.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.snowdevicemanagement.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.snowdevicemanagement.model.AWSSnowDeviceManagementException.class));

    public static AWSSnowDeviceManagementClientBuilder builder() {
        return AWSSnowDeviceManagementClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Snow Device Management using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSnowDeviceManagementClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Snow Device Management using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSnowDeviceManagementClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("snow-device-management.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/snowdevicemanagement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/snowdevicemanagement/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sends a cancel request for a specified task. You can cancel a task only if it's still in a <code>QUEUED</code>
     * state. Tasks that are already running can't be cancelled.
     * </p>
     * <note>
     * <p>
     * A task might still run if it's processed from the queue before the <code>CancelTask</code> operation changes the
     * task's state.
     * </p>
     * </note>
     * 
     * @param cancelTaskRequest
     * @return Result of the CancelTask operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.CancelTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CancelTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelTaskResult cancelTask(CancelTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCancelTask(request);
    }

    @SdkInternalApi
    final CancelTaskResult executeCancelTask(CancelTaskRequest cancelTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelTaskRequest> request = null;
        Response<CancelTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instructs one or more devices to start a task, such as unlocking or rebooting.
     * </p>
     * 
     * @param createTaskRequest
     * @return Result of the CreateTask operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CreateTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTaskResult createTask(CreateTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTask(request);
    }

    @SdkInternalApi
    final CreateTaskResult executeCreateTask(CreateTaskRequest createTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTaskRequest> request = null;
        Response<CreateTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks device-specific information, such as the device type, software version, IP addresses, and lock status.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDevice"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
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
     * Checks the current state of the Amazon EC2 instances. The output is similar to <code>describeDevice</code>, but
     * the results are sourced from the device cache in the Amazon Web Services Cloud and include a subset of the
     * available fields.
     * </p>
     * 
     * @param describeDeviceEc2InstancesRequest
     * @return Result of the DescribeDeviceEc2Instances operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeDeviceEc2Instances
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeDeviceEc2Instances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDeviceEc2InstancesResult describeDeviceEc2Instances(DescribeDeviceEc2InstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeviceEc2Instances(request);
    }

    @SdkInternalApi
    final DescribeDeviceEc2InstancesResult executeDescribeDeviceEc2Instances(DescribeDeviceEc2InstancesRequest describeDeviceEc2InstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeviceEc2InstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeviceEc2InstancesRequest> request = null;
        Response<DescribeDeviceEc2InstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeviceEc2InstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDeviceEc2InstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeviceEc2Instances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeviceEc2InstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDeviceEc2InstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks the status of a remote task running on one or more target devices.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeExecutionResult describeExecution(DescribeExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExecution(request);
    }

    @SdkInternalApi
    final DescribeExecutionResult executeDescribeExecution(DescribeExecutionRequest describeExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExecutionRequest> request = null;
        Response<DescribeExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks the metadata for a given task on a device.
     * </p>
     * 
     * @param describeTaskRequest
     * @return Result of the DescribeTask operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/DescribeTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTaskResult describeTask(DescribeTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTask(request);
    }

    @SdkInternalApi
    final DescribeTaskResult executeDescribeTask(DescribeTaskRequest describeTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskRequest> request = null;
        Response<DescribeTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the Amazon Web Services resources available for a device. Currently, Amazon EC2 instances are
     * the only supported resource type.
     * </p>
     * 
     * @param listDeviceResourcesRequest
     * @return Result of the ListDeviceResources operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListDeviceResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDeviceResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDeviceResourcesResult listDeviceResources(ListDeviceResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceResources(request);
    }

    @SdkInternalApi
    final ListDeviceResourcesResult executeListDeviceResources(ListDeviceResourcesRequest listDeviceResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceResourcesRequest> request = null;
        Response<ListDeviceResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeviceResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all devices on your Amazon Web Services account that have Amazon Web Services Snow Device
     * Management enabled in the Amazon Web Services Region where the command is run.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDevices"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
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
     * Returns the status of tasks for one or more target devices.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListExecutionsResult listExecutions(ListExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListExecutions(request);
    }

    @SdkInternalApi
    final ListExecutionsResult executeListExecutions(ListExecutionsRequest listExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExecutionsRequest> request = null;
        Response<ListExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags for a managed device or task.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSSnowDeviceManagement.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
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
     * Returns a list of tasks that can be filtered by state.
     * </p>
     * 
     * @param listTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSSnowDeviceManagement.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListTasks(request);
    }

    @SdkInternalApi
    final ListTasksResult executeListTasks(ListTasksRequest listTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTasksRequest> request = null;
        Response<ListTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTasksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or replaces tags on a device or task.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSSnowDeviceManagement.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
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
     * Removes a tag from a device or task.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSSnowDeviceManagement.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snow Device Management");
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
