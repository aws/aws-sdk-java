/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateNetworkInterfaceRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateNetworkInterface.
 * </p>
 */
public class CreateNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateNetworkInterfaceRequest> {

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * A description for the network interface.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2 selects
     * one for you from the subnet range. If you specify an IP address, you cannot indicate any IP addresses specified
     * in <code>privateIpAddresses</code> as primary (only one IP address can be designated as primary).
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * One or more private IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> privateIpAddresses;
    /**
     * <p>
     * The number of secondary private IP addresses to assign to a network interface. When you specify a number of
     * secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't specify this
     * option and specify more than one private IP address using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies by instance type. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     * Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet to associate with the network interface.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     * 
     * @return The ID of the subnet to associate with the network interface.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to associate with the network interface.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet to associate with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @return A description for the network interface.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2 selects
     * one for you from the subnet range. If you specify an IP address, you cannot indicate any IP addresses specified
     * in <code>privateIpAddresses</code> as primary (only one IP address can be designated as primary).
     * </p>
     * 
     * @param privateIpAddress
     *        The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2
     *        selects one for you from the subnet range. If you specify an IP address, you cannot indicate any IP
     *        addresses specified in <code>privateIpAddresses</code> as primary (only one IP address can be designated
     *        as primary).
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2 selects
     * one for you from the subnet range. If you specify an IP address, you cannot indicate any IP addresses specified
     * in <code>privateIpAddresses</code> as primary (only one IP address can be designated as primary).
     * </p>
     * 
     * @return The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2
     *         selects one for you from the subnet range. If you specify an IP address, you cannot indicate any IP
     *         addresses specified in <code>privateIpAddresses</code> as primary (only one IP address can be designated
     *         as primary).
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2 selects
     * one for you from the subnet range. If you specify an IP address, you cannot indicate any IP addresses specified
     * in <code>privateIpAddresses</code> as primary (only one IP address can be designated as primary).
     * </p>
     * 
     * @param privateIpAddress
     *        The primary private IP address of the network interface. If you don't specify an IP address, Amazon EC2
     *        selects one for you from the subnet range. If you specify an IP address, you cannot indicate any IP
     *        addresses specified in <code>privateIpAddresses</code> as primary (only one IP address can be designated
     *        as primary).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @return The IDs of one or more security groups.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @param groups
     *        The IDs of one or more security groups.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<String>(groups);
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The IDs of one or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups.
     * </p>
     * 
     * @param groups
     *        The IDs of one or more security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * One or more private IP addresses.
     * </p>
     * 
     * @return One or more private IP addresses.
     */

    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IP addresses.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IP addresses.
     */

    public void setPrivateIpAddresses(java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>(privateIpAddresses);
    }

    /**
     * <p>
     * One or more private IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withPrivateIpAddresses(PrivateIpAddressSpecification... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>(privateIpAddresses.length));
        }
        for (PrivateIpAddressSpecification ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IP addresses.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withPrivateIpAddresses(java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IP addresses to assign to a network interface. When you specify a number of
     * secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't specify this
     * option and specify more than one private IP address using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies by instance type. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     * Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IP addresses to assign to a network interface. When you specify a number
     *        of secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't
     *        specify this option and specify more than one private IP address using <code>privateIpAddresses</code>
     *        .</p>
     *        <p>
     *        The number of IP addresses you can assign to a network interface varies by instance type. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     *        Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IP addresses to assign to a network interface. When you specify a number of
     * secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't specify this
     * option and specify more than one private IP address using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies by instance type. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     * Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The number of secondary private IP addresses to assign to a network interface. When you specify a number
     *         of secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't
     *         specify this option and specify more than one private IP address using <code>privateIpAddresses</code>
     *         .</p>
     *         <p>
     *         The number of IP addresses you can assign to a network interface varies by instance type. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     *         Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IP addresses to assign to a network interface. When you specify a number of
     * secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't specify this
     * option and specify more than one private IP address using <code>privateIpAddresses</code>.
     * </p>
     * <p>
     * The number of IP addresses you can assign to a network interface varies by instance type. For more information,
     * see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     * Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IP addresses to assign to a network interface. When you specify a number
     *        of secondary IP addresses, Amazon EC2 selects these IP addresses within the subnet range. You can't
     *        specify this option and specify more than one private IP address using <code>privateIpAddresses</code>
     *        .</p>
     *        <p>
     *        The number of IP addresses you can assign to a network interface varies by instance type. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI">Private IP
     *        Addresses Per ENI Per Instance Type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceRequest withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        setSecondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkInterfaceRequest> getDryRunRequest() {
        Request<CreateNetworkInterfaceRequest> request = new CreateNetworkInterfaceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: " + getSecondaryPrivateIpAddressCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInterfaceRequest == false)
            return false;
        CreateNetworkInterfaceRequest other = (CreateNetworkInterfaceRequest) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getSecondaryPrivateIpAddressCount() == null) ? 0 : getSecondaryPrivateIpAddressCount().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInterfaceRequest clone() {
        return (CreateNetworkInterfaceRequest) super.clone();
    }
}
