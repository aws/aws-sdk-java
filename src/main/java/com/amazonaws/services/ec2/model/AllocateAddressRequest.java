/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AllocateAddressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#allocateAddress(AllocateAddressRequest) AllocateAddress operation}.
 * <p>
 * The AllocateAddress operation acquires an elastic IP address for use with your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#allocateAddress(AllocateAddressRequest)
 */
public class AllocateAddressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AllocateAddressRequest> {

    /**
     * Set to <code>vpc</code> to allocate the address to your VPC. By
     * default, will allocate to EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     */
    private String domain;

    /**
     * Set to <code>vpc</code> to allocate the address to your VPC. By
     * default, will allocate to EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @return Set to <code>vpc</code> to allocate the address to your VPC. By
     *         default, will allocate to EC2.
     *
     * @see DomainType
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * Set to <code>vpc</code> to allocate the address to your VPC. By
     * default, will allocate to EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Set to <code>vpc</code> to allocate the address to your VPC. By
     *         default, will allocate to EC2.
     *
     * @see DomainType
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * Set to <code>vpc</code> to allocate the address to your VPC. By
     * default, will allocate to EC2.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Set to <code>vpc</code> to allocate the address to your VPC. By
     *         default, will allocate to EC2.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DomainType
     */
    public AllocateAddressRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Set to <code>vpc</code> to allocate the address to your VPC. By
     * default, will allocate to EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Set to <code>vpc</code> to allocate the address to your VPC. By
     *         default, will allocate to EC2.
     *
     * @see DomainType
     */
    public void setDomain(DomainType domain) {
        this.domain = domain.toString();
    }
    
    /**
     * Set to <code>vpc</code> to allocate the address to your VPC. By
     * default, will allocate to EC2.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain Set to <code>vpc</code> to allocate the address to your VPC. By
     *         default, will allocate to EC2.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DomainType
     */
    public AllocateAddressRequest withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AllocateAddressRequest> getDryRunRequest() {
        Request<AllocateAddressRequest> request = new AllocateAddressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomain() != null) sb.append("Domain: " + getDomain() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllocateAddressRequest == false) return false;
        AllocateAddressRequest other = (AllocateAddressRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        return true;
    }
    
}
    