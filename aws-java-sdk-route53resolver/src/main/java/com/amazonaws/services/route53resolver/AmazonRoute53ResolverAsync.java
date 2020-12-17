/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
