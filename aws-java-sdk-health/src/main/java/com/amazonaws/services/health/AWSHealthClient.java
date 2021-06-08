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
 * The AWS Health API provides programmatic access to the AWS Health information that appears in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can use the API operations to get
 * information about AWS Health events that affect your AWS services and resources.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise Support plan from <a href="http://aws.amazon.com/premiumsupport/">AWS
 * Support</a> to use the AWS Health API. If you call the AWS Health API from an AWS account that doesn't have a
 * Business or Enterprise Support plan, you receive a <code>SubscriptionRequiredException</code> error.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can use the AWS Health endpoint health.us-east-1.amazonaws.com (HTTPS) to call the AWS Health API operations. AWS
 * Health supports a multi-Region application architecture and has two regional endpoints in an active-passive
 * configuration. You can use the high availability endpoint example to determine which AWS Region is active, so that
 * you can get the latest information from the API. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/health-api.html">Accessing the AWS Health API</a> in the <i>AWS
 * Health User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * If your AWS account is part of AWS Organizations, you can use the AWS Health organizational view feature. This
 * feature provides a centralized view of AWS Health events across all accounts in your organization. You can aggregate
 * AWS Health events in real time to identify accounts in your organization that are affected by an operational event or
 * get notified of security vulnerabilities. Use the organizational view API operations to enable this feature and
 * return event information. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in the
 * <i>AWS Health User Guide</i>.
 * </p>
 * <note>
 * <p>
 * When you use the AWS Health API operations to return AWS Health events, see the following recommendations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <a
 * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html#AWSHealth-Type-Event-eventScopeCode"
 * >eventScopeCode</a> parameter to specify whether to return AWS Health events that are public or account-specific.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use pagination to view all events from the response. For example, if you call the
 * <code>DescribeEventsForOrganization</code> operation to get all events in your organization, you might receive
 * several page results. Specify the <code>nextToken</code> in the next request to return more results.
 * </p>
 * </li>
 * </ul>
 * </note>
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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.health.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedLocale").withExceptionUnmarshaller(
                                    com.amazonaws.services.health.model.transform.UnsupportedLocaleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationToken").withExceptionUnmarshaller(
                                    com.amazonaws.services.health.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
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
     * Returns a list of accounts in the organization from AWS Organizations that are affected by the provided event.
     * For more information about the different types of AWS Health events, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
     * 
     * @param describeAffectedAccountsForOrganizationRequest
     * @return Result of the DescribeAffectedAccountsForOrganization operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @sample AWSHealth.DescribeAffectedAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAffectedAccountsForOrganizationResult describeAffectedAccountsForOrganization(DescribeAffectedAccountsForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAffectedAccountsForOrganization(request);
    }

    @SdkInternalApi
    final DescribeAffectedAccountsForOrganizationResult executeDescribeAffectedAccountsForOrganization(
            DescribeAffectedAccountsForOrganizationRequest describeAffectedAccountsForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAffectedAccountsForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAffectedAccountsForOrganizationRequest> request = null;
        Response<DescribeAffectedAccountsForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAffectedAccountsForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAffectedAccountsForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAffectedAccountsForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAffectedAccountsForOrganizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAffectedAccountsForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation supports resource-level permissions. You can use this operation to allow or deny access to
     * specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a list of entities that have been affected by one or more events for one or more accounts in your
     * organization in AWS Organizations, based on the filter criteria. Entities can refer to individual customer
     * resources, groups of customer resources, or any other construct, depending on the AWS service.
     * </p>
     * <p>
     * At least one event Amazon Resource Name (ARN) and account ID are required. Results are sorted by the
     * <code>lastUpdatedTime</code> of the entity, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access
     * to specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAffectedEntitiesForOrganizationRequest
     * @return Result of the DescribeAffectedEntitiesForOrganization operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeAffectedEntitiesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntitiesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAffectedEntitiesForOrganizationResult describeAffectedEntitiesForOrganization(DescribeAffectedEntitiesForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAffectedEntitiesForOrganization(request);
    }

    @SdkInternalApi
    final DescribeAffectedEntitiesForOrganizationResult executeDescribeAffectedEntitiesForOrganization(
            DescribeAffectedEntitiesForOrganizationRequest describeAffectedEntitiesForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAffectedEntitiesForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAffectedEntitiesForOrganizationRequest> request = null;
        Response<DescribeAffectedEntitiesForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAffectedEntitiesForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAffectedEntitiesForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAffectedEntitiesForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAffectedEntitiesForOrganizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAffectedEntitiesForOrganizationResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns detailed information about one or more specified events. Information includes standard event data (AWS
     * Region, service, and so on, as returned by <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEvents.html">DescribeEvents</a>), a
     * detailed event description, and possible additional metadata that depends upon the nature of the event. Affected
     * entities are not included. To retrieve the entities, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html"
     * >DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event can't be retrieved, an error message is returned for that event.
     * </p>
     * <note>
     * <p>
     * This operation supports resource-level permissions. You can use this operation to allow or deny access to
     * specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </note>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns detailed information about one or more specified events for one or more AWS accounts in your
     * organization. This information includes standard event data (such as the AWS Region and service), an event
     * description, and (depending on the event) possible metadata. This operation doesn't return affected entities,
     * such as the resources related to the event. To return affected entities, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntitiesForOrganization.html"
     * >DescribeAffectedEntitiesForOrganization</a> operation.
     * </p>
     * <note>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * </note>
     * <p>
     * When you call the <code>DescribeEventDetailsForOrganization</code> operation, specify the
     * <code>organizationEventDetailFilters</code> object in the request. Depending on the AWS Health event type, note
     * the following differences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return event details for a public event, you must specify a null value for the <code>awsAccountId</code>
     * parameter. If you specify an account ID for a public event, AWS Health returns an error message because public
     * events aren't specific to an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return event details for an event that is specific to an account in your organization, you must specify the
     * <code>awsAccountId</code> parameter in the request. If you don't specify an account ID, AWS Health returns an
     * error message because the event is specific to an account in your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <note>
     * <p>
     * This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access
     * to specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </note>
     * 
     * @param describeEventDetailsForOrganizationRequest
     * @return Result of the DescribeEventDetailsForOrganization operation returned by the service.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventDetailsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetailsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEventDetailsForOrganizationResult describeEventDetailsForOrganization(DescribeEventDetailsForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventDetailsForOrganization(request);
    }

    @SdkInternalApi
    final DescribeEventDetailsForOrganizationResult executeDescribeEventDetailsForOrganization(
            DescribeEventDetailsForOrganizationRequest describeEventDetailsForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventDetailsForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventDetailsForOrganizationRequest> request = null;
        Response<DescribeEventDetailsForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventDetailsForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEventDetailsForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventDetailsForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventDetailsForOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEventDetailsForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the event types that meet the specified filter criteria. You can use this API operation to find
     * information about the AWS Health event, such as the category, AWS service, and event code. The metadata for each
     * event appears in the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EventType.html">EventType</a> object.
     * </p>
     * <p>
     * If you don't specify a filter criteria, the API operation returns all event types, in no particular order.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * affected resources. To retrieve that information, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetails.html"
     * >DescribeEventDetails</a> and <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html"
     * >DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent event.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When you call the <code>DescribeEvents</code> operation and specify an entity for the <code>entityValues</code>
     * parameter, AWS Health might return public events that aren't specific to that resource. For example, if you call
     * <code>DescribeEvents</code> and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, AWS
     * Health might return events that aren't specific to that resource or service. To get events that are specific to a
     * service, use the <code>services</code> parameter in the <code>filter</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * </ul>
     * </note>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Returns information about events across your organization in AWS Organizations. You can use the
     * <code>filters</code> parameter to specify the events that you want to return. Events are returned in a summary
     * form and don't include the affected accounts, detailed description, any additional metadata that depends on the
     * event type, or any affected resources. To retrieve that information, use the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedAccountsForOrganization.html">
     * DescribeAffectedAccountsForOrganization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetailsForOrganization.html">
     * DescribeEventDetailsForOrganization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntitiesForOrganization.html">
     * DescribeAffectedEntitiesForOrganization</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>filter</code>, the <code>DescribeEventsForOrganizations</code> returns all events
     * across your organization. Results are sorted by <code>lastModifiedTime</code>, starting with the most recent
     * event.
     * </p>
     * <p>
     * For more information about the different types of AWS Health events, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
     * 
     * @param describeEventsForOrganizationRequest
     * @return Result of the DescribeEventsForOrganization operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEventsForOrganizationResult describeEventsForOrganization(DescribeEventsForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventsForOrganization(request);
    }

    @SdkInternalApi
    final DescribeEventsForOrganizationResult executeDescribeEventsForOrganization(DescribeEventsForOrganizationRequest describeEventsForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsForOrganizationRequest> request = null;
        Response<DescribeEventsForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEventsForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventsForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventsForOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEventsForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation provides status information on enabling or disabling AWS Health to work with your organization. To
     * call this operation, you must sign in as an IAM user, assume an IAM role, or sign in as the root user (not
     * recommended) in the organization's management account.
     * </p>
     * 
     * @param describeHealthServiceStatusForOrganizationRequest
     * @return Result of the DescribeHealthServiceStatusForOrganization operation returned by the service.
     * @sample AWSHealth.DescribeHealthServiceStatusForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeHealthServiceStatusForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHealthServiceStatusForOrganizationResult describeHealthServiceStatusForOrganization(DescribeHealthServiceStatusForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHealthServiceStatusForOrganization(request);
    }

    @SdkInternalApi
    final DescribeHealthServiceStatusForOrganizationResult executeDescribeHealthServiceStatusForOrganization(
            DescribeHealthServiceStatusForOrganizationRequest describeHealthServiceStatusForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHealthServiceStatusForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHealthServiceStatusForOrganizationRequest> request = null;
        Response<DescribeHealthServiceStatusForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHealthServiceStatusForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeHealthServiceStatusForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHealthServiceStatusForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHealthServiceStatusForOrganizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeHealthServiceStatusForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables AWS Health from working with AWS Organizations. To call this operation, you must sign in as an AWS
     * Identity and Access Management (IAM) user, assume an IAM role, or sign in as the root user (not recommended) in
     * the organization's management account. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in
     * the <i>AWS Health User Guide</i>.
     * </p>
     * <p>
     * This operation doesn't remove the service-linked role from the management account in your organization. You must
     * use the IAM console, API, or AWS Command Line Interface (AWS CLI) to remove the service-linked role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html#delete-service-linked-role"
     * >Deleting a Service-Linked Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can also disable the organizational feature by using the Organizations <a
     * href="https://docs.aws.amazon.com/organizations/latest/APIReference/API_DisableAWSServiceAccess.html"
     * >DisableAWSServiceAccess</a> API operation. After you call this operation, AWS Health stops aggregating events
     * for all other AWS accounts in your organization. If you call the AWS Health API operations for organizational
     * view, AWS Health returns an error. AWS Health continues to aggregate health events for your AWS account.
     * </p>
     * </note>
     * 
     * @param disableHealthServiceAccessForOrganizationRequest
     * @return Result of the DisableHealthServiceAccessForOrganization operation returned by the service.
     * @throws ConcurrentModificationException
     *         <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     *         >EnableHealthServiceAccessForOrganization</a> is already in progress. Wait for the action to complete
     *         before trying again. To get the current status, use the <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeHealthServiceStatusForOrganization.html"
     *         >DescribeHealthServiceStatusForOrganization</a> operation.
     * @sample AWSHealth.DisableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DisableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableHealthServiceAccessForOrganizationResult disableHealthServiceAccessForOrganization(DisableHealthServiceAccessForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDisableHealthServiceAccessForOrganization(request);
    }

    @SdkInternalApi
    final DisableHealthServiceAccessForOrganizationResult executeDisableHealthServiceAccessForOrganization(
            DisableHealthServiceAccessForOrganizationRequest disableHealthServiceAccessForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(disableHealthServiceAccessForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableHealthServiceAccessForOrganizationRequest> request = null;
        Response<DisableHealthServiceAccessForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableHealthServiceAccessForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableHealthServiceAccessForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableHealthServiceAccessForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableHealthServiceAccessForOrganizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisableHealthServiceAccessForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables AWS Health to work with AWS Organizations. You can use the organizational view feature to aggregate
     * events from all AWS accounts in your organization in a centralized location.
     * </p>
     * <p>
     * This operation also creates a service-linked role for the management account in the organization.
     * </p>
     * <note>
     * <p>
     * To call this operation, you must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan from <a href="http://aws.amazon.com/premiumsupport/">AWS
     * Support</a> to use the AWS Health API. If you call the AWS Health API from an AWS account that doesn't have a
     * Business or Enterprise Support plan, you receive a <code>SubscriptionRequiredException</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must have permission to call this operation from the organization's management account. For example IAM
     * policies, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html">AWS Health
     * identity-based policy examples</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * If you don't have the required support plan, you can instead use the AWS Health console to enable the
     * organizational view feature. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in
     * the <i>AWS Health User Guide</i>.
     * </p>
     * 
     * @param enableHealthServiceAccessForOrganizationRequest
     * @return Result of the EnableHealthServiceAccessForOrganization operation returned by the service.
     * @throws ConcurrentModificationException
     *         <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     *         >EnableHealthServiceAccessForOrganization</a> is already in progress. Wait for the action to complete
     *         before trying again. To get the current status, use the <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeHealthServiceStatusForOrganization.html"
     *         >DescribeHealthServiceStatusForOrganization</a> operation.
     * @sample AWSHealth.EnableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EnableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableHealthServiceAccessForOrganizationResult enableHealthServiceAccessForOrganization(EnableHealthServiceAccessForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeEnableHealthServiceAccessForOrganization(request);
    }

    @SdkInternalApi
    final EnableHealthServiceAccessForOrganizationResult executeEnableHealthServiceAccessForOrganization(
            EnableHealthServiceAccessForOrganizationRequest enableHealthServiceAccessForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(enableHealthServiceAccessForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableHealthServiceAccessForOrganizationRequest> request = null;
        Response<EnableHealthServiceAccessForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableHealthServiceAccessForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableHealthServiceAccessForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Health");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableHealthServiceAccessForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableHealthServiceAccessForOrganizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new EnableHealthServiceAccessForOrganizationResultJsonUnmarshaller());
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
