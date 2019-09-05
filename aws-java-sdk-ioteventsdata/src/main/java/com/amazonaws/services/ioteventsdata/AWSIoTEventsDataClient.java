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
package com.amazonaws.services.ioteventsdata;

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

import com.amazonaws.services.ioteventsdata.AWSIoTEventsDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ioteventsdata.model.*;
import com.amazonaws.services.ioteventsdata.model.transform.*;

/**
 * Client for accessing AWS IoT Events Data. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. AWS IoT Events Data API commands enable you to send inputs to detectors, list detectors, and
 * view or update a detector's status.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTEventsDataClient extends AmazonWebServiceClient implements AWSIoTEventsData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTEventsData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ioteventsdata";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.InternalFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ioteventsdata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ioteventsdata.model.AWSIoTEventsDataException.class));

    public static AWSIoTEventsDataClientBuilder builder() {
        return AWSIoTEventsDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Events Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Events Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("data.iotevents.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ioteventsdata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ioteventsdata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
     * specify (<code>"inputName"</code>) and ingested into any detectors that monitor that input. If multiple messages
     * are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
     * messages one at a time and wait for a successful response.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return Result of the BatchPutMessage operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occured.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchPutMessageResult batchPutMessage(BatchPutMessageRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutMessage(request);
    }

    @SdkInternalApi
    final BatchPutMessageResult executeBatchPutMessage(BatchPutMessageRequest batchPutMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutMessageRequest> request = null;
        Response<BatchPutMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchPutMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
     * detector model.
     * </p>
     * 
     * @param batchUpdateDetectorRequest
     * @return Result of the BatchUpdateDetector operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occured.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchUpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateDetectorResult batchUpdateDetector(BatchUpdateDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateDetector(request);
    }

    @SdkInternalApi
    final BatchUpdateDetectorResult executeBatchUpdateDetector(BatchUpdateDetectorRequest batchUpdateDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateDetectorRequest> request = null;
        Response<BatchUpdateDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified detector (instance).
     * </p>
     * 
     * @param describeDetectorRequest
     * @return Result of the DescribeDetector operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occured.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDetector(request);
    }

    @SdkInternalApi
    final DescribeDetectorResult executeDescribeDetector(DescribeDetectorRequest describeDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDetectorRequest> request = null;
        Response<DescribeDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists detectors (the instances of a detector model).
     * </p>
     * 
     * @param listDetectorsRequest
     * @return Result of the ListDetectors operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occured.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDetectorsResult listDetectors(ListDetectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListDetectors(request);
    }

    @SdkInternalApi
    final ListDetectorsResult executeListDetectors(ListDetectorsRequest listDetectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDetectorsRequest> request = null;
        Response<ListDetectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDetectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDetectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Events Data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDetectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDetectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDetectorsResultJsonUnmarshaller());
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
