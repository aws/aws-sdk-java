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
 * The details that define an aggregation based on container image layers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ImageLayerAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageLayerAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hashes associated with the layers.
     * </p>
     */
    private java.util.List<StringFilter> layerHashes;
    /**
     * <p>
     * The repository associated with the container image hosting the layers.
     * </p>
     */
    private java.util.List<StringFilter> repositories;
    /**
     * <p>
     * The ID of the container image layer.
     * </p>
     */
    private java.util.List<StringFilter> resourceIds;
    /**
     * <p>
     * The value to sort results by.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order to sort results by.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The hashes associated with the layers.
     * </p>
     * 
     * @return The hashes associated with the layers.
     */

    public java.util.List<StringFilter> getLayerHashes() {
        return layerHashes;
    }

    /**
     * <p>
     * The hashes associated with the layers.
     * </p>
     * 
     * @param layerHashes
     *        The hashes associated with the layers.
     */

    public void setLayerHashes(java.util.Collection<StringFilter> layerHashes) {
        if (layerHashes == null) {
            this.layerHashes = null;
            return;
        }

        this.layerHashes = new java.util.ArrayList<StringFilter>(layerHashes);
    }

    /**
     * <p>
     * The hashes associated with the layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerHashes(java.util.Collection)} or {@link #withLayerHashes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param layerHashes
     *        The hashes associated with the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregation withLayerHashes(StringFilter... layerHashes) {
        if (this.layerHashes == null) {
            setLayerHashes(new java.util.ArrayList<StringFilter>(layerHashes.length));
        }
        for (StringFilter ele : layerHashes) {
            this.layerHashes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hashes associated with the layers.
     * </p>
     * 
     * @param layerHashes
     *        The hashes associated with the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregation withLayerHashes(java.util.Collection<StringFilter> layerHashes) {
        setLayerHashes(layerHashes);
        return this;
    }

    /**
     * <p>
     * The repository associated with the container image hosting the layers.
     * </p>
     * 
     * @return The repository associated with the container image hosting the layers.
     */

    public java.util.List<StringFilter> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * The repository associated with the container image hosting the layers.
     * </p>
     * 
     * @param repositories
     *        The repository associated with the container image hosting the layers.
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
     * The repository associated with the container image hosting the layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositories(java.util.Collection)} or {@link #withRepositories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param repositories
     *        The repository associated with the container image hosting the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregation withRepositories(StringFilter... repositories) {
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
     * The repository associated with the container image hosting the layers.
     * </p>
     * 
     * @param repositories
     *        The repository associated with the container image hosting the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregation withRepositories(java.util.Collection<StringFilter> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * The ID of the container image layer.
     * </p>
     * 
     * @return The ID of the container image layer.
     */

    public java.util.List<StringFilter> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The ID of the container image layer.
     * </p>
     * 
     * @param resourceIds
     *        The ID of the container image layer.
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
     * The ID of the container image layer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The ID of the container image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregation withResourceIds(StringFilter... resourceIds) {
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
     * The ID of the container image layer.
     * </p>
     * 
     * @param resourceIds
     *        The ID of the container image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregation withResourceIds(java.util.Collection<StringFilter> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @see ImageLayerSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @return The value to sort results by.
     * @see ImageLayerSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageLayerSortBy
     */

    public ImageLayerAggregation withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageLayerSortBy
     */

    public ImageLayerAggregation withSortBy(ImageLayerSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @return The order to sort results by.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ImageLayerAggregation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ImageLayerAggregation withSortOrder(SortOrder sortOrder) {
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
        if (getLayerHashes() != null)
            sb.append("LayerHashes: ").append(getLayerHashes()).append(",");
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

        if (obj instanceof ImageLayerAggregation == false)
            return false;
        ImageLayerAggregation other = (ImageLayerAggregation) obj;
        if (other.getLayerHashes() == null ^ this.getLayerHashes() == null)
            return false;
        if (other.getLayerHashes() != null && other.getLayerHashes().equals(this.getLayerHashes()) == false)
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

        hashCode = prime * hashCode + ((getLayerHashes() == null) ? 0 : getLayerHashes().hashCode());
        hashCode = prime * hashCode + ((getRepositories() == null) ? 0 : getRepositories().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ImageLayerAggregation clone() {
        try {
            return (ImageLayerAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ImageLayerAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
