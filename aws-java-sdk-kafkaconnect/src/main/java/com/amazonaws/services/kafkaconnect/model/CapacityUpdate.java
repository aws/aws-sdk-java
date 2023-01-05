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
 * The target capacity for the connector. The capacity can be auto scaled or provisioned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CapacityUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target auto scaling setting.
     * </p>
     */
    private AutoScalingUpdate autoScaling;
    /**
     * <p>
     * The target settings for provisioned capacity.
     * </p>
     */
    private ProvisionedCapacityUpdate provisionedCapacity;

    /**
     * <p>
     * The target auto scaling setting.
     * </p>
     * 
     * @param autoScaling
     *        The target auto scaling setting.
     */

    public void setAutoScaling(AutoScalingUpdate autoScaling) {
        this.autoScaling = autoScaling;
    }

    /**
     * <p>
     * The target auto scaling setting.
     * </p>
     * 
     * @return The target auto scaling setting.
     */

    public AutoScalingUpdate getAutoScaling() {
        return this.autoScaling;
    }

    /**
     * <p>
     * The target auto scaling setting.
     * </p>
     * 
     * @param autoScaling
     *        The target auto scaling setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUpdate withAutoScaling(AutoScalingUpdate autoScaling) {
        setAutoScaling(autoScaling);
        return this;
    }

    /**
     * <p>
     * The target settings for provisioned capacity.
     * </p>
     * 
     * @param provisionedCapacity
     *        The target settings for provisioned capacity.
     */

    public void setProvisionedCapacity(ProvisionedCapacityUpdate provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
    }

    /**
     * <p>
     * The target settings for provisioned capacity.
     * </p>
     * 
     * @return The target settings for provisioned capacity.
     */

    public ProvisionedCapacityUpdate getProvisionedCapacity() {
        return this.provisionedCapacity;
    }

    /**
     * <p>
     * The target settings for provisioned capacity.
     * </p>
     * 
     * @param provisionedCapacity
     *        The target settings for provisioned capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUpdate withProvisionedCapacity(ProvisionedCapacityUpdate provisionedCapacity) {
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

        if (obj instanceof CapacityUpdate == false)
            return false;
        CapacityUpdate other = (CapacityUpdate) obj;
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
    public CapacityUpdate clone() {
        try {
            return (CapacityUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.CapacityUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
