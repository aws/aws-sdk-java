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
        if (images == null) {
            this.images = null;
            return;
        }

        java.util.List<Image> imagesCopy = new java.util.ArrayList<Image>(images.size());
        imagesCopy.addAll(images);
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
        if (getImages() == null) setImages(new java.util.ArrayList<Image>(images.length));
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
        if (images == null) {
            this.images = null;
        } else {
            java.util.List<Image> imagesCopy = new java.util.ArrayList<Image>(images.size());
            imagesCopy.addAll(images);
            this.images = imagesCopy;
        }

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
        if (images != null) sb.append("Images: " + images + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImages() == null) ? 0 : getImages().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeImagesResult == false) return false;
        DescribeImagesResult other = (DescribeImagesResult)obj;
        
        if (other.getImages() == null ^ this.getImages() == null) return false;
        if (other.getImages() != null && other.getImages().equals(this.getImages()) == false) return false; 
        return true;
    }
    
}
    