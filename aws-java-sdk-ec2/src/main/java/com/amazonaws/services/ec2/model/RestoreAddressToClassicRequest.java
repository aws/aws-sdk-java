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
import com.amazonaws.services.ec2.model.transform.RestoreAddressToClassicRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#restoreAddressToClassic(RestoreAddressToClassicRequest) RestoreAddressToClassic operation}.
 * <p>
 * Restores an Elastic IP address that was previously moved to the
 * EC2-VPC platform back to the EC2-Classic platform. You cannot move an
 * Elastic IP address that was originally allocated for use in EC2-VPC.
 * The Elastic IP address must not be associated with an instance or
 * network interface.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#restoreAddressToClassic(RestoreAddressToClassicRequest)
 */
public class RestoreAddressToClassicRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RestoreAddressToClassicRequest> {

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
    public RestoreAddressToClassicRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RestoreAddressToClassicRequest> getDryRunRequest() {
        Request<RestoreAddressToClassicRequest> request = new RestoreAddressToClassicRequestMarshaller().marshall(this);
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

        if (obj instanceof RestoreAddressToClassicRequest == false) return false;
        RestoreAddressToClassicRequest other = (RestoreAddressToClassicRequest)obj;
        
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreAddressToClassicRequest clone() {
        
            return (RestoreAddressToClassicRequest) super.clone();
    }

}
    