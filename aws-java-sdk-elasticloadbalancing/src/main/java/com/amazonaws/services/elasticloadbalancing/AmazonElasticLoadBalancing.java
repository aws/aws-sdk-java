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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.services.elasticloadbalancing.waiters.AmazonElasticLoadBalancingWaiters;

/**
 * Interface for accessing Elastic Load Balancing.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticloadbalancing.AbstractAmazonElasticLoadBalancing} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticLoadBalancing {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "elasticloadbalancing";

    /**
     * Overrides the default endpoint for this client ("elasticloadbalancing.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticloadbalancing.amazonaws.com") or a full URL, including the
     * protocol (ex: "elasticloadbalancing.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elasticloadbalancing.amazonaws.com") or a full URL, including the protocol (ex:
     *        "elasticloadbalancing.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonElasticLoadBalancing#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

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
    ApplySecurityGroupsToLoadBalancerResult applySecurityGroupsToLoadBalancer(ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest);

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
    AttachLoadBalancerToSubnetsResult attachLoadBalancerToSubnets(AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest);

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
    ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest configureHealthCheckRequest);

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
    CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest);

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
    CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest);

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
    CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest);

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
    CreateLoadBalancerListenersResult createLoadBalancerListeners(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest);

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
    CreateLoadBalancerPolicyResult createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest);

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
    DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

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
    DeleteLoadBalancerListenersResult deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest);

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
    DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest);

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
    DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest);

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
    DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest);

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
    DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest describeInstanceHealthRequest);

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
    DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest);

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
    DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest);

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicies operation.
     *
     * @see #describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest)
     */
    DescribeLoadBalancerPoliciesResult describeLoadBalancerPolicies();

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
    DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest);

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicyTypes operation.
     *
     * @see #describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest)
     */
    DescribeLoadBalancerPolicyTypesResult describeLoadBalancerPolicyTypes();

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
    DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * Simplified method form for invoking the DescribeLoadBalancers operation.
     *
     * @see #describeLoadBalancers(DescribeLoadBalancersRequest)
     */
    DescribeLoadBalancersResult describeLoadBalancers();

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
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

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
    DetachLoadBalancerFromSubnetsResult detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest);

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
    DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest);

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
    EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest);

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
    ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest);

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
    RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest);

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
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

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
    SetLoadBalancerListenerSSLCertificateResult setLoadBalancerListenerSSLCertificate(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest);

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
    SetLoadBalancerPoliciesForBackendServerResult setLoadBalancerPoliciesForBackendServer(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest);

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
    SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonElasticLoadBalancingWaiters waiters();

}
