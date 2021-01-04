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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the VPC of the Amazon ES destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/VpcConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon ES
     * destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the
     * subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data
     * Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these
     * ENIs.
     * </p>
     * <p>
     * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     * automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     * throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis
     * Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For
     * more information about ENI quota, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network Interfaces
     * </a> in the Amazon VPC Quotas topic.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination VPC. You
     * can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In either case, make
     * sure that the role trusts the Kinesis Data Firehose service principal and that it grants the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcAttribute</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSecurityGroups</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterfacePermission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale out by
     * creating more ENIs when necessary. You might therefore see a degradation in performance.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC of the
     * Amazon ES destination. You can use the same security group that the Amazon ES domain uses or different ones. If
     * you specify different security groups here, ensure that they allow outbound HTTPS traffic to the Amazon ES
     * domain's security group. Also ensure that the Amazon ES domain's security group allows HTTPS traffic from the
     * security groups specified here. If you use the same security group for both your delivery stream and the Amazon
     * ES domain, make sure the security group inbound rule allows HTTPS traffic. For more information about security
     * group rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules">Security group
     * rules</a> in the Amazon VPC documentation.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon ES
     * destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the
     * subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data
     * Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these
     * ENIs.
     * </p>
     * <p>
     * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     * automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     * throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis
     * Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For
     * more information about ENI quota, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network Interfaces
     * </a> in the Amazon VPC Quotas topic.
     * </p>
     * 
     * @return The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon
     *         ES destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow
     *         from the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
     *         endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are specified here.
     *         Do not delete or modify these ENIs.</p>
     *         <p>
     *         The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     *         automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to
     *         match throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume
     *         that Kinesis Data Firehose can create up to three ENIs for this delivery stream for each of the subnets
     *         specified here. For more information about ENI quota, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network
     *         Interfaces </a> in the Amazon VPC Quotas topic.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon ES
     * destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the
     * subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data
     * Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these
     * ENIs.
     * </p>
     * <p>
     * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     * automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     * throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis
     * Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For
     * more information about ENI quota, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network Interfaces
     * </a> in the Amazon VPC Quotas topic.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon
     *        ES destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow
     *        from the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
     *        endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are specified here.
     *        Do not delete or modify these ENIs.</p>
     *        <p>
     *        The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     *        automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     *        throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that
     *        Kinesis Data Firehose can create up to three ENIs for this delivery stream for each of the subnets
     *        specified here. For more information about ENI quota, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network
     *        Interfaces </a> in the Amazon VPC Quotas topic.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon ES
     * destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the
     * subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data
     * Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these
     * ENIs.
     * </p>
     * <p>
     * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     * automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     * throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis
     * Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For
     * more information about ENI quota, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network Interfaces
     * </a> in the Amazon VPC Quotas topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon
     *        ES destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow
     *        from the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
     *        endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are specified here.
     *        Do not delete or modify these ENIs.</p>
     *        <p>
     *        The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     *        automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     *        throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that
     *        Kinesis Data Firehose can create up to three ENIs for this delivery stream for each of the subnets
     *        specified here. For more information about ENI quota, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network
     *        Interfaces </a> in the Amazon VPC Quotas topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon ES
     * destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the
     * subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data
     * Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these
     * ENIs.
     * </p>
     * <p>
     * The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     * automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     * throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis
     * Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For
     * more information about ENI quota, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network Interfaces
     * </a> in the Amazon VPC Quotas topic.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon
     *        ES destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow
     *        from the subnets whose IDs are specified here to the subnets that have the destination Amazon ES
     *        endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are specified here.
     *        Do not delete or modify these ENIs.</p>
     *        <p>
     *        The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down
     *        automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match
     *        throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that
     *        Kinesis Data Firehose can create up to three ENIs for this delivery stream for each of the subnets
     *        specified here. For more information about ENI quota, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html#vpc-limits-enis">Network
     *        Interfaces </a> in the Amazon VPC Quotas topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination VPC. You
     * can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In either case, make
     * sure that the role trusts the Kinesis Data Firehose service principal and that it grants the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcAttribute</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSecurityGroups</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterfacePermission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale out by
     * creating more ENIs when necessary. You might therefore see a degradation in performance.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination
     *        VPC. You can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In
     *        either case, make sure that the role trusts the Kinesis Data Firehose service principal and that it grants
     *        the following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeVpcs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeVpcAttribute</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeSubnets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeSecurityGroups</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeNetworkInterfaces</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:CreateNetworkInterface</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:CreateNetworkInterfacePermission</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DeleteNetworkInterface</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale
     *        out by creating more ENIs when necessary. You might therefore see a degradation in performance.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination VPC. You
     * can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In either case, make
     * sure that the role trusts the Kinesis Data Firehose service principal and that it grants the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcAttribute</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSecurityGroups</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterfacePermission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale out by
     * creating more ENIs when necessary. You might therefore see a degradation in performance.
     * </p>
     * 
     * @return The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination
     *         VPC. You can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In
     *         either case, make sure that the role trusts the Kinesis Data Firehose service principal and that it
     *         grants the following permissions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ec2:DescribeVpcs</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:DescribeVpcAttribute</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:DescribeSubnets</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:DescribeSecurityGroups</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:DescribeNetworkInterfaces</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:CreateNetworkInterface</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:CreateNetworkInterfacePermission</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:DeleteNetworkInterface</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale
     *         out by creating more ENIs when necessary. You might therefore see a degradation in performance.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination VPC. You
     * can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In either case, make
     * sure that the role trusts the Kinesis Data Firehose service principal and that it grants the following
     * permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcs</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeVpcAttribute</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSubnets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeSecurityGroups</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DescribeNetworkInterfaces</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterface</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:CreateNetworkInterfacePermission</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:DeleteNetworkInterface</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale out by
     * creating more ENIs when necessary. You might therefore see a degradation in performance.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination
     *        VPC. You can use your existing Kinesis Data Firehose delivery role or you can specify a new role. In
     *        either case, make sure that the role trusts the Kinesis Data Firehose service principal and that it grants
     *        the following permissions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeVpcs</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeVpcAttribute</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeSubnets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeSecurityGroups</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DescribeNetworkInterfaces</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:CreateNetworkInterface</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:CreateNetworkInterfacePermission</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:DeleteNetworkInterface</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you revoke these permissions after you create the delivery stream, Kinesis Data Firehose can't scale
     *        out by creating more ENIs when necessary. You might therefore see a degradation in performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC of the
     * Amazon ES destination. You can use the same security group that the Amazon ES domain uses or different ones. If
     * you specify different security groups here, ensure that they allow outbound HTTPS traffic to the Amazon ES
     * domain's security group. Also ensure that the Amazon ES domain's security group allows HTTPS traffic from the
     * security groups specified here. If you use the same security group for both your delivery stream and the Amazon
     * ES domain, make sure the security group inbound rule allows HTTPS traffic. For more information about security
     * group rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules">Security group
     * rules</a> in the Amazon VPC documentation.
     * </p>
     * 
     * @return The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC
     *         of the Amazon ES destination. You can use the same security group that the Amazon ES domain uses or
     *         different ones. If you specify different security groups here, ensure that they allow outbound HTTPS
     *         traffic to the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
     *         allows HTTPS traffic from the security groups specified here. If you use the same security group for both
     *         your delivery stream and the Amazon ES domain, make sure the security group inbound rule allows HTTPS
     *         traffic. For more information about security group rules, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules"
     *         >Security group rules</a> in the Amazon VPC documentation.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC of the
     * Amazon ES destination. You can use the same security group that the Amazon ES domain uses or different ones. If
     * you specify different security groups here, ensure that they allow outbound HTTPS traffic to the Amazon ES
     * domain's security group. Also ensure that the Amazon ES domain's security group allows HTTPS traffic from the
     * security groups specified here. If you use the same security group for both your delivery stream and the Amazon
     * ES domain, make sure the security group inbound rule allows HTTPS traffic. For more information about security
     * group rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules">Security group
     * rules</a> in the Amazon VPC documentation.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC
     *        of the Amazon ES destination. You can use the same security group that the Amazon ES domain uses or
     *        different ones. If you specify different security groups here, ensure that they allow outbound HTTPS
     *        traffic to the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
     *        allows HTTPS traffic from the security groups specified here. If you use the same security group for both
     *        your delivery stream and the Amazon ES domain, make sure the security group inbound rule allows HTTPS
     *        traffic. For more information about security group rules, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules"
     *        >Security group rules</a> in the Amazon VPC documentation.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC of the
     * Amazon ES destination. You can use the same security group that the Amazon ES domain uses or different ones. If
     * you specify different security groups here, ensure that they allow outbound HTTPS traffic to the Amazon ES
     * domain's security group. Also ensure that the Amazon ES domain's security group allows HTTPS traffic from the
     * security groups specified here. If you use the same security group for both your delivery stream and the Amazon
     * ES domain, make sure the security group inbound rule allows HTTPS traffic. For more information about security
     * group rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules">Security group
     * rules</a> in the Amazon VPC documentation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC
     *        of the Amazon ES destination. You can use the same security group that the Amazon ES domain uses or
     *        different ones. If you specify different security groups here, ensure that they allow outbound HTTPS
     *        traffic to the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
     *        allows HTTPS traffic from the security groups specified here. If you use the same security group for both
     *        your delivery stream and the Amazon ES domain, make sure the security group inbound rule allows HTTPS
     *        traffic. For more information about security group rules, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules"
     *        >Security group rules</a> in the Amazon VPC documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC of the
     * Amazon ES destination. You can use the same security group that the Amazon ES domain uses or different ones. If
     * you specify different security groups here, ensure that they allow outbound HTTPS traffic to the Amazon ES
     * domain's security group. Also ensure that the Amazon ES domain's security group allows HTTPS traffic from the
     * security groups specified here. If you use the same security group for both your delivery stream and the Amazon
     * ES domain, make sure the security group inbound rule allows HTTPS traffic. For more information about security
     * group rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules">Security group
     * rules</a> in the Amazon VPC documentation.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC
     *        of the Amazon ES destination. You can use the same security group that the Amazon ES domain uses or
     *        different ones. If you specify different security groups here, ensure that they allow outbound HTTPS
     *        traffic to the Amazon ES domain's security group. Also ensure that the Amazon ES domain's security group
     *        allows HTTPS traffic from the security groups specified here. If you use the same security group for both
     *        your delivery stream and the Amazon ES domain, make sure the security group inbound rule allows HTTPS
     *        traffic. For more information about security group rules, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#SecurityGroupRules"
     *        >Security group rules</a> in the Amazon VPC documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfiguration == false)
            return false;
        VpcConfiguration other = (VpcConfiguration) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfiguration clone() {
        try {
            return (VpcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.VpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
