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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a RasterDataCollectionQueryInput containing AreaOfInterest, Time Range filter and Property filters.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/RasterDataCollectionQueryWithBandFilterInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RasterDataCollectionQueryWithBandFilterInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private AreaOfInterest areaOfInterest;
    /** <p/> */
    private java.util.List<String> bandFilter;
    /** <p/> */
    private PropertyFilters propertyFilters;
    /** <p/> */
    private TimeRangeFilterInput timeRangeFilter;

    /**
     * <p/>
     * 
     * @param areaOfInterest
     */

    public void setAreaOfInterest(AreaOfInterest areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public AreaOfInterest getAreaOfInterest() {
        return this.areaOfInterest;
    }

    /**
     * <p/>
     * 
     * @param areaOfInterest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryWithBandFilterInput withAreaOfInterest(AreaOfInterest areaOfInterest) {
        setAreaOfInterest(areaOfInterest);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getBandFilter() {
        return bandFilter;
    }

    /**
     * <p/>
     * 
     * @param bandFilter
     */

    public void setBandFilter(java.util.Collection<String> bandFilter) {
        if (bandFilter == null) {
            this.bandFilter = null;
            return;
        }

        this.bandFilter = new java.util.ArrayList<String>(bandFilter);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBandFilter(java.util.Collection)} or {@link #withBandFilter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bandFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryWithBandFilterInput withBandFilter(String... bandFilter) {
        if (this.bandFilter == null) {
            setBandFilter(new java.util.ArrayList<String>(bandFilter.length));
        }
        for (String ele : bandFilter) {
            this.bandFilter.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param bandFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryWithBandFilterInput withBandFilter(java.util.Collection<String> bandFilter) {
        setBandFilter(bandFilter);
        return this;
    }

    /**
     * <p/>
     * 
     * @param propertyFilters
     */

    public void setPropertyFilters(PropertyFilters propertyFilters) {
        this.propertyFilters = propertyFilters;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public PropertyFilters getPropertyFilters() {
        return this.propertyFilters;
    }

    /**
     * <p/>
     * 
     * @param propertyFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryWithBandFilterInput withPropertyFilters(PropertyFilters propertyFilters) {
        setPropertyFilters(propertyFilters);
        return this;
    }

    /**
     * <p/>
     * 
     * @param timeRangeFilter
     */

    public void setTimeRangeFilter(TimeRangeFilterInput timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public TimeRangeFilterInput getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    /**
     * <p/>
     * 
     * @param timeRangeFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryWithBandFilterInput withTimeRangeFilter(TimeRangeFilterInput timeRangeFilter) {
        setTimeRangeFilter(timeRangeFilter);
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
        if (getAreaOfInterest() != null)
            sb.append("AreaOfInterest: ").append(getAreaOfInterest()).append(",");
        if (getBandFilter() != null)
            sb.append("BandFilter: ").append(getBandFilter()).append(",");
        if (getPropertyFilters() != null)
            sb.append("PropertyFilters: ").append(getPropertyFilters()).append(",");
        if (getTimeRangeFilter() != null)
            sb.append("TimeRangeFilter: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RasterDataCollectionQueryWithBandFilterInput == false)
            return false;
        RasterDataCollectionQueryWithBandFilterInput other = (RasterDataCollectionQueryWithBandFilterInput) obj;
        if (other.getAreaOfInterest() == null ^ this.getAreaOfInterest() == null)
            return false;
        if (other.getAreaOfInterest() != null && other.getAreaOfInterest().equals(this.getAreaOfInterest()) == false)
            return false;
        if (other.getBandFilter() == null ^ this.getBandFilter() == null)
            return false;
        if (other.getBandFilter() != null && other.getBandFilter().equals(this.getBandFilter()) == false)
            return false;
        if (other.getPropertyFilters() == null ^ this.getPropertyFilters() == null)
            return false;
        if (other.getPropertyFilters() != null && other.getPropertyFilters().equals(this.getPropertyFilters()) == false)
            return false;
        if (other.getTimeRangeFilter() == null ^ this.getTimeRangeFilter() == null)
            return false;
        if (other.getTimeRangeFilter() != null && other.getTimeRangeFilter().equals(this.getTimeRangeFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAreaOfInterest() == null) ? 0 : getAreaOfInterest().hashCode());
        hashCode = prime * hashCode + ((getBandFilter() == null) ? 0 : getBandFilter().hashCode());
        hashCode = prime * hashCode + ((getPropertyFilters() == null) ? 0 : getPropertyFilters().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeFilter() == null) ? 0 : getTimeRangeFilter().hashCode());
        return hashCode;
    }

    @Override
    public RasterDataCollectionQueryWithBandFilterInput clone() {
        try {
            return (RasterDataCollectionQueryWithBandFilterInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.RasterDataCollectionQueryWithBandFilterInputMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
