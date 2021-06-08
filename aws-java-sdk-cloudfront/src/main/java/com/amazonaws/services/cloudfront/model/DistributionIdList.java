/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of distribution IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DistributionIdList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributionIdList implements Serializable, Cloneable {

    /**
     * <p>
     * The value provided in the <code>Marker</code> request field.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Contains the value that you should use in the <code>Marker</code> field of a subsequent request to continue
     * listing distribution IDs where you left off.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of distribution IDs requested.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can
     * make a subsequent request using the <code>Marker</code> request field to retrieve more distribution IDs in the
     * list.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * The total number of distribution IDs returned in the response.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * Contains the distribution IDs in the list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * The value provided in the <code>Marker</code> request field.
     * </p>
     * 
     * @param marker
     *        The value provided in the <code>Marker</code> request field.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The value provided in the <code>Marker</code> request field.
     * </p>
     * 
     * @return The value provided in the <code>Marker</code> request field.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The value provided in the <code>Marker</code> request field.
     * </p>
     * 
     * @param marker
     *        The value provided in the <code>Marker</code> request field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Contains the value that you should use in the <code>Marker</code> field of a subsequent request to continue
     * listing distribution IDs where you left off.
     * </p>
     * 
     * @param nextMarker
     *        Contains the value that you should use in the <code>Marker</code> field of a subsequent request to
     *        continue listing distribution IDs where you left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * Contains the value that you should use in the <code>Marker</code> field of a subsequent request to continue
     * listing distribution IDs where you left off.
     * </p>
     * 
     * @return Contains the value that you should use in the <code>Marker</code> field of a subsequent request to
     *         continue listing distribution IDs where you left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * Contains the value that you should use in the <code>Marker</code> field of a subsequent request to continue
     * listing distribution IDs where you left off.
     * </p>
     * 
     * @param nextMarker
     *        Contains the value that you should use in the <code>Marker</code> field of a subsequent request to
     *        continue listing distribution IDs where you left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of distribution IDs requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of distribution IDs requested.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of distribution IDs requested.
     * </p>
     * 
     * @return The maximum number of distribution IDs requested.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of distribution IDs requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of distribution IDs requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can
     * make a subsequent request using the <code>Marker</code> request field to retrieve more distribution IDs in the
     * list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated,
     *        you can make a subsequent request using the <code>Marker</code> request field to retrieve more
     *        distribution IDs in the list.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can
     * make a subsequent request using the <code>Marker</code> request field to retrieve more distribution IDs in the
     * list.
     * </p>
     * 
     * @return A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated,
     *         you can make a subsequent request using the <code>Marker</code> request field to retrieve more
     *         distribution IDs in the list.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can
     * make a subsequent request using the <code>Marker</code> request field to retrieve more distribution IDs in the
     * list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated,
     *        you can make a subsequent request using the <code>Marker</code> request field to retrieve more
     *        distribution IDs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can
     * make a subsequent request using the <code>Marker</code> request field to retrieve more distribution IDs in the
     * list.
     * </p>
     * 
     * @return A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated,
     *         you can make a subsequent request using the <code>Marker</code> request field to retrieve more
     *         distribution IDs in the list.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * The total number of distribution IDs returned in the response.
     * </p>
     * 
     * @param quantity
     *        The total number of distribution IDs returned in the response.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The total number of distribution IDs returned in the response.
     * </p>
     * 
     * @return The total number of distribution IDs returned in the response.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The total number of distribution IDs returned in the response.
     * </p>
     * 
     * @param quantity
     *        The total number of distribution IDs returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * Contains the distribution IDs in the list.
     * </p>
     * 
     * @return Contains the distribution IDs in the list.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * Contains the distribution IDs in the list.
     * </p>
     * 
     * @param items
     *        Contains the distribution IDs in the list.
     */

    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<String>(items);
    }

    /**
     * <p>
     * Contains the distribution IDs in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Contains the distribution IDs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the distribution IDs in the list.
     * </p>
     * 
     * @param items
     *        Contains the distribution IDs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionIdList withItems(java.util.Collection<String> items) {
        setItems(items);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributionIdList == false)
            return false;
        DistributionIdList other = (DistributionIdList) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public DistributionIdList clone() {
        try {
            return (DistributionIdList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
