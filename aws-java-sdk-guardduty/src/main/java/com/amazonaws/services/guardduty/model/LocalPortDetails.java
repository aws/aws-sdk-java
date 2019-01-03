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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Local port information of the connection.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/LocalPortDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalPortDetails implements Serializable, Cloneable, StructuredPojo {

    /** Port number of the local connection. */
    private Integer port;
    /** Port name of the local connection. */
    private String portName;

    /**
     * Port number of the local connection.
     * 
     * @param port
     *        Port number of the local connection.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Port number of the local connection.
     * 
     * @return Port number of the local connection.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * Port number of the local connection.
     * 
     * @param port
     *        Port number of the local connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalPortDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * Port name of the local connection.
     * 
     * @param portName
     *        Port name of the local connection.
     */

    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * Port name of the local connection.
     * 
     * @return Port name of the local connection.
     */

    public String getPortName() {
        return this.portName;
    }

    /**
     * Port name of the local connection.
     * 
     * @param portName
     *        Port name of the local connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalPortDetails withPortName(String portName) {
        setPortName(portName);
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
        if (getPortName() != null)
            sb.append("PortName: ").append(getPortName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalPortDetails == false)
            return false;
        LocalPortDetails other = (LocalPortDetails) obj;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getPortName() == null ^ this.getPortName() == null)
            return false;
        if (other.getPortName() != null && other.getPortName().equals(this.getPortName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPortName() == null) ? 0 : getPortName().hashCode());
        return hashCode;
    }

    @Override
    public LocalPortDetails clone() {
        try {
            return (LocalPortDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.LocalPortDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
