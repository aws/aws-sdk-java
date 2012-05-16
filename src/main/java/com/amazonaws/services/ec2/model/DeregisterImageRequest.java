/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deregisterImage(DeregisterImageRequest) DeregisterImage operation}.
 * <p>
 * The DeregisterImage operation deregisters an AMI. Once deregistered, instances of the AMI can no longer be launched.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deregisterImage(DeregisterImageRequest)
 */
public class DeregisterImageRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the AMI to deregister.
     */
    private String imageId;

    /**
     * Default constructor for a new DeregisterImageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeregisterImageRequest() {}
    
    /**
     * Constructs a new DeregisterImageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId The ID of the AMI to deregister.
     */
    public DeregisterImageRequest(String imageId) {
        this.imageId = imageId;
    }

    
    
    /**
     * The ID of the AMI to deregister.
     *
     * @return The ID of the AMI to deregister.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI to deregister.
     *
     * @param imageId The ID of the AMI to deregister.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI to deregister.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI to deregister.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeregisterImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
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
        if (imageId != null) sb.append("ImageId: " + imageId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeregisterImageRequest == false) return false;
        DeregisterImageRequest other = (DeregisterImageRequest)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        return true;
    }
    
}
    