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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For Resolver list operations (<a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
 * >ListResolverEndpoints</a>, <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
 * >ListResolverRules</a>, <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
 * >ListResolverRuleAssociations</a>, <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
 * >ListResolverQueryLogConfigs</a>, <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
 * >ListResolverQueryLogConfigAssociations</a>), and <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverDnssecConfigs.html"
 * >ListResolverDnssecConfigs</a>), an optional specification to return a subset of objects.
 * </p>
 * <p>
 * To filter objects, such as Resolver endpoints or Resolver rules, you specify <code>Name</code> and
 * <code>Values</code>. For example, to list only inbound Resolver endpoints, specify <code>Direction</code> for
 * <code>Name</code> and specify <code>INBOUND</code> for <code>Values</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter that you want to use to filter objects.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     * >ListResolverEndpoints</a>, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     * >ListResolverRules</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     * >ListResolverRuleAssociations</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     * >ListResolverQueryLogConfigs</a>, or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     * >ListResolverQueryLogConfigAssociations</a>.
     * </p>
     * <note>
     * <p>
     * In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     * delimiters. For example, <code>CreatorRequestId</code> was originally listed as <code>CREATOR_REQUEST_ID</code>.
     * Uppercase values for <code>Name</code> are still supported.
     * </p>
     * </note>
     * <p>
     * <b>ListResolverEndpoints</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     * <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     * <code>Values</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your network to
     * your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs to your network.
     * In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     * >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     * >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the <code>HostVPCId</code>
     * element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     * Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>, <code>ACTION_NEEDED</code>, or
     * <code>DELETING</code>. For more information, see <code>Status</code> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html"
     * >ResolverEndpoint</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRules</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In the
     * value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For example, if
     * the domain name is example.com, specify the following value. Note the "." after <code>com</code>:
     * </p>
     * <p>
     * <code>example.com.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated with.
     * </p>
     * <note>
     * <p>
     * You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     * <code>RuleType</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for <code>Name</code>,
     * specify one of the following status codes for <code>Values</code>: <code>COMPLETE</code>, <code>DELETING</code>,
     * <code>UPDATING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>, specify
     * <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRuleAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigs</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN for the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix time
     * format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudWatchLogs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisFirehose</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value can be
     * the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other AWS
     * accounts, or was shared with the current account by another AWS account. Valid values include:
     * <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the VPC was associated with the query logging configuration, in
     * Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     * <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * When you're using a <code>List</code> operation and you want the operation to return a subset of objects, such as
     * Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter objects. For
     * example, to list only inbound Resolver endpoints, specify <code>Direction</code> for <code>Name</code> and
     * specify <code>INBOUND</code> for <code>Values</code>.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the parameter that you want to use to filter objects.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     * >ListResolverEndpoints</a>, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     * >ListResolverRules</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     * >ListResolverRuleAssociations</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     * >ListResolverQueryLogConfigs</a>, or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     * >ListResolverQueryLogConfigAssociations</a>.
     * </p>
     * <note>
     * <p>
     * In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     * delimiters. For example, <code>CreatorRequestId</code> was originally listed as <code>CREATOR_REQUEST_ID</code>.
     * Uppercase values for <code>Name</code> are still supported.
     * </p>
     * </note>
     * <p>
     * <b>ListResolverEndpoints</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     * <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     * <code>Values</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your network to
     * your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs to your network.
     * In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     * >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     * >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the <code>HostVPCId</code>
     * element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     * Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>, <code>ACTION_NEEDED</code>, or
     * <code>DELETING</code>. For more information, see <code>Status</code> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html"
     * >ResolverEndpoint</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRules</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In the
     * value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For example, if
     * the domain name is example.com, specify the following value. Note the "." after <code>com</code>:
     * </p>
     * <p>
     * <code>example.com.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated with.
     * </p>
     * <note>
     * <p>
     * You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     * <code>RuleType</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for <code>Name</code>,
     * specify one of the following status codes for <code>Values</code>: <code>COMPLETE</code>, <code>DELETING</code>,
     * <code>UPDATING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>, specify
     * <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRuleAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigs</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN for the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix time
     * format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudWatchLogs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisFirehose</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value can be
     * the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other AWS
     * accounts, or was shared with the current account by another AWS account. Valid values include:
     * <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the VPC was associated with the query logging configuration, in
     * Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     * <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the parameter that you want to use to filter objects.</p>
     *        <p>
     *        The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     *        >ListResolverEndpoints</a>, <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     *        >ListResolverRules</a>, <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     *        >ListResolverRuleAssociations</a>, <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     *        >ListResolverQueryLogConfigs</a>, or <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     *        >ListResolverQueryLogConfigAssociations</a>.
     *        </p>
     *        <note>
     *        <p>
     *        In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     *        delimiters. For example, <code>CreatorRequestId</code> was originally listed as
     *        <code>CREATOR_REQUEST_ID</code>. Uppercase values for <code>Name</code> are still supported.
     *        </p>
     *        </note>
     *        <p>
     *        <b>ListResolverEndpoints</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     *        <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     *        <code>Values</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your
     *        network to your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs
     *        to your network. In a <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     *        >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     *        >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the
     *        <code>HostVPCId</code> element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver
     *        endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the Resolver endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     *        Resolver endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     *        <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *        <code>CREATING</code>, <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>,
     *        <code>ACTION_NEEDED</code>, or <code>DELETING</code>. For more information, see <code>Status</code> in <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html">
     *        ResolverEndpoint</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverRules</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In
     *        the value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For
     *        example, if the domain name is example.com, specify the following value. Note the "." after
     *        <code>com</code>:
     *        </p>
     *        <p>
     *        <code>example.com.</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the Resolver rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated
     *        with.
     *        </p>
     *        <note>
     *        <p>
     *        You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     *        <code>RuleType</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for
     *        <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *        <code>COMPLETE</code>, <code>DELETING</code>, <code>UPDATING</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>,
     *        specify <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverRuleAssociations</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the Resolver rule association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     *        <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *        <code>CREATING</code>, <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverQueryLogConfigs</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Arn</code>: The ARN for the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AssociationCount</code>: The number of VPCs that are associated with the query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix
     *        time format and Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudWatchLogs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisFirehose</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value
     *        can be the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other
     *        AWS accounts, or was shared with the current account by another AWS account. Valid values include:
     *        <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code> for
     *        <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     *        <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     *        >Status</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverQueryLogConfigAssociations</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The date and time that the VPC was associated with the query logging
     *        configuration, in Unix time format and Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     *        <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated
     *        with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     *        <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     *        <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     *        >Status</a>.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter that you want to use to filter objects.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     * >ListResolverEndpoints</a>, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     * >ListResolverRules</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     * >ListResolverRuleAssociations</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     * >ListResolverQueryLogConfigs</a>, or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     * >ListResolverQueryLogConfigAssociations</a>.
     * </p>
     * <note>
     * <p>
     * In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     * delimiters. For example, <code>CreatorRequestId</code> was originally listed as <code>CREATOR_REQUEST_ID</code>.
     * Uppercase values for <code>Name</code> are still supported.
     * </p>
     * </note>
     * <p>
     * <b>ListResolverEndpoints</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     * <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     * <code>Values</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your network to
     * your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs to your network.
     * In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     * >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     * >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the <code>HostVPCId</code>
     * element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     * Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>, <code>ACTION_NEEDED</code>, or
     * <code>DELETING</code>. For more information, see <code>Status</code> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html"
     * >ResolverEndpoint</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRules</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In the
     * value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For example, if
     * the domain name is example.com, specify the following value. Note the "." after <code>com</code>:
     * </p>
     * <p>
     * <code>example.com.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated with.
     * </p>
     * <note>
     * <p>
     * You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     * <code>RuleType</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for <code>Name</code>,
     * specify one of the following status codes for <code>Values</code>: <code>COMPLETE</code>, <code>DELETING</code>,
     * <code>UPDATING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>, specify
     * <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRuleAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigs</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN for the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix time
     * format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudWatchLogs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisFirehose</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value can be
     * the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other AWS
     * accounts, or was shared with the current account by another AWS account. Valid values include:
     * <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the VPC was associated with the query logging configuration, in
     * Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     * <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the parameter that you want to use to filter objects.</p>
     *         <p>
     *         The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     *         >ListResolverEndpoints</a>, <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     *         >ListResolverRules</a>, <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     *         >ListResolverRuleAssociations</a>, <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     *         >ListResolverQueryLogConfigs</a>, or <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     *         >ListResolverQueryLogConfigAssociations</a>.
     *         </p>
     *         <note>
     *         <p>
     *         In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     *         delimiters. For example, <code>CreatorRequestId</code> was originally listed as
     *         <code>CREATOR_REQUEST_ID</code>. Uppercase values for <code>Name</code> are still supported.
     *         </p>
     *         </note>
     *         <p>
     *         <b>ListResolverEndpoints</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     *         <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     *         <code>Values</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your
     *         network to your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs
     *         to your network. In a <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     *         >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     *         >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the
     *         <code>HostVPCId</code> element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver
     *         endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code>: The name of the Resolver endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     *         Resolver endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     *         <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *         <code>CREATING</code>, <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>,
     *         <code>ACTION_NEEDED</code>, or <code>DELETING</code>. For more information, see <code>Status</code> in <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html">
     *         ResolverEndpoint</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>ListResolverRules</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In
     *         the value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For
     *         example, if the domain name is example.com, specify the following value. Note the "." after
     *         <code>com</code>:
     *         </p>
     *         <p>
     *         <code>example.com.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code>: The name of the Resolver rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated
     *         with.
     *         </p>
     *         <note>
     *         <p>
     *         You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     *         <code>RuleType</code>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for
     *         <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *         <code>COMPLETE</code>, <code>DELETING</code>, <code>UPDATING</code>, or <code>FAILED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>,
     *         specify <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>ListResolverRuleAssociations</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Name</code>: The name of the Resolver rule association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     *         <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *         <code>CREATING</code>, <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>ListResolverQueryLogConfigs</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Arn</code>: The ARN for the query logging configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AssociationCount</code>: The number of VPCs that are associated with the query logging
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix
     *         time format and Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>S3</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CloudWatchLogs</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KinesisFirehose</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value
     *         can be the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Id</code>: The ID of the query logging configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code>: The name of the query logging configuration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other
     *         AWS accounts, or was shared with the current account by another AWS account. Valid values include:
     *         <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code>
     *         for <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     *         <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     *         >Status</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>ListResolverQueryLogConfigAssociations</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreationTime</code>: The date and time that the VPC was associated with the query logging
     *         configuration, in Unix time format and Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     *         <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Id</code>: The ID of the query logging association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated
     *         with.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     *         <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     *         <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     *         >Status</a>.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter that you want to use to filter objects.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     * >ListResolverEndpoints</a>, <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     * >ListResolverRules</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     * >ListResolverRuleAssociations</a>, <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     * >ListResolverQueryLogConfigs</a>, or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     * >ListResolverQueryLogConfigAssociations</a>.
     * </p>
     * <note>
     * <p>
     * In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     * delimiters. For example, <code>CreatorRequestId</code> was originally listed as <code>CREATOR_REQUEST_ID</code>.
     * Uppercase values for <code>Name</code> are still supported.
     * </p>
     * </note>
     * <p>
     * <b>ListResolverEndpoints</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     * <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     * <code>Values</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your network to
     * your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs to your network.
     * In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     * >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     * >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the <code>HostVPCId</code>
     * element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     * Resolver endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>, <code>ACTION_NEEDED</code>, or
     * <code>DELETING</code>. For more information, see <code>Status</code> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html"
     * >ResolverEndpoint</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRules</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In the
     * value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For example, if
     * the domain name is example.com, specify the following value. Note the "." after <code>com</code>:
     * </p>
     * <p>
     * <code>example.com.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated with.
     * </p>
     * <note>
     * <p>
     * You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     * <code>RuleType</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for <code>Name</code>,
     * specify one of the following status codes for <code>Values</code>: <code>COMPLETE</code>, <code>DELETING</code>,
     * <code>UPDATING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>, specify
     * <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverRuleAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>: The name of the Resolver rule association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     * <code>Name</code>, specify one of the following status codes for <code>Values</code>: <code>CREATING</code>,
     * <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigs</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Arn</code>: The ARN for the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AssociationCount</code>: The number of VPCs that are associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix time
     * format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudWatchLogs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisFirehose</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value can be
     * the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>: The name of the query logging configuration
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other AWS
     * accounts, or was shared with the current account by another AWS account. Valid values include:
     * <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>ListResolverQueryLogConfigAssociations</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>: The date and time that the VPC was associated with the query logging configuration, in
     * Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     * <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Id</code>: The ID of the query logging association.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     * <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     * <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     * >Status</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the parameter that you want to use to filter objects.</p>
     *        <p>
     *        The valid values for <code>Name</code> depend on the action that you're including the filter in, <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverEndpoints.html"
     *        >ListResolverEndpoints</a>, <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
     *        >ListResolverRules</a>, <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html"
     *        >ListResolverRuleAssociations</a>, <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigs.html"
     *        >ListResolverQueryLogConfigs</a>, or <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverQueryLogConfigAssociations.html"
     *        >ListResolverQueryLogConfigAssociations</a>.
     *        </p>
     *        <note>
     *        <p>
     *        In early versions of Resolver, values for <code>Name</code> were listed as uppercase, with underscore (_)
     *        delimiters. For example, <code>CreatorRequestId</code> was originally listed as
     *        <code>CREATOR_REQUEST_ID</code>. Uppercase values for <code>Name</code> are still supported.
     *        </p>
     *        </note>
     *        <p>
     *        <b>ListResolverEndpoints</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: The value that you specified when you created the Resolver endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Direction</code>: Whether you want to return inbound or outbound Resolver endpoints. If you specify
     *        <code>DIRECTION</code> for <code>Name</code>, specify <code>INBOUND</code> or <code>OUTBOUND</code> for
     *        <code>Values</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HostVpcId</code>: The ID of the VPC that inbound DNS queries pass through on the way from your
     *        network to your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs
     *        to your network. In a <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
     *        >CreateResolverEndpoint</a> request, <code>SubnetId</code> indirectly identifies the VPC. In a <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverEndpoint.html"
     *        >GetResolverEndpoint</a> request, the VPC ID for a Resolver endpoint is returned in the
     *        <code>HostVPCId</code> element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IpAddressCount</code>: The number of IP addresses that you have associated with the Resolver
     *        endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the Resolver endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SecurityGroupIds</code>: The IDs of the VPC security groups that you specified when you created the
     *        Resolver endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the Resolver endpoint. If you specify <code>Status</code> for
     *        <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *        <code>CREATING</code>, <code>OPERATIONAL</code>, <code>UPDATING</code>, <code>AUTO_RECOVERING</code>,
     *        <code>ACTION_NEEDED</code>, or <code>DELETING</code>. For more information, see <code>Status</code> in <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverEndpoint.html">
     *        ResolverEndpoint</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverRules</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: The value that you specified when you created the Resolver rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DomainName</code>: The domain name for which Resolver is forwarding DNS queries to your network. In
     *        the value that you specify for <code>Values</code>, include a trailing dot (.) after the domain name. For
     *        example, if the domain name is example.com, specify the following value. Note the "." after
     *        <code>com</code>:
     *        </p>
     *        <p>
     *        <code>example.com.</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the Resolver rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverEndpointId</code>: The ID of the Resolver endpoint that the Resolver rule is associated
     *        with.
     *        </p>
     *        <note>
     *        <p>
     *        You can filter on the Resolver endpoint only for rules that have a value of <code>FORWARD</code> for
     *        <code>RuleType</code>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the Resolver rule. If you specify <code>Status</code> for
     *        <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *        <code>COMPLETE</code>, <code>DELETING</code>, <code>UPDATING</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Type</code>: The type of the Resolver rule. If you specify <code>TYPE</code> for <code>Name</code>,
     *        specify <code>FORWARD</code> or <code>SYSTEM</code> for <code>Values</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverRuleAssociations</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the Resolver rule association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverRuleId</code>: The ID of the Resolver rule that is associated with one or more VPCs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the Resolver rule association. If you specify <code>Status</code> for
     *        <code>Name</code>, specify one of the following status codes for <code>Values</code>:
     *        <code>CREATING</code>, <code>COMPLETE</code>, <code>DELETING</code>, or <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPCId</code>: The ID of the VPC that the Resolver rule is associated with.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverQueryLogConfigs</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Arn</code>: The ARN for the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AssociationCount</code>: The number of VPCs that are associated with the query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The date and time that the query logging configuration was created, in Unix
     *        time format and Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatorRequestId</code>: A unique string that identifies the request that created the query logging
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Destination</code>: The AWS service that you want to forward query logs to. Valid values include the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudWatchLogs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisFirehose</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationArn</code>: The ARN of the location that Resolver is sending query logs to. This value
     *        can be the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code>: The name of the query logging configuration
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OwnerId</code>: The AWS account ID for the account that created the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ShareStatus</code>: An indication of whether the query logging configuration is shared with other
     *        AWS accounts, or was shared with the current account by another AWS account. Valid values include:
     *        <code>NOT_SHARED</code>, <code>SHARED_WITH_ME</code>, or <code>SHARED_BY_ME</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the query logging configuration. If you specify <code>Status</code> for
     *        <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     *        <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfig.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfig-Status"
     *        >Status</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>ListResolverQueryLogConfigAssociations</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreationTime</code>: The date and time that the VPC was associated with the query logging
     *        configuration, in Unix time format and Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Error</code>: If the value of <code>Status</code> is <code>FAILED</code>, specify the cause:
     *        <code>DESTINATION_NOT_FOUND</code> or <code>ACCESS_DENIED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Id</code>: The ID of the query logging association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResolverQueryLogConfigId</code>: The ID of the query logging configuration that a VPC is associated
     *        with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceId</code>: The ID of the Amazon VPC that is associated with the query logging configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>: The status of the query logging association. If you specify <code>Status</code> for
     *        <code>Name</code>, specify the applicable status code for <code>Values</code>: <code>CREATING</code>,
     *        <code>CREATED</code>, <code>DELETING</code>, or <code>FAILED</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ResolverQueryLogConfigAssociation.html#Route53Resolver-Type-route53resolver_ResolverQueryLogConfigAssociation-Status"
     *        >Status</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When you're using a <code>List</code> operation and you want the operation to return a subset of objects, such as
     * Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter objects. For
     * example, to list only inbound Resolver endpoints, specify <code>Direction</code> for <code>Name</code> and
     * specify <code>INBOUND</code> for <code>Values</code>.
     * </p>
     * 
     * @return When you're using a <code>List</code> operation and you want the operation to return a subset of objects,
     *         such as Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter
     *         objects. For example, to list only inbound Resolver endpoints, specify <code>Direction</code> for
     *         <code>Name</code> and specify <code>INBOUND</code> for <code>Values</code>.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * When you're using a <code>List</code> operation and you want the operation to return a subset of objects, such as
     * Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter objects. For
     * example, to list only inbound Resolver endpoints, specify <code>Direction</code> for <code>Name</code> and
     * specify <code>INBOUND</code> for <code>Values</code>.
     * </p>
     * 
     * @param values
     *        When you're using a <code>List</code> operation and you want the operation to return a subset of objects,
     *        such as Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter
     *        objects. For example, to list only inbound Resolver endpoints, specify <code>Direction</code> for
     *        <code>Name</code> and specify <code>INBOUND</code> for <code>Values</code>.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * When you're using a <code>List</code> operation and you want the operation to return a subset of objects, such as
     * Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter objects. For
     * example, to list only inbound Resolver endpoints, specify <code>Direction</code> for <code>Name</code> and
     * specify <code>INBOUND</code> for <code>Values</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        When you're using a <code>List</code> operation and you want the operation to return a subset of objects,
     *        such as Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter
     *        objects. For example, to list only inbound Resolver endpoints, specify <code>Direction</code> for
     *        <code>Name</code> and specify <code>INBOUND</code> for <code>Values</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When you're using a <code>List</code> operation and you want the operation to return a subset of objects, such as
     * Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter objects. For
     * example, to list only inbound Resolver endpoints, specify <code>Direction</code> for <code>Name</code> and
     * specify <code>INBOUND</code> for <code>Values</code>.
     * </p>
     * 
     * @param values
     *        When you're using a <code>List</code> operation and you want the operation to return a subset of objects,
     *        such as Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter
     *        objects. For example, to list only inbound Resolver endpoints, specify <code>Direction</code> for
     *        <code>Name</code> and specify <code>INBOUND</code> for <code>Values</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
