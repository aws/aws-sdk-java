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
package com.amazonaws.services.cloudwatchevents;

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

import com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEventsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.services.cloudwatchevents.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Events. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon CloudWatch Events helps you to respond to state changes in your AWS resources. When your resources change
 * state, they automatically send events into an event stream. You can create rules that match selected events in the
 * stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule.
 * For example, you can configure rules to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance
 * enters the running state.
 * </p>
 * </li>
 * <li>
 * <p>
 * Direct specific API records from AWS CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential
 * security or availability risks.
 * </p>
 * </li>
 * <li>
 * <p>
 * Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about the features of Amazon CloudWatch Events, see the <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events">Amazon CloudWatch Events User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudWatchEventsClient extends AmazonWebServiceClient implements AmazonCloudWatchEvents {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudWatchEvents.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "events";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyLengthExceededException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.PolicyLengthExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEventPatternException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.InvalidEventPatternException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.InternalException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ManagedRuleException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.ManagedRuleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.cloudwatchevents.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudwatchevents.model.AmazonCloudWatchEventsException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Events (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudWatchEventsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Events (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Events (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Events (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudWatchEventsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudWatchEventsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudWatchEventsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudWatchEventsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudWatchEventsClientBuilder builder() {
        return AmazonCloudWatchEventsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEventsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Events using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchEventsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("events.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudwatchevents/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudwatchevents/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * Before you can delete the rule, you must remove all targets, using <a>RemoveTargets</a>.
     * </p>
     * <p>
     * When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time
     * for changes to take effect.
     * </p>
     * <p>
     * Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by
     * those other AWS services to support functionality in those services. You can delete these rules using the
     * <code>Force</code> option, but you should do so only if you are sure the other service is not still using that
     * rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRule(request);
    }

    @SdkInternalApi
    final DeleteRuleResult executeDeleteRule(DeleteRuleRequest deleteRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the external AWS accounts that are permitted to write events to your account using your account's event
     * bus, and the associated policy. To enable your account to receive events from other accounts, use
     * <a>PutPermission</a>.
     * </p>
     * 
     * @param describeEventBusRequest
     * @return Result of the DescribeEventBus operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DescribeEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DescribeEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventBusResult describeEventBus(DescribeEventBusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventBus(request);
    }

    @SdkInternalApi
    final DescribeEventBusResult executeDescribeEventBus(DescribeEventBusRequest describeEventBusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventBusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventBusRequest> request = null;
        Response<DescribeEventBusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventBusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventBusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventBus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventBusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventBusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified rule.
     * </p>
     * <p>
     * DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param describeRuleRequest
     * @return Result of the DescribeRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRuleResult describeRule(DescribeRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRule(request);
    }

    @SdkInternalApi
    final DescribeRuleResult executeDescribeRule(DescribeRuleRequest describeRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuleRequest> request = null;
        Response<DescribeRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule
     * expression.
     * </p>
     * <p>
     * When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of
     * time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     * @return Result of the DisableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DisableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DisableRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableRuleResult disableRule(DisableRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDisableRule(request);
    }

    @SdkInternalApi
    final DisableRuleResult executeDisableRule(DisableRuleRequest disableRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(disableRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRuleRequest> request = null;
        Response<DisableRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the specified rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a
     * short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     * @return Result of the EnableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.EnableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/EnableRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableRuleResult enableRule(EnableRuleRequest request) {
        request = beforeClientExecution(request);
        return executeEnableRule(request);
    }

    @SdkInternalApi
    final EnableRuleResult executeEnableRule(EnableRuleRequest enableRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(enableRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRuleRequest> request = null;
        Response<EnableRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the rules for the specified target. You can see which of the rules in Amazon CloudWatch Events can invoke a
     * specific target in your account.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     * @return Result of the ListRuleNamesByTarget operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListRuleNamesByTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRuleNamesByTarget" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRuleNamesByTargetResult listRuleNamesByTarget(ListRuleNamesByTargetRequest request) {
        request = beforeClientExecution(request);
        return executeListRuleNamesByTarget(request);
    }

    @SdkInternalApi
    final ListRuleNamesByTargetResult executeListRuleNamesByTarget(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(listRuleNamesByTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleNamesByTargetRequest> request = null;
        Response<ListRuleNamesByTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleNamesByTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRuleNamesByTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuleNamesByTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRuleNamesByTargetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListRuleNamesByTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your Amazon CloudWatch Events rules. You can either list all the rules or you can provide a prefix to match
     * to the rule names.
     * </p>
     * <p>
     * ListRules does not list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListRules(request);
    }

    @SdkInternalApi
    final ListRulesResult executeListRules(ListRulesRequest listRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a CloudWatch Events resource. In CloudWatch Events, rules can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
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
     * Lists the targets assigned to the specified rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     * @return Result of the ListTargetsByRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListTargetsByRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListTargetsByRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTargetsByRuleResult listTargetsByRule(ListTargetsByRuleRequest request) {
        request = beforeClientExecution(request);
        return executeListTargetsByRule(request);
    }

    @SdkInternalApi
    final ListTargetsByRuleResult executeListTargetsByRule(ListTargetsByRuleRequest listTargetsByRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetsByRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsByRuleRequest> request = null;
        Response<ListTargetsByRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsByRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetsByRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargetsByRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetsByRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTargetsByRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     * @return Result of the PutEvents operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutEventsResult putEvents(PutEventsRequest request) {
        request = beforeClientExecution(request);
        return executePutEvents(request);
    }

    @SdkInternalApi
    final PutEventsResult executePutEvents(PutEventsRequest putEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(putEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventsRequest> request = null;
        Response<PutEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEventsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Running <code>PutPermission</code> permits the specified AWS account or AWS organization to put events to your
     * account's default <i>event bus</i>. CloudWatch Events rules in your account are triggered by these events
     * arriving to your default event bus.
     * </p>
     * <p>
     * For another account to send events to your account, that external account must have a CloudWatch Events rule with
     * your account's default event bus as a target.
     * </p>
     * <p>
     * To enable multiple AWS accounts to put events to your default event bus, run <code>PutPermission</code> once for
     * each of these accounts. Or, if all the accounts are members of the same AWS organization, you can run
     * <code>PutPermission</code> once specifying <code>Principal</code> as "*" and specifying the AWS organization ID
     * in <code>Condition</code>, to grant permissions to all accounts in that organization.
     * </p>
     * <p>
     * If you grant permissions using an organization, then accounts in that organization must specify a
     * <code>RoleArn</code> with proper permissions when they use <code>PutTarget</code> to add your account's event bus
     * as a target. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEvents-CrossAccountEventDelivery.html"
     * >Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * The permission policy on the default event bus cannot exceed 10 KB in size.
     * </p>
     * 
     * @param putPermissionRequest
     * @return Result of the PutPermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws PolicyLengthExceededException
     *         The event bus policy is too long. For more information, see the limits.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @sample AmazonCloudWatchEvents.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutPermissionResult putPermission(PutPermissionRequest request) {
        request = beforeClientExecution(request);
        return executePutPermission(request);
    }

    @SdkInternalApi
    final PutPermissionResult executePutPermission(PutPermissionRequest putPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(putPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPermissionRequest> request = null;
        Response<PutPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * If you are updating an existing rule, the rule is replaced with what you specify in this <code>PutRule</code>
     * command. If you omit arguments in <code>PutRule</code>, the old values for those arguments are not kept. Instead,
     * they are replaced with null values.
     * </p>
     * <p>
     * When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
     * Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as
     * on a schedule.
     * </p>
     * <p>
     * When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions, by granting a user
     * permission to access or change only rules with certain tag values. To use the <code>PutRule</code> operation and
     * assign tags, you must have both the <code>events:PutRule</code> and <code>events:TagResource</code> permissions.
     * </p>
     * <p>
     * If you are updating an existing rule, any tags you specify in the <code>PutRule</code> operation are ignored. To
     * update the tags of an existing rule, use <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch
     * Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating
     * event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * <p>
     * In CloudWatch Events, it is possible to create rules that lead to infinite loops, where a rule is fired
     * repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to
     * change them to the desired state. If the rule is not written carefully, the subsequent change to the ACLs fires
     * the rule again, creating an infinite loop.
     * </p>
     * <p>
     * To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your
     * rule could fire only if ACLs are found to be in a bad state, instead of after any change.
     * </p>
     * <p>
     * An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which
     * alerts you when charges exceed your specified limit. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html">Managing Your
     * Costs with Budgets</a>.
     * </p>
     * 
     * @param putRuleRequest
     * @return Result of the PutRule operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is not valid.
     * @throws LimitExceededException
     *         You tried to create more rules or add more targets to a rule than is allowed.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRuleResult putRule(PutRuleRequest request) {
        request = beforeClientExecution(request);
        return executePutRule(request);
    }

    @SdkInternalApi
    final PutRuleResult executePutRule(PutRuleRequest putRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(putRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRuleRequest> request = null;
        Response<PutRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the
     * rule.
     * </p>
     * <p>
     * Targets are the resources that are invoked when a rule is triggered.
     * </p>
     * <p>
     * You can configure the following as targets for CloudWatch Events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EC2 instances
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Run Command
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Automation
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Lambda functions
     * </p>
     * </li>
     * <li>
     * <p>
     * Data streams in Amazon Kinesis Data Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Data delivery streams in Amazon Kinesis Data Firehose
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ECS tasks
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Step Functions state machines
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Batch jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CodeBuild projects
     * </p>
     * </li>
     * <li>
     * <p>
     * Pipelines in AWS CodePipeline
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Inspector assessment templates
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS topics
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SQS queues, including FIFO queues
     * </p>
     * </li>
     * <li>
     * <p>
     * The default event bus of another AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are
     * <code>EC2 CreateSnapshot API call</code>, <code>EC2 RebootInstances API call</code>,
     * <code>EC2 StopInstances API call</code>, and <code>EC2 TerminateInstances API call</code>.
     * </p>
     * <p>
     * For some target types, <code>PutTargets</code> provides target-specific parameters. If the target is a Kinesis
     * data stream, you can optionally specify which shard the event goes to by using the <code>KinesisParameters</code>
     * argument. To invoke a command on multiple EC2 instances with one rule, you can use the
     * <code>RunCommandParameters</code> field.
     * </p>
     * <p>
     * To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate
     * permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based policies. For
     * EC2 instances, Kinesis data streams, and AWS Step Functions state machines, CloudWatch Events relies on IAM roles
     * that you specify in the <code>RoleARN</code> argument in <code>PutTargets</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/auth-and-access-control-cwe.html">Authentication
     * and Access Control</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * If another AWS account is in the same region and has granted you permission (using <code>PutPermission</code>),
     * you can send events to that account. Set that account's event bus as a target of the rules in your account. To
     * send the matched events to the other account, specify that account's event bus as the <code>Arn</code> value when
     * you run <code>PutTargets</code>. If your account sends events to another account, your account is charged for
     * each sent event. Each event sent to another account is charged as a custom event. The account receiving the event
     * is not charged. For more information, see <a href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
     * Pricing</a>.
     * </p>
     * <p>
     * If you are setting the event bus of another account as the target, and that account granted permission to your
     * account through an organization instead of directly by the account ID, then you must specify a
     * <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEvents-CrossAccountEventDelivery.html">
     * Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * For more information about enabling cross-account events, see <a>PutPermission</a>.
     * </p>
     * <p>
     * <b>Input</b>, <b>InputPath</b>, and <b>InputTransformer</b> are mutually exclusive and optional parameters of a
     * target. When a rule is triggered due to a matched event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If none of the following arguments are specified for a target, then the entire event is passed to the target in
     * JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event
     * is passed to the target).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>Input</b> is specified in the form of valid JSON, then the matched event is overridden with this constant.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>InputPath</b> is specified in the form of JSONPath (for example, <code>$.detail</code>), then only the part
     * of the event specified in the path is passed to the target (for example, only the detail part of the event is
     * passed).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <b>InputTransformer</b> is specified, then one or more specified JSONPaths are extracted from the event and
     * used as values in a template that you specify as the input to the target.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>InputPath</code> or <code>InputTransformer</code>, you must use JSON dot notation, not
     * bracket notation.
     * </p>
     * <p>
     * When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
     * immediately invoked. Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is non-zero in the response and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param putTargetsRequest
     * @return Result of the PutTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws LimitExceededException
     *         You tried to create more rules or add more targets to a rule than is allowed.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutTargets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutTargetsResult putTargets(PutTargetsRequest request) {
        request = beforeClientExecution(request);
        return executePutTargets(request);
    }

    @SdkInternalApi
    final PutTargetsResult executePutTargets(PutTargetsRequest putTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(putTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutTargetsRequest> request = null;
        Response<PutTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutTargetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes the permission of another AWS account to be able to put events to your default event bus. Specify the
     * account to revoke by the <code>StatementId</code> value that you associated with the account when you granted it
     * permission with <code>PutPermission</code>. You can find the <code>StatementId</code> by using
     * <a>DescribeEventBus</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @sample AmazonCloudWatchEvents.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemovePermission(request);
    }

    @SdkInternalApi
    final RemovePermissionResult executeRemovePermission(RemovePermissionRequest removePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<RemovePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemovePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemovePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemovePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemovePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
     * invoked.
     * </p>
     * <p>
     * When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow
     * a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is non-zero in the response and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param removeTargetsRequest
     * @return Result of the RemoveTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.RemoveTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemoveTargets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTargetsResult removeTargets(RemoveTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTargets(request);
    }

    @SdkInternalApi
    final RemoveTargetsResult executeRemoveTargets(RemoveTargetsRequest removeTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTargetsRequest> request = null;
        Response<RemoveTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch Events resource. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions by granting a user
     * permission to access or change only resources with certain tag values. In CloudWatch Events, rules can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a rule that already has tags. If you specify a new tag key
     * for the rule, this tag is appended to the list of tags associated with the rule. If you specify a tag key that is
     * already associated with the rule, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @sample AmazonCloudWatchEvents.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
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
     * Tests whether the specified event pattern matches the provided event.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, CloudWatch
     * Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating
     * event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     * @return Result of the TestEventPattern operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is not valid.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.TestEventPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/TestEventPattern" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestEventPatternResult testEventPattern(TestEventPatternRequest request) {
        request = beforeClientExecution(request);
        return executeTestEventPattern(request);
    }

    @SdkInternalApi
    final TestEventPatternResult executeTestEventPattern(TestEventPatternRequest testEventPatternRequest) {

        ExecutionContext executionContext = createExecutionContext(testEventPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestEventPatternRequest> request = null;
        Response<TestEventPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestEventPatternRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testEventPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestEventPattern");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestEventPatternResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestEventPatternResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified CloudWatch Events resource. In CloudWatch Events, rules can be
     * tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @sample AmazonCloudWatchEvents.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Events");
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
