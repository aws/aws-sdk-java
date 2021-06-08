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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/NetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Network interface IPs.
     * </p>
     */
    private java.util.List<String> ips;
    /**
     * <p>
     * Network interface primary IP.
     * </p>
     */
    private Boolean isPrimary;
    /**
     * <p>
     * Network interface Mac address.
     * </p>
     */
    private String macAddress;

    /**
     * <p>
     * Network interface IPs.
     * </p>
     * 
     * @return Network interface IPs.
     */

    public java.util.List<String> getIps() {
        return ips;
    }

    /**
     * <p>
     * Network interface IPs.
     * </p>
     * 
     * @param ips
     *        Network interface IPs.
     */

    public void setIps(java.util.Collection<String> ips) {
        if (ips == null) {
            this.ips = null;
            return;
        }

        this.ips = new java.util.ArrayList<String>(ips);
    }

    /**
     * <p>
     * Network interface IPs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIps(java.util.Collection)} or {@link #withIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ips
     *        Network interface IPs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withIps(String... ips) {
        if (this.ips == null) {
            setIps(new java.util.ArrayList<String>(ips.length));
        }
        for (String ele : ips) {
            this.ips.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Network interface IPs.
     * </p>
     * 
     * @param ips
     *        Network interface IPs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withIps(java.util.Collection<String> ips) {
        setIps(ips);
        return this;
    }

    /**
     * <p>
     * Network interface primary IP.
     * </p>
     * 
     * @param isPrimary
     *        Network interface primary IP.
     */

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * <p>
     * Network interface primary IP.
     * </p>
     * 
     * @return Network interface primary IP.
     */

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * <p>
     * Network interface primary IP.
     * </p>
     * 
     * @param isPrimary
     *        Network interface primary IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withIsPrimary(Boolean isPrimary) {
        setIsPrimary(isPrimary);
        return this;
    }

    /**
     * <p>
     * Network interface primary IP.
     * </p>
     * 
     * @return Network interface primary IP.
     */

    public Boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * <p>
     * Network interface Mac address.
     * </p>
     * 
     * @param macAddress
     *        Network interface Mac address.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * Network interface Mac address.
     * </p>
     * 
     * @return Network interface Mac address.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * Network interface Mac address.
     * </p>
     * 
     * @param macAddress
     *        Network interface Mac address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withMacAddress(String macAddress) {
        setMacAddress(macAddress);
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
        if (getIps() != null)
            sb.append("Ips: ").append(getIps()).append(",");
        if (getIsPrimary() != null)
            sb.append("IsPrimary: ").append(getIsPrimary()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress());
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
        if (other.getIps() == null ^ this.getIps() == null)
            return false;
        if (other.getIps() != null && other.getIps().equals(this.getIps()) == false)
            return false;
        if (other.getIsPrimary() == null ^ this.getIsPrimary() == null)
            return false;
        if (other.getIsPrimary() != null && other.getIsPrimary().equals(this.getIsPrimary()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIps() == null) ? 0 : getIps().hashCode());
        hashCode = prime * hashCode + ((getIsPrimary() == null) ? 0 : getIsPrimary().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
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
        com.amazonaws.services.mgn.model.transform.NetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
