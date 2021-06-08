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
package com.amazonaws.services.networkfirewall;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.networkfirewall.model.*;

/**
 * Interface for accessing Network Firewall.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.networkfirewall.AbstractAWSNetworkFirewall} instead.
 * </p>
 * <p>
 * <p>
 * This is the API Reference for AWS Network Firewall. This guide is for developers who need detailed information about
 * the Network Firewall API actions, data types, and errors.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The REST API requires you to handle connection details, such as calculating signatures, handling request retries, and
 * error handling. For general information about using the AWS REST APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">AWS APIs</a>.
 * </p>
 * <p>
 * To access Network Firewall using the REST API endpoint:
 * <code>https://network-firewall.&lt;region&gt;.amazonaws.com </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of Network Firewall features, including and step-by-step instructions on how to use them through the
 * Network Firewall console, see the <a
 * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/">Network Firewall Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Network Firewall is a stateful, managed, network firewall and intrusion detection and prevention service for Amazon
 * Virtual Private Cloud (Amazon VPC). With Network Firewall, you can filter traffic at the perimeter of your VPC. This
 * includes filtering traffic going to and coming from an internet gateway, NAT gateway, or over VPN or AWS Direct
 * Connect. Network Firewall uses rules that are compatible with Suricata, a free, open source intrusion detection
 * system (IDS) engine. For information about Suricata, see the <a href="https://suricata-ids.org/">Suricata
 * website</a>.
 * </p>
 * <p>
 * You can use Network Firewall to monitor and protect your VPC traffic in a number of ways. The following are just a
 * few examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Allow domains or IP addresses for known AWS service endpoints, such as Amazon S3, and block all other forms of
 * traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use custom lists of known bad domains to limit the types of domain names that your applications can access.
 * </p>
 * </li>
 * <li>
 * <p>
 * Perform deep packet inspection on traffic entering or leaving your VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use stateful protocol detection to filter protocols like HTTPS, regardless of the port used.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To enable Network Firewall for your VPCs, you perform steps in both Amazon VPC and in Network Firewall. For
 * information about using Amazon VPC, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon VPC User
 * Guide</a>.
 * </p>
 * <p>
 * To start using Network Firewall, do the following:
 * </p>
 * <ol>
 * <li>
 * <p>
 * (Optional) If you don't already have a VPC that you want to protect, create it in Amazon VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, in each Availability Zone where you want to have a firewall endpoint, create a subnet for the sole use
 * of Network Firewall.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create stateless and stateful rule groups, to define the components of the network traffic
 * filtering behavior that you want your firewall to have.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall policy that uses your rule groups and specifies additional default traffic
 * filtering behavior.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall and specify your new firewall policy and VPC subnets. Network Firewall creates
 * a firewall endpoint in each subnet that you specify, with the behavior that's defined in the firewall policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, use ingress routing enhancements to route traffic through the new firewall endpoints.
 * </p>
 * </li>
 * </ol>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSNetworkFirewall {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "network-firewall";

    /**
     * <p>
     * Associates a <a>FirewallPolicy</a> to a <a>Firewall</a>.
     * </p>
     * <p>
     * A firewall policy defines how to monitor and manage your VPC network traffic, using a collection of inspection
     * rule groups and other settings. Each firewall requires one firewall policy association, and you can use the same
     * firewall policy for multiple firewalls.
     * </p>
     * 
     * @param associateFirewallPolicyRequest
     * @return Result of the AssociateFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.AssociateFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/AssociateFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateFirewallPolicyResult associateFirewallPolicy(AssociateFirewallPolicyRequest associateFirewallPolicyRequest);

    /**
     * <p>
     * Associates the specified subnets in the Amazon VPC to the firewall. You can specify one subnet for each of the
     * Availability Zones that the VPC spans.
     * </p>
     * <p>
     * This request creates an AWS Network Firewall firewall endpoint in each of the subnets. To enable the firewall's
     * protections, you must also modify the VPC's route tables for each subnet's Availability Zone, to redirect the
     * traffic that's coming into and going out of the zone through the firewall endpoint.
     * </p>
     * 
     * @param associateSubnetsRequest
     * @return Result of the AssociateSubnets operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @sample AWSNetworkFirewall.AssociateSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/AssociateSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSubnetsResult associateSubnets(AssociateSubnetsRequest associateSubnetsRequest);

    /**
     * <p>
     * Creates an AWS Network Firewall <a>Firewall</a> and accompanying <a>FirewallStatus</a> for a VPC.
     * </p>
     * <p>
     * The firewall defines the configuration settings for an AWS Network Firewall firewall. The settings that you can
     * define at creation include the firewall policy, the subnets in your VPC to use for the firewall endpoints, and
     * any tags that are attached to the firewall AWS resource.
     * </p>
     * <p>
     * After you create a firewall, you can provide additional settings, like the logging configuration.
     * </p>
     * <p>
     * To update the settings for a firewall, you use the operations that apply to the settings themselves, for example
     * <a>UpdateLoggingConfiguration</a>, <a>AssociateSubnets</a>, and <a>UpdateFirewallDeleteProtection</a>.
     * </p>
     * <p>
     * To manage a firewall's tags, use the standard AWS resource tagging operations, <a>ListTagsForResource</a>,
     * <a>TagResource</a>, and <a>UntagResource</a>.
     * </p>
     * <p>
     * To retrieve information about firewalls, use <a>ListFirewalls</a> and <a>DescribeFirewall</a>.
     * </p>
     * 
     * @param createFirewallRequest
     * @return Result of the CreateFirewall operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         Unable to perform the operation because doing so would violate a limit setting.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.CreateFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFirewallResult createFirewall(CreateFirewallRequest createFirewallRequest);

    /**
     * <p>
     * Creates the firewall policy for the firewall according to the specifications.
     * </p>
     * <p>
     * An AWS Network Firewall firewall policy defines the behavior of a firewall, in a collection of stateless and
     * stateful rule groups and other settings. You can use one firewall policy for multiple firewalls.
     * </p>
     * 
     * @param createFirewallPolicyRequest
     * @return Result of the CreateFirewallPolicy operation returned by the service.
     * @throws LimitExceededException
     *         Unable to perform the operation because doing so would violate a limit setting.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @sample AWSNetworkFirewall.CreateFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFirewallPolicyResult createFirewallPolicy(CreateFirewallPolicyRequest createFirewallPolicyRequest);

    /**
     * <p>
     * Creates the specified stateless or stateful rule group, which includes the rules for network traffic inspection,
     * a capacity setting, and tags.
     * </p>
     * <p>
     * You provide your rule group specification in your request using either <code>RuleGroup</code> or
     * <code>Rules</code>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return Result of the CreateRuleGroup operation returned by the service.
     * @throws LimitExceededException
     *         Unable to perform the operation because doing so would violate a limit setting.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @sample AWSNetworkFirewall.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest createRuleGroupRequest);

    /**
     * <p>
     * Deletes the specified <a>Firewall</a> and its <a>FirewallStatus</a>. This operation requires the firewall's
     * <code>DeleteProtection</code> flag to be <code>FALSE</code>. You can't revert this operation.
     * </p>
     * <p>
     * You can check whether a firewall is in use by reviewing the route tables for the Availability Zones where you
     * have firewall subnet mappings. Retrieve the subnet mappings by calling <a>DescribeFirewall</a>. You define and
     * update the route tables through Amazon VPC. As needed, update the route tables for the zones to remove the
     * firewall endpoints. When the route tables no longer use the firewall endpoints, you can remove the firewall
     * safely.
     * </p>
     * <p>
     * To delete a firewall, remove the delete protection if you need to using <a>UpdateFirewallDeleteProtection</a>,
     * then delete the firewall by calling <a>DeleteFirewall</a>.
     * </p>
     * 
     * @param deleteFirewallRequest
     * @return Result of the DeleteFirewall operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws UnsupportedOperationException
     *         The operation you requested isn't supported by Network Firewall.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DeleteFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFirewallResult deleteFirewall(DeleteFirewallRequest deleteFirewallRequest);

    /**
     * <p>
     * Deletes the specified <a>FirewallPolicy</a>.
     * </p>
     * 
     * @param deleteFirewallPolicyRequest
     * @return Result of the DeleteFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws UnsupportedOperationException
     *         The operation you requested isn't supported by Network Firewall.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DeleteFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFirewallPolicyResult deleteFirewallPolicy(DeleteFirewallPolicyRequest deleteFirewallPolicyRequest);

    /**
     * <p>
     * Deletes a resource policy that you created in a <a>PutResourcePolicy</a> request.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param deleteRuleGroupRequest
     * @return Result of the DeleteRuleGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws UnsupportedOperationException
     *         The operation you requested isn't supported by Network Firewall.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest);

    /**
     * <p>
     * Returns the data objects for the specified firewall.
     * </p>
     * 
     * @param describeFirewallRequest
     * @return Result of the DescribeFirewall operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DescribeFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFirewallResult describeFirewall(DescribeFirewallRequest describeFirewallRequest);

    /**
     * <p>
     * Returns the data objects for the specified firewall policy.
     * </p>
     * 
     * @param describeFirewallPolicyRequest
     * @return Result of the DescribeFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.DescribeFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFirewallPolicyResult describeFirewallPolicy(DescribeFirewallPolicyRequest describeFirewallPolicyRequest);

    /**
     * <p>
     * Returns the logging configuration for the specified firewall.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     * @return Result of the DescribeLoggingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoggingConfigurationResult describeLoggingConfiguration(DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves a resource policy that you created in a <a>PutResourcePolicy</a> request.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return Result of the DescribeResourcePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourcePolicyResult describeResourcePolicy(DescribeResourcePolicyRequest describeResourcePolicyRequest);

    /**
     * <p>
     * Returns the data objects for the specified rule group.
     * </p>
     * 
     * @param describeRuleGroupRequest
     * @return Result of the DescribeRuleGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.DescribeRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRuleGroupResult describeRuleGroup(DescribeRuleGroupRequest describeRuleGroupRequest);

    /**
     * <p>
     * Removes the specified subnet associations from the firewall. This removes the firewall endpoints from the subnets
     * and removes any network filtering protections that the endpoints were providing.
     * </p>
     * 
     * @param disassociateSubnetsRequest
     * @return Result of the DisassociateSubnets operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DisassociateSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DisassociateSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSubnetsResult disassociateSubnets(DisassociateSubnetsRequest disassociateSubnetsRequest);

    /**
     * <p>
     * Retrieves the metadata for the firewall policies that you have defined. Depending on your setting for max results
     * and the number of firewall policies, a single call might not return the full list.
     * </p>
     * 
     * @param listFirewallPoliciesRequest
     * @return Result of the ListFirewallPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.ListFirewallPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListFirewallPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListFirewallPoliciesResult listFirewallPolicies(ListFirewallPoliciesRequest listFirewallPoliciesRequest);

    /**
     * <p>
     * Retrieves the metadata for the firewalls that you have defined. If you provide VPC identifiers in your request,
     * this returns only the firewalls for those VPCs.
     * </p>
     * <p>
     * Depending on your setting for max results and the number of firewalls, a single call might not return the full
     * list.
     * </p>
     * 
     * @param listFirewallsRequest
     * @return Result of the ListFirewalls operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.ListFirewalls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListFirewalls" target="_top">AWS
     *      API Documentation</a>
     */
    ListFirewallsResult listFirewalls(ListFirewallsRequest listFirewallsRequest);

    /**
     * <p>
     * Retrieves the metadata for the rule groups that you have defined. Depending on your setting for max results and
     * the number of rule groups, a single call might not return the full list.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return Result of the ListRuleGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest);

    /**
     * <p>
     * Retrieves the tags associated with the specified resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and
     * rule groups.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @sample AWSNetworkFirewall.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates or updates an AWS Identity and Access Management policy for your rule group or firewall policy. Use this
     * to share rule groups and firewall policies between accounts. This operation works in conjunction with the AWS
     * Resource Access Manager (RAM) service to manage resource sharing for Network Firewall.
     * </p>
     * <p>
     * Use this operation to create or update a resource policy for your rule group or firewall policy. In the policy,
     * you specify the accounts that you want to share the resource with and the operations that you want the accounts
     * to be able to perform.
     * </p>
     * <p>
     * When you add an account in the resource policy, you then run the following Resource Access Manager (RAM)
     * operations to access and accept the shared rule group or firewall policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_GetResourceShareInvitations.html">
     * GetResourceShareInvitations</a> - Returns the Amazon Resource Names (ARNs) of the resource share invitations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_AcceptResourceShareInvitation.html">
     * AcceptResourceShareInvitation</a> - Accepts the share invitation for a specified resource share.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information about resource sharing using RAM, see <a
     * href="https://docs.aws.amazon.com/ram/latest/userguide/what-is.html">AWS Resource Access Manager User Guide</a>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidResourcePolicyException
     * @sample AWSNetworkFirewall.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource. Tags are key:value pairs that you can use to categorize and
     * manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the
     * value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for
     * a resource.
     * </p>
     * <p>
     * You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and
     * rule groups.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @sample AWSNetworkFirewall.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the tags with the specified keys from the specified resource. Tags are key:value pairs that you can use
     * to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can manage tags for the AWS resources that you manage through AWS Network Firewall: firewalls, firewall
     * policies, and rule groups.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @sample AWSNetworkFirewall.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies the flag, <code>DeleteProtection</code>, which indicates whether it is possible to delete the firewall.
     * If the flag is set to <code>TRUE</code>, the firewall is protected against deletion. This setting helps protect
     * against accidentally deleting a firewall that's in use.
     * </p>
     * 
     * @param updateFirewallDeleteProtectionRequest
     * @return Result of the UpdateFirewallDeleteProtection operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws ResourceOwnerCheckException
     * @sample AWSNetworkFirewall.UpdateFirewallDeleteProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallDeleteProtection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallDeleteProtectionResult updateFirewallDeleteProtection(UpdateFirewallDeleteProtectionRequest updateFirewallDeleteProtectionRequest);

    /**
     * <p>
     * Modifies the description for the specified firewall. Use the description to help you identify the firewall when
     * you're working with it.
     * </p>
     * 
     * @param updateFirewallDescriptionRequest
     * @return Result of the UpdateFirewallDescription operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @sample AWSNetworkFirewall.UpdateFirewallDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallDescription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallDescriptionResult updateFirewallDescription(UpdateFirewallDescriptionRequest updateFirewallDescriptionRequest);

    /**
     * <p>
     * Updates the properties of the specified firewall policy.
     * </p>
     * 
     * @param updateFirewallPolicyRequest
     * @return Result of the UpdateFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @sample AWSNetworkFirewall.UpdateFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallPolicyResult updateFirewallPolicy(UpdateFirewallPolicyRequest updateFirewallPolicyRequest);

    /**
     * <p/>
     * 
     * @param updateFirewallPolicyChangeProtectionRequest
     * @return Result of the UpdateFirewallPolicyChangeProtection operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws ResourceOwnerCheckException
     * @sample AWSNetworkFirewall.UpdateFirewallPolicyChangeProtection
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallPolicyChangeProtection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFirewallPolicyChangeProtectionResult updateFirewallPolicyChangeProtection(
            UpdateFirewallPolicyChangeProtectionRequest updateFirewallPolicyChangeProtectionRequest);

    /**
     * <p>
     * Sets the logging configuration for the specified firewall.
     * </p>
     * <p>
     * To change the logging configuration, retrieve the <a>LoggingConfiguration</a> by calling
     * <a>DescribeLoggingConfiguration</a>, then change it and provide the modified object to this update call. You must
     * change the logging configuration one <a>LogDestinationConfig</a> at a time inside the retrieved
     * <a>LoggingConfiguration</a> object.
     * </p>
     * <p>
     * You can perform only one of the following actions in any call to <code>UpdateLoggingConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a new log destination object by adding a single <code>LogDestinationConfig</code> array element to
     * <code>LogDestinationConfigs</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete a log destination object by removing a single <code>LogDestinationConfig</code> array element from
     * <code>LogDestinationConfigs</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the <code>LogDestination</code> setting in a single <code>LogDestinationConfig</code> array element.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change the <code>LogDestinationType</code> or <code>LogType</code> in a
     * <code>LogDestinationConfig</code>. To change these settings, delete the existing
     * <code>LogDestinationConfig</code> object and create a new one, using two separate calls to this update operation.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws LogDestinationPermissionException
     *         Unable to send logs to a configured logging destination.
     * @sample AWSNetworkFirewall.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest);

    /**
     * <p>
     * Updates the rule settings for the specified rule group. You use a rule group by reference in one or more firewall
     * policies. When you modify a rule group, you modify all firewall policies that use the rule group.
     * </p>
     * <p>
     * To update a rule group, first call <a>DescribeRuleGroup</a> to retrieve the current <a>RuleGroup</a> object,
     * update the object as needed, and then provide the updated object to this call.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return Result of the UpdateRuleGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @sample AWSNetworkFirewall.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest);

    /**
     * <p/>
     * 
     * @param updateSubnetChangeProtectionRequest
     * @return Result of the UpdateSubnetChangeProtection operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws ResourceOwnerCheckException
     * @sample AWSNetworkFirewall.UpdateSubnetChangeProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateSubnetChangeProtection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSubnetChangeProtectionResult updateSubnetChangeProtection(UpdateSubnetChangeProtectionRequest updateSubnetChangeProtectionRequest);

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
