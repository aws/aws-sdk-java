/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the networking features of the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the network performance.
     * </p>
     */
    private String networkPerformance;
    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     */
    private Integer maximumNetworkInterfaces;
    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     */
    private Integer ipv4AddressesPerInterface;
    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     */
    private Integer ipv6AddressesPerInterface;
    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     */
    private Boolean ipv6Supported;
    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     */
    private String enaSupport;

    /**
     * <p>
     * Describes the network performance.
     * </p>
     * 
     * @param networkPerformance
     *        Describes the network performance.
     */

    public void setNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
    }

    /**
     * <p>
     * Describes the network performance.
     * </p>
     * 
     * @return Describes the network performance.
     */

    public String getNetworkPerformance() {
        return this.networkPerformance;
    }

    /**
     * <p>
     * Describes the network performance.
     * </p>
     * 
     * @param networkPerformance
     *        Describes the network performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withNetworkPerformance(String networkPerformance) {
        setNetworkPerformance(networkPerformance);
        return this;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     * 
     * @param maximumNetworkInterfaces
     *        The maximum number of network interfaces for the instance type.
     */

    public void setMaximumNetworkInterfaces(Integer maximumNetworkInterfaces) {
        this.maximumNetworkInterfaces = maximumNetworkInterfaces;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     * 
     * @return The maximum number of network interfaces for the instance type.
     */

    public Integer getMaximumNetworkInterfaces() {
        return this.maximumNetworkInterfaces;
    }

    /**
     * <p>
     * The maximum number of network interfaces for the instance type.
     * </p>
     * 
     * @param maximumNetworkInterfaces
     *        The maximum number of network interfaces for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withMaximumNetworkInterfaces(Integer maximumNetworkInterfaces) {
        setMaximumNetworkInterfaces(maximumNetworkInterfaces);
        return this;
    }

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     * 
     * @param ipv4AddressesPerInterface
     *        The maximum number of IPv4 addresses per network interface.
     */

    public void setIpv4AddressesPerInterface(Integer ipv4AddressesPerInterface) {
        this.ipv4AddressesPerInterface = ipv4AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     * 
     * @return The maximum number of IPv4 addresses per network interface.
     */

    public Integer getIpv4AddressesPerInterface() {
        return this.ipv4AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv4 addresses per network interface.
     * </p>
     * 
     * @param ipv4AddressesPerInterface
     *        The maximum number of IPv4 addresses per network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withIpv4AddressesPerInterface(Integer ipv4AddressesPerInterface) {
        setIpv4AddressesPerInterface(ipv4AddressesPerInterface);
        return this;
    }

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     * 
     * @param ipv6AddressesPerInterface
     *        The maximum number of IPv6 addresses per network interface.
     */

    public void setIpv6AddressesPerInterface(Integer ipv6AddressesPerInterface) {
        this.ipv6AddressesPerInterface = ipv6AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     * 
     * @return The maximum number of IPv6 addresses per network interface.
     */

    public Integer getIpv6AddressesPerInterface() {
        return this.ipv6AddressesPerInterface;
    }

    /**
     * <p>
     * The maximum number of IPv6 addresses per network interface.
     * </p>
     * 
     * @param ipv6AddressesPerInterface
     *        The maximum number of IPv6 addresses per network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withIpv6AddressesPerInterface(Integer ipv6AddressesPerInterface) {
        setIpv6AddressesPerInterface(ipv6AddressesPerInterface);
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @param ipv6Supported
     *        Indicates whether IPv6 is supported.
     */

    public void setIpv6Supported(Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @return Indicates whether IPv6 is supported.
     */

    public Boolean getIpv6Supported() {
        return this.ipv6Supported;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @param ipv6Supported
     *        Indicates whether IPv6 is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withIpv6Supported(Boolean ipv6Supported) {
        setIpv6Supported(ipv6Supported);
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @return Indicates whether IPv6 is supported.
     */

    public Boolean isIpv6Supported() {
        return this.ipv6Supported;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * 
     * @param enaSupport
     *        Indicates whether Elastic Network Adapter (ENA) is supported.
     * @see EnaSupport
     */

    public void setEnaSupport(String enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * 
     * @return Indicates whether Elastic Network Adapter (ENA) is supported.
     * @see EnaSupport
     */

    public String getEnaSupport() {
        return this.enaSupport;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * 
     * @param enaSupport
     *        Indicates whether Elastic Network Adapter (ENA) is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnaSupport
     */

    public NetworkInfo withEnaSupport(String enaSupport) {
        setEnaSupport(enaSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether Elastic Network Adapter (ENA) is supported.
     * </p>
     * 
     * @param enaSupport
     *        Indicates whether Elastic Network Adapter (ENA) is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnaSupport
     */

    public NetworkInfo withEnaSupport(EnaSupport enaSupport) {
        this.enaSupport = enaSupport.toString();
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
        if (getNetworkPerformance() != null)
            sb.append("NetworkPerformance: ").append(getNetworkPerformance()).append(",");
        if (getMaximumNetworkInterfaces() != null)
            sb.append("MaximumNetworkInterfaces: ").append(getMaximumNetworkInterfaces()).append(",");
        if (getIpv4AddressesPerInterface() != null)
            sb.append("Ipv4AddressesPerInterface: ").append(getIpv4AddressesPerInterface()).append(",");
        if (getIpv6AddressesPerInterface() != null)
            sb.append("Ipv6AddressesPerInterface: ").append(getIpv6AddressesPerInterface()).append(",");
        if (getIpv6Supported() != null)
            sb.append("Ipv6Supported: ").append(getIpv6Supported()).append(",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: ").append(getEnaSupport());
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
        if (other.getNetworkPerformance() == null ^ this.getNetworkPerformance() == null)
            return false;
        if (other.getNetworkPerformance() != null && other.getNetworkPerformance().equals(this.getNetworkPerformance()) == false)
            return false;
        if (other.getMaximumNetworkInterfaces() == null ^ this.getMaximumNetworkInterfaces() == null)
            return false;
        if (other.getMaximumNetworkInterfaces() != null && other.getMaximumNetworkInterfaces().equals(this.getMaximumNetworkInterfaces()) == false)
            return false;
        if (other.getIpv4AddressesPerInterface() == null ^ this.getIpv4AddressesPerInterface() == null)
            return false;
        if (other.getIpv4AddressesPerInterface() != null && other.getIpv4AddressesPerInterface().equals(this.getIpv4AddressesPerInterface()) == false)
            return false;
        if (other.getIpv6AddressesPerInterface() == null ^ this.getIpv6AddressesPerInterface() == null)
            return false;
        if (other.getIpv6AddressesPerInterface() != null && other.getIpv6AddressesPerInterface().equals(this.getIpv6AddressesPerInterface()) == false)
            return false;
        if (other.getIpv6Supported() == null ^ this.getIpv6Supported() == null)
            return false;
        if (other.getIpv6Supported() != null && other.getIpv6Supported().equals(this.getIpv6Supported()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkPerformance() == null) ? 0 : getNetworkPerformance().hashCode());
        hashCode = prime * hashCode + ((getMaximumNetworkInterfaces() == null) ? 0 : getMaximumNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getIpv4AddressesPerInterface() == null) ? 0 : getIpv4AddressesPerInterface().hashCode());
        hashCode = prime * hashCode + ((getIpv6AddressesPerInterface() == null) ? 0 : getIpv6AddressesPerInterface().hashCode());
        hashCode = prime * hashCode + ((getIpv6Supported() == null) ? 0 : getIpv6Supported().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
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

}
