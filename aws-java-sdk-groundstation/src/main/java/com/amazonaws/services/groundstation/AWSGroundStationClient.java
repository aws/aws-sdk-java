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
package com.amazonaws.services.groundstation;

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

import com.amazonaws.services.groundstation.AWSGroundStationClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.services.groundstation.model.transform.*;

/**
 * Client for accessing AWS Ground Station. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
 * control satellite communications, downlink and process satellite data, and scale your satellite operations
 * efficiently and cost-effectively without having to build or manage your own ground station infrastructure.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGroundStationClient extends AmazonWebServiceClient implements AWSGroundStation {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSGroundStation.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "groundstation";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.groundstation.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.groundstation.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.groundstation.model.transform.DependencyExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.groundstation.model.AWSGroundStationException.class));

    public static AWSGroundStationClientBuilder builder() {
        return AWSGroundStationClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Ground Station using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGroundStationClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Ground Station using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGroundStationClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("groundstation.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/groundstation/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/groundstation/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a contact with a specified contact ID.
     * </p>
     * 
     * @param cancelContactRequest
     * @return Result of the CancelContact operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CancelContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CancelContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelContactResult cancelContact(CancelContactRequest request) {
        request = beforeClientExecution(request);
        return executeCancelContact(request);
    }

    @SdkInternalApi
    final CancelContactResult executeCancelContact(CancelContactRequest cancelContactRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelContactRequest> request = null;
        Response<CancelContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>Config</code> with the specified <code>configData</code> parameters.
     * </p>
     * <p>
     * Only one type of <code>configData</code> can be specified.
     * </p>
     * 
     * @param createConfigRequest
     * @return Result of the CreateConfig operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CreateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateConfigResult createConfig(CreateConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfig(request);
    }

    @SdkInternalApi
    final CreateConfigResult executeCreateConfig(CreateConfigRequest createConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigRequest> request = null;
        Response<CreateConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>DataflowEndpoint</code> group containing the specified list of <code>DataflowEndpoint</code>
     * objects.
     * </p>
     * <p>
     * The <code>name</code> field in each endpoint is used in your mission profile <code>DataflowEndpointConfig</code>
     * to specify which endpoints to use during a contact.
     * </p>
     * <p>
     * When a contact uses multiple <code>DataflowEndpointConfig</code> objects, each <code>Config</code> must match a
     * <code>DataflowEndpoint</code> in the same group.
     * </p>
     * 
     * @param createDataflowEndpointGroupRequest
     * @return Result of the CreateDataflowEndpointGroup operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CreateDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDataflowEndpointGroupResult createDataflowEndpointGroup(CreateDataflowEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataflowEndpointGroup(request);
    }

    @SdkInternalApi
    final CreateDataflowEndpointGroupResult executeCreateDataflowEndpointGroup(CreateDataflowEndpointGroupRequest createDataflowEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataflowEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataflowEndpointGroupRequest> request = null;
        Response<CreateDataflowEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataflowEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataflowEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataflowEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataflowEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataflowEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a mission profile.
     * </p>
     * <p>
     * <code>dataflowEdges</code> is a list of lists of strings. Each lower level list of strings has two elements: a
     * <i>from ARN</i> and a <i>to ARN</i>.
     * </p>
     * 
     * @param createMissionProfileRequest
     * @return Result of the CreateMissionProfile operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CreateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMissionProfileResult createMissionProfile(CreateMissionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMissionProfile(request);
    }

    @SdkInternalApi
    final CreateMissionProfileResult executeCreateMissionProfile(CreateMissionProfileRequest createMissionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createMissionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMissionProfileRequest> request = null;
        Response<CreateMissionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMissionProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMissionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMissionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMissionProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMissionProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <code>Config</code>.
     * </p>
     * 
     * @param deleteConfigRequest
     * @return Result of the DeleteConfig operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DeleteConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteConfigResult deleteConfig(DeleteConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfig(request);
    }

    @SdkInternalApi
    final DeleteConfigResult executeDeleteConfig(DeleteConfigRequest deleteConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigRequest> request = null;
        Response<DeleteConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dataflow endpoint group.
     * </p>
     * 
     * @param deleteDataflowEndpointGroupRequest
     * @return Result of the DeleteDataflowEndpointGroup operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DeleteDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDataflowEndpointGroupResult deleteDataflowEndpointGroup(DeleteDataflowEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataflowEndpointGroup(request);
    }

    @SdkInternalApi
    final DeleteDataflowEndpointGroupResult executeDeleteDataflowEndpointGroup(DeleteDataflowEndpointGroupRequest deleteDataflowEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataflowEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataflowEndpointGroupRequest> request = null;
        Response<DeleteDataflowEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataflowEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDataflowEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataflowEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataflowEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDataflowEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a mission profile.
     * </p>
     * 
     * @param deleteMissionProfileRequest
     * @return Result of the DeleteMissionProfile operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DeleteMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMissionProfileResult deleteMissionProfile(DeleteMissionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMissionProfile(request);
    }

    @SdkInternalApi
    final DeleteMissionProfileResult executeDeleteMissionProfile(DeleteMissionProfileRequest deleteMissionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMissionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMissionProfileRequest> request = null;
        Response<DeleteMissionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMissionProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMissionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMissionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMissionProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMissionProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing contact.
     * </p>
     * 
     * @param describeContactRequest
     * @return Result of the DescribeContact operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DescribeContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeContactResult describeContact(DescribeContactRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContact(request);
    }

    @SdkInternalApi
    final DescribeContactResult executeDescribeContact(DescribeContactRequest describeContactRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContactRequest> request = null;
        Response<DescribeContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns <code>Config</code> information.
     * </p>
     * <p>
     * Only one <code>Config</code> response can be returned.
     * </p>
     * 
     * @param getConfigRequest
     * @return Result of the GetConfig operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetConfigResult getConfig(GetConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfig(request);
    }

    @SdkInternalApi
    final GetConfigResult executeGetConfig(GetConfigRequest getConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigRequest> request = null;
        Response<GetConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the dataflow endpoint group.
     * </p>
     * 
     * @param getDataflowEndpointGroupRequest
     * @return Result of the GetDataflowEndpointGroup operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDataflowEndpointGroupResult getDataflowEndpointGroup(GetDataflowEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataflowEndpointGroup(request);
    }

    @SdkInternalApi
    final GetDataflowEndpointGroupResult executeGetDataflowEndpointGroup(GetDataflowEndpointGroupRequest getDataflowEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataflowEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataflowEndpointGroupRequest> request = null;
        Response<GetDataflowEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataflowEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDataflowEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataflowEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataflowEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDataflowEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of minutes used by account.
     * </p>
     * 
     * @param getMinuteUsageRequest
     * @return Result of the GetMinuteUsage operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetMinuteUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMinuteUsage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMinuteUsageResult getMinuteUsage(GetMinuteUsageRequest request) {
        request = beforeClientExecution(request);
        return executeGetMinuteUsage(request);
    }

    @SdkInternalApi
    final GetMinuteUsageResult executeGetMinuteUsage(GetMinuteUsageRequest getMinuteUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(getMinuteUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMinuteUsageRequest> request = null;
        Response<GetMinuteUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMinuteUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMinuteUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMinuteUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMinuteUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMinuteUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a mission profile.
     * </p>
     * 
     * @param getMissionProfileRequest
     * @return Result of the GetMissionProfile operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMissionProfileResult getMissionProfile(GetMissionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetMissionProfile(request);
    }

    @SdkInternalApi
    final GetMissionProfileResult executeGetMissionProfile(GetMissionProfileRequest getMissionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getMissionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMissionProfileRequest> request = null;
        Response<GetMissionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMissionProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMissionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMissionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMissionProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMissionProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a satellite.
     * </p>
     * 
     * @param getSatelliteRequest
     * @return Result of the GetSatellite operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetSatellite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetSatellite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSatelliteResult getSatellite(GetSatelliteRequest request) {
        request = beforeClientExecution(request);
        return executeGetSatellite(request);
    }

    @SdkInternalApi
    final GetSatelliteResult executeGetSatellite(GetSatelliteRequest getSatelliteRequest) {

        ExecutionContext executionContext = createExecutionContext(getSatelliteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSatelliteRequest> request = null;
        Response<GetSatelliteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSatelliteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSatelliteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSatellite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSatelliteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSatelliteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>Config</code> objects.
     * </p>
     * 
     * @param listConfigsRequest
     * @return Result of the ListConfigs operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListConfigs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListConfigsResult listConfigs(ListConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigs(request);
    }

    @SdkInternalApi
    final ListConfigsResult executeListConfigs(ListConfigsRequest listConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigsRequest> request = null;
        Response<ListConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of contacts.
     * </p>
     * <p>
     * If <code>statusList</code> contains AVAILABLE, the request must include <code>groundstation</code>,
     * <code>missionprofileArn</code>, and <code>satelliteArn</code>.
     * </p>
     * 
     * @param listContactsRequest
     * @return Result of the ListContacts operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListContactsResult listContacts(ListContactsRequest request) {
        request = beforeClientExecution(request);
        return executeListContacts(request);
    }

    @SdkInternalApi
    final ListContactsResult executeListContacts(ListContactsRequest listContactsRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactsRequest> request = null;
        Response<ListContactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListContactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DataflowEndpoint</code> groups.
     * </p>
     * 
     * @param listDataflowEndpointGroupsRequest
     * @return Result of the ListDataflowEndpointGroups operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListDataflowEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListDataflowEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDataflowEndpointGroupsResult listDataflowEndpointGroups(ListDataflowEndpointGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataflowEndpointGroups(request);
    }

    @SdkInternalApi
    final ListDataflowEndpointGroupsResult executeListDataflowEndpointGroups(ListDataflowEndpointGroupsRequest listDataflowEndpointGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataflowEndpointGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataflowEndpointGroupsRequest> request = null;
        Response<ListDataflowEndpointGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataflowEndpointGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDataflowEndpointGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataflowEndpointGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataflowEndpointGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDataflowEndpointGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of ground stations.
     * </p>
     * 
     * @param listGroundStationsRequest
     * @return Result of the ListGroundStations operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListGroundStations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListGroundStations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGroundStationsResult listGroundStations(ListGroundStationsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroundStations(request);
    }

    @SdkInternalApi
    final ListGroundStationsResult executeListGroundStations(ListGroundStationsRequest listGroundStationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroundStationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroundStationsRequest> request = null;
        Response<ListGroundStationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroundStationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroundStationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroundStations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroundStationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroundStationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of mission profiles.
     * </p>
     * 
     * @param listMissionProfilesRequest
     * @return Result of the ListMissionProfiles operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListMissionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListMissionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMissionProfilesResult listMissionProfiles(ListMissionProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListMissionProfiles(request);
    }

    @SdkInternalApi
    final ListMissionProfilesResult executeListMissionProfiles(ListMissionProfilesRequest listMissionProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMissionProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMissionProfilesRequest> request = null;
        Response<ListMissionProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMissionProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMissionProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMissionProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMissionProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMissionProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of satellites.
     * </p>
     * 
     * @param listSatellitesRequest
     * @return Result of the ListSatellites operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListSatellites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListSatellites" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSatellitesResult listSatellites(ListSatellitesRequest request) {
        request = beforeClientExecution(request);
        return executeListSatellites(request);
    }

    @SdkInternalApi
    final ListSatellitesResult executeListSatellites(ListSatellitesRequest listSatellitesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSatellitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSatellitesRequest> request = null;
        Response<ListSatellitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSatellitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSatellitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSatellites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSatellitesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSatellitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags or a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
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
     * Reserves a contact using specified parameters.
     * </p>
     * 
     * @param reserveContactRequest
     * @return Result of the ReserveContact operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ReserveContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ReserveContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ReserveContactResult reserveContact(ReserveContactRequest request) {
        request = beforeClientExecution(request);
        return executeReserveContact(request);
    }

    @SdkInternalApi
    final ReserveContactResult executeReserveContact(ReserveContactRequest reserveContactRequest) {

        ExecutionContext executionContext = createExecutionContext(reserveContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReserveContactRequest> request = null;
        Response<ReserveContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReserveContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(reserveContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReserveContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReserveContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReserveContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
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
     * Deassigns a resource tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
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
     * Updates the <code>Config</code> used when scheduling contacts.
     * </p>
     * <p>
     * Updating a <code>Config</code> will not update the execution parameters for existing future contacts scheduled
     * with this <code>Config</code>.
     * </p>
     * 
     * @param updateConfigRequest
     * @return Result of the UpdateConfig operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.UpdateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateConfigResult updateConfig(UpdateConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfig(request);
    }

    @SdkInternalApi
    final UpdateConfigResult executeUpdateConfig(UpdateConfigRequest updateConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigRequest> request = null;
        Response<UpdateConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a mission profile.
     * </p>
     * <p>
     * Updating a mission profile will not update the execution parameters for existing future contacts.
     * </p>
     * 
     * @param updateMissionProfileRequest
     * @return Result of the UpdateMissionProfile operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.UpdateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMissionProfileResult updateMissionProfile(UpdateMissionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMissionProfile(request);
    }

    @SdkInternalApi
    final UpdateMissionProfileResult executeUpdateMissionProfile(UpdateMissionProfileRequest updateMissionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMissionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMissionProfileRequest> request = null;
        Response<UpdateMissionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMissionProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMissionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "GroundStation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMissionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMissionProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMissionProfileResultJsonUnmarshaller());
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
