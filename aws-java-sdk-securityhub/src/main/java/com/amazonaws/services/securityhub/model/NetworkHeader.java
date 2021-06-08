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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a network path component that occurs before or after the current component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/NetworkHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkHeader implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The protocol used for the component.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Information about the destination of the component.
     * </p>
     */
    private NetworkPathComponentDetails destination;
    /**
     * <p>
     * Information about the origin of the component.
     * </p>
     */
    private NetworkPathComponentDetails source;

    /**
     * <p>
     * The protocol used for the component.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the component.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the component.
     * </p>
     * 
     * @return The protocol used for the component.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the component.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkHeader withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Information about the destination of the component.
     * </p>
     * 
     * @param destination
     *        Information about the destination of the component.
     */

    public void setDestination(NetworkPathComponentDetails destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Information about the destination of the component.
     * </p>
     * 
     * @return Information about the destination of the component.
     */

    public NetworkPathComponentDetails getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Information about the destination of the component.
     * </p>
     * 
     * @param destination
     *        Information about the destination of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkHeader withDestination(NetworkPathComponentDetails destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Information about the origin of the component.
     * </p>
     * 
     * @param source
     *        Information about the origin of the component.
     */

    public void setSource(NetworkPathComponentDetails source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the origin of the component.
     * </p>
     * 
     * @return Information about the origin of the component.
     */

    public NetworkPathComponentDetails getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information about the origin of the component.
     * </p>
     * 
     * @param source
     *        Information about the origin of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkHeader withSource(NetworkPathComponentDetails source) {
        setSource(source);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkHeader == false)
            return false;
        NetworkHeader other = (NetworkHeader) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public NetworkHeader clone() {
        try {
            return (NetworkHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NetworkHeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
