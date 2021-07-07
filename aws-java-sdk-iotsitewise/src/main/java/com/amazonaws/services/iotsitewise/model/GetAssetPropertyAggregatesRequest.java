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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyAggregates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetPropertyAggregatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The data aggregating function.
     * </p>
     */
    private java.util.List<String> aggregateTypes;
    /**
     * <p>
     * The time interval over which to aggregate data.
     * </p>
     */
    private String resolution;
    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     */
    private java.util.List<String> qualities;
    /**
     * <p>
     * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     */
    private String timeOrdering;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     */
    private Integer maxResults;

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

    public GetAssetPropertyAggregatesRequest withAssetId(String assetId) {
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

    public GetAssetPropertyAggregatesRequest withPropertyId(String propertyId) {
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

    public GetAssetPropertyAggregatesRequest withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
        return this;
    }

    /**
     * <p>
     * The data aggregating function.
     * </p>
     * 
     * @return The data aggregating function.
     * @see AggregateType
     */

    public java.util.List<String> getAggregateTypes() {
        return aggregateTypes;
    }

    /**
     * <p>
     * The data aggregating function.
     * </p>
     * 
     * @param aggregateTypes
     *        The data aggregating function.
     * @see AggregateType
     */

    public void setAggregateTypes(java.util.Collection<String> aggregateTypes) {
        if (aggregateTypes == null) {
            this.aggregateTypes = null;
            return;
        }

        this.aggregateTypes = new java.util.ArrayList<String>(aggregateTypes);
    }

    /**
     * <p>
     * The data aggregating function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregateTypes(java.util.Collection)} or {@link #withAggregateTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param aggregateTypes
     *        The data aggregating function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateType
     */

    public GetAssetPropertyAggregatesRequest withAggregateTypes(String... aggregateTypes) {
        if (this.aggregateTypes == null) {
            setAggregateTypes(new java.util.ArrayList<String>(aggregateTypes.length));
        }
        for (String ele : aggregateTypes) {
            this.aggregateTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data aggregating function.
     * </p>
     * 
     * @param aggregateTypes
     *        The data aggregating function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateType
     */

    public GetAssetPropertyAggregatesRequest withAggregateTypes(java.util.Collection<String> aggregateTypes) {
        setAggregateTypes(aggregateTypes);
        return this;
    }

    /**
     * <p>
     * The data aggregating function.
     * </p>
     * 
     * @param aggregateTypes
     *        The data aggregating function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateType
     */

    public GetAssetPropertyAggregatesRequest withAggregateTypes(AggregateType... aggregateTypes) {
        java.util.ArrayList<String> aggregateTypesCopy = new java.util.ArrayList<String>(aggregateTypes.length);
        for (AggregateType value : aggregateTypes) {
            aggregateTypesCopy.add(value.toString());
        }
        if (getAggregateTypes() == null) {
            setAggregateTypes(aggregateTypesCopy);
        } else {
            getAggregateTypes().addAll(aggregateTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The time interval over which to aggregate data.
     * </p>
     * 
     * @param resolution
     *        The time interval over which to aggregate data.
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <p>
     * The time interval over which to aggregate data.
     * </p>
     * 
     * @return The time interval over which to aggregate data.
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <p>
     * The time interval over which to aggregate data.
     * </p>
     * 
     * @param resolution
     *        The time interval over which to aggregate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesRequest withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * 
     * @return The quality by which to filter asset data.
     * @see Quality
     */

    public java.util.List<String> getQualities() {
        return qualities;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * 
     * @param qualities
     *        The quality by which to filter asset data.
     * @see Quality
     */

    public void setQualities(java.util.Collection<String> qualities) {
        if (qualities == null) {
            this.qualities = null;
            return;
        }

        this.qualities = new java.util.ArrayList<String>(qualities);
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQualities(java.util.Collection)} or {@link #withQualities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param qualities
     *        The quality by which to filter asset data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public GetAssetPropertyAggregatesRequest withQualities(String... qualities) {
        if (this.qualities == null) {
            setQualities(new java.util.ArrayList<String>(qualities.length));
        }
        for (String ele : qualities) {
            this.qualities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * 
     * @param qualities
     *        The quality by which to filter asset data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public GetAssetPropertyAggregatesRequest withQualities(java.util.Collection<String> qualities) {
        setQualities(qualities);
        return this;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * 
     * @param qualities
     *        The quality by which to filter asset data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Quality
     */

    public GetAssetPropertyAggregatesRequest withQualities(Quality... qualities) {
        java.util.ArrayList<String> qualitiesCopy = new java.util.ArrayList<String>(qualities.length);
        for (Quality value : qualities) {
            qualitiesCopy.add(value.toString());
        }
        if (getQualities() == null) {
            setQualities(qualitiesCopy);
        } else {
            getQualities().addAll(qualitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param startDate
     *        The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch
     *        time.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @return The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch
     *         time.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param startDate
     *        The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param endDate
     *        The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch
     *        time.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @return The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch
     *         time.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
     * </p>
     * 
     * @param endDate
     *        The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @param timeOrdering
     *        The chronological sorting order of the requested information.</p>
     *        <p>
     *        Default: <code>ASCENDING</code>
     * @see TimeOrdering
     */

    public void setTimeOrdering(String timeOrdering) {
        this.timeOrdering = timeOrdering;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @return The chronological sorting order of the requested information.</p>
     *         <p>
     *         Default: <code>ASCENDING</code>
     * @see TimeOrdering
     */

    public String getTimeOrdering() {
        return this.timeOrdering;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @param timeOrdering
     *        The chronological sorting order of the requested information.</p>
     *        <p>
     *        Default: <code>ASCENDING</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeOrdering
     */

    public GetAssetPropertyAggregatesRequest withTimeOrdering(String timeOrdering) {
        setTimeOrdering(timeOrdering);
        return this;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Default: <code>ASCENDING</code>
     * </p>
     * 
     * @param timeOrdering
     *        The chronological sorting order of the requested information.</p>
     *        <p>
     *        Default: <code>ASCENDING</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeOrdering
     */

    public GetAssetPropertyAggregatesRequest withTimeOrdering(TimeOrdering timeOrdering) {
        this.timeOrdering = timeOrdering.toString();
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

    public GetAssetPropertyAggregatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 100
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.</p>
     *         <p>
     *         Default: 100
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 100
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAggregateTypes() != null)
            sb.append("AggregateTypes: ").append(getAggregateTypes()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getQualities() != null)
            sb.append("Qualities: ").append(getQualities()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getTimeOrdering() != null)
            sb.append("TimeOrdering: ").append(getTimeOrdering()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetPropertyAggregatesRequest == false)
            return false;
        GetAssetPropertyAggregatesRequest other = (GetAssetPropertyAggregatesRequest) obj;
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
        if (other.getAggregateTypes() == null ^ this.getAggregateTypes() == null)
            return false;
        if (other.getAggregateTypes() != null && other.getAggregateTypes().equals(this.getAggregateTypes()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getQualities() == null ^ this.getQualities() == null)
            return false;
        if (other.getQualities() != null && other.getQualities().equals(this.getQualities()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getTimeOrdering() == null ^ this.getTimeOrdering() == null)
            return false;
        if (other.getTimeOrdering() != null && other.getTimeOrdering().equals(this.getTimeOrdering()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        hashCode = prime * hashCode + ((getAggregateTypes() == null) ? 0 : getAggregateTypes().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getQualities() == null) ? 0 : getQualities().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getTimeOrdering() == null) ? 0 : getTimeOrdering().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetPropertyAggregatesRequest clone() {
        return (GetAssetPropertyAggregatesRequest) super.clone();
    }

}
