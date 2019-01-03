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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssignIpv6AddressesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignIpv6AddressesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AssignIpv6AddressesRequest> {

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     */
    private Integer ipv6AddressCount;
    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're
     * specifying a number of IPv6 addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipv6Addresses;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     * 
     * @param ipv6AddressCount
     *        The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6
     *        addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     */

    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     * 
     * @return The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the
     *         IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     */

    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * <p>
     * The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6
     * addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * </p>
     * 
     * @param ipv6AddressCount
     *        The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6
     *        addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignIpv6AddressesRequest withIpv6AddressCount(Integer ipv6AddressCount) {
        setIpv6AddressCount(ipv6AddressCount);
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're
     * specifying a number of IPv6 addresses.
     * </p>
     * 
     * @return One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if
     *         you're specifying a number of IPv6 addresses.
     */

    public java.util.List<String> getIpv6Addresses() {
        if (ipv6Addresses == null) {
            ipv6Addresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipv6Addresses;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're
     * specifying a number of IPv6 addresses.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if
     *        you're specifying a number of IPv6 addresses.
     */

    public void setIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new com.amazonaws.internal.SdkInternalList<String>(ipv6Addresses);
    }

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're
     * specifying a number of IPv6 addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Addresses(java.util.Collection)} or {@link #withIpv6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if
     *        you're specifying a number of IPv6 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignIpv6AddressesRequest withIpv6Addresses(String... ipv6Addresses) {
        if (this.ipv6Addresses == null) {
            setIpv6Addresses(new com.amazonaws.internal.SdkInternalList<String>(ipv6Addresses.length));
        }
        for (String ele : ipv6Addresses) {
            this.ipv6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're
     * specifying a number of IPv6 addresses.
     * </p>
     * 
     * @param ipv6Addresses
     *        One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if
     *        you're specifying a number of IPv6 addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignIpv6AddressesRequest withIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignIpv6AddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssignIpv6AddressesRequest> getDryRunRequest() {
        Request<AssignIpv6AddressesRequest> request = new AssignIpv6AddressesRequestMarshaller().marshall(this);
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
        if (getIpv6AddressCount() != null)
            sb.append("Ipv6AddressCount: ").append(getIpv6AddressCount()).append(",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: ").append(getIpv6Addresses()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignIpv6AddressesRequest == false)
            return false;
        AssignIpv6AddressesRequest other = (AssignIpv6AddressesRequest) obj;
        if (other.getIpv6AddressCount() == null ^ this.getIpv6AddressCount() == null)
            return false;
        if (other.getIpv6AddressCount() != null && other.getIpv6AddressCount().equals(this.getIpv6AddressCount()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6AddressCount() == null) ? 0 : getIpv6AddressCount().hashCode());
        hashCode = prime * hashCode + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public AssignIpv6AddressesRequest clone() {
        return (AssignIpv6AddressesRequest) super.clone();
    }
}
