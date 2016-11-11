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
package com.amazonaws.services.elasticloadbalancingv2;

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
 * Elastic Load Balancing supports two types of load balancers: Classic Load Balancers and Application Load Balancers. A
 * Classic Load Balancer makes routing and load balancing decisions either at the transport layer (TCP/SSL) or the
 * application layer (HTTP/HTTPS), and supports either EC2-Classic or a VPC. An Application Load Balancer makes routing
 * and load balancing decisions at the application layer (HTTP/HTTPS), supports path-based routing, and can route
 * requests to one or more ports on each EC2 instance or container instance in your virtual private cloud (VPC). For
 * more information, see the <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/">Elastic Load
 * Balancing User Guide</a>.
 * </p>
 * <p>
 * This reference covers the 2015-12-01 API, which supports Application Load Balancers. The 2012-06-01 API supports
 * Classic Load Balancers.
 * </p>
 * <p>
 * To get started, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create an Application Load Balancer using <a>CreateLoadBalancer</a>.
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
 * <li>
 * <p>
 * (Optional) Create one or more rules for content routing based on URL using <a>CreateRule</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * To delete an Application Load Balancer and its related resources, complete the following tasks:
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
public class AmazonElasticLoadBalancingClient extends AmazonWebServiceClient implements AmazonElasticLoadBalancing {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticLoadBalancing.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticloadbalancing";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

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
     */
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
     */
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
     */
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
     */
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new UnsupportedProtocolExceptionUnmarshaller());
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
        exceptionUnmarshallers.add(new TooManyListenersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateLoadBalancerNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationNotPermittedExceptionUnmarshaller());
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
     * Adds the specified tags to the specified resource. You can tag your Application Load Balancers and your target
     * groups.
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
     *        Contains the parameters for AddTags.
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
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest addTagsRequest) {
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
     * Creates a listener for the specified Application Load Balancer.
     * </p>
     * <p>
     * You can create up to 10 listeners per load balancer.
     * </p>
     * <p>
     * To update a listener, use <a>ModifyListener</a>. When you are finished with a listener, you can delete it using
     * <a>DeleteListener</a>. If you are finished with both the listener and the load balancer, you can delete them both
     * using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html">Listeners
     * for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     *        Contains the parameters for CreateListener.
     * @return Result of the CreateListener operation returned by the service.
     * @throws DuplicateListenerException
     *         A listener with the specified port already exists.
     * @throws TooManyListenersException
     *         You've reached the limit on the number of listeners per load balancer.
     * @throws TooManyCertificatesException
     *         You've reached the limit on the number of certificates per listener.
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
     * @sample AmazonElasticLoadBalancing.CreateListener
     */
    @Override
    public CreateListenerResult createListener(CreateListenerRequest createListenerRequest) {
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
     * Creates an Application Load Balancer.
     * </p>
     * <p>
     * To create listeners for your load balancer, use <a>CreateListener</a>. You can add security groups, subnets, and
     * tags when you create your load balancer, or you can add them later using <a>SetSecurityGroups</a>,
     * <a>SetSubnets</a>, and <a>AddTags</a>.
     * </p>
     * <p>
     * To describe your current load balancers, see <a>DescribeLoadBalancers</a>. When you are finished with a load
     * balancer, you can delete it using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can request an increase for the number of load
     * balancers for your account. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Limits for
     * Your Application Load Balancer</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html"
     * >Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     *        Contains the parameters for CreateLoadBalancer.
     * @return Result of the CreateLoadBalancer operation returned by the service.
     * @throws DuplicateLoadBalancerNameException
     *         A load balancer with the specified name already exists for this account.
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
     * @sample AmazonElasticLoadBalancing.CreateLoadBalancer
     */
    @Override
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) {
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
     * Creates a rule for the specified listener.
     * </p>
     * <p>
     * Each rule can have one action and one condition. Rules are evaluated in priority order, from the lowest value to
     * the highest value. When the condition for a rule is met, the specified action is taken. If no conditions are met,
     * the default action for the default rule is taken. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules"
     * >Listener Rules</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * To view your current rules, use <a>DescribeRules</a>. To update a rule, use <a>ModifyRule</a>. To set the
     * priorities of your rules, use <a>SetRulePriorities</a>. To delete a rule, use <a>DeleteRule</a>.
     * </p>
     * 
     * @param createRuleRequest
     *        Contains the parameters for CreateRule.
     * @return Result of the CreateRule operation returned by the service.
     * @throws PriorityInUseException
     *         The specified priority is in use.
     * @throws TooManyTargetGroupsException
     *         You've reached the limit on the number of target groups for your AWS account.
     * @throws TooManyRulesException
     *         You've reached the limit on the number of rules per load balancer.
     * @throws TargetGroupAssociationLimitException
     *         You've reached the limit on the number of load balancers per target group.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @sample AmazonElasticLoadBalancing.CreateRule
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest createRuleRequest) {
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
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html">Target
     * Groups for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     *        Contains the parameters for CreateTargetGroup.
     * @return Result of the CreateTargetGroup operation returned by the service.
     * @throws DuplicateTargetGroupNameException
     *         A target group with the specified name already exists.
     * @throws TooManyTargetGroupsException
     *         You've reached the limit on the number of target groups for your AWS account.
     * @sample AmazonElasticLoadBalancing.CreateTargetGroup
     */
    @Override
    public CreateTargetGroupResult createTargetGroup(CreateTargetGroupRequest createTargetGroupRequest) {
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
     * Alternatively, your listener is deleted when you delete the load balancer it is attached to using
     * <a>DeleteLoadBalancer</a>.
     * </p>
     * 
     * @param deleteListenerRequest
     *        Contains the parameters for DeleteListener.
     * @return Result of the DeleteListener operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @sample AmazonElasticLoadBalancing.DeleteListener
     */
    @Override
    public DeleteListenerResult deleteListener(DeleteListenerRequest deleteListenerRequest) {
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
     * Deletes the specified Application Load Balancer and its attached listeners.
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
     *        Contains the parameters for DeleteLoadBalancer.
     * @return Result of the DeleteLoadBalancer operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.DeleteLoadBalancer
     */
    @Override
    public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) {
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
     *        Contains the parameters for DeleteRule.
     * @return Result of the DeleteRule operation returned by the service.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.DeleteRule
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
                request = new DeleteRuleRequestMarshaller().marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *        Contains the parameters for DeleteTargetGroup.
     * @return Result of the DeleteTargetGroup operation returned by the service.
     * @throws ResourceInUseException
     *         A specified resource is in use.
     * @sample AmazonElasticLoadBalancing.DeleteTargetGroup
     */
    @Override
    public DeleteTargetGroupResult deleteTargetGroup(DeleteTargetGroupRequest deleteTargetGroupRequest) {
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
     *        Contains the parameters for DeregisterTargets.
     * @return Result of the DeregisterTargets operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws InvalidTargetException
     *         The specified target does not exist or is not in the same VPC as the target group.
     * @sample AmazonElasticLoadBalancing.DeregisterTargets
     */
    @Override
    public DeregisterTargetsResult deregisterTargets(DeregisterTargetsRequest deregisterTargetsRequest) {
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
     * Describes the specified listeners or the listeners for the specified Application Load Balancer. You must specify
     * either a load balancer or one or more listeners.
     * </p>
     * 
     * @param describeListenersRequest
     *        Contains the parameters for DescribeListeners.
     * @return Result of the DescribeListeners operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeListeners
     */
    @Override
    public DescribeListenersResult describeListeners(DescribeListenersRequest describeListenersRequest) {
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
     * Describes the attributes for the specified Application Load Balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     *        Contains the parameters for DescribeLoadBalancerAttributes.
     * @return Result of the DescribeLoadBalancerAttributes operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancerAttributes
     */
    @Override
    public DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) {
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
     * Describes the specified Application Load Balancers or all of your Application Load Balancers.
     * </p>
     * <p>
     * To describe the listeners for a load balancer, use <a>DescribeListeners</a>. To describe the attributes for a
     * load balancer, use <a>DescribeLoadBalancerAttributes</a>.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @return Result of the DescribeLoadBalancers operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeLoadBalancers
     */
    @Override
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) {
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
     *        Contains the parameters for DescribeRules.
     * @return Result of the DescribeRules operation returned by the service.
     * @throws ListenerNotFoundException
     *         The specified listener does not exist.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeRules
     */
    @Override
    public DescribeRulesResult describeRules(DescribeRulesRequest describeRulesRequest) {
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
     * Note that the only supported policy at this time is ELBSecurityPolicy-2015-05.
     * </p>
     * 
     * @param describeSSLPoliciesRequest
     *        Contains the parameters for DescribeSSLPolicies.
     * @return Result of the DescribeSSLPolicies operation returned by the service.
     * @throws SSLPolicyNotFoundException
     *         The specified SSL policy does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeSSLPolicies
     */
    @Override
    public DescribeSSLPoliciesResult describeSSLPolicies(DescribeSSLPoliciesRequest describeSSLPoliciesRequest) {
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
     * Describes the tags for the specified resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
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
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) {
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
     * 
     * @param describeTargetGroupAttributesRequest
     *        Contains the parameters for DescribeTargetGroupAttributes.
     * @return Result of the DescribeTargetGroupAttributes operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeTargetGroupAttributes
     */
    @Override
    public DescribeTargetGroupAttributesResult describeTargetGroupAttributes(DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest) {
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
     *        Contains the parameters for DescribeTargetGroups.
     * @return Result of the DescribeTargetGroups operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.DescribeTargetGroups
     */
    @Override
    public DescribeTargetGroupsResult describeTargetGroups(DescribeTargetGroupsRequest describeTargetGroupsRequest) {
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
     *        Contains the parameters for DescribeTargetHealth.
     * @return Result of the DescribeTargetHealth operation returned by the service.
     * @throws InvalidTargetException
     *         The specified target does not exist or is not in the same VPC as the target group.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws HealthUnavailableException
     *         The health of the specified targets could not be retrieved due to an internal error.
     * @sample AmazonElasticLoadBalancing.DescribeTargetHealth
     */
    @Override
    public DescribeTargetHealthResult describeTargetHealth(DescribeTargetHealthRequest describeTargetHealthRequest) {
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
     * HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS,
     * you must add the security policy.
     * </p>
     * 
     * @param modifyListenerRequest
     *        Contains the parameters for ModifyListener.
     * @return Result of the ModifyListener operation returned by the service.
     * @throws DuplicateListenerException
     *         A listener with the specified port already exists.
     * @throws TooManyListenersException
     *         You've reached the limit on the number of listeners per load balancer.
     * @throws TooManyCertificatesException
     *         You've reached the limit on the number of certificates per listener.
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
     * @sample AmazonElasticLoadBalancing.ModifyListener
     */
    @Override
    public ModifyListenerResult modifyListener(ModifyListenerRequest modifyListenerRequest) {
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
     * Modifies the specified attributes of the specified Application Load Balancer.
     * </p>
     * <p>
     * If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
     * you do not modify retain their current values.
     * </p>
     * 
     * @param modifyLoadBalancerAttributesRequest
     *        Contains the parameters for ModifyLoadBalancerAttributes.
     * @return Result of the ModifyLoadBalancerAttributes operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @sample AmazonElasticLoadBalancing.ModifyLoadBalancerAttributes
     */
    @Override
    public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) {
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
     * To modify the default action, use <a>ModifyListener</a>.
     * </p>
     * 
     * @param modifyRuleRequest
     *        Contains the parameters for ModifyRules.
     * @return Result of the ModifyRule operation returned by the service.
     * @throws TargetGroupAssociationLimitException
     *         You've reached the limit on the number of load balancers per target group.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @sample AmazonElasticLoadBalancing.ModifyRule
     */
    @Override
    public ModifyRuleResult modifyRule(ModifyRuleRequest modifyRuleRequest) {
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
     *        Contains the parameters for ModifyTargetGroup.
     * @return Result of the ModifyTargetGroup operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.ModifyTargetGroup
     */
    @Override
    public ModifyTargetGroupResult modifyTargetGroup(ModifyTargetGroupRequest modifyTargetGroupRequest) {
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
     *        Contains the parameters for ModifyTargetGroupAttributes.
     * @return Result of the ModifyTargetGroupAttributes operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @sample AmazonElasticLoadBalancing.ModifyTargetGroupAttributes
     */
    @Override
    public ModifyTargetGroupAttributesResult modifyTargetGroupAttributes(ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest) {
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
     * By default, the load balancer routes requests to registered targets using the protocol and port number for the
     * target group. Alternatively, you can override the port for a target when you register it.
     * </p>
     * <p>
     * The target must be in the virtual private cloud (VPC) that you specified for the target group. If the target is
     * an EC2 instance, it can't be in the <code>stopped</code> or <code>running</code> state when you register it.
     * </p>
     * <p>
     * To remove a target from a target group, use <a>DeregisterTargets</a>.
     * </p>
     * 
     * @param registerTargetsRequest
     *        Contains the parameters for RegisterTargets.
     * @return Result of the RegisterTargets operation returned by the service.
     * @throws TargetGroupNotFoundException
     *         The specified target group does not exist.
     * @throws TooManyTargetsException
     *         You've reached the limit on the number of targets.
     * @throws InvalidTargetException
     *         The specified target does not exist or is not in the same VPC as the target group.
     * @throws TooManyRegistrationsForTargetIdException
     *         You've reached the limit on the number of times a target can be registered with a load balancer.
     * @sample AmazonElasticLoadBalancing.RegisterTargets
     */
    @Override
    public RegisterTargetsResult registerTargets(RegisterTargetsRequest registerTargetsRequest) {
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
     * Removes the specified tags from the specified resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
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
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest) {
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
     * Sets the priorities of the specified rules.
     * </p>
     * <p>
     * You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
     * you do not specify retain their current priority.
     * </p>
     * 
     * @param setRulePrioritiesRequest
     *        Contains the parameters for SetRulePriorities.
     * @return Result of the SetRulePriorities operation returned by the service.
     * @throws RuleNotFoundException
     *         The specified rule does not exist.
     * @throws PriorityInUseException
     *         The specified priority is in use.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AmazonElasticLoadBalancing.SetRulePriorities
     */
    @Override
    public SetRulePrioritiesResult setRulePriorities(SetRulePrioritiesRequest setRulePrioritiesRequest) {
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
     * Associates the specified security groups with the specified load balancer. The specified security groups override
     * the previously associated security groups.
     * </p>
     * 
     * @param setSecurityGroupsRequest
     *        Contains the parameters for SetSecurityGroups.
     * @return Result of the SetSecurityGroups operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws InvalidSecurityGroupException
     *         The specified security group does not exist.
     * @sample AmazonElasticLoadBalancing.SetSecurityGroups
     */
    @Override
    public SetSecurityGroupsResult setSecurityGroups(SetSecurityGroupsRequest setSecurityGroupsRequest) {
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
     * Enables the Availability Zone for the specified subnets for the specified load balancer. The specified subnets
     * replace the previously enabled subnets.
     * </p>
     * 
     * @param setSubnetsRequest
     *        Contains the parameters for SetSubnets.
     * @return Result of the SetSubnets operation returned by the service.
     * @throws LoadBalancerNotFoundException
     *         The specified load balancer does not exist.
     * @throws InvalidConfigurationRequestException
     *         The requested configuration is not valid.
     * @throws SubnetNotFoundException
     *         The specified subnet does not exist.
     * @throws InvalidSubnetException
     *         The specified subnet is out of available addresses.
     * @sample AmazonElasticLoadBalancing.SetSubnets
     */
    @Override
    public SetSubnetsResult setSubnets(SetSubnetsRequest setSubnetsRequest) {
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
