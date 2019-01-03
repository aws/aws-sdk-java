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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
 * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is
 * <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TargetCapacitySpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetCapacitySpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     * </p>
     */
    private Integer totalTargetCapacity;
    /**
     * <p>
     * The number of On-Demand units to request.
     * </p>
     */
    private Integer onDemandTargetCapacity;
    /**
     * <p>
     * The maximum number of Spot units to launch.
     * </p>
     */
    private Integer spotTargetCapacity;
    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     */
    private String defaultTargetCapacityType;

    /**
     * <p>
     * The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     */

    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * <p>
     * The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     * </p>
     * 
     * @return The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     */

    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * <p>
     * The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The number of units to request, filled using <code>DefaultTargetCapacityType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetCapacitySpecification withTotalTargetCapacity(Integer totalTargetCapacity) {
        setTotalTargetCapacity(totalTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units to request.
     * </p>
     * 
     * @param onDemandTargetCapacity
     *        The number of On-Demand units to request.
     */

    public void setOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request.
     * </p>
     * 
     * @return The number of On-Demand units to request.
     */

    public Integer getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request.
     * </p>
     * 
     * @param onDemandTargetCapacity
     *        The number of On-Demand units to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetCapacitySpecification withOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        setOnDemandTargetCapacity(onDemandTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum number of Spot units to launch.
     * </p>
     * 
     * @param spotTargetCapacity
     *        The maximum number of Spot units to launch.
     */

    public void setSpotTargetCapacity(Integer spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
    }

    /**
     * <p>
     * The maximum number of Spot units to launch.
     * </p>
     * 
     * @return The maximum number of Spot units to launch.
     */

    public Integer getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    /**
     * <p>
     * The maximum number of Spot units to launch.
     * </p>
     * 
     * @param spotTargetCapacity
     *        The maximum number of Spot units to launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetCapacitySpecification withSpotTargetCapacity(Integer spotTargetCapacity) {
        setSpotTargetCapacity(spotTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * 
     * @param defaultTargetCapacityType
     *        The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * @see DefaultTargetCapacityType
     */

    public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * 
     * @return The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>
     *         .
     * @see DefaultTargetCapacityType
     */

    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * 
     * @param defaultTargetCapacityType
     *        The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultTargetCapacityType
     */

    public TargetCapacitySpecification withDefaultTargetCapacityType(String defaultTargetCapacityType) {
        setDefaultTargetCapacityType(defaultTargetCapacityType);
        return this;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * 
     * @param defaultTargetCapacityType
     *        The default <code>TotalTargetCapacity</code>, which is either <code>Spot</code> or <code>On-Demand</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultTargetCapacityType
     */

    public TargetCapacitySpecification withDefaultTargetCapacityType(DefaultTargetCapacityType defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType.toString();
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
        if (getTotalTargetCapacity() != null)
            sb.append("TotalTargetCapacity: ").append(getTotalTargetCapacity()).append(",");
        if (getOnDemandTargetCapacity() != null)
            sb.append("OnDemandTargetCapacity: ").append(getOnDemandTargetCapacity()).append(",");
        if (getSpotTargetCapacity() != null)
            sb.append("SpotTargetCapacity: ").append(getSpotTargetCapacity()).append(",");
        if (getDefaultTargetCapacityType() != null)
            sb.append("DefaultTargetCapacityType: ").append(getDefaultTargetCapacityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetCapacitySpecification == false)
            return false;
        TargetCapacitySpecification other = (TargetCapacitySpecification) obj;
        if (other.getTotalTargetCapacity() == null ^ this.getTotalTargetCapacity() == null)
            return false;
        if (other.getTotalTargetCapacity() != null && other.getTotalTargetCapacity().equals(this.getTotalTargetCapacity()) == false)
            return false;
        if (other.getOnDemandTargetCapacity() == null ^ this.getOnDemandTargetCapacity() == null)
            return false;
        if (other.getOnDemandTargetCapacity() != null && other.getOnDemandTargetCapacity().equals(this.getOnDemandTargetCapacity()) == false)
            return false;
        if (other.getSpotTargetCapacity() == null ^ this.getSpotTargetCapacity() == null)
            return false;
        if (other.getSpotTargetCapacity() != null && other.getSpotTargetCapacity().equals(this.getSpotTargetCapacity()) == false)
            return false;
        if (other.getDefaultTargetCapacityType() == null ^ this.getDefaultTargetCapacityType() == null)
            return false;
        if (other.getDefaultTargetCapacityType() != null && other.getDefaultTargetCapacityType().equals(this.getDefaultTargetCapacityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalTargetCapacity() == null) ? 0 : getTotalTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getOnDemandTargetCapacity() == null) ? 0 : getOnDemandTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getSpotTargetCapacity() == null) ? 0 : getSpotTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getDefaultTargetCapacityType() == null) ? 0 : getDefaultTargetCapacityType().hashCode());
        return hashCode;
    }

    @Override
    public TargetCapacitySpecification clone() {
        try {
            return (TargetCapacitySpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
