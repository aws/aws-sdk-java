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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The host property details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/HostPropertiesRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostPropertiesRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host name.
     * </p>
     */
    private String hostName;
    /**
     * <p>
     * The IP address of the host.
     * </p>
     */
    private IpAddresses ipAddresses;

    /**
     * <p>
     * The host name.
     * </p>
     * 
     * @param hostName
     *        The host name.
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * The host name.
     * </p>
     * 
     * @return The host name.
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p>
     * The host name.
     * </p>
     * 
     * @param hostName
     *        The host name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostPropertiesRequest withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p>
     * The IP address of the host.
     * </p>
     * 
     * @param ipAddresses
     *        The IP address of the host.
     */

    public void setIpAddresses(IpAddresses ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    /**
     * <p>
     * The IP address of the host.
     * </p>
     * 
     * @return The IP address of the host.
     */

    public IpAddresses getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * <p>
     * The IP address of the host.
     * </p>
     * 
     * @param ipAddresses
     *        The IP address of the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostPropertiesRequest withIpAddresses(IpAddresses ipAddresses) {
        setIpAddresses(ipAddresses);
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
        if (getHostName() != null)
            sb.append("HostName: ").append(getHostName()).append(",");
        if (getIpAddresses() != null)
            sb.append("IpAddresses: ").append(getIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostPropertiesRequest == false)
            return false;
        HostPropertiesRequest other = (HostPropertiesRequest) obj;
        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getIpAddresses() == null ^ this.getIpAddresses() == null)
            return false;
        if (other.getIpAddresses() != null && other.getIpAddresses().equals(this.getIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getIpAddresses() == null) ? 0 : getIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public HostPropertiesRequest clone() {
        try {
            return (HostPropertiesRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.HostPropertiesRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
