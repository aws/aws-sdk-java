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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resize specification for On-Demand and Spot Instances in the fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetResizingSpecifications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetResizingSpecifications implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resize specification for Spot Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     */
    private SpotResizingSpecification spotResizeSpecification;
    /**
     * <p>
     * The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     */
    private OnDemandResizingSpecification onDemandResizeSpecification;

    /**
     * <p>
     * The resize specification for Spot Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     * 
     * @param spotResizeSpecification
     *        The resize specification for Spot Instances in the instance fleet, which contains the resize timeout
     *        period.
     */

    public void setSpotResizeSpecification(SpotResizingSpecification spotResizeSpecification) {
        this.spotResizeSpecification = spotResizeSpecification;
    }

    /**
     * <p>
     * The resize specification for Spot Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     * 
     * @return The resize specification for Spot Instances in the instance fleet, which contains the resize timeout
     *         period.
     */

    public SpotResizingSpecification getSpotResizeSpecification() {
        return this.spotResizeSpecification;
    }

    /**
     * <p>
     * The resize specification for Spot Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     * 
     * @param spotResizeSpecification
     *        The resize specification for Spot Instances in the instance fleet, which contains the resize timeout
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetResizingSpecifications withSpotResizeSpecification(SpotResizingSpecification spotResizeSpecification) {
        setSpotResizeSpecification(spotResizeSpecification);
        return this;
    }

    /**
     * <p>
     * The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     * 
     * @param onDemandResizeSpecification
     *        The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout
     *        period.
     */

    public void setOnDemandResizeSpecification(OnDemandResizingSpecification onDemandResizeSpecification) {
        this.onDemandResizeSpecification = onDemandResizeSpecification;
    }

    /**
     * <p>
     * The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     * 
     * @return The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout
     *         period.
     */

    public OnDemandResizingSpecification getOnDemandResizeSpecification() {
        return this.onDemandResizeSpecification;
    }

    /**
     * <p>
     * The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout period.
     * </p>
     * 
     * @param onDemandResizeSpecification
     *        The resize specification for On-Demand Instances in the instance fleet, which contains the resize timeout
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetResizingSpecifications withOnDemandResizeSpecification(OnDemandResizingSpecification onDemandResizeSpecification) {
        setOnDemandResizeSpecification(onDemandResizeSpecification);
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
        if (getSpotResizeSpecification() != null)
            sb.append("SpotResizeSpecification: ").append(getSpotResizeSpecification()).append(",");
        if (getOnDemandResizeSpecification() != null)
            sb.append("OnDemandResizeSpecification: ").append(getOnDemandResizeSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetResizingSpecifications == false)
            return false;
        InstanceFleetResizingSpecifications other = (InstanceFleetResizingSpecifications) obj;
        if (other.getSpotResizeSpecification() == null ^ this.getSpotResizeSpecification() == null)
            return false;
        if (other.getSpotResizeSpecification() != null && other.getSpotResizeSpecification().equals(this.getSpotResizeSpecification()) == false)
            return false;
        if (other.getOnDemandResizeSpecification() == null ^ this.getOnDemandResizeSpecification() == null)
            return false;
        if (other.getOnDemandResizeSpecification() != null && other.getOnDemandResizeSpecification().equals(this.getOnDemandResizeSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpotResizeSpecification() == null) ? 0 : getSpotResizeSpecification().hashCode());
        hashCode = prime * hashCode + ((getOnDemandResizeSpecification() == null) ? 0 : getOnDemandResizeSpecification().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleetResizingSpecifications clone() {
        try {
            return (InstanceFleetResizingSpecifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetResizingSpecificationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
