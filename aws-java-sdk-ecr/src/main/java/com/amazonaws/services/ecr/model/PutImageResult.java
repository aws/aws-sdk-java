/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecr.model;

import java.io.Serializable;

/**
 * 
 */
public class PutImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the image uploaded.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * Details of the image uploaded.
     * </p>
     * 
     * @param image
     *        Details of the image uploaded.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * Details of the image uploaded.
     * </p>
     * 
     * @return Details of the image uploaded.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * Details of the image uploaded.
     * </p>
     * 
     * @param image
     *        Details of the image uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutImageResult withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImage() != null)
            sb.append("Image: " + getImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutImageResult == false)
            return false;
        PutImageResult other = (PutImageResult) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        return hashCode;
    }

    @Override
    public PutImageResult clone() {
        try {
            return (PutImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
