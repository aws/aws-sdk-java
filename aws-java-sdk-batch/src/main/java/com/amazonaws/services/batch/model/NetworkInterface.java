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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the elastic network interface for a multi-node parallel job node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     */
    private String ipv6Address;
    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     */
    private String privateIpv4Address;

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     * 
     * @param attachmentId
     *        The attachment ID for the network interface.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     * 
     * @return The attachment ID for the network interface.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The attachment ID for the network interface.
     * </p>
     * 
     * @param attachmentId
     *        The attachment ID for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     * 
     * @param ipv6Address
     *        The private IPv6 address for the network interface.
     */

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     * 
     * @return The private IPv6 address for the network interface.
     */

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * <p>
     * The private IPv6 address for the network interface.
     * </p>
     * 
     * @param ipv6Address
     *        The private IPv6 address for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withIpv6Address(String ipv6Address) {
        setIpv6Address(ipv6Address);
        return this;
    }

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     * 
     * @param privateIpv4Address
     *        The private IPv4 address for the network interface.
     */

    public void setPrivateIpv4Address(String privateIpv4Address) {
        this.privateIpv4Address = privateIpv4Address;
    }

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     * 
     * @return The private IPv4 address for the network interface.
     */

    public String getPrivateIpv4Address() {
        return this.privateIpv4Address;
    }

    /**
     * <p>
     * The private IPv4 address for the network interface.
     * </p>
     * 
     * @param privateIpv4Address
     *        The private IPv4 address for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPrivateIpv4Address(String privateIpv4Address) {
        setPrivateIpv4Address(privateIpv4Address);
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getIpv6Address() != null)
            sb.append("Ipv6Address: ").append(getIpv6Address()).append(",");
        if (getPrivateIpv4Address() != null)
            sb.append("PrivateIpv4Address: ").append(getPrivateIpv4Address());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterface == false)
            return false;
        NetworkInterface other = (NetworkInterface) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        if (other.getPrivateIpv4Address() == null ^ this.getPrivateIpv4Address() == null)
            return false;
        if (other.getPrivateIpv4Address() != null && other.getPrivateIpv4Address().equals(this.getPrivateIpv4Address()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getIpv6Address() == null) ? 0 : getIpv6Address().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpv4Address() == null) ? 0 : getPrivateIpv4Address().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInterface clone() {
        try {
            return (NetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
