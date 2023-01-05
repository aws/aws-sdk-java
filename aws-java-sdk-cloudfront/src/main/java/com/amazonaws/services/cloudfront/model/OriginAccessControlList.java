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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of CloudFront origin access controls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginAccessControlList" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginAccessControlList implements Serializable, Cloneable {

    /**
     * <p>
     * The value of the <code>Marker</code> field that was provided in the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value to
     * use in the <code>Marker</code> field of another request to continue listing origin access controls.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of origin access controls requested.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * If there are more items in the list than are in this response, this value is <code>true</code>.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * The number of origin access controls returned in the response.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * Contains the origin access controls in the list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OriginAccessControlSummary> items;

    /**
     * <p>
     * The value of the <code>Marker</code> field that was provided in the request.
     * </p>
     * 
     * @param marker
     *        The value of the <code>Marker</code> field that was provided in the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The value of the <code>Marker</code> field that was provided in the request.
     * </p>
     * 
     * @return The value of the <code>Marker</code> field that was provided in the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The value of the <code>Marker</code> field that was provided in the request.
     * </p>
     * 
     * @param marker
     *        The value of the <code>Marker</code> field that was provided in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value to
     * use in the <code>Marker</code> field of another request to continue listing origin access controls.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value to use in the <code>Marker</code> field of another request to continue listing origin access
     *        controls.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value to
     * use in the <code>Marker</code> field of another request to continue listing origin access controls.
     * </p>
     * 
     * @return If there are more items in the list than are in this response, this element is present. It contains the
     *         value to use in the <code>Marker</code> field of another request to continue listing origin access
     *         controls.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value to
     * use in the <code>Marker</code> field of another request to continue listing origin access controls.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value to use in the <code>Marker</code> field of another request to continue listing origin access
     *        controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of origin access controls requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of origin access controls requested.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of origin access controls requested.
     * </p>
     * 
     * @return The maximum number of origin access controls requested.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of origin access controls requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of origin access controls requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this value is <code>true</code>.
     * </p>
     * 
     * @param isTruncated
     *        If there are more items in the list than are in this response, this value is <code>true</code>.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this value is <code>true</code>.
     * </p>
     * 
     * @return If there are more items in the list than are in this response, this value is <code>true</code>.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this value is <code>true</code>.
     * </p>
     * 
     * @param isTruncated
     *        If there are more items in the list than are in this response, this value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this value is <code>true</code>.
     * </p>
     * 
     * @return If there are more items in the list than are in this response, this value is <code>true</code>.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * The number of origin access controls returned in the response.
     * </p>
     * 
     * @param quantity
     *        The number of origin access controls returned in the response.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of origin access controls returned in the response.
     * </p>
     * 
     * @return The number of origin access controls returned in the response.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of origin access controls returned in the response.
     * </p>
     * 
     * @param quantity
     *        The number of origin access controls returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * Contains the origin access controls in the list.
     * </p>
     * 
     * @return Contains the origin access controls in the list.
     */

    public java.util.List<OriginAccessControlSummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<OriginAccessControlSummary>();
        }
        return items;
    }

    /**
     * <p>
     * Contains the origin access controls in the list.
     * </p>
     * 
     * @param items
     *        Contains the origin access controls in the list.
     */

    public void setItems(java.util.Collection<OriginAccessControlSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<OriginAccessControlSummary>(items);
    }

    /**
     * <p>
     * Contains the origin access controls in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Contains the origin access controls in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withItems(OriginAccessControlSummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<OriginAccessControlSummary>(items.length));
        }
        for (OriginAccessControlSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the origin access controls in the list.
     * </p>
     * 
     * @param items
     *        Contains the origin access controls in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControlList withItems(java.util.Collection<OriginAccessControlSummary> items) {
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

        if (obj instanceof OriginAccessControlList == false)
            return false;
        OriginAccessControlList other = (OriginAccessControlList) obj;
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
    public OriginAccessControlList clone() {
        try {
            return (OriginAccessControlList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
