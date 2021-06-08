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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/MetricSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     */
    private String metricSetArn;
    /**
     * <p>
     * The ARN of the detector to which the dataset belongs.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The description of the dataset.
     * </p>
     */
    private String metricSetDescription;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String metricSetName;
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
     * The dataset's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public MetricSetSummary withMetricSetArn(String metricSetArn) {
        setMetricSetArn(metricSetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the detector to which the dataset belongs.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to which the dataset belongs.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to which the dataset belongs.
     * </p>
     * 
     * @return The ARN of the detector to which the dataset belongs.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to which the dataset belongs.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to which the dataset belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetSummary withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The description of the dataset.
     * </p>
     * 
     * @param metricSetDescription
     *        The description of the dataset.
     */

    public void setMetricSetDescription(String metricSetDescription) {
        this.metricSetDescription = metricSetDescription;
    }

    /**
     * <p>
     * The description of the dataset.
     * </p>
     * 
     * @return The description of the dataset.
     */

    public String getMetricSetDescription() {
        return this.metricSetDescription;
    }

    /**
     * <p>
     * The description of the dataset.
     * </p>
     * 
     * @param metricSetDescription
     *        The description of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetSummary withMetricSetDescription(String metricSetDescription) {
        setMetricSetDescription(metricSetDescription);
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

    public MetricSetSummary withMetricSetName(String metricSetName) {
        setMetricSetName(metricSetName);
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

    public MetricSetSummary withCreationTime(java.util.Date creationTime) {
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

    public MetricSetSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The dataset's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @return The dataset's <a
     *         href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The dataset's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The dataset's <a
     *        href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The dataset's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The dataset's <a
     *        href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see MetricSetSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetSummary addTagsEntry(String key, String value) {
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

    public MetricSetSummary clearTagsEntries() {
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
        if (getMetricSetArn() != null)
            sb.append("MetricSetArn: ").append(getMetricSetArn()).append(",");
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getMetricSetDescription() != null)
            sb.append("MetricSetDescription: ").append(getMetricSetDescription()).append(",");
        if (getMetricSetName() != null)
            sb.append("MetricSetName: ").append(getMetricSetName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
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

        if (obj instanceof MetricSetSummary == false)
            return false;
        MetricSetSummary other = (MetricSetSummary) obj;
        if (other.getMetricSetArn() == null ^ this.getMetricSetArn() == null)
            return false;
        if (other.getMetricSetArn() != null && other.getMetricSetArn().equals(this.getMetricSetArn()) == false)
            return false;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getMetricSetDescription() == null ^ this.getMetricSetDescription() == null)
            return false;
        if (other.getMetricSetDescription() != null && other.getMetricSetDescription().equals(this.getMetricSetDescription()) == false)
            return false;
        if (other.getMetricSetName() == null ^ this.getMetricSetName() == null)
            return false;
        if (other.getMetricSetName() != null && other.getMetricSetName().equals(this.getMetricSetName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
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

        hashCode = prime * hashCode + ((getMetricSetArn() == null) ? 0 : getMetricSetArn().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getMetricSetDescription() == null) ? 0 : getMetricSetDescription().hashCode());
        hashCode = prime * hashCode + ((getMetricSetName() == null) ? 0 : getMetricSetName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public MetricSetSummary clone() {
        try {
            return (MetricSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.MetricSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
