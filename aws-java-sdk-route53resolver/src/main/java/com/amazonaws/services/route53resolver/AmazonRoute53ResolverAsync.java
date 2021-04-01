/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver;

import javax.annotation.Generated;

import com.amazonaws.services.route53resolver.model.*;

/**
 * Interface for accessing Route53Resolver asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53resolver.AbstractAmazonRoute53ResolverAsync} instead.
 * </p>
 * <p>
 * <p>
 * When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver.
 * By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or ELB load
 * balancers. Resolver performs recursive lookups against public name servers for all other domain names.
 * </p>
 * <p>
 * You can also configure DNS resolution between your VPC and your network over a Direct Connect or VPN connection:
 * </p>
 * <p>
 * <b>Forward DNS queries from resolvers on your network to Route 53 Resolver</b>
 * </p>
 * <p>
 * DNS resolvers on your network can forward DNS queries to Resolver in a specified VPC. This allows your DNS resolvers
 * to easily resolve domain names for AWS resources such as EC2 instances or records in a Route 53 private hosted zone.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-network-to-vpc"
 * >How DNS Resolvers on Your Network Forward DNS Queries to Route 53 Resolver</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Conditionally forward queries from a VPC to resolvers on your network</b>
 * </p>
 * <p>
 * You can configure Resolver to forward queries that it receives from EC2 instances in your VPCs to DNS resolvers on
 * your network. To forward selected queries, you create Resolver rules that specify the domain names for the DNS
 * queries that you want to forward (such as example.com), and the IP addresses of the DNS resolvers on your network
 * that you want to forward the queries to. If a query matches multiple rules (example.com, acme.example.com), Resolver
 * chooses the rule with the most specific match (acme.example.com) and forwards the query to the IP addresses that you
 * specified in that rule. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-vpc-to-network"
 * >How Route 53 Resolver Forwards DNS Queries from Your VPCs to Your Network</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * <p>
 * Like Amazon VPC, Resolver is regional. In each region where you have VPCs, you can choose whether to forward queries
 * from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRoute53ResolverAsync extends AmazonRoute53Resolver {

    /**
     * <p>
     * Associates a <a>FirewallRuleGroup</a> with a VPC, to provide DNS filtering for the VPC.
     * </p>
     * 
     * @param associateFirewallRuleGroupRequest
     * @return A Java Future containing the result of the AssociateFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.AssociateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateFirewallRuleGroupResult> associateFirewallRuleGroupAsync(
            AssociateFirewallRuleGroupRequest associateFirewallRuleGroupRequest);

    /**
     * <p>
     * Associates a <a>FirewallRuleGroup</a> with a VPC, to provide DNS filtering for the VPC.
     * </p>
     * 
     * @param associateFirewallRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.AssociateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateFirewallRuleGroupResult> associateFirewallRuleGroupAsync(
            AssociateFirewallRuleGroupRequest associateFirewallRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateFirewallRuleGroupRequest, AssociateFirewallRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Adds IP addresses to an inbound or an outbound Resolver endpoint. If you want to add more than one IP address,
     * submit one <code>AssociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To remove an IP address from an endpoint, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverEndpointIpAddress.html"
     * >DisassociateResolverEndpointIpAddress</a>.
     * </p>
     * 
     * @param associateResolverEndpointIpAddressRequest
     * @return A Java Future containing the result of the AssociateResolverEndpointIpAddress operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.AssociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            AssociateResolverEndpointIpAddressRequest associateResolverEndpointIpAddressRequest);

    /**
     * <p>
     * Adds IP addresses to an inbound or an outbound Resolver endpoint. If you want to add more than one IP address,
     * submit one <code>AssociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To remove an IP address from an endpoint, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverEndpointIpAddress.html"
     * >DisassociateResolverEndpointIpAddress</a>.
     * </p>
     * 
     * @param associateResolverEndpointIpAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResolverEndpointIpAddress operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.AssociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResolverEndpointIpAddressResult> associateResolverEndpointIpAddressAsync(
            AssociateResolverEndpointIpAddressRequest associateResolverEndpointIpAddressRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResolverEndpointIpAddressRequest, AssociateResolverEndpointIpAddressResult> asyncHandler);

    /**
     * <p>
     * Associates an Amazon VPC with a specified query logging configuration. Route 53 Resolver logs DNS queries that
     * originate in all of the Amazon VPCs that are associated with a specified query logging configuration. To
     * associate more than one VPC with a configuration, submit one <code>AssociateResolverQueryLogConfig</code> request
     * for each VPC.
     * </p>
     * <note>
     * <p>
     * The VPCs that you associate with a query logging configuration must be in the same Region as the configuration.
     * </p>
     * </note>
     * <p>
     * To remove a VPC from a query logging configuration, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
     * >DisassociateResolverQueryLogConfig</a>.
     * </p>
     * 
     * @param associateResolverQueryLogConfigRequest
     * @return A Java Future containing the result of the AssociateResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.AssociateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResolverQueryLogConfigResult> associateResolverQueryLogConfigAsync(
            AssociateResolverQueryLogConfigRequest associateResolverQueryLogConfigRequest);

    /**
     * <p>
     * Associates an Amazon VPC with a specified query logging configuration. Route 53 Resolver logs DNS queries that
     * originate in all of the Amazon VPCs that are associated with a specified query logging configuration. To
     * associate more than one VPC with a configuration, submit one <code>AssociateResolverQueryLogConfig</code> request
     * for each VPC.
     * </p>
     * <note>
     * <p>
     * The VPCs that you associate with a query logging configuration must be in the same Region as the configuration.
     * </p>
     * </note>
     * <p>
     * To remove a VPC from a query logging configuration, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
     * >DisassociateResolverQueryLogConfig</a>.
     * </p>
     * 
     * @param associateResolverQueryLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.AssociateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResolverQueryLogConfigResult> associateResolverQueryLogConfigAsync(
            AssociateResolverQueryLogConfigRequest associateResolverQueryLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResult> asyncHandler);

    /**
     * <p>
     * Associates a Resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
     * for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
     * IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html"
     * >CreateResolverRule</a>.
     * </p>
     * 
     * @param associateResolverRuleRequest
     * @return A Java Future containing the result of the AssociateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.AssociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(AssociateResolverRuleRequest associateResolverRuleRequest);

    /**
     * <p>
     * Associates a Resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
     * for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
     * IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html"
     * >CreateResolverRule</a>.
     * </p>
     * 
     * @param associateResolverRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.AssociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResolverRuleResult> associateResolverRuleAsync(AssociateResolverRuleRequest associateResolverRuleRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResolverRuleRequest, AssociateResolverRuleResult> asyncHandler);

    /**
     * <p>
     * Creates an empty firewall domain list for use in DNS Firewall rules. You can populate the domains for the new
     * list with a file, using <a>ImportFirewallDomains</a>, or with domain strings, using <a>UpdateFirewallDomains</a>.
     * </p>
     * 
     * @param createFirewallDomainListRequest
     * @return A Java Future containing the result of the CreateFirewallDomainList operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.CreateFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFirewallDomainListResult> createFirewallDomainListAsync(CreateFirewallDomainListRequest createFirewallDomainListRequest);

    /**
     * <p>
     * Creates an empty firewall domain list for use in DNS Firewall rules. You can populate the domains for the new
     * list with a file, using <a>ImportFirewallDomains</a>, or with domain strings, using <a>UpdateFirewallDomains</a>.
     * </p>
     * 
     * @param createFirewallDomainListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFirewallDomainList operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.CreateFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFirewallDomainListResult> createFirewallDomainListAsync(CreateFirewallDomainListRequest createFirewallDomainListRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFirewallDomainListRequest, CreateFirewallDomainListResult> asyncHandler);

    /**
     * <p>
     * Creates a single DNS Firewall rule in the specified rule group, using the specified domain list.
     * </p>
     * 
     * @param createFirewallRuleRequest
     * @return A Java Future containing the result of the CreateFirewallRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.CreateFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFirewallRuleResult> createFirewallRuleAsync(CreateFirewallRuleRequest createFirewallRuleRequest);

    /**
     * <p>
     * Creates a single DNS Firewall rule in the specified rule group, using the specified domain list.
     * </p>
     * 
     * @param createFirewallRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFirewallRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.CreateFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFirewallRuleResult> createFirewallRuleAsync(CreateFirewallRuleRequest createFirewallRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFirewallRuleRequest, CreateFirewallRuleResult> asyncHandler);

    /**
     * <p>
     * Creates an empty DNS Firewall rule group for filtering DNS network traffic in a VPC. You can add rules to the new
     * rule group by calling <a>CreateFirewallRule</a>.
     * </p>
     * 
     * @param createFirewallRuleGroupRequest
     * @return A Java Future containing the result of the CreateFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.CreateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFirewallRuleGroupResult> createFirewallRuleGroupAsync(CreateFirewallRuleGroupRequest createFirewallRuleGroupRequest);

    /**
     * <p>
     * Creates an empty DNS Firewall rule group for filtering DNS network traffic in a VPC. You can add rules to the new
     * rule group by calling <a>CreateFirewallRule</a>.
     * </p>
     * 
     * @param createFirewallRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.CreateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFirewallRuleGroupResult> createFirewallRuleGroupAsync(CreateFirewallRuleGroupRequest createFirewallRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFirewallRuleGroupRequest, CreateFirewallRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <i>inbound Resolver endpoint</i> forwards DNS queries to the DNS service for a VPC from your network.
     * </p>
     * </li>
     * <li>
     * <p>
     * An <i>outbound Resolver endpoint</i> forwards DNS queries from the DNS service for a VPC to your network.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createResolverEndpointRequest
     * @return A Java Future containing the result of the CreateResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.CreateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(CreateResolverEndpointRequest createResolverEndpointRequest);

    /**
     * <p>
     * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <i>inbound Resolver endpoint</i> forwards DNS queries to the DNS service for a VPC from your network.
     * </p>
     * </li>
     * <li>
     * <p>
     * An <i>outbound Resolver endpoint</i> forwards DNS queries from the DNS service for a VPC to your network.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createResolverEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.CreateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverEndpointResult> createResolverEndpointAsync(CreateResolverEndpointRequest createResolverEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResolverEndpointRequest, CreateResolverEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a Resolver query logging configuration, which defines where you want Resolver to save DNS query logs that
     * originate in your VPCs. Resolver can log queries only for VPCs that are in the same Region as the query logging
     * configuration.
     * </p>
     * <p>
     * To specify which VPCs you want to log queries for, you use <code>AssociateResolverQueryLogConfig</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverQueryLogConfig.html"
     * >AssociateResolverQueryLogConfig</a>.
     * </p>
     * <p>
     * You can optionally use AWS Resource Access Manager (AWS RAM) to share a query logging configuration with other
     * AWS accounts. The other accounts can then associate VPCs with the configuration. The query logs that Resolver
     * creates for a configuration include all DNS queries that originate in all VPCs that are associated with the
     * configuration.
     * </p>
     * 
     * @param createResolverQueryLogConfigRequest
     * @return A Java Future containing the result of the CreateResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.CreateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverQueryLogConfigResult> createResolverQueryLogConfigAsync(
            CreateResolverQueryLogConfigRequest createResolverQueryLogConfigRequest);

    /**
     * <p>
     * Creates a Resolver query logging configuration, which defines where you want Resolver to save DNS query logs that
     * originate in your VPCs. Resolver can log queries only for VPCs that are in the same Region as the query logging
     * configuration.
     * </p>
     * <p>
     * To specify which VPCs you want to log queries for, you use <code>AssociateResolverQueryLogConfig</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverQueryLogConfig.html"
     * >AssociateResolverQueryLogConfig</a>.
     * </p>
     * <p>
     * You can optionally use AWS Resource Access Manager (AWS RAM) to share a query logging configuration with other
     * AWS accounts. The other accounts can then associate VPCs with the configuration. The query logs that Resolver
     * creates for a configuration include all DNS queries that originate in all VPCs that are associated with the
     * configuration.
     * </p>
     * 
     * @param createResolverQueryLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.CreateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverQueryLogConfigResult> createResolverQueryLogConfigAsync(
            CreateResolverQueryLogConfigRequest createResolverQueryLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResult> asyncHandler);

    /**
     * <p>
     * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass through, one
     * domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     * </p>
     * 
     * @param createResolverRuleRequest
     * @return A Java Future containing the result of the CreateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.CreateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(CreateResolverRuleRequest createResolverRuleRequest);

    /**
     * <p>
     * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass through, one
     * domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     * </p>
     * 
     * @param createResolverRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.CreateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResolverRuleResult> createResolverRuleAsync(CreateResolverRuleRequest createResolverRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResolverRuleRequest, CreateResolverRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified domain list.
     * </p>
     * 
     * @param deleteFirewallDomainListRequest
     * @return A Java Future containing the result of the DeleteFirewallDomainList operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.DeleteFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallDomainListResult> deleteFirewallDomainListAsync(DeleteFirewallDomainListRequest deleteFirewallDomainListRequest);

    /**
     * <p>
     * Deletes the specified domain list.
     * </p>
     * 
     * @param deleteFirewallDomainListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFirewallDomainList operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DeleteFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallDomainListResult> deleteFirewallDomainListAsync(DeleteFirewallDomainListRequest deleteFirewallDomainListRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFirewallDomainListRequest, DeleteFirewallDomainListResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified firewall rule.
     * </p>
     * 
     * @param deleteFirewallRuleRequest
     * @return A Java Future containing the result of the DeleteFirewallRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.DeleteFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallRuleResult> deleteFirewallRuleAsync(DeleteFirewallRuleRequest deleteFirewallRuleRequest);

    /**
     * <p>
     * Deletes the specified firewall rule.
     * </p>
     * 
     * @param deleteFirewallRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFirewallRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DeleteFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallRuleResult> deleteFirewallRuleAsync(DeleteFirewallRuleRequest deleteFirewallRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFirewallRuleRequest, DeleteFirewallRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified firewall rule group.
     * </p>
     * 
     * @param deleteFirewallRuleGroupRequest
     * @return A Java Future containing the result of the DeleteFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.DeleteFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallRuleGroupResult> deleteFirewallRuleGroupAsync(DeleteFirewallRuleGroupRequest deleteFirewallRuleGroupRequest);

    /**
     * <p>
     * Deletes the specified firewall rule group.
     * </p>
     * 
     * @param deleteFirewallRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DeleteFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallRuleGroupResult> deleteFirewallRuleGroupAsync(DeleteFirewallRuleGroupRequest deleteFirewallRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFirewallRuleGroupRequest, DeleteFirewallRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a Resolver endpoint. The effect of deleting a Resolver endpoint depends on whether it's an inbound or an
     * outbound Resolver endpoint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Inbound</b>: DNS queries from your network are no longer routed to the DNS service for the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Outbound</b>: DNS queries from a VPC are no longer routed to your network.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteResolverEndpointRequest
     * @return A Java Future containing the result of the DeleteResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.DeleteResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(DeleteResolverEndpointRequest deleteResolverEndpointRequest);

    /**
     * <p>
     * Deletes a Resolver endpoint. The effect of deleting a Resolver endpoint depends on whether it's an inbound or an
     * outbound Resolver endpoint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Inbound</b>: DNS queries from your network are no longer routed to the DNS service for the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Outbound</b>: DNS queries from a VPC are no longer routed to your network.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteResolverEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DeleteResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverEndpointResult> deleteResolverEndpointAsync(DeleteResolverEndpointRequest deleteResolverEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResolverEndpointRequest, DeleteResolverEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a query logging configuration. When you delete a configuration, Resolver stops logging DNS queries for
     * all of the Amazon VPCs that are associated with the configuration. This also applies if the query logging
     * configuration is shared with other AWS accounts, and the other accounts have associated VPCs with the shared
     * configuration.
     * </p>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
     * >DisassociateResolverQueryLogConfig</a>.
     * </p>
     * <p>
     * If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, you must
     * stop sharing the configuration before you can delete a configuration. The accounts that you shared the
     * configuration with can first disassociate VPCs that they associated with the configuration, but that's not
     * necessary. If you stop sharing the configuration, those VPCs are automatically disassociated from the
     * configuration.
     * </p>
     * 
     * @param deleteResolverQueryLogConfigRequest
     * @return A Java Future containing the result of the DeleteResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.DeleteResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverQueryLogConfigResult> deleteResolverQueryLogConfigAsync(
            DeleteResolverQueryLogConfigRequest deleteResolverQueryLogConfigRequest);

    /**
     * <p>
     * Deletes a query logging configuration. When you delete a configuration, Resolver stops logging DNS queries for
     * all of the Amazon VPCs that are associated with the configuration. This also applies if the query logging
     * configuration is shared with other AWS accounts, and the other accounts have associated VPCs with the shared
     * configuration.
     * </p>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
     * >DisassociateResolverQueryLogConfig</a>.
     * </p>
     * <p>
     * If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, you must
     * stop sharing the configuration before you can delete a configuration. The accounts that you shared the
     * configuration with can first disassociate VPCs that they associated with the configuration, but that's not
     * necessary. If you stop sharing the configuration, those VPCs are automatically disassociated from the
     * configuration.
     * </p>
     * 
     * @param deleteResolverQueryLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.DeleteResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverQueryLogConfigResult> deleteResolverQueryLogConfigAsync(
            DeleteResolverQueryLogConfigRequest deleteResolverQueryLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a Resolver rule. Before you can delete a Resolver rule, you must disassociate it from all the VPCs that
     * you associated the Resolver rule with. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html"
     * >DisassociateResolverRule</a>.
     * </p>
     * 
     * @param deleteResolverRuleRequest
     * @return A Java Future containing the result of the DeleteResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.DeleteResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(DeleteResolverRuleRequest deleteResolverRuleRequest);

    /**
     * <p>
     * Deletes a Resolver rule. Before you can delete a Resolver rule, you must disassociate it from all the VPCs that
     * you associated the Resolver rule with. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html"
     * >DisassociateResolverRule</a>.
     * </p>
     * 
     * @param deleteResolverRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DeleteResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResolverRuleResult> deleteResolverRuleAsync(DeleteResolverRuleRequest deleteResolverRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResolverRuleRequest, DeleteResolverRuleResult> asyncHandler);

    /**
     * <p>
     * Disassociates a <a>FirewallRuleGroup</a> from a VPC, to remove DNS filtering from the VPC.
     * </p>
     * 
     * @param disassociateFirewallRuleGroupRequest
     * @return A Java Future containing the result of the DisassociateFirewallRuleGroup operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.DisassociateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFirewallRuleGroupResult> disassociateFirewallRuleGroupAsync(
            DisassociateFirewallRuleGroupRequest disassociateFirewallRuleGroupRequest);

    /**
     * <p>
     * Disassociates a <a>FirewallRuleGroup</a> from a VPC, to remove DNS filtering from the VPC.
     * </p>
     * 
     * @param disassociateFirewallRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFirewallRuleGroup operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.DisassociateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFirewallRuleGroupResult> disassociateFirewallRuleGroupAsync(
            DisassociateFirewallRuleGroupRequest disassociateFirewallRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFirewallRuleGroupRequest, DisassociateFirewallRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Removes IP addresses from an inbound or an outbound Resolver endpoint. If you want to remove more than one IP
     * address, submit one <code>DisassociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To add an IP address to an endpoint, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverEndpointIpAddress.html"
     * >AssociateResolverEndpointIpAddress</a>.
     * </p>
     * 
     * @param disassociateResolverEndpointIpAddressRequest
     * @return A Java Future containing the result of the DisassociateResolverEndpointIpAddress operation returned by
     *         the service.
     * @sample AmazonRoute53ResolverAsync.DisassociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            DisassociateResolverEndpointIpAddressRequest disassociateResolverEndpointIpAddressRequest);

    /**
     * <p>
     * Removes IP addresses from an inbound or an outbound Resolver endpoint. If you want to remove more than one IP
     * address, submit one <code>DisassociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To add an IP address to an endpoint, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverEndpointIpAddress.html"
     * >AssociateResolverEndpointIpAddress</a>.
     * </p>
     * 
     * @param disassociateResolverEndpointIpAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResolverEndpointIpAddress operation returned by
     *         the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DisassociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResolverEndpointIpAddressResult> disassociateResolverEndpointIpAddressAsync(
            DisassociateResolverEndpointIpAddressRequest disassociateResolverEndpointIpAddressRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResolverEndpointIpAddressRequest, DisassociateResolverEndpointIpAddressResult> asyncHandler);

    /**
     * <p>
     * Disassociates a VPC from a query logging configuration.
     * </p>
     * <note>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, VPCs can be
     * disassociated from the configuration in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that you shared the configuration with can disassociate VPCs from the configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can stop sharing the configuration.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param disassociateResolverQueryLogConfigRequest
     * @return A Java Future containing the result of the DisassociateResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.DisassociateResolverQueryLogConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResolverQueryLogConfigResult> disassociateResolverQueryLogConfigAsync(
            DisassociateResolverQueryLogConfigRequest disassociateResolverQueryLogConfigRequest);

    /**
     * <p>
     * Disassociates a VPC from a query logging configuration.
     * </p>
     * <note>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, VPCs can be
     * disassociated from the configuration in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that you shared the configuration with can disassociate VPCs from the configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can stop sharing the configuration.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param disassociateResolverQueryLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResolverQueryLogConfig operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.DisassociateResolverQueryLogConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResolverQueryLogConfigResult> disassociateResolverQueryLogConfigAsync(
            DisassociateResolverQueryLogConfigRequest disassociateResolverQueryLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResult> asyncHandler);

    /**
     * <p>
     * Removes the association between a specified Resolver rule and a specified VPC.
     * </p>
     * <important>
     * <p>
     * If you disassociate a Resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
     * you specified in the Resolver rule.
     * </p>
     * </important>
     * 
     * @param disassociateResolverRuleRequest
     * @return A Java Future containing the result of the DisassociateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.DisassociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(DisassociateResolverRuleRequest disassociateResolverRuleRequest);

    /**
     * <p>
     * Removes the association between a specified Resolver rule and a specified VPC.
     * </p>
     * <important>
     * <p>
     * If you disassociate a Resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
     * you specified in the Resolver rule.
     * </p>
     * </important>
     * 
     * @param disassociateResolverRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.DisassociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResolverRuleResult> disassociateResolverRuleAsync(DisassociateResolverRuleRequest disassociateResolverRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResolverRuleRequest, DisassociateResolverRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration of the firewall behavior provided by DNS Firewall for a single Amazon virtual private
     * cloud (VPC).
     * </p>
     * 
     * @param getFirewallConfigRequest
     * @return A Java Future containing the result of the GetFirewallConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetFirewallConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallConfigResult> getFirewallConfigAsync(GetFirewallConfigRequest getFirewallConfigRequest);

    /**
     * <p>
     * Retrieves the configuration of the firewall behavior provided by DNS Firewall for a single Amazon virtual private
     * cloud (VPC).
     * </p>
     * 
     * @param getFirewallConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFirewallConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetFirewallConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallConfigResult> getFirewallConfigAsync(GetFirewallConfigRequest getFirewallConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetFirewallConfigRequest, GetFirewallConfigResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified firewall domain list.
     * </p>
     * 
     * @param getFirewallDomainListRequest
     * @return A Java Future containing the result of the GetFirewallDomainList operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallDomainListResult> getFirewallDomainListAsync(GetFirewallDomainListRequest getFirewallDomainListRequest);

    /**
     * <p>
     * Retrieves the specified firewall domain list.
     * </p>
     * 
     * @param getFirewallDomainListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFirewallDomainList operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallDomainListResult> getFirewallDomainListAsync(GetFirewallDomainListRequest getFirewallDomainListRequest,
            com.amazonaws.handlers.AsyncHandler<GetFirewallDomainListRequest, GetFirewallDomainListResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified firewall rule group.
     * </p>
     * 
     * @param getFirewallRuleGroupRequest
     * @return A Java Future containing the result of the GetFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallRuleGroupResult> getFirewallRuleGroupAsync(GetFirewallRuleGroupRequest getFirewallRuleGroupRequest);

    /**
     * <p>
     * Retrieves the specified firewall rule group.
     * </p>
     * 
     * @param getFirewallRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFirewallRuleGroup operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallRuleGroupResult> getFirewallRuleGroupAsync(GetFirewallRuleGroupRequest getFirewallRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetFirewallRuleGroupRequest, GetFirewallRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves a firewall rule group association, which enables DNS filtering for a VPC with one rule group. A VPC can
     * have more than one firewall rule group association, and a rule group can be associated with more than one VPC.
     * </p>
     * 
     * @param getFirewallRuleGroupAssociationRequest
     * @return A Java Future containing the result of the GetFirewallRuleGroupAssociation operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.GetFirewallRuleGroupAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallRuleGroupAssociationResult> getFirewallRuleGroupAssociationAsync(
            GetFirewallRuleGroupAssociationRequest getFirewallRuleGroupAssociationRequest);

    /**
     * <p>
     * Retrieves a firewall rule group association, which enables DNS filtering for a VPC with one rule group. A VPC can
     * have more than one firewall rule group association, and a rule group can be associated with more than one VPC.
     * </p>
     * 
     * @param getFirewallRuleGroupAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFirewallRuleGroupAssociation operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetFirewallRuleGroupAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallRuleGroupAssociationResult> getFirewallRuleGroupAssociationAsync(
            GetFirewallRuleGroupAssociationRequest getFirewallRuleGroupAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetFirewallRuleGroupAssociationRequest, GetFirewallRuleGroupAssociationResult> asyncHandler);

    /**
     * <p>
     * Returns the AWS Identity and Access Management (AWS IAM) policy for sharing the specified rule group. You can use
     * the policy to share the rule group using AWS Resource Access Manager (RAM).
     * </p>
     * 
     * @param getFirewallRuleGroupPolicyRequest
     * @return A Java Future containing the result of the GetFirewallRuleGroupPolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetFirewallRuleGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallRuleGroupPolicyResult> getFirewallRuleGroupPolicyAsync(
            GetFirewallRuleGroupPolicyRequest getFirewallRuleGroupPolicyRequest);

    /**
     * <p>
     * Returns the AWS Identity and Access Management (AWS IAM) policy for sharing the specified rule group. You can use
     * the policy to share the rule group using AWS Resource Access Manager (RAM).
     * </p>
     * 
     * @param getFirewallRuleGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFirewallRuleGroupPolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetFirewallRuleGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFirewallRuleGroupPolicyResult> getFirewallRuleGroupPolicyAsync(
            GetFirewallRuleGroupPolicyRequest getFirewallRuleGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetFirewallRuleGroupPolicyRequest, GetFirewallRuleGroupPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets DNSSEC validation information for a specified resource.
     * </p>
     * 
     * @param getResolverDnssecConfigRequest
     * @return A Java Future containing the result of the GetResolverDnssecConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetResolverDnssecConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverDnssecConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverDnssecConfigResult> getResolverDnssecConfigAsync(GetResolverDnssecConfigRequest getResolverDnssecConfigRequest);

    /**
     * <p>
     * Gets DNSSEC validation information for a specified resource.
     * </p>
     * 
     * @param getResolverDnssecConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverDnssecConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverDnssecConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverDnssecConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverDnssecConfigResult> getResolverDnssecConfigAsync(GetResolverDnssecConfigRequest getResolverDnssecConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverDnssecConfigRequest, GetResolverDnssecConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified Resolver endpoint, such as whether it's an inbound or an outbound Resolver
     * endpoint, and the current status of the endpoint.
     * </p>
     * 
     * @param getResolverEndpointRequest
     * @return A Java Future containing the result of the GetResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(GetResolverEndpointRequest getResolverEndpointRequest);

    /**
     * <p>
     * Gets information about a specified Resolver endpoint, such as whether it's an inbound or an outbound Resolver
     * endpoint, and the current status of the endpoint.
     * </p>
     * 
     * @param getResolverEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverEndpointResult> getResolverEndpointAsync(GetResolverEndpointRequest getResolverEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverEndpointRequest, GetResolverEndpointResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified Resolver query logging configuration, such as the number of VPCs that the
     * configuration is logging queries for and the location that logs are sent to.
     * </p>
     * 
     * @param getResolverQueryLogConfigRequest
     * @return A Java Future containing the result of the GetResolverQueryLogConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverQueryLogConfigResult> getResolverQueryLogConfigAsync(
            GetResolverQueryLogConfigRequest getResolverQueryLogConfigRequest);

    /**
     * <p>
     * Gets information about a specified Resolver query logging configuration, such as the number of VPCs that the
     * configuration is logging queries for and the location that logs are sent to.
     * </p>
     * 
     * @param getResolverQueryLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverQueryLogConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverQueryLogConfigResult> getResolverQueryLogConfigAsync(
            GetResolverQueryLogConfigRequest getResolverQueryLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverQueryLogConfigRequest, GetResolverQueryLogConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified association between a Resolver query logging configuration and an Amazon VPC.
     * When you associate a VPC with a query logging configuration, Resolver logs DNS queries that originate in that
     * VPC.
     * </p>
     * 
     * @param getResolverQueryLogConfigAssociationRequest
     * @return A Java Future containing the result of the GetResolverQueryLogConfigAssociation operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.GetResolverQueryLogConfigAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverQueryLogConfigAssociationResult> getResolverQueryLogConfigAssociationAsync(
            GetResolverQueryLogConfigAssociationRequest getResolverQueryLogConfigAssociationRequest);

    /**
     * <p>
     * Gets information about a specified association between a Resolver query logging configuration and an Amazon VPC.
     * When you associate a VPC with a query logging configuration, Resolver logs DNS queries that originate in that
     * VPC.
     * </p>
     * 
     * @param getResolverQueryLogConfigAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverQueryLogConfigAssociation operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverQueryLogConfigAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverQueryLogConfigAssociationResult> getResolverQueryLogConfigAssociationAsync(
            GetResolverQueryLogConfigAssociationRequest getResolverQueryLogConfigAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverQueryLogConfigAssociationRequest, GetResolverQueryLogConfigAssociationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a query logging policy. A query logging policy specifies the Resolver query logging
     * operations and resources that you want to allow another AWS account to be able to use.
     * </p>
     * 
     * @param getResolverQueryLogConfigPolicyRequest
     * @return A Java Future containing the result of the GetResolverQueryLogConfigPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.GetResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverQueryLogConfigPolicyResult> getResolverQueryLogConfigPolicyAsync(
            GetResolverQueryLogConfigPolicyRequest getResolverQueryLogConfigPolicyRequest);

    /**
     * <p>
     * Gets information about a query logging policy. A query logging policy specifies the Resolver query logging
     * operations and resources that you want to allow another AWS account to be able to use.
     * </p>
     * 
     * @param getResolverQueryLogConfigPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverQueryLogConfigPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverQueryLogConfigPolicyResult> getResolverQueryLogConfigPolicyAsync(
            GetResolverQueryLogConfigPolicyRequest getResolverQueryLogConfigPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverQueryLogConfigPolicyRequest, GetResolverQueryLogConfigPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified Resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound Resolver endpoint that the rule is associated with.
     * </p>
     * 
     * @param getResolverRuleRequest
     * @return A Java Future containing the result of the GetResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(GetResolverRuleRequest getResolverRuleRequest);

    /**
     * <p>
     * Gets information about a specified Resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound Resolver endpoint that the rule is associated with.
     * </p>
     * 
     * @param getResolverRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverRuleResult> getResolverRuleAsync(GetResolverRuleRequest getResolverRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverRuleRequest, GetResolverRuleResult> asyncHandler);

    /**
     * <p>
     * Gets information about an association between a specified Resolver rule and a VPC. You associate a Resolver rule
     * and a VPC using <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html"
     * >AssociateResolverRule</a>.
     * </p>
     * 
     * @param getResolverRuleAssociationRequest
     * @return A Java Future containing the result of the GetResolverRuleAssociation operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetResolverRuleAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRuleAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(
            GetResolverRuleAssociationRequest getResolverRuleAssociationRequest);

    /**
     * <p>
     * Gets information about an association between a specified Resolver rule and a VPC. You associate a Resolver rule
     * and a VPC using <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html"
     * >AssociateResolverRule</a>.
     * </p>
     * 
     * @param getResolverRuleAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverRuleAssociation operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverRuleAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRuleAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverRuleAssociationResult> getResolverRuleAssociationAsync(
            GetResolverRuleAssociationRequest getResolverRuleAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverRuleAssociationRequest, GetResolverRuleAssociationResult> asyncHandler);

    /**
     * <p>
     * Gets information about the Resolver rule policy for a specified rule. A Resolver rule policy includes the rule
     * that you want to share with another account, the account that you want to share the rule with, and the Resolver
     * operations that you want to allow the account to use.
     * </p>
     * 
     * @param getResolverRulePolicyRequest
     * @return A Java Future containing the result of the GetResolverRulePolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.GetResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(GetResolverRulePolicyRequest getResolverRulePolicyRequest);

    /**
     * <p>
     * Gets information about the Resolver rule policy for a specified rule. A Resolver rule policy includes the rule
     * that you want to share with another account, the account that you want to share the rule with, and the Resolver
     * operations that you want to allow the account to use.
     * </p>
     * 
     * @param getResolverRulePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResolverRulePolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.GetResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResolverRulePolicyResult> getResolverRulePolicyAsync(GetResolverRulePolicyRequest getResolverRulePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResolverRulePolicyRequest, GetResolverRulePolicyResult> asyncHandler);

    /**
     * <p>
     * Imports domain names from a file into a domain list, for use in a DNS firewall rule group.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importFirewallDomainsRequest
     * @return A Java Future containing the result of the ImportFirewallDomains operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ImportFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ImportFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportFirewallDomainsResult> importFirewallDomainsAsync(ImportFirewallDomainsRequest importFirewallDomainsRequest);

    /**
     * <p>
     * Imports domain names from a file into a domain list, for use in a DNS firewall rule group.
     * </p>
     * <p>
     * Each domain specification in your domain list must satisfy the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can optionally start with <code>*</code> (asterisk).
     * </p>
     * </li>
     * <li>
     * <p>
     * With the exception of the optional starting asterisk, it must only contain the following characters:
     * <code>A-Z</code>, <code>a-z</code>, <code>0-9</code>, <code>-</code> (hyphen).
     * </p>
     * </li>
     * <li>
     * <p>
     * It must be from 1-255 characters in length.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importFirewallDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportFirewallDomains operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ImportFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ImportFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportFirewallDomainsResult> importFirewallDomainsAsync(ImportFirewallDomainsRequest importFirewallDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ImportFirewallDomainsRequest, ImportFirewallDomainsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the firewall configurations that you have defined. DNS Firewall uses the configurations to manage
     * firewall behavior for your VPCs.
     * </p>
     * <p>
     * A single call might return only a partial list of the configurations. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallConfigsRequest
     * @return A Java Future containing the result of the ListFirewallConfigs operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListFirewallConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallConfigsResult> listFirewallConfigsAsync(ListFirewallConfigsRequest listFirewallConfigsRequest);

    /**
     * <p>
     * Retrieves the firewall configurations that you have defined. DNS Firewall uses the configurations to manage
     * firewall behavior for your VPCs.
     * </p>
     * <p>
     * A single call might return only a partial list of the configurations. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFirewallConfigs operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListFirewallConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallConfigsResult> listFirewallConfigsAsync(ListFirewallConfigsRequest listFirewallConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFirewallConfigsRequest, ListFirewallConfigsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the firewall domain lists that you have defined. For each firewall domain list, you can retrieve the
     * domains that are defined for a list by calling <a>ListFirewallDomains</a>.
     * </p>
     * <p>
     * A single call to this list operation might return only a partial list of the domain lists. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallDomainListsRequest
     * @return A Java Future containing the result of the ListFirewallDomainLists operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListFirewallDomainLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomainLists"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallDomainListsResult> listFirewallDomainListsAsync(ListFirewallDomainListsRequest listFirewallDomainListsRequest);

    /**
     * <p>
     * Retrieves the firewall domain lists that you have defined. For each firewall domain list, you can retrieve the
     * domains that are defined for a list by calling <a>ListFirewallDomains</a>.
     * </p>
     * <p>
     * A single call to this list operation might return only a partial list of the domain lists. For information, see
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallDomainListsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFirewallDomainLists operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListFirewallDomainLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomainLists"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallDomainListsResult> listFirewallDomainListsAsync(ListFirewallDomainListsRequest listFirewallDomainListsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFirewallDomainListsRequest, ListFirewallDomainListsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the domains that you have defined for the specified firewall domain list.
     * </p>
     * <p>
     * A single call might return only a partial list of the domains. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallDomainsRequest
     * @return A Java Future containing the result of the ListFirewallDomains operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallDomainsResult> listFirewallDomainsAsync(ListFirewallDomainsRequest listFirewallDomainsRequest);

    /**
     * <p>
     * Retrieves the domains that you have defined for the specified firewall domain list.
     * </p>
     * <p>
     * A single call might return only a partial list of the domains. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFirewallDomains operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallDomainsResult> listFirewallDomainsAsync(ListFirewallDomainsRequest listFirewallDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFirewallDomainsRequest, ListFirewallDomainsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the firewall rule group associations that you have defined. Each association enables DNS filtering for
     * a VPC with one rule group.
     * </p>
     * <p>
     * A single call might return only a partial list of the associations. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRuleGroupAssociationsRequest
     * @return A Java Future containing the result of the ListFirewallRuleGroupAssociations operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.ListFirewallRuleGroupAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroupAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallRuleGroupAssociationsResult> listFirewallRuleGroupAssociationsAsync(
            ListFirewallRuleGroupAssociationsRequest listFirewallRuleGroupAssociationsRequest);

    /**
     * <p>
     * Retrieves the firewall rule group associations that you have defined. Each association enables DNS filtering for
     * a VPC with one rule group.
     * </p>
     * <p>
     * A single call might return only a partial list of the associations. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRuleGroupAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFirewallRuleGroupAssociations operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListFirewallRuleGroupAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroupAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallRuleGroupAssociationsResult> listFirewallRuleGroupAssociationsAsync(
            ListFirewallRuleGroupAssociationsRequest listFirewallRuleGroupAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFirewallRuleGroupAssociationsRequest, ListFirewallRuleGroupAssociationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the minimal high-level information for the rule groups that you have defined.
     * </p>
     * <p>
     * A single call might return only a partial list of the rule groups. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRuleGroupsRequest
     * @return A Java Future containing the result of the ListFirewallRuleGroups operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListFirewallRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallRuleGroupsResult> listFirewallRuleGroupsAsync(ListFirewallRuleGroupsRequest listFirewallRuleGroupsRequest);

    /**
     * <p>
     * Retrieves the minimal high-level information for the rule groups that you have defined.
     * </p>
     * <p>
     * A single call might return only a partial list of the rule groups. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFirewallRuleGroups operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListFirewallRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallRuleGroupsResult> listFirewallRuleGroupsAsync(ListFirewallRuleGroupsRequest listFirewallRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFirewallRuleGroupsRequest, ListFirewallRuleGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the firewall rules that you have defined for the specified firewall rule group. DNS Firewall uses the
     * rules in a rule group to filter DNS network traffic for a VPC.
     * </p>
     * <p>
     * A single call might return only a partial list of the rules. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRulesRequest
     * @return A Java Future containing the result of the ListFirewallRules operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListFirewallRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallRulesResult> listFirewallRulesAsync(ListFirewallRulesRequest listFirewallRulesRequest);

    /**
     * <p>
     * Retrieves the firewall rules that you have defined for the specified firewall rule group. DNS Firewall uses the
     * rules in a rule group to filter DNS network traffic for a VPC.
     * </p>
     * <p>
     * A single call might return only a partial list of the rules. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFirewallRules operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListFirewallRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFirewallRulesResult> listFirewallRulesAsync(ListFirewallRulesRequest listFirewallRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFirewallRulesRequest, ListFirewallRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the configurations for DNSSEC validation that are associated with the current AWS account.
     * </p>
     * 
     * @param listResolverDnssecConfigsRequest
     * @return A Java Future containing the result of the ListResolverDnssecConfigs operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListResolverDnssecConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverDnssecConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverDnssecConfigsResult> listResolverDnssecConfigsAsync(
            ListResolverDnssecConfigsRequest listResolverDnssecConfigsRequest);

    /**
     * <p>
     * Lists the configurations for DNSSEC validation that are associated with the current AWS account.
     * </p>
     * 
     * @param listResolverDnssecConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverDnssecConfigs operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverDnssecConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverDnssecConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverDnssecConfigsResult> listResolverDnssecConfigsAsync(
            ListResolverDnssecConfigsRequest listResolverDnssecConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverDnssecConfigsRequest, ListResolverDnssecConfigsResult> asyncHandler);

    /**
     * <p>
     * Gets the IP addresses for a specified Resolver endpoint.
     * </p>
     * 
     * @param listResolverEndpointIpAddressesRequest
     * @return A Java Future containing the result of the ListResolverEndpointIpAddresses operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.ListResolverEndpointIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpointIpAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            ListResolverEndpointIpAddressesRequest listResolverEndpointIpAddressesRequest);

    /**
     * <p>
     * Gets the IP addresses for a specified Resolver endpoint.
     * </p>
     * 
     * @param listResolverEndpointIpAddressesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverEndpointIpAddresses operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverEndpointIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpointIpAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverEndpointIpAddressesResult> listResolverEndpointIpAddressesAsync(
            ListResolverEndpointIpAddressesRequest listResolverEndpointIpAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverEndpointIpAddressesRequest, ListResolverEndpointIpAddressesResult> asyncHandler);

    /**
     * <p>
     * Lists all the Resolver endpoints that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverEndpointsRequest
     * @return A Java Future containing the result of the ListResolverEndpoints operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListResolverEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(ListResolverEndpointsRequest listResolverEndpointsRequest);

    /**
     * <p>
     * Lists all the Resolver endpoints that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverEndpoints operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverEndpointsResult> listResolverEndpointsAsync(ListResolverEndpointsRequest listResolverEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverEndpointsRequest, ListResolverEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists information about associations between Amazon VPCs and query logging configurations.
     * </p>
     * 
     * @param listResolverQueryLogConfigAssociationsRequest
     * @return A Java Future containing the result of the ListResolverQueryLogConfigAssociations operation returned by
     *         the service.
     * @sample AmazonRoute53ResolverAsync.ListResolverQueryLogConfigAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverQueryLogConfigAssociationsResult> listResolverQueryLogConfigAssociationsAsync(
            ListResolverQueryLogConfigAssociationsRequest listResolverQueryLogConfigAssociationsRequest);

    /**
     * <p>
     * Lists information about associations between Amazon VPCs and query logging configurations.
     * </p>
     * 
     * @param listResolverQueryLogConfigAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverQueryLogConfigAssociations operation returned by
     *         the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverQueryLogConfigAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverQueryLogConfigAssociationsResult> listResolverQueryLogConfigAssociationsAsync(
            ListResolverQueryLogConfigAssociationsRequest listResolverQueryLogConfigAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverQueryLogConfigAssociationsRequest, ListResolverQueryLogConfigAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists information about the specified query logging configurations. Each configuration defines where you want
     * Resolver to save DNS query logs and specifies the VPCs that you want to log queries for.
     * </p>
     * 
     * @param listResolverQueryLogConfigsRequest
     * @return A Java Future containing the result of the ListResolverQueryLogConfigs operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListResolverQueryLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverQueryLogConfigsResult> listResolverQueryLogConfigsAsync(
            ListResolverQueryLogConfigsRequest listResolverQueryLogConfigsRequest);

    /**
     * <p>
     * Lists information about the specified query logging configurations. Each configuration defines where you want
     * Resolver to save DNS query logs and specifies the VPCs that you want to log queries for.
     * </p>
     * 
     * @param listResolverQueryLogConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverQueryLogConfigs operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverQueryLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverQueryLogConfigsResult> listResolverQueryLogConfigsAsync(
            ListResolverQueryLogConfigsRequest listResolverQueryLogConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists the associations that were created between Resolver rules and VPCs using the current AWS account.
     * </p>
     * 
     * @param listResolverRuleAssociationsRequest
     * @return A Java Future containing the result of the ListResolverRuleAssociations operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.ListResolverRuleAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRuleAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(
            ListResolverRuleAssociationsRequest listResolverRuleAssociationsRequest);

    /**
     * <p>
     * Lists the associations that were created between Resolver rules and VPCs using the current AWS account.
     * </p>
     * 
     * @param listResolverRuleAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverRuleAssociations operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverRuleAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRuleAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverRuleAssociationsResult> listResolverRuleAssociationsAsync(
            ListResolverRuleAssociationsRequest listResolverRuleAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverRuleAssociationsRequest, ListResolverRuleAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the Resolver rules that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverRulesRequest
     * @return A Java Future containing the result of the ListResolverRules operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListResolverRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(ListResolverRulesRequest listResolverRulesRequest);

    /**
     * <p>
     * Lists the Resolver rules that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResolverRules operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListResolverRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResolverRulesResult> listResolverRulesAsync(ListResolverRulesRequest listResolverRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResolverRulesRequest, ListResolverRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Attaches an AWS Identity and Access Management (AWS IAM) policy for sharing the rule group. You can use the
     * policy to share the rule group using AWS Resource Access Manager (RAM).
     * </p>
     * 
     * @param putFirewallRuleGroupPolicyRequest
     * @return A Java Future containing the result of the PutFirewallRuleGroupPolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.PutFirewallRuleGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutFirewallRuleGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFirewallRuleGroupPolicyResult> putFirewallRuleGroupPolicyAsync(
            PutFirewallRuleGroupPolicyRequest putFirewallRuleGroupPolicyRequest);

    /**
     * <p>
     * Attaches an AWS Identity and Access Management (AWS IAM) policy for sharing the rule group. You can use the
     * policy to share the rule group using AWS Resource Access Manager (RAM).
     * </p>
     * 
     * @param putFirewallRuleGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFirewallRuleGroupPolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.PutFirewallRuleGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutFirewallRuleGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFirewallRuleGroupPolicyResult> putFirewallRuleGroupPolicyAsync(
            PutFirewallRuleGroupPolicyRequest putFirewallRuleGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutFirewallRuleGroupPolicyRequest, PutFirewallRuleGroupPolicyResult> asyncHandler);

    /**
     * <p>
     * Specifies an AWS account that you want to share a query logging configuration with, the query logging
     * configuration that you want to share, and the operations that you want the account to be able to perform on the
     * configuration.
     * </p>
     * 
     * @param putResolverQueryLogConfigPolicyRequest
     * @return A Java Future containing the result of the PutResolverQueryLogConfigPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.PutResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResolverQueryLogConfigPolicyResult> putResolverQueryLogConfigPolicyAsync(
            PutResolverQueryLogConfigPolicyRequest putResolverQueryLogConfigPolicyRequest);

    /**
     * <p>
     * Specifies an AWS account that you want to share a query logging configuration with, the query logging
     * configuration that you want to share, and the operations that you want the account to be able to perform on the
     * configuration.
     * </p>
     * 
     * @param putResolverQueryLogConfigPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResolverQueryLogConfigPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.PutResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResolverQueryLogConfigPolicyResult> putResolverQueryLogConfigPolicyAsync(
            PutResolverQueryLogConfigPolicyRequest putResolverQueryLogConfigPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResolverQueryLogConfigPolicyRequest, PutResolverQueryLogConfigPolicyResult> asyncHandler);

    /**
     * <p>
     * Specifies an AWS rule that you want to share with another account, the account that you want to share the rule
     * with, and the operations that you want the account to be able to perform on the rule.
     * </p>
     * 
     * @param putResolverRulePolicyRequest
     * @return A Java Future containing the result of the PutResolverRulePolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.PutResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(PutResolverRulePolicyRequest putResolverRulePolicyRequest);

    /**
     * <p>
     * Specifies an AWS rule that you want to share with another account, the account that you want to share the rule
     * with, and the operations that you want the account to be able to perform on the rule.
     * </p>
     * 
     * @param putResolverRulePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResolverRulePolicy operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.PutResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResolverRulePolicyResult> putResolverRulePolicyAsync(PutResolverRulePolicyRequest putResolverRulePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResolverRulePolicyRequest, PutResolverRulePolicyResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of the firewall behavior provided by DNS Firewall for a single Amazon virtual private
     * cloud (VPC).
     * </p>
     * 
     * @param updateFirewallConfigRequest
     * @return A Java Future containing the result of the UpdateFirewallConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UpdateFirewallConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallConfigResult> updateFirewallConfigAsync(UpdateFirewallConfigRequest updateFirewallConfigRequest);

    /**
     * <p>
     * Updates the configuration of the firewall behavior provided by DNS Firewall for a single Amazon virtual private
     * cloud (VPC).
     * </p>
     * 
     * @param updateFirewallConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFirewallConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateFirewallConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallConfigResult> updateFirewallConfigAsync(UpdateFirewallConfigRequest updateFirewallConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallConfigRequest, UpdateFirewallConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the firewall domain list from an array of domain specifications.
     * </p>
     * 
     * @param updateFirewallDomainsRequest
     * @return A Java Future containing the result of the UpdateFirewallDomains operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UpdateFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallDomainsResult> updateFirewallDomainsAsync(UpdateFirewallDomainsRequest updateFirewallDomainsRequest);

    /**
     * <p>
     * Updates the firewall domain list from an array of domain specifications.
     * </p>
     * 
     * @param updateFirewallDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFirewallDomains operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallDomainsResult> updateFirewallDomainsAsync(UpdateFirewallDomainsRequest updateFirewallDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallDomainsRequest, UpdateFirewallDomainsResult> asyncHandler);

    /**
     * <p>
     * Updates the specified firewall rule.
     * </p>
     * 
     * @param updateFirewallRuleRequest
     * @return A Java Future containing the result of the UpdateFirewallRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UpdateFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallRuleResult> updateFirewallRuleAsync(UpdateFirewallRuleRequest updateFirewallRuleRequest);

    /**
     * <p>
     * Updates the specified firewall rule.
     * </p>
     * 
     * @param updateFirewallRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFirewallRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallRuleResult> updateFirewallRuleAsync(UpdateFirewallRuleRequest updateFirewallRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallRuleRequest, UpdateFirewallRuleResult> asyncHandler);

    /**
     * <p>
     * Changes the association of a <a>FirewallRuleGroup</a> with a VPC. The association enables DNS filtering for the
     * VPC.
     * </p>
     * 
     * @param updateFirewallRuleGroupAssociationRequest
     * @return A Java Future containing the result of the UpdateFirewallRuleGroupAssociation operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsync.UpdateFirewallRuleGroupAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRuleGroupAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallRuleGroupAssociationResult> updateFirewallRuleGroupAssociationAsync(
            UpdateFirewallRuleGroupAssociationRequest updateFirewallRuleGroupAssociationRequest);

    /**
     * <p>
     * Changes the association of a <a>FirewallRuleGroup</a> with a VPC. The association enables DNS filtering for the
     * VPC.
     * </p>
     * 
     * @param updateFirewallRuleGroupAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFirewallRuleGroupAssociation operation returned by the
     *         service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateFirewallRuleGroupAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRuleGroupAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFirewallRuleGroupAssociationResult> updateFirewallRuleGroupAssociationAsync(
            UpdateFirewallRuleGroupAssociationRequest updateFirewallRuleGroupAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFirewallRuleGroupAssociationRequest, UpdateFirewallRuleGroupAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing DNSSEC validation configuration. If there is no existing DNSSEC validation configuration, one
     * is created.
     * </p>
     * 
     * @param updateResolverDnssecConfigRequest
     * @return A Java Future containing the result of the UpdateResolverDnssecConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UpdateResolverDnssecConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverDnssecConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverDnssecConfigResult> updateResolverDnssecConfigAsync(
            UpdateResolverDnssecConfigRequest updateResolverDnssecConfigRequest);

    /**
     * <p>
     * Updates an existing DNSSEC validation configuration. If there is no existing DNSSEC validation configuration, one
     * is created.
     * </p>
     * 
     * @param updateResolverDnssecConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResolverDnssecConfig operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateResolverDnssecConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverDnssecConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverDnssecConfigResult> updateResolverDnssecConfigAsync(
            UpdateResolverDnssecConfigRequest updateResolverDnssecConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResolverDnssecConfigRequest, UpdateResolverDnssecConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the name of an inbound or an outbound Resolver endpoint.
     * </p>
     * 
     * @param updateResolverEndpointRequest
     * @return A Java Future containing the result of the UpdateResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UpdateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(UpdateResolverEndpointRequest updateResolverEndpointRequest);

    /**
     * <p>
     * Updates the name of an inbound or an outbound Resolver endpoint.
     * </p>
     * 
     * @param updateResolverEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResolverEndpoint operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverEndpointResult> updateResolverEndpointAsync(UpdateResolverEndpointRequest updateResolverEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResolverEndpointRequest, UpdateResolverEndpointResult> asyncHandler);

    /**
     * <p>
     * Updates settings for a specified Resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
     * are optional. If you don't specify a parameter, it retains its current value.
     * </p>
     * 
     * @param updateResolverRuleRequest
     * @return A Java Future containing the result of the UpdateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsync.UpdateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(UpdateResolverRuleRequest updateResolverRuleRequest);

    /**
     * <p>
     * Updates settings for a specified Resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
     * are optional. If you don't specify a parameter, it retains its current value.
     * </p>
     * 
     * @param updateResolverRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResolverRule operation returned by the service.
     * @sample AmazonRoute53ResolverAsyncHandler.UpdateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResolverRuleResult> updateResolverRuleAsync(UpdateResolverRuleRequest updateResolverRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResolverRuleRequest, UpdateResolverRuleResult> asyncHandler);

}
