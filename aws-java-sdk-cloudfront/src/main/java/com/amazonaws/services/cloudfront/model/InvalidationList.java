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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>InvalidationList</code> complex type describes the list of invalidation objects. For more information about
 * invalidation, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html">Invalidating Objects (Web
 * Distributions Only)</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/InvalidationList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidationList implements Serializable, Cloneable {

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you can use
     * for the <code>Marker</code> request parameter to continue listing your invalidation batches where they left off.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     * truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     * retrieve more invalidation batches in the list.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * The number of invalidation batches that were created by the current AWS account.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch created by
     * the current AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InvalidationSummary> items;

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     * 
     * @param marker
     *        The value that you provided for the <code>Marker</code> request parameter.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     * 
     * @return The value that you provided for the <code>Marker</code> request parameter.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The value that you provided for the <code>Marker</code> request parameter.
     * </p>
     * 
     * @param marker
     *        The value that you provided for the <code>Marker</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you can use
     * for the <code>Marker</code> request parameter to continue listing your invalidation batches where they left off.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you
     *        can use for the <code>Marker</code> request parameter to continue listing your invalidation batches where
     *        they left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you can use
     * for the <code>Marker</code> request parameter to continue listing your invalidation batches where they left off.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you
     *         can use for the <code>Marker</code> request parameter to continue listing your invalidation batches where
     *         they left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you can use
     * for the <code>Marker</code> request parameter to continue listing your invalidation batches where they left off.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value that you
     *        can use for the <code>Marker</code> request parameter to continue listing your invalidation batches where
     *        they left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     * 
     * @param maxItems
     *        The value that you provided for the <code>MaxItems</code> request parameter.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     * 
     * @return The value that you provided for the <code>MaxItems</code> request parameter.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you provided for the <code>MaxItems</code> request parameter.
     * </p>
     * 
     * @param maxItems
     *        The value that you provided for the <code>MaxItems</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     * truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     * retrieve more invalidation batches in the list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     *        truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     *        retrieve more invalidation batches in the list.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     * truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     * retrieve more invalidation batches in the list.
     * </p>
     * 
     * @return A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     *         truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     *         retrieve more invalidation batches in the list.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     * truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     * retrieve more invalidation batches in the list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     *        truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     *        retrieve more invalidation batches in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     * truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     * retrieve more invalidation batches in the list.
     * </p>
     * 
     * @return A flag that indicates whether more invalidation batch requests remain to be listed. If your results were
     *         truncated, you can make a follow-up pagination request using the <code>Marker</code> request parameter to
     *         retrieve more invalidation batches in the list.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * The number of invalidation batches that were created by the current AWS account.
     * </p>
     * 
     * @param quantity
     *        The number of invalidation batches that were created by the current AWS account.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of invalidation batches that were created by the current AWS account.
     * </p>
     * 
     * @return The number of invalidation batches that were created by the current AWS account.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of invalidation batches that were created by the current AWS account.
     * </p>
     * 
     * @param quantity
     *        The number of invalidation batches that were created by the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch created by
     * the current AWS account.
     * </p>
     * 
     * @return A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch
     *         created by the current AWS account.
     */

    public java.util.List<InvalidationSummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<InvalidationSummary>();
        }
        return items;
    }

    /**
     * <p>
     * A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch created by
     * the current AWS account.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch
     *        created by the current AWS account.
     */

    public void setItems(java.util.Collection<InvalidationSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<InvalidationSummary>(items);
    }

    /**
     * <p>
     * A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch created by
     * the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch
     *        created by the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withItems(InvalidationSummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<InvalidationSummary>(items.length));
        }
        for (InvalidationSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch created by
     * the current AWS account.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>InvalidationSummary</code> element for each invalidation batch
     *        created by the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidationList withItems(java.util.Collection<InvalidationSummary> items) {
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

        if (obj instanceof InvalidationList == false)
            return false;
        InvalidationList other = (InvalidationList) obj;
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
    public InvalidationList clone() {
        try {
            return (InvalidationList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
