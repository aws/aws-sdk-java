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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information for an asset property aggregate entry that is associated with the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyAggregates.html"
 * >BatchGetAssetPropertyAggregates</a> API.
 * </p>
 * <p>
 * To identify an asset property, you must specify one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>assetId</code> and <code>propertyId</code> of an asset property.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>propertyAlias</code>, which is a data stream alias (for example,
 * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
 * >UpdateAssetProperty</a>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyAggregatesEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyAggregatesEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the entry.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The ID of the asset in which the asset property was created.
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
     * The quality by which to filter asset data.
     * </p>
     */
    private java.util.List<String> qualities;
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
     * The ID of the entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the entry.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @return The ID of the entry.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset in which the asset property was created.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     * 
     * @return The ID of the asset in which the asset property was created.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset in which the asset property was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesEntry withAssetId(String assetId) {
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

    public BatchGetAssetPropertyAggregatesEntry withPropertyId(String propertyId) {
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

    public BatchGetAssetPropertyAggregatesEntry withPropertyAlias(String propertyAlias) {
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

    public BatchGetAssetPropertyAggregatesEntry withAggregateTypes(String... aggregateTypes) {
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

    public BatchGetAssetPropertyAggregatesEntry withAggregateTypes(java.util.Collection<String> aggregateTypes) {
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

    public BatchGetAssetPropertyAggregatesEntry withAggregateTypes(AggregateType... aggregateTypes) {
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

    public BatchGetAssetPropertyAggregatesEntry withResolution(String resolution) {
        setResolution(resolution);
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

    public BatchGetAssetPropertyAggregatesEntry withStartDate(java.util.Date startDate) {
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

    public BatchGetAssetPropertyAggregatesEntry withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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

    public BatchGetAssetPropertyAggregatesEntry withQualities(String... qualities) {
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

    public BatchGetAssetPropertyAggregatesEntry withQualities(java.util.Collection<String> qualities) {
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

    public BatchGetAssetPropertyAggregatesEntry withQualities(Quality... qualities) {
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

    public BatchGetAssetPropertyAggregatesEntry withTimeOrdering(String timeOrdering) {
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

    public BatchGetAssetPropertyAggregatesEntry withTimeOrdering(TimeOrdering timeOrdering) {
        this.timeOrdering = timeOrdering.toString();
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getQualities() != null)
            sb.append("Qualities: ").append(getQualities()).append(",");
        if (getTimeOrdering() != null)
            sb.append("TimeOrdering: ").append(getTimeOrdering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAssetPropertyAggregatesEntry == false)
            return false;
        BatchGetAssetPropertyAggregatesEntry other = (BatchGetAssetPropertyAggregatesEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
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
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getQualities() == null ^ this.getQualities() == null)
            return false;
        if (other.getQualities() != null && other.getQualities().equals(this.getQualities()) == false)
            return false;
        if (other.getTimeOrdering() == null ^ this.getTimeOrdering() == null)
            return false;
        if (other.getTimeOrdering() != null && other.getTimeOrdering().equals(this.getTimeOrdering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode + ((getAggregateTypes() == null) ? 0 : getAggregateTypes().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getQualities() == null) ? 0 : getQualities().hashCode());
        hashCode = prime * hashCode + ((getTimeOrdering() == null) ? 0 : getTimeOrdering().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyAggregatesEntry clone() {
        try {
            return (BatchGetAssetPropertyAggregatesEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchGetAssetPropertyAggregatesEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
