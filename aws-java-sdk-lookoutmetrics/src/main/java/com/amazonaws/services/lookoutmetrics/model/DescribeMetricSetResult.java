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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeMetricSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     */
    private String metricSetArn;
    /**
     * <p>
     * The ARN of the detector that contains the dataset.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String metricSetName;
    /**
     * <p>
     * The dataset's description.
     * </p>
     */
    private String metricSetDescription;
    /**
     * <p>
     * The time at which the dataset was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the dataset was last modified.
     * </p>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * The offset in seconds. Only supported for S3 and Redshift datasources.
     * </p>
     */
    private Integer offset;
    /**
     * <p>
     * A list of the metrics defined by the dataset.
     * </p>
     */
    private java.util.List<Metric> metricList;
    /**
     * <p>
     * Contains information about the column used for tracking time in your source data.
     * </p>
     */
    private TimestampColumn timestampColumn;
    /**
     * <p>
     * A list of the dimensions chosen for analysis.
     * </p>
     */
    private java.util.List<String> dimensionList;
    /**
     * <p>
     * The interval at which the data will be analyzed for anomalies.
     * </p>
     */
    private String metricSetFrequency;
    /**
     * <p>
     * The time zone in which the dataset's data was recorded.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * Contains information about the dataset's source data.
     * </p>
     */
    private MetricSource metricSource;

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @param metricSetArn
     *        The ARN of the dataset.
     */

    public void setMetricSetArn(String metricSetArn) {
        this.metricSetArn = metricSetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @return The ARN of the dataset.
     */

    public String getMetricSetArn() {
        return this.metricSetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @param metricSetArn
     *        The ARN of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withMetricSetArn(String metricSetArn) {
        setMetricSetArn(metricSetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the detector that contains the dataset.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector that contains the dataset.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector that contains the dataset.
     * </p>
     * 
     * @return The ARN of the detector that contains the dataset.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector that contains the dataset.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector that contains the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param metricSetName
     *        The name of the dataset.
     */

    public void setMetricSetName(String metricSetName) {
        this.metricSetName = metricSetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getMetricSetName() {
        return this.metricSetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param metricSetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withMetricSetName(String metricSetName) {
        setMetricSetName(metricSetName);
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

    public DescribeMetricSetResult withMetricSetDescription(String metricSetDescription) {
        setMetricSetDescription(metricSetDescription);
        return this;
    }

    /**
     * <p>
     * The time at which the dataset was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the dataset was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the dataset was created.
     * </p>
     * 
     * @return The time at which the dataset was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the dataset was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the dataset was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the dataset was last modified.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time at which the dataset was last modified.
     * </p>
     * 
     * @return The time at which the dataset was last modified.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time at which the dataset was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the dataset was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The offset in seconds. Only supported for S3 and Redshift datasources.
     * </p>
     * 
     * @param offset
     *        The offset in seconds. Only supported for S3 and Redshift datasources.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The offset in seconds. Only supported for S3 and Redshift datasources.
     * </p>
     * 
     * @return The offset in seconds. Only supported for S3 and Redshift datasources.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * The offset in seconds. Only supported for S3 and Redshift datasources.
     * </p>
     * 
     * @param offset
     *        The offset in seconds. Only supported for S3 and Redshift datasources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withOffset(Integer offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * A list of the metrics defined by the dataset.
     * </p>
     * 
     * @return A list of the metrics defined by the dataset.
     */

    public java.util.List<Metric> getMetricList() {
        return metricList;
    }

    /**
     * <p>
     * A list of the metrics defined by the dataset.
     * </p>
     * 
     * @param metricList
     *        A list of the metrics defined by the dataset.
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
     * A list of the metrics defined by the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricList(java.util.Collection)} or {@link #withMetricList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricList
     *        A list of the metrics defined by the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withMetricList(Metric... metricList) {
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
     * A list of the metrics defined by the dataset.
     * </p>
     * 
     * @param metricList
     *        A list of the metrics defined by the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withMetricList(java.util.Collection<Metric> metricList) {
        setMetricList(metricList);
        return this;
    }

    /**
     * <p>
     * Contains information about the column used for tracking time in your source data.
     * </p>
     * 
     * @param timestampColumn
     *        Contains information about the column used for tracking time in your source data.
     */

    public void setTimestampColumn(TimestampColumn timestampColumn) {
        this.timestampColumn = timestampColumn;
    }

    /**
     * <p>
     * Contains information about the column used for tracking time in your source data.
     * </p>
     * 
     * @return Contains information about the column used for tracking time in your source data.
     */

    public TimestampColumn getTimestampColumn() {
        return this.timestampColumn;
    }

    /**
     * <p>
     * Contains information about the column used for tracking time in your source data.
     * </p>
     * 
     * @param timestampColumn
     *        Contains information about the column used for tracking time in your source data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withTimestampColumn(TimestampColumn timestampColumn) {
        setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * <p>
     * A list of the dimensions chosen for analysis.
     * </p>
     * 
     * @return A list of the dimensions chosen for analysis.
     */

    public java.util.List<String> getDimensionList() {
        return dimensionList;
    }

    /**
     * <p>
     * A list of the dimensions chosen for analysis.
     * </p>
     * 
     * @param dimensionList
     *        A list of the dimensions chosen for analysis.
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
     * A list of the dimensions chosen for analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionList(java.util.Collection)} or {@link #withDimensionList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dimensionList
     *        A list of the dimensions chosen for analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withDimensionList(String... dimensionList) {
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
     * A list of the dimensions chosen for analysis.
     * </p>
     * 
     * @param dimensionList
     *        A list of the dimensions chosen for analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withDimensionList(java.util.Collection<String> dimensionList) {
        setDimensionList(dimensionList);
        return this;
    }

    /**
     * <p>
     * The interval at which the data will be analyzed for anomalies.
     * </p>
     * 
     * @param metricSetFrequency
     *        The interval at which the data will be analyzed for anomalies.
     * @see Frequency
     */

    public void setMetricSetFrequency(String metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency;
    }

    /**
     * <p>
     * The interval at which the data will be analyzed for anomalies.
     * </p>
     * 
     * @return The interval at which the data will be analyzed for anomalies.
     * @see Frequency
     */

    public String getMetricSetFrequency() {
        return this.metricSetFrequency;
    }

    /**
     * <p>
     * The interval at which the data will be analyzed for anomalies.
     * </p>
     * 
     * @param metricSetFrequency
     *        The interval at which the data will be analyzed for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public DescribeMetricSetResult withMetricSetFrequency(String metricSetFrequency) {
        setMetricSetFrequency(metricSetFrequency);
        return this;
    }

    /**
     * <p>
     * The interval at which the data will be analyzed for anomalies.
     * </p>
     * 
     * @param metricSetFrequency
     *        The interval at which the data will be analyzed for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public DescribeMetricSetResult withMetricSetFrequency(Frequency metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The time zone in which the dataset's data was recorded.
     * </p>
     * 
     * @param timezone
     *        The time zone in which the dataset's data was recorded.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone in which the dataset's data was recorded.
     * </p>
     * 
     * @return The time zone in which the dataset's data was recorded.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone in which the dataset's data was recorded.
     * </p>
     * 
     * @param timezone
     *        The time zone in which the dataset's data was recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * Contains information about the dataset's source data.
     * </p>
     * 
     * @param metricSource
     *        Contains information about the dataset's source data.
     */

    public void setMetricSource(MetricSource metricSource) {
        this.metricSource = metricSource;
    }

    /**
     * <p>
     * Contains information about the dataset's source data.
     * </p>
     * 
     * @return Contains information about the dataset's source data.
     */

    public MetricSource getMetricSource() {
        return this.metricSource;
    }

    /**
     * <p>
     * Contains information about the dataset's source data.
     * </p>
     * 
     * @param metricSource
     *        Contains information about the dataset's source data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetResult withMetricSource(MetricSource metricSource) {
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
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getMetricSetName() != null)
            sb.append("MetricSetName: ").append(getMetricSetName()).append(",");
        if (getMetricSetDescription() != null)
            sb.append("MetricSetDescription: ").append(getMetricSetDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getMetricList() != null)
            sb.append("MetricList: ").append(getMetricList()).append(",");
        if (getTimestampColumn() != null)
            sb.append("TimestampColumn: ").append(getTimestampColumn()).append(",");
        if (getDimensionList() != null)
            sb.append("DimensionList: ").append(getDimensionList()).append(",");
        if (getMetricSetFrequency() != null)
            sb.append("MetricSetFrequency: ").append(getMetricSetFrequency()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
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

        if (obj instanceof DescribeMetricSetResult == false)
            return false;
        DescribeMetricSetResult other = (DescribeMetricSetResult) obj;
        if (other.getMetricSetArn() == null ^ this.getMetricSetArn() == null)
            return false;
        if (other.getMetricSetArn() != null && other.getMetricSetArn().equals(this.getMetricSetArn()) == false)
            return false;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getMetricSetName() == null ^ this.getMetricSetName() == null)
            return false;
        if (other.getMetricSetName() != null && other.getMetricSetName().equals(this.getMetricSetName()) == false)
            return false;
        if (other.getMetricSetDescription() == null ^ this.getMetricSetDescription() == null)
            return false;
        if (other.getMetricSetDescription() != null && other.getMetricSetDescription().equals(this.getMetricSetDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getMetricList() == null ^ this.getMetricList() == null)
            return false;
        if (other.getMetricList() != null && other.getMetricList().equals(this.getMetricList()) == false)
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
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
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
        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getMetricSetName() == null) ? 0 : getMetricSetName().hashCode());
        hashCode = prime * hashCode + ((getMetricSetDescription() == null) ? 0 : getMetricSetDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getMetricList() == null) ? 0 : getMetricList().hashCode());
        hashCode = prime * hashCode + ((getTimestampColumn() == null) ? 0 : getTimestampColumn().hashCode());
        hashCode = prime * hashCode + ((getDimensionList() == null) ? 0 : getDimensionList().hashCode());
        hashCode = prime * hashCode + ((getMetricSetFrequency() == null) ? 0 : getMetricSetFrequency().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getMetricSource() == null) ? 0 : getMetricSource().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetricSetResult clone() {
        try {
            return (DescribeMetricSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
