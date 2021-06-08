/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Override specific listener ports used to route traffic to endpoints that are part of an endpoint group. For example,
 * you can create a port override in which the listener receives user traffic on ports 80 and 443, but your accelerator
 * routes that traffic to ports 1080 and 1443, respectively, on the endpoints.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoint-groups-port-override.html"> Port
 * overrides</a> in the <i>AWS Global Accelerator Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/PortOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to
     * the Global Accelerator on.
     * </p>
     */
    private Integer listenerPort;
    /**
     * <p>
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the
     * Application Load Balancer or Amazon EC2 instance.
     * </p>
     */
    private Integer endpointPort;

    /**
     * <p>
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to
     * the Global Accelerator on.
     * </p>
     * 
     * @param listenerPort
     *        The listener port that you want to map to a specific endpoint port. This is the port that user traffic
     *        arrives to the Global Accelerator on.
     */

    public void setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
    }

    /**
     * <p>
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to
     * the Global Accelerator on.
     * </p>
     * 
     * @return The listener port that you want to map to a specific endpoint port. This is the port that user traffic
     *         arrives to the Global Accelerator on.
     */

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * <p>
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to
     * the Global Accelerator on.
     * </p>
     * 
     * @param listenerPort
     *        The listener port that you want to map to a specific endpoint port. This is the port that user traffic
     *        arrives to the Global Accelerator on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortOverride withListenerPort(Integer listenerPort) {
        setListenerPort(listenerPort);
        return this;
    }

    /**
     * <p>
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the
     * Application Load Balancer or Amazon EC2 instance.
     * </p>
     * 
     * @param endpointPort
     *        The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as
     *        the Application Load Balancer or Amazon EC2 instance.
     */

    public void setEndpointPort(Integer endpointPort) {
        this.endpointPort = endpointPort;
    }

    /**
     * <p>
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the
     * Application Load Balancer or Amazon EC2 instance.
     * </p>
     * 
     * @return The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such
     *         as the Application Load Balancer or Amazon EC2 instance.
     */

    public Integer getEndpointPort() {
        return this.endpointPort;
    }

    /**
     * <p>
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the
     * Application Load Balancer or Amazon EC2 instance.
     * </p>
     * 
     * @param endpointPort
     *        The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as
     *        the Application Load Balancer or Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortOverride withEndpointPort(Integer endpointPort) {
        setEndpointPort(endpointPort);
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
        if (getListenerPort() != null)
            sb.append("ListenerPort: ").append(getListenerPort()).append(",");
        if (getEndpointPort() != null)
            sb.append("EndpointPort: ").append(getEndpointPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortOverride == false)
            return false;
        PortOverride other = (PortOverride) obj;
        if (other.getListenerPort() == null ^ this.getListenerPort() == null)
            return false;
        if (other.getListenerPort() != null && other.getListenerPort().equals(this.getListenerPort()) == false)
            return false;
        if (other.getEndpointPort() == null ^ this.getEndpointPort() == null)
            return false;
        if (other.getEndpointPort() != null && other.getEndpointPort().equals(this.getEndpointPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerPort() == null) ? 0 : getListenerPort().hashCode());
        hashCode = prime * hashCode + ((getEndpointPort() == null) ? 0 : getEndpointPort().hashCode());
        return hashCode;
    }

    @Override
    public PortOverride clone() {
        try {
            return (PortOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.PortOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
