/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * A simple result wrapper around the ImageAttribute object that was sent over the wire.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes an image attribute.
     * </p>
     */
    private ImageAttribute imageAttribute;

    /**
     * <p>
     * Describes an image attribute.
     * </p>
     * 
     * @param imageAttribute
     *        Describes an image attribute.
     */

    public void setImageAttribute(ImageAttribute imageAttribute) {
        this.imageAttribute = imageAttribute;
    }

    /**
     * <p>
     * Describes an image attribute.
     * </p>
     * 
     * @return Describes an image attribute.
     */

    public ImageAttribute getImageAttribute() {
        return this.imageAttribute;
    }

    /**
     * <p>
     * Describes an image attribute.
     * </p>
     * 
     * @param imageAttribute
     *        Describes an image attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageAttributeResult withImageAttribute(ImageAttribute imageAttribute) {
        setImageAttribute(imageAttribute);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageAttribute() != null)
            sb.append("ImageAttribute: ").append(getImageAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageAttributeResult == false)
            return false;
        DescribeImageAttributeResult other = (DescribeImageAttributeResult) obj;
        if (other.getImageAttribute() == null ^ this.getImageAttribute() == null)
            return false;
        if (other.getImageAttribute() != null && other.getImageAttribute().equals(this.getImageAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageAttribute() == null) ? 0 : getImageAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageAttributeResult clone() {
        try {
            return (DescribeImageAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
