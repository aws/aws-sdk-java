/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that represents the attributes of a compute environment that can be updated. For more information, see <a
 * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
 * environments</a> in the <i>Batch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ComputeResourceUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResourceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private Integer minvCpus;
    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * </note>
     */
    private Integer maxvCpus;
    /**
     * <p>
     * The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and maximum
     * values based on job queue demand.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't specify this
     * parameter for compute environments using Amazon EKS clusters.
     * </p>
     * </note> <note>
     * <p>
     * When you update the <code>desiredvCpus</code> setting, the value must be between the <code>minvCpus</code> and
     * <code>maxvCpus</code> values.
     * </p>
     * <p>
     * Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     * <code>desiredvCpus</code> value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     * >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     */
    private Integer desiredvCpus;
    /**
     * <p>
     * The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16 subnets.
     * For Fargate compute resources, providing an empty list will be handled as if this parameter wasn't specified and
     * no change is made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from the
     * compute resource. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the <i>Amazon
     * VPC User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the VPC subnets requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones">
     * Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web Services Local
     * Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones">
     * Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the <i>Amazon ECS
     * Developer Guide</i>.
     * </p>
     * <p>
     * Batch on Fargate doesn't currently support Local Zones.
     * </p>
     * </note>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The Amazon EC2 security groups that are associated with instances launched in the compute environment. This
     * parameter is required for Fargate compute resources, where it can contain up to 5 security groups. For Fargate
     * compute resources, providing an empty list is handled as if this parameter wasn't specified and no change is
     * made. For Amazon EC2 compute resources, providing an empty list removes the security groups from the compute
     * resource.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure update of
     * the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The allocation strategy to use for the compute resource if there's not enough instances of the best fitting
     * instance type that can be allocated. This might be because of availability of the instance type in the Region or
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     * limits</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation strategies</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the allocation strategy requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when updating a compute
     * environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * <dl>
     * <dt>BEST_FIT_PROGRESSIVE</dt>
     * <dd>
     * <p>
     * Batch selects additional instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types with lower cost vCPUs. If additional instances of the previously selected
     * instance types aren't available, Batch selects new instance types.
     * </p>
     * </dd>
     * <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types that are less likely to be interrupted. This allocation strategy is only
     * available for Spot Instance compute resources.
     * </p>
     * </dd>
     * <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price. This allocation strategy is
     * only available for Spot Instance compute resources.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * The instances types that can be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select instance types (from
     * the C4, M4, and R4 instance families) that match the demand of your job queues.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * When you create a compute environment, the instance types that you select for the compute environment must share
     * the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.
     * </p>
     * </note> <note>
     * <p>
     * Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions that
     * don't have instance types from those instance families, instance types from the C5, M5, and R5 instance families
     * are used.
     * </p>
     * </note>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this key pair
     * to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private String ec2KeyPair;
    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for Amazon EC2
     * instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * instance role</a> in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private String instanceRole;
    /**
     * <p>
     * Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment. For
     * Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the tag key and
     * <code>String2</code> is the tag value-for example, <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This
     * is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags aren't seen when using the
     * Batch <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node
     * parallel jobs to your compute environment, you should consider creating a cluster placement group and associate
     * it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within
     * a single Availability Zone with high network flow potential. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the placement group requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private String placementGroup;
    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, the Spot price must be less
     * than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
     * and never more than your maximum percentage. For most use cases, we recommend leaving this field empty.
     * </p>
     * <p>
     * When updating a compute environment, changing the bid percentage requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private Integer bidPercentage;
    /**
     * <p>
     * The updated launch template to use for your compute resources. You must specify either the launch template ID or
     * launch template name in the request, but not both. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template support</a> in
     * the <i>Batch User Guide</i>. To remove the custom launch template and use the default launch template, set
     * <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the launch template specification to
     * an empty string. Removing the launch template from a compute environment will not remove the AMI specified in the
     * launch template. In order to update the AMI specified in a launch template, the
     * <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing the launch template requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     * environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any custom AMI ID
     * specified in <code>imageIdOverride</code>, set this value to an empty string.
     * </p>
     * <p>
     * One or two values can be provided.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     */
    private java.util.List<Ec2Configuration> ec2Configuration;
    /**
     * <p>
     * Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute environment
     * has an infrastructure update. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters or be
     * determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If an AMI ID is
     * specified any of these ways, this parameter is ignored. For more information about to update AMI IDs during an
     * infrastructure update, see <a href=
     * "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     * >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     */
    private Boolean updateToLatestImageVersion;
    /**
     * <p>
     * The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     * <code>FARGATE_SPOT</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute environments</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     * <code>spotIamFleetRole</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet role</a>
     * in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the type of a compute environment requires an infrastructure update
     * of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter is
     * overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure. To remove
     * the custom AMI ID and use the default AMI ID, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     */
    private String imageId;

    /**
     * <p>
     * The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param minvCpus
     *        The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     *        <code>DISABLED</code>).</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setMinvCpus(Integer minvCpus) {
        this.minvCpus = minvCpus;
    }

    /**
     * <p>
     * The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     *         <code>DISABLED</code>).</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public Integer getMinvCpus() {
        return this.minvCpus;
    }

    /**
     * <p>
     * The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     * <code>DISABLED</code>).
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param minvCpus
     *        The minimum number of vCPUs that an environment should maintain (even if the compute environment is
     *        <code>DISABLED</code>).</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withMinvCpus(Integer minvCpus) {
        setMinvCpus(minvCpus);
        return this;
    }

    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * </note>
     * 
     * @param maxvCpus
     *        The maximum number of Amazon EC2 vCPUs that an environment can reach.</p> <note>
     *        <p>
     *        With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *        <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and
     *        the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code>
     *        to meet your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than
     *        a single instance.
     *        </p>
     */

    public void setMaxvCpus(Integer maxvCpus) {
        this.maxvCpus = maxvCpus;
    }

    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * </note>
     * 
     * @return The maximum number of Amazon EC2 vCPUs that an environment can reach.</p> <note>
     *         <p>
     *         With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *         <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances,
     *         and the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed
     *         <code>maxvCpus</code> to meet your capacity requirements. In this event, Batch never exceeds
     *         <code>maxvCpus</code> by more than a single instance.
     *         </p>
     */

    public Integer getMaxvCpus() {
        return this.maxvCpus;
    }

    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * </note>
     * 
     * @param maxvCpus
     *        The maximum number of Amazon EC2 vCPUs that an environment can reach.</p> <note>
     *        <p>
     *        With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *        <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and
     *        the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code>
     *        to meet your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than
     *        a single instance.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withMaxvCpus(Integer maxvCpus) {
        setMaxvCpus(maxvCpus);
        return this;
    }

    /**
     * <p>
     * The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and maximum
     * values based on job queue demand.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't specify this
     * parameter for compute environments using Amazon EKS clusters.
     * </p>
     * </note> <note>
     * <p>
     * When you update the <code>desiredvCpus</code> setting, the value must be between the <code>minvCpus</code> and
     * <code>maxvCpus</code> values.
     * </p>
     * <p>
     * Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     * <code>desiredvCpus</code> value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     * >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param desiredvCpus
     *        The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and
     *        maximum values based on job queue demand.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't
     *        specify this parameter for compute environments using Amazon EKS clusters.
     *        </p>
     *        </note> <note>
     *        <p>
     *        When you update the <code>desiredvCpus</code> setting, the value must be between the <code>minvCpus</code>
     *        and <code>maxvCpus</code> values.
     *        </p>
     *        <p>
     *        Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     *        <code>desiredvCpus</code> value. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     *        >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     *        </p>
     */

    public void setDesiredvCpus(Integer desiredvCpus) {
        this.desiredvCpus = desiredvCpus;
    }

    /**
     * <p>
     * The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and maximum
     * values based on job queue demand.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't specify this
     * parameter for compute environments using Amazon EKS clusters.
     * </p>
     * </note> <note>
     * <p>
     * When you update the <code>desiredvCpus</code> setting, the value must be between the <code>minvCpus</code> and
     * <code>maxvCpus</code> values.
     * </p>
     * <p>
     * Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     * <code>desiredvCpus</code> value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     * >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and
     *         maximum values based on job queue demand.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     *         </note> <note>
     *         <p>
     *         Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't
     *         specify this parameter for compute environments using Amazon EKS clusters.
     *         </p>
     *         </note> <note>
     *         <p>
     *         When you update the <code>desiredvCpus</code> setting, the value must be between the
     *         <code>minvCpus</code> and <code>maxvCpus</code> values.
     *         </p>
     *         <p>
     *         Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     *         <code>desiredvCpus</code> value. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     *         >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     *         </p>
     */

    public Integer getDesiredvCpus() {
        return this.desiredvCpus;
    }

    /**
     * <p>
     * The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and maximum
     * values based on job queue demand.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't specify this
     * parameter for compute environments using Amazon EKS clusters.
     * </p>
     * </note> <note>
     * <p>
     * When you update the <code>desiredvCpus</code> setting, the value must be between the <code>minvCpus</code> and
     * <code>maxvCpus</code> values.
     * </p>
     * <p>
     * Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     * <code>desiredvCpus</code> value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     * >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param desiredvCpus
     *        The desired number of vCPUS in the compute environment. Batch modifies this value between the minimum and
     *        maximum values based on job queue demand.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Batch doesn't support changing the desired number of vCPUs of an existing compute environment. Don't
     *        specify this parameter for compute environments using Amazon EKS clusters.
     *        </p>
     *        </note> <note>
     *        <p>
     *        When you update the <code>desiredvCpus</code> setting, the value must be between the <code>minvCpus</code>
     *        and <code>maxvCpus</code> values.
     *        </p>
     *        <p>
     *        Additionally, the updated <code>desiredvCpus</code> value must be greater than or equal to the current
     *        <code>desiredvCpus</code> value. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#error-desired-vcpus-update"
     *        >Troubleshooting Batch</a> in the <i>Batch User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withDesiredvCpus(Integer desiredvCpus) {
        setDesiredvCpus(desiredvCpus);
        return this;
    }

    /**
     * <p>
     * The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16 subnets.
     * For Fargate compute resources, providing an empty list will be handled as if this parameter wasn't specified and
     * no change is made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from the
     * compute resource. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the <i>Amazon
     * VPC User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the VPC subnets requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones">
     * Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web Services Local
     * Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones">
     * Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the <i>Amazon ECS
     * Developer Guide</i>.
     * </p>
     * <p>
     * Batch on Fargate doesn't currently support Local Zones.
     * </p>
     * </note>
     * 
     * @return The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16
     *         subnets. For Fargate compute resources, providing an empty list will be handled as if this parameter
     *         wasn't specified and no change is made. For Amazon EC2 compute resources, providing an empty list removes
     *         the VPC subnets from the compute resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the
     *         <i>Amazon VPC User Guide</i>.</p>
     *         <p>
     *         When updating a compute environment, changing the VPC subnets requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones"
     *         > Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web
     *         Services Local Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones"
     *         > Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the
     *         <i>Amazon ECS Developer Guide</i>.
     *         </p>
     *         <p>
     *         Batch on Fargate doesn't currently support Local Zones.
     *         </p>
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16 subnets.
     * For Fargate compute resources, providing an empty list will be handled as if this parameter wasn't specified and
     * no change is made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from the
     * compute resource. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the <i>Amazon
     * VPC User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the VPC subnets requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones">
     * Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web Services Local
     * Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones">
     * Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the <i>Amazon ECS
     * Developer Guide</i>.
     * </p>
     * <p>
     * Batch on Fargate doesn't currently support Local Zones.
     * </p>
     * </note>
     * 
     * @param subnets
     *        The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16
     *        subnets. For Fargate compute resources, providing an empty list will be handled as if this parameter
     *        wasn't specified and no change is made. For Amazon EC2 compute resources, providing an empty list removes
     *        the VPC subnets from the compute resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the
     *        <i>Amazon VPC User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the VPC subnets requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones"
     *        > Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web
     *        Services Local Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones"
     *        > Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the
     *        <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        <p>
     *        Batch on Fargate doesn't currently support Local Zones.
     *        </p>
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
     * The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16 subnets.
     * For Fargate compute resources, providing an empty list will be handled as if this parameter wasn't specified and
     * no change is made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from the
     * compute resource. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the <i>Amazon
     * VPC User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the VPC subnets requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones">
     * Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web Services Local
     * Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones">
     * Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the <i>Amazon ECS
     * Developer Guide</i>.
     * </p>
     * <p>
     * Batch on Fargate doesn't currently support Local Zones.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16
     *        subnets. For Fargate compute resources, providing an empty list will be handled as if this parameter
     *        wasn't specified and no change is made. For Amazon EC2 compute resources, providing an empty list removes
     *        the VPC subnets from the compute resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the
     *        <i>Amazon VPC User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the VPC subnets requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones"
     *        > Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web
     *        Services Local Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones"
     *        > Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the
     *        <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        <p>
     *        Batch on Fargate doesn't currently support Local Zones.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSubnets(String... subnets) {
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
     * The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16 subnets.
     * For Fargate compute resources, providing an empty list will be handled as if this parameter wasn't specified and
     * no change is made. For Amazon EC2 compute resources, providing an empty list removes the VPC subnets from the
     * compute resource. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the <i>Amazon
     * VPC User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the VPC subnets requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones">
     * Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web Services Local
     * Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones">
     * Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the <i>Amazon ECS
     * Developer Guide</i>.
     * </p>
     * <p>
     * Batch on Fargate doesn't currently support Local Zones.
     * </p>
     * </note>
     * 
     * @param subnets
     *        The VPC subnets where the compute resources are launched. Fargate compute resources can contain up to 16
     *        subnets. For Fargate compute resources, providing an empty list will be handled as if this parameter
     *        wasn't specified and no change is made. For Amazon EC2 compute resources, providing an empty list removes
     *        the VPC subnets from the compute resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and subnets</a> in the
     *        <i>Amazon VPC User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the VPC subnets requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Batch on Amazon EC2 and Batch on Amazon EKS support Local Zones. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-local-zones"
     *        > Local Zones</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>, <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/local-zones.html">Amazon EKS and Amazon Web
     *        Services Local Zones</a> in the <i>Amazon EKS User Guide</i> and <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-regions-zones.html#clusters-local-zones"
     *        > Amazon ECS clusters in Local Zones, Wavelength Zones, and Amazon Web Services Outposts</a> in the
     *        <i>Amazon ECS Developer Guide</i>.
     *        </p>
     *        <p>
     *        Batch on Fargate doesn't currently support Local Zones.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 security groups that are associated with instances launched in the compute environment. This
     * parameter is required for Fargate compute resources, where it can contain up to 5 security groups. For Fargate
     * compute resources, providing an empty list is handled as if this parameter wasn't specified and no change is
     * made. For Amazon EC2 compute resources, providing an empty list removes the security groups from the compute
     * resource.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure update of
     * the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @return The Amazon EC2 security groups that are associated with instances launched in the compute environment.
     *         This parameter is required for Fargate compute resources, where it can contain up to 5 security groups.
     *         For Fargate compute resources, providing an empty list is handled as if this parameter wasn't specified
     *         and no change is made. For Amazon EC2 compute resources, providing an empty list removes the security
     *         groups from the compute resource.</p>
     *         <p>
     *         When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure
     *         update of the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The Amazon EC2 security groups that are associated with instances launched in the compute environment. This
     * parameter is required for Fargate compute resources, where it can contain up to 5 security groups. For Fargate
     * compute resources, providing an empty list is handled as if this parameter wasn't specified and no change is
     * made. For Amazon EC2 compute resources, providing an empty list removes the security groups from the compute
     * resource.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure update of
     * the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups that are associated with instances launched in the compute environment.
     *        This parameter is required for Fargate compute resources, where it can contain up to 5 security groups.
     *        For Fargate compute resources, providing an empty list is handled as if this parameter wasn't specified
     *        and no change is made. For Amazon EC2 compute resources, providing an empty list removes the security
     *        groups from the compute resource.</p>
     *        <p>
     *        When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure
     *        update of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
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
     * The Amazon EC2 security groups that are associated with instances launched in the compute environment. This
     * parameter is required for Fargate compute resources, where it can contain up to 5 security groups. For Fargate
     * compute resources, providing an empty list is handled as if this parameter wasn't specified and no change is
     * made. For Amazon EC2 compute resources, providing an empty list removes the security groups from the compute
     * resource.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure update of
     * the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups that are associated with instances launched in the compute environment.
     *        This parameter is required for Fargate compute resources, where it can contain up to 5 security groups.
     *        For Fargate compute resources, providing an empty list is handled as if this parameter wasn't specified
     *        and no change is made. For Amazon EC2 compute resources, providing an empty list removes the security
     *        groups from the compute resource.</p>
     *        <p>
     *        When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure
     *        update of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSecurityGroupIds(String... securityGroupIds) {
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
     * The Amazon EC2 security groups that are associated with instances launched in the compute environment. This
     * parameter is required for Fargate compute resources, where it can contain up to 5 security groups. For Fargate
     * compute resources, providing an empty list is handled as if this parameter wasn't specified and no change is
     * made. For Amazon EC2 compute resources, providing an empty list removes the security groups from the compute
     * resource.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure update of
     * the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups that are associated with instances launched in the compute environment.
     *        This parameter is required for Fargate compute resources, where it can contain up to 5 security groups.
     *        For Fargate compute resources, providing an empty list is handled as if this parameter wasn't specified
     *        and no change is made. For Amazon EC2 compute resources, providing an empty list removes the security
     *        groups from the compute resource.</p>
     *        <p>
     *        When updating a compute environment, changing the Amazon EC2 security groups requires an infrastructure
     *        update of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The allocation strategy to use for the compute resource if there's not enough instances of the best fitting
     * instance type that can be allocated. This might be because of availability of the instance type in the Region or
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     * limits</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation strategies</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the allocation strategy requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when updating a compute
     * environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * <dl>
     * <dt>BEST_FIT_PROGRESSIVE</dt>
     * <dd>
     * <p>
     * Batch selects additional instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types with lower cost vCPUs. If additional instances of the previously selected
     * instance types aren't available, Batch selects new instance types.
     * </p>
     * </dd>
     * <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types that are less likely to be interrupted. This allocation strategy is only
     * available for Spot Instance compute resources.
     * </p>
     * </dd>
     * <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price. This allocation strategy is
     * only available for Spot Instance compute resources.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * 
     * @param allocationStrategy
     *        The allocation strategy to use for the compute resource if there's not enough instances of the best
     *        fitting instance type that can be allocated. This might be because of availability of the instance type in
     *        the Region or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     *        limits</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation
     *        strategies</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the allocation strategy requires an infrastructure update of
     *        the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when
     *        updating a compute environment.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note>
     *        <dl>
     *        <dt>BEST_FIT_PROGRESSIVE</dt>
     *        <dd>
     *        <p>
     *        Batch selects additional instance types that are large enough to meet the requirements of the jobs in the
     *        queue. Its preference is for instance types with lower cost vCPUs. If additional instances of the
     *        previously selected instance types aren't available, Batch selects new instance types.
     *        </p>
     *        </dd>
     *        <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     *        <dd>
     *        <p>
     *        Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the
     *        queue. Its preference is for instance types that are less likely to be interrupted. This allocation
     *        strategy is only available for Spot Instance compute resources.
     *        </p>
     *        </dd>
     *        <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     *        <dd>
     *        <p>
     *        The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *        Instance pools that are the least likely to be interrupted and have the lowest possible price. This
     *        allocation strategy is only available for Spot Instance compute resources.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *        <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and
     *        the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code>
     *        to meet your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than
     *        a single instance.
     * @see CRUpdateAllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy to use for the compute resource if there's not enough instances of the best fitting
     * instance type that can be allocated. This might be because of availability of the instance type in the Region or
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     * limits</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation strategies</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the allocation strategy requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when updating a compute
     * environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * <dl>
     * <dt>BEST_FIT_PROGRESSIVE</dt>
     * <dd>
     * <p>
     * Batch selects additional instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types with lower cost vCPUs. If additional instances of the previously selected
     * instance types aren't available, Batch selects new instance types.
     * </p>
     * </dd>
     * <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types that are less likely to be interrupted. This allocation strategy is only
     * available for Spot Instance compute resources.
     * </p>
     * </dd>
     * <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price. This allocation strategy is
     * only available for Spot Instance compute resources.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * 
     * @return The allocation strategy to use for the compute resource if there's not enough instances of the best
     *         fitting instance type that can be allocated. This might be because of availability of the instance type
     *         in the Region or <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     *         limits</a>. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation
     *         strategies</a> in the <i>Batch User Guide</i>.</p>
     *         <p>
     *         When updating a compute environment, changing the allocation strategy requires an infrastructure update
     *         of the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when
     *         updating a compute environment.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     *         </note>
     *         <dl>
     *         <dt>BEST_FIT_PROGRESSIVE</dt>
     *         <dd>
     *         <p>
     *         Batch selects additional instance types that are large enough to meet the requirements of the jobs in the
     *         queue. Its preference is for instance types with lower cost vCPUs. If additional instances of the
     *         previously selected instance types aren't available, Batch selects new instance types.
     *         </p>
     *         </dd>
     *         <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     *         <dd>
     *         <p>
     *         Batch selects one or more instance types that are large enough to meet the requirements of the jobs in
     *         the queue. Its preference is for instance types that are less likely to be interrupted. This allocation
     *         strategy is only available for Spot Instance compute resources.
     *         </p>
     *         </dd>
     *         <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     *         <dd>
     *         <p>
     *         The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *         Instance pools that are the least likely to be interrupted and have the lowest possible price. This
     *         allocation strategy is only available for Spot Instance compute resources.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *         <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances,
     *         and the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed
     *         <code>maxvCpus</code> to meet your capacity requirements. In this event, Batch never exceeds
     *         <code>maxvCpus</code> by more than a single instance.
     * @see CRUpdateAllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy to use for the compute resource if there's not enough instances of the best fitting
     * instance type that can be allocated. This might be because of availability of the instance type in the Region or
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     * limits</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation strategies</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the allocation strategy requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when updating a compute
     * environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * <dl>
     * <dt>BEST_FIT_PROGRESSIVE</dt>
     * <dd>
     * <p>
     * Batch selects additional instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types with lower cost vCPUs. If additional instances of the previously selected
     * instance types aren't available, Batch selects new instance types.
     * </p>
     * </dd>
     * <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types that are less likely to be interrupted. This allocation strategy is only
     * available for Spot Instance compute resources.
     * </p>
     * </dd>
     * <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price. This allocation strategy is
     * only available for Spot Instance compute resources.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * 
     * @param allocationStrategy
     *        The allocation strategy to use for the compute resource if there's not enough instances of the best
     *        fitting instance type that can be allocated. This might be because of availability of the instance type in
     *        the Region or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     *        limits</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation
     *        strategies</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the allocation strategy requires an infrastructure update of
     *        the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when
     *        updating a compute environment.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note>
     *        <dl>
     *        <dt>BEST_FIT_PROGRESSIVE</dt>
     *        <dd>
     *        <p>
     *        Batch selects additional instance types that are large enough to meet the requirements of the jobs in the
     *        queue. Its preference is for instance types with lower cost vCPUs. If additional instances of the
     *        previously selected instance types aren't available, Batch selects new instance types.
     *        </p>
     *        </dd>
     *        <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     *        <dd>
     *        <p>
     *        Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the
     *        queue. Its preference is for instance types that are less likely to be interrupted. This allocation
     *        strategy is only available for Spot Instance compute resources.
     *        </p>
     *        </dd>
     *        <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     *        <dd>
     *        <p>
     *        The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *        Instance pools that are the least likely to be interrupted and have the lowest possible price. This
     *        allocation strategy is only available for Spot Instance compute resources.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *        <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and
     *        the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code>
     *        to meet your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than
     *        a single instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CRUpdateAllocationStrategy
     */

    public ComputeResourceUpdate withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * The allocation strategy to use for the compute resource if there's not enough instances of the best fitting
     * instance type that can be allocated. This might be because of availability of the instance type in the Region or
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     * limits</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation strategies</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the allocation strategy requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when updating a compute
     * environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * <dl>
     * <dt>BEST_FIT_PROGRESSIVE</dt>
     * <dd>
     * <p>
     * Batch selects additional instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types with lower cost vCPUs. If additional instances of the previously selected
     * instance types aren't available, Batch selects new instance types.
     * </p>
     * </dd>
     * <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the queue.
     * Its preference is for instance types that are less likely to be interrupted. This allocation strategy is only
     * available for Spot Instance compute resources.
     * </p>
     * </dd>
     * <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price. This allocation strategy is
     * only available for Spot Instance compute resources.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     * <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and the
     * <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code> to meet
     * your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than a single
     * instance.
     * </p>
     * 
     * @param allocationStrategy
     *        The allocation strategy to use for the compute resource if there's not enough instances of the best
     *        fitting instance type that can be allocated. This might be because of availability of the instance type in
     *        the Region or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html">Amazon EC2 service
     *        limits</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html">Allocation
     *        strategies</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the allocation strategy requires an infrastructure update of
     *        the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>. <code>BEST_FIT</code> isn't supported when
     *        updating a compute environment.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note>
     *        <dl>
     *        <dt>BEST_FIT_PROGRESSIVE</dt>
     *        <dd>
     *        <p>
     *        Batch selects additional instance types that are large enough to meet the requirements of the jobs in the
     *        queue. Its preference is for instance types with lower cost vCPUs. If additional instances of the
     *        previously selected instance types aren't available, Batch selects new instance types.
     *        </p>
     *        </dd>
     *        <dt>SPOT_CAPACITY_OPTIMIZED</dt>
     *        <dd>
     *        <p>
     *        Batch selects one or more instance types that are large enough to meet the requirements of the jobs in the
     *        queue. Its preference is for instance types that are less likely to be interrupted. This allocation
     *        strategy is only available for Spot Instance compute resources.
     *        </p>
     *        </dd>
     *        <dt>SPOT_PRICE_CAPACITY_OPTIMIZED</dt>
     *        <dd>
     *        <p>
     *        The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *        Instance pools that are the least likely to be interrupted and have the lowest possible price. This
     *        allocation strategy is only available for Spot Instance compute resources.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        With <code>BEST_FIT_PROGRESSIVE</code>,<code>SPOT_CAPACITY_OPTIMIZED</code> and
     *        <code>SPOT_PRICE_CAPACITY_OPTIMIZED</code> (recommended) strategies using On-Demand or Spot Instances, and
     *        the <code>BEST_FIT</code> strategy using Spot Instances, Batch might need to exceed <code>maxvCpus</code>
     *        to meet your capacity requirements. In this event, Batch never exceeds <code>maxvCpus</code> by more than
     *        a single instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CRUpdateAllocationStrategy
     */

    public ComputeResourceUpdate withAllocationStrategy(CRUpdateAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The instances types that can be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select instance types (from
     * the C4, M4, and R4 instance families) that match the demand of your job queues.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * When you create a compute environment, the instance types that you select for the compute environment must share
     * the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.
     * </p>
     * </note> <note>
     * <p>
     * Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions that
     * don't have instance types from those instance families, instance types from the C5, M5, and R5 instance families
     * are used.
     * </p>
     * </note>
     * 
     * @return The instances types that can be launched. You can specify instance families to launch any instance type
     *         within those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific
     *         sizes within a family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to
     *         select instance types (from the C4, M4, and R4 instance families) that match the demand of your job
     *         queues.</p>
     *         <p>
     *         When updating a compute environment, changing this setting requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     *         </note> <note>
     *         <p>
     *         When you create a compute environment, the instance types that you select for the compute environment
     *         must share the same architecture. For example, you can't mix x86 and ARM instances in the same compute
     *         environment.
     *         </p>
     *         </note> <note>
     *         <p>
     *         Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions
     *         that don't have instance types from those instance families, instance types from the C5, M5, and R5
     *         instance families are used.
     *         </p>
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instances types that can be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select instance types (from
     * the C4, M4, and R4 instance families) that match the demand of your job queues.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * When you create a compute environment, the instance types that you select for the compute environment must share
     * the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.
     * </p>
     * </note> <note>
     * <p>
     * Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions that
     * don't have instance types from those instance families, instance types from the C5, M5, and R5 instance families
     * are used.
     * </p>
     * </note>
     * 
     * @param instanceTypes
     *        The instances types that can be launched. You can specify instance families to launch any instance type
     *        within those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes
     *        within a family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select
     *        instance types (from the C4, M4, and R4 instance families) that match the demand of your job queues.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        When you create a compute environment, the instance types that you select for the compute environment must
     *        share the same architecture. For example, you can't mix x86 and ARM instances in the same compute
     *        environment.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions
     *        that don't have instance types from those instance families, instance types from the C5, M5, and R5
     *        instance families are used.
     *        </p>
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
     * The instances types that can be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select instance types (from
     * the C4, M4, and R4 instance families) that match the demand of your job queues.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * When you create a compute environment, the instance types that you select for the compute environment must share
     * the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.
     * </p>
     * </note> <note>
     * <p>
     * Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions that
     * don't have instance types from those instance families, instance types from the C5, M5, and R5 instance families
     * are used.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instances types that can be launched. You can specify instance families to launch any instance type
     *        within those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes
     *        within a family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select
     *        instance types (from the C4, M4, and R4 instance families) that match the demand of your job queues.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        When you create a compute environment, the instance types that you select for the compute environment must
     *        share the same architecture. For example, you can't mix x86 and ARM instances in the same compute
     *        environment.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions
     *        that don't have instance types from those instance families, instance types from the C5, M5, and R5
     *        instance families are used.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withInstanceTypes(String... instanceTypes) {
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
     * The instances types that can be launched. You can specify instance families to launch any instance type within
     * those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes within a
     * family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select instance types (from
     * the C4, M4, and R4 instance families) that match the demand of your job queues.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * When you create a compute environment, the instance types that you select for the compute environment must share
     * the same architecture. For example, you can't mix x86 and ARM instances in the same compute environment.
     * </p>
     * </note> <note>
     * <p>
     * Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions that
     * don't have instance types from those instance families, instance types from the C5, M5, and R5 instance families
     * are used.
     * </p>
     * </note>
     * 
     * @param instanceTypes
     *        The instances types that can be launched. You can specify instance families to launch any instance type
     *        within those families (for example, <code>c5</code> or <code>p3</code>), or you can specify specific sizes
     *        within a family (such as <code>c5.8xlarge</code>). You can also choose <code>optimal</code> to select
     *        instance types (from the C4, M4, and R4 instance families) that match the demand of your job queues.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        When you create a compute environment, the instance types that you select for the compute environment must
     *        share the same architecture. For example, you can't mix x86 and ARM instances in the same compute
     *        environment.
     *        </p>
     *        </note> <note>
     *        <p>
     *        Currently, <code>optimal</code> uses instance types from the C4, M4, and R4 instance families. In Regions
     *        that don't have instance types from those instance families, instance types from the C5, M5, and R5
     *        instance families are used.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this key pair
     * to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param ec2KeyPair
     *        The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this
     *        key pair to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an
     *        empty string.</p>
     *        <p>
     *        When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update of
     *        the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setEc2KeyPair(String ec2KeyPair) {
        this.ec2KeyPair = ec2KeyPair;
    }

    /**
     * <p>
     * The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this key pair
     * to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this
     *         key pair to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an
     *         empty string.</p>
     *         <p>
     *         When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update
     *         of the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public String getEc2KeyPair() {
        return this.ec2KeyPair;
    }

    /**
     * <p>
     * The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this key pair
     * to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param ec2KeyPair
     *        The Amazon EC2 key pair that's used for instances launched in the compute environment. You can use this
     *        key pair to log in to your instances with SSH. To remove the Amazon EC2 key pair, set this value to an
     *        empty string.</p>
     *        <p>
     *        When updating a compute environment, changing the Amazon EC2 key pair requires an infrastructure update of
     *        the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withEc2KeyPair(String ec2KeyPair) {
        setEc2KeyPair(ec2KeyPair);
        return this;
    }

    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for Amazon EC2
     * instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * instance role</a> in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param instanceRole
     *        The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for
     *        Amazon EC2 instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance
     *        profile. For example, <code> <i>ecsInstanceRole</i> </code> or
     *        <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS instance
     *        role</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for Amazon EC2
     * instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * instance role</a> in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for
     *         Amazon EC2 instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance
     *         profile. For example, <code> <i>ecsInstanceRole</i> </code> or
     *         <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS instance
     *         role</a> in the <i>Batch User Guide</i>.</p>
     *         <p>
     *         When updating a compute environment, changing this setting requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public String getInstanceRole() {
        return this.instanceRole;
    }

    /**
     * <p>
     * The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for Amazon EC2
     * instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance profile. For example,
     * <code> <i>ecsInstanceRole</i> </code> or
     * <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     * information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS
     * instance role</a> in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param instanceRole
     *        The Amazon ECS instance profile applied to Amazon EC2 instances in a compute environment. Required for
     *        Amazon EC2 instances. You can specify the short name or full Amazon Resource Name (ARN) of an instance
     *        profile. For example, <code> <i>ecsInstanceRole</i> </code> or
     *        <code>arn:aws:iam::<i>&lt;aws_account_id&gt;</i>:instance-profile/<i>ecsInstanceRole</i> </code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/instance_IAM_role.html">Amazon ECS instance
     *        role</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withInstanceRole(String instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * <p>
     * Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment. For
     * Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the tag key and
     * <code>String2</code> is the tag value-for example, <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This
     * is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags aren't seen when using the
     * Batch <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment.
     *         For Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the
     *         tag key and <code>String2</code> is the tag value-for example,
     *         <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This is helpful for recognizing your Batch
     *         instances in the Amazon EC2 console. These tags aren't seen when using the Batch
     *         <code>ListTagsForResource</code> API operation.</p>
     *         <p>
     *         When updating a compute environment, changing this setting requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment. For
     * Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the tag key and
     * <code>String2</code> is the tag value-for example, <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This
     * is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags aren't seen when using the
     * Batch <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param tags
     *        Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment.
     *        For Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the tag
     *        key and <code>String2</code> is the tag value-for example,
     *        <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This is helpful for recognizing your Batch
     *        instances in the Amazon EC2 console. These tags aren't seen when using the Batch
     *        <code>ListTagsForResource</code> API operation.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment. For
     * Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the tag key and
     * <code>String2</code> is the tag value-for example, <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This
     * is helpful for recognizing your Batch instances in the Amazon EC2 console. These tags aren't seen when using the
     * Batch <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param tags
     *        Key-value pair tags to be applied to Amazon EC2 resources that are launched in the compute environment.
     *        For Batch, these take the form of <code>"String1": "String2"</code>, where <code>String1</code> is the tag
     *        key and <code>String2</code> is the tag value-for example,
     *        <code>{ "Name": "Batch Instance - C4OnDemand" }</code>. This is helpful for recognizing your Batch
     *        instances in the Amazon EC2 console. These tags aren't seen when using the Batch
     *        <code>ListTagsForResource</code> API operation.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ComputeResourceUpdate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate addTagsEntry(String key, String value) {
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

    public ComputeResourceUpdate clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 placement group to associate with your compute resources. If you intend to submit multi-node
     * parallel jobs to your compute environment, you should consider creating a cluster placement group and associate
     * it with your compute resources. This keeps your multi-node parallel job on a logical grouping of instances within
     * a single Availability Zone with high network flow potential. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the placement group requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param placementGroup
     *        The Amazon EC2 placement group to associate with your compute resources. If you intend to submit
     *        multi-node parallel jobs to your compute environment, you should consider creating a cluster placement
     *        group and associate it with your compute resources. This keeps your multi-node parallel job on a logical
     *        grouping of instances within a single Availability Zone with high network flow potential. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the placement group requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the placement group requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return The Amazon EC2 placement group to associate with your compute resources. If you intend to submit
     *         multi-node parallel jobs to your compute environment, you should consider creating a cluster placement
     *         group and associate it with your compute resources. This keeps your multi-node parallel job on a logical
     *         grouping of instances within a single Availability Zone with high network flow potential. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in
     *         the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         When updating a compute environment, changing the placement group requires an infrastructure update of
     *         the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the placement group requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param placementGroup
     *        The Amazon EC2 placement group to associate with your compute resources. If you intend to submit
     *        multi-node parallel jobs to your compute environment, you should consider creating a cluster placement
     *        group and associate it with your compute resources. This keeps your multi-node parallel job on a logical
     *        grouping of instances within a single Availability Zone with high network flow potential. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html">Placement groups</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        When updating a compute environment, changing the placement group requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withPlacementGroup(String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, the Spot price must be less
     * than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
     * and never more than your maximum percentage. For most use cases, we recommend leaving this field empty.
     * </p>
     * <p>
     * When updating a compute environment, changing the bid percentage requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param bidPercentage
     *        The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that
     *        instance type before instances are launched. For example, if your maximum percentage is 20%, the Spot
     *        price must be less than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay
     *        the lowest (market) price and never more than your maximum percentage. For most use cases, we recommend
     *        leaving this field empty.</p>
     *        <p>
     *        When updating a compute environment, changing the bid percentage requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setBidPercentage(Integer bidPercentage) {
        this.bidPercentage = bidPercentage;
    }

    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, the Spot price must be less
     * than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
     * and never more than your maximum percentage. For most use cases, we recommend leaving this field empty.
     * </p>
     * <p>
     * When updating a compute environment, changing the bid percentage requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that
     *         instance type before instances are launched. For example, if your maximum percentage is 20%, the Spot
     *         price must be less than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay
     *         the lowest (market) price and never more than your maximum percentage. For most use cases, we recommend
     *         leaving this field empty.</p>
     *         <p>
     *         When updating a compute environment, changing the bid percentage requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public Integer getBidPercentage() {
        return this.bidPercentage;
    }

    /**
     * <p>
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance
     * type before instances are launched. For example, if your maximum percentage is 20%, the Spot price must be less
     * than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay the lowest (market) price
     * and never more than your maximum percentage. For most use cases, we recommend leaving this field empty.
     * </p>
     * <p>
     * When updating a compute environment, changing the bid percentage requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param bidPercentage
     *        The maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that
     *        instance type before instances are launched. For example, if your maximum percentage is 20%, the Spot
     *        price must be less than 20% of the current On-Demand price for that Amazon EC2 instance. You always pay
     *        the lowest (market) price and never more than your maximum percentage. For most use cases, we recommend
     *        leaving this field empty.</p>
     *        <p>
     *        When updating a compute environment, changing the bid percentage requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withBidPercentage(Integer bidPercentage) {
        setBidPercentage(bidPercentage);
        return this;
    }

    /**
     * <p>
     * The updated launch template to use for your compute resources. You must specify either the launch template ID or
     * launch template name in the request, but not both. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template support</a> in
     * the <i>Batch User Guide</i>. To remove the custom launch template and use the default launch template, set
     * <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the launch template specification to
     * an empty string. Removing the launch template from a compute environment will not remove the AMI specified in the
     * launch template. In order to update the AMI specified in a launch template, the
     * <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing the launch template requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param launchTemplate
     *        The updated launch template to use for your compute resources. You must specify either the launch template
     *        ID or launch template name in the request, but not both. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template
     *        support</a> in the <i>Batch User Guide</i>. To remove the custom launch template and use the default
     *        launch template, set <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the launch
     *        template specification to an empty string. Removing the launch template from a compute environment will
     *        not remove the AMI specified in the launch template. In order to update the AMI specified in a launch
     *        template, the <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>.</p>
     *        <p>
     *        When updating a compute environment, changing the launch template requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The updated launch template to use for your compute resources. You must specify either the launch template ID or
     * launch template name in the request, but not both. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template support</a> in
     * the <i>Batch User Guide</i>. To remove the custom launch template and use the default launch template, set
     * <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the launch template specification to
     * an empty string. Removing the launch template from a compute environment will not remove the AMI specified in the
     * launch template. In order to update the AMI specified in a launch template, the
     * <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing the launch template requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return The updated launch template to use for your compute resources. You must specify either the launch
     *         template ID or launch template name in the request, but not both. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template
     *         support</a> in the <i>Batch User Guide</i>. To remove the custom launch template and use the default
     *         launch template, set <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the
     *         launch template specification to an empty string. Removing the launch template from a compute environment
     *         will not remove the AMI specified in the launch template. In order to update the AMI specified in a
     *         launch template, the <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>
     *         .</p>
     *         <p>
     *         When updating a compute environment, changing the launch template requires an infrastructure update of
     *         the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The updated launch template to use for your compute resources. You must specify either the launch template ID or
     * launch template name in the request, but not both. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template support</a> in
     * the <i>Batch User Guide</i>. To remove the custom launch template and use the default launch template, set
     * <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the launch template specification to
     * an empty string. Removing the launch template from a compute environment will not remove the AMI specified in the
     * launch template. In order to update the AMI specified in a launch template, the
     * <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing the launch template requires an infrastructure update of the
     * compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param launchTemplate
     *        The updated launch template to use for your compute resources. You must specify either the launch template
     *        ID or launch template name in the request, but not both. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html">Launch template
     *        support</a> in the <i>Batch User Guide</i>. To remove the custom launch template and use the default
     *        launch template, set <code>launchTemplateId</code> or <code>launchTemplateName</code> member of the launch
     *        template specification to an empty string. Removing the launch template from a compute environment will
     *        not remove the AMI specified in the launch template. In order to update the AMI specified in a launch
     *        template, the <code>updateToLatestImageVersion</code> parameter must be set to <code>true</code>.</p>
     *        <p>
     *        When updating a compute environment, changing the launch template requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     * environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any custom AMI ID
     * specified in <code>imageIdOverride</code>, set this value to an empty string.
     * </p>
     * <p>
     * One or two values can be provided.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @return Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     *         environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.</p>
     *         <p>
     *         When updating a compute environment, changing this setting requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any
     *         custom AMI ID specified in <code>imageIdOverride</code>, set this value to an empty string.
     *         </p>
     *         <p>
     *         One or two values can be provided.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     */

    public java.util.List<Ec2Configuration> getEc2Configuration() {
        return ec2Configuration;
    }

    /**
     * <p>
     * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     * environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any custom AMI ID
     * specified in <code>imageIdOverride</code>, set this value to an empty string.
     * </p>
     * <p>
     * One or two values can be provided.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param ec2Configuration
     *        Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     *        environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any
     *        custom AMI ID specified in <code>imageIdOverride</code>, set this value to an empty string.
     *        </p>
     *        <p>
     *        One or two values can be provided.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     */

    public void setEc2Configuration(java.util.Collection<Ec2Configuration> ec2Configuration) {
        if (ec2Configuration == null) {
            this.ec2Configuration = null;
            return;
        }

        this.ec2Configuration = new java.util.ArrayList<Ec2Configuration>(ec2Configuration);
    }

    /**
     * <p>
     * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     * environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any custom AMI ID
     * specified in <code>imageIdOverride</code>, set this value to an empty string.
     * </p>
     * <p>
     * One or two values can be provided.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2Configuration(java.util.Collection)} or {@link #withEc2Configuration(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2Configuration
     *        Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     *        environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any
     *        custom AMI ID specified in <code>imageIdOverride</code>, set this value to an empty string.
     *        </p>
     *        <p>
     *        One or two values can be provided.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withEc2Configuration(Ec2Configuration... ec2Configuration) {
        if (this.ec2Configuration == null) {
            setEc2Configuration(new java.util.ArrayList<Ec2Configuration>(ec2Configuration.length));
        }
        for (Ec2Configuration ele : ec2Configuration) {
            this.ec2Configuration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     * environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.
     * </p>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any custom AMI ID
     * specified in <code>imageIdOverride</code>, set this value to an empty string.
     * </p>
     * <p>
     * One or two values can be provided.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note>
     * 
     * @param ec2Configuration
     *        Provides information used to select Amazon Machine Images (AMIs) for Amazon EC2 instances in the compute
     *        environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code>.</p>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>. To remove the Amazon EC2 configuration and any
     *        custom AMI ID specified in <code>imageIdOverride</code>, set this value to an empty string.
     *        </p>
     *        <p>
     *        One or two values can be provided.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withEc2Configuration(java.util.Collection<Ec2Configuration> ec2Configuration) {
        setEc2Configuration(ec2Configuration);
        return this;
    }

    /**
     * <p>
     * Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute environment
     * has an infrastructure update. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters or be
     * determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If an AMI ID is
     * specified any of these ways, this parameter is ignored. For more information about to update AMI IDs during an
     * infrastructure update, see <a href=
     * "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     * >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param updateToLatestImageVersion
     *        Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute
     *        environment has an infrastructure update. The default value is <code>false</code>.</p> <note>
     *        <p>
     *        An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters
     *        or be determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If
     *        an AMI ID is specified any of these ways, this parameter is ignored. For more information about to update
     *        AMI IDs during an infrastructure update, see <a href=
     *        "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     *        >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     */

    public void setUpdateToLatestImageVersion(Boolean updateToLatestImageVersion) {
        this.updateToLatestImageVersion = updateToLatestImageVersion;
    }

    /**
     * <p>
     * Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute environment
     * has an infrastructure update. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters or be
     * determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If an AMI ID is
     * specified any of these ways, this parameter is ignored. For more information about to update AMI IDs during an
     * infrastructure update, see <a href=
     * "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     * >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute
     *         environment has an infrastructure update. The default value is <code>false</code>.</p> <note>
     *         <p>
     *         An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters
     *         or be determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If
     *         an AMI ID is specified any of these ways, this parameter is ignored. For more information about to update
     *         AMI IDs during an infrastructure update, see <a href=
     *         "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     *         >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         When updating a compute environment, changing this setting requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     */

    public Boolean getUpdateToLatestImageVersion() {
        return this.updateToLatestImageVersion;
    }

    /**
     * <p>
     * Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute environment
     * has an infrastructure update. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters or be
     * determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If an AMI ID is
     * specified any of these ways, this parameter is ignored. For more information about to update AMI IDs during an
     * infrastructure update, see <a href=
     * "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     * >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param updateToLatestImageVersion
     *        Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute
     *        environment has an infrastructure update. The default value is <code>false</code>.</p> <note>
     *        <p>
     *        An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters
     *        or be determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If
     *        an AMI ID is specified any of these ways, this parameter is ignored. For more information about to update
     *        AMI IDs during an infrastructure update, see <a href=
     *        "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     *        >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        When updating a compute environment, changing this setting requires an infrastructure update of the
     *        compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withUpdateToLatestImageVersion(Boolean updateToLatestImageVersion) {
        setUpdateToLatestImageVersion(updateToLatestImageVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute environment
     * has an infrastructure update. The default value is <code>false</code>.
     * </p>
     * <note>
     * <p>
     * An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters or be
     * determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If an AMI ID is
     * specified any of these ways, this parameter is ignored. For more information about to update AMI IDs during an
     * infrastructure update, see <a href=
     * "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     * >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     * </p>
     * </note>
     * <p>
     * When updating a compute environment, changing this setting requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @return Specifies whether the AMI ID is updated to the latest one that's supported by Batch when the compute
     *         environment has an infrastructure update. The default value is <code>false</code>.</p> <note>
     *         <p>
     *         An AMI ID can either be specified in the <code>imageId</code> or <code>imageIdOverride</code> parameters
     *         or be determined by the launch template that's specified in the <code>launchTemplate</code> parameter. If
     *         an AMI ID is specified any of these ways, this parameter is ignored. For more information about to update
     *         AMI IDs during an infrastructure update, see <a href=
     *         "https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html#updating-compute-environments-ami"
     *         >Updating the AMI ID</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         When updating a compute environment, changing this setting requires an infrastructure update of the
     *         compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     */

    public Boolean isUpdateToLatestImageVersion() {
        return this.updateToLatestImageVersion;
    }

    /**
     * <p>
     * The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     * <code>FARGATE_SPOT</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute environments</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     * <code>spotIamFleetRole</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet role</a>
     * in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the type of a compute environment requires an infrastructure update
     * of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     *        <code>FARGATE_SPOT</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        environments</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     *        <code>spotIamFleetRole</code> parameter. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet
     *        role</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <p>
     *        When updating a compute environment, changing the type of a compute environment requires an infrastructure
     *        update of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     * @see CRType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     * <code>FARGATE_SPOT</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute environments</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     * <code>spotIamFleetRole</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet role</a>
     * in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the type of a compute environment requires an infrastructure update
     * of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @return The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     *         <code>FARGATE_SPOT</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *         environments</a> in the <i>Batch User Guide</i>.</p>
     *         <p>
     *         If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     *         <code>spotIamFleetRole</code> parameter. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet
     *         role</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <p>
     *         When updating a compute environment, changing the type of a compute environment requires an
     *         infrastructure update of the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     * @see CRType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     * <code>FARGATE_SPOT</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute environments</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     * <code>spotIamFleetRole</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet role</a>
     * in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the type of a compute environment requires an infrastructure update
     * of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     *        <code>FARGATE_SPOT</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        environments</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     *        <code>spotIamFleetRole</code> parameter. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet
     *        role</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <p>
     *        When updating a compute environment, changing the type of a compute environment requires an infrastructure
     *        update of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CRType
     */

    public ComputeResourceUpdate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     * <code>FARGATE_SPOT</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute environments</a> in
     * the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     * <code>spotIamFleetRole</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet role</a>
     * in the <i>Batch User Guide</i>.
     * </p>
     * <p>
     * When updating a compute environment, changing the type of a compute environment requires an infrastructure update
     * of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of compute environment: <code>EC2</code>, <code>SPOT</code>, <code>FARGATE</code>, or
     *        <code>FARGATE_SPOT</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        environments</a> in the <i>Batch User Guide</i>.</p>
     *        <p>
     *        If you choose <code>SPOT</code>, you must also specify an Amazon EC2 Spot Fleet role with the
     *        <code>spotIamFleetRole</code> parameter. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html">Amazon EC2 spot fleet
     *        role</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <p>
     *        When updating a compute environment, changing the type of a compute environment requires an infrastructure
     *        update of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CRType
     */

    public ComputeResourceUpdate withType(CRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter is
     * overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure. To remove
     * the custom AMI ID and use the default AMI ID, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter
     *        is overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure.
     *        To remove the custom AMI ID and use the default AMI ID, set this value to an empty string.</p>
     *        <p>
     *        When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     *        environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        The AMI that you choose for a compute environment must match the architecture of the instance types that
     *        you intend to use for that compute environment. For example, if your compute environment uses A1 instance
     *        types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and
     *        ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     *        >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer
     *        Guide</i>.
     *        </p>
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter is
     * overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure. To remove
     * the custom AMI ID and use the default AMI ID, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter
     *         is overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure.
     *         To remove the custom AMI ID and use the default AMI ID, set this value to an empty string.</p>
     *         <p>
     *         When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     *         environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *         compute environments</a> in the <i>Batch User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *         </p>
     *         </note> <note>
     *         <p>
     *         The AMI that you choose for a compute environment must match the architecture of the instance types that
     *         you intend to use for that compute environment. For example, if your compute environment uses A1 instance
     *         types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and
     *         ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     *         >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer
     *         Guide</i>.
     *         </p>
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter is
     * overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure. To remove
     * the custom AMI ID and use the default AMI ID, set this value to an empty string.
     * </p>
     * <p>
     * When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     * environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a> in the <i>Batch User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     * </p>
     * </note> <note>
     * <p>
     * The AMI that you choose for a compute environment must match the architecture of the instance types that you
     * intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the
     * compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of
     * the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     * >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter
     *        is overridden by the <code>imageIdOverride</code> member of the <code>Ec2Configuration</code> structure.
     *        To remove the custom AMI ID and use the default AMI ID, set this value to an empty string.</p>
     *        <p>
     *        When updating a compute environment, changing the AMI ID requires an infrastructure update of the compute
     *        environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating
     *        compute environments</a> in the <i>Batch User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter isn't applicable to jobs that are running on Fargate resources. Don't specify it.
     *        </p>
     *        </note> <note>
     *        <p>
     *        The AMI that you choose for a compute environment must match the architecture of the instance types that
     *        you intend to use for that compute environment. For example, if your compute environment uses A1 instance
     *        types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and
     *        ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html"
     *        >Amazon ECS-optimized Amazon Linux 2 AMI</a> in the <i>Amazon Elastic Container Service Developer
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withImageId(String imageId) {
        setImageId(imageId);
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
        if (getMinvCpus() != null)
            sb.append("MinvCpus: ").append(getMinvCpus()).append(",");
        if (getMaxvCpus() != null)
            sb.append("MaxvCpus: ").append(getMaxvCpus()).append(",");
        if (getDesiredvCpus() != null)
            sb.append("DesiredvCpus: ").append(getDesiredvCpus()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
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
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getEc2Configuration() != null)
            sb.append("Ec2Configuration: ").append(getEc2Configuration()).append(",");
        if (getUpdateToLatestImageVersion() != null)
            sb.append("UpdateToLatestImageVersion: ").append(getUpdateToLatestImageVersion()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeResourceUpdate == false)
            return false;
        ComputeResourceUpdate other = (ComputeResourceUpdate) obj;
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
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
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
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getEc2Configuration() == null ^ this.getEc2Configuration() == null)
            return false;
        if (other.getEc2Configuration() != null && other.getEc2Configuration().equals(this.getEc2Configuration()) == false)
            return false;
        if (other.getUpdateToLatestImageVersion() == null ^ this.getUpdateToLatestImageVersion() == null)
            return false;
        if (other.getUpdateToLatestImageVersion() != null && other.getUpdateToLatestImageVersion().equals(this.getUpdateToLatestImageVersion()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinvCpus() == null) ? 0 : getMinvCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxvCpus() == null) ? 0 : getMaxvCpus().hashCode());
        hashCode = prime * hashCode + ((getDesiredvCpus() == null) ? 0 : getDesiredvCpus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getEc2KeyPair() == null) ? 0 : getEc2KeyPair().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPlacementGroup() == null) ? 0 : getPlacementGroup().hashCode());
        hashCode = prime * hashCode + ((getBidPercentage() == null) ? 0 : getBidPercentage().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getEc2Configuration() == null) ? 0 : getEc2Configuration().hashCode());
        hashCode = prime * hashCode + ((getUpdateToLatestImageVersion() == null) ? 0 : getUpdateToLatestImageVersion().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        return hashCode;
    }

    @Override
    public ComputeResourceUpdate clone() {
        try {
            return (ComputeResourceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ComputeResourceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
