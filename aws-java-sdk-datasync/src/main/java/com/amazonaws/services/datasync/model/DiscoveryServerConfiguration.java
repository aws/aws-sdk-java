/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The network settings that DataSync Discovery uses to connect with your on-premises storage system's management
 * interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DiscoveryServerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoveryServerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name or IP address of your storage system's management interface.
     * </p>
     */
    private String serverHostname;
    /**
     * <p>
     * The network port for accessing the storage system's management interface.
     * </p>
     */
    private Integer serverPort;

    /**
     * <p>
     * The domain name or IP address of your storage system's management interface.
     * </p>
     * 
     * @param serverHostname
     *        The domain name or IP address of your storage system's management interface.
     */

    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }

    /**
     * <p>
     * The domain name or IP address of your storage system's management interface.
     * </p>
     * 
     * @return The domain name or IP address of your storage system's management interface.
     */

    public String getServerHostname() {
        return this.serverHostname;
    }

    /**
     * <p>
     * The domain name or IP address of your storage system's management interface.
     * </p>
     * 
     * @param serverHostname
     *        The domain name or IP address of your storage system's management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryServerConfiguration withServerHostname(String serverHostname) {
        setServerHostname(serverHostname);
        return this;
    }

    /**
     * <p>
     * The network port for accessing the storage system's management interface.
     * </p>
     * 
     * @param serverPort
     *        The network port for accessing the storage system's management interface.
     */

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * <p>
     * The network port for accessing the storage system's management interface.
     * </p>
     * 
     * @return The network port for accessing the storage system's management interface.
     */

    public Integer getServerPort() {
        return this.serverPort;
    }

    /**
     * <p>
     * The network port for accessing the storage system's management interface.
     * </p>
     * 
     * @param serverPort
     *        The network port for accessing the storage system's management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryServerConfiguration withServerPort(Integer serverPort) {
        setServerPort(serverPort);
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
        if (getServerHostname() != null)
            sb.append("ServerHostname: ").append(getServerHostname()).append(",");
        if (getServerPort() != null)
            sb.append("ServerPort: ").append(getServerPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoveryServerConfiguration == false)
            return false;
        DiscoveryServerConfiguration other = (DiscoveryServerConfiguration) obj;
        if (other.getServerHostname() == null ^ this.getServerHostname() == null)
            return false;
        if (other.getServerHostname() != null && other.getServerHostname().equals(this.getServerHostname()) == false)
            return false;
        if (other.getServerPort() == null ^ this.getServerPort() == null)
            return false;
        if (other.getServerPort() != null && other.getServerPort().equals(this.getServerPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerHostname() == null) ? 0 : getServerHostname().hashCode());
        hashCode = prime * hashCode + ((getServerPort() == null) ? 0 : getServerPort().hashCode());
        return hashCode;
    }

    @Override
    public DiscoveryServerConfiguration clone() {
        try {
            return (DiscoveryServerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.DiscoveryServerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
