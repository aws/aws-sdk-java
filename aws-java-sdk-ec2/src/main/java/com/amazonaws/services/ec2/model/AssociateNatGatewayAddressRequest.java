/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssociateNatGatewayAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateNatGatewayAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateNatGatewayAddressRequest> {

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allocationIds;
    /**
     * <p>
     * The private IPv4 addresses that you want to assign to the NAT gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> privateIpAddresses;

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @return The ID of the NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNatGatewayAddressRequest withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * </p>
     * 
     * @return The allocation IDs of EIPs that you want to associate with your NAT gateway.
     */

    public java.util.List<String> getAllocationIds() {
        if (allocationIds == null) {
            allocationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allocationIds;
    }

    /**
     * <p>
     * The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * </p>
     * 
     * @param allocationIds
     *        The allocation IDs of EIPs that you want to associate with your NAT gateway.
     */

    public void setAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
            return;
        }

        this.allocationIds = new com.amazonaws.internal.SdkInternalList<String>(allocationIds);
    }

    /**
     * <p>
     * The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllocationIds(java.util.Collection)} or {@link #withAllocationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allocationIds
     *        The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNatGatewayAddressRequest withAllocationIds(String... allocationIds) {
        if (this.allocationIds == null) {
            setAllocationIds(new com.amazonaws.internal.SdkInternalList<String>(allocationIds.length));
        }
        for (String ele : allocationIds) {
            this.allocationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * </p>
     * 
     * @param allocationIds
     *        The allocation IDs of EIPs that you want to associate with your NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNatGatewayAddressRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        setAllocationIds(allocationIds);
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses that you want to assign to the NAT gateway.
     * </p>
     * 
     * @return The private IPv4 addresses that you want to assign to the NAT gateway.
     */

    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * The private IPv4 addresses that you want to assign to the NAT gateway.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses that you want to assign to the NAT gateway.
     */

    public void setPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>(privateIpAddresses);
    }

    /**
     * <p>
     * The private IPv4 addresses that you want to assign to the NAT gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses that you want to assign to the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNatGatewayAddressRequest withPrivateIpAddresses(String... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<String>(privateIpAddresses.length));
        }
        for (String ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses that you want to assign to the NAT gateway.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses that you want to assign to the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateNatGatewayAddressRequest withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateNatGatewayAddressRequest> getDryRunRequest() {
        Request<AssociateNatGatewayAddressRequest> request = new AssociateNatGatewayAddressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getAllocationIds() != null)
            sb.append("AllocationIds: ").append(getAllocationIds()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateNatGatewayAddressRequest == false)
            return false;
        AssociateNatGatewayAddressRequest other = (AssociateNatGatewayAddressRequest) obj;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null)
            return false;
        if (other.getAllocationIds() != null && other.getAllocationIds().equals(this.getAllocationIds()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getAllocationIds() == null) ? 0 : getAllocationIds().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public AssociateNatGatewayAddressRequest clone() {
        return (AssociateNatGatewayAddressRequest) super.clone();
    }
}
