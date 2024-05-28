/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor;

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

import com.amazonaws.services.internetmonitor.AmazonInternetMonitorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.internetmonitor.model.*;

import com.amazonaws.services.internetmonitor.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Internet Monitor. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * Amazon CloudWatch Internet Monitor provides visibility into how internet issues impact the performance and
 * availability between your applications hosted on Amazon Web Services and your end users. It can reduce the time it
 * takes for you to diagnose internet issues from days to minutes. Internet Monitor uses the connectivity data that
 * Amazon Web Services captures from its global networking footprint to calculate a baseline of performance and
 * availability for internet traffic. This is the same data that Amazon Web Services uses to monitor internet uptime and
 * availability. With those measurements as a baseline, Internet Monitor raises awareness for you when there are
 * significant problems for your end users in the different geographic locations where your application runs.
 * </p>
 * <p>
 * Internet Monitor publishes internet measurements to CloudWatch Logs and CloudWatch Metrics, to easily support using
 * CloudWatch tools with health information for geographies and networks specific to your application. Internet Monitor
 * sends health events to Amazon EventBridge so that you can set up notifications. If an issue is caused by the Amazon
 * Web Services network, you also automatically receive an Amazon Web Services Health Dashboard notification with the
 * steps that Amazon Web Services is taking to mitigate the problem.
 * </p>
 * <p>
 * To use Internet Monitor, you create a <i>monitor</i> and associate your application's resources with it - VPCs, NLBs,
 * CloudFront distributions, or WorkSpaces directories - so Internet Monitor can determine where your application's
 * internet traffic is. Internet Monitor then provides internet measurements from Amazon Web Services that are specific
 * to the locations and ASNs (typically, internet service providers or ISPs) that communicate with your application.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using Amazon
 * CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonInternetMonitorClient extends AmazonWebServiceClient implements AmazonInternetMonitor {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonInternetMonitor.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "internetmonitor";

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
                                    com.amazonaws.services.internetmonitor.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.internetmonitor.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.internetmonitor.model.AmazonInternetMonitorException.class));

    public static AmazonInternetMonitorClientBuilder builder() {
        return AmazonInternetMonitorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Internet Monitor using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonInternetMonitorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Internet Monitor using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonInternetMonitorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("internetmonitor.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/internetmonitor/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/internetmonitor/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a monitor in Amazon CloudWatch Internet Monitor. A monitor is built based on information from the
     * application resources that you add: VPCs, Network Load Balancers (NLBs), Amazon CloudFront distributions, and
     * Amazon WorkSpaces directories. Internet Monitor then publishes internet measurements from Amazon Web Services
     * that are specific to the <i>city-networks</i>. That is, the locations and ASNs (typically internet service
     * providers or ISPs), where clients access your application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using
     * Amazon CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * When you create a monitor, you choose the percentage of traffic that you want to monitor. You can also set a
     * maximum limit for the number of city-networks where client traffic is monitored, that caps the total traffic that
     * Internet Monitor monitors. A city-network maximum is the limit of city-networks, but you only pay for the number
     * of city-networks that are actually monitored. You can update your monitor at any time to change the percentage of
     * traffic to monitor or the city-networks maximum. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param createMonitorRequest
     * @return Result of the CreateMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested resource is in use.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateMonitorResult createMonitor(CreateMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMonitor(request);
    }

    @SdkInternalApi
    final CreateMonitorResult executeCreateMonitor(CreateMonitorRequest createMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(createMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMonitorRequest> request = null;
        Response<CreateMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a monitor in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return Result of the DeleteMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteMonitorResult deleteMonitor(DeleteMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMonitor(request);
    }

    @SdkInternalApi
    final DeleteMonitorResult executeDeleteMonitor(DeleteMonitorRequest deleteMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMonitorRequest> request = null;
        Response<DeleteMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information that Amazon CloudWatch Internet Monitor has created and stored about a health event for a
     * specified monitor. This information includes the impacted locations, and all the information related to the
     * event, by location.
     * </p>
     * <p>
     * The information returned includes the impact on performance, availability, and round-trip time, information about
     * the network providers (ASNs), the event type, and so on.
     * </p>
     * <p>
     * Information rolled up at the global traffic level is also returned, including the impact type and total traffic
     * impact.
     * </p>
     * 
     * @param getHealthEventRequest
     * @return Result of the GetHealthEvent operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetHealthEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetHealthEvent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetHealthEventResult getHealthEvent(GetHealthEventRequest request) {
        request = beforeClientExecution(request);
        return executeGetHealthEvent(request);
    }

    @SdkInternalApi
    final GetHealthEventResult executeGetHealthEvent(GetHealthEventRequest getHealthEventRequest) {

        ExecutionContext executionContext = createExecutionContext(getHealthEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHealthEventRequest> request = null;
        Response<GetHealthEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHealthEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getHealthEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHealthEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHealthEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetHealthEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information that Amazon CloudWatch Internet Monitor has generated about an internet event. Internet Monitor
     * displays information about recent global health events, called internet events, on a global outages map that is
     * available to all Amazon Web Services customers.
     * </p>
     * <p>
     * The information returned here includes the impacted location, when the event started and (if the event is over)
     * ended, the type of event (<code>PERFORMANCE</code> or <code>AVAILABILITY</code>), and the status (
     * <code>ACTIVE</code> or <code>RESOLVED</code>).
     * </p>
     * 
     * @param getInternetEventRequest
     * @return Result of the GetInternetEvent operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetInternetEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetInternetEvent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInternetEventResult getInternetEvent(GetInternetEventRequest request) {
        request = beforeClientExecution(request);
        return executeGetInternetEvent(request);
    }

    @SdkInternalApi
    final GetInternetEventResult executeGetInternetEvent(GetInternetEventRequest getInternetEventRequest) {

        ExecutionContext executionContext = createExecutionContext(getInternetEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInternetEventRequest> request = null;
        Response<GetInternetEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInternetEventRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInternetEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInternetEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInternetEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInternetEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a monitor in Amazon CloudWatch Internet Monitor based on a monitor name. The information
     * returned includes the Amazon Resource Name (ARN), create time, modified time, resources included in the monitor,
     * and status information.
     * </p>
     * 
     * @param getMonitorRequest
     * @return Result of the GetMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMonitorResult getMonitor(GetMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeGetMonitor(request);
    }

    @SdkInternalApi
    final GetMonitorResult executeGetMonitor(GetMonitorRequest getMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(getMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMonitorRequest> request = null;
        Response<GetMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMonitorResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return the data for a query with the Amazon CloudWatch Internet Monitor query interface. Specify the query that
     * you want to return results for by providing a <code>QueryId</code> and a monitor name.
     * </p>
     * <p>
     * For more information about using the query interface, including examples, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryResults"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryResults(request);
    }

    @SdkInternalApi
    final GetQueryResultsResult executeGetQueryResults(GetQueryResultsRequest getQueryResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryResultsRequest> request = null;
        Response<GetQueryResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current status of a query for the Amazon CloudWatch Internet Monitor query interface, for a specified
     * query ID and monitor. When you run a query, check the status to make sure that the query has
     * <code>SUCCEEDED</code> before you review the results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUEUED</code>: The query is scheduled to run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The query is in progress but not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The query completed sucessfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The query failed due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>: The query was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getQueryStatusRequest
     * @return Result of the GetQueryStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetQueryStatusResult getQueryStatus(GetQueryStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryStatus(request);
    }

    @SdkInternalApi
    final GetQueryStatusResult executeGetQueryStatus(GetQueryStatusRequest getQueryStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryStatusRequest> request = null;
        Response<GetQueryStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all health events for a monitor in Amazon CloudWatch Internet Monitor. Returns information for health
     * events including the event start and end times, and the status.
     * </p>
     * <note>
     * <p>
     * Health events that have start times during the time frame that is requested are not included in the list of
     * health events.
     * </p>
     * </note>
     * 
     * @param listHealthEventsRequest
     * @return Result of the ListHealthEvents operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.ListHealthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListHealthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListHealthEventsResult listHealthEvents(ListHealthEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListHealthEvents(request);
    }

    @SdkInternalApi
    final ListHealthEventsResult executeListHealthEvents(ListHealthEventsRequest listHealthEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHealthEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHealthEventsRequest> request = null;
        Response<ListHealthEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHealthEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHealthEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHealthEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHealthEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHealthEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists internet events that cause performance or availability issues for client locations. Amazon CloudWatch
     * Internet Monitor displays information about recent global health events, called internet events, on a global
     * outages map that is available to all Amazon Web Services customers.
     * </p>
     * <p>
     * You can constrain the list of internet events returned by providing a start time and end time to define a total
     * time frame for events you want to list. Both start time and end time specify the time when an event started. End
     * time is optional. If you don't include it, the default end time is the current time.
     * </p>
     * <p>
     * You can also limit the events returned to a specific status (<code>ACTIVE</code> or <code>RESOLVED</code>) or
     * type (<code>PERFORMANCE</code> or <code>AVAILABILITY</code>).
     * </p>
     * 
     * @param listInternetEventsRequest
     * @return Result of the ListInternetEvents operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.ListInternetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListInternetEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInternetEventsResult listInternetEvents(ListInternetEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListInternetEvents(request);
    }

    @SdkInternalApi
    final ListInternetEventsResult executeListInternetEvents(ListInternetEventsRequest listInternetEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInternetEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInternetEventsRequest> request = null;
        Response<ListInternetEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInternetEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInternetEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInternetEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInternetEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInternetEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of your monitors for Amazon CloudWatch Internet Monitor and their statuses, along with the Amazon
     * Resource Name (ARN) and name of each monitor.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return Result of the ListMonitors operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMonitorsResult listMonitors(ListMonitorsRequest request) {
        request = beforeClientExecution(request);
        return executeListMonitors(request);
    }

    @SdkInternalApi
    final ListMonitorsResult executeListMonitors(ListMonitorsRequest listMonitorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMonitorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitorsRequest> request = null;
        Response<ListMonitorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMonitorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMonitors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMonitorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMonitorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws TooManyRequestsException
     *         There were too many requests.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws NotFoundException
     *         The request specifies something that doesn't exist.
     * @throws BadRequestException
     *         A bad request was received.
     * @throws InternalServerErrorException
     *         There was an internal server error.
     * @sample AmazonInternetMonitor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
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
     * Start a query to return data for a specific query type for the Amazon CloudWatch Internet Monitor query
     * interface. Specify a time period for the data that you want returned by using <code>StartTime</code> and
     * <code>EndTime</code>. You filter the query results to return by providing parameters that you specify with
     * <code>FilterParameters</code>.
     * </p>
     * <p>
     * For more information about using the query interface, including examples, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param startQueryRequest
     * @return Result of the StartQuery operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartQueryResult startQuery(StartQueryRequest request) {
        request = beforeClientExecution(request);
        return executeStartQuery(request);
    }

    @SdkInternalApi
    final StartQueryResult executeStartQuery(StartQueryRequest startQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(startQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartQueryRequest> request = null;
        Response<StartQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartQueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop a query that is progress for a specific monitor.
     * </p>
     * 
     * @param stopQueryRequest
     * @return Result of the StopQuery operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopQueryResult stopQuery(StopQueryRequest request) {
        request = beforeClientExecution(request);
        return executeStopQuery(request);
    }

    @SdkInternalApi
    final StopQueryResult executeStopQuery(StopQueryRequest stopQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(stopQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopQueryRequest> request = null;
        Response<StopQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopQueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a tag to a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor. You can add
     * a maximum of 50 tags in Internet Monitor.
     * </p>
     * <p>
     * A minimum of one tag is required for this call. It returns an error if you use the <code>TagResource</code>
     * request with 0 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyRequestsException
     *         There were too many requests.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws NotFoundException
     *         The request specifies something that doesn't exist.
     * @throws BadRequestException
     *         A bad request was received.
     * @throws InternalServerErrorException
     *         There was an internal server error.
     * @sample AmazonInternetMonitor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
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
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws TooManyRequestsException
     *         There were too many requests.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws NotFoundException
     *         The request specifies something that doesn't exist.
     * @throws BadRequestException
     *         A bad request was received.
     * @throws InternalServerErrorException
     *         There was an internal server error.
     * @sample AmazonInternetMonitor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
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
     * Updates a monitor. You can update a monitor to change the percentage of traffic to monitor or the maximum number
     * of city-networks (locations and ASNs), to add or remove resources, or to change the status of the monitor. Note
     * that you can't change the name of a monitor.
     * </p>
     * <p>
     * The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are
     * actually monitored. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return Result of the UpdateMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws ResourceNotFoundException
     *         The request specifies a resource that doesn't exist.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateMonitorResult updateMonitor(UpdateMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMonitor(request);
    }

    @SdkInternalApi
    final UpdateMonitorResult executeUpdateMonitor(UpdateMonitorRequest updateMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMonitorRequest> request = null;
        Response<UpdateMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "InternetMonitor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMonitorResultJsonUnmarshaller());
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
