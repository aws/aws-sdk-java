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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a public virtual interface to be provisioned on a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/NewPublicVirtualInterfaceAllocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewPublicVirtualInterfaceAllocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     */
    private String virtualInterfaceName;
    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     */
    private Integer vlan;
    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     */
    private Integer asn;
    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     */
    private String authKey;
    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     */
    private String amazonAddress;
    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     */
    private String customerAddress;
    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> routeFilterPrefixes;

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     * 
     * @param virtualInterfaceName
     *        The name of the virtual interface assigned by the customer network.
     */

    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     * 
     * @return The name of the virtual interface assigned by the customer network.
     */

    public String getVirtualInterfaceName() {
        return this.virtualInterfaceName;
    }

    /**
     * <p>
     * The name of the virtual interface assigned by the customer network.
     * </p>
     * 
     * @param virtualInterfaceName
     *        The name of the virtual interface assigned by the customer network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withVirtualInterfaceName(String virtualInterfaceName) {
        setVirtualInterfaceName(virtualInterfaceName);
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @return The ID of the VLAN.
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * <p>
     * The ID of the VLAN.
     * </p>
     * 
     * @param vlan
     *        The ID of the VLAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * 
     * @param asn
     *        The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * 
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * </p>
     * 
     * @param asn
     *        The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     * 
     * @param authKey
     *        The authentication key for BGP configuration.
     */

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     * 
     * @return The authentication key for BGP configuration.
     */

    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * <p>
     * The authentication key for BGP configuration.
     * </p>
     * 
     * @param authKey
     *        The authentication key for BGP configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withAuthKey(String authKey) {
        setAuthKey(authKey);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @param amazonAddress
     *        The IP address assigned to the Amazon interface.
     */

    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @return The IP address assigned to the Amazon interface.
     */

    public String getAmazonAddress() {
        return this.amazonAddress;
    }

    /**
     * <p>
     * The IP address assigned to the Amazon interface.
     * </p>
     * 
     * @param amazonAddress
     *        The IP address assigned to the Amazon interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @param customerAddress
     *        The IP address assigned to the customer interface.
     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @return The IP address assigned to the customer interface.
     */

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * 
     * @param customerAddress
     *        The IP address assigned to the customer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @return The address family for the BGP peer.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public NewPublicVirtualInterfaceAllocation withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @see AddressFamily
     */

    public void setAddressFamily(AddressFamily addressFamily) {
        withAddressFamily(addressFamily);
    }

    /**
     * <p>
     * The address family for the BGP peer.
     * </p>
     * 
     * @param addressFamily
     *        The address family for the BGP peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public NewPublicVirtualInterfaceAllocation withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * 
     * @return The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     */

    public java.util.List<RouteFilterPrefix> getRouteFilterPrefixes() {
        if (routeFilterPrefixes == null) {
            routeFilterPrefixes = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return routeFilterPrefixes;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * 
     * @param routeFilterPrefixes
     *        The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     */

    public void setRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
            return;
        }

        this.routeFilterPrefixes = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(routeFilterPrefixes);
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteFilterPrefixes(java.util.Collection)} or {@link #withRouteFilterPrefixes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routeFilterPrefixes
     *        The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withRouteFilterPrefixes(RouteFilterPrefix... routeFilterPrefixes) {
        if (this.routeFilterPrefixes == null) {
            setRouteFilterPrefixes(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(routeFilterPrefixes.length));
        }
        for (RouteFilterPrefix ele : routeFilterPrefixes) {
            this.routeFilterPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * </p>
     * 
     * @param routeFilterPrefixes
     *        The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPublicVirtualInterfaceAllocation withRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        setRouteFilterPrefixes(routeFilterPrefixes);
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
        if (getVirtualInterfaceName() != null)
            sb.append("VirtualInterfaceName: ").append(getVirtualInterfaceName()).append(",");
        if (getVlan() != null)
            sb.append("Vlan: ").append(getVlan()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAuthKey() != null)
            sb.append("AuthKey: ").append(getAuthKey()).append(",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: ").append(getAmazonAddress()).append(",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: ").append(getCustomerAddress()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getRouteFilterPrefixes() != null)
            sb.append("RouteFilterPrefixes: ").append(getRouteFilterPrefixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewPublicVirtualInterfaceAllocation == false)
            return false;
        NewPublicVirtualInterfaceAllocation other = (NewPublicVirtualInterfaceAllocation) obj;
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null)
            return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getRouteFilterPrefixes() == null ^ this.getRouteFilterPrefixes() == null)
            return false;
        if (other.getRouteFilterPrefixes() != null && other.getRouteFilterPrefixes().equals(this.getRouteFilterPrefixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getRouteFilterPrefixes() == null) ? 0 : getRouteFilterPrefixes().hashCode());
        return hashCode;
    }

    @Override
    public NewPublicVirtualInterfaceAllocation clone() {
        try {
            return (NewPublicVirtualInterfaceAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.NewPublicVirtualInterfaceAllocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
