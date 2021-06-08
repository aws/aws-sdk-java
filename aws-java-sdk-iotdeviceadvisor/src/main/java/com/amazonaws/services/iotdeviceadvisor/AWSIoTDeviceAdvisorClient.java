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
package com.amazonaws.services.iotdeviceadvisor;

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

import com.amazonaws.services.iotdeviceadvisor.AWSIoTDeviceAdvisorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotdeviceadvisor.model.*;
import com.amazonaws.services.iotdeviceadvisor.model.transform.*;

/**
 * Client for accessing AWSIoTDeviceAdvisor. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IoT Core Device Advisor is a cloud-based, fully managed test capability for validating IoT devices during device
 * software development. Device Advisor provides pre-built tests that you can use to validate IoT devices for reliable
 * and secure connectivity with AWS IoT Core before deploying devices to production. By using Device Advisor, you can
 * confirm that your devices can connect to AWS IoT Core, follow security best practices and, if applicable, receive
 * software updates from IoT Device Management. You can also download signed qualification reports to submit to the AWS
 * Partner Network to get your device qualified for the AWS Partner Device Catalog without the need to send your device
 * in and wait for it to be tested.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTDeviceAdvisorClient extends AmazonWebServiceClient implements AWSIoTDeviceAdvisor {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTDeviceAdvisor.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotdeviceadvisor";

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
                                    com.amazonaws.services.iotdeviceadvisor.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdeviceadvisor.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdeviceadvisor.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iotdeviceadvisor.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotdeviceadvisor.model.AWSIoTDeviceAdvisorException.class));

    public static AWSIoTDeviceAdvisorClientBuilder builder() {
        return AWSIoTDeviceAdvisorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTDeviceAdvisor using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTDeviceAdvisorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTDeviceAdvisor using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTDeviceAdvisorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("api.iotdeviceadvisor.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotdeviceadvisor/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotdeviceadvisor/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a Device Advisor test suite.
     * </p>
     * 
     * @param createSuiteDefinitionRequest
     * @return Result of the CreateSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.CreateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/CreateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSuiteDefinitionResult createSuiteDefinition(CreateSuiteDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSuiteDefinition(request);
    }

    @SdkInternalApi
    final CreateSuiteDefinitionResult executeCreateSuiteDefinition(CreateSuiteDefinitionRequest createSuiteDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSuiteDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSuiteDefinitionRequest> request = null;
        Response<CreateSuiteDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSuiteDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSuiteDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSuiteDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSuiteDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateSuiteDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Device Advisor test suite.
     * </p>
     * 
     * @param deleteSuiteDefinitionRequest
     * @return Result of the DeleteSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.DeleteSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/DeleteSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSuiteDefinitionResult deleteSuiteDefinition(DeleteSuiteDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSuiteDefinition(request);
    }

    @SdkInternalApi
    final DeleteSuiteDefinitionResult executeDeleteSuiteDefinition(DeleteSuiteDefinitionRequest deleteSuiteDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSuiteDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSuiteDefinitionRequest> request = null;
        Response<DeleteSuiteDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSuiteDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSuiteDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSuiteDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSuiteDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteSuiteDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Device Advisor test suite.
     * </p>
     * 
     * @param getSuiteDefinitionRequest
     * @return Result of the GetSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.GetSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSuiteDefinitionResult getSuiteDefinition(GetSuiteDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSuiteDefinition(request);
    }

    @SdkInternalApi
    final GetSuiteDefinitionResult executeGetSuiteDefinition(GetSuiteDefinitionRequest getSuiteDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSuiteDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSuiteDefinitionRequest> request = null;
        Response<GetSuiteDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSuiteDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSuiteDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSuiteDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSuiteDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSuiteDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Device Advisor test suite run.
     * </p>
     * 
     * @param getSuiteRunRequest
     * @return Result of the GetSuiteRun operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.GetSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSuiteRunResult getSuiteRun(GetSuiteRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetSuiteRun(request);
    }

    @SdkInternalApi
    final GetSuiteRunResult executeGetSuiteRun(GetSuiteRunRequest getSuiteRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getSuiteRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSuiteRunRequest> request = null;
        Response<GetSuiteRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSuiteRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSuiteRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSuiteRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSuiteRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSuiteRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a report download link for a successful Device Advisor qualifying test suite run.
     * </p>
     * 
     * @param getSuiteRunReportRequest
     * @return Result of the GetSuiteRunReport operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.GetSuiteRunReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRunReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSuiteRunReportResult getSuiteRunReport(GetSuiteRunReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetSuiteRunReport(request);
    }

    @SdkInternalApi
    final GetSuiteRunReportResult executeGetSuiteRunReport(GetSuiteRunReportRequest getSuiteRunReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getSuiteRunReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSuiteRunReportRequest> request = null;
        Response<GetSuiteRunReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSuiteRunReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSuiteRunReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSuiteRunReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSuiteRunReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSuiteRunReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Device Advisor test suites you have created.
     * </p>
     * 
     * @param listSuiteDefinitionsRequest
     * @return Result of the ListSuiteDefinitions operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.ListSuiteDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSuiteDefinitionsResult listSuiteDefinitions(ListSuiteDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSuiteDefinitions(request);
    }

    @SdkInternalApi
    final ListSuiteDefinitionsResult executeListSuiteDefinitions(ListSuiteDefinitionsRequest listSuiteDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSuiteDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSuiteDefinitionsRequest> request = null;
        Response<ListSuiteDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSuiteDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSuiteDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSuiteDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSuiteDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSuiteDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite. You can list all runs of the test suite, or the runs
     * of a specific version of the test suite.
     * </p>
     * 
     * @param listSuiteRunsRequest
     * @return Result of the ListSuiteRuns operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.ListSuiteRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteRuns" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSuiteRunsResult listSuiteRuns(ListSuiteRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListSuiteRuns(request);
    }

    @SdkInternalApi
    final ListSuiteRunsResult executeListSuiteRuns(ListSuiteRunsRequest listSuiteRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSuiteRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSuiteRunsRequest> request = null;
        Response<ListSuiteRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSuiteRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSuiteRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSuiteRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSuiteRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSuiteRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags attached to an IoT Device Advisor resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
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
     * Starts a Device Advisor test suite run.
     * </p>
     * 
     * @param startSuiteRunRequest
     * @return Result of the StartSuiteRun operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ConflictException
     *         Sends Conflict Exception.
     * @sample AWSIoTDeviceAdvisor.StartSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StartSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartSuiteRunResult startSuiteRun(StartSuiteRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartSuiteRun(request);
    }

    @SdkInternalApi
    final StartSuiteRunResult executeStartSuiteRun(StartSuiteRunRequest startSuiteRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startSuiteRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSuiteRunRequest> request = null;
        Response<StartSuiteRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSuiteRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSuiteRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSuiteRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSuiteRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSuiteRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a Device Advisor test suite run that is currently running.
     * </p>
     * 
     * @param stopSuiteRunRequest
     * @return Result of the StopSuiteRun operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.StopSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StopSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopSuiteRunResult stopSuiteRun(StopSuiteRunRequest request) {
        request = beforeClientExecution(request);
        return executeStopSuiteRun(request);
    }

    @SdkInternalApi
    final StopSuiteRunResult executeStopSuiteRun(StopSuiteRunRequest stopSuiteRunRequest) {

        ExecutionContext executionContext = createExecutionContext(stopSuiteRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopSuiteRunRequest> request = null;
        Response<StopSuiteRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopSuiteRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopSuiteRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopSuiteRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopSuiteRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopSuiteRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds to and modifies existing tags of an IoT Device Advisor resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
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
     * Removes tags from an IoT Device Advisor resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
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
     * Updates a Device Advisor test suite.
     * </p>
     * 
     * @param updateSuiteDefinitionRequest
     * @return Result of the UpdateSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.UpdateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UpdateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSuiteDefinitionResult updateSuiteDefinition(UpdateSuiteDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSuiteDefinition(request);
    }

    @SdkInternalApi
    final UpdateSuiteDefinitionResult executeUpdateSuiteDefinition(UpdateSuiteDefinitionRequest updateSuiteDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSuiteDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSuiteDefinitionRequest> request = null;
        Response<UpdateSuiteDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSuiteDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSuiteDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IotDeviceAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSuiteDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSuiteDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateSuiteDefinitionResultJsonUnmarshaller());
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
