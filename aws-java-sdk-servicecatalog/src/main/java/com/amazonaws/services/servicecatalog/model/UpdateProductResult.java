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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProduct" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the product view.
     * </p>
     */
    private ProductViewDetail productViewDetail;
    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information about the product view.
     * </p>
     * 
     * @param productViewDetail
     *        Information about the product view.
     */

    public void setProductViewDetail(ProductViewDetail productViewDetail) {
        this.productViewDetail = productViewDetail;
    }

    /**
     * <p>
     * Information about the product view.
     * </p>
     * 
     * @return Information about the product view.
     */

    public ProductViewDetail getProductViewDetail() {
        return this.productViewDetail;
    }

    /**
     * <p>
     * Information about the product view.
     * </p>
     * 
     * @param productViewDetail
     *        Information about the product view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductResult withProductViewDetail(ProductViewDetail productViewDetail) {
        setProductViewDetail(productViewDetail);
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     * 
     * @return Information about the tags associated with the product.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the product.
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
     * Information about the tags associated with the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductResult withTags(Tag... tags) {
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
     * Information about the tags associated with the product.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProductResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getProductViewDetail() != null)
            sb.append("ProductViewDetail: ").append(getProductViewDetail()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProductResult == false)
            return false;
        UpdateProductResult other = (UpdateProductResult) obj;
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
    public UpdateProductResult clone() {
        try {
            return (UpdateProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
