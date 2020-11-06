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
     * The network performance.
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
     * The maximum number of physical network cards that can be allocated to the instance.
     * </p>
     */
    private Integer maximumNetworkCards;
    /**
     * <p>
     * The index of the default network card, starting at 0.
     * </p>
     */
    private Integer defaultNetworkCardIndex;
    /**
     * <p>
     * Describes the network cards for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkCardInfo> networkCards;
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
     * Indicates whether Elastic Fabric Adapter (EFA) is supported.
     * </p>
     */
    private Boolean efaSupported;

    /**
     * <p>
     * The network performance.
     * </p>
     * 
     * @param networkPerformance
     *        The network performance.
     */

    public void setNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
    }

    /**
     * <p>
     * The network performance.
     * </p>
     * 
     * @return The network performance.
     */

    public String getNetworkPerformance() {
        return this.networkPerformance;
    }

    /**
     * <p>
     * The network performance.
     * </p>
     * 
     * @param networkPerformance
     *        The network performance.
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
     * The maximum number of physical network cards that can be allocated to the instance.
     * </p>
     * 
     * @param maximumNetworkCards
     *        The maximum number of physical network cards that can be allocated to the instance.
     */

    public void setMaximumNetworkCards(Integer maximumNetworkCards) {
        this.maximumNetworkCards = maximumNetworkCards;
    }

    /**
     * <p>
     * The maximum number of physical network cards that can be allocated to the instance.
     * </p>
     * 
     * @return The maximum number of physical network cards that can be allocated to the instance.
     */

    public Integer getMaximumNetworkCards() {
        return this.maximumNetworkCards;
    }

    /**
     * <p>
     * The maximum number of physical network cards that can be allocated to the instance.
     * </p>
     * 
     * @param maximumNetworkCards
     *        The maximum number of physical network cards that can be allocated to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withMaximumNetworkCards(Integer maximumNetworkCards) {
        setMaximumNetworkCards(maximumNetworkCards);
        return this;
    }

    /**
     * <p>
     * The index of the default network card, starting at 0.
     * </p>
     * 
     * @param defaultNetworkCardIndex
     *        The index of the default network card, starting at 0.
     */

    public void setDefaultNetworkCardIndex(Integer defaultNetworkCardIndex) {
        this.defaultNetworkCardIndex = defaultNetworkCardIndex;
    }

    /**
     * <p>
     * The index of the default network card, starting at 0.
     * </p>
     * 
     * @return The index of the default network card, starting at 0.
     */

    public Integer getDefaultNetworkCardIndex() {
        return this.defaultNetworkCardIndex;
    }

    /**
     * <p>
     * The index of the default network card, starting at 0.
     * </p>
     * 
     * @param defaultNetworkCardIndex
     *        The index of the default network card, starting at 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withDefaultNetworkCardIndex(Integer defaultNetworkCardIndex) {
        setDefaultNetworkCardIndex(defaultNetworkCardIndex);
        return this;
    }

    /**
     * <p>
     * Describes the network cards for the instance type.
     * </p>
     * 
     * @return Describes the network cards for the instance type.
     */

    public java.util.List<NetworkCardInfo> getNetworkCards() {
        if (networkCards == null) {
            networkCards = new com.amazonaws.internal.SdkInternalList<NetworkCardInfo>();
        }
        return networkCards;
    }

    /**
     * <p>
     * Describes the network cards for the instance type.
     * </p>
     * 
     * @param networkCards
     *        Describes the network cards for the instance type.
     */

    public void setNetworkCards(java.util.Collection<NetworkCardInfo> networkCards) {
        if (networkCards == null) {
            this.networkCards = null;
            return;
        }

        this.networkCards = new com.amazonaws.internal.SdkInternalList<NetworkCardInfo>(networkCards);
    }

    /**
     * <p>
     * Describes the network cards for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkCards(java.util.Collection)} or {@link #withNetworkCards(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param networkCards
     *        Describes the network cards for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withNetworkCards(NetworkCardInfo... networkCards) {
        if (this.networkCards == null) {
            setNetworkCards(new com.amazonaws.internal.SdkInternalList<NetworkCardInfo>(networkCards.length));
        }
        for (NetworkCardInfo ele : networkCards) {
            this.networkCards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the network cards for the instance type.
     * </p>
     * 
     * @param networkCards
     *        Describes the network cards for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withNetworkCards(java.util.Collection<NetworkCardInfo> networkCards) {
        setNetworkCards(networkCards);
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
     * <p>
     * Indicates whether Elastic Fabric Adapter (EFA) is supported.
     * </p>
     * 
     * @param efaSupported
     *        Indicates whether Elastic Fabric Adapter (EFA) is supported.
     */

    public void setEfaSupported(Boolean efaSupported) {
        this.efaSupported = efaSupported;
    }

    /**
     * <p>
     * Indicates whether Elastic Fabric Adapter (EFA) is supported.
     * </p>
     * 
     * @return Indicates whether Elastic Fabric Adapter (EFA) is supported.
     */

    public Boolean getEfaSupported() {
        return this.efaSupported;
    }

    /**
     * <p>
     * Indicates whether Elastic Fabric Adapter (EFA) is supported.
     * </p>
     * 
     * @param efaSupported
     *        Indicates whether Elastic Fabric Adapter (EFA) is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInfo withEfaSupported(Boolean efaSupported) {
        setEfaSupported(efaSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether Elastic Fabric Adapter (EFA) is supported.
     * </p>
     * 
     * @return Indicates whether Elastic Fabric Adapter (EFA) is supported.
     */

    public Boolean isEfaSupported() {
        return this.efaSupported;
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
        if (getMaximumNetworkCards() != null)
            sb.append("MaximumNetworkCards: ").append(getMaximumNetworkCards()).append(",");
        if (getDefaultNetworkCardIndex() != null)
            sb.append("DefaultNetworkCardIndex: ").append(getDefaultNetworkCardIndex()).append(",");
        if (getNetworkCards() != null)
            sb.append("NetworkCards: ").append(getNetworkCards()).append(",");
        if (getIpv4AddressesPerInterface() != null)
            sb.append("Ipv4AddressesPerInterface: ").append(getIpv4AddressesPerInterface()).append(",");
        if (getIpv6AddressesPerInterface() != null)
            sb.append("Ipv6AddressesPerInterface: ").append(getIpv6AddressesPerInterface()).append(",");
        if (getIpv6Supported() != null)
            sb.append("Ipv6Supported: ").append(getIpv6Supported()).append(",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: ").append(getEnaSupport()).append(",");
        if (getEfaSupported() != null)
            sb.append("EfaSupported: ").append(getEfaSupported());
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
        if (other.getMaximumNetworkCards() == null ^ this.getMaximumNetworkCards() == null)
            return false;
        if (other.getMaximumNetworkCards() != null && other.getMaximumNetworkCards().equals(this.getMaximumNetworkCards()) == false)
            return false;
        if (other.getDefaultNetworkCardIndex() == null ^ this.getDefaultNetworkCardIndex() == null)
            return false;
        if (other.getDefaultNetworkCardIndex() != null && other.getDefaultNetworkCardIndex().equals(this.getDefaultNetworkCardIndex()) == false)
            return false;
        if (other.getNetworkCards() == null ^ this.getNetworkCards() == null)
            return false;
        if (other.getNetworkCards() != null && other.getNetworkCards().equals(this.getNetworkCards()) == false)
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
        if (other.getEfaSupported() == null ^ this.getEfaSupported() == null)
            return false;
        if (other.getEfaSupported() != null && other.getEfaSupported().equals(this.getEfaSupported()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkPerformance() == null) ? 0 : getNetworkPerformance().hashCode());
        hashCode = prime * hashCode + ((getMaximumNetworkInterfaces() == null) ? 0 : getMaximumNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getMaximumNetworkCards() == null) ? 0 : getMaximumNetworkCards().hashCode());
        hashCode = prime * hashCode + ((getDefaultNetworkCardIndex() == null) ? 0 : getDefaultNetworkCardIndex().hashCode());
        hashCode = prime * hashCode + ((getNetworkCards() == null) ? 0 : getNetworkCards().hashCode());
        hashCode = prime * hashCode + ((getIpv4AddressesPerInterface() == null) ? 0 : getIpv4AddressesPerInterface().hashCode());
        hashCode = prime * hashCode + ((getIpv6AddressesPerInterface() == null) ? 0 : getIpv6AddressesPerInterface().hashCode());
        hashCode = prime * hashCode + ((getIpv6Supported() == null) ? 0 : getIpv6Supported().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getEfaSupported() == null) ? 0 : getEfaSupported().hashCode());
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
