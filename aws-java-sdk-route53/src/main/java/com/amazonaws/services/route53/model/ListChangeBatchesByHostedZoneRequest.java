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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a ListChangeBatchesByHostedZone request.
 * </p>
 */
public class ListChangeBatchesByHostedZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that you want to see changes for.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The start of the time period you want to see changes for.
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The end of the time period you want to see changes for.
     * </p>
     */
    private String endDate;
    /**
     * <p>
     * The maximum number of items on a page.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * The page marker.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The ID of the hosted zone that you want to see changes for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want to see changes for.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to see changes for.
     * </p>
     * 
     * @return The ID of the hosted zone that you want to see changes for.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to see changes for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want to see changes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The start of the time period you want to see changes for.
     * </p>
     * 
     * @param startDate
     *        The start of the time period you want to see changes for.
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start of the time period you want to see changes for.
     * </p>
     * 
     * @return The start of the time period you want to see changes for.
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start of the time period you want to see changes for.
     * </p>
     * 
     * @param startDate
     *        The start of the time period you want to see changes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneRequest withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The end of the time period you want to see changes for.
     * </p>
     * 
     * @param endDate
     *        The end of the time period you want to see changes for.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end of the time period you want to see changes for.
     * </p>
     * 
     * @return The end of the time period you want to see changes for.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end of the time period you want to see changes for.
     * </p>
     * 
     * @param endDate
     *        The end of the time period you want to see changes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneRequest withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The maximum number of items on a page.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items on a page.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of items on a page.
     * </p>
     * 
     * @return The maximum number of items on a page.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of items on a page.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items on a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The page marker.
     * </p>
     * 
     * @param marker
     *        The page marker.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The page marker.
     * </p>
     * 
     * @return The page marker.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The page marker.
     * </p>
     * 
     * @param marker
     *        The page marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeBatchesByHostedZoneRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChangeBatchesByHostedZoneRequest == false)
            return false;
        ListChangeBatchesByHostedZoneRequest other = (ListChangeBatchesByHostedZoneRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListChangeBatchesByHostedZoneRequest clone() {
        return (ListChangeBatchesByHostedZoneRequest) super.clone();
    }
}
