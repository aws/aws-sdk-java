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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes monthly data transfer rates and port information for an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceNetworking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceNetworking implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     */
    private MonthlyTransfer monthlyTransfer;
    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the instance.
     * </p>
     */
    private java.util.List<InstancePortInfo> ports;

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     * 
     * @param monthlyTransfer
     *        The amount of data in GB allocated for monthly data transfers.
     */

    public void setMonthlyTransfer(MonthlyTransfer monthlyTransfer) {
        this.monthlyTransfer = monthlyTransfer;
    }

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     * 
     * @return The amount of data in GB allocated for monthly data transfers.
     */

    public MonthlyTransfer getMonthlyTransfer() {
        return this.monthlyTransfer;
    }

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     * 
     * @param monthlyTransfer
     *        The amount of data in GB allocated for monthly data transfers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworking withMonthlyTransfer(MonthlyTransfer monthlyTransfer) {
        setMonthlyTransfer(monthlyTransfer);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the instance.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the ports on the instance.
     */

    public java.util.List<InstancePortInfo> getPorts() {
        return ports;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the instance.
     * </p>
     * 
     * @param ports
     *        An array of key-value pairs containing information about the ports on the instance.
     */

    public void setPorts(java.util.Collection<InstancePortInfo> ports) {
        if (ports == null) {
            this.ports = null;
            return;
        }

        this.ports = new java.util.ArrayList<InstancePortInfo>(ports);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPorts(java.util.Collection)} or {@link #withPorts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ports
     *        An array of key-value pairs containing information about the ports on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworking withPorts(InstancePortInfo... ports) {
        if (this.ports == null) {
            setPorts(new java.util.ArrayList<InstancePortInfo>(ports.length));
        }
        for (InstancePortInfo ele : ports) {
            this.ports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the instance.
     * </p>
     * 
     * @param ports
     *        An array of key-value pairs containing information about the ports on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceNetworking withPorts(java.util.Collection<InstancePortInfo> ports) {
        setPorts(ports);
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
        if (getMonthlyTransfer() != null)
            sb.append("MonthlyTransfer: ").append(getMonthlyTransfer()).append(",");
        if (getPorts() != null)
            sb.append("Ports: ").append(getPorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceNetworking == false)
            return false;
        InstanceNetworking other = (InstanceNetworking) obj;
        if (other.getMonthlyTransfer() == null ^ this.getMonthlyTransfer() == null)
            return false;
        if (other.getMonthlyTransfer() != null && other.getMonthlyTransfer().equals(this.getMonthlyTransfer()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonthlyTransfer() == null) ? 0 : getMonthlyTransfer().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        return hashCode;
    }

    @Override
    public InstanceNetworking clone() {
        try {
            return (InstanceNetworking) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceNetworkingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
