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
 * A static IP configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/StaticIpConnectionInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticIpConnectionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connection's default gateway.
     * </p>
     */
    private String defaultGateway;
    /**
     * <p>
     * The connection's DNS address.
     * </p>
     */
    private java.util.List<String> dns;
    /**
     * <p>
     * The connection's IP address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The connection's DNS mask.
     * </p>
     */
    private String mask;

    /**
     * <p>
     * The connection's default gateway.
     * </p>
     * 
     * @param defaultGateway
     *        The connection's default gateway.
     */

    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }

    /**
     * <p>
     * The connection's default gateway.
     * </p>
     * 
     * @return The connection's default gateway.
     */

    public String getDefaultGateway() {
        return this.defaultGateway;
    }

    /**
     * <p>
     * The connection's default gateway.
     * </p>
     * 
     * @param defaultGateway
     *        The connection's default gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIpConnectionInfo withDefaultGateway(String defaultGateway) {
        setDefaultGateway(defaultGateway);
        return this;
    }

    /**
     * <p>
     * The connection's DNS address.
     * </p>
     * 
     * @return The connection's DNS address.
     */

    public java.util.List<String> getDns() {
        return dns;
    }

    /**
     * <p>
     * The connection's DNS address.
     * </p>
     * 
     * @param dns
     *        The connection's DNS address.
     */

    public void setDns(java.util.Collection<String> dns) {
        if (dns == null) {
            this.dns = null;
            return;
        }

        this.dns = new java.util.ArrayList<String>(dns);
    }

    /**
     * <p>
     * The connection's DNS address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDns(java.util.Collection)} or {@link #withDns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dns
     *        The connection's DNS address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIpConnectionInfo withDns(String... dns) {
        if (this.dns == null) {
            setDns(new java.util.ArrayList<String>(dns.length));
        }
        for (String ele : dns) {
            this.dns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The connection's DNS address.
     * </p>
     * 
     * @param dns
     *        The connection's DNS address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIpConnectionInfo withDns(java.util.Collection<String> dns) {
        setDns(dns);
        return this;
    }

    /**
     * <p>
     * The connection's IP address.
     * </p>
     * 
     * @param ipAddress
     *        The connection's IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The connection's IP address.
     * </p>
     * 
     * @return The connection's IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The connection's IP address.
     * </p>
     * 
     * @param ipAddress
     *        The connection's IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIpConnectionInfo withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The connection's DNS mask.
     * </p>
     * 
     * @param mask
     *        The connection's DNS mask.
     */

    public void setMask(String mask) {
        this.mask = mask;
    }

    /**
     * <p>
     * The connection's DNS mask.
     * </p>
     * 
     * @return The connection's DNS mask.
     */

    public String getMask() {
        return this.mask;
    }

    /**
     * <p>
     * The connection's DNS mask.
     * </p>
     * 
     * @param mask
     *        The connection's DNS mask.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticIpConnectionInfo withMask(String mask) {
        setMask(mask);
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
        if (getDefaultGateway() != null)
            sb.append("DefaultGateway: ").append(getDefaultGateway()).append(",");
        if (getDns() != null)
            sb.append("Dns: ").append(getDns()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getMask() != null)
            sb.append("Mask: ").append(getMask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticIpConnectionInfo == false)
            return false;
        StaticIpConnectionInfo other = (StaticIpConnectionInfo) obj;
        if (other.getDefaultGateway() == null ^ this.getDefaultGateway() == null)
            return false;
        if (other.getDefaultGateway() != null && other.getDefaultGateway().equals(this.getDefaultGateway()) == false)
            return false;
        if (other.getDns() == null ^ this.getDns() == null)
            return false;
        if (other.getDns() != null && other.getDns().equals(this.getDns()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getMask() == null ^ this.getMask() == null)
            return false;
        if (other.getMask() != null && other.getMask().equals(this.getMask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultGateway() == null) ? 0 : getDefaultGateway().hashCode());
        hashCode = prime * hashCode + ((getDns() == null) ? 0 : getDns().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getMask() == null) ? 0 : getMask().hashCode());
        return hashCode;
    }

    @Override
    public StaticIpConnectionInfo clone() {
        try {
            return (StaticIpConnectionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.StaticIpConnectionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
