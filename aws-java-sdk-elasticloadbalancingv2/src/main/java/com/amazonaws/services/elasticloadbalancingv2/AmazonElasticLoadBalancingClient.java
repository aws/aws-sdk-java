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
package com.amazonaws.services.elasticloadbalancingv2;

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

import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder;
import com.amazonaws.services.elasticloadbalancingv2.waiters.AmazonElasticLoadBalancingWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.services.elasticloadbalancingv2.model.transform.*;

/**
 * Client for accessing Elastic Load Balancing v2. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase
 * the availability of your application. The load balancer also monitors the health of its registered targets and
 * ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic
 * by specifying one or more listeners, which are configured with a protocol and port number for connections from
 * clients to the load balancer. You configure a target group with a protocol and port number for connections from the
 * load balancer to the targets, and with health check settings to be used when checking the health status of the
 * targets.
 * </p>
 * <p>
 * Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load
 * Balancers, and Classic Load Balancers.
 * </p>
 * <p>
 * An Application Load Balancer makes routing and load balancing decisions at the application layer (HTTP/HTTPS). A
 * Network Load Balancer makes routing and load balancing decisions at the transport layer (TCP/TLS). Both Application
 * Load Balancers and Network Load Balancers can route requests to one or more ports on each EC2 instance or container
 * instance in your virtual private cloud (VPC).
 * </p>
 * <p>
 * A Classic Load Balancer makes routing and load balancing decisions either at the transport layer (TCP/SSL) or the
 * application layer (HTTP/HTTPS), and supports either EC2-Classic or a VPC. For more information, see the <a
 * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/">Elastic Load Balancing User Guide</a>.
 * </p>
 * <p>
 * This reference covers the 2015-12-01 API, which supports Application Load Balancers and Network Load Balancers. The
 * 2012-06-01 API supports Classic Load Balancers.
 * </p>
 * <p>
 * To get started, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a load balancer using <a>CreateLoadBalancer</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a target group using <a>CreateTargetGroup</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Register targets for the target group using <a>RegisterTargets</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create one or more listeners for your load balancer using <a>CreateListener</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * To delete a load balancer and its related resources, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Delete the load balancer using <a>DeleteLoadBalancer</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Delete the target group using <a>DeleteTargetGroup</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat
 * an operation, it succeeds.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticLoadBalancingClient extends AmazonWebServiceClient implements AmazonElasticLoadBalancing {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticLoadBalancing.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticloadbalancing";

    private volatile AmazonElasticLoadBalancingWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2. A credentials provider chain will
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
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Elastic Load Balancing v2 (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AmazonElasticLoadBalancingClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Load Balancing v2 (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Load Balancing v2 (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Load Balancing v2 (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticLoadBalancingClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonElasticLoadBalancingClientBuilder builder() {
        return AmazonElasticLoadBalancingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticLoadBalancingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing v2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticLoadBalancingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new UnsupportedProtocolExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AllocationIdNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateTargetGroupNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyRulesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCertificatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LoadBalancerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTargetGroupsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLoadBalancersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidConfigurationRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TargetGroupAssociationLimitExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSecurityGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IncompatibleProtocolsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyActionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyListenersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateLoadBalancerNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationNotPermittedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLoadBalancerActionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateTagKeysExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TargetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyRegistrationsForTargetIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SSLPolicyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ListenerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PriorityInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTargetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AvailabilityZoneNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RuleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateListenerExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSchemeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HealthUnavailableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTargetsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new StandardErrorUnmarshaller(com.amazonaws.services.elasticloadbalancingv2.model.AmazonElasticLoadBalancingException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticloadbalancing.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticloadbalancingv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticloadbalancingv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds the specified certificate to the specified HTTPS listener.
     * </p>
     * <p>
     * If the certificate was already added, the call is successful but the certificate is not added again.
     * </p>
     * <p>
     * To list the certificates for your listener, use <a>DescribeListenerCertificates</a>. To remove certificates from
     * your listener, use <a>RemoveListenerCertificates</a>. To specify the default SSL server certificate, use
     * <a>ModifyListener</a>.
     * </p>
     * 
     * @param addListenerCertificatesRequest
     * @return Result of the AddListenerCertificates operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws TooManyCertificatesException
     *         You've reached the limit on the number of certificates per load balancer.
     * @throws CertificateNotFoundException
     *         The specified certificate does not exist.
     * @sample AmazonElasticLoadBalancing.AddListenerCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddListenerCertificatesResult addListenerCertificates(AddListenerCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeAddListenerCertificates(request);
    }

    @SdkInternalApi
    final AddListenerCertificatesResult executeAddListenerCertificates(AddListenerCertificatesRequest addListenerCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(addListenerCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddListenerCertificatesRequest> request = null;
        Response<AddListenerCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddListenerCertificatesRequestMarshaller().marshall(super.beforeMarshalling(addListenerCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddListenerCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddListenerCertificatesResult> responseHandler = new StaxResponseHandler<AddListenerCertificatesResult>(
                    new AddListenerCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load
     * Balancers, Network Load Balancers, and your target groups.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>. To remove tags from your resources, use
     * <a>RemoveTags</a>.
     * </p>
     * 
     * @param addTagsRequest
     * @return Result of the AddTags operation returned by the service.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws TooManyTagsException
     *         You've reached the limit on the number of tags per load balancer.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AddTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddTagsResult> responseHandler = new StaxResponseHandler<AddTagsResult>(new AddTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a listener for the specified Application Load Balancer or Network Load Balancer.
     * </p>
     * <p>
     * To update a listener, use <a>ModifyListener</a>. When you are finished with a listener, you can delete it using
     * <a>DeleteListener</a>. If you are finished with both the listener and the load balancer, you can delete them both
     * using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * listeners with the same settings, each call succeeds.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html">Listeners
     * for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-listeners.html">Listeners for
     * Your Network Load Balancers</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     * @return Result of the CreateListener operation returned by the service.
     * @throws DuplicateListenerException
     *         A listener with the specified port already exists.
     * @throws TooManyListenersException
     *         You've reached the limit on the number of listeners per load balancer.
     * @throws TooManyCertificatesException
     *         You've reached the limit on the number of certificates per load balancer.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws TargetGroupAssociationLimitException
     *         You've reached the limit on the number of load balancers per target group.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws IncompatibleProtocolsException
     *         The specified configuration is not valid with this protocol.
     * @throws SSLPolicyNotFoundException
     *         The specified SSL policy does not exist.
     * @throws CertificateNotFoundException
     *         The specified certificate does not exist.
     * @throws UnsupportedProtocolException
     *         The specified protocol is not supported.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @throws TooManyTargetsException
     *         You've reached the limit on the number of targets.
     * @throws TooManyActionsException
     *         You've reached the limit on the number of actions per rule.
     * @throws InvalidLoadBalancerActionException
     *         The requested action is not valid.
     * @sample AmazonElasticLoadBalancing.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateListenerResult createListener(CreateListenerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateListener(request);
    }

    @SdkInternalApi
    final CreateListenerResult executeCreateListener(CreateListenerRequest createListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(createListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateListenerRequest> request = null;
        Response<CreateListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateListenerRequestMarshaller().marshall(super.beforeMarshalling(createListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateListenerResult> responseHandler = new StaxResponseHandler<CreateListenerResult>(
                    new CreateListenerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Application Load Balancer or a Network Load Balancer.
     * </p>
     * <p>
     * When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags.
     * Otherwise, you could do so later using <a>SetSecurityGroups</a>, <a>SetSubnets</a>, <a>SetIpAddressType</a>, and
     * <a>AddTags</a>.
     * </p>
     * <p>
     * To create listeners for your load balancer, use <a>CreateListener</a>. To describe your current load balancers,
     * see <a>DescribeLoadBalancers</a>. When you are finished with a load balancer, you can delete it using
     * <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * For limit information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Limits for
     * Your Application Load Balancer</a> in the <i>Application Load Balancers Guide</i> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html">Limits for Your
     * Network Load Balancer</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * load balancers with the same settings, each call succeeds.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html"
     * >Application Load Balancers</a> in the <i>Application Load Balancers Guide</i> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html">Network Load
     * Balancers</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return Result of the CreateLoadBalancer operation returned by the service.
     * @throws DuplicateLoadBalancerNameException
     *         A load balancer with the specified name already exists.
     * @throws TooManyLoadBalancersException
     *         You've reached the limit on the number of load balancers for your AWS account.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws SubnetNotFoundException
     *         The specified subnet does not exist.
     * @throws InvalidSubnetException
     *         The specified subnet is out of available addresses.
     * @throws InvalidSecurityGroupException
     *         The specified security group does not exist.
     * @throws InvalidSchemeException
     *         The requested scheme is not valid.
     * @throws TooManyTagsException
     *         You've reached the limit on the number of tags per load balancer.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws ResourceInUseException
     *         A specified resource is in use.
     * @throws AllocationIdNotFoundException
     *         The specified allocation ID does not exist.
     * @throws AvailabilityZoneNotSupportedException
     *         The specified Availability Zone is not supported.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoadBalancer(request);
    }

    @SdkInternalApi
    final CreateLoadBalancerResult executeCreateLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerRequest> request = null;
        Response<CreateLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerRequestMarshaller().marshall(super.beforeMarshalling(createLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateLoadBalancerResult> responseHandler = new StaxResponseHandler<CreateLoadBalancerResult>(
                    new CreateLoadBalancerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer.
     * </p>
     * <p>
     * Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule
     * are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are
     * performed. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules"
     * >Listener Rules</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * To view your current rules, use <a>DescribeRules</a>. To update a rule, use <a>ModifyRule</a>. To set the
     * priorities of your rules, use <a>SetRulePriorities</a>. To delete a rule, use <a>DeleteRule</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws PriorityInUseException
     *         The specified priority is in use.
     * @throws TooManyTargetGroupsException
     *         You've reached the limit on the number of target groups for your AWS account.
     * @throws TooManyRulesException
     *         You've reached the limit on the number of rules per load balancer.
     * @throws TargetGroupAssociationLimitException
     *         You've reached the limit on the number of load balancers per target group.
     * @throws IncompatibleProtocolsException
     *         The specified configuration is not valid with this protocol.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @throws TooManyTargetsException
     *         You've reached the limit on the number of targets.
     * @throws UnsupportedProtocolException
     *         The specified protocol is not supported.
     * @throws TooManyActionsException
     *         You've reached the limit on the number of actions per rule.
     * @throws InvalidLoadBalancerActionException
     *         The requested action is not valid.
     * @sample AmazonElasticLoadBalancing.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRule(request);
    }

    @SdkInternalApi
    final CreateRuleResult executeCreateRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestMarshaller().marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateRuleResult> responseHandler = new StaxResponseHandler<CreateRuleResult>(new CreateRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a target group.
     * </p>
     * <p>
     * To register targets with the target group, use <a>RegisterTargets</a>. To update the health check settings for
     * the target group, use <a>ModifyTargetGroup</a>. To monitor the health of targets in the target group, use
     * <a>DescribeTargetHealth</a>.
     * </p>
     * <p>
     * To route traffic to the targets in a target group, specify the target group in an action using
     * <a>CreateListener</a> or <a>CreateRule</a>.
     * </p>
     * <p>
     * To delete a target group, use <a>DeleteTargetGroup</a>.
     * </p>
     * <p>
     * This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple
     * target groups with the same settings, each call succeeds.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html"
     * >Target Groups for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i> or <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html">Target
     * Groups for Your Network Load Balancers</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     * @return Result of the CreateTargetGroup operation returned by the service.
     * @throws DuplicateTargetGroupNameException
     *         A target group with the specified name already exists.
     * @throws TooManyTargetGroupsException
     *         You've reached the limit on the number of target groups for your AWS account.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @sample AmazonElasticLoadBalancing.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTargetGroupResult createTargetGroup(CreateTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTargetGroup(request);
    }

    @SdkInternalApi
    final CreateTargetGroupResult executeCreateTargetGroup(CreateTargetGroupRequest createTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTargetGroupRequest> request = null;
        Response<CreateTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTargetGroupRequestMarshaller().marshall(super.beforeMarshalling(createTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTargetGroupResult> responseHandler = new StaxResponseHandler<CreateTargetGroupResult>(
                    new CreateTargetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * <p>
     * Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using
     * <a>DeleteLoadBalancer</a>.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return Result of the DeleteListener operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @sample AmazonElasticLoadBalancing.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteListenerResult deleteListener(DeleteListenerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteListener(request);
    }

    @SdkInternalApi
    final DeleteListenerResult executeDeleteListener(DeleteListenerRequest deleteListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteListenerRequest> request = null;
        Response<DeleteListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteListenerRequestMarshaller().marshall(super.beforeMarshalling(deleteListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteListenerResult> responseHandler = new StaxResponseHandler<DeleteListenerResult>(
                    new DeleteListenerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners.
     * </p>
     * <p>
     * You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
     * already been deleted, the call succeeds.
     * </p>
     * <p>
     * Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
     * and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
     * terminate them.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return Result of the DeleteLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ResourceInUseException
     *         A specified resource is in use.
     * @sample AmazonElasticLoadBalancing.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoadBalancer(request);
    }

    @SdkInternalApi
    final DeleteLoadBalancerResult executeDeleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerRequest> request = null;
        Response<DeleteLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerRequestMarshaller().marshall(super.beforeMarshalling(deleteLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteLoadBalancerResult> responseHandler = new StaxResponseHandler<DeleteLoadBalancerResult>(
                    new DeleteLoadBalancerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteRule"
     *      target="_top">AWS API Documentation</a>
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
                request = new DeleteRuleRequestMarshaller().marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteRuleResult> responseHandler = new StaxResponseHandler<DeleteRuleResult>(new DeleteRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified target group.
     * </p>
     * <p>
     * You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
     * associated health checks.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @return Result of the DeleteTargetGroup operation returned by the service.
     * @throws ResourceInUseException
     *         A specified resource is in use.
     * @sample AmazonElasticLoadBalancing.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeleteTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTargetGroupResult deleteTargetGroup(DeleteTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTargetGroup(request);
    }

    @SdkInternalApi
    final DeleteTargetGroupResult executeDeleteTargetGroup(DeleteTargetGroupRequest deleteTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTargetGroupRequest> request = null;
        Response<DeleteTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTargetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTargetGroupResult> responseHandler = new StaxResponseHandler<DeleteTargetGroupResult>(
                    new DeleteTargetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
     * longer receive traffic from the load balancer.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @return Result of the DeregisterTargets operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws InvalidTargetException
     *         The specified target does not exist, is not in the same VPC as the target group, or has an unsupported
     *         instance type.
     * @sample AmazonElasticLoadBalancing.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DeregisterTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterTargetsResult deregisterTargets(DeregisterTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTargets(request);
    }

    @SdkInternalApi
    final DeregisterTargetsResult executeDeregisterTargets(DeregisterTargetsRequest deregisterTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTargetsRequest> request = null;
        Response<DeregisterTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTargetsRequestMarshaller().marshall(super.beforeMarshalling(deregisterTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeregisterTargetsResult> responseHandler = new StaxResponseHandler<DeregisterTargetsResult>(
                    new DeregisterTargetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current Elastic Load Balancing resource limits for your AWS account.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Limits for
     * Your Application Load Balancers</a> in the <i>Application Load Balancer Guide</i> or <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html">Limits for Your
     * Network Load Balancers</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonElasticLoadBalancing.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountLimits(request);
    }

    @SdkInternalApi
    final DescribeAccountLimitsResult executeDescribeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountLimitsRequest> request = null;
        Response<DescribeAccountLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountLimitsRequestMarshaller().marshall(super.beforeMarshalling(describeAccountLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAccountLimitsResult> responseHandler = new StaxResponseHandler<DescribeAccountLimitsResult>(
                    new DescribeAccountLimitsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the certificates for the specified HTTPS listener.
     * </p>
     * 
     * @param describeListenerCertificatesRequest
     * @return Result of the DescribeListenerCertificates operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeListenerCertificates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeListenerCertificatesResult describeListenerCertificates(DescribeListenerCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeListenerCertificates(request);
    }

    @SdkInternalApi
    final DescribeListenerCertificatesResult executeDescribeListenerCertificates(DescribeListenerCertificatesRequest describeListenerCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeListenerCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeListenerCertificatesRequest> request = null;
        Response<DescribeListenerCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeListenerCertificatesRequestMarshaller().marshall(super.beforeMarshalling(describeListenerCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeListenerCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeListenerCertificatesResult> responseHandler = new StaxResponseHandler<DescribeListenerCertificatesResult>(
                    new DescribeListenerCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load
     * Balancer. You must specify either a load balancer or one or more listeners.
     * </p>
     * 
     * @param describeListenersRequest
     * @return Result of the DescribeListeners operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws UnsupportedProtocolException
     *         The specified protocol is not supported.
     * @sample AmazonElasticLoadBalancing.DescribeListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListeners"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeListenersResult describeListeners(DescribeListenersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeListeners(request);
    }

    @SdkInternalApi
    final DescribeListenersResult executeDescribeListeners(DescribeListenersRequest describeListenersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeListenersRequest> request = null;
        Response<DescribeListenersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeListenersRequestMarshaller().marshall(super.beforeMarshalling(describeListenersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeListeners");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeListenersResult> responseHandler = new StaxResponseHandler<DescribeListenersResult>(
                    new DescribeListenersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the attributes for the specified Application Load Balancer or Network Load Balancer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes"
     * >Load Balancer Attributes</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#load-balancer-attributes"
     * >Load Balancer Attributes</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     * @return Result of the DescribeLoadBalancerAttributes operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBalancerAttributes(request);
    }

    @SdkInternalApi
    final DescribeLoadBalancerAttributesResult executeDescribeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerAttributesRequest> request = null;
        Response<DescribeLoadBalancerAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBalancerAttributesRequestMarshaller().marshall(super.beforeMarshalling(describeLoadBalancerAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBalancerAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoadBalancerAttributesResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancerAttributesResult>(
                    new DescribeLoadBalancerAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified load balancers or all of your load balancers.
     * </p>
     * <p>
     * To describe the listeners for a load balancer, use <a>DescribeListeners</a>. To describe the attributes for a
     * load balancer, use <a>DescribeLoadBalancerAttributes</a>.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return Result of the DescribeLoadBalancers operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBalancers(request);
    }

    @SdkInternalApi
    final DescribeLoadBalancersResult executeDescribeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancersRequest> request = null;
        Response<DescribeLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBalancersRequestMarshaller().marshall(super.beforeMarshalling(describeLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBalancers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoadBalancersResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancersResult>(
                    new DescribeLoadBalancersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
     * or more rules.
     * </p>
     * 
     * @param describeRulesRequest
     * @return Result of the DescribeRules operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws UnsupportedProtocolException
     *         The specified protocol is not supported.
     * @sample AmazonElasticLoadBalancing.DescribeRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRulesResult describeRules(DescribeRulesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRules(request);
    }

    @SdkInternalApi
    final DescribeRulesResult executeDescribeRules(DescribeRulesRequest describeRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRulesRequest> request = null;
        Response<DescribeRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRulesRequestMarshaller().marshall(super.beforeMarshalling(describeRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeRulesResult> responseHandler = new StaxResponseHandler<DescribeRulesResult>(new DescribeRulesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified policies or all policies used for SSL negotiation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies"
     * >Security Policies</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeSSLPoliciesRequest
     * @return Result of the DescribeSSLPolicies operation returned by the service.
     * @throws SSLPolicyNotFoundException
     *         The specified SSL policy does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeSSLPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeSSLPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSSLPoliciesResult describeSSLPolicies(DescribeSSLPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSSLPolicies(request);
    }

    @SdkInternalApi
    final DescribeSSLPoliciesResult executeDescribeSSLPolicies(DescribeSSLPoliciesRequest describeSSLPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSSLPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSSLPoliciesRequest> request = null;
        Response<DescribeSSLPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSSLPoliciesRequestMarshaller().marshall(super.beforeMarshalling(describeSSLPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSSLPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSSLPoliciesResult> responseHandler = new StaxResponseHandler<DescribeSSLPoliciesResult>(
                    new DescribeSSLPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the tags for the specified resources. You can describe the tags for one or more Application Load
     * Balancers, Network Load Balancers, and target groups.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTagsResult> responseHandler = new StaxResponseHandler<DescribeTagsResult>(new DescribeTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the attributes for the specified target group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#target-group-attributes"
     * >Target Group Attributes</a> in the <i>Application Load Balancers Guide</i> or <a href=
     * "https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#target-group-attributes"
     * >Target Group Attributes</a> in the <i>Network Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeTargetGroupAttributesRequest
     * @return Result of the DescribeTargetGroupAttributes operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeTargetGroupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetGroupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTargetGroupAttributesResult describeTargetGroupAttributes(DescribeTargetGroupAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTargetGroupAttributes(request);
    }

    @SdkInternalApi
    final DescribeTargetGroupAttributesResult executeDescribeTargetGroupAttributes(DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTargetGroupAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTargetGroupAttributesRequest> request = null;
        Response<DescribeTargetGroupAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTargetGroupAttributesRequestMarshaller().marshall(super.beforeMarshalling(describeTargetGroupAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTargetGroupAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTargetGroupAttributesResult> responseHandler = new StaxResponseHandler<DescribeTargetGroupAttributesResult>(
                    new DescribeTargetGroupAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified target groups or all of your target groups. By default, all target groups are described.
     * Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
     * names of one or more target groups, or the ARNs of one or more target groups.
     * </p>
     * <p>
     * To describe the targets for a target group, use <a>DescribeTargetHealth</a>. To describe the attributes of a
     * target group, use <a>DescribeTargetGroupAttributes</a>.
     * </p>
     * 
     * @param describeTargetGroupsRequest
     * @return Result of the DescribeTargetGroups operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTargetGroupsResult describeTargetGroups(DescribeTargetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTargetGroups(request);
    }

    @SdkInternalApi
    final DescribeTargetGroupsResult executeDescribeTargetGroups(DescribeTargetGroupsRequest describeTargetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTargetGroupsRequest> request = null;
        Response<DescribeTargetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTargetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeTargetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTargetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTargetGroupsResult> responseHandler = new StaxResponseHandler<DescribeTargetGroupsResult>(
                    new DescribeTargetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the health of the specified targets or all of your targets.
     * </p>
     * 
     * @param describeTargetHealthRequest
     * @return Result of the DescribeTargetHealth operation returned by the service.
     * @throws InvalidTargetException
     *         The specified target does not exist, is not in the same VPC as the target group, or has an unsupported
     *         instance type.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws HealthUnavailableException
     *         The health of the specified targets could not be retrieved due to an internal error.
     * @sample AmazonElasticLoadBalancing.DescribeTargetHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeTargetHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTargetHealthResult describeTargetHealth(DescribeTargetHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTargetHealth(request);
    }

    @SdkInternalApi
    final DescribeTargetHealthResult executeDescribeTargetHealth(DescribeTargetHealthRequest describeTargetHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTargetHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTargetHealthRequest> request = null;
        Response<DescribeTargetHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTargetHealthRequestMarshaller().marshall(super.beforeMarshalling(describeTargetHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTargetHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTargetHealthResult> responseHandler = new StaxResponseHandler<DescribeTargetHealthResult>(
                    new DescribeTargetHealthResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified properties of the specified listener.
     * </p>
     * <p>
     * Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to
     * HTTP, or from TLS to TCP, removes the security policy and server certificate properties. If you change the
     * protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and server certificate
     * properties.
     * </p>
     * 
     * @param modifyListenerRequest
     * @return Result of the ModifyListener operation returned by the service.
     * @throws DuplicateListenerException
     *         A listener with the specified port already exists.
     * @throws TooManyListenersException
     *         You've reached the limit on the number of listeners per load balancer.
     * @throws TooManyCertificatesException
     *         You've reached the limit on the number of certificates per load balancer.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws TargetGroupAssociationLimitException
     *         You've reached the limit on the number of load balancers per target group.
     * @throws IncompatibleProtocolsException
     *         The specified configuration is not valid with this protocol.
     * @throws SSLPolicyNotFoundException
     *         The specified SSL policy does not exist.
     * @throws CertificateNotFoundException
     *         The specified certificate does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws UnsupportedProtocolException
     *         The specified protocol is not supported.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @throws TooManyTargetsException
     *         You've reached the limit on the number of targets.
     * @throws TooManyActionsException
     *         You've reached the limit on the number of actions per rule.
     * @throws InvalidLoadBalancerActionException
     *         The requested action is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyListenerResult modifyListener(ModifyListenerRequest request) {
        request = beforeClientExecution(request);
        return executeModifyListener(request);
    }

    @SdkInternalApi
    final ModifyListenerResult executeModifyListener(ModifyListenerRequest modifyListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyListenerRequest> request = null;
        Response<ModifyListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyListenerRequestMarshaller().marshall(super.beforeMarshalling(modifyListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyListenerResult> responseHandler = new StaxResponseHandler<ModifyListenerResult>(
                    new ModifyListenerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer.
     * </p>
     * <p>
     * If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
     * you do not modify retain their current values.
     * </p>
     * 
     * @param modifyLoadBalancerAttributesRequest
     * @return Result of the ModifyLoadBalancerAttributes operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyLoadBalancerAttributes(request);
    }

    @SdkInternalApi
    final ModifyLoadBalancerAttributesResult executeModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyLoadBalancerAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyLoadBalancerAttributesRequest> request = null;
        Response<ModifyLoadBalancerAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyLoadBalancerAttributesRequestMarshaller().marshall(super.beforeMarshalling(modifyLoadBalancerAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyLoadBalancerAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyLoadBalancerAttributesResult> responseHandler = new StaxResponseHandler<ModifyLoadBalancerAttributesResult>(
                    new ModifyLoadBalancerAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified rule.
     * </p>
     * <p>
     * Any existing properties that you do not modify retain their current values.
     * </p>
     * <p>
     * To modify the actions for the default rule, use <a>ModifyListener</a>.
     * </p>
     * 
     * @param modifyRuleRequest
     * @return Result of the ModifyRule operation returned by the service.
     * @throws TargetGroupAssociationLimitException
     *         You've reached the limit on the number of load balancers per target group.
     * @throws IncompatibleProtocolsException
     *         The specified configuration is not valid with this protocol.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @throws TooManyTargetsException
     *         You've reached the limit on the number of targets.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws UnsupportedProtocolException
     *         The specified protocol is not supported.
     * @throws TooManyActionsException
     *         You've reached the limit on the number of actions per rule.
     * @throws InvalidLoadBalancerActionException
     *         The requested action is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyRuleResult modifyRule(ModifyRuleRequest request) {
        request = beforeClientExecution(request);
        return executeModifyRule(request);
    }

    @SdkInternalApi
    final ModifyRuleResult executeModifyRule(ModifyRuleRequest modifyRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyRuleRequest> request = null;
        Response<ModifyRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyRuleRequestMarshaller().marshall(super.beforeMarshalling(modifyRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyRuleResult> responseHandler = new StaxResponseHandler<ModifyRuleResult>(new ModifyRuleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
     * </p>
     * <p>
     * To monitor the health of the targets, use <a>DescribeTargetHealth</a>.
     * </p>
     * 
     * @param modifyTargetGroupRequest
     * @return Result of the ModifyTargetGroup operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyTargetGroupResult modifyTargetGroup(ModifyTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyTargetGroup(request);
    }

    @SdkInternalApi
    final ModifyTargetGroupResult executeModifyTargetGroup(ModifyTargetGroupRequest modifyTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyTargetGroupRequest> request = null;
        Response<ModifyTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyTargetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyTargetGroupResult> responseHandler = new StaxResponseHandler<ModifyTargetGroupResult>(
                    new ModifyTargetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified attributes of the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupAttributesRequest
     * @return Result of the ModifyTargetGroupAttributes operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyTargetGroupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTargetGroupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyTargetGroupAttributesResult modifyTargetGroupAttributes(ModifyTargetGroupAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyTargetGroupAttributes(request);
    }

    @SdkInternalApi
    final ModifyTargetGroupAttributesResult executeModifyTargetGroupAttributes(ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyTargetGroupAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyTargetGroupAttributesRequest> request = null;
        Response<ModifyTargetGroupAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyTargetGroupAttributesRequestMarshaller().marshall(super.beforeMarshalling(modifyTargetGroupAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyTargetGroupAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyTargetGroupAttributesResult> responseHandler = new StaxResponseHandler<ModifyTargetGroupAttributesResult>(
                    new ModifyTargetGroupAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the specified targets with the specified target group.
     * </p>
     * <p>
     * If the target is an EC2 instance, it must be in the <code>running</code> state when you register it.
     * </p>
     * <p>
     * By default, the load balancer routes requests to registered targets using the protocol and port for the target
     * group. Alternatively, you can override the port for a target when you register it. You can register each EC2
     * instance or IP address with the same target group multiple times using different ports.
     * </p>
     * <p>
     * With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance
     * types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of
     * these types by IP address.
     * </p>
     * <p>
     * To remove a target from a target group, use <a>DeregisterTargets</a>.
     * </p>
     * 
     * @param registerTargetsRequest
     * @return Result of the RegisterTargets operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws TooManyTargetsException
     *         You've reached the limit on the number of targets.
     * @throws InvalidTargetException
     *         The specified target does not exist, is not in the same VPC as the target group, or has an unsupported
     *         instance type.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @sample AmazonElasticLoadBalancing.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RegisterTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterTargetsResult registerTargets(RegisterTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTargets(request);
    }

    @SdkInternalApi
    final RegisterTargetsResult executeRegisterTargets(RegisterTargetsRequest registerTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTargetsRequest> request = null;
        Response<RegisterTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTargetsRequestMarshaller().marshall(super.beforeMarshalling(registerTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RegisterTargetsResult> responseHandler = new StaxResponseHandler<RegisterTargetsResult>(
                    new RegisterTargetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified certificate from the specified HTTPS listener.
     * </p>
     * <p>
     * You can't remove the default certificate for a listener. To replace the default certificate, call
     * <a>ModifyListener</a>.
     * </p>
     * <p>
     * To list the certificates for your listener, use <a>DescribeListenerCertificates</a>.
     * </p>
     * 
     * @param removeListenerCertificatesRequest
     * @return Result of the RemoveListenerCertificates operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.RemoveListenerCertificates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveListenerCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveListenerCertificatesResult removeListenerCertificates(RemoveListenerCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveListenerCertificates(request);
    }

    @SdkInternalApi
    final RemoveListenerCertificatesResult executeRemoveListenerCertificates(RemoveListenerCertificatesRequest removeListenerCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(removeListenerCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveListenerCertificatesRequest> request = null;
        Response<RemoveListenerCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveListenerCertificatesRequestMarshaller().marshall(super.beforeMarshalling(removeListenerCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveListenerCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveListenerCertificatesResult> responseHandler = new StaxResponseHandler<RemoveListenerCertificatesResult>(
                    new RemoveListenerCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the specified Elastic Load Balancing resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>.
     * </p>
     * 
     * @param removeTagsRequest
     * @return Result of the RemoveTags operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws TooManyTagsException
     *         You've reached the limit on the number of tags per load balancer.
     * @sample AmazonElasticLoadBalancing.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTags(request);
    }

    @SdkInternalApi
    final RemoveTagsResult executeRemoveTags(RemoveTagsRequest removeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestMarshaller().marshall(super.beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveTagsResult> responseHandler = new StaxResponseHandler<RemoveTagsResult>(new RemoveTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load
     * Balancer.
     * </p>
     * <p>
     * Network Load Balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param setIpAddressTypeRequest
     * @return Result of the SetIpAddressType operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws InvalidSubnetException
     *         The specified subnet is out of available addresses.
     * @sample AmazonElasticLoadBalancing.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetIpAddressType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIpAddressTypeResult setIpAddressType(SetIpAddressTypeRequest request) {
        request = beforeClientExecution(request);
        return executeSetIpAddressType(request);
    }

    @SdkInternalApi
    final SetIpAddressTypeResult executeSetIpAddressType(SetIpAddressTypeRequest setIpAddressTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(setIpAddressTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIpAddressTypeRequest> request = null;
        Response<SetIpAddressTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIpAddressTypeRequestMarshaller().marshall(super.beforeMarshalling(setIpAddressTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIpAddressType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetIpAddressTypeResult> responseHandler = new StaxResponseHandler<SetIpAddressTypeResult>(
                    new SetIpAddressTypeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the priorities of the specified rules.
     * </p>
     * <p>
     * You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
     * you do not specify retain their current priority.
     * </p>
     * 
     * @param setRulePrioritiesRequest
     * @return Result of the SetRulePriorities operation returned by the service.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws PriorityInUseException
     *         The specified priority is in use.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.SetRulePriorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetRulePriorities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetRulePrioritiesResult setRulePriorities(SetRulePrioritiesRequest request) {
        request = beforeClientExecution(request);
        return executeSetRulePriorities(request);
    }

    @SdkInternalApi
    final SetRulePrioritiesResult executeSetRulePriorities(SetRulePrioritiesRequest setRulePrioritiesRequest) {

        ExecutionContext executionContext = createExecutionContext(setRulePrioritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetRulePrioritiesRequest> request = null;
        Response<SetRulePrioritiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetRulePrioritiesRequestMarshaller().marshall(super.beforeMarshalling(setRulePrioritiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetRulePriorities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetRulePrioritiesResult> responseHandler = new StaxResponseHandler<SetRulePrioritiesResult>(
                    new SetRulePrioritiesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified security groups with the specified Application Load Balancer. The specified security
     * groups override the previously associated security groups.
     * </p>
     * <p>
     * You can't specify a security group for a Network Load Balancer.
     * </p>
     * 
     * @param setSecurityGroupsRequest
     * @return Result of the SetSecurityGroups operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws InvalidSecurityGroupException
     *         The specified security group does not exist.
     * @sample AmazonElasticLoadBalancing.SetSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetSecurityGroupsResult setSecurityGroups(SetSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeSetSecurityGroups(request);
    }

    @SdkInternalApi
    final SetSecurityGroupsResult executeSetSecurityGroups(SetSecurityGroupsRequest setSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(setSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSecurityGroupsRequest> request = null;
        Response<SetSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(setSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetSecurityGroupsResult> responseHandler = new StaxResponseHandler<SetSecurityGroupsResult>(
                    new SetSecurityGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The
     * specified subnets replace the previously enabled subnets.
     * </p>
     * <p>
     * You can't change the subnets for a Network Load Balancer.
     * </p>
     * 
     * @param setSubnetsRequest
     * @return Result of the SetSubnets operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws SubnetNotFoundException
     *         The specified subnet does not exist.
     * @throws InvalidSubnetException
     *         The specified subnet is out of available addresses.
     * @throws AllocationIdNotFoundException
     *         The specified allocation ID does not exist.
     * @throws AvailabilityZoneNotSupportedException
     *         The specified Availability Zone is not supported.
     * @sample AmazonElasticLoadBalancing.SetSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetSubnetsResult setSubnets(SetSubnetsRequest request) {
        request = beforeClientExecution(request);
        return executeSetSubnets(request);
    }

    @SdkInternalApi
    final SetSubnetsResult executeSetSubnets(SetSubnetsRequest setSubnetsRequest) {

        ExecutionContext executionContext = createExecutionContext(setSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSubnetsRequest> request = null;
        Response<SetSubnetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetSubnetsRequestMarshaller().marshall(super.beforeMarshalling(setSubnetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetSubnets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetSubnetsResult> responseHandler = new StaxResponseHandler<SetSubnetsResult>(new SetSubnetsResultStaxUnmarshaller());
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
    public AmazonElasticLoadBalancingWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonElasticLoadBalancingWaiters(this);
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
