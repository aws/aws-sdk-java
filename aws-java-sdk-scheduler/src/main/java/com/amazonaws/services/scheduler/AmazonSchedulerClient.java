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
package com.amazonaws.services.scheduler;

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

import com.amazonaws.services.scheduler.AmazonSchedulerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.scheduler.model.*;
import com.amazonaws.services.scheduler.model.transform.*;

/**
 * Client for accessing Amazon EventBridge Scheduler. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Amazon EventBridge Scheduler is a serverless scheduler that allows you to create, run, and manage tasks from one
 * central, managed service. EventBridge Scheduler delivers your tasks reliably, with built-in mechanisms that adjust
 * your schedules based on the availability of downstream targets. The following reference lists the available API
 * actions, and data types for EventBridge Scheduler.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSchedulerClient extends AmazonWebServiceClient implements AmazonScheduler {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonScheduler.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "scheduler";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.scheduler.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.scheduler.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.scheduler.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.scheduler.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.scheduler.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.scheduler.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.scheduler.model.AmazonSchedulerException.class));

    public static AmazonSchedulerClientBuilder builder() {
        return AmazonSchedulerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EventBridge Scheduler using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSchedulerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EventBridge Scheduler using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSchedulerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("scheduler.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/scheduler/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/scheduler/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates the specified schedule.
     * </p>
     * 
     * @param createScheduleRequest
     * @return Result of the CreateSchedule operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateScheduleResult createSchedule(CreateScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchedule(request);
    }

    @SdkInternalApi
    final CreateScheduleResult executeCreateSchedule(CreateScheduleRequest createScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(createScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScheduleRequest> request = null;
        Response<CreateScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified schedule group.
     * </p>
     * 
     * @param createScheduleGroupRequest
     * @return Result of the CreateScheduleGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.CreateScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateScheduleGroupResult createScheduleGroup(CreateScheduleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScheduleGroup(request);
    }

    @SdkInternalApi
    final CreateScheduleGroupResult executeCreateScheduleGroup(CreateScheduleGroupRequest createScheduleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createScheduleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScheduleGroupRequest> request = null;
        Response<CreateScheduleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScheduleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScheduleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScheduleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScheduleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScheduleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified schedule.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteScheduleResult deleteSchedule(DeleteScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchedule(request);
    }

    @SdkInternalApi
    final DeleteScheduleResult executeDeleteSchedule(DeleteScheduleRequest deleteScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduleRequest> request = null;
        Response<DeleteScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified schedule group. Deleting a schedule group results in EventBridge Scheduler deleting all
     * schedules associated with the group. When you delete a group, it remains in a <code>DELETING</code> state until
     * all of its associated schedules are deleted. Schedules associated with the group that are set to run while the
     * schedule group is in the process of being deleted might continue to invoke their targets until the schedule group
     * and its associated schedules are deleted.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent.
     * </p>
     * </note>
     * 
     * @param deleteScheduleGroupRequest
     * @return Result of the DeleteScheduleGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.DeleteScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteScheduleGroupResult deleteScheduleGroup(DeleteScheduleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScheduleGroup(request);
    }

    @SdkInternalApi
    final DeleteScheduleGroupResult executeDeleteScheduleGroup(DeleteScheduleGroupRequest deleteScheduleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduleGroupRequest> request = null;
        Response<DeleteScheduleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScheduleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScheduleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified schedule.
     * </p>
     * 
     * @param getScheduleRequest
     * @return Result of the GetSchedule operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.GetSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetScheduleResult getSchedule(GetScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchedule(request);
    }

    @SdkInternalApi
    final GetScheduleResult executeGetSchedule(GetScheduleRequest getScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(getScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetScheduleRequest> request = null;
        Response<GetScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified schedule group.
     * </p>
     * 
     * @param getScheduleGroupRequest
     * @return Result of the GetScheduleGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.GetScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetScheduleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetScheduleGroupResult getScheduleGroup(GetScheduleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetScheduleGroup(request);
    }

    @SdkInternalApi
    final GetScheduleGroupResult executeGetScheduleGroup(GetScheduleGroupRequest getScheduleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getScheduleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetScheduleGroupRequest> request = null;
        Response<GetScheduleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetScheduleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getScheduleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetScheduleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetScheduleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetScheduleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of your schedule groups.
     * </p>
     * 
     * @param listScheduleGroupsRequest
     * @return Result of the ListScheduleGroups operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.ListScheduleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListScheduleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListScheduleGroupsResult listScheduleGroups(ListScheduleGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListScheduleGroups(request);
    }

    @SdkInternalApi
    final ListScheduleGroupsResult executeListScheduleGroups(ListScheduleGroupsRequest listScheduleGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listScheduleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScheduleGroupsRequest> request = null;
        Response<ListScheduleGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScheduleGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScheduleGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScheduleGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScheduleGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScheduleGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of your EventBridge Scheduler schedules.
     * </p>
     * 
     * @param listSchedulesRequest
     * @return Result of the ListSchedules operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchedulesResult listSchedules(ListSchedulesRequest request) {
        request = beforeClientExecution(request);
        return executeListSchedules(request);
    }

    @SdkInternalApi
    final ListSchedulesResult executeListSchedules(ListSchedulesRequest listSchedulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchedulesRequest> request = null;
        Response<ListSchedulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchedulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchedulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchedules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchedulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchedulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags associated with the Scheduler resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
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
     * Assigns one or more tags (key-value pairs) to the specified EventBridge Scheduler resource. You can only assign
     * tags to schedule groups.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
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
     * Removes one or more tags from the specified EventBridge Scheduler schedule group.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
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
     * Updates the specified schedule. When you call <code>UpdateSchedule</code>, EventBridge Scheduler uses all values,
     * including empty values, specified in the request and overrides the existing schedule. This is by design. This
     * means that if you do not set an optional field in your request, that field will be set to its system-default
     * value after the update.
     * </p>
     * <p>
     * Before calling this operation, we recommend that you call the <code>GetSchedule</code> API operation and make a
     * note of all optional parameters for your <code>UpdateSchedule</code> call.
     * </p>
     * 
     * @param updateScheduleRequest
     * @return Result of the UpdateSchedule operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateScheduleResult updateSchedule(UpdateScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSchedule(request);
    }

    @SdkInternalApi
    final UpdateScheduleResult executeUpdateSchedule(UpdateScheduleRequest updateScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScheduleRequest> request = null;
        Response<UpdateScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Scheduler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateScheduleResultJsonUnmarshaller());
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
