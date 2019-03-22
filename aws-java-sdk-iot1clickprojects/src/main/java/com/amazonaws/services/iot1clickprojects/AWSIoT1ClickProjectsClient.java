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
package com.amazonaws.services.iot1clickprojects;

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

import com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iot1clickprojects.model.*;
import com.amazonaws.services.iot1clickprojects.model.transform.*;

/**
 * Client for accessing AWS IoT 1-Click Projects. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The AWS IoT 1-Click Projects API Reference
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoT1ClickProjectsClient extends AmazonWebServiceClient implements AWSIoT1ClickProjects {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoT1ClickProjects.class);

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
                                    com.amazonaws.services.iot1clickprojects.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.iot1clickprojects.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.iot1clickprojects.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withModeledClass(
                                    com.amazonaws.services.iot1clickprojects.model.ResourceConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.iot1clickprojects.model.TooManyRequestsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iot1clickprojects.model.AWSIoT1ClickProjectsException.class));

    public static AWSIoT1ClickProjectsClientBuilder builder() {
        return AWSIoT1ClickProjectsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT 1-Click Projects using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoT1ClickProjectsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT 1-Click Projects using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoT1ClickProjectsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("projects.iot1click.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iot1clickprojects/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iot1clickprojects/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a physical device with a placement.
     * </p>
     * 
     * @param associateDeviceWithPlacementRequest
     * @return Result of the AssociateDeviceWithPlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceConflictException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.AssociateDeviceWithPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/AssociateDeviceWithPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDeviceWithPlacementResult associateDeviceWithPlacement(AssociateDeviceWithPlacementRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDeviceWithPlacement(request);
    }

    @SdkInternalApi
    final AssociateDeviceWithPlacementResult executeAssociateDeviceWithPlacement(AssociateDeviceWithPlacementRequest associateDeviceWithPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDeviceWithPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDeviceWithPlacementRequest> request = null;
        Response<AssociateDeviceWithPlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDeviceWithPlacementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateDeviceWithPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDeviceWithPlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDeviceWithPlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateDeviceWithPlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty placement.
     * </p>
     * 
     * @param createPlacementRequest
     * @return Result of the CreatePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceConflictException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.CreatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePlacementResult createPlacement(CreatePlacementRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlacement(request);
    }

    @SdkInternalApi
    final CreatePlacementResult executeCreatePlacement(CreatePlacementRequest createPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlacementRequest> request = null;
        Response<CreatePlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlacementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
     * placement template defined in the project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceConflictException
     * @sample AWSIoT1ClickProjects.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreateProject"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a placement. To delete a placement, it must not have any devices associated with it.
     * </p>
     * <note>
     * <p>
     * When you delete a placement, all associated data becomes irretrievable.
     * </p>
     * </note>
     * 
     * @param deletePlacementRequest
     * @return Result of the DeletePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.DeletePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeletePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePlacementResult deletePlacement(DeletePlacementRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlacement(request);
    }

    @SdkInternalApi
    final DeletePlacementResult executeDeletePlacement(DeletePlacementRequest deletePlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlacementRequest> request = null;
        Response<DeletePlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlacementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a project. To delete a project, it must not have any placements associated with it.
     * </p>
     * <note>
     * <p>
     * When you delete a project, all associated data becomes irretrievable.
     * </p>
     * </note>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeleteProject"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a placement in a project.
     * </p>
     * 
     * @param describePlacementRequest
     * @return Result of the DescribePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.DescribePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePlacementResult describePlacement(DescribePlacementRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePlacement(request);
    }

    @SdkInternalApi
    final DescribePlacementResult executeDescribePlacement(DescribePlacementRequest describePlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(describePlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlacementRequest> request = null;
        Response<DescribePlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlacementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an object describing a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribeProject"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProjectResult describeProject(DescribeProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProject(request);
    }

    @SdkInternalApi
    final DescribeProjectResult executeDescribeProject(DescribeProjectRequest describeProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectRequest> request = null;
        Response<DescribeProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a physical device from a placement.
     * </p>
     * 
     * @param disassociateDeviceFromPlacementRequest
     * @return Result of the DisassociateDeviceFromPlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.DisassociateDeviceFromPlacement
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DisassociateDeviceFromPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDeviceFromPlacementResult disassociateDeviceFromPlacement(DisassociateDeviceFromPlacementRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDeviceFromPlacement(request);
    }

    @SdkInternalApi
    final DisassociateDeviceFromPlacementResult executeDisassociateDeviceFromPlacement(
            DisassociateDeviceFromPlacementRequest disassociateDeviceFromPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDeviceFromPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDeviceFromPlacementRequest> request = null;
        Response<DisassociateDeviceFromPlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDeviceFromPlacementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDeviceFromPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDeviceFromPlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDeviceFromPlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDeviceFromPlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an object enumerating the devices in a placement.
     * </p>
     * 
     * @param getDevicesInPlacementRequest
     * @return Result of the GetDevicesInPlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.GetDevicesInPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/GetDevicesInPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDevicesInPlacementResult getDevicesInPlacement(GetDevicesInPlacementRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevicesInPlacement(request);
    }

    @SdkInternalApi
    final GetDevicesInPlacementResult executeGetDevicesInPlacement(GetDevicesInPlacementRequest getDevicesInPlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicesInPlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicesInPlacementRequest> request = null;
        Response<GetDevicesInPlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicesInPlacementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevicesInPlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevicesInPlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicesInPlacementResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetDevicesInPlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the placement(s) of a project.
     * </p>
     * 
     * @param listPlacementsRequest
     * @return Result of the ListPlacements operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.ListPlacements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListPlacements"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPlacementsResult listPlacements(ListPlacementsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlacements(request);
    }

    @SdkInternalApi
    final ListPlacementsResult executeListPlacements(ListPlacementsRequest listPlacementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPlacementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlacementsRequest> request = null;
        Response<ListPlacementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlacementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPlacementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlacements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPlacementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPlacementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @sample AWSIoT1ClickProjects.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListProjects"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
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
     * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
     * resource. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
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
     * Removes one or more tags (metadata key/value pairs) from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
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
     * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
     * </p>
     * 
     * @param updatePlacementRequest
     * @return Result of the UpdatePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.UpdatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePlacementResult updatePlacement(UpdatePlacementRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePlacement(request);
    }

    @SdkInternalApi
    final UpdatePlacementResult executeUpdatePlacement(UpdatePlacementRequest updatePlacementRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePlacementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePlacementRequest> request = null;
        Response<UpdatePlacementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePlacementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePlacementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePlacement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePlacementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePlacementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a project associated with your AWS account and region. With the exception of device template names, you
     * can pass just the values that need to be updated because the update request will change only the values that are
     * provided. To clear a value, pass the empty string (i.e., <code>""</code>).
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdateProject"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT 1Click Projects");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
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
