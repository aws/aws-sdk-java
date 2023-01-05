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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The memory size configurations of a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/MemorySizeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemorySizeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of memory in the container.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The limit of memory reserve for the container.
     * </p>
     */
    private Integer memoryReservation;

    /**
     * <p>
     * The amount of memory in the container.
     * </p>
     * 
     * @param memory
     *        The amount of memory in the container.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount of memory in the container.
     * </p>
     * 
     * @return The amount of memory in the container.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount of memory in the container.
     * </p>
     * 
     * @param memory
     *        The amount of memory in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySizeConfiguration withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The limit of memory reserve for the container.
     * </p>
     * 
     * @param memoryReservation
     *        The limit of memory reserve for the container.
     */

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The limit of memory reserve for the container.
     * </p>
     * 
     * @return The limit of memory reserve for the container.
     */

    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }

    /**
     * <p>
     * The limit of memory reserve for the container.
     * </p>
     * 
     * @param memoryReservation
     *        The limit of memory reserve for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySizeConfiguration withMemoryReservation(Integer memoryReservation) {
        setMemoryReservation(memoryReservation);
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
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getMemoryReservation() != null)
            sb.append("MemoryReservation: ").append(getMemoryReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemorySizeConfiguration == false)
            return false;
        MemorySizeConfiguration other = (MemorySizeConfiguration) obj;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        return hashCode;
    }

    @Override
    public MemorySizeConfiguration clone() {
        try {
            return (MemorySizeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.MemorySizeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
