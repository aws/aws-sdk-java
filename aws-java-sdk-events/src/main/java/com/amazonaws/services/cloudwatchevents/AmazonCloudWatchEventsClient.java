/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
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

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.services.cloudwatchevents.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Events. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon CloudWatch Events helps you to respond to state changes in your AWS resources. When your resources change
 * state they automatically send events into an event stream. You can create rules that match selected events in the
 * stream and route them to targets to take action. You can also use rules to take action on a pre-determined schedule.
 * For example, you can configure rules to:
 * </p>
 * <ul>
 * <li>Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2
 * instance enters the running state.</li>
 * <li>Direct specific API records from CloudTrail to an Amazon Kinesis stream for detailed analysis of potential
 * security or availability risks.</li>
 * <li>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</li>
 * </ul>
 * <p>
 * For more information about Amazon CloudWatch Events features, see the <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide">Amazon CloudWatch Developer Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonCloudWatchEventsClient extends AmazonWebServiceClient implements AmazonCloudWatchEvents {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudWatchEvents.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "events";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
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
                    new JsonErrorShapeMetadata().withErrorCode("InvalidEventPatternException").withModeledClass(
                            com.amazonaws.services.cloudwatchevents.model.InvalidEventPatternException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                            com.amazonaws.services.cloudwatchevents.model.InternalException.class))
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
     */
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
     */
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
     */
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
     */
    public AmazonCloudWatchEventsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonCloudWatchEventsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Deletes a rule. You must remove all targets from a rule using <a>RemoveTargets</a> before you can delete the
     * rule.
     * </p>
     * <p>
     * <b>Note:</b> When you delete a rule, incoming events might still continue to match to the deleted rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param deleteRuleRequest
     *        Container for the parameters to the <a>DeleteRule</a> operation.
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DeleteRule
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Describes the details of the specified rule.
     * </p>
     * 
     * @param describeRuleRequest
     *        Container for the parameters to the <a>DescribeRule</a> operation.
     * @return Result of the DescribeRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DescribeRule
     */
    @Override
    public DescribeRuleResult describeRule(DescribeRuleRequest describeRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuleRequest> request = null;
        Response<DescribeRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuleRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Disables a rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule expression.
     * </p>
     * <p>
     * <b>Note:</b> When you disable a rule, incoming events might still continue to match to the disabled rule. Please
     * allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     *        Container for the parameters to the <a>DisableRule</a> operation.
     * @return Result of the DisableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.DisableRule
     */
    @Override
    public DisableRuleResult disableRule(DisableRuleRequest disableRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(disableRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRuleRequest> request = null;
        Response<DisableRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRuleRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Enables a rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * <b>Note:</b> When you enable a rule, incoming events might not immediately start matching to a newly enabled
     * rule. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     *        Container for the parameters to the <a>EnableRule</a> operation.
     * @return Result of the EnableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.EnableRule
     */
    @Override
    public EnableRuleResult enableRule(EnableRuleRequest enableRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(enableRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRuleRequest> request = null;
        Response<EnableRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRuleRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists the names of the rules that the given target is put to. You can see which of the rules in Amazon CloudWatch
     * Events can invoke a specific target in your account. If you have more rules in your account than the given limit,
     * the results will be paginated. In that case, use the next token returned in the response and repeat
     * ListRulesByTarget until the NextToken in the response is returned as null.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     *        Container for the parameters to the <a>ListRuleNamesByTarget</a> operation.
     * @return Result of the ListRuleNamesByTarget operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListRuleNamesByTarget
     */
    @Override
    public ListRuleNamesByTargetResult listRuleNamesByTarget(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(listRuleNamesByTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleNamesByTargetRequest> request = null;
        Response<ListRuleNamesByTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleNamesByTargetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRuleNamesByTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists the Amazon CloudWatch Events rules in your account. You can either list all the rules or you can provide a
     * prefix to match to the rule names. If you have more rules in your account than the given limit, the results will
     * be paginated. In that case, use the next token returned in the response and repeat ListRules until the NextToken
     * in the response is returned as null.
     * </p>
     * 
     * @param listRulesRequest
     *        Container for the parameters to the <a>ListRules</a> operation.
     * @return Result of the ListRules operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListRules
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest listRulesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists of targets assigned to the rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     *        Container for the parameters to the <a>ListTargetsByRule</a> operation.
     * @return Result of the ListTargetsByRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.ListTargetsByRule
     */
    @Override
    public ListTargetsByRuleResult listTargetsByRule(ListTargetsByRuleRequest listTargetsByRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(listTargetsByRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsByRuleRequest> request = null;
        Response<ListTargetsByRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsByRuleRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetsByRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *        Container for the parameters to the <a>PutEvents</a> operation.
     * @return Result of the PutEvents operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutEvents
     */
    @Override
    public PutEventsResult putEvents(PutEventsRequest putEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(putEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventsRequest> request = null;
        Response<PutEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates or updates a rule. Rules are enabled by default, or based on value of the State parameter. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * <b>Note:</b> When you create or update a rule, incoming events might not immediately start matching to new or
     * updated rules. Please allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule will trigger on matching events as
     * well as on a schedule.
     * </p>
     * <p>
     * <b>Note:</b> Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However,
     * CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when
     * creating event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param putRuleRequest
     *        Container for the parameters to the <a>PutRule</a> operation.
     * @return Result of the PutRule operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is invalid.
     * @throws LimitExceededException
     *         This exception occurs if you try to create more rules or add more targets to a rule than allowed by
     *         default.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutRule
     */
    @Override
    public PutRuleResult putRule(PutRuleRequest putRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(putRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRuleRequest> request = null;
        Response<PutRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRuleRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Adds target(s) to a rule. Targets are the resources that can be invoked when a rule is triggered. For example,
     * AWS Lambda functions, Amazon Kinesis streams, and built-in targets. Updates the target(s) if they are already
     * associated with the role. In other words, if there is already a target with the given target ID, then the target
     * associated with that ID is updated.
     * </p>
     * <p>
     * In order to be able to make API calls against the resources you own, Amazon CloudWatch Events needs the
     * appropriate permissions. For AWS Lambda and Amazon SNS resources, CloudWatch Events relies on resource-based
     * policies. For Amazon Kinesis streams, CloudWatch Events relies on IAM roles. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/EventsTargetPermissions.html">Permissions
     * for Sending Events to Targets</a> in the <b><i>Amazon CloudWatch Developer Guide</i></b>.
     * </p>
     * <p>
     * <b>Input</b> and <b>InputPath</b> are mutually-exclusive and optional parameters of a target. When a rule is
     * triggered due to a matched event, if for a target:
     * </p>
     * <ul>
     * <li>Neither <b>Input</b> nor <b>InputPath</b> is specified, then the entire event is passed to the target in JSON
     * form.</li>
     * <li><b>InputPath</b> is specified in the form of JSONPath (e.g. <b>$.detail</b>), then only the part of the event
     * specified in the path is passed to the target (e.g. only the detail part of the event is passed).</li>
     * <li><b>Input</b> is specified in the form of a valid JSON, then the matched event is overridden with this
     * constant.</li>
     * </ul>
     * <p>
     * <b>Note:</b> When you add targets to a rule, when the associated rule triggers, new or updated targets might not
     * be immediately invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param putTargetsRequest
     *        Container for the parameters to the <a>PutTargets</a> operation.
     * @return Result of the PutTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws LimitExceededException
     *         This exception occurs if you try to create more rules or add more targets to a rule than allowed by
     *         default.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.PutTargets
     */
    @Override
    public PutTargetsResult putTargets(PutTargetsRequest putTargetsRequest) {
        ExecutionContext executionContext = createExecutionContext(putTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutTargetsRequest> request = null;
        Response<PutTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutTargetsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Removes target(s) from a rule so that when the rule is triggered, those targets will no longer be invoked.
     * </p>
     * <p>
     * <b>Note:</b> When you remove a target, when the associated rule triggers, removed targets might still continue to
     * be invoked. Please allow a short period of time for changes to take effect.
     * </p>
     * 
     * @param removeTargetsRequest
     *        Container for the parameters to the <a>RemoveTargets</a> operation.
     * @return Result of the RemoveTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The rule does not exist.
     * @throws ConcurrentModificationException
     *         This exception occurs if there is concurrent modification on rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.RemoveTargets
     */
    @Override
    public RemoveTargetsResult removeTargets(RemoveTargetsRequest removeTargetsRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTargetsRequest> request = null;
        Response<RemoveTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTargetsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Tests whether an event pattern matches the provided event.
     * </p>
     * <p>
     * <b>Note:</b> Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However,
     * CloudWatch Events uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when
     * creating event patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     *        Container for the parameters to the <a>TestEventPattern</a> operation.
     * @return Result of the TestEventPattern operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is invalid.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonCloudWatchEvents.TestEventPattern
     */
    @Override
    public TestEventPatternResult testEventPattern(TestEventPatternRequest testEventPatternRequest) {
        ExecutionContext executionContext = createExecutionContext(testEventPatternRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestEventPatternRequest> request = null;
        Response<TestEventPatternResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestEventPatternRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(testEventPatternRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
