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
import com.amazonaws.services.ec2.model.transform.ResetNetworkInterfaceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest) ResetNetworkInterfaceAttribute operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest)
 */
public class ResetNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ResetNetworkInterfaceAttributeRequest> {

    private String networkInterfaceId;

    private String sourceDestCheck;

    /**
     * Returns the value of the NetworkInterfaceId property for this object.
     *
     * @return The value of the NetworkInterfaceId property for this object.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * Sets the value of the NetworkInterfaceId property for this object.
     *
     * @param networkInterfaceId The new value for the NetworkInterfaceId property for this object.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * Sets the value of the NetworkInterfaceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The new value for the NetworkInterfaceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * Returns the value of the SourceDestCheck property for this object.
     *
     * @return The value of the SourceDestCheck property for this object.
     */
    public String getSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Sets the value of the SourceDestCheck property for this object.
     *
     * @param sourceDestCheck The new value for the SourceDestCheck property for this object.
     */
    public void setSourceDestCheck(String sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Sets the value of the SourceDestCheck property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck The new value for the SourceDestCheck property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetNetworkInterfaceAttributeRequest withSourceDestCheck(String sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ResetNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<ResetNetworkInterfaceAttributeRequest> request = new ResetNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getSourceDestCheck() != null) sb.append("SourceDestCheck: " + getSourceDestCheck() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetNetworkInterfaceAttributeRequest == false) return false;
        ResetNetworkInterfaceAttributeRequest other = (ResetNetworkInterfaceAttributeRequest)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null) return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false) return false; 
        return true;
    }
    
}
    