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
 * A structure containing information about a private virtual interface that will be provisioned on a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/NewPrivateVirtualInterfaceAllocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewPrivateVirtualInterfaceAllocation implements Serializable, Cloneable, StructuredPojo {

    private String virtualInterfaceName;

    private Integer vlan;

    private Integer asn;

    private String authKey;

    private String amazonAddress;

    private String addressFamily;

    private String customerAddress;

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

    public NewPrivateVirtualInterfaceAllocation withVirtualInterfaceName(String virtualInterfaceName) {
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

    public NewPrivateVirtualInterfaceAllocation withVlan(Integer vlan) {
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

    public NewPrivateVirtualInterfaceAllocation withAsn(Integer asn) {
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

    public NewPrivateVirtualInterfaceAllocation withAuthKey(String authKey) {
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

    public NewPrivateVirtualInterfaceAllocation withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
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

    public NewPrivateVirtualInterfaceAllocation withAddressFamily(String addressFamily) {
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

    public NewPrivateVirtualInterfaceAllocation withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
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

    public NewPrivateVirtualInterfaceAllocation withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
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
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: ").append(getCustomerAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewPrivateVirtualInterfaceAllocation == false)
            return false;
        NewPrivateVirtualInterfaceAllocation other = (NewPrivateVirtualInterfaceAllocation) obj;
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
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
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
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        return hashCode;
    }

    @Override
    public NewPrivateVirtualInterfaceAllocation clone() {
        try {
            return (NewPrivateVirtualInterfaceAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.NewPrivateVirtualInterfaceAllocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
