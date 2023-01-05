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
 * Information about the capacity of the connector, whether it is auto scaled or provisioned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/Capacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Capacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the auto scaling parameters for the connector.
     * </p>
     */
    private AutoScaling autoScaling;
    /**
     * <p>
     * Details about a fixed capacity allocated to a connector.
     * </p>
     */
    private ProvisionedCapacity provisionedCapacity;

    /**
     * <p>
     * Information about the auto scaling parameters for the connector.
     * </p>
     * 
     * @param autoScaling
     *        Information about the auto scaling parameters for the connector.
     */

    public void setAutoScaling(AutoScaling autoScaling) {
        this.autoScaling = autoScaling;
    }

    /**
     * <p>
     * Information about the auto scaling parameters for the connector.
     * </p>
     * 
     * @return Information about the auto scaling parameters for the connector.
     */

    public AutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    /**
     * <p>
     * Information about the auto scaling parameters for the connector.
     * </p>
     * 
     * @param autoScaling
     *        Information about the auto scaling parameters for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withAutoScaling(AutoScaling autoScaling) {
        setAutoScaling(autoScaling);
        return this;
    }

    /**
     * <p>
     * Details about a fixed capacity allocated to a connector.
     * </p>
     * 
     * @param provisionedCapacity
     *        Details about a fixed capacity allocated to a connector.
     */

    public void setProvisionedCapacity(ProvisionedCapacity provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
    }

    /**
     * <p>
     * Details about a fixed capacity allocated to a connector.
     * </p>
     * 
     * @return Details about a fixed capacity allocated to a connector.
     */

    public ProvisionedCapacity getProvisionedCapacity() {
        return this.provisionedCapacity;
    }

    /**
     * <p>
     * Details about a fixed capacity allocated to a connector.
     * </p>
     * 
     * @param provisionedCapacity
     *        Details about a fixed capacity allocated to a connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withProvisionedCapacity(ProvisionedCapacity provisionedCapacity) {
        setProvisionedCapacity(provisionedCapacity);
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
        if (getAutoScaling() != null)
            sb.append("AutoScaling: ").append(getAutoScaling()).append(",");
        if (getProvisionedCapacity() != null)
            sb.append("ProvisionedCapacity: ").append(getProvisionedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Capacity == false)
            return false;
        Capacity other = (Capacity) obj;
        if (other.getAutoScaling() == null ^ this.getAutoScaling() == null)
            return false;
        if (other.getAutoScaling() != null && other.getAutoScaling().equals(this.getAutoScaling()) == false)
            return false;
        if (other.getProvisionedCapacity() == null ^ this.getProvisionedCapacity() == null)
            return false;
        if (other.getProvisionedCapacity() != null && other.getProvisionedCapacity().equals(this.getProvisionedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScaling() == null) ? 0 : getAutoScaling().hashCode());
        hashCode = prime * hashCode + ((getProvisionedCapacity() == null) ? 0 : getProvisionedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public Capacity clone() {
        try {
            return (Capacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.CapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
