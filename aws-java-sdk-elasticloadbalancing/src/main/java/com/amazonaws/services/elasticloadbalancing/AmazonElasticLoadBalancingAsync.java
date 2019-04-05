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

import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing Elastic Load Balancing asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticloadbalancing.AbstractAmazonElasticLoadBalancingAsync} instead.
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
public interface AmazonElasticLoadBalancingAsync extends AmazonElasticLoadBalancing {

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
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AddTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AddTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ApplySecurityGroupsToLoadBalancer operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.ApplySecurityGroupsToLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ApplySecurityGroupsToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplySecurityGroupsToLoadBalancer operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ApplySecurityGroupsToLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ApplySecurityGroupsToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ApplySecurityGroupsToLoadBalancerResult> applySecurityGroupsToLoadBalancerAsync(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<ApplySecurityGroupsToLoadBalancerRequest, ApplySecurityGroupsToLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachLoadBalancerToSubnets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.AttachLoadBalancerToSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AttachLoadBalancerToSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancerToSubnets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.AttachLoadBalancerToSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/AttachLoadBalancerToSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerToSubnetsResult> attachLoadBalancerToSubnetsAsync(
            AttachLoadBalancerToSubnetsRequest attachLoadBalancerToSubnetsRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerToSubnetsRequest, AttachLoadBalancerToSubnetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ConfigureHealthCheck operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ConfigureHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ConfigureHealthCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest configureHealthCheckRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfigureHealthCheck operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ConfigureHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ConfigureHealthCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest configureHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<ConfigureHealthCheckRequest, ConfigureHealthCheckResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateAppCookieStickinessPolicy operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.CreateAppCookieStickinessPolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateAppCookieStickinessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppCookieStickinessPolicy operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateAppCookieStickinessPolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateAppCookieStickinessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppCookieStickinessPolicyResult> createAppCookieStickinessPolicyAsync(
            CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppCookieStickinessPolicyRequest, CreateAppCookieStickinessPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLBCookieStickinessPolicy operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.CreateLBCookieStickinessPolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLBCookieStickinessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLBCookieStickinessPolicy operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateLBCookieStickinessPolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLBCookieStickinessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLBCookieStickinessPolicyResult> createLBCookieStickinessPolicyAsync(
            CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLBCookieStickinessPolicyRequest, CreateLBCookieStickinessPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLoadBalancerListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateLoadBalancerListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(
            CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancerListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateLoadBalancerListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerListenersResult> createLoadBalancerListenersAsync(
            CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerListenersRequest, CreateLoadBalancerListenersResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLoadBalancerPolicy operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateLoadBalancerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancerPolicy operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateLoadBalancerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerPolicyResult> createLoadBalancerPolicyAsync(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerPolicyRequest, CreateLoadBalancerPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest
     *        Contains the parameters for DeleteLoadBalancerListeners.
     * @return A Java Future containing the result of the DeleteLoadBalancerListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteLoadBalancerListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(
            DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest);

    /**
     * <p>
     * Deletes the specified listeners from the specified load balancer.
     * </p>
     * 
     * @param deleteLoadBalancerListenersRequest
     *        Contains the parameters for DeleteLoadBalancerListeners.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancerListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteLoadBalancerListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerListenersResult> deleteLoadBalancerListenersAsync(
            DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerListenersRequest, DeleteLoadBalancerListenersResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest
     *        Contains the parameters for DeleteLoadBalancerPolicy.
     * @return A Java Future containing the result of the DeleteLoadBalancerPolicy operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteLoadBalancerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest);

    /**
     * <p>
     * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
     * </p>
     * 
     * @param deleteLoadBalancerPolicyRequest
     *        Contains the parameters for DeleteLoadBalancerPolicy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancerPolicy operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteLoadBalancerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeleteLoadBalancerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerPolicyResult> deleteLoadBalancerPolicyAsync(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerPolicyRequest, DeleteLoadBalancerPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeregisterInstancesFromLoadBalancer operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DeregisterInstancesFromLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeregisterInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterInstancesFromLoadBalancer operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeregisterInstancesFromLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DeregisterInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstancesFromLoadBalancerRequest, DeregisterInstancesFromLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeInstanceHealth operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeInstanceHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest describeInstanceHealthRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceHealth operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeInstanceHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest describeInstanceHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceHealthRequest, DescribeInstanceHealthResult> asyncHandler);

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     *        Contains the parameters for DescribeLoadBalancerAttributes.
     * @return A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest);

    /**
     * <p>
     * Describes the attributes for the specified load balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     *        Contains the parameters for DescribeLoadBalancerAttributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeLoadBalancerPolicies operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancerPolicies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerPolicies operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancerPolicies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicies operation.
     *
     * @see #describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest)
     */
    java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync();

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicies operation with an AsyncHandler.
     *
     * @see #describeLoadBalancerPoliciesAsync(DescribeLoadBalancerPoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLoadBalancerPoliciesResult> describeLoadBalancerPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPoliciesRequest, DescribeLoadBalancerPoliciesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeLoadBalancerPolicyTypes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancerPolicyTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerPolicyTypes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancerPolicyTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancerPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            DescribeLoadBalancerPolicyTypesRequest describeLoadBalancerPolicyTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicyTypes operation.
     *
     * @see #describeLoadBalancerPolicyTypesAsync(DescribeLoadBalancerPolicyTypesRequest)
     */
    java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync();

    /**
     * Simplified method form for invoking the DescribeLoadBalancerPolicyTypes operation with an AsyncHandler.
     *
     * @see #describeLoadBalancerPolicyTypesAsync(DescribeLoadBalancerPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLoadBalancerPolicyTypesResult> describeLoadBalancerPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerPolicyTypesRequest, DescribeLoadBalancerPolicyTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your
     * load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your
     * load balancers.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLoadBalancers operation.
     *
     * @see #describeLoadBalancersAsync(DescribeLoadBalancersRequest)
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync();

    /**
     * Simplified method form for invoking the DescribeLoadBalancers operation with an AsyncHandler.
     *
     * @see #describeLoadBalancersAsync(DescribeLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the tags associated with the specified load balancers.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DescribeTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetachLoadBalancerFromSubnets operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DetachLoadBalancerFromSubnets
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DetachLoadBalancerFromSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachLoadBalancerFromSubnets operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DetachLoadBalancerFromSubnets
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DetachLoadBalancerFromSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachLoadBalancerFromSubnetsResult> detachLoadBalancerFromSubnetsAsync(
            DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancerFromSubnetsRequest, DetachLoadBalancerFromSubnetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisableAvailabilityZonesForLoadBalancer operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsync.DisableAvailabilityZonesForLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DisableAvailabilityZonesForLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableAvailabilityZonesForLoadBalancer operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DisableAvailabilityZonesForLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DisableAvailabilityZonesForLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DisableAvailabilityZonesForLoadBalancerRequest, DisableAvailabilityZonesForLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the EnableAvailabilityZonesForLoadBalancer operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsync.EnableAvailabilityZonesForLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/EnableAvailabilityZonesForLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableAvailabilityZonesForLoadBalancer operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.EnableAvailabilityZonesForLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/EnableAvailabilityZonesForLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(
            EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAvailabilityZonesForLoadBalancerRequest, EnableAvailabilityZonesForLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ModifyLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyLoadBalancerAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ModifyLoadBalancerAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterInstancesWithLoadBalancer operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.RegisterInstancesWithLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RegisterInstancesWithLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterInstancesWithLoadBalancer operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RegisterInstancesWithLoadBalancer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RegisterInstancesWithLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterInstancesWithLoadBalancerRequest, RegisterInstancesWithLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RemoveTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes one or more tags from the specified load balancer.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RemoveTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetLoadBalancerListenerSSLCertificate operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsync.SetLoadBalancerListenerSSLCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerListenerSSLCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetLoadBalancerListenerSSLCertificate operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetLoadBalancerListenerSSLCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerListenerSSLCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBalancerListenerSSLCertificateResult> setLoadBalancerListenerSSLCertificateAsync(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoadBalancerListenerSSLCertificateRequest, SetLoadBalancerListenerSSLCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetLoadBalancerPoliciesForBackendServer operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsync.SetLoadBalancerPoliciesForBackendServer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesForBackendServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetLoadBalancerPoliciesForBackendServer operation returned by
     *         the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetLoadBalancerPoliciesForBackendServer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesForBackendServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBalancerPoliciesForBackendServerResult> setLoadBalancerPoliciesForBackendServerAsync(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoadBalancerPoliciesForBackendServerRequest, SetLoadBalancerPoliciesForBackendServerResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetLoadBalancerPoliciesOfListener operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.SetLoadBalancerPoliciesOfListener
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesOfListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetLoadBalancerPoliciesOfListener operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetLoadBalancerPoliciesOfListener
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/SetLoadBalancerPoliciesOfListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBalancerPoliciesOfListenerResult> setLoadBalancerPoliciesOfListenerAsync(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoadBalancerPoliciesOfListenerRequest, SetLoadBalancerPoliciesOfListenerResult> asyncHandler);

}
