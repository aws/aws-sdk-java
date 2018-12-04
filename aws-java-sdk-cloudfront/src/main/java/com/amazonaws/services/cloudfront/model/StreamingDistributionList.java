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
 * A streaming distribution list.
 */
public class StreamingDistributionList implements Serializable, Cloneable {

    /** The value you provided for the Marker request parameter. */
    private String marker;
    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * streaming distributions where they left off.
     */
    private String nextMarker;
    /** The value you provided for the MaxItems request parameter. */
    private Integer maxItems;
    /**
     * A flag that indicates whether more streaming distributions remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the Marker request parameter to retrieve more
     * distributions in the list.
     */
    private Boolean isTruncated;
    /**
     * The number of streaming distributions that were created by the current
     * AWS account.
     */
    private Integer quantity;
    /**
     * A complex type that contains one StreamingDistributionSummary element for
     * each distribution that was created by the current AWS account.
     */
    private com.amazonaws.internal.SdkInternalList<StreamingDistributionSummary> items;

    /**
     * The value you provided for the Marker request parameter.
     * 
     * @param marker
     *        The value you provided for the Marker request parameter.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * The value you provided for the Marker request parameter.
     * 
     * @return The value you provided for the Marker request parameter.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * The value you provided for the Marker request parameter.
     * 
     * @param marker
     *        The value you provided for the Marker request parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * streaming distributions where they left off.
     * 
     * @param nextMarker
     *        If IsTruncated is true, this element is present and contains the
     *        value you can use for the Marker request parameter to continue
     *        listing your streaming distributions where they left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * streaming distributions where they left off.
     * 
     * @return If IsTruncated is true, this element is present and contains the
     *         value you can use for the Marker request parameter to continue
     *         listing your streaming distributions where they left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * streaming distributions where they left off.
     * 
     * @param nextMarker
     *        If IsTruncated is true, this element is present and contains the
     *        value you can use for the Marker request parameter to continue
     *        listing your streaming distributions where they left off.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * The value you provided for the MaxItems request parameter.
     * 
     * @param maxItems
     *        The value you provided for the MaxItems request parameter.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * The value you provided for the MaxItems request parameter.
     * 
     * @return The value you provided for the MaxItems request parameter.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * The value you provided for the MaxItems request parameter.
     * 
     * @param maxItems
     *        The value you provided for the MaxItems request parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * A flag that indicates whether more streaming distributions remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the Marker request parameter to retrieve more
     * distributions in the list.
     * 
     * @param isTruncated
     *        A flag that indicates whether more streaming distributions remain
     *        to be listed. If your results were truncated, you can make a
     *        follow-up pagination request using the Marker request parameter to
     *        retrieve more distributions in the list.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * A flag that indicates whether more streaming distributions remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the Marker request parameter to retrieve more
     * distributions in the list.
     * 
     * @return A flag that indicates whether more streaming distributions remain
     *         to be listed. If your results were truncated, you can make a
     *         follow-up pagination request using the Marker request parameter
     *         to retrieve more distributions in the list.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * A flag that indicates whether more streaming distributions remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the Marker request parameter to retrieve more
     * distributions in the list.
     * 
     * @param isTruncated
     *        A flag that indicates whether more streaming distributions remain
     *        to be listed. If your results were truncated, you can make a
     *        follow-up pagination request using the Marker request parameter to
     *        retrieve more distributions in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * A flag that indicates whether more streaming distributions remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the Marker request parameter to retrieve more
     * distributions in the list.
     * 
     * @return A flag that indicates whether more streaming distributions remain
     *         to be listed. If your results were truncated, you can make a
     *         follow-up pagination request using the Marker request parameter
     *         to retrieve more distributions in the list.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * The number of streaming distributions that were created by the current
     * AWS account.
     * 
     * @param quantity
     *        The number of streaming distributions that were created by the
     *        current AWS account.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * The number of streaming distributions that were created by the current
     * AWS account.
     * 
     * @return The number of streaming distributions that were created by the
     *         current AWS account.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * The number of streaming distributions that were created by the current
     * AWS account.
     * 
     * @param quantity
     *        The number of streaming distributions that were created by the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * A complex type that contains one StreamingDistributionSummary element for
     * each distribution that was created by the current AWS account.
     * 
     * @return A complex type that contains one StreamingDistributionSummary
     *         element for each distribution that was created by the current AWS
     *         account.
     */

    public java.util.List<StreamingDistributionSummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<StreamingDistributionSummary>();
        }
        return items;
    }

    /**
     * A complex type that contains one StreamingDistributionSummary element for
     * each distribution that was created by the current AWS account.
     * 
     * @param items
     *        A complex type that contains one StreamingDistributionSummary
     *        element for each distribution that was created by the current AWS
     *        account.
     */

    public void setItems(
            java.util.Collection<StreamingDistributionSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<StreamingDistributionSummary>(
                items);
    }

    /**
     * A complex type that contains one StreamingDistributionSummary element for
     * each distribution that was created by the current AWS account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setItems(java.util.Collection)} or
     * {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains one StreamingDistributionSummary
     *        element for each distribution that was created by the current AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withItems(
            StreamingDistributionSummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<StreamingDistributionSummary>(
                    items.length));
        }
        for (StreamingDistributionSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * A complex type that contains one StreamingDistributionSummary element for
     * each distribution that was created by the current AWS account.
     * 
     * @param items
     *        A complex type that contains one StreamingDistributionSummary
     *        element for each distribution that was created by the current AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamingDistributionList withItems(
            java.util.Collection<StreamingDistributionSummary> items) {
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

        if (obj instanceof StreamingDistributionList == false)
            return false;
        StreamingDistributionList other = (StreamingDistributionList) obj;
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
    public StreamingDistributionList clone() {
        try {
            return (StreamingDistributionList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
