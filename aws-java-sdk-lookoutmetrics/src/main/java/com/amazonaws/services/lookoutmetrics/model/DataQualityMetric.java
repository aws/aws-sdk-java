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
 * An array that describes a data quality metric. Each <code>DataQualityMetric</code> object contains the data quality
 * metric name, its value, a description of the metric, and the affected column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DataQualityMetric" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data quality metric.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * A description of the data quality metric.
     * </p>
     */
    private String metricDescription;
    /**
     * <p>
     * The column that is being monitored.
     * </p>
     */
    private String relatedColumnName;
    /**
     * <p>
     * The value of the data quality metric.
     * </p>
     */
    private Double metricValue;

    /**
     * <p>
     * The name of the data quality metric.
     * </p>
     * 
     * @param metricType
     *        The name of the data quality metric.
     * @see DataQualityMetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The name of the data quality metric.
     * </p>
     * 
     * @return The name of the data quality metric.
     * @see DataQualityMetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * The name of the data quality metric.
     * </p>
     * 
     * @param metricType
     *        The name of the data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataQualityMetricType
     */

    public DataQualityMetric withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * The name of the data quality metric.
     * </p>
     * 
     * @param metricType
     *        The name of the data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataQualityMetricType
     */

    public DataQualityMetric withMetricType(DataQualityMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the data quality metric.
     * </p>
     * 
     * @param metricDescription
     *        A description of the data quality metric.
     */

    public void setMetricDescription(String metricDescription) {
        this.metricDescription = metricDescription;
    }

    /**
     * <p>
     * A description of the data quality metric.
     * </p>
     * 
     * @return A description of the data quality metric.
     */

    public String getMetricDescription() {
        return this.metricDescription;
    }

    /**
     * <p>
     * A description of the data quality metric.
     * </p>
     * 
     * @param metricDescription
     *        A description of the data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetric withMetricDescription(String metricDescription) {
        setMetricDescription(metricDescription);
        return this;
    }

    /**
     * <p>
     * The column that is being monitored.
     * </p>
     * 
     * @param relatedColumnName
     *        The column that is being monitored.
     */

    public void setRelatedColumnName(String relatedColumnName) {
        this.relatedColumnName = relatedColumnName;
    }

    /**
     * <p>
     * The column that is being monitored.
     * </p>
     * 
     * @return The column that is being monitored.
     */

    public String getRelatedColumnName() {
        return this.relatedColumnName;
    }

    /**
     * <p>
     * The column that is being monitored.
     * </p>
     * 
     * @param relatedColumnName
     *        The column that is being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetric withRelatedColumnName(String relatedColumnName) {
        setRelatedColumnName(relatedColumnName);
        return this;
    }

    /**
     * <p>
     * The value of the data quality metric.
     * </p>
     * 
     * @param metricValue
     *        The value of the data quality metric.
     */

    public void setMetricValue(Double metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The value of the data quality metric.
     * </p>
     * 
     * @return The value of the data quality metric.
     */

    public Double getMetricValue() {
        return this.metricValue;
    }

    /**
     * <p>
     * The value of the data quality metric.
     * </p>
     * 
     * @param metricValue
     *        The value of the data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetric withMetricValue(Double metricValue) {
        setMetricValue(metricValue);
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
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getMetricDescription() != null)
            sb.append("MetricDescription: ").append(getMetricDescription()).append(",");
        if (getRelatedColumnName() != null)
            sb.append("RelatedColumnName: ").append(getRelatedColumnName()).append(",");
        if (getMetricValue() != null)
            sb.append("MetricValue: ").append(getMetricValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityMetric == false)
            return false;
        DataQualityMetric other = (DataQualityMetric) obj;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getMetricDescription() == null ^ this.getMetricDescription() == null)
            return false;
        if (other.getMetricDescription() != null && other.getMetricDescription().equals(this.getMetricDescription()) == false)
            return false;
        if (other.getRelatedColumnName() == null ^ this.getRelatedColumnName() == null)
            return false;
        if (other.getRelatedColumnName() != null && other.getRelatedColumnName().equals(this.getRelatedColumnName()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getMetricDescription() == null) ? 0 : getMetricDescription().hashCode());
        hashCode = prime * hashCode + ((getRelatedColumnName() == null) ? 0 : getRelatedColumnName().hashCode());
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityMetric clone() {
        try {
            return (DataQualityMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DataQualityMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
