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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the instances distribution.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>.
     * </p>
     */
    private String onDemandAllocationStrategy;
    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     * </p>
     */
    private Integer onDemandBaseCapacity;
    /**
     * <p>
     * The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     */
    private Integer onDemandPercentageAboveBaseCapacity;
    /**
     * <p>
     * How to allocate instances across Spot Instance pools. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lowest-price</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * </li>
     * </ul>
     */
    private String spotAllocationStrategy;
    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances.
     * </p>
     */
    private Integer spotInstancePools;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     */
    private String spotMaxPrice;

    /**
     * <p>
     * How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>.
     */

    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>.
     * </p>
     * 
     * @return How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>
     *         .
     */

    public String getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }

    /**
     * <p>
     * How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        How to allocate instance types to fulfill On-Demand capacity. The valid value is <code>prioritized</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails withOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        setOnDemandAllocationStrategy(onDemandAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     */

    public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     * </p>
     * 
     * @return The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     */

    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    /**
     * <p>
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     * </p>
     * 
     * @param onDemandBaseCapacity
     *        The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails withOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        setOnDemandBaseCapacity(onDemandBaseCapacity);
        return this;
    }

    /**
     * <p>
     * The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>.
     */

    public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * 
     * @return The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     *         <code>OnDemandBaseCapacity</code>.
     */

    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    /**
     * <p>
     * The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     * <code>OnDemandBaseCapacity</code>.
     * </p>
     * 
     * @param onDemandPercentageAboveBaseCapacity
     *        The percentage of On-Demand Instances and Spot Instances for additional capacity beyond
     *        <code>OnDemandBaseCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails withOnDemandPercentageAboveBaseCapacity(
            Integer onDemandPercentageAboveBaseCapacity) {
        setOnDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity);
        return this;
    }

    /**
     * <p>
     * How to allocate instances across Spot Instance pools. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lowest-price</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param spotAllocationStrategy
     *        How to allocate instances across Spot Instance pools. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lowest-price</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-optimized</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-optimized-prioritized</code>
     *        </p>
     *        </li>
     */

    public void setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    /**
     * <p>
     * How to allocate instances across Spot Instance pools. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lowest-price</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return How to allocate instances across Spot Instance pools. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>lowest-price</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>capacity-optimized</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>capacity-optimized-prioritized</code>
     *         </p>
     *         </li>
     */

    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * <p>
     * How to allocate instances across Spot Instance pools. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lowest-price</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-optimized-prioritized</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param spotAllocationStrategy
     *        How to allocate instances across Spot Instance pools. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lowest-price</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-optimized</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-optimized-prioritized</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails withSpotAllocationStrategy(String spotAllocationStrategy) {
        setSpotAllocationStrategy(spotAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances.
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances.
     */

    public void setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances.
     * </p>
     * 
     * @return The number of Spot Instance pools across which to allocate your Spot Instances.
     */

    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * <p>
     * The number of Spot Instance pools across which to allocate your Spot Instances.
     * </p>
     * 
     * @param spotInstancePools
     *        The number of Spot Instance pools across which to allocate your Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails withSpotInstancePools(Integer spotInstancePools) {
        setSpotInstancePools(spotInstancePools);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance.
     */

    public void setSpotMaxPrice(String spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance.
     */

    public String getSpotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @param spotMaxPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails withSpotMaxPrice(String spotMaxPrice) {
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

        if (obj instanceof AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails == false)
            return false;
        AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails other = (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails) obj;
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
    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails clone() {
        try {
            return (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetailsMarshaller
                .getInstance().marshall(this, protocolMarshaller);
    }
}
