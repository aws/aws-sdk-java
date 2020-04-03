/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Compute information for the simulation job
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ComputeResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximim value provided.
     * </p>
     */
    private Integer simulationUnitLimit;

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximim value provided.
     * </p>
     * 
     * @param simulationUnitLimit
     *        The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied
     *        simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU
     *        utilization you consume up to the maximim value provided.
     */

    public void setSimulationUnitLimit(Integer simulationUnitLimit) {
        this.simulationUnitLimit = simulationUnitLimit;
    }

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximim value provided.
     * </p>
     * 
     * @return The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied
     *         simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU
     *         utilization you consume up to the maximim value provided.
     */

    public Integer getSimulationUnitLimit() {
        return this.simulationUnitLimit;
    }

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximim value provided.
     * </p>
     * 
     * @param simulationUnitLimit
     *        The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied
     *        simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU
     *        utilization you consume up to the maximim value provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResponse withSimulationUnitLimit(Integer simulationUnitLimit) {
        setSimulationUnitLimit(simulationUnitLimit);
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
        if (getSimulationUnitLimit() != null)
            sb.append("SimulationUnitLimit: ").append(getSimulationUnitLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeResponse == false)
            return false;
        ComputeResponse other = (ComputeResponse) obj;
        if (other.getSimulationUnitLimit() == null ^ this.getSimulationUnitLimit() == null)
            return false;
        if (other.getSimulationUnitLimit() != null && other.getSimulationUnitLimit().equals(this.getSimulationUnitLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimulationUnitLimit() == null) ? 0 : getSimulationUnitLimit().hashCode());
        return hashCode;
    }

    @Override
    public ComputeResponse clone() {
        try {
            return (ComputeResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.ComputeResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
