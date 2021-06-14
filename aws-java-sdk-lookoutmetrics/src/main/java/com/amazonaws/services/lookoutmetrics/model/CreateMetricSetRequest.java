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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateMetricSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMetricSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the anomaly detector that will use the dataset.
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
     * A description of the dataset you are creating.
     * </p>
     */
    private String metricSetDescription;
    /**
     * <p>
     * A list of metrics that the dataset will contain.
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
     * Contains information about the column used for tracking time in your source data.
     * </p>
     */
    private TimestampColumn timestampColumn;
    /**
     * <p>
     * A list of the fields you want to treat as dimensions.
     * </p>
     */
    private java.util.List<String> dimensionList;
    /**
     * <p>
     * The frequency with which the source data will be analyzed for anomalies.
     * </p>
     */
    private String metricSetFrequency;
    /**
     * <p>
     * Contains information about how the source data should be interpreted.
     * </p>
     */
    private MetricSource metricSource;
    /**
     * <p>
     * The time zone in which your source data was recorded.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the dataset.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the anomaly detector that will use the dataset.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector that will use the dataset.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that will use the dataset.
     * </p>
     * 
     * @return The ARN of the anomaly detector that will use the dataset.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that will use the dataset.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector that will use the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
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

    public CreateMetricSetRequest withMetricSetName(String metricSetName) {
        setMetricSetName(metricSetName);
        return this;
    }

    /**
     * <p>
     * A description of the dataset you are creating.
     * </p>
     * 
     * @param metricSetDescription
     *        A description of the dataset you are creating.
     */

    public void setMetricSetDescription(String metricSetDescription) {
        this.metricSetDescription = metricSetDescription;
    }

    /**
     * <p>
     * A description of the dataset you are creating.
     * </p>
     * 
     * @return A description of the dataset you are creating.
     */

    public String getMetricSetDescription() {
        return this.metricSetDescription;
    }

    /**
     * <p>
     * A description of the dataset you are creating.
     * </p>
     * 
     * @param metricSetDescription
     *        A description of the dataset you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withMetricSetDescription(String metricSetDescription) {
        setMetricSetDescription(metricSetDescription);
        return this;
    }

    /**
     * <p>
     * A list of metrics that the dataset will contain.
     * </p>
     * 
     * @return A list of metrics that the dataset will contain.
     */

    public java.util.List<Metric> getMetricList() {
        return metricList;
    }

    /**
     * <p>
     * A list of metrics that the dataset will contain.
     * </p>
     * 
     * @param metricList
     *        A list of metrics that the dataset will contain.
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
     * A list of metrics that the dataset will contain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricList(java.util.Collection)} or {@link #withMetricList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricList
     *        A list of metrics that the dataset will contain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withMetricList(Metric... metricList) {
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
     * A list of metrics that the dataset will contain.
     * </p>
     * 
     * @param metricList
     *        A list of metrics that the dataset will contain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withMetricList(java.util.Collection<Metric> metricList) {
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

    public CreateMetricSetRequest withOffset(Integer offset) {
        setOffset(offset);
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

    public CreateMetricSetRequest withTimestampColumn(TimestampColumn timestampColumn) {
        setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * <p>
     * A list of the fields you want to treat as dimensions.
     * </p>
     * 
     * @return A list of the fields you want to treat as dimensions.
     */

    public java.util.List<String> getDimensionList() {
        return dimensionList;
    }

    /**
     * <p>
     * A list of the fields you want to treat as dimensions.
     * </p>
     * 
     * @param dimensionList
     *        A list of the fields you want to treat as dimensions.
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
     * A list of the fields you want to treat as dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionList(java.util.Collection)} or {@link #withDimensionList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dimensionList
     *        A list of the fields you want to treat as dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withDimensionList(String... dimensionList) {
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
     * A list of the fields you want to treat as dimensions.
     * </p>
     * 
     * @param dimensionList
     *        A list of the fields you want to treat as dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withDimensionList(java.util.Collection<String> dimensionList) {
        setDimensionList(dimensionList);
        return this;
    }

    /**
     * <p>
     * The frequency with which the source data will be analyzed for anomalies.
     * </p>
     * 
     * @param metricSetFrequency
     *        The frequency with which the source data will be analyzed for anomalies.
     * @see Frequency
     */

    public void setMetricSetFrequency(String metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency;
    }

    /**
     * <p>
     * The frequency with which the source data will be analyzed for anomalies.
     * </p>
     * 
     * @return The frequency with which the source data will be analyzed for anomalies.
     * @see Frequency
     */

    public String getMetricSetFrequency() {
        return this.metricSetFrequency;
    }

    /**
     * <p>
     * The frequency with which the source data will be analyzed for anomalies.
     * </p>
     * 
     * @param metricSetFrequency
     *        The frequency with which the source data will be analyzed for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public CreateMetricSetRequest withMetricSetFrequency(String metricSetFrequency) {
        setMetricSetFrequency(metricSetFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency with which the source data will be analyzed for anomalies.
     * </p>
     * 
     * @param metricSetFrequency
     *        The frequency with which the source data will be analyzed for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public CreateMetricSetRequest withMetricSetFrequency(Frequency metricSetFrequency) {
        this.metricSetFrequency = metricSetFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about how the source data should be interpreted.
     * </p>
     * 
     * @param metricSource
     *        Contains information about how the source data should be interpreted.
     */

    public void setMetricSource(MetricSource metricSource) {
        this.metricSource = metricSource;
    }

    /**
     * <p>
     * Contains information about how the source data should be interpreted.
     * </p>
     * 
     * @return Contains information about how the source data should be interpreted.
     */

    public MetricSource getMetricSource() {
        return this.metricSource;
    }

    /**
     * <p>
     * Contains information about how the source data should be interpreted.
     * </p>
     * 
     * @param metricSource
     *        Contains information about how the source data should be interpreted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withMetricSource(MetricSource metricSource) {
        setMetricSource(metricSource);
        return this;
    }

    /**
     * <p>
     * The time zone in which your source data was recorded.
     * </p>
     * 
     * @param timezone
     *        The time zone in which your source data was recorded.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone in which your source data was recorded.
     * </p>
     * 
     * @return The time zone in which your source data was recorded.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone in which your source data was recorded.
     * </p>
     * 
     * @param timezone
     *        The time zone in which your source data was recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the dataset.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *         apply to the dataset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the dataset.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *        apply to the dataset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the dataset.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *        apply to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMetricSetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricSetRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getMetricSetName() != null)
            sb.append("MetricSetName: ").append(getMetricSetName()).append(",");
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
            sb.append("MetricSource: ").append(getMetricSource()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMetricSetRequest == false)
            return false;
        CreateMetricSetRequest other = (CreateMetricSetRequest) obj;
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
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getMetricSetName() == null) ? 0 : getMetricSetName().hashCode());
        hashCode = prime * hashCode + ((getMetricSetDescription() == null) ? 0 : getMetricSetDescription().hashCode());
        hashCode = prime * hashCode + ((getMetricList() == null) ? 0 : getMetricList().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getTimestampColumn() == null) ? 0 : getTimestampColumn().hashCode());
        hashCode = prime * hashCode + ((getDimensionList() == null) ? 0 : getDimensionList().hashCode());
        hashCode = prime * hashCode + ((getMetricSetFrequency() == null) ? 0 : getMetricSetFrequency().hashCode());
        hashCode = prime * hashCode + ((getMetricSource() == null) ? 0 : getMetricSource().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMetricSetRequest clone() {
        return (CreateMetricSetRequest) super.clone();
    }

}
