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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53resolver.model.*;

/**
 * Interface for accessing Route53Resolver.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53resolver.AbstractAmazonRoute53Resolver} instead.
 * </p>
 * <p>
 * <p>
 * When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver.
 * By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or Elastic Load
 * Balancing load balancers. Resolver performs recursive lookups against public name servers for all other domain names.
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
 * Like Amazon VPC, Resolver is Regional. In each Region where you have VPCs, you can choose whether to forward queries
 * from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRoute53Resolver {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53resolver";

    /**
     * <p>
     * Associates a <a>FirewallRuleGroup</a> with a VPC, to provide DNS filtering for the VPC.
     * </p>
     * 
     * @param associateFirewallRuleGroupRequest
     * @return Result of the AssociateFirewallRuleGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ConflictException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.AssociateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateFirewallRuleGroupResult associateFirewallRuleGroup(AssociateFirewallRuleGroupRequest associateFirewallRuleGroupRequest);

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
     * @return Result of the AssociateResolverEndpointIpAddress operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.AssociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResolverEndpointIpAddressResult associateResolverEndpointIpAddress(
            AssociateResolverEndpointIpAddressRequest associateResolverEndpointIpAddressRequest);

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
     * @return Result of the AssociateResolverQueryLogConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.AssociateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResolverQueryLogConfigResult associateResolverQueryLogConfig(AssociateResolverQueryLogConfigRequest associateResolverQueryLogConfigRequest);

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
     * @return Result of the AssociateResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource isn't available.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.AssociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResolverRuleResult associateResolverRule(AssociateResolverRuleRequest associateResolverRuleRequest);

    /**
     * <p>
     * Creates an empty firewall domain list for use in DNS Firewall rules. You can populate the domains for the new
     * list with a file, using <a>ImportFirewallDomains</a>, or with domain strings, using <a>UpdateFirewallDomains</a>.
     * </p>
     * 
     * @param createFirewallDomainListRequest
     * @return Result of the CreateFirewallDomainList operation returned by the service.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFirewallDomainListResult createFirewallDomainList(CreateFirewallDomainListRequest createFirewallDomainListRequest);

    /**
     * <p>
     * Creates a single DNS Firewall rule in the specified rule group, using the specified domain list.
     * </p>
     * 
     * @param createFirewallRuleRequest
     * @return Result of the CreateFirewallRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFirewallRuleResult createFirewallRule(CreateFirewallRuleRequest createFirewallRuleRequest);

    /**
     * <p>
     * Creates an empty DNS Firewall rule group for filtering DNS network traffic in a VPC. You can add rules to the new
     * rule group by calling <a>CreateFirewallRule</a>.
     * </p>
     * 
     * @param createFirewallRuleGroupRequest
     * @return Result of the CreateFirewallRuleGroup operation returned by the service.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFirewallRuleGroupResult createFirewallRuleGroup(CreateFirewallRuleGroupRequest createFirewallRuleGroupRequest);

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
     * @return Result of the CreateResolverEndpoint operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResolverEndpointResult createResolverEndpoint(CreateResolverEndpointRequest createResolverEndpointRequest);

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
     * @return Result of the CreateResolverQueryLogConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.CreateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResolverQueryLogConfigResult createResolverQueryLogConfig(CreateResolverQueryLogConfigRequest createResolverQueryLogConfigRequest);

    /**
     * <p>
     * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass through, one
     * domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     * </p>
     * 
     * @param createResolverRuleRequest
     * @return Result of the CreateResolverRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws ResourceUnavailableException
     *         The specified resource isn't available.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest createResolverRuleRequest);

    /**
     * <p>
     * Deletes the specified domain list.
     * </p>
     * 
     * @param deleteFirewallDomainListRequest
     * @return Result of the DeleteFirewallDomainList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ConflictException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFirewallDomainListResult deleteFirewallDomainList(DeleteFirewallDomainListRequest deleteFirewallDomainListRequest);

    /**
     * <p>
     * Deletes the specified firewall rule.
     * </p>
     * 
     * @param deleteFirewallRuleRequest
     * @return Result of the DeleteFirewallRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFirewallRuleResult deleteFirewallRule(DeleteFirewallRuleRequest deleteFirewallRuleRequest);

    /**
     * <p>
     * Deletes the specified firewall rule group.
     * </p>
     * 
     * @param deleteFirewallRuleGroupRequest
     * @return Result of the DeleteFirewallRuleGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ConflictException
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFirewallRuleGroupResult deleteFirewallRuleGroup(DeleteFirewallRuleGroupRequest deleteFirewallRuleGroupRequest);

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
     * @return Result of the DeleteResolverEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResolverEndpointResult deleteResolverEndpoint(DeleteResolverEndpointRequest deleteResolverEndpointRequest);

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
     * @return Result of the DeleteResolverQueryLogConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.DeleteResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResolverQueryLogConfigResult deleteResolverQueryLogConfig(DeleteResolverQueryLogConfigRequest deleteResolverQueryLogConfigRequest);

    /**
     * <p>
     * Deletes a Resolver rule. Before you can delete a Resolver rule, you must disassociate it from all the VPCs that
     * you associated the Resolver rule with. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html"
     * >DisassociateResolverRule</a>.
     * </p>
     * 
     * @param deleteResolverRuleRequest
     * @return Result of the DeleteResolverRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceInUseException
     *         The resource that you tried to update or delete is currently in use.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResolverRuleResult deleteResolverRule(DeleteResolverRuleRequest deleteResolverRuleRequest);

    /**
     * <p>
     * Disassociates a <a>FirewallRuleGroup</a> from a VPC, to remove DNS filtering from the VPC.
     * </p>
     * 
     * @param disassociateFirewallRuleGroupRequest
     * @return Result of the DisassociateFirewallRuleGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws ConflictException
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DisassociateFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFirewallRuleGroupResult disassociateFirewallRuleGroup(DisassociateFirewallRuleGroupRequest disassociateFirewallRuleGroupRequest);

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
     * @return Result of the DisassociateResolverEndpointIpAddress operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DisassociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResolverEndpointIpAddressResult disassociateResolverEndpointIpAddress(
            DisassociateResolverEndpointIpAddressRequest disassociateResolverEndpointIpAddressRequest);

    /**
     * <p>
     * Disassociates a VPC from a query logging configuration.
     * </p>
     * <note>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * If you used AWS Resource Access Manager (AWS RAM) to share a query logging configuration with other accounts,
     * VPCs can be disassociated from the configuration in the following ways:
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
     * @return Result of the DisassociateResolverQueryLogConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.DisassociateResolverQueryLogConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResolverQueryLogConfigResult disassociateResolverQueryLogConfig(
            DisassociateResolverQueryLogConfigRequest disassociateResolverQueryLogConfigRequest);

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
     * @return Result of the DisassociateResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DisassociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResolverRuleResult disassociateResolverRule(DisassociateResolverRuleRequest disassociateResolverRuleRequest);

    /**
     * <p>
     * Retrieves the configuration of the firewall behavior provided by DNS Firewall for a single VPC from Amazon
     * Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param getFirewallConfigRequest
     * @return Result of the GetFirewallConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     * @sample AmazonRoute53Resolver.GetFirewallConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetFirewallConfigResult getFirewallConfig(GetFirewallConfigRequest getFirewallConfigRequest);

    /**
     * <p>
     * Retrieves the specified firewall domain list.
     * </p>
     * 
     * @param getFirewallDomainListRequest
     * @return Result of the GetFirewallDomainList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetFirewallDomainList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallDomainList"
     *      target="_top">AWS API Documentation</a>
     */
    GetFirewallDomainListResult getFirewallDomainList(GetFirewallDomainListRequest getFirewallDomainListRequest);

    /**
     * <p>
     * Retrieves the specified firewall rule group.
     * </p>
     * 
     * @param getFirewallRuleGroupRequest
     * @return Result of the GetFirewallRuleGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetFirewallRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetFirewallRuleGroupResult getFirewallRuleGroup(GetFirewallRuleGroupRequest getFirewallRuleGroupRequest);

    /**
     * <p>
     * Retrieves a firewall rule group association, which enables DNS filtering for a VPC with one rule group. A VPC can
     * have more than one firewall rule group association, and a rule group can be associated with more than one VPC.
     * </p>
     * 
     * @param getFirewallRuleGroupAssociationRequest
     * @return Result of the GetFirewallRuleGroupAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetFirewallRuleGroupAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetFirewallRuleGroupAssociationResult getFirewallRuleGroupAssociation(GetFirewallRuleGroupAssociationRequest getFirewallRuleGroupAssociationRequest);

    /**
     * <p>
     * Returns the AWS Identity and Access Management (AWS IAM) policy for sharing the specified rule group. You can use
     * the policy to share the rule group using AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param getFirewallRuleGroupPolicyRequest
     * @return Result of the GetFirewallRuleGroupPolicy operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetFirewallRuleGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetFirewallRuleGroupPolicyResult getFirewallRuleGroupPolicy(GetFirewallRuleGroupPolicyRequest getFirewallRuleGroupPolicyRequest);

    /**
     * <p>
     * Gets DNSSEC validation information for a specified resource.
     * </p>
     * 
     * @param getResolverDnssecConfigRequest
     * @return Result of the GetResolverDnssecConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverDnssecConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverDnssecConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverDnssecConfigResult getResolverDnssecConfig(GetResolverDnssecConfigRequest getResolverDnssecConfigRequest);

    /**
     * <p>
     * Gets information about a specified Resolver endpoint, such as whether it's an inbound or an outbound Resolver
     * endpoint, and the current status of the endpoint.
     * </p>
     * 
     * @param getResolverEndpointRequest
     * @return Result of the GetResolverEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverEndpointResult getResolverEndpoint(GetResolverEndpointRequest getResolverEndpointRequest);

    /**
     * <p>
     * Gets information about a specified Resolver query logging configuration, such as the number of VPCs that the
     * configuration is logging queries for and the location that logs are sent to.
     * </p>
     * 
     * @param getResolverQueryLogConfigRequest
     * @return Result of the GetResolverQueryLogConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverQueryLogConfigResult getResolverQueryLogConfig(GetResolverQueryLogConfigRequest getResolverQueryLogConfigRequest);

    /**
     * <p>
     * Gets information about a specified association between a Resolver query logging configuration and an Amazon VPC.
     * When you associate a VPC with a query logging configuration, Resolver logs DNS queries that originate in that
     * VPC.
     * </p>
     * 
     * @param getResolverQueryLogConfigAssociationRequest
     * @return Result of the GetResolverQueryLogConfigAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverQueryLogConfigAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverQueryLogConfigAssociationResult getResolverQueryLogConfigAssociation(
            GetResolverQueryLogConfigAssociationRequest getResolverQueryLogConfigAssociationRequest);

    /**
     * <p>
     * Gets information about a query logging policy. A query logging policy specifies the Resolver query logging
     * operations and resources that you want to allow another AWS account to be able to use.
     * </p>
     * 
     * @param getResolverQueryLogConfigPolicyRequest
     * @return Result of the GetResolverQueryLogConfigPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverQueryLogConfigPolicyResult getResolverQueryLogConfigPolicy(GetResolverQueryLogConfigPolicyRequest getResolverQueryLogConfigPolicyRequest);

    /**
     * <p>
     * Gets information about a specified Resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound Resolver endpoint that the rule is associated with.
     * </p>
     * 
     * @param getResolverRuleRequest
     * @return Result of the GetResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverRuleResult getResolverRule(GetResolverRuleRequest getResolverRuleRequest);

    /**
     * <p>
     * Gets information about an association between a specified Resolver rule and a VPC. You associate a Resolver rule
     * and a VPC using <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html"
     * >AssociateResolverRule</a>.
     * </p>
     * 
     * @param getResolverRuleAssociationRequest
     * @return Result of the GetResolverRuleAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverRuleAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRuleAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverRuleAssociationResult getResolverRuleAssociation(GetResolverRuleAssociationRequest getResolverRuleAssociationRequest);

    /**
     * <p>
     * Gets information about the Resolver rule policy for a specified rule. A Resolver rule policy includes the rule
     * that you want to share with another account, the account that you want to share the rule with, and the Resolver
     * operations that you want to allow the account to use.
     * </p>
     * 
     * @param getResolverRulePolicyRequest
     * @return Result of the GetResolverRulePolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetResolverRulePolicyResult getResolverRulePolicy(GetResolverRulePolicyRequest getResolverRulePolicyRequest);

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
     * @return Result of the ImportFirewallDomains operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ConflictException
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ImportFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ImportFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    ImportFirewallDomainsResult importFirewallDomains(ImportFirewallDomainsRequest importFirewallDomainsRequest);

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
     * @return Result of the ListFirewallConfigs operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListFirewallConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallConfigsResult listFirewallConfigs(ListFirewallConfigsRequest listFirewallConfigsRequest);

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
     * @return Result of the ListFirewallDomainLists operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListFirewallDomainLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomainLists"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallDomainListsResult listFirewallDomainLists(ListFirewallDomainListsRequest listFirewallDomainListsRequest);

    /**
     * <p>
     * Retrieves the domains that you have defined for the specified firewall domain list.
     * </p>
     * <p>
     * A single call might return only a partial list of the domains. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallDomainsRequest
     * @return Result of the ListFirewallDomains operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallDomainsResult listFirewallDomains(ListFirewallDomainsRequest listFirewallDomainsRequest);

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
     * @return Result of the ListFirewallRuleGroupAssociations operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListFirewallRuleGroupAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroupAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallRuleGroupAssociationsResult listFirewallRuleGroupAssociations(ListFirewallRuleGroupAssociationsRequest listFirewallRuleGroupAssociationsRequest);

    /**
     * <p>
     * Retrieves the minimal high-level information for the rule groups that you have defined.
     * </p>
     * <p>
     * A single call might return only a partial list of the rule groups. For information, see <code>MaxResults</code>.
     * </p>
     * 
     * @param listFirewallRuleGroupsRequest
     * @return Result of the ListFirewallRuleGroups operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListFirewallRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallRuleGroupsResult listFirewallRuleGroups(ListFirewallRuleGroupsRequest listFirewallRuleGroupsRequest);

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
     * @return Result of the ListFirewallRules operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListFirewallRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallRulesResult listFirewallRules(ListFirewallRulesRequest listFirewallRulesRequest);

    /**
     * <p>
     * Lists the configurations for DNSSEC validation that are associated with the current AWS account.
     * </p>
     * 
     * @param listResolverDnssecConfigsRequest
     * @return Result of the ListResolverDnssecConfigs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.ListResolverDnssecConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverDnssecConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverDnssecConfigsResult listResolverDnssecConfigs(ListResolverDnssecConfigsRequest listResolverDnssecConfigsRequest);

    /**
     * <p>
     * Gets the IP addresses for a specified Resolver endpoint.
     * </p>
     * 
     * @param listResolverEndpointIpAddressesRequest
     * @return Result of the ListResolverEndpointIpAddresses operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverEndpointIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpointIpAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverEndpointIpAddressesResult listResolverEndpointIpAddresses(ListResolverEndpointIpAddressesRequest listResolverEndpointIpAddressesRequest);

    /**
     * <p>
     * Lists all the Resolver endpoints that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverEndpointsRequest
     * @return Result of the ListResolverEndpoints operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverEndpointsResult listResolverEndpoints(ListResolverEndpointsRequest listResolverEndpointsRequest);

    /**
     * <p>
     * Lists information about associations between Amazon VPCs and query logging configurations.
     * </p>
     * 
     * @param listResolverQueryLogConfigAssociationsRequest
     * @return Result of the ListResolverQueryLogConfigAssociations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.ListResolverQueryLogConfigAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverQueryLogConfigAssociationsResult listResolverQueryLogConfigAssociations(
            ListResolverQueryLogConfigAssociationsRequest listResolverQueryLogConfigAssociationsRequest);

    /**
     * <p>
     * Lists information about the specified query logging configurations. Each configuration defines where you want
     * Resolver to save DNS query logs and specifies the VPCs that you want to log queries for.
     * </p>
     * 
     * @param listResolverQueryLogConfigsRequest
     * @return Result of the ListResolverQueryLogConfigs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.ListResolverQueryLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverQueryLogConfigsResult listResolverQueryLogConfigs(ListResolverQueryLogConfigsRequest listResolverQueryLogConfigsRequest);

    /**
     * <p>
     * Lists the associations that were created between Resolver rules and VPCs using the current AWS account.
     * </p>
     * 
     * @param listResolverRuleAssociationsRequest
     * @return Result of the ListResolverRuleAssociations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverRuleAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRuleAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverRuleAssociationsResult listResolverRuleAssociations(ListResolverRuleAssociationsRequest listResolverRuleAssociationsRequest);

    /**
     * <p>
     * Lists the Resolver rules that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverRulesRequest
     * @return Result of the ListResolverRules operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolverRulesResult listResolverRules(ListResolverRulesRequest listResolverRulesRequest);

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Attaches an AWS Identity and Access Management (AWS IAM) policy for sharing the rule group. You can use the
     * policy to share the rule group using AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param putFirewallRuleGroupPolicyRequest
     * @return Result of the PutFirewallRuleGroupPolicy operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.PutFirewallRuleGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutFirewallRuleGroupPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutFirewallRuleGroupPolicyResult putFirewallRuleGroupPolicy(PutFirewallRuleGroupPolicyRequest putFirewallRuleGroupPolicyRequest);

    /**
     * <p>
     * Specifies an AWS account that you want to share a query logging configuration with, the query logging
     * configuration that you want to share, and the operations that you want the account to be able to perform on the
     * configuration.
     * </p>
     * 
     * @param putResolverQueryLogConfigPolicyRequest
     * @return Result of the PutResolverQueryLogConfigPolicy operation returned by the service.
     * @throws InvalidPolicyDocumentException
     *         The specified Resolver rule policy is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.PutResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResolverQueryLogConfigPolicyResult putResolverQueryLogConfigPolicy(PutResolverQueryLogConfigPolicyRequest putResolverQueryLogConfigPolicyRequest);

    /**
     * <p>
     * Specifies an AWS rule that you want to share with another account, the account that you want to share the rule
     * with, and the operations that you want the account to be able to perform on the rule.
     * </p>
     * 
     * @param putResolverRulePolicyRequest
     * @return Result of the PutResolverRulePolicy operation returned by the service.
     * @throws InvalidPolicyDocumentException
     *         The specified Resolver rule policy is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.PutResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResolverRulePolicyResult putResolverRulePolicy(PutResolverRulePolicyRequest putResolverRulePolicyRequest);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidTagException
     *         The specified tag is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration of the firewall behavior provided by DNS Firewall for a single VPC from Amazon Virtual
     * Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param updateFirewallConfigRequest
     * @return Result of the UpdateFirewallConfig operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateFirewallConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallConfigResult updateFirewallConfig(UpdateFirewallConfigRequest updateFirewallConfigRequest);

    /**
     * <p>
     * Updates the firewall domain list from an array of domain specifications.
     * </p>
     * 
     * @param updateFirewallDomainsRequest
     * @return Result of the UpdateFirewallDomains operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ConflictException
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateFirewallDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallDomains"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallDomainsResult updateFirewallDomains(UpdateFirewallDomainsRequest updateFirewallDomainsRequest);

    /**
     * <p>
     * Updates the specified firewall rule.
     * </p>
     * 
     * @param updateFirewallRuleRequest
     * @return Result of the UpdateFirewallRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws ConflictException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateFirewallRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallRuleResult updateFirewallRule(UpdateFirewallRuleRequest updateFirewallRuleRequest);

    /**
     * <p>
     * Changes the association of a <a>FirewallRuleGroup</a> with a VPC. The association enables DNS filtering for the
     * VPC.
     * </p>
     * 
     * @param updateFirewallRuleGroupAssociationRequest
     * @return Result of the UpdateFirewallRuleGroupAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ValidationException
     * @throws ConflictException
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateFirewallRuleGroupAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallRuleGroupAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallRuleGroupAssociationResult updateFirewallRuleGroupAssociation(
            UpdateFirewallRuleGroupAssociationRequest updateFirewallRuleGroupAssociationRequest);

    /**
     * <p>
     * Updates an existing DNSSEC validation configuration. If there is no existing DNSSEC validation configuration, one
     * is created.
     * </p>
     * 
     * @param updateResolverDnssecConfigRequest
     * @return Result of the UpdateResolverDnssecConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.UpdateResolverDnssecConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverDnssecConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResolverDnssecConfigResult updateResolverDnssecConfig(UpdateResolverDnssecConfigRequest updateResolverDnssecConfigRequest);

    /**
     * <p>
     * Updates the name of an inbound or an outbound Resolver endpoint.
     * </p>
     * 
     * @param updateResolverEndpointRequest
     * @return Result of the UpdateResolverEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResolverEndpointResult updateResolverEndpoint(UpdateResolverEndpointRequest updateResolverEndpointRequest);

    /**
     * <p>
     * Updates settings for a specified Resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
     * are optional. If you don't specify a parameter, it retains its current value.
     * </p>
     * 
     * @param updateResolverRuleRequest
     * @return Result of the UpdateResolverRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceUnavailableException
     *         The specified resource isn't available.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResolverRuleResult updateResolverRule(UpdateResolverRuleRequest updateResolverRuleRequest);

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

}
