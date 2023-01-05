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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/RasterDataCollectionQueryInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RasterDataCollectionQueryInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The area of interest being queried for the raster data collection.
     * </p>
     */
    private AreaOfInterest areaOfInterest;
    /** <p/> */
    private PropertyFilters propertyFilters;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     */
    private String rasterDataCollectionArn;
    /** <p/> */
    private TimeRangeFilterInput timeRangeFilter;

    /**
     * <p>
     * The area of interest being queried for the raster data collection.
     * </p>
     * 
     * @param areaOfInterest
     *        The area of interest being queried for the raster data collection.
     */

    public void setAreaOfInterest(AreaOfInterest areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }

    /**
     * <p>
     * The area of interest being queried for the raster data collection.
     * </p>
     * 
     * @return The area of interest being queried for the raster data collection.
     */

    public AreaOfInterest getAreaOfInterest() {
        return this.areaOfInterest;
    }

    /**
     * <p>
     * The area of interest being queried for the raster data collection.
     * </p>
     * 
     * @param areaOfInterest
     *        The area of interest being queried for the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryInput withAreaOfInterest(AreaOfInterest areaOfInterest) {
        setAreaOfInterest(areaOfInterest);
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

    public RasterDataCollectionQueryInput withPropertyFilters(PropertyFilters propertyFilters) {
        setPropertyFilters(propertyFilters);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @param rasterDataCollectionArn
     *        The Amazon Resource Name (ARN) of the raster data collection.
     */

    public void setRasterDataCollectionArn(String rasterDataCollectionArn) {
        this.rasterDataCollectionArn = rasterDataCollectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the raster data collection.
     */

    public String getRasterDataCollectionArn() {
        return this.rasterDataCollectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @param rasterDataCollectionArn
     *        The Amazon Resource Name (ARN) of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryInput withRasterDataCollectionArn(String rasterDataCollectionArn) {
        setRasterDataCollectionArn(rasterDataCollectionArn);
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

    public RasterDataCollectionQueryInput withTimeRangeFilter(TimeRangeFilterInput timeRangeFilter) {
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
        if (getPropertyFilters() != null)
            sb.append("PropertyFilters: ").append(getPropertyFilters()).append(",");
        if (getRasterDataCollectionArn() != null)
            sb.append("RasterDataCollectionArn: ").append(getRasterDataCollectionArn()).append(",");
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

        if (obj instanceof RasterDataCollectionQueryInput == false)
            return false;
        RasterDataCollectionQueryInput other = (RasterDataCollectionQueryInput) obj;
        if (other.getAreaOfInterest() == null ^ this.getAreaOfInterest() == null)
            return false;
        if (other.getAreaOfInterest() != null && other.getAreaOfInterest().equals(this.getAreaOfInterest()) == false)
            return false;
        if (other.getPropertyFilters() == null ^ this.getPropertyFilters() == null)
            return false;
        if (other.getPropertyFilters() != null && other.getPropertyFilters().equals(this.getPropertyFilters()) == false)
            return false;
        if (other.getRasterDataCollectionArn() == null ^ this.getRasterDataCollectionArn() == null)
            return false;
        if (other.getRasterDataCollectionArn() != null && other.getRasterDataCollectionArn().equals(this.getRasterDataCollectionArn()) == false)
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
        hashCode = prime * hashCode + ((getPropertyFilters() == null) ? 0 : getPropertyFilters().hashCode());
        hashCode = prime * hashCode + ((getRasterDataCollectionArn() == null) ? 0 : getRasterDataCollectionArn().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeFilter() == null) ? 0 : getTimeRangeFilter().hashCode());
        return hashCode;
    }

    @Override
    public RasterDataCollectionQueryInput clone() {
        try {
            return (RasterDataCollectionQueryInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.RasterDataCollectionQueryInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
