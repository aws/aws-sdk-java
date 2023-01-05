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
     * up to the maximum value provided. The default is 15.
     * </p>
     */
    private Integer simulationUnitLimit;
    /**
     * <p>
     * Compute type response information for the simulation job.
     * </p>
     */
    private String computeType;
    /**
     * <p>
     * Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     * SimulationJob.
     * </p>
     */
    private Integer gpuUnitLimit;

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximum value provided. The default is 15.
     * </p>
     * 
     * @param simulationUnitLimit
     *        The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied
     *        simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU
     *        utilization you consume up to the maximum value provided. The default is 15.
     */

    public void setSimulationUnitLimit(Integer simulationUnitLimit) {
        this.simulationUnitLimit = simulationUnitLimit;
    }

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximum value provided. The default is 15.
     * </p>
     * 
     * @return The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied
     *         simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU
     *         utilization you consume up to the maximum value provided. The default is 15.
     */

    public Integer getSimulationUnitLimit() {
        return this.simulationUnitLimit;
    }

    /**
     * <p>
     * The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied simulation
     * unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU utilization you consume
     * up to the maximum value provided. The default is 15.
     * </p>
     * 
     * @param simulationUnitLimit
     *        The simulation unit limit. Your simulation is allocated CPU and memory proportional to the supplied
     *        simulation unit limit. A simulation unit is 1 vcpu and 2GB of memory. You are only billed for the SU
     *        utilization you consume up to the maximum value provided. The default is 15.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResponse withSimulationUnitLimit(Integer simulationUnitLimit) {
        setSimulationUnitLimit(simulationUnitLimit);
        return this;
    }

    /**
     * <p>
     * Compute type response information for the simulation job.
     * </p>
     * 
     * @param computeType
     *        Compute type response information for the simulation job.
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Compute type response information for the simulation job.
     * </p>
     * 
     * @return Compute type response information for the simulation job.
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * Compute type response information for the simulation job.
     * </p>
     * 
     * @param computeType
     *        Compute type response information for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ComputeResponse withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * Compute type response information for the simulation job.
     * </p>
     * 
     * @param computeType
     *        Compute type response information for the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ComputeResponse withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     * SimulationJob.
     * </p>
     * 
     * @param gpuUnitLimit
     *        Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     *        SimulationJob.
     */

    public void setGpuUnitLimit(Integer gpuUnitLimit) {
        this.gpuUnitLimit = gpuUnitLimit;
    }

    /**
     * <p>
     * Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     * SimulationJob.
     * </p>
     * 
     * @return Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     *         SimulationJob.
     */

    public Integer getGpuUnitLimit() {
        return this.gpuUnitLimit;
    }

    /**
     * <p>
     * Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     * SimulationJob.
     * </p>
     * 
     * @param gpuUnitLimit
     *        Compute GPU unit limit for the simulation job. It is the same as the number of GPUs allocated to the
     *        SimulationJob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResponse withGpuUnitLimit(Integer gpuUnitLimit) {
        setGpuUnitLimit(gpuUnitLimit);
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
            sb.append("SimulationUnitLimit: ").append(getSimulationUnitLimit()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getGpuUnitLimit() != null)
            sb.append("GpuUnitLimit: ").append(getGpuUnitLimit());
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
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getGpuUnitLimit() == null ^ this.getGpuUnitLimit() == null)
            return false;
        if (other.getGpuUnitLimit() != null && other.getGpuUnitLimit().equals(this.getGpuUnitLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimulationUnitLimit() == null) ? 0 : getSimulationUnitLimit().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getGpuUnitLimit() == null) ? 0 : getGpuUnitLimit().hashCode());
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
