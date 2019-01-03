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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a customer gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CustomerGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     */
    private String bgpAsn;
    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     */
    private String customerGatewayId;
    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside interface.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     * </p>
     */
    private String state;
    /**
     * <p>
     * The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     * </p>
     */
    private String type;
    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * 
     * @param bgpAsn
     *        The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     */

    public void setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * 
     * @return The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     */

    public String getBgpAsn() {
        return this.bgpAsn;
    }

    /**
     * <p>
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * 
     * @param bgpAsn
     *        The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withBgpAsn(String bgpAsn) {
        setBgpAsn(bgpAsn);
        return this;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @return The ID of the customer gateway.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside interface.
     * </p>
     * 
     * @param ipAddress
     *        The Internet-routable IP address of the customer gateway's outside interface.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside interface.
     * </p>
     * 
     * @return The Internet-routable IP address of the customer gateway's outside interface.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the customer gateway's outside interface.
     * </p>
     * 
     * @param ipAddress
     *        The Internet-routable IP address of the customer gateway's outside interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     * </p>
     * 
     * @param state
     *        The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     * </p>
     * 
     * @return The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     * </p>
     * 
     * @param state
     *        The current state of the customer gateway (<code>pending | available | deleting | deleted</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @return The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     * </p>
     * 
     * @param type
     *        The type of VPN connection the customer gateway supports (<code>ipsec.1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     * 
     * @return Any tags assigned to the customer gateway.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the customer gateway.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the customer gateway.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerGateway withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getBgpAsn() != null)
            sb.append("BgpAsn: ").append(getBgpAsn()).append(",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerGateway == false)
            return false;
        CustomerGateway other = (CustomerGateway) obj;
        if (other.getBgpAsn() == null ^ this.getBgpAsn() == null)
            return false;
        if (other.getBgpAsn() != null && other.getBgpAsn().equals(this.getBgpAsn()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgpAsn() == null) ? 0 : getBgpAsn().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CustomerGateway clone() {
        try {
            return (CustomerGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
