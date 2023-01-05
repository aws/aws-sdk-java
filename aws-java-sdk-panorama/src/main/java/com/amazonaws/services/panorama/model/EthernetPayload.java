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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A device's network configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/EthernetPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EthernetPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How the device gets an IP address.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * Network configuration for a static IP connection.
     * </p>
     */
    private StaticIpConnectionInfo staticIpConnectionInfo;

    /**
     * <p>
     * How the device gets an IP address.
     * </p>
     * 
     * @param connectionType
     *        How the device gets an IP address.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * How the device gets an IP address.
     * </p>
     * 
     * @return How the device gets an IP address.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * How the device gets an IP address.
     * </p>
     * 
     * @param connectionType
     *        How the device gets an IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public EthernetPayload withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * How the device gets an IP address.
     * </p>
     * 
     * @param connectionType
     *        How the device gets an IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public EthernetPayload withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * Network configuration for a static IP connection.
     * </p>
     * 
     * @param staticIpConnectionInfo
     *        Network configuration for a static IP connection.
     */

    public void setStaticIpConnectionInfo(StaticIpConnectionInfo staticIpConnectionInfo) {
        this.staticIpConnectionInfo = staticIpConnectionInfo;
    }

    /**
     * <p>
     * Network configuration for a static IP connection.
     * </p>
     * 
     * @return Network configuration for a static IP connection.
     */

    public StaticIpConnectionInfo getStaticIpConnectionInfo() {
        return this.staticIpConnectionInfo;
    }

    /**
     * <p>
     * Network configuration for a static IP connection.
     * </p>
     * 
     * @param staticIpConnectionInfo
     *        Network configuration for a static IP connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EthernetPayload withStaticIpConnectionInfo(StaticIpConnectionInfo staticIpConnectionInfo) {
        setStaticIpConnectionInfo(staticIpConnectionInfo);
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
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getStaticIpConnectionInfo() != null)
            sb.append("StaticIpConnectionInfo: ").append(getStaticIpConnectionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EthernetPayload == false)
            return false;
        EthernetPayload other = (EthernetPayload) obj;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getStaticIpConnectionInfo() == null ^ this.getStaticIpConnectionInfo() == null)
            return false;
        if (other.getStaticIpConnectionInfo() != null && other.getStaticIpConnectionInfo().equals(this.getStaticIpConnectionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getStaticIpConnectionInfo() == null) ? 0 : getStaticIpConnectionInfo().hashCode());
        return hashCode;
    }

    @Override
    public EthernetPayload clone() {
        try {
            return (EthernetPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.EthernetPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
