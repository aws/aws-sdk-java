/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an instances distribution for an Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstancesDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesDistribution implements Serializable, Cloneable {

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order, launching
     * the lowest price first.
     * </p>
     * <p>
     * If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to each
     * launch template override, launching the highest priority first. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * <p>
     * Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in the
     * overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>prioritized</code>
     * </p>
     */
    private String onDemandAllocationStrategy;
    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is launched first as your group scales.
     * </p>
     * <p>
     * If you specify weights for the instance types in the overrides, the base capacity is measured in the same unit of
     * measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides, the base capacity
     * is measured in the same unit of measurement as your group's desired capacity.
     * </p>
     * <p>
     * Default: <code>0</code>
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
     * Default: <code>100</code>
     * </p>
     */
    private Integer onDemandPercentageAboveBaseCapacity;
    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot
     * pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you
     * specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group launches
     * instances using Spot pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use <code>capacity-optimized-prioritized</code> and set the order of instance types in the list of launch
     * template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
     * honors the instance type priorities on a best-effort basis but optimizes for capacity first.
     * </p>
     * <p>
     * Default: <code>lowest-price</code>
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     * <code>capacity-optimized-prioritized</code>
     * </p>
     */
    private String spotAllocationStrategy;
    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     */
    private Integer spotInstancePools;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at its
     * default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a
     * value that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If your maximum price is lower than the Spot price for the instance types that you selected, your Spot Instances
     * are not launched.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     */
    private String spotMaxPrice;

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order, launching
     * the lowest price first.
     * </p>
     * <p>
     * If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to each
     * launch template override, launching the highest priority first. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * <p>
     * Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in the
     * overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>prioritized</code>
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. </p>
     *        <p>
     *        If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order,
     *        launching the lowest price first.
     *        </p>
     *        <p>
     *        If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to
     *        each launch template override, launching the highest priority first. If all your On-Demand capacity cannot
     *        be fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining
     *        capacity using the second priority instance type, and so on.
     *        </p>
     *        <p>
     *        Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in the
     *        overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     *        </p>
     *        <p>
     *        Valid values: <code>lowest-price</code> | <code>prioritized</code>
     */

    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order, launching
     * the lowest price first.
     * </p>
     * <p>
     * If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to each
     * launch template override, launching the highest priority first. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * <p>
     * Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in the
     * overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>prioritized</code>
     * </p>
     * 
     * @return The order of the launch template overrides to use in fulfilling On-Demand capacity. </p>
     *         <p>
     *         If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order,
     *         launching the lowest price first.
     *         </p>
     *         <p>
     *         If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to
     *         each launch template override, launching the highest priority first. If all your On-Demand capacity
     *         cannot be fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the
     *         remaining capacity using the second priority instance type, and so on.
     *         </p>
     *         <p>
     *         Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in
     *         the overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     *         </p>
     *         <p>
     *         Valid values: <code>lowest-price</code> | <code>prioritized</code>
     */

    public String getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order, launching
     * the lowest price first.
     * </p>
     * <p>
     * If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to each
     * launch template override, launching the highest priority first. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * <p>
     * Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in the
     * overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>prioritized</code>
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. </p>
     *        <p>
     *        If you specify <code>lowest-price</code>, Amazon EC2 Auto Scaling uses price to determine the order,
     *        launching the lowest price first.
     *        </p>
     *        <p>
     *        If you specify <code>prioritized</code>, Amazon EC2 Auto Scaling uses the priority that you assigned to
     *        each launch template override, launching the highest priority first. If all your On-Demand capacity cannot
     *        be fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining
     *        capacity using the second priority instance type, and so on.
     *        </p>
     *        <p>
     *        Default: <code>lowest-price</code> for Auto Scaling groups that specify <a>InstanceRequirements</a> in the
     *        overrides and <code>prioritized</code> for Auto Scaling groups that don't.
     *        </p>
     *        <p>
     *        Valid values: <code>lowest-price</code> | <code>prioritized</code>
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
     * If you specify weights for the instance types in the overrides, the base capacity is measured in the same unit of
     * measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides, the base capacity
     * is measured in the same unit of measurement as your group's desired capacity.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is launched first as your group scales.</p>
     *        <p>
     *        If you specify weights for the instance types in the overrides, the base capacity is measured in the same
     *        unit of measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides,
     *        the base capacity is measured in the same unit of measurement as your group's desired capacity.
     *        </p>
     *        <p>
     *        Default: <code>0</code>
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
     * If you specify weights for the instance types in the overrides, the base capacity is measured in the same unit of
     * measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides, the base capacity
     * is measured in the same unit of measurement as your group's desired capacity.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @return The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *         This base portion is launched first as your group scales.</p>
     *         <p>
     *         If you specify weights for the instance types in the overrides, the base capacity is measured in the same
     *         unit of measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides,
     *         the base capacity is measured in the same unit of measurement as your group's desired capacity.
     *         </p>
     *         <p>
     *         Default: <code>0</code>
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
     * If you specify weights for the instance types in the overrides, the base capacity is measured in the same unit of
     * measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides, the base capacity
     * is measured in the same unit of measurement as your group's desired capacity.
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is launched first as your group scales.</p>
     *        <p>
     *        If you specify weights for the instance types in the overrides, the base capacity is measured in the same
     *        unit of measurement as the instance types. If you specify <a>InstanceRequirements</a> in the overrides,
     *        the base capacity is measured in the same unit of measurement as your group's desired capacity.
     *        </p>
     *        <p>
     *        Default: <code>0</code>
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
     * Default: <code>100</code>
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *        Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used.</p>
     *        <p>
     *        Default: <code>100</code>
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
     * Default: <code>100</code>
     * </p>
     * 
     * @return Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *         <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *         Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used.</p>
     *         <p>
     *         Default: <code>100</code>
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
     * Default: <code>100</code>
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *        Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used.</p>
     *        <p>
     *        Default: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        setOnDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot
     * pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you
     * specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group launches
     * instances using Spot pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use <code>capacity-optimized-prioritized</code> and set the order of instance types in the list of launch
     * template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
     * honors the instance type priorities on a best-effort basis but optimizes for capacity first.
     * </p>
     * <p>
     * Default: <code>lowest-price</code>
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * 
     * @param spotAllocationStrategy
     *        Indicates how to allocate instances across Spot Instance pools. </p>
     *        <p>
     *        If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using
     *        the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools
     *        that you specify.
     *        </p>
     *        <p>
     *        If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group
     *        launches instances using Spot pools that are optimally chosen based on the available Spot capacity.
     *        Alternatively, you can use <code>capacity-optimized-prioritized</code> and set the order of instance types
     *        in the list of launch template overrides from highest to lowest priority (from first to last in the list).
     *        Amazon EC2 Auto Scaling honors the instance type priorities on a best-effort basis but optimizes for
     *        capacity first.
     *        </p>
     *        <p>
     *        Default: <code>lowest-price</code>
     *        </p>
     *        <p>
     *        Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     *        <code>capacity-optimized-prioritized</code>
     */

    public void setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot
     * pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you
     * specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group launches
     * instances using Spot pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use <code>capacity-optimized-prioritized</code> and set the order of instance types in the list of launch
     * template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
     * honors the instance type priorities on a best-effort basis but optimizes for capacity first.
     * </p>
     * <p>
     * Default: <code>lowest-price</code>
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * 
     * @return Indicates how to allocate instances across Spot Instance pools. </p>
     *         <p>
     *         If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using
     *         the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools
     *         that you specify.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group
     *         launches instances using Spot pools that are optimally chosen based on the available Spot capacity.
     *         Alternatively, you can use <code>capacity-optimized-prioritized</code> and set the order of instance
     *         types in the list of launch template overrides from highest to lowest priority (from first to last in the
     *         list). Amazon EC2 Auto Scaling honors the instance type priorities on a best-effort basis but optimizes
     *         for capacity first.
     *         </p>
     *         <p>
     *         Default: <code>lowest-price</code>
     *         </p>
     *         <p>
     *         Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     *         <code>capacity-optimized-prioritized</code>
     */

    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot
     * pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you
     * specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group launches
     * instances using Spot pools that are optimally chosen based on the available Spot capacity. Alternatively, you can
     * use <code>capacity-optimized-prioritized</code> and set the order of instance types in the list of launch
     * template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
     * honors the instance type priorities on a best-effort basis but optimizes for capacity first.
     * </p>
     * <p>
     * Default: <code>lowest-price</code>
     * </p>
     * <p>
     * Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * 
     * @param spotAllocationStrategy
     *        Indicates how to allocate instances across Spot Instance pools. </p>
     *        <p>
     *        If the allocation strategy is <code>lowest-price</code>, the Auto Scaling group launches instances using
     *        the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools
     *        that you specify.
     *        </p>
     *        <p>
     *        If the allocation strategy is <code>capacity-optimized</code> (recommended), the Auto Scaling group
     *        launches instances using Spot pools that are optimally chosen based on the available Spot capacity.
     *        Alternatively, you can use <code>capacity-optimized-prioritized</code> and set the order of instance types
     *        in the list of launch template overrides from highest to lowest priority (from first to last in the list).
     *        Amazon EC2 Auto Scaling honors the instance type priorities on a best-effort basis but optimizes for
     *        capacity first.
     *        </p>
     *        <p>
     *        Default: <code>lowest-price</code>
     *        </p>
     *        <p>
     *        Valid values: <code>lowest-price</code> | <code>capacity-optimized</code> |
     *        <code>capacity-optimized-prioritized</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotAllocationStrategy(String spotAllocationStrategy) {
        setSpotAllocationStrategy(spotAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *        determined from the different instance types in the overrides. Valid only when the Spot allocation
     *        strategy is <code>lowest-price</code>. Value must be in the range of 1–20.</p>
     *        <p>
     *        Default: <code>2</code>
     */

    public void setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     * 
     * @return The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *         determined from the different instance types in the overrides. Valid only when the Spot allocation
     *         strategy is <code>lowest-price</code>. Value must be in the range of 1–20.</p>
     *         <p>
     *         Default: <code>2</code>
     */

    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1–20.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *        determined from the different instance types in the overrides. Valid only when the Spot allocation
     *        strategy is <code>lowest-price</code>. Value must be in the range of 1–20.</p>
     *        <p>
     *        Default: <code>2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotInstancePools(Integer spotInstancePools) {
        setSpotInstancePools(spotInstancePools);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at its
     * default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a
     * value that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If your maximum price is lower than the Spot price for the instance types that you selected, your Spot Instances
     * are not launched.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at
     *        its default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To
     *        remove a value that you previously set, include the property but specify an empty string ("") for the
     *        value.</p> <important>
     *        <p>
     *        If your maximum price is lower than the Spot price for the instance types that you selected, your Spot
     *        Instances are not launched.
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
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at its
     * default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a
     * value that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If your maximum price is lower than the Spot price for the instance types that you selected, your Spot Instances
     * are not launched.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at
     *         its default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To
     *         remove a value that you previously set, include the property but specify an empty string ("") for the
     *         value.</p> <important>
     *         <p>
     *         If your maximum price is lower than the Spot price for the instance types that you selected, your Spot
     *         Instances are not launched.
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
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at its
     * default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a
     * value that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * <important>
     * <p>
     * If your maximum price is lower than the Spot price for the instance types that you selected, your Spot Instances
     * are not launched.
     * </p>
     * </important>
     * <p>
     * Valid Range: Minimum value of 0.001
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at
     *        its default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To
     *        remove a value that you previously set, include the property but specify an empty string ("") for the
     *        value.</p> <important>
     *        <p>
     *        If your maximum price is lower than the Spot price for the instance types that you selected, your Spot
     *        Instances are not launched.
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
