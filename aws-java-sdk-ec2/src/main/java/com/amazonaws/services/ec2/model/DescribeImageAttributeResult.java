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

/**
 * 
 */
public class DescribeImageAttributeResult implements Serializable {

    /**
     * Information about the image attribute.
     */
    private ImageAttribute imageAttribute;

    /**
     * Information about the image attribute.
     *
     * @return Information about the image attribute.
     */
    public ImageAttribute getImageAttribute() {
        return imageAttribute;
    }
    
    /**
     * Information about the image attribute.
     *
     * @param imageAttribute Information about the image attribute.
     */
    public void setImageAttribute(ImageAttribute imageAttribute) {
        this.imageAttribute = imageAttribute;
    }
    
    /**
     * Information about the image attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageAttribute Information about the image attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImageAttributeResult withImageAttribute(ImageAttribute imageAttribute) {
        this.imageAttribute = imageAttribute;
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
        if (getImageAttribute() != null) sb.append("ImageAttribute: " + getImageAttribute() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageAttribute() == null) ? 0 : getImageAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImageAttributeResult == false) return false;
        DescribeImageAttributeResult other = (DescribeImageAttributeResult)obj;
        
        if (other.getImageAttribute() == null ^ this.getImageAttribute() == null) return false;
        if (other.getImageAttribute() != null && other.getImageAttribute().equals(this.getImageAttribute()) == false) return false; 
        return true;
    }
    
}
    