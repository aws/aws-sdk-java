/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AssignPrivateIpAddressesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for AssignPrivateIpAddresses.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignPrivateIpAddressesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssignPrivateIpAddressesRequest> {

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be
     * reassigned to the specified network interface.
     * </p>
     */
    private Boolean allowReassignment;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify
     * this parameter when also specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> privateIpAddresses;
    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when
     * also specifying private IP addresses.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;
    /**
     * <p>
     * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     * <code>Ipv4PrefixCount</code> option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipv4Prefixes;
    /**
     * <p>
     * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot
     * use this option if you use the <code>Ipv4 Prefixes</code> option.
     * </p>
     */
    private Integer ipv4PrefixCount;

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be
     * reassigned to the specified network interface.
     * </p>
     * 
     * @param allowReassignment
     *        Indicates whether to allow an IP address that is already assigned to another network interface or instance
     *        to be reassigned to the specified network interface.
     */

    public void setAllowReassignment(Boolean allowReassignment) {
        this.allowReassignment = allowReassignment;
    }

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be
     * reassigned to the specified network interface.
     * </p>
     * 
     * @return Indicates whether to allow an IP address that is already assigned to another network interface or
     *         instance to be reassigned to the specified network interface.
     */

    public Boolean getAllowReassignment() {
        return this.allowReassignment;
    }

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be
     * reassigned to the specified network interface.
     * </p>
     * 
     * @param allowReassignment
     *        Indicates whether to allow an IP address that is already assigned to another network interface or instance
     *        to be reassigned to the specified network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withAllowReassignment(Boolean allowReassignment) {
        setAllowReassignment(allowReassignment);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be
     * reassigned to the specified network interface.
     * </p>
     * 
     * @return Indicates whether to allow an IP address that is already assigned to another network interface or
     *         instance to be reassigned to the specified network interface.
     */

    public Boolean isAllowReassignment() {
        return this.allowReassignment;
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

    public AssignPrivateIpAddressesRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify
     * this parameter when also specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
     * </p>
     * 
     * @return The IP addresses to be assigned as a secondary private IP address to the network interface. You can't
     *         specify this parameter when also specifying a number of secondary IP addresses.</p>
     *         <p>
     *         If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet
     *         range.
     */

    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * The IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify
     * this parameter when also specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
     * </p>
     * 
     * @param privateIpAddresses
     *        The IP addresses to be assigned as a secondary private IP address to the network interface. You can't
     *        specify this parameter when also specifying a number of secondary IP addresses.</p>
     *        <p>
     *        If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet
     *        range.
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
     * The IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify
     * this parameter when also specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        The IP addresses to be assigned as a secondary private IP address to the network interface. You can't
     *        specify this parameter when also specifying a number of secondary IP addresses.</p>
     *        <p>
     *        If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet
     *        range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withPrivateIpAddresses(String... privateIpAddresses) {
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
     * The IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify
     * this parameter when also specifying a number of secondary IP addresses.
     * </p>
     * <p>
     * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
     * </p>
     * 
     * @param privateIpAddresses
     *        The IP addresses to be assigned as a secondary private IP address to the network interface. You can't
     *        specify this parameter when also specifying a number of secondary IP addresses.</p>
     *        <p>
     *        If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet
     *        range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when
     * also specifying private IP addresses.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary IP addresses to assign to the network interface. You can't specify this parameter
     *        when also specifying private IP addresses.
     */

    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when
     * also specifying private IP addresses.
     * </p>
     * 
     * @return The number of secondary IP addresses to assign to the network interface. You can't specify this parameter
     *         when also specifying private IP addresses.
     */

    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when
     * also specifying private IP addresses.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary IP addresses to assign to the network interface. You can't specify this parameter
     *        when also specifying private IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        setSecondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount);
        return this;
    }

    /**
     * <p>
     * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     * <code>Ipv4PrefixCount</code> option.
     * </p>
     * 
     * @return One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     *         <code>Ipv4PrefixCount</code> option.
     */

    public java.util.List<String> getIpv4Prefixes() {
        if (ipv4Prefixes == null) {
            ipv4Prefixes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipv4Prefixes;
    }

    /**
     * <p>
     * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     * <code>Ipv4PrefixCount</code> option.
     * </p>
     * 
     * @param ipv4Prefixes
     *        One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     *        <code>Ipv4PrefixCount</code> option.
     */

    public void setIpv4Prefixes(java.util.Collection<String> ipv4Prefixes) {
        if (ipv4Prefixes == null) {
            this.ipv4Prefixes = null;
            return;
        }

        this.ipv4Prefixes = new com.amazonaws.internal.SdkInternalList<String>(ipv4Prefixes);
    }

    /**
     * <p>
     * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     * <code>Ipv4PrefixCount</code> option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv4Prefixes(java.util.Collection)} or {@link #withIpv4Prefixes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv4Prefixes
     *        One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     *        <code>Ipv4PrefixCount</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withIpv4Prefixes(String... ipv4Prefixes) {
        if (this.ipv4Prefixes == null) {
            setIpv4Prefixes(new com.amazonaws.internal.SdkInternalList<String>(ipv4Prefixes.length));
        }
        for (String ele : ipv4Prefixes) {
            this.ipv4Prefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     * <code>Ipv4PrefixCount</code> option.
     * </p>
     * 
     * @param ipv4Prefixes
     *        One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the
     *        <code>Ipv4PrefixCount</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withIpv4Prefixes(java.util.Collection<String> ipv4Prefixes) {
        setIpv4Prefixes(ipv4Prefixes);
        return this;
    }

    /**
     * <p>
     * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot
     * use this option if you use the <code>Ipv4 Prefixes</code> option.
     * </p>
     * 
     * @param ipv4PrefixCount
     *        The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You
     *        cannot use this option if you use the <code>Ipv4 Prefixes</code> option.
     */

    public void setIpv4PrefixCount(Integer ipv4PrefixCount) {
        this.ipv4PrefixCount = ipv4PrefixCount;
    }

    /**
     * <p>
     * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot
     * use this option if you use the <code>Ipv4 Prefixes</code> option.
     * </p>
     * 
     * @return The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You
     *         cannot use this option if you use the <code>Ipv4 Prefixes</code> option.
     */

    public Integer getIpv4PrefixCount() {
        return this.ipv4PrefixCount;
    }

    /**
     * <p>
     * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot
     * use this option if you use the <code>Ipv4 Prefixes</code> option.
     * </p>
     * 
     * @param ipv4PrefixCount
     *        The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You
     *        cannot use this option if you use the <code>Ipv4 Prefixes</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignPrivateIpAddressesRequest withIpv4PrefixCount(Integer ipv4PrefixCount) {
        setIpv4PrefixCount(ipv4PrefixCount);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssignPrivateIpAddressesRequest> getDryRunRequest() {
        Request<AssignPrivateIpAddressesRequest> request = new AssignPrivateIpAddressesRequestMarshaller().marshall(this);
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
        if (getAllowReassignment() != null)
            sb.append("AllowReassignment: ").append(getAllowReassignment()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: ").append(getSecondaryPrivateIpAddressCount()).append(",");
        if (getIpv4Prefixes() != null)
            sb.append("Ipv4Prefixes: ").append(getIpv4Prefixes()).append(",");
        if (getIpv4PrefixCount() != null)
            sb.append("Ipv4PrefixCount: ").append(getIpv4PrefixCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignPrivateIpAddressesRequest == false)
            return false;
        AssignPrivateIpAddressesRequest other = (AssignPrivateIpAddressesRequest) obj;
        if (other.getAllowReassignment() == null ^ this.getAllowReassignment() == null)
            return false;
        if (other.getAllowReassignment() != null && other.getAllowReassignment().equals(this.getAllowReassignment()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() == null ^ this.getSecondaryPrivateIpAddressCount() == null)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() != null
                && other.getSecondaryPrivateIpAddressCount().equals(this.getSecondaryPrivateIpAddressCount()) == false)
            return false;
        if (other.getIpv4Prefixes() == null ^ this.getIpv4Prefixes() == null)
            return false;
        if (other.getIpv4Prefixes() != null && other.getIpv4Prefixes().equals(this.getIpv4Prefixes()) == false)
            return false;
        if (other.getIpv4PrefixCount() == null ^ this.getIpv4PrefixCount() == null)
            return false;
        if (other.getIpv4PrefixCount() != null && other.getIpv4PrefixCount().equals(this.getIpv4PrefixCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowReassignment() == null) ? 0 : getAllowReassignment().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getIpv4Prefixes() == null) ? 0 : getIpv4Prefixes().hashCode());
        hashCode = prime * hashCode + ((getIpv4PrefixCount() == null) ? 0 : getIpv4PrefixCount().hashCode());
        return hashCode;
    }

    @Override
    public AssignPrivateIpAddressesRequest clone() {
        return (AssignPrivateIpAddressesRequest) super.clone();
    }
}
