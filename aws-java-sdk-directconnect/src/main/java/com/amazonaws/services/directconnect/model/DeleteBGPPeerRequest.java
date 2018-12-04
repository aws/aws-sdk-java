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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DeleteBGPPeer operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBGPPeerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface from which the BGP peer will be deleted.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String virtualInterfaceId;

    private Integer asn;

    private String customerAddress;

    /**
     * <p>
     * The ID of the virtual interface from which the BGP peer will be deleted.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface from which the BGP peer will be deleted.</p>
     *        <p>
     *        Example: dxvif-456abc78
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface from which the BGP peer will be deleted.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the virtual interface from which the BGP peer will be deleted.</p>
     *         <p>
     *         Example: dxvif-456abc78
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface from which the BGP peer will be deleted.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface from which the BGP peer will be deleted.</p>
     *        <p>
     *        Example: dxvif-456abc78
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBGPPeerRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
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

    public DeleteBGPPeerRequest withAsn(Integer asn) {
        setAsn(asn);
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

    public DeleteBGPPeerRequest withCustomerAddress(String customerAddress) {
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
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

        if (obj instanceof DeleteBGPPeerRequest == false)
            return false;
        DeleteBGPPeerRequest other = (DeleteBGPPeerRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
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

        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBGPPeerRequest clone() {
        return (DeleteBGPPeerRequest) super.clone();
    }

}
