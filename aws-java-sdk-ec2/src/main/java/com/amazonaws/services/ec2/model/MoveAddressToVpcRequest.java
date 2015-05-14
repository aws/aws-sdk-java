/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.MoveAddressToVpcRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#moveAddressToVpc(MoveAddressToVpcRequest) MoveAddressToVpc operation}.
 * <p>
 * Moves an Elastic IP address from the EC2-Classic platform to the
 * EC2-VPC platform. The Elastic IP address must be allocated to your
 * account, and it must not be associated with an instance. After the
 * Elastic IP address is moved, it is no longer available for use in the
 * EC2-Classic platform, unless you move it back using the
 * RestoreAddressToClassic request. You cannot move an Elastic IP address
 * that's allocated for use in the EC2-VPC platform to the EC2-Classic
 * platform.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#moveAddressToVpc(MoveAddressToVpcRequest)
 */
public class MoveAddressToVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<MoveAddressToVpcRequest> {

    /**
     * The Elastic IP address.
     */
    private String publicIp;

    /**
     * The Elastic IP address.
     *
     * @return The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The Elastic IP address.
     *
     * @param publicIp The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MoveAddressToVpcRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<MoveAddressToVpcRequest> getDryRunRequest() {
        Request<MoveAddressToVpcRequest> request = new MoveAddressToVpcRequestMarshaller().marshall(this);
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
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MoveAddressToVpcRequest == false) return false;
        MoveAddressToVpcRequest other = (MoveAddressToVpcRequest)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        return true;
    }
    
    @Override
    public MoveAddressToVpcRequest clone() {
        
            return (MoveAddressToVpcRequest) super.clone();
    }

}
    