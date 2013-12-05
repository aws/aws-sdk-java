/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.services.elasticloadbalancing.model.transform.*;


/**
 * Client for accessing AmazonElasticLoadBalancing.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Elastic Load Balancing <p>
 * Elastic Load Balancing is a cost-effective and easy to use web service to help you improve the availability and scalability of your application
 * running on Amazon Elastic Cloud Compute (Amazon EC2). It makes it easy for you to distribute application loads between two or more EC2 instances.
 * Elastic Load Balancing supports the growth in traffic of your application by enabling availability through redundancy.
 * </p>
 * <p>
 * This guide provides detailed information about Elastic Load Balancing actions, data types, and parameters that can be used for sending a query
 * request. Query requests are HTTP or HTTPS requests that use the HTTP verb GET or POST and a query parameter named Action or Operation. Action is used
 * throughout this documentation, although Operation is supported for backward compatibility with other AWS Query APIs.
 * </p>
 * <p>
 * For detailed information on constructing a query request using the actions, data types, and parameters mentioned in this guide, go to <a
 * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-query-api.html"> Using the Query API </a> in the <i>Elastic Load
 * Balancing Developer Guide</i> .
 * </p>
 * <p>
 * For detailed information about Elastic Load Balancing features and their associated actions, go to <a
 * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenarios.html"> Using Elastic Load Balancing </a> in the <i>Elastic
 * Load Balancing Developer Guide</i> .
 * </p>
 * <p>
 * This reference guide is based on the current WSDL, which is available at: <a
 * href="http://elasticloadbalancing.amazonaws.com/doc/2012-06-01/ElasticLoadBalancing.wsdl"> </a>
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * The examples in this guide assume that your load balancers are created in the US East (Northern Virginia) region and use us-east-1 as the endpoint.
 * </p>
 * <p>
 * You can create your load balancers in other AWS regions. For information about regions and endpoints supported by Elastic Load Balancing, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a> in the Amazon Web Services General Reference.
 * </p>
 */
public class AmazonElasticLoadBalancingClient extends AmazonWebServiceClient implements AmazonElasticLoadBalancing {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonElasticLoadBalancing exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticLoadBalancingClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticLoadBalancing
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticLoadBalancingClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticLoadBalancing
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticLoadBalancingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticLoadBalancing using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticLoadBalancing
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticLoadBalancingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ListenerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidConfigurationRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LoadBalancerAttributeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPoliciesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSecurityGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LoadBalancerNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateListenerExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLoadBalancersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyTypeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSchemeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidInstanceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicatePolicyNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateLoadBalancerNameExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticloadbalancing.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticloadbalancing/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/elasticloadbalancing/request.handler2s"));
    }

    
    /**
     * <p>
     * Returns meta-information on the specified load balancer policies
     * defined by the Elastic Load Balancing service. The policy types that
     * are returned from this action can be used in a
     * CreateLoadBalancerPolicy action to instantiate specific policy
     * configurations that will be applied to a load balancer.
     * </p>
     *
     * @param describeLoadBalancerPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerPolicyTypes
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancerPolicyTypes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyTypeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerPolicyTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeLoadBalancerPolicyTypesRequest> request = null;
        Response<DescribeLoadBalancerPolicyTypesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeLoadBalancerPolicyTypesRequestMarshaller().marshall(describeLoadBalancerPolicyTypesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancerPolicyTypesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Specifies the health check settings to use for evaluating the health
     * state of your back-end instances.
     * </p>
     * <p>
     * For more information, see <a
     * ing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#healthcheck">
     * Health Check </a> in the <i>Elastic Load Balancing Developer
     * Guide</i> .
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the ConfigureHealthCheck service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest configureHealthCheckRequest) {
        ExecutionContext executionContext = createExecutionContext(configureHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ConfigureHealthCheckRequest> request = null;
        Response<ConfigureHealthCheckResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ConfigureHealthCheckRequestMarshaller().marshall(configureHealthCheckRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ConfigureHealthCheckResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes subnets from the set of configured subnets in the Amazon
     * Virtual Private Cloud (Amazon VPC) for the load balancer.
     * </p>
     * <p>
     * After a subnet is removed all of the EC2 instances registered with
     * the load balancer that are in the removed subnet will go into the
     * <i>OutOfService</i> state. When a subnet is removed, the load balancer
     * will balance the traffic among the remaining routable subnets for the
     * load balancer.
     * </p>
     *
     * @param detachLoadBalancerFromSubnetsRequest Container for the
     *           necessary parameters to execute the DetachLoadBalancerFromSubnets
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DetachLoadBalancerFromSubnets service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachLoadBalancerFromSubnetsResult detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest) {
        ExecutionContext executionContext = createExecutionContext(detachLoadBalancerFromSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachLoadBalancerFromSubnetsRequest> request = null;
        Response<DetachLoadBalancerFromSubnetsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DetachLoadBalancerFromSubnetsRequestMarshaller().marshall(detachLoadBalancerFromSubnetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DetachLoadBalancerFromSubnetsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Modifies the attributes of a specified load balancer.
     * </p>
     *
     * @param modifyLoadBalancerAttributesRequest Container for the necessary
     *           parameters to execute the ModifyLoadBalancerAttributes service method
     *           on AmazonElasticLoadBalancing.
     * 
     * @return The response from the ModifyLoadBalancerAttributes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerAttributeNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyLoadBalancerAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifyLoadBalancerAttributesRequest> request = null;
        Response<ModifyLoadBalancerAttributesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifyLoadBalancerAttributesRequestMarshaller().marshall(modifyLoadBalancerAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyLoadBalancerAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates one or more listeners on a load balancer for the specified
     * port. If a listener with the given port does not already exist, it
     * will be created; otherwise, the properties of the new listener must
     * match the properties of the existing listener.
     * </p>
     * <p>
     * For more information, see <a
     * .com/ElasticLoadBalancing/latest/DeveloperGuide/us-add-listener.html">
     * Add a Listener to Your Load Balancer </a> in the <i>Elastic Load
     * Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerListeners service method
     *           on AmazonElasticLoadBalancing.
     * 
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicateListenerException
     * @throws CertificateNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLoadBalancerListeners(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateLoadBalancerListenersRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateLoadBalancerListenersRequestMarshaller().marshall(createLoadBalancerListenersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes listeners from the load balancer for the specified port.
     * </p>
     *
     * @param deleteLoadBalancerListenersRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerListeners service method
     *           on AmazonElasticLoadBalancing.
     * 
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteLoadBalancerListenersRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteLoadBalancerListenersRequestMarshaller().marshall(deleteLoadBalancerListenersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes that
     * follow that of an application-generated cookie. This policy can be
     * associated only with HTTP/HTTPS listeners.
     * </p>
     * <p>
     * This policy is similar to the policy created by
     * CreateLBCookieStickinessPolicy, except that the lifetime of the
     * special Elastic Load Balancing cookie follows the lifetime of the
     * application-generated cookie specified in the policy configuration.
     * The load balancer only inserts a new stickiness cookie when the
     * application response includes a new application cookie.
     * </p>
     * <p>
     * If the application cookie is explicitly removed or expires, the
     * session stops being sticky until a new application cookie is issued.
     * </p>
     * <p>
     * <b>NOTE:</b> An application client must receive and send two cookies:
     * the application-generated cookie and the special Elastic Load
     * Balancing cookie named AWSELB. This is the default behavior for many
     * common web browsers.
     * </p>
     * <p>
     * For more information, see <a
     * eloperGuide/US_StickySessions.html#US_EnableStickySessionsAppCookies">
     * Enabling Application-Controlled Session Stickiness </a> in the
     * <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateAppCookieStickinessPolicy service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createAppCookieStickinessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateAppCookieStickinessPolicyRequest> request = null;
        Response<CreateAppCookieStickinessPolicyResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateAppCookieStickinessPolicyRequestMarshaller().marshall(createAppCookieStickinessPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateAppCookieStickinessPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Associates one or more security groups with your load balancer in
     * Amazon Virtual Private Cloud (Amazon VPC). The provided security group
     * IDs will override any currently applied security groups.
     * </p>
     * <p>
     * For more information, see <a
     * on.com/ElasticLoadBalancing/latest/DeveloperGuide/USVPC_ApplySG.html">
     * Manage Security Groups in Amazon VPC </a> in the <i>Elastic Load
     * Balancing Developer Guide</i> .
     * </p>
     *
     * @param applySecurityGroupsToLoadBalancerRequest Container for the
     *           necessary parameters to execute the ApplySecurityGroupsToLoadBalancer
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the ApplySecurityGroupsToLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws InvalidSecurityGroupException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ApplySecurityGroupsToLoadBalancerResult applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(applySecurityGroupsToLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ApplySecurityGroupsToLoadBalancerRequest> request = null;
        Response<ApplySecurityGroupsToLoadBalancerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ApplySecurityGroupsToLoadBalancerRequestMarshaller().marshall(applySecurityGroupsToLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ApplySecurityGroupsToLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns detailed descriptions of the policies. If you specify a load
     * balancer name, the action returns the descriptions of all the policies
     * created for the load balancer. If you specify a policy name associated
     * with your load balancer, the action returns the description of that
     * policy. If you don't specify a load balancer name, the action returns
     * descriptions of the specified sample policies, or descriptions of all
     * the sample policies. The names of the sample policies have the
     * <code>ELBSample-</code> prefix.
     * </p>
     *
     * @param describeLoadBalancerPoliciesRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancerPolicies service method
     *           on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancerPolicies service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeLoadBalancerPoliciesRequest> request = null;
        Response<DescribeLoadBalancerPoliciesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeLoadBalancerPoliciesRequestMarshaller().marshall(describeLoadBalancerPoliciesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancerPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Associates, updates, or disables a policy with a listener on the load
     * balancer. You can associate multiple policies with a listener.
     * </p>
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the SetLoadBalancerPoliciesOfListener
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     * @throws ListenerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoadBalancerPoliciesOfListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetLoadBalancerPoliciesOfListenerRequest> request = null;
        Response<SetLoadBalancerPoliciesOfListenerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetLoadBalancerPoliciesOfListenerRequestMarshaller().marshall(setLoadBalancerPoliciesOfListenerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SetLoadBalancerPoliciesOfListenerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes the specified EC2 Availability Zones from the set of
     * configured Availability Zones for the load balancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a load
     * balancer at all times. Once an Availability Zone is removed, all the
     * instances registered with the load balancer that are in the removed
     * Availability Zone go into the <i>OutOfService</i> state. Upon
     * Availability Zone removal, the load balancer attempts to equally
     * balance the traffic among its remaining usable Availability Zones.
     * Trying to remove an Availability Zone that was not associated with the
     * load balancer does nothing.
     * </p>
     * <p>
     * For more information, see <a
     * com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html">
     * Disable an Availability Zone from a Load-Balanced Application </a> in
     * the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DisableAvailabilityZonesForLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(disableAvailabilityZonesForLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DisableAvailabilityZonesForLoadBalancerRequest> request = null;
        Response<DisableAvailabilityZonesForLoadBalancerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DisableAvailabilityZonesForLoadBalancerRequestMarshaller().marshall(disableAvailabilityZonesForLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DisableAvailabilityZonesForLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the current state of the specified instances registered with
     * the specified load balancer. If no instances are specified, the state
     * of all the instances registered with the load balancer is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> You must provide the same account credentials as those
     * that were used to create the load balancer.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeInstanceHealth service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest describeInstanceHealthRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstanceHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeInstanceHealthRequest> request = null;
        Response<DescribeInstanceHealthResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeInstanceHealthRequestMarshaller().marshall(describeInstanceHealthRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeInstanceHealthResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes a policy from the load balancer. The specified policy must
     * not be enabled for any listeners.
     * </p>
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DeleteLoadBalancerPolicy service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteLoadBalancerPolicyRequest> request = null;
        Response<DeleteLoadBalancerPolicyResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteLoadBalancerPolicyRequestMarshaller().marshall(deleteLoadBalancerPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteLoadBalancerPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new policy that contains the necessary attributes depending
     * on the policy type. Policies are settings that are saved for your load
     * balancer and that can be applied to the front-end listener, or the
     * back-end application server, depending on your policy type.
     * </p>
     *
     * @param createLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancerPolicy service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLoadBalancerPolicy service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyTypeNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoadBalancerPolicyResult createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateLoadBalancerPolicyRequest> request = null;
        Response<CreateLoadBalancerPolicyResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateLoadBalancerPolicyRequestMarshaller().marshall(createLoadBalancerPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLoadBalancerPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds one or more EC2 Availability Zones to the load balancer.
     * </p>
     * <p>
     * The load balancer evenly distributes requests across all its
     * registered Availability Zones that contain instances.
     * </p>
     * <p>
     * <b>NOTE:</b> The new EC2 Availability Zones to be added must be in the
     * same EC2 Region as the Availability Zones for which the load balancer
     * was created.
     * </p>
     * <p>
     * For more information, see <a
     * ticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html">
     * Expand a Load Balanced Application to an Additional Availability Zone
     * </a> in the <i>Elastic Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the EnableAvailabilityZonesForLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(enableAvailabilityZonesForLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<EnableAvailabilityZonesForLoadBalancerRequest> request = null;
        Response<EnableAvailabilityZonesForLoadBalancerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new EnableAvailabilityZonesForLoadBalancerRequestMarshaller().marshall(enableAvailabilityZonesForLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new EnableAvailabilityZonesForLoadBalancerResultStaxUnmarshaller(), executionContext);
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
     * If attempting to recreate the load balancer, you must reconfigure all
     * the settings. The DNS name associated with a deleted load balancer
     * will no longer be usable. Once deleted, the name and associated DNS
     * record of the load balancer no longer exist and traffic sent to any of
     * its IP addresses will no longer be delivered to back-end instances.
     * </p>
     * <p>
     * To successfully call this API, you must provide the same account
     * credentials as were used to create the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> By design, if the load balancer does not exist or has
     * already been deleted, a call to DeleteLoadBalancer action still
     * succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteLoadBalancerRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteLoadBalancerRequestMarshaller().marshall(deleteLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a new load balancer.
     * </p>
     * <p>
     * After the call has completed successfully, a new load balancer is
     * created with a unique Domain Name Service (DNS) name. The DNS name
     * includes the name of the AWS region in which the load balance was
     * created. For example, if your load balancer was created in the United
     * States, the DNS name might end with either of the following:
     * </p>
     * 
     * <ul>
     * <li> <i>us-east-1.elb.amazonaws.com</i> (for the Northern Virginia
     * Region) </li>
     * <li> <i>us-west-1.elb.amazonaws.com</i> (for the Northern California
     * Region) </li>
     * 
     * </ul>
     * <p>
     * For information about the AWS regions supported by Elastic Load
     * Balancing, see <a
     * ="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">
     * Regions and Endpoints </a> .
     * </p>
     * <p>
     * You can create up to 10 load balancers per region per account.
     * </p>
     * <p>
     * Elastic Load Balancing supports load balancing your Amazon EC2
     * instances launched within any one of the following platforms:
     * </p>
     * 
     * <ul>
     * <li> <i>EC2-Classic</i> <p>
     * For information on creating and managing your load balancers in
     * EC2-Classic, see <a
     * /ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForEC2.html">
     * Deploy Elastic Load Balancing in Amazon EC2-Classic </a> .
     * </p>
     * </li>
     * <li> <i>EC2-VPC</i> <p>
     * For information on creating and managing your load balancers in
     * EC2-VPC, see <a
     * /ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html">
     * Deploy Elastic Load Balancing in Amazon VPC </a> .
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLoadBalancer service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidSubnetException
     * @throws InvalidConfigurationRequestException
     * @throws InvalidSecurityGroupException
     * @throws CertificateNotFoundException
     * @throws InvalidSchemeException
     * @throws DuplicateLoadBalancerNameException
     * @throws TooManyLoadBalancersException
     * @throws SubnetNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(createLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateLoadBalancerRequest> request = null;
        Response<CreateLoadBalancerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateLoadBalancerRequestMarshaller().marshall(createLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Replaces the current set of policies associated with a port on which
     * the back-end server is listening with a new set of policies. After the
     * policies have been created using CreateLoadBalancerPolicy, they can be
     * applied here as a list. At this time, only the back-end server
     * authentication policy type can be applied to the back-end ports; this
     * policy type is composed of multiple public key policies.
     * </p>
     * <p>
     * <b>NOTE:</b> The SetLoadBalancerPoliciesForBackendServer replaces the
     * current set of policies associated with the specified instance port.
     * Every time you use this action to enable the policies, use the
     * PolicyNames parameter to list all the policies you want to enable.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies
     * action to verify that the policy has been associated with the back-end
     * server.
     * </p>
     *
     * @param setLoadBalancerPoliciesForBackendServerRequest Container for
     *           the necessary parameters to execute the
     *           SetLoadBalancerPoliciesForBackendServer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the SetLoadBalancerPoliciesForBackendServer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetLoadBalancerPoliciesForBackendServerResult setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoadBalancerPoliciesForBackendServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetLoadBalancerPoliciesForBackendServerRequest> request = null;
        Response<SetLoadBalancerPoliciesForBackendServerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetLoadBalancerPoliciesForBackendServerRequestMarshaller().marshall(setLoadBalancerPoliciesForBackendServerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SetLoadBalancerPoliciesForBackendServerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deregisters instances from the load balancer. Once the instance is
     * deregistered, it will stop receiving traffic from the load balancer.
     * </p>
     * <p>
     * In order to successfully call this API, the same account credentials
     * as those used to create the load balancer must be provided.
     * </p>
     * <p>
     * For more information, see <a
     * asticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html">
     * De-register and Register Amazon EC2 Instances </a> in the <i>Elastic
     * Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * You can use DescribeLoadBalancers to verify if the instance is
     * deregistered from the load balancer.
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DeregisterInstancesFromLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterInstancesFromLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeregisterInstancesFromLoadBalancerRequest> request = null;
        Response<DeregisterInstancesFromLoadBalancerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeregisterInstancesFromLoadBalancerRequestMarshaller().marshall(deregisterInstancesFromLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeregisterInstancesFromLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Sets the certificate that terminates the specified listener's SSL
     * connections. The specified certificate replaces any prior certificate
     * that was used on the same load balancer and port.
     * </p>
     * <p>
     * For more information on updating your SSL certificate, see <a
     * cLoadBalancing/latest/DeveloperGuide/US_UpdatingLoadBalancerSSL.html">
     * Updating an SSL Certificate for a Load Balancer </a> in the <i>Elastic
     * Load Balancing Developer Guide</i> .
     * </p>
     *
     * @param setLoadBalancerListenerSSLCertificateRequest Container for the
     *           necessary parameters to execute the
     *           SetLoadBalancerListenerSSLCertificate service method on
     *           AmazonElasticLoadBalancing.
     * 
     * 
     * @throws InvalidConfigurationRequestException
     * @throws CertificateNotFoundException
     * @throws LoadBalancerNotFoundException
     * @throws ListenerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoadBalancerListenerSSLCertificate(SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoadBalancerListenerSSLCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetLoadBalancerListenerSSLCertificateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetLoadBalancerListenerSSLCertificateRequestMarshaller().marshall(setLoadBalancerListenerSSLCertificateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns detailed information about all of the attributes associated
     * with the specified load balancer.
     * </p>
     *
     * @param describeLoadBalancerAttributesRequest Container for the
     *           necessary parameters to execute the DescribeLoadBalancerAttributes
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancerAttributes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerAttributeNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeLoadBalancerAttributesRequest> request = null;
        Response<DescribeLoadBalancerAttributesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeLoadBalancerAttributesRequestMarshaller().marshall(describeLoadBalancerAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancerAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Generates a stickiness policy with sticky session lifetimes
     * controlled by the lifetime of the browser (user-agent) or a specified
     * expiration period. This policy can be associated only with HTTP/HTTPS
     * listeners.
     * </p>
     * <p>
     * When a load balancer implements this policy, the load balancer uses a
     * special cookie to track the backend server instance for each request.
     * When the load balancer receives a request, it first checks to see if
     * this cookie is present in the request. If so, the load balancer sends
     * the request to the application server specified in the cookie. If not,
     * the load balancer sends the request to a server that is chosen based
     * on the existing load balancing algorithm.
     * </p>
     * <p>
     * A cookie is inserted into the response for binding subsequent
     * requests from the same user to that server. The validity of the cookie
     * is based on the cookie expiration time, which is specified in the
     * policy configuration.
     * </p>
     * <p>
     * For more information, see <a
     * veloperGuide/US_StickySessions.html#US_EnableStickySessionsLBCookies">
     * Enabling Duration-Based Session Stickiness </a> in the <i>Elastic Load
     * Balancing Developer Guide</i> .
     * </p>
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLBCookieStickinessPolicy service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws TooManyPoliciesException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createLBCookieStickinessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateLBCookieStickinessPolicyRequest> request = null;
        Response<CreateLBCookieStickinessPolicyResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateLBCookieStickinessPolicyRequestMarshaller().marshall(createLBCookieStickinessPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateLBCookieStickinessPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds one or more subnets to the set of configured subnets in the
     * Amazon Virtual Private Cloud (Amazon VPC) for the load balancer.
     * </p>
     * <p>
     * The load balancers evenly distribute requests across all of the
     * registered subnets. For more information, see <a
     * /ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html">
     * Deploy Elastic Load Balancing in Amazon VPC </a> in the <i>Elastic
     * Load Balancing Developer Guide</i> .
     * 
     * </p>
     *
     * @param attachLoadBalancerToSubnetsRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancerToSubnets service method
     *           on AmazonElasticLoadBalancing.
     * 
     * @return The response from the AttachLoadBalancerToSubnets service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidSubnetException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     * @throws SubnetNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachLoadBalancerToSubnetsResult attachLoadBalancerToSubnets(AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest) {
        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerToSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachLoadBalancerToSubnetsRequest> request = null;
        Response<AttachLoadBalancerToSubnetsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AttachLoadBalancerToSubnetsRequestMarshaller().marshall(attachLoadBalancerToSubnetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AttachLoadBalancerToSubnetsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds new instances to the load balancer.
     * </p>
     * <p>
     * Once the instance is registered, it starts receiving traffic and
     * requests from the load balancer. Any instance that is not in any of
     * the Availability Zones registered for the load balancer will be moved
     * to the <i>OutOfService</i> state. It will move to the <i>InService</i>
     * state when the Availability Zone is added to the load balancer.
     * </p>
     * <p>
     * When an instance registered with a load balancer is stopped and then
     * restarted, the IP addresses associated with the instance changes.
     * Elastic Load Balancing cannot recognize the new IP address, which
     * prevents it from routing traffic to the instances. We recommend that
     * you de-register your Amazon EC2 instances from your load balancer
     * after you stop your instance, and then register the load balancer with
     * your instance after you've restarted. To de-register your instances
     * from load balancer, use DeregisterInstancesFromLoadBalancer action.
     * </p>
     * <p>
     * For more information, see <a
     * asticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html">
     * De-register and Register Amazon EC2 Instances </a> in the <i>Elastic
     * Load Balancing Developer Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> In order for this call to be successful, you must provide
     * the same account credentials as those that were used to create the
     * load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> Completion of this API does not guarantee that operation
     * has completed. Rather, it means that the request has been registered
     * and the changes will happen shortly.
     * </p>
     * <p>
     * You can use DescribeLoadBalancers or DescribeInstanceHealth action to
     * check the state of the newly registered instances.
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the RegisterInstancesWithLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     * @throws InvalidInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(registerInstancesWithLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RegisterInstancesWithLoadBalancerRequest> request = null;
        Response<RegisterInstancesWithLoadBalancerResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RegisterInstancesWithLoadBalancerRequestMarshaller().marshall(registerInstancesWithLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RegisterInstancesWithLoadBalancerResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns detailed configuration information for all the load balancers
     * created for the account. If you specify load balancer names, the
     * action returns configuration information of the specified load
     * balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> In order to retrieve this information, you must provide
     * the same account credentials that was used to create the load
     * balancer.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeLoadBalancersRequest> request = null;
        Response<DescribeLoadBalancersResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeLoadBalancersRequestMarshaller().marshall(describeLoadBalancersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoadBalancersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns meta-information on the specified load balancer policies
     * defined by the Elastic Load Balancing service. The policy types that
     * are returned from this action can be used in a
     * CreateLoadBalancerPolicy action to instantiate specific policy
     * configurations that will be applied to a load balancer.
     * </p>
     * 
     * @return The response from the DescribeLoadBalancerPolicyTypes service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyTypeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes() throws AmazonServiceException, AmazonClientException {
        return describeLoadBalancerPolicyTypes(new DescribeLoadBalancerPolicyTypesRequest());
    }
    
    /**
     * <p>
     * Returns detailed descriptions of the policies. If you specify a load
     * balancer name, the action returns the descriptions of all the policies
     * created for the load balancer. If you specify a policy name associated
     * with your load balancer, the action returns the description of that
     * policy. If you don't specify a load balancer name, the action returns
     * descriptions of the specified sample policies, or descriptions of all
     * the sample policies. The names of the sample policies have the
     * <code>ELBSample-</code> prefix.
     * </p>
     * 
     * @return The response from the DescribeLoadBalancerPolicies service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws PolicyNotFoundException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies() throws AmazonServiceException, AmazonClientException {
        return describeLoadBalancerPolicies(new DescribeLoadBalancerPoliciesRequest());
    }
    
    /**
     * <p>
     * Returns detailed configuration information for all the load balancers
     * created for the account. If you specify load balancer names, the
     * action returns configuration information of the specified load
     * balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> In order to retrieve this information, you must provide
     * the same account credentials that was used to create the load
     * balancer.
     * </p>
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers() throws AmazonServiceException, AmazonClientException {
        return describeLoadBalancers(new DescribeLoadBalancersRequest());
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        