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
package com.amazonaws.services.elasticloadbalancing;

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

import com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancingClientBuilder;
import com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.services.elasticloadbalancing.model.transform.*;

/**
 * Client for accessing Elastic Load Balancing. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer can distribute incoming traffic across your EC2 instances. This enables you to increase the
 * availability of your application. The load balancer also monitors the health of its registered instances and ensures
 * that it routes traffic only to healthy instances. You configure your load balancer to accept incoming traffic by
 * specifying one or more listeners, which are configured with a protocol and port number for connections from clients
 * to the load balancer and a protocol and port number for connections from the load balancer to the instances.
 * </p>
 * <p>
 * Elastic Load Balancing supports three types of load balancers: Application Load Balancers, Network Load Balancers,
 * and Classic Load Balancers. You can select a load balancer based on your application needs. For more information, see
 * the <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/">Elastic Load Balancing User
 * Guide</a>.
 * </p>
 * <p>
 * This reference covers the 2012-06-01 API, which supports Classic Load Balancers. The 2015-12-01 API supports
 * Application Load Balancers and Network Load Balancers.
 * </p>
 * <p>
 * To get started, create a load balancer with one or more listeners using <a>CreateLoadBalancer</a>. Register your
 * instances with the load balancer using <a>RegisterInstancesWithLoadBalancer</a>.
 * </p>
 * <p>
 * All Elastic Load Balancing operations are <i>idempotent</i>, which means that they complete at most one time. If you
 * repeat an operation, it succeeds with a 200 OK response code.
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Elastic Load Balancing (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified AWS account
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Load Balancing (ex: proxy
     *        settings, retry counts, etc.).
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified AWS account
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Load Balancing (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonElasticLoadBalancingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticLoadBalancingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Load Balancing (ex: proxy
     *        settings, retry counts, etc.).
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified parameters.
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
     * Constructs a new client to invoke service methods on Elastic Load Balancing using the specified parameters.
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
        exceptionUnmarshallers.add(new LoadBalancerAttributeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LoadBalancerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLoadBalancersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidConfigurationRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSecurityGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateLoadBalancerNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DependencyThrottleExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationNotPermittedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateTagKeysExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ListenerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPoliciesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicatePolicyNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateListenerExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSchemeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyTypeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidInstanceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.elasticloadbalancing.model.AmazonElasticLoadBalancingException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticloadbalancing.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticloadbalancing/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticloadbalancing/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds the specified tags to the specified load balancer. Each load balancer can have a maximum of 10 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the load
     * balancer, <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your Classic Load
     * Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @return Result of the AddTags operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TooManyTagsException
     *         The quota for the number of tags that can be assigned to a load balancer has been reached.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @sample AmazonElasticLoadBalancing.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AddTags" target="_top">AWS
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
     * Associates one or more security groups with your load balancer in a virtual private cloud (VPC). The specified
     * security groups override the previously associated security groups.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-groups.html#elb-vpc-security-groups"
     * >Security Groups for Load Balancers in a VPC</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param applySecurityGroupsToLoadBalancerRequest
     *        Contains the parameters for ApplySecurityGroupsToLoadBalancer.
     * @return Result of the ApplySecurityGroupsToLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @throws InvalidSecurityGroupException
     *         One or more of the specified security groups do not exist.
     * @sample AmazonElasticLoadBalancing.ApplySecurityGroupsToLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ApplySecurityGroupsToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ApplySecurityGroupsToLoadBalancerResult applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeApplySecurityGroupsToLoadBalancer(request);
    }

    @SdkInternalApi
    final ApplySecurityGroupsToLoadBalancerResult executeApplySecurityGroupsToLoadBalancer(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(applySecurityGroupsToLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplySecurityGroupsToLoadBalancerRequest> request = null;
        Response<ApplySecurityGroupsToLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApplySecurityGroupsToLoadBalancerRequestMarshaller().marshall(super.beforeMarshalling(applySecurityGroupsToLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApplySecurityGroupsToLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ApplySecurityGroupsToLoadBalancerResult> responseHandler = new StaxResponseHandler<ApplySecurityGroupsToLoadBalancerResult>(
                    new ApplySecurityGroupsToLoadBalancerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets for the specified load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all registered subnets. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-manage-subnets.html">Add or Remove
     * Subnets for Your Load Balancer in a VPC</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerToSubnetsRequest
     *        Contains the parameters for AttachLoaBalancerToSubnets.
     * @return Result of the AttachLoadBalancerToSubnets operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @throws SubnetNotFoundException
     *         One or more of the specified subnets do not exist.
     * @throws InvalidSubnetException
     *         The specified VPC has no associated Internet gateway.
     * @sample AmazonElasticLoadBalancing.AttachLoadBalancerToSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AttachLoadBalancerToSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachLoadBalancerToSubnetsResult attachLoadBalancerToSubnets(AttachLoadBalancerToSubnetsRequest request) {
        request = beforeClientExecution(request);
        return executeAttachLoadBalancerToSubnets(request);
    }

    @SdkInternalApi
    final AttachLoadBalancerToSubnetsResult executeAttachLoadBalancerToSubnets(AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest) {

        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerToSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancerToSubnetsRequest> request = null;
        Response<AttachLoadBalancerToSubnetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachLoadBalancerToSubnetsRequestMarshaller().marshall(super.beforeMarshalling(attachLoadBalancerToSubnetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachLoadBalancerToSubnets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachLoadBalancerToSubnetsResult> responseHandler = new StaxResponseHandler<AttachLoadBalancerToSubnetsResult>(
                    new AttachLoadBalancerToSubnetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies the health check settings to use when evaluating the health state of your EC2 instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-healthchecks.html">Configure Health
     * Checks for Your Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param configureHealthCheckRequest
     *        Contains the parameters for ConfigureHealthCheck.
     * @return Result of the ConfigureHealthCheck operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.ConfigureHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ConfigureHealthCheck"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest request) {
        request = beforeClientExecution(request);
        return executeConfigureHealthCheck(request);
    }

    @SdkInternalApi
    final ConfigureHealthCheckResult executeConfigureHealthCheck(ConfigureHealthCheckRequest configureHealthCheckRequest) {

        ExecutionContext executionContext = createExecutionContext(configureHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfigureHealthCheckRequest> request = null;
        Response<ConfigureHealthCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfigureHealthCheckRequestMarshaller().marshall(super.beforeMarshalling(configureHealthCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfigureHealthCheck");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ConfigureHealthCheckResult> responseHandler = new StaxResponseHandler<ConfigureHealthCheckResult>(
                    new ConfigureHealthCheckResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie.
     * This policy can be associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by <a>CreateLBCookieStickinessPolicy</a>, except that the lifetime
     * of the special Elastic Load Balancing cookie, <code>AWSELB</code>, follows the lifetime of the
     * application-generated cookie specified in the policy configuration. The load balancer only inserts a new
     * stickiness cookie when the application response includes a new application cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the session stops being sticky until a new
     * application cookie is issued.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param createAppCookieStickinessPolicyRequest
     *        Contains the parameters for CreateAppCookieStickinessPolicy.
     * @return Result of the CreateAppCookieStickinessPolicy operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws DuplicatePolicyNameException
     *         A policy with the specified name already exists for this load balancer.
     * @throws TooManyPoliciesException
     *         The quota for the number of policies for this load balancer has been reached.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.CreateAppCookieStickinessPolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateAppCookieStickinessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppCookieStickinessPolicy(request);
    }

    @SdkInternalApi
    final CreateAppCookieStickinessPolicyResult executeCreateAppCookieStickinessPolicy(
            CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppCookieStickinessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppCookieStickinessPolicyRequest> request = null;
        Response<CreateAppCookieStickinessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppCookieStickinessPolicyRequestMarshaller().marshall(super.beforeMarshalling(createAppCookieStickinessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppCookieStickinessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateAppCookieStickinessPolicyResult> responseHandler = new StaxResponseHandler<CreateAppCookieStickinessPolicyResult>(
                    new CreateAppCookieStickinessPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser
     * (user-agent) or a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a special cookie to track the instance for
     * each request. When the load balancer receives a request, it first checks to see if this cookie is present in the
     * request. If so, the load balancer sends the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based on the existing load-balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent requests from the same user to that server. The
     * validity of the cookie is based on the cookie expiration time, which is specified in the policy configuration.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLBCookieStickinessPolicyRequest
     *        Contains the parameters for CreateLBCookieStickinessPolicy.
     * @return Result of the CreateLBCookieStickinessPolicy operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws DuplicatePolicyNameException
     *         A policy with the specified name already exists for this load balancer.
     * @throws TooManyPoliciesException
     *         The quota for the number of policies for this load balancer has been reached.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.CreateLBCookieStickinessPolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLBCookieStickinessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLBCookieStickinessPolicy(request);
    }

    @SdkInternalApi
    final CreateLBCookieStickinessPolicyResult executeCreateLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createLBCookieStickinessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLBCookieStickinessPolicyRequest> request = null;
        Response<CreateLBCookieStickinessPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLBCookieStickinessPolicyRequestMarshaller().marshall(super.beforeMarshalling(createLBCookieStickinessPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLBCookieStickinessPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateLBCookieStickinessPolicyResult> responseHandler = new StaxResponseHandler<CreateLBCookieStickinessPolicyResult>(
                    new CreateLBCookieStickinessPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Classic Load Balancer.
     * </p>
     * <p>
     * You can add listeners, security groups, subnets, and tags when you create your load balancer, or you can add them
     * later using <a>CreateLoadBalancerListeners</a>, <a>ApplySecurityGroupsToLoadBalancer</a>,
     * <a>AttachLoadBalancerToSubnets</a>, and <a>AddTags</a>.
     * </p>
     * <p>
     * To describe your current load balancers, see <a>DescribeLoadBalancers</a>. When you are finished with a load
     * balancer, you can delete it using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can request an increase for the number of load
     * balancers for your account. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html">Limits for Your Classic
     * Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     *        Contains the parameters for CreateLoadBalancer.
     * @return Result of the CreateLoadBalancer operation returned by the service.
     * @throws DuplicateLoadBalancerNameException
     *         The specified load balancer name already exists for this account.
     * @throws TooManyLoadBalancersException
     *         The quota for the number of load balancers has been reached.
     * @throws CertificateNotFoundException
     *         The specified ARN does not refer to a valid SSL certificate in AWS Identity and Access Management (IAM)
     *         or AWS Certificate Manager (ACM). Note that if you recently uploaded the certificate to IAM, this error
     *         might indicate that the certificate is not fully available yet.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @throws SubnetNotFoundException
     *         One or more of the specified subnets do not exist.
     * @throws InvalidSubnetException
     *         The specified VPC has no associated Internet gateway.
     * @throws InvalidSecurityGroupException
     *         One or more of the specified security groups do not exist.
     * @throws InvalidSchemeException
     *         The specified value for the schema is not valid. You can only specify a scheme for load balancers in a
     *         VPC.
     * @throws TooManyTagsException
     *         The quota for the number of tags that can be assigned to a load balancer has been reached.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws UnsupportedProtocolException
     *         The specified protocol or signature version is not supported.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancer"
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
     * Creates one or more listeners for the specified load balancer. If a listener with the specified port does not
     * already exist, it is created; otherwise, the properties of the new listener must match the properties of the
     * existing listener.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
     * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerListenersRequest
     *        Contains the parameters for CreateLoadBalancerListeners.
     * @return Result of the CreateLoadBalancerListeners operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws DuplicateListenerException
     *         A listener already exists for the specified load balancer name and port, but with a different instance
     *         port, protocol, or SSL certificate.
     * @throws CertificateNotFoundException
     *         The specified ARN does not refer to a valid SSL certificate in AWS Identity and Access Management (IAM)
     *         or AWS Certificate Manager (ACM). Note that if you recently uploaded the certificate to IAM, this error
     *         might indicate that the certificate is not fully available yet.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @throws UnsupportedProtocolException
     *         The specified protocol or signature version is not supported.
     * @sample AmazonElasticLoadBalancing.CreateLoadBalancerListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerListeners"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLoadBalancerListenersResult createLoadBalancerListeners(CreateLoadBalancerListenersRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoadBalancerListeners(request);
    }

    @SdkInternalApi
    final CreateLoadBalancerListenersResult executeCreateLoadBalancerListeners(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoadBalancerListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerListenersRequest> request = null;
        Response<CreateLoadBalancerListenersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerListenersRequestMarshaller().marshall(super.beforeMarshalling(createLoadBalancerListenersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoadBalancerListeners");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateLoadBalancerListenersResult> responseHandler = new StaxResponseHandler<CreateLoadBalancerListenersResult>(
                    new CreateLoadBalancerListenersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a policy with the specified attributes for the specified load balancer.
     * </p>
     * <p>
     * Policies are settings that are saved for your load balancer and that can be applied to the listener or the
     * application server, depending on the policy type.
     * </p>
     * 
     * @param createLoadBalancerPolicyRequest
     *        Contains the parameters for CreateLoadBalancerPolicy.
     * @return Result of the CreateLoadBalancerPolicy operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws PolicyTypeNotFoundException
     *         One or more of the specified policy types do not exist.
     * @throws DuplicatePolicyNameException
     *         A policy with the specified name already exists for this load balancer.
     * @throws TooManyPoliciesException
     *         The quota for the number of policies for this load balancer has been reached.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.CreateLoadBalancerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLoadBalancerPolicyResult createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoadBalancerPolicy(request);
    }

    @SdkInternalApi
    final CreateLoadBalancerPolicyResult executeCreateLoadBalancerPolicy(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoadBalancerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoadBalancerPolicyRequest> request = null;
        Response<CreateLoadBalancerPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoadBalancerPolicyRequestMarshaller().marshall(super.beforeMarshalling(createLoadBalancerPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoadBalancerPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateLoadBalancerPolicyResult> responseHandler = new StaxResponseHandler<CreateLoadBalancerPolicyResult>(
                    new CreateLoadBalancerPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified load balancer.
     * </p>
     * <p>
     * If you are attempting to recreate a load balancer, you must reconfigure all settings. The DNS name associated
     * with a deleted load balancer are no longer usable. The name and associated DNS record of the deleted load
     * balancer no longer exist and traffic sent to any of its IP addresses is no longer delivered to your instances.
     * </p>
     * <p>
     * If the load balancer does not exist or has already been deleted, the call to <code>DeleteLoadBalancer</code>
     * still succeeds.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     *        Contains the parameters for DeleteLoadBalancer.
     * @return Result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancing.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancer"
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
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest
     *        Contains the parameters for DeleteLoadBalancerListeners.
     * @return Result of the DeleteLoadBalancerListeners operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DeleteLoadBalancerListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerListeners"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLoadBalancerListenersResult deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoadBalancerListeners(request);
    }

    @SdkInternalApi
    final DeleteLoadBalancerListenersResult executeDeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerListenersRequest> request = null;
        Response<DeleteLoadBalancerListenersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerListenersRequestMarshaller().marshall(super.beforeMarshalling(deleteLoadBalancerListenersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoadBalancerListeners");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteLoadBalancerListenersResult> responseHandler = new StaxResponseHandler<DeleteLoadBalancerListenersResult>(
                    new DeleteLoadBalancerListenersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest
     *        Contains the parameters for DeleteLoadBalancerPolicy.
     * @return Result of the DeleteLoadBalancerPolicy operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.DeleteLoadBalancerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoadBalancerPolicy(request);
    }

    @SdkInternalApi
    final DeleteLoadBalancerPolicyResult executeDeleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoadBalancerPolicyRequest> request = null;
        Response<DeleteLoadBalancerPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoadBalancerPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteLoadBalancerPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoadBalancerPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteLoadBalancerPolicyResult> responseHandler = new StaxResponseHandler<DeleteLoadBalancerPolicyResult>(
                    new DeleteLoadBalancerPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the specified instances from the specified load balancer. After the instance is deregistered, it no
     * longer receives traffic from the load balancer.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> to verify that the instance is deregistered from the load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
     * >Register or De-Register EC2 Instances</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param deregisterInstancesFromLoadBalancerRequest
     *        Contains the parameters for DeregisterInstancesFromLoadBalancer.
     * @return Result of the DeregisterInstancesFromLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidInstanceException
     *         The specified endpoint is not valid.
     * @sample AmazonElasticLoadBalancing.DeregisterInstancesFromLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeregisterInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterInstancesFromLoadBalancer(request);
    }

    @SdkInternalApi
    final DeregisterInstancesFromLoadBalancerResult executeDeregisterInstancesFromLoadBalancer(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterInstancesFromLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterInstancesFromLoadBalancerRequest> request = null;
        Response<DeregisterInstancesFromLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterInstancesFromLoadBalancerRequestMarshaller().marshall(super
                        .beforeMarshalling(deregisterInstancesFromLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterInstancesFromLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeregisterInstancesFromLoadBalancerResult> responseHandler = new StaxResponseHandler<DeregisterInstancesFromLoadBalancerResult>(
                    new DeregisterInstancesFromLoadBalancerResultStaxUnmarshaller());
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
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html">Limits for Your Classic
     * Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonElasticLoadBalancing.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeAccountLimits"
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
     * Describes the state of the specified instances with respect to the specified load balancer. If no instances are
     * specified, the call describes the state of all instances that are currently registered with the load balancer. If
     * instances are specified, their state is returned even if they are no longer registered with the load balancer.
     * The state of terminated instances is not returned.
     * </p>
     * 
     * @param describeInstanceHealthRequest
     *        Contains the parameters for DescribeInstanceHealth.
     * @return Result of the DescribeInstanceHealth operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidInstanceException
     *         The specified endpoint is not valid.
     * @sample AmazonElasticLoadBalancing.DescribeInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeInstanceHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceHealth(request);
    }

    @SdkInternalApi
    final DescribeInstanceHealthResult executeDescribeInstanceHealth(DescribeInstanceHealthRequest describeInstanceHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceHealthRequest> request = null;
        Response<DescribeInstanceHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceHealthRequestMarshaller().marshall(super.beforeMarshalling(describeInstanceHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeInstanceHealthResult> responseHandler = new StaxResponseHandler<DescribeInstanceHealthResult>(
                    new DescribeInstanceHealthResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     *        Contains the parameters for DescribeLoadBalancerAttributes.
     * @return Result of the DescribeLoadBalancerAttributes operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws LoadBalancerAttributeNotFoundException
     *         The specified load balancer attribute does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerAttributes"
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
     * Describes the specified policies.
     * </p>
     * <p>
     * If you specify a load balancer name, the action returns the descriptions of all policies created for the load
     * balancer. If you specify a policy name associated with your load balancer, the action returns the description of
     * that policy. If you don't specify a load balancer name, the action returns descriptions of the specified sample
     * policies, or descriptions of all sample policies. The names of the sample policies have the
     * <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @param describeLoadBalancerPoliciesRequest
     *        Contains the parameters for DescribeLoadBalancerPolicies.
     * @return Result of the DescribeLoadBalancerPolicies operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws PolicyNotFoundException
     *         One or more of the specified policies do not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancerPolicies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBalancerPolicies(request);
    }

    @SdkInternalApi
    final DescribeLoadBalancerPoliciesResult executeDescribeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerPoliciesRequest> request = null;
        Response<DescribeLoadBalancerPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBalancerPoliciesRequestMarshaller().marshall(super.beforeMarshalling(describeLoadBalancerPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBalancerPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoadBalancerPoliciesResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancerPoliciesResult>(
                    new DescribeLoadBalancerPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies() {
        return describeLoadBalancerPolicies(new DescribeLoadBalancerPoliciesRequest());
    }

    /**
     * <p>
     * Describes the specified load balancer policy types or all load balancer policy types.
     * </p>
     * <p>
     * The description of each type indicates how it can be used. For example, some policies can be used only with layer
     * 7 listeners, some policies can be used only with layer 4 listeners, and some policies can be used only with your
     * EC2 instances.
     * </p>
     * <p>
     * You can use <a>CreateLoadBalancerPolicy</a> to create a policy configuration for any of these policy types. Then,
     * depending on the policy type, use either <a>SetLoadBalancerPoliciesOfListener</a> or
     * <a>SetLoadBalancerPoliciesForBackendServer</a> to set the policy.
     * </p>
     * 
     * @param describeLoadBalancerPolicyTypesRequest
     *        Contains the parameters for DescribeLoadBalancerPolicyTypes.
     * @return Result of the DescribeLoadBalancerPolicyTypes operation returned by the service.
     * @throws PolicyTypeNotFoundException
     *         One or more of the specified policy types do not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancerPolicyTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBalancerPolicyTypes(request);
    }

    @SdkInternalApi
    final DescribeLoadBalancerPolicyTypesResult executeDescribeLoadBalancerPolicyTypes(
            DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerPolicyTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerPolicyTypesRequest> request = null;
        Response<DescribeLoadBalancerPolicyTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBalancerPolicyTypesRequestMarshaller().marshall(super.beforeMarshalling(describeLoadBalancerPolicyTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBalancerPolicyTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoadBalancerPolicyTypesResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancerPolicyTypesResult>(
                    new DescribeLoadBalancerPolicyTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes() {
        return describeLoadBalancerPolicyTypes(new DescribeLoadBalancerPolicyTypesRequest());
    }

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your
     * load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @return Result of the DescribeLoadBalancers operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws DependencyThrottleException
     *         A request made by Elastic Load Balancing to another service exceeds the maximum request rate permitted
     *         for your account.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancers"
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

    @Override
    public DescribeLoadBalancersResult describeLoadBalancers() {
        return describeLoadBalancers(new DescribeLoadBalancersRequest());
    }

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @return Result of the DescribeTags operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeTags"
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
     * Removes the specified subnets from the set of configured subnets for the load balancer.
     * </p>
     * <p>
     * After a subnet is removed, all EC2 instances registered with the load balancer in the removed subnet go into the
     * <code>OutOfService</code> state. Then, the load balancer balances the traffic among the remaining routable
     * subnets.
     * </p>
     * 
     * @param detachLoadBalancerFromSubnetsRequest
     *        Contains the parameters for DetachLoadBalancerFromSubnets.
     * @return Result of the DetachLoadBalancerFromSubnets operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.DetachLoadBalancerFromSubnets
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DetachLoadBalancerFromSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachLoadBalancerFromSubnetsResult detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest request) {
        request = beforeClientExecution(request);
        return executeDetachLoadBalancerFromSubnets(request);
    }

    @SdkInternalApi
    final DetachLoadBalancerFromSubnetsResult executeDetachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest) {

        ExecutionContext executionContext = createExecutionContext(detachLoadBalancerFromSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachLoadBalancerFromSubnetsRequest> request = null;
        Response<DetachLoadBalancerFromSubnetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachLoadBalancerFromSubnetsRequestMarshaller().marshall(super.beforeMarshalling(detachLoadBalancerFromSubnetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachLoadBalancerFromSubnets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachLoadBalancerFromSubnetsResult> responseHandler = new StaxResponseHandler<DetachLoadBalancerFromSubnetsResult>(
                    new DetachLoadBalancerFromSubnetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer in
     * EC2-Classic or a default VPC.
     * </p>
     * <p>
     * For load balancers in a non-default VPC, use <a>DetachLoadBalancerFromSubnets</a>.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load balancer at all times. After an Availability
     * Zone is removed, all instances registered with the load balancer that are in the removed Availability Zone go
     * into the <code>OutOfService</code> state. Then, the load balancer attempts to equally balance the traffic among
     * its remaining Availability Zones.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html">Add or Remove
     * Availability Zones</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param disableAvailabilityZonesForLoadBalancerRequest
     *        Contains the parameters for DisableAvailabilityZonesForLoadBalancer.
     * @return Result of the DisableAvailabilityZonesForLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.DisableAvailabilityZonesForLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DisableAvailabilityZonesForLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeDisableAvailabilityZonesForLoadBalancer(request);
    }

    @SdkInternalApi
    final DisableAvailabilityZonesForLoadBalancerResult executeDisableAvailabilityZonesForLoadBalancer(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(disableAvailabilityZonesForLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAvailabilityZonesForLoadBalancerRequest> request = null;
        Response<DisableAvailabilityZonesForLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAvailabilityZonesForLoadBalancerRequestMarshaller().marshall(super
                        .beforeMarshalling(disableAvailabilityZonesForLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableAvailabilityZonesForLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisableAvailabilityZonesForLoadBalancerResult> responseHandler = new StaxResponseHandler<DisableAvailabilityZonesForLoadBalancerResult>(
                    new DisableAvailabilityZonesForLoadBalancerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer in
     * EC2-Classic or a default VPC.
     * </p>
     * <p>
     * For load balancers in a non-default VPC, use <a>AttachLoadBalancerToSubnets</a>.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its registered Availability Zones that contain
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html">Add or Remove
     * Availability Zones</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param enableAvailabilityZonesForLoadBalancerRequest
     *        Contains the parameters for EnableAvailabilityZonesForLoadBalancer.
     * @return Result of the EnableAvailabilityZonesForLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.EnableAvailabilityZonesForLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/EnableAvailabilityZonesForLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeEnableAvailabilityZonesForLoadBalancer(request);
    }

    @SdkInternalApi
    final EnableAvailabilityZonesForLoadBalancerResult executeEnableAvailabilityZonesForLoadBalancer(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(enableAvailabilityZonesForLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAvailabilityZonesForLoadBalancerRequest> request = null;
        Response<EnableAvailabilityZonesForLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAvailabilityZonesForLoadBalancerRequestMarshaller().marshall(super
                        .beforeMarshalling(enableAvailabilityZonesForLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableAvailabilityZonesForLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EnableAvailabilityZonesForLoadBalancerResult> responseHandler = new StaxResponseHandler<EnableAvailabilityZonesForLoadBalancerResult>(
                    new EnableAvailabilityZonesForLoadBalancerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the attributes of the specified load balancer.
     * </p>
     * <p>
     * You can modify the load balancer attributes, such as <code>AccessLogs</code>, <code>ConnectionDraining</code>,
     * and <code>CrossZoneLoadBalancing</code> by either enabling or disabling them. Or, you can modify the load
     * balancer attribute <code>ConnectionSettings</code> by specifying an idle connection timeout value for your load
     * balancer.
     * </p>
     * <p>
     * For more information, see the following in the <i>Classic Load Balancers Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html">Cross-
     * Zone Load Balancing</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Connection
     * Draining</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/access-log-collection.html">Access
     * Logs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Idle Connection
     * Timeout</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modifyLoadBalancerAttributesRequest
     *        Contains the parameters for ModifyLoadBalancerAttributes.
     * @return Result of the ModifyLoadBalancerAttributes operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws LoadBalancerAttributeNotFoundException
     *         The specified load balancer attribute does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ModifyLoadBalancerAttributes"
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
     * Adds the specified instances to the specified load balancer.
     * </p>
     * <p>
     * The instance must be a running instance in the same network as the load balancer (EC2-Classic or the same VPC).
     * If you have EC2-Classic instances and a load balancer in a VPC with ClassicLink enabled, you can link the
     * EC2-Classic instances to that VPC and then register the linked EC2-Classic instances with the load balancer in
     * the VPC.
     * </p>
     * <p>
     * Note that <code>RegisterInstanceWithLoadBalancer</code> completes when the request has been registered. Instance
     * registration takes a little time to complete. To check the state of the registered instances, use
     * <a>DescribeLoadBalancers</a> or <a>DescribeInstanceHealth</a>.
     * </p>
     * <p>
     * After the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance
     * that is not in one of the Availability Zones registered for the load balancer is moved to the
     * <code>OutOfService</code> state. If an Availability Zone is added to the load balancer later, any instances
     * registered with the load balancer move to the <code>InService</code> state.
     * </p>
     * <p>
     * To deregister instances from a load balancer, use <a>DeregisterInstancesFromLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
     * >Register or De-Register EC2 Instances</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param registerInstancesWithLoadBalancerRequest
     *        Contains the parameters for RegisterInstancesWithLoadBalancer.
     * @return Result of the RegisterInstancesWithLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidInstanceException
     *         The specified endpoint is not valid.
     * @sample AmazonElasticLoadBalancing.RegisterInstancesWithLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RegisterInstancesWithLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterInstancesWithLoadBalancer(request);
    }

    @SdkInternalApi
    final RegisterInstancesWithLoadBalancerResult executeRegisterInstancesWithLoadBalancer(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) {

        ExecutionContext executionContext = createExecutionContext(registerInstancesWithLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterInstancesWithLoadBalancerRequest> request = null;
        Response<RegisterInstancesWithLoadBalancerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterInstancesWithLoadBalancerRequestMarshaller().marshall(super.beforeMarshalling(registerInstancesWithLoadBalancerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterInstancesWithLoadBalancer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RegisterInstancesWithLoadBalancerResult> responseHandler = new StaxResponseHandler<RegisterInstancesWithLoadBalancerResult>(
                    new RegisterInstancesWithLoadBalancerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RemoveTags"
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
     * Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces
     * any prior certificate that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information about updating your SSL certificate, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-update-ssl-cert.html">Replace the SSL
     * Certificate for Your Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerListenerSSLCertificateRequest
     *        Contains the parameters for SetLoadBalancerListenerSSLCertificate.
     * @return Result of the SetLoadBalancerListenerSSLCertificate operation returned by the service.
     * @throws CertificateNotFoundException
     *         The specified ARN does not refer to a valid SSL certificate in AWS Identity and Access Management (IAM)
     *         or AWS Certificate Manager (ACM). Note that if you recently uploaded the certificate to IAM, this error
     *         might indicate that the certificate is not fully available yet.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws ListenerNotFoundException
     *         The load balancer does not have a listener configured at the specified port.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @throws UnsupportedProtocolException
     *         The specified protocol or signature version is not supported.
     * @sample AmazonElasticLoadBalancing.SetLoadBalancerListenerSSLCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerListenerSSLCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeSetLoadBalancerListenerSSLCertificate(request);
    }

    @SdkInternalApi
    final SetLoadBalancerListenerSSLCertificateResult executeSetLoadBalancerListenerSSLCertificate(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(setLoadBalancerListenerSSLCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBalancerListenerSSLCertificateRequest> request = null;
        Response<SetLoadBalancerListenerSSLCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoadBalancerListenerSSLCertificateRequestMarshaller().marshall(super
                        .beforeMarshalling(setLoadBalancerListenerSSLCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetLoadBalancerListenerSSLCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetLoadBalancerListenerSSLCertificateResult> responseHandler = new StaxResponseHandler<SetLoadBalancerListenerSSLCertificateResult>(
                    new SetLoadBalancerListenerSSLCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the set of policies associated with the specified port on which the EC2 instance is listening with a new
     * set of policies. At this time, only the back-end server authentication policy type can be applied to the instance
     * ports; this policy type is composed of multiple public key policies.
     * </p>
     * <p>
     * Each time you use <code>SetLoadBalancerPoliciesForBackendServer</code> to enable the policies, use the
     * <code>PolicyNames</code> parameter to list the policies that you want to enable.
     * </p>
     * <p>
     * You can use <a>DescribeLoadBalancers</a> or <a>DescribeLoadBalancerPolicies</a> to verify that the policy is
     * associated with the EC2 instance.
     * </p>
     * <p>
     * For more information about enabling back-end instance authentication, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html#configure_backendauth_clt"
     * >Configure Back-end Instance Authentication</a> in the <i>Classic Load Balancers Guide</i>. For more information
     * about Proxy Protocol, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-proxy-protocol.html">Configure Proxy
     * Protocol Support</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerPoliciesForBackendServerRequest
     *        Contains the parameters for SetLoadBalancerPoliciesForBackendServer.
     * @return Result of the SetLoadBalancerPoliciesForBackendServer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws PolicyNotFoundException
     *         One or more of the specified policies do not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.SetLoadBalancerPoliciesForBackendServer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesForBackendServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetLoadBalancerPoliciesForBackendServerResult setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest request) {
        request = beforeClientExecution(request);
        return executeSetLoadBalancerPoliciesForBackendServer(request);
    }

    @SdkInternalApi
    final SetLoadBalancerPoliciesForBackendServerResult executeSetLoadBalancerPoliciesForBackendServer(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) {

        ExecutionContext executionContext = createExecutionContext(setLoadBalancerPoliciesForBackendServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBalancerPoliciesForBackendServerRequest> request = null;
        Response<SetLoadBalancerPoliciesForBackendServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoadBalancerPoliciesForBackendServerRequestMarshaller().marshall(super
                        .beforeMarshalling(setLoadBalancerPoliciesForBackendServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetLoadBalancerPoliciesForBackendServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetLoadBalancerPoliciesForBackendServerResult> responseHandler = new StaxResponseHandler<SetLoadBalancerPoliciesForBackendServerResult>(
                    new SetLoadBalancerPoliciesForBackendServerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the current set of policies for the specified load balancer port with the specified set of policies.
     * </p>
     * <p>
     * To enable back-end server authentication, use <a>SetLoadBalancerPoliciesForBackendServer</a>.
     * </p>
     * <p>
     * For more information about setting policies, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/ssl-config-update.html">Update the SSL
     * Negotiation Configuration</a>, <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
     * >Duration-Based Session Stickiness</a>, and <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
     * >Application-Controlled Session Stickiness</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param setLoadBalancerPoliciesOfListenerRequest
     *        Contains the parameters for SetLoadBalancePoliciesOfListener.
     * @return Result of the SetLoadBalancerPoliciesOfListener operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws PolicyNotFoundException
     *         One or more of the specified policies do not exist.
     * @throws ListenerNotFoundException
     *         The load balancer does not have a listener configured at the specified port.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration change is not valid.
     * @sample AmazonElasticLoadBalancing.SetLoadBalancerPoliciesOfListener
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesOfListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest request) {
        request = beforeClientExecution(request);
        return executeSetLoadBalancerPoliciesOfListener(request);
    }

    @SdkInternalApi
    final SetLoadBalancerPoliciesOfListenerResult executeSetLoadBalancerPoliciesOfListener(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(setLoadBalancerPoliciesOfListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoadBalancerPoliciesOfListenerRequest> request = null;
        Response<SetLoadBalancerPoliciesOfListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoadBalancerPoliciesOfListenerRequestMarshaller().marshall(super.beforeMarshalling(setLoadBalancerPoliciesOfListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Load Balancing");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetLoadBalancerPoliciesOfListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetLoadBalancerPoliciesOfListenerResult> responseHandler = new StaxResponseHandler<SetLoadBalancerPoliciesOfListenerResult>(
                    new SetLoadBalancerPoliciesOfListenerResultStaxUnmarshaller());
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
