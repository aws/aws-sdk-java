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
package com.amazonaws.services.health;

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

import com.amazonaws.services.health.AWSHealthClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.health.model.*;
import com.amazonaws.services.health.model.transform.*;

/**
 * Client for accessing AWSHealth. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Health</fullname>
 * <p>
 * The AWS Health API provides programmatic access to the AWS Health information that is presented in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can get information about events
 * that affect your AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEvents</a>: Summary information about events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetails</a>: Detailed information about one or more events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntities</a>: Information about AWS resources that are affected by one or more events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, these operations provide information about event types and summary counts of events or affected
 * entities:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventTypes</a>: Information about the kinds of events that AWS Health tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventAggregates</a>: A count of the number of events that meet specified criteria.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEntityAggregates</a>: A count of the number of affected entities that meet specified criteria.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Health API requires a Business or Enterprise support plan from <a
 * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>. Calling the Health API from an account that does not
 * have a Business or Enterprise support plan causes a <code>SubscriptionRequiredException</code>.
 * </p>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See the <a href="http://docs.aws.amazon.com/health/latest/ug/what-is-aws-health.html">AWS Health User Guide</a> for
 * information about how to use the API.
 * </p>
 * <p>
 * <b>Service Endpoint</b>
 * </p>
 * <p>
 * The HTTP endpoint for the AWS Health API is:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://health.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSHealthClient extends AmazonWebServiceClient implements AWSHealth {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSHealth.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "health";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedLocale").withModeledClass(
                                    com.amazonaws.services.health.model.UnsupportedLocaleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationToken").withModeledClass(
                                    com.amazonaws.services.health.model.InvalidPaginationTokenException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.health.model.AWSHealthException.class));

    /**
     * Constructs a new client to invoke service methods on AWSHealth. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSHealthClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSHealthClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSHealth (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSHealthClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSHealthClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSHealthClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSHealthClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSHealthClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSHealth (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSHealthClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSHealthClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSHealthClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSHealthClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSHealth (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSHealthClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSHealthClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSHealth (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSHealthClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSHealthClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSHealthClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSHealthClientBuilder builder() {
        return AWSHealthClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSHealthClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSHealth using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSHealthClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("health.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/health/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/health/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns a list of entities that have been affected by the specified events, based on the specified filter
     * criteria. Entities can refer to individual customer resources, groups of customer resources, or any other
     * construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where
     * the extent of impact is unknown, include at least one entity indicating this.
     * </p>
     * <p>
     * At least one event ARN is required. Results are sorted by the <code>lastUpdatedTime</code> of the entity,
     * starting with the most recent.
     * </p>
     * 
     * @param describeAffectedEntitiesRequest
     * @return Result of the DescribeAffectedEntities operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeAffectedEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAffectedEntitiesResult describeAffectedEntities(DescribeAffectedEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAffectedEntities(request);
    }

    @SdkInternalApi
    final DescribeAffectedEntitiesResult executeDescribeAffectedEntities(DescribeAffectedEntitiesRequest describeAffectedEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAffectedEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAffectedEntitiesRequest> request = null;
        Response<DescribeAffectedEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAffectedEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAffectedEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAffectedEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAffectedEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAffectedEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of entities that are affected by each of the specified events. If no events are specified, the
     * counts of all affected entities are returned.
     * </p>
     * 
     * @param describeEntityAggregatesRequest
     * @return Result of the DescribeEntityAggregates operation returned by the service.
     * @sample AWSHealth.DescribeEntityAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEntityAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEntityAggregatesResult describeEntityAggregates(DescribeEntityAggregatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEntityAggregates(request);
    }

    @SdkInternalApi
    final DescribeEntityAggregatesResult executeDescribeEntityAggregates(DescribeEntityAggregatesRequest describeEntityAggregatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEntityAggregatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntityAggregatesRequest> request = null;
        Response<DescribeEntityAggregatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntityAggregatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEntityAggregatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEntityAggregates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEntityAggregatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEntityAggregatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter
     * is specified, the counts of all events in each category are returned.
     * </p>
     * 
     * @param describeEventAggregatesRequest
     * @return Result of the DescribeEventAggregates operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @sample AWSHealth.DescribeEventAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventAggregates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEventAggregatesResult describeEventAggregates(DescribeEventAggregatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventAggregates(request);
    }

    @SdkInternalApi
    final DescribeEventAggregatesResult executeDescribeEventAggregates(DescribeEventAggregatesRequest describeEventAggregatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventAggregatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventAggregatesRequest> request = null;
        Response<DescribeEventAggregatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventAggregatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEventAggregatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventAggregates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventAggregatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEventAggregatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about one or more specified events. Information includes standard event data
     * (region, service, etc., as returned by <a>DescribeEvents</a>), a detailed event description, and possible
     * additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve
     * those, use the <a>DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event cannot be retrieved, an error message is returned for that event.
     * </p>
     * 
     * @param describeEventDetailsRequest
     * @return Result of the DescribeEventDetails operation returned by the service.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetails" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEventDetailsResult describeEventDetails(DescribeEventDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventDetails(request);
    }

    @SdkInternalApi
    final DescribeEventDetailsResult executeDescribeEventDetails(DescribeEventDetailsRequest describeEventDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventDetailsRequest> request = null;
        Response<DescribeEventDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
     * types are returned, in no particular order.
     * </p>
     * 
     * @param describeEventTypesRequest
     * @return Result of the DescribeEventTypes operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventTypes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventTypesResult describeEventTypes(DescribeEventTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventTypes(request);
    }

    @SdkInternalApi
    final DescribeEventTypesResult executeDescribeEventTypes(DescribeEventTypesRequest describeEventTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTypesRequest> request = null;
        Response<DescribeEventTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about events that meet the specified filter criteria. Events are returned in a summary form
     * and do not include the detailed description, any additional metadata that depends on the event type, or any
     * affected resources. To retrieve that information, use the <a>DescribeEventDetails</a> and
     * <a>DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvents(request);
    }

    @SdkInternalApi
    final DescribeEventsResult executeDescribeEvents(DescribeEventsRequest describeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventsResultJsonUnmarshaller());
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
