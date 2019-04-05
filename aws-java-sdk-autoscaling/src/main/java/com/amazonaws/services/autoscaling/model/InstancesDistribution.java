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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an instances distribution for an Auto Scaling group with <a>MixedInstancesPolicy</a>.
 * </p>
 * <p>
 * The instances distribution specifies the distribution of On-Demand Instances and Spot Instances, the maximum price to
 * pay for Spot Instances, and how the Auto Scaling group allocates instance types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstancesDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesDistribution implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity.
     * </p>
     * <p>
     * The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the order
     * of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each instance type. The
     * first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     */
    private String onDemandAllocationStrategy;
    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales.
     * </p>
     * <p>
     * The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand Instances are
     * launched as a percentage of the Auto Scaling group's desired capacity, per the
     * <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     * </p>
     */
    private Integer onDemandBaseCapacity;
    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * <p>
     * The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to <code>100</code>,
     * the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     * </p>
     */
    private Integer onDemandPercentageAboveBaseCapacity;
    /**
     * <p>
     * Indicates how to allocate Spot capacity across Spot pools.
     * </p>
     * <p>
     * The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling group
     * selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools that you
     * specify.
     * </p>
     */
    private String spotAllocationStrategy;
    /**
     * <p>
     * The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the different
     * instance types in the Overrides array of <a>LaunchTemplate</a>.
     * </p>
     * <p>
     * The range is 1–20 and the default is 2.
     * </p>
     */
    private Integer spotInstancePools;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this
     * parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.
     * </p>
     * <p>
     * To remove a value that you previously set, include the parameter but leave the value blank.
     * </p>
     */
    private String spotMaxPrice;

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity.
     * </p>
     * <p>
     * The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the order
     * of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each instance type. The
     * first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        Indicates how to allocate instance types to fulfill On-Demand capacity. </p>
     *        <p>
     *        The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the
     *        order of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each
     *        instance type. The first instance type in the array is prioritized higher than the last. If all your
     *        On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups
     *        launches the remaining capacity using the second priority instance type, and so on.
     */

    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity.
     * </p>
     * <p>
     * The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the order
     * of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each instance type. The
     * first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * 
     * @return Indicates how to allocate instance types to fulfill On-Demand capacity. </p>
     *         <p>
     *         The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the
     *         order of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each
     *         instance type. The first instance type in the array is prioritized higher than the last. If all your
     *         On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups
     *         launches the remaining capacity using the second priority instance type, and so on.
     */

    public String getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate instance types to fulfill On-Demand capacity.
     * </p>
     * <p>
     * The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the order
     * of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each instance type. The
     * first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity
     * using the second priority instance type, and so on.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        Indicates how to allocate instance types to fulfill On-Demand capacity. </p>
     *        <p>
     *        The only valid value is <code>prioritized</code>, which is also the default value. This strategy uses the
     *        order of instance type overrides for the <a>LaunchTemplate</a> to define the launch priority of each
     *        instance type. The first instance type in the array is prioritized higher than the last. If all your
     *        On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups
     *        launches the remaining capacity using the second priority instance type, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        setOnDemandAllocationStrategy(onDemandAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales.
     * </p>
     * <p>
     * The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand Instances are
     * launched as a percentage of the Auto Scaling group's desired capacity, per the
     * <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is provisioned first as your group scales.</p>
     *        <p>
     *        The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand
     *        Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the
     *        <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     */

    public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales.
     * </p>
     * <p>
     * The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand Instances are
     * launched as a percentage of the Auto Scaling group's desired capacity, per the
     * <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     * </p>
     * 
     * @return The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *         This base portion is provisioned first as your group scales.</p>
     *         <p>
     *         The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand
     *         Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the
     *         <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     */

    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base
     * portion is provisioned first as your group scales.
     * </p>
     * <p>
     * The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand Instances are
     * launched as a percentage of the Auto Scaling group's desired capacity, per the
     * <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     *        This base portion is provisioned first as your group scales.</p>
     *        <p>
     *        The default value is <code>0</code>. If you leave this parameter set to <code>0</code>, On-Demand
     *        Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the
     *        <code>OnDemandPercentageAboveBaseCapacity</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        setOnDemandBaseCapacity(onDemandBaseCapacity);
        return this;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * <p>
     * The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to <code>100</code>,
     * the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>.</p>
     *        <p>
     *        The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to
     *        <code>100</code>, the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     */

    public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * <p>
     * The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to <code>100</code>,
     * the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     * </p>
     * 
     * @return Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *         <code>OnDemandBaseCapacity</code>.</p>
     *         <p>
     *         The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to
     *         <code>100</code>, the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     */

    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * <p>
     * The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to <code>100</code>,
     * the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>.</p>
     *        <p>
     *        The range is 0–100. The default value is <code>100</code>. If you leave this parameter set to
     *        <code>100</code>, the percentages are 100% for On-Demand Instances and 0% for Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        setOnDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate Spot capacity across Spot pools.
     * </p>
     * <p>
     * The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling group
     * selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools that you
     * specify.
     * </p>
     * 
     * @param spotAllocationStrategy
     *        Indicates how to allocate Spot capacity across Spot pools.</p>
     *        <p>
     *        The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling group
     *        selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools
     *        that you specify.
     */

    public void setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate Spot capacity across Spot pools.
     * </p>
     * <p>
     * The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling group
     * selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools that you
     * specify.
     * </p>
     * 
     * @return Indicates how to allocate Spot capacity across Spot pools.</p>
     *         <p>
     *         The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling
     *         group selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot
     *         pools that you specify.
     */

    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate Spot capacity across Spot pools.
     * </p>
     * <p>
     * The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling group
     * selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools that you
     * specify.
     * </p>
     * 
     * @param spotAllocationStrategy
     *        Indicates how to allocate Spot capacity across Spot pools.</p>
     *        <p>
     *        The only valid value is <code>lowest-price</code>, which is also the default value. The Auto Scaling group
     *        selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools
     *        that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotAllocationStrategy(String spotAllocationStrategy) {
        setSpotAllocationStrategy(spotAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the different
     * instance types in the Overrides array of <a>LaunchTemplate</a>.
     * </p>
     * <p>
     * The range is 1–20 and the default is 2.
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the
     *        different instance types in the Overrides array of <a>LaunchTemplate</a>. </p>
     *        <p>
     *        The range is 1–20 and the default is 2.
     */

    public void setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the different
     * instance types in the Overrides array of <a>LaunchTemplate</a>.
     * </p>
     * <p>
     * The range is 1–20 and the default is 2.
     * </p>
     * 
     * @return The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the
     *         different instance types in the Overrides array of <a>LaunchTemplate</a>. </p>
     *         <p>
     *         The range is 1–20 and the default is 2.
     */

    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the different
     * instance types in the Overrides array of <a>LaunchTemplate</a>.
     * </p>
     * <p>
     * The range is 1–20 and the default is 2.
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the
     *        different instance types in the Overrides array of <a>LaunchTemplate</a>. </p>
     *        <p>
     *        The range is 1–20 and the default is 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesDistribution withSpotInstancePools(Integer spotInstancePools) {
        setSpotInstancePools(spotInstancePools);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this
     * parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.
     * </p>
     * <p>
     * To remove a value that you previously set, include the parameter but leave the value blank.
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of
     *        this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.</p>
     *        <p>
     *        To remove a value that you previously set, include the parameter but leave the value blank.
     */

    public void setSpotMaxPrice(String spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this
     * parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.
     * </p>
     * <p>
     * To remove a value that you previously set, include the parameter but leave the value blank.
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value
     *         of this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.</p>
     *         <p>
     *         To remove a value that you previously set, include the parameter but leave the value blank.
     */

    public String getSpotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this
     * parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.
     * </p>
     * <p>
     * To remove a value that you previously set, include the parameter but leave the value blank.
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of
     *        this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price.</p>
     *        <p>
     *        To remove a value that you previously set, include the parameter but leave the value blank.
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
