/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure containing information about a new private virtual interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/NewPrivateVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewPrivateVirtualInterface implements Serializable, Cloneable, StructuredPojo {

    private String virtualInterfaceName;

    private Integer vlan;

    private Integer asn;

    private String authKey;

    private String amazonAddress;

    private String customerAddress;

    private String addressFamily;

    private String virtualGatewayId;

    private String directConnectGatewayId;

    /**
     * @param virtualInterfaceName
     */

    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }

    /**
     * @return
     */

    public String getVirtualInterfaceName() {
        return this.virtualInterfaceName;
    }

    /**
     * @param virtualInterfaceName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withVirtualInterfaceName(String virtualInterfaceName) {
        setVirtualInterfaceName(virtualInterfaceName);
        return this;
    }

    /**
     * @param vlan
     */

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * @return
     */

    public Integer getVlan() {
        return this.vlan;
    }

    /**
     * @param vlan
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withVlan(Integer vlan) {
        setVlan(vlan);
        return this;
    }

    /**
     * @param asn
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * @return
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * @param asn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * @param authKey
     */

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * @return
     */

    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @param authKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withAuthKey(String authKey) {
        setAuthKey(authKey);
        return this;
    }

    /**
     * @param amazonAddress
     */

    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * @return
     */

    public String getAmazonAddress() {
        return this.amazonAddress;
    }

    /**
     * @param amazonAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
        return this;
    }

    /**
     * @param customerAddress
     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return
     */

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    /**
     * @param customerAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * @param addressFamily
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * @return
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * @param addressFamily
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public NewPrivateVirtualInterface withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * @param addressFamily
     * @see AddressFamily
     */

    public void setAddressFamily(AddressFamily addressFamily) {
        withAddressFamily(addressFamily);
    }

    /**
     * @param addressFamily
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public NewPrivateVirtualInterface withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * @param virtualGatewayId
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * @return
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * @param virtualGatewayId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * @param directConnectGatewayId
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * @return
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * @param directConnectGatewayId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPrivateVirtualInterface withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId()).append(",");
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewPrivateVirtualInterface == false)
            return false;
        NewPrivateVirtualInterface other = (NewPrivateVirtualInterface) obj;
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
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
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
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public NewPrivateVirtualInterface clone() {
        try {
            return (NewPrivateVirtualInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.NewPrivateVirtualInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
