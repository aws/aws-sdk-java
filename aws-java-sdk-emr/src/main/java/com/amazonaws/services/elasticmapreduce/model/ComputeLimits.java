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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster can not be above or below
 * these limits. The limit only applies to the core and task nodes. The master node cannot be scaled after initial
 * configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ComputeLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     */
    private String unitType;
    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     */
    private Integer minimumCapacityUnits;
    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     */
    private Integer maximumCapacityUnits;
    /**
     * <p>
     * The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance groups and
     * measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
     * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
     * </p>
     */
    private Integer maximumOnDemandCapacityUnits;
    /**
     * <p>
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or instances
     * for instance groups and measured through units for instance fleets. The core units are not allowed to scale
     * beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * </p>
     */
    private Integer maximumCoreCapacityUnits;

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * 
     * @param unitType
     *        The unit type used for specifying a managed scaling policy.
     * @see ComputeLimitsUnitType
     */

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * 
     * @return The unit type used for specifying a managed scaling policy.
     * @see ComputeLimitsUnitType
     */

    public String getUnitType() {
        return this.unitType;
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * 
     * @param unitType
     *        The unit type used for specifying a managed scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeLimitsUnitType
     */

    public ComputeLimits withUnitType(String unitType) {
        setUnitType(unitType);
        return this;
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * 
     * @param unitType
     *        The unit type used for specifying a managed scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeLimitsUnitType
     */

    public ComputeLimits withUnitType(ComputeLimitsUnitType unitType) {
        this.unitType = unitType.toString();
        return this;
    }

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     * 
     * @param minimumCapacityUnits
     *        The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and
     *        measured through units for instance fleets. Managed scaling activities are not allowed beyond this
     *        boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after
     *        initial configuration.
     */

    public void setMinimumCapacityUnits(Integer minimumCapacityUnits) {
        this.minimumCapacityUnits = minimumCapacityUnits;
    }

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     * 
     * @return The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and
     *         measured through units for instance fleets. Managed scaling activities are not allowed beyond this
     *         boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after
     *         initial configuration.
     */

    public Integer getMinimumCapacityUnits() {
        return this.minimumCapacityUnits;
    }

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     * 
     * @param minimumCapacityUnits
     *        The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and
     *        measured through units for instance fleets. Managed scaling activities are not allowed beyond this
     *        boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after
     *        initial configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeLimits withMinimumCapacityUnits(Integer minimumCapacityUnits) {
        setMinimumCapacityUnits(minimumCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     * 
     * @param maximumCapacityUnits
     *        The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and
     *        measured through units for instance fleets. Managed scaling activities are not allowed beyond this
     *        boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after
     *        initial configuration.
     */

    public void setMaximumCapacityUnits(Integer maximumCapacityUnits) {
        this.maximumCapacityUnits = maximumCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     * 
     * @return The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and
     *         measured through units for instance fleets. Managed scaling activities are not allowed beyond this
     *         boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after
     *         initial configuration.
     */

    public Integer getMaximumCapacityUnits() {
        return this.maximumCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured
     * through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit
     * only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * </p>
     * 
     * @param maximumCapacityUnits
     *        The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and
     *        measured through units for instance fleets. Managed scaling activities are not allowed beyond this
     *        boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after
     *        initial configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeLimits withMaximumCapacityUnits(Integer maximumCapacityUnits) {
        setMaximumCapacityUnits(maximumCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance groups and
     * measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
     * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
     * </p>
     * 
     * @param maximumOnDemandCapacityUnits
     *        The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance
     *        groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond
     *        this boundary. The parameter is used to split capacity allocation between On-Demand and Spot Instances.
     */

    public void setMaximumOnDemandCapacityUnits(Integer maximumOnDemandCapacityUnits) {
        this.maximumOnDemandCapacityUnits = maximumOnDemandCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance groups and
     * measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
     * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
     * </p>
     * 
     * @return The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance
     *         groups and measured through units for instance fleets. The On-Demand units are not allowed to scale
     *         beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot
     *         Instances.
     */

    public Integer getMaximumOnDemandCapacityUnits() {
        return this.maximumOnDemandCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance groups and
     * measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary.
     * The parameter is used to split capacity allocation between On-Demand and Spot Instances.
     * </p>
     * 
     * @param maximumOnDemandCapacityUnits
     *        The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance
     *        groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond
     *        this boundary. The parameter is used to split capacity allocation between On-Demand and Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeLimits withMaximumOnDemandCapacityUnits(Integer maximumOnDemandCapacityUnits) {
        setMaximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or instances
     * for instance groups and measured through units for instance fleets. The core units are not allowed to scale
     * beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * </p>
     * 
     * @param maximumCoreCapacityUnits
     *        The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or
     *        instances for instance groups and measured through units for instance fleets. The core units are not
     *        allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and
     *        task nodes.
     */

    public void setMaximumCoreCapacityUnits(Integer maximumCoreCapacityUnits) {
        this.maximumCoreCapacityUnits = maximumCoreCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or instances
     * for instance groups and measured through units for instance fleets. The core units are not allowed to scale
     * beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * </p>
     * 
     * @return The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or
     *         instances for instance groups and measured through units for instance fleets. The core units are not
     *         allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core
     *         and task nodes.
     */

    public Integer getMaximumCoreCapacityUnits() {
        return this.maximumCoreCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or instances
     * for instance groups and measured through units for instance fleets. The core units are not allowed to scale
     * beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * </p>
     * 
     * @param maximumCoreCapacityUnits
     *        The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or
     *        instances for instance groups and measured through units for instance fleets. The core units are not
     *        allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and
     *        task nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeLimits withMaximumCoreCapacityUnits(Integer maximumCoreCapacityUnits) {
        setMaximumCoreCapacityUnits(maximumCoreCapacityUnits);
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
        if (getUnitType() != null)
            sb.append("UnitType: ").append(getUnitType()).append(",");
        if (getMinimumCapacityUnits() != null)
            sb.append("MinimumCapacityUnits: ").append(getMinimumCapacityUnits()).append(",");
        if (getMaximumCapacityUnits() != null)
            sb.append("MaximumCapacityUnits: ").append(getMaximumCapacityUnits()).append(",");
        if (getMaximumOnDemandCapacityUnits() != null)
            sb.append("MaximumOnDemandCapacityUnits: ").append(getMaximumOnDemandCapacityUnits()).append(",");
        if (getMaximumCoreCapacityUnits() != null)
            sb.append("MaximumCoreCapacityUnits: ").append(getMaximumCoreCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeLimits == false)
            return false;
        ComputeLimits other = (ComputeLimits) obj;
        if (other.getUnitType() == null ^ this.getUnitType() == null)
            return false;
        if (other.getUnitType() != null && other.getUnitType().equals(this.getUnitType()) == false)
            return false;
        if (other.getMinimumCapacityUnits() == null ^ this.getMinimumCapacityUnits() == null)
            return false;
        if (other.getMinimumCapacityUnits() != null && other.getMinimumCapacityUnits().equals(this.getMinimumCapacityUnits()) == false)
            return false;
        if (other.getMaximumCapacityUnits() == null ^ this.getMaximumCapacityUnits() == null)
            return false;
        if (other.getMaximumCapacityUnits() != null && other.getMaximumCapacityUnits().equals(this.getMaximumCapacityUnits()) == false)
            return false;
        if (other.getMaximumOnDemandCapacityUnits() == null ^ this.getMaximumOnDemandCapacityUnits() == null)
            return false;
        if (other.getMaximumOnDemandCapacityUnits() != null && other.getMaximumOnDemandCapacityUnits().equals(this.getMaximumOnDemandCapacityUnits()) == false)
            return false;
        if (other.getMaximumCoreCapacityUnits() == null ^ this.getMaximumCoreCapacityUnits() == null)
            return false;
        if (other.getMaximumCoreCapacityUnits() != null && other.getMaximumCoreCapacityUnits().equals(this.getMaximumCoreCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnitType() == null) ? 0 : getUnitType().hashCode());
        hashCode = prime * hashCode + ((getMinimumCapacityUnits() == null) ? 0 : getMinimumCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getMaximumCapacityUnits() == null) ? 0 : getMaximumCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getMaximumOnDemandCapacityUnits() == null) ? 0 : getMaximumOnDemandCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getMaximumCoreCapacityUnits() == null) ? 0 : getMaximumCoreCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public ComputeLimits clone() {
        try {
            return (ComputeLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ComputeLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
