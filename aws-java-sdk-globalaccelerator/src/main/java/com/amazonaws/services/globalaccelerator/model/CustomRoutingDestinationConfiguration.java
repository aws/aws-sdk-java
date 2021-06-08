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
 * For a custom routing accelerator, sets the port range and protocol for all endpoints (virtual private cloud subnets)
 * in an endpoint group to accept client traffic on.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CustomRoutingDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomRoutingDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be
     * either TCP or UDP.
     * </p>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     * 
     * @param fromPort
     *        The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom
     *        routing accelerator.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     * 
     * @return The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom
     *         routing accelerator.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     * 
     * @param fromPort
     *        The first port, inclusive, in the range of ports for the endpoint group that is associated with a custom
     *        routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingDestinationConfiguration withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     * 
     * @param toPort
     *        The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom
     *        routing accelerator.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     * 
     * @return The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom
     *         routing accelerator.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom routing
     * accelerator.
     * </p>
     * 
     * @param toPort
     *        The last port, inclusive, in the range of ports for the endpoint group that is associated with a custom
     *        routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingDestinationConfiguration withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be
     * either TCP or UDP.
     * </p>
     * 
     * @return The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol
     *         can be either TCP or UDP.
     * @see CustomRoutingProtocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be
     * either TCP or UDP.
     * </p>
     * 
     * @param protocols
     *        The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can
     *        be either TCP or UDP.
     * @see CustomRoutingProtocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be
     * either TCP or UDP.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can
     *        be either TCP or UDP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingProtocol
     */

    public CustomRoutingDestinationConfiguration withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be
     * either TCP or UDP.
     * </p>
     * 
     * @param protocols
     *        The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can
     *        be either TCP or UDP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingProtocol
     */

    public CustomRoutingDestinationConfiguration withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can be
     * either TCP or UDP.
     * </p>
     * 
     * @param protocols
     *        The protocol for the endpoint group that is associated with a custom routing accelerator. The protocol can
     *        be either TCP or UDP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomRoutingProtocol
     */

    public CustomRoutingDestinationConfiguration withProtocols(CustomRoutingProtocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (CustomRoutingProtocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomRoutingDestinationConfiguration == false)
            return false;
        CustomRoutingDestinationConfiguration other = (CustomRoutingDestinationConfiguration) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public CustomRoutingDestinationConfiguration clone() {
        try {
            return (CustomRoutingDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.CustomRoutingDestinationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
