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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeTimeSeries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTimeSeriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The alias that identifies the time series.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The ID of the time series.
     * </p>
     */
    private String timeSeriesId;
    /**
     * <p>
     * The data type of the time series.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this time series.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The data type of the structure for this time series. This parameter is required for time series that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you created the asset property
     * that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite
     * models.
     * </p>
     */
    private String dataTypeSpec;
    /**
     * <p>
     * The date that the time series was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date timeSeriesCreationDate;
    /**
     * <p>
     * The date that the time series was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date timeSeriesLastUpdateDate;

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

    public DescribeTimeSeriesResult withAssetId(String assetId) {
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

    public DescribeTimeSeriesResult withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The alias that identifies the time series.
     * </p>
     * 
     * @param alias
     *        The alias that identifies the time series.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias that identifies the time series.
     * </p>
     * 
     * @return The alias that identifies the time series.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias that identifies the time series.
     * </p>
     * 
     * @param alias
     *        The alias that identifies the time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeSeriesResult withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The ID of the time series.
     * </p>
     * 
     * @param timeSeriesId
     *        The ID of the time series.
     */

    public void setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
    }

    /**
     * <p>
     * The ID of the time series.
     * </p>
     * 
     * @return The ID of the time series.
     */

    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    /**
     * <p>
     * The ID of the time series.
     * </p>
     * 
     * @param timeSeriesId
     *        The ID of the time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeSeriesResult withTimeSeriesId(String timeSeriesId) {
        setTimeSeriesId(timeSeriesId);
        return this;
    }

    /**
     * <p>
     * The data type of the time series.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this time series.
     * </p>
     * 
     * @param dataType
     *        The data type of the time series.</p>
     *        <p>
     *        If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *        of the structure for this time series.
     * @see PropertyDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the time series.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this time series.
     * </p>
     * 
     * @return The data type of the time series.</p>
     *         <p>
     *         If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *         of the structure for this time series.
     * @see PropertyDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the time series.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this time series.
     * </p>
     * 
     * @param dataType
     *        The data type of the time series.</p>
     *        <p>
     *        If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *        of the structure for this time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public DescribeTimeSeriesResult withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the time series.
     * </p>
     * <p>
     * If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type of the
     * structure for this time series.
     * </p>
     * 
     * @param dataType
     *        The data type of the time series.</p>
     *        <p>
     *        If you specify <code>STRUCT</code>, you must also specify <code>dataTypeSpec</code> to identify the type
     *        of the structure for this time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public DescribeTimeSeriesResult withDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The data type of the structure for this time series. This parameter is required for time series that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you created the asset property
     * that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite
     * models.
     * </p>
     * 
     * @param dataTypeSpec
     *        The data type of the structure for this time series. This parameter is required for time series that have
     *        the <code>STRUCT</code> data type.</p>
     *        <p>
     *        The options for this parameter depend on the type of the composite model in which you created the asset
     *        property that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in
     *        alarm composite models.
     */

    public void setDataTypeSpec(String dataTypeSpec) {
        this.dataTypeSpec = dataTypeSpec;
    }

    /**
     * <p>
     * The data type of the structure for this time series. This parameter is required for time series that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you created the asset property
     * that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite
     * models.
     * </p>
     * 
     * @return The data type of the structure for this time series. This parameter is required for time series that have
     *         the <code>STRUCT</code> data type.</p>
     *         <p>
     *         The options for this parameter depend on the type of the composite model in which you created the asset
     *         property that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in
     *         alarm composite models.
     */

    public String getDataTypeSpec() {
        return this.dataTypeSpec;
    }

    /**
     * <p>
     * The data type of the structure for this time series. This parameter is required for time series that have the
     * <code>STRUCT</code> data type.
     * </p>
     * <p>
     * The options for this parameter depend on the type of the composite model in which you created the asset property
     * that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in alarm composite
     * models.
     * </p>
     * 
     * @param dataTypeSpec
     *        The data type of the structure for this time series. This parameter is required for time series that have
     *        the <code>STRUCT</code> data type.</p>
     *        <p>
     *        The options for this parameter depend on the type of the composite model in which you created the asset
     *        property that is associated with your time series. Use <code>AWS/ALARM_STATE</code> for alarm state in
     *        alarm composite models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeSeriesResult withDataTypeSpec(String dataTypeSpec) {
        setDataTypeSpec(dataTypeSpec);
        return this;
    }

    /**
     * <p>
     * The date that the time series was created, in Unix epoch time.
     * </p>
     * 
     * @param timeSeriesCreationDate
     *        The date that the time series was created, in Unix epoch time.
     */

    public void setTimeSeriesCreationDate(java.util.Date timeSeriesCreationDate) {
        this.timeSeriesCreationDate = timeSeriesCreationDate;
    }

    /**
     * <p>
     * The date that the time series was created, in Unix epoch time.
     * </p>
     * 
     * @return The date that the time series was created, in Unix epoch time.
     */

    public java.util.Date getTimeSeriesCreationDate() {
        return this.timeSeriesCreationDate;
    }

    /**
     * <p>
     * The date that the time series was created, in Unix epoch time.
     * </p>
     * 
     * @param timeSeriesCreationDate
     *        The date that the time series was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeSeriesResult withTimeSeriesCreationDate(java.util.Date timeSeriesCreationDate) {
        setTimeSeriesCreationDate(timeSeriesCreationDate);
        return this;
    }

    /**
     * <p>
     * The date that the time series was last updated, in Unix epoch time.
     * </p>
     * 
     * @param timeSeriesLastUpdateDate
     *        The date that the time series was last updated, in Unix epoch time.
     */

    public void setTimeSeriesLastUpdateDate(java.util.Date timeSeriesLastUpdateDate) {
        this.timeSeriesLastUpdateDate = timeSeriesLastUpdateDate;
    }

    /**
     * <p>
     * The date that the time series was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date that the time series was last updated, in Unix epoch time.
     */

    public java.util.Date getTimeSeriesLastUpdateDate() {
        return this.timeSeriesLastUpdateDate;
    }

    /**
     * <p>
     * The date that the time series was last updated, in Unix epoch time.
     * </p>
     * 
     * @param timeSeriesLastUpdateDate
     *        The date that the time series was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeSeriesResult withTimeSeriesLastUpdateDate(java.util.Date timeSeriesLastUpdateDate) {
        setTimeSeriesLastUpdateDate(timeSeriesLastUpdateDate);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getTimeSeriesId() != null)
            sb.append("TimeSeriesId: ").append(getTimeSeriesId()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDataTypeSpec() != null)
            sb.append("DataTypeSpec: ").append(getDataTypeSpec()).append(",");
        if (getTimeSeriesCreationDate() != null)
            sb.append("TimeSeriesCreationDate: ").append(getTimeSeriesCreationDate()).append(",");
        if (getTimeSeriesLastUpdateDate() != null)
            sb.append("TimeSeriesLastUpdateDate: ").append(getTimeSeriesLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTimeSeriesResult == false)
            return false;
        DescribeTimeSeriesResult other = (DescribeTimeSeriesResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getTimeSeriesId() == null ^ this.getTimeSeriesId() == null)
            return false;
        if (other.getTimeSeriesId() != null && other.getTimeSeriesId().equals(this.getTimeSeriesId()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDataTypeSpec() == null ^ this.getDataTypeSpec() == null)
            return false;
        if (other.getDataTypeSpec() != null && other.getDataTypeSpec().equals(this.getDataTypeSpec()) == false)
            return false;
        if (other.getTimeSeriesCreationDate() == null ^ this.getTimeSeriesCreationDate() == null)
            return false;
        if (other.getTimeSeriesCreationDate() != null && other.getTimeSeriesCreationDate().equals(this.getTimeSeriesCreationDate()) == false)
            return false;
        if (other.getTimeSeriesLastUpdateDate() == null ^ this.getTimeSeriesLastUpdateDate() == null)
            return false;
        if (other.getTimeSeriesLastUpdateDate() != null && other.getTimeSeriesLastUpdateDate().equals(this.getTimeSeriesLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesId() == null) ? 0 : getTimeSeriesId().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataTypeSpec() == null) ? 0 : getDataTypeSpec().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesCreationDate() == null) ? 0 : getTimeSeriesCreationDate().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesLastUpdateDate() == null) ? 0 : getTimeSeriesLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTimeSeriesResult clone() {
        try {
            return (DescribeTimeSeriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
