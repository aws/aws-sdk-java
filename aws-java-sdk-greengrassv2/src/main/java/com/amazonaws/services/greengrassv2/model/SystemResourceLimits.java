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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about system resource limits that the IoT Greengrass Core software applies to a component's
 * processes. For more information, see <a href=
 * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
 * >Configure system resource limits for components</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/SystemResourceLimits" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemResourceLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core device.
     * </p>
     */
    private Long memory;
    /**
     * <p>
     * The maximum amount of CPU time that a component's processes can use on the core device. A core device's total CPU
     * time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU cores, you can
     * set this value to <code>2</code> to limit the component's processes to 50 percent usage of each CPU core. On a
     * device with 1 CPU core, you can set this value to <code>0.25</code> to limit the component's processes to 25
     * percent usage of the CPU. If you set this value to a number greater than the number of CPU cores, the IoT
     * Greengrass Core software doesn't limit the component's CPU usage.
     * </p>
     */
    private Double cpus;

    /**
     * <p>
     * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core device.
     * </p>
     * 
     * @param memory
     *        The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core
     *        device.
     */

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core device.
     * </p>
     * 
     * @return The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core
     *         device.
     */

    public Long getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core device.
     * </p>
     * 
     * @param memory
     *        The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on the core
     *        device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemResourceLimits withMemory(Long memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The maximum amount of CPU time that a component's processes can use on the core device. A core device's total CPU
     * time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU cores, you can
     * set this value to <code>2</code> to limit the component's processes to 50 percent usage of each CPU core. On a
     * device with 1 CPU core, you can set this value to <code>0.25</code> to limit the component's processes to 25
     * percent usage of the CPU. If you set this value to a number greater than the number of CPU cores, the IoT
     * Greengrass Core software doesn't limit the component's CPU usage.
     * </p>
     * 
     * @param cpus
     *        The maximum amount of CPU time that a component's processes can use on the core device. A core device's
     *        total CPU time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU
     *        cores, you can set this value to <code>2</code> to limit the component's processes to 50 percent usage of
     *        each CPU core. On a device with 1 CPU core, you can set this value to <code>0.25</code> to limit the
     *        component's processes to 25 percent usage of the CPU. If you set this value to a number greater than the
     *        number of CPU cores, the IoT Greengrass Core software doesn't limit the component's CPU usage.
     */

    public void setCpus(Double cpus) {
        this.cpus = cpus;
    }

    /**
     * <p>
     * The maximum amount of CPU time that a component's processes can use on the core device. A core device's total CPU
     * time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU cores, you can
     * set this value to <code>2</code> to limit the component's processes to 50 percent usage of each CPU core. On a
     * device with 1 CPU core, you can set this value to <code>0.25</code> to limit the component's processes to 25
     * percent usage of the CPU. If you set this value to a number greater than the number of CPU cores, the IoT
     * Greengrass Core software doesn't limit the component's CPU usage.
     * </p>
     * 
     * @return The maximum amount of CPU time that a component's processes can use on the core device. A core device's
     *         total CPU time is equivalent to the device's number of CPU cores. For example, on a core device with 4
     *         CPU cores, you can set this value to <code>2</code> to limit the component's processes to 50 percent
     *         usage of each CPU core. On a device with 1 CPU core, you can set this value to <code>0.25</code> to limit
     *         the component's processes to 25 percent usage of the CPU. If you set this value to a number greater than
     *         the number of CPU cores, the IoT Greengrass Core software doesn't limit the component's CPU usage.
     */

    public Double getCpus() {
        return this.cpus;
    }

    /**
     * <p>
     * The maximum amount of CPU time that a component's processes can use on the core device. A core device's total CPU
     * time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU cores, you can
     * set this value to <code>2</code> to limit the component's processes to 50 percent usage of each CPU core. On a
     * device with 1 CPU core, you can set this value to <code>0.25</code> to limit the component's processes to 25
     * percent usage of the CPU. If you set this value to a number greater than the number of CPU cores, the IoT
     * Greengrass Core software doesn't limit the component's CPU usage.
     * </p>
     * 
     * @param cpus
     *        The maximum amount of CPU time that a component's processes can use on the core device. A core device's
     *        total CPU time is equivalent to the device's number of CPU cores. For example, on a core device with 4 CPU
     *        cores, you can set this value to <code>2</code> to limit the component's processes to 50 percent usage of
     *        each CPU core. On a device with 1 CPU core, you can set this value to <code>0.25</code> to limit the
     *        component's processes to 25 percent usage of the CPU. If you set this value to a number greater than the
     *        number of CPU cores, the IoT Greengrass Core software doesn't limit the component's CPU usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemResourceLimits withCpus(Double cpus) {
        setCpus(cpus);
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
        if (getCpus() != null)
            sb.append("Cpus: ").append(getCpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemResourceLimits == false)
            return false;
        SystemResourceLimits other = (SystemResourceLimits) obj;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getCpus() == null ^ this.getCpus() == null)
            return false;
        if (other.getCpus() != null && other.getCpus().equals(this.getCpus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getCpus() == null) ? 0 : getCpus().hashCode());
        return hashCode;
    }

    @Override
    public SystemResourceLimits clone() {
        try {
            return (SystemResourceLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.SystemResourceLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
