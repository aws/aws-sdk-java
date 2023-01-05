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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aggregated details about the data quality metrics collected for the <code>AnomalyDetectorArn</code> provided in the
 * <a>GetDataQualityMetrics</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AnomalyDetectorDataQualityMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetectorDataQualityMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time for the data quality metrics collection.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information about a
     * data quality metric.
     * </p>
     */
    private java.util.List<MetricSetDataQualityMetric> metricSetDataQualityMetricList;

    /**
     * <p>
     * The start time for the data quality metrics collection.
     * </p>
     * 
     * @param startTimestamp
     *        The start time for the data quality metrics collection.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The start time for the data quality metrics collection.
     * </p>
     * 
     * @return The start time for the data quality metrics collection.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The start time for the data quality metrics collection.
     * </p>
     * 
     * @param startTimestamp
     *        The start time for the data quality metrics collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorDataQualityMetric withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information about a
     * data quality metric.
     * </p>
     * 
     * @return An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information
     *         about a data quality metric.
     */

    public java.util.List<MetricSetDataQualityMetric> getMetricSetDataQualityMetricList() {
        return metricSetDataQualityMetricList;
    }

    /**
     * <p>
     * An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information about a
     * data quality metric.
     * </p>
     * 
     * @param metricSetDataQualityMetricList
     *        An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information
     *        about a data quality metric.
     */

    public void setMetricSetDataQualityMetricList(java.util.Collection<MetricSetDataQualityMetric> metricSetDataQualityMetricList) {
        if (metricSetDataQualityMetricList == null) {
            this.metricSetDataQualityMetricList = null;
            return;
        }

        this.metricSetDataQualityMetricList = new java.util.ArrayList<MetricSetDataQualityMetric>(metricSetDataQualityMetricList);
    }

    /**
     * <p>
     * An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information about a
     * data quality metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricSetDataQualityMetricList(java.util.Collection)} or
     * {@link #withMetricSetDataQualityMetricList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param metricSetDataQualityMetricList
     *        An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information
     *        about a data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorDataQualityMetric withMetricSetDataQualityMetricList(MetricSetDataQualityMetric... metricSetDataQualityMetricList) {
        if (this.metricSetDataQualityMetricList == null) {
            setMetricSetDataQualityMetricList(new java.util.ArrayList<MetricSetDataQualityMetric>(metricSetDataQualityMetricList.length));
        }
        for (MetricSetDataQualityMetric ele : metricSetDataQualityMetricList) {
            this.metricSetDataQualityMetricList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information about a
     * data quality metric.
     * </p>
     * 
     * @param metricSetDataQualityMetricList
     *        An array of <code>DataQualityMetricList</code> objects. Each object in the array contains information
     *        about a data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorDataQualityMetric withMetricSetDataQualityMetricList(java.util.Collection<MetricSetDataQualityMetric> metricSetDataQualityMetricList) {
        setMetricSetDataQualityMetricList(metricSetDataQualityMetricList);
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
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getMetricSetDataQualityMetricList() != null)
            sb.append("MetricSetDataQualityMetricList: ").append(getMetricSetDataQualityMetricList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDetectorDataQualityMetric == false)
            return false;
        AnomalyDetectorDataQualityMetric other = (AnomalyDetectorDataQualityMetric) obj;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getMetricSetDataQualityMetricList() == null ^ this.getMetricSetDataQualityMetricList() == null)
            return false;
        if (other.getMetricSetDataQualityMetricList() != null
                && other.getMetricSetDataQualityMetricList().equals(this.getMetricSetDataQualityMetricList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMetricSetDataQualityMetricList() == null) ? 0 : getMetricSetDataQualityMetricList().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetectorDataQualityMetric clone() {
        try {
            return (AnomalyDetectorDataQualityMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AnomalyDetectorDataQualityMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
