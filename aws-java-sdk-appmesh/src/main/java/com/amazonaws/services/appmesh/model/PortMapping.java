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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a virtual node or virtual router listener port mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/PortMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol used for the port mapping.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * 
     * @param port
     *        The port used for the port mapping.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * 
     * @return The port used for the port mapping.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * 
     * @param port
     *        The port used for the port mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping.
     * @see PortProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping.
     * </p>
     * 
     * @return The protocol used for the port mapping.
     * @see PortProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortProtocol
     */

    public PortMapping withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortProtocol
     */

    public PortMapping withProtocol(PortProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortMapping == false)
            return false;
        PortMapping other = (PortMapping) obj;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public PortMapping clone() {
        try {
            return (PortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.PortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
