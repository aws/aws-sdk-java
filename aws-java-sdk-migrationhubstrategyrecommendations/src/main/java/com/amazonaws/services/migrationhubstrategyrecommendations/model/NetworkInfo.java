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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the server's network for which the assessment was run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/NetworkInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the name of the interface of the server for which the assessment was run.
     * </p>
     */
    private String interfaceName;
    /**
     * <p>
     * Information about the IP address of the server for which the assessment was run.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Information about the MAC address of the server for which the assessment was run.
     * </p>
     */
    private String macAddress;
    /**
     * <p>
     * Information about the subnet mask of the server for which the assessment was run.
     * </p>
     */
    private String netMask;

    /**
     * <p>
     * Information about the name of the interface of the server for which the assessment was run.
     * </p>
     * 
     * @param interfaceName
     *        Information about the name of the interface of the server for which the assessment was run.
     */

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * <p>
     * Information about the name of the interface of the server for which the assessment was run.
     * </p>
     * 
     * @return Information about the name of the interface of the server for which the assessment was run.
     */

    public String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * <p>
     * Information about the name of the interface of the server for which the assessment was run.
     * </p>
     * 
     * @param interfaceName
     *        Information about the name of the interface of the server for which the assessment was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withInterfaceName(String interfaceName) {
        setInterfaceName(interfaceName);
        return this;
    }

    /**
     * <p>
     * Information about the IP address of the server for which the assessment was run.
     * </p>
     * 
     * @param ipAddress
     *        Information about the IP address of the server for which the assessment was run.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Information about the IP address of the server for which the assessment was run.
     * </p>
     * 
     * @return Information about the IP address of the server for which the assessment was run.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Information about the IP address of the server for which the assessment was run.
     * </p>
     * 
     * @param ipAddress
     *        Information about the IP address of the server for which the assessment was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Information about the MAC address of the server for which the assessment was run.
     * </p>
     * 
     * @param macAddress
     *        Information about the MAC address of the server for which the assessment was run.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * Information about the MAC address of the server for which the assessment was run.
     * </p>
     * 
     * @return Information about the MAC address of the server for which the assessment was run.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * Information about the MAC address of the server for which the assessment was run.
     * </p>
     * 
     * @param macAddress
     *        Information about the MAC address of the server for which the assessment was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * <p>
     * Information about the subnet mask of the server for which the assessment was run.
     * </p>
     * 
     * @param netMask
     *        Information about the subnet mask of the server for which the assessment was run.
     */

    public void setNetMask(String netMask) {
        this.netMask = netMask;
    }

    /**
     * <p>
     * Information about the subnet mask of the server for which the assessment was run.
     * </p>
     * 
     * @return Information about the subnet mask of the server for which the assessment was run.
     */

    public String getNetMask() {
        return this.netMask;
    }

    /**
     * <p>
     * Information about the subnet mask of the server for which the assessment was run.
     * </p>
     * 
     * @param netMask
     *        Information about the subnet mask of the server for which the assessment was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withNetMask(String netMask) {
        setNetMask(netMask);
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
        if (getInterfaceName() != null)
            sb.append("InterfaceName: ").append(getInterfaceName()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getNetMask() != null)
            sb.append("NetMask: ").append(getNetMask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInfo == false)
            return false;
        NetworkInfo other = (NetworkInfo) obj;
        if (other.getInterfaceName() == null ^ this.getInterfaceName() == null)
            return false;
        if (other.getInterfaceName() != null && other.getInterfaceName().equals(this.getInterfaceName()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getNetMask() == null ^ this.getNetMask() == null)
            return false;
        if (other.getNetMask() != null && other.getNetMask().equals(this.getNetMask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterfaceName() == null) ? 0 : getInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getNetMask() == null) ? 0 : getNetMask().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInfo clone() {
        try {
            return (NetworkInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.NetworkInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
