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
 * An anomalous metric in an anomaly group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AnomalyGroupTimeSeries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyGroupTimeSeries implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     */
    private String anomalyGroupId;
    /**
     * <p>
     * The ID of the metric.
     * </p>
     */
    private String timeSeriesId;

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

    public AnomalyGroupTimeSeries withAnomalyGroupId(String anomalyGroupId) {
        setAnomalyGroupId(anomalyGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the metric.
     * </p>
     * 
     * @param timeSeriesId
     *        The ID of the metric.
     */

    public void setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
    }

    /**
     * <p>
     * The ID of the metric.
     * </p>
     * 
     * @return The ID of the metric.
     */

    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    /**
     * <p>
     * The ID of the metric.
     * </p>
     * 
     * @param timeSeriesId
     *        The ID of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyGroupTimeSeries withTimeSeriesId(String timeSeriesId) {
        setTimeSeriesId(timeSeriesId);
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
        if (getAnomalyGroupId() != null)
            sb.append("AnomalyGroupId: ").append(getAnomalyGroupId()).append(",");
        if (getTimeSeriesId() != null)
            sb.append("TimeSeriesId: ").append(getTimeSeriesId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyGroupTimeSeries == false)
            return false;
        AnomalyGroupTimeSeries other = (AnomalyGroupTimeSeries) obj;
        if (other.getAnomalyGroupId() == null ^ this.getAnomalyGroupId() == null)
            return false;
        if (other.getAnomalyGroupId() != null && other.getAnomalyGroupId().equals(this.getAnomalyGroupId()) == false)
            return false;
        if (other.getTimeSeriesId() == null ^ this.getTimeSeriesId() == null)
            return false;
        if (other.getTimeSeriesId() != null && other.getTimeSeriesId().equals(this.getTimeSeriesId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyGroupId() == null) ? 0 : getAnomalyGroupId().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesId() == null) ? 0 : getTimeSeriesId().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyGroupTimeSeries clone() {
        try {
            return (AnomalyGroupTimeSeries) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AnomalyGroupTimeSeriesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
