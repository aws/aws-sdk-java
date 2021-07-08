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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An individual Firewall Manager application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/App" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class App implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application's name.
     * </p>
     */
    private String appName;
    /**
     * <p>
     * The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or <code>icmp</code>.
     * For information on possible numbers, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The application's port number, for example <code>80</code>.
     * </p>
     */
    private Long port;

    /**
     * <p>
     * The application's name.
     * </p>
     * 
     * @param appName
     *        The application's name.
     */

    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * <p>
     * The application's name.
     * </p>
     * 
     * @return The application's name.
     */

    public String getAppName() {
        return this.appName;
    }

    /**
     * <p>
     * The application's name.
     * </p>
     * 
     * @param appName
     *        The application's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppName(String appName) {
        setAppName(appName);
        return this;
    }

    /**
     * <p>
     * The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or <code>icmp</code>.
     * For information on possible numbers, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     * </p>
     * 
     * @param protocol
     *        The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or
     *        <code>icmp</code>. For information on possible numbers, see <a
     *        href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or <code>icmp</code>.
     * For information on possible numbers, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     * </p>
     * 
     * @return The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or
     *         <code>icmp</code>. For information on possible numbers, see <a
     *         href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or <code>icmp</code>.
     * For information on possible numbers, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     * </p>
     * 
     * @param protocol
     *        The IP protocol name or number. The name can be one of <code>tcp</code>, <code>udp</code>, or
     *        <code>icmp</code>. For information on possible numbers, see <a
     *        href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The application's port number, for example <code>80</code>.
     * </p>
     * 
     * @param port
     *        The application's port number, for example <code>80</code>.
     */

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * <p>
     * The application's port number, for example <code>80</code>.
     * </p>
     * 
     * @return The application's port number, for example <code>80</code>.
     */

    public Long getPort() {
        return this.port;
    }

    /**
     * <p>
     * The application's port number, for example <code>80</code>.
     * </p>
     * 
     * @param port
     *        The application's port number, for example <code>80</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withPort(Long port) {
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
        if (getAppName() != null)
            sb.append("AppName: ").append(getAppName()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
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

        if (obj instanceof App == false)
            return false;
        App other = (App) obj;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
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

        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public App clone() {
        try {
            return (App) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.AppMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
