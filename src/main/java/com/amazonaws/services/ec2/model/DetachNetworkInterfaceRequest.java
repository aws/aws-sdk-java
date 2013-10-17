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
import com.amazonaws.services.ec2.model.transform.DetachNetworkInterfaceRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#detachNetworkInterface(DetachNetworkInterfaceRequest) DetachNetworkInterface operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#detachNetworkInterface(DetachNetworkInterfaceRequest)
 */
public class DetachNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DetachNetworkInterfaceRequest> {

    private String attachmentId;

    private Boolean force;

    /**
     * Returns the value of the AttachmentId property for this object.
     *
     * @return The value of the AttachmentId property for this object.
     */
    public String getAttachmentId() {
        return attachmentId;
    }
    
    /**
     * Sets the value of the AttachmentId property for this object.
     *
     * @param attachmentId The new value for the AttachmentId property for this object.
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
    
    /**
     * Sets the value of the AttachmentId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentId The new value for the AttachmentId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachNetworkInterfaceRequest withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * Returns the value of the Force property for this object.
     *
     * @return The value of the Force property for this object.
     */
    public Boolean isForce() {
        return force;
    }
    
    /**
     * Sets the value of the Force property for this object.
     *
     * @param force The new value for the Force property for this object.
     */
    public void setForce(Boolean force) {
        this.force = force;
    }
    
    /**
     * Sets the value of the Force property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force The new value for the Force property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachNetworkInterfaceRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Returns the value of the Force property for this object.
     *
     * @return The value of the Force property for this object.
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DetachNetworkInterfaceRequest> getDryRunRequest() {
        Request<DetachNetworkInterfaceRequest> request = new DetachNetworkInterfaceRequestMarshaller().marshall(this);
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
        if (getAttachmentId() != null) sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (isForce() != null) sb.append("Force: " + isForce() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode()); 
        hashCode = prime * hashCode + ((isForce() == null) ? 0 : isForce().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachNetworkInterfaceRequest == false) return false;
        DetachNetworkInterfaceRequest other = (DetachNetworkInterfaceRequest)obj;
        
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null) return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false) return false; 
        if (other.isForce() == null ^ this.isForce() == null) return false;
        if (other.isForce() != null && other.isForce().equals(this.isForce()) == false) return false; 
        return true;
    }
    
}
    