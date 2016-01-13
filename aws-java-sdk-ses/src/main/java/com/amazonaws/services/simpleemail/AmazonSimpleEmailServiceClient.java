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
package com.amazonaws.services.simpleemail;

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

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.services.simpleemail.model.transform.*;

/**
 * Client for accessing Amazon SES. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This
 * documentation is intended to be used in conjunction with the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <note>For a list of Amazon SES endpoints to use in service requests, see <a
 * href
 * ="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions
 * and Amazon SES</a> in the Amazon SES Developer Guide. </note>
 */
public class AmazonSimpleEmailServiceClient extends AmazonWebServiceClient
        implements AmazonSimpleEmailService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonSimpleEmailService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ses";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "email";

    /**
     * List of exception unmarshallers for all Amazon SES exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon SES. A
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
    public AmazonSimpleEmailServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES. A
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
     *        connects to Amazon SES (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleEmailServiceClient(
            ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonSimpleEmailServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the
     * specified AWS account credentials and client configuration options.
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
     *        connects to Amazon SES (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleEmailServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonSimpleEmailServiceClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the
     * specified AWS account credentials provider and client configuration
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
     *        connects to Amazon SES (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleEmailServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
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
     *        connects to Amazon SES (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonSimpleEmailServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidSnsTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RuleDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CannotDeleteExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidS3ConfigurationExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidLambdaFunctionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MessageRejectedExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new RuleSetDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://email.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/simpleemail/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/simpleemail/request.handler2s"));
    }

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest
     * @return Result of the CloneReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CloneReceiptRuleSet
     */
    @Override
    public CloneReceiptRuleSetResult cloneReceiptRuleSet(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(cloneReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneReceiptRuleSetRequest> request = null;
        Response<CloneReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(cloneReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CloneReceiptRuleSetResult> responseHandler = new StaxResponseHandler<CloneReceiptRuleSetResult>(
                    new CloneReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptFilterRequest
     * @return Result of the CreateReceiptFilter operation returned by the
     *         service.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @sample AmazonSimpleEmailService.CreateReceiptFilter
     */
    @Override
    public CreateReceiptFilterResult createReceiptFilter(
            CreateReceiptFilterRequest createReceiptFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(createReceiptFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptFilterRequest> request = null;
        Response<CreateReceiptFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptFilterRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReceiptFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateReceiptFilterResult> responseHandler = new StaxResponseHandler<CreateReceiptFilterResult>(
                    new CreateReceiptFilterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleRequest
     * @return Result of the CreateReceiptRule operation returned by the
     *         service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that
     *         Amazon SES could not publish to the topic, possibly due to
     *         permissions issues. For information about giving permissions, see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS
     *         encryption key is invalid, or that Amazon SES could not publish
     *         to the bucket, possibly due to permissions issues. For
     *         information about giving permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or
     *         that Amazon SES could not execute the provided function, possibly
     *         due to permissions issues. For information about giving
     *         permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRule
     */
    @Override
    public CreateReceiptRuleResult createReceiptRule(
            CreateReceiptRuleRequest createReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(createReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptRuleRequest> request = null;
        Response<CreateReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateReceiptRuleResult> responseHandler = new StaxResponseHandler<CreateReceiptRuleResult>(
                    new CreateReceiptRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest
     * @return Result of the CreateReceiptRuleSet operation returned by the
     *         service.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created due to a naming
     *         conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRuleSet
     */
    @Override
    public CreateReceiptRuleSetResult createReceiptRuleSet(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(createReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptRuleSetRequest> request = null;
        Response<CreateReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateReceiptRuleSetResult> responseHandler = new StaxResponseHandler<CreateReceiptRuleSetResult>(
                    new CreateReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified identity (email address or domain) from the list of
     * verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityRequest
     *        Represents a request instructing the service to delete an identity
     *        from the list of identities for the AWS Account.
     * @return Result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteIdentity
     */
    @Override
    public DeleteIdentityResult deleteIdentity(
            DeleteIdentityRequest deleteIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityRequest> request = null;
        Response<DeleteIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteIdentityResult> responseHandler = new StaxResponseHandler<DeleteIdentityResult>(
                    new DeleteIdentityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (email address or domain). This API returns successfully even if a policy
     * with the specified name does not exist.
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest
     *        Represents a request instructing the service to delete an
     *        authorization policy applying to an identity.</p>
     *        <p>
     *        This request succeeds regardless of whether the specified policy
     *        exists.
     * @return Result of the DeleteIdentityPolicy operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.DeleteIdentityPolicy
     */
    @Override
    public DeleteIdentityPolicyResult deleteIdentityPolicy(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityPolicyRequest> request = null;
        Response<DeleteIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteIdentityPolicyResult> responseHandler = new StaxResponseHandler<DeleteIdentityPolicyResult>(
                    new DeleteIdentityPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest
     * @return Result of the DeleteReceiptFilter operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.DeleteReceiptFilter
     */
    @Override
    public DeleteReceiptFilterResult deleteReceiptFilter(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReceiptFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptFilterRequest> request = null;
        Response<DeleteReceiptFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptFilterRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReceiptFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteReceiptFilterResult> responseHandler = new StaxResponseHandler<DeleteReceiptFilterResult>(
                    new DeleteReceiptFilterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest
     * @return Result of the DeleteReceiptRule operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DeleteReceiptRule
     */
    @Override
    public DeleteReceiptRuleResult deleteReceiptRule(
            DeleteReceiptRuleRequest deleteReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptRuleRequest> request = null;
        Response<DeleteReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteReceiptRuleResult> responseHandler = new StaxResponseHandler<DeleteReceiptRuleResult>(
                    new DeleteReceiptRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it
     * contains.
     * </p>
     * <note>The currently active rule set cannot be deleted.</note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest
     * @return Result of the DeleteReceiptRuleSet operation returned by the
     *         service.
     * @throws CannotDeleteException
     *         Indicates that the delete operation could not be completed.
     * @sample AmazonSimpleEmailService.DeleteReceiptRuleSet
     */
    @Override
    public DeleteReceiptRuleSetResult deleteReceiptRuleSet(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptRuleSetRequest> request = null;
        Response<DeleteReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteReceiptRuleSetResult> responseHandler = new StaxResponseHandler<DeleteReceiptRuleSetResult>(
                    new DeleteReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified email address from the list of verified addresses.
     * </p>
     * <important>The DeleteVerifiedEmailAddress action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The DeleteIdentity action is
     * now preferred.</important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request instructing the service to delete an address
     *        from the list of verified email addresses.
     * @sample AmazonSimpleEmailService.DeleteVerifiedEmailAddress
     */
    @Override
    public void deleteVerifiedEmailAddress(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVerifiedEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVerifiedEmailAddressRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVerifiedEmailAddressRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteVerifiedEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest
     * @return Result of the DescribeActiveReceiptRuleSet operation returned by
     *         the service.
     * @sample AmazonSimpleEmailService.DescribeActiveReceiptRuleSet
     */
    @Override
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeActiveReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActiveReceiptRuleSetRequest> request = null;
        Response<DescribeActiveReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActiveReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeActiveReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeActiveReceiptRuleSetResult> responseHandler = new StaxResponseHandler<DescribeActiveReceiptRuleSetResult>(
                    new DescribeActiveReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest
     * @return Result of the DescribeReceiptRule operation returned by the
     *         service.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRule
     */
    @Override
    public DescribeReceiptRuleResult describeReceiptRule(
            DescribeReceiptRuleRequest describeReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReceiptRuleRequest> request = null;
        Response<DescribeReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReceiptRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReceiptRuleResult> responseHandler = new StaxResponseHandler<DescribeReceiptRuleResult>(
                    new DescribeReceiptRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest
     * @return Result of the DescribeReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRuleSet
     */
    @Override
    public DescribeReceiptRuleSetResult describeReceiptRuleSet(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReceiptRuleSetRequest> request = null;
        Response<DescribeReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReceiptRuleSetResult> responseHandler = new StaxResponseHandler<DescribeReceiptRuleSetResult>(
                    new DescribeReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain
     * name identities, this action also returns the DKIM tokens that are
     * required for Easy DKIM signing, and whether Amazon SES has successfully
     * verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the following
     * information for each:
     * </p>
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>A set of DKIM tokens that represent the identity. If the identity is
     * an email address, the tokens represent the domain of that address.</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain's DNS. This information is only returned for
     * domain name identities, not for email addresses.</li>
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get DKIM
     * attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest
     *        Given a list of verified identities, describes their DKIM
     *        attributes. The DKIM attributes of an email address identity
     *        includes whether DKIM signing is individually enabled or disabled
     *        for that address. The DKIM attributes of a domain name identity
     *        includes whether DKIM signing is enabled, as well as the DNS
     *        records (tokens) that must remain published in the domain name's
     *        DNS.
     * @return Result of the GetIdentityDkimAttributes operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.GetIdentityDkimAttributes
     */
    @Override
    public GetIdentityDkimAttributesResult getIdentityDkimAttributes(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityDkimAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityDkimAttributesRequest> request = null;
        Response<GetIdentityDkimAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityDkimAttributesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getIdentityDkimAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetIdentityDkimAttributesResult> responseHandler = new StaxResponseHandler<GetIdentityDkimAttributesResult>(
                    new GetIdentityDkimAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest
     * @return Result of the GetIdentityNotificationAttributes operation
     *         returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityNotificationAttributes
     */
    @Override
    public GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityNotificationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityNotificationAttributesRequest> request = null;
        Response<GetIdentityNotificationAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityNotificationAttributesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getIdentityNotificationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetIdentityNotificationAttributesResult> responseHandler = new StaxResponseHandler<GetIdentityNotificationAttributesResult>(
                    new GetIdentityNotificationAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (email address or domain). The policies are returned as a map of
     * policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest
     *        Represents a request instructing the service to retrieve the text
     *        of a list of authorization policies applying to an identity.
     * @return Result of the GetIdentityPolicies operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.GetIdentityPolicies
     */
    @Override
    public GetIdentityPoliciesResult getIdentityPolicies(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoliciesRequest> request = null;
        Response<GetIdentityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoliciesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetIdentityPoliciesResult> responseHandler = new StaxResponseHandler<GetIdentityPoliciesResult>(
                    new GetIdentityPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the
     * verification status and (for domain identities) the verification token
     * for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest
     *        Represents a request instructing the service to provide the
     *        verification attributes for a list of identities.
     * @return Result of the GetIdentityVerificationAttributes operation
     *         returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityVerificationAttributes
     */
    @Override
    public GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityVerificationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityVerificationAttributesRequest> request = null;
        Response<GetIdentityVerificationAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityVerificationAttributesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getIdentityVerificationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetIdentityVerificationAttributesResult> responseHandler = new StaxResponseHandler<GetIdentityVerificationAttributesResult>(
                    new GetIdentityVerificationAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return Result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailService.GetSendQuota
     */
    @Override
    public GetSendQuotaResult getSendQuota(
            GetSendQuotaRequest getSendQuotaRequest) {
        ExecutionContext executionContext = createExecutionContext(getSendQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSendQuotaRequest> request = null;
        Response<GetSendQuotaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSendQuotaRequestMarshaller().marshall(super
                        .beforeMarshalling(getSendQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSendQuotaResult> responseHandler = new StaxResponseHandler<GetSendQuotaResult>(
                    new GetSendQuotaResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetSendQuotaResult getSendQuota() {
        return getSendQuota(new GetSendQuotaRequest());
    }

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return Result of the GetSendStatistics operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.GetSendStatistics
     */
    @Override
    public GetSendStatisticsResult getSendStatistics(
            GetSendStatisticsRequest getSendStatisticsRequest) {
        ExecutionContext executionContext = createExecutionContext(getSendStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSendStatisticsRequest> request = null;
        Response<GetSendStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSendStatisticsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getSendStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSendStatisticsResult> responseHandler = new StaxResponseHandler<GetSendStatisticsResult>(
                    new GetSendStatisticsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetSendStatisticsResult getSendStatistics() {
        return getSendStatistics(new GetSendStatisticsRequest());
    }

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Represents a request instructing the service to list all
     *        identities for the AWS Account.
     * @return Result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailService.ListIdentities
     */
    @Override
    public ListIdentitiesResult listIdentities(
            ListIdentitiesRequest listIdentitiesRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitiesRequest> request = null;
        Response<ListIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitiesRequestMarshaller().marshall(super
                        .beforeMarshalling(listIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListIdentitiesResult> responseHandler = new StaxResponseHandler<ListIdentitiesResult>(
                    new ListIdentitiesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListIdentitiesResult listIdentities() {
        return listIdentities(new ListIdentitiesRequest());
    }

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (email address or domain). This API returns only a list.
     * If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest
     *        Represents a request instructing the service to list all
     *        authorization policies, by name, applying to an identity.
     * @return Result of the ListIdentityPolicies operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.ListIdentityPolicies
     */
    @Override
    public ListIdentityPoliciesResult listIdentityPolicies(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoliciesRequest> request = null;
        Response<ListIdentityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoliciesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListIdentityPoliciesResult> responseHandler = new StaxResponseHandler<ListIdentityPoliciesResult>(
                    new ListIdentityPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IP address filters associated with your account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest
     * @return Result of the ListReceiptFilters operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.ListReceiptFilters
     */
    @Override
    public ListReceiptFiltersResult listReceiptFilters(
            ListReceiptFiltersRequest listReceiptFiltersRequest) {
        ExecutionContext executionContext = createExecutionContext(listReceiptFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceiptFiltersRequest> request = null;
        Response<ListReceiptFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceiptFiltersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listReceiptFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListReceiptFiltersResult> responseHandler = new StaxResponseHandler<ListReceiptFiltersResult>(
                    new ListReceiptFiltersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If there
     * are additional receipt rule sets to be retrieved, you will receive a
     * <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest
     * @return Result of the ListReceiptRuleSets operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.ListReceiptRuleSets
     */
    @Override
    public ListReceiptRuleSetsResult listReceiptRuleSets(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listReceiptRuleSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceiptRuleSetsRequest> request = null;
        Response<ListReceiptRuleSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceiptRuleSetsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listReceiptRuleSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListReceiptRuleSetsResult> responseHandler = new StaxResponseHandler<ListReceiptRuleSetsResult>(
                    new ListReceiptRuleSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <important>The ListVerifiedEmailAddresses action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The ListIdentities action is
     * now preferred.</important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return Result of the ListVerifiedEmailAddresses operation returned by
     *         the service.
     * @sample AmazonSimpleEmailService.ListVerifiedEmailAddresses
     */
    @Override
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(listVerifiedEmailAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVerifiedEmailAddressesRequest> request = null;
        Response<ListVerifiedEmailAddressesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVerifiedEmailAddressesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listVerifiedEmailAddressesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListVerifiedEmailAddressesResult> responseHandler = new StaxResponseHandler<ListVerifiedEmailAddressesResult>(
                    new ListVerifiedEmailAddressesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses() {
        return listVerifiedEmailAddresses(new ListVerifiedEmailAddressesRequest());
    }

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (email address or domain).
     * </p>
     * <note>This API is for the identity owner only. If you have not verified
     * the identity, this API will return an error.</note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest
     *        Represents a request instructing the service to apply an
     *        authorization policy to an identity.
     * @return Result of the PutIdentityPolicy operation returned by the
     *         service.
     * @throws InvalidPolicyException
     *         Indicates that the provided policy is invalid. Check the error
     *         stack for more information about what caused the error.
     * @sample AmazonSimpleEmailService.PutIdentityPolicy
     */
    @Override
    public PutIdentityPolicyResult putIdentityPolicy(
            PutIdentityPolicyRequest putIdentityPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIdentityPolicyRequest> request = null;
        Response<PutIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIdentityPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutIdentityPolicyResult> responseHandler = new StaxResponseHandler<PutIdentityPolicyResult>(
                    new PutIdentityPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>All of the rules in the rule set must be represented in this
     * request. That is, this API will return an error if the reorder request
     * doesn’t explicitly position all of the rules.</note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest
     * @return Result of the ReorderReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.ReorderReceiptRuleSet
     */
    @Override
    public ReorderReceiptRuleSetResult reorderReceiptRuleSet(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(reorderReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReorderReceiptRuleSetRequest> request = null;
        Response<ReorderReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReorderReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(reorderReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReorderReceiptRuleSetResult> responseHandler = new StaxResponseHandler<ReorderReceiptRuleSetResult>(
                    new ReorderReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up to
     * 24 hours after you receive it.
     * </p>
     * <note>You cannot use this API to send generic bounces for mail that was
     * not received by Amazon SES.</note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param sendBounceRequest
     *        Request object for sending a simple/complex bounce. It contains
     *        all of the information needed to generate a basic DSN or a
     *        fully-customized DSN.
     * @return Result of the SendBounce operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be
     *         sent. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.SendBounce
     */
    @Override
    public SendBounceResult sendBounce(SendBounceRequest sendBounceRequest) {
        ExecutionContext executionContext = createExecutionContext(sendBounceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendBounceRequest> request = null;
        Response<SendBounceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendBounceRequestMarshaller().marshall(super
                        .beforeMarshalling(sendBounceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendBounceResult> responseHandler = new StaxResponseHandler<SendBounceResult>(
                    new SendBounceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about <code>SendEmail</code>:
     * </p>
     * <ul>
     * <li>You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per message.
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.</li>
     * <li>For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your sending quota - the maximum number
     * of emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.</li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        Represents a request instructing the service to send a single
     *        email message.</p>
     *        <p>
     *        This datatype can be used in application code to compose a message
     *        consisting of source, destination, message, reply-to, and
     *        return-path parts. This object can then be sent using the
     *        <code>SendEmail</code> action.
     * @return Result of the SendEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be
     *         sent. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.SendEmail
     */
    @Override
    public SendEmailResult sendEmail(SendEmailRequest sendEmailRequest) {
        ExecutionContext executionContext = createExecutionContext(sendEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendEmailRequest> request = null;
        Response<SendEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendEmailRequestMarshaller().marshall(super
                        .beforeMarshalling(sendEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendEmailResult> responseHandler = new StaxResponseHandler<SendEmailResult>(
                    new SendEmailResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an email message, with header and content specified by the client.
     * The <code>SendRawEmail</code> action is useful for sending multipart MIME
     * emails. The raw text of the message must comply with Internet email
     * standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code>:
     * </p>
     * <ul>
     * <li>You can only send email from verified email addresses and domains;
     * otherwise, you will get an "Email address not verified" error. If your
     * account is still in the Amazon SES sandbox, you must also verify every
     * recipient email address except for the recipients provided by the Amazon
     * SES mailbox simulator. For more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per message.
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.</li>
     * <li>The To:, CC:, and BCC: headers in the raw message can contain a group
     * list. Note that each recipient in a group list counts towards the
     * 50-recipient limit.</li>
     * <li>For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your sending quota - the maximum number
     * of emails you can send in a 24-hour period. For information about your
     * sending quota, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>If you are using sending authorization to send on behalf of another
     * user, <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's "Source," "From," and "Return-Path" parameters
     * in one of two ways: you can pass optional parameters
     * <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following
     * X-headers in the header of your raw email:
     * <ul>
     * <li><code>X-SES-SOURCE-ARN</code></li>
     * <li><code>X-SES-FROM-ARN</code></li>
     * <li><code>X-SES-RETURN-PATH-ARN</code></li>
     * </ul>
     * <important>Do not include these X-headers in the DKIM signature, because
     * they are removed by Amazon SES before sending the email.</important> For
     * the most common sending authorization use case, we recommend that you
     * specify the <code>SourceIdentityArn</code> and do not specify either the
     * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>. (The
     * same note applies to the corresponding X-headers.) If you only specify
     * the <code>SourceIdentityArn</code>, Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code>. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.</li>
     * </ul>
     * 
     * @param sendRawEmailRequest
     *        Represents a request instructing the service to send a raw email
     *        message.</p>
     *        <p>
     *        This datatype can be used in application code to compose a message
     *        consisting of source, destination, and raw message text. This
     *        object can then be sent using the <code>SendRawEmail</code>
     *        action.
     * @return Result of the SendRawEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be
     *         sent. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.SendRawEmail
     */
    @Override
    public SendRawEmailResult sendRawEmail(
            SendRawEmailRequest sendRawEmailRequest) {
        ExecutionContext executionContext = createExecutionContext(sendRawEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendRawEmailRequest> request = null;
        Response<SendRawEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendRawEmailRequestMarshaller().marshall(super
                        .beforeMarshalling(sendRawEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendRawEmailResult> responseHandler = new StaxResponseHandler<SendRawEmailResult>(
                    new SendRawEmailResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>To disable your email-receiving through Amazon SES completely, you
     * can call this API with RuleSetName set to null.</note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest
     * @return Result of the SetActiveReceiptRuleSet operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.SetActiveReceiptRuleSet
     */
    @Override
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(setActiveReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetActiveReceiptRuleSetRequest> request = null;
        Response<SetActiveReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetActiveReceiptRuleSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setActiveReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetActiveReceiptRuleSetResult> responseHandler = new StaxResponseHandler<SetActiveReceiptRuleSetResult>(
                    new SetActiveReceiptRuleSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code>), then Amazon SES will DKIM-sign all email sent
     * by addresses under that domain name (e.g., <code>user@example.com</code>
     * ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon SES
     * will DKIM-sign all email sent by that email address.</li>
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code>), you can only
     * enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code>) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest
     *        Represents a request instructing the service to enable or disable
     *        DKIM signing for an identity.
     * @return Result of the SetIdentityDkimEnabled operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.SetIdentityDkimEnabled
     */
    @Override
    public SetIdentityDkimEnabledResult setIdentityDkimEnabled(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityDkimEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityDkimEnabledRequest> request = null;
        Response<SetIdentityDkimEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityDkimEnabledRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setIdentityDkimEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetIdentityDkimEnabledResult> responseHandler = new StaxResponseHandler<SetIdentityDkimEnabledResult>(
                    new SetIdentityDkimEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given an identity (email address or domain), enables or disables whether
     * Amazon SES forwards bounce and complaint notifications as email. Feedback
     * forwarding can only be disabled when Amazon Simple Notification Service
     * (Amazon SNS) topics are specified for both bounces and complaints.
     * </p>
     * <note>Feedback forwarding does not apply to delivery notifications.
     * Delivery notifications are only available through Amazon SNS.</note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest
     * @return Result of the SetIdentityFeedbackForwardingEnabled operation
     *         returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityFeedbackForwardingEnabled
     */
    @Override
    public SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityFeedbackForwardingEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityFeedbackForwardingEnabledRequest> request = null;
        Response<SetIdentityFeedbackForwardingEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityFeedbackForwardingEnabledRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setIdentityFeedbackForwardingEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetIdentityFeedbackForwardingEnabledResult> responseHandler = new StaxResponseHandler<SetIdentityFeedbackForwardingEnabledResult>(
                    new SetIdentityFeedbackForwardingEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will publish
     * bounce, complaint, and/or delivery notifications for emails sent with
     * that identity as the <code>Source</code>.
     * </p>
     * <note>Unless feedback forwarding is enabled, you must specify Amazon SNS
     * topics for bounce and complaint notifications. For more information, see
     * <code>SetIdentityFeedbackForwardingEnabled</code>. </note>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest
     *        Represents a request to set or clear an identity's notification
     *        topic.
     * @return Result of the SetIdentityNotificationTopic operation returned by
     *         the service.
     * @sample AmazonSimpleEmailService.SetIdentityNotificationTopic
     */
    @Override
    public SetIdentityNotificationTopicResult setIdentityNotificationTopic(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityNotificationTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityNotificationTopicRequest> request = null;
        Response<SetIdentityNotificationTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityNotificationTopicRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setIdentityNotificationTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetIdentityNotificationTopicResult> responseHandler = new StaxResponseHandler<SetIdentityNotificationTopicResult>(
                    new SetIdentityNotificationTopicResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest
     * @return Result of the SetReceiptRulePosition operation returned by the
     *         service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.SetReceiptRulePosition
     */
    @Override
    public SetReceiptRulePositionResult setReceiptRulePosition(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest) {
        ExecutionContext executionContext = createExecutionContext(setReceiptRulePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetReceiptRulePositionRequest> request = null;
        Response<SetReceiptRulePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetReceiptRulePositionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setReceiptRulePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetReceiptRulePositionResult> responseHandler = new StaxResponseHandler<SetReceiptRulePositionResult>(
                    new SetReceiptRulePositionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest
     * @return Result of the UpdateReceiptRule operation returned by the
     *         service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that
     *         Amazon SES could not publish to the topic, possibly due to
     *         permissions issues. For information about giving permissions, see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS
     *         encryption key is invalid, or that Amazon SES could not publish
     *         to the bucket, possibly due to permissions issues. For
     *         information about giving permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or
     *         that Amazon SES could not execute the provided function, possibly
     *         due to permissions issues. For information about giving
     *         permissions, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
     *         >Amazon SES Developer Guide</a>.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created due to service
     *         limits. For a list of Amazon SES limits, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html"
     *         >Amazon SES Developer Guide</a>.
     * @sample AmazonSimpleEmailService.UpdateReceiptRule
     */
    @Override
    public UpdateReceiptRuleResult updateReceiptRule(
            UpdateReceiptRuleRequest updateReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(updateReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReceiptRuleRequest> request = null;
        Response<UpdateReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReceiptRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateReceiptRuleResult> responseHandler = new StaxResponseHandler<UpdateReceiptRuleResult>(
                    new UpdateReceiptRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process may
     * take up to 72 hours. Upon successful detection, Amazon SES will be able
     * to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest
     *        Represents a request instructing the service to begin DKIM
     *        verification for a domain.
     * @return Result of the VerifyDomainDkim operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyDomainDkim
     */
    @Override
    public VerifyDomainDkimResult verifyDomainDkim(
            VerifyDomainDkimRequest verifyDomainDkimRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyDomainDkimRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyDomainDkimRequest> request = null;
        Response<VerifyDomainDkimResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyDomainDkimRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(verifyDomainDkimRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<VerifyDomainDkimResult> responseHandler = new StaxResponseHandler<VerifyDomainDkimResult>(
                    new VerifyDomainDkimResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest
     *        Represents a request instructing the service to begin domain
     *        verification.
     * @return Result of the VerifyDomainIdentity operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.VerifyDomainIdentity
     */
    @Override
    public VerifyDomainIdentityResult verifyDomainIdentity(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyDomainIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyDomainIdentityRequest> request = null;
        Response<VerifyDomainIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyDomainIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(verifyDomainIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<VerifyDomainIdentityResult> responseHandler = new StaxResponseHandler<VerifyDomainIdentityResult>(
                    new VerifyDomainIdentityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <important>The VerifyEmailAddress action is deprecated as of the May 15,
     * 2012 release of Domain Verification. The VerifyEmailIdentity action is
     * now preferred.</important>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailAddressRequest
     *        Represents a request instructing the service to begin email
     *        address verification.
     * @sample AmazonSimpleEmailService.VerifyEmailAddress
     */
    @Override
    public void verifyEmailAddress(
            VerifyEmailAddressRequest verifyEmailAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyEmailAddressRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyEmailAddressRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(verifyEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest
     *        Represents a request instructing the service to begin email
     *        address verification.
     * @return Result of the VerifyEmailIdentity operation returned by the
     *         service.
     * @sample AmazonSimpleEmailService.VerifyEmailIdentity
     */
    @Override
    public VerifyEmailIdentityResult verifyEmailIdentity(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyEmailIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyEmailIdentityRequest> request = null;
        Response<VerifyEmailIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyEmailIdentityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(verifyEmailIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<VerifyEmailIdentityResult> responseHandler = new StaxResponseHandler<VerifyEmailIdentityResult>(
                    new VerifyEmailIdentityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
