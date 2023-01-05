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
 * Use this structure to specify the distribution of On-Demand Instances and Spot Instances and the allocation
 * strategies used to fulfill On-Demand and Spot capacities for a mixed instances policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstancesDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesDistribution implements Serializable, Cloneable {

    /**
     * <p>
     * The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Uses price to determine which instance types are the highest priority, launching the lowest priced instance types
     * within an Availability Zone first. This is the default value for Auto Scaling groups that specify
     * <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types first. If all your
     * On-Demand capacity cannot be fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling
     * launches the remaining capacity using the second priority instance type, and so on. This is the default value for
     * Auto Scaling groups that don't specify <a>InstanceRequirements</a> and cannot be used for groups that do.
     * </p>
     * </dd>
     * </dl>
     */
    private String onDemandAllocationStrategy;
    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is launched first as your group scales.
     * </p>
     * <p>
     * This number has the same unit of measurement as the group's desired capacity. If you change the default unit of
     * measurement (number of instances) by specifying weighted capacity values in your launch template overrides list,
     * or by changing the default desired capacity type setting of the group, you must specify this number using the
     * same unit of measurement.
     * </p>
     * <p>
     * Default: 0
     * </p>
     */
    private Integer onDemandBaseCapacity;
    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). If set to 100, only On-Demand Instances are used.
     * </p>
     * <p>
     * Default: 100
     * </p>
     */
    private Integer onDemandPercentageAboveBaseCapacity;
    /**
     * <p>
     * The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>capacity-optimized</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This strategy
     * has the lowest risk of interruption. To give certain instance types a higher chance of launching first, use
     * <code>capacity-optimized-prioritized</code>.
     * </p>
     * </dd>
     * <dt>capacity-optimized-prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best effort basis but
     * optimizes for capacity first. Note that if the On-Demand allocation strategy is set to <code>prioritized</code>,
     * the same priority is applied when fulfilling On-Demand capacity. This is not a valid value for Auto Scaling
     * groups that specify <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of Spot
     * pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired capacity is
     * met, you might receive Spot Instances from several pools. This is the default value, but it might lead to high
     * interruption rates because this strategy only considers instance price and not available capacity.
     * </p>
     * </dd>
     * <dt>price-capacity-optimized (recommended)</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price.
     * </p>
     * </dd>
     * </dl>
     */
    private String spotAllocationStrategy;
    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the <code>SpotAllocationStrategy</code> is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: 2
     * </p>
     */
    private Integer spotInstancePools;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is lower
     * than the Spot price for the instance types that you selected, your Spot Instances are not launched. We do not
     * recommend specifying a maximum price because it can lead to increased interruptions. When Spot Instances launch,
     * you pay the current Spot price. To remove a maximum price that you previously set, include the property but
     * specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify
     * one.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     */
    private String spotMaxPrice;

    /**
     * <p>
     * The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Uses price to determine which instance types are the highest priority, launching the lowest priced instance types
     * within an Availability Zone first. This is the default value for Auto Scaling groups that specify
     * <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types first. If all your
     * On-Demand capacity cannot be fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling
     * launches the remaining capacity using the second priority instance type, and so on. This is the default value for
     * Auto Scaling groups that don't specify <a>InstanceRequirements</a> and cannot be used for groups that do.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param onDemandAllocationStrategy
     *        The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance
     *        types are determined by the launch template overrides that you specify.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>lowest-price</dt>
     *        <dd>
     *        <p>
     *        Uses price to determine which instance types are the highest priority, launching the lowest priced
     *        instance types within an Availability Zone first. This is the default value for Auto Scaling groups that
     *        specify <a>InstanceRequirements</a>.
     *        </p>
     *        </dd>
     *        <dt>prioritized</dt>
     *        <dd>
     *        <p>
     *        You set the order of instance types for the launch template overrides from highest to lowest priority
     *        (from first to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types
     *        first. If all your On-Demand capacity cannot be fulfilled using your highest priority instance type, then
     *        Amazon EC2 Auto Scaling launches the remaining capacity using the second priority instance type, and so
     *        on. This is the default value for Auto Scaling groups that don't specify <a>InstanceRequirements</a> and
     *        cannot be used for groups that do.
     *        </p>
     *        </dd>
     */

    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Uses price to determine which instance types are the highest priority, launching the lowest priced instance types
     * within an Availability Zone first. This is the default value for Auto Scaling groups that specify
     * <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types first. If all your
     * On-Demand capacity cannot be fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling
     * launches the remaining capacity using the second priority instance type, and so on. This is the default value for
     * Auto Scaling groups that don't specify <a>InstanceRequirements</a> and cannot be used for groups that do.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance
     *         types are determined by the launch template overrides that you specify.</p>
     *         <p>
     *         The following lists the valid values:
     *         </p>
     *         <dl>
     *         <dt>lowest-price</dt>
     *         <dd>
     *         <p>
     *         Uses price to determine which instance types are the highest priority, launching the lowest priced
     *         instance types within an Availability Zone first. This is the default value for Auto Scaling groups that
     *         specify <a>InstanceRequirements</a>.
     *         </p>
     *         </dd>
     *         <dt>prioritized</dt>
     *         <dd>
     *         <p>
     *         You set the order of instance types for the launch template overrides from highest to lowest priority
     *         (from first to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types
     *         first. If all your On-Demand capacity cannot be fulfilled using your highest priority instance type, then
     *         Amazon EC2 Auto Scaling launches the remaining capacity using the second priority instance type, and so
     *         on. This is the default value for Auto Scaling groups that don't specify <a>InstanceRequirements</a> and
     *         cannot be used for groups that do.
     *         </p>
     *         </dd>
     */

    public String getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Uses price to determine which instance types are the highest priority, launching the lowest priced instance types
     * within an Availability Zone first. This is the default value for Auto Scaling groups that specify
     * <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types first. If all your
     * On-Demand capacity cannot be fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling
     * launches the remaining capacity using the second priority instance type, and so on. This is the default value for
     * Auto Scaling groups that don't specify <a>InstanceRequirements</a> and cannot be used for groups that do.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param onDemandAllocationStrategy
     *        The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance
     *        types are determined by the launch template overrides that you specify.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>lowest-price</dt>
     *        <dd>
     *        <p>
     *        Uses price to determine which instance types are the highest priority, launching the lowest priced
     *        instance types within an Availability Zone first. This is the default value for Auto Scaling groups that
     *        specify <a>InstanceRequirements</a>.
     *        </p>
     *        </dd>
     *        <dt>prioritized</dt>
     *        <dd>
     *        <p>
     *        You set the order of instance types for the launch template overrides from highest to lowest priority
     *        (from first to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types
     *        first. If all your On-Demand capacity cannot be fulfilled using your highest priority instance type, then
     *        Amazon EC2 Auto Scaling launches the remaining capacity using the second priority instance type, and so
     *        on. This is the default value for Auto Scaling groups that don't specify <a>InstanceRequirements</a> and
     *        cannot be used for groups that do.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        setOnDemandAllocationStrategy(onDemandAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is launched first as your group scales.
     * </p>
     * <p>
     * This number has the same unit of measurement as the group's desired capacity. If you change the default unit of
     * measurement (number of instances) by specifying weighted capacity values in your launch template overrides list,
     * or by changing the default desired capacity type setting of the group, you must specify this number using the
     * same unit of measurement.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is launched first as your group scales.</p>
     *        <p>
     *        This number has the same unit of measurement as the group's desired capacity. If you change the default
     *        unit of measurement (number of instances) by specifying weighted capacity values in your launch template
     *        overrides list, or by changing the default desired capacity type setting of the group, you must specify
     *        this number using the same unit of measurement.
     *        </p>
     *        <p>
     *        Default: 0
     */

    public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is launched first as your group scales.
     * </p>
     * <p>
     * This number has the same unit of measurement as the group's desired capacity. If you change the default unit of
     * measurement (number of instances) by specifying weighted capacity values in your launch template overrides list,
     * or by changing the default desired capacity type setting of the group, you must specify this number using the
     * same unit of measurement.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @return The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *         This base portion is launched first as your group scales.</p>
     *         <p>
     *         This number has the same unit of measurement as the group's desired capacity. If you change the default
     *         unit of measurement (number of instances) by specifying weighted capacity values in your launch template
     *         overrides list, or by changing the default desired capacity type setting of the group, you must specify
     *         this number using the same unit of measurement.
     *         </p>
     *         <p>
     *         Default: 0
     */

    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is launched first as your group scales.
     * </p>
     * <p>
     * This number has the same unit of measurement as the group's desired capacity. If you change the default unit of
     * measurement (number of instances) by specifying weighted capacity values in your launch template overrides list,
     * or by changing the default desired capacity type setting of the group, you must specify this number using the
     * same unit of measurement.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is launched first as your group scales.</p>
     *        <p>
     *        This number has the same unit of measurement as the group's desired capacity. If you change the default
     *        unit of measurement (number of instances) by specifying weighted capacity values in your launch template
     *        overrides list, or by changing the default desired capacity type setting of the group, you must specify
     *        this number using the same unit of measurement.
     *        </p>
     *        <p>
     *        Default: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        setOnDemandBaseCapacity(onDemandBaseCapacity);
        return this;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). If set to 100, only On-Demand Instances are used.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *        Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used.</p>
     *        <p>
     *        Default: 100
     */

    public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). If set to 100, only On-Demand Instances are used.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @return Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *         <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *         Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used.</p>
     *         <p>
     *         Default: 100
     */

    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). If set to 100, only On-Demand Instances are used.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *        Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used.</p>
     *        <p>
     *        Default: 100
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        setOnDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity);
        return this;
    }

    /**
     * <p>
     * The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>capacity-optimized</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This strategy
     * has the lowest risk of interruption. To give certain instance types a higher chance of launching first, use
     * <code>capacity-optimized-prioritized</code>.
     * </p>
     * </dd>
     * <dt>capacity-optimized-prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best effort basis but
     * optimizes for capacity first. Note that if the On-Demand allocation strategy is set to <code>prioritized</code>,
     * the same priority is applied when fulfilling On-Demand capacity. This is not a valid value for Auto Scaling
     * groups that specify <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of Spot
     * pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired capacity is
     * met, you might receive Spot Instances from several pools. This is the default value, but it might lead to high
     * interruption rates because this strategy only considers instance price and not available capacity.
     * </p>
     * </dd>
     * <dt>price-capacity-optimized (recommended)</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param spotAllocationStrategy
     *        The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types
     *        are determined by the launch template overrides that you specify.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>capacity-optimized</dt>
     *        <dd>
     *        <p>
     *        Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This
     *        strategy has the lowest risk of interruption. To give certain instance types a higher chance of launching
     *        first, use <code>capacity-optimized-prioritized</code>.
     *        </p>
     *        </dd>
     *        <dt>capacity-optimized-prioritized</dt>
     *        <dd>
     *        <p>
     *        You set the order of instance types for the launch template overrides from highest to lowest priority
     *        (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best
     *        effort basis but optimizes for capacity first. Note that if the On-Demand allocation strategy is set to
     *        <code>prioritized</code>, the same priority is applied when fulfilling On-Demand capacity. This is not a
     *        valid value for Auto Scaling groups that specify <a>InstanceRequirements</a>.
     *        </p>
     *        </dd>
     *        <dt>lowest-price</dt>
     *        <dd>
     *        <p>
     *        Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of
     *        Spot pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired
     *        capacity is met, you might receive Spot Instances from several pools. This is the default value, but it
     *        might lead to high interruption rates because this strategy only considers instance price and not
     *        available capacity.
     *        </p>
     *        </dd>
     *        <dt>price-capacity-optimized (recommended)</dt>
     *        <dd>
     *        <p>
     *        The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *        Instance pools that are the least likely to be interrupted and have the lowest possible price.
     *        </p>
     *        </dd>
     */

    public void setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>capacity-optimized</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This strategy
     * has the lowest risk of interruption. To give certain instance types a higher chance of launching first, use
     * <code>capacity-optimized-prioritized</code>.
     * </p>
     * </dd>
     * <dt>capacity-optimized-prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best effort basis but
     * optimizes for capacity first. Note that if the On-Demand allocation strategy is set to <code>prioritized</code>,
     * the same priority is applied when fulfilling On-Demand capacity. This is not a valid value for Auto Scaling
     * groups that specify <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of Spot
     * pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired capacity is
     * met, you might receive Spot Instances from several pools. This is the default value, but it might lead to high
     * interruption rates because this strategy only considers instance price and not available capacity.
     * </p>
     * </dd>
     * <dt>price-capacity-optimized (recommended)</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types
     *         are determined by the launch template overrides that you specify.</p>
     *         <p>
     *         The following lists the valid values:
     *         </p>
     *         <dl>
     *         <dt>capacity-optimized</dt>
     *         <dd>
     *         <p>
     *         Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This
     *         strategy has the lowest risk of interruption. To give certain instance types a higher chance of launching
     *         first, use <code>capacity-optimized-prioritized</code>.
     *         </p>
     *         </dd>
     *         <dt>capacity-optimized-prioritized</dt>
     *         <dd>
     *         <p>
     *         You set the order of instance types for the launch template overrides from highest to lowest priority
     *         (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best
     *         effort basis but optimizes for capacity first. Note that if the On-Demand allocation strategy is set to
     *         <code>prioritized</code>, the same priority is applied when fulfilling On-Demand capacity. This is not a
     *         valid value for Auto Scaling groups that specify <a>InstanceRequirements</a>.
     *         </p>
     *         </dd>
     *         <dt>lowest-price</dt>
     *         <dd>
     *         <p>
     *         Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of
     *         Spot pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired
     *         capacity is met, you might receive Spot Instances from several pools. This is the default value, but it
     *         might lead to high interruption rates because this strategy only considers instance price and not
     *         available capacity.
     *         </p>
     *         </dd>
     *         <dt>price-capacity-optimized (recommended)</dt>
     *         <dd>
     *         <p>
     *         The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *         Instance pools that are the least likely to be interrupted and have the lowest possible price.
     *         </p>
     *         </dd>
     */

    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * <p>
     * The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types are
     * determined by the launch template overrides that you specify.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>capacity-optimized</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This strategy
     * has the lowest risk of interruption. To give certain instance types a higher chance of launching first, use
     * <code>capacity-optimized-prioritized</code>.
     * </p>
     * </dd>
     * <dt>capacity-optimized-prioritized</dt>
     * <dd>
     * <p>
     * You set the order of instance types for the launch template overrides from highest to lowest priority (from first
     * to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best effort basis but
     * optimizes for capacity first. Note that if the On-Demand allocation strategy is set to <code>prioritized</code>,
     * the same priority is applied when fulfilling On-Demand capacity. This is not a valid value for Auto Scaling
     * groups that specify <a>InstanceRequirements</a>.
     * </p>
     * </dd>
     * <dt>lowest-price</dt>
     * <dd>
     * <p>
     * Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of Spot
     * pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired capacity is
     * met, you might receive Spot Instances from several pools. This is the default value, but it might lead to high
     * interruption rates because this strategy only considers instance price and not available capacity.
     * </p>
     * </dd>
     * <dt>price-capacity-optimized (recommended)</dt>
     * <dd>
     * <p>
     * The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot Instance
     * pools that are the least likely to be interrupted and have the lowest possible price.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param spotAllocationStrategy
     *        The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types
     *        are determined by the launch template overrides that you specify.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>capacity-optimized</dt>
     *        <dd>
     *        <p>
     *        Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This
     *        strategy has the lowest risk of interruption. To give certain instance types a higher chance of launching
     *        first, use <code>capacity-optimized-prioritized</code>.
     *        </p>
     *        </dd>
     *        <dt>capacity-optimized-prioritized</dt>
     *        <dd>
     *        <p>
     *        You set the order of instance types for the launch template overrides from highest to lowest priority
     *        (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best
     *        effort basis but optimizes for capacity first. Note that if the On-Demand allocation strategy is set to
     *        <code>prioritized</code>, the same priority is applied when fulfilling On-Demand capacity. This is not a
     *        valid value for Auto Scaling groups that specify <a>InstanceRequirements</a>.
     *        </p>
     *        </dd>
     *        <dt>lowest-price</dt>
     *        <dd>
     *        <p>
     *        Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of
     *        Spot pools that you specify for the <code>SpotInstancePools</code> property. To ensure that your desired
     *        capacity is met, you might receive Spot Instances from several pools. This is the default value, but it
     *        might lead to high interruption rates because this strategy only considers instance price and not
     *        available capacity.
     *        </p>
     *        </dd>
     *        <dt>price-capacity-optimized (recommended)</dt>
     *        <dd>
     *        <p>
     *        The price and capacity optimized allocation strategy looks at both price and capacity to select the Spot
     *        Instance pools that are the least likely to be interrupted and have the lowest possible price.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotAllocationStrategy(String spotAllocationStrategy) {
        setSpotAllocationStrategy(spotAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the <code>SpotAllocationStrategy</code> is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: 2
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *        determined from the different instance types in the overrides. Valid only when the
     *        <code>SpotAllocationStrategy</code> is <code>lowest-price</code>. Value must be in the range of 1–20.</p>
     *        <p>
     *        Default: 2
     */

    public void setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the <code>SpotAllocationStrategy</code> is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: 2
     * </p>
     * 
     * @return The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *         determined from the different instance types in the overrides. Valid only when the
     *         <code>SpotAllocationStrategy</code> is <code>lowest-price</code>. Value must be in the range of 1–20.</p>
     *         <p>
     *         Default: 2
     */

    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the <code>SpotAllocationStrategy</code> is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: 2
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *        determined from the different instance types in the overrides. Valid only when the
     *        <code>SpotAllocationStrategy</code> is <code>lowest-price</code>. Value must be in the range of 1–20.</p>
     *        <p>
     *        Default: 2
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotInstancePools(Integer spotInstancePools) {
        setSpotInstancePools(spotInstancePools);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is lower
     * than the Spot price for the instance types that you selected, your Spot Instances are not launched. We do not
     * recommend specifying a maximum price because it can lead to increased interruptions. When Spot Instances launch,
     * you pay the current Spot price. To remove a maximum price that you previously set, include the property but
     * specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify
     * one.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is
     *        lower than the Spot price for the instance types that you selected, your Spot Instances are not launched.
     *        We do not recommend specifying a maximum price because it can lead to increased interruptions. When Spot
     *        Instances launch, you pay the current Spot price. To remove a maximum price that you previously set,
     *        include the property but specify an empty string ("") for the value.</p> <important>
     *        <p>
     *        If you specify a maximum price, your instances will be interrupted more frequently than if you do not
     *        specify one.
     *        </p>
     *        </important>
     *        <p>
     *        Valid Range: Minimum value of 0.001
     */

    public void setSpotMaxPrice(String spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is lower
     * than the Spot price for the instance types that you selected, your Spot Instances are not launched. We do not
     * recommend specifying a maximum price because it can lead to increased interruptions. When Spot Instances launch,
     * you pay the current Spot price. To remove a maximum price that you previously set, include the property but
     * specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify
     * one.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is
     *         lower than the Spot price for the instance types that you selected, your Spot Instances are not launched.
     *         We do not recommend specifying a maximum price because it can lead to increased interruptions. When Spot
     *         Instances launch, you pay the current Spot price. To remove a maximum price that you previously set,
     *         include the property but specify an empty string ("") for the value.</p> <important>
     *         <p>
     *         If you specify a maximum price, your instances will be interrupted more frequently than if you do not
     *         specify one.
     *         </p>
     *         </important>
     *         <p>
     *         Valid Range: Minimum value of 0.001
     */

    public String getSpotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is lower
     * than the Spot price for the instance types that you selected, your Spot Instances are not launched. We do not
     * recommend specifying a maximum price because it can lead to increased interruptions. When Spot Instances launch,
     * you pay the current Spot price. To remove a maximum price that you previously set, include the property but
     * specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify
     * one.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is
     *        lower than the Spot price for the instance types that you selected, your Spot Instances are not launched.
     *        We do not recommend specifying a maximum price because it can lead to increased interruptions. When Spot
     *        Instances launch, you pay the current Spot price. To remove a maximum price that you previously set,
     *        include the property but specify an empty string ("") for the value.</p> <important>
     *        <p>
     *        If you specify a maximum price, your instances will be interrupted more frequently than if you do not
     *        specify one.
     *        </p>
     *        </important>
     *        <p>
     *        Valid Range: Minimum value of 0.001
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotMaxPrice(String spotMaxPrice) {
        setSpotMaxPrice(spotMaxPrice);
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
        if (getOnDemandAllocationStrategy() != null)
            sb.append("OnDemandAllocationStrategy: ").append(getOnDemandAllocationStrategy()).append(",");
        if (getOnDemandBaseCapacity() != null)
            sb.append("OnDemandBaseCapacity: ").append(getOnDemandBaseCapacity()).append(",");
        if (getOnDemandPercentageAboveBaseCapacity() != null)
            sb.append("OnDemandPercentageAboveBaseCapacity: ").append(getOnDemandPercentageAboveBaseCapacity()).append(",");
        if (getSpotAllocationStrategy() != null)
            sb.append("SpotAllocationStrategy: ").append(getSpotAllocationStrategy()).append(",");
        if (getSpotInstancePools() != null)
            sb.append("SpotInstancePools: ").append(getSpotInstancePools()).append(",");
        if (getSpotMaxPrice() != null)
            sb.append("SpotMaxPrice: ").append(getSpotMaxPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancesDistribution == false)
            return false;
        InstancesDistribution other = (InstancesDistribution) obj;
        if (other.getOnDemandAllocationStrategy() == null ^ this.getOnDemandAllocationStrategy() == null)
            return false;
        if (other.getOnDemandAllocationStrategy() != null && other.getOnDemandAllocationStrategy().equals(this.getOnDemandAllocationStrategy()) == false)
            return false;
        if (other.getOnDemandBaseCapacity() == null ^ this.getOnDemandBaseCapacity() == null)
            return false;
        if (other.getOnDemandBaseCapacity() != null && other.getOnDemandBaseCapacity().equals(this.getOnDemandBaseCapacity()) == false)
            return false;
        if (other.getOnDemandPercentageAboveBaseCapacity() == null ^ this.getOnDemandPercentageAboveBaseCapacity() == null)
            return false;
        if (other.getOnDemandPercentageAboveBaseCapacity() != null
                && other.getOnDemandPercentageAboveBaseCapacity().equals(this.getOnDemandPercentageAboveBaseCapacity()) == false)
            return false;
        if (other.getSpotAllocationStrategy() == null ^ this.getSpotAllocationStrategy() == null)
            return false;
        if (other.getSpotAllocationStrategy() != null && other.getSpotAllocationStrategy().equals(this.getSpotAllocationStrategy()) == false)
            return false;
        if (other.getSpotInstancePools() == null ^ this.getSpotInstancePools() == null)
            return false;
        if (other.getSpotInstancePools() != null && other.getSpotInstancePools().equals(this.getSpotInstancePools()) == false)
            return false;
        if (other.getSpotMaxPrice() == null ^ this.getSpotMaxPrice() == null)
            return false;
        if (other.getSpotMaxPrice() != null && other.getSpotMaxPrice().equals(this.getSpotMaxPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnDemandAllocationStrategy() == null) ? 0 : getOnDemandAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getOnDemandBaseCapacity() == null) ? 0 : getOnDemandBaseCapacity().hashCode());
        hashCode = prime * hashCode + ((getOnDemandPercentageAboveBaseCapacity() == null) ? 0 : getOnDemandPercentageAboveBaseCapacity().hashCode());
        hashCode = prime * hashCode + ((getSpotAllocationStrategy() == null) ? 0 : getSpotAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getSpotInstancePools() == null) ? 0 : getSpotInstancePools().hashCode());
        hashCode = prime * hashCode + ((getSpotMaxPrice() == null) ? 0 : getSpotMaxPrice().hashCode());
        return hashCode;
    }

    @Override
    public InstancesDistribution clone() {
        try {
            return (InstancesDistribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
