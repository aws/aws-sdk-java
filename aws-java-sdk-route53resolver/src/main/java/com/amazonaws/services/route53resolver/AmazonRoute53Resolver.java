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
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address,
     * submit one <code>AssociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To remove an IP address from an endpoint, see <a>DisassociateResolverEndpointIpAddress</a>.
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
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
     * for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
     * IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see
     * <a>CreateResolverRule</a>.
     * </p>
     * 
     * @param associateResolverRuleRequest
     * @return Result of the AssociateResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
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
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one
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
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that
     * you associated the resolver rule with. For more infomation, see <a>DisassociateResolverRule</a>.
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
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP
     * address, submit one <code>DisassociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To add an IP address to an endpoint, see <a>AssociateResolverEndpointIpAddress</a>.
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
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver
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
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound resolver endpoint that the rule is associated with.
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
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule
     * and a VPC using <a>AssociateResolverRule</a>.
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
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and
     * resources that you want to allow another AWS account to be able to use.
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
     * Gets the IP addresses for a specified resolver endpoint.
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
     * Lists all the resolver endpoints that were created using the current AWS account.
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
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
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
     * Lists the resolver rules that were created using the current AWS account.
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
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
     * </p>
     * 
     * @param putResolverRulePolicyRequest
     * @return Result of the PutResolverRulePolicy operation returned by the service.
     * @throws InvalidPolicyDocumentException
     *         The specified resolver rule policy is invalid.
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
     * Updates the name of an inbound or an outbound resolver endpoint.
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
     * Updates settings for a specified resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
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
