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
 * Provides a summary of an alert's configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AlertSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     */
    private String alertArn;
    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The name of the alert.
     * </p>
     */
    private String alertName;
    /**
     * <p>
     * The minimum severity for an anomaly to trigger the alert.
     * </p>
     */
    private Integer alertSensitivityThreshold;
    /**
     * <p>
     * The type of the alert.
     * </p>
     */
    private String alertType;
    /**
     * <p>
     * The status of the alert.
     * </p>
     */
    private String alertStatus;
    /**
     * <p>
     * The time at which the alert was last modified.
     * </p>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * The time at which the alert was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     * 
     * @param alertArn
     *        The ARN of the alert.
     */

    public void setAlertArn(String alertArn) {
        this.alertArn = alertArn;
    }

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     * 
     * @return The ARN of the alert.
     */

    public String getAlertArn() {
        return this.alertArn;
    }

    /**
     * <p>
     * The ARN of the alert.
     * </p>
     * 
     * @param alertArn
     *        The ARN of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withAlertArn(String alertArn) {
        setAlertArn(alertArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to which the alert is attached.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     * 
     * @return The ARN of the detector to which the alert is attached.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector to which the alert is attached.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector to which the alert is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The name of the alert.
     * </p>
     * 
     * @param alertName
     *        The name of the alert.
     */

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    /**
     * <p>
     * The name of the alert.
     * </p>
     * 
     * @return The name of the alert.
     */

    public String getAlertName() {
        return this.alertName;
    }

    /**
     * <p>
     * The name of the alert.
     * </p>
     * 
     * @param alertName
     *        The name of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withAlertName(String alertName) {
        setAlertName(alertName);
        return this;
    }

    /**
     * <p>
     * The minimum severity for an anomaly to trigger the alert.
     * </p>
     * 
     * @param alertSensitivityThreshold
     *        The minimum severity for an anomaly to trigger the alert.
     */

    public void setAlertSensitivityThreshold(Integer alertSensitivityThreshold) {
        this.alertSensitivityThreshold = alertSensitivityThreshold;
    }

    /**
     * <p>
     * The minimum severity for an anomaly to trigger the alert.
     * </p>
     * 
     * @return The minimum severity for an anomaly to trigger the alert.
     */

    public Integer getAlertSensitivityThreshold() {
        return this.alertSensitivityThreshold;
    }

    /**
     * <p>
     * The minimum severity for an anomaly to trigger the alert.
     * </p>
     * 
     * @param alertSensitivityThreshold
     *        The minimum severity for an anomaly to trigger the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withAlertSensitivityThreshold(Integer alertSensitivityThreshold) {
        setAlertSensitivityThreshold(alertSensitivityThreshold);
        return this;
    }

    /**
     * <p>
     * The type of the alert.
     * </p>
     * 
     * @param alertType
     *        The type of the alert.
     * @see AlertType
     */

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    /**
     * <p>
     * The type of the alert.
     * </p>
     * 
     * @return The type of the alert.
     * @see AlertType
     */

    public String getAlertType() {
        return this.alertType;
    }

    /**
     * <p>
     * The type of the alert.
     * </p>
     * 
     * @param alertType
     *        The type of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertType
     */

    public AlertSummary withAlertType(String alertType) {
        setAlertType(alertType);
        return this;
    }

    /**
     * <p>
     * The type of the alert.
     * </p>
     * 
     * @param alertType
     *        The type of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertType
     */

    public AlertSummary withAlertType(AlertType alertType) {
        this.alertType = alertType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the alert.
     * </p>
     * 
     * @param alertStatus
     *        The status of the alert.
     * @see AlertStatus
     */

    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
    }

    /**
     * <p>
     * The status of the alert.
     * </p>
     * 
     * @return The status of the alert.
     * @see AlertStatus
     */

    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * <p>
     * The status of the alert.
     * </p>
     * 
     * @param alertStatus
     *        The status of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertStatus
     */

    public AlertSummary withAlertStatus(String alertStatus) {
        setAlertStatus(alertStatus);
        return this;
    }

    /**
     * <p>
     * The status of the alert.
     * </p>
     * 
     * @param alertStatus
     *        The status of the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertStatus
     */

    public AlertSummary withAlertStatus(AlertStatus alertStatus) {
        this.alertStatus = alertStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the alert was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the alert was last modified.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time at which the alert was last modified.
     * </p>
     * 
     * @return The time at which the alert was last modified.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time at which the alert was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the alert was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the alert was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the alert was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the alert was created.
     * </p>
     * 
     * @return The time at which the alert was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the alert was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the alert was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @return The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The alert's <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AlertSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AlertSummary addTagsEntry(String key, String value) {
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

    public AlertSummary clearTagsEntries() {
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
        if (getAlertArn() != null)
            sb.append("AlertArn: ").append(getAlertArn()).append(",");
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getAlertName() != null)
            sb.append("AlertName: ").append(getAlertName()).append(",");
        if (getAlertSensitivityThreshold() != null)
            sb.append("AlertSensitivityThreshold: ").append(getAlertSensitivityThreshold()).append(",");
        if (getAlertType() != null)
            sb.append("AlertType: ").append(getAlertType()).append(",");
        if (getAlertStatus() != null)
            sb.append("AlertStatus: ").append(getAlertStatus()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof AlertSummary == false)
            return false;
        AlertSummary other = (AlertSummary) obj;
        if (other.getAlertArn() == null ^ this.getAlertArn() == null)
            return false;
        if (other.getAlertArn() != null && other.getAlertArn().equals(this.getAlertArn()) == false)
            return false;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getAlertName() == null ^ this.getAlertName() == null)
            return false;
        if (other.getAlertName() != null && other.getAlertName().equals(this.getAlertName()) == false)
            return false;
        if (other.getAlertSensitivityThreshold() == null ^ this.getAlertSensitivityThreshold() == null)
            return false;
        if (other.getAlertSensitivityThreshold() != null && other.getAlertSensitivityThreshold().equals(this.getAlertSensitivityThreshold()) == false)
            return false;
        if (other.getAlertType() == null ^ this.getAlertType() == null)
            return false;
        if (other.getAlertType() != null && other.getAlertType().equals(this.getAlertType()) == false)
            return false;
        if (other.getAlertStatus() == null ^ this.getAlertStatus() == null)
            return false;
        if (other.getAlertStatus() != null && other.getAlertStatus().equals(this.getAlertStatus()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getAlertArn() == null) ? 0 : getAlertArn().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getAlertName() == null) ? 0 : getAlertName().hashCode());
        hashCode = prime * hashCode + ((getAlertSensitivityThreshold() == null) ? 0 : getAlertSensitivityThreshold().hashCode());
        hashCode = prime * hashCode + ((getAlertType() == null) ? 0 : getAlertType().hashCode());
        hashCode = prime * hashCode + ((getAlertStatus() == null) ? 0 : getAlertStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AlertSummary clone() {
        try {
            return (AlertSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AlertSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
