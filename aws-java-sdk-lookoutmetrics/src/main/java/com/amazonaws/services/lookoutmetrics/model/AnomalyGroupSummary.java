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
 * Details about a group of anomalous metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AnomalyGroupSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time for the group.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The end time for the group.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     */
    private String anomalyGroupId;
    /**
     * <p>
     * The severity score of the group.
     * </p>
     */
    private Double anomalyGroupScore;
    /**
     * <p>
     * The name of the primary affected measure for the group.
     * </p>
     */
    private String primaryMetricName;

    /**
     * <p>
     * The start time for the group.
     * </p>
     * 
     * @param startTime
     *        The start time for the group.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time for the group.
     * </p>
     * 
     * @return The start time for the group.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time for the group.
     * </p>
     * 
     * @param startTime
     *        The start time for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupSummary withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time for the group.
     * </p>
     * 
     * @param endTime
     *        The end time for the group.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time for the group.
     * </p>
     * 
     * @return The end time for the group.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time for the group.
     * </p>
     * 
     * @param endTime
     *        The end time for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupSummary withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     */

    public void setAnomalyGroupId(String anomalyGroupId) {
        this.anomalyGroupId = anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @return The ID of the anomaly group.
     */

    public String getAnomalyGroupId() {
        return this.anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupSummary withAnomalyGroupId(String anomalyGroupId) {
        setAnomalyGroupId(anomalyGroupId);
        return this;
    }

    /**
     * <p>
     * The severity score of the group.
     * </p>
     * 
     * @param anomalyGroupScore
     *        The severity score of the group.
     */

    public void setAnomalyGroupScore(Double anomalyGroupScore) {
        this.anomalyGroupScore = anomalyGroupScore;
    }

    /**
     * <p>
     * The severity score of the group.
     * </p>
     * 
     * @return The severity score of the group.
     */

    public Double getAnomalyGroupScore() {
        return this.anomalyGroupScore;
    }

    /**
     * <p>
     * The severity score of the group.
     * </p>
     * 
     * @param anomalyGroupScore
     *        The severity score of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupSummary withAnomalyGroupScore(Double anomalyGroupScore) {
        setAnomalyGroupScore(anomalyGroupScore);
        return this;
    }

    /**
     * <p>
     * The name of the primary affected measure for the group.
     * </p>
     * 
     * @param primaryMetricName
     *        The name of the primary affected measure for the group.
     */

    public void setPrimaryMetricName(String primaryMetricName) {
        this.primaryMetricName = primaryMetricName;
    }

    /**
     * <p>
     * The name of the primary affected measure for the group.
     * </p>
     * 
     * @return The name of the primary affected measure for the group.
     */

    public String getPrimaryMetricName() {
        return this.primaryMetricName;
    }

    /**
     * <p>
     * The name of the primary affected measure for the group.
     * </p>
     * 
     * @param primaryMetricName
     *        The name of the primary affected measure for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupSummary withPrimaryMetricName(String primaryMetricName) {
        setPrimaryMetricName(primaryMetricName);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getAnomalyGroupId() != null)
            sb.append("AnomalyGroupId: ").append(getAnomalyGroupId()).append(",");
        if (getAnomalyGroupScore() != null)
            sb.append("AnomalyGroupScore: ").append(getAnomalyGroupScore()).append(",");
        if (getPrimaryMetricName() != null)
            sb.append("PrimaryMetricName: ").append(getPrimaryMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyGroupSummary == false)
            return false;
        AnomalyGroupSummary other = (AnomalyGroupSummary) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getAnomalyGroupId() == null ^ this.getAnomalyGroupId() == null)
            return false;
        if (other.getAnomalyGroupId() != null && other.getAnomalyGroupId().equals(this.getAnomalyGroupId()) == false)
            return false;
        if (other.getAnomalyGroupScore() == null ^ this.getAnomalyGroupScore() == null)
            return false;
        if (other.getAnomalyGroupScore() != null && other.getAnomalyGroupScore().equals(this.getAnomalyGroupScore()) == false)
            return false;
        if (other.getPrimaryMetricName() == null ^ this.getPrimaryMetricName() == null)
            return false;
        if (other.getPrimaryMetricName() != null && other.getPrimaryMetricName().equals(this.getPrimaryMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getAnomalyGroupId() == null) ? 0 : getAnomalyGroupId().hashCode());
        hashCode = prime * hashCode + ((getAnomalyGroupScore() == null) ? 0 : getAnomalyGroupScore().hashCode());
        hashCode = prime * hashCode + ((getPrimaryMetricName() == null) ? 0 : getPrimaryMetricName().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyGroupSummary clone() {
        try {
            return (AnomalyGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AnomalyGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
