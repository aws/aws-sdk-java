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
 * Describes information about the ports on your virtual private server (or <i>instance</i>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PortInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first port in the range.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The last port in the range.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param fromPort
     *        The first port in the range.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @return The first port in the range.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param fromPort
     *        The first port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param toPort
     *        The last port in the range.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @return The last port in the range.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param toPort
     *        The last port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortInfo withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @see NetworkProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     * @see NetworkProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public PortInfo withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @see NetworkProtocol
     */

    public void setProtocol(NetworkProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public PortInfo withProtocol(NetworkProtocol protocol) {
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
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

        if (obj instanceof PortInfo == false)
            return false;
        PortInfo other = (PortInfo) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
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

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public PortInfo clone() {
        try {
            return (PortInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.PortInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
