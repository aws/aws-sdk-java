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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.services.elasticloadbalancingv2.waiters.AmazonElasticLoadBalancingWaiters;

/**
 * Interface for accessing Elastic Load Balancing v2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticloadbalancingv2.AbstractAmazonElasticLoadBalancing} instead.
 * </p>
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
     * Overrides the default endpoint for this client ("elasticloadbalancing.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticloadbalancing.us-east-1.amazonaws.com") or a full URL,
     * including the protocol (ex: "elasticloadbalancing.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration} will be used, which by default is
     * HTTPS.
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
     *        The endpoint (ex: "elasticloadbalancing.us-east-1.amazonaws.com") or a full URL, including the protocol
     *        (ex: "elasticloadbalancing.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
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
    AddListenerCertificatesResult addListenerCertificates(AddListenerCertificatesRequest addListenerCertificatesRequest);

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
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

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
    CreateListenerResult createListener(CreateListenerRequest createListenerRequest);

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
    CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest);

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
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest);

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
    CreateTargetGroupResult createTargetGroup(CreateTargetGroupRequest createTargetGroupRequest);

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
    DeleteListenerResult deleteListener(DeleteListenerRequest deleteListenerRequest);

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
    DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

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
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

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
    DeleteTargetGroupResult deleteTargetGroup(DeleteTargetGroupRequest deleteTargetGroupRequest);

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
    DeregisterTargetsResult deregisterTargets(DeregisterTargetsRequest deregisterTargetsRequest);

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
    DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest);

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
    DescribeListenerCertificatesResult describeListenerCertificates(DescribeListenerCertificatesRequest describeListenerCertificatesRequest);

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
    DescribeListenersResult describeListeners(DescribeListenersRequest describeListenersRequest);

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
    DescribeLoadBalancerAttributesResult describeLoadBalancerAttributes(DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest);

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
    DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest);

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
    DescribeRulesResult describeRules(DescribeRulesRequest describeRulesRequest);

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
    DescribeSSLPoliciesResult describeSSLPolicies(DescribeSSLPoliciesRequest describeSSLPoliciesRequest);

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
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

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
    DescribeTargetGroupAttributesResult describeTargetGroupAttributes(DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest);

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
    DescribeTargetGroupsResult describeTargetGroups(DescribeTargetGroupsRequest describeTargetGroupsRequest);

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
    DescribeTargetHealthResult describeTargetHealth(DescribeTargetHealthRequest describeTargetHealthRequest);

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
    ModifyListenerResult modifyListener(ModifyListenerRequest modifyListenerRequest);

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
    ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest);

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
    ModifyRuleResult modifyRule(ModifyRuleRequest modifyRuleRequest);

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
    ModifyTargetGroupResult modifyTargetGroup(ModifyTargetGroupRequest modifyTargetGroupRequest);

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
    ModifyTargetGroupAttributesResult modifyTargetGroupAttributes(ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest);

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
    RegisterTargetsResult registerTargets(RegisterTargetsRequest registerTargetsRequest);

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
    RemoveListenerCertificatesResult removeListenerCertificates(RemoveListenerCertificatesRequest removeListenerCertificatesRequest);

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
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

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
    SetIpAddressTypeResult setIpAddressType(SetIpAddressTypeRequest setIpAddressTypeRequest);

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
    SetRulePrioritiesResult setRulePriorities(SetRulePrioritiesRequest setRulePrioritiesRequest);

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
    SetSecurityGroupsResult setSecurityGroups(SetSecurityGroupsRequest setSecurityGroupsRequest);

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
    SetSubnetsResult setSubnets(SetSubnetsRequest setSubnetsRequest);

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
