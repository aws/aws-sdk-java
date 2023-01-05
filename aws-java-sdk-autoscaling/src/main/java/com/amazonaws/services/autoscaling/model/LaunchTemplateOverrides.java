/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Use this structure to let Amazon EC2 Auto Scaling do the following when the Auto Scaling group has a mixed instances
 * policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Override the instance type that is specified in the launch template.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use multiple instance types.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Specify the instance types that you want, or define your instance requirements instead and let Amazon EC2 Auto
 * Scaling provision the available instance types that meet your requirements. This can provide Amazon EC2 Auto Scaling
 * with a larger selection of instance types to choose from when fulfilling Spot and On-Demand capacities. You can view
 * which instance types are matched before you apply the instance requirements to your Auto Scaling group.
 * </p>
 * <p>
 * After you define your instance requirements, you don't have to keep updating these settings to get new EC2 instance
 * types automatically. Amazon EC2 Auto Scaling uses the instance requirements of the Auto Scaling group to determine
 * whether a new EC2 instance type can be used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LaunchTemplateOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateOverrides implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 40 instance types per Auto Scaling group.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * If you provide a list of instance types to use, you can specify the number of capacity units provided by each
     * instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     * characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even if
     * this results in an overage. For example, if there are two units remaining to fulfill capacity, and Amazon EC2
     * Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of five units, the instance is
     * launched, and the desired capacity is exceeded by three units. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     * >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * Value must be in the range of 1–999.
     * </p>
     * <p>
     * If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value for
     * <code>WeightedCapacity</code> for all of them.
     * </p>
     * <important>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * </important>
     */
    private String weightedCapacity;
    /**
     * <p>
     * Provides a launch template for the specified instance type or set of instance requirements. For example, some
     * instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling
     * uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     * >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the overrides
     * and in the <code>LaunchTemplate</code> definition count towards this limit.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplateSpecification;
    /**
     * <p>
     * The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance types.
     * Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance types.
     * </p>
     * <p>
     * You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful for
     * provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To do this,
     * create the AMIs and create a new launch template for each AMI. Then, create a compatible set of instance
     * requirements for each launch template.
     * </p>
     * <note>
     * <p>
     * If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     * </p>
     * </note>
     */
    private InstanceRequirements instanceRequirements;

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 40 instance types per Auto Scaling group.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in
     *        your requested Region and Availability Zones. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        You can specify up to 40 instance types per Auto Scaling group.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 40 instance types per Auto Scaling group.
     * </p>
     * 
     * @return The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in
     *         your requested Region and Availability Zones. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         You can specify up to 40 instance types per Auto Scaling group.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 40 instance types per Auto Scaling group.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>m3.xlarge</code>. You must specify an instance type that is supported in
     *        your requested Region and Availability Zones. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        You can specify up to 40 instance types per Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * If you provide a list of instance types to use, you can specify the number of capacity units provided by each
     * instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     * characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even if
     * this results in an overage. For example, if there are two units remaining to fulfill capacity, and Amazon EC2
     * Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of five units, the instance is
     * launched, and the desired capacity is exceeded by three units. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     * >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * Value must be in the range of 1–999.
     * </p>
     * <p>
     * If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value for
     * <code>WeightedCapacity</code> for all of them.
     * </p>
     * <important>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * </important>
     * 
     * @param weightedCapacity
     *        If you provide a list of instance types to use, you can specify the number of capacity units provided by
     *        each instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     *        characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     *        capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even
     *        if this results in an overage. For example, if there are two units remaining to fulfill capacity, and
     *        Amazon EC2 Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of five units,
     *        the instance is launched, and the desired capacity is exceeded by three units. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     *        >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>. Value must be in the range of 1–999.</p>
     *        <p>
     *        If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value
     *        for <code>WeightedCapacity</code> for all of them.
     *        </p>
     *        <important>
     *        <p>
     *        Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>,
     *        and <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However,
     *        if you configure a mixed instances policy that defines weights for the instance types, you must specify
     *        these sizes with the same units that you use for weighting instances.
     *        </p>
     */

    public void setWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * If you provide a list of instance types to use, you can specify the number of capacity units provided by each
     * instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     * characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even if
     * this results in an overage. For example, if there are two units remaining to fulfill capacity, and Amazon EC2
     * Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of five units, the instance is
     * launched, and the desired capacity is exceeded by three units. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     * >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * Value must be in the range of 1–999.
     * </p>
     * <p>
     * If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value for
     * <code>WeightedCapacity</code> for all of them.
     * </p>
     * <important>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * </important>
     * 
     * @return If you provide a list of instance types to use, you can specify the number of capacity units provided by
     *         each instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     *         characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the
     *         desired capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally
     *         fulfilled, even if this results in an overage. For example, if there are two units remaining to fulfill
     *         capacity, and Amazon EC2 Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of
     *         five units, the instance is launched, and the desired capacity is exceeded by three units. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     *         >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>. Value must be in the range of 1–999.</p>
     *         <p>
     *         If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value
     *         for <code>WeightedCapacity</code> for all of them.
     *         </p>
     *         <important>
     *         <p>
     *         Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>,
     *         and <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However,
     *         if you configure a mixed instances policy that defines weights for the instance types, you must specify
     *         these sizes with the same units that you use for weighting instances.
     *         </p>
     */

    public String getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * If you provide a list of instance types to use, you can specify the number of capacity units provided by each
     * instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     * characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even if
     * this results in an overage. For example, if there are two units remaining to fulfill capacity, and Amazon EC2
     * Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of five units, the instance is
     * launched, and the desired capacity is exceeded by three units. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     * >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * Value must be in the range of 1–999.
     * </p>
     * <p>
     * If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value for
     * <code>WeightedCapacity</code> for all of them.
     * </p>
     * <important>
     * <p>
     * Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>, and
     * <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However, if you
     * configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with
     * the same units that you use for weighting instances.
     * </p>
     * </important>
     * 
     * @param weightedCapacity
     *        If you provide a list of instance types to use, you can specify the number of capacity units provided by
     *        each instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance
     *        characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     *        capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even
     *        if this results in an overage. For example, if there are two units remaining to fulfill capacity, and
     *        Amazon EC2 Auto Scaling can only launch an instance with a <code>WeightedCapacity</code> of five units,
     *        the instance is launched, and the desired capacity is exceeded by three units. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html"
     *        >Configuring instance weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>. Value must be in the range of 1–999.</p>
     *        <p>
     *        If you specify a value for <code>WeightedCapacity</code> for one instance type, you must specify a value
     *        for <code>WeightedCapacity</code> for all of them.
     *        </p>
     *        <important>
     *        <p>
     *        Every Auto Scaling group has three size parameters (<code>DesiredCapacity</code>, <code>MaxSize</code>,
     *        and <code>MinSize</code>). Usually, you set these sizes based on a specific number of instances. However,
     *        if you configure a mixed instances policy that defines weights for the instance types, you must specify
     *        these sizes with the same units that you use for weighting instances.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withWeightedCapacity(String weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
        return this;
    }

    /**
     * <p>
     * Provides a launch template for the specified instance type or set of instance requirements. For example, some
     * instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling
     * uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     * >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the overrides
     * and in the <code>LaunchTemplate</code> definition count towards this limit.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        Provides a launch template for the specified instance type or set of instance requirements. For example,
     *        some instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto
     *        Scaling uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     *        >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>. </p>
     *        <p>
     *        You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the
     *        overrides and in the <code>LaunchTemplate</code> definition count towards this limit.
     */

    public void setLaunchTemplateSpecification(LaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    /**
     * <p>
     * Provides a launch template for the specified instance type or set of instance requirements. For example, some
     * instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling
     * uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     * >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the overrides
     * and in the <code>LaunchTemplate</code> definition count towards this limit.
     * </p>
     * 
     * @return Provides a launch template for the specified instance type or set of instance requirements. For example,
     *         some instance types might require a launch template with a different AMI. If not provided, Amazon EC2
     *         Auto Scaling uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     *         >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>. </p>
     *         <p>
     *         You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the
     *         overrides and in the <code>LaunchTemplate</code> definition count towards this limit.
     */

    public LaunchTemplateSpecification getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * <p>
     * Provides a launch template for the specified instance type or set of instance requirements. For example, some
     * instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling
     * uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     * >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the overrides
     * and in the <code>LaunchTemplate</code> definition count towards this limit.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        Provides a launch template for the specified instance type or set of instance requirements. For example,
     *        some instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto
     *        Scaling uses the launch template that's specified in the <code>LaunchTemplate</code> definition. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html"
     *        >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     *        Guide</i>. </p>
     *        <p>
     *        You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the
     *        overrides and in the <code>LaunchTemplate</code> definition count towards this limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withLaunchTemplateSpecification(LaunchTemplateSpecification launchTemplateSpecification) {
        setLaunchTemplateSpecification(launchTemplateSpecification);
        return this;
    }

    /**
     * <p>
     * The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance types.
     * Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance types.
     * </p>
     * <p>
     * You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful for
     * provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To do this,
     * create the AMIs and create a new launch template for each AMI. Then, create a compatible set of instance
     * requirements for each launch template.
     * </p>
     * <note>
     * <p>
     * If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     * </p>
     * </note>
     * 
     * @param instanceRequirements
     *        The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance
     *        types. Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance
     *        types.</p>
     *        <p>
     *        You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful
     *        for provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To
     *        do this, create the AMIs and create a new launch template for each AMI. Then, create a compatible set of
     *        instance requirements for each launch template.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     *        </p>
     */

    public void setInstanceRequirements(InstanceRequirements instanceRequirements) {
        this.instanceRequirements = instanceRequirements;
    }

    /**
     * <p>
     * The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance types.
     * Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance types.
     * </p>
     * <p>
     * You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful for
     * provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To do this,
     * create the AMIs and create a new launch template for each AMI. Then, create a compatible set of instance
     * requirements for each launch template.
     * </p>
     * <note>
     * <p>
     * If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     * </p>
     * </note>
     * 
     * @return The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance
     *         types. Then, it uses your On-Demand and Spot allocation strategies to launch instances from these
     *         instance types.</p>
     *         <p>
     *         You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful
     *         for provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To
     *         do this, create the AMIs and create a new launch template for each AMI. Then, create a compatible set of
     *         instance requirements for each launch template.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     *         </p>
     */

    public InstanceRequirements getInstanceRequirements() {
        return this.instanceRequirements;
    }

    /**
     * <p>
     * The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance types.
     * Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance types.
     * </p>
     * <p>
     * You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful for
     * provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To do this,
     * create the AMIs and create a new launch template for each AMI. Then, create a compatible set of instance
     * requirements for each launch template.
     * </p>
     * <note>
     * <p>
     * If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     * </p>
     * </note>
     * 
     * @param instanceRequirements
     *        The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance
     *        types. Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance
     *        types.</p>
     *        <p>
     *        You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful
     *        for provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To
     *        do this, create the AMIs and create a new launch template for each AMI. Then, create a compatible set of
     *        instance requirements for each launch template.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>InstanceRequirements</code>, you can't specify <code>InstanceType</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withInstanceRequirements(InstanceRequirements instanceRequirements) {
        setInstanceRequirements(instanceRequirements);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: ").append(getWeightedCapacity()).append(",");
        if (getLaunchTemplateSpecification() != null)
            sb.append("LaunchTemplateSpecification: ").append(getLaunchTemplateSpecification()).append(",");
        if (getInstanceRequirements() != null)
            sb.append("InstanceRequirements: ").append(getInstanceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateOverrides == false)
            return false;
        LaunchTemplateOverrides other = (LaunchTemplateOverrides) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        if (other.getLaunchTemplateSpecification() == null ^ this.getLaunchTemplateSpecification() == null)
            return false;
        if (other.getLaunchTemplateSpecification() != null && other.getLaunchTemplateSpecification().equals(this.getLaunchTemplateSpecification()) == false)
            return false;
        if (other.getInstanceRequirements() == null ^ this.getInstanceRequirements() == null)
            return false;
        if (other.getInstanceRequirements() != null && other.getInstanceRequirements().equals(this.getInstanceRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateSpecification() == null) ? 0 : getLaunchTemplateSpecification().hashCode());
        hashCode = prime * hashCode + ((getInstanceRequirements() == null) ? 0 : getInstanceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateOverrides clone() {
        try {
            return (LaunchTemplateOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
