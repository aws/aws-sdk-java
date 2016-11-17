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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeProductAsAdminResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed product view information.
     * </p>
     */
    private ProductViewDetail productViewDetail;
    /**
     * <p>
     * Tags associated with the product.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Detailed product view information.
     * </p>
     * 
     * @param productViewDetail
     *        Detailed product view information.
     */

    public void setProductViewDetail(ProductViewDetail productViewDetail) {
        this.productViewDetail = productViewDetail;
    }

    /**
     * <p>
     * Detailed product view information.
     * </p>
     * 
     * @return Detailed product view information.
     */

    public ProductViewDetail getProductViewDetail() {
        return this.productViewDetail;
    }

    /**
     * <p>
     * Detailed product view information.
     * </p>
     * 
     * @param productViewDetail
     *        Detailed product view information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withProductViewDetail(ProductViewDetail productViewDetail) {
        setProductViewDetail(productViewDetail);
        return this;
    }

    /**
     * <p>
     * Tags associated with the product.
     * </p>
     * 
     * @return Tags associated with the product.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the product.
     * </p>
     * 
     * @param tags
     *        Tags associated with the product.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with the product.
     * </p>
     * 
     * @param tags
     *        Tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getProductViewDetail() != null)
            sb.append("ProductViewDetail: " + getProductViewDetail() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductAsAdminResult == false)
            return false;
        DescribeProductAsAdminResult other = (DescribeProductAsAdminResult) obj;
        if (other.getProductViewDetail() == null ^ this.getProductViewDetail() == null)
            return false;
        if (other.getProductViewDetail() != null && other.getProductViewDetail().equals(this.getProductViewDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductViewDetail() == null) ? 0 : getProductViewDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProductAsAdminResult clone() {
        try {
            return (DescribeProductAsAdminResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
