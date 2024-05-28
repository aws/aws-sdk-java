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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that stores the capacity configuration details of a scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxScalingGroupConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxScalingGroupConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     */
    private String scalingGroupName;
    /**
     * <p>
     * An optional hard limit on the amount of memory a kdb cluster can use.
     * </p>
     */
    private Integer memoryLimit;
    /**
     * <p>
     * A reservation of the minimum amount of memory that should be available on the scaling group for a kdb cluster to
     * be successfully placed in a scaling group.
     * </p>
     */
    private Integer memoryReservation;
    /**
     * <p>
     * The number of kdb cluster nodes.
     * </p>
     */
    private Integer nodeCount;
    /**
     * <p>
     * The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     * </p>
     */
    private Double cpu;

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     */

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @return A unique identifier for the kdb scaling group.
     */

    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroupConfiguration withScalingGroupName(String scalingGroupName) {
        setScalingGroupName(scalingGroupName);
        return this;
    }

    /**
     * <p>
     * An optional hard limit on the amount of memory a kdb cluster can use.
     * </p>
     * 
     * @param memoryLimit
     *        An optional hard limit on the amount of memory a kdb cluster can use.
     */

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    /**
     * <p>
     * An optional hard limit on the amount of memory a kdb cluster can use.
     * </p>
     * 
     * @return An optional hard limit on the amount of memory a kdb cluster can use.
     */

    public Integer getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * <p>
     * An optional hard limit on the amount of memory a kdb cluster can use.
     * </p>
     * 
     * @param memoryLimit
     *        An optional hard limit on the amount of memory a kdb cluster can use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroupConfiguration withMemoryLimit(Integer memoryLimit) {
        setMemoryLimit(memoryLimit);
        return this;
    }

    /**
     * <p>
     * A reservation of the minimum amount of memory that should be available on the scaling group for a kdb cluster to
     * be successfully placed in a scaling group.
     * </p>
     * 
     * @param memoryReservation
     *        A reservation of the minimum amount of memory that should be available on the scaling group for a kdb
     *        cluster to be successfully placed in a scaling group.
     */

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * A reservation of the minimum amount of memory that should be available on the scaling group for a kdb cluster to
     * be successfully placed in a scaling group.
     * </p>
     * 
     * @return A reservation of the minimum amount of memory that should be available on the scaling group for a kdb
     *         cluster to be successfully placed in a scaling group.
     */

    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }

    /**
     * <p>
     * A reservation of the minimum amount of memory that should be available on the scaling group for a kdb cluster to
     * be successfully placed in a scaling group.
     * </p>
     * 
     * @param memoryReservation
     *        A reservation of the minimum amount of memory that should be available on the scaling group for a kdb
     *        cluster to be successfully placed in a scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroupConfiguration withMemoryReservation(Integer memoryReservation) {
        setMemoryReservation(memoryReservation);
        return this;
    }

    /**
     * <p>
     * The number of kdb cluster nodes.
     * </p>
     * 
     * @param nodeCount
     *        The number of kdb cluster nodes.
     */

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of kdb cluster nodes.
     * </p>
     * 
     * @return The number of kdb cluster nodes.
     */

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * <p>
     * The number of kdb cluster nodes.
     * </p>
     * 
     * @param nodeCount
     *        The number of kdb cluster nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroupConfiguration withNodeCount(Integer nodeCount) {
        setNodeCount(nodeCount);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     * </p>
     * 
     * @param cpu
     *        The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     */

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     * </p>
     * 
     * @return The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     */

    public Double getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     * </p>
     * 
     * @param cpu
     *        The number of vCPUs that you want to reserve for each node of this kdb cluster on the scaling group host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroupConfiguration withCpu(Double cpu) {
        setCpu(cpu);
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
        if (getScalingGroupName() != null)
            sb.append("ScalingGroupName: ").append(getScalingGroupName()).append(",");
        if (getMemoryLimit() != null)
            sb.append("MemoryLimit: ").append(getMemoryLimit()).append(",");
        if (getMemoryReservation() != null)
            sb.append("MemoryReservation: ").append(getMemoryReservation()).append(",");
        if (getNodeCount() != null)
            sb.append("NodeCount: ").append(getNodeCount()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxScalingGroupConfiguration == false)
            return false;
        KxScalingGroupConfiguration other = (KxScalingGroupConfiguration) obj;
        if (other.getScalingGroupName() == null ^ this.getScalingGroupName() == null)
            return false;
        if (other.getScalingGroupName() != null && other.getScalingGroupName().equals(this.getScalingGroupName()) == false)
            return false;
        if (other.getMemoryLimit() == null ^ this.getMemoryLimit() == null)
            return false;
        if (other.getMemoryLimit() != null && other.getMemoryLimit().equals(this.getMemoryLimit()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingGroupName() == null) ? 0 : getScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMemoryLimit() == null) ? 0 : getMemoryLimit().hashCode());
        hashCode = prime * hashCode + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        return hashCode;
    }

    @Override
    public KxScalingGroupConfiguration clone() {
        try {
            return (KxScalingGroupConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxScalingGroupConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
