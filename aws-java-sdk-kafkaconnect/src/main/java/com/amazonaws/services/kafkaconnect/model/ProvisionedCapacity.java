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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a connector's provisioned capacity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ProvisionedCapacity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedCapacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
     * </p>
     */
    private Integer mcuCount;
    /**
     * <p>
     * The number of workers that are allocated to the connector.
     * </p>
     */
    private Integer workerCount;

    /**
     * <p>
     * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
     * </p>
     * 
     * @param mcuCount
     *        The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     *        1,2,4,8.
     */

    public void setMcuCount(Integer mcuCount) {
        this.mcuCount = mcuCount;
    }

    /**
     * <p>
     * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
     * </p>
     * 
     * @return The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     *         1,2,4,8.
     */

    public Integer getMcuCount() {
        return this.mcuCount;
    }

    /**
     * <p>
     * The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
     * </p>
     * 
     * @param mcuCount
     *        The number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     *        1,2,4,8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacity withMcuCount(Integer mcuCount) {
        setMcuCount(mcuCount);
        return this;
    }

    /**
     * <p>
     * The number of workers that are allocated to the connector.
     * </p>
     * 
     * @param workerCount
     *        The number of workers that are allocated to the connector.
     */

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    /**
     * <p>
     * The number of workers that are allocated to the connector.
     * </p>
     * 
     * @return The number of workers that are allocated to the connector.
     */

    public Integer getWorkerCount() {
        return this.workerCount;
    }

    /**
     * <p>
     * The number of workers that are allocated to the connector.
     * </p>
     * 
     * @param workerCount
     *        The number of workers that are allocated to the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacity withWorkerCount(Integer workerCount) {
        setWorkerCount(workerCount);
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
        if (getMcuCount() != null)
            sb.append("McuCount: ").append(getMcuCount()).append(",");
        if (getWorkerCount() != null)
            sb.append("WorkerCount: ").append(getWorkerCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedCapacity == false)
            return false;
        ProvisionedCapacity other = (ProvisionedCapacity) obj;
        if (other.getMcuCount() == null ^ this.getMcuCount() == null)
            return false;
        if (other.getMcuCount() != null && other.getMcuCount().equals(this.getMcuCount()) == false)
            return false;
        if (other.getWorkerCount() == null ^ this.getWorkerCount() == null)
            return false;
        if (other.getWorkerCount() != null && other.getWorkerCount().equals(this.getWorkerCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMcuCount() == null) ? 0 : getMcuCount().hashCode());
        hashCode = prime * hashCode + ((getWorkerCount() == null) ? 0 : getWorkerCount().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedCapacity clone() {
        try {
            return (ProvisionedCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.ProvisionedCapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
