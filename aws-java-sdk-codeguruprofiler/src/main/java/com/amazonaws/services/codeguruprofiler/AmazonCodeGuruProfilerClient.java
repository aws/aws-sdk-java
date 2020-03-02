/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler;

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

import com.amazonaws.services.codeguruprofiler.AmazonCodeGuruProfilerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codeguruprofiler.model.*;
import com.amazonaws.services.codeguruprofiler.model.transform.*;

/**
 * Client for accessing Amazon CodeGuru Profiler. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Profiler API operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeGuruProfilerClient extends AmazonWebServiceClient implements AmazonCodeGuruProfiler {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCodeGuruProfiler.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codeguru-profiler";

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
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeguruprofiler.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeguruprofiler.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeguruprofiler.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeguruprofiler.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeguruprofiler.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeguruprofiler.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codeguruprofiler.model.AmazonCodeGuruProfilerException.class));

    public static AmazonCodeGuruProfilerClientBuilder builder() {
        return AmazonCodeGuruProfilerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CodeGuru Profiler using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruProfilerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CodeGuru Profiler using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruProfilerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codeguru-profiler.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codeguruprofiler/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codeguruprofiler/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p/>
     * 
     * @param configureAgentRequest
     *        The structure representing the configureAgentRequest.
     * @return Result of the ConfigureAgent operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.ConfigureAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ConfigureAgent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfigureAgentResult configureAgent(ConfigureAgentRequest request) {
        request = beforeClientExecution(request);
        return executeConfigureAgent(request);
    }

    @SdkInternalApi
    final ConfigureAgentResult executeConfigureAgent(ConfigureAgentRequest configureAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(configureAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfigureAgentRequest> request = null;
        Response<ConfigureAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfigureAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(configureAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfigureAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfigureAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ConfigureAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a profiling group.
     * </p>
     * 
     * @param createProfilingGroupRequest
     *        The structure representing the createProfiliingGroupRequest.
     * @return Result of the CreateProfilingGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     *         Quotas</a> to request a service quota increase.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.CreateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/CreateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProfilingGroupResult createProfilingGroup(CreateProfilingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfilingGroup(request);
    }

    @SdkInternalApi
    final CreateProfilingGroupResult executeCreateProfilingGroup(CreateProfilingGroupRequest createProfilingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfilingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfilingGroupRequest> request = null;
        Response<CreateProfilingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfilingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfilingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfilingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfilingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfilingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a profiling group.
     * </p>
     * 
     * @param deleteProfilingGroupRequest
     *        The structure representing the deleteProfilingGroupRequest.
     * @return Result of the DeleteProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.DeleteProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DeleteProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProfilingGroupResult deleteProfilingGroup(DeleteProfilingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfilingGroup(request);
    }

    @SdkInternalApi
    final DeleteProfilingGroupResult executeDeleteProfilingGroup(DeleteProfilingGroupRequest deleteProfilingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfilingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfilingGroupRequest> request = null;
        Response<DeleteProfilingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfilingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfilingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfilingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfilingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfilingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a profiling group.
     * </p>
     * 
     * @param describeProfilingGroupRequest
     *        The structure representing the describeProfilingGroupRequest.
     * @return Result of the DescribeProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.DescribeProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DescribeProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProfilingGroupResult describeProfilingGroup(DescribeProfilingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProfilingGroup(request);
    }

    @SdkInternalApi
    final DescribeProfilingGroupResult executeDescribeProfilingGroup(DescribeProfilingGroupRequest describeProfilingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProfilingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProfilingGroupRequest> request = null;
        Response<DescribeProfilingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProfilingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProfilingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProfilingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProfilingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProfilingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the aggregated profile of a profiling group for the specified time range. If the requested time range does
     * not align with the available aggregated profiles, it is expanded to attain alignment. If aggregated profiles are
     * available only for part of the period requested, the profile is returned from the earliest available to the
     * latest within the requested time range.
     * </p>
     * <p>
     * For example, if the requested time range is from 00:00 to 00:20 and the available profiles are from 00:15 to
     * 00:25, the returned profile will be from 00:15 to 00:20.
     * </p>
     * <p>
     * You must specify exactly two of the following parameters: <code>startTime</code>, <code>period</code>, and
     * <code>endTime</code>.
     * </p>
     * 
     * @param getProfileRequest
     *        The structure representing the getProfileRequest.
     * @return Result of the GetProfile operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetProfileResult getProfile(GetProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfile(request);
    }

    @SdkInternalApi
    final GetProfileResult executeGetProfile(GetProfileRequest getProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileRequest> request = null;
        Response<GetProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(false), new GetProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the start times of the available aggregated profiles of a profiling group for an aggregation period within
     * the specified time range.
     * </p>
     * 
     * @param listProfileTimesRequest
     *        The structure representing the listProfileTimesRequest.
     * @return Result of the ListProfileTimes operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.ListProfileTimes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfileTimesResult listProfileTimes(ListProfileTimesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileTimes(request);
    }

    @SdkInternalApi
    final ListProfileTimesResult executeListProfileTimes(ListProfileTimesRequest listProfileTimesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileTimesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileTimesRequest> request = null;
        Response<ListProfileTimesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileTimesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfileTimesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileTimes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileTimesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfileTimesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists profiling groups.
     * </p>
     * 
     * @param listProfilingGroupsRequest
     *        The structure representing the listProfilingGroupsRequest.
     * @return Result of the ListProfilingGroups operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.ListProfilingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfilingGroupsResult listProfilingGroups(ListProfilingGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListProfilingGroups(request);
    }

    @SdkInternalApi
    final ListProfilingGroupsResult executeListProfilingGroups(ListProfilingGroupsRequest listProfilingGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfilingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfilingGroupsRequest> request = null;
        Response<ListProfilingGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfilingGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfilingGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfilingGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfilingGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfilingGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p/>
     * 
     * @param postAgentProfileRequest
     *        The structure representing the postAgentProfileRequest.
     * @return Result of the PostAgentProfile operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.PostAgentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PostAgentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostAgentProfileResult postAgentProfile(PostAgentProfileRequest request) {
        request = beforeClientExecution(request);
        return executePostAgentProfile(request);
    }

    @SdkInternalApi
    final PostAgentProfileResult executePostAgentProfile(PostAgentProfileRequest postAgentProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(postAgentProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostAgentProfileRequest> request = null;
        Response<PostAgentProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostAgentProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(postAgentProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PostAgentProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PostAgentProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostAgentProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a profiling group.
     * </p>
     * 
     * @param updateProfilingGroupRequest
     *        The structure representing the updateProfilingGroupRequest.
     * @return Result of the UpdateProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.UpdateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UpdateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProfilingGroupResult updateProfilingGroup(UpdateProfilingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfilingGroup(request);
    }

    @SdkInternalApi
    final UpdateProfilingGroupResult executeUpdateProfilingGroup(UpdateProfilingGroupRequest updateProfilingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfilingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfilingGroupRequest> request = null;
        Response<UpdateProfilingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfilingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfilingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuruProfiler");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfilingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfilingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfilingGroupResultJsonUnmarshaller());
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
