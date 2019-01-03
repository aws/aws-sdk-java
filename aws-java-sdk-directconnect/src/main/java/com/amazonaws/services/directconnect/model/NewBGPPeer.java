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
 * Information about a new BGP peer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/NewBGPPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewBGPPeer implements Serializable, Cloneable, StructuredPojo {

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
     * The address family for the BGP peer.
     * </p>
     */
    private String addressFamily;
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

    public NewBGPPeer withAsn(Integer asn) {
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

    public NewBGPPeer withAuthKey(String authKey) {
        setAuthKey(authKey);
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

    public NewBGPPeer withAddressFamily(String addressFamily) {
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

    public NewBGPPeer withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
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

    public NewBGPPeer withAmazonAddress(String amazonAddress) {
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

    public NewBGPPeer withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
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
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
        if (getAuthKey() != null)
            sb.append("AuthKey: ").append(getAuthKey()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: ").append(getAmazonAddress()).append(",");
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

        if (obj instanceof NewBGPPeer == false)
            return false;
        NewBGPPeer other = (NewBGPPeer) obj;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
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

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        return hashCode;
    }

    @Override
    public NewBGPPeer clone() {
        try {
            return (NewBGPPeer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.NewBGPPeerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
