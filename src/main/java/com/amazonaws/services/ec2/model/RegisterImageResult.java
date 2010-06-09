/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The result of registering a new Amazon Machine Image (AMI). Contains
 * the ID of the new image.
 * </p>
 */
public class RegisterImageResult {

    /**
     * The ID of the new Amazon Machine Image (AMI).
     */
    private String imageId;

    /**
     * The ID of the new Amazon Machine Image (AMI).
     *
     * @return The ID of the new Amazon Machine Image (AMI).
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the new Amazon Machine Image (AMI).
     *
     * @param imageId The ID of the new Amazon Machine Image (AMI).
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the new Amazon Machine Image (AMI).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the new Amazon Machine Image (AMI).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterImageResult withImageId(String imageId) {
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
        
        sb.append("ImageId: " + imageId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    