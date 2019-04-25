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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Batch compute resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ComputeResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of compute environment: EC2 or SPOT.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     */
    private Integer minvCpus;
    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     */
    private Integer maxvCpus;
    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     */
    private Integer desiredvCpus;
    /**
     * <p>
     * The instances types that may be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick instance types (from
     * the C, M, and R instance families) on the fly that match the demand of your job queues.
     * </p>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The VPC subnets into which the compute resources are launched.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The EC2 security group that is associated with instances launched in the compute environment.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The EC2 key pair that is used for instances launched in the compute environment.
     * </p>
     */
    private String ec2KeyPair;
    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the
     * short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * Instance Role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private String instanceRole;
    /**
     * <p>
     * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these
     * take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, {
     * "Name": "AWS Batch Instance - C4OnDemand" }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node
     * parallel jobs to your compute environment, you should consider creating a cluster placement group and associate
     * it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within
     * a single Availability Zone with high network flow potential. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String placementGroup;
    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be
     * below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest (market) price and
     * never more than your maximum percentage. If you leave this field empty, the default value is 100% of the
     * On-Demand price.
     * </p>
     */
    private Integer bidPercentage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code> compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet Role</a>
     * in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private String spotIamFleetRole;
    /**
     * <p>
     * The launch template to use for your compute resources. Any other compute resource parameters that you specify in
     * a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch template. You must
     * specify either the launch template ID or launch template name in the request, but not both. For more information,
     * see <a href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     * Support</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;

    /**
     * <p>
     * The type of compute environment: EC2 or SPOT.
     * </p>
     * 
     * @param type
     *        The type of compute environment: EC2 or SPOT.
     * @see CRType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of compute environment: EC2 or SPOT.
     * </p>
     * 
     * @return The type of compute environment: EC2 or SPOT.
     * @see CRType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of compute environment: EC2 or SPOT.
     * </p>
     * 
     * @param type
     *        The type of compute environment: EC2 or SPOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CRType
     */

    public ComputeResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of compute environment: EC2 or SPOT.
     * </p>
     * 
     * @param type
     *        The type of compute environment: EC2 or SPOT.
     * @see CRType
     */

    public void setType(CRType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of compute environment: EC2 or SPOT.
     * </p>
     * 
     * @param type
     *        The type of compute environment: EC2 or SPOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CRType
     */

    public ComputeResource withType(CRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * 
     * @param minvCpus
     *        The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     *        <code>DISABLED</code>).
     */

    public void setMinvCpus(Integer minvCpus) {
        this.minvCpus = minvCpus;
    }

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * 
     * @return The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     *         <code>DISABLED</code>).
     */

    public Integer getMinvCpus() {
        return this.minvCpus;
    }

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * 
     * @param minvCpus
     *        The minimum number of EC2 vCPUs that an environment should maintain (even if the compute environment is
     *        <code>DISABLED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withMinvCpus(Integer minvCpus) {
        setMinvCpus(minvCpus);
        return this;
    }

    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     * 
     * @param maxvCpus
     *        The maximum number of EC2 vCPUs that an environment can reach.
     */

    public void setMaxvCpus(Integer maxvCpus) {
        this.maxvCpus = maxvCpus;
    }

    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     * 
     * @return The maximum number of EC2 vCPUs that an environment can reach.
     */

    public Integer getMaxvCpus() {
        return this.maxvCpus;
    }

    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     * 
     * @param maxvCpus
     *        The maximum number of EC2 vCPUs that an environment can reach.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withMaxvCpus(Integer maxvCpus) {
        setMaxvCpus(maxvCpus);
        return this;
    }

    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     * 
     * @param desiredvCpus
     *        The desired number of EC2 vCPUS in the compute environment.
     */

    public void setDesiredvCpus(Integer desiredvCpus) {
        this.desiredvCpus = desiredvCpus;
    }

    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     * 
     * @return The desired number of EC2 vCPUS in the compute environment.
     */

    public Integer getDesiredvCpus() {
        return this.desiredvCpus;
    }

    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     * 
     * @param desiredvCpus
     *        The desired number of EC2 vCPUS in the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withDesiredvCpus(Integer desiredvCpus) {
        setDesiredvCpus(desiredvCpus);
        return this;
    }

    /**
     * <p>
     * The instances types that may be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick instance types (from
     * the C, M, and R instance families) on the fly that match the demand of your job queues.
     * </p>
     * 
     * @return The instances types that may be launched. You can specify instance families to launch any instance type
     *         within those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific
     *         sizes within a family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick
     *         instance types (from the C, M, and R instance families) on the fly that match the demand of your job
     *         queues.
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instances types that may be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick instance types (from
     * the C, M, and R instance families) on the fly that match the demand of your job queues.
     * </p>
     * 
     * @param instanceTypes
     *        The instances types that may be launched. You can specify instance families to launch any instance type
     *        within those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes
     *        within a family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick
     *        instance types (from the C, M, and R instance families) on the fly that match the demand of your job
     *        queues.
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instances types that may be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick instance types (from
     * the C, M, and R instance families) on the fly that match the demand of your job queues.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instances types that may be launched. You can specify instance families to launch any instance type
     *        within those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes
     *        within a family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick
     *        instance types (from the C, M, and R instance families) on the fly that match the demand of your job
     *        queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instances types that may be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick instance types (from
     * the C, M, and R instance families) on the fly that match the demand of your job queues.
     * </p>
     * 
     * @param instanceTypes
     *        The instances types that may be launched. You can specify instance families to launch any instance type
     *        within those families (for example, <code>c4</code> or <code>p3</code>), or you can specify specific sizes
     *        within a family (such as <code>c4.8xlarge</code>). You can also choose <code>optimal</code> to pick
     *        instance types (from the C, M, and R instance families) on the fly that match the demand of your job
     *        queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     * </p>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     * </p>
     * 
     * @return The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     * </p>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The VPC subnets into which the compute resources are launched.
     * </p>
     * 
     * @return The VPC subnets into which the compute resources are launched.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The VPC subnets into which the compute resources are launched.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets into which the compute resources are launched.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The VPC subnets into which the compute resources are launched.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets into which the compute resources are launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC subnets into which the compute resources are launched.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets into which the compute resources are launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The EC2 security group that is associated with instances launched in the compute environment.
     * </p>
     * 
     * @return The EC2 security group that is associated with instances launched in the compute environment.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The EC2 security group that is associated with instances launched in the compute environment.
     * </p>
     * 
     * @param securityGroupIds
     *        The EC2 security group that is associated with instances launched in the compute environment.
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
     * The EC2 security group that is associated with instances launched in the compute environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The EC2 security group that is associated with instances launched in the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withSecurityGroupIds(String... securityGroupIds) {
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
     * The EC2 security group that is associated with instances launched in the compute environment.
     * </p>
     * 
     * @param securityGroupIds
     *        The EC2 security group that is associated with instances launched in the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The EC2 key pair that is used for instances launched in the compute environment.
     * </p>
     * 
     * @param ec2KeyPair
     *        The EC2 key pair that is used for instances launched in the compute environment.
     */

    public void setEc2KeyPair(String ec2KeyPair) {
        this.ec2KeyPair = ec2KeyPair;
    }

    /**
     * <p>
     * The EC2 key pair that is used for instances launched in the compute environment.
     * </p>
     * 
     * @return The EC2 key pair that is used for instances launched in the compute environment.
     */

    public String getEc2KeyPair() {
        return this.ec2KeyPair;
    }

    /**
     * <p>
     * The EC2 key pair that is used for instances launched in the compute environment.
     * </p>
     * 
     * @param ec2KeyPair
     *        The EC2 key pair that is used for instances launched in the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withEc2KeyPair(String ec2KeyPair) {
        setEc2KeyPair(ec2KeyPair);
        return this;
    }

    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the
     * short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * Instance Role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param instanceRole
     *        The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify
     *        the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     *        <code> <i>ecsInstanceRole</i> </code> or
     *        <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS Instance
     *        Role</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the
     * short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * Instance Role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify
     *         the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     *         <code> <i>ecsInstanceRole</i> </code> or
     *         <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS Instance
     *         Role</a> in the <i>AWS Batch User Guide</i>.
     */

    public String getInstanceRole() {
        return this.instanceRole;
    }

    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify the
     * short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * Instance Role</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param instanceRole
     *        The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. You can specify
     *        the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     *        <code> <i>ecsInstanceRole</i> </code> or
     *        <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS Instance
     *        Role</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withInstanceRole(String instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * <p>
     * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these
     * take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, {
     * "Name": "AWS Batch Instance - C4OnDemand" }.
     * </p>
     * 
     * @return Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS
     *         Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag
     *         value—for example, { "Name": "AWS Batch Instance - C4OnDemand" }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these
     * take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, {
     * "Name": "AWS Batch Instance - C4OnDemand" }.
     * </p>
     * 
     * @param tags
     *        Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS
     *        Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag
     *        value—for example, { "Name": "AWS Batch Instance - C4OnDemand" }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS Batch, these
     * take the form of "String1": "String2", where String1 is the tag key and String2 is the tag value—for example, {
     * "Name": "AWS Batch Instance - C4OnDemand" }.
     * </p>
     * 
     * @param tags
     *        Key-value pair tags to be applied to resources that are launched in the compute environment. For AWS
     *        Batch, these take the form of "String1": "String2", where String1 is the tag key and String2 is the tag
     *        value—for example, { "Name": "AWS Batch Instance - C4OnDemand" }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public ComputeResource addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node
     * parallel jobs to your compute environment, you should consider creating a cluster placement group and associate
     * it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within
     * a single Availability Zone with high network flow potential. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param placementGroup
     *        The Amazon EC2 placement group to associate with your compute resources. If you intend to submit
     *        multi-node parallel jobs to your compute environment, you should consider creating a cluster placement
     *        group and associate it with your compute resources. This keeps your multi-node parallel job on a logical
     *        grouping of instances within a single Availability Zone with high network flow potential. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node
     * parallel jobs to your compute environment, you should consider creating a cluster placement group and associate
     * it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within
     * a single Availability Zone with high network flow potential. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The Amazon EC2 placement group to associate with your compute resources. If you intend to submit
     *         multi-node parallel jobs to your compute environment, you should consider creating a cluster placement
     *         group and associate it with your compute resources. This keeps your multi-node parallel job on a logical
     *         grouping of instances within a single Availability Zone with high network flow potential. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.
     */

    public String getPlacementGroup() {
        return this.placementGroup;
    }

    /**
     * <p>
     * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node
     * parallel jobs to your compute environment, you should consider creating a cluster placement group and associate
     * it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within
     * a single Availability Zone with high network flow potential. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param placementGroup
     *        The Amazon EC2 placement group to associate with your compute resources. If you intend to submit
     *        multi-node parallel jobs to your compute environment, you should consider creating a cluster placement
     *        group and associate it with your compute resources. This keeps your multi-node parallel job on a logical
     *        grouping of instances within a single Availability Zone with high network flow potential. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement Groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withPlacementGroup(String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be
     * below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest (market) price and
     * never more than your maximum percentage. If you leave this field empty, the default value is 100% of the
     * On-Demand price.
     * </p>
     * 
     * @param bidPercentage
     *        The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that
     *        instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot
     *        price must be below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest
     *        (market) price and never more than your maximum percentage. If you leave this field empty, the default
     *        value is 100% of the On-Demand price.
     */

    public void setBidPercentage(Integer bidPercentage) {
        this.bidPercentage = bidPercentage;
    }

    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be
     * below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest (market) price and
     * never more than your maximum percentage. If you leave this field empty, the default value is 100% of the
     * On-Demand price.
     * </p>
     * 
     * @return The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that
     *         instance type before instances are launched. For example, if your maximum percentage is 20%, then the
     *         Spot price must be below 20% of the current On-Demand price for that EC2 instance. You always pay the
     *         lowest (market) price and never more than your maximum percentage. If you leave this field empty, the
     *         default value is 100% of the On-Demand price.
     */

    public Integer getBidPercentage() {
        return this.bidPercentage;
    }

    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, then the Spot price must be
     * below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest (market) price and
     * never more than your maximum percentage. If you leave this field empty, the default value is 100% of the
     * On-Demand price.
     * </p>
     * 
     * @param bidPercentage
     *        The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that
     *        instance type before instances are launched. For example, if your maximum percentage is 20%, then the Spot
     *        price must be below 20% of the current On-Demand price for that EC2 instance. You always pay the lowest
     *        (market) price and never more than your maximum percentage. If you leave this field empty, the default
     *        value is 100% of the On-Demand price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withBidPercentage(Integer bidPercentage) {
        setBidPercentage(bidPercentage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code> compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet Role</a>
     * in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param spotIamFleetRole
     *        The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code>
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet
     *        Role</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setSpotIamFleetRole(String spotIamFleetRole) {
        this.spotIamFleetRole = spotIamFleetRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code> compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet Role</a>
     * in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code>
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet
     *         Role</a> in the <i>AWS Batch User Guide</i>.
     */

    public String getSpotIamFleetRole() {
        return this.spotIamFleetRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code> compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet Role</a>
     * in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param spotIamFleetRole
     *        The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a <code>SPOT</code>
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 Spot Fleet
     *        Role</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withSpotIamFleetRole(String spotIamFleetRole) {
        setSpotIamFleetRole(spotIamFleetRole);
        return this;
    }

    /**
     * <p>
     * The launch template to use for your compute resources. Any other compute resource parameters that you specify in
     * a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch template. You must
     * specify either the launch template ID or launch template name in the request, but not both. For more information,
     * see <a href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     * Support</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use for your compute resources. Any other compute resource parameters that you
     *        specify in a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch
     *        template. You must specify either the launch template ID or launch template name in the request, but not
     *        both. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     *        Support</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template to use for your compute resources. Any other compute resource parameters that you specify in
     * a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch template. You must
     * specify either the launch template ID or launch template name in the request, but not both. For more information,
     * see <a href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     * Support</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The launch template to use for your compute resources. Any other compute resource parameters that you
     *         specify in a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch
     *         template. You must specify either the launch template ID or launch template name in the request, but not
     *         both. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     *         Support</a> in the <i>AWS Batch User Guide</i>.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template to use for your compute resources. Any other compute resource parameters that you specify in
     * a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch template. You must
     * specify either the launch template ID or launch template name in the request, but not both. For more information,
     * see <a href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     * Support</a> in the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use for your compute resources. Any other compute resource parameters that you
     *        specify in a <a>CreateComputeEnvironment</a> API operation override the same parameters in the launch
     *        template. You must specify either the launch template ID or launch template name in the request, but not
     *        both. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch Template
     *        Support</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResource withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMinvCpus() != null)
            sb.append("MinvCpus: ").append(getMinvCpus()).append(",");
        if (getMaxvCpus() != null)
            sb.append("MaxvCpus: ").append(getMaxvCpus()).append(",");
        if (getDesiredvCpus() != null)
            sb.append("DesiredvCpus: ").append(getDesiredvCpus()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getEc2KeyPair() != null)
            sb.append("Ec2KeyPair: ").append(getEc2KeyPair()).append(",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: ").append(getInstanceRole()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: ").append(getPlacementGroup()).append(",");
        if (getBidPercentage() != null)
            sb.append("BidPercentage: ").append(getBidPercentage()).append(",");
        if (getSpotIamFleetRole() != null)
            sb.append("SpotIamFleetRole: ").append(getSpotIamFleetRole()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeResource == false)
            return false;
        ComputeResource other = (ComputeResource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMinvCpus() == null ^ this.getMinvCpus() == null)
            return false;
        if (other.getMinvCpus() != null && other.getMinvCpus().equals(this.getMinvCpus()) == false)
            return false;
        if (other.getMaxvCpus() == null ^ this.getMaxvCpus() == null)
            return false;
        if (other.getMaxvCpus() != null && other.getMaxvCpus().equals(this.getMaxvCpus()) == false)
            return false;
        if (other.getDesiredvCpus() == null ^ this.getDesiredvCpus() == null)
            return false;
        if (other.getDesiredvCpus() != null && other.getDesiredvCpus().equals(this.getDesiredvCpus()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getEc2KeyPair() == null ^ this.getEc2KeyPair() == null)
            return false;
        if (other.getEc2KeyPair() != null && other.getEc2KeyPair().equals(this.getEc2KeyPair()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPlacementGroup() == null ^ this.getPlacementGroup() == null)
            return false;
        if (other.getPlacementGroup() != null && other.getPlacementGroup().equals(this.getPlacementGroup()) == false)
            return false;
        if (other.getBidPercentage() == null ^ this.getBidPercentage() == null)
            return false;
        if (other.getBidPercentage() != null && other.getBidPercentage().equals(this.getBidPercentage()) == false)
            return false;
        if (other.getSpotIamFleetRole() == null ^ this.getSpotIamFleetRole() == null)
            return false;
        if (other.getSpotIamFleetRole() != null && other.getSpotIamFleetRole().equals(this.getSpotIamFleetRole()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMinvCpus() == null) ? 0 : getMinvCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxvCpus() == null) ? 0 : getMaxvCpus().hashCode());
        hashCode = prime * hashCode + ((getDesiredvCpus() == null) ? 0 : getDesiredvCpus().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getEc2KeyPair() == null) ? 0 : getEc2KeyPair().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode + ((getBidPercentage() == null) ? 0 : getBidPercentage().hashCode());
        hashCode = prime * hashCode + ((getSpotIamFleetRole() == null) ? 0 : getSpotIamFleetRole().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        return hashCode;
    }

    @Override
    public ComputeResource clone() {
        try {
            return (ComputeResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ComputeResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
