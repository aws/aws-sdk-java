/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the socket address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/SocketAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SocketAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of a socket address.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Port of a socket address.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Name of a socket address.
     * </p>
     * 
     * @param name
     *        Name of a socket address.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a socket address.
     * </p>
     * 
     * @return Name of a socket address.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a socket address.
     * </p>
     * 
     * @param name
     *        Name of a socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SocketAddress withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Port of a socket address.
     * </p>
     * 
     * @param port
     *        Port of a socket address.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port of a socket address.
     * </p>
     * 
     * @return Port of a socket address.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port of a socket address.
     * </p>
     * 
     * @param port
     *        Port of a socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SocketAddress withPort(Integer port) {
        setPort(port);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SocketAddress == false)
            return false;
        SocketAddress other = (SocketAddress) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public SocketAddress clone() {
        try {
            return (SocketAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.SocketAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
