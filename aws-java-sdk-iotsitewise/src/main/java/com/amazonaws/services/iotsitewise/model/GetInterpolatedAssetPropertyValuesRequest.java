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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetInterpolatedAssetPropertyValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInterpolatedAssetPropertyValuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the asset property.
     * </p>
     */
    private String propertyId;
    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String propertyAlias;
    /**
     * <p>
     * The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     */
    private Long startTimeInSeconds;
    /**
     * <p>
     * The nanosecond offset converted from <code>startTimeInSeconds</code>.
     * </p>
     */
    private Integer startTimeOffsetInNanos;
    /**
     * <p>
     * The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     */
    private Long endTimeInSeconds;
    /**
     * <p>
     * The nanosecond offset converted from <code>endTimeInSeconds</code>.
     * </p>
     */
    private Integer endTimeOffsetInNanos;
    /**
     * <p>
     * The quality of the asset property value. You can use this parameter as a filter to choose only the asset property
     * values that have a specific quality.
     * </p>
     */
    private String quality;
    /**
     * <p>
     * The time interval in seconds over which to interpolate data. Each interval starts when the previous one ends.
     * </p>
     */
    private Long intervalInSeconds;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The interpolation type.
     * </p>
     * <p>
     * Valid values: <code>LINEAR_INTERPOLATION</code>
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @return The ID of the asset property.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param propertyAlias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *         industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param propertyAlias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
        return this;
    }

    /**
     * <p>
     * The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param startTimeInSeconds
     *        The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     */

    public void setStartTimeInSeconds(Long startTimeInSeconds) {
        this.startTimeInSeconds = startTimeInSeconds;
    }

    /**
     * <p>
     * The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @return The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     */

    public Long getStartTimeInSeconds() {
        return this.startTimeInSeconds;
    }

    /**
     * <p>
     * The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param startTimeInSeconds
     *        The exclusive start of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withStartTimeInSeconds(Long startTimeInSeconds) {
        setStartTimeInSeconds(startTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>startTimeInSeconds</code>.
     * </p>
     * 
     * @param startTimeOffsetInNanos
     *        The nanosecond offset converted from <code>startTimeInSeconds</code>.
     */

    public void setStartTimeOffsetInNanos(Integer startTimeOffsetInNanos) {
        this.startTimeOffsetInNanos = startTimeOffsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>startTimeInSeconds</code>.
     * </p>
     * 
     * @return The nanosecond offset converted from <code>startTimeInSeconds</code>.
     */

    public Integer getStartTimeOffsetInNanos() {
        return this.startTimeOffsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>startTimeInSeconds</code>.
     * </p>
     * 
     * @param startTimeOffsetInNanos
     *        The nanosecond offset converted from <code>startTimeInSeconds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withStartTimeOffsetInNanos(Integer startTimeOffsetInNanos) {
        setStartTimeOffsetInNanos(startTimeOffsetInNanos);
        return this;
    }

    /**
     * <p>
     * The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param endTimeInSeconds
     *        The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     */

    public void setEndTimeInSeconds(Long endTimeInSeconds) {
        this.endTimeInSeconds = endTimeInSeconds;
    }

    /**
     * <p>
     * The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @return The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     */

    public Long getEndTimeInSeconds() {
        return this.endTimeInSeconds;
    }

    /**
     * <p>
     * The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param endTimeInSeconds
     *        The inclusive end of the range from which to interpolate data, expressed in seconds in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withEndTimeInSeconds(Long endTimeInSeconds) {
        setEndTimeInSeconds(endTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>endTimeInSeconds</code>.
     * </p>
     * 
     * @param endTimeOffsetInNanos
     *        The nanosecond offset converted from <code>endTimeInSeconds</code>.
     */

    public void setEndTimeOffsetInNanos(Integer endTimeOffsetInNanos) {
        this.endTimeOffsetInNanos = endTimeOffsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>endTimeInSeconds</code>.
     * </p>
     * 
     * @return The nanosecond offset converted from <code>endTimeInSeconds</code>.
     */

    public Integer getEndTimeOffsetInNanos() {
        return this.endTimeOffsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset converted from <code>endTimeInSeconds</code>.
     * </p>
     * 
     * @param endTimeOffsetInNanos
     *        The nanosecond offset converted from <code>endTimeInSeconds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withEndTimeOffsetInNanos(Integer endTimeOffsetInNanos) {
        setEndTimeOffsetInNanos(endTimeOffsetInNanos);
        return this;
    }

    /**
     * <p>
     * The quality of the asset property value. You can use this parameter as a filter to choose only the asset property
     * values that have a specific quality.
     * </p>
     * 
     * @param quality
     *        The quality of the asset property value. You can use this parameter as a filter to choose only the asset
     *        property values that have a specific quality.
     * @see Quality
     */

    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * The quality of the asset property value. You can use this parameter as a filter to choose only the asset property
     * values that have a specific quality.
     * </p>
     * 
     * @return The quality of the asset property value. You can use this parameter as a filter to choose only the asset
     *         property values that have a specific quality.
     * @see Quality
     */

    public String getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * The quality of the asset property value. You can use this parameter as a filter to choose only the asset property
     * values that have a specific quality.
     * </p>
     * 
     * @param quality
     *        The quality of the asset property value. You can use this parameter as a filter to choose only the asset
     *        property values that have a specific quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public GetInterpolatedAssetPropertyValuesRequest withQuality(String quality) {
        setQuality(quality);
        return this;
    }

    /**
     * <p>
     * The quality of the asset property value. You can use this parameter as a filter to choose only the asset property
     * values that have a specific quality.
     * </p>
     * 
     * @param quality
     *        The quality of the asset property value. You can use this parameter as a filter to choose only the asset
     *        property values that have a specific quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public GetInterpolatedAssetPropertyValuesRequest withQuality(Quality quality) {
        this.quality = quality.toString();
        return this;
    }

    /**
     * <p>
     * The time interval in seconds over which to interpolate data. Each interval starts when the previous one ends.
     * </p>
     * 
     * @param intervalInSeconds
     *        The time interval in seconds over which to interpolate data. Each interval starts when the previous one
     *        ends.
     */

    public void setIntervalInSeconds(Long intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    /**
     * <p>
     * The time interval in seconds over which to interpolate data. Each interval starts when the previous one ends.
     * </p>
     * 
     * @return The time interval in seconds over which to interpolate data. Each interval starts when the previous one
     *         ends.
     */

    public Long getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * <p>
     * The time interval in seconds over which to interpolate data. Each interval starts when the previous one ends.
     * </p>
     * 
     * @param intervalInSeconds
     *        The time interval in seconds over which to interpolate data. Each interval starts when the previous one
     *        ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withIntervalInSeconds(Long intervalInSeconds) {
        setIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request. If not specified, the default value is
     *        10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 10.
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request. If not specified, the default value
     *         is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request. If not specified, the default value is
     *        10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The interpolation type.
     * </p>
     * <p>
     * Valid values: <code>LINEAR_INTERPOLATION</code>
     * </p>
     * 
     * @param type
     *        The interpolation type.</p>
     *        <p>
     *        Valid values: <code>LINEAR_INTERPOLATION</code>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The interpolation type.
     * </p>
     * <p>
     * Valid values: <code>LINEAR_INTERPOLATION</code>
     * </p>
     * 
     * @return The interpolation type.</p>
     *         <p>
     *         Valid values: <code>LINEAR_INTERPOLATION</code>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The interpolation type.
     * </p>
     * <p>
     * Valid values: <code>LINEAR_INTERPOLATION</code>
     * </p>
     * 
     * @param type
     *        The interpolation type.</p>
     *        <p>
     *        Valid values: <code>LINEAR_INTERPOLATION</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInterpolatedAssetPropertyValuesRequest withType(String type) {
        setType(type);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId()).append(",");
        if (getPropertyAlias() != null)
            sb.append("PropertyAlias: ").append(getPropertyAlias()).append(",");
        if (getStartTimeInSeconds() != null)
            sb.append("StartTimeInSeconds: ").append(getStartTimeInSeconds()).append(",");
        if (getStartTimeOffsetInNanos() != null)
            sb.append("StartTimeOffsetInNanos: ").append(getStartTimeOffsetInNanos()).append(",");
        if (getEndTimeInSeconds() != null)
            sb.append("EndTimeInSeconds: ").append(getEndTimeInSeconds()).append(",");
        if (getEndTimeOffsetInNanos() != null)
            sb.append("EndTimeOffsetInNanos: ").append(getEndTimeOffsetInNanos()).append(",");
        if (getQuality() != null)
            sb.append("Quality: ").append(getQuality()).append(",");
        if (getIntervalInSeconds() != null)
            sb.append("IntervalInSeconds: ").append(getIntervalInSeconds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInterpolatedAssetPropertyValuesRequest == false)
            return false;
        GetInterpolatedAssetPropertyValuesRequest other = (GetInterpolatedAssetPropertyValuesRequest) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        if (other.getStartTimeInSeconds() == null ^ this.getStartTimeInSeconds() == null)
            return false;
        if (other.getStartTimeInSeconds() != null && other.getStartTimeInSeconds().equals(this.getStartTimeInSeconds()) == false)
            return false;
        if (other.getStartTimeOffsetInNanos() == null ^ this.getStartTimeOffsetInNanos() == null)
            return false;
        if (other.getStartTimeOffsetInNanos() != null && other.getStartTimeOffsetInNanos().equals(this.getStartTimeOffsetInNanos()) == false)
            return false;
        if (other.getEndTimeInSeconds() == null ^ this.getEndTimeInSeconds() == null)
            return false;
        if (other.getEndTimeInSeconds() != null && other.getEndTimeInSeconds().equals(this.getEndTimeInSeconds()) == false)
            return false;
        if (other.getEndTimeOffsetInNanos() == null ^ this.getEndTimeOffsetInNanos() == null)
            return false;
        if (other.getEndTimeOffsetInNanos() != null && other.getEndTimeOffsetInNanos().equals(this.getEndTimeOffsetInNanos()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getIntervalInSeconds() == null ^ this.getIntervalInSeconds() == null)
            return false;
        if (other.getIntervalInSeconds() != null && other.getIntervalInSeconds().equals(this.getIntervalInSeconds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode + ((getStartTimeInSeconds() == null) ? 0 : getStartTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getStartTimeOffsetInNanos() == null) ? 0 : getStartTimeOffsetInNanos().hashCode());
        hashCode = prime * hashCode + ((getEndTimeInSeconds() == null) ? 0 : getEndTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getEndTimeOffsetInNanos() == null) ? 0 : getEndTimeOffsetInNanos().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode + ((getIntervalInSeconds() == null) ? 0 : getIntervalInSeconds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetInterpolatedAssetPropertyValuesRequest clone() {
        return (GetInterpolatedAssetPropertyValuesRequest) super.clone();
    }

}
