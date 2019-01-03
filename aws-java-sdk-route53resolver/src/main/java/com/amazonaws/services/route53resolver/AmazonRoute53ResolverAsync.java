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
 * Here's how you set up to query an Amazon Route 53 private hosted zone from your network:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Connect your network to a VPC using AWS Direct Connect or a VPN.
 * </p>
 * </li>
 * <li>
 * <p>
 * Run the following AWS CLI command to create a Resolver endpoint:
 * </p>
 * <p>
 * <code>create-resolver-endpoint --name [endpoint_name] --direction INBOUND --creator-request-id [unique_string] --security-group-ids [security_group_with_inbound_rules] --ip-addresses SubnetId=[subnet_id] SubnetId=[subnet_id_in_different_AZ]</code>
 * </p>
 * <p>
 * Note the resolver endpoint ID that appears in the response. You'll use it in step 3.
 * </p>
 * </li>
 * <li>
 * <p>
 * Get the IP addresses for the Resolver endpoints:
 * </p>
 * <p>
 * <code>get-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * In your network configuration, define the IP addresses that you got in step 3 as DNS servers.
 * </p>
 * <p>
 * You can now query instance names in your VPCs and the names of records in your private hosted zone.
 * </p>
 * </li>
 * </ol>
 * <p>
 * You can also perform the following operations using the AWS CLI:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>list-resolver-endpoints</code>: List all endpoints. The syntax includes options for pagination and filtering.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>update-resolver-endpoints</code>: Add IP addresses to an endpoint or remove IP addresses from an endpoint.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To delete an endpoint, use the following AWS CLI command:
 * </p>
 * <p>
 * <code>delete-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRoute53ResolverAsync extends AmazonRoute53Resolver {

    /**
     * <p>
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address,
     * submit one <code>AssociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To remove an IP address from an endpoint, see <a>DisassociateResolverEndpointIpAddress</a>.
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
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address,
     * submit one <code>AssociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To remove an IP address from an endpoint, see <a>DisassociateResolverEndpointIpAddress</a>.
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
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
     * for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
     * IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see
     * <a>CreateResolverRule</a>.
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
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
     * for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
     * IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see
     * <a>CreateResolverRule</a>.
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
     * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <i>inbound resolver endpoint</i> forwards DNS queries to the DNS service for a VPC from your network or
     * another VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * An <i>outbound resolver endpoint</i> forwards DNS queries from the DNS service for a VPC to your network or
     * another VPC.
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
     * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <i>inbound resolver endpoint</i> forwards DNS queries to the DNS service for a VPC from your network or
     * another VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * An <i>outbound resolver endpoint</i> forwards DNS queries from the DNS service for a VPC to your network or
     * another VPC.
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
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one
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
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one
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
     * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an
     * outbound resolver endpoint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Inbound</b>: DNS queries from your network or another VPC are no longer routed to the DNS service for the
     * specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Outbound</b>: DNS queries from a VPC are no longer routed to your network or to another VPC.
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
     * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an
     * outbound resolver endpoint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Inbound</b>: DNS queries from your network or another VPC are no longer routed to the DNS service for the
     * specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Outbound</b>: DNS queries from a VPC are no longer routed to your network or to another VPC.
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
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that
     * you associated the resolver rule with. For more infomation, see <a>DisassociateResolverRule</a>.
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
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that
     * you associated the resolver rule with. For more infomation, see <a>DisassociateResolverRule</a>.
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
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP
     * address, submit one <code>DisassociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To add an IP address to an endpoint, see <a>AssociateResolverEndpointIpAddress</a>.
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
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP
     * address, submit one <code>DisassociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To add an IP address to an endpoint, see <a>AssociateResolverEndpointIpAddress</a>.
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
     * Removes the association between a specified resolver rule and a specified VPC.
     * </p>
     * <important>
     * <p>
     * If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
     * you specified in the resolver rule.
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
     * Removes the association between a specified resolver rule and a specified VPC.
     * </p>
     * <important>
     * <p>
     * If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
     * you specified in the resolver rule.
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
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver
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
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver
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
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound resolver endpoint that the rule is associated with.
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
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound resolver endpoint that the rule is associated with.
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
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule
     * and a VPC using <a>AssociateResolverRule</a>.
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
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule
     * and a VPC using <a>AssociateResolverRule</a>.
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
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and
     * resources that you want to allow another AWS account to be able to use.
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
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and
     * resources that you want to allow another AWS account to be able to use.
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
     * Gets the IP addresses for a specified resolver endpoint.
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
     * Gets the IP addresses for a specified resolver endpoint.
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
     * Lists all the resolver endpoints that were created using the current AWS account.
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
     * Lists all the resolver endpoints that were created using the current AWS account.
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
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
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
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
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
     * Lists the resolver rules that were created using the current AWS account.
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
     * Lists the resolver rules that were created using the current AWS account.
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
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
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
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
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
     * Updates the name of an inbound or an outbound resolver endpoint.
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
     * Updates the name of an inbound or an outbound resolver endpoint.
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
     * Updates settings for a specified resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
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
     * Updates settings for a specified resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
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
