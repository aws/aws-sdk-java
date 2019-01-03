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
package com.amazonaws.services.simpleemail;

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

import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.services.simpleemail.model.transform.*;

/**
 * Client for accessing Amazon SES. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This document contains reference information for the <a href="https://aws.amazon.com/ses/">Amazon Simple Email
 * Service</a> (Amazon SES) API, version 2010-12-01. This document is best used in conjunction with the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions and Amazon SES</a> in the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer Guide</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSimpleEmailServiceClient extends AmazonWebServiceClient implements AmazonSimpleEmailService {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSimpleEmailService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ses";

    private volatile AmazonSimpleEmailServiceWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon SES. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Amazon SES (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AmazonSimpleEmailServiceClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SES (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SES (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SES (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonSimpleEmailServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSimpleEmailServiceClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonSimpleEmailServiceClientBuilder builder() {
        return AmazonSimpleEmailServiceClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleEmailServiceClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleEmailServiceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidFirehoseDestinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3ConfigurationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSNSDestinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRenderingParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MessageRejectedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCloudWatchDestinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccountSendingPausedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RuleSetDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnsTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ConfigurationSetSendingPausedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventDestinationDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLambdaFunctionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TemplateDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingRenderingAttributeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CannotDeleteExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrackingOptionsAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ConfigurationSetAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CustomVerificationEmailInvalidContentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTemplateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MailFromDomainNotVerifiedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ConfigurationSetDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ProductionAccessNotGrantedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTrackingOptionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrackingOptionsDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventDestinationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FromEmailAddressNotVerifiedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RuleDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidConfigurationSetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CustomVerificationEmailTemplateDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CustomVerificationEmailTemplateAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://email.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/simpleemail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/simpleemail/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new
     * receipt rule set and are completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest
     *        Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CloneReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CloneReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CloneReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CloneReceiptRuleSetResult cloneReceiptRuleSet(CloneReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeCloneReceiptRuleSet(request);
    }

    @SdkInternalApi
    final CloneReceiptRuleSetResult executeCloneReceiptRuleSet(CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(cloneReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneReceiptRuleSetRequest> request = null;
        Response<CloneReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(cloneReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CloneReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Creates a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For information about using configuration sets,
     * see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        Represents a request to create a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws ConfigurationSetAlreadyExistsException
     *         Indicates that the configuration set could not be created because of a naming conflict.
     * @throws InvalidConfigurationSetException
     *         Indicates that the configuration set is invalid. See the error message for details.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSet(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetResult executeCreateConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetRequest> request = null;
        Response<CreateConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetRequestMarshaller().marshall(super.beforeMarshalling(createConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateConfigurationSetResult> responseHandler = new StaxResponseHandler<CreateConfigurationSetResult>(
                    new CreateConfigurationSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration set event destination.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
     * configuration set. For information about using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        Represents a request to create a configuration set event destination. A configuration set event
     *        destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in
     *        which Amazon SES publishes the email sending events associated with a configuration set. For information
     *        about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws EventDestinationAlreadyExistsException
     *         Indicates that the event destination could not be created because of a naming conflict.
     * @throws InvalidCloudWatchDestinationException
     *         Indicates that the Amazon CloudWatch destination is invalid. See the error message for details.
     * @throws InvalidFirehoseDestinationException
     *         Indicates that the Amazon Kinesis Firehose destination is invalid. See the error message for details.
     * @throws InvalidSNSDestinationException
     *         Indicates that the Amazon Simple Notification Service (Amazon SNS) destination is invalid. See the error
     *         message for details.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(CreateConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetEventDestinationResult executeCreateConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetEventDestinationRequest> request = null;
        Response<CreateConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetEventDestinationRequestMarshaller().marshall(super
                        .beforeMarshalling(createConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateConfigurationSetEventDestinationResult> responseHandler = new StaxResponseHandler<CreateConfigurationSetEventDestinationResult>(
                    new CreateConfigurationSetEventDestinationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param createConfigurationSetTrackingOptionsRequest
     *        Represents a request to create an open and click tracking option object in a configuration set.
     * @return Result of the CreateConfigurationSetTrackingOptions operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TrackingOptionsAlreadyExistsException
     *         Indicates that the configuration set you specified already contains a TrackingOptions object.
     * @throws InvalidTrackingOptionsException
     *         Indicates that the custom domain to be used for open and click tracking redirects is invalid. This error
     *         appears most often in the following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not verified in Amazon SES.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not a valid domain or subdomain.
     *         </p>
     *         </li>
     * @sample AmazonSimpleEmailService.CreateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationSetTrackingOptionsResult createConfigurationSetTrackingOptions(CreateConfigurationSetTrackingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSetTrackingOptions(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetTrackingOptionsResult executeCreateConfigurationSetTrackingOptions(
            CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetTrackingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetTrackingOptionsRequest> request = null;
        Response<CreateConfigurationSetTrackingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetTrackingOptionsRequestMarshaller().marshall(super
                        .beforeMarshalling(createConfigurationSetTrackingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSetTrackingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateConfigurationSetTrackingOptionsResult> responseHandler = new StaxResponseHandler<CreateConfigurationSetTrackingOptionsResult>(
                    new CreateConfigurationSetTrackingOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest
     *        Represents a request to create a custom verification email template.
     * @return Result of the CreateCustomVerificationEmailTemplate operation returned by the service.
     * @throws CustomVerificationEmailTemplateAlreadyExistsException
     *         Indicates that a custom verification email template with the name you specified already exists.
     * @throws FromEmailAddressNotVerifiedException
     *         Indicates that the sender address specified for a custom verification email is not verified, and is
     *         therefore not eligible to send the custom verification email.
     * @throws CustomVerificationEmailInvalidContentException
     *         Indicates that custom verification email template provided content is invalid.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomVerificationEmailTemplateResult createCustomVerificationEmailTemplate(CreateCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final CreateCustomVerificationEmailTemplateResult executeCreateCustomVerificationEmailTemplate(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomVerificationEmailTemplateRequest> request = null;
        Response<CreateCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomVerificationEmailTemplateRequestMarshaller().marshall(super
                        .beforeMarshalling(createCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateCustomVerificationEmailTemplateResult> responseHandler = new StaxResponseHandler<CreateCustomVerificationEmailTemplateResult>(
                    new CreateCustomVerificationEmailTemplateResultStaxUnmarshaller());
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
     * For information about setting up IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptFilterRequest
     *        Represents a request to create a new IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateReceiptFilter operation returned by the service.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @sample AmazonSimpleEmailService.CreateReceiptFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReceiptFilterResult createReceiptFilter(CreateReceiptFilterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReceiptFilter(request);
    }

    @SdkInternalApi
    final CreateReceiptFilterResult executeCreateReceiptFilter(CreateReceiptFilterRequest createReceiptFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(createReceiptFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptFilterRequest> request = null;
        Response<CreateReceiptFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptFilterRequestMarshaller().marshall(super.beforeMarshalling(createReceiptFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReceiptFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For information about setting up receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleRequest
     *        Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateReceiptRule operation returned by the service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the
     *         topic, possibly due to permissions issues. For information about giving permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS encryption key is invalid, or that Amazon SES
     *         could not publish to the bucket, possibly due to permissions issues. For information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or that Amazon SES could not execute the
     *         provided function, possibly due to permissions issues. For information about giving permissions, see the
     *         <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReceiptRule(request);
    }

    @SdkInternalApi
    final CreateReceiptRuleResult executeCreateReceiptRule(CreateReceiptRuleRequest createReceiptRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptRuleRequest> request = null;
        Response<CreateReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(createReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReceiptRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For information about setting up receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest
     *        Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateReceiptRuleSet operation returned by the service.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReceiptRuleSetResult createReceiptRuleSet(CreateReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReceiptRuleSet(request);
    }

    @SdkInternalApi
    final CreateReceiptRuleSetResult executeCreateReceiptRuleSet(CreateReceiptRuleSetRequest createReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptRuleSetRequest> request = null;
        Response<CreateReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(createReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createTemplateRequest
     *        Represents a request to create an email template. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws AlreadyExistsException
     *         Indicates that a resource could not be created because of a naming conflict.
     * @throws InvalidTemplateException
     *         Indicates that the template that you specified could not be rendered. This issue may occur when a
     *         template refers to a partial that does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTemplateResult createTemplate(CreateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplate(request);
    }

    @SdkInternalApi
    final CreateTemplateResult executeCreateTemplate(CreateTemplateRequest createTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateRequest> request = null;
        Response<CreateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateRequestMarshaller().marshall(super.beforeMarshalling(createTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTemplateResult> responseHandler = new StaxResponseHandler<CreateTemplateResult>(
                    new CreateTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about
     * using configuration sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        Represents a request to delete a configuration set. Configuration sets enable you to publish email sending
     *        events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSet(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetResult executeDeleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetRequest> request = null;
        Response<DeleteConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetRequestMarshaller().marshall(super.beforeMarshalling(deleteConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteConfigurationSetResult> responseHandler = new StaxResponseHandler<DeleteConfigurationSetResult>(
                    new DeleteConfigurationSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configuration set event destination. Configuration set event destinations are associated with
     * configuration sets, which enable you to publish email sending events. For information about using configuration
     * sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        Represents a request to delete a configuration set event destination. Configuration set event destinations
     *        are associated with configuration sets, which enable you to publish email sending events. For information
     *        about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws EventDestinationDoesNotExistException
     *         Indicates that the event destination does not exist.
     * @sample AmazonSimpleEmailService.DeleteConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(DeleteConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetEventDestinationResult executeDeleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetEventDestinationRequest> request = null;
        Response<DeleteConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetEventDestinationRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteConfigurationSetEventDestinationResult> responseHandler = new StaxResponseHandler<DeleteConfigurationSetEventDestinationResult>(
                    new DeleteConfigurationSetEventDestinationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Deleting this kind of association will result in emails sent using the specified configuration set to capture
     * open and click events using the standard, Amazon SES-operated domains.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationSetTrackingOptionsRequest
     *        Represents a request to delete open and click tracking options in a configuration set.
     * @return Result of the DeleteConfigurationSetTrackingOptions operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TrackingOptionsDoesNotExistException
     *         Indicates that the TrackingOptions object you specified does not exist.
     * @sample AmazonSimpleEmailService.DeleteConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetTrackingOptionsResult deleteConfigurationSetTrackingOptions(DeleteConfigurationSetTrackingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSetTrackingOptions(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetTrackingOptionsResult executeDeleteConfigurationSetTrackingOptions(
            DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetTrackingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetTrackingOptionsRequest> request = null;
        Response<DeleteConfigurationSetTrackingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetTrackingOptionsRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteConfigurationSetTrackingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSetTrackingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteConfigurationSetTrackingOptionsResult> responseHandler = new StaxResponseHandler<DeleteConfigurationSetTrackingOptionsResult>(
                    new DeleteConfigurationSetTrackingOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest
     *        Represents a request to delete an existing custom verification email template.
     * @return Result of the DeleteCustomVerificationEmailTemplate operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomVerificationEmailTemplateResult deleteCustomVerificationEmailTemplate(DeleteCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final DeleteCustomVerificationEmailTemplateResult executeDeleteCustomVerificationEmailTemplate(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomVerificationEmailTemplateRequest> request = null;
        Response<DeleteCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomVerificationEmailTemplateRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCustomVerificationEmailTemplateResult> responseHandler = new StaxResponseHandler<DeleteCustomVerificationEmailTemplateResult>(
                    new DeleteCustomVerificationEmailTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the list of verified identities.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityRequest
     *        Represents a request to delete one of your Amazon SES identities (an email address or domain).
     * @return Result of the DeleteIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIdentityResult deleteIdentity(DeleteIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentity(request);
    }

    @SdkInternalApi
    final DeleteIdentityResult executeDeleteIdentity(DeleteIdentityRequest deleteIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityRequest> request = null;
        Response<DeleteIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityRequestMarshaller().marshall(super.beforeMarshalling(deleteIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest
     *        Represents a request to delete a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *        SES Developer Guide</a>.
     * @return Result of the DeleteIdentityPolicy operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIdentityPolicyResult deleteIdentityPolicy(DeleteIdentityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentityPolicy(request);
    }

    @SdkInternalApi
    final DeleteIdentityPolicyResult executeDeleteIdentityPolicy(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityPolicyRequest> request = null;
        Response<DeleteIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest
     *        Represents a request to delete an IP address filter. You use IP address filters when you receive email
     *        with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteReceiptFilter operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteReceiptFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReceiptFilterResult deleteReceiptFilter(DeleteReceiptFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReceiptFilter(request);
    }

    @SdkInternalApi
    final DeleteReceiptFilterResult executeDeleteReceiptFilter(DeleteReceiptFilterRequest deleteReceiptFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReceiptFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptFilterRequest> request = null;
        Response<DeleteReceiptFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptFilterRequestMarshaller().marshall(super.beforeMarshalling(deleteReceiptFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReceiptFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest
     *        Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteReceiptRule operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DeleteReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReceiptRuleResult deleteReceiptRule(DeleteReceiptRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReceiptRule(request);
    }

    @SdkInternalApi
    final DeleteReceiptRuleResult executeDeleteReceiptRule(DeleteReceiptRuleRequest deleteReceiptRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptRuleRequest> request = null;
        Response<DeleteReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(deleteReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReceiptRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes the specified receipt rule set and all of the receipt rules it contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest
     *        Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use
     *        receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteReceiptRuleSet operation returned by the service.
     * @throws CannotDeleteException
     *         Indicates that the delete operation could not be completed.
     * @sample AmazonSimpleEmailService.DeleteReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteReceiptRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReceiptRuleSetResult deleteReceiptRuleSet(DeleteReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReceiptRuleSet(request);
    }

    @SdkInternalApi
    final DeleteReceiptRuleSetResult executeDeleteReceiptRuleSet(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptRuleSetRequest> request = null;
        Response<DeleteReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(deleteReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteTemplateRequest
     *        Represents a request to delete an email template. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteTemplate operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTemplateResult deleteTemplate(DeleteTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTemplate(request);
    }

    @SdkInternalApi
    final DeleteTemplateResult executeDeleteTemplate(DeleteTemplateRequest deleteTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateRequest> request = null;
        Response<DeleteTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateRequestMarshaller().marshall(super.beforeMarshalling(deleteTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTemplateResult> responseHandler = new StaxResponseHandler<DeleteTemplateResult>(
                    new DeleteTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email addresses and domains.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest
     *        Represents a request to delete an email address from the list of email addresses you have attempted to
     *        verify under your AWS account.
     * @return Result of the DeleteVerifiedEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailService.DeleteVerifiedEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteVerifiedEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVerifiedEmailAddressResult deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVerifiedEmailAddress(request);
    }

    @SdkInternalApi
    final DeleteVerifiedEmailAddressResult executeDeleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVerifiedEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVerifiedEmailAddressRequest> request = null;
        Response<DeleteVerifiedEmailAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVerifiedEmailAddressRequestMarshaller().marshall(super.beforeMarshalling(deleteVerifiedEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVerifiedEmailAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteVerifiedEmailAddressResult> responseHandler = new StaxResponseHandler<DeleteVerifiedEmailAddressResult>(
                    new DeleteVerifiedEmailAddressResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest
     *        Represents a request to return the metadata and receipt rules for the receipt rule set that is currently
     *        active. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DescribeActiveReceiptRuleSet operation returned by the service.
     * @sample AmazonSimpleEmailService.DescribeActiveReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeActiveReceiptRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(DescribeActiveReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeActiveReceiptRuleSet(request);
    }

    @SdkInternalApi
    final DescribeActiveReceiptRuleSetResult executeDescribeActiveReceiptRuleSet(DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeActiveReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActiveReceiptRuleSetRequest> request = null;
        Response<DescribeActiveReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActiveReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(describeActiveReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeActiveReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns the details of the specified configuration set. For information about using configuration sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeConfigurationSetRequest
     *        Represents a request to return the details of a configuration set. Configuration sets enable you to
     *        publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DescribeConfigurationSet operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.DescribeConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeConfigurationSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeConfigurationSetResult describeConfigurationSet(DescribeConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationSet(request);
    }

    @SdkInternalApi
    final DescribeConfigurationSetResult executeDescribeConfigurationSet(DescribeConfigurationSetRequest describeConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationSetRequest> request = null;
        Response<DescribeConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationSetRequestMarshaller().marshall(super.beforeMarshalling(describeConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeConfigurationSetResult> responseHandler = new StaxResponseHandler<DescribeConfigurationSetResult>(
                    new DescribeConfigurationSetResultStaxUnmarshaller());
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
     * For information about setting up receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest
     *        Represents a request to return the details of a receipt rule. You use receipt rules to receive email with
     *        Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DescribeReceiptRule operation returned by the service.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeReceiptRuleResult describeReceiptRule(DescribeReceiptRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReceiptRule(request);
    }

    @SdkInternalApi
    final DescribeReceiptRuleResult executeDescribeReceiptRule(DescribeReceiptRuleRequest describeReceiptRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReceiptRuleRequest> request = null;
        Response<DescribeReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(describeReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReceiptRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest
     *        Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive
     *        email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DescribeReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.DescribeReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReceiptRuleSet(request);
    }

    @SdkInternalApi
    final DescribeReceiptRuleSetResult executeDescribeReceiptRuleSet(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReceiptRuleSetRequest> request = null;
        Response<DescribeReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(describeReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns the email sending status of the Amazon SES account for the current region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @return Result of the GetAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.GetAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetAccountSendingEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountSendingEnabledResult getAccountSendingEnabled(GetAccountSendingEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSendingEnabled(request);
    }

    @SdkInternalApi
    final GetAccountSendingEnabledResult executeGetAccountSendingEnabled(GetAccountSendingEnabledRequest getAccountSendingEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSendingEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSendingEnabledRequest> request = null;
        Response<GetAccountSendingEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSendingEnabledRequestMarshaller().marshall(super.beforeMarshalling(getAccountSendingEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSendingEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAccountSendingEnabledResult> responseHandler = new StaxResponseHandler<GetAccountSendingEnabledResult>(
                    new GetAccountSendingEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the custom email verification template for the template name you specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest
     *        Represents a request to retrieve an existing custom verification email template.
     * @return Result of the GetCustomVerificationEmailTemplate operation returned by the service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     *         Indicates that a custom verification email template with the name you specified does not exist.
     * @sample AmazonSimpleEmailService.GetCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplate(GetCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final GetCustomVerificationEmailTemplateResult executeGetCustomVerificationEmailTemplate(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomVerificationEmailTemplateRequest> request = null;
        Response<GetCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomVerificationEmailTemplateRequestMarshaller()
                        .marshall(super.beforeMarshalling(getCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCustomVerificationEmailTemplateResult> responseHandler = new StaxResponseHandler<GetCustomVerificationEmailTemplateResult>(
                    new GetCustomVerificationEmailTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also
     * returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified
     * that these tokens have been published.
     * </p>
     * <p>
     * This operation takes a list of identities as input and returns the following information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the
     * domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is
     * only returned for domain name identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities
     * at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest
     *        Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain
     *        identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether
     *        Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM,
     *        see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer
     *        Guide</a>.
     * @return Result of the GetIdentityDkimAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityDkimAttributesResult getIdentityDkimAttributes(GetIdentityDkimAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityDkimAttributes(request);
    }

    @SdkInternalApi
    final GetIdentityDkimAttributesResult executeGetIdentityDkimAttributes(GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityDkimAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityDkimAttributesRequest> request = null;
        Response<GetIdentityDkimAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityDkimAttributesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityDkimAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityDkimAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains).
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
     * identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest
     *        Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For
     *        information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @return Result of the GetIdentityMailFromDomainAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityMailFromDomainAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityMailFromDomainAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityMailFromDomainAttributesResult getIdentityMailFromDomainAttributes(GetIdentityMailFromDomainAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityMailFromDomainAttributes(request);
    }

    @SdkInternalApi
    final GetIdentityMailFromDomainAttributesResult executeGetIdentityMailFromDomainAttributes(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityMailFromDomainAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityMailFromDomainAttributesRequest> request = null;
        Response<GetIdentityMailFromDomainAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityMailFromDomainAttributesRequestMarshaller().marshall(super
                        .beforeMarshalling(getIdentityMailFromDomainAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityMailFromDomainAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetIdentityMailFromDomainAttributesResult> responseHandler = new StaxResponseHandler<GetIdentityMailFromDomainAttributesResult>(
                    new GetIdentityMailFromDomainAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity
     * notification attributes.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get notification attributes for up to 100
     * identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest
     *        Represents a request to return the notification attributes for a list of identities you verified with
     *        Amazon SES. For information about Amazon SES notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer
     *        Guide</a>.
     * @return Result of the GetIdentityNotificationAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityNotificationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityNotificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(GetIdentityNotificationAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityNotificationAttributes(request);
    }

    @SdkInternalApi
    final GetIdentityNotificationAttributesResult executeGetIdentityNotificationAttributes(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityNotificationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityNotificationAttributesRequest> request = null;
        Response<GetIdentityNotificationAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityNotificationAttributesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityNotificationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityNotificationAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns the requested sending authorization policies for the given identity (an email address or a domain). The
     * policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
     * time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest
     *        Represents a request to return the requested sending authorization policies for an identity. Sending
     *        authorization is an Amazon SES feature that enables you to authorize other senders to use your identities.
     *        For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the GetIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIdentityPoliciesResult getIdentityPolicies(GetIdentityPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityPolicies(request);
    }

    @SdkInternalApi
    final GetIdentityPoliciesResult executeGetIdentityPolicies(GetIdentityPoliciesRequest getIdentityPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoliciesRequest> request = null;
        Response<GetIdentityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoliciesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain
     * identities) the verification token for each identity.
     * </p>
     * <p>
     * The verification status of an email address is "Pending" until the email address owner clicks the link within the
     * verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24
     * hours, the verification status of the email address changes to "Success". If the link is not clicked within 24
     * hours, the verification status changes to "Failed." In that case, if you still want to verify the email address,
     * you must restart the verification process from the beginning.
     * </p>
     * <p>
     * For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT
     * record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status
     * changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification
     * status changes to "Failed." In that case, if you still want to verify the domain, you must restart the
     * verification process from the beginning.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get verification attributes for up to 100
     * identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest
     *        Represents a request to return the Amazon SES verification status of a list of identities. For domain
     *        identities, this request also returns the verification token. For information about verifying identities
     *        with Amazon SES, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the GetIdentityVerificationAttributes operation returned by the service.
     * @sample AmazonSimpleEmailService.GetIdentityVerificationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityVerificationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityVerificationAttributes(request);
    }

    @SdkInternalApi
    final GetIdentityVerificationAttributesResult executeGetIdentityVerificationAttributes(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityVerificationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityVerificationAttributesRequest> request = null;
        Response<GetIdentityVerificationAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityVerificationAttributesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityVerificationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityVerificationAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return Result of the GetSendQuota operation returned by the service.
     * @sample AmazonSimpleEmailService.GetSendQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendQuota" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSendQuotaResult getSendQuota(GetSendQuotaRequest request) {
        request = beforeClientExecution(request);
        return executeGetSendQuota(request);
    }

    @SdkInternalApi
    final GetSendQuotaResult executeGetSendQuota(GetSendQuotaRequest getSendQuotaRequest) {

        ExecutionContext executionContext = createExecutionContext(getSendQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSendQuotaRequest> request = null;
        Response<GetSendQuotaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSendQuotaRequestMarshaller().marshall(super.beforeMarshalling(getSendQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSendQuota");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSendQuotaResult> responseHandler = new StaxResponseHandler<GetSendQuotaResult>(new GetSendQuotaResultStaxUnmarshaller());
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
     * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the
     * last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of
     * time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return Result of the GetSendStatistics operation returned by the service.
     * @sample AmazonSimpleEmailService.GetSendStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetSendStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSendStatisticsResult getSendStatistics(GetSendStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSendStatistics(request);
    }

    @SdkInternalApi
    final GetSendStatisticsResult executeGetSendStatistics(GetSendStatisticsRequest getSendStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSendStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSendStatisticsRequest> request = null;
        Response<GetSendStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSendStatisticsRequestMarshaller().marshall(super.beforeMarshalling(getSendStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSendStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Displays the template object (which includes the Subject line, HTML part and text part) for the template you
     * specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @sample AmazonSimpleEmailService.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplate(request);
    }

    @SdkInternalApi
    final GetTemplateResult executeGetTemplate(GetTemplateRequest getTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateRequestMarshaller().marshall(super.beforeMarshalling(getTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTemplateResult> responseHandler = new StaxResponseHandler<GetTemplateResult>(new GetTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For
     * information about using configuration sets, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Monitoring Your Amazon
     * SES Sending Activity</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second. This operation will return up to 1,000 configuration
     * sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will
     * also return a NextToken element. You can then execute the <code>ListConfigurationSets</code> operation again,
     * passing the <code>NextToken</code> parameter and the value of the NextToken element to retrieve additional
     * results.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        Represents a request to list the configuration sets associated with your AWS account. Configuration sets
     *        enable you to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @sample AmazonSimpleEmailService.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationSets(request);
    }

    @SdkInternalApi
    final ListConfigurationSetsResult executeListConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationSetsRequest> request = null;
        Response<ListConfigurationSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationSetsRequestMarshaller().marshall(super.beforeMarshalling(listConfigurationSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListConfigurationSetsResult> responseHandler = new StaxResponseHandler<ListConfigurationSetsResult>(
                    new ListConfigurationSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the existing custom verification email templates for your account in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest
     *        Represents a request to list the existing custom verification email templates for your account.</p>
     *        <p>
     *        For more information about custom verification email templates, see <a
     *        href="ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom Verification Email
     *        Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * @return Result of the ListCustomVerificationEmailTemplates operation returned by the service.
     * @sample AmazonSimpleEmailService.ListCustomVerificationEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListCustomVerificationEmailTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomVerificationEmailTemplatesResult listCustomVerificationEmailTemplates(ListCustomVerificationEmailTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomVerificationEmailTemplates(request);
    }

    @SdkInternalApi
    final ListCustomVerificationEmailTemplatesResult executeListCustomVerificationEmailTemplates(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomVerificationEmailTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomVerificationEmailTemplatesRequest> request = null;
        Response<ListCustomVerificationEmailTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomVerificationEmailTemplatesRequestMarshaller().marshall(super
                        .beforeMarshalling(listCustomVerificationEmailTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomVerificationEmailTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListCustomVerificationEmailTemplatesResult> responseHandler = new StaxResponseHandler<ListCustomVerificationEmailTemplatesResult>(
                    new ListCustomVerificationEmailTemplatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current
     * AWS Region, regardless of verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentitiesRequest
     *        Represents a request to return a list of all identities (email addresses and domains) that you have
     *        attempted to verify under your AWS account, regardless of verification status.
     * @return Result of the ListIdentities operation returned by the service.
     * @sample AmazonSimpleEmailService.ListIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentities" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentities(request);
    }

    @SdkInternalApi
    final ListIdentitiesResult executeListIdentities(ListIdentitiesRequest listIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitiesRequest> request = null;
        Response<ListIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitiesRequestMarshaller().marshall(super.beforeMarshalling(listIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns a list of sending authorization policies that are attached to the given identity (an email address or a
     * domain). This API returns only a list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest
     *        Represents a request to return a list of sending authorization policies that are attached to an identity.
     *        Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your
     *        identities. For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ListIdentityPolicies operation returned by the service.
     * @sample AmazonSimpleEmailService.ListIdentityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentityPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIdentityPoliciesResult listIdentityPolicies(ListIdentityPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentityPolicies(request);
    }

    @SdkInternalApi
    final ListIdentityPoliciesResult executeListIdentityPolicies(ListIdentityPoliciesRequest listIdentityPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoliciesRequest> request = null;
        Response<ListIdentityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentityPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the IP address filters associated with your AWS account in the current AWS Region.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest
     *        Represents a request to list the IP address filters that exist under your AWS account. You use IP address
     *        filters when you receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ListReceiptFilters operation returned by the service.
     * @sample AmazonSimpleEmailService.ListReceiptFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptFilters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReceiptFiltersResult listReceiptFilters(ListReceiptFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeListReceiptFilters(request);
    }

    @SdkInternalApi
    final ListReceiptFiltersResult executeListReceiptFilters(ListReceiptFiltersRequest listReceiptFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(listReceiptFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceiptFiltersRequest> request = null;
        Response<ListReceiptFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceiptFiltersRequestMarshaller().marshall(super.beforeMarshalling(listReceiptFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReceiptFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional
     * receipt rule sets to be retrieved, you will receive a <code>NextToken</code> that you can provide to the next
     * call to <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest
     *        Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ListReceiptRuleSets operation returned by the service.
     * @sample AmazonSimpleEmailService.ListReceiptRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReceiptRuleSetsResult listReceiptRuleSets(ListReceiptRuleSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListReceiptRuleSets(request);
    }

    @SdkInternalApi
    final ListReceiptRuleSetsResult executeListReceiptRuleSets(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReceiptRuleSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceiptRuleSetsRequest> request = null;
        Response<ListReceiptRuleSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceiptRuleSetsRequestMarshaller().marshall(super.beforeMarshalling(listReceiptRuleSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReceiptRuleSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the email templates present in your Amazon SES account in the current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @sample AmazonSimpleEmailService.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplates(request);
    }

    @SdkInternalApi
    final ListTemplatesResult executeListTemplates(ListTemplatesRequest listTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestMarshaller().marshall(super.beforeMarshalling(listTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTemplatesResult> responseHandler = new StaxResponseHandler<ListTemplatesResult>(new ListTemplatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the email addresses and domains associated with
     * your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return Result of the ListVerifiedEmailAddresses operation returned by the service.
     * @sample AmazonSimpleEmailService.ListVerifiedEmailAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListVerifiedEmailAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest request) {
        request = beforeClientExecution(request);
        return executeListVerifiedEmailAddresses(request);
    }

    @SdkInternalApi
    final ListVerifiedEmailAddressesResult executeListVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVerifiedEmailAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVerifiedEmailAddressesRequest> request = null;
        Response<ListVerifiedEmailAddressesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVerifiedEmailAddressesRequestMarshaller().marshall(super.beforeMarshalling(listVerifiedEmailAddressesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVerifiedEmailAddresses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest
     *        Represents a request to add or update a sending authorization policy for an identity. Sending
     *        authorization is an Amazon SES feature that enables you to authorize other senders to use your identities.
     *        For information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the PutIdentityPolicy operation returned by the service.
     * @throws InvalidPolicyException
     *         Indicates that the provided policy is invalid. Check the error stack for more information about what
     *         caused the error.
     * @sample AmazonSimpleEmailService.PutIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/PutIdentityPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutIdentityPolicyResult putIdentityPolicy(PutIdentityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutIdentityPolicy(request);
    }

    @SdkInternalApi
    final PutIdentityPolicyResult executePutIdentityPolicy(PutIdentityPolicyRequest putIdentityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIdentityPolicyRequest> request = null;
        Response<PutIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIdentityPolicyRequestMarshaller().marshall(super.beforeMarshalling(putIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutIdentityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request. That is, this API will return an error if
     * the reorder request doesn't explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest
     *        Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to
     *        receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ReorderReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.ReorderReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReorderReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ReorderReceiptRuleSetResult reorderReceiptRuleSet(ReorderReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeReorderReceiptRuleSet(request);
    }

    @SdkInternalApi
    final ReorderReceiptRuleSetResult executeReorderReceiptRuleSet(ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(reorderReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReorderReceiptRuleSetRequest> request = null;
        Response<ReorderReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReorderReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(reorderReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReorderReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use
     * this API on an email up to 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendBounceRequest
     *        Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
     * @return Result of the SendBounce operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @sample AmazonSimpleEmailService.SendBounce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBounce" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendBounceResult sendBounce(SendBounceRequest request) {
        request = beforeClientExecution(request);
        return executeSendBounce(request);
    }

    @SdkInternalApi
    final SendBounceResult executeSendBounce(SendBounceRequest sendBounceRequest) {

        ExecutionContext executionContext = createExecutionContext(sendBounceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendBounceRequest> request = null;
        Response<SendBounceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendBounceRequestMarshaller().marshall(super.beforeMarshalling(sendBounceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendBounce");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendBounceResult> responseHandler = new StaxResponseHandler<SendBounceResult>(new SendBounceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Composes an email message to multiple destinations. The message body is created using an email template.
     * </p>
     * <p>
     * In order to send email using the <code>SendBulkTemplatedEmail</code> operation, your call to the API must meet
     * the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email templates using the <a>CreateTemplate</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each <code>Destination</code> parameter must include at least one recipient email address. The recipient address
     * can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
     * not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even
     * if the message contains other recipients that are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
     * email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
     * the <code>SendBulkTemplatedEmail</code> operation several times to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of destinations you can contact in a single call to the API may be limited by your account's maximum
     * sending rate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendBulkTemplatedEmailRequest
     *        Represents a request to send a templated email to multiple destinations using Amazon SES. For more
     *        information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SendBulkTemplatedEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendBulkTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBulkTemplatedEmail" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SendBulkTemplatedEmailResult sendBulkTemplatedEmail(SendBulkTemplatedEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendBulkTemplatedEmail(request);
    }

    @SdkInternalApi
    final SendBulkTemplatedEmailResult executeSendBulkTemplatedEmail(SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendBulkTemplatedEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendBulkTemplatedEmailRequest> request = null;
        Response<SendBulkTemplatedEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendBulkTemplatedEmailRequestMarshaller().marshall(super.beforeMarshalling(sendBulkTemplatedEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendBulkTemplatedEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendBulkTemplatedEmailResult> responseHandler = new StaxResponseHandler<SendBulkTemplatedEmailResult>(
                    new SendBulkTemplatedEmailResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
     * attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email template. For more information about
     * creating and using custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest
     *        Represents a request to send a custom verification email to a specified recipient.
     * @return Result of the SendCustomVerificationEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     *         Indicates that a custom verification email template with the name you specified does not exist.
     * @throws FromEmailAddressNotVerifiedException
     *         Indicates that the sender address specified for a custom verification email is not verified, and is
     *         therefore not eligible to send the custom verification email.
     * @throws ProductionAccessNotGrantedException
     *         Indicates that the account has not been granted production access.
     * @sample AmazonSimpleEmailService.SendCustomVerificationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendCustomVerificationEmail"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendCustomVerificationEmailResult sendCustomVerificationEmail(SendCustomVerificationEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendCustomVerificationEmail(request);
    }

    @SdkInternalApi
    final SendCustomVerificationEmailResult executeSendCustomVerificationEmail(SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendCustomVerificationEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCustomVerificationEmailRequest> request = null;
        Response<SendCustomVerificationEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCustomVerificationEmailRequestMarshaller().marshall(super.beforeMarshalling(sendCustomVerificationEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendCustomVerificationEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendCustomVerificationEmailResult> responseHandler = new StaxResponseHandler<SendCustomVerificationEmailResult>(
                    new SendCustomVerificationEmailResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Composes an email message and immediately queues it for sending. In order to send email using the
     * <code>SendEmail</code> operation, your message must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain. If you attempt to send email using a
     * non-verified address or domain, the operation will result in an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must include at least one recipient email address. The recipient address can be a To: address, a CC:
     * address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even if the message
     * contains other recipients that are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
     * email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
     * the <code>SendEmail</code> operation several times to send the message to each group.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
     * BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your <i>sending
     * quota</i>). For more information about sending quotas in Amazon SES, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Managing Your Amazon SES
     * Sending Limits</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </important>
     * 
     * @param sendEmailRequest
     *        Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer
     *        Guide</a>.
     * @return Result of the SendEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendEmailResult sendEmail(SendEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendEmail(request);
    }

    @SdkInternalApi
    final SendEmailResult executeSendEmail(SendEmailRequest sendEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendEmailRequest> request = null;
        Response<SendEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendEmailRequestMarshaller().marshall(super.beforeMarshalling(sendEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendEmailResult> responseHandler = new StaxResponseHandler<SendEmailResult>(new SendEmailResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Composes an email message and immediately queues it for sending.
     * </p>
     * <p>
     * This operation is more flexible than the <code>SendEmail</code> API operation. When you use the
     * <code>SendRawEmail</code> operation, you can specify the headers of the message as well as its content. This
     * flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains
     * both a text and an HTML version). You can also use this operation to send messages that include attachments.
     * </p>
     * <p>
     * The <code>SendRawEmail</code> operation has the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">verified email
     * addresses or domains</a>. If you try to send email from an address that isn't verified, the operation results in
     * an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html">Amazon SES
     * sandbox</a>, you can only send email to other verified addresses in your account, or to addresses that are
     * associated with the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html">Amazon
     * SES mailbox simulator</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size, including attachments, is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message has to include at least one recipient address. A recipient address includes any address on the To:,
     * CC:, or BCC: lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a
     * valid format (that is, it's not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), Amazon SES
     * rejects the entire message, even if the other addresses are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a
     * single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less
     * than 50 recipients, and send separate messages to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES
     * has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't
     * preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding">MIME
     * Encoding</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, keep the following considerations in mind when using the <code>SendRawEmail</code> operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although you can customize the message headers when using the <code>SendRawEmail</code> operation, Amazon SES
     * will automatically apply its own <code>Message-ID</code> and <code>Date</code> headers; if you passed these
     * headers when creating the message, they will be overwritten by the values that Amazon SES provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user, <code>SendRawEmail</code> enables you
     * to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two
     * ways: you can pass optional parameters <code>SourceArn</code>, <code>FromArn</code>, and/or
     * <code>ReturnPathArn</code> to the API, or you can include the following X-headers in the header of your raw
     * email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.
     * </p>
     * </important>
     * <p>
     * For most common sending authorization scenarios, we recommend that you specify the <code>SourceIdentityArn</code>
     * parameter and not the <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code> parameters. If you only
     * specify the <code>SourceIdentityArn</code> parameter, Amazon SES will set the From and Return Path addresses to
     * the identity specified in <code>SourceIdentityArn</code>. For more information about sending authorization, see
     * the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Using Sending
     * Authorization with Amazon SES</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
     * BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your <i>sending
     * quota</i>). For more information about sending quotas in Amazon SES, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html">Managing Your Amazon SES
     * Sending Limits</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest
     *        Represents a request to send a single raw email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *        Guide</a>.
     * @return Result of the SendRawEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendRawEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendRawEmail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendRawEmailResult sendRawEmail(SendRawEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendRawEmail(request);
    }

    @SdkInternalApi
    final SendRawEmailResult executeSendRawEmail(SendRawEmailRequest sendRawEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendRawEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendRawEmailRequest> request = null;
        Response<SendRawEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendRawEmailRequestMarshaller().marshall(super.beforeMarshalling(sendRawEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendRawEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendRawEmailResult> responseHandler = new StaxResponseHandler<SendRawEmailResult>(new SendRawEmailResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Composes an email message using an email template and immediately queues it for sending.
     * </p>
     * <p>
     * In order to send email using the <code>SendTemplatedEmail</code> operation, your call to the API must meet the
     * following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email templates using the <a>CreateTemplate</a>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
     * email addresses associated with the Amazon SES Mailbox Simulator. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls to the <code>SendTemplatedEmail</code> operation may only include one <code>Destination</code> parameter. A
     * destination is a set of recipients who will receive the same version of the email. The <code>Destination</code>
     * parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Destination</code> parameter must include at least one recipient email address. The recipient address
     * can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
     * not in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will be rejected, even
     * if the message contains other recipients that are valid.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If your call to the <code>SendTemplatedEmail</code> operation includes all of the required parameters, Amazon SES
     * accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains
     * errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't
     * return a message stating that it was unable to send the email.
     * </p>
     * <p>
     * For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering
     * Failure events occur. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Sending Personalized
     * Email Using the Amazon SES API</a> in the <i>Amazon Simple Email Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param sendTemplatedEmailRequest
     *        Represents a request to send a templated email using Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SendTemplatedEmail operation returned by the service.
     * @throws MessageRejectedException
     *         Indicates that the action failed, and the message could not be sent. Check the error stack for more
     *         information about what caused the error.
     * @throws MailFromDomainNotVerifiedException
     *         Indicates that the message could not be sent because Amazon SES could not read the MX record required to
     *         use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings
     *         for an identity, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer
     *         Guide</a>.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws ConfigurationSetSendingPausedException
     *         Indicates that email sending is disabled for the configuration set.</p>
     *         <p>
     *         You can enable or disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     * @throws AccountSendingPausedException
     *         Indicates that email sending is disabled for your entire Amazon SES account.
     *         </p>
     *         <p>
     *         You can enable or disable email sending for your Amazon SES account using
     *         <a>UpdateAccountSendingEnabled</a>.
     * @sample AmazonSimpleEmailService.SendTemplatedEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendTemplatedEmail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendTemplatedEmailResult sendTemplatedEmail(SendTemplatedEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendTemplatedEmail(request);
    }

    @SdkInternalApi
    final SendTemplatedEmailResult executeSendTemplatedEmail(SendTemplatedEmailRequest sendTemplatedEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTemplatedEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTemplatedEmailRequest> request = null;
        Response<SendTemplatedEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTemplatedEmailRequestMarshaller().marshall(super.beforeMarshalling(sendTemplatedEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendTemplatedEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendTemplatedEmailResult> responseHandler = new StaxResponseHandler<SendTemplatedEmailResult>(
                    new SendTemplatedEmailResultStaxUnmarshaller());
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
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to
     * null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest
     *        Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets
     *        to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SetActiveReceiptRuleSet operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @sample AmazonSimpleEmailService.SetActiveReceiptRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetActiveReceiptRuleSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(SetActiveReceiptRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeSetActiveReceiptRuleSet(request);
    }

    @SdkInternalApi
    final SetActiveReceiptRuleSetResult executeSetActiveReceiptRuleSet(SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(setActiveReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetActiveReceiptRuleSetRequest> request = null;
        Response<SetActiveReceiptRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetActiveReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(setActiveReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetActiveReceiptRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (such as <code>example.com</code>), then Amazon SES
     * will DKIM-sign all email sent by addresses under that domain name (for example, <code>user@example.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email
     * address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (for example, <code>user@example.com</code>), you can only enable Easy DKIM signing if the
     * corresponding domain (in this case, <code>example.com</code>) has been set up for Easy DKIM using the AWS Console
     * or the <code>VerifyDomainDkim</code> operation.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest
     *        Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more
     *        information about setting up Easy DKIM, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * @return Result of the SetIdentityDkimEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityDkimEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityDkimEnabled" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetIdentityDkimEnabledResult setIdentityDkimEnabled(SetIdentityDkimEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityDkimEnabled(request);
    }

    @SdkInternalApi
    final SetIdentityDkimEnabledResult executeSetIdentityDkimEnabled(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityDkimEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityDkimEnabledRequest> request = null;
        Response<SetIdentityDkimEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityDkimEnabledRequestMarshaller().marshall(super.beforeMarshalling(setIdentityDkimEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityDkimEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and
     * complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest
     *        Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint
     *        notifications through email. For information about email feedback forwarding, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SetIdentityFeedbackForwardingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityFeedbackForwardingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityFeedbackForwardingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(SetIdentityFeedbackForwardingEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityFeedbackForwardingEnabled(request);
    }

    @SdkInternalApi
    final SetIdentityFeedbackForwardingEnabledResult executeSetIdentityFeedbackForwardingEnabled(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityFeedbackForwardingEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityFeedbackForwardingEnabledRequest> request = null;
        Response<SetIdentityFeedbackForwardingEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityFeedbackForwardingEnabledRequestMarshaller().marshall(super
                        .beforeMarshalling(setIdentityFeedbackForwardingEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityFeedbackForwardingEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in
     * the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest
     *        Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS
     *        notifications of a specified type. For information about notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SetIdentityHeadersInNotificationsEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityHeadersInNotificationsEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityHeadersInNotificationsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIdentityHeadersInNotificationsEnabledResult setIdentityHeadersInNotificationsEnabled(SetIdentityHeadersInNotificationsEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityHeadersInNotificationsEnabled(request);
    }

    @SdkInternalApi
    final SetIdentityHeadersInNotificationsEnabledResult executeSetIdentityHeadersInNotificationsEnabled(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityHeadersInNotificationsEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityHeadersInNotificationsEnabledRequest> request = null;
        Response<SetIdentityHeadersInNotificationsEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityHeadersInNotificationsEnabledRequestMarshaller().marshall(super
                        .beforeMarshalling(setIdentityHeadersInNotificationsEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityHeadersInNotificationsEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetIdentityHeadersInNotificationsEnabledResult> responseHandler = new StaxResponseHandler<SetIdentityHeadersInNotificationsEnabledResult>(
                    new SetIdentityHeadersInNotificationsEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS
     * settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an
     * SPF record. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html">Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest
     *        Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified
     *        identity. For information about using a custom MAIL FROM domain, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
     * @return Result of the SetIdentityMailFromDomain operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityMailFromDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityMailFromDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIdentityMailFromDomainResult setIdentityMailFromDomain(SetIdentityMailFromDomainRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityMailFromDomain(request);
    }

    @SdkInternalApi
    final SetIdentityMailFromDomainResult executeSetIdentityMailFromDomain(SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityMailFromDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityMailFromDomainRequest> request = null;
        Response<SetIdentityMailFromDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityMailFromDomainRequestMarshaller().marshall(super.beforeMarshalling(setIdentityMailFromDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityMailFromDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetIdentityMailFromDomainResult> responseHandler = new StaxResponseHandler<SetIdentityMailFromDomainResult>(
                    new SetIdentityMailFromDomainResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use
     * this operation, you specify a verified identity, such as an email address or domain. When you send an email that
     * uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can
     * send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that
     * you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest
     *        Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint,
     *        or delivery notifications for emails sent with that identity as the Source. For information about Amazon
     *        SES notifications, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SetIdentityNotificationTopic operation returned by the service.
     * @sample AmazonSimpleEmailService.SetIdentityNotificationTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityNotificationTopic"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIdentityNotificationTopicResult setIdentityNotificationTopic(SetIdentityNotificationTopicRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityNotificationTopic(request);
    }

    @SdkInternalApi
    final SetIdentityNotificationTopicResult executeSetIdentityNotificationTopic(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityNotificationTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityNotificationTopicRequest> request = null;
        Response<SetIdentityNotificationTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityNotificationTopicRequestMarshaller().marshall(super.beforeMarshalling(setIdentityNotificationTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityNotificationTopic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest
     *        Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule
     *        sets to receive email with Amazon SES. For more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SetReceiptRulePosition operation returned by the service.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @sample AmazonSimpleEmailService.SetReceiptRulePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetReceiptRulePosition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetReceiptRulePositionResult setReceiptRulePosition(SetReceiptRulePositionRequest request) {
        request = beforeClientExecution(request);
        return executeSetReceiptRulePosition(request);
    }

    @SdkInternalApi
    final SetReceiptRulePositionResult executeSetReceiptRulePosition(SetReceiptRulePositionRequest setReceiptRulePositionRequest) {

        ExecutionContext executionContext = createExecutionContext(setReceiptRulePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetReceiptRulePositionRequest> request = null;
        Response<SetReceiptRulePositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetReceiptRulePositionRequestMarshaller().marshall(super.beforeMarshalling(setReceiptRulePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetReceiptRulePosition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderTemplateRequest
     * @return Result of the TestRenderTemplate operation returned by the service.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws InvalidRenderingParameterException
     *         Indicates that one or more of the replacement values you provided is invalid. This error may occur when
     *         the TemplateData object contains invalid JSON.
     * @throws MissingRenderingAttributeException
     *         Indicates that one or more of the replacement values for the specified template was not specified. Ensure
     *         that the TemplateData object contains references to all of the replacement tags in the specified
     *         template.
     * @sample AmazonSimpleEmailService.TestRenderTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TestRenderTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestRenderTemplateResult testRenderTemplate(TestRenderTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeTestRenderTemplate(request);
    }

    @SdkInternalApi
    final TestRenderTemplateResult executeTestRenderTemplate(TestRenderTemplateRequest testRenderTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(testRenderTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRenderTemplateRequest> request = null;
        Response<TestRenderTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRenderTemplateRequestMarshaller().marshall(super.beforeMarshalling(testRenderTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestRenderTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TestRenderTemplateResult> responseHandler = new StaxResponseHandler<TestRenderTemplateResult>(
                    new TestRenderTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use
     * this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon
     * SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain
     * thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateAccountSendingEnabledRequest
     *        Represents a request to enable or disable the email sending capabilities for your entire Amazon SES
     *        account.
     * @return Result of the UpdateAccountSendingEnabled operation returned by the service.
     * @sample AmazonSimpleEmailService.UpdateAccountSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateAccountSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountSendingEnabledResult updateAccountSendingEnabled(UpdateAccountSendingEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountSendingEnabled(request);
    }

    @SdkInternalApi
    final UpdateAccountSendingEnabledResult executeUpdateAccountSendingEnabled(UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountSendingEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSendingEnabledRequest> request = null;
        Response<UpdateAccountSendingEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSendingEnabledRequestMarshaller().marshall(super.beforeMarshalling(updateAccountSendingEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountSendingEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateAccountSendingEnabledResult> responseHandler = new StaxResponseHandler<UpdateAccountSendingEnabledResult>(
                    new UpdateAccountSendingEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the event destination of a configuration set. Event destinations are associated with configuration sets,
     * which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple
     * Notification Service (Amazon SNS). For information about using configuration sets, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Monitoring Your Amazon
     * SES Sending Activity</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and only one, destination. The destination
     * can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        Represents a request to update the event destination of a configuration set. Configuration sets enable you
     *        to publish email sending events. For information about using configuration sets, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws EventDestinationDoesNotExistException
     *         Indicates that the event destination does not exist.
     * @throws InvalidCloudWatchDestinationException
     *         Indicates that the Amazon CloudWatch destination is invalid. See the error message for details.
     * @throws InvalidFirehoseDestinationException
     *         Indicates that the Amazon Kinesis Firehose destination is invalid. See the error message for details.
     * @throws InvalidSNSDestinationException
     *         Indicates that the Amazon Simple Notification Service (Amazon SNS) destination is invalid. See the error
     *         message for details.
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(UpdateConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final UpdateConfigurationSetEventDestinationResult executeUpdateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationSetEventDestinationRequest> request = null;
        Response<UpdateConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationSetEventDestinationRequestMarshaller().marshall(super
                        .beforeMarshalling(updateConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateConfigurationSetEventDestinationResult> responseHandler = new StaxResponseHandler<UpdateConfigurationSetEventDestinationResult>(
                    new UpdateConfigurationSetEventDestinationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a
     * given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon
     * CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetReputationMetricsEnabledRequest
     *        Represents a request to modify the reputation metric publishing settings for a configuration set.
     * @return Result of the UpdateConfigurationSetReputationMetricsEnabled operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetReputationMetricsEnabled
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetReputationMetricsEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationSetReputationMetricsEnabledResult updateConfigurationSetReputationMetricsEnabled(
            UpdateConfigurationSetReputationMetricsEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationSetReputationMetricsEnabled(request);
    }

    @SdkInternalApi
    final UpdateConfigurationSetReputationMetricsEnabledResult executeUpdateConfigurationSetReputationMetricsEnabled(
            UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationSetReputationMetricsEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationSetReputationMetricsEnabledRequest> request = null;
        Response<UpdateConfigurationSetReputationMetricsEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationSetReputationMetricsEnabledRequestMarshaller().marshall(super
                        .beforeMarshalling(updateConfigurationSetReputationMetricsEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationSetReputationMetricsEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateConfigurationSetReputationMetricsEnabledResult> responseHandler = new StaxResponseHandler<UpdateConfigurationSetReputationMetricsEnabledResult>(
                    new UpdateConfigurationSetReputationMetricsEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You
     * can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a
     * configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate)
     * exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetSendingEnabledRequest
     *        Represents a request to enable or disable the email sending capabilities for a specific configuration set.
     * @return Result of the UpdateConfigurationSetSendingEnabled operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetSendingEnabled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetSendingEnabled"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationSetSendingEnabled(request);
    }

    @SdkInternalApi
    final UpdateConfigurationSetSendingEnabledResult executeUpdateConfigurationSetSendingEnabled(
            UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationSetSendingEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationSetSendingEnabledRequest> request = null;
        Response<UpdateConfigurationSetSendingEnabledResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationSetSendingEnabledRequestMarshaller().marshall(super
                        .beforeMarshalling(updateConfigurationSetSendingEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationSetSendingEnabled");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateConfigurationSetSendingEnabledResult> responseHandler = new StaxResponseHandler<UpdateConfigurationSetSendingEnabledResult>(
                    new UpdateConfigurationSetSendingEnabledResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an association between a configuration set and a custom domain for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
     * SES. You can configure a subdomain of your own to handle these events. For information about using custom
     * domains, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param updateConfigurationSetTrackingOptionsRequest
     *        Represents a request to update the tracking options for a configuration set.
     * @return Result of the UpdateConfigurationSetTrackingOptions operation returned by the service.
     * @throws ConfigurationSetDoesNotExistException
     *         Indicates that the configuration set does not exist.
     * @throws TrackingOptionsDoesNotExistException
     *         Indicates that the TrackingOptions object you specified does not exist.
     * @throws InvalidTrackingOptionsException
     *         Indicates that the custom domain to be used for open and click tracking redirects is invalid. This error
     *         appears most often in the following situations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not verified in Amazon SES.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When the tracking domain you specified is not a valid domain or subdomain.
     *         </p>
     *         </li>
     * @sample AmazonSimpleEmailService.UpdateConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationSetTrackingOptionsResult updateConfigurationSetTrackingOptions(UpdateConfigurationSetTrackingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationSetTrackingOptions(request);
    }

    @SdkInternalApi
    final UpdateConfigurationSetTrackingOptionsResult executeUpdateConfigurationSetTrackingOptions(
            UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationSetTrackingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationSetTrackingOptionsRequest> request = null;
        Response<UpdateConfigurationSetTrackingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationSetTrackingOptionsRequestMarshaller().marshall(super
                        .beforeMarshalling(updateConfigurationSetTrackingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationSetTrackingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateConfigurationSetTrackingOptionsResult> responseHandler = new StaxResponseHandler<UpdateConfigurationSetTrackingOptionsResult>(
                    new UpdateConfigurationSetTrackingOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest
     *        Represents a request to update an existing custom verification email template.
     * @return Result of the UpdateCustomVerificationEmailTemplate operation returned by the service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     *         Indicates that a custom verification email template with the name you specified does not exist.
     * @throws FromEmailAddressNotVerifiedException
     *         Indicates that the sender address specified for a custom verification email is not verified, and is
     *         therefore not eligible to send the custom verification email.
     * @throws CustomVerificationEmailInvalidContentException
     *         Indicates that custom verification email template provided content is invalid.
     * @sample AmazonSimpleEmailService.UpdateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCustomVerificationEmailTemplateResult updateCustomVerificationEmailTemplate(UpdateCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final UpdateCustomVerificationEmailTemplateResult executeUpdateCustomVerificationEmailTemplate(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomVerificationEmailTemplateRequest> request = null;
        Response<UpdateCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomVerificationEmailTemplateRequestMarshaller().marshall(super
                        .beforeMarshalling(updateCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateCustomVerificationEmailTemplateResult> responseHandler = new StaxResponseHandler<UpdateCustomVerificationEmailTemplateResult>(
                    new UpdateCustomVerificationEmailTemplateResultStaxUnmarshaller());
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
     * For information about managing receipt rules, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest
     *        Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For
     *        more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the UpdateReceiptRule operation returned by the service.
     * @throws InvalidSnsTopicException
     *         Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the
     *         topic, possibly due to permissions issues. For information about giving permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidS3ConfigurationException
     *         Indicates that the provided Amazon S3 bucket or AWS KMS encryption key is invalid, or that Amazon SES
     *         could not publish to the bucket, possibly due to permissions issues. For information about giving
     *         permissions, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES
     *         Developer Guide</a>.
     * @throws InvalidLambdaFunctionException
     *         Indicates that the provided AWS Lambda function is invalid, or that Amazon SES could not execute the
     *         provided function, possibly due to permissions issues. For information about giving permissions, see the
     *         <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon
     *         SES Developer Guide</a>.
     * @throws RuleSetDoesNotExistException
     *         Indicates that the provided receipt rule set does not exist.
     * @throws RuleDoesNotExistException
     *         Indicates that the provided receipt rule does not exist.
     * @throws LimitExceededException
     *         Indicates that a resource could not be created because of service limits. For a list of Amazon SES
     *         limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES
     *         Developer Guide</a>.
     * @sample AmazonSimpleEmailService.UpdateReceiptRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateReceiptRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReceiptRule(request);
    }

    @SdkInternalApi
    final UpdateReceiptRuleResult executeUpdateReceiptRule(UpdateReceiptRuleRequest updateReceiptRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReceiptRuleRequest> request = null;
        Response<UpdateReceiptRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(updateReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReceiptRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws TemplateDoesNotExistException
     *         Indicates that the Template object you specified does not exist in your Amazon SES account.
     * @throws InvalidTemplateException
     *         Indicates that the template that you specified could not be rendered. This issue may occur when a
     *         template refers to a partial that does not exist.
     * @sample AmazonSimpleEmailService.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTemplateResult updateTemplate(UpdateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplate(request);
    }

    @SdkInternalApi
    final UpdateTemplateResult executeUpdateTemplate(UpdateTemplateRequest updateTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateRequest> request = null;
        Response<UpdateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateRequestMarshaller().marshall(super.beforeMarshalling(updateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateTemplateResult> responseHandler = new StaxResponseHandler<UpdateTemplateResult>(
                    new UpdateTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are character strings that represent your domain's
     * identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by
     * Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email
     * originating from that domain.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the <code>SetIdentityDkimEnabled</code> operation.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest
     *        Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more
     *        information about setting up Easy DKIM, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.
     * @return Result of the VerifyDomainDkim operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyDomainDkim
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainDkim" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyDomainDkimResult verifyDomainDkim(VerifyDomainDkimRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyDomainDkim(request);
    }

    @SdkInternalApi
    final VerifyDomainDkimResult executeVerifyDomainDkim(VerifyDomainDkimRequest verifyDomainDkimRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyDomainDkimRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyDomainDkimRequest> request = null;
        Response<VerifyDomainDkimResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyDomainDkimRequestMarshaller().marshall(super.beforeMarshalling(verifyDomainDkimRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyDomainDkim");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to
     * verify it. For more information about verifying domains, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Verifying Email
     * Addresses and Domains</a> in the <i>Amazon SES Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest
     *        Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must
     *        publish to the DNS server of your domain to complete the verification. For information about domain
     *        verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html">Amazon SES Developer
     *        Guide</a>.
     * @return Result of the VerifyDomainIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyDomainIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyDomainIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyDomainIdentityResult verifyDomainIdentity(VerifyDomainIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyDomainIdentity(request);
    }

    @SdkInternalApi
    final VerifyDomainIdentityResult executeVerifyDomainIdentity(VerifyDomainIdentityRequest verifyDomainIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyDomainIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyDomainIdentityRequest> request = null;
        Response<VerifyDomainIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyDomainIdentityRequestMarshaller().marshall(super.beforeMarshalling(verifyDomainIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyDomainIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deprecated. Use the <code>VerifyEmailIdentity</code> operation to verify a new email address.
     * </p>
     * 
     * @param verifyEmailAddressRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the VerifyEmailAddress operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailAddress" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyEmailAddressResult verifyEmailAddress(VerifyEmailAddressRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyEmailAddress(request);
    }

    @SdkInternalApi
    final VerifyEmailAddressResult executeVerifyEmailAddress(VerifyEmailAddressRequest verifyEmailAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyEmailAddressRequest> request = null;
        Response<VerifyEmailAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyEmailAddressRequestMarshaller().marshall(super.beforeMarshalling(verifyEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyEmailAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<VerifyEmailAddressResult> responseHandler = new StaxResponseHandler<VerifyEmailAddressResult>(
                    new VerifyEmailAddressResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and
     * attempts to verify it. As a result of executing this operation, a verification email is sent to the specified
     * address.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest
     *        Represents a request to begin email address verification with Amazon SES. For information about email
     *        address verification, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the VerifyEmailIdentity operation returned by the service.
     * @sample AmazonSimpleEmailService.VerifyEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/VerifyEmailIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyEmailIdentityResult verifyEmailIdentity(VerifyEmailIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyEmailIdentity(request);
    }

    @SdkInternalApi
    final VerifyEmailIdentityResult executeVerifyEmailIdentity(VerifyEmailIdentityRequest verifyEmailIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyEmailIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyEmailIdentityRequest> request = null;
        Response<VerifyEmailIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyEmailIdentityRequestMarshaller().marshall(super.beforeMarshalling(verifyEmailIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SES");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyEmailIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public AmazonSimpleEmailServiceWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonSimpleEmailServiceWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
