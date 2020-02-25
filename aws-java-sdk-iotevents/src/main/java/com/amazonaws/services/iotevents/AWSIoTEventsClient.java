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
package com.amazonaws.services.iotevents;

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

import com.amazonaws.services.iotevents.AWSIoTEventsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotevents.model.*;
import com.amazonaws.services.iotevents.model.transform.*;

/**
 * Client for accessing AWS IoT Events. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. You can use AWS IoT Events API commands to create, read, update, and delete inputs and
 * detector models, and to list their versions.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTEventsClient extends AmazonWebServiceClient implements AWSIoTEvents {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTEvents.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotevents";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotevents.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotevents.model.AWSIoTEventsException.class));

    public static AWSIoTEventsClientBuilder builder() {
        return AWSIoTEventsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Events using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Events using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("iotevents.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotevents/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotevents/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a detector model.
     * </p>
     * 
     * @param createDetectorModelRequest
     * @return Result of the CreateDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.CreateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDetectorModelResult createDetectorModel(CreateDetectorModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDetectorModel(request);
    }

    @SdkInternalApi
    final CreateDetectorModelResult executeCreateDetectorModel(CreateDetectorModelRequest createDetectorModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createDetectorModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDetectorModelRequest> request = null;
        Response<CreateDetectorModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDetectorModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDetectorModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDetectorModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDetectorModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDetectorModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an input.
     * </p>
     * 
     * @param createInputRequest
     * @return Result of the CreateInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIoTEvents.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInputResult createInput(CreateInputRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInput(request);
    }

    @SdkInternalApi
    final CreateInputResult executeCreateInput(CreateInputRequest createInputRequest) {

        ExecutionContext executionContext = createExecutionContext(createInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputRequest> request = null;
        Response<CreateInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a detector model. Any active instances of the detector model are also deleted.
     * </p>
     * 
     * @param deleteDetectorModelRequest
     * @return Result of the DeleteDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.DeleteDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDetectorModelResult deleteDetectorModel(DeleteDetectorModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDetectorModel(request);
    }

    @SdkInternalApi
    final DeleteDetectorModelResult executeDeleteDetectorModel(DeleteDetectorModelRequest deleteDetectorModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDetectorModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDetectorModelRequest> request = null;
        Response<DeleteDetectorModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDetectorModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDetectorModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDetectorModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDetectorModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDetectorModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an input.
     * </p>
     * 
     * @param deleteInputRequest
     * @return Result of the DeleteInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @sample AWSIoTEvents.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInputResult deleteInput(DeleteInputRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInput(request);
    }

    @SdkInternalApi
    final DeleteInputResult executeDeleteInput(DeleteInputRequest deleteInputRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputRequest> request = null;
        Response<DeleteInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a detector model. If the <code>version</code> parameter is not specified, information about the latest
     * version is returned.
     * </p>
     * 
     * @param describeDetectorModelRequest
     * @return Result of the DescribeDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.DescribeDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDetectorModelResult describeDetectorModel(DescribeDetectorModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDetectorModel(request);
    }

    @SdkInternalApi
    final DescribeDetectorModelResult executeDescribeDetectorModel(DescribeDetectorModelRequest describeDetectorModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDetectorModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDetectorModelRequest> request = null;
        Response<DescribeDetectorModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDetectorModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDetectorModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDetectorModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDetectorModelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDetectorModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an input.
     * </p>
     * 
     * @param describeInputRequest
     * @return Result of the DescribeInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInputResult describeInput(DescribeInputRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInput(request);
    }

    @SdkInternalApi
    final DescribeInputResult executeDescribeInput(DescribeInputRequest describeInputRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputRequest> request = null;
        Response<DescribeInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInputResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Events logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return Result of the DescribeLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported.
     * @sample AWSIoTEvents.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoggingOptionsResult describeLoggingOptions(DescribeLoggingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoggingOptions(request);
    }

    @SdkInternalApi
    final DescribeLoggingOptionsResult executeDescribeLoggingOptions(DescribeLoggingOptionsRequest describeLoggingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingOptionsRequest> request = null;
        Response<DescribeLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoggingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoggingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLoggingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the versions of a detector model. Only the metadata associated with each detector model version is
     * returned.
     * </p>
     * 
     * @param listDetectorModelVersionsRequest
     * @return Result of the ListDetectorModelVersions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.ListDetectorModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDetectorModelVersionsResult listDetectorModelVersions(ListDetectorModelVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDetectorModelVersions(request);
    }

    @SdkInternalApi
    final ListDetectorModelVersionsResult executeListDetectorModelVersions(ListDetectorModelVersionsRequest listDetectorModelVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDetectorModelVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDetectorModelVersionsRequest> request = null;
        Response<ListDetectorModelVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDetectorModelVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDetectorModelVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDetectorModelVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDetectorModelVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDetectorModelVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
     * </p>
     * 
     * @param listDetectorModelsRequest
     * @return Result of the ListDetectorModels operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.ListDetectorModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDetectorModelsResult listDetectorModels(ListDetectorModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListDetectorModels(request);
    }

    @SdkInternalApi
    final ListDetectorModelsResult executeListDetectorModels(ListDetectorModelsRequest listDetectorModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDetectorModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDetectorModelsRequest> request = null;
        Response<ListDetectorModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDetectorModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDetectorModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDetectorModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDetectorModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDetectorModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the inputs you have created.
     * </p>
     * 
     * @param listInputsRequest
     * @return Result of the ListInputs operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInputsResult listInputs(ListInputsRequest request) {
        request = beforeClientExecution(request);
        return executeListInputs(request);
    }

    @SdkInternalApi
    final ListInputsResult executeListInputs(ListInputsRequest listInputsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputsRequest> request = null;
        Response<ListInputsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInputsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInputs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInputsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInputsResultJsonUnmarshaller());
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
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AWSIoTEvents.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
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
     * Sets or updates the AWS IoT Events logging options.
     * </p>
     * <p>
     * If you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the change to
     * take effect. If you change the policy attached to the role you specified in the <code>roleArn</code> field (for
     * example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @sample AWSIoTEvents.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/PutLoggingOptions" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
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
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AWSIoTEvents.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
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
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AWSIoTEvents.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
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
     * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
     * as new inputs arrive.
     * </p>
     * 
     * @param updateDetectorModelRequest
     * @return Result of the UpdateDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.UpdateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDetectorModelResult updateDetectorModel(UpdateDetectorModelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDetectorModel(request);
    }

    @SdkInternalApi
    final UpdateDetectorModelResult executeUpdateDetectorModel(UpdateDetectorModelRequest updateDetectorModelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDetectorModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorModelRequest> request = null;
        Response<UpdateDetectorModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDetectorModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDetectorModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDetectorModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDetectorModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an input.
     * </p>
     * 
     * @param updateInputRequest
     * @return Result of the UpdateInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @sample AWSIoTEvents.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInputResult updateInput(UpdateInputRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInput(request);
    }

    @SdkInternalApi
    final UpdateInputResult executeUpdateInput(UpdateInputRequest updateInputRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputRequest> request = null;
        Response<UpdateInputResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInputRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInput");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInputResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInputResultJsonUnmarshaller());
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
