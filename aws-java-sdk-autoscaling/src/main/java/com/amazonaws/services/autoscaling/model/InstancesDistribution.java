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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an instances distribution for an Auto Scaling group with a <a>MixedInstancesPolicy</a>.
 * </p>
 * <p>
 * The instances distribution specifies the distribution of On-Demand Instances and Spot Instances, the maximum price to
 * pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot
 * capacities.
 * </p>
 * <p>
 * When you update <code>SpotAllocationStrategy</code>, <code>SpotInstancePools</code>, or <code>SpotMaxPrice</code>,
 * this update action does not deploy any changes across the running Amazon EC2 instances in the group. Your existing
 * Spot Instances continue to run as long as the maximum price for those instances is higher than the current Spot
 * price. When scale out occurs, Amazon EC2 Auto Scaling launches instances based on the new settings. When scale in
 * occurs, Amazon EC2 Auto Scaling terminates instances according to the group's termination policies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstancesDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesDistribution implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     * <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types in the
     * overrides to define the launch priority of each instance type. The first instance type in the array is
     * prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority
     * instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type,
     * and so on.
     * </p>
     */
    private String onDemandAllocationStrategy;
    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales. Defaults to 0 if not specified. If you specify weights for the
     * instance types in the overrides, set the value of <code>OnDemandBaseCapacity</code> in terms of the number of
     * capacity units, and not the number of instances.
     * </p>
     */
    private Integer onDemandBaseCapacity;
    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     * </p>
     */
    private Integer onDemandPercentageAboveBaseCapacity;
    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     * <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools that
     * are optimally chosen based on the available Spot capacity. If the allocation strategy is
     * <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest price,
     * and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     * <code>lowest-price</code> if not specified.
     * </p>
     */
    private String spotAllocationStrategy;
    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not specified.
     * </p>
     */
    private Integer spotInstancePools;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value at its
     * default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     */
    private String spotMaxPrice;

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     * <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types in the
     * overrides to define the launch priority of each instance type. The first instance type in the array is
     * prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority
     * instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type,
     * and so on.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     *        <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types
     *        in the overrides to define the launch priority of each instance type. The first instance type in the array
     *        is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest
     *        priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority
     *        instance type, and so on.
     */

    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     * <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types in the
     * overrides to define the launch priority of each instance type. The first instance type in the array is
     * prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority
     * instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type,
     * and so on.
     * </p>
     * 
     * @return Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     *         <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types
     *         in the overrides to define the launch priority of each instance type. The first instance type in the
     *         array is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your
     *         highest priority instance, then the Auto Scaling groups launches the remaining capacity using the second
     *         priority instance type, and so on.
     */

    public String getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     * <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types in the
     * overrides to define the launch priority of each instance type. The first instance type in the array is
     * prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority
     * instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type,
     * and so on.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is
     *        <code>prioritized</code>, which is also the default value. This strategy uses the order of instance types
     *        in the overrides to define the launch priority of each instance type. The first instance type in the array
     *        is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest
     *        priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority
     *        instance type, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        setOnDemandAllocationStrategy(onDemandAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales. Defaults to 0 if not specified. If you specify weights for the
     * instance types in the overrides, set the value of <code>OnDemandBaseCapacity</code> in terms of the number of
     * capacity units, and not the number of instances.
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is provisioned first as your group scales. Defaults to 0 if not specified. If you
     *        specify weights for the instance types in the overrides, set the value of
     *        <code>OnDemandBaseCapacity</code> in terms of the number of capacity units, and not the number of
     *        instances.
     */

    public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales. Defaults to 0 if not specified. If you specify weights for the
     * instance types in the overrides, set the value of <code>OnDemandBaseCapacity</code> in terms of the number of
     * capacity units, and not the number of instances.
     * </p>
     * 
     * @return The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *         This base portion is provisioned first as your group scales. Defaults to 0 if not specified. If you
     *         specify weights for the instance types in the overrides, set the value of
     *         <code>OnDemandBaseCapacity</code> in terms of the number of capacity units, and not the number of
     *         instances.
     */

    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales. Defaults to 0 if not specified. If you specify weights for the
     * instance types in the overrides, set the value of <code>OnDemandBaseCapacity</code> in terms of the number of
     * capacity units, and not the number of instances.
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is provisioned first as your group scales. Defaults to 0 if not specified. If you
     *        specify weights for the instance types in the overrides, set the value of
     *        <code>OnDemandBaseCapacity</code> in terms of the number of capacity units, and not the number of
     *        instances.
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
     * Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *        Instances, 80% Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances
     *        are provisioned.
     */

    public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     * </p>
     * 
     * @return Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *         <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *         Instances, 80% Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances
     *         are provisioned.
     */

    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80%
     * Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>. Expressed as a number (for example, 20 specifies 20% On-Demand
     *        Instances, 80% Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances
     *        are provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        setOnDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     * <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools that
     * are optimally chosen based on the available Spot capacity. If the allocation strategy is
     * <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest price,
     * and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     * <code>lowest-price</code> if not specified.
     * </p>
     * 
     * @param spotAllocationStrategy
     *        Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     *        <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools
     *        that are optimally chosen based on the available Spot capacity. If the allocation strategy is
     *        <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest
     *        price, and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     *        <code>lowest-price</code> if not specified.
     */

    public void setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     * <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools that
     * are optimally chosen based on the available Spot capacity. If the allocation strategy is
     * <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest price,
     * and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     * <code>lowest-price</code> if not specified.
     * </p>
     * 
     * @return Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     *         <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools
     *         that are optimally chosen based on the available Spot capacity. If the allocation strategy is
     *         <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest
     *         price, and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     *         <code>lowest-price</code> if not specified.
     */

    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     * <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools that
     * are optimally chosen based on the available Spot capacity. If the allocation strategy is
     * <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest price,
     * and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     * <code>lowest-price</code> if not specified.
     * </p>
     * 
     * @param spotAllocationStrategy
     *        Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is
     *        <code>capacity-optimized</code> (recommended), the Auto Scaling group launches instances using Spot pools
     *        that are optimally chosen based on the available Spot capacity. If the allocation strategy is
     *        <code>lowest-price</code>, the Auto Scaling group launches instances using the Spot pools with the lowest
     *        price, and evenly allocates your instances across the number of Spot pools that you specify. Defaults to
     *        <code>lowest-price</code> if not specified.
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
     * <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not specified.
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *        determined from the different instance types in the overrides. Valid only when the Spot allocation
     *        strategy is <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not
     *        specified.
     */

    public void setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not specified.
     * </p>
     * 
     * @return The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *         determined from the different instance types in the overrides. Valid only when the Spot allocation
     *         strategy is <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not
     *         specified.
     */

    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined
     * from the different instance types in the overrides. Valid only when the Spot allocation strategy is
     * <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not specified.
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are
     *        determined from the different instance types in the overrides. Valid only when the Spot allocation
     *        strategy is <code>lowest-price</code>. Value must be in the range of 1 to 20. Defaults to 2 if not
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotInstancePools(Integer spotInstancePools) {
        setSpotInstancePools(spotInstancePools);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value at its
     * default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value at
     *        its default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove
     *        a value that you previously set, include the property but specify an empty string ("") for the value.
     */

    public void setSpotMaxPrice(String spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value at its
     * default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value
     *         at its default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To
     *         remove a value that you previously set, include the property but specify an empty string ("") for the
     *         value.
     */

    public String getSpotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value at its
     * default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value
     * that you previously set, include the property but specify an empty string ("") for the value.
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value at
     *        its default (empty), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove
     *        a value that you previously set, include the property but specify an empty string ("") for the value.
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
