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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an issue with an Amazon EKS resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Issue" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Issue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node group.
     * You may be able to recreate an Auto Scaling group with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must recreate
     * your cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your managed
     * node group. Remove any dependencies from the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node group.
     * You may be able to recreate a launch template with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node group does
     * not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created
     * to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group. You may
     * be able to recreate an instance profile with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     * recreate an IAM role with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to launch
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster. Common
     * causes of this failure are insufficient <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     * permissions or lack of outbound internet access for the nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified instance
     * type. You may be able to request an Amazon EC2 instance limit increase to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does not
     * have enough available IP addresses for new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster
     * API server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The AWS resources that are afflicted by this issue.
     * </p>
     */
    private java.util.List<String> resourceIds;

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node group.
     * You may be able to recreate an Auto Scaling group with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must recreate
     * your cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your managed
     * node group. Remove any dependencies from the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node group.
     * You may be able to recreate a launch template with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node group does
     * not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created
     * to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group. You may
     * be able to recreate an instance profile with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     * recreate an IAM role with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to launch
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster. Common
     * causes of this failure are insufficient <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     * permissions or lack of outbound internet access for the nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified instance
     * type. You may be able to request an Amazon EC2 instance limit increase to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does not
     * have enough available IP addresses for new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster
     * API server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        A brief description of the error.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node
     *        group. You may be able to recreate an Auto Scaling group with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must
     *        recreate your cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your
     *        managed node group. Remove any dependencies from the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node
     *        group. You may be able to recreate a launch template with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node
     *        group does not match the version that Amazon EKS created. You may be able to revert to the version that
     *        Amazon EKS created to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group.
     *        You may be able to recreate an instance profile with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     *        recreate an IAM role with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to
     *        launch instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster.
     *        Common causes of this failure are insufficient <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     *        permissions or lack of outbound internet access for the nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified
     *        instance type. You may be able to request an Amazon EC2 instance limit increase to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does
     *        not have enough available IP addresses for new nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your
     *        cluster API server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     *        </p>
     *        </li>
     * @see NodegroupIssueCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node group.
     * You may be able to recreate an Auto Scaling group with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must recreate
     * your cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your managed
     * node group. Remove any dependencies from the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node group.
     * You may be able to recreate a launch template with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node group does
     * not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created
     * to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group. You may
     * be able to recreate an instance profile with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     * recreate an IAM role with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to launch
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster. Common
     * causes of this failure are insufficient <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     * permissions or lack of outbound internet access for the nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified instance
     * type. You may be able to request an Amazon EC2 instance limit increase to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does not
     * have enough available IP addresses for new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster
     * API server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A brief description of the error.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node
     *         group. You may be able to recreate an Auto Scaling group with the same settings to recover.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must
     *         recreate your cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your
     *         managed node group. Remove any dependencies from the security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node
     *         group. You may be able to recreate a launch template with the same settings to recover.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node
     *         group does not match the version that Amazon EKS created. You may be able to revert to the version that
     *         Amazon EKS created to recover.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group.
     *         You may be able to recreate an instance profile with the same settings to recover.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     *         recreate an IAM role with the same settings to recover.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to
     *         launch instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster.
     *         Common causes of this failure are insufficient <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM
     *         role</a> permissions or lack of outbound internet access for the nodes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified
     *         instance type. You may be able to request an Amazon EC2 instance limit increase to recover.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does
     *         not have enough available IP addresses for new nodes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your
     *         cluster API server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     *         </p>
     *         </li>
     * @see NodegroupIssueCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node group.
     * You may be able to recreate an Auto Scaling group with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must recreate
     * your cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your managed
     * node group. Remove any dependencies from the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node group.
     * You may be able to recreate a launch template with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node group does
     * not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created
     * to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group. You may
     * be able to recreate an instance profile with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     * recreate an IAM role with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to launch
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster. Common
     * causes of this failure are insufficient <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     * permissions or lack of outbound internet access for the nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified instance
     * type. You may be able to request an Amazon EC2 instance limit increase to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does not
     * have enough available IP addresses for new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster
     * API server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        A brief description of the error.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node
     *        group. You may be able to recreate an Auto Scaling group with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must
     *        recreate your cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your
     *        managed node group. Remove any dependencies from the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node
     *        group. You may be able to recreate a launch template with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node
     *        group does not match the version that Amazon EKS created. You may be able to revert to the version that
     *        Amazon EKS created to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group.
     *        You may be able to recreate an instance profile with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     *        recreate an IAM role with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to
     *        launch instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster.
     *        Common causes of this failure are insufficient <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     *        permissions or lack of outbound internet access for the nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified
     *        instance type. You may be able to request an Amazon EC2 instance limit increase to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does
     *        not have enough available IP addresses for new nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your
     *        cluster API server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodegroupIssueCode
     */

    public Issue withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node group.
     * You may be able to recreate an Auto Scaling group with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must recreate
     * your cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your managed
     * node group. Remove any dependencies from the security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node group.
     * You may be able to recreate a launch template with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node group does
     * not match the version that Amazon EKS created. You may be able to revert to the version that Amazon EKS created
     * to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group. You may
     * be able to recreate an instance profile with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     * recreate an IAM role with the same settings to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to launch
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster. Common
     * causes of this failure are insufficient <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     * permissions or lack of outbound internet access for the nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified instance
     * type. You may be able to request an Amazon EC2 instance limit increase to recover.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does not
     * have enough available IP addresses for new nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your cluster
     * API server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        A brief description of the error.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AutoScalingGroupNotFound</b>: We couldn't find the Auto Scaling group associated with the managed node
     *        group. You may be able to recreate an Auto Scaling group with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2SecurityGroupNotFound</b>: We couldn't find the cluster security group for the cluster. You must
     *        recreate your cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2SecurityGroupDeletionFailure</b>: We could not delete the remote access security group for your
     *        managed node group. Remove any dependencies from the security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2LaunchTemplateNotFound</b>: We couldn't find the Amazon EC2 launch template for your managed node
     *        group. You may be able to recreate a launch template with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Ec2LaunchTemplateVersionMismatch</b>: The Amazon EC2 launch template version for your managed node
     *        group does not match the version that Amazon EKS created. You may be able to revert to the version that
     *        Amazon EKS created to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IamInstanceProfileNotFound</b>: We couldn't find the IAM instance profile for your managed node group.
     *        You may be able to recreate an instance profile with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IamNodeRoleNotFound</b>: We couldn't find the IAM role for your managed node group. You may be able to
     *        recreate an IAM role with the same settings to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AsgInstanceLaunchFailures</b>: Your Auto Scaling group is experiencing failures while attempting to
     *        launch instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeCreationFailure</b>: Your launched instances are unable to register with your Amazon EKS cluster.
     *        Common causes of this failure are insufficient <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/worker_node_IAM_role.html">worker node IAM role</a>
     *        permissions or lack of outbound internet access for the nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InstanceLimitExceeded</b>: Your AWS account is unable to launch any more instances of the specified
     *        instance type. You may be able to request an Amazon EC2 instance limit increase to recover.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InsufficientFreeAddresses</b>: One or more of the subnets associated with your managed node group does
     *        not have enough available IP addresses for new nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AccessDenied</b>: Amazon EKS or one or more of your managed nodes is unable to communicate with your
     *        cluster API server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>InternalFailure</b>: These errors are usually caused by an Amazon EKS server-side issue.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodegroupIssueCode
     */

    public Issue withCode(NodegroupIssueCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     * 
     * @param message
     *        The error message associated with the issue.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     * 
     * @return The error message associated with the issue.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     * 
     * @param message
     *        The error message associated with the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Issue withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The AWS resources that are afflicted by this issue.
     * </p>
     * 
     * @return The AWS resources that are afflicted by this issue.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The AWS resources that are afflicted by this issue.
     * </p>
     * 
     * @param resourceIds
     *        The AWS resources that are afflicted by this issue.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The AWS resources that are afflicted by this issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The AWS resources that are afflicted by this issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Issue withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS resources that are afflicted by this issue.
     * </p>
     * 
     * @param resourceIds
     *        The AWS resources that are afflicted by this issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Issue withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Issue == false)
            return false;
        Issue other = (Issue) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public Issue clone() {
        try {
            return (Issue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.IssueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
