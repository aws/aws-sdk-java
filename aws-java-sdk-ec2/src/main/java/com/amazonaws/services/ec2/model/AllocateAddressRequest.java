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
import com.amazonaws.services.ec2.model.transform.AllocateAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AllocateAddressRequest> {

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
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
     * Set to <code>vpc</code> to allocate the address for use with instances in a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * 
     * @param domain
     *        Set to <code>vpc</code> to allocate the address for use with instances in a VPC.</p>
     *        <p>
     *        Default: The address is for use with instances in EC2-Classic.
     * @see DomainType
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * 
     * @return Set to <code>vpc</code> to allocate the address for use with instances in a VPC.</p>
     *         <p>
     *         Default: The address is for use with instances in EC2-Classic.
     * @see DomainType
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * 
     * @param domain
     *        Set to <code>vpc</code> to allocate the address for use with instances in a VPC.</p>
     *        <p>
     *        Default: The address is for use with instances in EC2-Classic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public AllocateAddressRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * 
     * @param domain
     *        Set to <code>vpc</code> to allocate the address for use with instances in a VPC.</p>
     *        <p>
     *        Default: The address is for use with instances in EC2-Classic.
     * @see DomainType
     */

    public void setDomain(DomainType domain) {
        withDomain(domain);
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * 
     * @param domain
     *        Set to <code>vpc</code> to allocate the address for use with instances in a VPC.</p>
     *        <p>
     *        Default: The address is for use with instances in EC2-Classic.
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
            sb.append("PublicIpv4Pool: ").append(getPublicIpv4Pool());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        return hashCode;
    }

    @Override
    public AllocateAddressRequest clone() {
        return (AllocateAddressRequest) super.clone();
    }
}
