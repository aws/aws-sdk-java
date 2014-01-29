/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DisassociateAddressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#disassociateAddress(DisassociateAddressRequest) DisassociateAddress operation}.
 * <p>
 * Disassociates an Elastic IP address from the instance or network interface it's associated with.
 * </p>
 * <p>
 * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#disassociateAddress(DisassociateAddressRequest)
 */
public class DisassociateAddressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DisassociateAddressRequest> {

    /**
     * [EC2-Classic] The Elastic IP address.
     */
    private String publicIp;

    /**
     * [EC2-VPC] The association ID.
     */
    private String associationId;

    /**
     * Default constructor for a new DisassociateAddressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DisassociateAddressRequest() {}
    
    /**
     * Constructs a new DisassociateAddressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param publicIp [EC2-Classic] The Elastic IP address.
     */
    public DisassociateAddressRequest(String publicIp) {
        setPublicIp(publicIp);
    }

    /**
     * [EC2-Classic] The Elastic IP address.
     *
     * @return [EC2-Classic] The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * [EC2-Classic] The Elastic IP address.
     *
     * @param publicIp [EC2-Classic] The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * [EC2-Classic] The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp [EC2-Classic] The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisassociateAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * [EC2-VPC] The association ID.
     *
     * @return [EC2-VPC] The association ID.
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * [EC2-VPC] The association ID.
     *
     * @param associationId [EC2-VPC] The association ID.
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * [EC2-VPC] The association ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId [EC2-VPC] The association ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisassociateAddressRequest withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DisassociateAddressRequest> getDryRunRequest() {
        Request<DisassociateAddressRequest> request = new DisassociateAddressRequestMarshaller().marshall(this);
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
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisassociateAddressRequest == false) return false;
        DisassociateAddressRequest other = (DisassociateAddressRequest)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        return true;
    }
    
}
    