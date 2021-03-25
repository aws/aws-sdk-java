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
 * Contains information about an an anomaly detector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AnomalyDetectorSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetectorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The name of the detector.
     * </p>
     */
    private String anomalyDetectorName;
    /**
     * <p>
     * A description of the detector.
     * </p>
     */
    private String anomalyDetectorDescription;
    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * The status of detector.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The detector's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     * 
     * @return The ARN of the detector.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @param anomalyDetectorName
     *        The name of the detector.
     */

    public void setAnomalyDetectorName(String anomalyDetectorName) {
        this.anomalyDetectorName = anomalyDetectorName;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @return The name of the detector.
     */

    public String getAnomalyDetectorName() {
        return this.anomalyDetectorName;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @param anomalyDetectorName
     *        The name of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary withAnomalyDetectorName(String anomalyDetectorName) {
        setAnomalyDetectorName(anomalyDetectorName);
        return this;
    }

    /**
     * <p>
     * A description of the detector.
     * </p>
     * 
     * @param anomalyDetectorDescription
     *        A description of the detector.
     */

    public void setAnomalyDetectorDescription(String anomalyDetectorDescription) {
        this.anomalyDetectorDescription = anomalyDetectorDescription;
    }

    /**
     * <p>
     * A description of the detector.
     * </p>
     * 
     * @return A description of the detector.
     */

    public String getAnomalyDetectorDescription() {
        return this.anomalyDetectorDescription;
    }

    /**
     * <p>
     * A description of the detector.
     * </p>
     * 
     * @param anomalyDetectorDescription
     *        A description of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary withAnomalyDetectorDescription(String anomalyDetectorDescription) {
        setAnomalyDetectorDescription(anomalyDetectorDescription);
        return this;
    }

    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the detector was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     * 
     * @return The time at which the detector was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the detector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the detector was last modified.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     * 
     * @return The time at which the detector was last modified.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the detector was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The status of detector.
     * </p>
     * 
     * @param status
     *        The status of detector.
     * @see AnomalyDetectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of detector.
     * </p>
     * 
     * @return The status of detector.
     * @see AnomalyDetectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of detector.
     * </p>
     * 
     * @param status
     *        The status of detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStatus
     */

    public AnomalyDetectorSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of detector.
     * </p>
     * 
     * @param status
     *        The status of detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStatus
     */

    public AnomalyDetectorSummary withStatus(AnomalyDetectorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The detector's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @return The detector's <a
     *         href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The detector's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The detector's <a
     *        href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The detector's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The detector's <a
     *        href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AnomalyDetectorSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorSummary addTagsEntry(String key, String value) {
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

    public AnomalyDetectorSummary clearTagsEntries() {
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
        if (getAnomalyDetectorName() != null)
            sb.append("AnomalyDetectorName: ").append(getAnomalyDetectorName()).append(",");
        if (getAnomalyDetectorDescription() != null)
            sb.append("AnomalyDetectorDescription: ").append(getAnomalyDetectorDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof AnomalyDetectorSummary == false)
            return false;
        AnomalyDetectorSummary other = (AnomalyDetectorSummary) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getAnomalyDetectorName() == null ^ this.getAnomalyDetectorName() == null)
            return false;
        if (other.getAnomalyDetectorName() != null && other.getAnomalyDetectorName().equals(this.getAnomalyDetectorName()) == false)
            return false;
        if (other.getAnomalyDetectorDescription() == null ^ this.getAnomalyDetectorDescription() == null)
            return false;
        if (other.getAnomalyDetectorDescription() != null && other.getAnomalyDetectorDescription().equals(this.getAnomalyDetectorDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getAnomalyDetectorName() == null) ? 0 : getAnomalyDetectorName().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorDescription() == null) ? 0 : getAnomalyDetectorDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetectorSummary clone() {
        try {
            return (AnomalyDetectorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AnomalyDetectorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
