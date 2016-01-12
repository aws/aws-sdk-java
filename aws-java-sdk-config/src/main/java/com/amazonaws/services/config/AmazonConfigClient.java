/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.config.model.*;
import com.amazonaws.services.config.model.transform.*;

/**
 * Client for accessing Config Service. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Config</fullname>
 * <p>
 * AWS Config provides a way to keep track of the configurations of all the AWS
 * resources associated with your AWS account. You can use AWS Config to get the
 * current and historical configurations of each AWS resource and also to get
 * information about the relationship between the resources. An AWS resource can
 * be an Amazon Compute Cloud (Amazon EC2) instance, an Elastic Block Store
 * (EBS) volume, an Elastic network Interface (ENI), or a security group. For a
 * complete list of resources currently supported by AWS Config, see <a href=
 * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported AWS Resources</a>.
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management Console, the
 * AWS Command Line Interface (AWS CLI), the AWS Config API, or the AWS SDKs for
 * AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and the
 * AWS CLI commands that you can use to manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing
 * requests. For more information about how to sign a request with this
 * protocol, see <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * For detailed information about AWS Config features and their associated
 * actions or commands, as well as how to work with AWS Management Console, see
 * <a href=
 * "http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html"
 * >What Is AWS Config?</a> in the <i>AWS Config Developer Guide</i>.
 * </p>
 */
public class AmazonConfigClient extends AmazonWebServiceClient implements
        AmazonConfig {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConfig.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "config";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "config";

    /**
     * List of exception unmarshallers for all Config Service exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Config Service. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonConfigClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Config Service. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Config Service (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonConfigClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using
     * the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonConfigClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using
     * the specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Config Service (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonConfigClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using
     * the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using
     * the specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Config Service (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using
     * the specified AWS account credentials provider, client configuration
     * options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Config Service (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.ResourceInUseException.class,
                        "ResourceInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoAvailableDeliveryChannelException.class,
                        "NoAvailableDeliveryChannelException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidResultTokenException.class,
                        "InvalidResultTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidParameterValueException.class,
                        "InvalidParameterValueException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidLimitException.class,
                        "InvalidLimitException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidConfigurationRecorderNameException.class,
                        "InvalidConfigurationRecorderNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.MaxNumberOfConfigurationRecordersExceededException.class,
                        "MaxNumberOfConfigurationRecordersExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.LastDeliveryChannelDeleteFailedException.class,
                        "LastDeliveryChannelDeleteFailedException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.config.model.ValidationException.class,
                "ValidationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidNextTokenException.class,
                        "InvalidNextTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidS3KeyPrefixException.class,
                        "InvalidS3KeyPrefixException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoSuchConfigurationRecorderException.class,
                        "NoSuchConfigurationRecorderException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidTimeRangeException.class,
                        "InvalidTimeRangeException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidSNSTopicARNException.class,
                        "InvalidSNSTopicARNException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoAvailableConfigurationRecorderException.class,
                        "NoAvailableConfigurationRecorderException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidRecordingGroupException.class,
                        "InvalidRecordingGroupException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoSuchDeliveryChannelException.class,
                        "NoSuchDeliveryChannelException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.MaxNumberOfConfigRulesExceededException.class,
                        "MaxNumberOfConfigRulesExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoSuchConfigRuleException.class,
                        "NoSuchConfigRuleException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.MaxNumberOfDeliveryChannelsExceededException.class,
                        "MaxNumberOfDeliveryChannelsExceededException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.config.model.InvalidRoleException.class,
                "InvalidRoleException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InsufficientPermissionsException.class,
                        "InsufficientPermissionsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.ResourceNotDiscoveredException.class,
                        "ResourceNotDiscoveredException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InvalidDeliveryChannelNameException.class,
                        "InvalidDeliveryChannelNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.InsufficientDeliveryPolicyException.class,
                        "InsufficientDeliveryPolicyException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoRunningConfigurationRecorderException.class,
                        "NoRunningConfigurationRecorderException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.config.model.NoSuchBucketException.class,
                        "NoSuchBucketException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("config.us-east-1.amazonaws.com/");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/config/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/config/request.handler2s"));
    }

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until the
     * deletion is complete. You cannot update a rule while it is in this state.
     * If you make a <code>PutConfigRule</code> request for the rule, you will
     * receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the
     * <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify
     *         that the rule names are correct and try again.
     * @throws ResourceInUseException
     *         The rule is currently being deleted. Wait for a while and try
     *         again.
     * @sample AmazonConfig.DeleteConfigRule
     */
    @Override
    public void deleteConfigRule(DeleteConfigRuleRequest deleteConfigRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigRuleRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery channel
     * and the configuration recorder is still running. To delete the delivery
     * channel, stop the running configuration recorder using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action
     *        accepts the following data in JSON format.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @throws LastDeliveryChannelDeleteFailedException
     *         You cannot delete the delivery channel you specified because the
     *         configuration recorder is running.
     * @sample AmazonConfig.DeleteDeliveryChannel
     */
    @Override
    public void deleteDeliveryChannel(
            DeleteDeliveryChannelRequest deleteDeliveryChannelRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeliveryChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryChannelRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryChannelRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteDeliveryChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in
     * the specified delivery channel. After the delivery has started, AWS
     * Config sends following notifications using an Amazon SNS topic that you
     * have specified.
     * </p>
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was successfully
     * completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to complete.
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @return Result of the DeliverConfigSnapshot operation returned by the
     *         service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the
     *         role needed to describe your resources. Create a configuration
     *         recorder.
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @sample AmazonConfig.DeliverConfigSnapshot
     */
    @Override
    public DeliverConfigSnapshotResult deliverConfigSnapshot(
            DeliverConfigSnapshotRequest deliverConfigSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deliverConfigSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeliverConfigSnapshotRequest> request = null;
        Response<DeliverConfigSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeliverConfigSnapshotRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deliverConfigSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeliverConfigSnapshotResult> responseHandler = new JsonResponseHandler<DeliverConfigSnapshotResult>(
                    new DeliverConfigSnapshotResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a rule
     * is noncompliant, this action returns the number of AWS resources that do
     * not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it, and
     * it is noncompliant if any of these resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it returns
     * <code>InsufficientData</code>. This result might indicate one of the
     * following conditions:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the <code>DescribeConfigRuleEvaluationStatus</code>
     * action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation results
     * to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the AWS
     * Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur if
     * the resources were deleted or removed from the rule's scope.</li>
     * </ul>
     * </p>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @return Result of the DescribeComplianceByConfigRule operation returned
     *         by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify
     *         that the rule names are correct and try again.
     * @sample AmazonConfig.DescribeComplianceByConfigRule
     */
    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(
            DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeComplianceByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComplianceByConfigRuleRequest> request = null;
        Response<DescribeComplianceByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComplianceByConfigRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeComplianceByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeComplianceByConfigRuleResult> responseHandler = new JsonResponseHandler<DescribeComplianceByConfigRuleResult>(
                    new DescribeComplianceByConfigRuleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule() {
        return describeComplianceByConfigRule(new DescribeComplianceByConfigRuleRequest());
    }

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a
     * resource is noncompliant, this action returns the number of AWS Config
     * rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules that
     * evaluate it. It is noncompliant if it does not comply with one or more of
     * these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it
     * returns <code>InsufficientData</code>. This result might indicate one of
     * the following conditions about the rules that evaluate the resource:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the <code>DescribeConfigRuleEvaluationStatus</code>
     * action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation results
     * to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the AWS
     * Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur if
     * the resources were deleted or removed from the rule's scope.</li>
     * </ul>
     * </p>
     * 
     * @param describeComplianceByResourceRequest
     * @return Result of the DescribeComplianceByResource operation returned by
     *         the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the
     *         <code>nextToken</code> string that was returned in the previous
     *         response to get the next page of results.
     * @sample AmazonConfig.DescribeComplianceByResource
     */
    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource(
            DescribeComplianceByResourceRequest describeComplianceByResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(describeComplianceByResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComplianceByResourceRequest> request = null;
        Response<DescribeComplianceByResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComplianceByResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeComplianceByResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeComplianceByResourceResult> responseHandler = new JsonResponseHandler<DescribeComplianceByResourceResult>(
                    new DescribeComplianceByResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource() {
        return describeComplianceByResource(new DescribeComplianceByResourceRequest());
    }

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules. The
     * status includes information such as the last time AWS Config invoked the
     * rule, the last time AWS Config failed to invoke the rule, and the related
     * error for the last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @return Result of the DescribeConfigRuleEvaluationStatus operation
     *         returned by the service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify
     *         that the rule names are correct and try again.
     * @sample AmazonConfig.DescribeConfigRuleEvaluationStatus
     */
    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigRuleEvaluationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigRuleEvaluationStatusRequest> request = null;
        Response<DescribeConfigRuleEvaluationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigRuleEvaluationStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConfigRuleEvaluationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConfigRuleEvaluationStatusResult> responseHandler = new JsonResponseHandler<DescribeConfigRuleEvaluationStatusResult>(
                    new DescribeConfigRuleEvaluationStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus() {
        return describeConfigRuleEvaluationStatus(new DescribeConfigRuleEvaluationStatusRequest());
    }

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @return Result of the DescribeConfigRules operation returned by the
     *         service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify
     *         that the rule names are correct and try again.
     * @sample AmazonConfig.DescribeConfigRules
     */
    @Override
    public DescribeConfigRulesResult describeConfigRules(
            DescribeConfigRulesRequest describeConfigRulesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigRulesRequest> request = null;
        Response<DescribeConfigRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigRulesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConfigRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConfigRulesResult> responseHandler = new JsonResponseHandler<DescribeConfigRulesResult>(
                    new DescribeConfigRulesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules() {
        return describeConfigRules(new DescribeConfigRulesRequest());
    }

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a
     * configuration recorder is not specified, this action returns the status
     * of all configuration recorder associated with the account.
     * </p>
     * <note>Currently, you can specify only one configuration recorder per
     * account.</note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a>
     *        action.
     * @return Result of the DescribeConfigurationRecorderStatus operation
     *         returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DescribeConfigurationRecorderStatus
     */
    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationRecorderStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRecorderStatusRequest> request = null;
        Response<DescribeConfigurationRecorderStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRecorderStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConfigurationRecorderStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConfigurationRecorderStatusResult> responseHandler = new JsonResponseHandler<DescribeConfigurationRecorderStatusResult>(
                    new DescribeConfigurationRecorderStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() {
        return describeConfigurationRecorderStatus(new DescribeConfigurationRecorderStatusRequest());
    }

    /**
     * <p>
     * Returns the name of one or more specified configuration recorders. If the
     * recorder name is not specified, this action returns the names of all the
     * configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @return Result of the DescribeConfigurationRecorders operation returned
     *         by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DescribeConfigurationRecorders
     */
    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(
            DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationRecordersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRecordersRequest> request = null;
        Response<DescribeConfigurationRecordersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRecordersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConfigurationRecordersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConfigurationRecordersResult> responseHandler = new JsonResponseHandler<DescribeConfigurationRecordersResult>(
                    new DescribeConfigurationRecordersResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() {
        return describeConfigurationRecorders(new DescribeConfigurationRecordersRequest());
    }

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current status
     * of all delivery channels associated with the account.
     * </p>
     * <note>Currently, you can specify only one delivery channel per
     * account.</note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @return Result of the DescribeDeliveryChannelStatus operation returned by
     *         the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @sample AmazonConfig.DescribeDeliveryChannelStatus
     */
    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(
            DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeliveryChannelStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryChannelStatusRequest> request = null;
        Response<DescribeDeliveryChannelStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryChannelStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeDeliveryChannelStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDeliveryChannelStatusResult> responseHandler = new JsonResponseHandler<DescribeDeliveryChannelStatusResult>(
                    new DescribeDeliveryChannelStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() {
        return describeDeliveryChannelStatus(new DescribeDeliveryChannelStatusRequest());
    }

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all delivery
     * channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @return Result of the DescribeDeliveryChannels operation returned by the
     *         service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @sample AmazonConfig.DescribeDeliveryChannels
     */
    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels(
            DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeliveryChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryChannelsRequest> request = null;
        Response<DescribeDeliveryChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryChannelsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeDeliveryChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDeliveryChannelsResult> responseHandler = new JsonResponseHandler<DescribeDeliveryChannelsResult>(
                    new DescribeDeliveryChannelsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels() {
        return describeDeliveryChannels(new DescribeDeliveryChannelsRequest());
    }

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The
     * results indicate which AWS resources were evaluated by the rule, when
     * each resource was last evaluated, and whether each resource complies with
     * the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @return Result of the GetComplianceDetailsByConfigRule operation returned
     *         by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the
     *         <code>nextToken</code> string that was returned in the previous
     *         response to get the next page of results.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify
     *         that the rule names are correct and try again.
     * @sample AmazonConfig.GetComplianceDetailsByConfigRule
     */
    @Override
    public GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(
            GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(getComplianceDetailsByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceDetailsByConfigRuleRequest> request = null;
        Response<GetComplianceDetailsByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceDetailsByConfigRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getComplianceDetailsByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetComplianceDetailsByConfigRuleResult> responseHandler = new JsonResponseHandler<GetComplianceDetailsByConfigRuleResult>(
                    new GetComplianceDetailsByConfigRuleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The
     * results indicate which AWS Config rules were used to evaluate the
     * resource, when each rule was last used, and whether the resource complies
     * with each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @return Result of the GetComplianceDetailsByResource operation returned
     *         by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @sample AmazonConfig.GetComplianceDetailsByResource
     */
    @Override
    public GetComplianceDetailsByResourceResult getComplianceDetailsByResource(
            GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(getComplianceDetailsByResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceDetailsByResourceRequest> request = null;
        Response<GetComplianceDetailsByResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceDetailsByResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getComplianceDetailsByResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetComplianceDetailsByResourceResult> responseHandler = new JsonResponseHandler<GetComplianceDetailsByResourceResult>(
                    new GetComplianceDetailsByResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and
     * noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @return Result of the GetComplianceSummaryByConfigRule operation returned
     *         by the service.
     * @sample AmazonConfig.GetComplianceSummaryByConfigRule
     */
    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(
            GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(getComplianceSummaryByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceSummaryByConfigRuleRequest> request = null;
        Response<GetComplianceSummaryByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceSummaryByConfigRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getComplianceSummaryByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetComplianceSummaryByConfigRuleResult> responseHandler = new JsonResponseHandler<GetComplianceSummaryByConfigRuleResult>(
                    new GetComplianceSummaryByConfigRuleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule() {
        return getComplianceSummaryByConfigRule(new GetComplianceSummaryByConfigRuleRequest());
    }

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that
     * are noncompliant. You can specify one or more resource types to get these
     * numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @return Result of the GetComplianceSummaryByResourceType operation
     *         returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @sample AmazonConfig.GetComplianceSummaryByResourceType
     */
    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest) {
        ExecutionContext executionContext = createExecutionContext(getComplianceSummaryByResourceTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceSummaryByResourceTypeRequest> request = null;
        Response<GetComplianceSummaryByResourceTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceSummaryByResourceTypeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getComplianceSummaryByResourceTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetComplianceSummaryByResourceTypeResult> responseHandler = new JsonResponseHandler<GetComplianceSummaryByResourceTypeResult>(
                    new GetComplianceSummaryByResourceTypeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType() {
        return getComplianceSummaryByResourceType(new GetComplianceSummaryByResourceTypeRequest());
    }

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval.
     * </p>
     * <p>
     * The response is paginated, and by default, AWS Config returns a limit of
     * 10 configuration items per page. You can customize this number with the
     * <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results, run
     * the request again and enter this string for the <code>nextToken</code>
     * parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is
     * likely that the number of records returned is smaller than the specified
     * <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @return Result of the GetResourceConfigHistory operation returned by the
     *         service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidTimeRangeException
     *         The specified time range is not valid. The earlier time is not
     *         chronologically before the later time.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the
     *         <code>nextToken</code> string that was returned in the previous
     *         response to get the next page of results.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the
     *         role needed to describe your resources. Create a configuration
     *         recorder.
     * @throws ResourceNotDiscoveredException
     *         You have specified a resource that is either unknown or has not
     *         been discovered.
     * @sample AmazonConfig.GetResourceConfigHistory
     */
    @Override
    public GetResourceConfigHistoryResult getResourceConfigHistory(
            GetResourceConfigHistoryRequest getResourceConfigHistoryRequest) {
        ExecutionContext executionContext = createExecutionContext(getResourceConfigHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceConfigHistoryRequest> request = null;
        Response<GetResourceConfigHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceConfigHistoryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getResourceConfigHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetResourceConfigHistoryResult> responseHandler = new JsonResponseHandler<GetResourceConfigHistoryResult>(
                    new GetResourceConfigHistoryResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for
     * the resources of that type. A resource identifier includes the resource
     * type, ID, and (if available) the custom resource name. The results
     * consist of resources that AWS Config has discovered, including those that
     * AWS Config is not currently recording. You can narrow the results to
     * include only resources that have specific resource IDs or a resource
     * name.
     * </p>
     * <note>You can specify either resource IDs or a resource name but not both
     * in the same request.</note>
     * <p>
     * The response is paginated, and by default AWS Config lists 100 resource
     * identifiers on each page. You can customize this number with the
     * <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results, run
     * the request again and enter this string for the <code>nextToken</code>
     * parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return Result of the ListDiscoveredResources operation returned by the
     *         service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the
     *         <code>nextToken</code> string that was returned in the previous
     *         response to get the next page of results.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the
     *         role needed to describe your resources. Create a configuration
     *         recorder.
     * @sample AmazonConfig.ListDiscoveredResources
     */
    @Override
    public ListDiscoveredResourcesResult listDiscoveredResources(
            ListDiscoveredResourcesRequest listDiscoveredResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDiscoveredResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDiscoveredResourcesRequest> request = null;
        Response<ListDiscoveredResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDiscoveredResourcesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listDiscoveredResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDiscoveredResourcesResult> responseHandler = new JsonResponseHandler<ListDiscoveredResourcesResult>(
                    new ListDiscoveredResourcesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS
     * resources comply with your desired configurations.
     * </p>
     * <p>
     * You can use this action for customer managed Config rules and AWS managed
     * Config rules. A customer managed Config rule is a custom rule that you
     * develop and maintain. An AWS managed Config rule is a customizable,
     * predefined rule that is provided by AWS Config.
     * </p>
     * <p>
     * If you are adding a new customer managed Config rule, you must first
     * create the AWS Lambda function that the rule invokes to evaluate your
     * resources. When you use the <code>PutConfigRule</code> action to add the
     * rule to AWS Config, you must specify the Amazon Resource Name (ARN) that
     * AWS Lambda assigns to the function. Specify the ARN for the
     * <code>SourceIdentifier</code> key. This key is part of the
     * <code>Source</code> object, which is part of the <code>ConfigRule</code>
     * object.
     * </p>
     * <p>
     * If you are adding a new AWS managed Config rule, specify the rule's
     * identifier for the <code>SourceIdentifier</code> key. To reference AWS
     * managed Config rule identifiers, see <a href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     * >Using AWS Managed Config Rules</a>.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in
     * the <code>ConfigRule</code> object. Do not specify the
     * <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values
     * are generated by AWS Config for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you have added previously, specify the
     * rule's <code>ConfigRuleName</code>, <code>ConfigRuleId</code>, or
     * <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that
     * you use in this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 25.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see <a
     * href=
     * "http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html"
     * >Evaluating AWS Resource Configurations with AWS Config</a> in the <i>AWS
     * Config Developer Guide</i>.
     * </p>
     * <p/>
     * 
     * @param putConfigRuleRequest
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @throws MaxNumberOfConfigRulesExceededException
     *         Failed to add the AWS Config rule because the account already
     *         contains the maximum number of 25 rules. Consider deleting any
     *         deactivated rules before adding new rules.
     * @throws ResourceInUseException
     *         The rule is currently being deleted. Wait for a while and try
     *         again.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:
     *         </p>
     *         <ul>
     *         <li>The rule cannot be created because the IAM role assigned to
     *         AWS Config lacks permissions to perform the config:Put* action.</li>
     *         <li>The AWS Lambda function cannot be invoked. Check the function
     *         ARN, and check the function's permissions.</li>
     * @sample AmazonConfig.PutConfigRule
     */
    @Override
    public void putConfigRule(PutConfigRuleRequest putConfigRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(putConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigRuleRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigRuleRequestMarshaller().marshall(super
                        .beforeMarshalling(putConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> and/or
     * the <code>recordingGroup</code> of an existing recorder. To change the
     * role, call the action on the existing configuration recorder and specify
     * a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the
     * <b>recordingGroup</b> parameter specified, the default is to record all
     * supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @throws MaxNumberOfConfigurationRecordersExceededException
     *         You have reached the limit on the number of recorders you can
     *         create.
     * @throws InvalidConfigurationRecorderNameException
     *         You have provided a configuration recorder name that is not
     *         valid.
     * @throws InvalidRoleException
     *         You have provided a null or empty role ARN.
     * @throws InvalidRecordingGroupException
     *         AWS Config throws an exception if the recording group does not
     *         contain a valid list of resource types. Invalid values could also
     *         be incorrectly formatted.
     * @sample AmazonConfig.PutConfigurationRecorder
     */
    @Override
    public void putConfigurationRecorder(
            PutConfigurationRecorderRequest putConfigurationRecorderRequest) {
        ExecutionContext executionContext = createExecutionContext(putConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationRecorderRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationRecorderRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS
     * topic of the existing delivery channel. To change the Amazon S3 bucket or
     * an Amazon SNS topic, call this action and specify the changed values for
     * the S3 bucket and the SNS topic. If you specify a different value for
     * either the S3 bucket or the SNS topic, this action will keep the existing
     * value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @throws MaxNumberOfDeliveryChannelsExceededException
     *         You have reached the limit on the number of delivery channels you
     *         can create.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the
     *         role needed to describe your resources. Create a configuration
     *         recorder.
     * @throws InvalidDeliveryChannelNameException
     *         The specified delivery channel name is not valid.
     * @throws NoSuchBucketException
     *         The specified Amazon S3 bucket does not exist.
     * @throws InvalidS3KeyPrefixException
     *         The specified Amazon S3 key prefix is not valid.
     * @throws InvalidSNSTopicARNException
     *         The specified Amazon SNS topic does not exist.
     * @throws InsufficientDeliveryPolicyException
     *         Your Amazon S3 bucket policy does not permit AWS Config to write
     *         to it.
     * @sample AmazonConfig.PutDeliveryChannel
     */
    @Override
    public void putDeliveryChannel(
            PutDeliveryChannelRequest putDeliveryChannelRequest) {
        ExecutionContext executionContext = createExecutionContext(putDeliveryChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliveryChannelRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliveryChannelRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putDeliveryChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS
     * Config. This action is required in every AWS Lambda function that is
     * invoked by an AWS Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @return Result of the PutEvaluations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that
     *         your parameters are valid and try again.
     * @throws InvalidResultTokenException
     *         The result token is invalid.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify
     *         that the rule names are correct and try again.
     * @sample AmazonConfig.PutEvaluations
     */
    @Override
    public PutEvaluationsResult putEvaluations(
            PutEvaluationsRequest putEvaluationsRequest) {
        ExecutionContext executionContext = createExecutionContext(putEvaluationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEvaluationsRequest> request = null;
        Response<PutEvaluationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEvaluationsRequestMarshaller().marshall(super
                        .beforeMarshalling(putEvaluationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutEvaluationsResult> responseHandler = new JsonResponseHandler<PutEvaluationsResult>(
                    new PutEvaluationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have selected to
     * record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start
     * the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @throws NoAvailableDeliveryChannelException
     *         There is no delivery channel available to record configurations.
     * @sample AmazonConfig.StartConfigurationRecorder
     */
    @Override
    public void startConfigurationRecorder(
            StartConfigurationRecorderRequest startConfigurationRecorderRequest) {
        ExecutionContext executionContext = createExecutionContext(startConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigurationRecorderRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigurationRecorderRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(startConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected to
     * record in your AWS account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        <p>
     *        The input for the <a>StopConfigurationRecorder</a> action.
     *        </p>
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.StopConfigurationRecorder
     */
    @Override
    public void stopConfigurationRecorder(
            StopConfigurationRecorderRequest stopConfigurationRecorderRequest) {
        ExecutionContext executionContext = createExecutionContext(stopConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopConfigurationRecorderRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopConfigurationRecorderRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(stopConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
