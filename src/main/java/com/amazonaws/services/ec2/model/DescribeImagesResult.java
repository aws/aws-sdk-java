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
 * The result of describing <i>Amazon Machine Images</i> (AMIs).
 * </p>
 */
public class DescribeImagesResult {

    /**
     * The list of the described AMIs.
     */
    private java.util.List<Image> images;

    /**
     * The list of the described AMIs.
     *
     * @return The list of the described AMIs.
     */
    public java.util.List<Image> getImages() {
        if (images == null) {
            images = new java.util.ArrayList<Image>();
        }
        return images;
    }
    
    /**
     * The list of the described AMIs.
     *
     * @param images The list of the described AMIs.
     */
    public void setImages(java.util.Collection<Image> images) {
        java.util.List<Image> imagesCopy = new java.util.ArrayList<Image>();
        if (images != null) {
            imagesCopy.addAll(images);
        }
        this.images = imagesCopy;
    }
    
    /**
     * The list of the described AMIs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param images The list of the described AMIs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesResult withImages(Image... images) {
        for (Image value : images) {
            getImages().add(value);
        }
        return this;
    }
    
    /**
     * The list of the described AMIs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param images The list of the described AMIs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesResult withImages(java.util.Collection<Image> images) {
        java.util.List<Image> imagesCopy = new java.util.ArrayList<Image>();
        if (images != null) {
            imagesCopy.addAll(images);
        }
        this.images = imagesCopy;

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
        sb.append("Images: " + images + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    