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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateMetricSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMetricSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the dataset to update.
     * </p>
     */
    private String metricSetArn;
    /**
     * <p>
     * The dataset's description.
     * </p>
     */
    private String metricSetDescription;
    /**
     * <p>
     * The metric list.
     * </p>
     */
    private java.util.List<Metric> metricList;
    /**
     * <p>
     * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only
     * supported for S3 and Redshift datasources.
     * </p>
     */
    private Integer offset;
    /**
     * <p>
     * The timestamp column.
     * </p>
     */
    private TimestampColumn timestampColumn;
    /**
     * <p>
     * The dimension list.
     * </p>
     */
    private java.util.List<String> dimensionList;
    /**
     * <p>
     * The dataset's interval.
     * </p>
     */
    private String metricSetFrequency;

    private MetricSource metricSource;

    /**
     * <p>
     * The ARN of the dataset to update.
     * </p>
     * 
     * @param metricSetArn
     *        The ARN of the dataset to update.
     */

    public void setMetricSetArn(String metricSetArn) {
        this.metricSetArn = metricSetArn;
    }

    /**
     * <p>
     * The ARN of the dataset to update.
     * </p>
     * 
     * @return The ARN of the dataset to update.
     */

    public String getMetricSetArn() {
        return this.metricSetArn;
    }

    /**
     * <p>
     * The ARN of the dataset to update.
     * </p>
     * 
     * @param metricSetArn
     *        The ARN of the dataset to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withMetricSetArn(String metricSetArn) {
        setMetricSetArn(metricSetArn);
        return this;
    }

    /**
     * <p>
     * The dataset's description.
     * </p>
     * 
     * @param metricSetDescription
     *        The dataset's description.
     */

    public void setMetricSetDescription(String metricSetDescription) {
        this.metricSetDescription = metricSetDescription;
    }

    /**
     * <p>
     * The dataset's description.
     * </p>
     * 
     * @return The dataset's description.
     */

    public String getMetricSetDescription() {
        return this.metricSetDescription;
    }

    /**
     * <p>
     * The dataset's description.
     * </p>
     * 
     * @param metricSetDescription
     *        The dataset's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withMetricSetDescription(String metricSetDescription) {
        setMetricSetDescription(metricSetDescription);
        return this;
    }

    /**
     * <p>
     * The metric list.
     * </p>
     * 
     * @return The metric list.
     */

    public java.util.List<Metric> getMetricList() {
        return metricList;
    }

    /**
     * <p>
     * The metric list.
     * </p>
     * 
     * @param metricList
     *        The metric list.
     */

    public void setMetricList(java.util.Collection<Metric> metricList) {
        if (metricList == null) {
            this.metricList = null;
            return;
        }

        this.metricList = new java.util.ArrayList<Metric>(metricList);
    }

    /**
     * <p>
     * The metric list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricList(java.util.Collection)} or {@link #withMetricList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricList
     *        The metric list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withMetricList(Metric... metricList) {
        if (this.metricList == null) {
            setMetricList(new java.util.ArrayList<Metric>(metricList.length));
        }
        for (Metric ele : metricList) {
            this.metricList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric list.
     * </p>
     * 
     * @param metricList
     *        The metric list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withMetricList(java.util.Collection<Metric> metricList) {
        setMetricList(metricList);
        return this;
    }

    /**
     * <p>
     * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only
     * supported for S3 and Redshift datasources.
     * </p>
     * 
     * @param offset
     *        After an interval ends, the amount of seconds that the detector waits before importing data. Offset is
     *        only supported for S3 and Redshift datasources.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only
     * supported for S3 and Redshift datasources.
     * </p>
     * 
     * @return After an interval ends, the amount of seconds that the detector waits before importing data. Offset is
     *         only supported for S3 and Redshift datasources.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * After an interval ends, the amount of seconds that the detector waits before importing data. Offset is only
     * supported for S3 and Redshift datasources.
     * </p>
     * 
     * @param offset
     *        After an interval ends, the amount of seconds that the detector waits before importing data. Offset is
     *        only supported for S3 and Redshift datasources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withOffset(Integer offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * The timestamp column.
     * </p>
     * 
     * @param timestampColumn
     *        The timestamp column.
     */

    public void setTimestampColumn(TimestampColumn timestampColumn) {
        this.timestampColumn = timestampColumn;
    }

    /**
     * <p>
     * The timestamp column.
     * </p>
     * 
     * @return The timestamp column.
     */

    public TimestampColumn getTimestampColumn() {
        return this.timestampColumn;
    }

    /**
     * <p>
     * The timestamp column.
     * </p>
     * 
     * @param timestampColumn
     *        The timestamp column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withTimestampColumn(TimestampColumn timestampColumn) {
        setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * <p>
     * The dimension list.
     * </p>
     * 
     * @return The dimension list.
     */

    public java.util.List<String> getDimensionList() {
        return dimensionList;
    }

    /**
     * <p>
     * The dimension list.
     * </p>
     * 
     * @param dimensionList
     *        The dimension list.
     */

    public void setDimensionList(java.util.Collection<String> dimensionList) {
        if (dimensionList == null) {
            this.dimensionList = null;
            return;
        }

        this.dimensionList = new java.util.ArrayList<String>(dimensionList);
    }

    /**
     * <p>
     * The dimension list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionList(java.util.Collection)} or {@link #withDimensionList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dimensionList
     *        The dimension list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withDimensionList(String... dimensionList) {
        if (this.dimensionList == null) {
            setDimensionList(new java.util.ArrayList<String>(dimensionList.length));
        }
        for (String ele : dimensionList) {
            this.dimensionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimension list.
     * </p>
     * 
     * @param dimensionList
     *        The dimension list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withDimensionList(java.util.Collection<String> dimensionList) {
        setDimensionList(dimensionList);
        return this;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @param metricSetFrequency
     *        The dataset's interval.
     * @see Frequency
     */

    public void setMetricSetFrequency(String metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @return The dataset's interval.
     * @see Frequency
     */

    public String getMetricSetFrequency() {
        return this.metricSetFrequency;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @param metricSetFrequency
     *        The dataset's interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public UpdateMetricSetRequest withMetricSetFrequency(String metricSetFrequency) {
        setMetricSetFrequency(metricSetFrequency);
        return this;
    }

    /**
     * <p>
     * The dataset's interval.
     * </p>
     * 
     * @param metricSetFrequency
     *        The dataset's interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public UpdateMetricSetRequest withMetricSetFrequency(Frequency metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency.toString();
        return this;
    }

    /**
     * @param metricSource
     */

    public void setMetricSource(MetricSource metricSource) {
        this.metricSource = metricSource;
    }

    /**
     * @return
     */

    public MetricSource getMetricSource() {
        return this.metricSource;
    }

    /**
     * @param metricSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricSetRequest withMetricSource(MetricSource metricSource) {
        setMetricSource(metricSource);
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
        if (getMetricSetArn() != null)
            sb.append("MetricSetArn: ").append(getMetricSetArn()).append(",");
        if (getMetricSetDescription() != null)
            sb.append("MetricSetDescription: ").append(getMetricSetDescription()).append(",");
        if (getMetricList() != null)
            sb.append("MetricList: ").append(getMetricList()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getTimestampColumn() != null)
            sb.append("TimestampColumn: ").append(getTimestampColumn()).append(",");
        if (getDimensionList() != null)
            sb.append("DimensionList: ").append(getDimensionList()).append(",");
        if (getMetricSetFrequency() != null)
            sb.append("MetricSetFrequency: ").append(getMetricSetFrequency()).append(",");
        if (getMetricSource() != null)
            sb.append("MetricSource: ").append(getMetricSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMetricSetRequest == false)
            return false;
        UpdateMetricSetRequest other = (UpdateMetricSetRequest) obj;
        if (other.getMetricSetArn() == null ^ this.getMetricSetArn() == null)
            return false;
        if (other.getMetricSetArn() != null && other.getMetricSetArn().equals(this.getMetricSetArn()) == false)
            return false;
        if (other.getMetricSetDescription() == null ^ this.getMetricSetDescription() == null)
            return false;
        if (other.getMetricSetDescription() != null && other.getMetricSetDescription().equals(this.getMetricSetDescription()) == false)
            return false;
        if (other.getMetricList() == null ^ this.getMetricList() == null)
            return false;
        if (other.getMetricList() != null && other.getMetricList().equals(this.getMetricList()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getTimestampColumn() == null ^ this.getTimestampColumn() == null)
            return false;
        if (other.getTimestampColumn() != null && other.getTimestampColumn().equals(this.getTimestampColumn()) == false)
            return false;
        if (other.getDimensionList() == null ^ this.getDimensionList() == null)
            return false;
        if (other.getDimensionList() != null && other.getDimensionList().equals(this.getDimensionList()) == false)
            return false;
        if (other.getMetricSetFrequency() == null ^ this.getMetricSetFrequency() == null)
            return false;
        if (other.getMetricSetFrequency() != null && other.getMetricSetFrequency().equals(this.getMetricSetFrequency()) == false)
            return false;
        if (other.getMetricSource() == null ^ this.getMetricSource() == null)
            return false;
        if (other.getMetricSource() != null && other.getMetricSource().equals(this.getMetricSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricSetArn() == null) ? 0 : getMetricSetArn().hashCode());
        hashCode = prime * hashCode + ((getMetricSetDescription() == null) ? 0 : getMetricSetDescription().hashCode());
        hashCode = prime * hashCode + ((getMetricList() == null) ? 0 : getMetricList().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getTimestampColumn() == null) ? 0 : getTimestampColumn().hashCode());
        hashCode = prime * hashCode + ((getDimensionList() == null) ? 0 : getDimensionList().hashCode());
        hashCode = prime * hashCode + ((getMetricSetFrequency() == null) ? 0 : getMetricSetFrequency().hashCode());
        hashCode = prime * hashCode + ((getMetricSource() == null) ? 0 : getMetricSource().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMetricSetRequest clone() {
        return (UpdateMetricSetRequest) super.clone();
    }

}
