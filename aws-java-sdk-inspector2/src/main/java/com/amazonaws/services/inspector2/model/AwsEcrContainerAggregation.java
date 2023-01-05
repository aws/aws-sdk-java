/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An aggregation of information about Amazon ECR containers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AwsEcrContainerAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrContainerAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The architecture of the containers.
     * </p>
     */
    private java.util.List<StringFilter> architectures;
    /**
     * <p>
     * The image SHA values.
     * </p>
     */
    private java.util.List<StringFilter> imageShas;
    /**
     * <p>
     * The image tags.
     * </p>
     */
    private java.util.List<StringFilter> imageTags;
    /**
     * <p>
     * The container repositories.
     * </p>
     */
    private java.util.List<StringFilter> repositories;
    /**
     * <p>
     * The container resource IDs.
     * </p>
     */
    private java.util.List<StringFilter> resourceIds;
    /**
     * <p>
     * The value to sort by.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order (ascending or descending).
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The architecture of the containers.
     * </p>
     * 
     * @return The architecture of the containers.
     */

    public java.util.List<StringFilter> getArchitectures() {
        return architectures;
    }

    /**
     * <p>
     * The architecture of the containers.
     * </p>
     * 
     * @param architectures
     *        The architecture of the containers.
     */

    public void setArchitectures(java.util.Collection<StringFilter> architectures) {
        if (architectures == null) {
            this.architectures = null;
            return;
        }

        this.architectures = new java.util.ArrayList<StringFilter>(architectures);
    }

    /**
     * <p>
     * The architecture of the containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitectures(java.util.Collection)} or {@link #withArchitectures(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param architectures
     *        The architecture of the containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withArchitectures(StringFilter... architectures) {
        if (this.architectures == null) {
            setArchitectures(new java.util.ArrayList<StringFilter>(architectures.length));
        }
        for (StringFilter ele : architectures) {
            this.architectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The architecture of the containers.
     * </p>
     * 
     * @param architectures
     *        The architecture of the containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withArchitectures(java.util.Collection<StringFilter> architectures) {
        setArchitectures(architectures);
        return this;
    }

    /**
     * <p>
     * The image SHA values.
     * </p>
     * 
     * @return The image SHA values.
     */

    public java.util.List<StringFilter> getImageShas() {
        return imageShas;
    }

    /**
     * <p>
     * The image SHA values.
     * </p>
     * 
     * @param imageShas
     *        The image SHA values.
     */

    public void setImageShas(java.util.Collection<StringFilter> imageShas) {
        if (imageShas == null) {
            this.imageShas = null;
            return;
        }

        this.imageShas = new java.util.ArrayList<StringFilter>(imageShas);
    }

    /**
     * <p>
     * The image SHA values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageShas(java.util.Collection)} or {@link #withImageShas(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageShas
     *        The image SHA values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withImageShas(StringFilter... imageShas) {
        if (this.imageShas == null) {
            setImageShas(new java.util.ArrayList<StringFilter>(imageShas.length));
        }
        for (StringFilter ele : imageShas) {
            this.imageShas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The image SHA values.
     * </p>
     * 
     * @param imageShas
     *        The image SHA values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withImageShas(java.util.Collection<StringFilter> imageShas) {
        setImageShas(imageShas);
        return this;
    }

    /**
     * <p>
     * The image tags.
     * </p>
     * 
     * @return The image tags.
     */

    public java.util.List<StringFilter> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The image tags.
     * </p>
     * 
     * @param imageTags
     *        The image tags.
     */

    public void setImageTags(java.util.Collection<StringFilter> imageTags) {
        if (imageTags == null) {
            this.imageTags = null;
            return;
        }

        this.imageTags = new java.util.ArrayList<StringFilter>(imageTags);
    }

    /**
     * <p>
     * The image tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTags(java.util.Collection)} or {@link #withImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageTags
     *        The image tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withImageTags(StringFilter... imageTags) {
        if (this.imageTags == null) {
            setImageTags(new java.util.ArrayList<StringFilter>(imageTags.length));
        }
        for (StringFilter ele : imageTags) {
            this.imageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The image tags.
     * </p>
     * 
     * @param imageTags
     *        The image tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withImageTags(java.util.Collection<StringFilter> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The container repositories.
     * </p>
     * 
     * @return The container repositories.
     */

    public java.util.List<StringFilter> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * The container repositories.
     * </p>
     * 
     * @param repositories
     *        The container repositories.
     */

    public void setRepositories(java.util.Collection<StringFilter> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<StringFilter>(repositories);
    }

    /**
     * <p>
     * The container repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositories(java.util.Collection)} or {@link #withRepositories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param repositories
     *        The container repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withRepositories(StringFilter... repositories) {
        if (this.repositories == null) {
            setRepositories(new java.util.ArrayList<StringFilter>(repositories.length));
        }
        for (StringFilter ele : repositories) {
            this.repositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container repositories.
     * </p>
     * 
     * @param repositories
     *        The container repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withRepositories(java.util.Collection<StringFilter> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * The container resource IDs.
     * </p>
     * 
     * @return The container resource IDs.
     */

    public java.util.List<StringFilter> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The container resource IDs.
     * </p>
     * 
     * @param resourceIds
     *        The container resource IDs.
     */

    public void setResourceIds(java.util.Collection<StringFilter> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<StringFilter>(resourceIds);
    }

    /**
     * <p>
     * The container resource IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The container resource IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withResourceIds(StringFilter... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<StringFilter>(resourceIds.length));
        }
        for (StringFilter ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container resource IDs.
     * </p>
     * 
     * @param resourceIds
     *        The container resource IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregation withResourceIds(java.util.Collection<StringFilter> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The value to sort by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort by.
     * @see AwsEcrContainerSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value to sort by.
     * </p>
     * 
     * @return The value to sort by.
     * @see AwsEcrContainerSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value to sort by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsEcrContainerSortBy
     */

    public AwsEcrContainerAggregation withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value to sort by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsEcrContainerSortBy
     */

    public AwsEcrContainerAggregation withSortBy(AwsEcrContainerSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The sort order (ascending or descending).
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order (ascending or descending).
     * </p>
     * 
     * @return The sort order (ascending or descending).
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The sort order (ascending or descending).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public AwsEcrContainerAggregation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The sort order (ascending or descending).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public AwsEcrContainerAggregation withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getArchitectures() != null)
            sb.append("Architectures: ").append(getArchitectures()).append(",");
        if (getImageShas() != null)
            sb.append("ImageShas: ").append(getImageShas()).append(",");
        if (getImageTags() != null)
            sb.append("ImageTags: ").append(getImageTags()).append(",");
        if (getRepositories() != null)
            sb.append("Repositories: ").append(getRepositories()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcrContainerAggregation == false)
            return false;
        AwsEcrContainerAggregation other = (AwsEcrContainerAggregation) obj;
        if (other.getArchitectures() == null ^ this.getArchitectures() == null)
            return false;
        if (other.getArchitectures() != null && other.getArchitectures().equals(this.getArchitectures()) == false)
            return false;
        if (other.getImageShas() == null ^ this.getImageShas() == null)
            return false;
        if (other.getImageShas() != null && other.getImageShas().equals(this.getImageShas()) == false)
            return false;
        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getRepositories() == null ^ this.getRepositories() == null)
            return false;
        if (other.getRepositories() != null && other.getRepositories().equals(this.getRepositories()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitectures() == null) ? 0 : getArchitectures().hashCode());
        hashCode = prime * hashCode + ((getImageShas() == null) ? 0 : getImageShas().hashCode());
        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getRepositories() == null) ? 0 : getRepositories().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcrContainerAggregation clone() {
        try {
            return (AwsEcrContainerAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AwsEcrContainerAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
