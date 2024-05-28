/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The output structure contains the Raster Data Collection Query input along with some additional metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/RasterDataCollectionQueryOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RasterDataCollectionQueryOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Area of Interest used in the search.
     * </p>
     */
    private AreaOfInterest areaOfInterest;
    /**
     * <p>
     * Property filters used in the search.
     * </p>
     */
    private PropertyFilters propertyFilters;
    /**
     * <p>
     * The ARN of the Raster Data Collection against which the search is done.
     * </p>
     */
    private String rasterDataCollectionArn;
    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     */
    private String rasterDataCollectionName;
    /**
     * <p>
     * The TimeRange filter used in the search.
     * </p>
     */
    private TimeRangeFilterOutput timeRangeFilter;

    /**
     * <p>
     * The Area of Interest used in the search.
     * </p>
     * 
     * @param areaOfInterest
     *        The Area of Interest used in the search.
     */

    public void setAreaOfInterest(AreaOfInterest areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }

    /**
     * <p>
     * The Area of Interest used in the search.
     * </p>
     * 
     * @return The Area of Interest used in the search.
     */

    public AreaOfInterest getAreaOfInterest() {
        return this.areaOfInterest;
    }

    /**
     * <p>
     * The Area of Interest used in the search.
     * </p>
     * 
     * @param areaOfInterest
     *        The Area of Interest used in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryOutput withAreaOfInterest(AreaOfInterest areaOfInterest) {
        setAreaOfInterest(areaOfInterest);
        return this;
    }

    /**
     * <p>
     * Property filters used in the search.
     * </p>
     * 
     * @param propertyFilters
     *        Property filters used in the search.
     */

    public void setPropertyFilters(PropertyFilters propertyFilters) {
        this.propertyFilters = propertyFilters;
    }

    /**
     * <p>
     * Property filters used in the search.
     * </p>
     * 
     * @return Property filters used in the search.
     */

    public PropertyFilters getPropertyFilters() {
        return this.propertyFilters;
    }

    /**
     * <p>
     * Property filters used in the search.
     * </p>
     * 
     * @param propertyFilters
     *        Property filters used in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryOutput withPropertyFilters(PropertyFilters propertyFilters) {
        setPropertyFilters(propertyFilters);
        return this;
    }

    /**
     * <p>
     * The ARN of the Raster Data Collection against which the search is done.
     * </p>
     * 
     * @param rasterDataCollectionArn
     *        The ARN of the Raster Data Collection against which the search is done.
     */

    public void setRasterDataCollectionArn(String rasterDataCollectionArn) {
        this.rasterDataCollectionArn = rasterDataCollectionArn;
    }

    /**
     * <p>
     * The ARN of the Raster Data Collection against which the search is done.
     * </p>
     * 
     * @return The ARN of the Raster Data Collection against which the search is done.
     */

    public String getRasterDataCollectionArn() {
        return this.rasterDataCollectionArn;
    }

    /**
     * <p>
     * The ARN of the Raster Data Collection against which the search is done.
     * </p>
     * 
     * @param rasterDataCollectionArn
     *        The ARN of the Raster Data Collection against which the search is done.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryOutput withRasterDataCollectionArn(String rasterDataCollectionArn) {
        setRasterDataCollectionArn(rasterDataCollectionArn);
        return this;
    }

    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     * 
     * @param rasterDataCollectionName
     *        The name of the raster data collection.
     */

    public void setRasterDataCollectionName(String rasterDataCollectionName) {
        this.rasterDataCollectionName = rasterDataCollectionName;
    }

    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     * 
     * @return The name of the raster data collection.
     */

    public String getRasterDataCollectionName() {
        return this.rasterDataCollectionName;
    }

    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     * 
     * @param rasterDataCollectionName
     *        The name of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryOutput withRasterDataCollectionName(String rasterDataCollectionName) {
        setRasterDataCollectionName(rasterDataCollectionName);
        return this;
    }

    /**
     * <p>
     * The TimeRange filter used in the search.
     * </p>
     * 
     * @param timeRangeFilter
     *        The TimeRange filter used in the search.
     */

    public void setTimeRangeFilter(TimeRangeFilterOutput timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    /**
     * <p>
     * The TimeRange filter used in the search.
     * </p>
     * 
     * @return The TimeRange filter used in the search.
     */

    public TimeRangeFilterOutput getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    /**
     * <p>
     * The TimeRange filter used in the search.
     * </p>
     * 
     * @param timeRangeFilter
     *        The TimeRange filter used in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionQueryOutput withTimeRangeFilter(TimeRangeFilterOutput timeRangeFilter) {
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
        if (getRasterDataCollectionName() != null)
            sb.append("RasterDataCollectionName: ").append(getRasterDataCollectionName()).append(",");
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

        if (obj instanceof RasterDataCollectionQueryOutput == false)
            return false;
        RasterDataCollectionQueryOutput other = (RasterDataCollectionQueryOutput) obj;
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
        if (other.getRasterDataCollectionName() == null ^ this.getRasterDataCollectionName() == null)
            return false;
        if (other.getRasterDataCollectionName() != null && other.getRasterDataCollectionName().equals(this.getRasterDataCollectionName()) == false)
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
        hashCode = prime * hashCode + ((getRasterDataCollectionName() == null) ? 0 : getRasterDataCollectionName().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeFilter() == null) ? 0 : getTimeRangeFilter().hashCode());
        return hashCode;
    }

    @Override
    public RasterDataCollectionQueryOutput clone() {
        try {
            return (RasterDataCollectionQueryOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.RasterDataCollectionQueryOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
