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

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListCACertificatesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private Integer pageSize;

    private String marker;

    private Boolean ascendingOrder;

    /**
     * @param pageSize
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @param pageSize
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCACertificatesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

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

    public ListCACertificatesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @param ascendingOrder
     */

    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * @return
     */

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * @param ascendingOrder
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCACertificatesRequest withAscendingOrder(Boolean ascendingOrder) {
        setAscendingOrder(ascendingOrder);
        return this;
    }

    /**
     * @return
     */

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
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
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getAscendingOrder() != null)
            sb.append("AscendingOrder: " + getAscendingOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCACertificatesRequest == false)
            return false;
        ListCACertificatesRequest other = (ListCACertificatesRequest) obj;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null
                && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAscendingOrder() == null
                ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null
                && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getAscendingOrder() == null) ? 0 : getAscendingOrder()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ListCACertificatesRequest clone() {
        return (ListCACertificatesRequest) super.clone();
    }
}