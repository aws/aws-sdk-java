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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductAsAdmin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductAsAdminResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the product view.
     * </p>
     */
    private ProductViewDetail productViewDetail;
    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for the specified product.
     * </p>
     */
    private java.util.List<ProvisioningArtifactSummary> provisioningArtifactSummaries;
    /**
     * <p>
     * Information about the tags associated with the product.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     */
    private java.util.List<TagOptionDetail> tagOptions;

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

    public DescribeProductAsAdminResult withProductViewDetail(ProductViewDetail productViewDetail) {
        setProductViewDetail(productViewDetail);
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @return Information about the provisioning artifacts (also known as versions) for the specified product.
     */

    public java.util.List<ProvisioningArtifactSummary> getProvisioningArtifactSummaries() {
        return provisioningArtifactSummaries;
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @param provisioningArtifactSummaries
     *        Information about the provisioning artifacts (also known as versions) for the specified product.
     */

    public void setProvisioningArtifactSummaries(java.util.Collection<ProvisioningArtifactSummary> provisioningArtifactSummaries) {
        if (provisioningArtifactSummaries == null) {
            this.provisioningArtifactSummaries = null;
            return;
        }

        this.provisioningArtifactSummaries = new java.util.ArrayList<ProvisioningArtifactSummary>(provisioningArtifactSummaries);
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifactSummaries(java.util.Collection)} or
     * {@link #withProvisioningArtifactSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifactSummaries
     *        Information about the provisioning artifacts (also known as versions) for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withProvisioningArtifactSummaries(ProvisioningArtifactSummary... provisioningArtifactSummaries) {
        if (this.provisioningArtifactSummaries == null) {
            setProvisioningArtifactSummaries(new java.util.ArrayList<ProvisioningArtifactSummary>(provisioningArtifactSummaries.length));
        }
        for (ProvisioningArtifactSummary ele : provisioningArtifactSummaries) {
            this.provisioningArtifactSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @param provisioningArtifactSummaries
     *        Information about the provisioning artifacts (also known as versions) for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withProvisioningArtifactSummaries(java.util.Collection<ProvisioningArtifactSummary> provisioningArtifactSummaries) {
        setProvisioningArtifactSummaries(provisioningArtifactSummaries);
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
     * Information about the tags associated with the product.
     * </p>
     * 
     * @param tags
     *        Information about the tags associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     * 
     * @return Information about the TagOptions associated with the product.
     */

    public java.util.List<TagOptionDetail> getTagOptions() {
        return tagOptions;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the product.
     */

    public void setTagOptions(java.util.Collection<TagOptionDetail> tagOptions) {
        if (tagOptions == null) {
            this.tagOptions = null;
            return;
        }

        this.tagOptions = new java.util.ArrayList<TagOptionDetail>(tagOptions);
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagOptions(java.util.Collection)} or {@link #withTagOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withTagOptions(TagOptionDetail... tagOptions) {
        if (this.tagOptions == null) {
            setTagOptions(new java.util.ArrayList<TagOptionDetail>(tagOptions.length));
        }
        for (TagOptionDetail ele : tagOptions) {
            this.tagOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the product.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductAsAdminResult withTagOptions(java.util.Collection<TagOptionDetail> tagOptions) {
        setTagOptions(tagOptions);
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
        if (getProvisioningArtifactSummaries() != null)
            sb.append("ProvisioningArtifactSummaries: ").append(getProvisioningArtifactSummaries()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTagOptions() != null)
            sb.append("TagOptions: ").append(getTagOptions());
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
        if (other.getProvisioningArtifactSummaries() == null ^ this.getProvisioningArtifactSummaries() == null)
            return false;
        if (other.getProvisioningArtifactSummaries() != null
                && other.getProvisioningArtifactSummaries().equals(this.getProvisioningArtifactSummaries()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTagOptions() == null ^ this.getTagOptions() == null)
            return false;
        if (other.getTagOptions() != null && other.getTagOptions().equals(this.getTagOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductViewDetail() == null) ? 0 : getProductViewDetail().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactSummaries() == null) ? 0 : getProvisioningArtifactSummaries().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTagOptions() == null) ? 0 : getTagOptions().hashCode());
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
