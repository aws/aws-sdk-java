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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing the response information for the request.
 * </p>
 */
@Deprecated
public class ListChangeBatchesByHostedZoneResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker
     * parameter in the request that produced the current response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A flag that indicates if there are more change batches to list.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * The change batches within the given hosted zone and time period.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ChangeBatchRecord> changeBatchRecords;
    /**
     * <p>
     * The next page marker.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHostedZones</code> that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code> parameter in the call to
     *         <code>ListHostedZones</code> that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHostedZones</code> that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker
     * parameter in the request that produced the current response.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the
     *        marker parameter in the request that produced the current response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker
     * parameter in the request that produced the current response.
     * </p>
     * 
     * @return For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the
     *         marker parameter in the request that produced the current response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker
     * parameter in the request that produced the current response.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the
     *        marker parameter in the request that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A flag that indicates if there are more change batches to list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates if there are more change batches to list.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates if there are more change batches to list.
     * </p>
     * 
     * @return A flag that indicates if there are more change batches to list.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates if there are more change batches to list.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates if there are more change batches to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates if there are more change batches to list.
     * </p>
     * 
     * @return A flag that indicates if there are more change batches to list.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * The change batches within the given hosted zone and time period.
     * </p>
     * 
     * @return The change batches within the given hosted zone and time period.
     */

    public java.util.List<ChangeBatchRecord> getChangeBatchRecords() {
        if (changeBatchRecords == null) {
            changeBatchRecords = new com.amazonaws.internal.SdkInternalList<ChangeBatchRecord>();
        }
        return changeBatchRecords;
    }

    /**
     * <p>
     * The change batches within the given hosted zone and time period.
     * </p>
     * 
     * @param changeBatchRecords
     *        The change batches within the given hosted zone and time period.
     */

    public void setChangeBatchRecords(java.util.Collection<ChangeBatchRecord> changeBatchRecords) {
        if (changeBatchRecords == null) {
            this.changeBatchRecords = null;
            return;
        }

        this.changeBatchRecords = new com.amazonaws.internal.SdkInternalList<ChangeBatchRecord>(changeBatchRecords);
    }

    /**
     * <p>
     * The change batches within the given hosted zone and time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeBatchRecords(java.util.Collection)} or {@link #withChangeBatchRecords(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param changeBatchRecords
     *        The change batches within the given hosted zone and time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneResult withChangeBatchRecords(ChangeBatchRecord... changeBatchRecords) {
        if (this.changeBatchRecords == null) {
            setChangeBatchRecords(new com.amazonaws.internal.SdkInternalList<ChangeBatchRecord>(changeBatchRecords.length));
        }
        for (ChangeBatchRecord ele : changeBatchRecords) {
            this.changeBatchRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The change batches within the given hosted zone and time period.
     * </p>
     * 
     * @param changeBatchRecords
     *        The change batches within the given hosted zone and time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneResult withChangeBatchRecords(java.util.Collection<ChangeBatchRecord> changeBatchRecords) {
        setChangeBatchRecords(changeBatchRecords);
        return this;
    }

    /**
     * <p>
     * The next page marker.
     * </p>
     * 
     * @param nextMarker
     *        The next page marker.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The next page marker.
     * </p>
     * 
     * @return The next page marker.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The next page marker.
     * </p>
     * 
     * @param nextMarker
     *        The next page marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getChangeBatchRecords() != null)
            sb.append("ChangeBatchRecords: " + getChangeBatchRecords() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChangeBatchesByHostedZoneResult == false)
            return false;
        ListChangeBatchesByHostedZoneResult other = (ListChangeBatchesByHostedZoneResult) obj;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getChangeBatchRecords() == null ^ this.getChangeBatchRecords() == null)
            return false;
        if (other.getChangeBatchRecords() != null && other.getChangeBatchRecords().equals(this.getChangeBatchRecords()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getChangeBatchRecords() == null) ? 0 : getChangeBatchRecords().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListChangeBatchesByHostedZoneResult clone() {
        try {
            return (ListChangeBatchesByHostedZoneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
