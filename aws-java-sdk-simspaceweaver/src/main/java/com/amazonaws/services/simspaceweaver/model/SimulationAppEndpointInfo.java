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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the network endpoint that you can use to connect to your custom or service app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/SimulationAppEndpointInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationAppEndpointInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a network
     * endpoint.
     * </p>
     */
    private java.util.List<SimulationAppPortMapping> ingressPortMappings;

    /**
     * <p>
     * The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     * </p>
     * 
     * @param address
     *        The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     * </p>
     * 
     * @return The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     * </p>
     * 
     * @param address
     *        The IP address of the app. SimSpace Weaver dynamically assigns this IP address when the app starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppEndpointInfo withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a network
     * endpoint.
     * </p>
     * 
     * @return The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a
     *         network endpoint.
     */

    public java.util.List<SimulationAppPortMapping> getIngressPortMappings() {
        return ingressPortMappings;
    }

    /**
     * <p>
     * The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a network
     * endpoint.
     * </p>
     * 
     * @param ingressPortMappings
     *        The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a
     *        network endpoint.
     */

    public void setIngressPortMappings(java.util.Collection<SimulationAppPortMapping> ingressPortMappings) {
        if (ingressPortMappings == null) {
            this.ingressPortMappings = null;
            return;
        }

        this.ingressPortMappings = new java.util.ArrayList<SimulationAppPortMapping>(ingressPortMappings);
    }

    /**
     * <p>
     * The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a network
     * endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngressPortMappings(java.util.Collection)} or {@link #withIngressPortMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ingressPortMappings
     *        The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a
     *        network endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppEndpointInfo withIngressPortMappings(SimulationAppPortMapping... ingressPortMappings) {
        if (this.ingressPortMappings == null) {
            setIngressPortMappings(new java.util.ArrayList<SimulationAppPortMapping>(ingressPortMappings.length));
        }
        for (SimulationAppPortMapping ele : ingressPortMappings) {
            this.ingressPortMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a network
     * endpoint.
     * </p>
     * 
     * @param ingressPortMappings
     *        The inbound TCP/UDP port numbers of the app. The combination of an IP address and a port number form a
     *        network endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppEndpointInfo withIngressPortMappings(java.util.Collection<SimulationAppPortMapping> ingressPortMappings) {
        setIngressPortMappings(ingressPortMappings);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getIngressPortMappings() != null)
            sb.append("IngressPortMappings: ").append(getIngressPortMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationAppEndpointInfo == false)
            return false;
        SimulationAppEndpointInfo other = (SimulationAppEndpointInfo) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getIngressPortMappings() == null ^ this.getIngressPortMappings() == null)
            return false;
        if (other.getIngressPortMappings() != null && other.getIngressPortMappings().equals(this.getIngressPortMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getIngressPortMappings() == null) ? 0 : getIngressPortMappings().hashCode());
        return hashCode;
    }

    @Override
    public SimulationAppEndpointInfo clone() {
        try {
            return (SimulationAppEndpointInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.SimulationAppEndpointInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
