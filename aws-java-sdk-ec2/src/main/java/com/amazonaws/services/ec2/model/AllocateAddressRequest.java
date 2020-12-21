/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AllocateAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AllocateAddressRequest> {

    /**
     * <p>
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * </p>
     * <p>
     * Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default is
     * <code>vpc</code>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address
     * pool. To specify a specific address from the address pool, use the <code>Address</code> parameter instead.
     * </p>
     */
    private String publicIpv4Pool;
    /**
     * <p>
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses. Use
     * this parameter to limit the IP address to this location. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     * DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will
     * receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     * </p>
     * </note>
     */
    private String networkBorderGroup;
    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the address
     * pool. Alternatively, specify a specific address from the address pool.
     * </p>
     */
    private String customerOwnedIpv4Pool;
    /**
     * <p>
     * The tags to assign to the Elastic IP address.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * </p>
     * <p>
     * Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default is
     * <code>vpc</code>.
     * </p>
     * 
     * @param domain
     *        Indicates whether the Elastic IP address is for use with instances in a VPC or instances in
     *        EC2-Classic.</p>
     *        <p>
     *        Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default
     *        is <code>vpc</code>.
     * @see DomainType
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * </p>
     * <p>
     * Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default is
     * <code>vpc</code>.
     * </p>
     * 
     * @return Indicates whether the Elastic IP address is for use with instances in a VPC or instances in
     *         EC2-Classic.</p>
     *         <p>
     *         Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default
     *         is <code>vpc</code>.
     * @see DomainType
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * </p>
     * <p>
     * Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default is
     * <code>vpc</code>.
     * </p>
     * 
     * @param domain
     *        Indicates whether the Elastic IP address is for use with instances in a VPC or instances in
     *        EC2-Classic.</p>
     *        <p>
     *        Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default
     *        is <code>vpc</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public AllocateAddressRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * </p>
     * <p>
     * Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default is
     * <code>vpc</code>.
     * </p>
     * 
     * @param domain
     *        Indicates whether the Elastic IP address is for use with instances in a VPC or instances in
     *        EC2-Classic.</p>
     *        <p>
     *        Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default
     *        is <code>vpc</code>.
     * @see DomainType
     */

    public void setDomain(DomainType domain) {
        withDomain(domain);
    }

    /**
     * <p>
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * </p>
     * <p>
     * Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default is
     * <code>vpc</code>.
     * </p>
     * 
     * @param domain
     *        Indicates whether the Elastic IP address is for use with instances in a VPC or instances in
     *        EC2-Classic.</p>
     *        <p>
     *        Default: If the Region supports EC2-Classic, the default is <code>standard</code>. Otherwise, the default
     *        is <code>vpc</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public AllocateAddressRequest withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     * </p>
     * 
     * @param address
     *        [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     * </p>
     * 
     * @return [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     * </p>
     * 
     * @param address
     *        [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address
     * pool. To specify a specific address from the address pool, use the <code>Address</code> parameter instead.
     * </p>
     * 
     * @param publicIpv4Pool
     *        The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the
     *        address pool. To specify a specific address from the address pool, use the <code>Address</code> parameter
     *        instead.
     */

    public void setPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address
     * pool. To specify a specific address from the address pool, use the <code>Address</code> parameter instead.
     * </p>
     * 
     * @return The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the
     *         address pool. To specify a specific address from the address pool, use the <code>Address</code> parameter
     *         instead.
     */

    public String getPublicIpv4Pool() {
        return this.publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address
     * pool. To specify a specific address from the address pool, use the <code>Address</code> parameter instead.
     * </p>
     * 
     * @param publicIpv4Pool
     *        The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the
     *        address pool. To specify a specific address from the address pool, use the <code>Address</code> parameter
     *        instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withPublicIpv4Pool(String publicIpv4Pool) {
        setPublicIpv4Pool(publicIpv4Pool);
        return this;
    }

    /**
     * <p>
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses. Use
     * this parameter to limit the IP address to this location. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     * DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will
     * receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     * </p>
     * </note>
     * 
     * @param networkBorderGroup
     *        A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     *        addresses. Use this parameter to limit the IP address to this location. IP addresses cannot move between
     *        network border groups.</p>
     *        <p>
     *        Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     *        DescribeAvailabilityZones</a> to view the network border groups.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you
     *        will receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     *        </p>
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses. Use
     * this parameter to limit the IP address to this location. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     * DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will
     * receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     * </p>
     * </note>
     * 
     * @return A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     *         addresses. Use this parameter to limit the IP address to this location. IP addresses cannot move between
     *         network border groups.</p>
     *         <p>
     *         Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     *         DescribeAvailabilityZones</a> to view the network border groups.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you
     *         will receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     *         </p>
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses. Use
     * this parameter to limit the IP address to this location. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     * DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will
     * receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     * </p>
     * </note>
     * 
     * @param networkBorderGroup
     *        A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP
     *        addresses. Use this parameter to limit the IP address to this location. IP addresses cannot move between
     *        network border groups.</p>
     *        <p>
     *        Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">
     *        DescribeAvailabilityZones</a> to view the network border groups.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you
     *        will receive an <code>InvalidParameterCombination</code> error. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the address
     * pool. Alternatively, specify a specific address from the address pool.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the
     *        address pool. Alternatively, specify a specific address from the address pool.
     */

    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the address
     * pool. Alternatively, specify a specific address from the address pool.
     * </p>
     * 
     * @return The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the
     *         address pool. Alternatively, specify a specific address from the address pool.
     */

    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the address
     * pool. Alternatively, specify a specific address from the address pool.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the
     *        address pool. Alternatively, specify a specific address from the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        setCustomerOwnedIpv4Pool(customerOwnedIpv4Pool);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Elastic IP address.
     * </p>
     * 
     * @return The tags to assign to the Elastic IP address.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the Elastic IP address.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Elastic IP address.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to assign to the Elastic IP address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Elastic IP address.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AllocateAddressRequest> getDryRunRequest() {
        Request<AllocateAddressRequest> request = new AllocateAddressRequestMarshaller().marshall(this);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getPublicIpv4Pool() != null)
            sb.append("PublicIpv4Pool: ").append(getPublicIpv4Pool()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup()).append(",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: ").append(getCustomerOwnedIpv4Pool()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateAddressRequest == false)
            return false;
        AllocateAddressRequest other = (AllocateAddressRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPublicIpv4Pool() == null ^ this.getPublicIpv4Pool() == null)
            return false;
        if (other.getPublicIpv4Pool() != null && other.getPublicIpv4Pool().equals(this.getPublicIpv4Pool()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public AllocateAddressRequest clone() {
        return (AllocateAddressRequest) super.clone();
    }
}
