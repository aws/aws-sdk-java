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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration parameters for an instance fleet modification request.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetModifyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetModifyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     */
    private String instanceFleetId;
    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more information see
     * <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     */
    private Integer targetOnDemandCapacity;
    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more information, see
     * <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     */
    private Integer targetSpotCapacity;

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     * 
     * @param instanceFleetId
     *        A unique identifier for the instance fleet.
     */

    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     * 
     * @return A unique identifier for the instance fleet.
     */

    public String getInstanceFleetId() {
        return this.instanceFleetId;
    }

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     * 
     * @param instanceFleetId
     *        A unique identifier for the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetModifyConfig withInstanceFleetId(String instanceFleetId) {
        setInstanceFleetId(instanceFleetId);
        return this;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more information see
     * <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * 
     * @param targetOnDemandCapacity
     *        The target capacity of On-Demand units for the instance fleet. For more information see
     *        <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     */

    public void setTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more information see
     * <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * 
     * @return The target capacity of On-Demand units for the instance fleet. For more information see
     *         <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     */

    public Integer getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more information see
     * <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * 
     * @param targetOnDemandCapacity
     *        The target capacity of On-Demand units for the instance fleet. For more information see
     *        <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetModifyConfig withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        setTargetOnDemandCapacity(targetOnDemandCapacity);
        return this;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more information, see
     * <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * 
     * @param targetSpotCapacity
     *        The target capacity of Spot units for the instance fleet. For more information, see
     *        <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     */

    public void setTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more information, see
     * <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * 
     * @return The target capacity of Spot units for the instance fleet. For more information, see
     *         <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     */

    public Integer getTargetSpotCapacity() {
        return this.targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more information, see
     * <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * 
     * @param targetSpotCapacity
     *        The target capacity of Spot units for the instance fleet. For more information, see
     *        <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetModifyConfig withTargetSpotCapacity(Integer targetSpotCapacity) {
        setTargetSpotCapacity(targetSpotCapacity);
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
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: ").append(getInstanceFleetId()).append(",");
        if (getTargetOnDemandCapacity() != null)
            sb.append("TargetOnDemandCapacity: ").append(getTargetOnDemandCapacity()).append(",");
        if (getTargetSpotCapacity() != null)
            sb.append("TargetSpotCapacity: ").append(getTargetSpotCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetModifyConfig == false)
            return false;
        InstanceFleetModifyConfig other = (InstanceFleetModifyConfig) obj;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getTargetOnDemandCapacity() == null ^ this.getTargetOnDemandCapacity() == null)
            return false;
        if (other.getTargetOnDemandCapacity() != null && other.getTargetOnDemandCapacity().equals(this.getTargetOnDemandCapacity()) == false)
            return false;
        if (other.getTargetSpotCapacity() == null ^ this.getTargetSpotCapacity() == null)
            return false;
        if (other.getTargetSpotCapacity() != null && other.getTargetSpotCapacity().equals(this.getTargetSpotCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime * hashCode + ((getTargetOnDemandCapacity() == null) ? 0 : getTargetOnDemandCapacity().hashCode());
        hashCode = prime * hashCode + ((getTargetSpotCapacity() == null) ? 0 : getTargetSpotCapacity().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleetModifyConfig clone() {
        try {
            return (InstanceFleetModifyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetModifyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
