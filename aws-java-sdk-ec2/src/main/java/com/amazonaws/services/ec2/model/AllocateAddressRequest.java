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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AllocateAddressRequestMarshaller;

/**
 * <p>
 * Contains the parameters for AllocateAddress.
 * </p>
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
     * [EC2-VPC] The Elastic IP address to recover.
     * </p>
     */
    private String address;

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
     * [EC2-VPC] The Elastic IP address to recover.
     * </p>
     * 
     * @param address
     *        [EC2-VPC] The Elastic IP address to recover.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover.
     * </p>
     * 
     * @return [EC2-VPC] The Elastic IP address to recover.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover.
     * </p>
     * 
     * @param address
     *        [EC2-VPC] The Elastic IP address to recover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateAddressRequest withAddress(String address) {
        setAddress(address);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return hashCode;
    }

    @Override
    public AllocateAddressRequest clone() {
        return (AllocateAddressRequest) super.clone();
    }
}
