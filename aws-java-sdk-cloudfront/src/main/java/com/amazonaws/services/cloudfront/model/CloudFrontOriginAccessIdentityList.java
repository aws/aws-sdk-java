/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class CloudFrontOriginAccessIdentityList implements Serializable,
        Cloneable {

    private String marker;

    private String nextMarker;

    private Integer maxItems;

    private Boolean isTruncated;

    private Integer quantity;

    private com.amazonaws.internal.SdkInternalList<CloudFrontOriginAccessIdentitySummary> items;

    /**
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @return
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @param marker
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @param nextMarker
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * @return
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @param nextMarker
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * @param maxItems
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * @return
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * @param maxItems
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * @param isTruncated
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * @return
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @param isTruncated
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withIsTruncated(
            Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * @return
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @param quantity
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * @return
     */
    public java.util.List<CloudFrontOriginAccessIdentitySummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<CloudFrontOriginAccessIdentitySummary>();
        }
        return items;
    }

    /**
     * @param items
     */
    public void setItems(
            java.util.Collection<CloudFrontOriginAccessIdentitySummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<CloudFrontOriginAccessIdentitySummary>(
                items);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setItems(java.util.Collection)} or
     * {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withItems(
            CloudFrontOriginAccessIdentitySummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<CloudFrontOriginAccessIdentitySummary>(
                    items.length));
        }
        for (CloudFrontOriginAccessIdentitySummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * @param items
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withItems(
            java.util.Collection<CloudFrontOriginAccessIdentitySummary> items) {
        setItems(items);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getQuantity() != null)
            sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFrontOriginAccessIdentityList == false)
            return false;
        CloudFrontOriginAccessIdentityList other = (CloudFrontOriginAccessIdentityList) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null
                && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null
                && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode
                + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public CloudFrontOriginAccessIdentityList clone() {
        try {
            return (CloudFrontOriginAccessIdentityList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}