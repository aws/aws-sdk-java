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
package com.amazonaws.services.sns;

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

import com.amazonaws.services.sns.AmazonSNSClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.services.sns.model.transform.*;

/**
 * Client for accessing Amazon SNS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled
 * applications. Applications can use Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this product see <a
 * href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. For detailed information about Amazon SNS features
 * and their associated API calls, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain
 * functionality that automatically takes care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available SDKs, go to <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSNSClient extends AmazonWebServiceClient implements AmazonSNS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSNS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sns";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon SNS. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonSNSClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSNSClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Amazon SNS (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonSNSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSNSClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonSNSClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonSNSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonSNSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SNS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonSNSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSNSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonSNSClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SNS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonSNSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SNS (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonSNSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSNSClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSNSClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonSNSClientBuilder builder() {
        return AmazonSNSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSNSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SNS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSNSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new SubscriptionLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EndpointDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FilterPolicyLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSOptInRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSAccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TopicLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ThrottledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PlatformApplicationDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSThrottlingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSecurityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.sns.model.AmazonSNSException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://sns.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sns/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sns/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the
     * specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddPermissionResult addPermission(AddPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAddPermission(request);
    }

    @SdkInternalApi
    final AddPermissionResult executeAddPermission(AddPermissionRequest addPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<AddPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPermissionRequestMarshaller().marshall(super.beforeMarshalling(addPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddPermissionResult> responseHandler = new StaxResponseHandler<AddPermissionResult>(new AddPermissionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public AddPermissionResult addPermission(String topicArn, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actionNames) {
        return addPermission(new AddPermissionRequest().withTopicArn(topicArn).withLabel(label).withAWSAccountIds(aWSAccountIds).withActionNames(actionNames));
    }

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your
     * account. You cannot send SMS messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest
     *        The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
     * @return Result of the CheckIfPhoneNumberIsOptedOut operation returned by the service.
     * @throws ThrottledException
     *         Indicates that the rate at which requests have been submitted for this action exceeds the limit for your
     *         account.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @sample AmazonSNS.CheckIfPhoneNumberIsOptedOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CheckIfPhoneNumberIsOptedOut"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CheckIfPhoneNumberIsOptedOutResult checkIfPhoneNumberIsOptedOut(CheckIfPhoneNumberIsOptedOutRequest request) {
        request = beforeClientExecution(request);
        return executeCheckIfPhoneNumberIsOptedOut(request);
    }

    @SdkInternalApi
    final CheckIfPhoneNumberIsOptedOutResult executeCheckIfPhoneNumberIsOptedOut(CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest) {

        ExecutionContext executionContext = createExecutionContext(checkIfPhoneNumberIsOptedOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckIfPhoneNumberIsOptedOutRequest> request = null;
        Response<CheckIfPhoneNumberIsOptedOutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckIfPhoneNumberIsOptedOutRequestMarshaller().marshall(super.beforeMarshalling(checkIfPhoneNumberIsOptedOutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckIfPhoneNumberIsOptedOut");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CheckIfPhoneNumberIsOptedOutResult> responseHandler = new StaxResponseHandler<CheckIfPhoneNumberIsOptedOutResult>(
                    new CheckIfPhoneNumberIsOptedOutResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an
     * earlier <code>Subscribe</code> action. If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest
     *        Input for ConfirmSubscription action.
     * @return Result of the ConfirmSubscription operation returned by the service.
     * @throws SubscriptionLimitExceededException
     *         Indicates that the customer already owns the maximum allowed number of subscriptions.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.ConfirmSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ConfirmSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ConfirmSubscriptionResult confirmSubscription(ConfirmSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmSubscription(request);
    }

    @SdkInternalApi
    final ConfirmSubscriptionResult executeConfirmSubscription(ConfirmSubscriptionRequest confirmSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmSubscriptionRequest> request = null;
        Response<ConfirmSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(confirmSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ConfirmSubscriptionResult> responseHandler = new StaxResponseHandler<ConfirmSubscriptionResult>(
                    new ConfirmSubscriptionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ConfirmSubscriptionResult confirmSubscription(String topicArn, String token, String authenticateOnUnsubscribe) {
        return confirmSubscription(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token)
                .withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe));
    }

    @Override
    public ConfirmSubscriptionResult confirmSubscription(String topicArn, String token) {
        return confirmSubscription(new ConfirmSubscriptionRequest().withTopicArn(topicArn).withToken(token));
    }

    /**
     * <p>
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM,
     * to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code> action. The PlatformPrincipal is received from
     * the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM,
     * PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS,
     * PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key".
     * </p>
     * <p>
     * For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential
     * is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when
     * using <code>CreatePlatformApplication</code> is then used as an attribute for the
     * <code>CreatePlatformEndpoint</code> action. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of
     * the supported push notification services, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-apns.html">Getting Started with Apple Push
     * Notification Service</a>, <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-adm.html">Getting Started
     * with Amazon Device Messaging</a>, <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-baidu.html">Getting Started with Baidu Cloud Push</a>,
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-gcm.html">Getting Started with Google Cloud
     * Messaging for Android</a>, <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-mpns.html">Getting
     * Started with MPNS</a>, or <a href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-wns.html">Getting Started
     * with WNS</a>.
     * </p>
     * 
     * @param createPlatformApplicationRequest
     *        Input for CreatePlatformApplication action.
     * @return Result of the CreatePlatformApplication operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.CreatePlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePlatformApplicationResult createPlatformApplication(CreatePlatformApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlatformApplication(request);
    }

    @SdkInternalApi
    final CreatePlatformApplicationResult executeCreatePlatformApplication(CreatePlatformApplicationRequest createPlatformApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlatformApplicationRequest> request = null;
        Response<CreatePlatformApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlatformApplicationRequestMarshaller().marshall(super.beforeMarshalling(createPlatformApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlatformApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreatePlatformApplicationResult> responseHandler = new StaxResponseHandler<CreatePlatformApplicationResult>(
                    new CreatePlatformApplicationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM
     * and APNS. <code>CreatePlatformEndpoint</code> requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code>. The EndpointArn that is returned when using
     * <code>CreatePlatformEndpoint</code> can then be used by the <code>Publish</code> action to send a message to a
     * mobile app or by the <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the requester already owns an endpoint with the
     * same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile
     * Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes must be provided: ChannelId and UserId.
     * The token field must also contain the ChannelId. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html">Creating an Amazon SNS Endpoint
     * for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest
     *        Input for CreatePlatformEndpoint action.
     * @return Result of the CreatePlatformEndpoint operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.CreatePlatformEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreatePlatformEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePlatformEndpointResult createPlatformEndpoint(CreatePlatformEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlatformEndpoint(request);
    }

    @SdkInternalApi
    final CreatePlatformEndpointResult executeCreatePlatformEndpoint(CreatePlatformEndpointRequest createPlatformEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlatformEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlatformEndpointRequest> request = null;
        Response<CreatePlatformEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlatformEndpointRequestMarshaller().marshall(super.beforeMarshalling(createPlatformEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlatformEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreatePlatformEndpointResult> responseHandler = new StaxResponseHandler<CreatePlatformEndpointResult>(
                    new CreatePlatformEndpointResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more
     * information, see <a href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. This action is idempotent,
     * so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a
     * new topic.
     * </p>
     * 
     * @param createTopicRequest
     *        Input for CreateTopic action.
     * @return Result of the CreateTopic operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws TopicLimitExceededException
     *         Indicates that the customer already owns the maximum allowed number of topics.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidSecurityException
     *         The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using
     *         Signature Version 4.
     * @sample AmazonSNS.CreateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTopicResult createTopic(CreateTopicRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTopic(request);
    }

    @SdkInternalApi
    final CreateTopicResult executeCreateTopic(CreateTopicRequest createTopicRequest) {

        ExecutionContext executionContext = createExecutionContext(createTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTopicRequest> request = null;
        Response<CreateTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTopicRequestMarshaller().marshall(super.beforeMarshalling(createTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTopic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTopicResult> responseHandler = new StaxResponseHandler<CreateTopicResult>(new CreateTopicResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateTopicResult createTopic(String name) {
        return createTopic(new CreateTopicRequest().withName(name));
    }

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more
     * information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile
     * Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from
     * the topic.
     * </p>
     * 
     * @param deleteEndpointRequest
     *        Input for DeleteEndpoint action.
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpoint(request);
    }

    @SdkInternalApi
    final DeleteEndpointResult executeDeleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestMarshaller().marshall(super.beforeMarshalling(deleteEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteEndpointResult> responseHandler = new StaxResponseHandler<DeleteEndpointResult>(
                    new DeleteEndpointResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM.
     * For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS
     * Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest
     *        Input for DeletePlatformApplication action.
     * @return Result of the DeletePlatformApplication operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.DeletePlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeletePlatformApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePlatformApplicationResult deletePlatformApplication(DeletePlatformApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlatformApplication(request);
    }

    @SdkInternalApi
    final DeletePlatformApplicationResult executeDeletePlatformApplication(DeletePlatformApplicationRequest deletePlatformApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlatformApplicationRequest> request = null;
        Response<DeletePlatformApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlatformApplicationRequestMarshaller().marshall(super.beforeMarshalling(deletePlatformApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlatformApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeletePlatformApplicationResult> responseHandler = new StaxResponseHandler<DeletePlatformApplicationResult>(
                    new DeletePlatformApplicationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the
     * topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist
     * does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @return Result of the DeleteTopic operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.DeleteTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteTopic" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTopicResult deleteTopic(DeleteTopicRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTopic(request);
    }

    @SdkInternalApi
    final DeleteTopicResult executeDeleteTopic(DeleteTopicRequest deleteTopicRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTopicRequest> request = null;
        Response<DeleteTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTopicRequestMarshaller().marshall(super.beforeMarshalling(deleteTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTopic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTopicResult> responseHandler = new StaxResponseHandler<DeleteTopicResult>(new DeleteTopicResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteTopicResult deleteTopic(String topicArn) {
        return deleteTopic(new DeleteTopicRequest().withTopicArn(topicArn));
    }

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM
     * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest
     *        Input for GetEndpointAttributes action.
     * @return Result of the GetEndpointAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.GetEndpointAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetEndpointAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEndpointAttributesResult getEndpointAttributes(GetEndpointAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEndpointAttributes(request);
    }

    @SdkInternalApi
    final GetEndpointAttributesResult executeGetEndpointAttributes(GetEndpointAttributesRequest getEndpointAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEndpointAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEndpointAttributesRequest> request = null;
        Response<GetEndpointAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEndpointAttributesRequestMarshaller().marshall(super.beforeMarshalling(getEndpointAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEndpointAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetEndpointAttributesResult> responseHandler = new StaxResponseHandler<GetEndpointAttributesResult>(
                    new GetEndpointAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the supported push notification services, such as
     * APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest
     *        Input for GetPlatformApplicationAttributes action.
     * @return Result of the GetPlatformApplicationAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.GetPlatformApplicationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetPlatformApplicationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPlatformApplicationAttributesResult getPlatformApplicationAttributes(GetPlatformApplicationAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetPlatformApplicationAttributes(request);
    }

    @SdkInternalApi
    final GetPlatformApplicationAttributesResult executeGetPlatformApplicationAttributes(
            GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getPlatformApplicationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlatformApplicationAttributesRequest> request = null;
        Response<GetPlatformApplicationAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlatformApplicationAttributesRequestMarshaller().marshall(super.beforeMarshalling(getPlatformApplicationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPlatformApplicationAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetPlatformApplicationAttributesResult> responseHandler = new StaxResponseHandler<GetPlatformApplicationAttributesResult>(
                    new GetPlatformApplicationAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the settings for sending SMS messages from your account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest
     *        The input for the <code>GetSMSAttributes</code> request.
     * @return Result of the GetSMSAttributes operation returned by the service.
     * @throws ThrottledException
     *         Indicates that the rate at which requests have been submitted for this action exceeds the limit for your
     *         account.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @sample AmazonSNS.GetSMSAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSMSAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSMSAttributesResult getSMSAttributes(GetSMSAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSMSAttributes(request);
    }

    @SdkInternalApi
    final GetSMSAttributesResult executeGetSMSAttributes(GetSMSAttributesRequest getSMSAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSMSAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSMSAttributesRequest> request = null;
        Response<GetSMSAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSMSAttributesRequestMarshaller().marshall(super.beforeMarshalling(getSMSAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSMSAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSMSAttributesResult> responseHandler = new StaxResponseHandler<GetSMSAttributesResult>(
                    new GetSMSAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest
     *        Input for GetSubscriptionAttributes.
     * @return Result of the GetSubscriptionAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.GetSubscriptionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSubscriptionAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSubscriptionAttributesResult getSubscriptionAttributes(GetSubscriptionAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscriptionAttributes(request);
    }

    @SdkInternalApi
    final GetSubscriptionAttributesResult executeGetSubscriptionAttributes(GetSubscriptionAttributesRequest getSubscriptionAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriptionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionAttributesRequest> request = null;
        Response<GetSubscriptionAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionAttributesRequestMarshaller().marshall(super.beforeMarshalling(getSubscriptionAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscriptionAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSubscriptionAttributesResult> responseHandler = new StaxResponseHandler<GetSubscriptionAttributesResult>(
                    new GetSubscriptionAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetSubscriptionAttributesResult getSubscriptionAttributes(String subscriptionArn) {
        return getSubscriptionAttributes(new GetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn));
    }

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of
     * the user.
     * </p>
     * 
     * @param getTopicAttributesRequest
     *        Input for GetTopicAttributes action.
     * @return Result of the GetTopicAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidSecurityException
     *         The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using
     *         Signature Version 4.
     * @sample AmazonSNS.GetTopicAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetTopicAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTopicAttributesResult getTopicAttributes(GetTopicAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetTopicAttributes(request);
    }

    @SdkInternalApi
    final GetTopicAttributesResult executeGetTopicAttributes(GetTopicAttributesRequest getTopicAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getTopicAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTopicAttributesRequest> request = null;
        Response<GetTopicAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTopicAttributesRequestMarshaller().marshall(super.beforeMarshalling(getTopicAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTopicAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTopicAttributesResult> responseHandler = new StaxResponseHandler<GetTopicAttributesResult>(
                    new GetTopicAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetTopicAttributesResult getTopicAttributes(String topicArn) {
        return getTopicAttributes(new GetTopicAttributesRequest().withTopicArn(topicArn));
    }

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are paginated and return a limited list of
     * endpoints, up to 100. If additional records are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call <code>ListEndpointsByPlatformApplication</code> again using
     * the NextToken string received from the previous call. When there are no more records to return, NextToken will be
     * null. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest
     *        Input for ListEndpointsByPlatformApplication action.
     * @return Result of the ListEndpointsByPlatformApplication operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.ListEndpointsByPlatformApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListEndpointsByPlatformApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEndpointsByPlatformApplicationResult listEndpointsByPlatformApplication(ListEndpointsByPlatformApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeListEndpointsByPlatformApplication(request);
    }

    @SdkInternalApi
    final ListEndpointsByPlatformApplicationResult executeListEndpointsByPlatformApplication(
            ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(listEndpointsByPlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointsByPlatformApplicationRequest> request = null;
        Response<ListEndpointsByPlatformApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointsByPlatformApplicationRequestMarshaller()
                        .marshall(super.beforeMarshalling(listEndpointsByPlatformApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEndpointsByPlatformApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListEndpointsByPlatformApplicationResult> responseHandler = new StaxResponseHandler<ListEndpointsByPlatformApplicationResult>(
                    new ListEndpointsByPlatformApplicationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and each page returns up to 100 phone
     * numbers. If additional phone numbers are available after the first page of results, then a <code>NextToken</code>
     * string will be returned. To receive the next page, you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest
     *        The input for the <code>ListPhoneNumbersOptedOut</code> action.
     * @return Result of the ListPhoneNumbersOptedOut operation returned by the service.
     * @throws ThrottledException
     *         Indicates that the rate at which requests have been submitted for this action exceeds the limit for your
     *         account.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @sample AmazonSNS.ListPhoneNumbersOptedOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPhoneNumbersOptedOut" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPhoneNumbersOptedOutResult listPhoneNumbersOptedOut(ListPhoneNumbersOptedOutRequest request) {
        request = beforeClientExecution(request);
        return executeListPhoneNumbersOptedOut(request);
    }

    @SdkInternalApi
    final ListPhoneNumbersOptedOutResult executeListPhoneNumbersOptedOut(ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest) {

        ExecutionContext executionContext = createExecutionContext(listPhoneNumbersOptedOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumbersOptedOutRequest> request = null;
        Response<ListPhoneNumbersOptedOutResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumbersOptedOutRequestMarshaller().marshall(super.beforeMarshalling(listPhoneNumbersOptedOutRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPhoneNumbersOptedOut");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPhoneNumbersOptedOutResult> responseHandler = new StaxResponseHandler<ListPhoneNumbersOptedOutResult>(
                    new ListPhoneNumbersOptedOutResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The
     * results for <code>ListPlatformApplications</code> are paginated and return a limited list of applications, up to
     * 100. If additional records are available after the first page results, then a NextToken string will be returned.
     * To receive the next page, you call <code>ListPlatformApplications</code> using the NextToken string received from
     * the previous call. When there are no more records to return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using Amazon SNS Mobile Push
     * Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest
     *        Input for ListPlatformApplications action.
     * @return Result of the ListPlatformApplications operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.ListPlatformApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPlatformApplications" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPlatformApplicationsResult listPlatformApplications(ListPlatformApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlatformApplications(request);
    }

    @SdkInternalApi
    final ListPlatformApplicationsResult executeListPlatformApplications(ListPlatformApplicationsRequest listPlatformApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPlatformApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlatformApplicationsRequest> request = null;
        Response<ListPlatformApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlatformApplicationsRequestMarshaller().marshall(super.beforeMarshalling(listPlatformApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlatformApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPlatformApplicationsResult> responseHandler = new StaxResponseHandler<ListPlatformApplicationsResult>(
                    new ListPlatformApplicationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPlatformApplicationsResult listPlatformApplications() {
        return listPlatformApplications(new ListPlatformApplicationsRequest());
    }

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If
     * there are more subscriptions, a <code>NextToken</code> is also returned. Use the <code>NextToken</code> parameter
     * in a new <code>ListSubscriptions</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest
     *        Input for ListSubscriptions action.
     * @return Result of the ListSubscriptions operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.ListSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSubscriptionsResult listSubscriptions(ListSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscriptions(request);
    }

    @SdkInternalApi
    final ListSubscriptionsResult executeListSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionsRequest> request = null;
        Response<ListSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscriptionsRequestMarshaller().marshall(super.beforeMarshalling(listSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListSubscriptionsResult> responseHandler = new StaxResponseHandler<ListSubscriptionsResult>(
                    new ListSubscriptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListSubscriptionsResult listSubscriptions() {
        return listSubscriptions(new ListSubscriptionsRequest());
    }

    @Override
    public ListSubscriptionsResult listSubscriptions(String nextToken) {
        return listSubscriptions(new ListSubscriptionsRequest().withNextToken(nextToken));
    }

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to
     * 100. If there are more subscriptions, a <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest
     *        Input for ListSubscriptionsByTopic action.
     * @return Result of the ListSubscriptionsByTopic operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.ListSubscriptionsByTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptionsByTopic" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(ListSubscriptionsByTopicRequest request) {
        request = beforeClientExecution(request);
        return executeListSubscriptionsByTopic(request);
    }

    @SdkInternalApi
    final ListSubscriptionsByTopicResult executeListSubscriptionsByTopic(ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubscriptionsByTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionsByTopicRequest> request = null;
        Response<ListSubscriptionsByTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscriptionsByTopicRequestMarshaller().marshall(super.beforeMarshalling(listSubscriptionsByTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubscriptionsByTopic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListSubscriptionsByTopicResult> responseHandler = new StaxResponseHandler<ListSubscriptionsByTopicResult>(
                    new ListSubscriptionsByTopicResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(String topicArn) {
        return listSubscriptionsByTopic(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn));
    }

    @Override
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(String topicArn, String nextToken) {
        return listSubscriptionsByTopic(new ListSubscriptionsByTopicRequest().withTopicArn(topicArn).withNextToken(nextToken));
    }

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are
     * more topics, a <code>NextToken</code> is also returned. Use the <code>NextToken</code> parameter in a new
     * <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @return Result of the ListTopics operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.ListTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListTopics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTopicsResult listTopics(ListTopicsRequest request) {
        request = beforeClientExecution(request);
        return executeListTopics(request);
    }

    @SdkInternalApi
    final ListTopicsResult executeListTopics(ListTopicsRequest listTopicsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTopicsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicsRequest> request = null;
        Response<ListTopicsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicsRequestMarshaller().marshall(super.beforeMarshalling(listTopicsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTopics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTopicsResult> responseHandler = new StaxResponseHandler<ListTopicsResult>(new ListTopicsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTopicsResult listTopics() {
        return listTopics(new ListTopicsRequest());
    }

    @Override
    public ListTopicsResult listTopics(String nextToken) {
        return listTopics(new ListTopicsRequest().withNextToken(nextToken));
    }

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to
     * the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest
     *        Input for the OptInPhoneNumber action.
     * @return Result of the OptInPhoneNumber operation returned by the service.
     * @throws ThrottledException
     *         Indicates that the rate at which requests have been submitted for this action exceeds the limit for your
     *         account.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @sample AmazonSNS.OptInPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/OptInPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public OptInPhoneNumberResult optInPhoneNumber(OptInPhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeOptInPhoneNumber(request);
    }

    @SdkInternalApi
    final OptInPhoneNumberResult executeOptInPhoneNumber(OptInPhoneNumberRequest optInPhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(optInPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OptInPhoneNumberRequest> request = null;
        Response<OptInPhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new OptInPhoneNumberRequestMarshaller().marshall(super.beforeMarshalling(optInPhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "OptInPhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<OptInPhoneNumberResult> responseHandler = new StaxResponseHandler<OptInPhoneNumberResult>(
                    new OptInPhoneNumberResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the
     * topic. The format of the message depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and Amazon SNS will attempt to deliver it
     * shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile endpoint, such as an app on a Kindle
     * device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned
     * when making a call with the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html">Send Custom Platform-Specific
     * Payloads in Messages to Mobile Devices</a>.
     * </p>
     * 
     * @param publishRequest
     *        Input for Publish action.
     * @return Result of the Publish operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InvalidParameterValueException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws EndpointDisabledException
     *         Exception error indicating endpoint disabled.
     * @throws PlatformApplicationDisabledException
     *         Exception error indicating platform application disabled.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws KMSDisabledException
     *         The request was rejected because the specified customer master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource isn't valid for this request. For
     *         more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSNotFoundException
     *         The request was rejected because the specified entity or resource can't be found.
     * @throws KMSOptInRequiredException
     *         The AWS access key ID needs a subscription for the service.
     * @throws KMSThrottlingException
     *         The request was denied due to request throttling. For more information about throttling, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in
     *         the <i>AWS Key Management Service Developer Guide.</i>
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or that you don't have access to.
     * @throws InvalidSecurityException
     *         The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using
     *         Signature Version 4.
     * @sample AmazonSNS.Publish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Publish" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishResult publish(PublishRequest request) {
        request = beforeClientExecution(request);
        return executePublish(request);
    }

    @SdkInternalApi
    final PublishResult executePublish(PublishRequest publishRequest) {

        ExecutionContext executionContext = createExecutionContext(publishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishRequest> request = null;
        Response<PublishResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishRequestMarshaller().marshall(super.beforeMarshalling(publishRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Publish");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PublishResult> responseHandler = new StaxResponseHandler<PublishResult>(new PublishResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public PublishResult publish(String topicArn, String message) {
        return publish(new PublishRequest().withTopicArn(topicArn).withMessage(message));
    }

    @Override
    public PublishResult publish(String topicArn, String message, String subject) {
        return publish(new PublishRequest().withTopicArn(topicArn).withMessage(message).withSubject(subject));
    }

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest
     *        Input for RemovePermission action.
     * @return Result of the RemovePermission operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/RemovePermission" target="_top">AWS API
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
                request = new RemovePermissionRequestMarshaller().marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemovePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemovePermissionResult> responseHandler = new StaxResponseHandler<RemovePermissionResult>(
                    new RemovePermissionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public RemovePermissionResult removePermission(String topicArn, String label) {
        return removePermission(new RemovePermissionRequest().withTopicArn(topicArn).withLabel(label));
    }

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM
     * and APNS. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest
     *        Input for SetEndpointAttributes action.
     * @return Result of the SetEndpointAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.SetEndpointAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetEndpointAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetEndpointAttributesResult setEndpointAttributes(SetEndpointAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSetEndpointAttributes(request);
    }

    @SdkInternalApi
    final SetEndpointAttributesResult executeSetEndpointAttributes(SetEndpointAttributesRequest setEndpointAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(setEndpointAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetEndpointAttributesRequest> request = null;
        Response<SetEndpointAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetEndpointAttributesRequestMarshaller().marshall(super.beforeMarshalling(setEndpointAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetEndpointAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetEndpointAttributesResult> responseHandler = new StaxResponseHandler<SetEndpointAttributesResult>(
                    new SetEndpointAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS
     * and GCM. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring attributes for message delivery status,
     * see <a href="http://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html">Using Amazon SNS Application
     * Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest
     *        Input for SetPlatformApplicationAttributes action.
     * @return Result of the SetPlatformApplicationAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @sample AmazonSNS.SetPlatformApplicationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetPlatformApplicationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetPlatformApplicationAttributesResult setPlatformApplicationAttributes(SetPlatformApplicationAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSetPlatformApplicationAttributes(request);
    }

    @SdkInternalApi
    final SetPlatformApplicationAttributesResult executeSetPlatformApplicationAttributes(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(setPlatformApplicationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetPlatformApplicationAttributesRequest> request = null;
        Response<SetPlatformApplicationAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetPlatformApplicationAttributesRequestMarshaller().marshall(super.beforeMarshalling(setPlatformApplicationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetPlatformApplicationAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetPlatformApplicationAttributesResult> responseHandler = new StaxResponseHandler<SetPlatformApplicationAttributesResult>(
                    new SetPlatformApplicationAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use the <code>Publish</code> action with
     * the <code>MessageAttributes.entry.N</code> parameter. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html">Sending an SMS Message</a> in the
     * <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param setSMSAttributesRequest
     *        The input for the SetSMSAttributes action.
     * @return Result of the SetSMSAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws ThrottledException
     *         Indicates that the rate at which requests have been submitted for this action exceeds the limit for your
     *         account.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.SetSMSAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSMSAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetSMSAttributesResult setSMSAttributes(SetSMSAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSetSMSAttributes(request);
    }

    @SdkInternalApi
    final SetSMSAttributesResult executeSetSMSAttributes(SetSMSAttributesRequest setSMSAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(setSMSAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSMSAttributesRequest> request = null;
        Response<SetSMSAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetSMSAttributesRequestMarshaller().marshall(super.beforeMarshalling(setSMSAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetSMSAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetSMSAttributesResult> responseHandler = new StaxResponseHandler<SetSMSAttributesResult>(
                    new SetSMSAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest
     *        Input for SetSubscriptionAttributes action.
     * @return Result of the SetSubscriptionAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws FilterPolicyLimitExceededException
     *         Indicates that the number of filter polices in your AWS account exceeds the limit. To add more filter
     *         polices, submit an SNS Limit Increase case in the AWS Support Center.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @sample AmazonSNS.SetSubscriptionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSubscriptionAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetSubscriptionAttributesResult setSubscriptionAttributes(SetSubscriptionAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSetSubscriptionAttributes(request);
    }

    @SdkInternalApi
    final SetSubscriptionAttributesResult executeSetSubscriptionAttributes(SetSubscriptionAttributesRequest setSubscriptionAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(setSubscriptionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSubscriptionAttributesRequest> request = null;
        Response<SetSubscriptionAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetSubscriptionAttributesRequestMarshaller().marshall(super.beforeMarshalling(setSubscriptionAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetSubscriptionAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetSubscriptionAttributesResult> responseHandler = new StaxResponseHandler<SetSubscriptionAttributesResult>(
                    new SetSubscriptionAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SetSubscriptionAttributesResult setSubscriptionAttributes(String subscriptionArn, String attributeName, String attributeValue) {
        return setSubscriptionAttributes(new SetSubscriptionAttributesRequest().withSubscriptionArn(subscriptionArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest
     *        Input for SetTopicAttributes action.
     * @return Result of the SetTopicAttributes operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidSecurityException
     *         The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using
     *         Signature Version 4.
     * @sample AmazonSNS.SetTopicAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetTopicAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetTopicAttributesResult setTopicAttributes(SetTopicAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSetTopicAttributes(request);
    }

    @SdkInternalApi
    final SetTopicAttributesResult executeSetTopicAttributes(SetTopicAttributesRequest setTopicAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(setTopicAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTopicAttributesRequest> request = null;
        Response<SetTopicAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTopicAttributesRequestMarshaller().marshall(super.beforeMarshalling(setTopicAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetTopicAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetTopicAttributesResult> responseHandler = new StaxResponseHandler<SetTopicAttributesResult>(
                    new SetTopicAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SetTopicAttributesResult setTopicAttributes(String topicArn, String attributeName, String attributeValue) {
        return setTopicAttributes(new SetTopicAttributesRequest().withTopicArn(topicArn).withAttributeName(attributeName).withAttributeValue(attributeValue));
    }

    /**
     * <p>
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest
     *        Input for Subscribe action.
     * @return Result of the Subscribe operation returned by the service.
     * @throws SubscriptionLimitExceededException
     *         Indicates that the customer already owns the maximum allowed number of subscriptions.
     * @throws FilterPolicyLimitExceededException
     *         Indicates that the number of filter polices in your AWS account exceeds the limit. To add more filter
     *         polices, submit an SNS Limit Increase case in the AWS Support Center.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws InvalidSecurityException
     *         The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using
     *         Signature Version 4.
     * @sample AmazonSNS.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Subscribe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SubscribeResult subscribe(SubscribeRequest request) {
        request = beforeClientExecution(request);
        return executeSubscribe(request);
    }

    @SdkInternalApi
    final SubscribeResult executeSubscribe(SubscribeRequest subscribeRequest) {

        ExecutionContext executionContext = createExecutionContext(subscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeRequest> request = null;
        Response<SubscribeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeRequestMarshaller().marshall(super.beforeMarshalling(subscribeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Subscribe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SubscribeResult> responseHandler = new StaxResponseHandler<SubscribeResult>(new SubscribeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SubscribeResult subscribe(String topicArn, String protocol, String endpoint) {
        return subscribe(new SubscribeRequest().withTopicArn(topicArn).withProtocol(protocol).withEndpoint(endpoint));
    }

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the
     * subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the requester is not the subscription owner, a
     * final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the
     * topic if the <code>Unsubscribe</code> request was unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest
     *        Input for Unsubscribe action.
     * @return Result of the Unsubscribe operation returned by the service.
     * @throws InvalidParameterException
     *         Indicates that a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws AuthorizationErrorException
     *         Indicates that the user has been denied access to the requested resource.
     * @throws NotFoundException
     *         Indicates that the requested resource does not exist.
     * @throws InvalidSecurityException
     *         The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using
     *         Signature Version 4.
     * @sample AmazonSNS.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/Unsubscribe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnsubscribeResult unsubscribe(UnsubscribeRequest request) {
        request = beforeClientExecution(request);
        return executeUnsubscribe(request);
    }

    @SdkInternalApi
    final UnsubscribeResult executeUnsubscribe(UnsubscribeRequest unsubscribeRequest) {

        ExecutionContext executionContext = createExecutionContext(unsubscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeRequest> request = null;
        Response<UnsubscribeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeRequestMarshaller().marshall(super.beforeMarshalling(unsubscribeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SNS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Unsubscribe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UnsubscribeResult> responseHandler = new StaxResponseHandler<UnsubscribeResult>(new UnsubscribeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UnsubscribeResult unsubscribe(String subscriptionArn) {
        return unsubscribe(new UnsubscribeRequest().withSubscriptionArn(subscriptionArn));
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

}
